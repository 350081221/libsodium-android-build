package com.huawei.secure.android.common.detect;

import android.os.Build;
import java.io.File;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8864a = "RootDetect";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8865b = "/sbin:/vendor/bin:/system/sbin:/system/bin:/system/xbin:/system/bin/.ext:/system/sd/xbin:/system/usr/we-need-root:/cache:/data:/dev:/system/vendor/bin:/vendor/xbin:/system/vendor/xbin:";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8866c = "su";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8867d = "magisk";

    private c() {
    }

    private static boolean a() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        return false;
    }

    private static boolean b(String str) {
        for (String str2 : f8865b.split(":")) {
            if (new File(str2 + File.separator + str).exists()) {
                return true;
            }
        }
        return false;
    }

    private static boolean c() {
        try {
            if (!Build.HARDWARE.contains("goldfish") && !Build.FINGERPRINT.contains("generic")) {
                String str = Build.MODEL;
                if (!str.contains("google_sdk") && !str.contains("Emulator") && !str.contains("Android SDK built for x86") && !str.contains("Android SDK built for arm64")) {
                    if (!"google_sdk".equals(Build.PRODUCT)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Exception e5) {
            z1.c.d(f8864a, "Check emulator " + e5.getMessage());
            return false;
        }
    }

    private static boolean d() {
        return b(f8867d);
    }

    private static boolean e() {
        return "0".equals(z1.d.i("ro.secure"));
    }

    private static boolean f() {
        return b(f8866c);
    }

    private static boolean g() {
        if (f()) {
            z1.c.d(f8864a, "su file exists");
            return true;
        }
        if (e()) {
            z1.c.d(f8864a, "SecureProperty is wrong");
            return true;
        }
        if (c()) {
            z1.c.e(f8864a, "app run in emulator");
            return true;
        }
        if (a()) {
            z1.c.e(f8864a, "build.tags is wrong");
            return true;
        }
        if (d()) {
            z1.c.d(f8864a, "Magisk exists");
            return true;
        }
        return false;
    }

    public static boolean h() {
        if (Build.VERSION.SDK_INT >= 27) {
            try {
                if (f.b()) {
                    z1.c.d(f8864a, "Emui 10, root exists");
                    return true;
                }
            } catch (Exception e5) {
                z1.c.d(f8864a, "isRoot exception : " + e5.getMessage());
            }
            try {
                if (SD.irtj()) {
                    z1.c.d(f8864a, "root exists");
                    return true;
                }
                return false;
            } catch (Throwable th) {
                z1.c.d(f8864a, "SD.irtj isRoot exception : " + th.getMessage());
                return g();
            }
        }
        return g();
    }
}
