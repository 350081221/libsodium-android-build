package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class l0<T> extends io.reactivex.rxjava3.core.x<T> implements io.reactivex.rxjava3.internal.fuseable.g {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f17333a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17334a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17335b;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.f17334a = a0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17335b.dispose();
            this.f17335b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17335b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17335b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17334a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17335b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17334a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17335b, eVar)) {
                this.f17335b = eVar;
                this.f17334a.onSubscribe(this);
            }
        }
    }

    public l0(io.reactivex.rxjava3.core.i iVar) {
        this.f17333a = iVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17333a.a(new a(a0Var));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.g
    public io.reactivex.rxjava3.core.i source() {
        return this.f17333a;
    }
}
