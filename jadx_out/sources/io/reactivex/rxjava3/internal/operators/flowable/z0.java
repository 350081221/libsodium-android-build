package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class z0<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends org.reactivestreams.o<? extends U>> f17207c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f17208d;

    /* renamed from: e, reason: collision with root package name */
    final int f17209e;

    /* renamed from: f, reason: collision with root package name */
    final int f17210f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, U> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<U>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit;
        final b<T, U> parent;
        long produced;
        volatile io.reactivex.rxjava3.internal.fuseable.q<U> queue;

        a(b<T, U> bVar, int i5, long j5) {
            this.id = j5;
            this.parent = bVar;
            this.bufferSize = i5;
            this.limit = i5 >> 2;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            lazySet(io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED);
            this.parent.innerError(this, th);
        }

        @Override // org.reactivestreams.p
        public void onNext(U u4) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u4, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar)) {
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                    int requestFusion = nVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = nVar;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = nVar;
                    }
                }
                qVar.request(this.bufferSize);
            }
        }

        void requestMore(long j5) {
            if (this.fusionMode != 1) {
                long j6 = this.produced + j5;
                if (j6 >= this.limit) {
                    this.produced = 0L;
                    get().request(j6);
                } else {
                    this.produced = j6;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T, U> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final org.reactivestreams.p<? super U> downstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        long lastId;
        int lastIndex;
        final m3.o<? super T, ? extends org.reactivestreams.o<? extends U>> mapper;
        final int maxConcurrency;
        volatile io.reactivex.rxjava3.internal.fuseable.p<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<a<?, ?>[]> subscribers;
        long uniqueId;
        org.reactivestreams.q upstream;
        static final a<?, ?>[] EMPTY = new a[0];
        static final a<?, ?>[] CANCELLED = new a[0];

        b(org.reactivestreams.p<? super U> pVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends U>> oVar, boolean z4, int i5, int i6) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = pVar;
            this.mapper = oVar;
            this.delayErrors = z4;
            this.maxConcurrency = i5;
            this.bufferSize = i6;
            this.scalarLimit = Math.max(1, i5 >> 1);
            atomicReference.lazySet(EMPTY);
        }

        boolean addInner(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.subscribers.get();
                if (aVarArr == CANCELLED) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!androidx.compose.animation.core.h.a(this.subscribers, aVarArr, aVarArr2));
            return true;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.fuseable.p<U> pVar;
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                disposeAll();
                if (getAndIncrement() == 0 && (pVar = this.queue) != null) {
                    pVar.clear();
                }
            }
        }

        boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            }
            if (!this.delayErrors && this.errors.get() != null) {
                clearScalarQueue();
                this.errors.tryTerminateConsumer(this.downstream);
                return true;
            }
            return false;
        }

        void clearScalarQueue() {
            io.reactivex.rxjava3.internal.fuseable.p<U> pVar = this.queue;
            if (pVar != null) {
                pVar.clear();
            }
        }

        void disposeAll() {
            AtomicReference<a<?, ?>[]> atomicReference = this.subscribers;
            a<?, ?>[] aVarArr = CANCELLED;
            a<?, ?>[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet != aVarArr) {
                for (a<?, ?> aVar : andSet) {
                    aVar.dispose();
                }
                this.errors.tryTerminateAndReport();
            }
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:105:0x011f, code lost:
        
            r5 = Long.MAX_VALUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x012a, code lost:
        
            r10 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
        
            if (r10 == r12) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
        
            if (r9 != false) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0117, code lost:
        
            r5 = r24.requested.addAndGet(-r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0124, code lost:
        
            r7.requestMore(r10);
            r10 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x012d, code lost:
        
            if (r5 == r10) goto L145;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x012f, code lost:
        
            if (r22 != null) goto L92;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void drainLoop() {
            /*
                Method dump skipped, instructions count: 415
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.z0.b.drainLoop():void");
        }

        io.reactivex.rxjava3.internal.fuseable.q<U> getMainQueue() {
            io.reactivex.rxjava3.internal.fuseable.p<U> pVar = this.queue;
            if (pVar == null) {
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    pVar = new io.reactivex.rxjava3.internal.queue.c<>(this.bufferSize);
                } else {
                    pVar = new io.reactivex.rxjava3.internal.queue.b<>(this.maxConcurrency);
                }
                this.queue = pVar;
            }
            return pVar;
        }

        void innerError(a<T, U> aVar, Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                aVar.done = true;
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    for (a<?, ?> aVar2 : this.subscribers.getAndSet(CANCELLED)) {
                        aVar2.dispose();
                    }
                }
                drain();
            }
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
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                if (!this.delayErrors) {
                    for (a<?, ?> aVar : this.subscribers.getAndSet(CANCELLED)) {
                        aVar.dispose();
                    }
                }
                drain();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            try {
                org.reactivestreams.o<? extends U> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                org.reactivestreams.o<? extends U> oVar = apply;
                if (oVar instanceof m3.s) {
                    try {
                        Object obj = ((m3.s) oVar).get();
                        if (obj != null) {
                            tryEmitScalar(obj);
                            return;
                        }
                        if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                            int i5 = this.scalarEmitted + 1;
                            this.scalarEmitted = i5;
                            int i6 = this.scalarLimit;
                            if (i5 == i6) {
                                this.scalarEmitted = 0;
                                this.upstream.request(i6);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.errors.tryAddThrowableOrReport(th);
                        drain();
                        return;
                    }
                }
                int i7 = this.bufferSize;
                long j5 = this.uniqueId;
                this.uniqueId = 1 + j5;
                a aVar = new a(this, i7, j5);
                if (addInner(aVar)) {
                    oVar.subscribe(aVar);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    int i5 = this.maxConcurrency;
                    if (i5 == Integer.MAX_VALUE) {
                        qVar.request(Long.MAX_VALUE);
                    } else {
                        qVar.request(i5);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void removeInner(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.subscribers.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (aVarArr[i5] == aVar) {
                            break;
                        } else {
                            i5++;
                        }
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                if (i5 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = EMPTY;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                    System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!androidx.compose.animation.core.h.a(this.subscribers, aVarArr, aVarArr2));
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
        }

        void tryEmit(U u4, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j5 = this.requested.get();
                io.reactivex.rxjava3.internal.fuseable.q qVar = aVar.queue;
                if (j5 != 0 && (qVar == null || qVar.isEmpty())) {
                    this.downstream.onNext(u4);
                    if (j5 != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    aVar.requestMore(1L);
                } else {
                    if (qVar == null) {
                        qVar = new io.reactivex.rxjava3.internal.queue.b(this.bufferSize);
                        aVar.queue = qVar;
                    }
                    if (!qVar.offer(u4)) {
                        onError(new io.reactivex.rxjava3.exceptions.c("Inner queue full?!"));
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.rxjava3.internal.fuseable.q qVar2 = aVar.queue;
                if (qVar2 == null) {
                    qVar2 = new io.reactivex.rxjava3.internal.queue.b(this.bufferSize);
                    aVar.queue = qVar2;
                }
                if (!qVar2.offer(u4)) {
                    onError(new io.reactivex.rxjava3.exceptions.c("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        void tryEmitScalar(U u4) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j5 = this.requested.get();
                io.reactivex.rxjava3.internal.fuseable.q<U> qVar = this.queue;
                if (j5 != 0 && (qVar == null || qVar.isEmpty())) {
                    this.downstream.onNext(u4);
                    if (j5 != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i5 = this.scalarEmitted + 1;
                        this.scalarEmitted = i5;
                        int i6 = this.scalarLimit;
                        if (i5 == i6) {
                            this.scalarEmitted = 0;
                            this.upstream.request(i6);
                        }
                    }
                } else {
                    if (qVar == null) {
                        qVar = getMainQueue();
                    }
                    if (!qVar.offer(u4)) {
                        onError(new io.reactivex.rxjava3.exceptions.c("Scalar queue full?!"));
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!getMainQueue().offer(u4)) {
                onError(new io.reactivex.rxjava3.exceptions.c("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    public z0(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends U>> oVar2, boolean z4, int i5, int i6) {
        super(oVar);
        this.f17207c = oVar2;
        this.f17208d = z4;
        this.f17209e = i5;
        this.f17210f = i6;
    }

    public static <T, U> io.reactivex.rxjava3.core.t<T> n9(org.reactivestreams.p<? super U> pVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends U>> oVar, boolean z4, int i5, int i6) {
        return new b(pVar, oVar, z4, i5, i6);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super U> pVar) {
        if (o3.b(this.f16598b, pVar, this.f17207c)) {
            return;
        }
        this.f16598b.N6(n9(pVar, this.f17207c, this.f17208d, this.f17209e, this.f17210f));
    }
}
