package com.orhanobut.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9355a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9356b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9357c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9358d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9359e = 6;

    /* renamed from: f, reason: collision with root package name */
    public static final int f9360f = 7;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private static m f9361g = new k();

    private j() {
    }

    public static void a(@NonNull g gVar) {
        f9361g.l((g) o.a(gVar));
    }

    public static void b() {
        f9361g.d();
    }

    public static void c(@Nullable Object obj) {
        f9361g.f(obj);
    }

    public static void d(@NonNull String str, @Nullable Object... objArr) {
        f9361g.g(str, objArr);
    }

    public static void e(@NonNull String str, @Nullable Object... objArr) {
        f9361g.n(null, str, objArr);
    }

    public static void f(@Nullable Throwable th, @NonNull String str, @Nullable Object... objArr) {
        f9361g.n(th, str, objArr);
    }

    public static void g(@NonNull String str, @Nullable Object... objArr) {
        f9361g.e(str, objArr);
    }

    public static void h(@Nullable String str) {
        f9361g.b(str);
    }

    public static void i(int i5, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        f9361g.c(i5, str, str2, th);
    }

    public static void j(@NonNull m mVar) {
        f9361g = (m) o.a(mVar);
    }

    public static m k(@Nullable String str) {
        return f9361g.h(str);
    }

    public static void l(@NonNull String str, @Nullable Object... objArr) {
        f9361g.i(str, objArr);
    }

    public static void m(@NonNull String str, @Nullable Object... objArr) {
        f9361g.m(str, objArr);
    }

    public static void n(@NonNull String str, @Nullable Object... objArr) {
        f9361g.a(str, objArr);
    }

    public static void o(@Nullable String str) {
        f9361g.k(str);
    }
}
