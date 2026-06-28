package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class l0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        org.reactivestreams.p<? super T> f16850a;

        /* renamed from: b, reason: collision with root package name */
        org.reactivestreams.q f16851b;

        a(org.reactivestreams.p<? super T> pVar) {
            this.f16850a = pVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            org.reactivestreams.q qVar = this.f16851b;
            this.f16851b = io.reactivex.rxjava3.internal.util.h.INSTANCE;
            this.f16850a = io.reactivex.rxjava3.internal.util.h.asSubscriber();
            qVar.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            org.reactivestreams.p<? super T> pVar = this.f16850a;
            this.f16851b = io.reactivex.rxjava3.internal.util.h.INSTANCE;
            this.f16850a = io.reactivex.rxjava3.internal.util.h.asSubscriber();
            pVar.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            org.reactivestreams.p<? super T> pVar = this.f16850a;
            this.f16851b = io.reactivex.rxjava3.internal.util.h.INSTANCE;
            this.f16850a = io.reactivex.rxjava3.internal.util.h.asSubscriber();
            pVar.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f16850a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16851b, qVar)) {
                this.f16851b = qVar;
                this.f16850a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16851b.request(j5);
        }
    }

    public l0(io.reactivex.rxjava3.core.o<T> oVar) {
        super(oVar);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar));
    }
}
