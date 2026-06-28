package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class e<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends io.reactivex.rxjava3.core.x0<? extends T>> f18349a;

    public e(m3.s<? extends io.reactivex.rxjava3.core.x0<? extends T>> sVar) {
        this.f18349a = sVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        try {
            io.reactivex.rxjava3.core.x0<? extends T> x0Var = this.f18349a.get();
            Objects.requireNonNull(x0Var, "The singleSupplier returned a null SingleSource");
            x0Var.a(u0Var);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
        }
    }
}
