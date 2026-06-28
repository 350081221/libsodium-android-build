package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
abstract class a extends AtomicReference<Future<?>> implements io.reactivex.rxjava3.disposables.e, io.reactivex.rxjava3.schedulers.a {
    protected static final FutureTask<Void> DISPOSED;
    protected static final FutureTask<Void> FINISHED;
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    static {
        Runnable runnable = io.reactivex.rxjava3.internal.functions.a.f16250b;
        FINISHED = new FutureTask<>(runnable, null);
        DISPOSED = new FutureTask<>(runnable, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final void dispose() {
        FutureTask<Void> futureTask;
        boolean z4;
        Future<?> future = get();
        if (future != FINISHED && future != (futureTask = DISPOSED) && compareAndSet(future, futureTask) && future != null) {
            if (this.runner != Thread.currentThread()) {
                z4 = true;
            } else {
                z4 = false;
            }
            future.cancel(z4);
        }
    }

    @Override // io.reactivex.rxjava3.schedulers.a
    public Runnable getWrappedRunnable() {
        return this.runnable;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean isDisposed() {
        Future<?> future = get();
        if (future != FINISHED && future != DISPOSED) {
            return false;
        }
        return true;
    }

    public final void setFuture(Future<?> future) {
        Future<?> future2;
        boolean z4;
        do {
            future2 = get();
            if (future2 != FINISHED) {
                if (future2 == DISPOSED) {
                    if (this.runner != Thread.currentThread()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    future.cancel(z4);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
