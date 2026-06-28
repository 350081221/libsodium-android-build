package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.e1;

/* loaded from: classes3.dex */
public final class f1<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<T> f16738b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> f16739c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f16740d;

    /* renamed from: e, reason: collision with root package name */
    final int f16741e;

    public f1(org.reactivestreams.o<T> oVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar2, boolean z4, int i5) {
        this.f16738b = oVar;
        this.f16739c = oVar2;
        this.f16740d = z4;
        this.f16741e = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f16738b.subscribe(new e1.a(pVar, this.f16739c, this.f16740d, this.f16741e));
    }
}
