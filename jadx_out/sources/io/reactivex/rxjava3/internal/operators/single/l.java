package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class l<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18399a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        io.reactivex.rxjava3.core.u0<? super T> f18400a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18401b;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
            this.f18400a = u0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18400a = null;
            this.f18401b.dispose();
            this.f18401b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18401b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f18401b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            io.reactivex.rxjava3.core.u0<? super T> u0Var = this.f18400a;
            if (u0Var != null) {
                this.f18400a = null;
                u0Var.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18401b, eVar)) {
                this.f18401b = eVar;
                this.f18400a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f18401b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            io.reactivex.rxjava3.core.u0<? super T> u0Var = this.f18400a;
            if (u0Var != null) {
                this.f18400a = null;
                u0Var.onSuccess(t5);
            }
        }
    }

    public l(io.reactivex.rxjava3.core.x0<T> x0Var) {
        this.f18399a = x0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18399a.a(new a(u0Var));
    }
}
