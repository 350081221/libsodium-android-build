package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class m0<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final T f18409a;

    public m0(T t5) {
        this.f18409a = t5;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        u0Var.onSubscribe(io.reactivex.rxjava3.disposables.e.h());
        u0Var.onSuccess(this.f18409a);
    }
}
