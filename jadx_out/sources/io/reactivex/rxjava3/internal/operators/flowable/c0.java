package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class c0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, Long> {

    /* loaded from: classes3.dex */
    static final class a extends io.reactivex.rxjava3.internal.subscriptions.f<Long> implements io.reactivex.rxjava3.core.t<Object> {
        private static final long serialVersionUID = 4973004223787171406L;
        long count;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super Long> pVar) {
            super(pVar);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            complete(Long.valueOf(this.count));
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
            this.count++;
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

    public c0(io.reactivex.rxjava3.core.o<T> oVar) {
        super(oVar);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super Long> pVar) {
        this.f16598b.N6(new a(pVar));
    }
}
