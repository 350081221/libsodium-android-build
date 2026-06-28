package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9033a = "aegis";

    /* renamed from: b, reason: collision with root package name */
    private static SharedPreferences f9034b;

    public static int a(String str, int i5, Context context) {
        return f(context).getInt(str, i5);
    }

    public static long b(String str, long j5, Context context) {
        return f(context).getLong(str, j5);
    }

    public static String c(String str, String str2, Context context) {
        return f(context).getString(str, str2);
    }

    public static void d(Context context) {
        f(context).edit().clear().apply();
    }

    public static void e(String str, Context context) {
        f(context).edit().remove(str).apply();
    }

    public static synchronized SharedPreferences f(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (k.class) {
            if (f9034b == null) {
                f9034b = context.createDeviceProtectedStorageContext().getSharedPreferences(f9033a, 0);
            }
            sharedPreferences = f9034b;
        }
        return sharedPreferences;
    }

    public static void g(String str, int i5, Context context) {
        f(context).edit().putInt(str, i5).apply();
    }

    public static void h(String str, long j5, Context context) {
        f(context).edit().putLong(str, j5).apply();
    }

    public static void i(String str, String str2, Context context) {
        f(context).edit().putString(str, str2).apply();
    }
}
