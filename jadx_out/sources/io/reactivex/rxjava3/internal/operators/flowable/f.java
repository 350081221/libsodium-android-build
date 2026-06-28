package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class f<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, Boolean> {

    /* renamed from: c, reason: collision with root package name */
    final m3.r<? super T> f16731c;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.f<Boolean> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -3521127104134758517L;
        boolean done;
        final m3.r<? super T> predicate;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super Boolean> pVar, m3.r<? super T> rVar) {
            super(pVar);
            this.predicate = rVar;
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
            complete(Boolean.TRUE);
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
                if (!this.predicate.test(t5)) {
                    this.done = true;
                    this.upstream.cancel();
                    complete(Boolean.FALSE);
                }
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

    public f(io.reactivex.rxjava3.core.o<T> oVar, m3.r<? super T> rVar) {
        super(oVar);
        this.f16731c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super Boolean> pVar) {
        this.f16598b.N6(new a(pVar, this.f16731c));
    }
}
