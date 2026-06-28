package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class b0<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f17244a;

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super T> f17245b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17246a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f17247b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17248c;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, m3.r<? super T> rVar) {
            this.f17246a = a0Var;
            this.f17247b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.disposables.e eVar = this.f17248c;
            this.f17248c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            eVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17248c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17246a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17248c, eVar)) {
                this.f17248c = eVar;
                this.f17246a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                if (this.f17247b.test(t5)) {
                    this.f17246a.onSuccess(t5);
                } else {
                    this.f17246a.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17246a.onError(th);
            }
        }
    }

    public b0(io.reactivex.rxjava3.core.x0<T> x0Var, m3.r<? super T> rVar) {
        this.f17244a = x0Var;
        this.f17245b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17244a.a(new a(a0Var, this.f17245b));
    }
}
