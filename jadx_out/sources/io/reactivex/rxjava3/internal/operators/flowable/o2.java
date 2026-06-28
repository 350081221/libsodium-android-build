package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class o2<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final int f16920c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f16921d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f16922e;

    /* renamed from: f, reason: collision with root package name */
    final m3.a f16923f;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.c<T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final org.reactivestreams.p<? super T> downstream;
        Throwable error;
        final m3.a onOverflow;
        boolean outputFused;
        final io.reactivex.rxjava3.internal.fuseable.p<T> queue;
        final AtomicLong requested = new AtomicLong();
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super T> pVar, int i5, boolean z4, boolean z5, m3.a aVar) {
            io.reactivex.rxjava3.internal.fuseable.p<T> bVar;
            this.downstream = pVar;
            this.onOverflow = aVar;
            this.delayError = z5;
            if (z4) {
                bVar = new io.reactivex.rxjava3.internal.queue.c<>(i5);
            } else {
                bVar = new io.reactivex.rxjava3.internal.queue.b<>(i5);
            }
            this.queue = bVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        boolean checkTerminated(boolean z4, boolean z5, org.reactivestreams.p<? super T> pVar) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z4) {
                if (this.delayError) {
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

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.queue.clear();
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() == 0) {
                io.reactivex.rxjava3.internal.fuseable.p<T> pVar = this.queue;
                org.reactivestreams.p<? super T> pVar2 = this.downstream;
                int i5 = 1;
                while (!checkTerminated(this.done, pVar.isEmpty(), pVar2)) {
                    long j5 = this.requested.get();
                    long j6 = 0;
                    while (j6 != j5) {
                        boolean z5 = this.done;
                        T poll = pVar.poll();
                        if (poll == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (checkTerminated(z5, z4, pVar2)) {
                            return;
                        }
                        if (z4) {
                            break;
                        }
                        pVar2.onNext(poll);
                        j6++;
                    }
                    if (j6 == j5 && checkTerminated(this.done, pVar.isEmpty(), pVar2)) {
                        return;
                    }
                    if (j6 != 0 && j5 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j6);
                    }
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!this.queue.offer(t5)) {
                this.upstream.cancel();
                io.reactivex.rxjava3.exceptions.c cVar = new io.reactivex.rxjava3.exceptions.c("Buffer is full");
                try {
                    this.onOverflow.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    cVar.initCause(th);
                }
                onError(cVar);
                return;
            }
            if (this.outputFused) {
                this.downstream.onNext(null);
            } else {
                drain();
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

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            return this.queue.poll();
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (!this.outputFused && io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }
    }

    public o2(io.reactivex.rxjava3.core.o<T> oVar, int i5, boolean z4, boolean z5, m3.a aVar) {
        super(oVar);
        this.f16920c = i5;
        this.f16921d = z4;
        this.f16922e = z5;
        this.f16923f = aVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16920c, this.f16921d, this.f16922e, this.f16923f));
    }
}
