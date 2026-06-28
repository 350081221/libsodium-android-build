package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.p0;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class s<T> extends CountDownLatch implements p0<T>, Future<T>, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    T f16439a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f16440b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<io.reactivex.rxjava3.disposables.e> f16441c;

    public s() {
        super(1);
        this.f16441c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        io.reactivex.rxjava3.disposables.e eVar;
        io.reactivex.rxjava3.internal.disposables.c cVar;
        do {
            eVar = this.f16441c.get();
            if (eVar == this || eVar == (cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED)) {
                return false;
            }
        } while (!androidx.compose.animation.core.h.a(this.f16441c, eVar, cVar));
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
            Throwable th = this.f16440b;
            if (th == null) {
                return this.f16439a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.f16441c.get());
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (this.f16439a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        io.reactivex.rxjava3.disposables.e eVar = this.f16441c.get();
        if (eVar != this && eVar != io.reactivex.rxjava3.internal.disposables.c.DISPOSED && androidx.compose.animation.core.h.a(this.f16441c, eVar, this)) {
            countDown();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        io.reactivex.rxjava3.disposables.e eVar;
        if (this.f16440b == null && (eVar = this.f16441c.get()) != this && eVar != io.reactivex.rxjava3.internal.disposables.c.DISPOSED && androidx.compose.animation.core.h.a(this.f16441c, eVar, this)) {
            this.f16440b = th;
            countDown();
        } else {
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        if (this.f16439a != null) {
            this.f16441c.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        } else {
            this.f16439a = t5;
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f16441c, eVar);
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
            Throwable th = this.f16440b;
            if (th == null) {
                return this.f16439a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
