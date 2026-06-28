package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class i2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super Throwable> f17759b;

    /* loaded from: classes3.dex */
    public static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17760a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super Throwable> f17761b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17762c;

        public a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.r<? super Throwable> rVar) {
            this.f17760a = p0Var;
            this.f17761b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17762c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17762c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17760a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            try {
                if (this.f17761b.test(th)) {
                    this.f17760a.onComplete();
                } else {
                    this.f17760a.onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.f17760a.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f17760a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17762c, eVar)) {
                this.f17762c = eVar;
                this.f17760a.onSubscribe(this);
            }
        }
    }

    public i2(io.reactivex.rxjava3.core.n0<T> n0Var, m3.r<? super Throwable> rVar) {
        super(n0Var);
        this.f17759b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17759b));
    }
}
