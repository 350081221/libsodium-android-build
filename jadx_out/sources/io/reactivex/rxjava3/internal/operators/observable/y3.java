package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class y3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super T> f18193b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f18194a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f18195b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18196c;

        /* renamed from: d, reason: collision with root package name */
        boolean f18197d;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.r<? super T> rVar) {
            this.f18194a = p0Var;
            this.f18195b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18196c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18196c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f18197d) {
                return;
            }
            this.f18197d = true;
            this.f18194a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f18197d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18197d = true;
                this.f18194a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f18197d) {
                return;
            }
            try {
                if (!this.f18195b.test(t5)) {
                    this.f18197d = true;
                    this.f18196c.dispose();
                    this.f18194a.onComplete();
                    return;
                }
                this.f18194a.onNext(t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18196c.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18196c, eVar)) {
                this.f18196c = eVar;
                this.f18194a.onSubscribe(this);
            }
        }
    }

    public y3(io.reactivex.rxjava3.core.n0<T> n0Var, m3.r<? super T> rVar) {
        super(n0Var);
        this.f18193b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f18193b));
    }
}
