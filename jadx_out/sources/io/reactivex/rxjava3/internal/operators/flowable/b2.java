package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class b2<T> extends io.reactivex.rxjava3.core.o<T> implements io.reactivex.rxjava3.internal.fuseable.o<T> {

    /* renamed from: b, reason: collision with root package name */
    private final T f16618b;

    public b2(T t5) {
        this.f16618b = t5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        pVar.onSubscribe(new io.reactivex.rxjava3.internal.subscriptions.h(pVar, this.f16618b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.o, m3.s
    public T get() {
        return this.f16618b;
    }
}
