package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.p0;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
abstract class z<T> extends CompletableFuture<T> implements p0<T> {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<io.reactivex.rxjava3.disposables.e> f16406a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    T f16407b;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        this.f16407b = null;
        this.f16406a.lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
    }

    protected final void b() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this.f16406a);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        b();
        return super.cancel(z4);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T t5) {
        b();
        return super.complete(t5);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th) {
        b();
        return super.completeExceptionally(th);
    }

    @Override // io.reactivex.rxjava3.core.p0
    public final void onError(Throwable th) {
        a();
        if (!completeExceptionally(th)) {
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public final void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f16406a, eVar);
    }
}
