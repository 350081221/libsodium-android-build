package com.lody.virtual.client;

import a1.i;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.app.Instrumentation;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Canvas;
import android.os.Binder;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.client.IVClient;
import com.lody.virtual.client.core.CrashHandler;
import com.lody.virtual.client.core.SettingConfig;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.InstallProviderSkip;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.client.fixer.ContextFixer;
import com.lody.virtual.client.hook.instruments.InstrumentationVirtualApp;
import com.lody.virtual.client.hook.providers.ProviderHook;
import com.lody.virtual.client.hook.secondary.ProxyServiceFactory;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.client.ipc.VDeviceManager;
import com.lody.virtual.client.ipc.VPackageManager;
import com.lody.virtual.client.ipc.VirtualStorageManager;
import com.lody.virtual.client.receiver.StaticReceiverSystem;
import com.lody.virtual.client.service.VServiceRuntime;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.compat.StorageManagerCompat;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.helper.utils.FileUtils;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.oem.EmuiHelper;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.remote.ClientConfig;
import com.lody.virtual.remote.InstalledAppInfo;
import com.lody.virtual.remote.VDeviceConfig;
import com.lody.virtual.server.secondary.FakeIdentityBinder;
import com.umeng.analytics.pro.d;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mirror.RefMethod;
import mirror.android.app.ActivityManagerNative;
import mirror.android.app.ActivityThread;
import mirror.android.app.ActivityThreadNMR1;
import mirror.android.app.ActivityThreadQ;
import mirror.android.app.ContextImpl;
import mirror.android.app.IActivityManager;
import mirror.android.app.LoadedApk;
import mirror.android.content.BroadcastReceiver;
import mirror.android.content.ContentProviderHolderOreo;
import mirror.android.providers.Settings;
import mirror.com.android.internal.content.ReferrerIntent;
import mirror.java.lang.ThreadGroupN;

/* loaded from: classes3.dex */
public final class VClient extends IVClient.Stub {
    private static final int FINISH_ACTIVITY = 13;
    private static final int NEW_INTENT = 11;
    private static final int RECEIVER = 12;
    private static final String TAG = "VClient";
    private ClientConfig clientConfig;
    private int corePid;
    private CrashHandler crashHandler;
    private InstalledAppInfo mAppInfo;
    private AppBindData mBoundApplication;
    private Application mInitialApplication;

    @SuppressLint({"StaticFieldLeak"})
    private static final VClient gClient = new VClient();
    private static boolean CheckJunitClazz = false;
    private final H mH = new H();
    private Instrumentation mInstrumentation = InstrumentationVirtualApp.getDefault();
    private final Map<String, Application> mAllApplications = new HashMap(1);
    private Set<String> mExportedVApiPkgs = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class AppBindData {
        ApplicationInfo appInfo;
        Object info;
        String processName;
        List<ProviderInfo> providers;

        private AppBindData() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes3.dex */
    public class H extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 11:
                    VClient.this.handleNewIntent((NewIntentData) message.obj);
                    return;
                case 12:
                    VClient.this.handleReceiver((ReceiverData) message.obj);
                    return;
                case 13:
                    VActivityManager.get().finishActivity((IBinder) message.obj);
                    return;
                default:
                    return;
            }
        }

        private H() {
            super(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class NewIntentData {
        String creator;
        Intent intent;
        IBinder token;

        private NewIntentData() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class ReceiverData {
        ComponentName component;
        Intent intent;
        BroadcastReceiver.PendingResult pendingResult;
        String processName;
        Throwable stacktrace;

        private ReceiverData() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class RootThreadGroup extends ThreadGroup {
        RootThreadGroup(ThreadGroup threadGroup) {
            super(threadGroup, VLog.TAG_DEFAULT);
        }

        @Override // java.lang.ThreadGroup, java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            CrashHandler crashHandler = VClient.gClient.crashHandler;
            if (crashHandler != null) {
                crashHandler.handleUncaughtException(thread, th);
            } else {
                VLog.e("uncaught", th);
            }
        }
    }

    private VClient() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bindApplicationMainThread(java.lang.String r21, java.lang.String r22, android.os.ConditionVariable r23) {
        /*
            Method dump skipped, instructions count: 1149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.client.VClient.bindApplicationMainThread(java.lang.String, java.lang.String, android.os.ConditionVariable):void");
    }

    private static void clearContentProvider(Object obj) {
        if (BuildCompat.isOreo()) {
            Object obj2 = Settings.NameValueCacheOreo.mProviderHolder.get(obj);
            if (obj2 != null) {
                Settings.ContentProviderHolder.mContentProvider.set(obj2, null);
                return;
            }
            return;
        }
        Settings.NameValueCache.mContentProvider.set(obj, null);
    }

    private void clearSettingProvider() {
        Object obj;
        Object obj2 = Settings.System.sNameValueCache.get();
        if (obj2 != null) {
            clearContentProvider(obj2);
        }
        Object obj3 = Settings.Secure.sNameValueCache.get();
        if (obj3 != null) {
            clearContentProvider(obj3);
        }
        if (Settings.Global.TYPE != null && (obj = Settings.Global.sNameValueCache.get()) != null) {
            clearContentProvider(obj);
        }
    }

    private Context createPackageContext(String str) {
        try {
            return VirtualCore.get().getContext().createPackageContext(str, 3);
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            VirtualRuntime.crash(e5);
            throw new RuntimeException();
        }
    }

    private void fixInstalledProviders() {
        clearSettingProvider();
        Iterator it = ActivityThread.mProviderMap.get(VirtualCore.mainThread()).entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (BuildCompat.isOreo()) {
                IInterface iInterface = ActivityThread.ProviderClientRecordJB.mProvider.get(value);
                Object obj = ActivityThread.ProviderClientRecordJB.mHolder.get(value);
                if (obj != null) {
                    ProviderInfo providerInfo = ContentProviderHolderOreo.info.get(obj);
                    if (!providerInfo.authority.startsWith(StubManifest.STUB_CP_AUTHORITY)) {
                        IInterface createProxy = ProviderHook.createProxy(true, providerInfo.authority, iInterface);
                        ActivityThread.ProviderClientRecordJB.mProvider.set(value, createProxy);
                        ContentProviderHolderOreo.provider.set(obj, createProxy);
                    }
                }
            } else {
                IInterface iInterface2 = ActivityThread.ProviderClientRecordJB.mProvider.get(value);
                Object obj2 = ActivityThread.ProviderClientRecordJB.mHolder.get(value);
                if (obj2 != null) {
                    ProviderInfo providerInfo2 = IActivityManager.ContentProviderHolder.info.get(obj2);
                    if (!providerInfo2.authority.startsWith(StubManifest.STUB_CP_AUTHORITY)) {
                        IInterface createProxy2 = ProviderHook.createProxy(true, providerInfo2.authority, iInterface2);
                        ActivityThread.ProviderClientRecordJB.mProvider.set(value, createProxy2);
                        IActivityManager.ContentProviderHolder.provider.set(obj2, createProxy2);
                    }
                }
            }
        }
    }

    private void fixSystem(int i5) {
        try {
            Reflect.on((Class<?>) Canvas.class).call("setCompatibilityVersion", Integer.valueOf(i5));
            Reflect.on("android.graphics.Compatibility").call("setTargetSdkVersion", Integer.valueOf(i5));
        } catch (Throwable unused) {
        }
        EmuiHelper.disableCache();
    }

    private void fixWeChatRecovery(Application application) {
        try {
            Field field = application.getClassLoader().loadClass("com.tencent.recovery.Recovery").getField(d.X);
            field.setAccessible(true);
            if (field.get(null) != null) {
                return;
            }
            field.set(null, application.getBaseContext());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void forbidHost() {
        String str;
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) VirtualCore.get().getContext().getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid != Process.myPid() && runningAppProcessInfo.uid == VirtualCore.get().myUid() && !VActivityManager.get().isAppPid(runningAppProcessInfo.pid) && (runningAppProcessInfo.processName.startsWith(StubManifest.PACKAGE_NAME) || ((str = StubManifest.EXT_PACKAGE_NAME) != null && runningAppProcessInfo.processName.startsWith(str)))) {
                NativeEngine.forbid("/proc/" + runningAppProcessInfo.pid + "/maps", true);
                NativeEngine.forbid("/proc/" + runningAppProcessInfo.pid + "/cmdline", true);
            }
        }
    }

    public static VClient get() {
        return gClient;
    }

    @SuppressLint({"SdCardPath"})
    private HashSet<String> getMountPoints() {
        HashSet<String> hashSet = new HashSet<>(3);
        hashSet.add("/mnt/sdcard/");
        hashSet.add("/sdcard/");
        hashSet.add("/storage/emulated/" + VUserHandle.realUserId() + "/");
        hashSet.add("storage/emulated/" + VUserHandle.realUserId() + "/");
        String[] allPoints = StorageManagerCompat.getAllPoints(VirtualCore.get().getContext());
        if (allPoints != null) {
            for (String str : allPoints) {
                if (str.endsWith("/")) {
                    hashSet.add(str);
                } else {
                    hashSet.add(str + "/");
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleNewIntent(NewIntentData newIntentData) {
        ComponentUtils.unpackFillIn(newIntentData.intent, get().getClassLoader());
        Intent newInstance = ReferrerIntent.ctor.newInstance(newIntentData.intent, newIntentData.creator);
        RefMethod<Void> refMethod = ActivityThread.performNewIntents;
        if (refMethod != null) {
            refMethod.call(VirtualCore.mainThread(), newIntentData.token, Collections.singletonList(newInstance));
            return;
        }
        RefMethod<Void> refMethod2 = ActivityThreadNMR1.performNewIntents;
        if (refMethod2 != null) {
            refMethod2.call(VirtualCore.mainThread(), newIntentData.token, Collections.singletonList(newInstance), Boolean.TRUE);
            return;
        }
        if (BuildCompat.isS()) {
            Object obj = ActivityThread.mActivities.get(VirtualCore.mainThread()).get(newIntentData.token);
            if (obj != null) {
                ActivityThread.handleNewIntent(obj, Collections.singletonList(newInstance));
                return;
            }
            return;
        }
        ActivityThreadQ.handleNewIntent.call(VirtualCore.mainThread(), newIntentData.token, Collections.singletonList(newInstance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleReceiver(ReceiverData receiverData) {
        BroadcastReceiver.PendingResult pendingResult = receiverData.pendingResult;
        try {
            Context baseContext = this.mInitialApplication.getBaseContext();
            Context call = ContextImpl.getReceiverRestrictedContext.call(baseContext, new Object[0]);
            ContextFixer.fixContext(call, receiverData.component.getPackageName());
            String className = receiverData.component.getClassName();
            ClassLoader call2 = LoadedApk.getClassLoader.call(this.mBoundApplication.info, new Object[0]);
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) call2.loadClass(className).newInstance();
            mirror.android.content.BroadcastReceiver.setPendingResult.call(broadcastReceiver, pendingResult);
            receiverData.intent.setExtrasClassLoader(baseContext.getClassLoader());
            ComponentUtils.unpackFillIn(receiverData.intent, call2);
            if (receiverData.intent.getComponent() == null) {
                receiverData.intent.setComponent(receiverData.component);
            }
            FakeIdentityBinder.setSystemIdentity();
            broadcastReceiver.onReceive(call, receiverData.intent);
            if (mirror.android.content.BroadcastReceiver.getPendingResult.call(broadcastReceiver, new Object[0]) != null && !VActivityManager.get().broadcastFinish(BroadcastReceiver.PendingResult.mToken.get(pendingResult))) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            receiverData.stacktrace.printStackTrace();
            VLog.e(VLog.TAG_DEFAULT, "Unable to start receiver " + receiverData.component, th);
        }
    }

    private void initDataStorage(boolean z4, int i5, String str) {
        if (z4) {
            FileUtils.ensureDirCreate(VEnvironment.getDataUserPackageDirectoryExt(i5, str));
            FileUtils.ensureDirCreate(VEnvironment.getDeDataUserPackageDirectoryExt(i5, str));
        } else {
            FileUtils.ensureDirCreate(VEnvironment.getDataUserPackageDirectory(i5, str));
            FileUtils.ensureDirCreate(VEnvironment.getDeDataUserPackageDirectory(i5, str));
        }
    }

    private void installContentProviders(Context context, List<ProviderInfo> list) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        Object mainThread = VirtualCore.mainThread();
        try {
            if (InstallProviderSkip.isSkip(context.getPackageName())) {
                return;
            }
            Iterator<ProviderInfo> it = list.iterator();
            while (it.hasNext()) {
                try {
                    ActivityThread.installProvider(mainThread, context, it.next(), null);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @SuppressLint({"SdCardPath"})
    private void mountVirtualFS(InstalledAppInfo installedAppInfo, boolean z4) {
        String path;
        String path2;
        String absolutePath;
        String path3;
        String absolutePath2;
        File wifiFile;
        String str = installedAppInfo.packageName;
        int myUserId = VUserHandle.myUserId();
        if (z4) {
            path = VEnvironment.getDataUserPackageDirectoryExt(myUserId, str).getPath();
            path2 = VEnvironment.getDeDataUserPackageDirectoryExtRoot(myUserId).getPath();
            absolutePath = VEnvironment.getDataAppLibDirectoryExt(str).getAbsolutePath();
            path3 = VEnvironment.getDataUserPackageDirectoryExt_DataUser(myUserId, str).getPath();
            absolutePath2 = VEnvironment.getDataAppLibDirectoryExt_DataUser(str).getAbsolutePath();
        } else {
            path = VEnvironment.getDataUserPackageDirectory(myUserId, str).getPath();
            path2 = VEnvironment.getDeDataUserPackageDirectoryRoot(myUserId).getPath();
            absolutePath = VEnvironment.getDataAppLibDirectory(str).getAbsolutePath();
            path3 = VEnvironment.getDataUserPackageDirectory_DataUser(myUserId, str).getPath();
            absolutePath2 = VEnvironment.getDataAppLibDirectory_DataUser(str).getAbsolutePath();
        }
        if (getDeviceConfig().enable && (wifiFile = getDeviceConfig().getWifiFile(myUserId, z4)) != null && wifiFile.exists()) {
            String path4 = wifiFile.getPath();
            NativeEngine.redirectFile("/sys/class/net/wlan0/address", path4);
            NativeEngine.redirectFile("/sys/class/net/eth0/address", path4);
            NativeEngine.redirectFile("/sys/class/net/wifi/address", path4);
        }
        forbidHost();
        NativeEngine.redirectDirectory("/tmp/", new File(path, "cache").getAbsolutePath());
        NativeEngine.redirectDirectory("/data/data/" + str, path);
        int realUserId = VUserHandle.realUserId();
        NativeEngine.redirectDirectory("/data/user/" + realUserId + "/" + str, path3);
        StringBuilder sb = new StringBuilder();
        sb.append("/data/user_de/");
        sb.append(realUserId);
        sb.append("/");
        NativeEngine.redirectDirectory(sb.toString(), path2);
        NativeEngine.whitelist("/data/user_de/" + realUserId + "/" + StubManifest.PACKAGE_NAME + "/");
        NativeEngine.whitelist("/data/user_de/" + realUserId + "/" + StubManifest.EXT_PACKAGE_NAME + "/");
        NativeEngine.whitelist(absolutePath);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("/data/data/");
        sb2.append(StubManifest.PACKAGE_NAME);
        sb2.append("/virtual/");
        NativeEngine.whitelist(sb2.toString());
        NativeEngine.whitelist("/data/data/" + StubManifest.EXT_PACKAGE_NAME + "/virtual/");
        if (installedAppInfo.dynamic) {
            NativeEngine.whitelist("/data/user/" + realUserId + "/" + str + "/lib/");
        } else {
            NativeEngine.redirectDirectory("/data/data/" + str + "/lib/", absolutePath);
            NativeEngine.redirectDirectory("/data/user/" + realUserId + "/" + str + "/lib/", absolutePath2);
        }
        NativeEngine.redirectDirectory(VEnvironment.getUserAppLibDirectory(myUserId, str).getPath(), absolutePath);
        NativeEngine.redirectDirectory("/data/app/virtual/" + str + "/lib", absolutePath);
        VirtualStorageManager virtualStorageManager = VirtualStorageManager.get();
        String virtualStorage = virtualStorageManager.getVirtualStorage(installedAppInfo.packageName, myUserId);
        boolean isVirtualStorageEnable = virtualStorageManager.isVirtualStorageEnable(installedAppInfo.packageName, myUserId);
        if (VEnvironment.enableMediaRedirect() && (!isVirtualStorageEnable || virtualStorage == null)) {
            virtualStorage = VirtualCore.get().getContext().getExternalFilesDir(VirtualCore.getConfig().getVirtualSdcardAndroidDataName() + "/" + VUserHandle.myUserId() + "/").getAbsolutePath();
            if (VirtualCore.get().isSharedUserId()) {
                virtualStorage = virtualStorage.replace(StubManifest.EXT_PACKAGE_NAME, StubManifest.PACKAGE_NAME);
            }
            virtualStorageManager.setVirtualStorage(installedAppInfo.packageName, myUserId, virtualStorage);
            virtualStorageManager.setVirtualStorageState(installedAppInfo.packageName, myUserId, true);
            isVirtualStorageEnable = true;
        }
        HashSet<String> mountPoints = getMountPoints();
        if (isVirtualStorageEnable && virtualStorage != null) {
            File file = new File(virtualStorage);
            if (file.exists() || file.mkdirs()) {
                Iterator<String> it = mountPoints.iterator();
                while (it.hasNext()) {
                    NativeEngine.redirectDirectory(it.next(), virtualStorage);
                }
            }
        } else {
            redirectSdcard(installedAppInfo);
        }
        if (!installedAppInfo.dynamic && new File(installedAppInfo.getApkPath(z4)).exists()) {
            NativeEngine.redirectFile(VEnvironment.getPackageFileStub(str), installedAppInfo.getApkPath(z4));
            if (Build.VERSION.SDK_INT == 27) {
                NativeEngine.addDexOverride(new DexOverride(VEnvironment.getPackageFileStub(str), installedAppInfo.getApkPath(z4), null, null));
            }
        }
        if (VirtualCore.getConfig().isDisableTinker(str)) {
            NativeEngine.forbid("/data/data/" + str + "/tinker/", false);
            NativeEngine.forbid("/data/data/" + str + "/tinker_server/", false);
            NativeEngine.forbid("/data/data/" + str + "/tinker_temp/", false);
            NativeEngine.forbid("/data/user/" + realUserId + "/" + str + "/tinker/", false);
            NativeEngine.forbid("/data/user/" + realUserId + "/" + str + "/tinker_server/", false);
            NativeEngine.forbid("/data/user/" + realUserId + "/" + str + "/tinker_temp/", false);
        }
        if (GmsSupport.GSF_PKG.equals(str) || GmsSupport.GMS_PKG.equals(str)) {
            NativeEngine.redirectDirectory("/data/data/com.google.android.gsf/", path);
            NativeEngine.redirectDirectory("/data/data/com.google.android.gms/", path);
            NativeEngine.redirectDirectory("/data/user/" + realUserId + "/com.google.android.gsf/", path3);
            NativeEngine.redirectDirectory("/data/user/" + realUserId + "/com.google.android.gms/", path3);
            File file2 = new File(path2, "misc_ce");
            NativeEngine.redirectDirectory("/data/misc_ce/" + realUserId, file2.getPath());
            FileUtils.ensureDirCreate(new File(file2, "checkin"));
        }
        NativeEngine.enableIORedirect(installedAppInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void redirectSdcard(com.lody.virtual.remote.InstalledAppInfo r10) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.client.VClient.redirectSdcard(com.lody.virtual.remote.InstalledAppInfo):void");
    }

    private void redirectSdcardAndroidData() {
        SettingConfig config = VirtualCore.getConfig();
        String[] strArr = {"/Android/data", "/Android/media"};
        Iterator<String> it = getMountPoints().iterator();
        while (it.hasNext()) {
            String next = it.next();
            for (int i5 = 0; i5 < 2; i5++) {
                String str = strArr[i5];
                File file = new File(next + str);
                File externalFilesDir = VirtualCore.get().getContext().getExternalFilesDir(config.getVirtualSdcardAndroidDataName() + "/" + VUserHandle.myUserId() + "/external_root/" + str.substring(str.lastIndexOf(47)));
                if (VirtualCore.get().isSharedUserId()) {
                    externalFilesDir = new File(externalFilesDir.toString().replace(StubManifest.EXT_PACKAGE_NAME, StubManifest.PACKAGE_NAME));
                }
                if (!externalFilesDir.exists() && !externalFilesDir.mkdirs()) {
                    VLog.e(TAG, "failed to create dir: " + externalFilesDir);
                }
                NativeEngine.redirectDirectory(file.getPath(), externalFilesDir.getPath());
            }
        }
    }

    private void sendMessage(int i5, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i5;
        obtain.obj = obj;
        this.mH.sendMessage(obtain);
    }

    private void setupUncaughtHandler() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        RootThreadGroup rootThreadGroup = new RootThreadGroup(threadGroup);
        ThreadGroup[] threadGroupArr = ThreadGroupN.groups.get(threadGroup);
        synchronized (threadGroupArr) {
            ThreadGroup[] threadGroupArr2 = (ThreadGroup[]) threadGroupArr.clone();
            ThreadGroupN.groups.set(rootThreadGroup, threadGroupArr2);
            ThreadGroupN.groups.set(threadGroup, new ThreadGroup[]{rootThreadGroup});
            for (ThreadGroup threadGroup2 : threadGroupArr2) {
                if (threadGroup2 != null && threadGroup2 != rootThreadGroup) {
                    ThreadGroupN.parent.set(threadGroup2, rootThreadGroup);
                }
            }
            ThreadGroupN.ngroups.set(threadGroup, 1);
        }
    }

    @Override // com.lody.virtual.client.IVClient
    public IBinder acquireProviderClient(ProviderInfo providerInfo) {
        String str;
        ContentProviderClient contentProviderClient;
        IInterface iInterface;
        bindApplication(providerInfo.packageName, providerInfo.processName);
        if ("_VA_START_PROCESS".equals(providerInfo.authority)) {
            return null;
        }
        String[] split = providerInfo.authority.split(i.f136b);
        if (split.length == 0) {
            str = providerInfo.authority;
        } else {
            str = split[0];
        }
        try {
            contentProviderClient = VirtualCore.get().getContext().getContentResolver().acquireUnstableContentProviderClient(str);
        } catch (Throwable th) {
            th.printStackTrace();
            contentProviderClient = null;
        }
        if (contentProviderClient != null) {
            iInterface = mirror.android.content.ContentProviderClient.mContentProvider.get(contentProviderClient);
            contentProviderClient.release();
        } else {
            iInterface = null;
        }
        VLog.e(TAG, "acquireProviderClient " + providerInfo + " result: " + iInterface + " process: " + VirtualRuntime.getProcessName());
        if (iInterface == null) {
            return null;
        }
        return iInterface.asBinder();
    }

    public synchronized void addExportedVApiPkg(String str) {
        this.mExportedVApiPkgs.add(str);
    }

    public void bindApplication(final String str, final String str2) {
        synchronized (this.mAllApplications) {
            if (this.mAllApplications.containsKey(str)) {
                return;
            }
            if (this.clientConfig != null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    final ConditionVariable conditionVariable = new ConditionVariable();
                    VirtualRuntime.getUIHandler().post(new Runnable() { // from class: com.lody.virtual.client.VClient.1
                        @Override // java.lang.Runnable
                        public void run() {
                            VClient.this.bindApplicationMainThread(str, str2, conditionVariable);
                            conditionVariable.open();
                        }
                    });
                    conditionVariable.block();
                    return;
                }
                bindApplicationMainThread(str, str2, null);
                return;
            }
            throw new RuntimeException("Unrecorded process: " + str2);
        }
    }

    @Override // com.lody.virtual.client.IVClient
    public IBinder createProxyService(ComponentName componentName, IBinder iBinder) {
        return ProxyServiceFactory.getProxyService(getCurrentApplication(), componentName, iBinder);
    }

    public Service createService(ServiceInfo serviceInfo, IBinder iBinder) {
        bindApplication(serviceInfo.packageName, serviceInfo.processName);
        try {
            Service service = (Service) LoadedApk.getClassLoader.call(this.mBoundApplication.info, new Object[0]).loadClass(serviceInfo.name).newInstance();
            try {
                Context createPackageContext = VirtualCore.get().getContext().createPackageContext(serviceInfo.packageName, 3);
                try {
                    if (Reflect.on(createPackageContext).field("mPackageInfo").get("mApplication") == null) {
                        Reflect.on(createPackageContext).field("mPackageInfo").set("mApplication", get().getCurrentApplication());
                    }
                } catch (Throwable th) {
                    VLog.w(TAG, "ex:" + th, new Object[0]);
                }
                ContextImpl.setOuterContext.call(createPackageContext, service);
                mirror.android.app.Service.attach.call(service, createPackageContext, VirtualCore.mainThread(), serviceInfo.name, iBinder, this.mInitialApplication, ActivityManagerNative.getDefault.call(new Object[0]));
                ContextFixer.fixContext(createPackageContext, serviceInfo.packageName);
                service.onCreate();
                return service;
            } catch (Exception e5) {
                throw new RuntimeException("Unable to create service " + serviceInfo.name + ": " + e5.toString(), e5);
            }
        } catch (Exception e6) {
            throw new RuntimeException("Unable to instantiate service " + serviceInfo.name + ": " + e6.toString(), e6);
        }
    }

    @Override // com.lody.virtual.client.IVClient
    public void finishActivity(IBinder iBinder) {
        sendMessage(13, iBinder);
    }

    @Override // com.lody.virtual.client.IVClient
    public boolean finishReceiver(IBinder iBinder) {
        return StaticReceiverSystem.get().broadcastFinish(iBinder);
    }

    public InstalledAppInfo getAppInfo() {
        return this.mAppInfo;
    }

    @Override // com.lody.virtual.client.IVClient
    public IBinder getAppThread() {
        return ActivityThread.getApplicationThread.call(VirtualCore.mainThread(), new Object[0]);
    }

    public int getBaseVUid() {
        ClientConfig clientConfig = this.clientConfig;
        if (clientConfig == null) {
            return 0;
        }
        return VUserHandle.getAppId(clientConfig.vuid);
    }

    public ClassLoader getClassLoader(ApplicationInfo applicationInfo) {
        return createPackageContext(applicationInfo.packageName).getClassLoader();
    }

    public ClientConfig getClientConfig() {
        return this.clientConfig;
    }

    public int getCorePid() {
        return this.corePid;
    }

    public CrashHandler getCrashHandler() {
        return this.crashHandler;
    }

    public Application getCurrentApplication() {
        return this.mInitialApplication;
    }

    public ApplicationInfo getCurrentApplicationInfo() {
        AppBindData appBindData = this.mBoundApplication;
        if (appBindData != null) {
            return appBindData.appInfo;
        }
        return null;
    }

    public String getCurrentPackage() {
        AppBindData appBindData = this.mBoundApplication;
        if (appBindData != null) {
            return appBindData.appInfo.packageName;
        }
        return VPackageManager.get().getNameForUid(getVUid());
    }

    @Override // com.lody.virtual.client.IVClient
    public String getDebugInfo() {
        return VirtualRuntime.getProcessName();
    }

    public VDeviceConfig getDeviceConfig() {
        return VDeviceManager.get().getDeviceConfig(VUserHandle.getUserId(getVUid()));
    }

    @Override // com.lody.virtual.client.IVClient
    public List<ActivityManager.RunningServiceInfo> getServices() {
        return VServiceRuntime.getInstance().getServices();
    }

    @Override // com.lody.virtual.client.IVClient
    public IBinder getToken() {
        ClientConfig clientConfig = this.clientConfig;
        if (clientConfig == null) {
            return null;
        }
        return clientConfig.token;
    }

    public int getVUid() {
        ClientConfig clientConfig = this.clientConfig;
        if (clientConfig == null) {
            return 0;
        }
        return clientConfig.vuid;
    }

    public int getVUserHandle() {
        ClientConfig clientConfig = this.clientConfig;
        if (clientConfig == null) {
            return 0;
        }
        return VUserHandle.getUserId(clientConfig.vuid);
    }

    public int getVpid() {
        ClientConfig clientConfig = this.clientConfig;
        if (clientConfig == null) {
            return 0;
        }
        return clientConfig.vpid;
    }

    public void initProcess(ClientConfig clientConfig) {
        if (this.clientConfig == null) {
            this.clientConfig = clientConfig;
            return;
        }
        throw new RuntimeException("reject init process " + clientConfig.vpid + " : " + clientConfig.processName + ", this process is : " + this.clientConfig.processName);
    }

    @Override // com.lody.virtual.client.IVClient
    public boolean isAppRunning() {
        return this.mInitialApplication != null;
    }

    public boolean isDynamicApp() {
        InstalledAppInfo appInfo = getAppInfo();
        if (appInfo != null && appInfo.dynamic) {
            return true;
        }
        return false;
    }

    public boolean isProcessBound() {
        return this.clientConfig != null;
    }

    @Override // com.lody.virtual.client.IVClient
    public void scheduleNewIntent(String str, IBinder iBinder, Intent intent) {
        NewIntentData newIntentData = new NewIntentData();
        newIntentData.creator = str;
        newIntentData.token = iBinder;
        newIntentData.intent = intent;
        sendMessage(11, newIntentData);
    }

    public void scheduleReceiver(String str, ComponentName componentName, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        ReceiverData receiverData = new ReceiverData();
        receiverData.pendingResult = pendingResult;
        receiverData.intent = intent;
        receiverData.component = componentName;
        receiverData.processName = str;
        receiverData.stacktrace = new Exception();
        sendMessage(12, receiverData);
    }

    public void setCorePid(int i5) {
        this.corePid = i5;
    }

    public void setCrashHandler(CrashHandler crashHandler) {
        this.crashHandler = crashHandler;
    }

    public ClassLoader getClassLoader() {
        return LoadedApk.getClassLoader.call(this.mBoundApplication.info, new Object[0]);
    }
}
