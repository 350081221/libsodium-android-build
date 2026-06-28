package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class z3<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f17219c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f17220d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17221e;

    /* renamed from: f, reason: collision with root package name */
    final int f17222f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f17223g;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
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

        a(org.reactivestreams.p<? super T> pVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5, boolean z4) {
            this.downstream = pVar;
            this.time = j5;
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

        boolean checkTerminated(boolean z4, boolean z5, org.reactivestreams.p<? super T> pVar, boolean z6) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z4) {
                if (z6) {
                    if (z5) {
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
                if (z5) {
                    pVar.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        void drain() {
            boolean z4;
            boolean z5;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super T> pVar = this.downstream;
            io.reactivex.rxjava3.internal.queue.c<Object> cVar = this.queue;
            boolean z6 = this.delayError;
            TimeUnit timeUnit = this.unit;
            io.reactivex.rxjava3.core.q0 q0Var = this.scheduler;
            long j5 = this.time;
            int i5 = 1;
            do {
                long j6 = this.requested.get();
                long j7 = 0;
                while (j7 != j6) {
                    boolean z7 = this.done;
                    Long l5 = (Long) cVar.peek();
                    if (l5 == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    long d5 = q0Var.d(timeUnit);
                    if (!z4 && l5.longValue() > d5 - j5) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (checkTerminated(z7, z5, pVar, z6)) {
                        return;
                    }
                    if (z5) {
                        break;
                    }
                    cVar.poll();
                    pVar.onNext(cVar.poll());
                    j7++;
                }
                if (j7 != 0) {
                    io.reactivex.rxjava3.internal.util.d.e(this.requested, j7);
                }
                i5 = addAndGet(-i5);
            } while (i5 != 0);
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
            this.queue.offer(Long.valueOf(this.scheduler.d(this.unit)), t5);
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
                drain();
            }
        }
    }

    public z3(io.reactivex.rxjava3.core.o<T> oVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5, boolean z4) {
        super(oVar);
        this.f17219c = j5;
        this.f17220d = timeUnit;
        this.f17221e = q0Var;
        this.f17222f = i5;
        this.f17223g = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f17219c, this.f17220d, this.f17221e, this.f17222f, this.f17223g));
    }
}
