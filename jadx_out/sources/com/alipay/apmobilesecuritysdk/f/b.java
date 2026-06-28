package com.alipay.apmobilesecuritysdk.f;

import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static b f2811a = new b();

    /* renamed from: b, reason: collision with root package name */
    public Thread f2812b = null;

    /* renamed from: c, reason: collision with root package name */
    public LinkedList<Runnable> f2813c = new LinkedList<>();

    public static b a() {
        return f2811a;
    }

    public static /* synthetic */ Thread b(b bVar) {
        bVar.f2812b = null;
        return null;
    }

    public final synchronized void a(Runnable runnable) {
        this.f2813c.add(runnable);
        if (this.f2812b == null) {
            Thread thread = new Thread(new c(this));
            this.f2812b = thread;
            thread.start();
        }
    }
}
