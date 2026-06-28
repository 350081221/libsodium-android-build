package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class v1<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.internal.fuseable.n<T> {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f17097a;

        /* renamed from: b, reason: collision with root package name */
        org.reactivestreams.q f17098b;

        a(org.reactivestreams.p<? super T> pVar) {
            this.f17097a = pVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f17098b.cancel();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean offer(T t5) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f17097a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f17097a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17098b, qVar)) {
                this.f17098b = qVar;
                this.f17097a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            return null;
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return i5 & 2;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean offer(T t5, T t6) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    public v1(io.reactivex.rxjava3.core.o<T> oVar) {
        super(oVar);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar));
    }
}
