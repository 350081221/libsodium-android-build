package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class k2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends T> f17806b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17807a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super Throwable, ? extends T> f17808b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17809c;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.o<? super Throwable, ? extends T> oVar) {
            this.f17807a = p0Var;
            this.f17808b = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17809c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17809c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17807a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            try {
                T apply = this.f17808b.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f17807a.onError(nullPointerException);
                } else {
                    this.f17807a.onNext(apply);
                    this.f17807a.onComplete();
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.f17807a.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f17807a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17809c, eVar)) {
                this.f17809c = eVar;
                this.f17807a.onSubscribe(this);
            }
        }
    }

    public k2(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super Throwable, ? extends T> oVar) {
        super(n0Var);
        this.f17806b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17806b));
    }
}
