package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class t0<T> extends io.reactivex.rxjava3.core.x<T> implements io.reactivex.rxjava3.internal.fuseable.d<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f17051a;

    /* renamed from: b, reason: collision with root package name */
    final long f17052b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17053a;

        /* renamed from: b, reason: collision with root package name */
        final long f17054b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f17055c;

        /* renamed from: d, reason: collision with root package name */
        long f17056d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17057e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(io.reactivex.rxjava3.core.a0<? super T> a0Var, long j5) {
            this.f17053a = a0Var;
            this.f17054b = j5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17055c.cancel();
            this.f17055c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17055c == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f17055c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (!this.f17057e) {
                this.f17057e = true;
                this.f17053a.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f17057e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f17057e = true;
            this.f17055c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f17053a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f17057e) {
                return;
            }
            long j5 = this.f17056d;
            if (j5 == this.f17054b) {
                this.f17057e = true;
                this.f17055c.cancel();
                this.f17055c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                this.f17053a.onSuccess(t5);
                return;
            }
            this.f17056d = j5 + 1;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17055c, qVar)) {
                this.f17055c = qVar;
                this.f17053a.onSubscribe(this);
                qVar.request(this.f17054b + 1);
            }
        }
    }

    public t0(io.reactivex.rxjava3.core.o<T> oVar, long j5) {
        this.f17051a = oVar;
        this.f17052b = j5;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17051a.N6(new a(a0Var, this.f17052b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<T> d() {
        return io.reactivex.rxjava3.plugins.a.P(new s0(this.f17051a, this.f17052b, null, false));
    }
}
