package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class v<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18462a;

    /* renamed from: b, reason: collision with root package name */
    final m3.a f18463b;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.u0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f18464a;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
            this.f18464a = u0Var;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            try {
                v.this.f18463b.run();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                th = new io.reactivex.rxjava3.exceptions.a(th, th2);
            }
            this.f18464a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18464a.onSubscribe(eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                v.this.f18463b.run();
                this.f18464a.onSuccess(t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18464a.onError(th);
            }
        }
    }

    public v(io.reactivex.rxjava3.core.x0<T> x0Var, m3.a aVar) {
        this.f18462a = x0Var;
        this.f18463b = aVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18462a.a(new a(u0Var));
    }
}
