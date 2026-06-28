package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.operators.maybe.c1;

/* loaded from: classes3.dex */
public final class s0<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.r0<T> f18444a;

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super Throwable> f18445b;

    public s0(io.reactivex.rxjava3.core.r0<T> r0Var, m3.r<? super Throwable> rVar) {
        this.f18444a = r0Var;
        this.f18445b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f18444a.a(new c1.a(a0Var, this.f18445b));
    }
}
