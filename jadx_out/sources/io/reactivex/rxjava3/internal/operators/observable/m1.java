package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class m1<T, S> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<S> f17847a;

    /* renamed from: b, reason: collision with root package name */
    final m3.c<S, io.reactivex.rxjava3.core.k<T>, S> f17848b;

    /* renamed from: c, reason: collision with root package name */
    final m3.g<? super S> f17849c;

    /* loaded from: classes3.dex */
    static final class a<T, S> implements io.reactivex.rxjava3.core.k<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17850a;

        /* renamed from: b, reason: collision with root package name */
        final m3.c<S, ? super io.reactivex.rxjava3.core.k<T>, S> f17851b;

        /* renamed from: c, reason: collision with root package name */
        final m3.g<? super S> f17852c;

        /* renamed from: d, reason: collision with root package name */
        S f17853d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f17854e;

        /* renamed from: f, reason: collision with root package name */
        boolean f17855f;

        /* renamed from: g, reason: collision with root package name */
        boolean f17856g;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.c<S, ? super io.reactivex.rxjava3.core.k<T>, S> cVar, m3.g<? super S> gVar, S s5) {
            this.f17850a = p0Var;
            this.f17851b = cVar;
            this.f17852c = gVar;
            this.f17853d = s5;
        }

        private void a(S s5) {
            try {
                this.f17852c.accept(s5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        public void b() {
            S s5 = this.f17853d;
            if (this.f17854e) {
                this.f17853d = null;
                a(s5);
                return;
            }
            m3.c<S, ? super io.reactivex.rxjava3.core.k<T>, S> cVar = this.f17851b;
            while (!this.f17854e) {
                this.f17856g = false;
                try {
                    s5 = cVar.apply(s5, this);
                    if (this.f17855f) {
                        this.f17854e = true;
                        this.f17853d = null;
                        a(s5);
                        return;
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.f17853d = null;
                    this.f17854e = true;
                    onError(th);
                    a(s5);
                    return;
                }
            }
            this.f17853d = null;
            a(s5);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17854e = true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17854e;
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onComplete() {
            if (!this.f17855f) {
                this.f17855f = true;
                this.f17850a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onError(Throwable th) {
            if (this.f17855f) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            if (th == null) {
                th = io.reactivex.rxjava3.internal.util.k.b("onError called with a null Throwable.");
            }
            this.f17855f = true;
            this.f17850a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onNext(T t5) {
            if (!this.f17855f) {
                if (this.f17856g) {
                    onError(new IllegalStateException("onNext already called in this generate turn"));
                } else if (t5 == null) {
                    onError(io.reactivex.rxjava3.internal.util.k.b("onNext called with a null value."));
                } else {
                    this.f17856g = true;
                    this.f17850a.onNext(t5);
                }
            }
        }
    }

    public m1(m3.s<S> sVar, m3.c<S, io.reactivex.rxjava3.core.k<T>, S> cVar, m3.g<? super S> gVar) {
        this.f17847a = sVar;
        this.f17848b = cVar;
        this.f17849c = gVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        try {
            a aVar = new a(p0Var, this.f17848b, this.f17849c, this.f17847a.get());
            p0Var.onSubscribe(aVar);
            aVar.b();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
        }
    }
}
