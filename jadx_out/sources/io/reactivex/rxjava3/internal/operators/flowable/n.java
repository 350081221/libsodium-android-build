package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class n<T, U extends Collection<? super T>, Open, Close> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    final m3.s<U> f16887c;

    /* renamed from: d, reason: collision with root package name */
    final org.reactivestreams.o<? extends Open> f16888d;

    /* renamed from: e, reason: collision with root package name */
    final m3.o<? super Open, ? extends org.reactivestreams.o<? extends Close>> f16889e;

    /* loaded from: classes3.dex */
    static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -8466418554264089604L;
        final m3.o<? super Open, ? extends org.reactivestreams.o<? extends Close>> bufferClose;
        final org.reactivestreams.o<? extends Open> bufferOpen;
        final m3.s<C> bufferSupplier;
        volatile boolean cancelled;
        volatile boolean done;
        final org.reactivestreams.p<? super C> downstream;
        long emitted;
        long index;
        final io.reactivex.rxjava3.internal.queue.c<C> queue = new io.reactivex.rxjava3.internal.queue.c<>(io.reactivex.rxjava3.core.o.c0());
        final io.reactivex.rxjava3.disposables.c subscribers = new io.reactivex.rxjava3.disposables.c();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();
        Map<Long, C> buffers = new LinkedHashMap();
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0475a<Open> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<Open>, io.reactivex.rxjava3.disposables.e {
            private static final long serialVersionUID = -8498650778633225126L;
            final a<?, ?, Open, ?> parent;

            C0475a(a<?, ?, Open, ?> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public void dispose() {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
            }

            @Override // io.reactivex.rxjava3.disposables.e
            public boolean isDisposed() {
                return get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            }

            @Override // org.reactivestreams.p
            public void onComplete() {
                lazySet(io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED);
                this.parent.openComplete(this);
            }

            @Override // org.reactivestreams.p
            public void onError(Throwable th) {
                lazySet(io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED);
                this.parent.boundaryError(this, th);
            }

            @Override // org.reactivestreams.p
            public void onNext(Open open) {
                this.parent.open(open);
            }

            @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
            public void onSubscribe(org.reactivestreams.q qVar) {
                io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
            }
        }

        a(org.reactivestreams.p<? super C> pVar, org.reactivestreams.o<? extends Open> oVar, m3.o<? super Open, ? extends org.reactivestreams.o<? extends Close>> oVar2, m3.s<C> sVar) {
            this.downstream = pVar;
            this.bufferSupplier = sVar;
            this.bufferOpen = oVar;
            this.bufferClose = oVar2;
        }

        void boundaryError(io.reactivex.rxjava3.disposables.e eVar, Throwable th) {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
            this.subscribers.c(eVar);
            onError(th);
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream)) {
                this.cancelled = true;
                this.subscribers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                if (getAndIncrement() != 0) {
                    this.queue.clear();
                }
            }
        }

        void close(b<T, C> bVar, long j5) {
            boolean z4;
            this.subscribers.c(bVar);
            if (this.subscribers.o() == 0) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
                z4 = true;
            } else {
                z4 = false;
            }
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                this.queue.offer(map.remove(Long.valueOf(j5)));
                if (z4) {
                    this.done = true;
                }
                drain();
            }
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            long j5 = this.emitted;
            org.reactivestreams.p<? super C> pVar = this.downstream;
            io.reactivex.rxjava3.internal.queue.c<C> cVar = this.queue;
            int i5 = 1;
            do {
                long j6 = this.requested.get();
                while (j5 != j6) {
                    if (this.cancelled) {
                        cVar.clear();
                        return;
                    }
                    boolean z5 = this.done;
                    if (z5 && this.errors.get() != null) {
                        cVar.clear();
                        this.errors.tryTerminateConsumer(pVar);
                        return;
                    }
                    C poll = cVar.poll();
                    if (poll == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5 && z4) {
                        pVar.onComplete();
                        return;
                    } else {
                        if (z4) {
                            break;
                        }
                        pVar.onNext(poll);
                        j5++;
                    }
                }
                if (j5 == j6) {
                    if (this.cancelled) {
                        cVar.clear();
                        return;
                    }
                    if (this.done) {
                        if (this.errors.get() != null) {
                            cVar.clear();
                            this.errors.tryTerminateConsumer(pVar);
                            return;
                        } else if (cVar.isEmpty()) {
                            pVar.onComplete();
                            return;
                        }
                    }
                }
                this.emitted = j5;
                i5 = addAndGet(-i5);
            } while (i5 != 0);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.subscribers.dispose();
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    this.queue.offer(it.next());
                }
                this.buffers = null;
                this.done = true;
                drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.subscribers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                this.done = true;
                drain();
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().add(t5);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.upstream, qVar)) {
                C0475a c0475a = new C0475a(this);
                this.subscribers.b(c0475a);
                this.bufferOpen.subscribe(c0475a);
                qVar.request(Long.MAX_VALUE);
            }
        }

        void open(Open open) {
            try {
                C c5 = this.bufferSupplier.get();
                Objects.requireNonNull(c5, "The bufferSupplier returned a null Collection");
                C c6 = c5;
                org.reactivestreams.o<? extends Close> apply = this.bufferClose.apply(open);
                Objects.requireNonNull(apply, "The bufferClose returned a null Publisher");
                org.reactivestreams.o<? extends Close> oVar = apply;
                long j5 = this.index;
                this.index = 1 + j5;
                synchronized (this) {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    map.put(Long.valueOf(j5), c6);
                    b bVar = new b(this, j5);
                    this.subscribers.b(bVar);
                    oVar.subscribe(bVar);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
                onError(th);
            }
        }

        void openComplete(C0475a<Open> c0475a) {
            this.subscribers.c(c0475a);
            if (this.subscribers.o() == 0) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
                this.done = true;
                drain();
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
            drain();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T, C extends Collection<? super T>> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<Object>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -8498650778633225126L;
        final long index;
        final a<T, C, ?, ?> parent;

        b(a<T, C, ?, ?> aVar, long j5) {
            this.parent = aVar;
            this.index = j5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            org.reactivestreams.q qVar = get();
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (qVar != jVar) {
                lazySet(jVar);
                this.parent.close(this, this.index);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            org.reactivestreams.q qVar = get();
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (qVar != jVar) {
                lazySet(jVar);
                this.parent.boundaryError(this, th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
            org.reactivestreams.q qVar = get();
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (qVar != jVar) {
                lazySet(jVar);
                qVar.cancel();
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
        }
    }

    public n(io.reactivex.rxjava3.core.o<T> oVar, org.reactivestreams.o<? extends Open> oVar2, m3.o<? super Open, ? extends org.reactivestreams.o<? extends Close>> oVar3, m3.s<U> sVar) {
        super(oVar);
        this.f16888d = oVar2;
        this.f16889e = oVar3;
        this.f16887c = sVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super U> pVar) {
        a aVar = new a(pVar, this.f16888d, this.f16889e, this.f16887c);
        pVar.onSubscribe(aVar);
        this.f16598b.N6(aVar);
    }
}
