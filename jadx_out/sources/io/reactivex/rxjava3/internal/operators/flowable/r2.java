package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class r2<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicLong implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -3176480756392482682L;
        boolean done;
        final org.reactivestreams.p<? super T> downstream;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super T> pVar) {
            this.downstream = pVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
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
            if (get() != 0) {
                this.downstream.onNext(t5);
                io.reactivex.rxjava3.internal.util.d.e(this, 1L);
            } else {
                onError(new io.reactivex.rxjava3.exceptions.c("could not emit value due to lack of requests"));
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

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this, j5);
            }
        }
    }

    public r2(io.reactivex.rxjava3.core.o<T> oVar) {
        super(oVar);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar));
    }
}
