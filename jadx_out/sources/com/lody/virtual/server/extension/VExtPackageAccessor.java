package com.lody.virtual.server.extension;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.lody.virtual.IExtHelperInterface;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.Constants;
import com.lody.virtual.client.ipc.ProviderCall;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.IPCHelper;
import com.lody.virtual.helper.compat.BundleCompat;
import com.lody.virtual.helper.utils.VLog;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class VExtPackageAccessor {
    private static final String TAG = "VExtPackageAccessor";
    private static IPCHelper<IExtHelperInterface> sHelper = new IPCHelper<IExtHelperInterface>() { // from class: com.lody.virtual.server.extension.VExtPackageAccessor.1
        @Override // com.lody.virtual.helper.IPCHelper
        public IExtHelperInterface getInterface() {
            Context context = VirtualCore.get().getContext();
            for (int i5 = 0; i5 < 3; i5++) {
                Bundle callSafely = new ProviderCall.Builder(context, VExtPackageAccessor.access$000()).methodName("connect").callSafely();
                if (callSafely != null) {
                    return IExtHelperInterface.Stub.asInterface(BundleCompat.getBinder(callSafely, "_VA_|_binder_"));
                }
                VExtPackageAccessor.tryPullUpExtProcess();
                SystemClock.sleep(200L);
            }
            return null;
        }
    };

    static /* synthetic */ String access$000() {
        return getAuthority();
    }

    public static boolean callHelper() {
        try {
            new ProviderCall.Builder(VirtualCore.get().getContext(), getAuthority()).methodName("@").retry(0).call();
            try {
                new ProviderCall.Builder(VirtualCore.get().getContext(), "com.yqtech.multiapp.ext.virtual_stub_ext_0").methodName("@").retry(0).call();
                return true;
            } catch (IllegalAccessException e5) {
                Log.e(TAG, "callHelper virtual_stub_ext_0 failed...:" + e5);
                return false;
            }
        } catch (IllegalAccessException unused) {
            VLog.e(TAG, "callHelper virtual.service.ext_helper failed...");
            return false;
        }
    }

    public static void cleanPackageData(final int[] iArr, final String str) {
        if (!VirtualCore.get().isExtPackageInstalled()) {
            return;
        }
        sHelper.callVoid(new IPCHelper.CallableVoid<IExtHelperInterface>() { // from class: com.lody.virtual.server.extension.VExtPackageAccessor.3
            @Override // com.lody.virtual.helper.IPCHelper.CallableVoid
            public void call(IExtHelperInterface iExtHelperInterface) throws RemoteException {
                iExtHelperInterface.cleanPackageData(iArr, str);
            }
        });
    }

    public static void forceStop(final int[] iArr) {
        sHelper.callVoid(new IPCHelper.CallableVoid<IExtHelperInterface>() { // from class: com.lody.virtual.server.extension.VExtPackageAccessor.4
            @Override // com.lody.virtual.helper.IPCHelper.CallableVoid
            public void call(IExtHelperInterface iExtHelperInterface) throws RemoteException {
                iExtHelperInterface.forceStop(iArr);
            }
        });
    }

    private static String getAuthority() {
        return VirtualCore.getConfig().getExtPackageHelperAuthority();
    }

    private static Intent getLaunchIntentForPackage(PackageManager packageManager, String str) {
        Intent intent = new Intent(Constants.ACTION_LAUNCH_HELPER_PROCESS);
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (queryIntentActivities.size() <= 0) {
            return null;
        }
        Intent intent2 = new Intent(intent);
        intent2.setFlags(268435456);
        intent2.setFlags(65536);
        intent2.setClassName(queryIntentActivities.get(0).activityInfo.packageName, queryIntentActivities.get(0).activityInfo.name);
        return intent2;
    }

    public static List<ActivityManager.RecentTaskInfo> getRecentTasks(final int i5, final int i6) {
        if (!VirtualCore.get().isExtPackageInstalled()) {
            return Collections.emptyList();
        }
        List<ActivityManager.RecentTaskInfo> list = (List) sHelper.call(new IPCHelper.Callable<IExtHelperInterface, List<ActivityManager.RecentTaskInfo>>() { // from class: com.lody.virtual.server.extension.VExtPackageAccessor.6
            @Override // com.lody.virtual.helper.IPCHelper.Callable
            public List<ActivityManager.RecentTaskInfo> call(IExtHelperInterface iExtHelperInterface) throws RemoteException {
                return iExtHelperInterface.getRecentTasks(i5, i6);
            }
        });
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public static List<ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() {
        if (!VirtualCore.get().isExtPackageInstalled()) {
            return Collections.emptyList();
        }
        List<ActivityManager.RunningAppProcessInfo> list = (List) sHelper.call(new IPCHelper.Callable<IExtHelperInterface, List<ActivityManager.RunningAppProcessInfo>>() { // from class: com.lody.virtual.server.extension.VExtPackageAccessor.7
            @Override // com.lody.virtual.helper.IPCHelper.Callable
            public List<ActivityManager.RunningAppProcessInfo> call(IExtHelperInterface iExtHelperInterface) throws RemoteException {
                return iExtHelperInterface.getRunningAppProcesses();
            }
        });
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public static List<ActivityManager.RunningTaskInfo> getRunningTasks(final int i5) {
        if (!VirtualCore.get().isExtPackageInstalled()) {
            return Collections.emptyList();
        }
        List<ActivityManager.RunningTaskInfo> list = (List) sHelper.call(new IPCHelper.Callable<IExtHelperInterface, List<ActivityManager.RunningTaskInfo>>() { // from class: com.lody.virtual.server.extension.VExtPackageAccessor.5
            @Override // com.lody.virtual.helper.IPCHelper.Callable
            public List<ActivityManager.RunningTaskInfo> call(IExtHelperInterface iExtHelperInterface) throws RemoteException {
                return iExtHelperInterface.getRunningTasks(i5);
            }
        });
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public static boolean hasExtPackageBootPermission() {
        if (!VirtualCore.get().isExtPackageInstalled()) {
            return false;
        }
        if (callHelper()) {
            return true;
        }
        tryPullUpExtProcess();
        for (int i5 = 0; i5 < 5; i5++) {
            if (callHelper()) {
                return true;
            }
            SystemClock.sleep(200L);
        }
        return false;
    }

    public static boolean isExternalStorageManager() {
        if (!VirtualCore.get().isExtPackageInstalled()) {
            return true;
        }
        return sHelper.callBoolean(new IPCHelper.Callable<IExtHelperInterface, Boolean>() { // from class: com.lody.virtual.server.extension.VExtPackageAccessor.8
            @Override // com.lody.virtual.helper.IPCHelper.Callable
            public Boolean call(IExtHelperInterface iExtHelperInterface) throws RemoteException {
                return Boolean.valueOf(iExtHelperInterface.isExternalStorageManager());
            }
        });
    }

    @Deprecated
    public static void startActivity(final Intent intent, final Bundle bundle) {
        if (!VirtualCore.get().isExtPackageInstalled()) {
            return;
        }
        sHelper.callVoid(new IPCHelper.CallableVoid<IExtHelperInterface>() { // from class: com.lody.virtual.server.extension.VExtPackageAccessor.9
            @Override // com.lody.virtual.helper.IPCHelper.CallableVoid
            public void call(IExtHelperInterface iExtHelperInterface) throws RemoteException {
                iExtHelperInterface.startActivity(intent, bundle);
            }
        });
    }

    public static void syncPackages() {
        if (!VirtualCore.get().isExtPackageInstalled()) {
            return;
        }
        sHelper.callVoid(new IPCHelper.CallableVoid<IExtHelperInterface>() { // from class: com.lody.virtual.server.extension.VExtPackageAccessor.2
            @Override // com.lody.virtual.helper.IPCHelper.CallableVoid
            public void call(IExtHelperInterface iExtHelperInterface) throws RemoteException {
                iExtHelperInterface.syncPackages();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tryPullUpExtProcess() {
        Context context = VirtualCore.get().getContext();
        Intent launchIntentForPackage = getLaunchIntentForPackage(context.getPackageManager(), StubManifest.EXT_PACKAGE_NAME);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(65536);
            launchIntentForPackage.addFlags(268435456);
            context.startActivity(launchIntentForPackage);
        }
    }
}
