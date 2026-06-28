package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e1<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> f16713c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f16714d;

    /* renamed from: e, reason: collision with root package name */
    final int f16715e;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final org.reactivestreams.p<? super R> downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> mapper;
        final int maxConcurrency;
        org.reactivestreams.q upstream;
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.disposables.c set = new io.reactivex.rxjava3.disposables.c();
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<io.reactivex.rxjava3.internal.queue.c<R>> queue = new AtomicReference<>();

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.e1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0467a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<R>, io.reactivex.rxjava3.disposables.e {
            private static final long serialVersionUID = -502562646270949838L;

            C0467a() {
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public boolean isDisposed() {
                return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                a.this.innerError(this, th);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }

            @Override // io.reactivex.rxjava3.core.u0
            public void onSuccess(R r5) {
                a.this.innerSuccess(this, r5);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar, boolean z4, int i5) {
            this.downstream = pVar;
            this.mapper = oVar;
            this.delayErrors = z4;
            this.maxConcurrency = i5;
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

        /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        
            if (r10 != r6) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
        
            if (r17.cancelled == false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        
            if (r17.delayErrors != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
        
            if (r17.errors.get() == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        
            clear();
            r17.errors.tryTerminateConsumer(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
        
            if (r2.get() != 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
        
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        
            if (r7 == null) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
        
            if (r7.isEmpty() == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
        
            if (r6 == false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
        
            if (r13 == false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
        
            r17.errors.tryTerminateConsumer(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ad, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
        
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0071, code lost:
        
            clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0074, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
        
            if (r10 == 0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00b2, code lost:
        
            io.reactivex.rxjava3.internal.util.d.e(r17.requested, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00bc, code lost:
        
            if (r17.maxConcurrency == Integer.MAX_VALUE) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00be, code lost:
        
            r17.upstream.request(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00c3, code lost:
        
            r5 = addAndGet(-r5);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void drainLoop() {
            /*
                r17 = this;
                r0 = r17
                org.reactivestreams.p<? super R> r1 = r0.downstream
                java.util.concurrent.atomic.AtomicInteger r2 = r0.active
                java.util.concurrent.atomic.AtomicReference<io.reactivex.rxjava3.internal.queue.c<R>> r3 = r0.queue
                r4 = 1
                r5 = r4
            La:
                java.util.concurrent.atomic.AtomicLong r6 = r0.requested
                long r6 = r6.get()
                r8 = 0
                r10 = r8
            L13:
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                r13 = 0
                if (r12 == 0) goto L6b
                boolean r14 = r0.cancelled
                if (r14 == 0) goto L20
                r17.clear()
                return
            L20:
                boolean r14 = r0.delayErrors
                if (r14 != 0) goto L39
                io.reactivex.rxjava3.internal.util.c r14 = r0.errors
                java.lang.Object r14 = r14.get()
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                if (r14 == 0) goto L39
                r17.clear()
                io.reactivex.rxjava3.internal.util.c r1 = r0.errors
                org.reactivestreams.p<? super R> r2 = r0.downstream
                r1.tryTerminateConsumer(r2)
                return
            L39:
                int r14 = r2.get()
                if (r14 != 0) goto L41
                r14 = r4
                goto L42
            L41:
                r14 = r13
            L42:
                java.lang.Object r15 = r3.get()
                io.reactivex.rxjava3.internal.queue.c r15 = (io.reactivex.rxjava3.internal.queue.c) r15
                if (r15 == 0) goto L4f
                java.lang.Object r15 = r15.poll()
                goto L50
            L4f:
                r15 = 0
            L50:
                if (r15 != 0) goto L55
                r16 = r4
                goto L57
            L55:
                r16 = r13
            L57:
                if (r14 == 0) goto L61
                if (r16 == 0) goto L61
                io.reactivex.rxjava3.internal.util.c r2 = r0.errors
                r2.tryTerminateConsumer(r1)
                return
            L61:
                if (r16 == 0) goto L64
                goto L6b
            L64:
                r1.onNext(r15)
                r12 = 1
                long r10 = r10 + r12
                goto L13
            L6b:
                if (r12 != 0) goto Lae
                boolean r6 = r0.cancelled
                if (r6 == 0) goto L75
                r17.clear()
                return
            L75:
                boolean r6 = r0.delayErrors
                if (r6 != 0) goto L8c
                io.reactivex.rxjava3.internal.util.c r6 = r0.errors
                java.lang.Object r6 = r6.get()
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 == 0) goto L8c
                r17.clear()
                io.reactivex.rxjava3.internal.util.c r2 = r0.errors
                r2.tryTerminateConsumer(r1)
                return
            L8c:
                int r6 = r2.get()
                if (r6 != 0) goto L94
                r6 = r4
                goto L95
            L94:
                r6 = r13
            L95:
                java.lang.Object r7 = r3.get()
                io.reactivex.rxjava3.internal.queue.c r7 = (io.reactivex.rxjava3.internal.queue.c) r7
                if (r7 == 0) goto La3
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto La4
            La3:
                r13 = r4
            La4:
                if (r6 == 0) goto Lae
                if (r13 == 0) goto Lae
                io.reactivex.rxjava3.internal.util.c r2 = r0.errors
                r2.tryTerminateConsumer(r1)
                return
            Lae:
                int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r6 == 0) goto Lc3
                java.util.concurrent.atomic.AtomicLong r6 = r0.requested
                io.reactivex.rxjava3.internal.util.d.e(r6, r10)
                int r6 = r0.maxConcurrency
                r7 = 2147483647(0x7fffffff, float:NaN)
                if (r6 == r7) goto Lc3
                org.reactivestreams.q r6 = r0.upstream
                r6.request(r10)
            Lc3:
                int r5 = -r5
                int r5 = r0.addAndGet(r5)
                if (r5 != 0) goto La
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.e1.a.drainLoop():void");
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

        void innerError(a<T, R>.C0467a c0467a, Throwable th) {
            this.set.c(c0467a);
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

        void innerSuccess(a<T, R>.C0467a c0467a, R r5) {
            this.set.c(c0467a);
            if (get() == 0) {
                boolean z4 = false;
                if (compareAndSet(0, 1)) {
                    if (this.active.decrementAndGet() == 0) {
                        z4 = true;
                    }
                    if (this.requested.get() != 0) {
                        this.downstream.onNext(r5);
                        io.reactivex.rxjava3.internal.queue.c<R> cVar = this.queue.get();
                        if (z4 && (cVar == null || cVar.isEmpty())) {
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
                io.reactivex.rxjava3.core.x0<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                io.reactivex.rxjava3.core.x0<? extends R> x0Var = apply;
                this.active.getAndIncrement();
                C0467a c0467a = new C0467a();
                if (!this.cancelled && this.set.b(c0467a)) {
                    x0Var.a(c0467a);
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

    public e1(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar2, boolean z4, int i5) {
        super(oVar);
        this.f16713c = oVar2;
        this.f16714d = z4;
        this.f16715e = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f16598b.N6(new a(pVar, this.f16713c, this.f16714d, this.f16715e));
    }
}
