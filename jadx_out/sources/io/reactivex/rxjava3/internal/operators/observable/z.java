package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class z<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18198b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -1953724749712440952L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        boolean inSingle;
        io.reactivex.rxjava3.core.x0<? extends T> other;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, io.reactivex.rxjava3.core.x0<? extends T> x0Var) {
            this.downstream = p0Var;
            this.other = x0Var;
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
            this.inSingle = true;
            io.reactivex.rxjava3.internal.disposables.c.replace(this, null);
            io.reactivex.rxjava3.core.x0<? extends T> x0Var = this.other;
            this.other = null;
            x0Var.a(this);
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
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar) && !this.inSingle) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.downstream.onNext(t5);
            this.downstream.onComplete();
        }
    }

    public z(io.reactivex.rxjava3.core.i0<T> i0Var, io.reactivex.rxjava3.core.x0<? extends T> x0Var) {
        super(i0Var);
        this.f18198b = x0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f18198b));
    }
}
