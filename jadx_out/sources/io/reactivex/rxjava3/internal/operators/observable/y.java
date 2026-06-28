package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class y<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<? extends T> f18181b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -1953724749712440952L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        boolean inMaybe;
        io.reactivex.rxjava3.core.d0<? extends T> other;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, io.reactivex.rxjava3.core.d0<? extends T> d0Var) {
            this.downstream = p0Var;
            this.other = d0Var;
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
            if (this.inMaybe) {
                this.downstream.onComplete();
                return;
            }
            this.inMaybe = true;
            io.reactivex.rxjava3.internal.disposables.c.replace(this, null);
            io.reactivex.rxjava3.core.d0<? extends T> d0Var = this.other;
            this.other = null;
            d0Var.a(this);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar) && !this.inMaybe) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.downstream.onNext(t5);
            this.downstream.onComplete();
        }
    }

    public y(io.reactivex.rxjava3.core.i0<T> i0Var, io.reactivex.rxjava3.core.d0<? extends T> d0Var) {
        super(i0Var);
        this.f18181b = d0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f18181b));
    }
}
