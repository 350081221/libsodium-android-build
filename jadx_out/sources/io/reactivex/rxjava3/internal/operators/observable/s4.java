package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class s4<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
    private static final long serialVersionUID = -8612022020200669122L;
    final io.reactivex.rxjava3.core.p0<? super T> downstream;
    final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream = new AtomicReference<>();

    public s4(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.downstream = p0Var;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
        io.reactivex.rxjava3.internal.disposables.c.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.upstream.get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        dispose();
        this.downstream.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        this.downstream.onNext(t5);
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this.upstream, eVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void setResource(io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.set(this, eVar);
    }
}
