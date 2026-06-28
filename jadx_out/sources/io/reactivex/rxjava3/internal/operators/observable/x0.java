package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class x0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> f18169b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f18170c;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.observers.b<T> implements io.reactivex.rxjava3.core.p0<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> mapper;
        io.reactivex.rxjava3.disposables.e upstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final io.reactivex.rxjava3.disposables.c set = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.x0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0514a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
            private static final long serialVersionUID = 8606673141535671828L;

            C0514a() {
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

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, boolean z4) {
            this.downstream = p0Var;
            this.mapper = oVar;
            this.delayErrors = z4;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
            this.errors.tryTerminateAndReport();
        }

        void innerComplete(a<T>.C0514a c0514a) {
            this.set.c(c0514a);
            onComplete();
        }

        void innerError(a<T>.C0514a c0514a, Throwable th) {
            this.set.c(c0514a);
            onError(th);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return true;
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
                C0514a c0514a = new C0514a();
                if (!this.disposed && this.set.b(c0514a)) {
                    iVar.a(c0514a);
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

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return i5 & 2;
        }
    }

    public x0(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, boolean z4) {
        super(n0Var);
        this.f18169b = oVar;
        this.f18170c = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f18169b, this.f18170c));
    }
}
