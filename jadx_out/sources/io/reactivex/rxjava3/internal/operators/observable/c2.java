package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class c2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, io.reactivex.rxjava3.core.f0<T>> {

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.f0<T>> f17578a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17579b;

        a(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.f0<T>> p0Var) {
            this.f17578a = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17579b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17579b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17578a.onNext(io.reactivex.rxjava3.core.f0.a());
            this.f17578a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17578a.onNext(io.reactivex.rxjava3.core.f0.b(th));
            this.f17578a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f17578a.onNext(io.reactivex.rxjava3.core.f0.c(t5));
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17579b, eVar)) {
                this.f17579b = eVar;
                this.f17578a.onSubscribe(this);
            }
        }
    }

    public c2(io.reactivex.rxjava3.core.n0<T> n0Var) {
        super(n0Var);
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.f0<T>> p0Var) {
        this.f17528a.subscribe(new a(p0Var));
    }
}
