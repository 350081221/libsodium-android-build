package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.internal.operators.mixed.h;

/* loaded from: classes3.dex */
public final class i<T> extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<T> f17476a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> f17477b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f17478c;

    public i(org.reactivestreams.o<T> oVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar2, boolean z4) {
        this.f17476a = oVar;
        this.f17477b = oVar2;
        this.f17478c = z4;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f17476a.subscribe(new h.a(fVar, this.f17477b, this.f17478c));
    }
}
