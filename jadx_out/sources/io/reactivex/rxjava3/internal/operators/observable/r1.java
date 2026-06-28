package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class r1<T> extends io.reactivex.rxjava3.core.c implements io.reactivex.rxjava3.internal.fuseable.f<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f18027a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f18028a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18029b;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.f18028a = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18029b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18029b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f18028a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f18028a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18029b = eVar;
            this.f18028a.onSubscribe(this);
        }
    }

    public r1(io.reactivex.rxjava3.core.n0<T> n0Var) {
        this.f18027a = n0Var;
    }

    @Override // io.reactivex.rxjava3.core.c
    public void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f18027a.subscribe(new a(fVar));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public io.reactivex.rxjava3.core.i0<T> b() {
        return io.reactivex.rxjava3.plugins.a.R(new q1(this.f18027a));
    }
}
