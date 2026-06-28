package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.core.u0;
import io.reactivex.rxjava3.core.x0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class v<T, R> extends i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final i0<T> f17523a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends x0<? extends R>> f17524b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f17525c;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements p0<T>, io.reactivex.rxjava3.disposables.e {
        static final C0498a<Object> INNER_DISPOSED = new C0498a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final p0<? super R> downstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final AtomicReference<C0498a<R>> inner = new AtomicReference<>();
        final m3.o<? super T, ? extends x0<? extends R>> mapper;
        io.reactivex.rxjava3.disposables.e upstream;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0498a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements u0<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final a<?, R> parent;

            C0498a(a<?, R> aVar) {
                this.parent = aVar;
            }

            void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }

            @Override // io.reactivex.rxjava3.core.u0
            public void onSuccess(R r5) {
                this.item = r5;
                this.parent.drain();
            }
        }

        a(p0<? super R> p0Var, m3.o<? super T, ? extends x0<? extends R>> oVar, boolean z4) {
            this.downstream = p0Var;
            this.mapper = oVar;
            this.delayErrors = z4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            disposeInner();
            this.errors.tryTerminateAndReport();
        }

        void disposeInner() {
            AtomicReference<C0498a<R>> atomicReference = this.inner;
            C0498a<Object> c0498a = INNER_DISPOSED;
            C0498a<Object> c0498a2 = (C0498a) atomicReference.getAndSet(c0498a);
            if (c0498a2 != null && c0498a2 != c0498a) {
                c0498a2.dispose();
            }
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            p0<? super R> p0Var = this.downstream;
            io.reactivex.rxjava3.internal.util.c cVar = this.errors;
            AtomicReference<C0498a<R>> atomicReference = this.inner;
            int i5 = 1;
            while (!this.cancelled) {
                if (cVar.get() != null && !this.delayErrors) {
                    cVar.tryTerminateConsumer(p0Var);
                    return;
                }
                boolean z5 = this.done;
                C0498a<R> c0498a = atomicReference.get();
                if (c0498a == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z5 && z4) {
                    cVar.tryTerminateConsumer(p0Var);
                    return;
                } else if (!z4 && c0498a.item != null) {
                    androidx.compose.animation.core.h.a(atomicReference, c0498a, null);
                    p0Var.onNext(c0498a.item);
                } else {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                }
            }
        }

        void innerError(C0498a<R> c0498a, Throwable th) {
            if (androidx.compose.animation.core.h.a(this.inner, c0498a, null)) {
                if (this.errors.tryAddThrowableOrReport(th)) {
                    if (!this.delayErrors) {
                        this.upstream.dispose();
                        disposeInner();
                    }
                    drain();
                    return;
                }
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            C0498a<R> c0498a;
            C0498a<R> c0498a2 = this.inner.get();
            if (c0498a2 != null) {
                c0498a2.dispose();
            }
            try {
                x0<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                x0<? extends R> x0Var = apply;
                C0498a c0498a3 = new C0498a(this);
                do {
                    c0498a = this.inner.get();
                    if (c0498a == INNER_DISPOSED) {
                        return;
                    }
                } while (!androidx.compose.animation.core.h.a(this.inner, c0498a, c0498a3));
                x0Var.a(c0498a3);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.upstream.dispose();
                this.inner.getAndSet(INNER_DISPOSED);
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

    public v(i0<T> i0Var, m3.o<? super T, ? extends x0<? extends R>> oVar, boolean z4) {
        this.f17523a = i0Var;
        this.f17524b = oVar;
        this.f17525c = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super R> p0Var) {
        if (!w.c(this.f17523a, this.f17524b, p0Var)) {
            this.f17523a.subscribe(new a(p0Var, this.f17524b, this.f17525c));
        }
    }
}
