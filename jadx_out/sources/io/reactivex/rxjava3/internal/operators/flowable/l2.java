package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class l2<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f16855c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean cancelled;
        int consumed;
        final org.reactivestreams.p<? super T> downstream;
        long emitted;
        final int limit;
        volatile boolean mainDone;
        volatile int otherState;
        final int prefetch;
        volatile io.reactivex.rxjava3.internal.fuseable.p<T> queue;
        T singleItem;
        final AtomicReference<org.reactivestreams.q> mainSubscription = new AtomicReference<>();
        final C0474a<T> otherObserver = new C0474a<>(this);
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final AtomicLong requested = new AtomicLong();

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l2$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0474a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final a<T> parent;

            C0474a(a<T> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }

            @Override // io.reactivex.rxjava3.core.u0
            public void onSuccess(T t5) {
                this.parent.otherSuccess(t5);
            }
        }

        a(org.reactivestreams.p<? super T> pVar) {
            this.downstream = pVar;
            int c02 = io.reactivex.rxjava3.core.o.c0();
            this.prefetch = c02;
            this.limit = c02 - (c02 >> 2);
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.mainSubscription);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.otherObserver);
            this.errors.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        void drainLoop() {
            boolean z4;
            a1.b bVar;
            boolean z5;
            org.reactivestreams.p<? super T> pVar = this.downstream;
            long j5 = this.emitted;
            int i5 = this.consumed;
            int i6 = this.limit;
            int i7 = 1;
            int i8 = 1;
            while (true) {
                long j6 = this.requested.get();
                while (j5 != j6) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.errors.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    int i9 = this.otherState;
                    if (i9 == i7) {
                        T t5 = this.singleItem;
                        this.singleItem = null;
                        this.otherState = 2;
                        pVar.onNext(t5);
                        j5++;
                    } else {
                        boolean z6 = this.mainDone;
                        io.reactivex.rxjava3.internal.fuseable.p<T> pVar2 = this.queue;
                        if (pVar2 != null) {
                            bVar = pVar2.poll();
                        } else {
                            bVar = null;
                        }
                        if (bVar == null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z6 && z5 && i9 == 2) {
                            this.queue = null;
                            pVar.onComplete();
                            return;
                        } else {
                            if (z5) {
                                break;
                            }
                            pVar.onNext(bVar);
                            j5++;
                            i5++;
                            if (i5 == i6) {
                                this.mainSubscription.get().request(i6);
                                i5 = 0;
                            }
                            i7 = 1;
                        }
                    }
                }
                if (j5 == j6) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.errors.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    boolean z7 = this.mainDone;
                    io.reactivex.rxjava3.internal.fuseable.p<T> pVar3 = this.queue;
                    if (pVar3 != null && !pVar3.isEmpty()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z7 && z4 && this.otherState == 2) {
                        this.queue = null;
                        pVar.onComplete();
                        return;
                    }
                }
                this.emitted = j5;
                this.consumed = i5;
                i8 = addAndGet(-i8);
                if (i8 == 0) {
                    return;
                } else {
                    i7 = 1;
                }
            }
        }

        io.reactivex.rxjava3.internal.fuseable.p<T> getOrCreateQueue() {
            io.reactivex.rxjava3.internal.fuseable.p<T> pVar = this.queue;
            if (pVar == null) {
                io.reactivex.rxjava3.internal.queue.b bVar = new io.reactivex.rxjava3.internal.queue.b(io.reactivex.rxjava3.core.o.c0());
                this.queue = bVar;
                return bVar;
            }
            return pVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.otherObserver);
                drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (compareAndSet(0, 1)) {
                long j5 = this.emitted;
                if (this.requested.get() != j5) {
                    io.reactivex.rxjava3.internal.fuseable.p<T> pVar = this.queue;
                    if (pVar != null && !pVar.isEmpty()) {
                        pVar.offer(t5);
                    } else {
                        this.emitted = j5 + 1;
                        this.downstream.onNext(t5);
                        int i5 = this.consumed + 1;
                        if (i5 == this.limit) {
                            this.consumed = 0;
                            this.mainSubscription.get().request(i5);
                        } else {
                            this.consumed = i5;
                        }
                    }
                } else {
                    getOrCreateQueue().offer(t5);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t5);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.mainSubscription, qVar, this.prefetch);
        }

        void otherError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.mainSubscription);
                drain();
            }
        }

        void otherSuccess(T t5) {
            if (compareAndSet(0, 1)) {
                long j5 = this.emitted;
                if (this.requested.get() != j5) {
                    this.emitted = j5 + 1;
                    this.downstream.onNext(t5);
                    this.otherState = 2;
                } else {
                    this.singleItem = t5;
                    this.otherState = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.singleItem = t5;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
            drain();
        }
    }

    public l2(io.reactivex.rxjava3.core.o<T> oVar, io.reactivex.rxjava3.core.x0<? extends T> x0Var) {
        super(oVar);
        this.f16855c = x0Var;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        a aVar = new a(pVar);
        pVar.onSubscribe(aVar);
        this.f16598b.N6(aVar);
        this.f16855c.a(aVar.otherObserver);
    }
}
