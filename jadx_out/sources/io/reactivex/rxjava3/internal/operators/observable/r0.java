package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class r0<T> extends io.reactivex.rxjava3.core.x<T> implements io.reactivex.rxjava3.internal.fuseable.f<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f18020a;

    /* renamed from: b, reason: collision with root package name */
    final long f18021b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f18022a;

        /* renamed from: b, reason: collision with root package name */
        final long f18023b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18024c;

        /* renamed from: d, reason: collision with root package name */
        long f18025d;

        /* renamed from: e, reason: collision with root package name */
        boolean f18026e;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, long j5) {
            this.f18022a = a0Var;
            this.f18023b = j5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18024c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18024c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!this.f18026e) {
                this.f18026e = true;
                this.f18022a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f18026e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18026e = true;
                this.f18022a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f18026e) {
                return;
            }
            long j5 = this.f18025d;
            if (j5 == this.f18023b) {
                this.f18026e = true;
                this.f18024c.dispose();
                this.f18022a.onSuccess(t5);
                return;
            }
            this.f18025d = j5 + 1;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18024c, eVar)) {
                this.f18024c = eVar;
                this.f18022a.onSubscribe(this);
            }
        }
    }

    public r0(io.reactivex.rxjava3.core.n0<T> n0Var, long j5) {
        this.f18020a = n0Var;
        this.f18021b = j5;
    }

    @Override // io.reactivex.rxjava3.core.x
    public void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f18020a.subscribe(new a(a0Var, this.f18021b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public io.reactivex.rxjava3.core.i0<T> b() {
        return io.reactivex.rxjava3.plugins.a.R(new q0(this.f18020a, this.f18021b, null, false));
    }
}
