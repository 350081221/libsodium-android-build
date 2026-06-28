package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class e1<T> extends io.reactivex.rxjava3.core.i0<T> implements m3.s<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f17644a;

    public e1(Callable<? extends T> callable) {
        this.f17644a = callable;
    }

    @Override // m3.s
    public T get() throws Throwable {
        return (T) io.reactivex.rxjava3.internal.util.k.d(this.f17644a.call(), "The Callable returned a null value.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        io.reactivex.rxjava3.internal.observers.m mVar = new io.reactivex.rxjava3.internal.observers.m(p0Var);
        p0Var.onSubscribe(mVar);
        if (mVar.isDisposed()) {
            return;
        }
        try {
            mVar.complete(io.reactivex.rxjava3.internal.util.k.d(this.f17644a.call(), "Callable returned a null value."));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            if (!mVar.isDisposed()) {
                p0Var.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }
}
