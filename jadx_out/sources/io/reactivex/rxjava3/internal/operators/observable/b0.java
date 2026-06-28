package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class b0<T> extends io.reactivex.rxjava3.core.r0<Long> implements io.reactivex.rxjava3.internal.fuseable.f<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f17546a;

    /* loaded from: classes3.dex */
    static final class a implements io.reactivex.rxjava3.core.p0<Object>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super Long> f17547a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17548b;

        /* renamed from: c, reason: collision with root package name */
        long f17549c;

        a(io.reactivex.rxjava3.core.u0<? super Long> u0Var) {
            this.f17547a = u0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17548b.dispose();
            this.f17548b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17548b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17548b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17547a.onSuccess(Long.valueOf(this.f17549c));
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17548b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17547a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(Object obj) {
            this.f17549c++;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17548b, eVar)) {
                this.f17548b = eVar;
                this.f17547a.onSubscribe(this);
            }
        }
    }

    public b0(io.reactivex.rxjava3.core.n0<T> n0Var) {
        this.f17546a = n0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    public void M1(io.reactivex.rxjava3.core.u0<? super Long> u0Var) {
        this.f17546a.subscribe(new a(u0Var));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public io.reactivex.rxjava3.core.i0<Long> b() {
        return io.reactivex.rxjava3.plugins.a.R(new a0(this.f17546a));
    }
}
