package com.bytedance.android.alog;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Alog f3177a;

    public static void a(Alog alog) {
        f3177a = alog;
        Alog.nativeSetDefaultInstance(alog == null ? 0L : alog.d());
    }

    public static void b(String str, String str2) {
        a(1, str, str2);
    }

    public static void c(String str, String str2) {
        a(2, str, str2);
    }

    public static void d(String str, String str2) {
        a(3, str, str2);
    }

    public static void e(String str, String str2) {
        a(4, str, str2);
    }

    public static long b() {
        Alog alog = f3177a;
        if (alog != null) {
            return alog.c();
        }
        return 0L;
    }

    public static void a(int i5, String str, String str2) {
        Alog alog = f3177a;
        if (alog != null) {
            alog.a(i5, str, str2);
        }
    }

    public static void a(int i5, String str, String str2, long j5, long j6) {
        Alog alog = f3177a;
        if (alog != null) {
            alog.a(i5, str, str2, j5, j6);
        }
    }

    public static void a() {
        Alog alog = f3177a;
        if (alog != null) {
            alog.b();
        }
    }

    public static void a(String str, String str2) {
        a(0, str, str2);
    }
}
