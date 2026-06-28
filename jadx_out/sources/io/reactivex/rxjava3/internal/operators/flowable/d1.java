package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.c1;

/* loaded from: classes3.dex */
public final class d1<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<T> f16678b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> f16679c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f16680d;

    /* renamed from: e, reason: collision with root package name */
    final int f16681e;

    public d1(org.reactivestreams.o<T> oVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> oVar2, boolean z4, int i5) {
        this.f16678b = oVar;
        this.f16679c = oVar2;
        this.f16680d = z4;
        this.f16681e = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f16678b.subscribe(new c1.a(pVar, this.f16679c, this.f16680d, this.f16681e));
    }
}
