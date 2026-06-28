package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class t1 extends io.reactivex.rxjava3.core.i0<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18104a;

    /* renamed from: b, reason: collision with root package name */
    final long f18105b;

    /* renamed from: c, reason: collision with root package name */
    final long f18106c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f18107d;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long count;
        final io.reactivex.rxjava3.core.p0<? super Long> downstream;

        a(io.reactivex.rxjava3.core.p0<? super Long> p0Var) {
            this.downstream = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
                io.reactivex.rxjava3.core.p0<? super Long> p0Var = this.downstream;
                long j5 = this.count;
                this.count = 1 + j5;
                p0Var.onNext(Long.valueOf(j5));
            }
        }

        public void setResource(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }
    }

    public t1(long j5, long j6, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f18105b = j5;
        this.f18106c = j6;
        this.f18107d = timeUnit;
        this.f18104a = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super Long> p0Var) {
        a aVar = new a(p0Var);
        p0Var.onSubscribe(aVar);
        io.reactivex.rxjava3.core.q0 q0Var = this.f18104a;
        if (q0Var instanceof io.reactivex.rxjava3.internal.schedulers.s) {
            q0.c c5 = q0Var.c();
            aVar.setResource(c5);
            c5.d(aVar, this.f18105b, this.f18106c, this.f18107d);
            return;
        }
        aVar.setResource(q0Var.o(aVar, this.f18105b, this.f18106c, this.f18107d));
    }
}
