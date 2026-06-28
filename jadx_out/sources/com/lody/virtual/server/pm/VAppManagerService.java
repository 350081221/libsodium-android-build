package com.lody.virtual.server.pm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.VersionedPackage;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.ArrayMap;
import com.lody.virtual.BuildConfig;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.HostPackageManager;
import com.lody.virtual.client.env.SpecialComponentList;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.DexOptimizer;
import com.lody.virtual.helper.PackageCleaner;
import com.lody.virtual.helper.collection.IntArray;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.compat.NativeLibraryHelperCompat;
import com.lody.virtual.helper.utils.ArrayUtils;
import com.lody.virtual.helper.utils.FileUtils;
import com.lody.virtual.helper.utils.Singleton;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.os.VUserInfo;
import com.lody.virtual.os.VUserManager;
import com.lody.virtual.remote.InstalledAppInfo;
import com.lody.virtual.remote.VAppInstallerParams;
import com.lody.virtual.remote.VAppInstallerResult;
import com.lody.virtual.server.accounts.VAccountManagerService;
import com.lody.virtual.server.am.UidSystem;
import com.lody.virtual.server.am.VActivityManagerService;
import com.lody.virtual.server.extension.VExtPackageAccessor;
import com.lody.virtual.server.interfaces.IAppManager;
import com.lody.virtual.server.interfaces.IPackageObserver;
import com.lody.virtual.server.notification.VNotificationManagerService;
import com.lody.virtual.server.pm.SystemConfig;
import com.lody.virtual.server.pm.parser.PackageParserEx;
import com.lody.virtual.server.pm.parser.VPackage;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mirror.RefConstructor;
import mirror.android.content.pm.ApplicationInfoL;
import mirror.android.content.pm.ApplicationInfoP;

/* loaded from: classes3.dex */
public class VAppManagerService extends IAppManager.Stub {
    private static final String TAG = "VAppManagerService";
    private static final Singleton<VAppManagerService> sService = new Singleton<VAppManagerService>() { // from class: com.lody.virtual.server.pm.VAppManagerService.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.lody.virtual.helper.utils.Singleton
        public VAppManagerService create() {
            return new VAppManagerService();
        }
    };
    private volatile boolean mScanning;
    private final String ANDROID_TEST_BASE = "android.test.base";
    private final String ANDROID_TEST_RUNNER = "android.test.runner";
    private final String ORG_APACHE_HTTP_LEGACY = PackageParserEx.ORG_APACHE_HTTP_LEGACY;
    private final UidSystem mUidSystem = new UidSystem();
    private final SystemConfig mSystemConfig = new SystemConfig();
    private final PackagePersistenceLayer mPersistenceLayer = new PackagePersistenceLayer(this);
    private RemoteCallbackList<IPackageObserver> mRemoteCallbackList = new RemoteCallbackList<>();
    private BroadcastReceiver appEventReceiver = new BroadcastReceiver() { // from class: com.lody.virtual.server.pm.VAppManagerService.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            Uri data;
            String schemeSpecificPart;
            ApplicationInfo applicationInfo;
            if (VAppManagerService.this.mScanning || (action = intent.getAction()) == null || (data = intent.getData()) == null || (schemeSpecificPart = data.getSchemeSpecificPart()) == null) {
                return;
            }
            if (schemeSpecificPart.equals(StubManifest.EXT_PACKAGE_NAME)) {
                VExtPackageAccessor.syncPackages();
            }
            PackageSetting setting = PackageCacheManager.getSetting(schemeSpecificPart);
            if (setting != null && setting.dynamic) {
                VActivityManagerService.get().killAppByPkg(schemeSpecificPart, -1);
                if (action.equals("android.intent.action.PACKAGE_REPLACED")) {
                    try {
                        applicationInfo = VirtualCore.getPM().getApplicationInfo(schemeSpecificPart, 0);
                    } catch (PackageManager.NameNotFoundException e5) {
                        e5.printStackTrace();
                        applicationInfo = null;
                    }
                    if (applicationInfo == null) {
                        return;
                    }
                    VAppInstallerParams vAppInstallerParams = new VAppInstallerParams(2, 1);
                    VAppInstallerResult installPackageInternal = VAppManagerService.this.installPackageInternal(Uri.parse("package:" + schemeSpecificPart), vAppInstallerParams);
                    VLog.e(VAppManagerService.TAG, "Update package %s status: %d", installPackageInternal.packageName, Integer.valueOf(installPackageInternal.status));
                    return;
                }
                if (action.equals("android.intent.action.PACKAGE_REMOVED") && intent.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)) {
                    VLog.e(VAppManagerService.TAG, "Removing package %s", setting.packageName);
                    VAppManagerService.this.uninstallPackageFully(setting, true);
                }
            }
        }
    };

    private void cleanUpResidualFiles(PackageSetting packageSetting) {
        VLog.e(TAG, "cleanup residual files for : %s", packageSetting.packageName);
        uninstallPackageFully(packageSetting, false);
    }

    private void extractApacheFrameworksForPie() {
        File optimizedFrameworkFile = VEnvironment.getOptimizedFrameworkFile("org.apache.http.legacy.boot");
        if (!optimizedFrameworkFile.exists()) {
            try {
                FileUtils.copyFileFromAssets(VirtualCore.get().getContext(), "org.apache.http.legacy.boot", optimizedFrameworkFile);
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }

    public static VAppManagerService get() {
        return sService.get();
    }

    private void installOrUpdateMediaProvider() {
        if (!VEnvironment.enableMediaRedirect()) {
            return;
        }
        Context context = VirtualCore.get().getContext();
        String str = BuildConfig.VA_MEDIAPROVIDER_PKG + ".apk";
        File file = new File(context.getCacheDir(), str);
        if (VirtualCore.get().isAppInstalled(BuildConfig.VA_MEDIAPROVIDER_PKG)) {
            if (new File(context.getApplicationInfo().publicSourceDir).lastModified() > file.lastModified()) {
                try {
                    FileUtils.copyFileFromAssets(context, str, file);
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                if (file.exists()) {
                    VirtualCore.get().installPackage(Uri.fromFile(file), new VAppInstallerParams(26, 1));
                    return;
                }
                return;
            }
            return;
        }
        try {
            FileUtils.copyFileFromAssets(context, str, file);
            if (file.exists()) {
                VirtualCore.get().installPackage(Uri.fromFile(file), new VAppInstallerParams());
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VAppInstallerResult installPackageInternal(Uri uri, VAppInstallerParams vAppInstallerParams) {
        File file;
        ApplicationInfo applicationInfo;
        VPackage vPackage;
        String str;
        int i5;
        boolean z4;
        String findSupportedAbi;
        boolean z5;
        long j5;
        int i6;
        ArrayList arrayList;
        int i7;
        File dataAppLibDirectory;
        File file2;
        boolean z6;
        File file3;
        Iterator<String> it;
        int i8;
        int i9;
        ArrayList arrayList2;
        File file4;
        String str2;
        File file5;
        PackageSetting packageSetting;
        boolean z7;
        boolean z8;
        boolean z9;
        String[] strArr;
        ApplicationInfo applicationInfo2;
        long currentTimeMillis = System.currentTimeMillis();
        int installFlags = vAppInstallerParams.getInstallFlags();
        if (uri != null && uri.getScheme() != null) {
            String scheme = uri.getScheme();
            if (!scheme.equals("package") && !scheme.equals("file")) {
                return VAppInstallerResult.create(4);
            }
            if (scheme.equals("package") && uri.getSchemeSpecificPart() == null) {
                return VAppInstallerResult.create(4);
            }
            if (scheme.equals("file") && uri.getPath() == null) {
                return VAppInstallerResult.create(4);
            }
            if (uri.getScheme().equals("package")) {
                String schemeSpecificPart = uri.getSchemeSpecificPart();
                try {
                    applicationInfo2 = HostPackageManager.get().getApplicationInfo(schemeSpecificPart, 1024L);
                } catch (PackageManager.NameNotFoundException e5) {
                    e5.printStackTrace();
                    applicationInfo2 = null;
                }
                if (applicationInfo2 == null) {
                    return VAppInstallerResult.create(schemeSpecificPart, 7);
                }
                file = new File(applicationInfo2.publicSourceDir);
                applicationInfo = applicationInfo2;
            } else {
                file = new File(uri.getPath());
                applicationInfo = null;
            }
            if (file.exists() && file.isFile()) {
                try {
                    PackageParser.ApkLite parseApkLite = PackageParser.parseApkLite(file, 0);
                    if (parseApkLite.splitName != null) {
                        return installSplitPackageInternal(file, parseApkLite, vAppInstallerParams);
                    }
                    try {
                        vPackage = PackageParserEx.parsePackage(file);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        vPackage = null;
                    }
                    if (vPackage != null && (str = vPackage.packageName) != null) {
                        VPackage vPackage2 = PackageCacheManager.get(str);
                        if (vPackage2 != null) {
                            if ((installFlags & 4) != 0) {
                                return VAppInstallerResult.create(vPackage.packageName, 3);
                            }
                            if ((installFlags & 2) == 0 && vPackage2.mVersionCode >= vPackage.mVersionCode) {
                                return VAppInstallerResult.create(vPackage.packageName, 5);
                            }
                            if ((installFlags & 8) == 0) {
                                VActivityManagerService.get().killAppByPkg(vPackage.packageName, -1);
                            }
                            i5 = 2;
                        } else {
                            i5 = 0;
                        }
                        VAppInstallerResult vAppInstallerResult = new VAppInstallerResult();
                        String str3 = vPackage.packageName;
                        vAppInstallerResult.packageName = str3;
                        vAppInstallerResult.flags = i5;
                        File dataAppPackageDirectory = VEnvironment.getDataAppPackageDirectory(str3);
                        if (!FileUtils.ensureDirCreate(dataAppPackageDirectory)) {
                            VLog.e(TAG, "failed to create app dir: " + dataAppPackageDirectory);
                            vAppInstallerResult.flags = 6;
                            return vAppInstallerResult;
                        }
                        String cpuAbiOverride = vAppInstallerParams.getCpuAbiOverride();
                        ArrayList arrayList3 = new ArrayList();
                        if (cpuAbiOverride != null) {
                            dataAppLibDirectory = VEnvironment.getDataAppLibDirectory(vPackage.packageName);
                            j5 = currentTimeMillis;
                            i6 = installFlags;
                            arrayList = arrayList3;
                            i7 = i5;
                            file2 = new File(dataAppLibDirectory, VirtualRuntime.getInstructionSet(cpuAbiOverride));
                            z6 = true;
                            file3 = null;
                            findSupportedAbi = null;
                        } else if (applicationInfo != null) {
                            String str4 = ApplicationInfoL.primaryCpuAbi.get(applicationInfo);
                            findSupportedAbi = ApplicationInfoL.secondaryCpuAbi.get(applicationInfo);
                            String str5 = applicationInfo.nativeLibraryDir;
                            if (str5 != null) {
                                file4 = new File(str5);
                            } else {
                                file4 = null;
                            }
                            String str6 = ApplicationInfoL.secondaryNativeLibraryDir.get(applicationInfo);
                            if (str6 != null) {
                                str2 = str4;
                                file5 = new File(str6);
                            } else {
                                str2 = str4;
                                file5 = null;
                            }
                            File file6 = file5;
                            File file7 = new File(ApplicationInfoL.nativeLibraryRootDir.get(applicationInfo));
                            z6 = ApplicationInfoL.nativeLibraryRootRequiresIsa.get(applicationInfo);
                            j5 = currentTimeMillis;
                            i6 = installFlags;
                            arrayList = arrayList3;
                            file2 = file4;
                            file3 = file6;
                            dataAppLibDirectory = file7;
                            cpuAbiOverride = str2;
                            i7 = i5;
                        } else {
                            try {
                                z4 = parseApkLite.use32bitAbi;
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                                z4 = false;
                            }
                            Set<String> packageAbiList = NativeLibraryHelperCompat.getPackageAbiList(file.getPath());
                            String findSupportedAbi2 = NativeLibraryHelperCompat.findSupportedAbi(Build.SUPPORTED_64_BIT_ABIS, packageAbiList);
                            findSupportedAbi = NativeLibraryHelperCompat.findSupportedAbi(Build.SUPPORTED_32_BIT_ABIS, packageAbiList);
                            String str7 = Build.SUPPORTED_ABIS[0];
                            if (!VirtualCore.get().isExtPackageInstalled()) {
                                str7 = "arm64-v8a";
                                z4 = false;
                            }
                            if (findSupportedAbi != null && (z4 || findSupportedAbi2 == null)) {
                                cpuAbiOverride = findSupportedAbi;
                                findSupportedAbi = findSupportedAbi2;
                            } else if (findSupportedAbi2 != null && (!z4 || findSupportedAbi == null)) {
                                cpuAbiOverride = findSupportedAbi2;
                            } else {
                                cpuAbiOverride = str7;
                                findSupportedAbi = null;
                            }
                            HashSet hashSet = new HashSet();
                            if (vPackage.usesLibraries == null) {
                                vPackage.usesLibraries = new ArrayList<>();
                            }
                            if (vPackage.usesOptionalLibraries == null) {
                                vPackage.usesOptionalLibraries = new ArrayList<>();
                            }
                            if (vPackage.applicationInfo.targetSdkVersion < 23 && !vPackage.usesLibraries.contains(PackageParserEx.ORG_APACHE_HTTP_LEGACY) && !vPackage.usesOptionalLibraries.contains(PackageParserEx.ORG_APACHE_HTTP_LEGACY)) {
                                vPackage.usesLibraries.add(PackageParserEx.ORG_APACHE_HTTP_LEGACY);
                            }
                            if (!vPackage.usesLibraries.contains("android.test.runner") && !vPackage.usesOptionalLibraries.contains("android.test.runner")) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            if ((z5 || (BuildCompat.isR() && vPackage.applicationInfo.targetSdkVersion < 30)) && !vPackage.usesLibraries.contains("android.test.base") && !vPackage.usesOptionalLibraries.contains("android.test.base")) {
                                vPackage.usesLibraries.add("android.test.base");
                            }
                            Iterator<String> it2 = vPackage.usesOptionalLibraries.iterator();
                            while (true) {
                                j5 = currentTimeMillis;
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next = it2.next();
                                SystemConfig.SharedLibraryEntry sharedLibrary = this.mSystemConfig.getSharedLibrary(next);
                                if (sharedLibrary == null) {
                                    VLog.e(TAG, "skip optional shared library: " + next);
                                    currentTimeMillis = j5;
                                    it2 = it2;
                                } else {
                                    Iterator<String> it3 = it2;
                                    hashSet.add(sharedLibrary.path);
                                    if (BuildCompat.isS()) {
                                        RefConstructor<SharedLibraryInfo> refConstructor = mirror.android.content.pm.SharedLibraryInfo.ctor;
                                        i9 = installFlags;
                                        Object[] objArr = {sharedLibrary.path, null, null, sharedLibrary.name, -1, 0, new VersionedPackage(SharedLibraryInfo.PLATFORM_PACKAGE_NAME, 0L), null, null, Boolean.FALSE};
                                        arrayList2 = arrayList3;
                                        arrayList2.add(refConstructor.newInstance(objArr));
                                    } else {
                                        i9 = installFlags;
                                        arrayList2 = arrayList3;
                                    }
                                    arrayList3 = arrayList2;
                                    currentTimeMillis = j5;
                                    it2 = it3;
                                    installFlags = i9;
                                }
                            }
                            i6 = installFlags;
                            arrayList = arrayList3;
                            Iterator<String> it4 = vPackage.usesLibraries.iterator();
                            while (it4.hasNext()) {
                                String next2 = it4.next();
                                SystemConfig.SharedLibraryEntry sharedLibrary2 = this.mSystemConfig.getSharedLibrary(next2);
                                if (sharedLibrary2 == null) {
                                    String str8 = TAG;
                                    StringBuilder sb = new StringBuilder();
                                    it = it4;
                                    sb.append("skip required shared library: ");
                                    sb.append(next2);
                                    VLog.e(str8, sb.toString());
                                } else {
                                    it = it4;
                                    hashSet.add(sharedLibrary2.path);
                                    if (BuildCompat.isS()) {
                                        i8 = i5;
                                        arrayList.add(mirror.android.content.pm.SharedLibraryInfo.ctor.newInstance(sharedLibrary2.path, null, null, sharedLibrary2.name, -1, 0, new VersionedPackage(SharedLibraryInfo.PLATFORM_PACKAGE_NAME, 0L), null, null, Boolean.FALSE));
                                    } else {
                                        i8 = i5;
                                    }
                                    i5 = i8;
                                }
                                it4 = it;
                            }
                            i7 = i5;
                            if (!hashSet.isEmpty()) {
                                vPackage.applicationInfo.sharedLibraryFiles = (String[]) hashSet.toArray(new String[0]);
                            }
                            dataAppLibDirectory = VEnvironment.getDataAppLibDirectory(vPackage.packageName);
                            file2 = new File(dataAppLibDirectory, VirtualRuntime.getInstructionSet(cpuAbiOverride));
                            if (findSupportedAbi != null) {
                                file3 = new File(dataAppLibDirectory, VirtualRuntime.getInstructionSet(findSupportedAbi));
                                z6 = true;
                            } else {
                                z6 = true;
                                file3 = null;
                            }
                        }
                        ApplicationInfoL.primaryCpuAbi.set(vPackage.applicationInfo, cpuAbiOverride);
                        ApplicationInfoL.secondaryCpuAbi.set(vPackage.applicationInfo, findSupportedAbi);
                        if (dataAppLibDirectory != null) {
                            ApplicationInfoL.nativeLibraryRootDir.set(vPackage.applicationInfo, dataAppLibDirectory.getAbsolutePath());
                        }
                        ApplicationInfoL.nativeLibraryRootRequiresIsa.set(vPackage.applicationInfo, z6);
                        if (file2 != null) {
                            vPackage.applicationInfo.nativeLibraryDir = file2.getAbsolutePath();
                        }
                        if (file3 != null) {
                            ApplicationInfoL.secondaryNativeLibraryDir.set(vPackage.applicationInfo, file3.getAbsolutePath());
                        }
                        if (applicationInfo != null) {
                            ApplicationInfo applicationInfo3 = vPackage.applicationInfo;
                            applicationInfo3.publicSourceDir = applicationInfo.publicSourceDir;
                            applicationInfo3.sourceDir = applicationInfo.sourceDir;
                            applicationInfo3.sharedLibraryFiles = applicationInfo.sharedLibraryFiles;
                            if (Build.VERSION.SDK_INT >= 26) {
                                strArr = applicationInfo.splitNames;
                                applicationInfo3.splitNames = strArr;
                            }
                            ApplicationInfo applicationInfo4 = vPackage.applicationInfo;
                            applicationInfo4.splitSourceDirs = applicationInfo.splitSourceDirs;
                            applicationInfo4.splitPublicSourceDirs = applicationInfo.splitPublicSourceDirs;
                            if (ApplicationInfoP.sharedLibraryInfos != null) {
                                ApplicationInfoP.sharedLibraryInfos(vPackage.applicationInfo, ApplicationInfoP.sharedLibraryInfos(applicationInfo));
                            }
                        } else {
                            String path = VEnvironment.getPackageFile(vPackage.packageName).getPath();
                            ApplicationInfo applicationInfo5 = vPackage.applicationInfo;
                            applicationInfo5.publicSourceDir = path;
                            applicationInfo5.sourceDir = path;
                            if (ApplicationInfoP.sharedLibraryInfos != null) {
                                ApplicationInfoP.sharedLibraryInfos(applicationInfo5, arrayList);
                            }
                        }
                        String absolutePath = VEnvironment.getDataAppPackageDirectory(vPackage.packageName).getAbsolutePath();
                        ApplicationInfoL.scanSourceDir.set(vPackage.applicationInfo, absolutePath);
                        ApplicationInfoL.scanPublicSourceDir.set(vPackage.applicationInfo, absolutePath);
                        NativeLibraryHelperCompat nativeLibraryHelperCompat = new NativeLibraryHelperCompat(file);
                        if (applicationInfo == null) {
                            if (!FileUtils.ensureDirCreate(dataAppLibDirectory)) {
                                VLog.e(TAG, "failed to create native lib root dir: " + dataAppLibDirectory);
                            }
                            if (FileUtils.ensureDirCreate(file2)) {
                                nativeLibraryHelperCompat.copyNativeBinaries(file2, cpuAbiOverride);
                            } else {
                                VLog.e(TAG, "failed to create native lib dir: " + file2);
                            }
                            if (findSupportedAbi != null) {
                                if (FileUtils.ensureDirCreate(file3)) {
                                    nativeLibraryHelperCompat.copyNativeBinaries(file3, findSupportedAbi);
                                } else {
                                    VLog.e(TAG, "failed to create secondary native lib dir: " + file3);
                                }
                            }
                        }
                        if (vPackage2 != null) {
                            packageSetting = (PackageSetting) vPackage2.mExtras;
                        } else {
                            packageSetting = new PackageSetting();
                        }
                        packageSetting.primaryCpuAbi = cpuAbiOverride;
                        packageSetting.secondaryCpuAbi = findSupportedAbi;
                        packageSetting.is64bitPackage = NativeLibraryHelperCompat.is64bitAbi(cpuAbiOverride);
                        if (applicationInfo == null) {
                            File packageFile = VEnvironment.getPackageFile(vPackage.packageName);
                            try {
                                FileUtils.copyFile(file, packageFile);
                                z9 = true;
                            } catch (IOException e6) {
                                VLog.e(TAG, "failed to copy file: " + packageFile);
                                e6.printStackTrace();
                                z9 = false;
                            }
                            if (!z9) {
                                FileUtils.deleteDir(VEnvironment.getDataAppPackageDirectory(vPackage.packageName));
                                vAppInstallerResult.status = 6;
                                return vAppInstallerResult;
                            }
                            VEnvironment.chmodPackageDictionary(packageFile);
                            file = packageFile;
                        }
                        if (applicationInfo != null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        packageSetting.dynamic = z7;
                        packageSetting.packageName = vPackage.packageName;
                        packageSetting.appId = VUserHandle.getAppId(this.mUidSystem.getOrCreateUid(vPackage));
                        if ((i7 & 2) != 0) {
                            packageSetting.lastUpdateTime = j5;
                        } else {
                            long j6 = j5;
                            packageSetting.firstInstallTime = j6;
                            packageSetting.lastUpdateTime = j6;
                            for (int i10 : VUserManagerService.get().getUserIds()) {
                                if (i10 == 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                packageSetting.setUserState(i10, false, false, z8);
                            }
                        }
                        PackageParserEx.savePackageCache(vPackage);
                        PackageCacheManager.put(vPackage, packageSetting);
                        if (!this.mScanning) {
                            this.mPersistenceLayer.save();
                        }
                        if (applicationInfo == null && !packageSetting.isRunInExtProcess()) {
                            File oatFile = VEnvironment.getOatFile(packageSetting.packageName, VirtualRuntime.getCurrentInstructionSet());
                            if (!oatFile.exists() || (vAppInstallerParams.getInstallFlags() & 16) == 0) {
                                try {
                                    DexOptimizer.dex2oat(file.getPath(), oatFile.getPath());
                                } catch (Throwable th3) {
                                    th3.printStackTrace();
                                }
                            }
                        }
                        VAccountManagerService.get().refreshAuthenticatorCache(null);
                        if (!this.mScanning) {
                            VExtPackageAccessor.syncPackages();
                        }
                        if ((i6 & 1) != 0) {
                            notifyAppInstalled(packageSetting, -1);
                        }
                        vAppInstallerResult.status = 0;
                        return vAppInstallerResult;
                    }
                    return VAppInstallerResult.create(7);
                } catch (PackageParser.PackageParserException unused) {
                    return VAppInstallerResult.create(4);
                }
            }
            return VAppInstallerResult.create(4);
        }
        return VAppInstallerResult.create(4);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:6|(1:8)(2:30|(2:32|(2:34|35)(12:36|10|(1:12)|13|14|15|16|(2:18|(1:20)(1:21))|22|(1:24)|25|26)))|9|10|(0)|13|14|15|16|(0)|22|(0)|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        r10.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.lody.virtual.remote.VAppInstallerResult installSplitPackageInternal(java.io.File r8, android.content.pm.PackageParser.ApkLite r9, com.lody.virtual.remote.VAppInstallerParams r10) {
        /*
            r7 = this;
            java.lang.String r0 = r9.packageName
            com.lody.virtual.server.pm.parser.VPackage r0 = com.lody.virtual.server.pm.PackageCacheManager.get(r0)
            r1 = 8
            if (r0 != 0) goto L11
            java.lang.String r8 = r9.packageName
            com.lody.virtual.remote.VAppInstallerResult r8 = com.lody.virtual.remote.VAppInstallerResult.create(r8, r1)
            return r8
        L11:
            java.lang.Object r2 = r0.mExtras
            com.lody.virtual.server.pm.PackageSetting r2 = (com.lody.virtual.server.pm.PackageSetting) r2
            java.util.ArrayList<java.lang.String> r3 = r0.splitNames
            if (r3 != 0) goto L21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.splitNames = r3
            goto L42
        L21:
            java.lang.String r4 = r9.splitName
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L42
            int r3 = r10.getInstallFlags()
            r3 = r3 & 2
            if (r3 != 0) goto L39
            java.lang.String r8 = r9.packageName
            r9 = 5
            com.lody.virtual.remote.VAppInstallerResult r8 = com.lody.virtual.remote.VAppInstallerResult.create(r8, r9)
            return r8
        L39:
            java.util.ArrayList<java.lang.String> r3 = r0.splitNames
            java.lang.String r4 = r9.splitName
            r3.remove(r4)
            r3 = 3
            goto L43
        L42:
            r3 = 1
        L43:
            int r10 = r10.getInstallFlags()
            r10 = r10 & r1
            if (r10 != 0) goto L54
            com.lody.virtual.server.am.VActivityManagerService r10 = com.lody.virtual.server.am.VActivityManagerService.get()
            java.lang.String r1 = r9.packageName
            r4 = -1
            r10.killAppByPkg(r1, r4)
        L54:
            java.util.ArrayList<java.lang.String> r10 = r0.splitNames
            java.lang.String r1 = r9.splitName
            r10.add(r1)
            java.lang.String r10 = r9.packageName
            java.lang.String r1 = r9.splitName
            java.io.File r10 = com.lody.virtual.os.VEnvironment.getSplitPackageFile(r10, r1)
            com.lody.virtual.helper.utils.FileUtils.copyFile(r8, r10)     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r10 = move-exception
            r10.printStackTrace()
        L6b:
            java.lang.String r10 = r8.getPath()
            java.util.Set r10 = com.lody.virtual.helper.compat.NativeLibraryHelperCompat.getPackageAbiList(r10)
            r1 = 0
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.Object[] r10 = r10.toArray(r4)
            java.lang.String[] r10 = (java.lang.String[]) r10
            int r4 = r10.length
            if (r4 <= 0) goto Lbd
            r10 = r10[r1]
            java.lang.String r4 = r0.packageName
            java.io.File r4 = com.lody.virtual.os.VEnvironment.getDataAppLibDirectory(r4)
            java.io.File r5 = new java.io.File
            java.lang.String r6 = com.lody.virtual.client.env.VirtualRuntime.getInstructionSet(r10)
            r5.<init>(r4, r6)
            r2.primaryCpuAbi = r10
            boolean r4 = com.lody.virtual.helper.compat.NativeLibraryHelperCompat.is64bitAbi(r10)
            r2.is64bitPackage = r4
            com.lody.virtual.helper.compat.NativeLibraryHelperCompat r2 = new com.lody.virtual.helper.compat.NativeLibraryHelperCompat
            r2.<init>(r8)
            boolean r8 = com.lody.virtual.helper.utils.FileUtils.ensureDirCreate(r5)
            if (r8 == 0) goto La7
            r2.copyNativeBinaries(r5, r10)
            goto Lbd
        La7:
            java.lang.String r8 = com.lody.virtual.server.pm.VAppManagerService.TAG
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "failed to create native lib dir: "
            r10.append(r2)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            com.lody.virtual.helper.utils.VLog.e(r8, r10)
        Lbd:
            com.lody.virtual.server.pm.parser.PackageParserEx.savePackageCache(r0)
            boolean r8 = r7.mScanning
            if (r8 != 0) goto Lc7
            com.lody.virtual.server.extension.VExtPackageAccessor.syncPackages()
        Lc7:
            com.lody.virtual.remote.VAppInstallerResult r8 = new com.lody.virtual.remote.VAppInstallerResult
            java.lang.String r9 = r9.packageName
            r8.<init>(r9, r1, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.pm.VAppManagerService.installSplitPackageInternal(java.io.File, android.content.pm.PackageParser$ApkLite, com.lody.virtual.remote.VAppInstallerParams):com.lody.virtual.remote.VAppInstallerResult");
    }

    private boolean loadPackageInnerLocked(PackageSetting packageSetting) {
        VPackage vPackage;
        boolean z4;
        boolean z5 = packageSetting.dynamic;
        if (z5 && !VirtualCore.get().isOutsideInstalled(packageSetting.packageName)) {
            return false;
        }
        int i5 = packageSetting.version;
        if (i5 == 6 && i5 < 7) {
            reInstallVApp(packageSetting);
            packageSetting.version = 7;
            this.mPersistenceLayer.changed = true;
        }
        File packageCacheFile = VEnvironment.getPackageCacheFile(packageSetting.packageName);
        try {
            vPackage = PackageParserEx.readPackageCache(packageSetting.packageName);
        } catch (Throwable th) {
            th.printStackTrace();
            vPackage = null;
        }
        if (vPackage == null || vPackage.packageName == null) {
            return false;
        }
        VEnvironment.chmodPackageDictionary(packageCacheFile);
        PackageCacheManager.put(vPackage, packageSetting);
        if (z5) {
            try {
                if (vPackage.mVersionCode != VirtualCore.get().getHostPackageManager().getPackageInfo(packageSetting.packageName, 0L).versionCode) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z6 = !new File(vPackage.applicationInfo.publicSourceDir).exists();
                if (z4 || z6) {
                    VLog.d(TAG, "app (" + packageSetting.packageName + ") has changed version, update it.", new Object[0]);
                    installPackageInternal(Uri.parse("package:" + packageSetting.packageName), new VAppInstallerParams(10, 1));
                }
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return true;
    }

    private void notifyAppInstalled(PackageSetting packageSetting, int i5) {
        String str = packageSetting.packageName;
        int beginBroadcast = this.mRemoteCallbackList.beginBroadcast();
        while (true) {
            int i6 = beginBroadcast - 1;
            if (beginBroadcast > 0) {
                if (i5 == -1) {
                    try {
                        this.mRemoteCallbackList.getBroadcastItem(i6).onPackageInstalled(str);
                        this.mRemoteCallbackList.getBroadcastItem(i6).onPackageInstalledAsUser(0, str);
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                    }
                } else {
                    this.mRemoteCallbackList.getBroadcastItem(i6).onPackageInstalledAsUser(i5, str);
                }
                beginBroadcast = i6;
            } else {
                sendInstalledBroadcast(str, new VUserHandle(i5));
                this.mRemoteCallbackList.finishBroadcast();
                return;
            }
        }
    }

    private void notifyAppUninstalled(PackageSetting packageSetting, int i5) {
        String str = packageSetting.packageName;
        int beginBroadcast = this.mRemoteCallbackList.beginBroadcast();
        while (true) {
            int i6 = beginBroadcast - 1;
            if (beginBroadcast > 0) {
                if (i5 == -1) {
                    try {
                        this.mRemoteCallbackList.getBroadcastItem(i6).onPackageUninstalled(str);
                        this.mRemoteCallbackList.getBroadcastItem(i6).onPackageUninstalledAsUser(0, str);
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                    }
                } else {
                    this.mRemoteCallbackList.getBroadcastItem(i6).onPackageUninstalledAsUser(i5, str);
                }
                beginBroadcast = i6;
            } else {
                sendUninstalledBroadcast(str, new VUserHandle(i5));
                this.mRemoteCallbackList.finishBroadcast();
                return;
            }
        }
    }

    private void sendInstalledBroadcast(String str, VUserHandle vUserHandle) {
        Intent intent = new Intent("android.intent.action.PACKAGE_ADDED");
        intent.setData(Uri.parse("package:" + str));
        VActivityManagerService.get().sendBroadcastAsUser(intent, vUserHandle);
    }

    private void sendUninstalledBroadcast(String str, VUserHandle vUserHandle) {
        Intent intent = new Intent("android.intent.action.PACKAGE_REMOVED");
        intent.setData(Uri.parse("package:" + str));
        VActivityManagerService.get().sendBroadcastAsUser(intent, vUserHandle);
    }

    private void startup() {
        this.mSystemConfig.load();
        this.mUidSystem.initUidList();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        VirtualCore.get().getContext().registerReceiver(this.appEventReceiver, intentFilter);
    }

    public static void systemReady() {
        VEnvironment.systemReady();
        if (BuildCompat.isPie() && !BuildCompat.isQ()) {
            get().extractApacheFrameworksForPie();
        }
        get().startup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uninstallPackageFully(PackageSetting packageSetting, boolean z4) {
        String str = packageSetting.packageName;
        VActivityManagerService.get().killAppByPkg(str, -1);
        PackageCacheManager.remove(str);
        FileUtils.deleteDir(VEnvironment.getDataAppPackageDirectory(str));
        FileUtils.deleteDir(VEnvironment.getOatDirectory(str));
        PackageCleaner.cleanAllUserPackage(VEnvironment.getDataUserDirectory(), str);
        for (VUserInfo vUserInfo : VUserManager.get().getUsers()) {
            VNotificationManagerService.get().cancelAllNotification(packageSetting.packageName, vUserInfo.id);
            ComponentStateManager.user(vUserInfo.id).clear(str);
        }
        if (z4) {
            notifyAppUninstalled(packageSetting, -1);
        }
        if (!this.mScanning) {
            VExtPackageAccessor.syncPackages();
        }
        VAccountManagerService.get().refreshAuthenticatorCache(null);
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public boolean cleanPackageData(String str, int i5) {
        PackageSetting setting = PackageCacheManager.getSetting(str);
        if (setting == null) {
            return false;
        }
        VActivityManagerService.get().killAppByPkg(str, i5);
        VNotificationManagerService.get().cancelAllNotification(setting.packageName, i5);
        FileUtils.deleteDir(VEnvironment.getDataUserPackageDirectory(i5, str));
        FileUtils.deleteDir(VEnvironment.getDeDataUserPackageDirectory(i5, str));
        VExtPackageAccessor.cleanPackageData(new int[]{i5}, setting.packageName);
        ComponentStateManager.user(i5).clear(str);
        return true;
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public int getInstalledAppCount() {
        return PackageCacheManager.size();
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public InstalledAppInfo getInstalledAppInfo(String str, int i5) {
        synchronized (PackageCacheManager.class) {
            if (str != null) {
                PackageSetting setting = PackageCacheManager.getSetting(str);
                if (setting != null) {
                    return setting.getAppInfo();
                }
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public List<InstalledAppInfo> getInstalledApps(int i5) {
        ArrayList arrayList = new ArrayList(getInstalledAppCount());
        ArrayMap<String, VPackage> arrayMap = PackageCacheManager.PACKAGE_CACHE;
        synchronized (arrayMap) {
            Iterator<VPackage> it = arrayMap.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((PackageSetting) it.next().mExtras).getAppInfo());
            }
        }
        return arrayList;
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public List<InstalledAppInfo> getInstalledAppsAsUser(int i5, int i6) {
        ArrayList arrayList = new ArrayList(getInstalledAppCount());
        ArrayMap<String, VPackage> arrayMap = PackageCacheManager.PACKAGE_CACHE;
        synchronized (arrayMap) {
            Iterator<VPackage> it = arrayMap.values().iterator();
            while (it.hasNext()) {
                PackageSetting packageSetting = (PackageSetting) it.next().mExtras;
                boolean isInstalled = packageSetting.isInstalled(i5);
                if ((i6 & 1) == 0 && packageSetting.isHidden(i5)) {
                    isInstalled = false;
                }
                if (isInstalled) {
                    arrayList.add(packageSetting.getAppInfo());
                }
            }
        }
        return arrayList;
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public List<String> getInstalledSplitNames(String str) {
        ArrayList<String> arrayList;
        synchronized (PackageCacheManager.class) {
            if (str != null) {
                VPackage vPackage = PackageCacheManager.get(str);
                if (vPackage != null && (arrayList = vPackage.splitNames) != null) {
                    return arrayList;
                }
            }
            return Collections.emptyList();
        }
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public int[] getPackageInstalledUsers(String str) {
        PackageSetting setting = PackageCacheManager.getSetting(str);
        if (setting != null) {
            IntArray intArray = new IntArray(5);
            for (int i5 : VUserManagerService.get().getUserIds()) {
                if (setting.readUserState(i5).installed) {
                    intArray.add(i5);
                }
            }
            return intArray.getAll();
        }
        return new int[0];
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public int getUidForSharedUser(String str) {
        if (str == null) {
            return -1;
        }
        return this.mUidSystem.getUid(str);
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public VAppInstallerResult installPackage(Uri uri, VAppInstallerParams vAppInstallerParams) {
        VAppInstallerResult installPackageInternal;
        synchronized (this) {
            try {
                try {
                    installPackageInternal = installPackageInternal(uri, vAppInstallerParams);
                } catch (Throwable th) {
                    th.printStackTrace();
                    throw new RuntimeException(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return installPackageInternal;
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public synchronized boolean installPackageAsUser(int i5, String str) {
        PackageSetting setting;
        if (VUserManagerService.get().exists(i5) && (setting = PackageCacheManager.getSetting(str)) != null) {
            if (setting.isInstalled(i5)) {
                return true;
            }
            setting.setInstalled(i5, true);
            VExtPackageAccessor.syncPackages();
            notifyAppInstalled(setting, i5);
            this.mPersistenceLayer.save();
            return true;
        }
        return false;
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public boolean isAppInstalled(String str) {
        return str != null && PackageCacheManager.contain(str);
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public boolean isAppInstalledAsUser(int i5, String str) {
        PackageSetting setting;
        if (str == null || !VUserManagerService.get().exists(i5) || (setting = PackageCacheManager.getSetting(str)) == null) {
            return false;
        }
        return setting.isInstalled(i5);
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public boolean isPackageLaunched(int i5, String str) {
        PackageSetting setting = PackageCacheManager.getSetting(str);
        if (setting != null && setting.isLaunched(i5)) {
            return true;
        }
        return false;
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public boolean isRunInExtProcess(String str) {
        PackageSetting setting = PackageCacheManager.getSetting(str);
        if (setting != null && setting.isRunInExtProcess()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean loadPackage(PackageSetting packageSetting) {
        if (!loadPackageInnerLocked(packageSetting)) {
            cleanUpResidualFiles(packageSetting);
            return false;
        }
        return true;
    }

    public void onUserCreated(VUserInfo vUserInfo) {
        FileUtils.ensureDirCreate(VEnvironment.getDataUserDirectory(vUserInfo.id));
    }

    public void reInstallVApp(PackageSetting packageSetting) {
        Uri parse;
        File[] listFiles;
        if (packageSetting.dynamic) {
            parse = Uri.parse("package:" + packageSetting.packageName);
        } else {
            File packageFile = VEnvironment.getPackageFile(packageSetting.packageName);
            if (!packageFile.exists()) {
                packageFile = VEnvironment.getPackageFileExt(packageSetting.packageName);
            }
            if (packageFile.exists()) {
                parse = Uri.fromFile(packageFile);
            } else {
                parse = Uri.parse("package:" + packageSetting.packageName);
            }
        }
        if (parse != null) {
            if (installPackageInternal(parse, new VAppInstallerParams(26, 1)).status == 0) {
                PackageCacheManager.getSetting(packageSetting.packageName).userState = packageSetting.userState;
            } else {
                VLog.e("PackagePersistenceLayer", "update package info failed : install %s failed", packageSetting.packageName);
            }
        }
        if (!packageSetting.dynamic && (listFiles = VEnvironment.getSplitPackageFile(packageSetting.packageName, "no_use").getParentFile().listFiles(new FileFilter() { // from class: com.lody.virtual.server.pm.VAppManagerService.3
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return file.getName().endsWith(".apk") && file.getName().startsWith("split_");
            }
        })) != null && listFiles.length > 0) {
            VAppInstallerParams vAppInstallerParams = new VAppInstallerParams(10);
            for (File file : listFiles) {
                if (installPackageInternal(Uri.fromFile(file), vAppInstallerParams).status != 0) {
                    VLog.e("PackagePersistenceLayer", "update split package info failed : install %s apk:%s failed", packageSetting.packageName, file.getAbsolutePath());
                }
            }
        }
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public void registerObserver(IPackageObserver iPackageObserver) {
        try {
            this.mRemoteCallbackList.register(iPackageObserver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    void restoreFactoryState() {
        VLog.w(TAG, "Warning: Restore the factory state...", new Object[0]);
        FileUtils.deleteDir(VEnvironment.getRoot());
        VEnvironment.systemReady();
    }

    public void savePersistenceData() {
        this.mPersistenceLayer.save();
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public void scanApps() {
        if (this.mScanning) {
            return;
        }
        synchronized (this) {
            try {
                this.mScanning = true;
                this.mPersistenceLayer.read();
                PackagePersistenceLayer packagePersistenceLayer = this.mPersistenceLayer;
                if (packagePersistenceLayer.changed) {
                    packagePersistenceLayer.changed = false;
                    packagePersistenceLayer.save();
                    VLog.w(TAG, "Package PersistenceLayer updated.", new Object[0]);
                }
                installOrUpdateMediaProvider();
                List<VUserInfo> users = VUserManagerService.get().getUsers(true);
                for (String str : SpecialComponentList.getPreInstallPackages()) {
                    boolean isAppInstalled = isAppInstalled(str);
                    if (!isAppInstalled) {
                        try {
                            VirtualCore.get().getHostPackageManager().getApplicationInfo(str, 0L);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                    for (VUserInfo vUserInfo : users) {
                        if (!isAppInstalled && vUserInfo.id == 0) {
                            installPackageInternal(Uri.parse("package:" + str), new VAppInstallerParams(10, 1));
                        } else if (!isAppInstalledAsUser(vUserInfo.id, str)) {
                            installPackageAsUser(vUserInfo.id, str);
                        }
                    }
                }
                VAccountManagerService.get().refreshAuthenticatorCache(null);
            } finally {
                this.mScanning = false;
            }
        }
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public void setPackageHidden(int i5, String str, boolean z4) {
        PackageSetting setting = PackageCacheManager.getSetting(str);
        if (setting != null && VUserManagerService.get().exists(i5)) {
            setting.setHidden(i5, z4);
            this.mPersistenceLayer.save();
        }
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public synchronized boolean uninstallPackage(String str) {
        PackageSetting setting = PackageCacheManager.getSetting(str);
        if (setting != null) {
            uninstallPackageFully(setting, true);
            return true;
        }
        return false;
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public synchronized boolean uninstallPackageAsUser(String str, int i5) {
        if (!VUserManagerService.get().exists(i5)) {
            return false;
        }
        PackageSetting setting = PackageCacheManager.getSetting(str);
        if (setting == null) {
            return false;
        }
        int[] packageInstalledUsers = getPackageInstalledUsers(str);
        if (!ArrayUtils.contains(packageInstalledUsers, i5)) {
            return false;
        }
        if (packageInstalledUsers.length <= 1) {
            uninstallPackageFully(setting, true);
        } else {
            cleanPackageData(str, i5);
            setting.setInstalled(i5, false);
            this.mPersistenceLayer.save();
            notifyAppUninstalled(setting, i5);
        }
        return true;
    }

    @Override // com.lody.virtual.server.interfaces.IAppManager
    public void unregisterObserver(IPackageObserver iPackageObserver) {
        try {
            this.mRemoteCallbackList.unregister(iPackageObserver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
