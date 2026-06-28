package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class f1<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super io.reactivex.rxjava3.disposables.e> f17285b;

    /* renamed from: c, reason: collision with root package name */
    final m3.g<? super T> f17286c;

    /* renamed from: d, reason: collision with root package name */
    final m3.g<? super Throwable> f17287d;

    /* renamed from: e, reason: collision with root package name */
    final m3.a f17288e;

    /* renamed from: f, reason: collision with root package name */
    final m3.a f17289f;

    /* renamed from: g, reason: collision with root package name */
    final m3.a f17290g;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17291a;

        /* renamed from: b, reason: collision with root package name */
        final f1<T> f17292b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17293c;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, f1<T> f1Var) {
            this.f17291a = a0Var;
            this.f17292b = f1Var;
        }

        void a() {
            try {
                this.f17292b.f17289f.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        void b(Throwable th) {
            try {
                this.f17292b.f17287d.accept(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                th = new io.reactivex.rxjava3.exceptions.a(th, th2);
            }
            this.f17293c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17291a.onError(th);
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            try {
                this.f17292b.f17290g.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
            this.f17293c.dispose();
            this.f17293c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17293c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            io.reactivex.rxjava3.disposables.e eVar = this.f17293c;
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar == cVar) {
                return;
            }
            try {
                this.f17292b.f17288e.run();
                this.f17293c = cVar;
                this.f17291a.onComplete();
                a();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            if (this.f17293c == io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17293c, eVar)) {
                try {
                    this.f17292b.f17285b.accept(eVar);
                    this.f17293c = eVar;
                    this.f17291a.onSubscribe(this);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    eVar.dispose();
                    this.f17293c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
                    io.reactivex.rxjava3.internal.disposables.d.error(th, this.f17291a);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            io.reactivex.rxjava3.disposables.e eVar = this.f17293c;
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar == cVar) {
                return;
            }
            try {
                this.f17292b.f17286c.accept(t5);
                this.f17293c = cVar;
                this.f17291a.onSuccess(t5);
                a();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                b(th);
            }
        }
    }

    public f1(io.reactivex.rxjava3.core.d0<T> d0Var, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar, m3.g<? super T> gVar2, m3.g<? super Throwable> gVar3, m3.a aVar, m3.a aVar2, m3.a aVar3) {
        super(d0Var);
        this.f17285b = gVar;
        this.f17286c = gVar2;
        this.f17287d = gVar3;
        this.f17288e = aVar;
        this.f17289f = aVar2;
        this.f17290g = aVar3;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var, this));
    }
}
