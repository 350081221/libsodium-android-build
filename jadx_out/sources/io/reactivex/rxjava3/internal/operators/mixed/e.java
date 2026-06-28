package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.d0;
import io.reactivex.rxjava3.internal.operators.mixed.d;

/* loaded from: classes3.dex */
public final class e<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<T> f17453b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends d0<? extends R>> f17454c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f17455d;

    /* renamed from: e, reason: collision with root package name */
    final int f17456e;

    public e(org.reactivestreams.o<T> oVar, m3.o<? super T, ? extends d0<? extends R>> oVar2, io.reactivex.rxjava3.internal.util.j jVar, int i5) {
        this.f17453b = oVar;
        this.f17454c = oVar2;
        this.f17455d = jVar;
        this.f17456e = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f17453b.subscribe(new d.a(pVar, this.f17454c, this.f17456e, this.f17455d));
    }
}
