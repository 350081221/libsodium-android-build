package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class n0<T, R> extends io.reactivex.rxjava3.core.r0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18415a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.w0<? extends R, ? super T> f18416b;

    public n0(io.reactivex.rxjava3.core.x0<T> x0Var, io.reactivex.rxjava3.core.w0<? extends R, ? super T> w0Var) {
        this.f18415a = x0Var;
        this.f18416b = w0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super R> u0Var) {
        try {
            io.reactivex.rxjava3.core.u0<? super Object> a5 = this.f18416b.a(u0Var);
            Objects.requireNonNull(a5, "The onLift returned a null SingleObserver");
            this.f18415a.a(a5);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
        }
    }
}
