package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.p0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class v<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements p0<T>, io.reactivex.rxjava3.disposables.e, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -7251123623727029452L;
    final m3.a onComplete;
    final m3.g<? super Throwable> onError;
    final m3.g<? super T> onNext;
    final m3.g<? super io.reactivex.rxjava3.disposables.e> onSubscribe;

    public v(m3.g<? super T> gVar, m3.g<? super Throwable> gVar2, m3.a aVar, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar3) {
        this.onNext = gVar;
        this.onError = gVar2;
        this.onComplete = aVar;
        this.onSubscribe = gVar3;
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
        return get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (!isDisposed()) {
            lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
            try {
                this.onError.accept(th);
                return;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th2));
                return;
            }
        }
        io.reactivex.rxjava3.plugins.a.Y(th);
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                get().dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                eVar.dispose();
                onError(th);
            }
        }
    }
}
