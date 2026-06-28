package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.q0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class w<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> f18141b;

    /* renamed from: c, reason: collision with root package name */
    final int f18142c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f18143d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18144e;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super R> downstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> mapper;
        final C0512a<R> observer;
        io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        int sourceMode;
        final boolean tillTheEnd;
        io.reactivex.rxjava3.disposables.e upstream;
        final q0.c worker;

        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0512a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final io.reactivex.rxjava3.core.p0<? super R> downstream;
            final a<?, R> parent;

            C0512a(io.reactivex.rxjava3.core.p0<? super R> p0Var, a<?, R> aVar) {
                this.downstream = p0Var;
                this.parent = aVar;
            }

            void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onComplete() {
                a<?, R> aVar = this.parent;
                aVar.active = false;
                aVar.drain();
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onError(Throwable th) {
                a<?, R> aVar = this.parent;
                if (aVar.errors.tryAddThrowableOrReport(th)) {
                    if (!aVar.tillTheEnd) {
                        aVar.upstream.dispose();
                    }
                    aVar.active = false;
                    aVar.drain();
                }
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onNext(R r5) {
                this.downstream.onNext(r5);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
            }
        }

        a(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> oVar, int i5, boolean z4, q0.c cVar) {
            this.downstream = p0Var;
            this.mapper = oVar;
            this.bufferSize = i5;
            this.tillTheEnd = z4;
            this.observer = new C0512a<>(p0Var, this);
            this.worker = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.observer.dispose();
            this.worker.dispose();
            this.errors.tryTerminateAndReport();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.sourceMode == 0) {
                this.queue.offer(t5);
            }
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                if (eVar instanceof io.reactivex.rxjava3.internal.fuseable.l) {
                    io.reactivex.rxjava3.internal.fuseable.l lVar = (io.reactivex.rxjava3.internal.fuseable.l) eVar;
                    int requestFusion = lVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = lVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = lVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.c(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            io.reactivex.rxjava3.core.p0<? super R> p0Var = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.queue;
            io.reactivex.rxjava3.internal.util.c cVar = this.errors;
            while (true) {
                if (!this.active) {
                    if (this.cancelled) {
                        qVar.clear();
                        return;
                    }
                    if (!this.tillTheEnd && cVar.get() != null) {
                        qVar.clear();
                        this.cancelled = true;
                        cVar.tryTerminateConsumer(p0Var);
                        this.worker.dispose();
                        return;
                    }
                    boolean z5 = this.done;
                    try {
                        T poll = qVar.poll();
                        if (poll == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z5 && z4) {
                            this.cancelled = true;
                            cVar.tryTerminateConsumer(p0Var);
                            this.worker.dispose();
                            return;
                        }
                        if (!z4) {
                            try {
                                io.reactivex.rxjava3.core.n0<? extends R> apply = this.mapper.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                io.reactivex.rxjava3.core.n0<? extends R> n0Var = apply;
                                if (n0Var instanceof m3.s) {
                                    try {
                                        a1.a aVar = (Object) ((m3.s) n0Var).get();
                                        if (aVar != null && !this.cancelled) {
                                            p0Var.onNext(aVar);
                                        }
                                    } catch (Throwable th) {
                                        io.reactivex.rxjava3.exceptions.b.b(th);
                                        cVar.tryAddThrowableOrReport(th);
                                    }
                                } else {
                                    this.active = true;
                                    n0Var.subscribe(this.observer);
                                }
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.b.b(th2);
                                this.cancelled = true;
                                this.upstream.dispose();
                                qVar.clear();
                                cVar.tryAddThrowableOrReport(th2);
                                cVar.tryTerminateConsumer(p0Var);
                                this.worker.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.b.b(th3);
                        this.cancelled = true;
                        this.upstream.dispose();
                        cVar.tryAddThrowableOrReport(th3);
                        cVar.tryTerminateConsumer(p0Var);
                        this.worker.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, U> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super U> downstream;
        int fusionMode;
        final a<U> inner;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> mapper;
        io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        io.reactivex.rxjava3.disposables.e upstream;
        final q0.c worker;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a<U> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final io.reactivex.rxjava3.core.p0<? super U> downstream;
            final b<?, ?> parent;

            a(io.reactivex.rxjava3.core.p0<? super U> p0Var, b<?, ?> bVar) {
                this.downstream = p0Var;
                this.parent = bVar;
            }

            void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onError(Throwable th) {
                this.parent.dispose();
                this.downstream.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onNext(U u4) {
                this.downstream.onNext(u4);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
            }
        }

        b(io.reactivex.rxjava3.core.p0<? super U> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> oVar, int i5, q0.c cVar) {
            this.downstream = p0Var;
            this.mapper = oVar;
            this.bufferSize = i5;
            this.inner = new a<>(p0Var, this);
            this.worker = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.disposed = true;
            this.inner.dispose();
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.b(this);
        }

        void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.done = true;
            dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (this.fusionMode == 0) {
                this.queue.offer(t5);
            }
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                if (eVar instanceof io.reactivex.rxjava3.internal.fuseable.l) {
                    io.reactivex.rxjava3.internal.fuseable.l lVar = (io.reactivex.rxjava3.internal.fuseable.l) eVar;
                    int requestFusion = lVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = lVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = lVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.c(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            while (!this.disposed) {
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
                            this.disposed = true;
                            this.downstream.onComplete();
                            this.worker.dispose();
                            return;
                        } else if (!z4) {
                            try {
                                io.reactivex.rxjava3.core.n0<? extends U> apply = this.mapper.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                io.reactivex.rxjava3.core.n0<? extends U> n0Var = apply;
                                this.active = true;
                                n0Var.subscribe(this.inner);
                            } catch (Throwable th) {
                                io.reactivex.rxjava3.exceptions.b.b(th);
                                dispose();
                                this.queue.clear();
                                this.downstream.onError(th);
                                this.worker.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        dispose();
                        this.queue.clear();
                        this.downstream.onError(th2);
                        this.worker.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.queue.clear();
        }
    }

    public w(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> oVar, int i5, io.reactivex.rxjava3.internal.util.j jVar, io.reactivex.rxjava3.core.q0 q0Var) {
        super(n0Var);
        this.f18141b = oVar;
        this.f18143d = jVar;
        this.f18142c = Math.max(8, i5);
        this.f18144e = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super U> p0Var) {
        boolean z4;
        if (this.f18143d == io.reactivex.rxjava3.internal.util.j.IMMEDIATE) {
            this.f17528a.subscribe(new b(new io.reactivex.rxjava3.observers.m(p0Var), this.f18141b, this.f18142c, this.f18144e.c()));
            return;
        }
        io.reactivex.rxjava3.core.n0<T> n0Var = this.f17528a;
        m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> oVar = this.f18141b;
        int i5 = this.f18142c;
        if (this.f18143d == io.reactivex.rxjava3.internal.util.j.END) {
            z4 = true;
        } else {
            z4 = false;
        }
        n0Var.subscribe(new a(p0Var, oVar, i5, z4, this.f18144e.c()));
    }
}
