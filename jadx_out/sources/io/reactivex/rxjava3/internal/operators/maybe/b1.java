package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b1<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17249b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;
        Throwable error;
        final io.reactivex.rxjava3.core.q0 scheduler;
        T value;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, io.reactivex.rxjava3.core.q0 q0Var) {
            this.downstream = a0Var;
            this.scheduler = q0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, this.scheduler.e(this));
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.error = th;
            io.reactivex.rxjava3.internal.disposables.c.replace(this, this.scheduler.e(this));
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.value = t5;
            io.reactivex.rxjava3.internal.disposables.c.replace(this, this.scheduler.e(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            T t5 = this.value;
            if (t5 != null) {
                this.value = null;
                this.downstream.onSuccess(t5);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public b1(io.reactivex.rxjava3.core.d0<T> d0Var, io.reactivex.rxjava3.core.q0 q0Var) {
        super(d0Var);
        this.f17249b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17249b));
    }
}
