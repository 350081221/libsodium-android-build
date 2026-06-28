package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class q3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T> f17998b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17999a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.core.n0<? extends T> f18000b;

        /* renamed from: d, reason: collision with root package name */
        boolean f18002d = true;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.disposables.f f18001c = new io.reactivex.rxjava3.internal.disposables.f();

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, io.reactivex.rxjava3.core.n0<? extends T> n0Var) {
            this.f17999a = p0Var;
            this.f18000b = n0Var;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f18002d) {
                this.f18002d = false;
                this.f18000b.subscribe(this);
            } else {
                this.f17999a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17999a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f18002d) {
                this.f18002d = false;
            }
            this.f17999a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18001c.update(eVar);
        }
    }

    public q3(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.n0<? extends T> n0Var2) {
        super(n0Var);
        this.f17998b = n0Var2;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        a aVar = new a(p0Var, this.f17998b);
        p0Var.onSubscribe(aVar.f18001c);
        this.f17528a.subscribe(aVar);
    }
}
