package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class u<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super io.reactivex.rxjava3.disposables.e> f17403b;

    /* renamed from: c, reason: collision with root package name */
    final m3.a f17404c;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17405a;

        /* renamed from: b, reason: collision with root package name */
        final m3.g<? super io.reactivex.rxjava3.disposables.e> f17406b;

        /* renamed from: c, reason: collision with root package name */
        final m3.a f17407c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17408d;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar, m3.a aVar) {
            this.f17405a = a0Var;
            this.f17406b = gVar;
            this.f17407c = aVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            try {
                this.f17407c.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
            this.f17408d.dispose();
            this.f17408d = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17408d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            io.reactivex.rxjava3.disposables.e eVar = this.f17408d;
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar) {
                this.f17408d = cVar;
                this.f17405a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(@l3.f Throwable th) {
            io.reactivex.rxjava3.disposables.e eVar = this.f17408d;
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar) {
                this.f17408d = cVar;
                this.f17405a.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
            try {
                this.f17406b.accept(eVar);
                if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17408d, eVar)) {
                    this.f17408d = eVar;
                    this.f17405a.onSubscribe(this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                eVar.dispose();
                this.f17408d = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
                io.reactivex.rxjava3.internal.disposables.d.error(th, this.f17405a);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(@l3.f T t5) {
            io.reactivex.rxjava3.disposables.e eVar = this.f17408d;
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar) {
                this.f17408d = cVar;
                this.f17405a.onSuccess(t5);
            }
        }
    }

    public u(io.reactivex.rxjava3.core.x<T> xVar, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar, m3.a aVar) {
        super(xVar);
        this.f17403b = gVar;
        this.f17404c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17403b, this.f17404c));
    }
}
