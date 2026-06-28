package com.lody.virtual.client.hook.proxies.pm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.IPackageDataObserver;
import android.content.pm.IPackageDeleteObserver2;
import android.content.pm.IPackageInstallerCallback;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.fixer.ComponentFixer;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.client.ipc.VPackageManager;
import com.lody.virtual.helper.compat.ParceledListSliceCompat;
import com.lody.virtual.helper.utils.ArrayUtils;
import com.lody.virtual.helper.utils.FileUtils;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.oem.ApiWhiteList;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.server.IPackageInstaller;
import com.lody.virtual.server.pm.installer.SessionInfo;
import com.lody.virtual.server.pm.installer.SessionParams;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mirror.android.content.pm.ParceledListSlice;

/* loaded from: classes3.dex */
class MethodProxies {
    private static final int MATCH_ANY_USER = 4194304;
    private static final int MATCH_FACTORY_ONLY = 2097152;

    /* loaded from: classes3.dex */
    static class ActivitySupportsIntent extends MethodProxy {
        ActivitySupportsIntent() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.valueOf(VPackageManager.get().activitySupportsIntent((ComponentName) objArr[0], (Intent) objArr[1], (String) objArr[2]));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "activitySupportsIntent";
        }
    }

    /* loaded from: classes3.dex */
    static class AddPackageToPreferred extends MethodProxy {
        AddPackageToPreferred() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "addPackageToPreferred";
        }
    }

    /* loaded from: classes3.dex */
    static class CanForwardTo extends MethodProxy {
        CanForwardTo() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            boolean z4;
            if (((Integer) objArr[2]).intValue() == ((Integer) objArr[3]).intValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "canForwardTo";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class CanRequestPackageInstalls extends MethodProxy {
        CanRequestPackageInstalls() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (VirtualCore.get().getAppCallback() != null) {
                return Boolean.TRUE;
            }
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            MethodProxy.replaceLastUserId(objArr);
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "canRequestPackageInstalls";
        }
    }

    /* loaded from: classes3.dex */
    static class CheckPackageStartable extends MethodProxy {
        CheckPackageStartable() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (isAppPkg((String) objArr[0])) {
                return 0;
            }
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "checkPackageStartable";
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
        public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
            return super.afterCall(obj, method, objArr, obj2);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Integer.valueOf(VPackageManager.get().checkPermission((String) objArr[0], (String) objArr[1], VUserHandle.myUserId()));
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

    @SuppressLint({"PackageManagerGetSignatures"})
    /* loaded from: classes3.dex */
    static class CheckSignatures extends MethodProxy {
        CheckSignatures() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (objArr.length == 2) {
                Object obj2 = objArr[0];
                if (obj2 instanceof String) {
                    Object obj3 = objArr[1];
                    if (obj3 instanceof String) {
                        String str = (String) obj2;
                        String str2 = (String) obj3;
                        if (TextUtils.equals(str, str2)) {
                            return 0;
                        }
                        return Integer.valueOf(VPackageManager.get().checkSignatures(str, str2));
                    }
                }
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "checkSignatures";
        }
    }

    /* loaded from: classes3.dex */
    static class ClearPackagePersistentPreferredActivities extends MethodProxy {
        ClearPackagePersistentPreferredActivities() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "clearPackagePersistentPreferredActivities";
        }
    }

    /* loaded from: classes3.dex */
    static class ClearPackagePreferredActivities extends MethodProxy {
        ClearPackagePreferredActivities() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "clearPackagePreferredActivities";
        }
    }

    /* loaded from: classes3.dex */
    static class DeleteApplicationCacheFiles extends MethodProxy {
        DeleteApplicationCacheFiles() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ApplicationInfo applicationInfo;
            String str = (String) objArr[0];
            IPackageDataObserver iPackageDataObserver = (IPackageDataObserver) objArr[1];
            if (str.equals(MethodProxy.getAppPkg()) && (applicationInfo = VPackageManager.get().getApplicationInfo(str, 0, MethodProxy.getAppUserId())) != null) {
                File file = new File(applicationInfo.dataDir);
                FileUtils.deleteDir(file);
                file.mkdirs();
                File file2 = new File(applicationInfo.deviceProtectedDataDir);
                FileUtils.deleteDir(file2);
                file2.mkdirs();
                if (iPackageDataObserver != null) {
                    iPackageDataObserver.onRemoveCompleted(str, true);
                }
                return 0;
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "deleteApplicationCacheFiles";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class DeletePackage extends MethodProxy {
        DeletePackage() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            try {
                VirtualCore.get().uninstallPackage(str);
                IPackageDeleteObserver2 iPackageDeleteObserver2 = (IPackageDeleteObserver2) objArr[1];
                if (iPackageDeleteObserver2 != null) {
                    iPackageDeleteObserver2.onPackageDeleted(str, 0, "done.");
                }
            } catch (Throwable unused) {
            }
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "deletePackage";
        }
    }

    /* loaded from: classes3.dex */
    static class FreeStorage extends MethodProxy {
        FreeStorage() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            IntentSender intentSender = (IntentSender) ArrayUtils.getFirst(objArr, IntentSender.class);
            if (intentSender != null) {
                intentSender.sendIntent(MethodProxy.getHostContext(), 0, null, null, null);
            }
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "freeStorage";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class FreeStorageAndNotify extends MethodProxy {
        FreeStorageAndNotify() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            IPackageDataObserver iPackageDataObserver = (IPackageDataObserver) objArr[objArr.length - 1];
            if (iPackageDataObserver != null) {
                iPackageDataObserver.onRemoveCompleted(MethodProxy.getAppPkg(), true);
            }
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "freeStorageAndNotify";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetActivityInfo extends MethodProxy {
        GetActivityInfo() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ComponentName componentName = (ComponentName) objArr[0];
            if (MethodProxy.getHostPkg().equals(componentName.getPackageName())) {
                return method.invoke(obj, objArr);
            }
            int myUserId = VUserHandle.myUserId();
            ActivityInfo activityInfo = VPackageManager.get().getActivityInfo(componentName, (int) getIntOrLongValue(objArr[1]), myUserId);
            if (activityInfo == null) {
                MethodProxy.replaceLastUserId(objArr);
                activityInfo = (ActivityInfo) method.invoke(obj, objArr);
                if (activityInfo != null && MethodProxy.isOutsidePackage(activityInfo.packageName)) {
                    ComponentFixer.fixOutsideComponentInfo(activityInfo);
                } else {
                    return null;
                }
            }
            return activityInfo;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getActivityInfo";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetApplicationBlockedSettingAsUser extends MethodProxy {
        GetApplicationBlockedSettingAsUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getApplicationBlockedSettingAsUser";
        }
    }

    /* loaded from: classes3.dex */
    static class GetApplicationEnabledSetting extends MethodProxy {
        GetApplicationEnabledSetting() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            if (isAppPkg(str)) {
                return 1;
            }
            if (MethodProxy.isOutsidePackage(str)) {
                objArr[1] = 0;
                return method.invoke(obj, objArr);
            }
            return 2;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getApplicationEnabledSetting";
        }
    }

    /* loaded from: classes3.dex */
    static class GetApplicationInfo extends MethodProxy {
        GetApplicationInfo() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            int intOrLongValue = (int) getIntOrLongValue(objArr[1]);
            int myUserId = VUserHandle.myUserId();
            if (str.equals("com.android.defcontainer")) {
                return VPackageManager.get().getApplicationInfo("com.android.providers.downloads", intOrLongValue, myUserId);
            }
            if (MethodProxy.getHostPkg().equals(str)) {
                MethodProxy.replaceLastUserId(objArr);
                return method.invoke(obj, objArr);
            }
            ApplicationInfo applicationInfo = VPackageManager.get().getApplicationInfo(str, intOrLongValue, myUserId);
            if (applicationInfo != null) {
                if (VClient.get().getCurrentPackage().equals("com.huawei.hwid")) {
                    applicationInfo.uid = VUserHandle.getUid(myUserId, applicationInfo.uid);
                }
                return applicationInfo;
            }
            MethodProxy.replaceLastUserId(objArr);
            ApplicationInfo applicationInfo2 = (ApplicationInfo) method.invoke(obj, objArr);
            if (applicationInfo2 != null && MethodProxy.isOutsidePackage(applicationInfo2.packageName)) {
                ComponentFixer.fixOutsideApplicationInfo(applicationInfo2);
                return applicationInfo2;
            }
            return null;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getApplicationInfo";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetComponentEnabledSetting extends MethodProxy {
        GetComponentEnabledSetting() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Integer.valueOf(VPackageManager.get().getComponentEnabledSetting((ComponentName) objArr[0], MethodProxy.getAppUserId()));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getComponentEnabledSetting";
        }
    }

    /* loaded from: classes3.dex */
    static class GetInstalledApplications extends MethodProxy {
        GetInstalledApplications() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            boolean isReturnParceledListSlice = ParceledListSliceCompat.isReturnParceledListSlice(method);
            List<ApplicationInfo> installedApplications = VPackageManager.get().getInstalledApplications((int) getIntOrLongValue(objArr[0]), VUserHandle.myUserId());
            Object invoke = method.invoke(obj, objArr);
            if (isReturnParceledListSlice) {
                invoke = ParceledListSlice.getList.call(invoke, new Object[0]);
            }
            List list = (List) invoke;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ApplicationInfo applicationInfo = (ApplicationInfo) it.next();
                if (VirtualCore.get().isAppInstalled(applicationInfo.packageName) || !MethodProxy.isOutsidePackage(applicationInfo.packageName)) {
                    it.remove();
                }
                ComponentFixer.fixOutsideApplicationInfo(applicationInfo);
            }
            installedApplications.addAll(list);
            if (isReturnParceledListSlice) {
                return ParceledListSliceCompat.create(installedApplications);
            }
            return installedApplications;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getInstalledApplications";
        }
    }

    /* loaded from: classes3.dex */
    static class GetInstalledPackages extends MethodProxy {
        GetInstalledPackages() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            boolean isReturnParceledListSlice = ParceledListSliceCompat.isReturnParceledListSlice(method);
            List<PackageInfo> installedPackages = VPackageManager.get().getInstalledPackages((int) getIntOrLongValue(objArr[0]), VUserHandle.myUserId());
            MethodProxy.replaceLastUserId(objArr);
            Object invoke = method.invoke(obj, objArr);
            if (isReturnParceledListSlice) {
                invoke = ParceledListSlice.getList.call(invoke, new Object[0]);
            }
            List list = (List) invoke;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PackageInfo packageInfo = (PackageInfo) it.next();
                if (VirtualCore.get().isAppInstalled(packageInfo.packageName) || !MethodProxy.isOutsidePackage(packageInfo.packageName)) {
                    it.remove();
                }
                ComponentFixer.fixOutsideApplicationInfo(packageInfo.applicationInfo);
            }
            installedPackages.addAll(list);
            if (ParceledListSliceCompat.isReturnParceledListSlice(method)) {
                return ParceledListSliceCompat.create(installedPackages);
            }
            return installedPackages;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getInstalledPackages";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetInstallerPackageName extends MethodProxy {
        GetInstallerPackageName() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return GmsSupport.VENDING_PKG;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getInstallerPackageName";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetPackageGids extends MethodProxy {
        GetPackageGids() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPackageGids";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetPackageGidsEtc extends GetPackageGids {
        GetPackageGidsEtc() {
        }

        @Override // com.lody.virtual.client.hook.proxies.pm.MethodProxies.GetPackageGids, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return super.getMethodName() + "Etc";
        }
    }

    /* loaded from: classes3.dex */
    static final class GetPackageInfo extends MethodProxy {
        GetPackageInfo() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            int intOrLongValue = (int) getIntOrLongValue(objArr[1]);
            int myUserId = VUserHandle.myUserId();
            if ((4194304 & intOrLongValue) != 0) {
                intOrLongValue &= -4194305;
                objArr[1] = Integer.valueOf(intOrLongValue);
            }
            if ((2097152 & intOrLongValue) != 0) {
                MethodProxy.replaceLastUserId(objArr);
                return method.invoke(obj, objArr);
            }
            PackageInfo packageInfo = VPackageManager.get().getPackageInfo(str, intOrLongValue, myUserId);
            if (packageInfo != null) {
                return packageInfo;
            }
            MethodProxy.replaceLastUserId(objArr);
            PackageInfo packageInfo2 = (PackageInfo) method.invoke(obj, objArr);
            if (packageInfo2 != null && MethodProxy.isOutsidePackage(packageInfo2.packageName)) {
                ComponentFixer.fixOutsideApplicationInfo(packageInfo2.applicationInfo);
                return packageInfo2;
            }
            return null;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPackageInfo";
        }
    }

    /* loaded from: classes3.dex */
    static class GetPackageInstaller extends MethodProxy {
        GetPackageInstaller() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            IInterface iInterface = (IInterface) method.invoke(obj, objArr);
            final IPackageInstaller packageInstaller = VPackageManager.get().getPackageInstaller();
            return Proxy.newProxyInstance(iInterface.getClass().getClassLoader(), iInterface.getClass().getInterfaces(), new InvocationHandler() { // from class: com.lody.virtual.client.hook.proxies.pm.MethodProxies.GetPackageInstaller.1
                @TargetApi(21)
                private Object createSession(Object obj2, Method method2, Object[] objArr2) throws RemoteException {
                    return Integer.valueOf(packageInstaller.createSession(SessionParams.create((PackageInstaller.SessionParams) objArr2[0]), (String) objArr2[1], VUserHandle.myUserId()));
                }

                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj2, Method method2, Object[] objArr2) throws Throwable {
                    VLog.e("PackageInstaller", "call " + method2.getName() + " -> " + Arrays.toString(objArr2));
                    String name = method2.getName();
                    name.hashCode();
                    char c5 = 65535;
                    switch (name.hashCode()) {
                        case -1776922004:
                            if (name.equals("toString")) {
                                c5 = 0;
                                break;
                            }
                            break;
                        case -663066834:
                            if (name.equals("getSessionInfo")) {
                                c5 = 1;
                                break;
                            }
                            break;
                        case -652885011:
                            if (name.equals("updateSessionAppIcon")) {
                                c5 = 2;
                                break;
                            }
                            break;
                        case -403218424:
                            if (name.equals("registerCallback")) {
                                c5 = 3;
                                break;
                            }
                            break;
                        case -298116903:
                            if (name.equals("getStagedSessions")) {
                                c5 = 4;
                                break;
                            }
                            break;
                        case -93516191:
                            if (name.equals("abandonSession")) {
                                c5 = 5;
                                break;
                            }
                            break;
                        case -63461894:
                            if (name.equals("createSession")) {
                                c5 = 6;
                                break;
                            }
                            break;
                        case 938656808:
                            if (name.equals("getAllSessions")) {
                                c5 = 7;
                                break;
                            }
                            break;
                        case 1170196863:
                            if (name.equals("setPermissionsResult")) {
                                c5 = '\b';
                                break;
                            }
                            break;
                        case 1238099456:
                            if (name.equals("updateSessionAppLabel")) {
                                c5 = '\t';
                                break;
                            }
                            break;
                        case 1568181855:
                            if (name.equals("getMySessions")) {
                                c5 = '\n';
                                break;
                            }
                            break;
                        case 1738611873:
                            if (name.equals("unregisterCallback")) {
                                c5 = 11;
                                break;
                            }
                            break;
                        case 1788161260:
                            if (name.equals("openSession")) {
                                c5 = '\f';
                                break;
                            }
                            break;
                    }
                    switch (c5) {
                        case 0:
                            return "PackageInstaller";
                        case 1:
                            SessionInfo sessionInfo = packageInstaller.getSessionInfo(((Integer) objArr2[0]).intValue());
                            if (sessionInfo != null) {
                                return sessionInfo.alloc();
                            }
                            return null;
                        case 2:
                            packageInstaller.updateSessionAppIcon(((Integer) objArr2[0]).intValue(), (Bitmap) objArr2[1]);
                            return 0;
                        case 3:
                            packageInstaller.registerCallback((IPackageInstallerCallback) objArr2[0], VUserHandle.myUserId());
                            return 0;
                        case 4:
                            return ParceledListSliceCompat.create(Collections.EMPTY_LIST);
                        case 5:
                            packageInstaller.abandonSession(((Integer) objArr2[0]).intValue());
                            return 0;
                        case 6:
                            return createSession(obj2, method2, objArr2);
                        case 7:
                            List list = packageInstaller.getAllSessions(((Integer) objArr2[0]).intValue()).getList();
                            ArrayList arrayList = new ArrayList(list.size());
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((SessionInfo) it.next()).alloc());
                            }
                            return ParceledListSliceCompat.create(arrayList);
                        case '\b':
                            packageInstaller.setPermissionsResult(((Integer) objArr2[0]).intValue(), ((Boolean) objArr2[1]).booleanValue());
                            return 0;
                        case '\t':
                            packageInstaller.updateSessionAppLabel(((Integer) objArr2[0]).intValue(), (String) objArr2[1]);
                            return 0;
                        case '\n':
                            List list2 = packageInstaller.getMySessions((String) objArr2[0], ((Integer) objArr2[1]).intValue()).getList();
                            ArrayList arrayList2 = new ArrayList(list2.size());
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((SessionInfo) it2.next()).alloc());
                            }
                            return ParceledListSliceCompat.create(arrayList2);
                        case 11:
                            packageInstaller.unregisterCallback((IPackageInstallerCallback) objArr2[0]);
                            return 0;
                        case '\f':
                            return packageInstaller.openSession(((Integer) objArr2[0]).intValue());
                        default:
                            VLog.printStackTrace("PackageInstaller");
                            throw new RuntimeException("Not support PackageInstaller method : " + method2.getName());
                    }
                }
            });
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPackageInstaller";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetPackageUid extends MethodProxy {
        GetPackageUid() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            MethodProxy.replaceLastUserId(objArr);
            if (!isAppPkg(str) && !MethodProxy.isOutsidePackage(str)) {
                return -1;
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPackageUid";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetPackageUidEtc extends GetPackageUid {
        GetPackageUidEtc() {
        }

        @Override // com.lody.virtual.client.hook.proxies.pm.MethodProxies.GetPackageUid, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return super.getMethodName() + "Etc";
        }
    }

    /* loaded from: classes3.dex */
    static class GetPackagesForUid extends MethodProxy {
        GetPackagesForUid() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (VClient.get().getClientConfig() == null) {
                return method.invoke(obj, objArr);
            }
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == VEnvironment.SYSTEM_UID) {
                return method.invoke(obj, objArr);
            }
            if (intValue == MethodProxy.getRealUid()) {
                intValue = VClient.get().getVUid();
            }
            String[] packagesForUid = VPackageManager.get().getPackagesForUid(intValue);
            if (packagesForUid == null) {
                return null;
            }
            if (ApiWhiteList.ALLOW_GET_ALL_PKGS_BY_UID.contains(VClient.get().getCurrentPackage())) {
                List<PackageInfo> installedPackages = VPackageManager.get().getInstalledPackages(0, VUserHandle.myUserId());
                ArrayList arrayList = new ArrayList();
                Iterator<PackageInfo> it = installedPackages.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().packageName);
                }
                return arrayList.toArray(new String[installedPackages.size()]);
            }
            return packagesForUid;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPackagesForUid";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    @TargetApi(17)
    /* loaded from: classes3.dex */
    static class GetPermissionFlags extends MethodProxy {
        GetPermissionFlags() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            ((Integer) objArr[2]).intValue();
            if (VPackageManager.get().getPermissionInfo(str, 0) != null) {
                return 0;
            }
            objArr[2] = Integer.valueOf(MethodProxy.getRealUserId());
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPermissionFlags";
        }
    }

    /* loaded from: classes3.dex */
    static class GetPermissionGroupInfo extends MethodProxy {
        GetPermissionGroupInfo() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            PermissionGroupInfo permissionGroupInfo = VPackageManager.get().getPermissionGroupInfo((String) objArr[0], (int) getIntOrLongValue(objArr[1]));
            if (permissionGroupInfo != null) {
                return permissionGroupInfo;
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPermissionGroupInfo";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetPermissionInfo extends MethodProxy {
        GetPermissionInfo() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            PermissionInfo permissionInfo = VPackageManager.get().getPermissionInfo((String) objArr[0], ((Integer) objArr[objArr.length - 1]).intValue());
            if (permissionInfo != null) {
                return permissionInfo;
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPermissionInfo";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetPermissions extends MethodProxy {
        GetPermissions() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPermissions";
        }
    }

    /* loaded from: classes3.dex */
    static class GetPersistentApplications extends MethodProxy {
        GetPersistentApplications() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (ParceledListSliceCompat.isReturnParceledListSlice(method)) {
                return ParceledListSliceCompat.create(new ArrayList(0));
            }
            return new ArrayList(0);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPersistentApplications";
        }
    }

    /* loaded from: classes3.dex */
    static class GetPreferredActivities extends MethodProxy {
        GetPreferredActivities() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceLastAppPkg(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPreferredActivities";
        }
    }

    /* loaded from: classes3.dex */
    static class GetProviderInfo extends MethodProxy {
        GetProviderInfo() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ComponentName componentName = (ComponentName) objArr[0];
            int intOrLongValue = (int) getIntOrLongValue(objArr[1]);
            if (MethodProxy.getHostPkg().equals(componentName.getPackageName())) {
                MethodProxy.replaceLastUserId(objArr);
                return method.invoke(obj, objArr);
            }
            ProviderInfo providerInfo = VPackageManager.get().getProviderInfo(componentName, intOrLongValue, VUserHandle.myUserId());
            if (providerInfo == null) {
                MethodProxy.replaceLastUserId(objArr);
                providerInfo = (ProviderInfo) method.invoke(obj, objArr);
                if (providerInfo != null && MethodProxy.isOutsidePackage(providerInfo.packageName)) {
                    ComponentFixer.fixOutsideComponentInfo(providerInfo);
                } else {
                    return null;
                }
            }
            return providerInfo;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getProviderInfo";
        }
    }

    /* loaded from: classes3.dex */
    static class GetReceiverInfo extends MethodProxy {
        GetReceiverInfo() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ComponentName componentName = (ComponentName) objArr[0];
            if (MethodProxy.getHostPkg().equals(componentName.getPackageName())) {
                return method.invoke(obj, objArr);
            }
            ActivityInfo receiverInfo = VPackageManager.get().getReceiverInfo(componentName, (int) getIntOrLongValue(objArr[1]), 0);
            if (receiverInfo == null) {
                MethodProxy.replaceLastUserId(objArr);
                receiverInfo = (ActivityInfo) method.invoke(obj, objArr);
                if (receiverInfo != null && MethodProxy.isOutsidePackage(receiverInfo.packageName)) {
                    ComponentFixer.fixOutsideComponentInfo(receiverInfo);
                } else {
                    return null;
                }
            }
            return receiverInfo;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getReceiverInfo";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetServiceInfo extends MethodProxy {
        GetServiceInfo() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ServiceInfo serviceInfo = VPackageManager.get().getServiceInfo((ComponentName) objArr[0], (int) getIntOrLongValue(objArr[1]), VUserHandle.myUserId());
            if (serviceInfo != null) {
                return serviceInfo;
            }
            MethodProxy.replaceLastUserId(objArr);
            ServiceInfo serviceInfo2 = (ServiceInfo) method.invoke(obj, objArr);
            if (serviceInfo2 != null && MethodProxy.isOutsidePackage(serviceInfo2.packageName)) {
                ComponentFixer.fixOutsideComponentInfo(serviceInfo2);
                return serviceInfo2;
            }
            return null;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getServiceInfo";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetSharedLibraries extends MethodProxy {
        GetSharedLibraries() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int intOrLongValue = (int) getIntOrLongValue(objArr[1]);
            if ((4194304 & intOrLongValue) != 0) {
                objArr[1] = Integer.valueOf(intOrLongValue & (-4194305));
            }
            objArr[0] = MethodProxy.getHostPkg();
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getSharedLibraries";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class GetUidForSharedUser extends MethodProxy {
        GetUidForSharedUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Integer.valueOf(VirtualCore.get().getUidForSharedUser((String) objArr[0]));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getUidForSharedUser";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class IsPackageAvailable extends MethodProxy {
        IsPackageAvailable() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (isAppPkg((String) objArr[0])) {
                return Boolean.TRUE;
            }
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "isPackageAvailable";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class IsPackageForzen extends MethodProxy {
        IsPackageForzen() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.FALSE;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "isPackageForzen";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class QueryContentProviders extends MethodProxy {
        QueryContentProviders() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            boolean isReturnParceledListSlice = ParceledListSliceCompat.isReturnParceledListSlice(method);
            String str = (String) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            getIntOrLongValue(objArr[2]);
            List<ProviderInfo> queryContentProviders = VPackageManager.get().queryContentProviders(str, intValue, 0);
            Object invoke = method.invoke(obj, objArr);
            if (invoke != null) {
                if (isReturnParceledListSlice) {
                    invoke = ParceledListSlice.getList.call(invoke, new Object[0]);
                }
                List list = (List) invoke;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ProviderInfo providerInfo = (ProviderInfo) it.next();
                    if (isAppPkg(providerInfo.packageName) || !MethodProxy.isOutsidePackage(providerInfo.packageName)) {
                        it.remove();
                    }
                    ComponentFixer.fixOutsideComponentInfo(providerInfo);
                }
                queryContentProviders.addAll(list);
            }
            if (isReturnParceledListSlice) {
                return ParceledListSliceCompat.create(queryContentProviders);
            }
            return queryContentProviders;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "queryContentProviders";
        }
    }

    /* loaded from: classes3.dex */
    static class QueryIntentActivities extends MethodProxy {
        QueryIntentActivities() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ActivityInfo activityInfo;
            boolean isReturnParceledListSlice = ParceledListSliceCompat.isReturnParceledListSlice(method);
            List<ResolveInfo> queryIntentActivities = VPackageManager.get().queryIntentActivities((Intent) objArr[0], (String) objArr[1], (int) getIntOrLongValue(objArr[2]), VUserHandle.myUserId());
            MethodProxy.replaceLastUserId(objArr);
            Object invoke = method.invoke(obj, objArr);
            if (invoke != null) {
                if (isReturnParceledListSlice) {
                    invoke = ParceledListSlice.getList.call(invoke, new Object[0]);
                }
                List list = (List) invoke;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ResolveInfo resolveInfo = (ResolveInfo) it.next();
                        if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null && MethodProxy.isOutsidePackage(activityInfo.packageName)) {
                            ComponentFixer.fixOutsideComponentInfo(resolveInfo.activityInfo);
                        } else {
                            it.remove();
                        }
                    }
                    queryIntentActivities.addAll(list);
                }
            }
            if (isReturnParceledListSlice) {
                return ParceledListSliceCompat.create(queryIntentActivities);
            }
            return queryIntentActivities;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "queryIntentActivities";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    @TargetApi(19)
    /* loaded from: classes3.dex */
    static class QueryIntentContentProviders extends MethodProxy {
        QueryIntentContentProviders() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ProviderInfo providerInfo;
            boolean isReturnParceledListSlice = ParceledListSliceCompat.isReturnParceledListSlice(method);
            List<ResolveInfo> queryIntentContentProviders = VPackageManager.get().queryIntentContentProviders((Intent) objArr[0], (String) objArr[1], (int) getIntOrLongValue(objArr[2]), VUserHandle.myUserId());
            MethodProxy.replaceLastUserId(objArr);
            Object invoke = method.invoke(obj, objArr);
            if (isReturnParceledListSlice) {
                invoke = ParceledListSlice.getList.call(invoke, new Object[0]);
            }
            List list = (List) invoke;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ResolveInfo resolveInfo = (ResolveInfo) it.next();
                    if (resolveInfo != null && (providerInfo = resolveInfo.providerInfo) != null && MethodProxy.isOutsidePackage(providerInfo.packageName)) {
                        ComponentFixer.fixOutsideComponentInfo(resolveInfo.providerInfo);
                    } else {
                        it.remove();
                    }
                }
                queryIntentContentProviders.addAll(list);
            }
            if (ParceledListSliceCompat.isReturnParceledListSlice(method)) {
                return ParceledListSliceCompat.create(queryIntentContentProviders);
            }
            return queryIntentContentProviders;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "queryIntentContentProviders";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class QueryIntentReceivers extends MethodProxy {
        QueryIntentReceivers() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ActivityInfo activityInfo;
            boolean isReturnParceledListSlice = ParceledListSliceCompat.isReturnParceledListSlice(method);
            List<ResolveInfo> queryIntentReceivers = VPackageManager.get().queryIntentReceivers((Intent) objArr[0], (String) objArr[1], (int) getIntOrLongValue(objArr[2]), VUserHandle.myUserId());
            Object invoke = method.invoke(obj, objArr);
            if (isReturnParceledListSlice) {
                invoke = ParceledListSlice.getList.call(invoke, new Object[0]);
            }
            List list = (List) invoke;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ResolveInfo resolveInfo = (ResolveInfo) it.next();
                    if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null && !isAppPkg(activityInfo.packageName) && MethodProxy.isOutsidePackage(resolveInfo.activityInfo.packageName)) {
                        ComponentFixer.fixOutsideComponentInfo(resolveInfo.activityInfo);
                    } else {
                        it.remove();
                    }
                }
                queryIntentReceivers.addAll(list);
            }
            if (isReturnParceledListSlice) {
                return ParceledListSliceCompat.create(queryIntentReceivers);
            }
            return queryIntentReceivers;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "queryIntentReceivers";
        }
    }

    /* loaded from: classes3.dex */
    static class QueryIntentServices extends MethodProxy {
        QueryIntentServices() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ServiceInfo serviceInfo;
            boolean isReturnParceledListSlice = ParceledListSliceCompat.isReturnParceledListSlice(method);
            int myUserId = VUserHandle.myUserId();
            Intent intent = (Intent) objArr[0];
            List<ResolveInfo> queryIntentServices = VPackageManager.get().queryIntentServices(intent, (String) objArr[1], (int) getIntOrLongValue(objArr[2]), myUserId);
            MethodProxy.replaceLastUserId(objArr);
            Object invoke = method.invoke(obj, objArr);
            if (invoke != null) {
                if (isReturnParceledListSlice) {
                    invoke = ParceledListSlice.getList.call(invoke, new Object[0]);
                }
                List list = (List) invoke;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ResolveInfo resolveInfo = (ResolveInfo) it.next();
                        if (MethodProxy.isHostIntent(intent)) {
                            break;
                        }
                        if (resolveInfo == null || (serviceInfo = resolveInfo.serviceInfo) == null || !MethodProxy.isOutsidePackage(serviceInfo.packageName)) {
                            it.remove();
                        }
                    }
                    queryIntentServices.addAll(list);
                }
            }
            if (isReturnParceledListSlice) {
                return ParceledListSliceCompat.create(queryIntentServices);
            }
            return queryIntentServices;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "queryIntentServices";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class QuerySliceContentProviders extends QueryContentProviders {
        QuerySliceContentProviders() {
        }

        @Override // com.lody.virtual.client.hook.proxies.pm.MethodProxies.QueryContentProviders, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "querySliceContentProviders";
        }
    }

    /* loaded from: classes3.dex */
    static class RemovePackageFromPreferred extends MethodProxy {
        RemovePackageFromPreferred() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "removePackageFromPreferred";
        }
    }

    /* loaded from: classes3.dex */
    static class ResolveContentProvider extends MethodProxy {
        ResolveContentProvider() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ProviderInfo resolveContentProvider = VPackageManager.get().resolveContentProvider((String) objArr[0], (int) getIntOrLongValue(objArr[1]), VUserHandle.myUserId());
            if (resolveContentProvider == null) {
                MethodProxy.replaceLastUserId(objArr);
                resolveContentProvider = (ProviderInfo) method.invoke(obj, objArr);
                if (resolveContentProvider == null || MethodProxy.isOutsidePackage(resolveContentProvider.packageName)) {
                }
            }
            return resolveContentProvider;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "resolveContentProvider";
        }
    }

    /* loaded from: classes3.dex */
    static class ResolveIntent extends MethodProxy {
        ResolveIntent() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ResolveInfo resolveIntent = VPackageManager.get().resolveIntent((Intent) objArr[0], (String) objArr[1], (int) getIntOrLongValue(objArr[2]), VUserHandle.myUserId());
            if (resolveIntent == null) {
                MethodProxy.replaceLastUserId(objArr);
                ResolveInfo resolveInfo = (ResolveInfo) method.invoke(obj, objArr);
                if (resolveInfo != null && MethodProxy.isOutsidePackage(resolveInfo.activityInfo.packageName)) {
                    ComponentFixer.fixOutsideComponentInfo(resolveInfo.activityInfo);
                    return resolveInfo;
                }
            }
            return resolveIntent;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "resolveIntent";
        }
    }

    /* loaded from: classes3.dex */
    static class ResolveService extends MethodProxy {
        ResolveService() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ResolveInfo resolveService = VPackageManager.get().resolveService((Intent) objArr[0], (String) objArr[1], (int) getIntOrLongValue(objArr[2]), VUserHandle.myUserId());
            if (resolveService != null) {
                return resolveService;
            }
            MethodProxy.replaceLastUserId(objArr);
            ResolveInfo resolveInfo = (ResolveInfo) method.invoke(obj, objArr);
            if (resolveInfo != null && MethodProxy.isOutsidePackage(resolveInfo.serviceInfo.packageName)) {
                ComponentFixer.fixOutsideComponentInfo(resolveInfo.serviceInfo);
                return resolveInfo;
            }
            return null;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "resolveService";
        }
    }

    /* loaded from: classes3.dex */
    static class RevokeRuntimePermission extends MethodProxy {
        RevokeRuntimePermission() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "revokeRuntimePermission";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class SetApplicationBlockedSettingAsUser extends MethodProxy {
        SetApplicationBlockedSettingAsUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setApplicationBlockedSettingAsUser";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class SetApplicationEnabledSetting extends MethodProxy {
        SetApplicationEnabledSetting() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                MethodParameterUtils.replaceFirstAppPkg(objArr);
                MethodProxy.replaceLastUserId(objArr);
                return method.invoke(obj, objArr);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setApplicationEnabledSetting";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class SetComponentEnabledSetting extends MethodProxy {
        SetComponentEnabledSetting() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            VPackageManager.get().setComponentEnabledSetting((ComponentName) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), MethodProxy.getAppUserId());
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setComponentEnabledSetting";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class SetPackageStoppedState extends MethodProxy {
        SetPackageStoppedState() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setPackageStoppedState";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    /* loaded from: classes3.dex */
    static class checkUidSignatures extends MethodProxy {
        checkUidSignatures() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int i5;
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            if (intValue == intValue2 || intValue == (i5 = VEnvironment.OUTSIDE_APP_UID) || intValue2 == i5) {
                return 0;
            }
            String[] packagesForUid = VirtualCore.getPM().getPackagesForUid(intValue);
            String[] packagesForUid2 = VirtualCore.getPM().getPackagesForUid(intValue2);
            if (packagesForUid != null && packagesForUid.length != 0) {
                if (packagesForUid2 != null && packagesForUid2.length != 0) {
                    return Integer.valueOf(VPackageManager.get().checkSignatures(packagesForUid[0], packagesForUid2[0]));
                }
                return -4;
            }
            return -4;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "checkUidSignatures";
        }
    }

    /* loaded from: classes3.dex */
    static class getNameForUid extends MethodProxy {
        getNameForUid() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == VEnvironment.OUTSIDE_APP_UID) {
                intValue = MethodProxy.getVUid();
            }
            return VPackageManager.get().getNameForUid(intValue);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getNameForUid";
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean isEnable() {
            return MethodProxy.isAppProcess();
        }
    }

    MethodProxies() {
    }
}
