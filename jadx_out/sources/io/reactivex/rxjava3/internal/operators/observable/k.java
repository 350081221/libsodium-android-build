package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class k<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.observables.a<? extends T> f17797a;

    /* renamed from: b, reason: collision with root package name */
    final int f17798b;

    /* renamed from: c, reason: collision with root package name */
    final m3.g<? super io.reactivex.rxjava3.disposables.e> f17799c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicInteger f17800d = new AtomicInteger();

    public k(io.reactivex.rxjava3.observables.a<? extends T> aVar, int i5, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar) {
        this.f17797a = aVar;
        this.f17798b = i5;
        this.f17799c = gVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17797a.subscribe(p0Var);
        if (this.f17800d.incrementAndGet() == this.f17798b) {
            this.f17797a.M8(this.f17799c);
        }
    }
}
