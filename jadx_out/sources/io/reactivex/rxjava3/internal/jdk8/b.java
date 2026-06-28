package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.u0;
import java.util.NoSuchElementException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b<T> extends CompletableFuture<T> implements io.reactivex.rxjava3.core.a0<T>, u0<T>, io.reactivex.rxjava3.core.f {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<io.reactivex.rxjava3.disposables.e> f16296a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    final boolean f16297b;

    /* renamed from: c, reason: collision with root package name */
    final T f16298c;

    public b(boolean z4, T t5) {
        this.f16297b = z4;
        this.f16298c = t5;
    }

    void a() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this.f16296a);
    }

    void b() {
        this.f16296a.lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        a();
        return super.cancel(z4);
    }

    @Override // java.util.concurrent.CompletableFuture
    public boolean complete(T t5) {
        a();
        return super.complete(t5);
    }

    @Override // java.util.concurrent.CompletableFuture
    public boolean completeExceptionally(Throwable th) {
        a();
        return super.completeExceptionally(th);
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
    public void onComplete() {
        if (this.f16297b) {
            complete(this.f16298c);
        } else {
            completeExceptionally(new NoSuchElementException("The source was empty"));
        }
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        b();
        if (!completeExceptionally(th)) {
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f16296a, eVar);
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
    public void onSuccess(@l3.f T t5) {
        b();
        complete(t5);
    }
}
