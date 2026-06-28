package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class q3<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final m3.c<R, ? super T, R> f16985c;

    /* renamed from: d, reason: collision with root package name */
    final m3.s<R> f16986d;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -1776795561228106469L;
        final m3.c<R, ? super T, R> accumulator;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final org.reactivestreams.p<? super R> downstream;
        Throwable error;
        final int limit;
        final int prefetch;
        final io.reactivex.rxjava3.internal.fuseable.p<R> queue;
        final AtomicLong requested;
        org.reactivestreams.q upstream;
        R value;

        a(org.reactivestreams.p<? super R> pVar, m3.c<R, ? super T, R> cVar, R r5, int i5) {
            this.downstream = pVar;
            this.accumulator = cVar;
            this.value = r5;
            this.prefetch = i5;
            this.limit = i5 - (i5 >> 2);
            io.reactivex.rxjava3.internal.queue.b bVar = new io.reactivex.rxjava3.internal.queue.b(i5);
            this.queue = bVar;
            bVar.offer(r5);
            this.requested = new AtomicLong();
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        void drain() {
            boolean z4;
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super R> pVar = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.p<R> pVar2 = this.queue;
            int i5 = this.limit;
            int i6 = this.consumed;
            int i7 = 1;
            do {
                long j5 = this.requested.get();
                long j6 = 0;
                while (j6 != j5) {
                    if (this.cancelled) {
                        pVar2.clear();
                        return;
                    }
                    boolean z5 = this.done;
                    if (z5 && (th = this.error) != null) {
                        pVar2.clear();
                        pVar.onError(th);
                        return;
                    }
                    R poll = pVar2.poll();
                    if (poll == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5 && z4) {
                        pVar.onComplete();
                        return;
                    }
                    if (z4) {
                        break;
                    }
                    pVar.onNext(poll);
                    j6++;
                    i6++;
                    if (i6 == i5) {
                        this.upstream.request(i5);
                        i6 = 0;
                    }
                }
                if (j6 == j5 && this.done) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        pVar2.clear();
                        pVar.onError(th2);
                        return;
                    } else if (pVar2.isEmpty()) {
                        pVar.onComplete();
                        return;
                    }
                }
                if (j6 != 0) {
                    io.reactivex.rxjava3.internal.util.d.e(this.requested, j6);
                }
                this.consumed = i6;
                i7 = addAndGet(-i7);
            } while (i7 != 0);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            try {
                R apply = this.accumulator.apply(this.value, t5);
                Objects.requireNonNull(apply, "The accumulator returned a null value");
                this.value = apply;
                this.queue.offer(apply);
                drain();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(this.prefetch - 1);
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

    public q3(io.reactivex.rxjava3.core.o<T> oVar, m3.s<R> sVar, m3.c<R, ? super T, R> cVar) {
        super(oVar);
        this.f16985c = cVar;
        this.f16986d = sVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        try {
            R r5 = this.f16986d.get();
            Objects.requireNonNull(r5, "The seed supplied is null");
            this.f16598b.N6(new a(pVar, this.f16985c, r5, io.reactivex.rxjava3.core.o.c0()));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
