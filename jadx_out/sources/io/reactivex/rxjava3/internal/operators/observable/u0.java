package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class u0<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends Throwable> f18113a;

    public u0(m3.s<? extends Throwable> sVar) {
        this.f18113a = sVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        try {
            th = (Throwable) io.reactivex.rxjava3.internal.util.k.d(this.f18113a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th) {
            th = th;
            io.reactivex.rxjava3.exceptions.b.b(th);
        }
        io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
    }
}
