package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class l1<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f17824a;

    public l1(io.reactivex.rxjava3.core.n0<T> n0Var) {
        this.f17824a = n0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17824a.subscribe(p0Var);
    }
}
