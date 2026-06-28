package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class y implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public g f2776a;

    /* renamed from: b, reason: collision with root package name */
    public Class<?> f2777b;

    /* renamed from: c, reason: collision with root package name */
    public z f2778c;

    public y(g gVar, Class<?> cls, z zVar) {
        this.f2776a = gVar;
        this.f2777b = cls;
        this.f2778c = zVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f2778c.a(method, objArr);
    }
}
