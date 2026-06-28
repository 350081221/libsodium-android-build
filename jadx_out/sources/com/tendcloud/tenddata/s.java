package com.tendcloud.tenddata;

import android.content.Context;

/* loaded from: classes3.dex */
public class s {
    public static void a(Context context, String str, String str2, long j5) {
        try {
            context.getSharedPreferences(str, 0).edit().putLong(str2, j5).commit();
        } catch (Throwable unused) {
        }
    }

    public static long b(Context context, String str, String str2, long j5) {
        try {
            return context.getSharedPreferences(str, 0).getLong(str2, j5);
        } catch (Throwable unused) {
            return j5;
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        try {
            context.getSharedPreferences(str, 0).edit().putString(str2, str3).commit();
        } catch (Throwable unused) {
        }
    }

    public static String b(Context context, String str, String str2, String str3) {
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable unused) {
            return str3;
        }
    }
}
