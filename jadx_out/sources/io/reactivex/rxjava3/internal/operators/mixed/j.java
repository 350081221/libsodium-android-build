package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.d0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class j<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f17479b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends d0<? extends R>> f17480c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f17481d;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        static final C0491a<Object> INNER_DISPOSED = new C0491a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final org.reactivestreams.p<? super R> downstream;
        long emitted;
        final m3.o<? super T, ? extends d0<? extends R>> mapper;
        org.reactivestreams.q upstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<C0491a<R>> inner = new AtomicReference<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0491a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements a0<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final a<?, R> parent;

            C0491a(a<?, R> aVar) {
                this.parent = aVar;
            }

            void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
            public void onComplete() {
                this.parent.innerComplete(this);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
            public void onSuccess(R r5) {
                this.item = r5;
                this.parent.drain();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends d0<? extends R>> oVar, boolean z4) {
            this.downstream = pVar;
            this.mapper = oVar;
            this.delayErrors = z4;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
            this.errors.tryTerminateAndReport();
        }

        void disposeInner() {
            AtomicReference<C0491a<R>> atomicReference = this.inner;
            C0491a<Object> c0491a = INNER_DISPOSED;
            C0491a<Object> c0491a2 = (C0491a) atomicReference.getAndSet(c0491a);
            if (c0491a2 != null && c0491a2 != c0491a) {
                c0491a2.dispose();
            }
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super R> pVar = this.downstream;
            io.reactivex.rxjava3.internal.util.c cVar = this.errors;
            AtomicReference<C0491a<R>> atomicReference = this.inner;
            AtomicLong atomicLong = this.requested;
            long j5 = this.emitted;
            int i5 = 1;
            while (!this.cancelled) {
                if (cVar.get() != null && !this.delayErrors) {
                    cVar.tryTerminateConsumer(pVar);
                    return;
                }
                boolean z5 = this.done;
                C0491a<R> c0491a = atomicReference.get();
                if (c0491a == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z5 && z4) {
                    cVar.tryTerminateConsumer(pVar);
                    return;
                }
                if (!z4 && c0491a.item != null && j5 != atomicLong.get()) {
                    androidx.compose.animation.core.h.a(atomicReference, c0491a, null);
                    pVar.onNext(c0491a.item);
                    j5++;
                } else {
                    this.emitted = j5;
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                }
            }
        }

        void innerComplete(C0491a<R> c0491a) {
            if (androidx.compose.animation.core.h.a(this.inner, c0491a, null)) {
                drain();
            }
        }

        void innerError(C0491a<R> c0491a, Throwable th) {
            if (androidx.compose.animation.core.h.a(this.inner, c0491a, null)) {
                if (this.errors.tryAddThrowableOrReport(th)) {
                    if (!this.delayErrors) {
                        this.upstream.cancel();
                        disposeInner();
                    }
                    drain();
                    return;
                }
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            C0491a<R> c0491a;
            C0491a<R> c0491a2 = this.inner.get();
            if (c0491a2 != null) {
                c0491a2.dispose();
            }
            try {
                d0<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                d0<? extends R> d0Var = apply;
                C0491a c0491a3 = new C0491a(this);
                do {
                    c0491a = this.inner.get();
                    if (c0491a == INNER_DISPOSED) {
                        return;
                    }
                } while (!androidx.compose.animation.core.h.a(this.inner, c0491a, c0491a3));
                d0Var.a(c0491a3);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.upstream.cancel();
                this.inner.getAndSet(INNER_DISPOSED);
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
            drain();
        }
    }

    public j(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends d0<? extends R>> oVar2, boolean z4) {
        this.f17479b = oVar;
        this.f17480c = oVar2;
        this.f17481d = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f17479b.N6(new a(pVar, this.f17480c, this.f17481d));
    }
}
