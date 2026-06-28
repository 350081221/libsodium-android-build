package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class d4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f16691c;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T> {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f16692a;

        /* renamed from: b, reason: collision with root package name */
        final org.reactivestreams.o<? extends T> f16693b;

        /* renamed from: d, reason: collision with root package name */
        boolean f16695d = true;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.subscriptions.i f16694c = new io.reactivex.rxjava3.internal.subscriptions.i(false);

        a(org.reactivestreams.p<? super T> pVar, org.reactivestreams.o<? extends T> oVar) {
            this.f16692a = pVar;
            this.f16693b = oVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16695d) {
                this.f16695d = false;
                this.f16693b.subscribe(this);
            } else {
                this.f16692a.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f16692a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f16695d) {
                this.f16695d = false;
            }
            this.f16692a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            this.f16694c.setSubscription(qVar);
        }
    }

    public d4(io.reactivex.rxjava3.core.o<T> oVar, org.reactivestreams.o<? extends T> oVar2) {
        super(oVar);
        this.f16691c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        a aVar = new a(pVar, this.f16691c);
        pVar.onSubscribe(aVar.f16694c);
        this.f16598b.N6(aVar);
    }
}
