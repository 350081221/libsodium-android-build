package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class f1<T> extends io.reactivex.rxjava3.core.i0<T> implements io.reactivex.rxjava3.internal.fuseable.g {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f17662a;

    /* loaded from: classes3.dex */
    public static final class a<T> extends io.reactivex.rxjava3.internal.fuseable.a<T> implements io.reactivex.rxjava3.core.f {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17663a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17664b;

        public a(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.f17663a = p0Var;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.a, io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17664b.dispose();
            this.f17664b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.a, io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17664b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17664b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17663a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17664b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17663a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17664b, eVar)) {
                this.f17664b = eVar;
                this.f17663a.onSubscribe(this);
            }
        }
    }

    public f1(io.reactivex.rxjava3.core.i iVar) {
        this.f17662a = iVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17662a.a(new a(p0Var));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.g
    public io.reactivex.rxjava3.core.i source() {
        return this.f17662a;
    }
}
