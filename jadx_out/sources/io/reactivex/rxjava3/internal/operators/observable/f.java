package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class f<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super T> f17656b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super Boolean> f17657a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f17658b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17659c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17660d;

        a(io.reactivex.rxjava3.core.p0<? super Boolean> p0Var, m3.r<? super T> rVar) {
            this.f17657a = p0Var;
            this.f17658b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17659c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17659c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17660d) {
                return;
            }
            this.f17660d = true;
            this.f17657a.onNext(Boolean.TRUE);
            this.f17657a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17660d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17660d = true;
                this.f17657a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17660d) {
                return;
            }
            try {
                if (!this.f17658b.test(t5)) {
                    this.f17660d = true;
                    this.f17659c.dispose();
                    this.f17657a.onNext(Boolean.FALSE);
                    this.f17657a.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17659c.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17659c, eVar)) {
                this.f17659c = eVar;
                this.f17657a.onSubscribe(this);
            }
        }
    }

    public f(io.reactivex.rxjava3.core.n0<T> n0Var, m3.r<? super T> rVar) {
        super(n0Var);
        this.f17656b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super Boolean> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17656b));
    }
}
