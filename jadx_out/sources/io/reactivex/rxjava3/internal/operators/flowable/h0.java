package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class h0<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.s<? extends org.reactivestreams.o<? extends T>> f16775b;

    public h0(m3.s<? extends org.reactivestreams.o<? extends T>> sVar) {
        this.f16775b = sVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        try {
            org.reactivestreams.o<? extends T> oVar = this.f16775b.get();
            Objects.requireNonNull(oVar, "The publisher supplied is null");
            oVar.subscribe(pVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
