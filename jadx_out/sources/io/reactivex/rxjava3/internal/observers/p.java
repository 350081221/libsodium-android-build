package io.reactivex.rxjava3.internal.observers;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class p extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this);
    }

    @Override // io.reactivex.rxjava3.observers.g
    public boolean hasCustomOnError() {
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onComplete() {
        lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
        io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.d(th));
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
    }
}
