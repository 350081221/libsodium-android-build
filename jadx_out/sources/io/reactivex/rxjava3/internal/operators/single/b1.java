package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class b1<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18330a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.m<T> implements io.reactivex.rxjava3.core.u0<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            super(p0Var);
        }

        @Override // io.reactivex.rxjava3.internal.observers.m, io.reactivex.rxjava3.disposables.e
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            error(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            complete(t5);
        }
    }

    public b1(io.reactivex.rxjava3.core.x0<? extends T> x0Var) {
        this.f18330a = x0Var;
    }

    public static <T> io.reactivex.rxjava3.core.u0<T> I8(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        return new a(p0Var);
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f18330a.a(I8(p0Var));
    }
}
