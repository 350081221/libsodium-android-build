package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class g1<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final Future<? extends T> f17702a;

    /* renamed from: b, reason: collision with root package name */
    final long f17703b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f17704c;

    public g1(Future<? extends T> future, long j5, TimeUnit timeUnit) {
        this.f17702a = future;
        this.f17703b = j5;
        this.f17704c = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        T t5;
        io.reactivex.rxjava3.internal.observers.m mVar = new io.reactivex.rxjava3.internal.observers.m(p0Var);
        p0Var.onSubscribe(mVar);
        if (!mVar.isDisposed()) {
            try {
                TimeUnit timeUnit = this.f17704c;
                if (timeUnit != null) {
                    t5 = this.f17702a.get(this.f17703b, timeUnit);
                } else {
                    t5 = this.f17702a.get();
                }
                mVar.complete(io.reactivex.rxjava3.internal.util.k.d(t5, "Future returned a null value."));
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                if (!mVar.isDisposed()) {
                    p0Var.onError(th);
                }
            }
        }
    }
}
