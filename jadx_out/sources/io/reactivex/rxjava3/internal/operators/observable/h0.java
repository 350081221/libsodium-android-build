package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class h0<T, U> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T> f17727a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<U> f17728b;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.p0<U> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.disposables.f f17729a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17730b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17731c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.h0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0506a implements io.reactivex.rxjava3.core.p0<T> {
            C0506a() {
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onComplete() {
                a.this.f17730b.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onError(Throwable th) {
                a.this.f17730b.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onNext(T t5) {
                a.this.f17730b.onNext(t5);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                a.this.f17729a.update(eVar);
            }
        }

        a(io.reactivex.rxjava3.internal.disposables.f fVar, io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.f17729a = fVar;
            this.f17730b = p0Var;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17731c) {
                return;
            }
            this.f17731c = true;
            h0.this.f17727a.subscribe(new C0506a());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17731c) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17731c = true;
                this.f17730b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(U u4) {
            onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f17729a.update(eVar);
        }
    }

    public h0(io.reactivex.rxjava3.core.n0<? extends T> n0Var, io.reactivex.rxjava3.core.n0<U> n0Var2) {
        this.f17727a = n0Var;
        this.f17728b = n0Var2;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        io.reactivex.rxjava3.internal.disposables.f fVar = new io.reactivex.rxjava3.internal.disposables.f();
        p0Var.onSubscribe(fVar);
        this.f17728b.subscribe(new a(fVar, p0Var));
    }
}
