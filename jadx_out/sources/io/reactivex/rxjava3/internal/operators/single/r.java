package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class r<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18431a;

    /* renamed from: b, reason: collision with root package name */
    final m3.b<? super T, ? super Throwable> f18432b;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.u0<T> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.u0<? super T> f18433a;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
            this.f18433a = u0Var;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            try {
                r.this.f18432b.accept(null, th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                th = new io.reactivex.rxjava3.exceptions.a(th, th2);
            }
            this.f18433a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18433a.onSubscribe(eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                r.this.f18432b.accept(t5, null);
                this.f18433a.onSuccess(t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18433a.onError(th);
            }
        }
    }

    public r(io.reactivex.rxjava3.core.x0<T> x0Var, m3.b<? super T, ? super Throwable> bVar) {
        this.f18431a = x0Var;
        this.f18432b = bVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18431a.a(new a(u0Var));
    }
}
