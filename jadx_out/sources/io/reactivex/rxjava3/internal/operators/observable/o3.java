package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class o3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super T> f17921b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17922a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f17923b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17924c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17925d;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.r<? super T> rVar) {
            this.f17922a = p0Var;
            this.f17923b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17924c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17924c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17922a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17922a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17925d) {
                this.f17922a.onNext(t5);
                return;
            }
            try {
                if (!this.f17923b.test(t5)) {
                    this.f17925d = true;
                    this.f17922a.onNext(t5);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17924c.dispose();
                this.f17922a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17924c, eVar)) {
                this.f17924c = eVar;
                this.f17922a.onSubscribe(this);
            }
        }
    }

    public o3(io.reactivex.rxjava3.core.n0<T> n0Var, m3.r<? super T> rVar) {
        super(n0Var);
        this.f17921b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17921b));
    }
}
