package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class v3<T> extends io.reactivex.rxjava3.core.x<T> implements io.reactivex.rxjava3.internal.fuseable.d<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f17100a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17101a;

        /* renamed from: b, reason: collision with root package name */
        org.reactivestreams.q f17102b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17103c;

        /* renamed from: d, reason: collision with root package name */
        T f17104d;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.f17101a = a0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17102b.cancel();
            this.f17102b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17102b == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f17103c) {
                return;
            }
            this.f17103c = true;
            this.f17102b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            T t5 = this.f17104d;
            this.f17104d = null;
            if (t5 == null) {
                this.f17101a.onComplete();
            } else {
                this.f17101a.onSuccess(t5);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f17103c) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f17103c = true;
            this.f17102b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f17101a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f17103c) {
                return;
            }
            if (this.f17104d != null) {
                this.f17103c = true;
                this.f17102b.cancel();
                this.f17102b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                this.f17101a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f17104d = t5;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17102b, qVar)) {
                this.f17102b = qVar;
                this.f17101a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public v3(io.reactivex.rxjava3.core.o<T> oVar) {
        this.f17100a = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17100a.N6(new a(a0Var));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<T> d() {
        return io.reactivex.rxjava3.plugins.a.P(new u3(this.f17100a, null, false));
    }
}
