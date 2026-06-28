package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class u1 extends io.reactivex.rxjava3.core.i0<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18114a;

    /* renamed from: b, reason: collision with root package name */
    final long f18115b;

    /* renamed from: c, reason: collision with root package name */
    final long f18116c;

    /* renamed from: d, reason: collision with root package name */
    final long f18117d;

    /* renamed from: e, reason: collision with root package name */
    final long f18118e;

    /* renamed from: f, reason: collision with root package name */
    final TimeUnit f18119f;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        long count;
        final io.reactivex.rxjava3.core.p0<? super Long> downstream;
        final long end;

        a(io.reactivex.rxjava3.core.p0<? super Long> p0Var, long j5, long j6) {
            this.downstream = p0Var;
            this.count = j5;
            this.end = j6;
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
            if (!isDisposed()) {
                long j5 = this.count;
                this.downstream.onNext(Long.valueOf(j5));
                if (j5 == this.end) {
                    if (!isDisposed()) {
                        this.downstream.onComplete();
                    }
                    io.reactivex.rxjava3.internal.disposables.c.dispose(this);
                    return;
                }
                this.count = j5 + 1;
            }
        }

        public void setResource(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }
    }

    public u1(long j5, long j6, long j7, long j8, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f18117d = j7;
        this.f18118e = j8;
        this.f18119f = timeUnit;
        this.f18114a = q0Var;
        this.f18115b = j5;
        this.f18116c = j6;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super Long> p0Var) {
        a aVar = new a(p0Var, this.f18115b, this.f18116c);
        p0Var.onSubscribe(aVar);
        io.reactivex.rxjava3.core.q0 q0Var = this.f18114a;
        if (q0Var instanceof io.reactivex.rxjava3.internal.schedulers.s) {
            q0.c c5 = q0Var.c();
            aVar.setResource(c5);
            c5.d(aVar, this.f18117d, this.f18118e, this.f18119f);
            return;
        }
        aVar.setResource(q0Var.o(aVar, this.f18117d, this.f18118e, this.f18119f));
    }
}
