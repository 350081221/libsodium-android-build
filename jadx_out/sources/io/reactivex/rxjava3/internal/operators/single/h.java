package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class h<T, U> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18377a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<U> f18378b;

    /* loaded from: classes3.dex */
    static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<U>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -8565274649390031272L;
        boolean done;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        final io.reactivex.rxjava3.core.x0<T> source;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, io.reactivex.rxjava3.core.x0<T> x0Var) {
            this.downstream = u0Var;
            this.source = x0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.source.a(new io.reactivex.rxjava3.internal.observers.a0(this, this.downstream));
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(U u4) {
            get().dispose();
            onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    public h(io.reactivex.rxjava3.core.x0<T> x0Var, io.reactivex.rxjava3.core.n0<U> n0Var) {
        this.f18377a = x0Var;
        this.f18378b = n0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18378b.subscribe(new a(u0Var, this.f18377a));
    }
}
