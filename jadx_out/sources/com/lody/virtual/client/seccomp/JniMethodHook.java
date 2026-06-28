package com.lody.virtual.client.seccomp;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VPackageManager;

/* loaded from: classes3.dex */
public class JniMethodHook {
    private static JniMethodHook sIns = new JniMethodHook();

    private static void changeApplicationInfoPathToReal(ApplicationInfo applicationInfo) {
    }

    public static JniMethodHook getInstance() {
        return sIns;
    }

    public static boolean isIsolated() {
        return true;
    }

    public ApplicationInfo getApplicationInfo(String str, int i5, int i6) {
        try {
            if (VirtualCore.get().isAppInstalled(str)) {
                ApplicationInfo applicationInfo = VPackageManager.get().getApplicationInfo(str, i5, 0);
                changeApplicationInfoPathToReal(applicationInfo);
                return applicationInfo;
            }
            return VirtualCore.get().getHostPackageManager().getApplicationInfo(str, i5);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public PackageInfo getPackageInfo(String str, int i5, int i6) {
        try {
            if (VirtualCore.get().isAppInstalled(str)) {
                PackageInfo packageInfo = VPackageManager.get().getPackageInfo(str, i5, 0);
                changeApplicationInfoPathToReal(packageInfo.applicationInfo);
                return packageInfo;
            }
            return VirtualCore.get().getHostPackageManager().getPackageInfo(str, i5);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public ApplicationInfo getApplicationInfo(String str, long j5, int i5) {
        return getApplicationInfo(str, (int) j5, i5);
    }

    public PackageInfo getPackageInfo(String str, long j5, int i5) {
        return getPackageInfo(str, (int) j5, i5);
    }

    public ApplicationInfo getApplicationInfo(String str, int i5) {
        return getApplicationInfo(str, i5, 0);
    }
}
