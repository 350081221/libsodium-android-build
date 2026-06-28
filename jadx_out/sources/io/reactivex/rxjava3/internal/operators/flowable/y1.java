package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class y1 extends io.reactivex.rxjava3.core.o<Long> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17195b;

    /* renamed from: c, reason: collision with root package name */
    final long f17196c;

    /* renamed from: d, reason: collision with root package name */
    final long f17197d;

    /* renamed from: e, reason: collision with root package name */
    final TimeUnit f17198e;

    /* loaded from: classes3.dex */
    static final class a extends AtomicLong implements org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final org.reactivestreams.p<? super Long> downstream;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> resource = new AtomicReference<>();

        a(org.reactivestreams.p<? super Long> pVar) {
            this.downstream = pVar;
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
            if (this.resource.get() != io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
                if (get() != 0) {
                    org.reactivestreams.p<? super Long> pVar = this.downstream;
                    long j5 = this.count;
                    this.count = j5 + 1;
                    pVar.onNext(Long.valueOf(j5));
                    io.reactivex.rxjava3.internal.util.d.e(this, 1L);
                    return;
                }
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.c("Can't deliver value " + this.count + " due to lack of requests"));
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.resource);
            }
        }

        public void setResource(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.resource, eVar);
        }
    }

    public y1(long j5, long j6, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f17196c = j5;
        this.f17197d = j6;
        this.f17198e = timeUnit;
        this.f17195b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super Long> pVar) {
        a aVar = new a(pVar);
        pVar.onSubscribe(aVar);
        io.reactivex.rxjava3.core.q0 q0Var = this.f17195b;
        if (q0Var instanceof io.reactivex.rxjava3.internal.schedulers.s) {
            q0.c c5 = q0Var.c();
            aVar.setResource(c5);
            c5.d(aVar, this.f17196c, this.f17197d, this.f17198e);
            return;
        }
        aVar.setResource(q0Var.o(aVar, this.f17196c, this.f17197d, this.f17198e));
    }
}
