package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.t0;

/* loaded from: classes3.dex */
public final class u0<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<T> f17069a;

    /* renamed from: b, reason: collision with root package name */
    final long f17070b;

    public u0(org.reactivestreams.o<T> oVar, long j5) {
        this.f17069a = oVar;
        this.f17070b = j5;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17069a.subscribe(new t0.a(a0Var, this.f17070b));
    }
}
