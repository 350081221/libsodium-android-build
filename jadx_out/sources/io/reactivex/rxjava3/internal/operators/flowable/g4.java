package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class g4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final int f16769c;

    /* loaded from: classes3.dex */
    static final class a<T> extends ArrayDeque<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        volatile boolean done;
        final org.reactivestreams.p<? super T> downstream;
        org.reactivestreams.q upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger wip = new AtomicInteger();

        a(org.reactivestreams.p<? super T> pVar, int i5) {
            this.downstream = pVar;
            this.count = i5;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        void drain() {
            if (this.wip.getAndIncrement() == 0) {
                org.reactivestreams.p<? super T> pVar = this.downstream;
                long j5 = this.requested.get();
                while (!this.cancelled) {
                    if (this.done) {
                        long j6 = 0;
                        while (j6 != j5) {
                            if (this.cancelled) {
                                return;
                            }
                            T poll = poll();
                            if (poll == null) {
                                pVar.onComplete();
                                return;
                            } else {
                                pVar.onNext(poll);
                                j6++;
                            }
                        }
                        if (isEmpty()) {
                            pVar.onComplete();
                            return;
                        } else if (j6 != 0) {
                            j5 = io.reactivex.rxjava3.internal.util.d.e(this.requested, j6);
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.count == size()) {
                poll();
            }
            offer(t5);
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
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
        }
    }

    public g4(io.reactivex.rxjava3.core.o<T> oVar, int i5) {
        super(oVar);
        this.f16769c = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16769c));
    }
}
