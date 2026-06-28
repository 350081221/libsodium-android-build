package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class s0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f17026c;

    /* renamed from: d, reason: collision with root package name */
    final T f17027d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f17028e;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.f<T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        long count;
        final T defaultValue;
        boolean done;
        final boolean errorOnFewer;
        final long index;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super T> pVar, long j5, T t5, boolean z4) {
            super(pVar);
            this.index = j5;
            this.defaultValue = t5;
            this.errorOnFewer = z4;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                T t5 = this.defaultValue;
                if (t5 == null) {
                    if (this.errorOnFewer) {
                        this.downstream.onError(new NoSuchElementException());
                        return;
                    } else {
                        this.downstream.onComplete();
                        return;
                    }
                }
                complete(t5);
            }
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
            long j5 = this.count;
            if (j5 == this.index) {
                this.done = true;
                this.upstream.cancel();
                complete(t5);
                return;
            }
            this.count = j5 + 1;
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

    public s0(io.reactivex.rxjava3.core.o<T> oVar, long j5, T t5, boolean z4) {
        super(oVar);
        this.f17026c = j5;
        this.f17027d = t5;
        this.f17028e = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f17026c, this.f17027d, this.f17028e));
    }
}
