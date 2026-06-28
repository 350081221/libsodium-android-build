package com.lody.virtual.client.hook.proxies.am;

import android.R;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.IServiceConnection;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.lody.virtual.client.NativeEngine;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.badger.BadgerManager;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.Constants;
import com.lody.virtual.client.env.SpecialComponentList;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.delegate.TaskDescriptionDelegate;
import com.lody.virtual.client.hook.providers.ProviderHook;
import com.lody.virtual.client.hook.secondary.ServiceConnectionProxy;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.client.ipc.VPackageManager;
import com.lody.virtual.client.service.VServiceRuntime;
import com.lody.virtual.client.stub.ChooserActivity;
import com.lody.virtual.client.stub.IntentBuilder;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.compat.ActivityManagerCompat;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.compat.BundleCompat;
import com.lody.virtual.helper.compat.ParceledListSliceCompat;
import com.lody.virtual.helper.compat.PendingIntentCompat;
import com.lody.virtual.helper.utils.ArrayUtils;
import com.lody.virtual.helper.utils.BitmapUtils;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.helper.utils.DrawableUtils;
import com.lody.virtual.helper.utils.FileUtils;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.oem.apps.VAppFix;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.os.VUserInfo;
import com.lody.virtual.os.VUserManager;
import com.lody.virtual.remote.AppTaskInfo;
import com.lody.virtual.remote.ClientConfig;
import com.lody.virtual.remote.IntentSenderData;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import mirror.RefBoolean;
import mirror.RefObject;
import mirror.android.app.IActivityManager;
import mirror.android.app.LoadedApk;
import mirror.android.app.Service;
import mirror.android.content.ContentProviderHolderOreo;
import mirror.android.content.IIntentReceiverJB;
import mirror.android.content.pm.ParceledListSlice;
import mirror.android.content.pm.UserInfo;

/* loaded from: classes3.dex */
public class MethodProxies {

    /* loaded from: classes3.dex */
    static class AddPackageDependency extends MethodProxy {
        AddPackageDependency() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "addPackageDependency";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class BindIsolatedService extends BindService {
        BindIsolatedService() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean beforeCall(Object obj, Method method, Object... objArr) {
            MethodParameterUtils.replaceLastAppPkg(objArr);
            MethodProxy.replaceLastUserId(objArr);
            return super.beforeCall(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.BindService, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "bindIsolatedService";
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.BindService
        protected boolean isIsolated() {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    static class BindService extends MethodProxy {
        BindService() {
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object call(java.lang.Object r21, java.lang.reflect.Method r22, java.lang.Object... r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.client.hook.proxies.am.MethodProxies.BindService.call(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "bindService";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess() || MethodProxy.isServerProcess();
        }

        protected boolean isIsolated() {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    static class BindServiceInstance extends BindIsolatedService {
        BindServiceInstance() {
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.BindIsolatedService, com.lody.virtual.client.hook.proxies.am.MethodProxies.BindService, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "bindServiceInstance";
        }
    }

    /* loaded from: classes3.dex */
    static class BroadcastIntent extends MethodProxy {
        BroadcastIntent() {
        }

        private Intent handleInstallShortcutIntent(Intent intent) {
            ComponentName resolveActivity;
            Parcelable drawableToBitmap;
            Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
            if (intent2 != null && (resolveActivity = intent2.resolveActivity(VirtualCore.getPM())) != null) {
                String packageName = resolveActivity.getPackageName();
                Intent intent3 = new Intent();
                intent3.addCategory("android.intent.category.DEFAULT");
                intent3.setAction(Constants.ACTION_SHORTCUT);
                intent3.setPackage(MethodProxy.getHostPkg());
                intent3.putExtra("_VA_|_intent_", intent2);
                intent3.putExtra("_VA_|_uri_", intent2.toUri(0));
                intent3.putExtra("_VA_|_user_id_", VUserHandle.myUserId());
                intent.removeExtra("android.intent.extra.shortcut.INTENT");
                intent.putExtra("android.intent.extra.shortcut.INTENT", intent3);
                Intent.ShortcutIconResource shortcutIconResource = (Intent.ShortcutIconResource) intent.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
                if (shortcutIconResource != null && !TextUtils.equals(shortcutIconResource.packageName, MethodProxy.getHostPkg())) {
                    try {
                        Resources resources = VirtualCore.get().getResources(packageName);
                        int identifier = resources.getIdentifier(shortcutIconResource.resourceName, "drawable", packageName);
                        if (identifier > 0 && (drawableToBitmap = BitmapUtils.drawableToBitmap(resources.getDrawable(identifier))) != null) {
                            intent.removeExtra("android.intent.extra.shortcut.ICON_RESOURCE");
                            intent.putExtra("android.intent.extra.shortcut.ICON", drawableToBitmap);
                        }
                    } catch (Throwable th) {
                        VLog.e(VLog.TAG_DEFAULT, th);
                    }
                }
            }
            return intent;
        }

        private Intent handleMediaScannerIntent(Intent intent) {
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                return intent;
            }
            if (!"file".equalsIgnoreCase(data.getScheme())) {
                return intent;
            }
            String path = data.getPath();
            if (path == null) {
                return intent;
            }
            File file = new File(NativeEngine.getRedirectedPath(path));
            if (!file.exists()) {
                return intent;
            }
            intent.setData(Uri.fromFile(file));
            return intent;
        }

        private void handleUninstallShortcutIntent(Intent intent) {
            Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
            if (intent2 != null && intent2.resolveActivity(getPM()) != null) {
                Intent intent3 = new Intent();
                intent3.putExtra("_VA_|_uri_", intent2.toUri(0));
                intent3.setClassName(MethodProxy.getHostPkg(), Constants.SHORTCUT_PROXY_ACTIVITY_NAME);
                intent3.removeExtra("android.intent.extra.shortcut.INTENT");
                intent.putExtra("android.intent.extra.shortcut.INTENT", intent3);
            }
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            Intent intent = new Intent((Intent) objArr[1]);
            intent.setDataAndType(intent.getData(), (String) objArr[2]);
            Intent handleIntent = handleIntent(intent);
            if (handleIntent != null) {
                objArr[1] = handleIntent;
                Object obj2 = objArr[7];
                if ((obj2 instanceof String) || (obj2 instanceof String[])) {
                    objArr[7] = null;
                }
                objArr[ArrayUtils.indexOfFirst(objArr, Boolean.class)] = Boolean.FALSE;
                MethodProxy.replaceLastUserId(objArr);
                try {
                    return method.invoke(obj, objArr);
                } catch (Throwable unused) {
                }
            }
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "broadcastIntent";
        }

        protected Intent handleIntent(Intent intent) {
            String action = intent.getAction();
            if (!"android.intent.action.CREATE_SHORTCUT".equals(action) && !"com.android.launcher.action.INSTALL_SHORTCUT".equals(action) && !"com.aliyun.homeshell.action.INSTALL_SHORTCUT".equals(action)) {
                if (!"com.android.launcher.action.UNINSTALL_SHORTCUT".equals(action) && !"com.aliyun.homeshell.action.UNINSTALL_SHORTCUT".equals(action)) {
                    if ("android.intent.action.MEDIA_SCANNER_SCAN_FILE".equals(action)) {
                        return handleMediaScannerIntent(intent);
                    }
                    if (BadgerManager.handleBadger(intent)) {
                        return null;
                    }
                    if (intent.getComponent() != null) {
                        try {
                            final ActivityInfo receiverInfo = VirtualCore.get().getPackageManager().getReceiverInfo(intent.getComponent(), 0);
                            if (receiverInfo != null && VirtualCore.get().getProccessInfo(receiverInfo.processName, VClient.get().getVUid()) == null) {
                                VirtualCore.get().getHandlerASyc().post(new Runnable() { // from class: com.lody.virtual.client.hook.proxies.am.MethodProxies.BroadcastIntent.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        try {
                                            ProviderInfo providerInfo = new ProviderInfo();
                                            ActivityInfo activityInfo = receiverInfo;
                                            providerInfo.applicationInfo = activityInfo.applicationInfo;
                                            providerInfo.packageName = activityInfo.packageName;
                                            providerInfo.processName = activityInfo.processName;
                                            providerInfo.authority = "_VA_START_PROCESS";
                                            VActivityManager.get().acquireProviderClient(VUserHandle.myUserId(), providerInfo);
                                        } catch (Exception e5) {
                                            VLog.e(VLog.TAG_DEFAULT, e5);
                                        }
                                    }
                                });
                            }
                        } catch (Exception e5) {
                            VLog.e(VLog.TAG_DEFAULT, e5);
                        }
                    }
                    return ComponentUtils.proxyBroadcastIntent(intent, VUserHandle.myUserId());
                }
                handleUninstallShortcutIntent(intent);
                return intent;
            }
            if (!MethodProxy.getConfig().isAllowCreateShortcut()) {
                return null;
            }
            return handleInstallShortcutIntent(intent);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class BroadcastIntentWithFeature extends BroadcastIntent {
        BroadcastIntentWithFeature() {
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.BroadcastIntent, com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            Intent intent = new Intent((Intent) objArr[2]);
            intent.setDataAndType(intent.getData(), (String) objArr[3]);
            Intent handleIntent = handleIntent(intent);
            if (handleIntent != null) {
                objArr[2] = handleIntent;
                for (int i5 = 8; i5 < 11; i5++) {
                    if (objArr[i5] instanceof String[]) {
                        VLog.d(VLog.TAG_DEFAULT, "[broadcastIntentWithFeature] clear info: " + Arrays.toString((String[]) objArr[i5]), new Object[0]);
                        objArr[i5] = null;
                    }
                }
                int indexOfFirst = ArrayUtils.indexOfFirst(objArr, Boolean.class);
                int indexOfFirst2 = ArrayUtils.indexOfFirst(objArr, IIntentReceiver.class);
                if (indexOfFirst2 > 0 && objArr[indexOfFirst2] != null) {
                    objArr[indexOfFirst] = Boolean.TRUE;
                } else {
                    objArr[indexOfFirst] = Boolean.FALSE;
                }
                MethodProxy.replaceLastUserId(objArr);
                try {
                    return method.invoke(obj, objArr);
                } catch (Throwable th) {
                    VLog.e(VLog.TAG_DEFAULT, th);
                }
            }
            return 0;
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.BroadcastIntent, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "broadcastIntentWithFeature";
        }
    }

    /* loaded from: classes3.dex */
    static class CheckGrantUriPermission extends MethodProxy {
        CheckGrantUriPermission() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "checkGrantUriPermission";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class CheckPermission extends MethodProxy {
        CheckPermission() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Integer.valueOf(VActivityManager.get().checkPermission((String) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue()));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "checkPermission";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class CheckPermissionForDevice extends MethodProxy {
        CheckPermissionForDevice() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            objArr[2] = Integer.valueOf(VirtualCore.get().myUid());
            String str = (String) objArr[0];
            if (!SpecialComponentList.isWhitePermission(str) && !StubManifest.isSystemPermission(str)) {
                return super.call(obj, method, objArr);
            }
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "checkPermissionForDevice";
        }
    }

    /* loaded from: classes3.dex */
    static class CheckPermissionWithToken extends MethodProxy {
        CheckPermissionWithToken() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Integer.valueOf(VActivityManager.get().checkPermission((String) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue()));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "checkPermissionWithToken";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class ClearApplicationUserData extends MethodProxy {
        ClearApplicationUserData() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                String str = (String) MethodParameterUtils.getFirstParam(objArr, String.class);
                if (!TextUtils.isEmpty(str)) {
                    VirtualCore.get().cleanPackageData(str, MethodProxy.getAppUserId());
                }
            } catch (Throwable unused) {
            }
            return Boolean.FALSE;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "clearApplicationUserData";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class CrashApplication extends MethodProxy {
        CrashApplication() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "crashApplication";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class FinishReceiver extends MethodProxy {
        FinishReceiver() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            VActivityManager.get().broadcastFinish((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "finishReceiver";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class ForceStopPackage extends MethodProxy {
        ForceStopPackage() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            VActivityManager.get().killAppByPkg((String) objArr[0], VUserHandle.myUserId());
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "forceStopPackage";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetActivityClassForToken extends MethodProxy {
        GetActivityClassForToken() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ComponentName activityForToken = VActivityManager.get().getActivityForToken((IBinder) objArr[0]);
            if (activityForToken == null) {
                return method.invoke(obj, objArr);
            }
            return activityForToken;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getActivityClassForToken";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    public static class GetAppTasks extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAppTasks";
        }
    }

    /* loaded from: classes3.dex */
    public static class GetCallingActivity extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return VActivityManager.get().getCallingActivity((IBinder) objArr[0]);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getCallingActivity";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    public static class GetCallingPackage extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return VActivityManager.get().getCallingPackage((IBinder) objArr[0]);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getCallingPackage";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetContentProvider extends MethodProxy {
        GetContentProvider() {
        }

        private boolean miuiProviderWaitingTargetProcess(Object obj) {
            RefBoolean refBoolean;
            if (obj != null && (refBoolean = IActivityManager.ContentProviderHolderMIUI.waitProcessStart) != null) {
                return refBoolean.get(obj);
            }
            return false;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int providerNameIndex = getProviderNameIndex();
            String str = (String) objArr[providerNameIndex];
            if (!str.startsWith(StubManifest.STUB_CP_AUTHORITY) && !str.startsWith(StubManifest.EXT_STUB_CP_AUTHORITY) && !str.equals(MethodProxy.getConfig().getExtPackageHelperAuthority()) && !str.equals(MethodProxy.getConfig().getBinderProviderAuthority())) {
                boolean z4 = true;
                VLog.w("VActivityManger", "getContentProvider:%s", str);
                if (BuildCompat.isQ()) {
                    int i5 = providerNameIndex - 1;
                    if (objArr[i5] instanceof String) {
                        objArr[i5] = MethodProxy.getHostPkg();
                    }
                }
                int myUserId = VUserHandle.myUserId();
                ProviderInfo resolveContentProvider = VPackageManager.get().resolveContentProvider(str, 0, myUserId);
                if (resolveContentProvider != null && !resolveContentProvider.enabled) {
                    return null;
                }
                if (resolveContentProvider != null && isAppPkg(resolveContentProvider.packageName)) {
                    ClientConfig initProcess = VActivityManager.get().initProcess(resolveContentProvider.packageName, resolveContentProvider.processName, myUserId);
                    if (initProcess == null) {
                        VLog.e("ActivityManager", "failed to initProcess for provider: " + str);
                        return null;
                    }
                    objArr[providerNameIndex] = StubManifest.getStubAuthority(initProcess.vpid, initProcess.isExt);
                    MethodProxy.replaceLastUserId(objArr);
                    Object invoke = method.invoke(obj, objArr);
                    if (invoke == null) {
                        return null;
                    }
                    if (BuildCompat.isOreo()) {
                        IInterface iInterface = ContentProviderHolderOreo.provider.get(invoke);
                        if (iInterface != null) {
                            iInterface = VActivityManager.get().acquireProviderClient(myUserId, resolveContentProvider);
                            if (BuildCompat.isS() && iInterface != null) {
                                iInterface = ProviderHook.createProxy(false, str, iInterface);
                            }
                            z4 = false;
                        }
                        if (iInterface == null) {
                            if (z4) {
                                VLog.w("VActivityManager", "Loading provider: " + resolveContentProvider.authority + "(" + resolveContentProvider.processName + ")", new Object[0]);
                                ContentProviderHolderOreo.info.set(invoke, resolveContentProvider);
                                return invoke;
                            }
                            VLog.e("VActivityManager", "acquireProviderClient fail: " + resolveContentProvider.authority + "(" + resolveContentProvider.processName + ")");
                            return null;
                        }
                        ContentProviderHolderOreo.provider.set(invoke, iInterface);
                        ContentProviderHolderOreo.info.set(invoke, resolveContentProvider);
                    } else {
                        IInterface iInterface2 = IActivityManager.ContentProviderHolder.provider.get(invoke);
                        if (iInterface2 != null) {
                            iInterface2 = VActivityManager.get().acquireProviderClient(myUserId, resolveContentProvider);
                            z4 = false;
                        }
                        if (iInterface2 == null) {
                            if (z4) {
                                if (BuildCompat.isMIUI() && miuiProviderWaitingTargetProcess(invoke)) {
                                    VLog.w("VActivityManager", "miui provider waiting process: " + resolveContentProvider.authority + "(" + resolveContentProvider.processName + ")", new Object[0]);
                                }
                                return null;
                            }
                            VLog.e("VActivityManager", "acquireProviderClient fail: " + resolveContentProvider.authority + "(" + resolveContentProvider.processName + ")");
                            return null;
                        }
                        IActivityManager.ContentProviderHolder.provider.set(invoke, iInterface2);
                        IActivityManager.ContentProviderHolder.info.set(invoke, resolveContentProvider);
                    }
                    return invoke;
                }
                MethodProxy.replaceLastUserId(objArr);
                Object invoke2 = method.invoke(obj, objArr);
                if (invoke2 == null) {
                    return null;
                }
                if (BuildCompat.isOreo()) {
                    IInterface iInterface3 = ContentProviderHolderOreo.provider.get(invoke2);
                    for (int i6 = 0; i6 < 5 && invoke2 != null && iInterface3 == null; i6++) {
                        try {
                            VLog.w("VActivityManager", "1wait for provider publish,name:%s", str);
                            Thread.sleep(1000L);
                            invoke2 = method.invoke(obj, objArr);
                            iInterface3 = ContentProviderHolderOreo.provider.get(invoke2);
                        } catch (Throwable unused) {
                        }
                    }
                    ProviderInfo providerInfo = ContentProviderHolderOreo.info.get(invoke2);
                    if (iInterface3 != null) {
                        iInterface3 = ProviderHook.createProxy(true, providerInfo.authority, iInterface3);
                    }
                    ContentProviderHolderOreo.provider.set(invoke2, iInterface3);
                } else {
                    IInterface iInterface4 = IActivityManager.ContentProviderHolder.provider.get(invoke2);
                    for (int i7 = 0; i7 < 5 && invoke2 != null && iInterface4 == null; i7++) {
                        try {
                            VLog.w("VActivityManager", "2wait for provider publish,name:%s", str);
                            Thread.sleep(1000L);
                            invoke2 = method.invoke(obj, objArr);
                            iInterface4 = IActivityManager.ContentProviderHolder.provider.get(invoke2);
                        } catch (Throwable unused2) {
                        }
                    }
                    ProviderInfo providerInfo2 = IActivityManager.ContentProviderHolder.info.get(invoke2);
                    if (iInterface4 != null) {
                        iInterface4 = ProviderHook.createProxy(true, providerInfo2.authority, iInterface4);
                    }
                    IActivityManager.ContentProviderHolder.provider.set(invoke2, iInterface4);
                }
                return invoke2;
            }
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getContentProvider";
        }

        public int getProviderNameIndex() {
            return BuildCompat.isQ() ? 2 : 1;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetContentProviderExternal extends GetContentProvider {
        GetContentProviderExternal() {
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.GetContentProvider, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getContentProviderExternal";
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.GetContentProvider
        public int getProviderNameIndex() {
            return BuildCompat.isQ() ? 1 : 0;
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.GetContentProvider, com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetCurrentUser extends MethodProxy {
        GetCurrentUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                return UserInfo.ctor.newInstance(0, "user", 1);
            } catch (Throwable th) {
                VLog.e(VLog.TAG_DEFAULT, th);
                return null;
            }
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getCurrentUser";
        }
    }

    /* loaded from: classes3.dex */
    static class GetCurrentUserId extends MethodProxy {
        GetCurrentUserId() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getCurrentUserId";
        }
    }

    /* loaded from: classes3.dex */
    static class GetIntentForIntentSender extends MethodProxy {
        GetIntentForIntentSender() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) {
            Intent intent = (Intent) obj2;
            if (intent != null) {
                try {
                    ComponentUtils.IntentSenderInfo parseIntentSenderInfo = ComponentUtils.parseIntentSenderInfo(intent, false);
                    if (parseIntentSenderInfo != null) {
                        return parseIntentSenderInfo.intent;
                    }
                } catch (Throwable th) {
                    VLog.e(VLog.TAG_DEFAULT, th);
                }
            }
            return intent;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getIntentForIntentSender";
        }
    }

    /* loaded from: classes3.dex */
    static class GetIntentSender extends MethodProxy {
        GetIntentSender() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            Object obj2;
            PendingIntent readPendingIntent;
            AlarmManager alarmManager;
            String str = (String) objArr[1];
            objArr[1] = MethodProxy.getHostPkg();
            if (objArr[objArr.length - 1] instanceof Integer) {
                objArr[objArr.length - 1] = Integer.valueOf(MethodProxy.getRealUserId());
            }
            int intValue = ((Integer) objArr[0]).intValue();
            int indexOfFirst = ArrayUtils.indexOfFirst(objArr, Intent[].class);
            Intent[] intentArr = (Intent[]) objArr[indexOfFirst];
            int i5 = indexOfFirst + 1;
            String[] strArr = (String[]) objArr[i5];
            int i6 = indexOfFirst + 2;
            int intValue2 = ((Integer) objArr[i6]).intValue();
            int myUserId = VUserHandle.myUserId();
            if (BuildCompat.isS() && (intValue2 & 67108864) == 0 && (33554432 & intValue2) == 0) {
                intValue2 |= 67108864;
            }
            if (intentArr.length > 0) {
                Intent intent = intentArr[intentArr.length - 1];
                if (strArr != null && strArr.length >= intentArr.length) {
                    VLog.d(VLog.TAG_DEFAULT, "intent setDataAndType before: >>> " + intent, new Object[0]);
                    intent.setDataAndType(intent.getData(), strArr[intentArr.length - 1]);
                    VLog.d(VLog.TAG_DEFAULT, "intent setDataAndType after >>> " + intent, new Object[0]);
                }
                Intent proxyIntentSenderIntent = ComponentUtils.getProxyIntentSenderIntent(myUserId, intValue, str, intent);
                if (proxyIntentSenderIntent == null) {
                    return null;
                }
                int i7 = intValue2 & (-9) & (-129);
                if ((134217728 & i7) != 0) {
                    i7 = (i7 & (-671088641)) | 268435456;
                }
                Intent[] intentArr2 = new Intent[1];
                intentArr2[0] = proxyIntentSenderIntent;
                objArr[indexOfFirst] = intentArr2;
                objArr[i5] = new String[]{null};
                if ((i7 & 268435456) != 0 && BuildCompat.isSamsung()) {
                    objArr[i6] = 536870912;
                    obj2 = obj;
                    IInterface iInterface = (IInterface) method.invoke(obj2, objArr);
                    if (iInterface != null && (readPendingIntent = PendingIntentCompat.readPendingIntent(iInterface.asBinder())) != null && (alarmManager = (AlarmManager) MethodProxy.getHostContext().getSystemService(NotificationCompat.CATEGORY_ALARM)) != null) {
                        try {
                            alarmManager.cancel(readPendingIntent);
                        } catch (Throwable th) {
                            VLog.e(VLog.TAG_DEFAULT, th);
                        }
                    }
                } else {
                    obj2 = obj;
                }
                objArr[i6] = Integer.valueOf(i7);
                IInterface iInterface2 = (IInterface) method.invoke(obj2, objArr);
                if (iInterface2 != null) {
                    VActivityManager.get().addOrUpdateIntentSender(new IntentSenderData(str, iInterface2.asBinder(), intValue, myUserId));
                }
                return iInterface2;
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getIntentSender";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetIntentSenderWithFeature extends GetIntentSender {
        GetIntentSenderWithFeature() {
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.GetIntentSender, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getIntentSenderWithFeature";
        }
    }

    /* loaded from: classes3.dex */
    static class GetIntentSenderWithSourceToken extends GetIntentSender {
        GetIntentSenderWithSourceToken() {
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.GetIntentSender, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getIntentSenderWithSourceToken";
        }
    }

    /* loaded from: classes3.dex */
    static class GetPackageAskScreenCompat extends MethodProxy {
        GetPackageAskScreenCompat() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (objArr.length > 0 && (objArr[0] instanceof String)) {
                objArr[0] = MethodProxy.getHostPkg();
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPackageAskScreenCompat";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetPackageForIntentSender extends MethodProxy {
        GetPackageForIntentSender() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            IntentSenderData intentSender;
            IInterface iInterface = (IInterface) objArr[0];
            if (iInterface != null && (intentSender = VActivityManager.get().getIntentSender(iInterface.asBinder())) != null) {
                return intentSender.targetPkg;
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPackageForIntentSender";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetPackageForToken extends MethodProxy {
        GetPackageForToken() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String packageForToken = VActivityManager.get().getPackageForToken((IBinder) objArr[0]);
            if (packageForToken != null) {
                return packageForToken;
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPackageForToken";
        }
    }

    /* loaded from: classes3.dex */
    static class GetPackageProcessState extends MethodProxy {
        GetPackageProcessState() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return 4;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPackageProcessState";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetPersistedUriPermissions extends MethodProxy {
        GetPersistedUriPermissions() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPersistedUriPermissions";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetRecentTasks extends MethodProxy {
        GetRecentTasks() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            Object obj2;
            MethodProxy.replaceFirstUserId(objArr);
            Object invoke = method.invoke(obj, objArr);
            if (ParceledListSliceCompat.isReturnParceledListSlice(method)) {
                obj2 = ParceledListSlice.getList.call(invoke, new Object[0]);
            } else {
                obj2 = invoke;
            }
            for (ActivityManager.RecentTaskInfo recentTaskInfo : (List) obj2) {
                AppTaskInfo taskInfo = VActivityManager.get().getTaskInfo(recentTaskInfo.id);
                if (taskInfo != null) {
                    try {
                        recentTaskInfo.topActivity = taskInfo.topActivity;
                        recentTaskInfo.baseActivity = taskInfo.baseActivity;
                    } catch (Throwable unused) {
                    }
                    try {
                        recentTaskInfo.origActivity = taskInfo.baseActivity;
                        recentTaskInfo.baseIntent = taskInfo.baseIntent;
                    } catch (Throwable unused2) {
                    }
                }
            }
            return invoke;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getRecentTasks";
        }
    }

    /* loaded from: classes3.dex */
    static class GetRunningAppProcesses extends MethodProxy {
        GetRunningAppProcesses() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public synchronized Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (VClient.get().getClientConfig() == null) {
                return method.invoke(obj, objArr);
            }
            List list = (List) method.invoke(obj, objArr);
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
                if (runningAppProcessInfo.uid == MethodProxy.getRealUid()) {
                    if (VActivityManager.get().isAppPid(runningAppProcessInfo.pid)) {
                        int uidByPid = VActivityManager.get().getUidByPid(runningAppProcessInfo.pid);
                        if (VUserHandle.getUserId(uidByPid) != MethodProxy.getAppUserId()) {
                            it.remove();
                        } else {
                            List<String> processPkgList = VActivityManager.get().getProcessPkgList(runningAppProcessInfo.pid);
                            String appProcessName = VActivityManager.get().getAppProcessName(runningAppProcessInfo.pid);
                            if (appProcessName != null) {
                                runningAppProcessInfo.importanceReasonCode = 0;
                                runningAppProcessInfo.importanceReasonPid = 0;
                                runningAppProcessInfo.importanceReasonComponent = null;
                                runningAppProcessInfo.processName = appProcessName;
                            }
                            runningAppProcessInfo.pkgList = (String[]) processPkgList.toArray(new String[0]);
                            runningAppProcessInfo.uid = uidByPid;
                        }
                    } else if (runningAppProcessInfo.processName.startsWith(MethodProxy.getConfig().getMainPackageName()) || runningAppProcessInfo.processName.startsWith(MethodProxy.getConfig().getExtPackageName())) {
                        it.remove();
                    }
                }
            }
            return arrayList;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getRunningAppProcesses";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetServices extends MethodProxy {
        GetServices() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return VActivityManager.get().getServices(VClient.get().getCurrentPackage(), ((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue()).getList();
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getServices";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    public static class GetTasks extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            List<ActivityManager.RunningTaskInfo> list = (List) method.invoke(obj, objArr);
            for (ActivityManager.RunningTaskInfo runningTaskInfo : list) {
                AppTaskInfo taskInfo = VActivityManager.get().getTaskInfo(runningTaskInfo.id);
                if (taskInfo != null) {
                    runningTaskInfo.topActivity = taskInfo.topActivity;
                    runningTaskInfo.baseActivity = taskInfo.baseActivity;
                }
            }
            return list;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getTasks";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetUidForIntentSender extends MethodProxy {
        GetUidForIntentSender() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            IntentSenderData intentSender;
            IInterface iInterface = (IInterface) objArr[0];
            if (iInterface != null && (intentSender = VActivityManager.get().getIntentSender(iInterface.asBinder())) != null) {
                return Integer.valueOf(VPackageManager.get().getPackageUid(intentSender.targetPkg, intentSender.userId));
            }
            return -1;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getUidForIntentSender";
        }
    }

    /* loaded from: classes3.dex */
    static class GrantUriPermission extends MethodProxy {
        GrantUriPermission() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            MethodProxy.replaceLastUserId(objArr);
            Object obj2 = objArr[2];
            if (obj2 != null && (obj2 instanceof Uri)) {
                objArr[2] = ComponentUtils.processOutsideUri(MethodProxy.getAppUserId(), VirtualCore.get().isExtPackage(), (Uri) objArr[2]);
            }
            try {
                method.invoke(obj, objArr);
                return null;
            } catch (Exception e5) {
                if (e5.getCause() != null && (e5.getCause() instanceof SecurityException)) {
                    for (StackTraceElement stackTraceElement : e5.getStackTrace()) {
                        if (TextUtils.equals(stackTraceElement.getClassName(), Intent.class.getName()) && TextUtils.equals(stackTraceElement.getMethodName(), "migrateExtraStreamToClipData")) {
                            return null;
                        }
                    }
                }
                throw e5;
            }
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "grantUriPermission";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GrantUriPermissionFromOwner extends MethodProxy {
        GrantUriPermissionFromOwner() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "grantUriPermissionFromOwner";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class HandleIncomingUser extends MethodProxy {
        HandleIncomingUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int length = objArr.length - 1;
            if (objArr[length] instanceof String) {
                objArr[length] = MethodProxy.getHostPkg();
            }
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "handleIncomingUser";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class IsBackgroundRestricted extends MethodProxy {
        IsBackgroundRestricted() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "isBackgroundRestricted";
        }
    }

    /* loaded from: classes3.dex */
    static class KillApplication extends MethodProxy {
        KillApplication() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                VirtualCore.get().killApp((String) MethodParameterUtils.getFirstParam(objArr, String.class), VUserHandle.myUserId());
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "killApplication";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class KillApplicationProcess extends MethodProxy {
        KillApplicationProcess() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                VActivityManager.get().killApplicationProcess((String) MethodParameterUtils.getFirstParam(objArr, String.class), MethodProxy.getAppUserId());
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "killApplicationProcess";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class KillBackgroundProcesses extends MethodProxy {
        KillBackgroundProcesses() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            Object obj2 = objArr[0];
            if (obj2 instanceof String) {
                VActivityManager.get().killAppByPkg((String) obj2, MethodProxy.getAppUserId());
            }
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "killBackgroundProcesses";
        }
    }

    /* loaded from: classes3.dex */
    public static class OverridePendingTransition extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (!VClient.get().isDynamicApp()) {
                return 0;
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "overridePendingTransition";
        }
    }

    /* loaded from: classes3.dex */
    static class PeekService extends MethodProxy {
        PeekService() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int myUserId;
            Intent intent = new Intent((Intent) objArr[0]);
            String str = (String) objArr[1];
            ComponentName component = intent.getComponent();
            if (component != null && isHostPkg(component.getPackageName())) {
                return method.invoke(obj, objArr);
            }
            if (MethodProxy.isServerProcess()) {
                myUserId = intent.getIntExtra("_VA_|_user_id_", -1);
            } else {
                myUserId = VUserHandle.myUserId();
            }
            int i5 = myUserId;
            if (i5 != -1) {
                intent.setDataAndType(intent.getData(), str);
                ServiceInfo resolveServiceInfo = VirtualCore.get().resolveServiceInfo(intent, i5);
                if (resolveServiceInfo != null) {
                    ClientConfig clientConfig = VClient.get().getClientConfig();
                    objArr[0] = IntentBuilder.createBindProxyServiceIntent(clientConfig.vpid, clientConfig.isExt, resolveServiceInfo, intent, 0, i5, null);
                    return method.invoke(obj, objArr);
                }
                if (component != null && MethodProxy.isOutsidePackage(component.getPackageName())) {
                    return method.invoke(obj, objArr);
                }
                return null;
            }
            throw new IllegalArgumentException();
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "peekService";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess() || MethodProxy.isServerProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class PublishContentProviders extends MethodProxy {
        PublishContentProviders() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "publishContentProviders";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class PublishService extends MethodProxy {
        PublishService() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                return super.call(obj, method, objArr);
            } catch (Exception e5) {
                VLog.e(VLog.TAG_DEFAULT, e5);
                return null;
            }
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "publishService";
        }
    }

    /* loaded from: classes3.dex */
    static class RegisterReceiverWithFeature extends RegisterReceiver {
        public RegisterReceiverWithFeature() {
            if (BuildCompat.isS()) {
                this.IDX_IIntentReceiver = 4;
                this.IDX_IntentFilter = 5;
                this.IDX_RequiredPermission = 6;
            } else {
                this.IDX_IIntentReceiver = 3;
                this.IDX_IntentFilter = 4;
                this.IDX_RequiredPermission = 5;
            }
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.RegisterReceiver, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "registerReceiverWithFeature";
        }
    }

    /* loaded from: classes3.dex */
    public static class SetActivityLocusContext extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return null;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setActivityLocusContext";
        }
    }

    /* loaded from: classes3.dex */
    static class SetPackageAskScreenCompat extends MethodProxy {
        SetPackageAskScreenCompat() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (objArr.length > 0 && (objArr[0] instanceof String)) {
                objArr[0] = MethodProxy.getHostPkg();
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setPackageAskScreenCompat";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    public static class SetPictureInPictureParams extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return null;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setPictureInPictureParams";
        }
    }

    /* loaded from: classes3.dex */
    static class SetServiceForeground extends MethodProxy {
        SetServiceForeground() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int index;
            IBinder iBinder = (IBinder) objArr[1];
            if (iBinder instanceof VServiceRuntime.ServiceRecord) {
                ComponentName componentName = ((VServiceRuntime.ServiceRecord) iBinder).proxyComponent;
                if (componentName != null) {
                    objArr[0] = componentName;
                }
                objArr[1] = Service.mToken.get(VServiceRuntime.getInstance().getShadowService());
                if (objArr.length == 6) {
                    objArr[5] = 0;
                }
                try {
                    if (!VirtualCore.get().isOutsideInstalled(VClient.get().getCurrentPackage()) && (index = MethodParameterUtils.getIndex(objArr, Notification.class)) >= 0) {
                        Notification notification = (Notification) objArr[index];
                        if (notification.getSmallIcon() != null) {
                            Reflect.on(notification).set("mSmallIcon", Icon.createWithResource(VirtualCore.get().getHostPkg(), R.drawable.ic_dialog_dialer));
                        }
                        if (notification.getLargeIcon() != null) {
                            Reflect.on(notification).set("mLargeIcon", Icon.createWithResource(VirtualCore.get().getHostPkg(), R.drawable.ic_dialog_dialer));
                        }
                    }
                } catch (Throwable th) {
                    VLog.e(VLog.TAG_DEFAULT, th);
                }
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setServiceForeground";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    public static class SetTaskDescription extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            Application currentApplication;
            Drawable loadIcon;
            ActivityManager.TaskDescription taskDescription = (ActivityManager.TaskDescription) objArr[1];
            String label = taskDescription.getLabel();
            Bitmap icon = taskDescription.getIcon();
            if ((label == null || icon == null) && (currentApplication = VClient.get().getCurrentApplication()) != null) {
                if (label == null) {
                    try {
                        label = currentApplication.getApplicationInfo().loadLabel(currentApplication.getPackageManager()).toString();
                    } catch (Throwable th) {
                        VLog.e(VLog.TAG_DEFAULT, th);
                    }
                }
                if (icon == null && (loadIcon = currentApplication.getApplicationInfo().loadIcon(currentApplication.getPackageManager())) != null) {
                    icon = DrawableUtils.drawableToBitMap(loadIcon);
                }
                taskDescription = new ActivityManager.TaskDescription(label, icon, taskDescription.getPrimaryColor());
            }
            TaskDescriptionDelegate taskDescriptionDelegate = VirtualCore.get().getTaskDescriptionDelegate();
            if (taskDescriptionDelegate != null) {
                taskDescription = taskDescriptionDelegate.getTaskDescription(taskDescription);
            }
            objArr[1] = taskDescription;
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setTaskDescription";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class ShouldUpRecreateTask extends MethodProxy {
        ShouldUpRecreateTask() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.FALSE;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "shouldUpRecreateTask";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    public static class StartActivities extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            IBinder iBinder;
            new Exception().printStackTrace();
            Intent[] intentArr = (Intent[]) ArrayUtils.getFirst(objArr, Intent[].class);
            String[] strArr = (String[]) ArrayUtils.getFirst(objArr, String[].class);
            int indexOfObject = ArrayUtils.indexOfObject(objArr, IBinder.class, 2);
            if (indexOfObject != -1) {
                iBinder = (IBinder) objArr[indexOfObject];
            } else {
                iBinder = null;
            }
            return Integer.valueOf(VActivityManager.get().startActivities(intentArr, strArr, iBinder, (Bundle) ArrayUtils.getFirst(objArr, Bundle.class), VClient.get().getCurrentPackage(), VUserHandle.myUserId()));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startActivities";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    public static class StartActivity extends MethodProxy {
        private static final String SCHEME_CONTENT = "content";
        private static final String SCHEME_FILE = "file";
        private static final String SCHEME_PACKAGE = "package";

        private boolean handleInstallRequest(Intent intent) {
            FileOutputStream fileOutputStream;
            VirtualCore.AppRequestListener appRequestListener = VirtualCore.get().getAppRequestListener();
            if (appRequestListener != null) {
                Uri data = intent.getData();
                if (SCHEME_FILE.equals(data.getScheme())) {
                    appRequestListener.onRequestInstall(NativeEngine.getRedirectedPath(new File(data.getPath()).getAbsolutePath()));
                    return true;
                }
                if ("content".equals(data.getScheme())) {
                    File file = new File(MethodProxy.getHostContext().getCacheDir(), data.getLastPathSegment());
                    InputStream inputStream = null;
                    try {
                        InputStream openInputStream = MethodProxy.getHostContext().getContentResolver().openInputStream(data);
                        try {
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = openInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileOutputStream.flush();
                                FileUtils.closeQuietly(openInputStream);
                            } catch (IOException e5) {
                                e = e5;
                                inputStream = openInputStream;
                                try {
                                    VLog.e(VLog.TAG_DEFAULT, e);
                                    FileUtils.closeQuietly(inputStream);
                                    FileUtils.closeQuietly(fileOutputStream);
                                    appRequestListener.onRequestInstall(file.getPath());
                                    return true;
                                } catch (Throwable th) {
                                    th = th;
                                    FileUtils.closeQuietly(inputStream);
                                    FileUtils.closeQuietly(fileOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = openInputStream;
                                FileUtils.closeQuietly(inputStream);
                                FileUtils.closeQuietly(fileOutputStream);
                                throw th;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            fileOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = null;
                        }
                    } catch (IOException e7) {
                        e = e7;
                        fileOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                    }
                    FileUtils.closeQuietly(fileOutputStream);
                    appRequestListener.onRequestInstall(file.getPath());
                    return true;
                }
            }
            return false;
        }

        private boolean handleUninstallRequest(Intent intent) {
            VirtualCore.AppRequestListener appRequestListener = VirtualCore.get().getAppRequestListener();
            if (appRequestListener != null) {
                Uri data = intent.getData();
                if ("package".equals(data.getScheme())) {
                    appRequestListener.onRequestUninstall(data.getSchemeSpecificPart());
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            IBinder iBinder;
            int i5;
            String str;
            String str2;
            boolean z4;
            int indexOfObject = ArrayUtils.indexOfObject(objArr, Intent.class, 1);
            if (indexOfObject < 0) {
                return Integer.valueOf(ActivityManagerCompat.START_INTENT_NOT_RESOLVED);
            }
            int indexOfObject2 = ArrayUtils.indexOfObject(objArr, IBinder.class, 2);
            String str3 = (String) objArr[indexOfObject + 1];
            Intent intent = new Intent((Intent) objArr[indexOfObject]);
            intent.setDataAndType(intent.getData(), str3);
            if (indexOfObject2 >= 0) {
                iBinder = (IBinder) objArr[indexOfObject2];
            } else {
                iBinder = null;
            }
            Bundle bundle = (Bundle) ArrayUtils.getFirst(objArr, Bundle.class);
            if (iBinder != null) {
                String str4 = (String) objArr[indexOfObject2 + 1];
                i5 = ((Integer) objArr[indexOfObject2 + 2]).intValue();
                str = str4;
            } else {
                i5 = 0;
                str = null;
            }
            int myUserId = VUserHandle.myUserId();
            String action = intent.getAction();
            if ("android.intent.action.MAIN".equals(action) && intent.hasCategory("android.intent.category.HOME")) {
                Intent onHandleLauncherIntent = MethodProxy.getConfig().onHandleLauncherIntent(intent);
                if (onHandleLauncherIntent != null) {
                    objArr[indexOfObject] = onHandleLauncherIntent;
                }
                return method.invoke(obj, objArr);
            }
            if (!"android.settings.APP_NOTIFICATION_SETTINGS".equals(action) && !"android.settings.CHANNEL_NOTIFICATION_SETTINGS".equals(action)) {
                if (MethodProxy.isHostIntent(intent)) {
                    return method.invoke(obj, objArr);
                }
                if (!"android.intent.action.INSTALL_PACKAGE".equals(action) && (!"android.intent.action.VIEW".equals(action) || !"application/vnd.android.package-archive".equals(intent.getType()))) {
                    if (("android.intent.action.UNINSTALL_PACKAGE".equals(action) || "android.intent.action.DELETE".equals(action)) && "package".equals(intent.getScheme()) && handleUninstallRequest(intent)) {
                        return 0;
                    }
                } else if (handleInstallRequest(intent)) {
                    if (iBinder != null && i5 > 0) {
                        VActivityManager.get().sendCancelActivityResult(iBinder, str, i5);
                    }
                    return 0;
                }
                String str5 = intent.getPackage();
                if (intent.getComponent() != null) {
                    str2 = intent.getComponent().getPackageName();
                } else {
                    str2 = "";
                }
                if (!TextUtils.isEmpty(str2) && isAppPkg(str2)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (str5 != null && !isAppPkg(str5) && !z4) {
                    if (BuildCompat.isR() && "android.content.pm.action.REQUEST_PERMISSIONS".equals(action)) {
                        objArr[indexOfObject - 2] = MethodProxy.getHostPkg();
                    }
                    return method.invoke(obj, objArr);
                }
                if (ChooserActivity.check(intent)) {
                    Intent processOutsideIntent = ComponentUtils.processOutsideIntent(myUserId, VirtualCore.get().isExtPackage(), new Intent(intent));
                    objArr[indexOfObject] = processOutsideIntent;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(Constants.EXTRA_USER_HANDLE, myUserId);
                    bundle2.putBundle(ChooserActivity.EXTRA_DATA, bundle);
                    bundle2.putString(ChooserActivity.EXTRA_WHO, str);
                    bundle2.putInt(ChooserActivity.EXTRA_REQUEST_CODE, i5);
                    BundleCompat.putBinder(bundle2, ChooserActivity.EXTRA_RESULTTO, iBinder);
                    processOutsideIntent.setComponent(new ComponentName(StubManifest.PACKAGE_NAME, ChooserActivity.class.getName()));
                    processOutsideIntent.setAction(null);
                    processOutsideIntent.putExtras(bundle2);
                    return method.invoke(obj, objArr);
                }
                objArr[indexOfObject - 1] = MethodProxy.getHostPkg();
                if (intent.getScheme() != null && intent.getScheme().equals("package") && intent.getData() != null && action != null && action.startsWith("android.settings.")) {
                    intent.setData(Uri.parse("package:" + MethodProxy.getHostPkg()));
                }
                ActivityInfo resolveActivityInfo = VirtualCore.get().resolveActivityInfo(intent, myUserId);
                if (resolveActivityInfo == null) {
                    VLog.e("VActivityManager", "Unable to resolve activityInfo : %s", intent);
                    if (intent.getPackage() != null && isAppPkg(intent.getPackage())) {
                        return 0;
                    }
                    objArr[indexOfObject] = ComponentUtils.processOutsideIntent(myUserId, VirtualCore.get().isExtPackage(), intent);
                    ResolveInfo resolveActivity = VirtualCore.get().getHostPackageManager().resolveActivity(intent, 0L);
                    if ((resolveActivity == null || resolveActivity.activityInfo == null) && intent.resolveActivityInfo(VirtualCore.getPM(), 0) != null) {
                        return method.invoke(obj, objArr);
                    }
                    if (!"android.intent.action.VIEW".equals(action) && !MethodProxy.getConfig().isOutsideAction(action) && (resolveActivity == null || !MethodProxy.isOutsidePackage(resolveActivity.activityInfo.packageName))) {
                        return Integer.valueOf(ActivityManagerCompat.START_INTENT_NOT_RESOLVED);
                    }
                    return method.invoke(obj, objArr);
                }
                if (VAppFix.isPreventStartActivity(resolveActivityInfo)) {
                    return 0;
                }
                String str6 = str;
                IBinder iBinder2 = iBinder;
                int startActivity = VActivityManager.get().startActivity(intent, resolveActivityInfo, iBinder, bundle, str, i5, VClient.get().getCurrentPackage(), VUserHandle.myUserId());
                if (startActivity != 0 && iBinder2 != null && i5 > 0) {
                    VActivityManager.get().sendCancelActivityResult(iBinder2, str6, i5);
                }
                return Integer.valueOf(startActivity);
            }
            Intent intent2 = (Intent) objArr[indexOfObject];
            if (BuildCompat.isOreo()) {
                intent2.putExtra("android.provider.extra.APP_PACKAGE", VirtualCore.get().getHostPkg());
            } else {
                intent2.putExtra("app_package", VirtualCore.get().getHostPkg());
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startActivity";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    public static class StartActivityAndWait extends StartActivity {
        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.StartActivity, com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.StartActivity, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startActivityAndWait";
        }
    }

    /* loaded from: classes3.dex */
    static class StartActivityAsCaller extends StartActivity {
        StartActivityAsCaller() {
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.StartActivity, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startActivityAsCaller";
        }
    }

    /* loaded from: classes3.dex */
    public static class StartActivityAsUser extends StartActivity {
        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.StartActivity, com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodProxy.replaceLastUserId(objArr);
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.StartActivity, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startActivityAsUser";
        }
    }

    /* loaded from: classes3.dex */
    public static class StartActivityIntentSender extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            char c5;
            char c6;
            char c7 = '\t';
            char c8 = '\b';
            char c9 = 7;
            char c10 = 6;
            char c11 = 5;
            if (BuildCompat.isOreo()) {
                c5 = 3;
                c8 = '\t';
                c7 = '\n';
                c6 = 5;
                c11 = 6;
                c10 = 7;
                c9 = '\b';
            } else {
                c5 = 2;
                c6 = 4;
            }
            Intent intent = (Intent) objArr[c5];
            IBinder iBinder = (IBinder) objArr[c6];
            ((Integer) objArr[c10]).intValue();
            Bundle bundle = (Bundle) objArr[c7];
            ((Integer) objArr[c9]).intValue();
            ((Integer) objArr[c8]).intValue();
            if (intent == null) {
                intent = new Intent();
                objArr[c5] = intent;
            }
            ComponentUtils.parcelActivityIntentSender(intent, iBinder, bundle);
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startActivityIntentSender";
        }
    }

    /* loaded from: classes3.dex */
    public static class StartActivityWithConfig extends StartActivity {
        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.StartActivity, com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.StartActivity, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startActivityWithConfig";
        }
    }

    /* loaded from: classes3.dex */
    static class StartNextMatchingActivity extends StartActivity {
        StartNextMatchingActivity() {
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.StartActivity, com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.FALSE;
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.StartActivity, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startNextMatchingActivity";
        }
    }

    /* loaded from: classes3.dex */
    static class StartService extends MethodProxy {
        StartService() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int myUserId;
            Intent intent = new Intent((Intent) objArr[1]);
            String str = (String) objArr[2];
            ComponentName component = intent.getComponent();
            if (component != null && isHostPkg(component.getPackageName())) {
                return method.invoke(obj, objArr);
            }
            if (MethodProxy.isServerProcess()) {
                myUserId = intent.getIntExtra("_VA_|_user_id_", -1);
            } else {
                myUserId = VUserHandle.myUserId();
            }
            if (myUserId == -1) {
                return method.invoke(obj, objArr);
            }
            intent.setDataAndType(intent.getData(), str);
            ServiceInfo resolveServiceInfo = VirtualCore.get().resolveServiceInfo(intent, myUserId);
            if (resolveServiceInfo != null) {
                if (Build.VERSION.SDK_INT >= 26 && objArr.length >= 6 && (objArr[3] instanceof Boolean)) {
                    objArr[3] = Boolean.FALSE;
                }
                ClientConfig initProcess = VActivityManager.get().initProcess(resolveServiceInfo.packageName, resolveServiceInfo.processName, myUserId);
                if (initProcess == null) {
                    VLog.e("ActivityManager", "failed to initProcess for startService: " + component);
                    return null;
                }
                objArr[1] = IntentBuilder.createStartProxyServiceIntent(initProcess.vpid, initProcess.isExt, resolveServiceInfo, intent, myUserId);
                MethodProxy.replaceLastUserId(objArr);
                if (((ComponentName) method.invoke(obj, objArr)) == null) {
                    return null;
                }
                return new ComponentName(resolveServiceInfo.packageName, resolveServiceInfo.name);
            }
            if ((component == null || !MethodProxy.isOutsidePackage(component.getPackageName())) && intent.getPackage() != null && !MethodProxy.isOutsidePackage(intent.getPackage())) {
                VLog.e("VActivityManager", "Block StartService: " + intent);
                return null;
            }
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startService";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess() || MethodProxy.isServerProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class StartVoiceActivity extends StartActivity {
        StartVoiceActivity() {
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.StartActivity, com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.proxies.am.MethodProxies.StartActivity, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startVoiceActivity";
        }
    }

    /* loaded from: classes3.dex */
    static class StopService extends MethodProxy {
        StopService() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int myUserId;
            Intent intent = new Intent((Intent) objArr[1]);
            intent.setDataAndType(intent.getData(), (String) objArr[2]);
            ComponentName component = intent.getComponent();
            if (component != null && isHostPkg(component.getPackageName())) {
                return method.invoke(obj, objArr);
            }
            if (MethodProxy.isServerProcess()) {
                myUserId = intent.getIntExtra("_VA_|_user_id_", -1);
            } else {
                myUserId = VUserHandle.myUserId();
            }
            int i5 = myUserId;
            if (i5 != -1) {
                ServiceInfo resolveServiceInfo = VirtualCore.get().resolveServiceInfo(intent, i5);
                if (resolveServiceInfo != null && isAppPkg(resolveServiceInfo.packageName)) {
                    ClientConfig processConfig = VActivityManager.get().getProcessConfig(resolveServiceInfo.packageName, resolveServiceInfo.processName, i5);
                    if (processConfig == null) {
                        VLog.e("ActivityManager", "failed to initProcess for stopService: " + component);
                        return 0;
                    }
                    if (component == null) {
                        component = new ComponentName(resolveServiceInfo.packageName, resolveServiceInfo.name);
                    }
                    MethodProxy.getHostContext().startService(IntentBuilder.createStopProxyServiceIntent(processConfig.vpid, processConfig.isExt, component, i5, -1, null));
                    return 1;
                }
                if (component == null || !MethodProxy.isOutsidePackage(component.getPackageName())) {
                    return 0;
                }
                MethodProxy.replaceLastUserId(objArr);
                return method.invoke(obj, objArr);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "stopService";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess() || MethodProxy.isServerProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class StopServiceToken extends MethodProxy {
        StopServiceToken() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ComponentName componentName = (ComponentName) objArr[0];
            IBinder iBinder = (IBinder) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            int myUserId = VUserHandle.myUserId();
            ServiceInfo serviceInfo = VPackageManager.get().getServiceInfo(componentName, 0, myUserId);
            if (serviceInfo != null) {
                ClientConfig initProcess = VActivityManager.get().initProcess(serviceInfo.packageName, serviceInfo.processName, myUserId);
                if (initProcess == null) {
                    VLog.e("ActivityManager", "failed to initProcess for stopServiceToken");
                    return Boolean.FALSE;
                }
                MethodProxy.getHostContext().startService(IntentBuilder.createStopProxyServiceIntent(initProcess.vpid, initProcess.isExt, componentName, myUserId, intValue, iBinder));
                return Boolean.TRUE;
            }
            if (MethodProxy.isOutsidePackage(componentName.getPackageName())) {
                return method.invoke(obj, objArr);
            }
            return Boolean.FALSE;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "stopServiceToken";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class UnbindService extends MethodProxy {
        UnbindService() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ServiceConnectionProxy removeProxy = ServiceConnectionProxy.removeProxy((IServiceConnection) objArr[0]);
            if (removeProxy != null) {
                objArr[0] = removeProxy;
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "unbindService";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess() || MethodProxy.isServerProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class UnstableProviderDied extends MethodProxy {
        UnstableProviderDied() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (objArr[0] == null) {
                return 0;
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "unstableProviderDied";
        }
    }

    /* loaded from: classes3.dex */
    static class UpdateDeviceOwner extends MethodProxy {
        UpdateDeviceOwner() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "updateDeviceOwner";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class UpdateServiceGroup extends MethodProxy {
        UpdateServiceGroup() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return null;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "updateServiceGroup";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return VirtualCore.get().isVAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class isUserRunning extends MethodProxy {
        isUserRunning() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) {
            int intValue = ((Integer) objArr[0]).intValue();
            Iterator<VUserInfo> it = VUserManager.get().getUsers().iterator();
            while (it.hasNext()) {
                if (it.next().id == intValue) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "isUserRunning";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class RegisterReceiver extends MethodProxy {
        int IDX_IIntentReceiver = 2;
        int IDX_IntentFilter = 3;
        int IDX_RequiredPermission = 4;
        private WeakHashMap<IBinder, IIntentReceiver> mProxyIIntentReceivers = new WeakHashMap<>();

        RegisterReceiver() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            final IBinder asBinder;
            WeakReference weakReference;
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            MethodProxy.replaceFirstUserId(objArr);
            objArr[this.IDX_RequiredPermission] = null;
            IntentFilter intentFilter = (IntentFilter) objArr[this.IDX_IntentFilter];
            if (Build.VERSION.SDK_INT >= 33 && objArr.length == 9) {
                Object obj2 = objArr[8];
                if (obj2 instanceof Integer) {
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 2) == 0 && (intValue & 4) == 0) {
                        intValue |= 2;
                    }
                    objArr[8] = Integer.valueOf(intValue);
                }
            }
            if (intentFilter == null) {
                return method.invoke(obj, objArr);
            }
            IntentFilter intentFilter2 = new IntentFilter(intentFilter);
            if (intentFilter2.hasCategory("__VA__|_static_receiver_")) {
                mirror.android.content.IntentFilter.mCategories.get(intentFilter2).remove("__VA__|_static_receiver_");
                return method.invoke(obj, objArr);
            }
            SpecialComponentList.protectIntentFilter(intentFilter2);
            objArr[this.IDX_IntentFilter] = intentFilter2;
            int length = objArr.length;
            int i5 = this.IDX_IIntentReceiver;
            if (length > i5) {
                Object obj3 = objArr[i5];
                if (obj3 instanceof IIntentReceiver) {
                    IInterface iInterface = (IInterface) obj3;
                    if (!(iInterface instanceof IIntentReceiverProxy) && (asBinder = iInterface.asBinder()) != null) {
                        asBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.lody.virtual.client.hook.proxies.am.MethodProxies.RegisterReceiver.1
                            @Override // android.os.IBinder.DeathRecipient
                            public void binderDied() {
                                asBinder.unlinkToDeath(this, 0);
                                RegisterReceiver.this.mProxyIIntentReceivers.remove(asBinder);
                            }
                        }, 0);
                        IIntentReceiver iIntentReceiver = this.mProxyIIntentReceivers.get(asBinder);
                        if (iIntentReceiver == null) {
                            iIntentReceiver = new IIntentReceiverProxy(iInterface, intentFilter2);
                            this.mProxyIIntentReceivers.put(asBinder, iIntentReceiver);
                        }
                        RefObject<WeakReference> refObject = LoadedApk.ReceiverDispatcher.InnerReceiver.mDispatcher;
                        if (refObject != null && (weakReference = refObject.get(iInterface)) != null) {
                            LoadedApk.ReceiverDispatcher.mIIntentReceiver.set(weakReference.get(), iIntentReceiver);
                            objArr[this.IDX_IIntentReceiver] = iIntentReceiver;
                        }
                    }
                }
            }
            Intent intent = (Intent) method.invoke(obj, objArr);
            if (intent != null) {
                return SpecialComponentList.unprotectIntent(VUserHandle.myUserId(), intent);
            }
            return intent;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "registerReceiver";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }

        /* loaded from: classes3.dex */
        private static class IIntentReceiverProxy extends IIntentReceiver.Stub {
            IntentFilter mFilter;
            IInterface mOld;

            IIntentReceiverProxy(IInterface iInterface, IntentFilter intentFilter) {
                this.mOld = iInterface;
                this.mFilter = intentFilter;
            }

            @Override // android.content.IIntentReceiver
            public void performReceive(Intent intent, int i5, String str, Bundle bundle, boolean z4, boolean z5, int i6) {
                try {
                    Intent unprotectIntent = SpecialComponentList.unprotectIntent(VUserHandle.myUserId(), intent);
                    if (BuildCompat.isUpsideDownCake()) {
                        z4 = true;
                    }
                    IIntentReceiverJB.performReceive.call(this.mOld, unprotectIntent, Integer.valueOf(i5), str, bundle, Boolean.valueOf(z4), Boolean.valueOf(z5), Integer.valueOf(i6));
                } catch (Throwable th) {
                    VLog.e(VLog.TAG_DEFAULT, th);
                }
            }

            public void performReceive(Intent intent, int i5, String str, Bundle bundle, boolean z4, boolean z5) {
                performReceive(intent, i5, str, bundle, z4, z5, 0);
            }
        }
    }
}
