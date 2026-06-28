package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d extends q0 {

    /* renamed from: e, reason: collision with root package name */
    static final q0 f18534e = io.reactivex.rxjava3.schedulers.b.h();

    /* renamed from: b, reason: collision with root package name */
    final boolean f18535b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f18536c;

    /* renamed from: d, reason: collision with root package name */
    @l3.f
    final Executor f18537d;

    /* loaded from: classes3.dex */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f18538a;

        a(b bVar) {
            this.f18538a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.f18538a;
            bVar.direct.replace(d.this.e(bVar));
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AtomicReference<Runnable> implements Runnable, io.reactivex.rxjava3.disposables.e, io.reactivex.rxjava3.schedulers.a {
        private static final long serialVersionUID = -4101336210206799084L;
        final io.reactivex.rxjava3.internal.disposables.f direct;
        final io.reactivex.rxjava3.internal.disposables.f timed;

        b(Runnable runnable) {
            super(runnable);
            this.timed = new io.reactivex.rxjava3.internal.disposables.f();
            this.direct = new io.reactivex.rxjava3.internal.disposables.f();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (getAndSet(null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.schedulers.a
        public Runnable getWrappedRunnable() {
            Runnable runnable = get();
            if (runnable == null) {
                return io.reactivex.rxjava3.internal.functions.a.f16250b;
            }
            return runnable;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    io.reactivex.rxjava3.internal.disposables.f fVar = this.timed;
                    io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
                    fVar.lazySet(cVar);
                    this.direct.lazySet(cVar);
                } catch (Throwable th) {
                    lazySet(null);
                    this.timed.lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
                    this.direct.lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends q0.c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final boolean f18540a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f18541b;

        /* renamed from: c, reason: collision with root package name */
        final Executor f18542c;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f18544e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f18545f = new AtomicInteger();

        /* renamed from: g, reason: collision with root package name */
        final io.reactivex.rxjava3.disposables.c f18546g = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.queue.a<Runnable> f18543d = new io.reactivex.rxjava3.internal.queue.a<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a extends AtomicBoolean implements Runnable, io.reactivex.rxjava3.disposables.e {
            private static final long serialVersionUID = -2421395018820541164L;
            final Runnable actual;

            a(Runnable runnable) {
                this.actual = runnable;
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.actual.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class b extends AtomicInteger implements Runnable, io.reactivex.rxjava3.disposables.e {
            static final int FINISHED = 2;
            static final int INTERRUPTED = 4;
            static final int INTERRUPTING = 3;
            static final int READY = 0;
            static final int RUNNING = 1;
            private static final long serialVersionUID = -3603436687413320876L;
            final Runnable run;
            final io.reactivex.rxjava3.disposables.f tasks;
            volatile Thread thread;

            b(Runnable runnable, io.reactivex.rxjava3.disposables.f fVar) {
                this.run = runnable;
                this.tasks = fVar;
            }

            void cleanup() {
                io.reactivex.rxjava3.disposables.f fVar = this.tasks;
                if (fVar != null) {
                    fVar.c(this);
                }
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public void dispose() {
                while (true) {
                    int i5 = get();
                    if (i5 < 2) {
                        if (i5 == 0) {
                            if (compareAndSet(0, 4)) {
                                cleanup();
                                return;
                            }
                        } else if (compareAndSet(1, 3)) {
                            Thread thread = this.thread;
                            if (thread != null) {
                                thread.interrupt();
                                this.thread = null;
                            }
                            set(4);
                            cleanup();
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.thread = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.run.run();
                            this.thread = null;
                            if (compareAndSet(1, 2)) {
                                cleanup();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                            return;
                        } catch (Throwable th) {
                            this.thread = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                cleanup();
                            }
                            throw th;
                        }
                    }
                    this.thread = null;
                }
            }
        }

        /* renamed from: io.reactivex.rxjava3.internal.schedulers.d$c$c, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0529c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final io.reactivex.rxjava3.internal.disposables.f f18547a;

            /* renamed from: b, reason: collision with root package name */
            private final Runnable f18548b;

            RunnableC0529c(io.reactivex.rxjava3.internal.disposables.f fVar, Runnable runnable) {
                this.f18547a = fVar;
                this.f18548b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18547a.replace(c.this.b(this.f18548b));
            }
        }

        public c(Executor executor, boolean z4, boolean z5) {
            this.f18542c = executor;
            this.f18540a = z4;
            this.f18541b = z5;
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e b(@l3.f Runnable runnable) {
            io.reactivex.rxjava3.disposables.e aVar;
            if (this.f18544e) {
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
            Runnable b02 = io.reactivex.rxjava3.plugins.a.b0(runnable);
            if (this.f18540a) {
                aVar = new b(b02, this.f18546g);
                this.f18546g.b(aVar);
            } else {
                aVar = new a(b02);
            }
            this.f18543d.offer(aVar);
            if (this.f18545f.getAndIncrement() == 0) {
                try {
                    this.f18542c.execute(this);
                } catch (RejectedExecutionException e5) {
                    this.f18544e = true;
                    this.f18543d.clear();
                    io.reactivex.rxjava3.plugins.a.Y(e5);
                    return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
                }
            }
            return aVar;
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e c(@l3.f Runnable runnable, long j5, @l3.f TimeUnit timeUnit) {
            if (j5 <= 0) {
                return b(runnable);
            }
            if (this.f18544e) {
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
            io.reactivex.rxjava3.internal.disposables.f fVar = new io.reactivex.rxjava3.internal.disposables.f();
            io.reactivex.rxjava3.internal.disposables.f fVar2 = new io.reactivex.rxjava3.internal.disposables.f(fVar);
            n nVar = new n(new RunnableC0529c(fVar2, io.reactivex.rxjava3.plugins.a.b0(runnable)), this.f18546g);
            this.f18546g.b(nVar);
            Executor executor = this.f18542c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    nVar.setFuture(((ScheduledExecutorService) executor).schedule((Callable) nVar, j5, timeUnit));
                } catch (RejectedExecutionException e5) {
                    this.f18544e = true;
                    io.reactivex.rxjava3.plugins.a.Y(e5);
                    return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
                }
            } else {
                nVar.setFuture(new io.reactivex.rxjava3.internal.schedulers.c(d.f18534e.g(nVar, j5, timeUnit)));
            }
            fVar.replace(nVar);
            return fVar2;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.f18544e) {
                this.f18544e = true;
                this.f18546g.dispose();
                if (this.f18545f.getAndIncrement() == 0) {
                    this.f18543d.clear();
                }
            }
        }

        void e() {
            io.reactivex.rxjava3.internal.queue.a<Runnable> aVar = this.f18543d;
            int i5 = 1;
            while (!this.f18544e) {
                do {
                    Runnable poll = aVar.poll();
                    if (poll == null) {
                        if (this.f18544e) {
                            aVar.clear();
                            return;
                        } else {
                            i5 = this.f18545f.addAndGet(-i5);
                            if (i5 == 0) {
                                return;
                            }
                        }
                    } else {
                        poll.run();
                    }
                } while (!this.f18544e);
                aVar.clear();
                return;
            }
            aVar.clear();
        }

        void g() {
            io.reactivex.rxjava3.internal.queue.a<Runnable> aVar = this.f18543d;
            if (this.f18544e) {
                aVar.clear();
                return;
            }
            aVar.poll().run();
            if (this.f18544e) {
                aVar.clear();
            } else if (this.f18545f.decrementAndGet() != 0) {
                this.f18542c.execute(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18544e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18541b) {
                g();
            } else {
                e();
            }
        }
    }

    public d(@l3.f Executor executor, boolean z4, boolean z5) {
        this.f18537d = executor;
        this.f18535b = z4;
        this.f18536c = z5;
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public q0.c c() {
        return new c(this.f18537d, this.f18535b, this.f18536c);
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public io.reactivex.rxjava3.disposables.e e(@l3.f Runnable runnable) {
        Runnable b02 = io.reactivex.rxjava3.plugins.a.b0(runnable);
        try {
            if (this.f18537d instanceof ExecutorService) {
                m mVar = new m(b02);
                mVar.setFuture(((ExecutorService) this.f18537d).submit(mVar));
                return mVar;
            }
            if (this.f18535b) {
                c.b bVar = new c.b(b02, null);
                this.f18537d.execute(bVar);
                return bVar;
            }
            c.a aVar = new c.a(b02);
            this.f18537d.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e5) {
            io.reactivex.rxjava3.plugins.a.Y(e5);
            return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public io.reactivex.rxjava3.disposables.e g(@l3.f Runnable runnable, long j5, TimeUnit timeUnit) {
        Runnable b02 = io.reactivex.rxjava3.plugins.a.b0(runnable);
        if (this.f18537d instanceof ScheduledExecutorService) {
            try {
                m mVar = new m(b02);
                mVar.setFuture(((ScheduledExecutorService) this.f18537d).schedule(mVar, j5, timeUnit));
                return mVar;
            } catch (RejectedExecutionException e5) {
                io.reactivex.rxjava3.plugins.a.Y(e5);
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
        }
        b bVar = new b(b02);
        bVar.timed.replace(f18534e.g(new a(bVar), j5, timeUnit));
        return bVar;
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public io.reactivex.rxjava3.disposables.e o(@l3.f Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        if (this.f18537d instanceof ScheduledExecutorService) {
            try {
                l lVar = new l(io.reactivex.rxjava3.plugins.a.b0(runnable));
                lVar.setFuture(((ScheduledExecutorService) this.f18537d).scheduleAtFixedRate(lVar, j5, j6, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e5) {
                io.reactivex.rxjava3.plugins.a.Y(e5);
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
        }
        return super.o(runnable, j5, j6, timeUnit);
    }
}
