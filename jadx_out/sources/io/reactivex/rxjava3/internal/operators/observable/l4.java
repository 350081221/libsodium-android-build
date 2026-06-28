package io.reactivex.rxjava3.internal.operators.observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class l4<T, B, V> extends io.reactivex.rxjava3.internal.operators.observable.a<T, io.reactivex.rxjava3.core.i0<T>> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<B> f17828b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super B, ? extends io.reactivex.rxjava3.core.n0<V>> f17829c;

    /* renamed from: d, reason: collision with root package name */
    final int f17830d;

    /* loaded from: classes3.dex */
    static final class a<T, B, V> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 8646217640096099753L;
        final int bufferSize;
        final m3.o<? super B, ? extends io.reactivex.rxjava3.core.n0<V>> closingIndicator;
        final io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> downstream;
        long emitted;
        final io.reactivex.rxjava3.core.n0<B> open;
        volatile boolean openDone;
        io.reactivex.rxjava3.disposables.e upstream;
        volatile boolean upstreamCanceled;
        volatile boolean upstreamDone;
        final io.reactivex.rxjava3.internal.fuseable.p<Object> queue = new io.reactivex.rxjava3.internal.queue.a();
        final io.reactivex.rxjava3.disposables.c resources = new io.reactivex.rxjava3.disposables.c();
        final List<io.reactivex.rxjava3.subjects.j<T>> windows = new ArrayList();
        final AtomicLong windowCount = new AtomicLong(1);
        final AtomicBoolean downstreamDisposed = new AtomicBoolean();
        final io.reactivex.rxjava3.internal.util.c error = new io.reactivex.rxjava3.internal.util.c();
        final c<B> startObserver = new c<>(this);
        final AtomicLong requested = new AtomicLong();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.l4$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0508a<T, V> extends io.reactivex.rxjava3.core.i0<T> implements io.reactivex.rxjava3.core.p0<V>, io.reactivex.rxjava3.disposables.e {

            /* renamed from: a, reason: collision with root package name */
            final a<T, ?, V> f17831a;

            /* renamed from: b, reason: collision with root package name */
            final io.reactivex.rxjava3.subjects.j<T> f17832b;

            /* renamed from: c, reason: collision with root package name */
            final AtomicReference<io.reactivex.rxjava3.disposables.e> f17833c = new AtomicReference<>();

            /* renamed from: d, reason: collision with root package name */
            final AtomicBoolean f17834d = new AtomicBoolean();

            C0508a(a<T, ?, V> aVar, io.reactivex.rxjava3.subjects.j<T> jVar) {
                this.f17831a = aVar;
                this.f17832b = jVar;
            }

            boolean I8() {
                return !this.f17834d.get() && this.f17834d.compareAndSet(false, true);
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.f17833c);
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public boolean isDisposed() {
                return this.f17833c.get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            }

            @Override // io.reactivex.rxjava3.core.i0
            protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
                this.f17832b.subscribe(p0Var);
                this.f17834d.set(true);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onComplete() {
                this.f17831a.close(this);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onError(Throwable th) {
                if (isDisposed()) {
                    io.reactivex.rxjava3.plugins.a.Y(th);
                } else {
                    this.f17831a.closeError(th);
                }
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onNext(V v4) {
                if (io.reactivex.rxjava3.internal.disposables.c.dispose(this.f17833c)) {
                    this.f17831a.close(this);
                }
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f17833c, eVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class b<B> {

            /* renamed from: a, reason: collision with root package name */
            final B f17835a;

            b(B b5) {
                this.f17835a = b5;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class c<B> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<B> {
            private static final long serialVersionUID = -3326496781427702834L;
            final a<?, B, ?> parent;

            c(a<?, B, ?> aVar) {
                this.parent = aVar;
            }

            void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onComplete() {
                this.parent.openComplete();
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onError(Throwable th) {
                this.parent.openError(th);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onNext(B b5) {
                this.parent.open(b5);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }
        }

        a(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var, io.reactivex.rxjava3.core.n0<B> n0Var, m3.o<? super B, ? extends io.reactivex.rxjava3.core.n0<V>> oVar, int i5) {
            this.downstream = p0Var;
            this.open = n0Var;
            this.closingIndicator = oVar;
            this.bufferSize = i5;
        }

        void close(C0508a<T, V> c0508a) {
            this.queue.offer(c0508a);
            drain();
        }

        void closeError(Throwable th) {
            this.upstream.dispose();
            this.startObserver.dispose();
            this.resources.dispose();
            if (this.error.tryAddThrowableOrReport(th)) {
                this.upstreamDone = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (this.downstreamDisposed.compareAndSet(false, true)) {
                if (this.windowCount.decrementAndGet() == 0) {
                    this.upstream.dispose();
                    this.startObserver.dispose();
                    this.resources.dispose();
                    this.error.tryTerminateAndReport();
                    this.upstreamCanceled = true;
                    drain();
                    return;
                }
                this.startObserver.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.p<Object> pVar = this.queue;
            List<io.reactivex.rxjava3.subjects.j<T>> list = this.windows;
            int i5 = 1;
            while (true) {
                if (this.upstreamCanceled) {
                    pVar.clear();
                    list.clear();
                } else {
                    boolean z5 = this.upstreamDone;
                    Object poll = pVar.poll();
                    if (poll == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5 && (z4 || this.error.get() != null)) {
                        terminateDownstream(p0Var);
                        this.upstreamCanceled = true;
                    } else if (!z4) {
                        if (poll instanceof b) {
                            if (!this.downstreamDisposed.get()) {
                                try {
                                    io.reactivex.rxjava3.core.n0<V> apply = this.closingIndicator.apply(((b) poll).f17835a);
                                    Objects.requireNonNull(apply, "The closingIndicator returned a null ObservableSource");
                                    io.reactivex.rxjava3.core.n0<V> n0Var = apply;
                                    this.windowCount.getAndIncrement();
                                    io.reactivex.rxjava3.subjects.j<T> P8 = io.reactivex.rxjava3.subjects.j.P8(this.bufferSize, this);
                                    C0508a c0508a = new C0508a(this, P8);
                                    p0Var.onNext(c0508a);
                                    if (c0508a.I8()) {
                                        P8.onComplete();
                                    } else {
                                        list.add(P8);
                                        this.resources.b(c0508a);
                                        n0Var.subscribe(c0508a);
                                    }
                                } catch (Throwable th) {
                                    io.reactivex.rxjava3.exceptions.b.b(th);
                                    this.upstream.dispose();
                                    this.startObserver.dispose();
                                    this.resources.dispose();
                                    io.reactivex.rxjava3.exceptions.b.b(th);
                                    this.error.tryAddThrowableOrReport(th);
                                    this.upstreamDone = true;
                                }
                            }
                        } else if (poll instanceof C0508a) {
                            io.reactivex.rxjava3.subjects.j<T> jVar = ((C0508a) poll).f17832b;
                            list.remove(jVar);
                            this.resources.c((io.reactivex.rxjava3.disposables.e) poll);
                            jVar.onComplete();
                        } else {
                            Iterator<io.reactivex.rxjava3.subjects.j<T>> it = list.iterator();
                            while (it.hasNext()) {
                                it.next().onNext(poll);
                            }
                        }
                    } else if (this.openDone && list.size() == 0) {
                        this.upstream.dispose();
                        this.startObserver.dispose();
                        this.resources.dispose();
                        terminateDownstream(p0Var);
                        this.upstreamCanceled = true;
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.downstreamDisposed.get();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.startObserver.dispose();
            this.resources.dispose();
            this.upstreamDone = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.startObserver.dispose();
            this.resources.dispose();
            if (this.error.tryAddThrowableOrReport(th)) {
                this.upstreamDone = true;
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
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
                this.open.subscribe(this.startObserver);
            }
        }

        void open(B b5) {
            this.queue.offer(new b(b5));
            drain();
        }

        void openComplete() {
            this.openDone = true;
            drain();
        }

        void openError(Throwable th) {
            this.upstream.dispose();
            this.resources.dispose();
            if (this.error.tryAddThrowableOrReport(th)) {
                this.upstreamDone = true;
                drain();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windowCount.decrementAndGet() == 0) {
                this.upstream.dispose();
                this.startObserver.dispose();
                this.resources.dispose();
                this.error.tryTerminateAndReport();
                this.upstreamCanceled = true;
                drain();
            }
        }

        void terminateDownstream(io.reactivex.rxjava3.core.p0<?> p0Var) {
            Throwable terminate = this.error.terminate();
            if (terminate == null) {
                Iterator<io.reactivex.rxjava3.subjects.j<T>> it = this.windows.iterator();
                while (it.hasNext()) {
                    it.next().onComplete();
                }
                p0Var.onComplete();
                return;
            }
            if (terminate != io.reactivex.rxjava3.internal.util.k.f18688a) {
                Iterator<io.reactivex.rxjava3.subjects.j<T>> it2 = this.windows.iterator();
                while (it2.hasNext()) {
                    it2.next().onError(terminate);
                }
                p0Var.onError(terminate);
            }
        }
    }

    public l4(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.n0<B> n0Var2, m3.o<? super B, ? extends io.reactivex.rxjava3.core.n0<V>> oVar, int i5) {
        super(n0Var);
        this.f17828b = n0Var2;
        this.f17829c = oVar;
        this.f17830d = i5;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17828b, this.f17829c, this.f17830d));
    }
}
