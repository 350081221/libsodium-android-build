package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class r0<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17386a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17387b;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.f17386a = a0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17387b.dispose();
            this.f17387b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17387b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17387b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17386a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17387b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17386a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17387b, eVar)) {
                this.f17387b = eVar;
                this.f17386a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f17387b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17386a.onComplete();
        }
    }

    public r0(io.reactivex.rxjava3.core.d0<T> d0Var) {
        super(d0Var);
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var));
    }
}
