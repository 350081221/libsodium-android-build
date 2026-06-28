package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class q1<T> extends io.reactivex.rxjava3.core.o<T> implements m3.s<T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.s<? extends T> f16983b;

    public q1(m3.s<? extends T> sVar) {
        this.f16983b = sVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        io.reactivex.rxjava3.internal.subscriptions.f fVar = new io.reactivex.rxjava3.internal.subscriptions.f(pVar);
        pVar.onSubscribe(fVar);
        try {
            T t5 = this.f16983b.get();
            Objects.requireNonNull(t5, "The supplier returned a null value");
            fVar.complete(t5);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            if (fVar.isCancelled()) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                pVar.onError(th);
            }
        }
    }

    @Override // m3.s
    public T get() throws Throwable {
        T t5 = this.f16983b.get();
        Objects.requireNonNull(t5, "The supplier returned a null value");
        return t5;
    }
}
