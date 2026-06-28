package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class v<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> f17081c;

    /* renamed from: d, reason: collision with root package name */
    final int f17082d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f17083e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17084a;

        static {
            int[] iArr = new int[io.reactivex.rxjava3.internal.util.j.values().length];
            f17084a = iArr;
            try {
                iArr[io.reactivex.rxjava3.internal.util.j.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17084a[io.reactivex.rxjava3.internal.util.j.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, f<R>, org.reactivestreams.q {
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
        final e<R> inner = new e<>(this);
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();

        b(m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar, int i5) {
            this.mapper = oVar;
            this.prefetch = i5;
            this.limit = i5 - (i5 >> 2);
        }

        abstract void drain();

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.f
        public final void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // org.reactivestreams.p
        public final void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public final void onNext(T t5) {
            if (this.sourceMode != 2 && !this.queue.offer(t5)) {
                this.upstream.cancel();
                onError(new IllegalStateException("Queue full?!"));
            } else {
                drain();
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
                        drain();
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

        abstract void subscribeActual();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T, R> extends b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final org.reactivestreams.p<? super R> downstream;
        final boolean veryEnd;

        c(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar, int i5, boolean z4) {
            super(oVar, i5);
            this.downstream = pVar;
            this.veryEnd = z4;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
                this.errors.tryTerminateAndReport();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.b
        void drain() {
            boolean z4;
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z5 = this.done;
                        if (z5 && !this.veryEnd && this.errors.get() != null) {
                            this.errors.tryTerminateConsumer(this.downstream);
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
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.inner.isUnbounded()) {
                                            this.downstream.onNext(obj);
                                        } else {
                                            this.active = true;
                                            e<R> eVar = this.inner;
                                            eVar.setSubscription(new g(obj, eVar));
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
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            io.reactivex.rxjava3.exceptions.b.b(th3);
                            this.upstream.cancel();
                            this.errors.tryAddThrowableOrReport(th3);
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
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
                drain();
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
                drain();
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.inner.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.b
        void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d<T, R> extends b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final org.reactivestreams.p<? super R> downstream;
        final AtomicInteger wip;

        d(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar, int i5) {
            super(oVar, i5);
            this.downstream = pVar;
            this.wip = new AtomicInteger();
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
                this.errors.tryTerminateAndReport();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.b
        void drain() {
            boolean z4;
            if (this.wip.getAndIncrement() == 0) {
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
                                            if (obj == null) {
                                                continue;
                                            } else if (this.inner.isUnbounded()) {
                                                if (!io.reactivex.rxjava3.internal.util.l.f(this.downstream, obj, this, this.errors)) {
                                                    return;
                                                }
                                            } else {
                                                this.active = true;
                                                e<R> eVar = this.inner;
                                                eVar.setSubscription(new g(obj, eVar));
                                            }
                                        } catch (Throwable th) {
                                            io.reactivex.rxjava3.exceptions.b.b(th);
                                            this.upstream.cancel();
                                            this.errors.tryAddThrowableOrReport(th);
                                            this.errors.tryTerminateConsumer(this.downstream);
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
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            io.reactivex.rxjava3.exceptions.b.b(th3);
                            this.upstream.cancel();
                            this.errors.tryAddThrowableOrReport(th3);
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.f
        public void innerError(Throwable th) {
            this.upstream.cancel();
            io.reactivex.rxjava3.internal.util.l.d(this.downstream, th, this, this.errors);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.f
        public void innerNext(R r5) {
            io.reactivex.rxjava3.internal.util.l.f(this.downstream, r5, this, this.errors);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.inner.cancel();
            io.reactivex.rxjava3.internal.util.l.d(this.downstream, th, this, this.errors);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.inner.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.v.b
        void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e<R> extends io.reactivex.rxjava3.internal.subscriptions.i implements io.reactivex.rxjava3.core.t<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final f<R> parent;
        long produced;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(f<R> fVar) {
            super(false);
            this.parent = fVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            long j5 = this.produced;
            if (j5 != 0) {
                this.produced = 0L;
                produced(j5);
            }
            this.parent.innerComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            long j5 = this.produced;
            if (j5 != 0) {
                this.produced = 0L;
                produced(j5);
            }
            this.parent.innerError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(R r5) {
            this.produced++;
            this.parent.innerNext(r5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            setSubscription(qVar);
        }
    }

    /* loaded from: classes3.dex */
    interface f<T> {
        void innerComplete();

        void innerError(Throwable th);

        void innerNext(T t5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class g<T> implements org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f17085a;

        /* renamed from: b, reason: collision with root package name */
        final T f17086b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17087c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(T t5, org.reactivestreams.p<? super T> pVar) {
            this.f17086b = t5;
            this.f17085a = pVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (j5 > 0 && !this.f17087c) {
                this.f17087c = true;
                org.reactivestreams.p<? super T> pVar = this.f17085a;
                pVar.onNext(this.f17086b);
                pVar.onComplete();
            }
        }
    }

    public v(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar2, int i5, io.reactivex.rxjava3.internal.util.j jVar) {
        super(oVar);
        this.f17081c = oVar2;
        this.f17082d = i5;
        this.f17083e = jVar;
    }

    public static <T, R> org.reactivestreams.p<T> n9(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar, int i5, io.reactivex.rxjava3.internal.util.j jVar) {
        int i6 = a.f17084a[jVar.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                return new d(pVar, oVar, i5);
            }
            return new c(pVar, oVar, i5, true);
        }
        return new c(pVar, oVar, i5, false);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        if (o3.b(this.f16598b, pVar, this.f17081c)) {
            return;
        }
        this.f16598b.subscribe(n9(pVar, this.f17081c, this.f17082d, this.f17083e));
    }
}
