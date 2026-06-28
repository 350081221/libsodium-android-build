package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class v0<T> extends io.reactivex.rxjava3.core.x<T> implements io.reactivex.rxjava3.internal.fuseable.o<T> {

    /* renamed from: a, reason: collision with root package name */
    final T f17417a;

    public v0(T t5) {
        this.f17417a = t5;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        a0Var.onSubscribe(io.reactivex.rxjava3.disposables.e.h());
        a0Var.onSuccess(this.f17417a);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.o, m3.s
    public T get() {
        return this.f17417a;
    }
}
