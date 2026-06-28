package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<? extends io.reactivex.rxjava3.core.i> f16479a;

    /* renamed from: b, reason: collision with root package name */
    final int f16480b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f16481c;

    /* loaded from: classes3.dex */
    static final class a extends AtomicInteger implements io.reactivex.rxjava3.core.t<io.reactivex.rxjava3.core.i>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -2108443387387077490L;
        final boolean delayErrors;
        final io.reactivex.rxjava3.core.f downstream;
        final int maxConcurrency;
        org.reactivestreams.q upstream;
        final io.reactivex.rxjava3.disposables.c set = new io.reactivex.rxjava3.disposables.c();
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.completable.b0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0457a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
            private static final long serialVersionUID = 251330541679988317L;

            C0457a() {
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
                a.this.innerComplete(this);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                a.this.innerError(this, th);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }
        }

        a(io.reactivex.rxjava3.core.f fVar, int i5, boolean z4) {
            this.downstream = fVar;
            this.maxConcurrency = i5;
            this.delayErrors = z4;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.upstream.cancel();
            this.set.dispose();
            this.errors.tryTerminateAndReport();
        }

        void innerComplete(C0457a c0457a) {
            this.set.c(c0457a);
            if (decrementAndGet() == 0) {
                this.errors.tryTerminateConsumer(this.downstream);
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        }

        void innerError(C0457a c0457a, Throwable th) {
            this.set.c(c0457a);
            if (!this.delayErrors) {
                this.upstream.cancel();
                this.set.dispose();
                if (this.errors.tryAddThrowableOrReport(th) && getAndSet(0) > 0) {
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                }
                return;
            }
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (decrementAndGet() == 0) {
                    this.errors.tryTerminateConsumer(this.downstream);
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    this.upstream.request(1L);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.set.isDisposed();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.errors.tryTerminateConsumer(this.downstream);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (!this.delayErrors) {
                this.set.dispose();
                if (this.errors.tryAddThrowableOrReport(th) && getAndSet(0) > 0) {
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                }
                return;
            }
            if (this.errors.tryAddThrowableOrReport(th) && decrementAndGet() == 0) {
                this.errors.tryTerminateConsumer(this.downstream);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                int i5 = this.maxConcurrency;
                if (i5 == Integer.MAX_VALUE) {
                    qVar.request(Long.MAX_VALUE);
                } else {
                    qVar.request(i5);
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(io.reactivex.rxjava3.core.i iVar) {
            getAndIncrement();
            C0457a c0457a = new C0457a();
            this.set.b(c0457a);
            iVar.a(c0457a);
        }
    }

    public b0(org.reactivestreams.o<? extends io.reactivex.rxjava3.core.i> oVar, int i5, boolean z4) {
        this.f16479a = oVar;
        this.f16480b = i5;
        this.f16481c = z4;
    }

    @Override // io.reactivex.rxjava3.core.c
    public void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16479a.subscribe(new a(fVar, this.f16480b, this.f16481c));
    }
}
