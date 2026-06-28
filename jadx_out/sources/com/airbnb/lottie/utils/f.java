package com.airbnb.lottie.utils;

import com.airbnb.lottie.a1;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static a1 f1744a = new e();

    public static void a(String str) {
        f1744a.debug(str);
    }

    public static void b(String str, Throwable th) {
        f1744a.debug(str, th);
    }

    public static void c(String str, Throwable th) {
        f1744a.error(str, th);
    }

    public static void d(a1 a1Var) {
        f1744a = a1Var;
    }

    public static void e(String str) {
        f1744a.a(str);
    }

    public static void f(String str, Throwable th) {
        f1744a.b(str, th);
    }
}
