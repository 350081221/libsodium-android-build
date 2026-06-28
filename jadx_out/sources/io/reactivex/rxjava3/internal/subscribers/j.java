package io.reactivex.rxjava3.internal.subscribers;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class j<T> extends CountDownLatch implements io.reactivex.rxjava3.core.t<T>, Future<T>, org.reactivestreams.q {

    /* renamed from: a, reason: collision with root package name */
    T f18645a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f18646b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<org.reactivestreams.q> f18647c;

    public j() {
        super(1);
        this.f18647c = new AtomicReference<>();
    }

    @Override // org.reactivestreams.q
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        org.reactivestreams.q qVar;
        io.reactivex.rxjava3.internal.subscriptions.j jVar;
        do {
            qVar = this.f18647c.get();
            if (qVar == this || qVar == (jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED)) {
                return false;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18647c, qVar, jVar));
        if (qVar != null) {
            qVar.cancel();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            io.reactivex.rxjava3.internal.util.e.b();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.f18646b;
            if (th == null) {
                return this.f18645a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f18647c.get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        if (this.f18645a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        org.reactivestreams.q qVar = this.f18647c.get();
        if (qVar != this && qVar != io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED && androidx.compose.animation.core.h.a(this.f18647c, qVar, this)) {
            countDown();
        }
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        org.reactivestreams.q qVar;
        if (this.f18646b == null && (qVar = this.f18647c.get()) != this && qVar != io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED && androidx.compose.animation.core.h.a(this.f18647c, qVar, this)) {
            this.f18646b = th;
            countDown();
        } else {
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        if (this.f18645a != null) {
            this.f18647c.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        } else {
            this.f18645a = t5;
        }
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public void onSubscribe(org.reactivestreams.q qVar) {
        io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.f18647c, qVar, Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
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
            Throwable th = this.f18646b;
            if (th == null) {
                return this.f18645a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
