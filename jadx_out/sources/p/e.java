package p;

import android.content.pm.SharedLibraryInfo;
import android.os.Build;
import java.io.File;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static e f22257a = new e();

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static e b() {
        return f22257a;
    }

    public static String c() {
        return SharedLibraryInfo.PLATFORM_PACKAGE_NAME;
    }

    public static boolean d() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i5 = 0; i5 < 5; i5++) {
            try {
                if (new File(strArr[i5] + "su").exists()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean e() {
        try {
            if (!Build.HARDWARE.contains("goldfish") && !Build.PRODUCT.contains(com.umeng.ccg.a.f12839r)) {
                if (!Build.FINGERPRINT.contains("generic")) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String f() {
        return Build.BOARD;
    }

    public static String g() {
        return Build.BRAND;
    }

    public static String h() {
        return Build.DEVICE;
    }

    public static String i() {
        return Build.DISPLAY;
    }

    public static String j() {
        return Build.VERSION.INCREMENTAL;
    }

    public static String k() {
        return Build.MANUFACTURER;
    }

    public static String l() {
        return Build.MODEL;
    }

    public static String m() {
        return Build.PRODUCT;
    }

    public static String n() {
        return Build.VERSION.RELEASE;
    }

    public static String o() {
        return Build.VERSION.SDK;
    }

    public static String p() {
        return Build.TAGS;
    }

    public static String q() {
        return a("ro.kernel.qemu", "0");
    }
}
