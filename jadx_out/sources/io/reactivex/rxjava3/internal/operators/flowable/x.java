package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.w;

/* loaded from: classes3.dex */
public final class x<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<T> f17129b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> f17130c;

    /* renamed from: d, reason: collision with root package name */
    final int f17131d;

    /* renamed from: e, reason: collision with root package name */
    final int f17132e;

    /* renamed from: f, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f17133f;

    public x(org.reactivestreams.o<T> oVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar2, int i5, int i6, io.reactivex.rxjava3.internal.util.j jVar) {
        this.f17129b = oVar;
        this.f17130c = oVar2;
        this.f17131d = i5;
        this.f17132e = i6;
        this.f17133f = jVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f17129b.subscribe(new w.a(pVar, this.f17130c, this.f17131d, this.f17132e, this.f17133f));
    }
}
