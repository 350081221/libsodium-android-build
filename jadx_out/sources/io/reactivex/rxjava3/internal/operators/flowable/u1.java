package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class u1<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f17071a;

        /* renamed from: b, reason: collision with root package name */
        org.reactivestreams.q f17072b;

        a(org.reactivestreams.p<? super T> pVar) {
            this.f17071a = pVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f17072b.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f17071a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f17071a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f17071a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17072b, qVar)) {
                this.f17072b = qVar;
                this.f17071a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f17072b.request(j5);
        }
    }

    public u1(io.reactivex.rxjava3.core.o<T> oVar) {
        super(oVar);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar));
    }
}
