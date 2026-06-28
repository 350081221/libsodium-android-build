package com.lody.virtual.server.pm.parser;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageParser;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.SparseArray;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.client.core.SettingConfig;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.Constants;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.client.fixer.ComponentFixer;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.compat.PackageParserCompat;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.helper.utils.FileUtils;
import com.lody.virtual.helper.utils.RefObjUtil;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.server.pm.ComponentStateManager;
import com.lody.virtual.server.pm.PackageCacheManager;
import com.lody.virtual.server.pm.PackageSetting;
import com.lody.virtual.server.pm.PackageUserState;
import com.lody.virtual.server.pm.parser.VPackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mirror.RefObject;
import mirror.android.content.pm.ApplicationInfoL;
import mirror.android.content.pm.ApplicationInfoN;
import mirror.android.content.pm.ApplicationInfoO;
import mirror.android.content.pm.PackageParser;

/* loaded from: classes3.dex */
public class PackageParserEx {
    public static final int GET_SIGNING_CERTIFICATES = 134217728;
    public static final String ORG_APACHE_HTTP_LEGACY = "org.apache.http.legacy";
    private static final String TAG = "PackageParserEx";

    private static void addOwner(VPackage vPackage) {
        int i5;
        Iterator<VPackage.ActivityComponent> it = vPackage.activities.iterator();
        while (it.hasNext()) {
            VPackage.ActivityComponent next = it.next();
            next.owner = vPackage;
            Iterator it2 = next.intents.iterator();
            while (it2.hasNext()) {
                ((VPackage.ActivityIntentInfo) it2.next()).activity = next;
            }
        }
        Iterator<VPackage.ServiceComponent> it3 = vPackage.services.iterator();
        while (it3.hasNext()) {
            VPackage.ServiceComponent next2 = it3.next();
            next2.owner = vPackage;
            Iterator it4 = next2.intents.iterator();
            while (it4.hasNext()) {
                ((VPackage.ServiceIntentInfo) it4.next()).service = next2;
            }
        }
        Iterator<VPackage.ActivityComponent> it5 = vPackage.receivers.iterator();
        while (it5.hasNext()) {
            VPackage.ActivityComponent next3 = it5.next();
            next3.owner = vPackage;
            Iterator it6 = next3.intents.iterator();
            while (it6.hasNext()) {
                ((VPackage.ActivityIntentInfo) it6.next()).activity = next3;
            }
        }
        Iterator<VPackage.ProviderComponent> it7 = vPackage.providers.iterator();
        while (it7.hasNext()) {
            VPackage.ProviderComponent next4 = it7.next();
            next4.owner = vPackage;
            Iterator it8 = next4.intents.iterator();
            while (it8.hasNext()) {
                ((VPackage.ProviderIntentInfo) it8.next()).provider = next4;
            }
        }
        Iterator<VPackage.InstrumentationComponent> it9 = vPackage.instrumentation.iterator();
        while (it9.hasNext()) {
            it9.next().owner = vPackage;
        }
        Iterator<VPackage.PermissionComponent> it10 = vPackage.permissions.iterator();
        while (it10.hasNext()) {
            it10.next().owner = vPackage;
        }
        Iterator<VPackage.PermissionGroupComponent> it11 = vPackage.permissionGroups.iterator();
        while (it11.hasNext()) {
            it11.next().owner = vPackage;
        }
        if (GmsSupport.isGoogleService(vPackage.packageName)) {
            i5 = 12;
        } else {
            i5 = 4;
        }
        ApplicationInfo applicationInfo = vPackage.applicationInfo;
        applicationInfo.flags = i5 | applicationInfo.flags;
    }

    private static VPackage buildPackageCache(PackageParser.Package r5) {
        List<String> list;
        VPackage vPackage = new VPackage();
        vPackage.activities = new ArrayList<>(r5.activities.size());
        vPackage.services = new ArrayList<>(r5.services.size());
        vPackage.receivers = new ArrayList<>(r5.receivers.size());
        vPackage.providers = new ArrayList<>(r5.providers.size());
        vPackage.instrumentation = new ArrayList<>(r5.instrumentation.size());
        vPackage.permissions = new ArrayList<>(r5.permissions.size());
        vPackage.permissionGroups = new ArrayList<>(r5.permissionGroups.size());
        Iterator<PackageParser.Activity> it = r5.activities.iterator();
        while (it.hasNext()) {
            vPackage.activities.add(new VPackage.ActivityComponent(it.next()));
        }
        Iterator<PackageParser.Service> it2 = r5.services.iterator();
        while (it2.hasNext()) {
            vPackage.services.add(new VPackage.ServiceComponent(it2.next()));
        }
        Iterator<PackageParser.Activity> it3 = r5.receivers.iterator();
        while (it3.hasNext()) {
            vPackage.receivers.add(new VPackage.ActivityComponent(it3.next()));
        }
        Iterator<PackageParser.Provider> it4 = r5.providers.iterator();
        while (it4.hasNext()) {
            vPackage.providers.add(new VPackage.ProviderComponent(it4.next()));
        }
        Iterator<PackageParser.Instrumentation> it5 = r5.instrumentation.iterator();
        while (it5.hasNext()) {
            vPackage.instrumentation.add(new VPackage.InstrumentationComponent(it5.next()));
        }
        Iterator<PackageParser.Permission> it6 = r5.permissions.iterator();
        while (it6.hasNext()) {
            vPackage.permissions.add(new VPackage.PermissionComponent(it6.next()));
        }
        Iterator<PackageParser.PermissionGroup> it7 = r5.permissionGroups.iterator();
        while (it7.hasNext()) {
            vPackage.permissionGroups.add(new VPackage.PermissionGroupComponent(it7.next()));
        }
        ArrayList<String> arrayList = new ArrayList<>(r5.requestedPermissions.size());
        vPackage.requestedPermissions = arrayList;
        arrayList.addAll(r5.requestedPermissions);
        RefObject<List<String>> refObject = PackageParser.Package.protectedBroadcasts;
        if (refObject != null && (list = refObject.get(r5)) != null) {
            ArrayList<String> arrayList2 = new ArrayList<>(list);
            vPackage.protectedBroadcasts = arrayList2;
            arrayList2.addAll(list);
        }
        vPackage.applicationInfo = r5.applicationInfo;
        if (BuildCompat.isPie()) {
            PackageParser.SigningDetails signingDetails = r5.mSigningDetails;
            vPackage.mSigningDetails = signingDetails;
            Signature[] signatureArr = signingDetails.pastSigningCertificates;
            if (signatureArr != null && signatureArr.length > 0) {
                vPackage.mSignatures = r1;
                Signature[] signatureArr2 = {signatureArr[0]};
            } else {
                vPackage.mSignatures = signingDetails.signatures;
            }
        } else {
            vPackage.mSignatures = r5.mSignatures;
        }
        fixSignatureAsSystem(vPackage);
        vPackage.mAppMetaData = r5.mAppMetaData;
        vPackage.packageName = r5.packageName;
        vPackage.mPreferredOrder = r5.mPreferredOrder;
        vPackage.mVersionName = r5.mVersionName;
        vPackage.mSharedUserId = r5.mSharedUserId;
        vPackage.mSharedUserLabel = r5.mSharedUserLabel;
        vPackage.usesLibraries = r5.usesLibraries;
        vPackage.usesOptionalLibraries = r5.usesOptionalLibraries;
        vPackage.mVersionCode = r5.mVersionCode;
        vPackage.configPreferences = r5.configPreferences;
        vPackage.reqFeatures = r5.reqFeatures;
        addOwner(vPackage);
        updatePackageApache(vPackage);
        return vPackage;
    }

    private static void buildSignature(PackageParser.Package r12, Signature[] signatureArr) {
        if (BuildCompat.isPie()) {
            Object obj = PackageParser.Package.mSigningDetails.get(r12);
            PackageParser.SigningDetails.pastSigningCertificates.set(obj, signatureArr);
            PackageParser.SigningDetails.signatures.set(obj, signatureArr);
            return;
        }
        r12.mSignatures = signatureArr;
    }

    private static boolean checkUseInstalledOrHidden(PackageUserState packageUserState, int i5) {
        return (packageUserState.installed && !packageUserState.hidden) || (i5 & 8192) != 0;
    }

    public static void fixSignatureAsSystem(VPackage vPackage) {
        if (VirtualCore.getConfig().isOutsideAppInfoPriority(vPackage.packageName)) {
            try {
                vPackage.mSignatures = VirtualCore.get().getPackageManager().getPackageInfo(vPackage.packageName, 134217792).signatures;
            } catch (Throwable unused) {
            }
        }
    }

    public static ActivityInfo generateActivityInfo(VPackage.ActivityComponent activityComponent, int i5, PackageUserState packageUserState, int i6, boolean z4) {
        Bundle bundle;
        if (activityComponent == null || !checkUseInstalledOrHidden(packageUserState, i5)) {
            return null;
        }
        ActivityInfo activityInfo = new ActivityInfo(activityComponent.info);
        if ((i5 & 128) != 0 && (bundle = activityComponent.metaData) != null) {
            activityInfo.metaData = bundle;
        }
        activityInfo.enabled = isEnabledLPr(activityComponent.info, 0, i6);
        activityInfo.applicationInfo = generateApplicationInfo(activityComponent.owner, i5, packageUserState, i6, z4);
        return activityInfo;
    }

    public static ApplicationInfo generateApplicationInfo(VPackage vPackage, int i5, PackageUserState packageUserState, int i6, boolean z4) {
        if (vPackage == null || !checkUseInstalledOrHidden(packageUserState, i5)) {
            return null;
        }
        ApplicationInfo applicationInfo = new ApplicationInfo(vPackage.applicationInfo);
        if ((i5 & 128) != 0) {
            applicationInfo.metaData = vPackage.mAppMetaData;
        }
        initApplicationAsUser(applicationInfo, i6, z4);
        return applicationInfo;
    }

    public static InstrumentationInfo generateInstrumentationInfo(VPackage.InstrumentationComponent instrumentationComponent, int i5) {
        if (instrumentationComponent == null) {
            return null;
        }
        if ((i5 & 128) == 0) {
            return instrumentationComponent.info;
        }
        InstrumentationInfo instrumentationInfo = new InstrumentationInfo(instrumentationComponent.info);
        instrumentationInfo.metaData = instrumentationComponent.metaData;
        return instrumentationInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.pm.PackageInfo generatePackageInfo(com.lody.virtual.server.pm.parser.VPackage r5, com.lody.virtual.server.pm.PackageSetting r6, int r7, long r8, long r10, com.lody.virtual.server.pm.PackageUserState r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.pm.parser.PackageParserEx.generatePackageInfo(com.lody.virtual.server.pm.parser.VPackage, com.lody.virtual.server.pm.PackageSetting, int, long, long, com.lody.virtual.server.pm.PackageUserState, int, boolean):android.content.pm.PackageInfo");
    }

    public static PermissionGroupInfo generatePermissionGroupInfo(VPackage.PermissionGroupComponent permissionGroupComponent, int i5) {
        if (permissionGroupComponent == null) {
            return null;
        }
        if ((i5 & 128) == 0) {
            return permissionGroupComponent.info;
        }
        PermissionGroupInfo permissionGroupInfo = new PermissionGroupInfo(permissionGroupComponent.info);
        permissionGroupInfo.metaData = permissionGroupComponent.metaData;
        return permissionGroupInfo;
    }

    public static PermissionInfo generatePermissionInfo(VPackage.PermissionComponent permissionComponent, int i5) {
        if (permissionComponent == null) {
            return null;
        }
        if ((i5 & 128) == 0) {
            return permissionComponent.info;
        }
        PermissionInfo permissionInfo = new PermissionInfo(permissionComponent.info);
        permissionInfo.metaData = permissionComponent.metaData;
        return permissionInfo;
    }

    public static ProviderInfo generateProviderInfo(VPackage.ProviderComponent providerComponent, int i5, PackageUserState packageUserState, int i6, boolean z4) {
        Bundle bundle;
        if (providerComponent == null || !checkUseInstalledOrHidden(packageUserState, i5)) {
            return null;
        }
        ProviderInfo providerInfo = new ProviderInfo(providerComponent.info);
        if ((i5 & 128) != 0 && (bundle = providerComponent.metaData) != null) {
            providerInfo.metaData = bundle;
        }
        if ((i5 & 2048) == 0) {
            providerInfo.uriPermissionPatterns = null;
        }
        providerInfo.enabled = isEnabledLPr(providerComponent.info, 0, i6);
        providerInfo.applicationInfo = generateApplicationInfo(providerComponent.owner, i5, packageUserState, i6, z4);
        return providerInfo;
    }

    public static ServiceInfo generateServiceInfo(VPackage.ServiceComponent serviceComponent, int i5, PackageUserState packageUserState, int i6, boolean z4) {
        Bundle bundle;
        if (serviceComponent == null || !checkUseInstalledOrHidden(packageUserState, i5)) {
            return null;
        }
        ServiceInfo serviceInfo = new ServiceInfo(serviceComponent.info);
        if ((i5 & 128) != 0 && (bundle = serviceComponent.metaData) != null) {
            serviceInfo.metaData = bundle;
        }
        serviceInfo.enabled = isEnabledLPr(serviceComponent.info, 0, i6);
        serviceInfo.applicationInfo = generateApplicationInfo(serviceComponent.owner, i5, packageUserState, i6, z4);
        return serviceInfo;
    }

    private static void initApplicationAsUser(ApplicationInfo applicationInfo, int i5, boolean z4) {
        String path;
        String path2;
        String[] strArr;
        ArrayList<String> arrayList;
        File splitPackageFile;
        PackageSetting setting = PackageCacheManager.getSetting(applicationInfo.packageName);
        VPackage vPackage = PackageCacheManager.get(applicationInfo.packageName);
        if (setting != null) {
            SettingConfig config = VirtualCore.getConfig();
            ApplicationInfo applicationInfo2 = null;
            try {
                if (config.isOutsideAppInfoPriority(applicationInfo.packageName)) {
                    applicationInfo2 = VirtualCore.get().getPackageManager().getApplicationInfo(applicationInfo.packageName, 0);
                }
            } catch (Throwable unused) {
            }
            if (z4 && !setting.dynamic) {
                String path3 = VEnvironment.getPackageFileExt(applicationInfo.packageName).getPath();
                applicationInfo.sourceDir = path3;
                applicationInfo.publicSourceDir = path3;
                File dataAppLibDirectoryExt = VEnvironment.getDataAppLibDirectoryExt(applicationInfo.packageName);
                applicationInfo.nativeLibraryDir = new File(dataAppLibDirectoryExt, VirtualRuntime.getInstructionSet(setting.primaryCpuAbi)).getPath();
                if (setting.secondaryCpuAbi != null) {
                    ApplicationInfoL.secondaryNativeLibraryDir.set(applicationInfo, new File(dataAppLibDirectoryExt, VirtualRuntime.getInstructionSet(setting.secondaryCpuAbi)).getPath());
                }
                String absolutePath = VEnvironment.getDataAppPackageDirectoryExt(applicationInfo.packageName).getAbsolutePath();
                ApplicationInfoL.scanSourceDir.set(applicationInfo, absolutePath);
                ApplicationInfoL.scanPublicSourceDir.set(applicationInfo, absolutePath);
            }
            if (!setting.dynamic && (arrayList = vPackage.splitNames) != null && !arrayList.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    applicationInfo.splitNames = (String[]) vPackage.splitNames.toArray(new String[0]);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<String> it = vPackage.splitNames.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (z4) {
                        splitPackageFile = VEnvironment.getSplitPackageFileExt(applicationInfo.packageName, next);
                    } else {
                        splitPackageFile = VEnvironment.getSplitPackageFile(applicationInfo.packageName, next);
                    }
                    arrayList2.add(splitPackageFile.getPath());
                }
                vPackage.applicationInfo.splitSourceDirs = (String[]) arrayList2.toArray(new String[0]);
                vPackage.applicationInfo.splitPublicSourceDirs = (String[]) arrayList2.toArray(new String[0]);
            }
            if (Build.VERSION.SDK_INT >= 26 && applicationInfo2 != null && setting.dynamic) {
                strArr = applicationInfo2.splitNames;
                applicationInfo.splitNames = strArr;
                SparseArray sparseArray = (SparseArray) RefObjUtil.getRefObjectValue(ApplicationInfoO.splitDependencies, applicationInfo2);
                SparseArray sparseArray2 = (SparseArray) RefObjUtil.getRefObjectValue(ApplicationInfoO.splitDependencies, applicationInfo);
                if (sparseArray != null && sparseArray2 == null) {
                    RefObjUtil.setRefObjectValue(ApplicationInfoO.splitDependencies, applicationInfo, sparseArray);
                }
            }
            if (z4) {
                path = VEnvironment.getDataUserPackageDirectoryExt(i5, applicationInfo.packageName).getPath();
            } else {
                path = VEnvironment.getDataUserPackageDirectory(i5, applicationInfo.packageName).getPath();
            }
            applicationInfo.dataDir = path;
            if (z4) {
                path2 = VEnvironment.getDeDataUserPackageDirectoryExt(i5, applicationInfo.packageName).getPath();
            } else {
                path2 = VEnvironment.getDeDataUserPackageDirectory(i5, applicationInfo.packageName).getPath();
            }
            RefObject<String> refObject = ApplicationInfoN.deviceEncryptedDataDir;
            if (refObject != null) {
                refObject.set(applicationInfo, path2);
            }
            RefObject<String> refObject2 = ApplicationInfoN.credentialEncryptedDataDir;
            if (refObject2 != null) {
                refObject2.set(applicationInfo, applicationInfo.dataDir);
            }
            RefObject<String> refObject3 = ApplicationInfoN.deviceProtectedDataDir;
            if (refObject3 != null) {
                refObject3.set(applicationInfo, path2);
            }
            RefObject<String> refObject4 = ApplicationInfoN.credentialProtectedDataDir;
            if (refObject4 != null) {
                refObject4.set(applicationInfo, applicationInfo.dataDir);
            }
            if (config.isEnableIORedirect() && isVAppCalling(VirtualCore.get().getContext())) {
                if (config.isUseRealDataDir(applicationInfo.packageName)) {
                    applicationInfo.dataDir = "/data/user/0/" + applicationInfo.packageName + "/";
                }
                if (config.isUseRealApkPath(vPackage.packageName, applicationInfo)) {
                    String packageFileStub = VEnvironment.getPackageFileStub(vPackage.packageName);
                    applicationInfo.sourceDir = packageFileStub;
                    applicationInfo.publicSourceDir = packageFileStub;
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("failed to getSetting for:" + applicationInfo.packageName);
    }

    public static void initApplicationInfoBase(PackageSetting packageSetting, VPackage vPackage) {
        ApplicationInfo applicationInfo = vPackage.applicationInfo;
        if (TextUtils.isEmpty(applicationInfo.processName)) {
            applicationInfo.processName = applicationInfo.packageName;
        }
        applicationInfo.enabled = true;
        applicationInfo.uid = packageSetting.appId;
        applicationInfo.name = ComponentFixer.fixComponentClassName(packageSetting.packageName, applicationInfo.name);
    }

    public static boolean isEnabledLPr(ComponentInfo componentInfo, int i5, int i6) {
        int i7 = ComponentStateManager.user(i6).get(ComponentUtils.toComponentName(componentInfo));
        if (i7 == 0) {
            return componentInfo.enabled;
        }
        if (i7 == 2 || i7 == 4 || i7 == 3) {
            return false;
        }
        return true;
    }

    private static boolean isLibraryPresent(List<String> list, List<String> list2, String str) {
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().equals(str)) {
                    return true;
                }
            }
        }
        if (list2 != null) {
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (it2.next().equals(str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean isVAppCalling(Context context) {
        String str;
        String str2 = context.getApplicationInfo().processName;
        int callingPid = Binder.getCallingPid();
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
        while (true) {
            if (it.hasNext()) {
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == callingPid) {
                    str = next.processName;
                    break;
                }
            } else {
                str = null;
                break;
            }
        }
        if (str == null || str.equals(str2) || str.endsWith(Constants.SERVER_PROCESS_NAME) || str.endsWith(Constants.HELPER_PROCESS_NAME) || !VActivityManager.get().isAppProcess(str)) {
            return false;
        }
        return true;
    }

    public static VPackage parsePackage(File file) throws Throwable {
        Bundle bundle;
        android.content.pm.PackageParser createParser = PackageParserCompat.createParser(file);
        if (BuildCompat.isQ()) {
            createParser.setCallback(new PackageParser.CallbackImpl(VirtualCore.getPM()));
        }
        PackageParser.Package parsePackage = PackageParserCompat.parsePackage(createParser, file, 0);
        int i5 = 1;
        if (parsePackage.requestedPermissions.contains("android.permission.FAKE_PACKAGE_SIGNATURE") && (bundle = parsePackage.mAppMetaData) != null && bundle.containsKey(Constants.FEATURE_FAKE_SIGNATURE)) {
            buildSignature(parsePackage, new Signature[]{new Signature(parsePackage.mAppMetaData.getString(Constants.FEATURE_FAKE_SIGNATURE))});
            VLog.d(TAG, "Using fake-signature feature on : " + parsePackage.packageName, new Object[0]);
        } else {
            try {
                if (BuildCompat.isPie()) {
                    i5 = 16;
                }
                PackageParserCompat.collectCertificates(createParser, parsePackage, i5);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return buildPackageCache(parsePackage);
    }

    public static VPackage readPackageCache(String str) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(VEnvironment.getPackageCacheFile(str));
                byte[] byteArray = FileUtils.toByteArray(fileInputStream);
                fileInputStream.close();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                if (obtain.readInt() == 4) {
                    VPackage vPackage = new VPackage(obtain);
                    addOwner(vPackage);
                    return vPackage;
                }
                throw new IllegalStateException("Invalid version.");
            } catch (Exception e5) {
                e5.printStackTrace();
                obtain.recycle();
                return null;
            }
        } finally {
            obtain.recycle();
        }
    }

    public static void readSignature(VPackage vPackage) {
        File signatureFile = VEnvironment.getSignatureFile(vPackage.packageName);
        if (!signatureFile.exists()) {
            return;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(signatureFile);
                byte[] byteArray = FileUtils.toByteArray(fileInputStream);
                fileInputStream.close();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                if (BuildCompat.isPie()) {
                    try {
                        PackageParser.SigningDetails signingDetails = (PackageParser.SigningDetails) PackageParser.SigningDetails.CREATOR.get().createFromParcel(obtain);
                        vPackage.mSigningDetails = signingDetails;
                        Signature[] signatureArr = signingDetails.pastSigningCertificates;
                        if (signatureArr != null && signatureArr.length > 0) {
                            vPackage.mSignatures = r0;
                            Signature[] signatureArr2 = {signatureArr[0]};
                        } else {
                            vPackage.mSignatures = signingDetails.signatures;
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                if (vPackage.mSigningDetails == null || vPackage.mSignatures == null) {
                    obtain.setDataPosition(0);
                    vPackage.mSignatures = (Signature[]) obtain.createTypedArray(Signature.CREATOR);
                    vPackage.mSigningDetails = null;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        } finally {
            obtain.recycle();
        }
    }

    public static void savePackageCache(VPackage vPackage) {
        Object obj;
        String str = vPackage.packageName;
        File packageCacheFile = VEnvironment.getPackageCacheFile(str);
        if (packageCacheFile.exists()) {
            packageCacheFile.delete();
        }
        File signatureFile = VEnvironment.getSignatureFile(str);
        if (signatureFile.exists()) {
            signatureFile.delete();
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.writeInt(4);
                vPackage.writeToParcel(obtain, 0);
                FileOutputStream fileOutputStream = new FileOutputStream(packageCacheFile);
                fileOutputStream.write(obtain.marshall());
                fileOutputStream.close();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            obtain.recycle();
            Signature[] signatureArr = vPackage.mSignatures;
            Object obj2 = vPackage.mSigningDetails;
            if (obj2 == null) {
                obj = signatureArr;
            } else {
                obj = obj2;
            }
            if (obj != null) {
                if (signatureFile.exists() && !signatureFile.delete()) {
                    VLog.w(TAG, "Unable to delete the signatures of " + str, new Object[0]);
                }
                obtain = Parcel.obtain();
                try {
                    try {
                        if (obj instanceof PackageParser.SigningDetails) {
                            PackageParser.SigningDetails.writeToParcel.call(obj2, obtain, 0);
                        } else {
                            obtain.writeTypedArray(signatureArr, 0);
                        }
                        FileUtils.writeParcelToFile(obtain, signatureFile);
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    private static void updatePackageApache(VPackage vPackage) {
        if (vPackage.usesLibraries == null) {
            vPackage.usesLibraries = new ArrayList<>();
        }
        if (vPackage.usesOptionalLibraries == null) {
            vPackage.usesOptionalLibraries = new ArrayList<>();
        }
        ApplicationInfo applicationInfo = vPackage.applicationInfo;
        if (applicationInfo != null && applicationInfo.targetSdkVersion < 28 && !isLibraryPresent(vPackage.usesLibraries, vPackage.usesOptionalLibraries, ORG_APACHE_HTTP_LEGACY)) {
            vPackage.usesLibraries.add(0, ORG_APACHE_HTTP_LEGACY);
        }
        if (vPackage.applicationInfo != null && !isLibraryPresent(vPackage.usesLibraries, vPackage.usesOptionalLibraries, "android.test.base")) {
            vPackage.usesLibraries.add(0, "android.test.base");
        }
    }
}
