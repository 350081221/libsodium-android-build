package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class j<T> extends io.reactivex.rxjava3.core.r0<Boolean> implements io.reactivex.rxjava3.internal.fuseable.f<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f17772a;

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super T> f17773b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super Boolean> f17774a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f17775b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17776c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17777d;

        a(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var, m3.r<? super T> rVar) {
            this.f17774a = u0Var;
            this.f17775b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17776c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17776c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!this.f17777d) {
                this.f17777d = true;
                this.f17774a.onSuccess(Boolean.FALSE);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17777d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17777d = true;
                this.f17774a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17777d) {
                return;
            }
            try {
                if (this.f17775b.test(t5)) {
                    this.f17777d = true;
                    this.f17776c.dispose();
                    this.f17774a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17776c.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17776c, eVar)) {
                this.f17776c = eVar;
                this.f17774a.onSubscribe(this);
            }
        }
    }

    public j(io.reactivex.rxjava3.core.n0<T> n0Var, m3.r<? super T> rVar) {
        this.f17772a = n0Var;
        this.f17773b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
        this.f17772a.subscribe(new a(u0Var, this.f17773b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public io.reactivex.rxjava3.core.i0<Boolean> b() {
        return io.reactivex.rxjava3.plugins.a.R(new i(this.f17772a, this.f17773b));
    }
}
