package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class x1<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f18171a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f18172a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18173b;

        /* renamed from: c, reason: collision with root package name */
        T f18174c;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.f18172a = a0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18173b.dispose();
            this.f18173b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18173b == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f18173b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            T t5 = this.f18174c;
            if (t5 != null) {
                this.f18174c = null;
                this.f18172a.onSuccess(t5);
            } else {
                this.f18172a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f18173b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f18174c = null;
            this.f18172a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f18174c = t5;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18173b, eVar)) {
                this.f18173b = eVar;
                this.f18172a.onSubscribe(this);
            }
        }
    }

    public x1(io.reactivex.rxjava3.core.n0<T> n0Var) {
        this.f18171a = n0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f18171a.subscribe(new a(a0Var));
    }
}
