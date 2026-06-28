package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class n<T, U extends Collection<? super T>, Open, Close> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final m3.s<U> f17867b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends Open> f17868c;

    /* renamed from: d, reason: collision with root package name */
    final m3.o<? super Open, ? extends io.reactivex.rxjava3.core.n0<? extends Close>> f17869d;

    /* loaded from: classes3.dex */
    static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -8466418554264089604L;
        final m3.o<? super Open, ? extends io.reactivex.rxjava3.core.n0<? extends Close>> bufferClose;
        final io.reactivex.rxjava3.core.n0<? extends Open> bufferOpen;
        final m3.s<C> bufferSupplier;
        volatile boolean cancelled;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super C> downstream;
        long index;
        final io.reactivex.rxjava3.internal.queue.c<C> queue = new io.reactivex.rxjava3.internal.queue.c<>(io.reactivex.rxjava3.core.i0.Z());
        final io.reactivex.rxjava3.disposables.c observers = new io.reactivex.rxjava3.disposables.c();
        final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream = new AtomicReference<>();
        Map<Long, C> buffers = new LinkedHashMap();
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();

        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0509a<Open> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<Open>, io.reactivex.rxjava3.disposables.e {
            private static final long serialVersionUID = -8498650778633225126L;
            final a<?, ?, Open, ?> parent;

            C0509a(a<?, ?, Open, ?> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public boolean isDisposed() {
                return get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onComplete() {
                lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
                this.parent.openComplete(this);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onError(Throwable th) {
                lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
                this.parent.boundaryError(this, th);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onNext(Open open) {
                this.parent.open(open);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }
        }

        a(io.reactivex.rxjava3.core.p0<? super C> p0Var, io.reactivex.rxjava3.core.n0<? extends Open> n0Var, m3.o<? super Open, ? extends io.reactivex.rxjava3.core.n0<? extends Close>> oVar, m3.s<C> sVar) {
            this.downstream = p0Var;
            this.bufferSupplier = sVar;
            this.bufferOpen = n0Var;
            this.bufferClose = oVar;
        }

        void boundaryError(io.reactivex.rxjava3.disposables.e eVar, Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            this.observers.c(eVar);
            onError(th);
        }

        void close(b<T, C> bVar, long j5) {
            boolean z4;
            this.observers.c(bVar);
            if (this.observers.o() == 0) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
                z4 = true;
            } else {
                z4 = false;
            }
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                this.queue.offer(map.remove(Long.valueOf(j5)));
                if (z4) {
                    this.done = true;
                }
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream)) {
                this.cancelled = true;
                this.observers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                if (getAndIncrement() != 0) {
                    this.queue.clear();
                }
            }
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.p0<? super C> p0Var = this.downstream;
            io.reactivex.rxjava3.internal.queue.c<C> cVar = this.queue;
            int i5 = 1;
            while (!this.cancelled) {
                boolean z5 = this.done;
                if (z5 && this.errors.get() != null) {
                    cVar.clear();
                    this.errors.tryTerminateConsumer(p0Var);
                    return;
                }
                C poll = cVar.poll();
                if (poll == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z5 && z4) {
                    p0Var.onComplete();
                    return;
                } else if (z4) {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else {
                    p0Var.onNext(poll);
                }
            }
            cVar.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.observers.dispose();
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    this.queue.offer(it.next());
                }
                this.buffers = null;
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.observers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().add(t5);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this.upstream, eVar)) {
                C0509a c0509a = new C0509a(this);
                this.observers.b(c0509a);
                this.bufferOpen.subscribe(c0509a);
            }
        }

        void open(Open open) {
            try {
                C c5 = this.bufferSupplier.get();
                Objects.requireNonNull(c5, "The bufferSupplier returned a null Collection");
                C c6 = c5;
                io.reactivex.rxjava3.core.n0<? extends Close> apply = this.bufferClose.apply(open);
                Objects.requireNonNull(apply, "The bufferClose returned a null ObservableSource");
                io.reactivex.rxjava3.core.n0<? extends Close> n0Var = apply;
                long j5 = this.index;
                this.index = 1 + j5;
                synchronized (this) {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    map.put(Long.valueOf(j5), c6);
                    b bVar = new b(this, j5);
                    this.observers.b(bVar);
                    n0Var.subscribe(bVar);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
                onError(th);
            }
        }

        void openComplete(C0509a<Open> c0509a) {
            this.observers.c(c0509a);
            if (this.observers.o() == 0) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
                this.done = true;
                drain();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T, C extends Collection<? super T>> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<Object>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -8498650778633225126L;
        final long index;
        final a<T, C, ?, ?> parent;

        b(a<T, C, ?, ?> aVar, long j5) {
            this.parent = aVar;
            this.index = j5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            io.reactivex.rxjava3.disposables.e eVar = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar) {
                lazySet(cVar);
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.disposables.e eVar = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar) {
                lazySet(cVar);
                this.parent.boundaryError(this, th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(Object obj) {
            io.reactivex.rxjava3.disposables.e eVar = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar) {
                lazySet(cVar);
                eVar.dispose();
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }
    }

    public n(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.n0<? extends Open> n0Var2, m3.o<? super Open, ? extends io.reactivex.rxjava3.core.n0<? extends Close>> oVar, m3.s<U> sVar) {
        super(n0Var);
        this.f17868c = n0Var2;
        this.f17869d = oVar;
        this.f17867b = sVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super U> p0Var) {
        a aVar = new a(p0Var, this.f17868c, this.f17869d, this.f17867b);
        p0Var.onSubscribe(aVar);
        this.f17528a.subscribe(aVar);
    }
}
