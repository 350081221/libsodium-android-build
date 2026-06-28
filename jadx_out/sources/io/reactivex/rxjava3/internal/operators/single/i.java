package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class i<T, U> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18385a;

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<U> f18386b;

    /* loaded from: classes3.dex */
    static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.t<U>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -8565274649390031272L;
        boolean done;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        final io.reactivex.rxjava3.core.x0<T> source;
        org.reactivestreams.q upstream;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, io.reactivex.rxjava3.core.x0<T> x0Var) {
            this.downstream = u0Var;
            this.source = x0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.upstream.cancel();
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.source.a(new io.reactivex.rxjava3.internal.observers.a0(this, this.downstream));
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
        public void onNext(U u4) {
            this.upstream.cancel();
            onComplete();
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

    public i(io.reactivex.rxjava3.core.x0<T> x0Var, org.reactivestreams.o<U> oVar) {
        this.f18385a = x0Var;
        this.f18386b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18386b.subscribe(new a(u0Var, this.f18385a));
    }
}
