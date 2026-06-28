package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class u1<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17412b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;
        io.reactivex.rxjava3.disposables.e ds;
        final io.reactivex.rxjava3.core.q0 scheduler;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, io.reactivex.rxjava3.core.q0 q0Var) {
            this.downstream = a0Var;
            this.scheduler = q0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            io.reactivex.rxjava3.disposables.e andSet = getAndSet(cVar);
            if (andSet != cVar) {
                this.ds = andSet;
                this.scheduler.e(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.downstream.onSuccess(t5);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.ds.dispose();
        }
    }

    public u1(io.reactivex.rxjava3.core.d0<T> d0Var, io.reactivex.rxjava3.core.q0 q0Var) {
        super(d0Var);
        this.f17412b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17412b));
    }
}
