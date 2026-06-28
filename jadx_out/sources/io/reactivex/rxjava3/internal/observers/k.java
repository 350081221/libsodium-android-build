package io.reactivex.rxjava3.internal.observers;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class k extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e, m3.g<Throwable>, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -4361286194466301354L;
    final m3.a onComplete;
    final m3.g<? super Throwable> onError;

    public k(m3.a aVar) {
        this.onError = this;
        this.onComplete = aVar;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this);
    }

    @Override // io.reactivex.rxjava3.observers.g
    public boolean hasCustomOnError() {
        return this.onError != this;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onComplete() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
        lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.plugins.a.Y(th2);
        }
        lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
    }

    @Override // m3.g
    public void accept(Throwable th) {
        io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.d(th));
    }

    public k(m3.g<? super Throwable> gVar, m3.a aVar) {
        this.onError = gVar;
        this.onComplete = aVar;
    }
}
