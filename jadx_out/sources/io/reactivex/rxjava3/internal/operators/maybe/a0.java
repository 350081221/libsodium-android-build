package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class a0<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super T> f17233b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17234a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f17235b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17236c;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, m3.r<? super T> rVar) {
            this.f17234a = a0Var;
            this.f17235b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.disposables.e eVar = this.f17236c;
            this.f17236c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            eVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17236c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17234a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17234a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17236c, eVar)) {
                this.f17236c = eVar;
                this.f17234a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                if (this.f17235b.test(t5)) {
                    this.f17234a.onSuccess(t5);
                } else {
                    this.f17234a.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17234a.onError(th);
            }
        }
    }

    public a0(io.reactivex.rxjava3.core.d0<T> d0Var, m3.r<? super T> rVar) {
        super(d0Var);
        this.f17233b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17233b));
    }
}
