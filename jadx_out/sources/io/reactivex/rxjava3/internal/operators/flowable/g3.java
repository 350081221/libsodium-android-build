package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class g3<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.e f16768c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final org.reactivestreams.p<? super T> downstream;
        long produced;
        final io.reactivex.rxjava3.internal.subscriptions.i sa;
        final org.reactivestreams.o<? extends T> source;
        final m3.e stop;

        a(org.reactivestreams.p<? super T> pVar, m3.e eVar, io.reactivex.rxjava3.internal.subscriptions.i iVar, org.reactivestreams.o<? extends T> oVar) {
            this.downstream = pVar;
            this.sa = iVar;
            this.source = oVar;
            this.stop = eVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            try {
                if (this.stop.getAsBoolean()) {
                    this.downstream.onComplete();
                } else {
                    subscribeNext();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.produced++;
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            this.sa.setSubscription(qVar);
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i5 = 1;
                while (!this.sa.isCancelled()) {
                    long j5 = this.produced;
                    if (j5 != 0) {
                        this.produced = 0L;
                        this.sa.produced(j5);
                    }
                    this.source.subscribe(this);
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                }
            }
        }
    }

    public g3(io.reactivex.rxjava3.core.o<T> oVar, m3.e eVar) {
        super(oVar);
        this.f16768c = eVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        io.reactivex.rxjava3.internal.subscriptions.i iVar = new io.reactivex.rxjava3.internal.subscriptions.i(false);
        pVar.onSubscribe(iVar);
        new a(pVar, this.f16768c, iVar, this.f16598b).subscribeNext();
    }
}
