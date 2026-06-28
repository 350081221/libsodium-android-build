package io.reactivex.rxjava3.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class v<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e, org.reactivestreams.q {
    private static final long serialVersionUID = -8612022020200669122L;
    final org.reactivestreams.p<? super T> downstream;
    final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();

    public v(org.reactivestreams.p<? super T> pVar) {
        this.downstream = pVar;
    }

    @Override // org.reactivestreams.q
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
        io.reactivex.rxjava3.internal.disposables.c.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.upstream.get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        this.downstream.onComplete();
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        this.downstream.onError(th);
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        this.downstream.onNext(t5);
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public void onSubscribe(org.reactivestreams.q qVar) {
        if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.upstream, qVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
        if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
            this.upstream.get().request(j5);
        }
    }

    public void setResource(io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.set(this, eVar);
    }
}
