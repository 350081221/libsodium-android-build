package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class k4<T, B> extends io.reactivex.rxjava3.internal.operators.observable.a<T, io.reactivex.rxjava3.core.i0<T>> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<B> f17814b;

    /* renamed from: c, reason: collision with root package name */
    final int f17815c;

    /* loaded from: classes3.dex */
    static final class a<T, B> extends io.reactivex.rxjava3.observers.e<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, B> f17816b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17817c;

        a(b<T, B> bVar) {
            this.f17816b = bVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17817c) {
                return;
            }
            this.f17817c = true;
            this.f17816b.innerComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17817c) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17817c = true;
                this.f17816b.innerError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(B b5) {
            if (this.f17817c) {
                return;
            }
            this.f17816b.innerNext();
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, B> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> downstream;
        io.reactivex.rxjava3.subjects.j<T> window;
        final a<T, B> boundaryObserver = new a<>(this);
        final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream = new AtomicReference<>();
        final AtomicInteger windows = new AtomicInteger(1);
        final io.reactivex.rxjava3.internal.queue.a<Object> queue = new io.reactivex.rxjava3.internal.queue.a<>();
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final AtomicBoolean stopWindows = new AtomicBoolean();

        b(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var, int i5) {
            this.downstream = p0Var;
            this.capacityHint = i5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.boundaryObserver.dispose();
                if (this.windows.decrementAndGet() == 0) {
                    io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var = this.downstream;
            io.reactivex.rxjava3.internal.queue.a<Object> aVar = this.queue;
            io.reactivex.rxjava3.internal.util.c cVar = this.errors;
            int i5 = 1;
            while (this.windows.get() != 0) {
                io.reactivex.rxjava3.subjects.j<T> jVar = this.window;
                boolean z5 = this.done;
                if (z5 && cVar.get() != null) {
                    aVar.clear();
                    Throwable terminate = cVar.terminate();
                    if (jVar != 0) {
                        this.window = null;
                        jVar.onError(terminate);
                    }
                    p0Var.onError(terminate);
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
                        if (jVar != 0) {
                            this.window = null;
                            jVar.onComplete();
                        }
                        p0Var.onComplete();
                        return;
                    }
                    if (jVar != 0) {
                        this.window = null;
                        jVar.onError(terminate2);
                    }
                    p0Var.onError(terminate2);
                    return;
                }
                if (z4) {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else if (poll != NEXT_WINDOW) {
                    jVar.onNext(poll);
                } else {
                    if (jVar != 0) {
                        this.window = null;
                        jVar.onComplete();
                    }
                    if (!this.stopWindows.get()) {
                        io.reactivex.rxjava3.subjects.j<T> P8 = io.reactivex.rxjava3.subjects.j.P8(this.capacityHint, this);
                        this.window = P8;
                        this.windows.getAndIncrement();
                        m4 m4Var = new m4(P8);
                        p0Var.onNext(m4Var);
                        if (m4Var.I8()) {
                            P8.onComplete();
                        }
                    }
                }
            }
            aVar.clear();
            this.window = null;
        }

        void innerComplete() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            this.done = true;
            drain();
        }

        void innerError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                drain();
            }
        }

        void innerNext() {
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.stopWindows.get();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.boundaryObserver.dispose();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.boundaryObserver.dispose();
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.queue.offer(t5);
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this.upstream, eVar)) {
                innerNext();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            }
        }
    }

    public k4(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.n0<B> n0Var2, int i5) {
        super(n0Var);
        this.f17814b = n0Var2;
        this.f17815c = i5;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var) {
        b bVar = new b(p0Var, this.f17815c);
        p0Var.onSubscribe(bVar);
        this.f17814b.subscribe(bVar.boundaryObserver);
        this.f17528a.subscribe(bVar);
    }
}
