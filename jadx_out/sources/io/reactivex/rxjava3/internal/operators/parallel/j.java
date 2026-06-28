package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class j<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<? extends T> f18259b;

    /* renamed from: c, reason: collision with root package name */
    final int f18260c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f18261d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<org.reactivestreams.q> implements t<T> {
        private static final long serialVersionUID = 8410034718427740355L;
        final int limit;
        final c<T> parent;
        final int prefetch;
        long produced;
        volatile io.reactivex.rxjava3.internal.fuseable.p<T> queue;

        a(c<T> cVar, int i5) {
            this.parent = cVar;
            this.prefetch = i5;
            this.limit = i5 - (i5 >> 2);
        }

        public boolean cancel() {
            return io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        io.reactivex.rxjava3.internal.fuseable.p<T> getQueue() {
            io.reactivex.rxjava3.internal.fuseable.p<T> pVar = this.queue;
            if (pVar == null) {
                io.reactivex.rxjava3.internal.queue.b bVar = new io.reactivex.rxjava3.internal.queue.b(this.prefetch);
                this.queue = bVar;
                return bVar;
            }
            return pVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.parent.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.parent.onNext(this, t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, this.prefetch);
        }

        public void request(long j5) {
            long j6 = this.produced + j5;
            if (j6 >= this.limit) {
                this.produced = 0L;
                get().request(j6);
            } else {
                this.produced = j6;
            }
        }

        public void requestOne() {
            long j5 = this.produced + 1;
            if (j5 == this.limit) {
                this.produced = 0L;
                get().request(j5);
            } else {
                this.produced = j5;
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends c<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        b(org.reactivestreams.p<? super T> pVar, int i5, int i6) {
            super(pVar, i5, i6);
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.j.c
        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        /* JADX WARN: Code restructure failed: missing block: B:71:0x005d, code lost:
        
            if (r12 == false) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x005f, code lost:
        
            if (r15 == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0061, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0064, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0065, code lost:
        
            if (r15 == false) goto L81;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void drainLoop() {
            /*
                r18 = this;
                r0 = r18
                io.reactivex.rxjava3.internal.operators.parallel.j$a<T>[] r1 = r0.subscribers
                int r2 = r1.length
                org.reactivestreams.p<? super T> r3 = r0.downstream
                r5 = 1
            L8:
                java.util.concurrent.atomic.AtomicLong r6 = r0.requested
                long r6 = r6.get()
                r8 = 0
                r10 = r8
            L11:
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r12 == 0) goto L67
                boolean r12 = r0.cancelled
                if (r12 == 0) goto L1d
                r18.cleanup()
                return
            L1d:
                io.reactivex.rxjava3.internal.util.c r12 = r0.errors
                java.lang.Object r12 = r12.get()
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                if (r12 == 0) goto L2e
                r18.cleanup()
                r3.onError(r12)
                return
            L2e:
                java.util.concurrent.atomic.AtomicInteger r12 = r0.done
                int r12 = r12.get()
                if (r12 != 0) goto L38
                r12 = 1
                goto L39
            L38:
                r12 = 0
            L39:
                r14 = 0
                r15 = 1
            L3b:
                int r4 = r1.length
                if (r14 >= r4) goto L5d
                r4 = r1[r14]
                io.reactivex.rxjava3.internal.fuseable.p<T> r13 = r4.queue
                if (r13 == 0) goto L5a
                java.lang.Object r13 = r13.poll()
                if (r13 == 0) goto L5a
                r3.onNext(r13)
                r4.requestOne()
                r16 = 1
                long r10 = r10 + r16
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto L59
                goto L67
            L59:
                r15 = 0
            L5a:
                int r14 = r14 + 1
                goto L3b
            L5d:
                if (r12 == 0) goto L65
                if (r15 == 0) goto L65
                r3.onComplete()
                return
            L65:
                if (r15 == 0) goto L11
            L67:
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto Lac
                boolean r4 = r0.cancelled
                if (r4 == 0) goto L73
                r18.cleanup()
                return
            L73:
                io.reactivex.rxjava3.internal.util.c r4 = r0.errors
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L84
                r18.cleanup()
                r3.onError(r4)
                return
            L84:
                java.util.concurrent.atomic.AtomicInteger r4 = r0.done
                int r4 = r4.get()
                if (r4 != 0) goto L8e
                r4 = 1
                goto L8f
            L8e:
                r4 = 0
            L8f:
                r6 = 0
            L90:
                if (r6 >= r2) goto La3
                r7 = r1[r6]
                io.reactivex.rxjava3.internal.fuseable.p<T> r7 = r7.queue
                if (r7 == 0) goto La0
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto La0
                r13 = 0
                goto La4
            La0:
                int r6 = r6 + 1
                goto L90
            La3:
                r13 = 1
            La4:
                if (r4 == 0) goto Lac
                if (r13 == 0) goto Lac
                r3.onComplete()
                return
            Lac:
                int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r4 == 0) goto Lb5
                java.util.concurrent.atomic.AtomicLong r4 = r0.requested
                io.reactivex.rxjava3.internal.util.d.e(r4, r10)
            Lb5:
                int r4 = -r5
                int r5 = r0.addAndGet(r4)
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.parallel.j.b.drainLoop():void");
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.j.c
        public void onComplete() {
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.j.c
        public void onError(Throwable th) {
            if (this.errors.compareAndSet(null, th)) {
                cancelAll();
                drain();
            } else if (th != this.errors.get()) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.j.c
        public void onNext(a<T> aVar, T t5) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(t5);
                    if (this.requested.get() != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    aVar.request(1L);
                } else if (!aVar.getQueue().offer(t5)) {
                    cancelAll();
                    io.reactivex.rxjava3.exceptions.c cVar = new io.reactivex.rxjava3.exceptions.c("Queue full?!");
                    if (this.errors.compareAndSet(null, cVar)) {
                        this.downstream.onError(cVar);
                        return;
                    } else {
                        io.reactivex.rxjava3.plugins.a.Y(cVar);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!aVar.getQueue().offer(t5)) {
                cancelAll();
                onError(new io.reactivex.rxjava3.exceptions.c("Queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class c<T> extends AtomicInteger implements org.reactivestreams.q {
        private static final long serialVersionUID = 3100232009247827843L;
        volatile boolean cancelled;
        final org.reactivestreams.p<? super T> downstream;
        final a<T>[] subscribers;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger done = new AtomicInteger();

        c(org.reactivestreams.p<? super T> pVar, int i5, int i6) {
            this.downstream = pVar;
            a<T>[] aVarArr = new a[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                aVarArr[i7] = new a<>(this, i6);
            }
            this.subscribers = aVarArr;
            this.done.lazySet(i5);
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
                if (getAndIncrement() == 0) {
                    cleanup();
                }
            }
        }

        void cancelAll() {
            for (a<T> aVar : this.subscribers) {
                aVar.cancel();
            }
        }

        void cleanup() {
            for (a<T> aVar : this.subscribers) {
                aVar.queue = null;
            }
        }

        abstract void drain();

        abstract void onComplete();

        abstract void onError(Throwable th);

        abstract void onNext(a<T> aVar, T t5);

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class d<T> extends c<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        d(org.reactivestreams.p<? super T> pVar, int i5, int i6) {
            super(pVar, i5, i6);
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.j.c
        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x004b, code lost:
        
            if (r12 == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x004d, code lost:
        
            if (r15 == false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x004f, code lost:
        
            r18.errors.tryTerminateConsumer(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0054, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0055, code lost:
        
            if (r15 == false) goto L70;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void drainLoop() {
            /*
                r18 = this;
                r0 = r18
                io.reactivex.rxjava3.internal.operators.parallel.j$a<T>[] r1 = r0.subscribers
                int r2 = r1.length
                org.reactivestreams.p<? super T> r3 = r0.downstream
                r5 = 1
            L8:
                java.util.concurrent.atomic.AtomicLong r6 = r0.requested
                long r6 = r6.get()
                r8 = 0
                r10 = r8
            L11:
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r12 == 0) goto L57
                boolean r12 = r0.cancelled
                if (r12 == 0) goto L1d
                r18.cleanup()
                return
            L1d:
                java.util.concurrent.atomic.AtomicInteger r12 = r0.done
                int r12 = r12.get()
                if (r12 != 0) goto L27
                r12 = 1
                goto L28
            L27:
                r12 = 0
            L28:
                r14 = 0
                r15 = 1
            L2a:
                if (r14 >= r2) goto L4b
                r4 = r1[r14]
                io.reactivex.rxjava3.internal.fuseable.p<T> r13 = r4.queue
                if (r13 == 0) goto L48
                java.lang.Object r13 = r13.poll()
                if (r13 == 0) goto L48
                r3.onNext(r13)
                r4.requestOne()
                r16 = 1
                long r10 = r10 + r16
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto L47
                goto L57
            L47:
                r15 = 0
            L48:
                int r14 = r14 + 1
                goto L2a
            L4b:
                if (r12 == 0) goto L55
                if (r15 == 0) goto L55
                io.reactivex.rxjava3.internal.util.c r1 = r0.errors
                r1.tryTerminateConsumer(r3)
                return
            L55:
                if (r15 == 0) goto L11
            L57:
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto L8d
                boolean r4 = r0.cancelled
                if (r4 == 0) goto L63
                r18.cleanup()
                return
            L63:
                java.util.concurrent.atomic.AtomicInteger r4 = r0.done
                int r4 = r4.get()
                if (r4 != 0) goto L6d
                r4 = 1
                goto L6e
            L6d:
                r4 = 0
            L6e:
                r6 = 0
            L6f:
                if (r6 >= r2) goto L82
                r7 = r1[r6]
                io.reactivex.rxjava3.internal.fuseable.p<T> r7 = r7.queue
                if (r7 == 0) goto L7f
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L7f
                r13 = 0
                goto L83
            L7f:
                int r6 = r6 + 1
                goto L6f
            L82:
                r13 = 1
            L83:
                if (r4 == 0) goto L8d
                if (r13 == 0) goto L8d
                io.reactivex.rxjava3.internal.util.c r1 = r0.errors
                r1.tryTerminateConsumer(r3)
                return
            L8d:
                int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r4 == 0) goto L96
                java.util.concurrent.atomic.AtomicLong r4 = r0.requested
                io.reactivex.rxjava3.internal.util.d.e(r4, r10)
            L96:
                int r4 = -r5
                int r5 = r0.addAndGet(r4)
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.parallel.j.d.drainLoop():void");
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.j.c
        void onComplete() {
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.j.c
        void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.done.decrementAndGet();
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.j.c
        void onNext(a<T> aVar, T t5) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(t5);
                    if (this.requested.get() != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    aVar.request(1L);
                } else if (!aVar.getQueue().offer(t5)) {
                    aVar.cancel();
                    this.errors.tryAddThrowableOrReport(new io.reactivex.rxjava3.exceptions.c("Queue full?!"));
                    this.done.decrementAndGet();
                    drainLoop();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!aVar.getQueue().offer(t5)) {
                    aVar.cancel();
                    this.errors.tryAddThrowableOrReport(new io.reactivex.rxjava3.exceptions.c("Queue full?!"));
                    this.done.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }
    }

    public j(io.reactivex.rxjava3.parallel.b<? extends T> bVar, int i5, boolean z4) {
        this.f18259b = bVar;
        this.f18260c = i5;
        this.f18261d = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        c bVar;
        if (this.f18261d) {
            bVar = new d(pVar, this.f18259b.M(), this.f18260c);
        } else {
            bVar = new b(pVar, this.f18259b.M(), this.f18260c);
        }
        pVar.onSubscribe(bVar);
        this.f18259b.X(bVar.subscribers);
    }
}
