package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class t<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.b<? super T, ? super Throwable> f17397b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17398a;

        /* renamed from: b, reason: collision with root package name */
        final m3.b<? super T, ? super Throwable> f17399b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17400c;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, m3.b<? super T, ? super Throwable> bVar) {
            this.f17398a = a0Var;
            this.f17399b = bVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17400c.dispose();
            this.f17400c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17400c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17400c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            try {
                this.f17399b.accept(null, null);
                this.f17398a.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17398a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17400c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            try {
                this.f17399b.accept(null, th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                th = new io.reactivex.rxjava3.exceptions.a(th, th2);
            }
            this.f17398a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17400c, eVar)) {
                this.f17400c = eVar;
                this.f17398a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f17400c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            try {
                this.f17399b.accept(t5, null);
                this.f17398a.onSuccess(t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17398a.onError(th);
            }
        }
    }

    public t(io.reactivex.rxjava3.core.d0<T> d0Var, m3.b<? super T, ? super Throwable> bVar) {
        super(d0Var);
        this.f17397b = bVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17397b));
    }
}
