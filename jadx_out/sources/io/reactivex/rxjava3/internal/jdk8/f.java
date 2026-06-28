package io.reactivex.rxjava3.internal.jdk8;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public final class f<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f16340b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends Stream<? extends R>> f16341c;

    /* renamed from: d, reason: collision with root package name */
    final int f16342d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -5127032662980523968L;
        volatile boolean cancelled;
        int consumed;
        AutoCloseable currentCloseable;
        Iterator<? extends R> currentIterator;
        final org.reactivestreams.p<? super R> downstream;
        long emitted;
        final m3.o<? super T, ? extends Stream<? extends R>> mapper;
        final int prefetch;
        io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        int sourceMode;
        org.reactivestreams.q upstream;
        volatile boolean upstreamDone;
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.internal.util.c error = new io.reactivex.rxjava3.internal.util.c();

        a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends Stream<? extends R>> oVar, int i5) {
            this.downstream = pVar;
            this.mapper = oVar;
            this.prefetch = i5;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            drain();
        }

        void clearCurrentRethrowCloseError() throws Throwable {
            this.currentIterator = null;
            AutoCloseable autoCloseable = this.currentCloseable;
            this.currentCloseable = null;
            if (autoCloseable != null) {
                autoCloseable.close();
            }
        }

        void clearCurrentSuppressCloseError() {
            try {
                clearCurrentRethrowCloseError();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r12v2 */
        void drain() {
            boolean z4;
            int i5;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super R> pVar = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.queue;
            io.reactivex.rxjava3.internal.util.c cVar = this.error;
            Iterator<? extends R> it = this.currentIterator;
            long j5 = this.requested.get();
            long j6 = this.emitted;
            int i6 = this.prefetch;
            int i7 = i6 - (i6 >> 2);
            int i8 = 0;
            ?? r12 = 1;
            if (this.sourceMode != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            long j7 = j6;
            int i9 = 1;
            long j8 = j5;
            Iterator<? extends R> it2 = it;
            while (true) {
                if (this.cancelled) {
                    qVar.clear();
                    clearCurrentSuppressCloseError();
                } else {
                    boolean z5 = this.upstreamDone;
                    if (cVar.get() != null) {
                        pVar.onError(cVar.get());
                        this.cancelled = r12;
                    } else {
                        if (it2 == null) {
                            try {
                                T poll = qVar.poll();
                                if (poll == null) {
                                    i5 = r12;
                                } else {
                                    i5 = i8;
                                }
                                if (z5 && i5 != 0) {
                                    pVar.onComplete();
                                    this.cancelled = r12;
                                } else if (i5 == 0) {
                                    if (z4) {
                                        int i10 = this.consumed + r12;
                                        this.consumed = i10;
                                        if (i10 == i7) {
                                            this.consumed = i8;
                                            this.upstream.request(i7);
                                        }
                                    }
                                    try {
                                        Stream<? extends R> apply = this.mapper.apply(poll);
                                        Objects.requireNonNull(apply, "The mapper returned a null Stream");
                                        Stream<? extends R> stream = apply;
                                        it2 = stream.iterator();
                                        if (it2.hasNext()) {
                                            this.currentIterator = it2;
                                            this.currentCloseable = stream;
                                        }
                                        it2 = null;
                                    } catch (Throwable th) {
                                        io.reactivex.rxjava3.exceptions.b.b(th);
                                        trySignalError(pVar, th);
                                    }
                                }
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.b.b(th2);
                                trySignalError(pVar, th2);
                            }
                        }
                        if (it2 != null && j7 != j8) {
                            try {
                                R next = it2.next();
                                Objects.requireNonNull(next, "The Stream.Iterator returned a null value");
                                if (!this.cancelled) {
                                    pVar.onNext(next);
                                    j7++;
                                    if (!this.cancelled) {
                                        try {
                                            if (!it2.hasNext()) {
                                                try {
                                                    clearCurrentRethrowCloseError();
                                                    it2 = null;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    it2 = null;
                                                    io.reactivex.rxjava3.exceptions.b.b(th);
                                                    trySignalError(pVar, th);
                                                    i8 = 0;
                                                    r12 = 1;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                io.reactivex.rxjava3.exceptions.b.b(th5);
                                trySignalError(pVar, th5);
                            }
                        }
                    }
                    i8 = 0;
                    r12 = 1;
                }
                this.emitted = j7;
                i9 = addAndGet(-i9);
                if (i9 == 0) {
                    return;
                }
                j8 = this.requested.get();
                i8 = 0;
                r12 = 1;
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.upstreamDone = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.error.compareAndSet(null, th)) {
                this.upstreamDone = true;
                drain();
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.sourceMode != 2 && !this.queue.offer(t5)) {
                this.upstream.cancel();
                onError(new io.reactivex.rxjava3.exceptions.c("Queue full?!"));
            } else {
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(@l3.f org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                    int requestFusion = nVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = nVar;
                        this.upstreamDone = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = nVar;
                        this.downstream.onSubscribe(this);
                        qVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.prefetch);
                this.downstream.onSubscribe(this);
                qVar.request(this.prefetch);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
        }

        void trySignalError(org.reactivestreams.p<?> pVar, Throwable th) {
            if (this.error.compareAndSet(null, th)) {
                this.upstream.cancel();
                this.cancelled = true;
                pVar.onError(th);
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    public f(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends Stream<? extends R>> oVar2, int i5) {
        this.f16340b = oVar;
        this.f16341c = oVar2;
        this.f16342d = i5;
    }

    public static <T, R> org.reactivestreams.p<T> n9(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends Stream<? extends R>> oVar, int i5) {
        return new a(pVar, oVar, i5);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        Stream<? extends R> stream;
        io.reactivex.rxjava3.core.o<T> oVar = this.f16340b;
        if (oVar instanceof m3.s) {
            try {
                Object obj = ((m3.s) oVar).get();
                if (obj != null) {
                    Stream<? extends R> apply = this.f16341c.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null Stream");
                    stream = apply;
                } else {
                    stream = null;
                }
                if (stream != null) {
                    h.o9(pVar, stream);
                    return;
                } else {
                    io.reactivex.rxjava3.internal.subscriptions.g.complete(pVar);
                    return;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
                return;
            }
        }
        oVar.subscribe(n9(pVar, this.f16341c, this.f16342d));
    }
}
