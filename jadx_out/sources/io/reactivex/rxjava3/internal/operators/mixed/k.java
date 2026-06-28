package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.d0;
import io.reactivex.rxjava3.internal.operators.mixed.j;

/* loaded from: classes3.dex */
public final class k<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<T> f17482b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends d0<? extends R>> f17483c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f17484d;

    public k(org.reactivestreams.o<T> oVar, m3.o<? super T, ? extends d0<? extends R>> oVar2, boolean z4) {
        this.f17482b = oVar;
        this.f17483c = oVar2;
        this.f17484d = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f17482b.subscribe(new j.a(pVar, this.f17483c, this.f17484d));
    }
}
