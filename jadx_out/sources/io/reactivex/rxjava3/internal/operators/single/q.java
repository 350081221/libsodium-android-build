package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class q<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18426a;

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super Throwable> f18427b;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.u0<T> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.u0<? super T> f18428a;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
            this.f18428a = u0Var;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            try {
                q.this.f18427b.accept(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                th = new io.reactivex.rxjava3.exceptions.a(th, th2);
            }
            this.f18428a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18428a.onSubscribe(eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f18428a.onSuccess(t5);
        }
    }

    public q(io.reactivex.rxjava3.core.x0<T> x0Var, m3.g<? super Throwable> gVar) {
        this.f18426a = x0Var;
        this.f18427b = gVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18426a.a(new a(u0Var));
    }
}
