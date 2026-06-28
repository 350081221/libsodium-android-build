package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class a1<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18320b;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.f<T> implements io.reactivex.rxjava3.core.u0<T> {
        private static final long serialVersionUID = 187782011903685568L;
        io.reactivex.rxjava3.disposables.e upstream;

        a(org.reactivestreams.p<? super T> pVar) {
            super(pVar);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            complete(t5);
        }
    }

    public a1(io.reactivex.rxjava3.core.x0<? extends T> x0Var) {
        this.f18320b = x0Var;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        this.f18320b.a(new a(pVar));
    }
}
