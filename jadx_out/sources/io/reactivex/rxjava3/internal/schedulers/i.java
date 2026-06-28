package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class i extends q0.c implements io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f18587a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f18588b;

    public i(ThreadFactory threadFactory) {
        this.f18587a = p.a(threadFactory);
    }

    @Override // io.reactivex.rxjava3.core.q0.c
    @l3.f
    public io.reactivex.rxjava3.disposables.e b(@l3.f Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // io.reactivex.rxjava3.core.q0.c
    @l3.f
    public io.reactivex.rxjava3.disposables.e c(@l3.f Runnable runnable, long j5, @l3.f TimeUnit timeUnit) {
        if (this.f18588b) {
            return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
        }
        return e(runnable, j5, timeUnit, null);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        if (!this.f18588b) {
            this.f18588b = true;
            this.f18587a.shutdownNow();
        }
    }

    @l3.f
    public n e(Runnable runnable, long j5, @l3.f TimeUnit timeUnit, @l3.g io.reactivex.rxjava3.disposables.f fVar) {
        Future<?> schedule;
        n nVar = new n(io.reactivex.rxjava3.plugins.a.b0(runnable), fVar);
        if (fVar != null && !fVar.b(nVar)) {
            return nVar;
        }
        try {
            if (j5 <= 0) {
                schedule = this.f18587a.submit((Callable) nVar);
            } else {
                schedule = this.f18587a.schedule((Callable) nVar, j5, timeUnit);
            }
            nVar.setFuture(schedule);
        } catch (RejectedExecutionException e5) {
            if (fVar != null) {
                fVar.a(nVar);
            }
            io.reactivex.rxjava3.plugins.a.Y(e5);
        }
        return nVar;
    }

    public io.reactivex.rxjava3.disposables.e g(Runnable runnable, long j5, TimeUnit timeUnit) {
        Future<?> schedule;
        m mVar = new m(io.reactivex.rxjava3.plugins.a.b0(runnable));
        try {
            if (j5 <= 0) {
                schedule = this.f18587a.submit(mVar);
            } else {
                schedule = this.f18587a.schedule(mVar, j5, timeUnit);
            }
            mVar.setFuture(schedule);
            return mVar;
        } catch (RejectedExecutionException e5) {
            io.reactivex.rxjava3.plugins.a.Y(e5);
            return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.f18588b;
    }

    public io.reactivex.rxjava3.disposables.e o(Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        Future<?> schedule;
        Runnable b02 = io.reactivex.rxjava3.plugins.a.b0(runnable);
        if (j6 <= 0) {
            f fVar = new f(b02, this.f18587a);
            try {
                if (j5 <= 0) {
                    schedule = this.f18587a.submit(fVar);
                } else {
                    schedule = this.f18587a.schedule(fVar, j5, timeUnit);
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
            lVar.setFuture(this.f18587a.scheduleAtFixedRate(lVar, j5, j6, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e6) {
            io.reactivex.rxjava3.plugins.a.Y(e6);
            return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
        }
    }

    public void q() {
        if (!this.f18588b) {
            this.f18588b = true;
            this.f18587a.shutdown();
        }
    }
}
