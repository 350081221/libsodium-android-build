package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e4 extends io.reactivex.rxjava3.core.i0<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17653a;

    /* renamed from: b, reason: collision with root package name */
    final long f17654b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f17655c;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
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
            if (!isDisposed()) {
                this.downstream.onNext(0L);
                lazySet(io.reactivex.rxjava3.internal.disposables.d.INSTANCE);
                this.downstream.onComplete();
            }
        }

        public void setResource(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.trySet(this, eVar);
        }
    }

    public e4(long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f17654b = j5;
        this.f17655c = timeUnit;
        this.f17653a = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super Long> p0Var) {
        a aVar = new a(p0Var);
        p0Var.onSubscribe(aVar);
        aVar.setResource(this.f17653a.g(aVar, this.f17654b, this.f17655c));
    }
}
