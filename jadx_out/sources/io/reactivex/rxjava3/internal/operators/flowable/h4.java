package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class h4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.f<T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -5467847744262967226L;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super T> pVar) {
            super(pVar);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            T t5 = this.value;
            if (t5 != null) {
                complete(t5);
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.value = null;
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.value = t5;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public h4(io.reactivex.rxjava3.core.o<T> oVar) {
        super(oVar);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar));
    }
}
