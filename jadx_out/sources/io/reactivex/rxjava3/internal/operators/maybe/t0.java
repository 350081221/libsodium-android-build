package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class t0<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, Boolean> {

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super Boolean> f17401a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17402b;

        a(io.reactivex.rxjava3.core.a0<? super Boolean> a0Var) {
            this.f17401a = a0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17402b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17402b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17401a.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17401a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17402b, eVar)) {
                this.f17402b = eVar;
                this.f17401a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f17401a.onSuccess(Boolean.FALSE);
        }
    }

    public t0(io.reactivex.rxjava3.core.d0<T> d0Var) {
        super(d0Var);
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super Boolean> a0Var) {
        this.f17232a.a(new a(a0Var));
    }
}
