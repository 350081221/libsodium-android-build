package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<? extends T> f16599c;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.t<T, T> implements io.reactivex.rxjava3.core.a0<T> {
        private static final long serialVersionUID = -7346385463600070225L;
        boolean inMaybe;
        io.reactivex.rxjava3.core.d0<? extends T> other;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> otherDisposable;

        a(org.reactivestreams.p<? super T> pVar, io.reactivex.rxjava3.core.d0<? extends T> d0Var) {
            super(pVar);
            this.other = d0Var;
            this.otherDisposable = new AtomicReference<>();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.t, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.otherDisposable);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.inMaybe) {
                this.downstream.onComplete();
                return;
            }
            this.inMaybe = true;
            this.upstream = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            io.reactivex.rxjava3.core.d0<? extends T> d0Var = this.other;
            this.other = null;
            d0Var.a(this);
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

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.otherDisposable, eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            complete(t5);
        }
    }

    public a0(io.reactivex.rxjava3.core.o<T> oVar, io.reactivex.rxjava3.core.d0<? extends T> d0Var) {
        super(oVar);
        this.f16599c = d0Var;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16599c));
    }
}
