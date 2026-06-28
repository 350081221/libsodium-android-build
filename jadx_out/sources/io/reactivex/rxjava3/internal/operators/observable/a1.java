package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a1<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> f17532b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f17533c;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final io.reactivex.rxjava3.core.p0<? super R> downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> mapper;
        io.reactivex.rxjava3.disposables.e upstream;
        final io.reactivex.rxjava3.disposables.c set = new io.reactivex.rxjava3.disposables.c();
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<io.reactivex.rxjava3.internal.queue.c<R>> queue = new AtomicReference<>();

        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.a1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0499a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<R>, io.reactivex.rxjava3.disposables.e {
            private static final long serialVersionUID = -502562646270949838L;

            C0499a() {
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public boolean isDisposed() {
                return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                a.this.innerError(this, th);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }

            @Override // io.reactivex.rxjava3.core.u0
            public void onSuccess(R r5) {
                a.this.innerSuccess(this, r5);
            }
        }

        a(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar, boolean z4) {
            this.downstream = p0Var;
            this.mapper = oVar;
            this.delayErrors = z4;
        }

        void clear() {
            io.reactivex.rxjava3.internal.queue.c<R> cVar = this.queue.get();
            if (cVar != null) {
                cVar.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.set.dispose();
            this.errors.tryTerminateAndReport();
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        void drainLoop() {
            boolean z4;
            a1.b bVar;
            io.reactivex.rxjava3.core.p0<? super R> p0Var = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<io.reactivex.rxjava3.internal.queue.c<R>> atomicReference = this.queue;
            int i5 = 1;
            while (!this.cancelled) {
                if (!this.delayErrors && this.errors.get() != null) {
                    clear();
                    this.errors.tryTerminateConsumer(p0Var);
                    return;
                }
                boolean z5 = false;
                if (atomicInteger.get() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                io.reactivex.rxjava3.internal.queue.c<R> cVar = atomicReference.get();
                if (cVar != null) {
                    bVar = cVar.poll();
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    z5 = true;
                }
                if (z4 && z5) {
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                } else if (z5) {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else {
                    p0Var.onNext(bVar);
                }
            }
            clear();
        }

        io.reactivex.rxjava3.internal.queue.c<R> getOrCreateQueue() {
            io.reactivex.rxjava3.internal.queue.c<R> cVar = this.queue.get();
            if (cVar != null) {
                return cVar;
            }
            io.reactivex.rxjava3.internal.queue.c<R> cVar2 = new io.reactivex.rxjava3.internal.queue.c<>(io.reactivex.rxjava3.core.i0.Z());
            if (androidx.compose.animation.core.h.a(this.queue, null, cVar2)) {
                return cVar2;
            }
            return this.queue.get();
        }

        void innerError(a<T, R>.C0499a c0499a, Throwable th) {
            this.set.c(c0499a);
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (!this.delayErrors) {
                    this.upstream.dispose();
                    this.set.dispose();
                }
                this.active.decrementAndGet();
                drain();
            }
        }

        void innerSuccess(a<T, R>.C0499a c0499a, R r5) {
            this.set.c(c0499a);
            if (get() == 0) {
                boolean z4 = false;
                if (compareAndSet(0, 1)) {
                    this.downstream.onNext(r5);
                    if (this.active.decrementAndGet() == 0) {
                        z4 = true;
                    }
                    io.reactivex.rxjava3.internal.queue.c<R> cVar = this.queue.get();
                    if (z4 && (cVar == null || cVar.isEmpty())) {
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    drainLoop();
                }
            }
            io.reactivex.rxjava3.internal.queue.c<R> orCreateQueue = getOrCreateQueue();
            synchronized (orCreateQueue) {
                orCreateQueue.offer(r5);
            }
            this.active.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.active.decrementAndGet();
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            try {
                io.reactivex.rxjava3.core.x0<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                io.reactivex.rxjava3.core.x0<? extends R> x0Var = apply;
                this.active.getAndIncrement();
                C0499a c0499a = new C0499a();
                if (!this.cancelled && this.set.b(c0499a)) {
                    x0Var.a(c0499a);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public a1(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar, boolean z4) {
        super(n0Var);
        this.f17532b = oVar;
        this.f17533c = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17532b, this.f17533c));
    }
}
