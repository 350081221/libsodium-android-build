package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class z<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends Throwable> f17439a;

    public z(m3.s<? extends Throwable> sVar) {
        this.f17439a = sVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        a0Var.onSubscribe(io.reactivex.rxjava3.disposables.e.h());
        try {
            th = (Throwable) io.reactivex.rxjava3.internal.util.k.d(this.f17439a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th) {
            th = th;
            io.reactivex.rxjava3.exceptions.b.b(th);
        }
        a0Var.onError(th);
    }
}
