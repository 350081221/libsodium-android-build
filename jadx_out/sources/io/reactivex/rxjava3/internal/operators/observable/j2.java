package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class j2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.n0<? extends T>> f17781b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17782a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.n0<? extends T>> f17783b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.disposables.f f17784c = new io.reactivex.rxjava3.internal.disposables.f();

        /* renamed from: d, reason: collision with root package name */
        boolean f17785d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17786e;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.n0<? extends T>> oVar) {
            this.f17782a = p0Var;
            this.f17783b = oVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17786e) {
                return;
            }
            this.f17786e = true;
            this.f17785d = true;
            this.f17782a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17785d) {
                if (this.f17786e) {
                    io.reactivex.rxjava3.plugins.a.Y(th);
                    return;
                } else {
                    this.f17782a.onError(th);
                    return;
                }
            }
            this.f17785d = true;
            try {
                io.reactivex.rxjava3.core.n0<? extends T> apply = this.f17783b.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("Observable is null");
                    nullPointerException.initCause(th);
                    this.f17782a.onError(nullPointerException);
                    return;
                }
                apply.subscribe(this);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.f17782a.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17786e) {
                return;
            }
            this.f17782a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f17784c.replace(eVar);
        }
    }

    public j2(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.n0<? extends T>> oVar) {
        super(n0Var);
        this.f17781b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        a aVar = new a(p0Var, this.f17781b);
        p0Var.onSubscribe(aVar.f17784c);
        this.f17528a.subscribe(aVar);
    }
}
