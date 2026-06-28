package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class f<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18357a;

    /* renamed from: b, reason: collision with root package name */
    final long f18358b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f18359c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18360d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f18361e;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.u0<T> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.rxjava3.internal.disposables.f f18362a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f18363b;

        /* renamed from: io.reactivex.rxjava3.internal.operators.single.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0523a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f18365a;

            RunnableC0523a(Throwable th) {
                this.f18365a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18363b.onError(this.f18365a);
            }
        }

        /* loaded from: classes3.dex */
        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final T f18367a;

            b(T t5) {
                this.f18367a = t5;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18363b.onSuccess(this.f18367a);
            }
        }

        a(io.reactivex.rxjava3.internal.disposables.f fVar, io.reactivex.rxjava3.core.u0<? super T> u0Var) {
            this.f18362a = fVar;
            this.f18363b = u0Var;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.f fVar = this.f18362a;
            io.reactivex.rxjava3.core.q0 q0Var = f.this.f18360d;
            RunnableC0523a runnableC0523a = new RunnableC0523a(th);
            f fVar2 = f.this;
            fVar.replace(q0Var.g(runnableC0523a, fVar2.f18361e ? fVar2.f18358b : 0L, fVar2.f18359c));
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18362a.replace(eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            io.reactivex.rxjava3.internal.disposables.f fVar = this.f18362a;
            io.reactivex.rxjava3.core.q0 q0Var = f.this.f18360d;
            b bVar = new b(t5);
            f fVar2 = f.this;
            fVar.replace(q0Var.g(bVar, fVar2.f18358b, fVar2.f18359c));
        }
    }

    public f(io.reactivex.rxjava3.core.x0<? extends T> x0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        this.f18357a = x0Var;
        this.f18358b = j5;
        this.f18359c = timeUnit;
        this.f18360d = q0Var;
        this.f18361e = z4;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        io.reactivex.rxjava3.internal.disposables.f fVar = new io.reactivex.rxjava3.internal.disposables.f();
        u0Var.onSubscribe(fVar);
        this.f18357a.a(new a(fVar, u0Var));
    }
}
