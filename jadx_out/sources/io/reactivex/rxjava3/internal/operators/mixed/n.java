package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.f0;
import io.reactivex.rxjava3.core.u0;

/* loaded from: classes3.dex */
public final class n<T> implements u0<T>, a0<T>, io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    final u0<? super f0<T>> f17491a;

    /* renamed from: b, reason: collision with root package name */
    io.reactivex.rxjava3.disposables.e f17492b;

    public n(u0<? super f0<T>> u0Var) {
        this.f17491a = u0Var;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        this.f17492b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.f17492b.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
    public void onComplete() {
        this.f17491a.onSuccess(f0.a());
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        this.f17491a.onSuccess(f0.b(th));
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17492b, eVar)) {
            this.f17492b = eVar;
            this.f17491a.onSubscribe(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.u0
    public void onSuccess(T t5) {
        this.f17491a.onSuccess(f0.c(t5));
    }
}
