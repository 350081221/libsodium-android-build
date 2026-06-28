package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class s0<T> extends io.reactivex.rxjava3.core.c implements io.reactivex.rxjava3.internal.fuseable.e<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<T> f17389a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f17390a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17391b;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.f17390a = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17391b.dispose();
            this.f17391b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17391b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17391b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17390a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17391b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17390a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17391b, eVar)) {
                this.f17391b = eVar;
                this.f17390a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f17391b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17390a.onComplete();
        }
    }

    public s0(io.reactivex.rxjava3.core.d0<T> d0Var) {
        this.f17389a = d0Var;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f17389a.a(new a(fVar));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.e
    public io.reactivex.rxjava3.core.x<T> c() {
        return io.reactivex.rxjava3.plugins.a.Q(new r0(this.f17389a));
    }
}
