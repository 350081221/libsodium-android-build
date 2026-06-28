package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.c3;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d3<T, R> extends io.reactivex.rxjava3.core.r0<R> {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<T> f16688a;

    /* renamed from: b, reason: collision with root package name */
    final m3.s<R> f16689b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<R, ? super T, R> f16690c;

    public d3(org.reactivestreams.o<T> oVar, m3.s<R> sVar, m3.c<R, ? super T, R> cVar) {
        this.f16688a = oVar;
        this.f16689b = sVar;
        this.f16690c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super R> u0Var) {
        try {
            R r5 = this.f16689b.get();
            Objects.requireNonNull(r5, "The seedSupplier returned a null value");
            this.f16688a.subscribe(new c3.a(u0Var, this.f16690c, r5));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
        }
    }
}
