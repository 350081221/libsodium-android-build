package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class k1<T> extends io.reactivex.rxjava3.core.i0<T> implements m3.s<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends T> f17805a;

    public k1(m3.s<? extends T> sVar) {
        this.f17805a = sVar;
    }

    @Override // m3.s
    public T get() throws Throwable {
        return (T) io.reactivex.rxjava3.internal.util.k.d(this.f17805a.get(), "The supplier returned a null value.");
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
            mVar.complete(io.reactivex.rxjava3.internal.util.k.d(this.f17805a.get(), "Supplier returned a null value."));
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
