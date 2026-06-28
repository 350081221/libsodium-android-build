package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class p0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final long f16567a;

    /* renamed from: b, reason: collision with root package name */
    final TimeUnit f16568b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16569c;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;
        final io.reactivex.rxjava3.core.f downstream;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.downstream = fVar;
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
            this.downstream.onComplete();
        }

        void setFuture(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
        }
    }

    public p0(long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f16567a = j5;
        this.f16568b = timeUnit;
        this.f16569c = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        a aVar = new a(fVar);
        fVar.onSubscribe(aVar);
        aVar.setFuture(this.f16569c.g(aVar, this.f16567a, this.f16568b));
    }
}
