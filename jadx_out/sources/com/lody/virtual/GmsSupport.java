package com.lody.virtual;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.HostPackageManager;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.remote.VAppInstallerParams;
import com.lody.virtual.remote.VAppInstallerResult;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class GmsSupport {
    public static final String GMS_PKG = "com.google.android.gms";
    private static final HashSet<String> GOOGLE_APP;
    private static final HashSet<String> GOOGLE_SERVICE;
    public static final String GSF_PKG = "com.google.android.gsf";
    public static final HashSet<String> PERMISSION_FORCE_GRANT;
    private static final String TAG = "GmsSupport";
    public static final String VENDING_PKG = "com.android.vending";

    static {
        HashSet<String> hashSet = new HashSet<>();
        GOOGLE_APP = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        GOOGLE_SERVICE = hashSet2;
        HashSet<String> hashSet3 = new HashSet<>();
        PERMISSION_FORCE_GRANT = hashSet3;
        hashSet.add(VENDING_PKG);
        hashSet.add("com.google.android.play.games");
        hashSet.add("com.google.android.wearable.app");
        hashSet.add("com.google.android.wearable.app.cn");
        hashSet2.add(GMS_PKG);
        hashSet2.add(GSF_PKG);
        hashSet2.add("com.google.android.gsf.login");
        hashSet2.add("com.google.android.backuptransport");
        hashSet2.add("com.google.android.backup");
        hashSet2.add("com.google.android.configupdater");
        hashSet2.add("com.google.android.syncadapters.contacts");
        hashSet2.add("com.google.android.feedback");
        hashSet2.add("com.google.android.onetimeinitializer");
        hashSet2.add("com.google.android.partnersetup");
        hashSet2.add("com.google.android.setupwizard");
        hashSet2.add("com.google.android.syncadapters.calendar");
        hashSet3.add("android.permission.READ_SMS");
    }

    public static void installDynamicGms(int i5) {
        VirtualCore virtualCore = VirtualCore.get();
        if (i5 == 0) {
            VAppInstallerParams vAppInstallerParams = new VAppInstallerParams(2);
            VAppInstallerResult installPackage = virtualCore.installPackage(Uri.parse("package:com.google.android.gsf"), vAppInstallerParams);
            String str = TAG;
            VLog.w(str, "install gsf result:" + installPackage.status, new Object[0]);
            VLog.w(str, "install gms result:" + virtualCore.installPackage(Uri.parse("package:com.google.android.gms"), vAppInstallerParams).status, new Object[0]);
            VLog.w(str, "install vending result:" + virtualCore.installPackage(Uri.parse("package:com.android.vending"), vAppInstallerParams).status, new Object[0]);
            return;
        }
        virtualCore.installPackageAsUser(i5, GMS_PKG);
        virtualCore.installPackageAsUser(i5, GSF_PKG);
        virtualCore.installPackageAsUser(i5, VENDING_PKG);
    }

    public static void installGApps(File file, int i5) {
        installPackages(file, i5);
    }

    private static void installPackages(File file, int i5) {
        VirtualCore virtualCore = VirtualCore.get();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.getName().endsWith(".apk")) {
                    String path = file2.getPath();
                    VAppInstallerResult installPackage = virtualCore.installPackage(Uri.fromFile(file2), new VAppInstallerParams(2));
                    if (installPackage.status == 0) {
                        VLog.w(TAG, "install gms pkg success:" + path, new Object[0]);
                    } else {
                        VLog.w(TAG, "install gms pkg fail:" + path + ",error : " + installPackage.status, new Object[0]);
                    }
                }
            }
        }
    }

    public static boolean isGoogleAppOrService(String str) {
        return GOOGLE_APP.contains(str) || GOOGLE_SERVICE.contains(str);
    }

    public static boolean isGoogleFrameworkInstalled() {
        return VirtualCore.get().isAppInstalled(GMS_PKG);
    }

    public static boolean isGoogleService(String str) {
        return GOOGLE_SERVICE.contains(str);
    }

    public static boolean isInstallGMS(int i5) {
        if (isInstalledGoogleService()) {
            for (int i6 : VirtualCore.get().getPackageInstalledUsers(GMS_PKG)) {
                if (i5 == i6) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isInstalledGoogleService() {
        return VirtualCore.get().isAppInstalled(GMS_PKG);
    }

    public static boolean isOutsideGoogleFrameworkExist() {
        return VirtualCore.get().isOutsideInstalled(GMS_PKG) && VirtualCore.get().isOutsideInstalled(GSF_PKG);
    }

    public static boolean isOutsideSupportGms() {
        ApplicationInfo applicationInfo;
        HostPackageManager hostPackageManager = VirtualCore.get().getHostPackageManager();
        ApplicationInfo applicationInfo2 = null;
        try {
            applicationInfo = hostPackageManager.getApplicationInfo(GMS_PKG, 0L);
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            return false;
        }
        try {
            applicationInfo2 = hostPackageManager.getApplicationInfo(GSF_PKG, 0L);
        } catch (PackageManager.NameNotFoundException e6) {
            e6.printStackTrace();
        }
        if (applicationInfo2 == null) {
            return false;
        }
        return true;
    }

    public static void remove(String str) {
        GOOGLE_SERVICE.remove(str);
        GOOGLE_APP.remove(str);
    }
}
