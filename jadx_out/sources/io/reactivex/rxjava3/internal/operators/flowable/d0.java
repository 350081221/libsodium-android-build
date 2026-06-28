package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class d0<T> extends io.reactivex.rxjava3.core.r0<Long> implements io.reactivex.rxjava3.internal.fuseable.d<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f16674a;

    /* loaded from: classes3.dex */
    static final class a implements io.reactivex.rxjava3.core.t<Object>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super Long> f16675a;

        /* renamed from: b, reason: collision with root package name */
        org.reactivestreams.q f16676b;

        /* renamed from: c, reason: collision with root package name */
        long f16677c;

        a(io.reactivex.rxjava3.core.u0<? super Long> u0Var) {
            this.f16675a = u0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16676b.cancel();
            this.f16676b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16676b == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f16676b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f16675a.onSuccess(Long.valueOf(this.f16677c));
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f16676b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f16675a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
            this.f16677c++;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16676b, qVar)) {
                this.f16676b = qVar;
                this.f16675a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public d0(io.reactivex.rxjava3.core.o<T> oVar) {
        this.f16674a = oVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super Long> u0Var) {
        this.f16674a.N6(new a(u0Var));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<Long> d() {
        return io.reactivex.rxjava3.plugins.a.P(new c0(this.f16674a));
    }
}
