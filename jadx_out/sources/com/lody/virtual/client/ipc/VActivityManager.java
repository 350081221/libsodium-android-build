package com.lody.virtual.client.ipc;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.client.hook.secondary.ServiceConnectionProxy;
import com.lody.virtual.client.stub.IntentBuilder;
import com.lody.virtual.client.stub.WindowPreviewActivity;
import com.lody.virtual.helper.compat.ActivityManagerCompat;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.helper.utils.IInterfaceUtils;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.remote.AppTaskInfo;
import com.lody.virtual.remote.BadgerInfo;
import com.lody.virtual.remote.ClientConfig;
import com.lody.virtual.remote.IntentSenderData;
import com.lody.virtual.remote.VParceledListSlice;
import com.lody.virtual.server.IBinderProxyService;
import com.lody.virtual.server.extension.VExtPackageAccessor;
import com.lody.virtual.server.interfaces.IActivityManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mirror.RefObject;
import mirror.android.app.ActivityThread;
import mirror.android.content.ContentProviderNative;

/* loaded from: classes3.dex */
public class VActivityManager {
    private static final VActivityManager sAM = new VActivityManager();
    private static final Map<ServiceConnection, ServiceConnectionDelegate> sServiceConnectionDelegates = new HashMap();
    private IActivityManager mService;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ServiceConnectionDelegate implements ServiceConnection {
        private ServiceConnection mBase;

        public ServiceConnectionDelegate(ServiceConnection serviceConnection) {
            this.mBase = serviceConnection;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IBinderProxyService asInterface = IBinderProxyService.Stub.asInterface(iBinder);
            if (asInterface != null) {
                try {
                    this.mBase.onServiceConnected(asInterface.getComponent(), asInterface.getService());
                    return;
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return;
                }
            }
            this.mBase.onServiceConnected(componentName, iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.mBase.onServiceDisconnected(componentName);
        }
    }

    public static VActivityManager get() {
        return sAM;
    }

    private Object getRemoteInterface() {
        return IActivityManager.Stub.asInterface(ServiceManagerNative.getService("activity"));
    }

    public IInterface acquireProviderClient(int i5, ProviderInfo providerInfo) throws RemoteException {
        IBinder acquireProviderClient = getService().acquireProviderClient(i5, providerInfo);
        if (acquireProviderClient != null) {
            return ContentProviderNative.asInterface.call(acquireProviderClient);
        }
        return null;
    }

    public void addOrUpdateIntentSender(IntentSenderData intentSenderData) throws RemoteException {
        getService().addOrUpdateIntentSender(intentSenderData, VUserHandle.myUserId());
    }

    public void appDoneExecuting(String str) {
        try {
            getService().appDoneExecuting(str, VUserHandle.myUserId());
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i5, int i6) {
        if (VirtualCore.get().isServerProcess()) {
            intent.putExtra("_VA_|_user_id_", i6);
            return context.bindService(intent, serviceConnection, i5);
        }
        ServiceConnectionDelegate delegate = getDelegate(serviceConnection);
        ServiceInfo resolveServiceInfo = VirtualCore.get().resolveServiceInfo(intent, i6);
        if (resolveServiceInfo != null) {
            ClientConfig initProcess = get().initProcess(resolveServiceInfo.packageName, resolveServiceInfo.processName, i6);
            return context.bindService(IntentBuilder.createBindProxyServiceIntent(initProcess.vpid, initProcess.isExt, resolveServiceInfo, intent, i5, i6, ServiceConnectionProxy.getDispatcher(context, delegate, i5)), delegate, i5);
        }
        return false;
    }

    public boolean broadcastFinish(IBinder iBinder) {
        try {
            return getService().broadcastFinish(iBinder);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public int checkPermission(String str, int i5, int i6) {
        try {
            return getService().checkPermission(VirtualCore.get().isExtPackage(), str, i5, i6, VClient.get().getCurrentPackage());
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public Activity findActivityByToken(IBinder iBinder) {
        Object obj = ActivityThread.mActivities.get(VirtualCore.mainThread()).get(iBinder);
        if (obj != null) {
            return ActivityThread.ActivityClientRecord.activity.get(obj);
        }
        return null;
    }

    public void finishActivity(IBinder iBinder) {
        Activity findActivityByToken = findActivityByToken(iBinder);
        if (findActivityByToken == null) {
            VLog.e("VActivityManager", "finishActivity fail : activity = null");
            return;
        }
        while (true) {
            RefObject<Activity> refObject = mirror.android.app.Activity.mParent;
            if (refObject == null) {
                Log.d("test ", "mirror.android.app.Activity.mParent=null");
                return;
            }
            Activity activity = refObject.get(findActivityByToken);
            if (activity == null) {
                ActivityManagerCompat.finishActivity(iBinder, mirror.android.app.Activity.mResultCode.get(findActivityByToken), mirror.android.app.Activity.mResultData.get(findActivityByToken));
                mirror.android.app.Activity.mFinished.set(findActivityByToken, true);
                return;
            }
            findActivityByToken = activity;
        }
    }

    public boolean finishActivityAffinity(int i5, IBinder iBinder) {
        try {
            return getService().finishActivityAffinity(i5, iBinder);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public ComponentName getActivityForToken(IBinder iBinder) {
        try {
            return getService().getActivityClassForToken(VUserHandle.myUserId(), iBinder);
        } catch (RemoteException e5) {
            return (ComponentName) VirtualRuntime.crash(e5);
        }
    }

    public int getAppPid(String str, int i5, String str2) {
        try {
            return getService().getAppPid(str, i5, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    public String getAppProcessName(int i5) {
        try {
            return getService().getAppProcessName(i5);
        } catch (RemoteException e5) {
            return (String) VirtualRuntime.crash(e5);
        }
    }

    public ComponentName getCallingActivity(IBinder iBinder) {
        try {
            return getService().getCallingActivity(VUserHandle.myUserId(), iBinder);
        } catch (RemoteException e5) {
            return (ComponentName) VirtualRuntime.crash(e5);
        }
    }

    public String getCallingPackage(IBinder iBinder) {
        try {
            return getService().getCallingPackage(VUserHandle.myUserId(), iBinder);
        } catch (RemoteException e5) {
            return (String) VirtualRuntime.crash(e5);
        }
    }

    public ServiceConnectionDelegate getDelegate(ServiceConnection serviceConnection) {
        Map<ServiceConnection, ServiceConnectionDelegate> map = sServiceConnectionDelegates;
        ServiceConnectionDelegate serviceConnectionDelegate = map.get(serviceConnection);
        if (serviceConnectionDelegate == null) {
            ServiceConnectionDelegate serviceConnectionDelegate2 = new ServiceConnectionDelegate(serviceConnection);
            map.put(serviceConnection, serviceConnectionDelegate2);
            return serviceConnectionDelegate2;
        }
        return serviceConnectionDelegate;
    }

    public String getInitialPackage(int i5) {
        try {
            return getService().getInitialPackage(i5);
        } catch (RemoteException e5) {
            return (String) VirtualRuntime.crash(e5);
        }
    }

    public IntentSenderData getIntentSender(IBinder iBinder) {
        try {
            return getService().getIntentSender(iBinder);
        } catch (RemoteException e5) {
            return (IntentSenderData) VirtualRuntime.crash(e5);
        }
    }

    public String getPackageForToken(IBinder iBinder) {
        try {
            return getService().getPackageForToken(VUserHandle.myUserId(), iBinder);
        } catch (RemoteException e5) {
            return (String) VirtualRuntime.crash(e5);
        }
    }

    public ClientConfig getProcessConfig(String str, String str2, int i5) {
        try {
            return getService().getProcessConfig(str, str2, i5);
        } catch (Throwable th) {
            return (ClientConfig) VirtualRuntime.crash(th);
        }
    }

    public List<String> getProcessPkgList(int i5) {
        try {
            return getService().getProcessPkgList(i5);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public IActivityManager getService() {
        if (!IInterfaceUtils.isAlive(this.mService)) {
            synchronized (VActivityManager.class) {
                this.mService = (IActivityManager) LocalProxyUtils.genProxy(IActivityManager.class, getRemoteInterface());
            }
        }
        return this.mService;
    }

    public VParceledListSlice getServices(String str, int i5, int i6) {
        try {
            return getService().getServices(str, i5, i6, VUserHandle.myUserId());
        } catch (RemoteException e5) {
            return (VParceledListSlice) VirtualRuntime.crash(e5);
        }
    }

    public final String getSettingsProvider(int i5, String str) {
        try {
            return getService().getSettingsProvider(VUserHandle.myUserId(), i5, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public int getSystemPid() {
        try {
            return getService().getSystemPid();
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public int getSystemUid() {
        try {
            return getService().getSystemUid();
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public AppTaskInfo getTaskInfo(int i5) {
        try {
            return getService().getTaskInfo(i5);
        } catch (RemoteException e5) {
            return (AppTaskInfo) VirtualRuntime.crash(e5);
        }
    }

    public int getUid() {
        return VClient.get().getVUid();
    }

    public int getUidByPid(int i5) {
        try {
            return getService().getUidByPid(i5);
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public void handleDownloadCompleteIntent(Intent intent) {
        try {
            getService().handleDownloadCompleteIntent(intent);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public ClientConfig initProcess(String str, String str2, int i5) {
        try {
            ClientConfig processConfig = getService().getProcessConfig(str, str2, i5);
            if (processConfig != null) {
                return processConfig;
            }
        } catch (RemoteException unused) {
        }
        try {
            return getService().initProcess(str, str2, i5);
        } catch (RemoteException e5) {
            return (ClientConfig) VirtualRuntime.crash(e5);
        }
    }

    public boolean isAppInactive(String str, int i5) {
        try {
            return getService().isAppInactive(str, i5);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public boolean isAppPid(int i5) {
        try {
            return getService().isAppPid(i5);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public boolean isAppProcess(String str) {
        try {
            return getService().isAppProcess(str);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public boolean isAppRunning(String str, int i5, boolean z4) {
        try {
            return getService().isAppRunning(str, i5, z4);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public void killAllApps() {
        try {
            getService().killAllApps();
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void killAppByPkg(String str, int i5) {
        try {
            getService().killAppByPkg(str, i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void killApplicationProcess(String str, int i5) {
        try {
            getService().killApplicationProcess(str, i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public boolean launchApp(int i5, String str) {
        return launchApp(i5, str, true);
    }

    public void notifyBadgerChange(BadgerInfo badgerInfo) {
        try {
            getService().notifyBadgerChange(badgerInfo);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void onActivityCreate(IBinder iBinder, IBinder iBinder2, int i5) {
        try {
            getService().onActivityCreated(iBinder, iBinder2, i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public boolean onActivityDestroy(IBinder iBinder) {
        try {
            return getService().onActivityDestroyed(VUserHandle.myUserId(), iBinder);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public void onActivityResumed(IBinder iBinder) {
        try {
            getService().onActivityResumed(VUserHandle.myUserId(), iBinder);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void onFinishActivity(IBinder iBinder) {
        try {
            getService().onActivityFinish(VUserHandle.myUserId(), iBinder);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void processRestarted(String str, String str2, int i5) {
        try {
            getService().processRestarted(str, str2, i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public ServiceConnection removeDelegate(ServiceConnection serviceConnection) {
        Iterator<ServiceConnectionDelegate> it = sServiceConnectionDelegates.values().iterator();
        while (it.hasNext()) {
            ServiceConnectionDelegate next = it.next();
            if (serviceConnection == next) {
                it.remove();
                return next;
            }
        }
        return serviceConnection;
    }

    public void removeIntentSender(IBinder iBinder) throws RemoteException {
        getService().removeIntentSender(iBinder);
    }

    public void sendActivityResult(IBinder iBinder, String str, int i5, Intent intent, int i6) {
        if (findActivityByToken(iBinder) != null) {
            ActivityThread.sendActivityResult.call(VirtualCore.mainThread(), iBinder, str, Integer.valueOf(i5), intent, Integer.valueOf(i6));
        }
    }

    public void sendBroadcast(Intent intent, int i5) {
        Intent proxyBroadcastIntent = ComponentUtils.proxyBroadcastIntent(intent, i5);
        if (proxyBroadcastIntent != null) {
            VirtualCore.get().getContext().sendBroadcast(proxyBroadcastIntent);
        }
    }

    public void sendCancelActivityResult(IBinder iBinder, String str, int i5) {
        sendActivityResult(iBinder, str, i5, null, 0);
    }

    public void setAppInactive(String str, boolean z4, int i5) {
        try {
            getService().setAppInactive(str, z4, i5);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public final void setSettingsProvider(int i5, String str, String str2) {
        try {
            getService().setSettingsProvider(VUserHandle.myUserId(), i5, str, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public int startActivities(Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle, String str, int i5) {
        try {
            return getService().startActivities(intentArr, strArr, iBinder, bundle, str, i5);
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public int startActivity(Intent intent, ActivityInfo activityInfo, IBinder iBinder, Bundle bundle, String str, int i5, String str2, int i6) {
        ActivityInfo activityInfo2;
        if (activityInfo == null) {
            ActivityInfo resolveActivityInfo = VirtualCore.get().resolveActivityInfo(intent, i6);
            if (resolveActivityInfo == null) {
                return ActivityManagerCompat.START_INTENT_NOT_RESOLVED;
            }
            activityInfo2 = resolveActivityInfo;
        } else {
            activityInfo2 = activityInfo;
        }
        try {
            return getService().startActivity(intent, activityInfo2, iBinder, bundle, str, i5, str2, i6);
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public int startActivityFromHistory(Intent intent) {
        try {
            return getService().startActivityFromHistory(intent);
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public ComponentName startService(Context context, Intent intent, int i5) {
        if (VirtualCore.get().isServerProcess()) {
            intent.putExtra("_VA_|_user_id_", i5);
            return context.startService(intent);
        }
        ServiceInfo resolveServiceInfo = VirtualCore.get().resolveServiceInfo(intent, i5);
        if (resolveServiceInfo != null) {
            ClientConfig initProcess = get().initProcess(resolveServiceInfo.packageName, resolveServiceInfo.processName, i5);
            return context.startService(IntentBuilder.createStartProxyServiceIntent(initProcess.vpid, initProcess.isExt, resolveServiceInfo, intent, i5));
        }
        return null;
    }

    public void unbindService(Context context, ServiceConnection serviceConnection) {
        context.unbindService(removeDelegate(serviceConnection));
    }

    public boolean launchApp(final int i5, String str, boolean z4) {
        boolean z5 = false;
        if (VirtualCore.get().isRunInExtProcess(str) && !VExtPackageAccessor.hasExtPackageBootPermission()) {
            return false;
        }
        Context context = VirtualCore.get().getContext();
        VPackageManager vPackageManager = VPackageManager.get();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.INFO");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = vPackageManager.queryIntentActivities(intent, intent.resolveType(context), 0, i5);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            intent.removeCategory("android.intent.category.INFO");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(str);
            queryIntentActivities = vPackageManager.queryIntentActivities(intent, intent.resolveType(context), 0, i5);
        }
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
            final Intent intent2 = new Intent(intent);
            intent2.setFlags(268435456);
            intent2.setClassName(activityInfo.packageName, activityInfo.name);
            z5 = true;
            if (z4 && !get().isAppRunning(activityInfo.packageName, i5, true)) {
                intent2.addFlags(65536);
                WindowPreviewActivity.previewActivity(i5, activityInfo);
                VirtualRuntime.getUIHandler().postDelayed(new Runnable() { // from class: com.lody.virtual.client.ipc.VActivityManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        VActivityManager.get().startActivity(intent2, i5);
                    }
                }, 400L);
            } else {
                get().startActivity(intent2, i5);
            }
        }
        return z5;
    }

    public int startActivity(Intent intent, int i5) {
        if (i5 < 0) {
            return ActivityManagerCompat.START_NOT_CURRENT_USER_ACTIVITY;
        }
        ActivityInfo resolveActivityInfo = VirtualCore.get().resolveActivityInfo(intent, i5);
        if (resolveActivityInfo == null) {
            return ActivityManagerCompat.START_INTENT_NOT_RESOLVED;
        }
        return startActivity(intent, resolveActivityInfo, null, null, null, -1, null, i5);
    }
}
