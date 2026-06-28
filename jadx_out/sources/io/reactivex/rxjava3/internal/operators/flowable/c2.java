package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class c2<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<T> f16650a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f16651a;

        /* renamed from: b, reason: collision with root package name */
        org.reactivestreams.q f16652b;

        /* renamed from: c, reason: collision with root package name */
        T f16653c;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.f16651a = a0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16652b.cancel();
            this.f16652b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16652b == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f16652b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            T t5 = this.f16653c;
            if (t5 != null) {
                this.f16653c = null;
                this.f16651a.onSuccess(t5);
            } else {
                this.f16651a.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f16652b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f16653c = null;
            this.f16651a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f16653c = t5;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16652b, qVar)) {
                this.f16652b = qVar;
                this.f16651a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public c2(org.reactivestreams.o<T> oVar) {
        this.f16650a = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f16650a.subscribe(new a(a0Var));
    }
}
