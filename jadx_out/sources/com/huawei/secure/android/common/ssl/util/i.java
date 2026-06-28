package com.huawei.secure.android.common.ssl.util;

import android.util.Log;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9031a = "SecurityComp10200302: ";

    private static String a(String str) {
        return f9031a + str;
    }

    public static void b(String str, String str2) {
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e(a(str), str2, th);
    }

    public static void d(String str, String str2) {
        Log.e(a(str), str2);
    }

    public static void e(String str, String str2) {
        Log.i(a(str), str2);
    }

    public static void f(String str, String str2) {
        Log.v(a(str), str2);
    }

    public static void g(String str, String str2) {
        Log.w(a(str), str2);
    }
}
