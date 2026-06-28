package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class v0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super T> f18128b;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.observers.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final m3.r<? super T> f18129f;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.r<? super T> rVar) {
            super(p0Var);
            this.f18129f = rVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f16412e == 0) {
                try {
                    if (this.f18129f.test(t5)) {
                        this.f16408a.onNext(t5);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c(th);
                    return;
                }
            }
            this.f16408a.onNext(null);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            T poll;
            do {
                poll = this.f16410c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f18129f.test(poll));
            return poll;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }
    }

    public v0(io.reactivex.rxjava3.core.n0<T> n0Var, m3.r<? super T> rVar) {
        super(n0Var);
        this.f18128b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f18128b));
    }
}
