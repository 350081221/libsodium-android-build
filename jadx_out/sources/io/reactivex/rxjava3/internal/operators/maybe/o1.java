package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class o1 extends io.reactivex.rxjava3.core.x<Long> {

    /* renamed from: a, reason: collision with root package name */
    final long f17368a;

    /* renamed from: b, reason: collision with root package name */
    final TimeUnit f17369b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17370c;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;
        final io.reactivex.rxjava3.core.a0<? super Long> downstream;

        a(io.reactivex.rxjava3.core.a0<? super Long> a0Var) {
            this.downstream = a0Var;
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

    public o1(long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f17368a = j5;
        this.f17369b = timeUnit;
        this.f17370c = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super Long> a0Var) {
        a aVar = new a(a0Var);
        a0Var.onSubscribe(aVar);
        aVar.setFuture(this.f17370c.g(aVar, this.f17368a, this.f17369b));
    }
}
