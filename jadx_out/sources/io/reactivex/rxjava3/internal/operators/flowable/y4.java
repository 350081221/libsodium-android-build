package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class y4<T, B> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, io.reactivex.rxjava3.core.o<T>> {

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<B> f17202c;

    /* renamed from: d, reason: collision with root package name */
    final int f17203d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, B> extends io.reactivex.rxjava3.subscribers.b<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, B> f17204b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17205c;

        a(b<T, B> bVar) {
            this.f17204b = bVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f17205c) {
                return;
            }
            this.f17205c = true;
            this.f17204b.innerComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f17205c) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17205c = true;
                this.f17204b.innerError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(B b5) {
            if (this.f17205c) {
                return;
            }
            this.f17204b.innerNext();
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, B> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, Runnable {
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> downstream;
        long emitted;
        io.reactivex.rxjava3.processors.h<T> window;
        final a<T, B> boundarySubscriber = new a<>(this);
        final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();
        final AtomicInteger windows = new AtomicInteger(1);
        final io.reactivex.rxjava3.internal.queue.a<Object> queue = new io.reactivex.rxjava3.internal.queue.a<>();
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final AtomicBoolean stopWindows = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();

        b(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar, int i5) {
            this.downstream = pVar;
            this.capacityHint = i5;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.boundarySubscriber.dispose();
                if (this.windows.decrementAndGet() == 0) {
                    io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar = this.downstream;
            io.reactivex.rxjava3.internal.queue.a<Object> aVar = this.queue;
            io.reactivex.rxjava3.internal.util.c cVar = this.errors;
            long j5 = this.emitted;
            int i5 = 1;
            while (this.windows.get() != 0) {
                io.reactivex.rxjava3.processors.h<T> hVar = this.window;
                boolean z5 = this.done;
                if (z5 && cVar.get() != null) {
                    aVar.clear();
                    Throwable terminate = cVar.terminate();
                    if (hVar != 0) {
                        this.window = null;
                        hVar.onError(terminate);
                    }
                    pVar.onError(terminate);
                    return;
                }
                Object poll = aVar.poll();
                if (poll == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z5 && z4) {
                    Throwable terminate2 = cVar.terminate();
                    if (terminate2 == null) {
                        if (hVar != 0) {
                            this.window = null;
                            hVar.onComplete();
                        }
                        pVar.onComplete();
                        return;
                    }
                    if (hVar != 0) {
                        this.window = null;
                        hVar.onError(terminate2);
                    }
                    pVar.onError(terminate2);
                    return;
                }
                if (z4) {
                    this.emitted = j5;
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else if (poll != NEXT_WINDOW) {
                    hVar.onNext(poll);
                } else {
                    if (hVar != 0) {
                        this.window = null;
                        hVar.onComplete();
                    }
                    if (!this.stopWindows.get()) {
                        io.reactivex.rxjava3.processors.h<T> v9 = io.reactivex.rxjava3.processors.h.v9(this.capacityHint, this);
                        this.window = v9;
                        this.windows.getAndIncrement();
                        if (j5 != this.requested.get()) {
                            j5++;
                            a5 a5Var = new a5(v9);
                            pVar.onNext(a5Var);
                            if (a5Var.n9()) {
                                v9.onComplete();
                            }
                        } else {
                            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
                            this.boundarySubscriber.dispose();
                            cVar.tryAddThrowableOrReport(new io.reactivex.rxjava3.exceptions.c("Could not deliver a window due to lack of requests"));
                            this.done = true;
                        }
                    }
                }
            }
            aVar.clear();
            this.window = null;
        }

        void innerComplete() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
            this.done = true;
            drain();
        }

        void innerError(Throwable th) {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                drain();
            }
        }

        void innerNext() {
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.boundarySubscriber.dispose();
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.boundarySubscriber.dispose();
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.queue.offer(t5);
            drain();
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.upstream, qVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
            }
        }
    }

    public y4(io.reactivex.rxjava3.core.o<T> oVar, org.reactivestreams.o<B> oVar2, int i5) {
        super(oVar);
        this.f17202c = oVar2;
        this.f17203d = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar) {
        b bVar = new b(pVar, this.f17203d);
        pVar.onSubscribe(bVar);
        bVar.innerNext();
        this.f17202c.subscribe(bVar.boundarySubscriber);
        this.f16598b.N6(bVar);
    }
}
