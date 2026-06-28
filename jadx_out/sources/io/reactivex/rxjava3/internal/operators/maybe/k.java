package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class k<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends io.reactivex.rxjava3.core.d0<? extends T>> f17326a;

    public k(m3.s<? extends io.reactivex.rxjava3.core.d0<? extends T>> sVar) {
        this.f17326a = sVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        try {
            io.reactivex.rxjava3.core.d0<? extends T> d0Var = this.f17326a.get();
            Objects.requireNonNull(d0Var, "The maybeSupplier returned a null MaybeSource");
            d0Var.a(a0Var);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, a0Var);
        }
    }
}
