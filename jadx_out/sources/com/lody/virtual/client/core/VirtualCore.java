package com.lody.virtual.client.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.lody.virtual.R;
import com.lody.virtual.client.NativeEngine;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.env.Constants;
import com.lody.virtual.client.env.HostPackageManager;
import com.lody.virtual.client.env.LocalPackageCache;
import com.lody.virtual.client.env.SpecialComponentList;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.client.hook.delegate.TaskDescriptionDelegate;
import com.lody.virtual.client.ipc.LocalProxyUtils;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.client.ipc.VPackageManager;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.BitmapUtils;
import com.lody.virtual.helper.utils.IInterfaceUtils;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.remote.InstalledAppInfo;
import com.lody.virtual.remote.VAppInstallerParams;
import com.lody.virtual.remote.VAppInstallerResult;
import com.lody.virtual.server.BinderProvider;
import com.lody.virtual.server.extension.VExtPackageAccessor;
import com.lody.virtual.server.interfaces.IAppManager;
import com.lody.virtual.server.interfaces.IPackageObserver;
import com.lody.virtual.server.pm.parser.PackageParserEx;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mirror.android.app.ActivityThread;

/* loaded from: classes3.dex */
public final class VirtualCore {
    public static final int GET_HIDDEN_APP = 1;
    private static final String TAG = "VirtualCore";

    @SuppressLint({"StaticFieldLeak"})
    private static VirtualCore gCore = new VirtualCore();
    private Context context;
    private HostPackageManager hostPackageManager;
    private String hostPkgName;
    private boolean isMainPackage;
    private boolean isStartUp;
    private AppCallback mAppCallback;
    private AppRequestListener mAppRequestListener;
    private SettingConfig mConfig;
    private Handler mHandlerASyc;
    private PackageInfo mHostPkgInfo;
    private ConditionVariable mInitLock;
    private IAppManager mService;
    private TaskDescriptionDelegate mTaskDescriptionDelegate;
    private String mainProcessName;
    private Object mainThread;
    private String processName;
    private ProcessType processType;
    private final int myUid = Process.myUid();
    private final int myPid = Process.myPid();
    private int remoteUid = -1;
    private final BroadcastReceiver mDownloadCompleteReceiver = new BroadcastReceiver() { // from class: com.lody.virtual.client.core.VirtualCore.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VLog.w("DownloadManager", "receive download completed brodcast: " + intent, new Object[0]);
            if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
                VActivityManager.get().handleDownloadCompleteIntent(intent);
            }
        }
    };

    /* renamed from: com.lody.virtual.client.core.VirtualCore$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$lody$virtual$client$core$VirtualCore$ProcessType;

        static {
            int[] iArr = new int[ProcessType.values().length];
            $SwitchMap$com$lody$virtual$client$core$VirtualCore$ProcessType = iArr;
            try {
                iArr[ProcessType.Main.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$lody$virtual$client$core$VirtualCore$ProcessType[ProcessType.VAppClient.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$lody$virtual$client$core$VirtualCore$ProcessType[ProcessType.Server.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$lody$virtual$client$core$VirtualCore$ProcessType[ProcessType.CHILD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface AppRequestListener {
        void onRequestInstall(String str);

        void onRequestUninstall(String str);
    }

    /* loaded from: classes3.dex */
    public interface OnEmitShortcutListener {
        Bitmap getIcon(Bitmap bitmap);

        String getName(String str);
    }

    /* loaded from: classes3.dex */
    public static abstract class PackageObserver extends IPackageObserver.Stub {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum ProcessType {
        Server,
        VAppClient,
        Main,
        Helper,
        CHILD
    }

    /* loaded from: classes3.dex */
    public static abstract class VirtualInitializer {
        public void onChildProcess() {
        }

        public void onMainProcess() {
        }

        public void onServerProcess() {
        }

        public void onVirtualProcess() {
        }
    }

    private VirtualCore() {
        HandlerThread handlerThread = new HandlerThread("mHandlerASyc");
        handlerThread.start();
        this.mHandlerASyc = new Handler(handlerThread.getLooper());
    }

    private void detectProcessType() {
        this.hostPkgName = this.context.getApplicationInfo().packageName;
        this.mainProcessName = this.context.getApplicationInfo().processName;
        String processName = getProcessName(this.context);
        this.processName = processName;
        if (processName == null) {
            processName = "null";
        }
        Log.e("ProgressName", processName);
        if (this.processName.equals(this.mainProcessName)) {
            this.processType = ProcessType.Main;
            return;
        }
        if (this.processName.endsWith(Constants.SERVER_PROCESS_NAME)) {
            this.processType = ProcessType.Server;
            return;
        }
        if (this.processName.endsWith(Constants.HELPER_PROCESS_NAME)) {
            this.processType = ProcessType.Helper;
        } else if (VActivityManager.get().isAppProcess(this.processName)) {
            this.processType = ProcessType.VAppClient;
        } else {
            this.processType = ProcessType.CHILD;
        }
    }

    public static VirtualCore get() {
        return gCore;
    }

    public static SettingConfig getConfig() {
        return get().mConfig;
    }

    public static PackageManager getPM() {
        return get().getPackageManager();
    }

    private static String getProcessName(Context context) {
        String str;
        int myPid = Process.myPid();
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.pid == myPid) {
                str = next.processName;
                break;
            }
        }
        if (str != null) {
            return str;
        }
        throw new RuntimeException("processName = null");
    }

    private IAppManager getService() {
        if (!IInterfaceUtils.isAlive(this.mService)) {
            synchronized (this) {
                this.mService = (IAppManager) LocalProxyUtils.genProxy(IAppManager.class, getStubInterface());
            }
        }
        return this.mService;
    }

    private Object getStubInterface() {
        return IAppManager.Stub.asInterface(ServiceManagerNative.getService("app"));
    }

    public static Object mainThread() {
        return get().mainThread;
    }

    public boolean checkSelfPermission(String str, boolean z4) {
        if (z4) {
            if (this.hostPackageManager.checkPermission(str, StubManifest.EXT_PACKAGE_NAME) == 0) {
                return true;
            }
            return false;
        }
        if (this.hostPackageManager.checkPermission(str, StubManifest.PACKAGE_NAME) == 0) {
            return true;
        }
        return false;
    }

    public boolean cleanPackageData(String str, int i5) {
        try {
            return getService().cleanPackageData(str, i5);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public boolean createShortcut(int i5, String str, OnEmitShortcutListener onEmitShortcutListener) {
        return createShortcut(i5, str, null, onEmitShortcutListener);
    }

    public AppCallback getAppCallback() {
        AppCallback appCallback = this.mAppCallback;
        return appCallback == null ? AppCallback.EMPTY : appCallback;
    }

    public int getAppPid(String str, int i5, String str2) {
        return VActivityManager.get().getAppPid(str, i5, str2);
    }

    public AppRequestListener getAppRequestListener() {
        return this.mAppRequestListener;
    }

    public Context getContext() {
        return this.context;
    }

    public String getEngineProcessName() {
        return this.context.getString(R.string.server_process_name);
    }

    public int[] getGids() {
        return this.mHostPkgInfo.gids;
    }

    public Handler getHandlerASyc() {
        return this.mHandlerASyc;
    }

    public ApplicationInfo getHostApplicationInfo() {
        return this.mHostPkgInfo.applicationInfo;
    }

    public HostPackageManager getHostPackageManager() {
        return this.hostPackageManager;
    }

    public String getHostPkg() {
        return this.hostPkgName;
    }

    public ConditionVariable getInitLock() {
        return this.mInitLock;
    }

    public int getInstalledAppCount() {
        try {
            return getService().getInstalledAppCount();
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public InstalledAppInfo getInstalledAppInfo(String str, int i5) {
        try {
            return getService().getInstalledAppInfo(str, i5);
        } catch (RemoteException e5) {
            return (InstalledAppInfo) VirtualRuntime.crash(e5);
        }
    }

    public List<InstalledAppInfo> getInstalledApps(int i5) {
        try {
            return getService().getInstalledApps(i5);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public List<InstalledAppInfo> getInstalledAppsAsUser(int i5, int i6) {
        try {
            return getService().getInstalledAppsAsUser(i5, i6);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public List<String> getInstalledSplitNames(String str) {
        try {
            return getService().getInstalledSplitNames(str);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public Intent getLaunchIntent(String str, int i5) {
        VPackageManager vPackageManager = VPackageManager.get();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.INFO");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = vPackageManager.queryIntentActivities(intent, intent.resolveType(this.context), 0, i5);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            intent.removeCategory("android.intent.category.INFO");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(str);
            queryIntentActivities = vPackageManager.queryIntentActivities(intent, intent.resolveType(this.context), 0, i5);
        }
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            Intent intent2 = new Intent(intent);
            intent2.setFlags(268435456);
            intent2.setClassName(queryIntentActivities.get(0).activityInfo.packageName, queryIntentActivities.get(0).activityInfo.name);
            return intent2;
        }
        return null;
    }

    public String getMainProcessName() {
        return this.mainProcessName;
    }

    public PackageInfo getOutSidePackageInfo(String str, int i5) {
        try {
            return getHostPackageManager().getPackageInfo(str, i5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public int[] getPackageInstalledUsers(String str) {
        try {
            return getService().getPackageInstalledUsers(str);
        } catch (RemoteException e5) {
            return (int[]) VirtualRuntime.crash(e5);
        }
    }

    public PackageManager getPackageManager() {
        return this.context.getPackageManager();
    }

    public ActivityManager.RunningAppProcessInfo getProccessInfo(String str, int i5) {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : getRunningAppProcessesEx()) {
            if (runningAppProcessInfo.processName.equals(str) && runningAppProcessInfo.uid == i5) {
                return runningAppProcessInfo;
            }
        }
        return null;
    }

    public List<ActivityManager.RecentTaskInfo> getRecentTasksEx(int i5, int i6) {
        ArrayList arrayList = new ArrayList(((ActivityManager) this.context.getSystemService("activity")).getRecentTasks(i5, i6));
        if (!get().isSharedUserId()) {
            arrayList.addAll(VExtPackageAccessor.getRecentTasks(i5, i6));
        }
        return arrayList;
    }

    public Resources getResources(String str) throws Resources.NotFoundException {
        InstalledAppInfo installedAppInfo = getInstalledAppInfo(str, 0);
        if (installedAppInfo != null) {
            AssetManager newInstance = mirror.android.content.res.AssetManager.ctor.newInstance();
            mirror.android.content.res.AssetManager.addAssetPath.call(newInstance, installedAppInfo.getApkPath());
            Resources resources = this.context.getResources();
            return new Resources(newInstance, resources.getDisplayMetrics(), resources.getConfiguration());
        }
        throw new Resources.NotFoundException(str);
    }

    public List<ActivityManager.RunningAppProcessInfo> getRunningAppProcessesEx() {
        ArrayList arrayList = new ArrayList(((ActivityManager) this.context.getSystemService("activity")).getRunningAppProcesses());
        if (!get().isSharedUserId()) {
            arrayList.addAll(VExtPackageAccessor.getRunningAppProcesses());
        }
        return arrayList;
    }

    public List<ActivityManager.RunningTaskInfo> getRunningTasksEx(int i5) {
        ArrayList arrayList = new ArrayList(((ActivityManager) this.context.getSystemService("activity")).getRunningTasks(i5));
        if (!get().isSharedUserId()) {
            arrayList.addAll(VExtPackageAccessor.getRunningTasks(i5));
        }
        return arrayList;
    }

    public int getTargetSdkVersion() {
        return this.context.getApplicationInfo().targetSdkVersion;
    }

    public TaskDescriptionDelegate getTaskDescriptionDelegate() {
        return this.mTaskDescriptionDelegate;
    }

    public int getUidForSharedUser(String str) {
        try {
            return getService().getUidForSharedUser(str);
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public void initialize(VirtualInitializer virtualInitializer) {
        String obj;
        if (virtualInitializer != null) {
            ProcessType processType = this.processType;
            if (processType == null) {
                obj = "null";
            } else {
                obj = processType.toString();
            }
            Log.e("processType", obj);
            int i5 = AnonymousClass3.$SwitchMap$com$lody$virtual$client$core$VirtualCore$ProcessType[this.processType.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            virtualInitializer.onChildProcess();
                            return;
                        }
                        return;
                    }
                    virtualInitializer.onServerProcess();
                    return;
                }
                virtualInitializer.onVirtualProcess();
                return;
            }
            virtualInitializer.onMainProcess();
            return;
        }
        throw new IllegalStateException("Initializer = NULL");
    }

    public VAppInstallerResult installPackage(Uri uri, VAppInstallerParams vAppInstallerParams) {
        try {
            return getService().installPackage(uri, vAppInstallerParams);
        } catch (RemoteException e5) {
            return (VAppInstallerResult) VirtualRuntime.crash(e5);
        }
    }

    public boolean installPackageAsUser(int i5, String str) {
        try {
            return getService().installPackageAsUser(i5, str);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public boolean isAppInstalled(String str) {
        try {
            return getService().isAppInstalled(str);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public boolean isAppInstalledAsUser(int i5, String str) {
        try {
            return getService().isAppInstalledAsUser(i5, str);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public boolean isAppRunning(String str, int i5, boolean z4) {
        return VActivityManager.get().isAppRunning(str, i5, z4);
    }

    public boolean isChildProcess() {
        return ProcessType.CHILD == this.processType;
    }

    public boolean isEngineLaunched() {
        if (isExtPackage()) {
            return true;
        }
        if (!BinderProvider.scanApps) {
            scanApps();
        }
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService("activity");
        String engineProcessName = getEngineProcessName();
        Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
        while (it.hasNext()) {
            if (it.next().processName.endsWith(engineProcessName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isExtHelperProcess() {
        return ProcessType.Helper == this.processType;
    }

    public boolean isExtPackage() {
        return !this.isMainPackage;
    }

    public boolean isExtPackageInstalled() {
        return isOutsideInstalled(StubManifest.EXT_PACKAGE_NAME);
    }

    public boolean isMainPackage() {
        return this.isMainPackage;
    }

    public boolean isMainProcess() {
        return ProcessType.Main == this.processType;
    }

    public boolean isOutsideInstalled(String str) {
        if (str == null) {
            return false;
        }
        try {
            this.hostPackageManager.getApplicationInfo(str, 0L);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public boolean isPackageLaunchable(String str) {
        InstalledAppInfo installedAppInfo = getInstalledAppInfo(str, 0);
        if (installedAppInfo == null || getLaunchIntent(str, installedAppInfo.getInstalledUsers()[0]) == null) {
            return false;
        }
        return true;
    }

    public boolean isPackageLaunched(int i5, String str) {
        try {
            return getService().isPackageLaunched(i5, str);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public boolean isRunInExtProcess(String str) {
        try {
            return getService().isRunInExtProcess(str);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public boolean isServerProcess() {
        return ProcessType.Server == this.processType;
    }

    public boolean isSharedUserId() {
        return myUid() == remoteUid();
    }

    public boolean isStartup() {
        return this.isStartUp;
    }

    public boolean isSystemApp() {
        int i5 = getContext().getApplicationInfo().flags;
        if ((i5 & 1) == 0 && (i5 & 128) == 0) {
            return false;
        }
        return true;
    }

    public boolean isVAppProcess() {
        return ProcessType.VAppClient == this.processType;
    }

    public void killAllApps() {
        VActivityManager.get().killAllApps();
    }

    public void killApp(String str, int i5) {
        VActivityManager.get().killAppByPkg(str, i5);
    }

    public int myPid() {
        return this.myPid;
    }

    public int myUid() {
        return this.myUid;
    }

    public int myUserId() {
        return VUserHandle.getUserId(this.myUid);
    }

    public void registerObserver(IPackageObserver iPackageObserver) {
        try {
            getService().registerObserver(iPackageObserver);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public int remoteUid() {
        return this.remoteUid;
    }

    public boolean removeShortcut(int i5, String str, Intent intent, OnEmitShortcutListener onEmitShortcutListener) {
        String name;
        InstalledAppInfo installedAppInfo = getInstalledAppInfo(str, 0);
        if (installedAppInfo == null) {
            return false;
        }
        try {
            String charSequence = installedAppInfo.getApplicationInfo(i5).loadLabel(this.context.getPackageManager()).toString();
            if (onEmitShortcutListener != null && (name = onEmitShortcutListener.getName(charSequence)) != null) {
                charSequence = name;
            }
            Intent launchIntent = getLaunchIntent(str, i5);
            if (launchIntent == null) {
                return false;
            }
            Intent wrapperShortcutIntent = wrapperShortcutIntent(launchIntent, intent, str, i5);
            if (Build.VERSION.SDK_INT < 26) {
                Intent intent2 = new Intent();
                intent2.putExtra("android.intent.extra.shortcut.INTENT", wrapperShortcutIntent);
                intent2.putExtra("android.intent.extra.shortcut.NAME", charSequence);
                intent2.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
                this.context.sendBroadcast(intent2);
                return true;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public synchronized ActivityInfo resolveActivityInfo(Intent intent, int i5) {
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2 = null;
        if (SpecialComponentList.shouldBlockIntent(intent)) {
            return null;
        }
        if (intent.getComponent() == null) {
            ResolveInfo resolveIntent = VPackageManager.get().resolveIntent(intent, intent.getType(), 0, i5);
            if (resolveIntent != null && (activityInfo = resolveIntent.activityInfo) != null) {
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                activityInfo2 = activityInfo;
            }
        } else {
            activityInfo2 = resolveActivityInfo(intent.getComponent(), i5);
        }
        return activityInfo2;
    }

    public ServiceInfo resolveServiceInfo(Intent intent, int i5) {
        ResolveInfo resolveService;
        if (SpecialComponentList.shouldBlockIntent(intent) || (resolveService = VPackageManager.get().resolveService(intent, intent.getType(), 0, i5)) == null) {
            return null;
        }
        return resolveService.serviceInfo;
    }

    public void scanApps() {
        try {
            getService().scanApps();
        } catch (RemoteException unused) {
        }
    }

    public void setAppCallback(AppCallback appCallback) {
        this.mAppCallback = appCallback;
    }

    public void setAppRequestListener(AppRequestListener appRequestListener) {
        this.mAppRequestListener = appRequestListener;
    }

    public void setCrashHandler(CrashHandler crashHandler) {
        VClient.get().setCrashHandler(crashHandler);
    }

    public void setPackageHidden(int i5, String str, boolean z4) {
        try {
            getService().setPackageHidden(i5, str, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void setTaskDescriptionDelegate(TaskDescriptionDelegate taskDescriptionDelegate) {
        this.mTaskDescriptionDelegate = taskDescriptionDelegate;
    }

    public void startup(Context context, SettingConfig settingConfig) throws Throwable {
        if (!this.isStartUp) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (!context.getPackageName().equals(settingConfig.getMainPackageName()) && !context.getPackageName().equals(settingConfig.getExtPackageName())) {
                    throw new IllegalArgumentException("Neither the main package nor the extension package, you seem to have configured the wrong package name, expected " + settingConfig.getMainPackageName() + " or " + settingConfig.getExtPackageName() + ", but got " + context.getPackageName());
                }
                this.mInitLock = new ConditionVariable();
                this.mConfig = settingConfig;
                String mainPackageName = settingConfig.getMainPackageName();
                String extPackageName = settingConfig.getExtPackageName();
                Constants.ACTION_SHORTCUT = mainPackageName + Constants.ACTION_SHORTCUT;
                Constants.ACTION_BADGER_CHANGE = mainPackageName + Constants.ACTION_BADGER_CHANGE;
                StubManifest.STUB_CP_AUTHORITY = "com.yqtech.multiapp.virtual_stub_";
                StubManifest.PROXY_CP_AUTHORITY = "com.yqtech.multiapp.provider_proxy";
                File externalFilesDir = context.getExternalFilesDir(settingConfig.getVirtualSdcardAndroidDataName());
                if (!externalFilesDir.exists()) {
                    externalFilesDir.mkdirs();
                }
                if (extPackageName == null) {
                    extPackageName = "NO_EXT";
                }
                StubManifest.PACKAGE_NAME = mainPackageName;
                StubManifest.EXT_PACKAGE_NAME = extPackageName;
                StubManifest.EXT_STUB_CP_AUTHORITY = "com.yqtech.multiapp.ext.virtual_stub_ext_";
                StubManifest.EXT_PROXY_CP_AUTHORITY = "com.yqtech.multiapp.ext.provider_proxy_ext";
                this.context = context;
                this.isMainPackage = context.getPackageName().equals(StubManifest.PACKAGE_NAME);
                NativeEngine.bypassHiddenAPIEnforcementPolicyIfNeeded();
                HostPackageManager init = HostPackageManager.init();
                this.hostPackageManager = init;
                this.mHostPkgInfo = init.getPackageInfo(mainPackageName, 256L);
                detectProcessType();
                if (isVAppProcess()) {
                    this.mainThread = ActivityThread.currentActivityThread.call(new Object[0]);
                    LocalPackageCache.init();
                }
                if (isExtPackage()) {
                    try {
                        ApplicationInfo applicationInfo = getHostPackageManager().getApplicationInfo(mainPackageName, 0L);
                        if (applicationInfo != null) {
                            this.remoteUid = applicationInfo.uid;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    VLog.e(TAG, "===========  Extension Package(%s) ===========", this.processType.name());
                } else {
                    try {
                        ApplicationInfo applicationInfo2 = getHostPackageManager().getApplicationInfo(extPackageName, 0L);
                        if (applicationInfo2 != null) {
                            this.remoteUid = applicationInfo2.uid;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
                if (isVAppProcess() || isExtHelperProcess()) {
                    ServiceManagerNative.linkToDeath(new IBinder.DeathRecipient() { // from class: com.lody.virtual.client.core.VirtualCore.2
                        @Override // android.os.IBinder.DeathRecipient
                        public void binderDied() {
                            VLog.e(VirtualCore.TAG, "Server was dead, kill process: " + VirtualCore.this.processType.name());
                            Process.killProcess(Process.myPid());
                        }
                    });
                }
                if (isServerProcess() || isExtHelperProcess()) {
                    VLog.w("DownloadManager", "Listening DownloadManager action  in process: " + this.processType, new Object[0]);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
                    try {
                        if (Build.VERSION.SDK_INT >= 33) {
                            context.registerReceiver(this.mDownloadCompleteReceiver, intentFilter, 2);
                        } else {
                            context.registerReceiver(this.mDownloadCompleteReceiver, intentFilter);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                InvocationStubManager invocationStubManager = InvocationStubManager.getInstance();
                invocationStubManager.init();
                invocationStubManager.injectAll();
                this.isStartUp = true;
                this.mInitLock.open();
                return;
            }
            throw new IllegalStateException("VirtualCore.startup() must called in main thread.");
        }
    }

    public boolean uninstallPackage(String str) {
        try {
            return getService().uninstallPackage(str);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean uninstallPackageAsUser(String str, int i5) {
        try {
            return getService().uninstallPackageAsUser(str, i5);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public void unregisterObserver(IPackageObserver iPackageObserver) {
        try {
            getService().unregisterObserver(iPackageObserver);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void waitForEngine() {
        ServiceManagerNative.ensureServerStarted();
    }

    public void waitStartup() {
        ConditionVariable conditionVariable;
        if (Looper.myLooper() != Looper.getMainLooper() && (conditionVariable = this.mInitLock) != null) {
            conditionVariable.block();
        }
    }

    public Intent wrapperShortcutIntent(Intent intent, Intent intent2, String str, int i5) {
        Intent intent3 = new Intent();
        intent3.addCategory("android.intent.category.DEFAULT");
        intent3.setAction(Constants.ACTION_SHORTCUT);
        intent3.setPackage(getHostPkg());
        if (intent2 != null) {
            intent3.putExtra("_VA_|_splash_", intent2.toUri(0));
        }
        intent3.putExtra("_VA_|_pkg_", str);
        intent3.putExtra("_VA_|_uri_", intent.toUri(0));
        intent3.putExtra("_VA_|_user_id_", i5);
        return intent3;
    }

    public boolean createShortcut(int i5, String str, Intent intent, OnEmitShortcutListener onEmitShortcutListener) {
        ShortcutInfo.Builder longLabel;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder intent2;
        ShortcutInfo build;
        InstalledAppInfo installedAppInfo = getInstalledAppInfo(str, 0);
        if (installedAppInfo == null) {
            return false;
        }
        ApplicationInfo applicationInfo = installedAppInfo.getApplicationInfo(i5);
        PackageManager packageManager = this.context.getPackageManager();
        try {
            String charSequence = applicationInfo.loadLabel(packageManager).toString();
            Bitmap drawableToBitmap = BitmapUtils.drawableToBitmap(applicationInfo.loadIcon(packageManager));
            if (onEmitShortcutListener != null) {
                String name = onEmitShortcutListener.getName(charSequence);
                if (name != null) {
                    charSequence = name;
                }
                Bitmap icon2 = onEmitShortcutListener.getIcon(drawableToBitmap);
                if (icon2 != null) {
                    drawableToBitmap = icon2;
                }
            }
            Intent launchIntent = getLaunchIntent(str, i5);
            if (launchIntent == null) {
                return false;
            }
            Intent wrapperShortcutIntent = wrapperShortcutIntent(launchIntent, intent, str, i5);
            if (Build.VERSION.SDK_INT >= 26) {
                longLabel = new ShortcutInfo.Builder(getContext(), str + "@" + i5).setLongLabel(charSequence);
                shortLabel = longLabel.setShortLabel(charSequence);
                icon = shortLabel.setIcon(Icon.createWithBitmap(drawableToBitmap));
                intent2 = icon.setIntent(wrapperShortcutIntent);
                build = intent2.build();
                ShortcutManager shortcutManager = (ShortcutManager) getContext().getSystemService(ShortcutManager.class);
                if (shortcutManager == null) {
                    return true;
                }
                try {
                    shortcutManager.requestPinShortcut(build, PendingIntent.getActivity(getContext(), str.hashCode() + i5, wrapperShortcutIntent, BuildCompat.isS() ? 201326592 : PackageParserEx.GET_SIGNING_CERTIFICATES).getIntentSender());
                    return true;
                } catch (Throwable unused) {
                    return false;
                }
            }
            Intent intent3 = new Intent();
            intent3.putExtra("android.intent.extra.shortcut.INTENT", wrapperShortcutIntent);
            intent3.putExtra("android.intent.extra.shortcut.NAME", charSequence);
            intent3.putExtra("android.intent.extra.shortcut.ICON", BitmapUtils.warrperIcon(drawableToBitmap, 256, 256));
            intent3.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
            this.context.sendBroadcast(intent3);
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public String getProcessName() {
        return this.processName;
    }

    public ActivityInfo resolveActivityInfo(ComponentName componentName, int i5) {
        return VPackageManager.get().getActivityInfo(componentName, 0, i5);
    }
}
