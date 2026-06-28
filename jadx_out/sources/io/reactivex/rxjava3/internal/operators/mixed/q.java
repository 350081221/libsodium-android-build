package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class q<T> extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final i0<T> f17497a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> f17498b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f17499c;

    /* renamed from: d, reason: collision with root package name */
    final int f17500d;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.rxjava3.core.f downstream;
        final io.reactivex.rxjava3.internal.util.j errorMode;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final C0493a inner = new C0493a(this);
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> mapper;
        final int prefetch;
        io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        io.reactivex.rxjava3.disposables.e upstream;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0493a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f {
            private static final long serialVersionUID = 5638352172918776687L;
            final a<?> parent;

            C0493a(a<?> aVar) {
                this.parent = aVar;
            }

            void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
            }
        }

        a(io.reactivex.rxjava3.core.f fVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, io.reactivex.rxjava3.internal.util.j jVar, int i5) {
            this.downstream = fVar;
            this.mapper = oVar;
            this.errorMode = jVar;
            this.prefetch = i5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.inner.dispose();
            this.errors.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        void drain() {
            io.reactivex.rxjava3.core.i iVar;
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.util.c cVar = this.errors;
            io.reactivex.rxjava3.internal.util.j jVar = this.errorMode;
            while (!this.disposed) {
                if (!this.active) {
                    if (jVar == io.reactivex.rxjava3.internal.util.j.BOUNDARY && cVar.get() != null) {
                        this.disposed = true;
                        this.queue.clear();
                        cVar.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    boolean z5 = this.done;
                    try {
                        T poll = this.queue.poll();
                        if (poll != null) {
                            io.reactivex.rxjava3.core.i apply = this.mapper.apply(poll);
                            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                            iVar = apply;
                            z4 = false;
                        } else {
                            iVar = null;
                            z4 = true;
                        }
                        if (z5 && z4) {
                            this.disposed = true;
                            cVar.tryTerminateConsumer(this.downstream);
                            return;
                        } else if (!z4) {
                            this.active = true;
                            iVar.a(this.inner);
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.disposed = true;
                        this.queue.clear();
                        this.upstream.dispose();
                        cVar.tryAddThrowableOrReport(th);
                        cVar.tryTerminateConsumer(this.downstream);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.queue.clear();
        }

        void innerComplete() {
            this.active = false;
            drain();
        }

        void innerError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.errorMode == io.reactivex.rxjava3.internal.util.j.IMMEDIATE) {
                    this.disposed = true;
                    this.upstream.dispose();
                    this.errors.tryTerminateConsumer(this.downstream);
                    if (getAndIncrement() == 0) {
                        this.queue.clear();
                        return;
                    }
                    return;
                }
                this.active = false;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.errorMode == io.reactivex.rxjava3.internal.util.j.IMMEDIATE) {
                    this.disposed = true;
                    this.inner.dispose();
                    this.errors.tryTerminateConsumer(this.downstream);
                    if (getAndIncrement() == 0) {
                        this.queue.clear();
                        return;
                    }
                    return;
                }
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (t5 != null) {
                this.queue.offer(t5);
            }
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                if (eVar instanceof io.reactivex.rxjava3.internal.fuseable.l) {
                    io.reactivex.rxjava3.internal.fuseable.l lVar = (io.reactivex.rxjava3.internal.fuseable.l) eVar;
                    int requestFusion = lVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.queue = lVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.queue = lVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.c(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }
    }

    public q(i0<T> i0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, io.reactivex.rxjava3.internal.util.j jVar, int i5) {
        this.f17497a = i0Var;
        this.f17498b = oVar;
        this.f17499c = jVar;
        this.f17500d = i5;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        if (!w.a(this.f17497a, this.f17498b, fVar)) {
            this.f17497a.subscribe(new a(fVar, this.f17498b, this.f17499c, this.f17500d));
        }
    }
}
