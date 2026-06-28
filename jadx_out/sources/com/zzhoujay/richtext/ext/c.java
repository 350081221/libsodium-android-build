package com.zzhoujay.richtext.ext;

import android.util.Log;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15714a = "RichText";

    /* renamed from: b, reason: collision with root package name */
    public static final String f15715b = " --> ";

    public static void a(Throwable th) {
        if (com.zzhoujay.richtext.f.f15728j) {
            th.printStackTrace();
        }
    }

    public static void b(String str, String str2) {
        if (com.zzhoujay.richtext.f.f15728j) {
            Log.i(f15714a, str + f15715b + str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (com.zzhoujay.richtext.f.f15728j) {
            Log.i(f15714a, str + f15715b + str2, th);
        }
    }

    public static void d(String str, String str2) {
        Log.e(f15714a, str + f15715b + str2);
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(f15714a, str + f15715b + str2, th);
    }
}
