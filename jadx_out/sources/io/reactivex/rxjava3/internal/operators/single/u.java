package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class u<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18456a;

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super T> f18457b;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.u0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f18458a;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
            this.f18458a = u0Var;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f18458a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18458a.onSubscribe(eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                u.this.f18457b.accept(t5);
                this.f18458a.onSuccess(t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18458a.onError(th);
            }
        }
    }

    public u(io.reactivex.rxjava3.core.x0<T> x0Var, m3.g<? super T> gVar) {
        this.f18456a = x0Var;
        this.f18457b = gVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18456a.a(new a(u0Var));
    }
}
