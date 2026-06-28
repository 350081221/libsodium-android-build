package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.operators.observable.c3;

/* loaded from: classes3.dex */
public final class w1<T> extends io.reactivex.rxjava3.core.i0<T> implements io.reactivex.rxjava3.internal.fuseable.o<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f18149a;

    public w1(T t5) {
        this.f18149a = t5;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.o, m3.s
    public T get() {
        return this.f18149a;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        c3.a aVar = new c3.a(p0Var, this.f18149a);
        p0Var.onSubscribe(aVar);
        aVar.run();
    }
}
