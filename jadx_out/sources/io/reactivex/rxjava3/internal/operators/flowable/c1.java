package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c1<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> f16647c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f16648d;

    /* renamed from: e, reason: collision with root package name */
    final int f16649e;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final org.reactivestreams.p<? super R> downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> mapper;
        final int maxConcurrency;
        org.reactivestreams.q upstream;
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.disposables.c set = new io.reactivex.rxjava3.disposables.c();
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<io.reactivex.rxjava3.internal.queue.c<R>> queue = new AtomicReference<>();

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0464a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<R>, io.reactivex.rxjava3.disposables.e {
            private static final long serialVersionUID = -502562646270949838L;

            C0464a() {
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public boolean isDisposed() {
                return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
            public void onComplete() {
                a.this.innerComplete(this);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                a.this.innerError(this, th);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
            public void onSuccess(R r5) {
                a.this.innerSuccess(this, r5);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> oVar, boolean z4, int i5) {
            this.downstream = pVar;
            this.mapper = oVar;
            this.delayErrors = z4;
            this.maxConcurrency = i5;
        }

        static boolean checkTerminate(boolean z4, io.reactivex.rxjava3.internal.queue.c<?> cVar) {
            return z4 && (cVar == null || cVar.isEmpty());
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
            this.errors.tryTerminateAndReport();
        }

        void clear() {
            io.reactivex.rxjava3.internal.queue.c<R> cVar = this.queue.get();
            if (cVar != null) {
                cVar.clear();
            }
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        void drainLoop() {
            boolean z4;
            boolean z5;
            boolean z6;
            a1.b bVar;
            boolean z7;
            org.reactivestreams.p<? super R> pVar = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<io.reactivex.rxjava3.internal.queue.c<R>> atomicReference = this.queue;
            int i5 = 1;
            do {
                long j5 = this.requested.get();
                long j6 = 0;
                while (true) {
                    z4 = false;
                    if (j6 == j5) {
                        break;
                    }
                    if (this.cancelled) {
                        clear();
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        clear();
                        this.errors.tryTerminateConsumer(pVar);
                        return;
                    }
                    if (atomicInteger.get() == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    io.reactivex.rxjava3.internal.queue.c<R> cVar = atomicReference.get();
                    if (cVar != null) {
                        bVar = cVar.poll();
                    } else {
                        bVar = null;
                    }
                    if (bVar == null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z6 && z7) {
                        this.errors.tryTerminateConsumer(pVar);
                        return;
                    } else {
                        if (z7) {
                            break;
                        }
                        pVar.onNext(bVar);
                        j6++;
                    }
                }
                if (j6 == j5) {
                    if (this.cancelled) {
                        clear();
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        clear();
                        this.errors.tryTerminateConsumer(pVar);
                        return;
                    }
                    if (atomicInteger.get() == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    io.reactivex.rxjava3.internal.queue.c<R> cVar2 = atomicReference.get();
                    if (cVar2 == null || cVar2.isEmpty()) {
                        z4 = true;
                    }
                    if (z5 && z4) {
                        this.errors.tryTerminateConsumer(pVar);
                        return;
                    }
                }
                if (j6 != 0) {
                    io.reactivex.rxjava3.internal.util.d.e(this.requested, j6);
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.request(j6);
                    }
                }
                i5 = addAndGet(-i5);
            } while (i5 != 0);
        }

        io.reactivex.rxjava3.internal.queue.c<R> getOrCreateQueue() {
            io.reactivex.rxjava3.internal.queue.c<R> cVar = this.queue.get();
            if (cVar != null) {
                return cVar;
            }
            io.reactivex.rxjava3.internal.queue.c<R> cVar2 = new io.reactivex.rxjava3.internal.queue.c<>(io.reactivex.rxjava3.core.o.c0());
            if (androidx.compose.animation.core.h.a(this.queue, null, cVar2)) {
                return cVar2;
            }
            return this.queue.get();
        }

        void innerComplete(a<T, R>.C0464a c0464a) {
            this.set.c(c0464a);
            if (get() == 0) {
                boolean z4 = false;
                if (compareAndSet(0, 1)) {
                    if (this.active.decrementAndGet() == 0) {
                        z4 = true;
                    }
                    if (checkTerminate(z4, this.queue.get())) {
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.request(1L);
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    drainLoop();
                    return;
                }
            }
            this.active.decrementAndGet();
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
            drain();
        }

        void innerError(a<T, R>.C0464a c0464a, Throwable th) {
            this.set.c(c0464a);
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    this.set.dispose();
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    this.upstream.request(1L);
                }
                this.active.decrementAndGet();
                drain();
            }
        }

        void innerSuccess(a<T, R>.C0464a c0464a, R r5) {
            this.set.c(c0464a);
            if (get() == 0) {
                boolean z4 = false;
                if (compareAndSet(0, 1)) {
                    if (this.active.decrementAndGet() == 0) {
                        z4 = true;
                    }
                    if (this.requested.get() != 0) {
                        this.downstream.onNext(r5);
                        if (checkTerminate(z4, this.queue.get())) {
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        } else {
                            io.reactivex.rxjava3.internal.util.d.e(this.requested, 1L);
                            if (this.maxConcurrency != Integer.MAX_VALUE) {
                                this.upstream.request(1L);
                            }
                        }
                    } else {
                        io.reactivex.rxjava3.internal.queue.c<R> orCreateQueue = getOrCreateQueue();
                        synchronized (orCreateQueue) {
                            orCreateQueue.offer(r5);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    drainLoop();
                }
            }
            io.reactivex.rxjava3.internal.queue.c<R> orCreateQueue2 = getOrCreateQueue();
            synchronized (orCreateQueue2) {
                orCreateQueue2.offer(r5);
            }
            this.active.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.active.decrementAndGet();
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            try {
                io.reactivex.rxjava3.core.d0<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.d0<? extends R> d0Var = apply;
                this.active.getAndIncrement();
                C0464a c0464a = new C0464a();
                if (!this.cancelled && this.set.b(c0464a)) {
                    d0Var.a(c0464a);
                }
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
                int i5 = this.maxConcurrency;
                if (i5 == Integer.MAX_VALUE) {
                    qVar.request(Long.MAX_VALUE);
                } else {
                    qVar.request(i5);
                }
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

    public c1(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> oVar2, boolean z4, int i5) {
        super(oVar);
        this.f16647c = oVar2;
        this.f16648d = z4;
        this.f16649e = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f16598b.N6(new a(pVar, this.f16647c, this.f16648d, this.f16649e));
    }
}
