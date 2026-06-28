package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class i0<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends T> f18387a;

    public i0(m3.s<? extends T> sVar) {
        this.f18387a = sVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        io.reactivex.rxjava3.disposables.e j5 = io.reactivex.rxjava3.disposables.e.j();
        u0Var.onSubscribe(j5);
        if (j5.isDisposed()) {
            return;
        }
        try {
            T t5 = this.f18387a.get();
            Objects.requireNonNull(t5, "The supplier returned a null value");
            if (!j5.isDisposed()) {
                u0Var.onSuccess(t5);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            if (!j5.isDisposed()) {
                u0Var.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }
}
