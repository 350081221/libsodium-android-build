package com.huawei.hms.hatool;

import java.util.Map;

/* loaded from: classes3.dex */
public abstract class c {
    public static void a(String str, String str2, long j5) {
        k h5 = h(str, str2);
        if (h5 != null) {
            h5.a(j5);
        }
    }

    public static boolean a(String str, String str2) {
        k h5 = h(str, str2);
        if (h5 != null) {
            return h5.a();
        }
        return true;
    }

    public static int b(String str, String str2) {
        k h5 = h(str, str2);
        if (h5 != null) {
            return h5.d();
        }
        return 7;
    }

    public static boolean c(String str, String str2) {
        k h5 = h(str, str2);
        if (h5 != null) {
            return h5.g();
        }
        return true;
    }

    public static String d(String str, String str2) {
        k h5 = h(str, str2);
        return h5 != null ? h5.f() : "";
    }

    public static boolean e(String str, String str2) {
        k h5 = h(str, str2);
        if (h5 != null) {
            return h5.i();
        }
        return false;
    }

    public static String f(String str, String str2) {
        k h5 = h(str, str2);
        return h5 != null ? h5.h() : "";
    }

    public static String g(String str, String str2) {
        k h5 = h(str, str2);
        return h5 != null ? h5.n() : "";
    }

    public static k h(String str, String str2) {
        m a5 = i.c().a(str);
        if (a5 == null) {
            return null;
        }
        if (!"alltype".equals(str2)) {
            return a5.a(str2);
        }
        k a6 = a5.a("oper");
        return a6 == null ? a5.a("maint") : a6;
    }

    public static Map<String, String> i(String str, String str2) {
        k h5 = h(str, str2);
        if (h5 != null) {
            return h5.k();
        }
        return null;
    }

    public static long j(String str, String str2) {
        k h5 = h(str, str2);
        if (h5 != null) {
            return h5.l();
        }
        return 0L;
    }

    public static int k(String str, String str2) {
        k h5 = h(str, str2);
        if (h5 != null) {
            return h5.b();
        }
        return 10;
    }

    public static String l(String str, String str2) {
        k h5 = h(str, str2);
        return h5 != null ? h5.o() : "";
    }

    public static String m(String str, String str2) {
        k h5 = h(str, str2);
        return h5 != null ? h5.q() : "";
    }

    public static String n(String str, String str2) {
        k h5 = h(str, str2);
        return h5 != null ? h5.m() : "";
    }

    public static String o(String str, String str2) {
        k h5 = h(str, str2);
        return h5 != null ? h5.p() : "";
    }
}
