package io.reactivex.rxjava3.internal.subscribers;

/* loaded from: classes3.dex */
public abstract class h<T, R> extends io.reactivex.rxjava3.internal.subscriptions.f<R> implements io.reactivex.rxjava3.core.t<T> {
    private static final long serialVersionUID = 2984505488220891551L;
    protected boolean hasValue;
    protected org.reactivestreams.q upstream;

    public h(org.reactivestreams.p<? super R> pVar) {
        super(pVar);
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    public void onSubscribe(org.reactivestreams.q qVar) {
        if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
            this.upstream = qVar;
            this.downstream.onSubscribe(this);
            qVar.request(Long.MAX_VALUE);
        }
    }
}
