package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class n4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f16910c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f16911d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16912e;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicLong implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = -9102637559663639004L;
        boolean done;
        final org.reactivestreams.p<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final io.reactivex.rxjava3.internal.disposables.f timer = new io.reactivex.rxjava3.internal.disposables.f();
        final TimeUnit unit;
        org.reactivestreams.q upstream;
        final q0.c worker;

        a(org.reactivestreams.p<? super T> pVar, long j5, TimeUnit timeUnit, q0.c cVar) {
            this.downstream = pVar;
            this.timeout = j5;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.cancel();
            this.worker.dispose();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!this.done && !this.gate) {
                this.gate = true;
                if (get() != 0) {
                    this.downstream.onNext(t5);
                    io.reactivex.rxjava3.internal.util.d.e(this, 1L);
                    io.reactivex.rxjava3.disposables.e eVar = this.timer.get();
                    if (eVar != null) {
                        eVar.dispose();
                    }
                    this.timer.replace(this.worker.c(this, this.timeout, this.unit));
                    return;
                }
                this.done = true;
                cancel();
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.c("Could not deliver value due to lack of requests"));
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this, j5);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.gate = false;
        }
    }

    public n4(io.reactivex.rxjava3.core.o<T> oVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        super(oVar);
        this.f16910c = j5;
        this.f16911d = timeUnit;
        this.f16912e = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(new io.reactivex.rxjava3.subscribers.e(pVar), this.f16910c, this.f16911d, this.f16912e.c()));
    }
}
