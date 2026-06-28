package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class i<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super T> f17746b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super Boolean> f17747a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f17748b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17749c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17750d;

        a(io.reactivex.rxjava3.core.p0<? super Boolean> p0Var, m3.r<? super T> rVar) {
            this.f17747a = p0Var;
            this.f17748b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17749c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17749c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!this.f17750d) {
                this.f17750d = true;
                this.f17747a.onNext(Boolean.FALSE);
                this.f17747a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17750d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17750d = true;
                this.f17747a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17750d) {
                return;
            }
            try {
                if (this.f17748b.test(t5)) {
                    this.f17750d = true;
                    this.f17749c.dispose();
                    this.f17747a.onNext(Boolean.TRUE);
                    this.f17747a.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17749c.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17749c, eVar)) {
                this.f17749c = eVar;
                this.f17747a.onSubscribe(this);
            }
        }
    }

    public i(io.reactivex.rxjava3.core.n0<T> n0Var, m3.r<? super T> rVar) {
        super(n0Var);
        this.f17746b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super Boolean> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17746b));
    }
}
