package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.f4;

/* loaded from: classes3.dex */
public final class j4<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<T> f16832b;

    /* renamed from: c, reason: collision with root package name */
    final long f16833c;

    public j4(org.reactivestreams.o<T> oVar, long j5) {
        this.f16832b = oVar;
        this.f16833c = j5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16832b.subscribe(new f4.a(pVar, this.f16833c));
    }
}
