package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class p1<T> extends io.reactivex.rxjava3.core.o<T> implements io.reactivex.rxjava3.internal.fuseable.h<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<T> f17376b;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.f<T> implements io.reactivex.rxjava3.core.a0<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        io.reactivex.rxjava3.disposables.e upstream;

        a(org.reactivestreams.p<? super T> pVar) {
            super(pVar);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            complete(t5);
        }
    }

    public p1(io.reactivex.rxjava3.core.d0<T> d0Var) {
        this.f17376b = d0Var;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f17376b.a(new a(pVar));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public io.reactivex.rxjava3.core.d0<T> source() {
        return this.f17376b;
    }
}
