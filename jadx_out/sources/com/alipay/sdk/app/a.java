package com.alipay.sdk.app;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static EnumC0095a f2999a = EnumC0095a.ONLINE;

    /* renamed from: com.alipay.sdk.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0095a {
        ONLINE,
        PRE_SANDBOX,
        SANDBOX
    }

    public static EnumC0095a a() {
        return f2999a;
    }

    public static boolean b() {
        return f2999a == EnumC0095a.SANDBOX;
    }

    public static boolean c() {
        return f2999a == EnumC0095a.PRE_SANDBOX;
    }

    public static boolean d() {
        return c() || b();
    }

    public static void e(EnumC0095a enumC0095a) {
        f2999a = enumC0095a;
    }
}
