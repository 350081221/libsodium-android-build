package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -6076952298809384986L;
    final m3.a onComplete;
    final m3.g<? super Throwable> onError;
    final m3.g<? super T> onSuccess;

    public d(m3.g<? super T> gVar, m3.g<? super Throwable> gVar2, m3.a aVar) {
        this.onSuccess = gVar;
        this.onError = gVar2;
        this.onComplete = aVar;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this);
    }

    @Override // io.reactivex.rxjava3.observers.g
    public boolean hasCustomOnError() {
        return this.onError != io.reactivex.rxjava3.internal.functions.a.f16254f;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
    public void onComplete() {
        lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
    public void onSuccess(T t5) {
        lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
        try {
            this.onSuccess.accept(t5);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }
}
