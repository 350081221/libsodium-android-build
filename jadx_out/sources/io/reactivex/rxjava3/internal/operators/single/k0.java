package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class k0<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18396a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f18397a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18398b;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
            this.f18397a = u0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18398b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18398b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f18397a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18398b, eVar)) {
                this.f18398b = eVar;
                this.f18397a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f18397a.onSuccess(t5);
        }
    }

    public k0(io.reactivex.rxjava3.core.x0<? extends T> x0Var) {
        this.f18396a = x0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18396a.a(new a(u0Var));
    }
}
