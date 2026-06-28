package io.reactivex.rxjava3.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b<R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f17443b;

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<? extends R> f17444c;

    public b(io.reactivex.rxjava3.core.i iVar, org.reactivestreams.o<? extends R> oVar) {
        this.f17443b = iVar;
        this.f17444c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f17443b.a(new a(pVar, this.f17444c));
    }

    /* loaded from: classes3.dex */
    static final class a<R> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<R>, io.reactivex.rxjava3.core.f, org.reactivestreams.q {
        private static final long serialVersionUID = -8948264376121066672L;
        final org.reactivestreams.p<? super R> downstream;
        org.reactivestreams.o<? extends R> other;
        final AtomicLong requested = new AtomicLong();
        io.reactivex.rxjava3.disposables.e upstream;

        a(org.reactivestreams.p<? super R> pVar, org.reactivestreams.o<? extends R> oVar) {
            this.downstream = pVar;
            this.other = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.dispose();
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            org.reactivestreams.o<? extends R> oVar = this.other;
            if (oVar == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                oVar.subscribe(this);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(R r5) {
            this.downstream.onNext(r5);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this, this.requested, j5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this, this.requested, qVar);
        }
    }
}
