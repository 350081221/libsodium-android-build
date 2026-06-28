package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.u0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class r<T> extends CountDownLatch implements io.reactivex.rxjava3.core.a0<T>, u0<T>, io.reactivex.rxjava3.core.f, Future<T>, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    T f16436a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f16437b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<io.reactivex.rxjava3.disposables.e> f16438c;

    public r() {
        super(1);
        this.f16438c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        io.reactivex.rxjava3.disposables.e eVar;
        io.reactivex.rxjava3.internal.disposables.c cVar;
        do {
            eVar = this.f16438c.get();
            if (eVar == this || eVar == (cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED)) {
                return false;
            }
        } while (!androidx.compose.animation.core.h.a(this.f16438c, eVar, cVar));
        if (eVar != null) {
            eVar.dispose();
        }
        countDown();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            io.reactivex.rxjava3.internal.util.e.b();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.f16437b;
            if (th == null) {
                return this.f16436a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.f16438c.get());
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
    public void onComplete() {
        io.reactivex.rxjava3.disposables.e eVar = this.f16438c.get();
        if (eVar == io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
            return;
        }
        androidx.compose.animation.core.h.a(this.f16438c, eVar, this);
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        io.reactivex.rxjava3.disposables.e eVar;
        do {
            eVar = this.f16438c.get();
            if (eVar == io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f16437b = th;
        } while (!androidx.compose.animation.core.h.a(this.f16438c, eVar, this));
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f16438c, eVar);
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
    public void onSuccess(T t5) {
        io.reactivex.rxjava3.disposables.e eVar = this.f16438c.get();
        if (eVar == io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
            return;
        }
        this.f16436a = t5;
        androidx.compose.animation.core.h.a(this.f16438c, eVar, this);
        countDown();
    }

    @Override // java.util.concurrent.Future
    public T get(long j5, @l3.f TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            io.reactivex.rxjava3.internal.util.e.b();
            if (!await(j5, timeUnit)) {
                throw new TimeoutException(io.reactivex.rxjava3.internal.util.k.h(j5, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f16437b;
            if (th == null) {
                return this.f16436a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
