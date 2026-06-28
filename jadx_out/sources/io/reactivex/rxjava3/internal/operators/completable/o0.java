package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class o0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16553a;

    /* renamed from: b, reason: collision with root package name */
    final long f16554b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f16555c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16556d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16557e;

    /* loaded from: classes3.dex */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f16558a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.disposables.c f16559b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f16560c;

        /* renamed from: io.reactivex.rxjava3.internal.operators.completable.o0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0460a implements io.reactivex.rxjava3.core.f {
            C0460a() {
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onComplete() {
                a.this.f16559b.dispose();
                a.this.f16560c.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                a.this.f16559b.dispose();
                a.this.f16560c.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                a.this.f16559b.b(eVar);
            }
        }

        a(AtomicBoolean atomicBoolean, io.reactivex.rxjava3.disposables.c cVar, io.reactivex.rxjava3.core.f fVar) {
            this.f16558a = atomicBoolean;
            this.f16559b = cVar;
            this.f16560c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f16558a.compareAndSet(false, true)) {
                this.f16559b.e();
                io.reactivex.rxjava3.core.i iVar = o0.this.f16557e;
                if (iVar == null) {
                    io.reactivex.rxjava3.core.f fVar = this.f16560c;
                    o0 o0Var = o0.this;
                    fVar.onError(new TimeoutException(io.reactivex.rxjava3.internal.util.k.h(o0Var.f16554b, o0Var.f16555c)));
                    return;
                }
                iVar.a(new C0460a());
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b implements io.reactivex.rxjava3.core.f {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.rxjava3.disposables.c f16563a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f16564b;

        /* renamed from: c, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.f f16565c;

        b(io.reactivex.rxjava3.disposables.c cVar, AtomicBoolean atomicBoolean, io.reactivex.rxjava3.core.f fVar) {
            this.f16563a = cVar;
            this.f16564b = atomicBoolean;
            this.f16565c = fVar;
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            if (this.f16564b.compareAndSet(false, true)) {
                this.f16563a.dispose();
                this.f16565c.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            if (this.f16564b.compareAndSet(false, true)) {
                this.f16563a.dispose();
                this.f16565c.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f16563a.b(eVar);
        }
    }

    public o0(io.reactivex.rxjava3.core.i iVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, io.reactivex.rxjava3.core.i iVar2) {
        this.f16553a = iVar;
        this.f16554b = j5;
        this.f16555c = timeUnit;
        this.f16556d = q0Var;
        this.f16557e = iVar2;
    }

    @Override // io.reactivex.rxjava3.core.c
    public void Y0(io.reactivex.rxjava3.core.f fVar) {
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        fVar.onSubscribe(cVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        cVar.b(this.f16556d.g(new a(atomicBoolean, cVar, fVar), this.f16554b, this.f16555c));
        this.f16553a.a(new b(cVar, atomicBoolean, fVar));
    }
}
