package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.x0;
import io.reactivex.rxjava3.internal.operators.mixed.f;

/* loaded from: classes3.dex */
public final class g<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<T> f17461b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends x0<? extends R>> f17462c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f17463d;

    /* renamed from: e, reason: collision with root package name */
    final int f17464e;

    public g(org.reactivestreams.o<T> oVar, m3.o<? super T, ? extends x0<? extends R>> oVar2, io.reactivex.rxjava3.internal.util.j jVar, int i5) {
        this.f17461b = oVar;
        this.f17462c = oVar2;
        this.f17463d = jVar;
        this.f17464e = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f17461b.subscribe(new f.a(pVar, this.f17462c, this.f17464e, this.f17463d));
    }
}
