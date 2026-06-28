package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class w<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> f17107c;

    /* renamed from: d, reason: collision with root package name */
    final int f17108d;

    /* renamed from: e, reason: collision with root package name */
    final int f17109e;

    /* renamed from: f, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f17110f;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, io.reactivex.rxjava3.internal.subscribers.l<R> {
        private static final long serialVersionUID = -4255299542215038287L;
        volatile boolean cancelled;
        volatile io.reactivex.rxjava3.internal.subscribers.k<R> current;
        volatile boolean done;
        final org.reactivestreams.p<? super R> downstream;
        final io.reactivex.rxjava3.internal.util.j errorMode;
        final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        final io.reactivex.rxjava3.internal.queue.c<io.reactivex.rxjava3.internal.subscribers.k<R>> subscribers;
        org.reactivestreams.q upstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final AtomicLong requested = new AtomicLong();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar, int i5, int i6, io.reactivex.rxjava3.internal.util.j jVar) {
            this.downstream = pVar;
            this.mapper = oVar;
            this.maxConcurrency = i5;
            this.prefetch = i6;
            this.errorMode = jVar;
            this.subscribers = new io.reactivex.rxjava3.internal.queue.c<>(Math.min(i6, i5));
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            this.errors.tryTerminateAndReport();
            drainAndCancel();
        }

        void cancelAll() {
            io.reactivex.rxjava3.internal.subscribers.k<R> kVar = this.current;
            this.current = null;
            if (kVar != null) {
                kVar.cancel();
            }
            while (true) {
                io.reactivex.rxjava3.internal.subscribers.k<R> poll = this.subscribers.poll();
                if (poll != null) {
                    poll.cancel();
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.l
        public void drain() {
            io.reactivex.rxjava3.internal.subscribers.k<R> kVar;
            int i5;
            boolean z4;
            long j5;
            long j6;
            io.reactivex.rxjava3.internal.fuseable.q<R> queue;
            boolean z5;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.subscribers.k<R> kVar2 = this.current;
            org.reactivestreams.p<? super R> pVar = this.downstream;
            io.reactivex.rxjava3.internal.util.j jVar = this.errorMode;
            int i6 = 1;
            while (true) {
                long j7 = this.requested.get();
                if (kVar2 == null) {
                    if (jVar != io.reactivex.rxjava3.internal.util.j.END && this.errors.get() != null) {
                        cancelAll();
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    boolean z6 = this.done;
                    kVar = this.subscribers.poll();
                    if (z6 && kVar == null) {
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    } else if (kVar != null) {
                        this.current = kVar;
                    }
                } else {
                    kVar = kVar2;
                }
                if (kVar != null && (queue = kVar.queue()) != null) {
                    j6 = 0;
                    while (true) {
                        i5 = i6;
                        if (j6 == j7) {
                            break;
                        }
                        if (this.cancelled) {
                            cancelAll();
                            return;
                        }
                        if (jVar == io.reactivex.rxjava3.internal.util.j.IMMEDIATE && this.errors.get() != null) {
                            this.current = null;
                            kVar.cancel();
                            cancelAll();
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                        boolean isDone = kVar.isDone();
                        try {
                            R poll = queue.poll();
                            if (poll == null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (isDone && z5) {
                                this.current = null;
                                this.upstream.request(1L);
                                kVar = null;
                                z4 = true;
                                break;
                            }
                            if (z5) {
                                break;
                            }
                            pVar.onNext(poll);
                            j6++;
                            kVar.request(1L);
                            i6 = i5;
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            this.current = null;
                            kVar.cancel();
                            cancelAll();
                            pVar.onError(th);
                            return;
                        }
                    }
                    z4 = false;
                    if (j6 == j7) {
                        if (this.cancelled) {
                            cancelAll();
                            return;
                        }
                        if (jVar == io.reactivex.rxjava3.internal.util.j.IMMEDIATE && this.errors.get() != null) {
                            this.current = null;
                            kVar.cancel();
                            cancelAll();
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                        boolean isDone2 = kVar.isDone();
                        boolean isEmpty = queue.isEmpty();
                        if (isDone2 && isEmpty) {
                            this.current = null;
                            this.upstream.request(1L);
                            kVar = null;
                            z4 = true;
                        }
                    }
                    j5 = 0;
                } else {
                    i5 = i6;
                    z4 = false;
                    j5 = 0;
                    j6 = 0;
                }
                if (j6 != j5 && j7 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j6);
                }
                if (z4) {
                    kVar2 = kVar;
                    i6 = i5;
                } else {
                    i6 = addAndGet(-i5);
                    if (i6 == 0) {
                        return;
                    } else {
                        kVar2 = kVar;
                    }
                }
            }
        }

        void drainAndCancel() {
            if (getAndIncrement() != 0) {
                return;
            }
            do {
                cancelAll();
            } while (decrementAndGet() != 0);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.l
        public void innerComplete(io.reactivex.rxjava3.internal.subscribers.k<R> kVar) {
            kVar.setDone();
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.l
        public void innerError(io.reactivex.rxjava3.internal.subscribers.k<R> kVar, Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                kVar.setDone();
                if (this.errorMode != io.reactivex.rxjava3.internal.util.j.END) {
                    this.upstream.cancel();
                }
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.l
        public void innerNext(io.reactivex.rxjava3.internal.subscribers.k<R> kVar, R r5) {
            if (kVar.queue().offer(r5)) {
                drain();
            } else {
                kVar.cancel();
                innerError(kVar, new io.reactivex.rxjava3.exceptions.c());
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            try {
                org.reactivestreams.o<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                org.reactivestreams.o<? extends R> oVar = apply;
                io.reactivex.rxjava3.internal.subscribers.k<R> kVar = new io.reactivex.rxjava3.internal.subscribers.k<>(this, this.prefetch);
                if (this.cancelled) {
                    return;
                }
                this.subscribers.offer(kVar);
                oVar.subscribe(kVar);
                if (this.cancelled) {
                    kVar.cancel();
                    drainAndCancel();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            long j5;
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                int i5 = this.maxConcurrency;
                if (i5 == Integer.MAX_VALUE) {
                    j5 = Long.MAX_VALUE;
                } else {
                    j5 = i5;
                }
                qVar.request(j5);
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

    public w(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar2, int i5, int i6, io.reactivex.rxjava3.internal.util.j jVar) {
        super(oVar);
        this.f17107c = oVar2;
        this.f17108d = i5;
        this.f17109e = i6;
        this.f17110f = jVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f16598b.N6(new a(pVar, this.f17107c, this.f17108d, this.f17109e, this.f17110f));
    }
}
