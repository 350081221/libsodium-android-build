package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class x<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends Throwable> f18477a;

    public x(m3.s<? extends Throwable> sVar) {
        this.f18477a = sVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        try {
            th = (Throwable) io.reactivex.rxjava3.internal.util.k.d(this.f18477a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th) {
            th = th;
            io.reactivex.rxjava3.exceptions.b.b(th);
        }
        io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
    }
}
