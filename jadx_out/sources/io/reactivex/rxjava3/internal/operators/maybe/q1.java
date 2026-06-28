package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class q1<T> extends io.reactivex.rxjava3.core.i0<T> implements io.reactivex.rxjava3.internal.fuseable.h<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<T> f17381a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.m<T> implements io.reactivex.rxjava3.core.a0<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            super(p0Var);
        }

        @Override // io.reactivex.rxjava3.internal.observers.m, io.reactivex.rxjava3.disposables.e
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            complete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            error(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            complete(t5);
        }
    }

    public q1(io.reactivex.rxjava3.core.d0<T> d0Var) {
        this.f17381a = d0Var;
    }

    public static <T> io.reactivex.rxjava3.core.a0<T> I8(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        return new a(p0Var);
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17381a.a(I8(p0Var));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public io.reactivex.rxjava3.core.d0<T> source() {
        return this.f17381a;
    }
}
