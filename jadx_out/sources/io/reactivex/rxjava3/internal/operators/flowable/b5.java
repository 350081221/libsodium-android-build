package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.q0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class b5<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, io.reactivex.rxjava3.core.o<T>> {

    /* renamed from: c, reason: collision with root package name */
    final long f16631c;

    /* renamed from: d, reason: collision with root package name */
    final long f16632d;

    /* renamed from: e, reason: collision with root package name */
    final TimeUnit f16633e;

    /* renamed from: f, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16634f;

    /* renamed from: g, reason: collision with root package name */
    final long f16635g;

    /* renamed from: h, reason: collision with root package name */
    final int f16636h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f16637i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 5724293814035355511L;
        final int bufferSize;
        volatile boolean done;
        final org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> downstream;
        long emitted;
        Throwable error;
        final long timespan;
        final TimeUnit unit;
        org.reactivestreams.q upstream;
        volatile boolean upstreamCancelled;
        final io.reactivex.rxjava3.internal.fuseable.p<Object> queue = new io.reactivex.rxjava3.internal.queue.a();
        final AtomicLong requested = new AtomicLong();
        final AtomicBoolean downstreamCancelled = new AtomicBoolean();
        final AtomicInteger windowCount = new AtomicInteger(1);

        a(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar, long j5, TimeUnit timeUnit, int i5) {
            this.downstream = pVar;
            this.timespan = j5;
            this.unit = timeUnit;
            this.bufferSize = i5;
        }

        @Override // org.reactivestreams.q
        public final void cancel() {
            if (this.downstreamCancelled.compareAndSet(false, true)) {
                windowDone();
            }
        }

        abstract void cleanupResources();

        abstract void createFirstWindow();

        abstract void drain();

        @Override // org.reactivestreams.p
        public final void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public final void onNext(T t5) {
            this.queue.offer(t5);
            drain();
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public final void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                createFirstWindow();
            }
        }

        @Override // org.reactivestreams.q
        public final void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
            }
        }

        final void windowDone() {
            if (this.windowCount.decrementAndGet() == 0) {
                cleanupResources();
                this.upstream.cancel();
                this.upstreamCancelled = true;
                drain();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends a<T> implements Runnable {
        private static final long serialVersionUID = -6130475889925953722L;
        long count;
        final long maxSize;
        final boolean restartTimerOnMaxSize;
        final io.reactivex.rxjava3.core.q0 scheduler;
        final io.reactivex.rxjava3.internal.disposables.f timer;
        io.reactivex.rxjava3.processors.h<T> window;
        final q0.c worker;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final b<?> f16638a;

            /* renamed from: b, reason: collision with root package name */
            final long f16639b;

            a(b<?> bVar, long j5) {
                this.f16638a = bVar;
                this.f16639b = j5;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16638a.boundary(this);
            }
        }

        b(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5, long j6, boolean z4) {
            super(pVar, j5, timeUnit, i5);
            this.scheduler = q0Var;
            this.maxSize = j6;
            this.restartTimerOnMaxSize = z4;
            if (z4) {
                this.worker = q0Var.c();
            } else {
                this.worker = null;
            }
            this.timer = new io.reactivex.rxjava3.internal.disposables.f();
        }

        void boundary(a aVar) {
            this.queue.offer(aVar);
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.b5.a
        void cleanupResources() {
            this.timer.dispose();
            q0.c cVar = this.worker;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.b5.a
        void createFirstWindow() {
            if (!this.downstreamCancelled.get()) {
                if (this.requested.get() != 0) {
                    this.emitted = 1L;
                    this.windowCount.getAndIncrement();
                    this.window = io.reactivex.rxjava3.processors.h.v9(this.bufferSize, this);
                    a5 a5Var = new a5(this.window);
                    this.downstream.onNext(a5Var);
                    a aVar = new a(this, 1L);
                    if (this.restartTimerOnMaxSize) {
                        io.reactivex.rxjava3.internal.disposables.f fVar = this.timer;
                        q0.c cVar = this.worker;
                        long j5 = this.timespan;
                        fVar.replace(cVar.d(aVar, j5, j5, this.unit));
                    } else {
                        io.reactivex.rxjava3.internal.disposables.f fVar2 = this.timer;
                        io.reactivex.rxjava3.core.q0 q0Var = this.scheduler;
                        long j6 = this.timespan;
                        fVar2.replace(q0Var.o(aVar, j6, j6, this.unit));
                    }
                    if (a5Var.n9()) {
                        this.window.onComplete();
                    }
                    this.upstream.request(Long.MAX_VALUE);
                    return;
                }
                this.upstream.cancel();
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.c(b5.n9(this.emitted)));
                cleanupResources();
                this.upstreamCancelled = true;
            }
        }

        io.reactivex.rxjava3.processors.h<T> createNewWindow(io.reactivex.rxjava3.processors.h<T> hVar) {
            if (hVar != null) {
                hVar.onComplete();
                hVar = null;
            }
            if (this.downstreamCancelled.get()) {
                cleanupResources();
            } else {
                long j5 = this.emitted;
                if (this.requested.get() == j5) {
                    this.upstream.cancel();
                    cleanupResources();
                    this.upstreamCancelled = true;
                    this.downstream.onError(new io.reactivex.rxjava3.exceptions.c(b5.n9(j5)));
                } else {
                    long j6 = j5 + 1;
                    this.emitted = j6;
                    this.windowCount.getAndIncrement();
                    hVar = io.reactivex.rxjava3.processors.h.v9(this.bufferSize, this);
                    this.window = hVar;
                    a5 a5Var = new a5(hVar);
                    this.downstream.onNext(a5Var);
                    if (this.restartTimerOnMaxSize) {
                        io.reactivex.rxjava3.internal.disposables.f fVar = this.timer;
                        q0.c cVar = this.worker;
                        a aVar = new a(this, j6);
                        long j7 = this.timespan;
                        fVar.update(cVar.d(aVar, j7, j7, this.unit));
                    }
                    if (a5Var.n9()) {
                        hVar.onComplete();
                    }
                }
            }
            return hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.b5.a
        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.p<Object> pVar = this.queue;
            org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar2 = this.downstream;
            io.reactivex.rxjava3.processors.h<T> hVar = this.window;
            int i5 = 1;
            while (true) {
                if (this.upstreamCancelled) {
                    pVar.clear();
                    hVar = 0;
                    this.window = null;
                } else {
                    boolean z5 = this.done;
                    Object poll = pVar.poll();
                    if (poll == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5 && z4) {
                        Throwable th = this.error;
                        if (th != null) {
                            if (hVar != 0) {
                                hVar.onError(th);
                            }
                            pVar2.onError(th);
                        } else {
                            if (hVar != 0) {
                                hVar.onComplete();
                            }
                            pVar2.onComplete();
                        }
                        cleanupResources();
                        this.upstreamCancelled = true;
                    } else if (!z4) {
                        if (poll instanceof a) {
                            if (((a) poll).f16639b == this.emitted || !this.restartTimerOnMaxSize) {
                                this.count = 0L;
                                hVar = createNewWindow(hVar);
                            }
                        } else if (hVar != 0) {
                            hVar.onNext(poll);
                            long j5 = this.count + 1;
                            if (j5 == this.maxSize) {
                                this.count = 0L;
                                hVar = createNewWindow(hVar);
                            } else {
                                this.count = j5;
                            }
                        }
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            windowDone();
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> extends a<T> implements Runnable {
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 1155822639622580836L;
        final io.reactivex.rxjava3.core.q0 scheduler;
        final io.reactivex.rxjava3.internal.disposables.f timer;
        io.reactivex.rxjava3.processors.h<T> window;
        final Runnable windowRunnable;

        /* loaded from: classes3.dex */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.windowDone();
            }
        }

        c(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5) {
            super(pVar, j5, timeUnit, i5);
            this.scheduler = q0Var;
            this.timer = new io.reactivex.rxjava3.internal.disposables.f();
            this.windowRunnable = new a();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.b5.a
        void cleanupResources() {
            this.timer.dispose();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.b5.a
        void createFirstWindow() {
            if (!this.downstreamCancelled.get()) {
                if (this.requested.get() != 0) {
                    this.windowCount.getAndIncrement();
                    this.window = io.reactivex.rxjava3.processors.h.v9(this.bufferSize, this.windowRunnable);
                    this.emitted = 1L;
                    a5 a5Var = new a5(this.window);
                    this.downstream.onNext(a5Var);
                    io.reactivex.rxjava3.internal.disposables.f fVar = this.timer;
                    io.reactivex.rxjava3.core.q0 q0Var = this.scheduler;
                    long j5 = this.timespan;
                    fVar.replace(q0Var.o(this, j5, j5, this.unit));
                    if (a5Var.n9()) {
                        this.window.onComplete();
                    }
                    this.upstream.request(Long.MAX_VALUE);
                    return;
                }
                this.upstream.cancel();
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.c(b5.n9(this.emitted)));
                cleanupResources();
                this.upstreamCancelled = true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [io.reactivex.rxjava3.processors.h] */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.b5.a
        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.p<Object> pVar = this.queue;
            org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar2 = this.downstream;
            io.reactivex.rxjava3.processors.h hVar = (io.reactivex.rxjava3.processors.h<T>) this.window;
            int i5 = 1;
            while (true) {
                if (this.upstreamCancelled) {
                    pVar.clear();
                    this.window = null;
                    hVar = (io.reactivex.rxjava3.processors.h<T>) null;
                } else {
                    boolean z5 = this.done;
                    Object poll = pVar.poll();
                    if (poll == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5 && z4) {
                        Throwable th = this.error;
                        if (th != null) {
                            if (hVar != null) {
                                hVar.onError(th);
                            }
                            pVar2.onError(th);
                        } else {
                            if (hVar != null) {
                                hVar.onComplete();
                            }
                            pVar2.onComplete();
                        }
                        cleanupResources();
                        this.upstreamCancelled = true;
                    } else if (!z4) {
                        if (poll == NEXT_WINDOW) {
                            if (hVar != null) {
                                hVar.onComplete();
                                this.window = null;
                                hVar = (io.reactivex.rxjava3.processors.h<T>) null;
                            }
                            if (this.downstreamCancelled.get()) {
                                this.timer.dispose();
                            } else {
                                long j5 = this.requested.get();
                                long j6 = this.emitted;
                                if (j5 == j6) {
                                    this.upstream.cancel();
                                    cleanupResources();
                                    this.upstreamCancelled = true;
                                    pVar2.onError(new io.reactivex.rxjava3.exceptions.c(b5.n9(this.emitted)));
                                } else {
                                    this.emitted = j6 + 1;
                                    this.windowCount.getAndIncrement();
                                    hVar = (io.reactivex.rxjava3.processors.h<T>) io.reactivex.rxjava3.processors.h.v9(this.bufferSize, this.windowRunnable);
                                    this.window = hVar;
                                    a5 a5Var = new a5(hVar);
                                    pVar2.onNext(a5Var);
                                    if (a5Var.n9()) {
                                        hVar.onComplete();
                                    }
                                }
                            }
                        } else if (hVar != null) {
                            hVar.onNext(poll);
                        }
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.queue.offer(NEXT_WINDOW);
            drain();
        }
    }

    /* loaded from: classes3.dex */
    static final class d<T> extends a<T> implements Runnable {
        private static final long serialVersionUID = -7852870764194095894L;
        final long timeskip;
        final List<io.reactivex.rxjava3.processors.h<T>> windows;
        final q0.c worker;
        static final Object WINDOW_OPEN = new Object();
        static final Object WINDOW_CLOSE = new Object();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final d<?> f16641a;

            /* renamed from: b, reason: collision with root package name */
            final boolean f16642b;

            a(d<?> dVar, boolean z4) {
                this.f16641a = dVar;
                this.f16642b = z4;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16641a.boundary(this.f16642b);
            }
        }

        d(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar, long j5, long j6, TimeUnit timeUnit, q0.c cVar, int i5) {
            super(pVar, j5, timeUnit, i5);
            this.timeskip = j6;
            this.worker = cVar;
            this.windows = new LinkedList();
        }

        void boundary(boolean z4) {
            Object obj;
            io.reactivex.rxjava3.internal.fuseable.p<Object> pVar = this.queue;
            if (z4) {
                obj = WINDOW_OPEN;
            } else {
                obj = WINDOW_CLOSE;
            }
            pVar.offer(obj);
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.b5.a
        void cleanupResources() {
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.b5.a
        void createFirstWindow() {
            if (!this.downstreamCancelled.get()) {
                if (this.requested.get() != 0) {
                    this.emitted = 1L;
                    this.windowCount.getAndIncrement();
                    io.reactivex.rxjava3.processors.h<T> v9 = io.reactivex.rxjava3.processors.h.v9(this.bufferSize, this);
                    this.windows.add(v9);
                    a5 a5Var = new a5(v9);
                    this.downstream.onNext(a5Var);
                    this.worker.c(new a(this, false), this.timespan, this.unit);
                    q0.c cVar = this.worker;
                    a aVar = new a(this, true);
                    long j5 = this.timeskip;
                    cVar.d(aVar, j5, j5, this.unit);
                    if (a5Var.n9()) {
                        v9.onComplete();
                        this.windows.remove(v9);
                    }
                    this.upstream.request(Long.MAX_VALUE);
                    return;
                }
                this.upstream.cancel();
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.c(b5.n9(this.emitted)));
                cleanupResources();
                this.upstreamCancelled = true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.b5.a
        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.p<Object> pVar = this.queue;
            org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar2 = this.downstream;
            List<io.reactivex.rxjava3.processors.h<T>> list = this.windows;
            int i5 = 1;
            while (true) {
                if (this.upstreamCancelled) {
                    pVar.clear();
                    list.clear();
                } else {
                    boolean z5 = this.done;
                    Object poll = pVar.poll();
                    if (poll == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5 && z4) {
                        Throwable th = this.error;
                        if (th != null) {
                            Iterator<io.reactivex.rxjava3.processors.h<T>> it = list.iterator();
                            while (it.hasNext()) {
                                it.next().onError(th);
                            }
                            pVar2.onError(th);
                        } else {
                            Iterator<io.reactivex.rxjava3.processors.h<T>> it2 = list.iterator();
                            while (it2.hasNext()) {
                                it2.next().onComplete();
                            }
                            pVar2.onComplete();
                        }
                        cleanupResources();
                        this.upstreamCancelled = true;
                    } else if (!z4) {
                        if (poll == WINDOW_OPEN) {
                            if (!this.downstreamCancelled.get()) {
                                long j5 = this.emitted;
                                if (this.requested.get() != j5) {
                                    this.emitted = j5 + 1;
                                    this.windowCount.getAndIncrement();
                                    io.reactivex.rxjava3.processors.h<T> v9 = io.reactivex.rxjava3.processors.h.v9(this.bufferSize, this);
                                    list.add(v9);
                                    a5 a5Var = new a5(v9);
                                    pVar2.onNext(a5Var);
                                    this.worker.c(new a(this, false), this.timespan, this.unit);
                                    if (a5Var.n9()) {
                                        v9.onComplete();
                                    }
                                } else {
                                    this.upstream.cancel();
                                    io.reactivex.rxjava3.exceptions.c cVar = new io.reactivex.rxjava3.exceptions.c(b5.n9(j5));
                                    Iterator<io.reactivex.rxjava3.processors.h<T>> it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        it3.next().onError(cVar);
                                    }
                                    pVar2.onError(cVar);
                                    cleanupResources();
                                    this.upstreamCancelled = true;
                                }
                            }
                        } else if (poll == WINDOW_CLOSE) {
                            if (!list.isEmpty()) {
                                list.remove(0).onComplete();
                            }
                        } else {
                            Iterator<io.reactivex.rxjava3.processors.h<T>> it4 = list.iterator();
                            while (it4.hasNext()) {
                                it4.next().onNext(poll);
                            }
                        }
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            windowDone();
        }
    }

    public b5(io.reactivex.rxjava3.core.o<T> oVar, long j5, long j6, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, long j7, int i5, boolean z4) {
        super(oVar);
        this.f16631c = j5;
        this.f16632d = j6;
        this.f16633e = timeUnit;
        this.f16634f = q0Var;
        this.f16635g = j7;
        this.f16636h = i5;
        this.f16637i = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String n9(long j5) {
        return "Unable to emit the next window (#" + j5 + ") due to lack of requests. Please make sure the downstream is ready to consume windows.";
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar) {
        if (this.f16631c == this.f16632d) {
            if (this.f16635g == Long.MAX_VALUE) {
                this.f16598b.N6(new c(pVar, this.f16631c, this.f16633e, this.f16634f, this.f16636h));
                return;
            } else {
                this.f16598b.N6(new b(pVar, this.f16631c, this.f16633e, this.f16634f, this.f16636h, this.f16635g, this.f16637i));
                return;
            }
        }
        this.f16598b.N6(new d(pVar, this.f16631c, this.f16632d, this.f16633e, this.f16634f.c(), this.f16636h));
    }
}
