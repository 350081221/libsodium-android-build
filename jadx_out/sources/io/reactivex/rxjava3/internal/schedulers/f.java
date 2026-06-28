package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f implements Callable<Void>, io.reactivex.rxjava3.disposables.e {

    /* renamed from: f, reason: collision with root package name */
    static final FutureTask<Void> f18553f = new FutureTask<>(io.reactivex.rxjava3.internal.functions.a.f16250b, null);

    /* renamed from: a, reason: collision with root package name */
    final Runnable f18554a;

    /* renamed from: d, reason: collision with root package name */
    final ExecutorService f18557d;

    /* renamed from: e, reason: collision with root package name */
    Thread f18558e;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<Future<?>> f18556c = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<Future<?>> f18555b = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Runnable runnable, ExecutorService executorService) {
        this.f18554a = runnable;
        this.f18557d = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f18558e = Thread.currentThread();
        try {
            this.f18554a.run();
            c(this.f18557d.submit(this));
            this.f18558e = null;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            this.f18558e = null;
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Future<?> future) {
        Future<?> future2;
        boolean z4;
        do {
            future2 = this.f18556c.get();
            if (future2 == f18553f) {
                if (this.f18558e != Thread.currentThread()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                future.cancel(z4);
                return;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18556c, future2, future));
    }

    void c(Future<?> future) {
        Future<?> future2;
        boolean z4;
        do {
            future2 = this.f18555b.get();
            if (future2 == f18553f) {
                if (this.f18558e != Thread.currentThread()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                future.cancel(z4);
                return;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18555b, future2, future));
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        boolean z4;
        AtomicReference<Future<?>> atomicReference = this.f18556c;
        FutureTask<Void> futureTask = f18553f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        boolean z5 = true;
        if (andSet != null && andSet != futureTask) {
            if (this.f18558e != Thread.currentThread()) {
                z4 = true;
            } else {
                z4 = false;
            }
            andSet.cancel(z4);
        }
        Future<?> andSet2 = this.f18555b.getAndSet(futureTask);
        if (andSet2 != null && andSet2 != futureTask) {
            if (this.f18558e == Thread.currentThread()) {
                z5 = false;
            }
            andSet2.cancel(z5);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.f18556c.get() == f18553f;
    }
}
