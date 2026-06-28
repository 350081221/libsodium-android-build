package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class s<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.r0<T> f18437a;

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super io.reactivex.rxjava3.disposables.e> f18438b;

    /* renamed from: c, reason: collision with root package name */
    final m3.a f18439c;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f18440a;

        /* renamed from: b, reason: collision with root package name */
        final m3.g<? super io.reactivex.rxjava3.disposables.e> f18441b;

        /* renamed from: c, reason: collision with root package name */
        final m3.a f18442c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18443d;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar, m3.a aVar) {
            this.f18440a = u0Var;
            this.f18441b = gVar;
            this.f18442c = aVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            try {
                this.f18442c.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
            this.f18443d.dispose();
            this.f18443d = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18443d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(@l3.f Throwable th) {
            io.reactivex.rxjava3.disposables.e eVar = this.f18443d;
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar) {
                this.f18443d = cVar;
                this.f18440a.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
            try {
                this.f18441b.accept(eVar);
                if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18443d, eVar)) {
                    this.f18443d = eVar;
                    this.f18440a.onSubscribe(this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                eVar.dispose();
                this.f18443d = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
                io.reactivex.rxjava3.internal.disposables.d.error(th, this.f18440a);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(@l3.f T t5) {
            io.reactivex.rxjava3.disposables.e eVar = this.f18443d;
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar) {
                this.f18443d = cVar;
                this.f18440a.onSuccess(t5);
            }
        }
    }

    public s(io.reactivex.rxjava3.core.r0<T> r0Var, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar, m3.a aVar) {
        this.f18437a = r0Var;
        this.f18438b = gVar;
        this.f18439c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18437a.a(new a(u0Var, this.f18438b, this.f18439c));
    }
}
