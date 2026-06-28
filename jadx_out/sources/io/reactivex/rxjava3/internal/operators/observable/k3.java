package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class k3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f17810b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17811a;

        /* renamed from: b, reason: collision with root package name */
        long f17812b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17813c;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5) {
            this.f17811a = p0Var;
            this.f17812b = j5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17813c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17813c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17811a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17811a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            long j5 = this.f17812b;
            if (j5 != 0) {
                this.f17812b = j5 - 1;
            } else {
                this.f17811a.onNext(t5);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17813c, eVar)) {
                this.f17813c = eVar;
                this.f17811a.onSubscribe(this);
            }
        }
    }

    public k3(io.reactivex.rxjava3.core.n0<T> n0Var, long j5) {
        super(n0Var);
        this.f17810b = j5;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17810b));
    }
}
