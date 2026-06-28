package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class p0<T> extends io.reactivex.rxjava3.core.x<T> implements m3.s<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends T> f17375a;

    public p0(m3.s<? extends T> sVar) {
        this.f17375a = sVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        io.reactivex.rxjava3.disposables.e j5 = io.reactivex.rxjava3.disposables.e.j();
        a0Var.onSubscribe(j5);
        if (!j5.isDisposed()) {
            try {
                T t5 = this.f17375a.get();
                if (!j5.isDisposed()) {
                    if (t5 == null) {
                        a0Var.onComplete();
                    } else {
                        a0Var.onSuccess(t5);
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
    public T get() throws Throwable {
        return this.f17375a.get();
    }
}
