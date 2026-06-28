package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class z4<T, B, V> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, io.reactivex.rxjava3.core.o<T>> {

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<B> f17224c;

    /* renamed from: d, reason: collision with root package name */
    final m3.o<? super B, ? extends org.reactivestreams.o<V>> f17225d;

    /* renamed from: e, reason: collision with root package name */
    final int f17226e;

    /* loaded from: classes3.dex */
    static final class a<T, B, V> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = 8646217640096099753L;
        final int bufferSize;
        final m3.o<? super B, ? extends org.reactivestreams.o<V>> closingIndicator;
        final org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> downstream;
        long emitted;
        final org.reactivestreams.o<B> open;
        volatile boolean openDone;
        org.reactivestreams.q upstream;
        volatile boolean upstreamCanceled;
        volatile boolean upstreamDone;
        final io.reactivex.rxjava3.internal.fuseable.p<Object> queue = new io.reactivex.rxjava3.internal.queue.a();
        final io.reactivex.rxjava3.disposables.c resources = new io.reactivex.rxjava3.disposables.c();
        final List<io.reactivex.rxjava3.processors.h<T>> windows = new ArrayList();
        final AtomicLong windowCount = new AtomicLong(1);
        final AtomicBoolean downstreamCancelled = new AtomicBoolean();
        final io.reactivex.rxjava3.internal.util.c error = new io.reactivex.rxjava3.internal.util.c();
        final c<B> startSubscriber = new c<>(this);
        final AtomicLong requested = new AtomicLong();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.z4$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0477a<T, V> extends io.reactivex.rxjava3.core.o<T> implements io.reactivex.rxjava3.core.t<V>, io.reactivex.rxjava3.disposables.e {

            /* renamed from: b, reason: collision with root package name */
            final a<T, ?, V> f17227b;

            /* renamed from: c, reason: collision with root package name */
            final io.reactivex.rxjava3.processors.h<T> f17228c;

            /* renamed from: d, reason: collision with root package name */
            final AtomicReference<org.reactivestreams.q> f17229d = new AtomicReference<>();

            /* renamed from: e, reason: collision with root package name */
            final AtomicBoolean f17230e = new AtomicBoolean();

            C0477a(a<T, ?, V> aVar, io.reactivex.rxjava3.processors.h<T> hVar) {
                this.f17227b = aVar;
                this.f17228c = hVar;
            }

            @Override // io.reactivex.rxjava3.core.o
            protected void O6(org.reactivestreams.p<? super T> pVar) {
                this.f17228c.subscribe(pVar);
                this.f17230e.set(true);
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public void dispose() {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.f17229d);
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public boolean isDisposed() {
                return this.f17229d.get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            }

            boolean n9() {
                return !this.f17230e.get() && this.f17230e.compareAndSet(false, true);
            }

            @Override // org.reactivestreams.p
            public void onComplete() {
                this.f17227b.close(this);
            }

            @Override // org.reactivestreams.p
            public void onError(Throwable th) {
                if (isDisposed()) {
                    io.reactivex.rxjava3.plugins.a.Y(th);
                } else {
                    this.f17227b.closeError(th);
                }
            }

            @Override // org.reactivestreams.p
            public void onNext(V v4) {
                if (io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.f17229d)) {
                    this.f17227b.close(this);
                }
            }

            @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
            public void onSubscribe(org.reactivestreams.q qVar) {
                if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.f17229d, qVar)) {
                    qVar.request(Long.MAX_VALUE);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class b<B> {

            /* renamed from: a, reason: collision with root package name */
            final B f17231a;

            b(B b5) {
                this.f17231a = b5;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class c<B> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<B> {
            private static final long serialVersionUID = -3326496781427702834L;
            final a<?, B, ?> parent;

            c(a<?, B, ?> aVar) {
                this.parent = aVar;
            }

            void cancel() {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
            }

            @Override // org.reactivestreams.p
            public void onComplete() {
                this.parent.openComplete();
            }

            @Override // org.reactivestreams.p
            public void onError(Throwable th) {
                this.parent.openError(th);
            }

            @Override // org.reactivestreams.p
            public void onNext(B b5) {
                this.parent.open(b5);
            }

            @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
            public void onSubscribe(org.reactivestreams.q qVar) {
                if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar)) {
                    qVar.request(Long.MAX_VALUE);
                }
            }
        }

        a(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar, org.reactivestreams.o<B> oVar, m3.o<? super B, ? extends org.reactivestreams.o<V>> oVar2, int i5) {
            this.downstream = pVar;
            this.open = oVar;
            this.closingIndicator = oVar2;
            this.bufferSize = i5;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (this.downstreamCancelled.compareAndSet(false, true)) {
                if (this.windowCount.decrementAndGet() == 0) {
                    this.upstream.cancel();
                    this.startSubscriber.cancel();
                    this.resources.dispose();
                    this.error.tryTerminateAndReport();
                    this.upstreamCanceled = true;
                    drain();
                    return;
                }
                this.startSubscriber.cancel();
            }
        }

        void close(C0477a<T, V> c0477a) {
            this.queue.offer(c0477a);
            drain();
        }

        void closeError(Throwable th) {
            this.upstream.cancel();
            this.startSubscriber.cancel();
            this.resources.dispose();
            if (this.error.tryAddThrowableOrReport(th)) {
                this.upstreamDone = true;
                drain();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.p<Object> pVar2 = this.queue;
            List<io.reactivex.rxjava3.processors.h<T>> list = this.windows;
            int i5 = 1;
            while (true) {
                if (this.upstreamCanceled) {
                    pVar2.clear();
                    list.clear();
                } else {
                    boolean z5 = this.upstreamDone;
                    Object poll = pVar2.poll();
                    if (poll == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5 && (z4 || this.error.get() != null)) {
                        terminateDownstream(pVar);
                        this.upstreamCanceled = true;
                    } else if (!z4) {
                        if (poll instanceof b) {
                            if (!this.downstreamCancelled.get()) {
                                long j5 = this.emitted;
                                if (this.requested.get() != j5) {
                                    this.emitted = j5 + 1;
                                    try {
                                        org.reactivestreams.o<V> apply = this.closingIndicator.apply(((b) poll).f17231a);
                                        Objects.requireNonNull(apply, "The closingIndicator returned a null Publisher");
                                        org.reactivestreams.o<V> oVar = apply;
                                        this.windowCount.getAndIncrement();
                                        io.reactivex.rxjava3.processors.h<T> v9 = io.reactivex.rxjava3.processors.h.v9(this.bufferSize, this);
                                        C0477a c0477a = new C0477a(this, v9);
                                        pVar.onNext(c0477a);
                                        if (c0477a.n9()) {
                                            v9.onComplete();
                                        } else {
                                            list.add(v9);
                                            this.resources.b(c0477a);
                                            oVar.subscribe(c0477a);
                                        }
                                    } catch (Throwable th) {
                                        io.reactivex.rxjava3.exceptions.b.b(th);
                                        this.upstream.cancel();
                                        this.startSubscriber.cancel();
                                        this.resources.dispose();
                                        io.reactivex.rxjava3.exceptions.b.b(th);
                                        this.error.tryAddThrowableOrReport(th);
                                        this.upstreamDone = true;
                                    }
                                } else {
                                    this.upstream.cancel();
                                    this.startSubscriber.cancel();
                                    this.resources.dispose();
                                    this.error.tryAddThrowableOrReport(new io.reactivex.rxjava3.exceptions.c(b5.n9(j5)));
                                    this.upstreamDone = true;
                                }
                            }
                        } else if (poll instanceof C0477a) {
                            io.reactivex.rxjava3.processors.h<T> hVar = ((C0477a) poll).f17228c;
                            list.remove(hVar);
                            this.resources.c((io.reactivex.rxjava3.disposables.e) poll);
                            hVar.onComplete();
                        } else {
                            Iterator<io.reactivex.rxjava3.processors.h<T>> it = list.iterator();
                            while (it.hasNext()) {
                                it.next().onNext(poll);
                            }
                        }
                    } else if (this.openDone && list.size() == 0) {
                        this.upstream.cancel();
                        this.startSubscriber.cancel();
                        this.resources.dispose();
                        terminateDownstream(pVar);
                        this.upstreamCanceled = true;
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.startSubscriber.cancel();
            this.resources.dispose();
            this.upstreamDone = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.startSubscriber.cancel();
            this.resources.dispose();
            if (this.error.tryAddThrowableOrReport(th)) {
                this.upstreamDone = true;
                drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.queue.offer(t5);
            drain();
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                this.open.subscribe(this.startSubscriber);
                qVar.request(Long.MAX_VALUE);
            }
        }

        void open(B b5) {
            this.queue.offer(new b(b5));
            drain();
        }

        void openComplete() {
            this.openDone = true;
            drain();
        }

        void openError(Throwable th) {
            this.upstream.cancel();
            this.resources.dispose();
            if (this.error.tryAddThrowableOrReport(th)) {
                this.upstreamDone = true;
                drain();
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windowCount.decrementAndGet() == 0) {
                this.upstream.cancel();
                this.startSubscriber.cancel();
                this.resources.dispose();
                this.error.tryTerminateAndReport();
                this.upstreamCanceled = true;
                drain();
            }
        }

        void terminateDownstream(org.reactivestreams.p<?> pVar) {
            Throwable terminate = this.error.terminate();
            if (terminate == null) {
                Iterator<io.reactivex.rxjava3.processors.h<T>> it = this.windows.iterator();
                while (it.hasNext()) {
                    it.next().onComplete();
                }
                pVar.onComplete();
                return;
            }
            if (terminate != io.reactivex.rxjava3.internal.util.k.f18688a) {
                Iterator<io.reactivex.rxjava3.processors.h<T>> it2 = this.windows.iterator();
                while (it2.hasNext()) {
                    it2.next().onError(terminate);
                }
                pVar.onError(terminate);
            }
        }
    }

    public z4(io.reactivex.rxjava3.core.o<T> oVar, org.reactivestreams.o<B> oVar2, m3.o<? super B, ? extends org.reactivestreams.o<V>> oVar3, int i5) {
        super(oVar);
        this.f17224c = oVar2;
        this.f17225d = oVar3;
        this.f17226e = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar) {
        this.f16598b.N6(new a(pVar, this.f17224c, this.f17225d, this.f17226e));
    }
}
