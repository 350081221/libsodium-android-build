package io.reactivex.rxjava3.internal.operators.mixed;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c<T> extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f17445a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> f17446b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f17447c;

    /* renamed from: d, reason: collision with root package name */
    final int f17448d;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        int consumed;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.rxjava3.core.f downstream;
        final io.reactivex.rxjava3.internal.util.j errorMode;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final C0487a inner = new C0487a(this);
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> mapper;
        final int prefetch;
        final io.reactivex.rxjava3.internal.fuseable.p<T> queue;
        org.reactivestreams.q upstream;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0487a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f {
            private static final long serialVersionUID = 5638352172918776687L;
            final a<?> parent;

            C0487a(a<?> aVar) {
                this.parent = aVar;
            }

            void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
            }
        }

        a(io.reactivex.rxjava3.core.f fVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, io.reactivex.rxjava3.internal.util.j jVar, int i5) {
            this.downstream = fVar;
            this.mapper = oVar;
            this.errorMode = jVar;
            this.prefetch = i5;
            this.queue = new io.reactivex.rxjava3.internal.queue.b(i5);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.disposed = true;
            this.upstream.cancel();
            this.inner.dispose();
            this.errors.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.disposed) {
                if (!this.active) {
                    if (this.errorMode == io.reactivex.rxjava3.internal.util.j.BOUNDARY && this.errors.get() != null) {
                        this.queue.clear();
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    boolean z5 = this.done;
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
                        int i5 = this.prefetch;
                        int i6 = i5 - (i5 >> 1);
                        int i7 = this.consumed + 1;
                        if (i7 == i6) {
                            this.consumed = 0;
                            this.upstream.request(i6);
                        } else {
                            this.consumed = i7;
                        }
                        try {
                            io.reactivex.rxjava3.core.i apply = this.mapper.apply(poll);
                            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                            io.reactivex.rxjava3.core.i iVar = apply;
                            this.active = true;
                            iVar.a(this.inner);
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            this.queue.clear();
                            this.upstream.cancel();
                            this.errors.tryAddThrowableOrReport(th);
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.queue.clear();
        }

        void innerComplete() {
            this.active = false;
            drain();
        }

        void innerError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.errorMode == io.reactivex.rxjava3.internal.util.j.IMMEDIATE) {
                    this.upstream.cancel();
                    this.errors.tryTerminateConsumer(this.downstream);
                    if (getAndIncrement() == 0) {
                        this.queue.clear();
                        return;
                    }
                    return;
                }
                this.active = false;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.disposed;
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
                    this.errors.tryTerminateConsumer(this.downstream);
                    if (getAndIncrement() == 0) {
                        this.queue.clear();
                        return;
                    }
                    return;
                }
                this.done = true;
                drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.queue.offer(t5)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new io.reactivex.rxjava3.exceptions.c("Queue full?!"));
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
    }

    public c(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar2, io.reactivex.rxjava3.internal.util.j jVar, int i5) {
        this.f17445a = oVar;
        this.f17446b = oVar2;
        this.f17447c = jVar;
        this.f17448d = i5;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f17445a.N6(new a(fVar, this.f17446b, this.f17447c, this.f17448d));
    }
}
