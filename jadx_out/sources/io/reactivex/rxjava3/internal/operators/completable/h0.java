package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class h0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16504a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16505b;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.rxjava3.core.f downstream;
        Throwable error;
        final io.reactivex.rxjava3.core.q0 scheduler;

        a(io.reactivex.rxjava3.core.f fVar, io.reactivex.rxjava3.core.q0 q0Var) {
            this.downstream = fVar;
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

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, this.scheduler.e(this));
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.error = th;
            io.reactivex.rxjava3.internal.disposables.c.replace(this, this.scheduler.e(this));
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
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public h0(io.reactivex.rxjava3.core.i iVar, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f16504a = iVar;
        this.f16505b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16504a.a(new a(fVar, this.f16505b));
    }
}
