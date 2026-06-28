package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.x0;
import io.reactivex.rxjava3.internal.operators.mixed.l;

/* loaded from: classes3.dex */
public final class m<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<T> f17488b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends x0<? extends R>> f17489c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f17490d;

    public m(org.reactivestreams.o<T> oVar, m3.o<? super T, ? extends x0<? extends R>> oVar2, boolean z4) {
        this.f17488b = oVar;
        this.f17489c = oVar2;
        this.f17490d = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f17488b.subscribe(new l.a(pVar, this.f17489c, this.f17490d));
    }
}
