package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class f0<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends io.reactivex.rxjava3.core.n0<? extends T>> f17661a;

    public f0(m3.s<? extends io.reactivex.rxjava3.core.n0<? extends T>> sVar) {
        this.f17661a = sVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        try {
            io.reactivex.rxjava3.core.n0<? extends T> n0Var = this.f17661a.get();
            Objects.requireNonNull(n0Var, "The supplier returned a null ObservableSource");
            n0Var.subscribe(p0Var);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
        }
    }
}
