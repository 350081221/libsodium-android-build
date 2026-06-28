package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class o4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f16926c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f16927d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16928e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f16929f;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final org.reactivestreams.p<? super T> downstream;
        final boolean emitLast;
        long emitted;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        org.reactivestreams.q upstream;
        final q0.c worker;

        a(org.reactivestreams.p<? super T> pVar, long j5, TimeUnit timeUnit, q0.c cVar, boolean z4) {
            this.downstream = pVar;
            this.timeout = j5;
            this.unit = timeUnit;
            this.worker = cVar;
            this.emitLast = z4;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.latest;
            AtomicLong atomicLong = this.requested;
            org.reactivestreams.p<? super T> pVar = this.downstream;
            int i5 = 1;
            while (!this.cancelled) {
                boolean z5 = this.done;
                if (z5 && this.error != null) {
                    atomicReference.lazySet(null);
                    pVar.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                if (atomicReference.get() == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z5) {
                    if (!z4 && this.emitLast) {
                        T andSet = atomicReference.getAndSet(null);
                        long j5 = this.emitted;
                        if (j5 != atomicLong.get()) {
                            this.emitted = j5 + 1;
                            pVar.onNext(andSet);
                            pVar.onComplete();
                        } else {
                            pVar.onError(new io.reactivex.rxjava3.exceptions.c("Could not emit final value due to lack of requests"));
                        }
                    } else {
                        atomicReference.lazySet(null);
                        pVar.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                if (z4) {
                    if (this.timerFired) {
                        this.timerRunning = false;
                        this.timerFired = false;
                    }
                } else if (!this.timerRunning || this.timerFired) {
                    T andSet2 = atomicReference.getAndSet(null);
                    long j6 = this.emitted;
                    if (j6 != atomicLong.get()) {
                        pVar.onNext(andSet2);
                        this.emitted = j6 + 1;
                        this.timerFired = false;
                        this.timerRunning = true;
                        this.worker.c(this, this.timeout, this.unit);
                    } else {
                        this.upstream.cancel();
                        pVar.onError(new io.reactivex.rxjava3.exceptions.c("Could not emit value due to lack of requests"));
                        this.worker.dispose();
                        return;
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.latest.set(t5);
            drain();
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
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.timerFired = true;
            drain();
        }
    }

    public o4(io.reactivex.rxjava3.core.o<T> oVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        super(oVar);
        this.f16926c = j5;
        this.f16927d = timeUnit;
        this.f16928e = q0Var;
        this.f16929f = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16926c, this.f16927d, this.f16928e.c(), this.f16929f));
    }
}
