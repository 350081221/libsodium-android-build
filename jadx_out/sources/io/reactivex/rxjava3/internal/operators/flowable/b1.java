package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b1<T> extends io.reactivex.rxjava3.core.c implements io.reactivex.rxjava3.internal.fuseable.d<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f16614a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> f16615b;

    /* renamed from: c, reason: collision with root package name */
    final int f16616c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f16617d;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final io.reactivex.rxjava3.core.f downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> mapper;
        final int maxConcurrency;
        org.reactivestreams.q upstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final io.reactivex.rxjava3.disposables.c set = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.b1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0463a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
            private static final long serialVersionUID = 8606673141535671828L;

            C0463a() {
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

        a(io.reactivex.rxjava3.core.f fVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, boolean z4, int i5) {
            this.downstream = fVar;
            this.mapper = oVar;
            this.delayErrors = z4;
            this.maxConcurrency = i5;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.disposed = true;
            this.upstream.cancel();
            this.set.dispose();
            this.errors.tryTerminateAndReport();
        }

        void innerComplete(a<T>.C0463a c0463a) {
            this.set.c(c0463a);
            onComplete();
        }

        void innerError(a<T>.C0463a c0463a, Throwable th) {
            this.set.c(c0463a);
            onError(th);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.set.isDisposed();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.errors.tryTerminateConsumer(this.downstream);
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.delayErrors) {
                    if (decrementAndGet() == 0) {
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    } else {
                        if (this.maxConcurrency != Integer.MAX_VALUE) {
                            this.upstream.request(1L);
                            return;
                        }
                        return;
                    }
                }
                this.disposed = true;
                this.upstream.cancel();
                this.set.dispose();
                this.errors.tryTerminateConsumer(this.downstream);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            try {
                io.reactivex.rxjava3.core.i apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                io.reactivex.rxjava3.core.i iVar = apply;
                getAndIncrement();
                C0463a c0463a = new C0463a();
                if (!this.disposed && this.set.b(c0463a)) {
                    iVar.a(c0463a);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.upstream.cancel();
                onError(th);
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
    }

    public b1(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar2, boolean z4, int i5) {
        this.f16614a = oVar;
        this.f16615b = oVar2;
        this.f16617d = z4;
        this.f16616c = i5;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16614a.N6(new a(fVar, this.f16615b, this.f16617d, this.f16616c));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<T> d() {
        return io.reactivex.rxjava3.plugins.a.P(new a1(this.f16614a, this.f16615b, this.f16617d, this.f16616c));
    }
}
