package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.p0;

/* loaded from: classes3.dex */
public abstract class n<T, R> extends m<R> implements p0<T> {
    private static final long serialVersionUID = -266195175408988651L;
    protected io.reactivex.rxjava3.disposables.e upstream;

    public n(p0<? super R> p0Var) {
        super(p0Var);
    }

    @Override // io.reactivex.rxjava3.internal.observers.m, io.reactivex.rxjava3.disposables.e
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        T t5 = this.value;
        if (t5 != null) {
            this.value = null;
            complete(t5);
        } else {
            complete();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        this.value = null;
        error(th);
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
            this.upstream = eVar;
            this.downstream.onSubscribe(this);
        }
    }
}
