package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class j1<T> extends io.reactivex.rxjava3.core.o<T> implements m3.s<T> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends T> f16829b;

    public j1(Callable<? extends T> callable) {
        this.f16829b = callable;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        io.reactivex.rxjava3.internal.subscriptions.f fVar = new io.reactivex.rxjava3.internal.subscriptions.f(pVar);
        pVar.onSubscribe(fVar);
        try {
            T call = this.f16829b.call();
            Objects.requireNonNull(call, "The callable returned a null value");
            fVar.complete(call);
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
        T call = this.f16829b.call();
        Objects.requireNonNull(call, "The callable returned a null value");
        return call;
    }
}
