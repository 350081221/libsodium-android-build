package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class r<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    final m3.s<? extends U> f16990c;

    /* renamed from: d, reason: collision with root package name */
    final m3.b<? super U, ? super T> f16991d;

    /* loaded from: classes3.dex */
    static final class a<T, U> extends io.reactivex.rxjava3.internal.subscriptions.f<U> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -3589550218733891694L;
        final m3.b<? super U, ? super T> collector;
        boolean done;

        /* renamed from: u, reason: collision with root package name */
        final U f16992u;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super U> pVar, U u4, m3.b<? super U, ? super T> bVar) {
            super(pVar);
            this.collector = bVar;
            this.f16992u = u4;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            complete(this.f16992u);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            try {
                this.collector.accept(this.f16992u, t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public r(io.reactivex.rxjava3.core.o<T> oVar, m3.s<? extends U> sVar, m3.b<? super U, ? super T> bVar) {
        super(oVar);
        this.f16990c = sVar;
        this.f16991d = bVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super U> pVar) {
        try {
            U u4 = this.f16990c.get();
            Objects.requireNonNull(u4, "The initial value supplied is null");
            this.f16598b.N6(new a(pVar, u4, this.f16991d));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
