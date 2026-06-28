package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class n3<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<U> f17878b;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.p0<U> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.disposables.a f17879a;

        /* renamed from: b, reason: collision with root package name */
        final b<T> f17880b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.observers.m<T> f17881c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17882d;

        a(io.reactivex.rxjava3.internal.disposables.a aVar, b<T> bVar, io.reactivex.rxjava3.observers.m<T> mVar) {
            this.f17879a = aVar;
            this.f17880b = bVar;
            this.f17881c = mVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17880b.f17887d = true;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17879a.dispose();
            this.f17881c.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(U u4) {
            this.f17882d.dispose();
            this.f17880b.f17887d = true;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17882d, eVar)) {
                this.f17882d = eVar;
                this.f17879a.setResource(1, eVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> implements io.reactivex.rxjava3.core.p0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17884a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.disposables.a f17885b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17886c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f17887d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17888e;

        b(io.reactivex.rxjava3.core.p0<? super T> p0Var, io.reactivex.rxjava3.internal.disposables.a aVar) {
            this.f17884a = p0Var;
            this.f17885b = aVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17885b.dispose();
            this.f17884a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17885b.dispose();
            this.f17884a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17888e) {
                this.f17884a.onNext(t5);
            } else if (this.f17887d) {
                this.f17888e = true;
                this.f17884a.onNext(t5);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17886c, eVar)) {
                this.f17886c = eVar;
                this.f17885b.setResource(0, eVar);
            }
        }
    }

    public n3(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.n0<U> n0Var2) {
        super(n0Var);
        this.f17878b = n0Var2;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        io.reactivex.rxjava3.observers.m mVar = new io.reactivex.rxjava3.observers.m(p0Var);
        io.reactivex.rxjava3.internal.disposables.a aVar = new io.reactivex.rxjava3.internal.disposables.a(2);
        mVar.onSubscribe(aVar);
        b bVar = new b(mVar, aVar);
        this.f17878b.subscribe(new a(aVar, bVar, mVar));
        this.f17528a.subscribe(bVar);
    }
}
