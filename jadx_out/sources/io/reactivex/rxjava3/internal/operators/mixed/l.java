package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.u0;
import io.reactivex.rxjava3.core.x0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class l<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f17485b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends x0<? extends R>> f17486c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f17487d;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        static final C0492a<Object> INNER_DISPOSED = new C0492a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final org.reactivestreams.p<? super R> downstream;
        long emitted;
        final m3.o<? super T, ? extends x0<? extends R>> mapper;
        org.reactivestreams.q upstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<C0492a<R>> inner = new AtomicReference<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0492a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements u0<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final a<?, R> parent;

            C0492a(a<?, R> aVar) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends x0<? extends R>> oVar, boolean z4) {
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
            AtomicReference<C0492a<R>> atomicReference = this.inner;
            C0492a<Object> c0492a = INNER_DISPOSED;
            C0492a<Object> c0492a2 = (C0492a) atomicReference.getAndSet(c0492a);
            if (c0492a2 != null && c0492a2 != c0492a) {
                c0492a2.dispose();
            }
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super R> pVar = this.downstream;
            io.reactivex.rxjava3.internal.util.c cVar = this.errors;
            AtomicReference<C0492a<R>> atomicReference = this.inner;
            AtomicLong atomicLong = this.requested;
            long j5 = this.emitted;
            int i5 = 1;
            while (!this.cancelled) {
                if (cVar.get() != null && !this.delayErrors) {
                    cVar.tryTerminateConsumer(pVar);
                    return;
                }
                boolean z5 = this.done;
                C0492a<R> c0492a = atomicReference.get();
                if (c0492a == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z5 && z4) {
                    cVar.tryTerminateConsumer(pVar);
                    return;
                }
                if (!z4 && c0492a.item != null && j5 != atomicLong.get()) {
                    androidx.compose.animation.core.h.a(atomicReference, c0492a, null);
                    pVar.onNext(c0492a.item);
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

        void innerError(C0492a<R> c0492a, Throwable th) {
            if (androidx.compose.animation.core.h.a(this.inner, c0492a, null)) {
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
            C0492a<R> c0492a;
            C0492a<R> c0492a2 = this.inner.get();
            if (c0492a2 != null) {
                c0492a2.dispose();
            }
            try {
                x0<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                x0<? extends R> x0Var = apply;
                C0492a c0492a3 = new C0492a(this);
                do {
                    c0492a = this.inner.get();
                    if (c0492a == INNER_DISPOSED) {
                        return;
                    }
                } while (!androidx.compose.animation.core.h.a(this.inner, c0492a, c0492a3));
                x0Var.a(c0492a3);
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

    public l(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends x0<? extends R>> oVar2, boolean z4) {
        this.f17485b = oVar;
        this.f17486c = oVar2;
        this.f17487d = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f17485b.N6(new a(pVar, this.f17486c, this.f17487d));
    }
}
