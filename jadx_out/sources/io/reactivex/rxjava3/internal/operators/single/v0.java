package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class v0<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18466a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18467b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        final io.reactivex.rxjava3.core.x0<? extends T> source;
        final io.reactivex.rxjava3.internal.disposables.f task = new io.reactivex.rxjava3.internal.disposables.f();

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, io.reactivex.rxjava3.core.x0<? extends T> x0Var) {
            this.downstream = u0Var;
            this.source = x0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            this.task.dispose();
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
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.downstream.onSuccess(t5);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.a(this);
        }
    }

    public v0(io.reactivex.rxjava3.core.x0<? extends T> x0Var, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f18466a = x0Var;
        this.f18467b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        a aVar = new a(u0Var, this.f18466a);
        u0Var.onSubscribe(aVar);
        aVar.task.replace(this.f18467b.e(aVar));
    }
}
