package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class n0<T> extends io.reactivex.rxjava3.core.x<T> implements m3.s<T> {

    /* renamed from: a, reason: collision with root package name */
    final Runnable f17358a;

    public n0(Runnable runnable) {
        this.f17358a = runnable;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        io.reactivex.rxjava3.disposables.e j5 = io.reactivex.rxjava3.disposables.e.j();
        a0Var.onSubscribe(j5);
        if (!j5.isDisposed()) {
            try {
                this.f17358a.run();
                if (!j5.isDisposed()) {
                    a0Var.onComplete();
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
    public T get() {
        this.f17358a.run();
        return null;
    }
}
