package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class l0<T, K> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, K> f17818b;

    /* renamed from: c, reason: collision with root package name */
    final m3.d<? super K, ? super K> f17819c;

    /* loaded from: classes3.dex */
    static final class a<T, K> extends io.reactivex.rxjava3.internal.observers.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final m3.o<? super T, K> f17820f;

        /* renamed from: g, reason: collision with root package name */
        final m3.d<? super K, ? super K> f17821g;

        /* renamed from: h, reason: collision with root package name */
        K f17822h;

        /* renamed from: i, reason: collision with root package name */
        boolean f17823i;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.o<? super T, K> oVar, m3.d<? super K, ? super K> dVar) {
            super(p0Var);
            this.f17820f = oVar;
            this.f17821g = dVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f16411d) {
                return;
            }
            if (this.f16412e != 0) {
                this.f16408a.onNext(t5);
                return;
            }
            try {
                K apply = this.f17820f.apply(t5);
                if (this.f17823i) {
                    boolean a5 = this.f17821g.a(this.f17822h, apply);
                    this.f17822h = apply;
                    if (a5) {
                        return;
                    }
                } else {
                    this.f17823i = true;
                    this.f17822h = apply;
                }
                this.f16408a.onNext(t5);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            while (true) {
                T poll = this.f16410c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f17820f.apply(poll);
                if (!this.f17823i) {
                    this.f17823i = true;
                    this.f17822h = apply;
                    return poll;
                }
                if (!this.f17821g.a(this.f17822h, apply)) {
                    this.f17822h = apply;
                    return poll;
                }
                this.f17822h = apply;
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }
    }

    public l0(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, K> oVar, m3.d<? super K, ? super K> dVar) {
        super(n0Var);
        this.f17818b = oVar;
        this.f17819c = dVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17818b, this.f17819c));
    }
}
