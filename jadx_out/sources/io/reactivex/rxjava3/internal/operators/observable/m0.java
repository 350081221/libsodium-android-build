package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class m0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super T> f17845b;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.observers.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final m3.g<? super T> f17846f;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.g<? super T> gVar) {
            super(p0Var);
            this.f17846f = gVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f16408a.onNext(t5);
            if (this.f16412e == 0) {
                try {
                    this.f17846f.accept(t5);
                } catch (Throwable th) {
                    c(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            T poll = this.f16410c.poll();
            if (poll != null) {
                this.f17846f.accept(poll);
            }
            return poll;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }
    }

    public m0(io.reactivex.rxjava3.core.n0<T> n0Var, m3.g<? super T> gVar) {
        super(n0Var);
        this.f17845b = gVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17845b));
    }
}
