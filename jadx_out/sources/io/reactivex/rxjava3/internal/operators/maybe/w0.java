package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class w0<T, R> extends a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.c0<? extends R, ? super T> f17423b;

    public w0(io.reactivex.rxjava3.core.d0<T> d0Var, io.reactivex.rxjava3.core.c0<? extends R, ? super T> c0Var) {
        super(d0Var);
        this.f17423b = c0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        try {
            io.reactivex.rxjava3.core.a0<? super Object> a5 = this.f17423b.a(a0Var);
            Objects.requireNonNull(a5, "The operator returned a null MaybeObserver");
            this.f17232a.a(a5);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, a0Var);
        }
    }
}
