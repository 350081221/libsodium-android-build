package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a1<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> f16600c;

    /* renamed from: d, reason: collision with root package name */
    final int f16601d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f16602e;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.c<T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final org.reactivestreams.p<? super T> downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> mapper;
        final int maxConcurrency;
        org.reactivestreams.q upstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final io.reactivex.rxjava3.disposables.c set = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.a1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0461a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
            private static final long serialVersionUID = 8606673141535671828L;

            C0461a() {
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

        a(org.reactivestreams.p<? super T> pVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, boolean z4, int i5) {
            this.downstream = pVar;
            this.mapper = oVar;
            this.delayErrors = z4;
            this.maxConcurrency = i5;
            lazySet(1);
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
            this.errors.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
        }

        void innerComplete(a<T>.C0461a c0461a) {
            this.set.c(c0461a);
            onComplete();
        }

        void innerError(a<T>.C0461a c0461a, Throwable th) {
            this.set.c(c0461a);
            onError(th);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return true;
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
                this.cancelled = true;
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
                C0461a c0461a = new C0461a();
                if (!this.cancelled && this.set.b(c0461a)) {
                    iVar.a(c0461a);
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

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            return null;
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return i5 & 2;
        }
    }

    public a1(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar2, boolean z4, int i5) {
        super(oVar);
        this.f16600c = oVar2;
        this.f16602e = z4;
        this.f16601d = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16600c, this.f16602e, this.f16601d));
    }
}
