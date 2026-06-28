package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class x3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super T> f18176b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f18177a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f18178b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18179c;

        /* renamed from: d, reason: collision with root package name */
        boolean f18180d;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.r<? super T> rVar) {
            this.f18177a = p0Var;
            this.f18178b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18179c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18179c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!this.f18180d) {
                this.f18180d = true;
                this.f18177a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (!this.f18180d) {
                this.f18180d = true;
                this.f18177a.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (!this.f18180d) {
                this.f18177a.onNext(t5);
                try {
                    if (this.f18178b.test(t5)) {
                        this.f18180d = true;
                        this.f18179c.dispose();
                        this.f18177a.onComplete();
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.f18179c.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18179c, eVar)) {
                this.f18179c = eVar;
                this.f18177a.onSubscribe(this);
            }
        }
    }

    public x3(io.reactivex.rxjava3.core.n0<T> n0Var, m3.r<? super T> rVar) {
        super(n0Var);
        this.f18176b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f18176b));
    }
}
