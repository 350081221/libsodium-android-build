package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c1<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18338a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18339b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        io.reactivex.rxjava3.disposables.e ds;
        final io.reactivex.rxjava3.core.q0 scheduler;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, io.reactivex.rxjava3.core.q0 q0Var) {
            this.downstream = u0Var;
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

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.downstream.onSuccess(t5);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.ds.dispose();
        }
    }

    public c1(io.reactivex.rxjava3.core.x0<T> x0Var, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f18338a = x0Var;
        this.f18339b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18338a.a(new a(u0Var, this.f18339b));
    }
}
