package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<? extends io.reactivex.rxjava3.core.i> f16489a;

    /* renamed from: b, reason: collision with root package name */
    final int f16490b;

    /* loaded from: classes3.dex */
    static final class a extends AtomicInteger implements io.reactivex.rxjava3.core.t<io.reactivex.rxjava3.core.i>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 9032184911934499404L;
        volatile boolean active;
        int consumed;
        volatile boolean done;
        final io.reactivex.rxjava3.core.f downstream;
        final int limit;
        final int prefetch;
        io.reactivex.rxjava3.internal.fuseable.q<io.reactivex.rxjava3.core.i> queue;
        int sourceFused;
        org.reactivestreams.q upstream;
        final C0458a inner = new C0458a(this);
        final AtomicBoolean once = new AtomicBoolean();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.completable.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0458a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f {
            private static final long serialVersionUID = -5454794857847146511L;
            final a parent;

            C0458a(a aVar) {
                this.parent = aVar;
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

        a(io.reactivex.rxjava3.core.f fVar, int i5) {
            this.downstream = fVar;
            this.prefetch = i5;
            this.limit = i5 - (i5 >> 2);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.upstream.cancel();
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.inner);
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            while (!isDisposed()) {
                if (!this.active) {
                    boolean z5 = this.done;
                    try {
                        io.reactivex.rxjava3.core.i poll = this.queue.poll();
                        if (poll == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z5 && z4) {
                            this.downstream.onComplete();
                            return;
                        } else if (!z4) {
                            this.active = true;
                            poll.a(this.inner);
                            request();
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        innerError(th);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        void innerComplete() {
            this.active = false;
            drain();
        }

        void innerError(Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                this.upstream.cancel();
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.inner.get());
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.inner);
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            long j5;
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                int i5 = this.prefetch;
                if (i5 == Integer.MAX_VALUE) {
                    j5 = Long.MAX_VALUE;
                } else {
                    j5 = i5;
                }
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                    int requestFusion = nVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceFused = requestFusion;
                        this.queue = nVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceFused = requestFusion;
                        this.queue = nVar;
                        this.downstream.onSubscribe(this);
                        qVar.request(j5);
                        return;
                    }
                }
                if (this.prefetch == Integer.MAX_VALUE) {
                    this.queue = new io.reactivex.rxjava3.internal.queue.c(io.reactivex.rxjava3.core.o.c0());
                } else {
                    this.queue = new io.reactivex.rxjava3.internal.queue.b(this.prefetch);
                }
                this.downstream.onSubscribe(this);
                qVar.request(j5);
            }
        }

        void request() {
            if (this.sourceFused != 1) {
                int i5 = this.consumed + 1;
                if (i5 == this.limit) {
                    this.consumed = 0;
                    this.upstream.request(i5);
                } else {
                    this.consumed = i5;
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(io.reactivex.rxjava3.core.i iVar) {
            if (this.sourceFused == 0 && !this.queue.offer(iVar)) {
                onError(new io.reactivex.rxjava3.exceptions.c());
            } else {
                drain();
            }
        }
    }

    public d(org.reactivestreams.o<? extends io.reactivex.rxjava3.core.i> oVar, int i5) {
        this.f16489a = oVar;
        this.f16490b = i5;
    }

    @Override // io.reactivex.rxjava3.core.c
    public void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16489a.subscribe(new a(fVar, this.f16490b));
    }
}
