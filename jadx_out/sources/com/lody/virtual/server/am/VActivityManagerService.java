package com.lody.virtual.server.am;

import android.app.ActivityManager;
import android.app.IStopUserCallback;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.client.IVClient;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.Constants;
import com.lody.virtual.client.env.SpecialComponentList;
import com.lody.virtual.client.ipc.ProviderCall;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.compat.ActivityManagerCompat;
import com.lody.virtual.helper.compat.ApplicationThreadCompat;
import com.lody.virtual.helper.compat.BundleCompat;
import com.lody.virtual.helper.compat.PermissionCompat;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.helper.utils.Singleton;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VBinder;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.remote.AppTaskInfo;
import com.lody.virtual.remote.BadgerInfo;
import com.lody.virtual.remote.ClientConfig;
import com.lody.virtual.remote.IntentSenderData;
import com.lody.virtual.remote.VParceledListSlice;
import com.lody.virtual.server.extension.VExtPackageAccessor;
import com.lody.virtual.server.interfaces.IActivityManager;
import com.lody.virtual.server.pm.PackageCacheManager;
import com.lody.virtual.server.pm.PackageSetting;
import com.lody.virtual.server.pm.VAppManagerService;
import com.lody.virtual.server.pm.VPackageManagerService;
import com.lody.virtual.server.settings.VSettingsProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class VActivityManagerService extends IActivityManager.Stub {
    private final ActivityStack mActivityStack;
    private final Handler mHandler;
    private final Map<IBinder, IntentSenderData> mIntentSenderMap;
    private final List<ProcessRecord> mPidsSelfLocked;
    private boolean mResult;
    private final Map<String, Boolean> sIdeMap;
    private static final Singleton<VActivityManagerService> sService = new Singleton<VActivityManagerService>() { // from class: com.lody.virtual.server.am.VActivityManagerService.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.lody.virtual.helper.utils.Singleton
        public VActivityManagerService create() {
            return new VActivityManagerService();
        }
    };
    private static final String TAG = VActivityManagerService.class.getSimpleName();

    public static VActivityManagerService get() {
        return sService.get();
    }

    private String getProcessName(int i5) {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : VirtualCore.get().getRunningAppProcessesEx()) {
            if (runningAppProcessInfo.pid == i5) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    private boolean initProcessLocked(final ProcessRecord processRecord) {
        requestPermissionIfNeed(processRecord);
        Bundle bundle = new Bundle();
        bundle.putParcelable("_VA_|_client_config_", processRecord.getClientConfig());
        bundle.putInt("_VA_|_core_pid_", Process.myPid());
        Bundle callSafely = ProviderCall.callSafely(processRecord.getProviderAuthority(), "_VA_|_init_process_", null, bundle, 0);
        if (callSafely == null) {
            return false;
        }
        processRecord.pid = callSafely.getInt("_VA_|_pid_");
        final IBinder binder = BundleCompat.getBinder(callSafely, "_VA_|_client_");
        IVClient asInterface = IVClient.Stub.asInterface(binder);
        if (asInterface == null) {
            processRecord.kill();
            return false;
        }
        try {
            binder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.lody.virtual.server.am.VActivityManagerService.4
                @Override // android.os.IBinder.DeathRecipient
                public void binderDied() {
                    binder.unlinkToDeath(this, 0);
                    VActivityManagerService.this.onProcessDied(processRecord);
                }
            }, 0);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
        processRecord.client = asInterface;
        try {
            processRecord.appThread = ApplicationThreadCompat.asInterface(asInterface.getAppThread());
        } catch (RemoteException e6) {
            e6.printStackTrace();
        }
        VLog.w(TAG, "start new process : " + processRecord.processName + " pid: " + processRecord.pid, new Object[0]);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessDied(ProcessRecord processRecord) {
        if (processRecord != null) {
            synchronized (this.mPidsSelfLocked) {
                this.mPidsSelfLocked.remove(processRecord);
            }
            processDied(processRecord);
        }
    }

    private int parseVPid(String str) {
        String str2;
        if (str == null) {
            return -1;
        }
        if (str.startsWith(StubManifest.EXT_PACKAGE_NAME)) {
            str2 = StubManifest.EXT_PACKAGE_NAME + ":p";
        } else {
            if (str.startsWith(StubManifest.PACKAGE_NAME)) {
                str2 = VirtualCore.get().getHostPkg() + ":p";
            }
            return -1;
        }
        if (str.startsWith(str2)) {
            try {
                return Integer.parseInt(str.substring(str2.length()));
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    private void processDied(ProcessRecord processRecord) {
        this.mActivityStack.processDied(processRecord);
    }

    private void requestPermissionIfNeed(ProcessRecord processRecord) {
        if (PermissionCompat.isCheckPermissionRequired(processRecord.info)) {
            String[] dangerousPermissions = VPackageManagerService.get().getDangerousPermissions(processRecord.info.packageName);
            if (!PermissionCompat.checkPermissions(dangerousPermissions, processRecord.isExt)) {
                ConditionVariable conditionVariable = new ConditionVariable();
                startRequestPermissions(processRecord.isExt, dangerousPermissions, conditionVariable);
                conditionVariable.block();
            }
        }
    }

    private void runProcessGC() {
        if (get().getFreeStubCount() < 10) {
            killAllApps();
        }
    }

    private void sendFirstLaunchBroadcast(PackageSetting packageSetting, int i5) {
        Intent intent = new Intent("android.intent.action.PACKAGE_FIRST_LAUNCH", Uri.fromParts("package", packageSetting.packageName, null));
        intent.setPackage(packageSetting.packageName);
        intent.putExtra("android.intent.extra.UID", VUserHandle.getUid(packageSetting.appId, i5));
        intent.putExtra(Constants.EXTRA_USER_HANDLE, i5);
        sendBroadcastAsUser(intent, new VUserHandle(i5));
    }

    private void startRequestPermissions(boolean z4, String[] strArr, final ConditionVariable conditionVariable) {
        PermissionCompat.startRequestPermissions(VirtualCore.get().getContext(), z4, strArr, new PermissionCompat.CallBack() { // from class: com.lody.virtual.server.am.VActivityManagerService.3
            @Override // com.lody.virtual.helper.compat.PermissionCompat.CallBack
            public boolean onResult(int i5, String[] strArr2, int[] iArr) {
                try {
                    VActivityManagerService.this.mResult = PermissionCompat.isRequestGranted(iArr);
                    conditionVariable.open();
                    return VActivityManagerService.this.mResult;
                } catch (Throwable th) {
                    conditionVariable.open();
                    throw th;
                }
            }
        });
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public IBinder acquireProviderClient(int i5, ProviderInfo providerInfo) {
        ProcessRecord startProcessIfNeeded = startProcessIfNeeded(providerInfo.processName, i5, providerInfo.packageName, -1);
        if (startProcessIfNeeded != null) {
            try {
                return startProcessIfNeeded.client.acquireProviderClient(providerInfo);
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void addOrUpdateIntentSender(IntentSenderData intentSenderData, int i5) {
        if (intentSenderData != null && intentSenderData.token != null) {
            synchronized (this.mIntentSenderMap) {
                IntentSenderData intentSenderData2 = this.mIntentSenderMap.get(intentSenderData.token);
                if (intentSenderData2 == null) {
                    this.mIntentSenderMap.put(intentSenderData.token, intentSenderData);
                } else {
                    intentSenderData2.update(intentSenderData);
                }
            }
        }
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void appDoneExecuting(String str, int i5) {
        ProcessRecord findProcessLocked = findProcessLocked(VBinder.getCallingPid());
        if (findProcessLocked != null) {
            findProcessLocked.pkgList.add(str);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public boolean broadcastFinish(IBinder iBinder) throws RemoteException {
        synchronized (this.mPidsSelfLocked) {
            Iterator<ProcessRecord> it = this.mPidsSelfLocked.iterator();
            while (it.hasNext()) {
                IVClient iVClient = it.next().client;
                if (iVClient != null && iVClient.finishReceiver(iBinder)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public int checkPermission(boolean z4, String str, int i5, int i6, String str2) {
        Log.e("checkPermission", str2 + "::" + str);
        if (str == null) {
            return -1;
        }
        if ("android.permission.RECEIVE_BOOT_COMPLETED".equals(str) || "android.permission.BACKUP".equals(str)) {
            return 0;
        }
        if ("android.permission.INTERACT_ACROSS_USERS".equals(str) || "android.permission.INTERACT_ACROSS_USERS_FULL".equals(str)) {
            return -1;
        }
        if (SpecialComponentList.isWhitePermission(str) || StubManifest.isSystemPermission(str) || i6 == 0) {
            return 0;
        }
        return VPackageManagerService.get().checkUidPermission(z4, str, i6, str2);
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void dump() {
    }

    public ProcessRecord findProcessLocked(int i5) {
        synchronized (this.mPidsSelfLocked) {
            for (ProcessRecord processRecord : this.mPidsSelfLocked) {
                if (processRecord.pid == i5) {
                    return processRecord;
                }
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public boolean finishActivityAffinity(int i5, IBinder iBinder) {
        boolean finishActivityAffinity;
        synchronized (this) {
            finishActivityAffinity = this.mActivityStack.finishActivityAffinity(i5, iBinder);
        }
        return finishActivityAffinity;
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public ComponentName getActivityClassForToken(int i5, IBinder iBinder) {
        return this.mActivityStack.getActivityClassForToken(i5, iBinder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r1.client.isAppRunning() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r1.info.processName.equals(r7) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r5 = r1.pid;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        return r5;
     */
    @Override // com.lody.virtual.server.interfaces.IActivityManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getAppPid(java.lang.String r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            java.util.List<com.lody.virtual.server.am.ProcessRecord> r0 = r4.mPidsSelfLocked
            monitor-enter(r0)
            java.util.List<com.lody.virtual.server.am.ProcessRecord> r1 = r4.mPidsSelfLocked     // Catch: java.lang.Throwable -> L43
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L43
        L9:
            int r2 = r1 + (-1)
            if (r1 <= 0) goto L40
            java.util.List<com.lody.virtual.server.am.ProcessRecord> r1 = r4.mPidsSelfLocked     // Catch: java.lang.Throwable -> L43
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L43
            com.lody.virtual.server.am.ProcessRecord r1 = (com.lody.virtual.server.am.ProcessRecord) r1     // Catch: java.lang.Throwable -> L43
            int r3 = r1.userId     // Catch: java.lang.Throwable -> L43
            if (r3 == r6) goto L1a
            goto L24
        L1a:
            android.content.pm.ApplicationInfo r3 = r1.info     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Throwable -> L43
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L26
        L24:
            r1 = r2
            goto L9
        L26:
            com.lody.virtual.client.IVClient r5 = r1.client     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L43
            boolean r5 = r5.isAppRunning()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L43
            if (r5 == 0) goto L40
            android.content.pm.ApplicationInfo r5 = r1.info     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L43
            java.lang.String r5 = r5.processName     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L43
            boolean r5 = r5.equals(r7)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L43
            if (r5 == 0) goto L40
            int r5 = r1.pid     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            return r5
        L3c:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L43
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            r5 = -1
            return r5
        L43:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.am.VActivityManagerService.getAppPid(java.lang.String, int, java.lang.String):int");
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public String getAppProcessName(int i5) {
        ProcessRecord findProcessLocked = findProcessLocked(i5);
        if (findProcessLocked != null) {
            return findProcessLocked.processName;
        }
        return null;
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public ComponentName getCallingActivity(int i5, IBinder iBinder) {
        return this.mActivityStack.getCallingActivity(i5, iBinder);
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public String getCallingPackage(int i5, IBinder iBinder) {
        return this.mActivityStack.getCallingPackage(i5, iBinder);
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public int getFreeStubCount() {
        int size;
        synchronized (this.mPidsSelfLocked) {
            size = StubManifest.STUB_COUNT - this.mPidsSelfLocked.size();
        }
        return size;
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public String getInitialPackage(int i5) {
        ProcessRecord findProcessLocked = findProcessLocked(i5);
        if (findProcessLocked != null) {
            return findProcessLocked.info.packageName;
        }
        return null;
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public IntentSenderData getIntentSender(IBinder iBinder) {
        IntentSenderData intentSenderData;
        if (iBinder != null) {
            synchronized (this.mIntentSenderMap) {
                intentSenderData = this.mIntentSenderMap.get(iBinder);
            }
            return intentSenderData;
        }
        return null;
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public String getPackageForToken(int i5, IBinder iBinder) {
        return this.mActivityStack.getPackageForToken(i5, iBinder);
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public ClientConfig getProcessConfig(String str, String str2, int i5) {
        synchronized (this.mPidsSelfLocked) {
            for (ProcessRecord processRecord : this.mPidsSelfLocked) {
                ClientConfig clientConfig = processRecord.getClientConfig();
                if (clientConfig.packageName.equals(str) && clientConfig.processName.equals(str2) && processRecord.userId == i5) {
                    return processRecord.getClientConfig();
                }
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public List<String> getProcessPkgList(int i5) {
        ProcessRecord findProcessLocked = findProcessLocked(i5);
        if (findProcessLocked != null) {
            return new ArrayList(findProcessLocked.pkgList);
        }
        return Collections.emptyList();
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public VParceledListSlice<ActivityManager.RunningServiceInfo> getServices(String str, int i5, int i6, int i7) {
        List arrayList = new ArrayList();
        synchronized (this.mPidsSelfLocked) {
            for (ProcessRecord processRecord : this.mPidsSelfLocked) {
                if (processRecord.pkgList.contains(str) && processRecord.client.asBinder().isBinderAlive()) {
                    try {
                        arrayList.addAll(processRecord.client.getServices());
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
        if (arrayList.size() > i5) {
            arrayList = arrayList.subList(0, i5);
        }
        return new VParceledListSlice<>(arrayList);
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public final String getSettingsProvider(int i5, int i6, String str) {
        return VSettingsProvider.getInstance().getSettingsProvider(i5, i6, str);
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public int getSystemPid() {
        return Process.myPid();
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public int getSystemUid() {
        return Process.myUid();
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public AppTaskInfo getTaskInfo(int i5) {
        return this.mActivityStack.getTaskInfo(i5);
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public int getUidByPid(int i5) {
        ProcessRecord findProcessLocked = findProcessLocked(i5);
        if (findProcessLocked != null) {
            return findProcessLocked.vuid;
        }
        if (i5 == Process.myPid()) {
            return VEnvironment.SYSTEM_UID;
        }
        return VEnvironment.OUTSIDE_APP_UID;
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void handleDownloadCompleteIntent(Intent intent) {
        intent.setPackage(null);
        intent.setComponent(null);
        VirtualCore.get().getContext().sendBroadcast(ComponentUtils.proxyBroadcastIntent(intent, -1));
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public ClientConfig initProcess(String str, String str2, int i5) {
        ProcessRecord startProcessIfNeeded = startProcessIfNeeded(str2, i5, str, -1);
        if (startProcessIfNeeded != null) {
            return startProcessIfNeeded.getClientConfig();
        }
        return null;
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public boolean isAppInactive(String str, int i5) {
        boolean z4;
        synchronized (this.sIdeMap) {
            Boolean bool = this.sIdeMap.get(str + "@" + i5);
            if (bool != null && !bool.booleanValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public boolean isAppPid(int i5) {
        return findProcessLocked(i5) != null;
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public boolean isAppProcess(String str) {
        return parseVPid(str) != -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        r5 = r1.client.isAppRunning();
     */
    @Override // com.lody.virtual.server.interfaces.IActivityManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isAppRunning(java.lang.String r5, int r6, boolean r7) {
        /*
            r4 = this;
            java.util.List<com.lody.virtual.server.am.ProcessRecord> r0 = r4.mPidsSelfLocked
            monitor-enter(r0)
            java.util.List<com.lody.virtual.server.am.ProcessRecord> r1 = r4.mPidsSelfLocked     // Catch: java.lang.Throwable -> L42
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L42
        L9:
            int r2 = r1 + (-1)
            if (r1 <= 0) goto L3f
            java.util.List<com.lody.virtual.server.am.ProcessRecord> r1 = r4.mPidsSelfLocked     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
            com.lody.virtual.server.am.ProcessRecord r1 = (com.lody.virtual.server.am.ProcessRecord) r1     // Catch: java.lang.Throwable -> L42
            int r3 = r1.userId     // Catch: java.lang.Throwable -> L42
            if (r3 == r6) goto L1a
            goto L31
        L1a:
            android.content.pm.ApplicationInfo r3 = r1.info     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Throwable -> L42
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L25
            goto L31
        L25:
            if (r7 == 0) goto L33
            android.content.pm.ApplicationInfo r3 = r1.info     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r3.processName     // Catch: java.lang.Throwable -> L42
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L33
        L31:
            r1 = r2
            goto L9
        L33:
            com.lody.virtual.client.IVClient r5 = r1.client     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L42
            boolean r5 = r5.isAppRunning()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L42
            goto L40
        L3a:
            java.lang.String r5 = com.lody.virtual.server.am.VActivityManagerService.TAG     // Catch: java.lang.Throwable -> L42
            com.lody.virtual.helper.utils.VLog.printStackTrace(r5)     // Catch: java.lang.Throwable -> L42
        L3f:
            r5 = 0
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            return r5
        L42:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.am.VActivityManagerService.isAppRunning(java.lang.String, int, boolean):boolean");
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void killAllApps() {
        synchronized (this.mPidsSelfLocked) {
            for (int i5 = 0; i5 < this.mPidsSelfLocked.size(); i5++) {
                this.mPidsSelfLocked.get(i5).kill();
            }
        }
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void killAppByPkg(String str, int i5) {
        synchronized (this.mPidsSelfLocked) {
            for (ProcessRecord processRecord : this.mPidsSelfLocked) {
                if (i5 == -1 || processRecord.userId == i5) {
                    if (processRecord.pkgList.contains(str)) {
                        processRecord.kill();
                    }
                }
            }
        }
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void killApplicationProcess(String str, int i5) {
        synchronized (this.mPidsSelfLocked) {
            for (ProcessRecord processRecord : this.mPidsSelfLocked) {
                if (processRecord.vuid == i5) {
                    if (processRecord.isExt) {
                        VExtPackageAccessor.forceStop(new int[]{processRecord.pid});
                    } else {
                        processRecord.kill();
                    }
                }
            }
        }
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void notifyBadgerChange(BadgerInfo badgerInfo) {
        Intent intent = new Intent(Constants.ACTION_BADGER_CHANGE);
        intent.putExtra("userId", badgerInfo.userId);
        intent.putExtra(TTDownloadField.TT_PACKAGE_NAME, badgerInfo.packageName);
        intent.putExtra("badgerCount", badgerInfo.badgerCount);
        VirtualCore.get().getContext().sendBroadcast(intent);
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void onActivityCreated(IBinder iBinder, IBinder iBinder2, int i5) {
        ProcessRecord findProcessLocked = findProcessLocked(Binder.getCallingPid());
        if (findProcessLocked != null) {
            this.mActivityStack.onActivityCreated(findProcessLocked, iBinder2, i5, (ActivityRecord) iBinder);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public boolean onActivityDestroyed(int i5, IBinder iBinder) {
        return this.mActivityStack.onActivityDestroyed(i5, iBinder) != null;
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void onActivityFinish(int i5, IBinder iBinder) {
        this.mActivityStack.onActivityFinish(i5, iBinder);
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void onActivityResumed(int i5, IBinder iBinder) {
        this.mActivityStack.onActivityResumed(i5, iBinder);
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void processRestarted(String str, String str2, int i5) {
        String processName;
        int parseVPid;
        int callingPid = VBinder.getCallingPid();
        if (findProcessLocked(callingPid) == null && (processName = getProcessName(callingPid)) != null && (parseVPid = parseVPid(processName)) != -1) {
            startProcessIfNeeded(str2, i5, str, parseVPid);
        }
    }

    public int queryFreeStubProcess(boolean z4, Set<Integer> set) {
        boolean z5;
        synchronized (this.mPidsSelfLocked) {
            for (int i5 = 0; i5 < StubManifest.STUB_COUNT; i5++) {
                int size = this.mPidsSelfLocked.size();
                while (true) {
                    int i6 = size - 1;
                    if (size > 0) {
                        ProcessRecord processRecord = this.mPidsSelfLocked.get(i6);
                        z5 = true;
                        if (!set.contains(Integer.valueOf(processRecord.vpid)) && (processRecord.vpid != i5 || processRecord.isExt != z4)) {
                            size = i6;
                        }
                    } else {
                        z5 = false;
                        break;
                    }
                }
                if (!z5) {
                    return i5;
                }
            }
            return -1;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void removeIntentSender(IBinder iBinder) {
        if (iBinder != null) {
            synchronized (this.mIntentSenderMap) {
                this.mIntentSenderMap.remove(iBinder);
            }
        }
    }

    public void sendBroadcastAsUser(Intent intent, VUserHandle vUserHandle) {
        SpecialComponentList.protectIntent(intent);
        Context context = VirtualCore.get().getContext();
        if (vUserHandle != null) {
            intent.putExtra("_VA_|_user_id_", vUserHandle.getIdentifier());
        }
        context.sendBroadcast(intent);
    }

    public void sendOrderedBroadcastAsUser(Intent intent, VUserHandle vUserHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i5, String str2, Bundle bundle) {
        Context context = VirtualCore.get().getContext();
        if (vUserHandle != null) {
            intent.putExtra("_VA_|_user_id_", vUserHandle.getIdentifier());
        }
        context.sendOrderedBroadcast(intent, null, broadcastReceiver, handler, i5, str2, bundle);
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public void setAppInactive(String str, boolean z4, int i5) {
        synchronized (this.sIdeMap) {
            this.sIdeMap.put(str + "@" + i5, Boolean.valueOf(z4));
        }
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public final void setSettingsProvider(int i5, int i6, String str, String str2) {
        VSettingsProvider.getInstance().setSettingsProvider(i5, i6, str, str2);
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public int startActivities(Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle, String str, int i5) {
        synchronized (this) {
            ActivityInfo[] activityInfoArr = new ActivityInfo[intentArr.length];
            for (int i6 = 0; i6 < intentArr.length; i6++) {
                ActivityInfo resolveActivityInfo = VirtualCore.get().resolveActivityInfo(intentArr[i6], i5);
                if (resolveActivityInfo == null) {
                    return ActivityManagerCompat.START_INTENT_NOT_RESOLVED;
                }
                activityInfoArr[i6] = resolveActivityInfo;
            }
            return this.mActivityStack.startActivitiesLocked(i5, intentArr, activityInfoArr, iBinder, bundle);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public int startActivity(Intent intent, ActivityInfo activityInfo, IBinder iBinder, Bundle bundle, String str, int i5, String str2, int i6) {
        int startActivityLocked;
        synchronized (this) {
            try {
                startActivityLocked = this.mActivityStack.startActivityLocked(i6, intent, activityInfo, iBinder, bundle, str, i5);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return startActivityLocked;
    }

    @Override // com.lody.virtual.server.interfaces.IActivityManager
    public int startActivityFromHistory(Intent intent) {
        int startActivityFromHistoryLocked;
        synchronized (this) {
            startActivityFromHistoryLocked = this.mActivityStack.startActivityFromHistoryLocked(intent);
        }
        return startActivityFromHistoryLocked;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProcessRecord startProcessIfNeeded(String str, int i5, String str2, int i6) {
        ProcessRecord processRecord;
        runProcessGC();
        PackageSetting setting = PackageCacheManager.getSetting(str2);
        boolean isRunInExtProcess = setting.isRunInExtProcess();
        if (isRunInExtProcess && !VirtualCore.get().isExtPackageInstalled()) {
            VLog.e(TAG, "startProcessIfNeeded failed due to ext package not install...packageName:" + str2);
            return null;
        }
        ApplicationInfo applicationInfo = VPackageManagerService.get().getApplicationInfo(str2, 0, i5);
        if (applicationInfo == null) {
            VLog.e(TAG, "startProcessIfNeeded failed due to app not install...packageName:" + str2);
            return null;
        }
        if (!setting.isLaunched(i5)) {
            setting.setLaunched(i5, true);
            VAppManagerService.get().savePersistenceData();
        }
        int uid = VUserHandle.getUid(i5, setting.appId);
        int i7 = -1;
        if (i6 != -1) {
            processRecord = new ProcessRecord(applicationInfo, str, uid, i6, isRunInExtProcess);
            synchronized (this.mPidsSelfLocked) {
                this.mPidsSelfLocked.add(processRecord);
            }
            try {
            } finally {
            }
            if (initProcessLocked(processRecord)) {
                return processRecord;
            }
            synchronized (this.mPidsSelfLocked) {
                this.mPidsSelfLocked.remove(processRecord);
            }
            return null;
        }
        ProcessRecord findProcessLocked = findProcessLocked(str, i5);
        if (findProcessLocked != null) {
            return findProcessLocked;
        }
        if (str.equals("com.google.android.gms.persistent")) {
            Intent intent = new Intent(Constants.ACTION_GMS_INITIALIZED);
            intent.putExtra(Constants.EXTRA_USER_HANDLE, i5);
            VirtualCore.get().getContext().sendBroadcast(intent);
        }
        int i8 = 3;
        HashSet hashSet = new HashSet(3);
        while (true) {
            int i9 = i8 - 1;
            if (i8 <= 0) {
                return null;
            }
            int queryFreeStubProcess = queryFreeStubProcess(isRunInExtProcess, hashSet);
            if (queryFreeStubProcess == i7) {
                killAllApps();
                VLog.e(TAG, "no free vpid, run GC now...");
                SystemClock.sleep(500L);
            } else {
                processRecord = new ProcessRecord(applicationInfo, str, uid, queryFreeStubProcess, isRunInExtProcess);
                synchronized (this.mPidsSelfLocked) {
                    this.mPidsSelfLocked.add(processRecord);
                }
                try {
                } finally {
                    VLog.e(TAG, "startProcessIfNeeded ex:" + th);
                    synchronized (this.mPidsSelfLocked) {
                        this.mPidsSelfLocked.remove(processRecord);
                    }
                }
                if (initProcessLocked(processRecord)) {
                    return processRecord;
                }
                synchronized (this.mPidsSelfLocked) {
                    this.mPidsSelfLocked.remove(processRecord);
                }
                hashSet.add(Integer.valueOf(queryFreeStubProcess));
            }
            i8 = i9;
            i7 = -1;
        }
    }

    public int stopUser(int i5, IStopUserCallback.Stub stub) {
        synchronized (this.mPidsSelfLocked) {
            int size = this.mPidsSelfLocked.size();
            while (true) {
                int i6 = size - 1;
                if (size > 0) {
                    ProcessRecord processRecord = this.mPidsSelfLocked.get(i6);
                    if (processRecord.userId == i5) {
                        processRecord.kill();
                    }
                    size = i6;
                }
            }
        }
        try {
            stub.userStopped(i5);
            return 0;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    private VActivityManagerService() {
        this.mPidsSelfLocked = new ArrayList();
        this.mActivityStack = new ActivityStack(this);
        this.mIntentSenderMap = new HashMap();
        this.sIdeMap = new HashMap();
        Handler handler = new Handler();
        this.mHandler = handler;
        handler.postDelayed(new Runnable() { // from class: com.lody.virtual.server.am.VActivityManagerService.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (VActivityManagerService.this.mIntentSenderMap) {
                    Iterator it = VActivityManagerService.this.mIntentSenderMap.values().iterator();
                    while (it.hasNext()) {
                        PendingIntent pendingIntent = ((IntentSenderData) it.next()).getPendingIntent();
                        if (pendingIntent == null || pendingIntent.getTargetPackage() == null) {
                            it.remove();
                        }
                    }
                }
                VActivityManagerService.this.mHandler.postDelayed(this, 300000L);
            }
        }, 300000L);
    }

    public void sendBroadcastAsUser(Intent intent, VUserHandle vUserHandle, String str) {
        SpecialComponentList.protectIntent(intent);
        Context context = VirtualCore.get().getContext();
        if (vUserHandle != null) {
            intent.putExtra("_VA_|_user_id_", vUserHandle.getIdentifier());
        }
        context.sendBroadcast(intent);
    }

    public ProcessRecord findProcessLocked(String str, int i5) {
        synchronized (this.mPidsSelfLocked) {
            for (ProcessRecord processRecord : this.mPidsSelfLocked) {
                if (processRecord.processName.equals(str) && processRecord.userId == i5) {
                    return processRecord;
                }
            }
            return null;
        }
    }
}
