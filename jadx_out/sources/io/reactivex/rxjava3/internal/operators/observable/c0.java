package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c0<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.l0<T> f17576a;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.k0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -3434801548987643227L;
        final io.reactivex.rxjava3.core.p0<? super T> observer;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.observer = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.k0, io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onComplete() {
            if (!isDisposed()) {
                try {
                    this.observer.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onNext(T t5) {
            if (t5 == null) {
                onError(io.reactivex.rxjava3.internal.util.k.b("onNext called with a null value."));
            } else if (!isDisposed()) {
                this.observer.onNext(t5);
            }
        }

        @Override // io.reactivex.rxjava3.core.k0
        public io.reactivex.rxjava3.core.k0<T> serialize() {
            return new b(this);
        }

        @Override // io.reactivex.rxjava3.core.k0
        public void setCancellable(m3.f fVar) {
            setDisposable(new io.reactivex.rxjava3.internal.disposables.b(fVar));
        }

        @Override // io.reactivex.rxjava3.core.k0
        public void setDisposable(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.set(this, eVar);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }

        @Override // io.reactivex.rxjava3.core.k0
        public boolean tryOnError(Throwable th) {
            if (th == null) {
                th = io.reactivex.rxjava3.internal.util.k.b("onError called with a null Throwable.");
            }
            if (!isDisposed()) {
                try {
                    this.observer.onError(th);
                    dispose();
                    return true;
                } catch (Throwable th2) {
                    dispose();
                    throw th2;
                }
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends AtomicInteger implements io.reactivex.rxjava3.core.k0<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean done;
        final io.reactivex.rxjava3.core.k0<T> emitter;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final io.reactivex.rxjava3.internal.queue.c<T> queue = new io.reactivex.rxjava3.internal.queue.c<>(16);

        b(io.reactivex.rxjava3.core.k0<T> k0Var) {
            this.emitter = k0Var;
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        void drainLoop() {
            boolean z4;
            io.reactivex.rxjava3.core.k0<T> k0Var = this.emitter;
            io.reactivex.rxjava3.internal.queue.c<T> cVar = this.queue;
            io.reactivex.rxjava3.internal.util.c cVar2 = this.errors;
            int i5 = 1;
            while (!k0Var.isDisposed()) {
                if (cVar2.get() != null) {
                    cVar.clear();
                    cVar2.tryTerminateConsumer(k0Var);
                    return;
                }
                boolean z5 = this.done;
                T poll = cVar.poll();
                if (poll == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z5 && z4) {
                    k0Var.onComplete();
                    return;
                } else if (z4) {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else {
                    k0Var.onNext(poll);
                }
            }
            cVar.clear();
        }

        @Override // io.reactivex.rxjava3.core.k0, io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.emitter.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onComplete() {
            if (!this.done && !this.emitter.isDisposed()) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onNext(T t5) {
            if (!this.done && !this.emitter.isDisposed()) {
                if (t5 == null) {
                    onError(io.reactivex.rxjava3.internal.util.k.b("onNext called with a null value."));
                    return;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.emitter.onNext(t5);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    io.reactivex.rxjava3.internal.queue.c<T> cVar = this.queue;
                    synchronized (cVar) {
                        cVar.offer(t5);
                    }
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
                drainLoop();
            }
        }

        @Override // io.reactivex.rxjava3.core.k0
        public io.reactivex.rxjava3.core.k0<T> serialize() {
            return this;
        }

        @Override // io.reactivex.rxjava3.core.k0
        public void setCancellable(m3.f fVar) {
            this.emitter.setCancellable(fVar);
        }

        @Override // io.reactivex.rxjava3.core.k0
        public void setDisposable(io.reactivex.rxjava3.disposables.e eVar) {
            this.emitter.setDisposable(eVar);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.emitter.toString();
        }

        @Override // io.reactivex.rxjava3.core.k0
        public boolean tryOnError(Throwable th) {
            if (!this.done && !this.emitter.isDisposed()) {
                if (th == null) {
                    th = io.reactivex.rxjava3.internal.util.k.b("onError called with a null Throwable.");
                }
                if (this.errors.tryAddThrowable(th)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }
    }

    public c0(io.reactivex.rxjava3.core.l0<T> l0Var) {
        this.f17576a = l0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        a aVar = new a(p0Var);
        p0Var.onSubscribe(aVar);
        try {
            this.f17576a.a(aVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            aVar.onError(th);
        }
    }
}
