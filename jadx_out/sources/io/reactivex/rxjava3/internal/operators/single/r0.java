package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class r0<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18435a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18436b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        Throwable error;
        final io.reactivex.rxjava3.core.q0 scheduler;
        T value;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, io.reactivex.rxjava3.core.q0 q0Var) {
            this.downstream = u0Var;
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

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.error = th;
            io.reactivex.rxjava3.internal.disposables.c.replace(this, this.scheduler.e(this));
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.value = t5;
            io.reactivex.rxjava3.internal.disposables.c.replace(this, this.scheduler.e(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess(this.value);
            }
        }
    }

    public r0(io.reactivex.rxjava3.core.x0<T> x0Var, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f18435a = x0Var;
        this.f18436b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18435a.a(new a(u0Var, this.f18436b));
    }
}
