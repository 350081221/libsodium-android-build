package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class j<T> extends io.reactivex.rxjava3.core.r0<Boolean> implements io.reactivex.rxjava3.internal.fuseable.d<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f16821a;

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super T> f16822b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super Boolean> f16823a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f16824b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f16825c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16826d;

        a(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var, m3.r<? super T> rVar) {
            this.f16823a = u0Var;
            this.f16824b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16825c.cancel();
            this.f16825c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16825c == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.f16826d) {
                this.f16826d = true;
                this.f16825c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                this.f16823a.onSuccess(Boolean.FALSE);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16826d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f16826d = true;
            this.f16825c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f16823a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f16826d) {
                return;
            }
            try {
                if (this.f16824b.test(t5)) {
                    this.f16826d = true;
                    this.f16825c.cancel();
                    this.f16825c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                    this.f16823a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16825c.cancel();
                this.f16825c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16825c, qVar)) {
                this.f16825c = qVar;
                this.f16823a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public j(io.reactivex.rxjava3.core.o<T> oVar, m3.r<? super T> rVar) {
        this.f16821a = oVar;
        this.f16822b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
        this.f16821a.N6(new a(u0Var, this.f16822b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<Boolean> d() {
        return io.reactivex.rxjava3.plugins.a.P(new i(this.f16821a, this.f16822b));
    }
}
