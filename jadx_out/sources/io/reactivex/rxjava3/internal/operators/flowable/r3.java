package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class r3<T> extends io.reactivex.rxjava3.core.o<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f17004b;

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f17005c;

    /* renamed from: d, reason: collision with root package name */
    final m3.d<? super T, ? super T> f17006d;

    /* renamed from: e, reason: collision with root package name */
    final int f17007e;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.f<Boolean> implements b {
        private static final long serialVersionUID = -6178010334400373240L;
        final m3.d<? super T, ? super T> comparer;
        final io.reactivex.rxjava3.internal.util.c errors;
        final c<T> first;
        final c<T> second;

        /* renamed from: v1, reason: collision with root package name */
        T f17008v1;

        /* renamed from: v2, reason: collision with root package name */
        T f17009v2;
        final AtomicInteger wip;

        a(org.reactivestreams.p<? super Boolean> pVar, int i5, m3.d<? super T, ? super T> dVar) {
            super(pVar);
            this.comparer = dVar;
            this.wip = new AtomicInteger();
            this.first = new c<>(this, i5);
            this.second = new c<>(this, i5);
            this.errors = new io.reactivex.rxjava3.internal.util.c();
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.first.cancel();
            this.second.cancel();
            this.errors.tryTerminateAndReport();
            if (this.wip.getAndIncrement() == 0) {
                this.first.clear();
                this.second.clear();
            }
        }

        void cancelAndClear() {
            this.first.cancel();
            this.first.clear();
            this.second.cancel();
            this.second.clear();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.r3.b
        public void drain() {
            boolean z4;
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            int i5 = 1;
            do {
                io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.first.queue;
                io.reactivex.rxjava3.internal.fuseable.q<T> qVar2 = this.second.queue;
                if (qVar != null && qVar2 != null) {
                    while (!isCancelled()) {
                        if (this.errors.get() != null) {
                            cancelAndClear();
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                        boolean z5 = this.first.done;
                        T t5 = this.f17008v1;
                        if (t5 == null) {
                            try {
                                t5 = qVar.poll();
                                this.f17008v1 = t5;
                            } catch (Throwable th) {
                                io.reactivex.rxjava3.exceptions.b.b(th);
                                cancelAndClear();
                                this.errors.tryAddThrowableOrReport(th);
                                this.errors.tryTerminateConsumer(this.downstream);
                                return;
                            }
                        }
                        boolean z6 = false;
                        if (t5 == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z7 = this.second.done;
                        T t6 = this.f17009v2;
                        if (t6 == null) {
                            try {
                                t6 = qVar2.poll();
                                this.f17009v2 = t6;
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.b.b(th2);
                                cancelAndClear();
                                this.errors.tryAddThrowableOrReport(th2);
                                this.errors.tryTerminateConsumer(this.downstream);
                                return;
                            }
                        }
                        if (t6 == null) {
                            z6 = true;
                        }
                        if (z5 && z7 && z4 && z6) {
                            complete(Boolean.TRUE);
                            return;
                        }
                        if (z5 && z7 && z4 != z6) {
                            cancelAndClear();
                            complete(Boolean.FALSE);
                            return;
                        }
                        if (!z4 && !z6) {
                            try {
                                if (!this.comparer.a(t5, t6)) {
                                    cancelAndClear();
                                    complete(Boolean.FALSE);
                                    return;
                                } else {
                                    this.f17008v1 = null;
                                    this.f17009v2 = null;
                                    this.first.request();
                                    this.second.request();
                                }
                            } catch (Throwable th3) {
                                io.reactivex.rxjava3.exceptions.b.b(th3);
                                cancelAndClear();
                                this.errors.tryAddThrowableOrReport(th3);
                                this.errors.tryTerminateConsumer(this.downstream);
                                return;
                            }
                        }
                    }
                    this.first.clear();
                    this.second.clear();
                    return;
                }
                if (isCancelled()) {
                    this.first.clear();
                    this.second.clear();
                    return;
                } else if (this.errors.get() != null) {
                    cancelAndClear();
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                }
                i5 = this.wip.addAndGet(-i5);
            } while (i5 != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.r3.b
        public void innerError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                drain();
            }
        }

        void subscribe(org.reactivestreams.o<? extends T> oVar, org.reactivestreams.o<? extends T> oVar2) {
            oVar.subscribe(this.first);
            oVar2.subscribe(this.second);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface b {
        void drain();

        void innerError(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = 4804128302091633067L;
        volatile boolean done;
        final int limit;
        final b parent;
        final int prefetch;
        long produced;
        volatile io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        int sourceMode;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(b bVar, int i5) {
            this.parent = bVar;
            this.limit = i5 - (i5 >> 2);
            this.prefetch = i5;
        }

        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void clear() {
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.queue;
            if (qVar != null) {
                qVar.clear();
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.sourceMode == 0 && !this.queue.offer(t5)) {
                onError(new io.reactivex.rxjava3.exceptions.c());
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar)) {
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                    int requestFusion = nVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = nVar;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = nVar;
                        qVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.prefetch);
                qVar.request(this.prefetch);
            }
        }

        public void request() {
            if (this.sourceMode != 1) {
                long j5 = this.produced + 1;
                if (j5 >= this.limit) {
                    this.produced = 0L;
                    get().request(j5);
                } else {
                    this.produced = j5;
                }
            }
        }
    }

    public r3(org.reactivestreams.o<? extends T> oVar, org.reactivestreams.o<? extends T> oVar2, m3.d<? super T, ? super T> dVar, int i5) {
        this.f17004b = oVar;
        this.f17005c = oVar2;
        this.f17006d = dVar;
        this.f17007e = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super Boolean> pVar) {
        a aVar = new a(pVar, this.f17007e, this.f17006d);
        pVar.onSubscribe(aVar);
        aVar.subscribe(this.f17004b, this.f17005c);
    }
}
