package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class y0<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18491a;

    /* renamed from: b, reason: collision with root package name */
    final long f18492b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f18493c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18494d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18495e;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T>, Runnable, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 37497744973048446L;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        final C0525a<T> fallback;
        io.reactivex.rxjava3.core.x0<? extends T> other;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> task = new AtomicReference<>();
        final long timeout;
        final TimeUnit unit;

        /* renamed from: io.reactivex.rxjava3.internal.operators.single.y0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0525a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final io.reactivex.rxjava3.core.u0<? super T> downstream;

            C0525a(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
                this.downstream = u0Var;
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
        }

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, io.reactivex.rxjava3.core.x0<? extends T> x0Var, long j5, TimeUnit timeUnit) {
            this.downstream = u0Var;
            this.other = x0Var;
            this.timeout = j5;
            this.unit = timeUnit;
            if (x0Var != null) {
                this.fallback = new C0525a<>(u0Var);
            } else {
                this.fallback = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.task);
            C0525a<T> c0525a = this.fallback;
            if (c0525a != null) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(c0525a);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            io.reactivex.rxjava3.disposables.e eVar = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar && compareAndSet(eVar, cVar)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.task);
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            io.reactivex.rxjava3.disposables.e eVar = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar && compareAndSet(eVar, cVar)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.task);
                this.downstream.onSuccess(t5);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            io.reactivex.rxjava3.disposables.e eVar = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar && compareAndSet(eVar, cVar)) {
                if (eVar != null) {
                    eVar.dispose();
                }
                io.reactivex.rxjava3.core.x0<? extends T> x0Var = this.other;
                if (x0Var == null) {
                    this.downstream.onError(new TimeoutException(io.reactivex.rxjava3.internal.util.k.h(this.timeout, this.unit)));
                } else {
                    this.other = null;
                    x0Var.a(this.fallback);
                }
            }
        }
    }

    public y0(io.reactivex.rxjava3.core.x0<T> x0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, io.reactivex.rxjava3.core.x0<? extends T> x0Var2) {
        this.f18491a = x0Var;
        this.f18492b = j5;
        this.f18493c = timeUnit;
        this.f18494d = q0Var;
        this.f18495e = x0Var2;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        a aVar = new a(u0Var, this.f18495e, this.f18492b, this.f18493c);
        u0Var.onSubscribe(aVar);
        io.reactivex.rxjava3.internal.disposables.c.replace(aVar.task, this.f18494d.g(aVar, this.f18492b, this.f18493c));
        this.f18491a.a(aVar);
    }
}
