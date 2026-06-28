package io.reactivex.rxjava3.internal.operators.completable;

/* loaded from: classes3.dex */
public final class t<T> extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<T> f16581a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f16582a;

        /* renamed from: b, reason: collision with root package name */
        org.reactivestreams.q f16583b;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.f16582a = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16583b.cancel();
            this.f16583b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16583b == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f16582a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f16582a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16583b, qVar)) {
                this.f16583b = qVar;
                this.f16582a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public t(org.reactivestreams.o<T> oVar) {
        this.f16581a = oVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16581a.subscribe(new a(fVar));
    }
}
