package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class n<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18410a;

    /* renamed from: b, reason: collision with root package name */
    final m3.a f18411b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f18412a;

        /* renamed from: b, reason: collision with root package name */
        final m3.a f18413b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18414c;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, m3.a aVar) {
            this.f18412a = u0Var;
            this.f18413b = aVar;
        }

        private void a() {
            try {
                this.f18413b.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18414c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18414c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f18412a.onError(th);
            a();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18414c, eVar)) {
                this.f18414c = eVar;
                this.f18412a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f18412a.onSuccess(t5);
            a();
        }
    }

    public n(io.reactivex.rxjava3.core.x0<T> x0Var, m3.a aVar) {
        this.f18410a = x0Var;
        this.f18411b = aVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18410a.a(new a(u0Var, this.f18411b));
    }
}
