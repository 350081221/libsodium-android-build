package com.huawei.hms.hatool;

/* loaded from: classes3.dex */
public abstract class a {
    public static String a(String str, String str2) {
        j c5 = c(str, str2);
        return c5 != null ? c5.a() : "";
    }

    public static boolean b(String str, String str2) {
        j c5 = c(str, str2);
        return c5 != null && c5.e();
    }

    public static j c(String str, String str2) {
        k a5;
        m a6 = i.c().a(str);
        if (a6 == null || (a5 = a6.a(str2)) == null) {
            return null;
        }
        return a5.j();
    }

    public static String d(String str, String str2) {
        j c5 = c(str, str2);
        return c5 != null ? c5.b() : "";
    }

    public static boolean e(String str, String str2) {
        j c5 = c(str, str2);
        return c5 != null && c5.f();
    }

    public static boolean f(String str, String str2) {
        k a5;
        m a6 = i.c().a(str);
        if (a6 == null || (a5 = a6.a(str2)) == null) {
            return false;
        }
        return a5.c();
    }

    public static String g(String str, String str2) {
        j c5 = c(str, str2);
        return c5 != null ? c5.d() : "";
    }

    public static boolean h(String str, String str2) {
        j c5 = c(str, str2);
        return c5 != null && c5.g();
    }

    public static boolean i(String str, String str2) {
        k a5;
        m a6 = i.c().a(str);
        if (a6 == null || (a5 = a6.a(str2)) == null) {
            return false;
        }
        return a5.e();
    }

    public static String j(String str, String str2) {
        j c5 = c(str, str2);
        return c5 != null ? c5.c() : "";
    }

    public static boolean k(String str, String str2) {
        j c5 = c(str, str2);
        return c5 != null && c5.h();
    }
}
