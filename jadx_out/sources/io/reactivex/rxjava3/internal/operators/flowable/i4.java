package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class i4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f16815c;

    /* renamed from: d, reason: collision with root package name */
    final long f16816d;

    /* renamed from: e, reason: collision with root package name */
    final TimeUnit f16817e;

    /* renamed from: f, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16818f;

    /* renamed from: g, reason: collision with root package name */
    final int f16819g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f16820h;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        volatile boolean done;
        final org.reactivestreams.p<? super T> downstream;
        Throwable error;
        final io.reactivex.rxjava3.internal.queue.c<Object> queue;
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.core.q0 scheduler;
        final long time;
        final TimeUnit unit;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super T> pVar, long j5, long j6, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5, boolean z4) {
            this.downstream = pVar;
            this.count = j5;
            this.time = j6;
            this.unit = timeUnit;
            this.scheduler = q0Var;
            this.queue = new io.reactivex.rxjava3.internal.queue.c<>(i5);
            this.delayError = z4;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        boolean checkTerminated(boolean z4, org.reactivestreams.p<? super T> pVar, boolean z5) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z5) {
                if (z4) {
                    Throwable th = this.error;
                    if (th != null) {
                        pVar.onError(th);
                    } else {
                        pVar.onComplete();
                    }
                    return true;
                }
                return false;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                pVar.onError(th2);
                return true;
            }
            if (z4) {
                pVar.onComplete();
                return true;
            }
            return false;
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super T> pVar = this.downstream;
            io.reactivex.rxjava3.internal.queue.c<Object> cVar = this.queue;
            boolean z5 = this.delayError;
            int i5 = 1;
            do {
                if (this.done) {
                    if (checkTerminated(cVar.isEmpty(), pVar, z5)) {
                        return;
                    }
                    long j5 = this.requested.get();
                    long j6 = 0;
                    while (true) {
                        if (cVar.peek() == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (checkTerminated(z4, pVar, z5)) {
                            return;
                        }
                        if (j5 == j6) {
                            if (j6 != 0) {
                                io.reactivex.rxjava3.internal.util.d.e(this.requested, j6);
                            }
                        } else {
                            cVar.poll();
                            pVar.onNext(cVar.poll());
                            j6++;
                        }
                    }
                }
                i5 = addAndGet(-i5);
            } while (i5 != 0);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            trim(this.scheduler.d(this.unit), this.queue);
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.delayError) {
                trim(this.scheduler.d(this.unit), this.queue);
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            io.reactivex.rxjava3.internal.queue.c<Object> cVar = this.queue;
            long d5 = this.scheduler.d(this.unit);
            cVar.offer(Long.valueOf(d5), t5);
            trim(d5, cVar);
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
                drain();
            }
        }

        void trim(long j5, io.reactivex.rxjava3.internal.queue.c<Object> cVar) {
            boolean z4;
            long j6 = this.time;
            long j7 = this.count;
            if (j7 == Long.MAX_VALUE) {
                z4 = true;
            } else {
                z4 = false;
            }
            while (!cVar.isEmpty()) {
                if (((Long) cVar.peek()).longValue() < j5 - j6 || (!z4 && (cVar.m() >> 1) > j7)) {
                    cVar.poll();
                    cVar.poll();
                } else {
                    return;
                }
            }
        }
    }

    public i4(io.reactivex.rxjava3.core.o<T> oVar, long j5, long j6, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5, boolean z4) {
        super(oVar);
        this.f16815c = j5;
        this.f16816d = j6;
        this.f16817e = timeUnit;
        this.f16818f = q0Var;
        this.f16819g = i5;
        this.f16820h = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16815c, this.f16816d, this.f16817e, this.f16818f, this.f16819g, this.f16820h));
    }
}
