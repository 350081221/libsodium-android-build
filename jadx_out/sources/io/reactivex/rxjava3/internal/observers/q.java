package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.p0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class q<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements p0<T>, io.reactivex.rxjava3.disposables.e {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final m3.a onComplete;
    final m3.g<? super Throwable> onError;
    final m3.r<? super T> onNext;

    public q(m3.r<? super T> rVar, m3.g<? super Throwable> gVar, m3.a aVar) {
        this.onNext = rVar;
        this.onError = gVar;
        this.onComplete = aVar;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        if (this.done) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        if (this.done) {
            return;
        }
        try {
            if (!this.onNext.test(t5)) {
                dispose();
                onComplete();
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            dispose();
            onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
    }
}
