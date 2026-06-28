package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class g<T> extends io.reactivex.rxjava3.core.r0<Boolean> implements io.reactivex.rxjava3.internal.fuseable.f<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f17681a;

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super T> f17682b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super Boolean> f17683a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f17684b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17685c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17686d;

        a(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var, m3.r<? super T> rVar) {
            this.f17683a = u0Var;
            this.f17684b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17685c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17685c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17686d) {
                return;
            }
            this.f17686d = true;
            this.f17683a.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17686d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17686d = true;
                this.f17683a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17686d) {
                return;
            }
            try {
                if (!this.f17684b.test(t5)) {
                    this.f17686d = true;
                    this.f17685c.dispose();
                    this.f17683a.onSuccess(Boolean.FALSE);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17685c.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17685c, eVar)) {
                this.f17685c = eVar;
                this.f17683a.onSubscribe(this);
            }
        }
    }

    public g(io.reactivex.rxjava3.core.n0<T> n0Var, m3.r<? super T> rVar) {
        this.f17681a = n0Var;
        this.f17682b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
        this.f17681a.subscribe(new a(u0Var, this.f17682b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public io.reactivex.rxjava3.core.i0<Boolean> b() {
        return io.reactivex.rxjava3.plugins.a.R(new f(this.f17681a, this.f17682b));
    }
}
