package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.f2;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class t<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    @l3.g
    final org.reactivestreams.o<? extends T>[] f17045b;

    /* renamed from: c, reason: collision with root package name */
    @l3.g
    final Iterable<? extends org.reactivestreams.o<? extends T>> f17046c;

    /* renamed from: d, reason: collision with root package name */
    final m3.o<? super Object[], ? extends R> f17047d;

    /* renamed from: e, reason: collision with root package name */
    final int f17048e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f17049f;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends io.reactivex.rxjava3.internal.subscriptions.c<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final m3.o<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final org.reactivestreams.p<? super R> downstream;
        final io.reactivex.rxjava3.internal.util.c error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final io.reactivex.rxjava3.internal.queue.c<Object> queue;
        final AtomicLong requested;
        final b<T>[] subscribers;

        a(org.reactivestreams.p<? super R> pVar, m3.o<? super Object[], ? extends R> oVar, int i5, int i6, boolean z4) {
            this.downstream = pVar;
            this.combiner = oVar;
            b<T>[] bVarArr = new b[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                bVarArr[i7] = new b<>(this, i7, i6);
            }
            this.subscribers = bVarArr;
            this.latest = new Object[i5];
            this.queue = new io.reactivex.rxjava3.internal.queue.c<>(i6);
            this.requested = new AtomicLong();
            this.error = new io.reactivex.rxjava3.internal.util.c();
            this.delayErrors = z4;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            cancelAll();
            drain();
        }

        void cancelAll() {
            for (b<T> bVar : this.subscribers) {
                bVar.cancel();
            }
        }

        boolean checkTerminated(boolean z4, boolean z5, org.reactivestreams.p<?> pVar, io.reactivex.rxjava3.internal.queue.c<?> cVar) {
            if (this.cancelled) {
                cancelAll();
                cVar.clear();
                this.error.tryTerminateAndReport();
                return true;
            }
            if (z4) {
                if (this.delayErrors) {
                    if (z5) {
                        cancelAll();
                        this.error.tryTerminateConsumer(pVar);
                        return true;
                    }
                    return false;
                }
                Throwable f5 = io.reactivex.rxjava3.internal.util.k.f(this.error);
                if (f5 != null && f5 != io.reactivex.rxjava3.internal.util.k.f18688a) {
                    cancelAll();
                    cVar.clear();
                    pVar.onError(f5);
                    return true;
                }
                if (z5) {
                    cancelAll();
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
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainOutput();
            } else {
                drainAsync();
            }
        }

        void drainAsync() {
            boolean z4;
            org.reactivestreams.p<? super R> pVar = this.downstream;
            io.reactivex.rxjava3.internal.queue.c<?> cVar = this.queue;
            int i5 = 1;
            do {
                long j5 = this.requested.get();
                long j6 = 0;
                while (j6 != j5) {
                    boolean z5 = this.done;
                    Object poll = cVar.poll();
                    if (poll == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (checkTerminated(z5, z4, pVar, cVar)) {
                        return;
                    }
                    if (z4) {
                        break;
                    }
                    try {
                        R apply = this.combiner.apply((Object[]) cVar.poll());
                        Objects.requireNonNull(apply, "The combiner returned a null value");
                        pVar.onNext(apply);
                        ((b) poll).requestOne();
                        j6++;
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        cancelAll();
                        io.reactivex.rxjava3.internal.util.k.a(this.error, th);
                        pVar.onError(io.reactivex.rxjava3.internal.util.k.f(this.error));
                        return;
                    }
                }
                if (j6 == j5 && checkTerminated(this.done, cVar.isEmpty(), pVar, cVar)) {
                    return;
                }
                if (j6 != 0 && j5 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j6);
                }
                i5 = addAndGet(-i5);
            } while (i5 != 0);
        }

        void drainOutput() {
            org.reactivestreams.p<? super R> pVar = this.downstream;
            io.reactivex.rxjava3.internal.queue.c<Object> cVar = this.queue;
            int i5 = 1;
            while (!this.cancelled) {
                Throwable th = this.error.get();
                if (th != null) {
                    cVar.clear();
                    pVar.onError(th);
                    return;
                }
                boolean z4 = this.done;
                boolean isEmpty = cVar.isEmpty();
                if (!isEmpty) {
                    pVar.onNext(null);
                }
                if (z4 && isEmpty) {
                    pVar.onComplete();
                    return;
                } else {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                }
            }
            cVar.clear();
        }

        void innerComplete(int i5) {
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr[i5] != null) {
                    int i6 = this.completedSources + 1;
                    if (i6 == objArr.length) {
                        this.done = true;
                    } else {
                        this.completedSources = i6;
                        return;
                    }
                } else {
                    this.done = true;
                }
                drain();
            }
        }

        void innerError(int i5, Throwable th) {
            if (io.reactivex.rxjava3.internal.util.k.a(this.error, th)) {
                if (!this.delayErrors) {
                    cancelAll();
                    this.done = true;
                    drain();
                    return;
                }
                innerComplete(i5);
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        void innerValue(int i5, T t5) {
            boolean z4;
            synchronized (this) {
                Object[] objArr = this.latest;
                int i6 = this.nonEmptySources;
                if (objArr[i5] == null) {
                    i6++;
                    this.nonEmptySources = i6;
                }
                objArr[i5] = t5;
                if (objArr.length == i6) {
                    this.queue.offer(this.subscribers[i5], objArr.clone());
                    z4 = false;
                } else {
                    z4 = true;
                }
            }
            if (z4) {
                this.subscribers[i5].requestOne();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public R poll() throws Throwable {
            Object poll = this.queue.poll();
            if (poll == null) {
                return null;
            }
            R apply = this.combiner.apply((Object[]) this.queue.poll());
            Objects.requireNonNull(apply, "The combiner returned a null value");
            ((b) poll).requestOne();
            return apply;
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 4) != 0) {
                return 0;
            }
            int i6 = i5 & 2;
            this.outputFused = i6 != 0;
            return i6;
        }

        void subscribe(org.reactivestreams.o<? extends T>[] oVarArr, int i5) {
            b<T>[] bVarArr = this.subscribers;
            for (int i6 = 0; i6 < i5 && !this.done && !this.cancelled; i6++) {
                oVarArr[i6].subscribe(bVarArr[i6]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final a<T, ?> parent;
        final int prefetch;
        int produced;

        b(a<T, ?> aVar, int i5, int i6) {
            this.parent = aVar;
            this.index = i5;
            this.prefetch = i6;
            this.limit = i6 - (i6 >> 2);
        }

        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.parent.innerValue(this.index, t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, this.prefetch);
        }

        public void requestOne() {
            int i5 = this.produced + 1;
            if (i5 == this.limit) {
                this.produced = 0;
                get().request(i5);
            } else {
                this.produced = i5;
            }
        }
    }

    /* loaded from: classes3.dex */
    final class c implements m3.o<T, R> {
        c() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // m3.o
        public R apply(T t5) throws Throwable {
            return t.this.f17047d.apply(new Object[]{t5});
        }
    }

    public t(@l3.f org.reactivestreams.o<? extends T>[] oVarArr, @l3.f m3.o<? super Object[], ? extends R> oVar, int i5, boolean z4) {
        this.f17045b = oVarArr;
        this.f17046c = null;
        this.f17047d = oVar;
        this.f17048e = i5;
        this.f17049f = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super R> pVar) {
        int length;
        org.reactivestreams.o<? extends T>[] oVarArr = this.f17045b;
        if (oVarArr == null) {
            oVarArr = new org.reactivestreams.o[8];
            try {
                length = 0;
                for (org.reactivestreams.o<? extends T> oVar : this.f17046c) {
                    if (length == oVarArr.length) {
                        org.reactivestreams.o<? extends T>[] oVarArr2 = new org.reactivestreams.o[(length >> 2) + length];
                        System.arraycopy(oVarArr, 0, oVarArr2, 0, length);
                        oVarArr = oVarArr2;
                    }
                    int i5 = length + 1;
                    Objects.requireNonNull(oVar, "The Iterator returned a null Publisher");
                    oVarArr[length] = oVar;
                    length = i5;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
                return;
            }
        } else {
            length = oVarArr.length;
        }
        int i6 = length;
        if (i6 == 0) {
            io.reactivex.rxjava3.internal.subscriptions.g.complete(pVar);
        } else {
            if (i6 == 1) {
                oVarArr[0].subscribe(new f2.b(pVar, new c()));
                return;
            }
            a aVar = new a(pVar, this.f17047d, i6, this.f17048e, this.f17049f);
            pVar.onSubscribe(aVar);
            aVar.subscribe(oVarArr, i6);
        }
    }

    public t(@l3.f Iterable<? extends org.reactivestreams.o<? extends T>> iterable, @l3.f m3.o<? super Object[], ? extends R> oVar, int i5, boolean z4) {
        this.f17045b = null;
        this.f17046c = iterable;
        this.f17047d = oVar;
        this.f17048e = i5;
        this.f17049f = z4;
    }
}
