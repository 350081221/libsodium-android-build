package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class m0<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final Future<? extends T> f17349a;

    /* renamed from: b, reason: collision with root package name */
    final long f17350b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f17351c;

    public m0(Future<? extends T> future, long j5, TimeUnit timeUnit) {
        this.f17349a = future;
        this.f17350b = j5;
        this.f17351c = timeUnit;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        T t5;
        io.reactivex.rxjava3.disposables.e j5 = io.reactivex.rxjava3.disposables.e.j();
        a0Var.onSubscribe(j5);
        if (!j5.isDisposed()) {
            try {
                long j6 = this.f17350b;
                if (j6 <= 0) {
                    t5 = this.f17349a.get();
                } else {
                    t5 = this.f17349a.get(j6, this.f17351c);
                }
                if (!j5.isDisposed()) {
                    if (t5 == null) {
                        a0Var.onComplete();
                    } else {
                        a0Var.onSuccess(t5);
                    }
                }
            } catch (Throwable th) {
                th = th;
                io.reactivex.rxjava3.exceptions.b.b(th);
                if (th instanceof ExecutionException) {
                    th = th.getCause();
                }
                io.reactivex.rxjava3.exceptions.b.b(th);
                if (!j5.isDisposed()) {
                    a0Var.onError(th);
                }
            }
        }
    }
}
