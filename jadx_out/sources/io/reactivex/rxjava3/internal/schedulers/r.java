package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class r extends q0 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f18608d = "rx3.single-priority";

    /* renamed from: e, reason: collision with root package name */
    private static final String f18609e = "RxSingleScheduler";

    /* renamed from: f, reason: collision with root package name */
    static final k f18610f;

    /* renamed from: g, reason: collision with root package name */
    static final ScheduledExecutorService f18611g;

    /* renamed from: b, reason: collision with root package name */
    final ThreadFactory f18612b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f18613c;

    /* loaded from: classes3.dex */
    static final class a extends q0.c {

        /* renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f18614a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.disposables.c f18615b = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f18616c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f18614a = scheduledExecutorService;
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e c(@l3.f Runnable runnable, long j5, @l3.f TimeUnit timeUnit) {
            Future<?> schedule;
            if (this.f18616c) {
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
            n nVar = new n(io.reactivex.rxjava3.plugins.a.b0(runnable), this.f18615b);
            this.f18615b.b(nVar);
            try {
                if (j5 <= 0) {
                    schedule = this.f18614a.submit((Callable) nVar);
                } else {
                    schedule = this.f18614a.schedule((Callable) nVar, j5, timeUnit);
                }
                nVar.setFuture(schedule);
                return nVar;
            } catch (RejectedExecutionException e5) {
                dispose();
                io.reactivex.rxjava3.plugins.a.Y(e5);
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.f18616c) {
                this.f18616c = true;
                this.f18615b.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18616c;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f18611g = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f18610f = new k(f18609e, Math.max(1, Math.min(10, Integer.getInteger(f18608d, 5).intValue())), true);
    }

    public r() {
        this(f18610f);
    }

    static ScheduledExecutorService t(ThreadFactory threadFactory) {
        return p.a(threadFactory);
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public q0.c c() {
        return new a(this.f18613c.get());
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public io.reactivex.rxjava3.disposables.e g(@l3.f Runnable runnable, long j5, TimeUnit timeUnit) {
        Future<?> schedule;
        m mVar = new m(io.reactivex.rxjava3.plugins.a.b0(runnable));
        try {
            if (j5 <= 0) {
                schedule = this.f18613c.get().submit(mVar);
            } else {
                schedule = this.f18613c.get().schedule(mVar, j5, timeUnit);
            }
            mVar.setFuture(schedule);
            return mVar;
        } catch (RejectedExecutionException e5) {
            io.reactivex.rxjava3.plugins.a.Y(e5);
            return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public io.reactivex.rxjava3.disposables.e o(@l3.f Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        Future<?> schedule;
        Runnable b02 = io.reactivex.rxjava3.plugins.a.b0(runnable);
        if (j6 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f18613c.get();
            f fVar = new f(b02, scheduledExecutorService);
            try {
                if (j5 <= 0) {
                    schedule = scheduledExecutorService.submit(fVar);
                } else {
                    schedule = scheduledExecutorService.schedule(fVar, j5, timeUnit);
                }
                fVar.b(schedule);
                return fVar;
            } catch (RejectedExecutionException e5) {
                io.reactivex.rxjava3.plugins.a.Y(e5);
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
        }
        l lVar = new l(b02);
        try {
            lVar.setFuture(this.f18613c.get().scheduleAtFixedRate(lVar, j5, j6, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e6) {
            io.reactivex.rxjava3.plugins.a.Y(e6);
            return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.q0
    public void q() {
        AtomicReference<ScheduledExecutorService> atomicReference = this.f18613c;
        ScheduledExecutorService scheduledExecutorService = f18611g;
        ScheduledExecutorService andSet = atomicReference.getAndSet(scheduledExecutorService);
        if (andSet != scheduledExecutorService) {
            andSet.shutdownNow();
        }
    }

    @Override // io.reactivex.rxjava3.core.q0
    public void r() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.f18613c.get();
            if (scheduledExecutorService != f18611g) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = t(this.f18612b);
            }
        } while (!androidx.compose.animation.core.h.a(this.f18613c, scheduledExecutorService, scheduledExecutorService2));
    }

    public r(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f18613c = atomicReference;
        this.f18612b = threadFactory;
        atomicReference.lazySet(t(threadFactory));
    }
}
