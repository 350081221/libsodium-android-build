package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class v<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<T> f17413a;

    /* renamed from: b, reason: collision with root package name */
    final m3.a f17414b;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.a0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17415a;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.f17415a = a0Var;
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            try {
                v.this.f17414b.run();
                this.f17415a.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17415a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            try {
                v.this.f17414b.run();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                th = new io.reactivex.rxjava3.exceptions.a(th, th2);
            }
            this.f17415a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f17415a.onSubscribe(eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                v.this.f17414b.run();
                this.f17415a.onSuccess(t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17415a.onError(th);
            }
        }
    }

    public v(io.reactivex.rxjava3.core.d0<T> d0Var, m3.a aVar) {
        this.f17413a = d0Var;
        this.f17414b = aVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17413a.a(new a(a0Var));
    }
}
