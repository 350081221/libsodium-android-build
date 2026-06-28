package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.f2;

/* loaded from: classes3.dex */
public final class h2<T, U> extends io.reactivex.rxjava3.core.o<U> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<T> f16777b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends U> f16778c;

    public h2(org.reactivestreams.o<T> oVar, m3.o<? super T, ? extends U> oVar2) {
        this.f16777b = oVar;
        this.f16778c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super U> pVar) {
        this.f16777b.subscribe(new f2.b(pVar, this.f16778c));
    }
}
