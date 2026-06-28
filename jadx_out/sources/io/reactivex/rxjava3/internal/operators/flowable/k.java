package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class k<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.flowables.a<? extends T> f16834b;

    /* renamed from: c, reason: collision with root package name */
    final int f16835c;

    /* renamed from: d, reason: collision with root package name */
    final m3.g<? super io.reactivex.rxjava3.disposables.e> f16836d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicInteger f16837e = new AtomicInteger();

    public k(io.reactivex.rxjava3.flowables.a<? extends T> aVar, int i5, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar) {
        this.f16834b = aVar;
        this.f16835c = i5;
        this.f16836d = gVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16834b.subscribe(pVar);
        if (this.f16837e.incrementAndGet() == this.f16835c) {
            this.f16834b.r9(this.f16836d);
        }
    }
}
