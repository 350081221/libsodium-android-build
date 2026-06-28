package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class y3<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final int f17201c;

    /* loaded from: classes3.dex */
    static final class a<T> extends ArrayDeque<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -3807491841935125653L;
        final org.reactivestreams.p<? super T> downstream;
        final int skip;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super T> pVar, int i5) {
            super(i5);
            this.downstream = pVar;
            this.skip = i5;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.skip == size()) {
                this.downstream.onNext(poll());
            } else {
                this.upstream.request(1L);
            }
            offer(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.upstream.request(j5);
        }
    }

    public y3(io.reactivex.rxjava3.core.o<T> oVar, int i5) {
        super(oVar);
        this.f17201c = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f17201c));
    }
}
