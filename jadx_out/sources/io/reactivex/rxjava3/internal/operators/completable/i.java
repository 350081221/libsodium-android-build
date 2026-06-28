package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class i extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16506a;

    /* renamed from: b, reason: collision with root package name */
    final long f16507b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f16508c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16509d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f16510e;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, Runnable, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final io.reactivex.rxjava3.core.f downstream;
        Throwable error;
        final io.reactivex.rxjava3.core.q0 scheduler;
        final TimeUnit unit;

        a(io.reactivex.rxjava3.core.f fVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
            this.downstream = fVar;
            this.delay = j5;
            this.unit = timeUnit;
            this.scheduler = q0Var;
            this.delayError = z4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, this.scheduler.g(this, this.delay, this.unit));
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            long j5;
            this.error = th;
            io.reactivex.rxjava3.core.q0 q0Var = this.scheduler;
            if (this.delayError) {
                j5 = this.delay;
            } else {
                j5 = 0;
            }
            io.reactivex.rxjava3.internal.disposables.c.replace(this, q0Var.g(this, j5, this.unit));
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            this.error = null;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public i(io.reactivex.rxjava3.core.i iVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        this.f16506a = iVar;
        this.f16507b = j5;
        this.f16508c = timeUnit;
        this.f16509d = q0Var;
        this.f16510e = z4;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16506a.a(new a(fVar, this.f16507b, this.f16508c, this.f16509d, this.f16510e));
    }
}
