package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public g f2774a;

    /* renamed from: b, reason: collision with root package name */
    public z f2775b = new z(this);

    public x(g gVar) {
        this.f2774a = gVar;
    }

    public final g a() {
        return this.f2774a;
    }

    public final <T> T a(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new y(this.f2774a, cls, this.f2775b));
    }
}
