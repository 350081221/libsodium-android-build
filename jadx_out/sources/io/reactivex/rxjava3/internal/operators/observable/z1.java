package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class z1<R, T> extends a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.m0<? extends R, ? super T> f18201b;

    public z1(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.m0<? extends R, ? super T> m0Var) {
        super(n0Var);
        this.f18201b = m0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        try {
            io.reactivex.rxjava3.core.p0<? super Object> a5 = this.f18201b.a(p0Var);
            Objects.requireNonNull(a5, "Operator " + this.f18201b + " returned a null Observer");
            this.f17528a.subscribe(a5);
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
