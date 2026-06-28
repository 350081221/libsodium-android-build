package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class o0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super T> f17904b;

    /* renamed from: c, reason: collision with root package name */
    final m3.g<? super Throwable> f17905c;

    /* renamed from: d, reason: collision with root package name */
    final m3.a f17906d;

    /* renamed from: e, reason: collision with root package name */
    final m3.a f17907e;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17908a;

        /* renamed from: b, reason: collision with root package name */
        final m3.g<? super T> f17909b;

        /* renamed from: c, reason: collision with root package name */
        final m3.g<? super Throwable> f17910c;

        /* renamed from: d, reason: collision with root package name */
        final m3.a f17911d;

        /* renamed from: e, reason: collision with root package name */
        final m3.a f17912e;

        /* renamed from: f, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17913f;

        /* renamed from: g, reason: collision with root package name */
        boolean f17914g;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.g<? super T> gVar, m3.g<? super Throwable> gVar2, m3.a aVar, m3.a aVar2) {
            this.f17908a = p0Var;
            this.f17909b = gVar;
            this.f17910c = gVar2;
            this.f17911d = aVar;
            this.f17912e = aVar2;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17913f.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17913f.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17914g) {
                return;
            }
            try {
                this.f17911d.run();
                this.f17914g = true;
                this.f17908a.onComplete();
                try {
                    this.f17912e.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17914g) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f17914g = true;
            try {
                this.f17910c.accept(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                th = new io.reactivex.rxjava3.exceptions.a(th, th2);
            }
            this.f17908a.onError(th);
            try {
                this.f17912e.run();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                io.reactivex.rxjava3.plugins.a.Y(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17914g) {
                return;
            }
            try {
                this.f17909b.accept(t5);
                this.f17908a.onNext(t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17913f.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17913f, eVar)) {
                this.f17913f = eVar;
                this.f17908a.onSubscribe(this);
            }
        }
    }

    public o0(io.reactivex.rxjava3.core.n0<T> n0Var, m3.g<? super T> gVar, m3.g<? super Throwable> gVar2, m3.a aVar, m3.a aVar2) {
        super(n0Var);
        this.f17904b = gVar;
        this.f17905c = gVar2;
        this.f17906d = aVar;
        this.f17907e = aVar2;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17904b, this.f17905c, this.f17906d, this.f17907e));
    }
}
