package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class c1<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super Throwable> f17260b;

    /* loaded from: classes3.dex */
    public static final class a<T> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17261a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super Throwable> f17262b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17263c;

        public a(io.reactivex.rxjava3.core.a0<? super T> a0Var, m3.r<? super Throwable> rVar) {
            this.f17261a = a0Var;
            this.f17262b = rVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17263c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17263c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17261a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            try {
                if (this.f17262b.test(th)) {
                    this.f17261a.onComplete();
                } else {
                    this.f17261a.onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.f17261a.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17263c, eVar)) {
                this.f17263c = eVar;
                this.f17261a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f17261a.onSuccess(t5);
        }
    }

    public c1(io.reactivex.rxjava3.core.d0<T> d0Var, m3.r<? super Throwable> rVar) {
        super(d0Var);
        this.f17260b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17260b));
    }
}
