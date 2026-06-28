package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.q0;
import io.reactivex.rxjava3.internal.operators.flowable.v;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class y<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> f17187c;

    /* renamed from: d, reason: collision with root package name */
    final int f17188d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f17189e;

    /* renamed from: f, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17190f;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17191a;

        static {
            int[] iArr = new int[io.reactivex.rxjava3.internal.util.j.values().length];
            f17191a = iArr;
            try {
                iArr[io.reactivex.rxjava3.internal.util.j.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17191a[io.reactivex.rxjava3.internal.util.j.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, v.f<R>, org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final int limit;
        final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> mapper;
        final int prefetch;
        io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        int sourceMode;
        org.reactivestreams.q upstream;
        final q0.c worker;
        final v.e<R> inner = new v.e<>(this);
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();

        b(m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar, int i5, q0.c cVar) {
            this.mapper = oVar;
            this.prefetch = i5;
            this.limit = i5 - (i5 >> 2);
            this.worker = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.f
        public final void innerComplete() {
            this.active = false;
            schedule();
        }

        @Override // org.reactivestreams.p
        public final void onComplete() {
            this.done = true;
            schedule();
        }

        @Override // org.reactivestreams.p
        public final void onNext(T t5) {
            if (this.sourceMode != 2 && !this.queue.offer(t5)) {
                this.upstream.cancel();
                onError(new IllegalStateException("Queue full?!"));
            } else {
                schedule();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public final void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                    int requestFusion = nVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = nVar;
                        this.done = true;
                        subscribeActual();
                        schedule();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = nVar;
                        subscribeActual();
                        qVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.prefetch);
                subscribeActual();
                qVar.request(this.prefetch);
            }
        }

        abstract void schedule();

        abstract void subscribeActual();
    }

    /* loaded from: classes3.dex */
    static final class c<T, R> extends b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final org.reactivestreams.p<? super R> downstream;
        final boolean veryEnd;

        c(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar, int i5, boolean z4, q0.c cVar) {
            super(oVar, i5, cVar);
            this.downstream = pVar;
            this.veryEnd = z4;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
                this.worker.dispose();
                this.errors.tryTerminateAndReport();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.f
        public void innerError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (!this.veryEnd) {
                    this.upstream.cancel();
                    this.done = true;
                }
                this.active = false;
                schedule();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.f
        public void innerNext(R r5) {
            this.downstream.onNext(r5);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                schedule();
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.inner.request(j5);
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            Object obj;
            while (!this.cancelled) {
                if (!this.active) {
                    boolean z5 = this.done;
                    if (z5 && !this.veryEnd && this.errors.get() != null) {
                        this.errors.tryTerminateConsumer(this.downstream);
                        this.worker.dispose();
                        return;
                    }
                    try {
                        T poll = this.queue.poll();
                        if (poll == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z5 && z4) {
                            this.errors.tryTerminateConsumer(this.downstream);
                            this.worker.dispose();
                            return;
                        }
                        if (!z4) {
                            try {
                                org.reactivestreams.o<? extends R> apply = this.mapper.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                                org.reactivestreams.o<? extends R> oVar = apply;
                                if (this.sourceMode != 1) {
                                    int i5 = this.consumed + 1;
                                    if (i5 == this.limit) {
                                        this.consumed = 0;
                                        this.upstream.request(i5);
                                    } else {
                                        this.consumed = i5;
                                    }
                                }
                                if (oVar instanceof m3.s) {
                                    try {
                                        obj = ((m3.s) oVar).get();
                                    } catch (Throwable th) {
                                        io.reactivex.rxjava3.exceptions.b.b(th);
                                        this.errors.tryAddThrowableOrReport(th);
                                        if (!this.veryEnd) {
                                            this.upstream.cancel();
                                            this.errors.tryTerminateConsumer(this.downstream);
                                            this.worker.dispose();
                                            return;
                                        }
                                        obj = null;
                                    }
                                    if (obj != null && !this.cancelled) {
                                        if (this.inner.isUnbounded()) {
                                            this.downstream.onNext(obj);
                                        } else {
                                            this.active = true;
                                            v.e<R> eVar = this.inner;
                                            eVar.setSubscription(new v.g(obj, eVar));
                                        }
                                    }
                                } else {
                                    this.active = true;
                                    oVar.subscribe(this.inner);
                                }
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.b.b(th2);
                                this.upstream.cancel();
                                this.errors.tryAddThrowableOrReport(th2);
                                this.errors.tryTerminateConsumer(this.downstream);
                                this.worker.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.b.b(th3);
                        this.upstream.cancel();
                        this.errors.tryAddThrowableOrReport(th3);
                        this.errors.tryTerminateConsumer(this.downstream);
                        this.worker.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.y.b
        void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.y.b
        void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    /* loaded from: classes3.dex */
    static final class d<T, R> extends b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final org.reactivestreams.p<? super R> downstream;
        final AtomicInteger wip;

        d(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar, int i5, q0.c cVar) {
            super(oVar, i5, cVar);
            this.downstream = pVar;
            this.wip = new AtomicInteger();
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
                this.worker.dispose();
                this.errors.tryTerminateAndReport();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.f
        public void innerError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.errors.tryTerminateConsumer(this.downstream);
                    this.worker.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.f
        public void innerNext(R r5) {
            if (tryEnter()) {
                this.downstream.onNext(r5);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.errors.tryTerminateConsumer(this.downstream);
                this.worker.dispose();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.inner.cancel();
                if (getAndIncrement() == 0) {
                    this.errors.tryTerminateConsumer(this.downstream);
                    this.worker.dispose();
                }
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.inner.request(j5);
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            while (!this.cancelled) {
                if (!this.active) {
                    boolean z5 = this.done;
                    try {
                        T poll = this.queue.poll();
                        if (poll == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z5 && z4) {
                            this.downstream.onComplete();
                            this.worker.dispose();
                            return;
                        }
                        if (!z4) {
                            try {
                                org.reactivestreams.o<? extends R> apply = this.mapper.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                                org.reactivestreams.o<? extends R> oVar = apply;
                                if (this.sourceMode != 1) {
                                    int i5 = this.consumed + 1;
                                    if (i5 == this.limit) {
                                        this.consumed = 0;
                                        this.upstream.request(i5);
                                    } else {
                                        this.consumed = i5;
                                    }
                                }
                                if (oVar instanceof m3.s) {
                                    try {
                                        Object obj = ((m3.s) oVar).get();
                                        if (obj != null && !this.cancelled) {
                                            if (this.inner.isUnbounded()) {
                                                if (tryEnter()) {
                                                    this.downstream.onNext(obj);
                                                    if (!compareAndSet(1, 0)) {
                                                        this.errors.tryTerminateConsumer(this.downstream);
                                                        this.worker.dispose();
                                                        return;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                this.active = true;
                                                v.e<R> eVar = this.inner;
                                                eVar.setSubscription(new v.g(obj, eVar));
                                            }
                                        }
                                    } catch (Throwable th) {
                                        io.reactivex.rxjava3.exceptions.b.b(th);
                                        this.upstream.cancel();
                                        this.errors.tryAddThrowableOrReport(th);
                                        this.errors.tryTerminateConsumer(this.downstream);
                                        this.worker.dispose();
                                        return;
                                    }
                                } else {
                                    this.active = true;
                                    oVar.subscribe(this.inner);
                                }
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.b.b(th2);
                                this.upstream.cancel();
                                this.errors.tryAddThrowableOrReport(th2);
                                this.errors.tryTerminateConsumer(this.downstream);
                                this.worker.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.b.b(th3);
                        this.upstream.cancel();
                        this.errors.tryAddThrowableOrReport(th3);
                        this.errors.tryTerminateConsumer(this.downstream);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.y.b
        void schedule() {
            if (this.wip.getAndIncrement() == 0) {
                this.worker.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.y.b
        void subscribeActual() {
            this.downstream.onSubscribe(this);
        }

        boolean tryEnter() {
            return get() == 0 && compareAndSet(0, 1);
        }
    }

    public y(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar2, int i5, io.reactivex.rxjava3.internal.util.j jVar, io.reactivex.rxjava3.core.q0 q0Var) {
        super(oVar);
        this.f17187c = oVar2;
        this.f17188d = i5;
        this.f17189e = jVar;
        this.f17190f = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        int i5 = a.f17191a[this.f17189e.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                this.f16598b.N6(new d(pVar, this.f17187c, this.f17188d, this.f17190f.c()));
                return;
            } else {
                this.f16598b.N6(new c(pVar, this.f17187c, this.f17188d, true, this.f17190f.c()));
                return;
            }
        }
        this.f16598b.N6(new c(pVar, this.f17187c, this.f17188d, false, this.f17190f.c()));
    }
}
