package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class z0 extends io.reactivex.rxjava3.core.r0<Long> {

    /* renamed from: a, reason: collision with root package name */
    final long f18501a;

    /* renamed from: b, reason: collision with root package name */
    final TimeUnit f18502b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18503c;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        final io.reactivex.rxjava3.core.u0<? super Long> downstream;

        a(io.reactivex.rxjava3.core.u0<? super Long> u0Var) {
            this.downstream = u0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.downstream.onSuccess(0L);
        }

        void setFuture(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
        }
    }

    public z0(long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f18501a = j5;
        this.f18502b = timeUnit;
        this.f18503c = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super Long> u0Var) {
        a aVar = new a(u0Var);
        u0Var.onSubscribe(aVar);
        aVar.setFuture(this.f18503c.g(aVar, this.f18501a, this.f18502b));
    }
}
