package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class i2<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, io.reactivex.rxjava3.core.f0<T>> {

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.t<T, io.reactivex.rxjava3.core.f0<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        a(org.reactivestreams.p<? super io.reactivex.rxjava3.core.f0<T>> pVar) {
            super(pVar);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            complete(io.reactivex.rxjava3.core.f0.a());
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            complete(io.reactivex.rxjava3.core.f0.b(th));
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.produced++;
            this.downstream.onNext(io.reactivex.rxjava3.core.f0.c(t5));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.reactivex.rxjava3.internal.subscribers.t
        public void onDrop(io.reactivex.rxjava3.core.f0<T> f0Var) {
            if (f0Var.g()) {
                io.reactivex.rxjava3.plugins.a.Y(f0Var.d());
            }
        }
    }

    public i2(io.reactivex.rxjava3.core.o<T> oVar) {
        super(oVar);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super io.reactivex.rxjava3.core.f0<T>> pVar) {
        this.f16598b.N6(new a(pVar));
    }
}
