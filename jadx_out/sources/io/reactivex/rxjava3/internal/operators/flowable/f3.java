package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class f3<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f16745c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final org.reactivestreams.p<? super T> downstream;
        long produced;
        long remaining;
        final io.reactivex.rxjava3.internal.subscriptions.i sa;
        final org.reactivestreams.o<? extends T> source;

        a(org.reactivestreams.p<? super T> pVar, long j5, io.reactivex.rxjava3.internal.subscriptions.i iVar, org.reactivestreams.o<? extends T> oVar) {
            this.downstream = pVar;
            this.sa = iVar;
            this.source = oVar;
            this.remaining = j5;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            long j5 = this.remaining;
            if (j5 != Long.MAX_VALUE) {
                this.remaining = j5 - 1;
            }
            if (j5 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
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

    public f3(io.reactivex.rxjava3.core.o<T> oVar, long j5) {
        super(oVar);
        this.f16745c = j5;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        io.reactivex.rxjava3.internal.subscriptions.i iVar = new io.reactivex.rxjava3.internal.subscriptions.i(false);
        pVar.onSubscribe(iVar);
        long j5 = this.f16745c;
        long j6 = Long.MAX_VALUE;
        if (j5 != Long.MAX_VALUE) {
            j6 = j5 - 1;
        }
        new a(pVar, j6, iVar, this.f16598b).subscribeNext();
    }
}
