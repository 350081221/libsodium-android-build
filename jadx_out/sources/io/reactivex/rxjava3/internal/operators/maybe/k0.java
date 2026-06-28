package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class k0<T> extends io.reactivex.rxjava3.core.x<T> implements m3.s<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f17327a;

    public k0(Callable<? extends T> callable) {
        this.f17327a = callable;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        io.reactivex.rxjava3.disposables.e j5 = io.reactivex.rxjava3.disposables.e.j();
        a0Var.onSubscribe(j5);
        if (!j5.isDisposed()) {
            try {
                T call = this.f17327a.call();
                if (!j5.isDisposed()) {
                    if (call == null) {
                        a0Var.onComplete();
                    } else {
                        a0Var.onSuccess(call);
                    }
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                if (!j5.isDisposed()) {
                    a0Var.onError(th);
                } else {
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            }
        }
    }

    @Override // m3.s
    public T get() throws Exception {
        return this.f17327a.call();
    }
}
