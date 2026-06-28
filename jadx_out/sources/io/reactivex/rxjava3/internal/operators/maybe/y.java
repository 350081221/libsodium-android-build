package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class y<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final Throwable f17437a;

    public y(Throwable th) {
        this.f17437a = th;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        a0Var.onSubscribe(io.reactivex.rxjava3.disposables.e.h());
        a0Var.onError(this.f17437a);
    }
}
