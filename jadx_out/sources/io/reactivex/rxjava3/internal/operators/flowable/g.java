package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class g<T> extends io.reactivex.rxjava3.core.r0<Boolean> implements io.reactivex.rxjava3.internal.fuseable.d<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f16754a;

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super T> f16755b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super Boolean> f16756a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f16757b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f16758c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16759d;

        a(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var, m3.r<? super T> rVar) {
            this.f16756a = u0Var;
            this.f16757b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16758c.cancel();
            this.f16758c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16758c == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16759d) {
                return;
            }
            this.f16759d = true;
            this.f16758c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f16756a.onSuccess(Boolean.TRUE);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16759d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f16759d = true;
            this.f16758c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f16756a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f16759d) {
                return;
            }
            try {
                if (!this.f16757b.test(t5)) {
                    this.f16759d = true;
                    this.f16758c.cancel();
                    this.f16758c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                    this.f16756a.onSuccess(Boolean.FALSE);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16758c.cancel();
                this.f16758c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16758c, qVar)) {
                this.f16758c = qVar;
                this.f16756a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public g(io.reactivex.rxjava3.core.o<T> oVar, m3.r<? super T> rVar) {
        this.f16754a = oVar;
        this.f16755b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
        this.f16754a.N6(new a(u0Var, this.f16755b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<Boolean> d() {
        return io.reactivex.rxjava3.plugins.a.P(new f(this.f16754a, this.f16755b));
    }
}
