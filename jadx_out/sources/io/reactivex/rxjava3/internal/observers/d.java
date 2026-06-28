package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.u0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements u0<T>, io.reactivex.rxjava3.disposables.e {
    private static final long serialVersionUID = 4943102778943297569L;
    final m3.b<? super T, ? super Throwable> onCallback;

    public d(m3.b<? super T, ? super Throwable> bVar) {
        this.onCallback = bVar;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        try {
            lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
            this.onCallback.accept(null, th);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
    }

    @Override // io.reactivex.rxjava3.core.u0
    public void onSuccess(T t5) {
        try {
            lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
            this.onCallback.accept(t5, null);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }
}
