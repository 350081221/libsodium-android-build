package com.bytedance.pangle.util;

import android.os.Build;

/* loaded from: classes2.dex */
public final class i {
    public static boolean a() {
        return true;
    }

    public static boolean b() {
        return false;
    }

    public static boolean c() {
        return false;
    }

    public static boolean d() {
        return false;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT <= 25;
    }

    public static boolean f() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 >= 26 && i5 <= 28;
    }

    public static boolean g() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 >= 29 && i5 <= 30;
    }

    public static boolean h() {
        return true;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean j() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 28) {
            return i5 == 27 && Build.VERSION.PREVIEW_SDK_INT > 0;
        }
        return true;
    }

    public static boolean k() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 31) {
            return i5 == 30 && Build.VERSION.PREVIEW_SDK_INT > 0;
        }
        return true;
    }
}
