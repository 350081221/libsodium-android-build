package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class f4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f16746c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicLong implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 2288246011222124525L;
        final org.reactivestreams.p<? super T> downstream;
        long remaining;
        org.reactivestreams.q upstream;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(org.reactivestreams.p<? super T> pVar, long j5) {
            this.downstream = pVar;
            this.remaining = j5;
            lazySet(j5);
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            long j5 = this.remaining;
            if (j5 > 0) {
                long j6 = j5 - 1;
                this.remaining = j6;
                this.downstream.onNext(t5);
                if (j6 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                if (this.remaining == 0) {
                    qVar.cancel();
                    io.reactivex.rxjava3.internal.subscriptions.g.complete(this.downstream);
                } else {
                    this.upstream = qVar;
                    this.downstream.onSubscribe(this);
                }
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            long j6;
            long min;
            if (!io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                return;
            }
            do {
                j6 = get();
                if (j6 != 0) {
                    min = Math.min(j6, j5);
                } else {
                    return;
                }
            } while (!compareAndSet(j6, j6 - min));
            this.upstream.request(min);
        }
    }

    public f4(io.reactivex.rxjava3.core.o<T> oVar, long j5) {
        super(oVar);
        this.f16746c = j5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16746c));
    }
}
