package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e4<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> f16723c;

    /* renamed from: d, reason: collision with root package name */
    final int f16724d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f16725e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long index;
        final b<T, R> parent;
        volatile io.reactivex.rxjava3.internal.fuseable.q<R> queue;

        a(b<T, R> bVar, long j5, int i5) {
            this.parent = bVar;
            this.index = j5;
            this.bufferSize = i5;
        }

        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            b<T, R> bVar = this.parent;
            if (this.index == bVar.unique) {
                this.done = true;
                bVar.drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            b<T, R> bVar = this.parent;
            if (this.index == bVar.unique && bVar.errors.tryAddThrowable(th)) {
                if (!bVar.delayErrors) {
                    bVar.upstream.cancel();
                    bVar.done = true;
                }
                this.done = true;
                bVar.drain();
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(R r5) {
            b<T, R> bVar = this.parent;
            if (this.index == bVar.unique) {
                if (this.fusionMode == 0 && !this.queue.offer(r5)) {
                    onError(new io.reactivex.rxjava3.exceptions.c("Queue full?!"));
                } else {
                    bVar.drain();
                }
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
                        qVar.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.bufferSize);
                qVar.request(this.bufferSize);
            }
        }

        public void request(long j5) {
            if (this.fusionMode != 1) {
                get().request(j5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        static final a<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final org.reactivestreams.p<? super R> downstream;
        final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> mapper;
        volatile long unique;
        org.reactivestreams.q upstream;
        final AtomicReference<a<T, R>> active = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            CANCELLED = aVar;
            aVar.cancel();
        }

        b(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar, int i5, boolean z4) {
            this.downstream = pVar;
            this.mapper = oVar;
            this.bufferSize = i5;
            this.delayErrors = z4;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                disposeInner();
                this.errors.tryTerminateAndReport();
            }
        }

        void disposeInner() {
            AtomicReference<a<T, R>> atomicReference = this.active;
            a<Object, Object> aVar = CANCELLED;
            a<Object, Object> aVar2 = (a) atomicReference.getAndSet(aVar);
            if (aVar2 != aVar && aVar2 != null) {
                aVar2.cancel();
            }
        }

        void drain() {
            io.reactivex.rxjava3.internal.fuseable.q<R> qVar;
            boolean z4;
            Object obj;
            boolean z5;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super R> pVar = this.downstream;
            int i5 = 1;
            while (!this.cancelled) {
                if (this.done) {
                    if (this.delayErrors) {
                        if (this.active.get() == null) {
                            this.errors.tryTerminateConsumer(pVar);
                            return;
                        }
                    } else if (this.errors.get() != null) {
                        disposeInner();
                        this.errors.tryTerminateConsumer(pVar);
                        return;
                    } else if (this.active.get() == null) {
                        pVar.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = this.active.get();
                if (aVar != null) {
                    qVar = aVar.queue;
                } else {
                    qVar = null;
                }
                if (qVar != null) {
                    long j5 = this.requested.get();
                    long j6 = 0;
                    while (j6 != j5) {
                        if (this.cancelled) {
                            return;
                        }
                        boolean z6 = aVar.done;
                        try {
                            obj = qVar.poll();
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            aVar.cancel();
                            this.errors.tryAddThrowableOrReport(th);
                            obj = null;
                            z6 = true;
                        }
                        if (obj == null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (aVar == this.active.get()) {
                            if (z6) {
                                if (!this.delayErrors) {
                                    if (this.errors.get() != null) {
                                        this.errors.tryTerminateConsumer(pVar);
                                        return;
                                    } else if (z5) {
                                        androidx.compose.animation.core.h.a(this.active, aVar, null);
                                    }
                                } else if (z5) {
                                    androidx.compose.animation.core.h.a(this.active, aVar, null);
                                }
                            }
                            if (z5) {
                                break;
                            }
                            pVar.onNext(obj);
                            j6++;
                        }
                        z4 = true;
                        break;
                    }
                    z4 = false;
                    if (j6 == j5 && aVar.done) {
                        if (!this.delayErrors) {
                            if (this.errors.get() != null) {
                                disposeInner();
                                this.errors.tryTerminateConsumer(pVar);
                                return;
                            } else if (qVar.isEmpty()) {
                                androidx.compose.animation.core.h.a(this.active, aVar, null);
                            }
                        } else if (qVar.isEmpty()) {
                            androidx.compose.animation.core.h.a(this.active, aVar, null);
                        }
                    }
                    if (j6 != 0 && !this.cancelled) {
                        if (j5 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j6);
                        }
                        aVar.request(j6);
                    }
                    if (z4) {
                        continue;
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
            this.active.lazySet(null);
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
            if (!this.done && this.errors.tryAddThrowable(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            a<T, R> aVar;
            if (this.done) {
                return;
            }
            long j5 = this.unique + 1;
            this.unique = j5;
            a<T, R> aVar2 = this.active.get();
            if (aVar2 != null) {
                aVar2.cancel();
            }
            try {
                org.reactivestreams.o<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The publisher returned is null");
                org.reactivestreams.o<? extends R> oVar = apply;
                a aVar3 = new a(this, j5, this.bufferSize);
                do {
                    aVar = this.active.get();
                    if (aVar == CANCELLED) {
                        return;
                    }
                } while (!androidx.compose.animation.core.h.a(this.active, aVar, aVar3));
                oVar.subscribe(aVar3);
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
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                if (this.unique == 0) {
                    this.upstream.request(Long.MAX_VALUE);
                } else {
                    drain();
                }
            }
        }
    }

    public e4(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar2, int i5, boolean z4) {
        super(oVar);
        this.f16723c = oVar2;
        this.f16724d = i5;
        this.f16725e = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        if (o3.b(this.f16598b, pVar, this.f16723c)) {
            return;
        }
        this.f16598b.N6(new b(pVar, this.f16723c, this.f16724d, this.f16725e));
    }
}
