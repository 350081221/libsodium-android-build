package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class x4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, io.reactivex.rxjava3.core.o<T>> {

    /* renamed from: c, reason: collision with root package name */
    final long f17184c;

    /* renamed from: d, reason: collision with root package name */
    final long f17185d;

    /* renamed from: e, reason: collision with root package name */
    final int f17186e;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;
        final int bufferSize;
        final org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> downstream;
        long index;
        final AtomicBoolean once;
        final long size;
        org.reactivestreams.q upstream;
        io.reactivex.rxjava3.processors.h<T> window;

        a(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar, long j5, int i5) {
            super(1);
            this.downstream = pVar;
            this.size = j5;
            this.once = new AtomicBoolean();
            this.bufferSize = i5;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            io.reactivex.rxjava3.processors.h<T> hVar = this.window;
            if (hVar != null) {
                this.window = null;
                hVar.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            io.reactivex.rxjava3.processors.h<T> hVar = this.window;
            if (hVar != null) {
                this.window = null;
                hVar.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            a5 a5Var;
            long j5 = this.index;
            io.reactivex.rxjava3.processors.h<T> hVar = this.window;
            if (j5 == 0) {
                getAndIncrement();
                hVar = io.reactivex.rxjava3.processors.h.v9(this.bufferSize, this);
                this.window = hVar;
                a5Var = new a5(hVar);
                this.downstream.onNext(a5Var);
            } else {
                a5Var = null;
            }
            long j6 = j5 + 1;
            hVar.onNext(t5);
            if (j6 == this.size) {
                this.index = 0L;
                this.window = null;
                hVar.onComplete();
            } else {
                this.index = j6;
            }
            if (a5Var != null && a5Var.n9()) {
                a5Var.f16609b.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                this.upstream.request(io.reactivex.rxjava3.internal.util.d.d(this.size, j5));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> downstream;
        Throwable error;
        final AtomicBoolean firstRequest;
        long index;
        final AtomicBoolean once;
        long produced;
        final io.reactivex.rxjava3.internal.queue.c<io.reactivex.rxjava3.processors.h<T>> queue;
        final AtomicLong requested;
        final long size;
        final long skip;
        org.reactivestreams.q upstream;
        final ArrayDeque<io.reactivex.rxjava3.processors.h<T>> windows;
        final AtomicInteger wip;

        b(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar, long j5, long j6, int i5) {
            super(1);
            this.downstream = pVar;
            this.size = j5;
            this.skip = j6;
            this.queue = new io.reactivex.rxjava3.internal.queue.c<>(i5);
            this.windows = new ArrayDeque<>();
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.requested = new AtomicLong();
            this.wip = new AtomicInteger();
            this.bufferSize = i5;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            if (this.once.compareAndSet(false, true)) {
                run();
            }
            drain();
        }

        boolean checkTerminated(boolean z4, boolean z5, org.reactivestreams.p<?> pVar, io.reactivex.rxjava3.internal.queue.c<?> cVar) {
            if (z4) {
                Throwable th = this.error;
                if (th != null) {
                    cVar.clear();
                    pVar.onError(th);
                    return true;
                }
                if (z5) {
                    pVar.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x000f, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void drain() {
            /*
                r15 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r15.wip
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> r0 = r15.downstream
                io.reactivex.rxjava3.internal.queue.c<io.reactivex.rxjava3.processors.h<T>> r1 = r15.queue
                r2 = 1
                r3 = r2
            Lf:
                boolean r4 = r15.cancelled
                if (r4 == 0) goto L1f
            L13:
                java.lang.Object r4 = r1.poll()
                io.reactivex.rxjava3.processors.h r4 = (io.reactivex.rxjava3.processors.h) r4
                if (r4 == 0) goto L84
                r4.onComplete()
                goto L13
            L1f:
                java.util.concurrent.atomic.AtomicLong r4 = r15.requested
                long r4 = r4.get()
                r6 = 0
                r8 = r6
            L28:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L5d
                boolean r11 = r15.done
                java.lang.Object r12 = r1.poll()
                io.reactivex.rxjava3.processors.h r12 = (io.reactivex.rxjava3.processors.h) r12
                if (r12 != 0) goto L38
                r13 = r2
                goto L39
            L38:
                r13 = 0
            L39:
                boolean r14 = r15.cancelled
                if (r14 == 0) goto L3e
                goto Lf
            L3e:
                boolean r11 = r15.checkTerminated(r11, r13, r0, r1)
                if (r11 == 0) goto L45
                return
            L45:
                if (r13 == 0) goto L48
                goto L5d
            L48:
                io.reactivex.rxjava3.internal.operators.flowable.a5 r10 = new io.reactivex.rxjava3.internal.operators.flowable.a5
                r10.<init>(r12)
                r0.onNext(r10)
                boolean r10 = r10.n9()
                if (r10 == 0) goto L59
                r12.onComplete()
            L59:
                r10 = 1
                long r8 = r8 + r10
                goto L28
            L5d:
                if (r10 != 0) goto L71
                boolean r10 = r15.cancelled
                if (r10 == 0) goto L64
                goto Lf
            L64:
                boolean r10 = r15.done
                boolean r11 = r1.isEmpty()
                boolean r10 = r15.checkTerminated(r10, r11, r0, r1)
                if (r10 == 0) goto L71
                return
            L71:
                int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r6 == 0) goto L84
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L84
                java.util.concurrent.atomic.AtomicLong r4 = r15.requested
                long r5 = -r8
                r4.addAndGet(r5)
            L84:
                java.util.concurrent.atomic.AtomicInteger r4 = r15.wip
                int r3 = -r3
                int r3 = r4.addAndGet(r3)
                if (r3 != 0) goto Lf
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.x4.b.drain():void");
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            Iterator<io.reactivex.rxjava3.processors.h<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.windows.clear();
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            Iterator<io.reactivex.rxjava3.processors.h<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.windows.clear();
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            io.reactivex.rxjava3.processors.h<T> hVar;
            long j5 = this.index;
            if (j5 == 0 && !this.cancelled) {
                getAndIncrement();
                hVar = io.reactivex.rxjava3.processors.h.v9(this.bufferSize, this);
                this.windows.offer(hVar);
            } else {
                hVar = null;
            }
            long j6 = j5 + 1;
            Iterator<io.reactivex.rxjava3.processors.h<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onNext(t5);
            }
            if (hVar != null) {
                this.queue.offer(hVar);
                drain();
            }
            long j7 = this.produced + 1;
            if (j7 == this.size) {
                this.produced = j7 - this.skip;
                io.reactivex.rxjava3.processors.h<T> poll = this.windows.poll();
                if (poll != null) {
                    poll.onComplete();
                }
            } else {
                this.produced = j7;
            }
            if (j6 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j6;
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                if (!this.firstRequest.get() && this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(io.reactivex.rxjava3.internal.util.d.c(this.size, io.reactivex.rxjava3.internal.util.d.d(this.skip, j5 - 1)));
                } else {
                    this.upstream.request(io.reactivex.rxjava3.internal.util.d.d(this.skip, j5));
                }
                drain();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;
        final int bufferSize;
        final org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> downstream;
        final AtomicBoolean firstRequest;
        long index;
        final AtomicBoolean once;
        final long size;
        final long skip;
        org.reactivestreams.q upstream;
        io.reactivex.rxjava3.processors.h<T> window;

        c(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar, long j5, long j6, int i5) {
            super(1);
            this.downstream = pVar;
            this.size = j5;
            this.skip = j6;
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.bufferSize = i5;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            io.reactivex.rxjava3.processors.h<T> hVar = this.window;
            if (hVar != null) {
                this.window = null;
                hVar.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            io.reactivex.rxjava3.processors.h<T> hVar = this.window;
            if (hVar != null) {
                this.window = null;
                hVar.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            a5 a5Var;
            long j5 = this.index;
            io.reactivex.rxjava3.processors.h<T> hVar = this.window;
            if (j5 == 0) {
                getAndIncrement();
                hVar = io.reactivex.rxjava3.processors.h.v9(this.bufferSize, this);
                this.window = hVar;
                a5Var = new a5(hVar);
                this.downstream.onNext(a5Var);
            } else {
                a5Var = null;
            }
            long j6 = j5 + 1;
            if (hVar != null) {
                hVar.onNext(t5);
            }
            if (j6 == this.size) {
                this.window = null;
                hVar.onComplete();
            }
            if (j6 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j6;
            }
            if (a5Var != null && a5Var.n9()) {
                a5Var.f16609b.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                if (!this.firstRequest.get() && this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(io.reactivex.rxjava3.internal.util.d.c(io.reactivex.rxjava3.internal.util.d.d(this.size, j5), io.reactivex.rxjava3.internal.util.d.d(this.skip - this.size, j5 - 1)));
                } else {
                    this.upstream.request(io.reactivex.rxjava3.internal.util.d.d(this.skip, j5));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public x4(io.reactivex.rxjava3.core.o<T> oVar, long j5, long j6, int i5) {
        super(oVar);
        this.f17184c = j5;
        this.f17185d = j6;
        this.f17186e = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super io.reactivex.rxjava3.core.o<T>> pVar) {
        long j5 = this.f17185d;
        long j6 = this.f17184c;
        if (j5 == j6) {
            this.f16598b.N6(new a(pVar, this.f17184c, this.f17186e));
        } else if (j5 > j6) {
            this.f16598b.N6(new c(pVar, this.f17184c, this.f17185d, this.f17186e));
        } else {
            this.f16598b.N6(new b(pVar, this.f17184c, this.f17185d, this.f17186e));
        }
    }
}
