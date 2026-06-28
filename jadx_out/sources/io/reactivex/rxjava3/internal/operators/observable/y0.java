package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class y0<T> extends io.reactivex.rxjava3.core.c implements io.reactivex.rxjava3.internal.fuseable.f<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f18182a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> f18183b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f18184c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e, io.reactivex.rxjava3.core.p0<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final io.reactivex.rxjava3.core.f downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> mapper;
        io.reactivex.rxjava3.disposables.e upstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final io.reactivex.rxjava3.disposables.c set = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.y0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0515a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
            private static final long serialVersionUID = 8606673141535671828L;

            C0515a() {
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

        a(io.reactivex.rxjava3.core.f fVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, boolean z4) {
            this.downstream = fVar;
            this.mapper = oVar;
            this.delayErrors = z4;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
            this.errors.tryTerminateAndReport();
        }

        void innerComplete(a<T>.C0515a c0515a) {
            this.set.c(c0515a);
            onComplete();
        }

        void innerError(a<T>.C0515a c0515a, Throwable th) {
            this.set.c(c0515a);
            onError(th);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.errors.tryTerminateConsumer(this.downstream);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.delayErrors) {
                    if (decrementAndGet() == 0) {
                        this.errors.tryTerminateConsumer(this.downstream);
                    }
                } else {
                    this.disposed = true;
                    this.upstream.dispose();
                    this.set.dispose();
                    this.errors.tryTerminateConsumer(this.downstream);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            try {
                io.reactivex.rxjava3.core.i apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                io.reactivex.rxjava3.core.i iVar = apply;
                getAndIncrement();
                C0515a c0515a = new C0515a();
                if (!this.disposed && this.set.b(c0515a)) {
                    iVar.a(c0515a);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public y0(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, boolean z4) {
        this.f18182a = n0Var;
        this.f18183b = oVar;
        this.f18184c = z4;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f18182a.subscribe(new a(fVar, this.f18183b, this.f18184c));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public io.reactivex.rxjava3.core.i0<T> b() {
        return io.reactivex.rxjava3.plugins.a.R(new x0(this.f18182a, this.f18183b, this.f18184c));
    }
}
