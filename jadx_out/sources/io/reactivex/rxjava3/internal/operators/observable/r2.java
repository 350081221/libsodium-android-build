package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.operators.observable.q2;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class r2<T, R> extends io.reactivex.rxjava3.core.r0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f18030a;

    /* renamed from: b, reason: collision with root package name */
    final m3.s<R> f18031b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<R, ? super T, R> f18032c;

    public r2(io.reactivex.rxjava3.core.n0<T> n0Var, m3.s<R> sVar, m3.c<R, ? super T, R> cVar) {
        this.f18030a = n0Var;
        this.f18031b = sVar;
        this.f18032c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super R> u0Var) {
        try {
            R r5 = this.f18031b.get();
            Objects.requireNonNull(r5, "The seedSupplier returned a null value");
            this.f18030a.subscribe(new q2.a(u0Var, this.f18032c, r5));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
        }
    }
}
