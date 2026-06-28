package com.huawei.agconnect.credential.obs;

import android.util.Log;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7873a = "AGC_LOG";

    /* renamed from: b, reason: collision with root package name */
    private static final String f7874b = "[AGC_LOG]";

    private static boolean a(int i5) {
        return Log.isLoggable(f7873a, i5);
    }

    public void a(String str, String str2) {
        if (a(2)) {
            Log.d(f7874b + str, str2);
        }
    }

    public void a(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(f7874b + str, str2, th);
        }
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(f7874b + str, str2);
        }
    }

    public void c(String str, String str2) {
        if (a(4)) {
            Log.i(f7874b + str, str2);
        }
    }

    public void d(String str, String str2) {
        if (a(5)) {
            Log.w(f7874b + str, str2);
        }
    }
}
