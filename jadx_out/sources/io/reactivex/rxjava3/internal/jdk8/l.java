package io.reactivex.rxjava3.internal.jdk8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
abstract class l<T> extends CompletableFuture<T> implements io.reactivex.rxjava3.core.t<T> {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<org.reactivestreams.q> f16363a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    T f16364b;

    protected abstract void a(org.reactivestreams.q qVar);

    protected final void b() {
        io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.f16363a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.f16364b = null;
        this.f16363a.lazySet(io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED);
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

    @Override // org.reactivestreams.p
    public final void onError(Throwable th) {
        c();
        if (!completeExceptionally(th)) {
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public final void onSubscribe(@l3.f org.reactivestreams.q qVar) {
        if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.f16363a, qVar)) {
            a(qVar);
        }
    }
}
