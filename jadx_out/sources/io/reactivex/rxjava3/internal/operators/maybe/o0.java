package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class o0<T> extends io.reactivex.rxjava3.core.x<T> implements io.reactivex.rxjava3.internal.fuseable.k<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f17365a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17366a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17367b;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.f17366a = a0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17367b.dispose();
            this.f17367b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17367b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17367b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17366a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17367b, eVar)) {
                this.f17367b = eVar;
                this.f17366a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f17367b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17366a.onSuccess(t5);
        }
    }

    public o0(io.reactivex.rxjava3.core.x0<T> x0Var) {
        this.f17365a = x0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17365a.a(new a(a0Var));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.k
    public io.reactivex.rxjava3.core.x0<T> source() {
        return this.f17365a;
    }
}
