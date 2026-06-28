package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class j1<T> extends io.reactivex.rxjava3.core.i0<T> implements m3.s<T> {

    /* renamed from: a, reason: collision with root package name */
    final Runnable f17780a;

    public j1(Runnable runnable) {
        this.f17780a = runnable;
    }

    @Override // m3.s
    public T get() throws Throwable {
        this.f17780a.run();
        return null;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        io.reactivex.rxjava3.internal.fuseable.b bVar = new io.reactivex.rxjava3.internal.fuseable.b();
        p0Var.onSubscribe(bVar);
        if (!bVar.isDisposed()) {
            try {
                this.f17780a.run();
                if (!bVar.isDisposed()) {
                    p0Var.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                if (!bVar.isDisposed()) {
                    p0Var.onError(th);
                } else {
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            }
        }
    }
}
