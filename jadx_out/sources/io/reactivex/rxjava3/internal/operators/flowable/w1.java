package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class w1<T> extends io.reactivex.rxjava3.core.c implements io.reactivex.rxjava3.internal.fuseable.d<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f17112a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f17113a;

        /* renamed from: b, reason: collision with root package name */
        org.reactivestreams.q f17114b;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.f17113a = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17114b.cancel();
            this.f17114b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17114b == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f17114b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f17113a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f17114b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f17113a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17114b, qVar)) {
                this.f17114b = qVar;
                this.f17113a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public w1(io.reactivex.rxjava3.core.o<T> oVar) {
        this.f17112a = oVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f17112a.N6(new a(fVar));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<T> d() {
        return io.reactivex.rxjava3.plugins.a.P(new v1(this.f17112a));
    }
}
