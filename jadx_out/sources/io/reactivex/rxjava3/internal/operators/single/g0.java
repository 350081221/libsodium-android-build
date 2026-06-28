package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class g0<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f18376a;

    public g0(Callable<? extends T> callable) {
        this.f18376a = callable;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        io.reactivex.rxjava3.disposables.e j5 = io.reactivex.rxjava3.disposables.e.j();
        u0Var.onSubscribe(j5);
        if (j5.isDisposed()) {
            return;
        }
        try {
            T call = this.f18376a.call();
            Objects.requireNonNull(call, "The callable returned a null value");
            if (!j5.isDisposed()) {
                u0Var.onSuccess(call);
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
