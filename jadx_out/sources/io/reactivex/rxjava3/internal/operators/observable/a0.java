package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class a0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, Long> {

    /* loaded from: classes3.dex */
    static final class a implements io.reactivex.rxjava3.core.p0<Object>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super Long> f17529a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17530b;

        /* renamed from: c, reason: collision with root package name */
        long f17531c;

        a(io.reactivex.rxjava3.core.p0<? super Long> p0Var) {
            this.f17529a = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17530b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17530b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17529a.onNext(Long.valueOf(this.f17531c));
            this.f17529a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17529a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(Object obj) {
            this.f17531c++;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17530b, eVar)) {
                this.f17530b = eVar;
                this.f17529a.onSubscribe(this);
            }
        }
    }

    public a0(io.reactivex.rxjava3.core.n0<T> n0Var) {
        super(n0Var);
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super Long> p0Var) {
        this.f17528a.subscribe(new a(p0Var));
    }
}
