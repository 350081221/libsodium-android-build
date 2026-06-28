package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class z<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f17206c;

    public z(io.reactivex.rxjava3.core.o<T> oVar, io.reactivex.rxjava3.core.i iVar) {
        super(oVar);
        this.f17206c = iVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f17206c));
    }

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.core.f, org.reactivestreams.q {
        private static final long serialVersionUID = -7346385463600070225L;
        final org.reactivestreams.p<? super T> downstream;
        boolean inCompletable;
        io.reactivex.rxjava3.core.i other;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super T> pVar, io.reactivex.rxjava3.core.i iVar) {
            this.downstream = pVar;
            this.other = iVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.cancel();
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            this.upstream = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            io.reactivex.rxjava3.core.i iVar = this.other;
            this.other = null;
            iVar.a(this);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.downstream.onNext(t5);
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

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }
    }
}
