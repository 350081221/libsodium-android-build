package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.q0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class n4<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, io.reactivex.rxjava3.core.i0<T>> {

    /* renamed from: b, reason: collision with root package name */
    final long f17889b;

    /* renamed from: c, reason: collision with root package name */
    final long f17890c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f17891d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17892e;

    /* renamed from: f, reason: collision with root package name */
    final long f17893f;

    /* renamed from: g, reason: collision with root package name */
    final int f17894g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f17895h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 5724293814035355511L;
        final int bufferSize;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> downstream;
        long emitted;
        Throwable error;
        final long timespan;
        final TimeUnit unit;
        io.reactivex.rxjava3.disposables.e upstream;
        volatile boolean upstreamCancelled;
        final io.reactivex.rxjava3.internal.fuseable.p<Object> queue = new io.reactivex.rxjava3.internal.queue.a();
        final AtomicBoolean downstreamCancelled = new AtomicBoolean();
        final AtomicInteger windowCount = new AtomicInteger(1);

        a(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var, long j5, TimeUnit timeUnit, int i5) {
            this.downstream = p0Var;
            this.timespan = j5;
            this.unit = timeUnit;
            this.bufferSize = i5;
        }

        abstract void cleanupResources();

        abstract void createFirstWindow();

        @Override // io.reactivex.rxjava3.disposables.e
        public final void dispose() {
            if (this.downstreamCancelled.compareAndSet(false, true)) {
                windowDone();
            }
        }

        abstract void drain();

        @Override // io.reactivex.rxjava3.disposables.e
        public final boolean isDisposed() {
            return this.downstreamCancelled.get();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public final void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public final void onNext(T t5) {
            this.queue.offer(t5);
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public final void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
                createFirstWindow();
            }
        }

        final void windowDone() {
            if (this.windowCount.decrementAndGet() == 0) {
                cleanupResources();
                this.upstream.dispose();
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
        io.reactivex.rxjava3.subjects.j<T> window;
        final q0.c worker;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final b<?> f17896a;

            /* renamed from: b, reason: collision with root package name */
            final long f17897b;

            a(b<?> bVar, long j5) {
                this.f17896a = bVar;
                this.f17897b = j5;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17896a.boundary(this);
            }
        }

        b(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5, long j6, boolean z4) {
            super(p0Var, j5, timeUnit, i5);
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

        @Override // io.reactivex.rxjava3.internal.operators.observable.n4.a
        void cleanupResources() {
            this.timer.dispose();
            q0.c cVar = this.worker;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.n4.a
        void createFirstWindow() {
            if (!this.downstreamCancelled.get()) {
                this.emitted = 1L;
                this.windowCount.getAndIncrement();
                io.reactivex.rxjava3.subjects.j<T> P8 = io.reactivex.rxjava3.subjects.j.P8(this.bufferSize, this);
                this.window = P8;
                m4 m4Var = new m4(P8);
                this.downstream.onNext(m4Var);
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
                if (m4Var.I8()) {
                    this.window.onComplete();
                }
            }
        }

        io.reactivex.rxjava3.subjects.j<T> createNewWindow(io.reactivex.rxjava3.subjects.j<T> jVar) {
            if (jVar != null) {
                jVar.onComplete();
                jVar = null;
            }
            if (this.downstreamCancelled.get()) {
                cleanupResources();
            } else {
                long j5 = this.emitted + 1;
                this.emitted = j5;
                this.windowCount.getAndIncrement();
                jVar = io.reactivex.rxjava3.subjects.j.P8(this.bufferSize, this);
                this.window = jVar;
                m4 m4Var = new m4(jVar);
                this.downstream.onNext(m4Var);
                if (this.restartTimerOnMaxSize) {
                    io.reactivex.rxjava3.internal.disposables.f fVar = this.timer;
                    q0.c cVar = this.worker;
                    a aVar = new a(this, j5);
                    long j6 = this.timespan;
                    fVar.update(cVar.d(aVar, j6, j6, this.unit));
                }
                if (m4Var.I8()) {
                    jVar.onComplete();
                }
            }
            return jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.observable.n4.a
        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.p<Object> pVar = this.queue;
            io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var = this.downstream;
            io.reactivex.rxjava3.subjects.j<T> jVar = this.window;
            int i5 = 1;
            while (true) {
                if (this.upstreamCancelled) {
                    pVar.clear();
                    jVar = 0;
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
                            if (jVar != 0) {
                                jVar.onError(th);
                            }
                            p0Var.onError(th);
                        } else {
                            if (jVar != 0) {
                                jVar.onComplete();
                            }
                            p0Var.onComplete();
                        }
                        cleanupResources();
                        this.upstreamCancelled = true;
                    } else if (!z4) {
                        if (poll instanceof a) {
                            if (((a) poll).f17897b == this.emitted || !this.restartTimerOnMaxSize) {
                                this.count = 0L;
                                jVar = createNewWindow(jVar);
                            }
                        } else if (jVar != 0) {
                            jVar.onNext(poll);
                            long j5 = this.count + 1;
                            if (j5 == this.maxSize) {
                                this.count = 0L;
                                jVar = createNewWindow(jVar);
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
        io.reactivex.rxjava3.subjects.j<T> window;
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

        c(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5) {
            super(p0Var, j5, timeUnit, i5);
            this.scheduler = q0Var;
            this.timer = new io.reactivex.rxjava3.internal.disposables.f();
            this.windowRunnable = new a();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.n4.a
        void cleanupResources() {
            this.timer.dispose();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.n4.a
        void createFirstWindow() {
            if (!this.downstreamCancelled.get()) {
                this.windowCount.getAndIncrement();
                io.reactivex.rxjava3.subjects.j<T> P8 = io.reactivex.rxjava3.subjects.j.P8(this.bufferSize, this.windowRunnable);
                this.window = P8;
                this.emitted = 1L;
                m4 m4Var = new m4(P8);
                this.downstream.onNext(m4Var);
                io.reactivex.rxjava3.internal.disposables.f fVar = this.timer;
                io.reactivex.rxjava3.core.q0 q0Var = this.scheduler;
                long j5 = this.timespan;
                fVar.replace(q0Var.o(this, j5, j5, this.unit));
                if (m4Var.I8()) {
                    this.window.onComplete();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [io.reactivex.rxjava3.subjects.j] */
        @Override // io.reactivex.rxjava3.internal.operators.observable.n4.a
        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.p<Object> pVar = this.queue;
            io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var = this.downstream;
            io.reactivex.rxjava3.subjects.j jVar = (io.reactivex.rxjava3.subjects.j<T>) this.window;
            int i5 = 1;
            while (true) {
                if (this.upstreamCancelled) {
                    pVar.clear();
                    this.window = null;
                    jVar = (io.reactivex.rxjava3.subjects.j<T>) null;
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
                            if (jVar != null) {
                                jVar.onError(th);
                            }
                            p0Var.onError(th);
                        } else {
                            if (jVar != null) {
                                jVar.onComplete();
                            }
                            p0Var.onComplete();
                        }
                        cleanupResources();
                        this.upstreamCancelled = true;
                    } else if (!z4) {
                        if (poll == NEXT_WINDOW) {
                            if (jVar != null) {
                                jVar.onComplete();
                                this.window = null;
                                jVar = (io.reactivex.rxjava3.subjects.j<T>) null;
                            }
                            if (this.downstreamCancelled.get()) {
                                this.timer.dispose();
                            } else {
                                this.emitted++;
                                this.windowCount.getAndIncrement();
                                jVar = (io.reactivex.rxjava3.subjects.j<T>) io.reactivex.rxjava3.subjects.j.P8(this.bufferSize, this.windowRunnable);
                                this.window = jVar;
                                m4 m4Var = new m4(jVar);
                                p0Var.onNext(m4Var);
                                if (m4Var.I8()) {
                                    jVar.onComplete();
                                }
                            }
                        } else if (jVar != null) {
                            jVar.onNext(poll);
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
        final List<io.reactivex.rxjava3.subjects.j<T>> windows;
        final q0.c worker;
        static final Object WINDOW_OPEN = new Object();
        static final Object WINDOW_CLOSE = new Object();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final d<?> f17899a;

            /* renamed from: b, reason: collision with root package name */
            final boolean f17900b;

            a(d<?> dVar, boolean z4) {
                this.f17899a = dVar;
                this.f17900b = z4;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17899a.boundary(this.f17900b);
            }
        }

        d(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var, long j5, long j6, TimeUnit timeUnit, q0.c cVar, int i5) {
            super(p0Var, j5, timeUnit, i5);
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

        @Override // io.reactivex.rxjava3.internal.operators.observable.n4.a
        void cleanupResources() {
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.n4.a
        void createFirstWindow() {
            if (!this.downstreamCancelled.get()) {
                this.emitted = 1L;
                this.windowCount.getAndIncrement();
                io.reactivex.rxjava3.subjects.j<T> P8 = io.reactivex.rxjava3.subjects.j.P8(this.bufferSize, this);
                this.windows.add(P8);
                m4 m4Var = new m4(P8);
                this.downstream.onNext(m4Var);
                this.worker.c(new a(this, false), this.timespan, this.unit);
                q0.c cVar = this.worker;
                a aVar = new a(this, true);
                long j5 = this.timeskip;
                cVar.d(aVar, j5, j5, this.unit);
                if (m4Var.I8()) {
                    P8.onComplete();
                    this.windows.remove(P8);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.observable.n4.a
        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.p<Object> pVar = this.queue;
            io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var = this.downstream;
            List<io.reactivex.rxjava3.subjects.j<T>> list = this.windows;
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
                            Iterator<io.reactivex.rxjava3.subjects.j<T>> it = list.iterator();
                            while (it.hasNext()) {
                                it.next().onError(th);
                            }
                            p0Var.onError(th);
                        } else {
                            Iterator<io.reactivex.rxjava3.subjects.j<T>> it2 = list.iterator();
                            while (it2.hasNext()) {
                                it2.next().onComplete();
                            }
                            p0Var.onComplete();
                        }
                        cleanupResources();
                        this.upstreamCancelled = true;
                    } else if (!z4) {
                        if (poll == WINDOW_OPEN) {
                            if (!this.downstreamCancelled.get()) {
                                this.emitted++;
                                this.windowCount.getAndIncrement();
                                io.reactivex.rxjava3.subjects.j<T> P8 = io.reactivex.rxjava3.subjects.j.P8(this.bufferSize, this);
                                list.add(P8);
                                m4 m4Var = new m4(P8);
                                p0Var.onNext(m4Var);
                                this.worker.c(new a(this, false), this.timespan, this.unit);
                                if (m4Var.I8()) {
                                    P8.onComplete();
                                }
                            }
                        } else if (poll == WINDOW_CLOSE) {
                            if (!list.isEmpty()) {
                                list.remove(0).onComplete();
                            }
                        } else {
                            Iterator<io.reactivex.rxjava3.subjects.j<T>> it3 = list.iterator();
                            while (it3.hasNext()) {
                                it3.next().onNext(poll);
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

    public n4(io.reactivex.rxjava3.core.i0<T> i0Var, long j5, long j6, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, long j7, int i5, boolean z4) {
        super(i0Var);
        this.f17889b = j5;
        this.f17890c = j6;
        this.f17891d = timeUnit;
        this.f17892e = q0Var;
        this.f17893f = j7;
        this.f17894g = i5;
        this.f17895h = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var) {
        if (this.f17889b == this.f17890c) {
            if (this.f17893f == Long.MAX_VALUE) {
                this.f17528a.subscribe(new c(p0Var, this.f17889b, this.f17891d, this.f17892e, this.f17894g));
                return;
            } else {
                this.f17528a.subscribe(new b(p0Var, this.f17889b, this.f17891d, this.f17892e, this.f17894g, this.f17893f, this.f17895h));
                return;
            }
        }
        this.f17528a.subscribe(new d(p0Var, this.f17889b, this.f17890c, this.f17891d, this.f17892e.c(), this.f17894g));
    }
}
