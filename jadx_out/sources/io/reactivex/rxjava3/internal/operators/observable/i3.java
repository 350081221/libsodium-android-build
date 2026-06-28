package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class i3<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f17763a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17764a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17765b;

        /* renamed from: c, reason: collision with root package name */
        T f17766c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17767d;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.f17764a = a0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17765b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17765b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17767d) {
                return;
            }
            this.f17767d = true;
            T t5 = this.f17766c;
            this.f17766c = null;
            if (t5 == null) {
                this.f17764a.onComplete();
            } else {
                this.f17764a.onSuccess(t5);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17767d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17767d = true;
                this.f17764a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17767d) {
                return;
            }
            if (this.f17766c != null) {
                this.f17767d = true;
                this.f17765b.dispose();
                this.f17764a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f17766c = t5;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17765b, eVar)) {
                this.f17765b = eVar;
                this.f17764a.onSubscribe(this);
            }
        }
    }

    public i3(io.reactivex.rxjava3.core.n0<T> n0Var) {
        this.f17763a = n0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    public void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17763a.subscribe(new a(a0Var));
    }
}
