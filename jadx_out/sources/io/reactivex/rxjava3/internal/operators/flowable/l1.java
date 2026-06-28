package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class l1<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final Future<? extends T> f16852b;

    /* renamed from: c, reason: collision with root package name */
    final long f16853c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f16854d;

    public l1(Future<? extends T> future, long j5, TimeUnit timeUnit) {
        this.f16852b = future;
        this.f16853c = j5;
        this.f16854d = timeUnit;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        T t5;
        io.reactivex.rxjava3.internal.subscriptions.f fVar = new io.reactivex.rxjava3.internal.subscriptions.f(pVar);
        pVar.onSubscribe(fVar);
        try {
            TimeUnit timeUnit = this.f16854d;
            if (timeUnit != null) {
                t5 = this.f16852b.get(this.f16853c, timeUnit);
            } else {
                t5 = this.f16852b.get();
            }
            if (t5 == null) {
                pVar.onError(io.reactivex.rxjava3.internal.util.k.b("The future returned a null value."));
            } else {
                fVar.complete(t5);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            if (!fVar.isCancelled()) {
                pVar.onError(th);
            }
        }
    }
}
