package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class i<T> extends io.reactivex.rxjava3.core.r0<Long> implements io.reactivex.rxjava3.internal.fuseable.h<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<T> f17314a;

    /* loaded from: classes3.dex */
    static final class a implements io.reactivex.rxjava3.core.a0<Object>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super Long> f17315a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17316b;

        a(io.reactivex.rxjava3.core.u0<? super Long> u0Var) {
            this.f17315a = u0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17316b.dispose();
            this.f17316b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17316b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17316b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17315a.onSuccess(0L);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17316b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17315a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17316b, eVar)) {
                this.f17316b = eVar;
                this.f17315a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(Object obj) {
            this.f17316b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17315a.onSuccess(1L);
        }
    }

    public i(io.reactivex.rxjava3.core.d0<T> d0Var) {
        this.f17314a = d0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super Long> u0Var) {
        this.f17314a.a(new a(u0Var));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public io.reactivex.rxjava3.core.d0<T> source() {
        return this.f17314a;
    }
}
