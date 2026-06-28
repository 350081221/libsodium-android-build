package com.lody.virtual.os;

import android.content.Context;
import android.util.Base64;
import com.android.dex.DexFormat;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.EncodeUtils;
import com.lody.virtual.helper.utils.FileUtils;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public class VEnvironment {
    private static final File DATA_APP_DIRECTORY;
    private static final File DATA_APP_DIRECTORY_EXT;
    private static final File DATA_APP_SYSTEM_DIRECTORY;
    private static final File DATA_DIRECTORY;
    private static final File DATA_DIRECTORY_EXT;
    private static final File DATA_USER_DE_DIRECTORY;
    private static final File DATA_USER_DE_DIRECTORY_EXT;
    private static final File DATA_USER_DIRECTORY;
    private static final File DATA_USER_DIRECTORY_EXT;
    private static final File FRAMEWORK_DIRECTORY;
    private static final File FRAMEWORK_DIRECTORY_EXT;
    private static final File ROOT;
    private static final File ROOT_DATA_USER;
    private static final File ROOT_EXT;
    private static final File ROOT_EXT_DATA_USER;
    private static final String TAG = "VEnvironment";
    public static int OUTSIDE_APP_UID = VUserHandle.getUid(VUserHandle.realUserId(), OUTSIDE_APP_UID);
    public static int OUTSIDE_APP_UID = VUserHandle.getUid(VUserHandle.realUserId(), OUTSIDE_APP_UID);
    public static int UNKNOWN_APP_UID = VUserHandle.getUid(VUserHandle.realUserId(), UNKNOWN_APP_UID);
    public static int UNKNOWN_APP_UID = VUserHandle.getUid(VUserHandle.realUserId(), UNKNOWN_APP_UID);
    public static int SYSTEM_UID = VUserHandle.getUid(VUserHandle.realUserId(), SYSTEM_UID);
    public static int SYSTEM_UID = VUserHandle.getUid(VUserHandle.realUserId(), SYSTEM_UID);

    static {
        File parentFile;
        try {
            parentFile = new File(getContext().getApplicationInfo().dataDir).getCanonicalFile().getParentFile();
        } catch (IOException unused) {
            parentFile = new File(getContext().getApplicationInfo().dataDir).getParentFile();
        }
        File file = new File(parentFile, StubManifest.PACKAGE_NAME);
        File buildPath = buildPath(file, "virtual");
        ROOT = buildPath;
        ROOT_DATA_USER = buildPath(new File("/data/user/" + VUserHandle.realUserId() + "/" + StubManifest.PACKAGE_NAME), "virtual");
        FRAMEWORK_DIRECTORY = buildPath(buildPath, "framework");
        File buildPath2 = buildPath(buildPath, "data");
        DATA_DIRECTORY = buildPath2;
        DATA_USER_DIRECTORY = buildPath(buildPath2, "user");
        DATA_USER_DE_DIRECTORY = buildPath(buildPath2, "user_de");
        File buildPath3 = buildPath(buildPath2, "app");
        DATA_APP_DIRECTORY = buildPath3;
        DATA_APP_SYSTEM_DIRECTORY = buildPath(buildPath3, "system");
        File file2 = new File(parentFile, StubManifest.EXT_PACKAGE_NAME);
        if (!VirtualCore.get().isSharedUserId()) {
            file = file2;
        }
        File buildPath4 = buildPath(file, "virtual");
        ROOT_EXT = buildPath4;
        ROOT_EXT_DATA_USER = buildPath(new File("/data/user/" + VUserHandle.realUserId() + "/" + StubManifest.EXT_PACKAGE_NAME), "virtual");
        File buildPath5 = buildPath(buildPath4, "data");
        DATA_DIRECTORY_EXT = buildPath5;
        DATA_USER_DIRECTORY_EXT = buildPath(buildPath5, "user");
        DATA_APP_DIRECTORY_EXT = buildPath(buildPath5, "app");
        DATA_USER_DE_DIRECTORY_EXT = buildPath(buildPath5, "user_de");
        FRAMEWORK_DIRECTORY_EXT = buildPath(buildPath4, "framework");
    }

    public static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (file == null) {
                file = new File(str);
            } else {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static void chmodPackageDictionary(File file) {
        try {
            if (FileUtils.isSymlink(file)) {
                return;
            }
            FileUtils.chmod(file.getParentFile().getAbsolutePath(), 493);
            FileUtils.chmod(file.getAbsolutePath(), 493);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static boolean enableMediaRedirect() {
        return false;
    }

    public static File getAccountConfigFile() {
        return new File(DATA_APP_SYSTEM_DIRECTORY, "account-list.ini");
    }

    public static File getAccountVisibilityConfigFile() {
        return new File(DATA_APP_SYSTEM_DIRECTORY, "account-visibility-list.ini");
    }

    public static File getBakUidListFile() {
        return new File(DATA_APP_SYSTEM_DIRECTORY, "uid-list.ini.bak");
    }

    private static Context getContext() {
        return VirtualCore.get().getContext();
    }

    public static File getDataAppDirectory() {
        return DATA_APP_DIRECTORY;
    }

    public static File getDataAppDirectoryExt() {
        return DATA_APP_DIRECTORY_EXT;
    }

    public static File getDataAppLibDirectory(String str) {
        return buildPath(getDataAppPackageDirectory(str), "lib");
    }

    public static File getDataAppLibDirectoryExt(String str) {
        return buildPath(getDataAppPackageDirectoryExt(str), "lib");
    }

    public static File getDataAppLibDirectoryExt_DataUser(String str) {
        return buildPath(buildPath(buildPath(buildPath(ROOT_EXT_DATA_USER, "data"), "app"), str), "lib");
    }

    public static File getDataAppLibDirectory_DataUser(String str) {
        return buildPath(buildPath(buildPath(buildPath(ROOT_DATA_USER, "data"), "app"), str), "lib");
    }

    public static File getDataAppPackageDirectory(String str) {
        return buildPath(DATA_APP_DIRECTORY, str);
    }

    public static File getDataAppPackageDirectoryExt(String str) {
        return buildPath(DATA_APP_DIRECTORY_EXT, str);
    }

    public static File getDataDirectory() {
        return DATA_DIRECTORY;
    }

    public static File getDataSystemDirectory(int i5) {
        return buildPath(getDataUserDirectory(i5), "system");
    }

    public static File getDataSystemDirectoryExt(int i5) {
        return buildPath(getDataUserDirectoryExt(i5), "system");
    }

    public static File getDataUserDeDirectory() {
        return DATA_USER_DE_DIRECTORY;
    }

    public static File getDataUserDirectory() {
        return DATA_USER_DIRECTORY;
    }

    public static File getDataUserDirectoryExt() {
        return DATA_USER_DIRECTORY_EXT;
    }

    public static File getDataUserPackageDirectory(int i5, String str) {
        return buildPath(getDataUserDirectory(i5), str);
    }

    public static File getDataUserPackageDirectoryExt(int i5, String str) {
        return buildPath(getDataUserDirectoryExt(i5), str);
    }

    public static File getDataUserPackageDirectoryExt_DataUser(int i5, String str) {
        return buildPath(buildPath(buildPath(buildPath(ROOT_EXT_DATA_USER, "data"), "user"), String.valueOf(i5)), str);
    }

    public static File getDataUserPackageDirectory_DataUser(int i5, String str) {
        return buildPath(buildPath(buildPath(buildPath(ROOT_DATA_USER, "data"), "user"), String.valueOf(i5)), str);
    }

    public static File getDeDataUserDirectoryExt() {
        return DATA_USER_DE_DIRECTORY_EXT;
    }

    public static File getDeDataUserPackageDirectory(int i5, String str) {
        return buildPath(getDataUserDeDirectory(i5), str);
    }

    public static File getDeDataUserPackageDirectoryExt(int i5, String str) {
        return buildPath(getDeDataUserDirectoryExt(i5), str);
    }

    public static File getDeDataUserPackageDirectoryExtRoot(int i5) {
        return buildPath(getDeDataUserDirectoryExt(i5), new String[0]);
    }

    public static File getDeDataUserPackageDirectoryRoot(int i5) {
        return buildPath(getDataUserDeDirectory(i5), new String[0]);
    }

    public static File getDeviceInfoFile() {
        return new File(DATA_APP_SYSTEM_DIRECTORY, "device-config.ini");
    }

    public static File getFrameworkDirectory(String str) {
        return buildPath(FRAMEWORK_DIRECTORY, str);
    }

    public static File getFrameworkDirectoryExt() {
        return FRAMEWORK_DIRECTORY_EXT;
    }

    public static File getFrameworkFile(String str) {
        return new File(getFrameworkDirectory(str), "extracted.jar");
    }

    public static File getJobConfigFile() {
        return new File(DATA_APP_SYSTEM_DIRECTORY, "job-list.ini");
    }

    public static File getNativeCacheDir(boolean z4) {
        return buildPath(z4 ? ROOT_EXT : ROOT, ".native");
    }

    public static File getOatDirectory(String str) {
        return buildPath(getDataAppPackageDirectory(str), "oat");
    }

    public static File getOatDirectoryExt(String str) {
        return buildPath(getDataAppPackageDirectoryExt(str), "oat");
    }

    public static File getOatFile(String str, String str2) {
        return buildPath(getOatDirectory(str), str2, "base.odex");
    }

    public static File getOatFileExt(String str, String str2) {
        return buildPath(getOatDirectoryExt(str), str2, "base.odex");
    }

    public static File getOptimizedFrameworkFile(String str) {
        return new File(getFrameworkDirectory(str), DexFormat.DEX_IN_JAR_NAME);
    }

    public static File getPackageCacheFile(String str) {
        return new File(getDataAppPackageDirectory(str), "package.ini");
    }

    public static File getPackageFile(String str) {
        return new File(getDataAppPackageDirectory(str), EncodeUtils.decodeBase64("YmFzZS5hcGs="));
    }

    public static File getPackageFileExt(String str) {
        return new File(getDataAppPackageDirectoryExt(str), EncodeUtils.decodeBase64("YmFzZS5hcGs="));
    }

    public static String getPackageFileStub(String str) {
        if (BuildCompat.isOreo()) {
            return String.format(EncodeUtils.decodeBase64("L2RhdGEvYXBwLyVzLSVzL2Jhc2UuYXBr"), str, Base64.encodeToString(str.getBytes(), 10));
        }
        return String.format(EncodeUtils.decodeBase64("L2RhdGEvYXBwLyVzLTEvYmFzZS5hcGs="), str);
    }

    public static File getPackageInstallerStageDir() {
        return buildPath(DATA_APP_SYSTEM_DIRECTORY, ".session_dir");
    }

    public static File getPackageListFile() {
        return new File(DATA_APP_SYSTEM_DIRECTORY, "packages.ini");
    }

    public static File getRoot() {
        return ROOT;
    }

    public static File getRootExt() {
        return ROOT_EXT;
    }

    public static File getSignatureFile(String str) {
        return new File(getDataAppPackageDirectory(str), "signature.ini");
    }

    public static String getSplitFileName(String str) {
        return "split_" + str + ".apk";
    }

    public static File getSplitPackageFile(String str, String str2) {
        return new File(getDataAppPackageDirectory(str), getSplitFileName(str2));
    }

    public static File getSplitPackageFileExt(String str, String str2) {
        return new File(getDataAppPackageDirectoryExt(str), getSplitFileName(str2));
    }

    public static File getSyncDirectory() {
        return buildPath(DATA_APP_SYSTEM_DIRECTORY, "sync");
    }

    public static File getSystemSettingsFile(int i5) {
        return new File(getDataSystemDirectory(i5), "settings.ini");
    }

    public static File getUidListFile() {
        return new File(DATA_APP_SYSTEM_DIRECTORY, "uid-list.ini");
    }

    public static File getUserAppLibDirectory(int i5, String str) {
        return new File(getDataUserPackageDirectory(i5, str), "lib");
    }

    public static File getUserAppLibDirectoryExt(int i5, String str) {
        return new File(getDataUserPackageDirectoryExt(i5, str), "lib");
    }

    public static File getVSConfigFile() {
        return new File(DATA_APP_SYSTEM_DIRECTORY, "vss.ini");
    }

    public static File getVirtualLocationFile() {
        return new File(DATA_APP_SYSTEM_DIRECTORY, "virtual-loc.ini");
    }

    public static File getWifiMacFile(int i5, boolean z4) {
        if (z4) {
            return new File(getDataSystemDirectoryExt(i5), "wifiMacAddress");
        }
        return new File(getDataSystemDirectory(i5), "wifiMacAddress");
    }

    public static void systemReady() {
        File file = DATA_DIRECTORY;
        FileUtils.ensureDirCreate(file);
        File file2 = DATA_APP_DIRECTORY;
        FileUtils.ensureDirCreate(file2);
        FileUtils.ensureDirCreate(DATA_APP_SYSTEM_DIRECTORY);
        FileUtils.ensureDirCreate(DATA_USER_DIRECTORY);
        FileUtils.ensureDirCreate(DATA_USER_DE_DIRECTORY);
        FileUtils.ensureDirCreate(FRAMEWORK_DIRECTORY);
        FileUtils.chmod(ROOT.getAbsolutePath(), 493);
        FileUtils.chmod(file.getAbsolutePath(), 493);
        FileUtils.chmod(file2.getAbsolutePath(), 493);
    }

    public static File getDataUserDeDirectory(int i5) {
        return buildPath(DATA_USER_DE_DIRECTORY, String.valueOf(i5));
    }

    public static File getDataUserDirectory(int i5) {
        return buildPath(DATA_USER_DIRECTORY, String.valueOf(i5));
    }

    public static File getDataUserDirectoryExt(int i5) {
        return buildPath(DATA_USER_DIRECTORY_EXT, String.valueOf(i5));
    }

    public static File getDeDataUserDirectoryExt(int i5) {
        return buildPath(DATA_USER_DE_DIRECTORY_EXT, String.valueOf(i5));
    }

    public static File getFrameworkDirectory() {
        return FRAMEWORK_DIRECTORY;
    }
}
