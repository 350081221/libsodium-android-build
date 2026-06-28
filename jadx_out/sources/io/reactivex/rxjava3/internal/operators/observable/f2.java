package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class f2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f17665b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean disposed;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        volatile boolean mainDone;
        volatile int otherState;
        volatile io.reactivex.rxjava3.internal.fuseable.p<T> queue;
        T singleItem;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> mainDisposable = new AtomicReference<>();
        final C0504a<T> otherObserver = new C0504a<>(this);
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();

        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.f2$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0504a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final a<T> parent;

            C0504a(a<T> aVar) {
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

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.downstream = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.disposed = true;
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.mainDisposable);
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
            a1.b bVar;
            boolean z4;
            io.reactivex.rxjava3.core.p0<? super T> p0Var = this.downstream;
            int i5 = 1;
            while (!this.disposed) {
                if (this.errors.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    this.errors.tryTerminateConsumer(p0Var);
                    return;
                }
                int i6 = this.otherState;
                if (i6 == 1) {
                    T t5 = this.singleItem;
                    this.singleItem = null;
                    this.otherState = 2;
                    p0Var.onNext(t5);
                    i6 = 2;
                }
                boolean z5 = this.mainDone;
                io.reactivex.rxjava3.internal.fuseable.p<T> pVar = this.queue;
                if (pVar != null) {
                    bVar = pVar.poll();
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z5 && z4 && i6 == 2) {
                    this.queue = null;
                    p0Var.onComplete();
                    return;
                } else if (z4) {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else {
                    p0Var.onNext(bVar);
                }
            }
            this.singleItem = null;
            this.queue = null;
        }

        io.reactivex.rxjava3.internal.fuseable.p<T> getOrCreateQueue() {
            io.reactivex.rxjava3.internal.fuseable.p<T> pVar = this.queue;
            if (pVar == null) {
                io.reactivex.rxjava3.internal.queue.c cVar = new io.reactivex.rxjava3.internal.queue.c(io.reactivex.rxjava3.core.i0.Z());
                this.queue = cVar;
                return cVar;
            }
            return pVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.mainDisposable.get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.otherObserver);
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t5);
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

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.mainDisposable, eVar);
        }

        void otherError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.mainDisposable);
                drain();
            }
        }

        void otherSuccess(T t5) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t5);
                this.otherState = 2;
            } else {
                this.singleItem = t5;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }
    }

    public f2(io.reactivex.rxjava3.core.i0<T> i0Var, io.reactivex.rxjava3.core.x0<? extends T> x0Var) {
        super(i0Var);
        this.f17665b = x0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        a aVar = new a(p0Var);
        p0Var.onSubscribe(aVar);
        this.f17528a.subscribe(aVar);
        this.f17665b.a(aVar.otherObserver);
    }
}
