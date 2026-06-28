package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class v4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17105c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicBoolean implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 1015244841293359600L;
        final org.reactivestreams.p<? super T> downstream;
        final io.reactivex.rxjava3.core.q0 scheduler;
        org.reactivestreams.q upstream;

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.v4$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0476a implements Runnable {
            RunnableC0476a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.upstream.cancel();
            }
        }

        a(org.reactivestreams.p<? super T> pVar, io.reactivex.rxjava3.core.q0 q0Var) {
            this.downstream = pVar;
            this.scheduler = q0Var;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.scheduler.e(new RunnableC0476a());
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (get()) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!get()) {
                this.downstream.onNext(t5);
            }
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

    public v4(io.reactivex.rxjava3.core.o<T> oVar, io.reactivex.rxjava3.core.q0 q0Var) {
        super(oVar);
        this.f17105c = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f17105c));
    }
}
