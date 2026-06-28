package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.u0;
import io.reactivex.rxjava3.core.x0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class f<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f17457b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends x0<? extends R>> f17458c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f17459d;

    /* renamed from: e, reason: collision with root package name */
    final int f17460e;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final org.reactivestreams.p<? super R> downstream;
        long emitted;
        final io.reactivex.rxjava3.internal.util.j errorMode;
        R item;
        final m3.o<? super T, ? extends x0<? extends R>> mapper;
        final int prefetch;
        final io.reactivex.rxjava3.internal.fuseable.p<T> queue;
        volatile int state;
        org.reactivestreams.q upstream;
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final C0489a<R> inner = new C0489a<>(this);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0489a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements u0<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final a<?, R> parent;

            C0489a(a<?, R> aVar) {
                this.parent = aVar;
            }

            void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
            }

            @Override // io.reactivex.rxjava3.core.u0
            public void onSuccess(R r5) {
                this.parent.innerSuccess(r5);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends x0<? extends R>> oVar, int i5, io.reactivex.rxjava3.internal.util.j jVar) {
            this.downstream = pVar;
            this.mapper = oVar;
            this.prefetch = i5;
            this.errorMode = jVar;
            this.queue = new io.reactivex.rxjava3.internal.queue.b(i5);
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.inner.dispose();
            this.errors.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super R> pVar = this.downstream;
            io.reactivex.rxjava3.internal.util.j jVar = this.errorMode;
            io.reactivex.rxjava3.internal.fuseable.p<T> pVar2 = this.queue;
            io.reactivex.rxjava3.internal.util.c cVar = this.errors;
            AtomicLong atomicLong = this.requested;
            int i5 = this.prefetch;
            int i6 = i5 - (i5 >> 1);
            int i7 = 1;
            while (true) {
                if (this.cancelled) {
                    pVar2.clear();
                    this.item = null;
                } else {
                    int i8 = this.state;
                    if (cVar.get() == null || (jVar != io.reactivex.rxjava3.internal.util.j.IMMEDIATE && (jVar != io.reactivex.rxjava3.internal.util.j.BOUNDARY || i8 != 0))) {
                        if (i8 == 0) {
                            boolean z5 = this.done;
                            T poll = pVar2.poll();
                            if (poll == null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z5 && z4) {
                                cVar.tryTerminateConsumer(pVar);
                                return;
                            }
                            if (!z4) {
                                int i9 = this.consumed + 1;
                                if (i9 == i6) {
                                    this.consumed = 0;
                                    this.upstream.request(i6);
                                } else {
                                    this.consumed = i9;
                                }
                                try {
                                    x0<? extends R> apply = this.mapper.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                    x0<? extends R> x0Var = apply;
                                    this.state = 1;
                                    x0Var.a(this.inner);
                                } catch (Throwable th) {
                                    io.reactivex.rxjava3.exceptions.b.b(th);
                                    this.upstream.cancel();
                                    pVar2.clear();
                                    cVar.tryAddThrowableOrReport(th);
                                    cVar.tryTerminateConsumer(pVar);
                                    return;
                                }
                            }
                        } else if (i8 == 2) {
                            long j5 = this.emitted;
                            if (j5 != atomicLong.get()) {
                                R r5 = this.item;
                                this.item = null;
                                pVar.onNext(r5);
                                this.emitted = j5 + 1;
                                this.state = 0;
                            }
                        }
                    }
                }
                i7 = addAndGet(-i7);
                if (i7 == 0) {
                    return;
                }
            }
            pVar2.clear();
            this.item = null;
            cVar.tryTerminateConsumer(pVar);
        }

        void innerError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.errorMode != io.reactivex.rxjava3.internal.util.j.END) {
                    this.upstream.cancel();
                }
                this.state = 0;
                drain();
            }
        }

        void innerSuccess(R r5) {
            this.item = r5;
            this.state = 2;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.errorMode == io.reactivex.rxjava3.internal.util.j.IMMEDIATE) {
                    this.inner.dispose();
                }
                this.done = true;
                drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!this.queue.offer(t5)) {
                this.upstream.cancel();
                onError(new io.reactivex.rxjava3.exceptions.c("queue full?!"));
            } else {
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(this.prefetch);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
            drain();
        }
    }

    public f(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends x0<? extends R>> oVar2, io.reactivex.rxjava3.internal.util.j jVar, int i5) {
        this.f17457b = oVar;
        this.f17458c = oVar2;
        this.f17459d = jVar;
        this.f17460e = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f17457b.N6(new a(pVar, this.f17458c, this.f17460e, this.f17459d));
    }
}
