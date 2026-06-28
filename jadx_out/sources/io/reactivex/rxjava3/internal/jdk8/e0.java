package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.r0;
import io.reactivex.rxjava3.internal.jdk8.m;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public final class e0<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final r0<T> f16338b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends Stream<? extends R>> f16339c;

    public e0(r0<T> r0Var, m3.o<? super T, ? extends Stream<? extends R>> oVar) {
        this.f16338b = r0Var;
        this.f16339c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(@l3.f org.reactivestreams.p<? super R> pVar) {
        this.f16338b.a(new m.a(pVar, this.f16339c));
    }
}
