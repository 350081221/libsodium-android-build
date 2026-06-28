package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.operators.flowable.k1;

/* loaded from: classes3.dex */
public final class q0<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16571b;

    public q0(io.reactivex.rxjava3.core.i iVar) {
        this.f16571b = iVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16571b.a(new k1.a(pVar));
    }
}
