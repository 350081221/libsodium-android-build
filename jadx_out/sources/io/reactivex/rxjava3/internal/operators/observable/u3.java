package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class u3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f18121a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18122b;

        /* renamed from: c, reason: collision with root package name */
        T f18123c;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.f18121a = p0Var;
        }

        void a() {
            T t5 = this.f18123c;
            if (t5 != null) {
                this.f18123c = null;
                this.f18121a.onNext(t5);
            }
            this.f18121a.onComplete();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18123c = null;
            this.f18122b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18122b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f18123c = null;
            this.f18121a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f18123c = t5;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18122b, eVar)) {
                this.f18122b = eVar;
                this.f18121a.onSubscribe(this);
            }
        }
    }

    public u3(io.reactivex.rxjava3.core.n0<T> n0Var) {
        super(n0Var);
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var));
    }
}
