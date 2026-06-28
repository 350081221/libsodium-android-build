package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class z1 extends io.reactivex.rxjava3.core.o<Long> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17211b;

    /* renamed from: c, reason: collision with root package name */
    final long f17212c;

    /* renamed from: d, reason: collision with root package name */
    final long f17213d;

    /* renamed from: e, reason: collision with root package name */
    final long f17214e;

    /* renamed from: f, reason: collision with root package name */
    final long f17215f;

    /* renamed from: g, reason: collision with root package name */
    final TimeUnit f17216g;

    /* loaded from: classes3.dex */
    static final class a extends AtomicLong implements org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final org.reactivestreams.p<? super Long> downstream;
        final long end;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> resource = new AtomicReference<>();

        a(org.reactivestreams.p<? super Long> pVar, long j5, long j6) {
            this.downstream = pVar;
            this.count = j5;
            this.end = j6;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.resource);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this, j5);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            io.reactivex.rxjava3.disposables.e eVar = this.resource.get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar) {
                long j5 = get();
                if (j5 != 0) {
                    long j6 = this.count;
                    this.downstream.onNext(Long.valueOf(j6));
                    if (j6 == this.end) {
                        if (this.resource.get() != cVar) {
                            this.downstream.onComplete();
                        }
                        io.reactivex.rxjava3.internal.disposables.c.dispose(this.resource);
                        return;
                    } else {
                        this.count = j6 + 1;
                        if (j5 != Long.MAX_VALUE) {
                            decrementAndGet();
                            return;
                        }
                        return;
                    }
                }
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.c("Can't deliver value " + this.count + " due to lack of requests"));
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.resource);
            }
        }

        public void setResource(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.resource, eVar);
        }
    }

    public z1(long j5, long j6, long j7, long j8, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f17214e = j7;
        this.f17215f = j8;
        this.f17216g = timeUnit;
        this.f17211b = q0Var;
        this.f17212c = j5;
        this.f17213d = j6;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super Long> pVar) {
        a aVar = new a(pVar, this.f17212c, this.f17213d);
        pVar.onSubscribe(aVar);
        io.reactivex.rxjava3.core.q0 q0Var = this.f17211b;
        if (q0Var instanceof io.reactivex.rxjava3.internal.schedulers.s) {
            q0.c c5 = q0Var.c();
            aVar.setResource(c5);
            c5.d(aVar, this.f17214e, this.f17215f, this.f17216g);
            return;
        }
        aVar.setResource(q0Var.o(aVar, this.f17214e, this.f17215f, this.f17216g));
    }
}
