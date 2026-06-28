package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class i1<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f17756a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17757a;

        /* renamed from: b, reason: collision with root package name */
        org.reactivestreams.q f17758b;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.f17757a = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17758b.cancel();
            this.f17758b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17758b == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f17757a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f17757a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f17757a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17758b, qVar)) {
                this.f17758b = qVar;
                this.f17757a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public i1(org.reactivestreams.o<? extends T> oVar) {
        this.f17756a = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17756a.subscribe(new a(p0Var));
    }
}
