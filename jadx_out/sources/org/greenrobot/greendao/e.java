package org.greenrobot.greendao;

import android.util.Log;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21347a = "greenDAO";

    /* renamed from: b, reason: collision with root package name */
    public static final int f21348b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f21349c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f21350d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f21351e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f21352f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f21353g = 7;

    public static int a(String str) {
        return Log.d(f21347a, str);
    }

    public static int b(String str, Throwable th) {
        return Log.d(f21347a, str, th);
    }

    public static int c(String str) {
        return Log.w(f21347a, str);
    }

    public static int d(String str, Throwable th) {
        return Log.e(f21347a, str, th);
    }

    public static String e(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static int f(String str) {
        return Log.i(f21347a, str);
    }

    public static int g(String str, Throwable th) {
        return Log.i(f21347a, str, th);
    }

    public static boolean h(int i5) {
        return Log.isLoggable(f21347a, i5);
    }

    public static int i(int i5, String str) {
        return Log.println(i5, f21347a, str);
    }

    public static int j(String str) {
        return Log.v(f21347a, str);
    }

    public static int k(String str, Throwable th) {
        return Log.v(f21347a, str, th);
    }

    public static int l(String str) {
        return Log.w(f21347a, str);
    }

    public static int m(String str, Throwable th) {
        return Log.w(f21347a, str, th);
    }

    public static int n(Throwable th) {
        return Log.w(f21347a, th);
    }
}
