package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes3.dex */
public final class i<T> extends io.reactivex.rxjava3.parallel.b<T> {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f18253a;

    /* renamed from: b, reason: collision with root package name */
    final int f18254b;

    /* renamed from: c, reason: collision with root package name */
    final int f18255c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements t<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        volatile boolean cancelled;
        volatile boolean done;
        final long[] emissions;
        Throwable error;
        int index;
        final int limit;
        final int prefetch;
        int produced;
        io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        final AtomicLongArray requests;
        int sourceMode;
        final AtomicInteger subscriberCount = new AtomicInteger();
        final org.reactivestreams.p<? super T>[] subscribers;
        org.reactivestreams.q upstream;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.parallel.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0520a implements org.reactivestreams.q {

            /* renamed from: a, reason: collision with root package name */
            final int f18256a;

            /* renamed from: b, reason: collision with root package name */
            final int f18257b;

            C0520a(int i5, int i6) {
                this.f18256a = i5;
                this.f18257b = i6;
            }

            @Override // org.reactivestreams.q
            public void cancel() {
                if (a.this.requests.compareAndSet(this.f18256a + this.f18257b, 0L, 1L)) {
                    a aVar = a.this;
                    int i5 = this.f18257b;
                    aVar.cancel(i5 + i5);
                }
            }

            @Override // org.reactivestreams.q
            public void request(long j5) {
                long j6;
                if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                    AtomicLongArray atomicLongArray = a.this.requests;
                    do {
                        j6 = atomicLongArray.get(this.f18256a);
                        if (j6 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f18256a, j6, io.reactivex.rxjava3.internal.util.d.c(j6, j5)));
                    if (a.this.subscriberCount.get() == this.f18257b) {
                        a.this.drain();
                    }
                }
            }
        }

        a(org.reactivestreams.p<? super T>[] pVarArr, int i5) {
            this.subscribers = pVarArr;
            this.prefetch = i5;
            this.limit = i5 - (i5 >> 2);
            int length = pVarArr.length;
            int i6 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i6 + 1);
            this.requests = atomicLongArray;
            atomicLongArray.lazySet(i6, length);
            this.emissions = new long[length];
        }

        void cancel(int i5) {
            if (this.requests.decrementAndGet(i5) == 0) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.sourceMode == 1) {
                drainSync();
            } else {
                drainAsync();
            }
        }

        void drainAsync() {
            Throwable th;
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.queue;
            org.reactivestreams.p<? super T>[] pVarArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i5 = this.index;
            int i6 = this.produced;
            int i7 = 1;
            while (true) {
                int i8 = 0;
                int i9 = 0;
                while (!this.cancelled) {
                    boolean z4 = this.done;
                    if (z4 && (th = this.error) != null) {
                        qVar.clear();
                        int length2 = pVarArr.length;
                        while (i8 < length2) {
                            pVarArr[i8].onError(th);
                            i8++;
                        }
                        return;
                    }
                    boolean isEmpty = qVar.isEmpty();
                    if (z4 && isEmpty) {
                        int length3 = pVarArr.length;
                        while (i8 < length3) {
                            pVarArr[i8].onComplete();
                            i8++;
                        }
                        return;
                    }
                    if (!isEmpty) {
                        long j5 = atomicLongArray.get(i5);
                        long j6 = jArr[i5];
                        if (j5 != j6 && atomicLongArray.get(length + i5) == 0) {
                            try {
                                T poll = qVar.poll();
                                if (poll != null) {
                                    pVarArr[i5].onNext(poll);
                                    jArr[i5] = j6 + 1;
                                    i6++;
                                    if (i6 == this.limit) {
                                        this.upstream.request(i6);
                                        i6 = 0;
                                    }
                                    i9 = 0;
                                }
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.b.b(th2);
                                this.upstream.cancel();
                                int length4 = pVarArr.length;
                                while (i8 < length4) {
                                    pVarArr[i8].onError(th2);
                                    i8++;
                                }
                                return;
                            }
                        } else {
                            i9++;
                        }
                        i5++;
                        if (i5 == length) {
                            i5 = 0;
                        }
                        if (i9 == length) {
                        }
                    }
                    int i10 = get();
                    if (i10 == i7) {
                        this.index = i5;
                        this.produced = i6;
                        i7 = addAndGet(-i7);
                        if (i7 == 0) {
                            return;
                        }
                    } else {
                        i7 = i10;
                    }
                }
                qVar.clear();
                return;
            }
        }

        void drainSync() {
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.queue;
            org.reactivestreams.p<? super T>[] pVarArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i5 = this.index;
            int i6 = 1;
            while (true) {
                int i7 = 0;
                int i8 = 0;
                while (!this.cancelled) {
                    if (qVar.isEmpty()) {
                        int length2 = pVarArr.length;
                        while (i7 < length2) {
                            pVarArr[i7].onComplete();
                            i7++;
                        }
                        return;
                    }
                    long j5 = atomicLongArray.get(i5);
                    long j6 = jArr[i5];
                    if (j5 != j6 && atomicLongArray.get(length + i5) == 0) {
                        try {
                            T poll = qVar.poll();
                            if (poll == null) {
                                int length3 = pVarArr.length;
                                while (i7 < length3) {
                                    pVarArr[i7].onComplete();
                                    i7++;
                                }
                                return;
                            }
                            pVarArr[i5].onNext(poll);
                            jArr[i5] = j6 + 1;
                            i8 = 0;
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            this.upstream.cancel();
                            int length4 = pVarArr.length;
                            while (i7 < length4) {
                                pVarArr[i7].onError(th);
                                i7++;
                            }
                            return;
                        }
                    } else {
                        i8++;
                    }
                    i5++;
                    if (i5 == length) {
                        i5 = 0;
                    }
                    if (i8 == length) {
                        int i9 = get();
                        if (i9 == i6) {
                            this.index = i5;
                            i6 = addAndGet(-i6);
                            if (i6 == 0) {
                                return;
                            }
                        } else {
                            i6 = i9;
                        }
                    }
                }
                qVar.clear();
                return;
            }
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
            if (this.sourceMode == 0 && !this.queue.offer(t5)) {
                this.upstream.cancel();
                onError(new io.reactivex.rxjava3.exceptions.c("Queue is full?"));
            } else {
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                    int requestFusion = nVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = nVar;
                        this.done = true;
                        setupSubscribers();
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = nVar;
                        setupSubscribers();
                        qVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.prefetch);
                setupSubscribers();
                qVar.request(this.prefetch);
            }
        }

        void setupSubscribers() {
            org.reactivestreams.p<? super T>[] pVarArr = this.subscribers;
            int length = pVarArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = i5 + 1;
                this.subscriberCount.lazySet(i6);
                pVarArr[i5].onSubscribe(new C0520a(i5, length));
                i5 = i6;
            }
        }
    }

    public i(org.reactivestreams.o<? extends T> oVar, int i5, int i6) {
        this.f18253a = oVar;
        this.f18254b = i5;
        this.f18255c = i6;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18254b;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public void X(org.reactivestreams.p<? super T>[] pVarArr) {
        if (!b0(pVarArr)) {
            return;
        }
        this.f18253a.subscribe(new a(pVarArr, this.f18255c));
    }
}
