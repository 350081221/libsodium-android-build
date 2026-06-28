package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class n2<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16903c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f16904d;

    /* renamed from: e, reason: collision with root package name */
    final int f16905e;

    /* loaded from: classes3.dex */
    static abstract class a<T> extends io.reactivex.rxjava3.internal.subscriptions.c<T> implements io.reactivex.rxjava3.core.t<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        final AtomicLong requested = new AtomicLong();
        int sourceMode;
        org.reactivestreams.q upstream;
        final q0.c worker;

        a(q0.c cVar, boolean z4, int i5) {
            this.worker = cVar;
            this.delayError = z4;
            this.prefetch = i5;
            this.limit = i5 - (i5 >> 2);
        }

        @Override // org.reactivestreams.q
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (!this.outputFused && getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        final boolean checkTerminated(boolean z4, boolean z5, org.reactivestreams.p<?> pVar) {
            if (this.cancelled) {
                clear();
                return true;
            }
            if (z4) {
                if (this.delayError) {
                    if (z5) {
                        this.cancelled = true;
                        Throwable th = this.error;
                        if (th != null) {
                            pVar.onError(th);
                        } else {
                            pVar.onComplete();
                        }
                        this.worker.dispose();
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    this.cancelled = true;
                    clear();
                    pVar.onError(th2);
                    this.worker.dispose();
                    return true;
                }
                if (z5) {
                    this.cancelled = true;
                    pVar.onComplete();
                    this.worker.dispose();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public final void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // org.reactivestreams.p
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                trySchedule();
            }
        }

        @Override // org.reactivestreams.p
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.error = th;
            this.done = true;
            trySchedule();
        }

        @Override // org.reactivestreams.p
        public final void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 2) {
                trySchedule();
                return;
            }
            if (!this.queue.offer(t5)) {
                this.upstream.cancel();
                this.error = new io.reactivex.rxjava3.exceptions.c("Queue is full?!");
                this.done = true;
            }
            trySchedule();
        }

        @Override // org.reactivestreams.q
        public final void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                trySchedule();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public final int requestFusion(int i5) {
            if ((i5 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.outputFused) {
                runBackfused();
            } else if (this.sourceMode == 1) {
                runSync();
            } else {
                runAsync();
            }
        }

        abstract void runAsync();

        abstract void runBackfused();

        abstract void runSync();

        final void trySchedule() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.b(this);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends a<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final io.reactivex.rxjava3.internal.fuseable.c<? super T> downstream;

        b(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, q0.c cVar2, boolean z4, int i5) {
            super(cVar2, z4, i5);
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                    int requestFusion = nVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = nVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = nVar;
                        this.downstream.onSubscribe(this);
                        qVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.prefetch);
                this.downstream.onSubscribe(this);
                qVar.request(this.prefetch);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            T poll = this.queue.poll();
            if (poll != null && this.sourceMode != 1) {
                long j5 = this.consumed + 1;
                if (j5 == this.limit) {
                    this.consumed = 0L;
                    this.upstream.request(j5);
                } else {
                    this.consumed = j5;
                }
            }
            return poll;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.n2.a
        void runAsync() {
            boolean z4;
            io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.queue;
            long j5 = this.produced;
            long j6 = this.consumed;
            int i5 = 1;
            do {
                long j7 = this.requested.get();
                while (j5 != j7) {
                    boolean z5 = this.done;
                    try {
                        T poll = qVar.poll();
                        if (poll == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (checkTerminated(z5, z4, cVar)) {
                            return;
                        }
                        if (z4) {
                            break;
                        }
                        if (cVar.tryOnNext(poll)) {
                            j5++;
                        }
                        j6++;
                        if (j6 == this.limit) {
                            this.upstream.request(j6);
                            j6 = 0;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        qVar.clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j5 == j7 && checkTerminated(this.done, qVar.isEmpty(), cVar)) {
                    return;
                }
                this.produced = j5;
                this.consumed = j6;
                i5 = addAndGet(-i5);
            } while (i5 != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.n2.a
        void runBackfused() {
            int i5 = 1;
            while (!this.cancelled) {
                boolean z4 = this.done;
                this.downstream.onNext(null);
                if (z4) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.n2.a
        void runSync() {
            io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.queue;
            long j5 = this.produced;
            int i5 = 1;
            do {
                long j6 = this.requested.get();
                while (j5 != j6) {
                    try {
                        T poll = qVar.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (poll == null) {
                            this.cancelled = true;
                            cVar.onComplete();
                            this.worker.dispose();
                            return;
                        } else if (cVar.tryOnNext(poll)) {
                            j5++;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (qVar.isEmpty()) {
                    this.cancelled = true;
                    cVar.onComplete();
                    this.worker.dispose();
                    return;
                }
                this.produced = j5;
                i5 = addAndGet(-i5);
            } while (i5 != 0);
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> extends a<T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final org.reactivestreams.p<? super T> downstream;

        c(org.reactivestreams.p<? super T> pVar, q0.c cVar, boolean z4, int i5) {
            super(cVar, z4, i5);
            this.downstream = pVar;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                    int requestFusion = nVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = nVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = nVar;
                        this.downstream.onSubscribe(this);
                        qVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.prefetch);
                this.downstream.onSubscribe(this);
                qVar.request(this.prefetch);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            T poll = this.queue.poll();
            if (poll != null && this.sourceMode != 1) {
                long j5 = this.produced + 1;
                if (j5 == this.limit) {
                    this.produced = 0L;
                    this.upstream.request(j5);
                } else {
                    this.produced = j5;
                }
            }
            return poll;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.n2.a
        void runAsync() {
            boolean z4;
            org.reactivestreams.p<? super T> pVar = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.queue;
            long j5 = this.produced;
            int i5 = 1;
            while (true) {
                long j6 = this.requested.get();
                while (j5 != j6) {
                    boolean z5 = this.done;
                    try {
                        T poll = qVar.poll();
                        if (poll == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (checkTerminated(z5, z4, pVar)) {
                            return;
                        }
                        if (z4) {
                            break;
                        }
                        pVar.onNext(poll);
                        j5++;
                        if (j5 == this.limit) {
                            if (j6 != Long.MAX_VALUE) {
                                j6 = this.requested.addAndGet(-j5);
                            }
                            this.upstream.request(j5);
                            j5 = 0;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        qVar.clear();
                        pVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j5 == j6 && checkTerminated(this.done, qVar.isEmpty(), pVar)) {
                    return;
                }
                int i6 = get();
                if (i5 == i6) {
                    this.produced = j5;
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else {
                    i5 = i6;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.n2.a
        void runBackfused() {
            int i5 = 1;
            while (!this.cancelled) {
                boolean z4 = this.done;
                this.downstream.onNext(null);
                if (z4) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.n2.a
        void runSync() {
            org.reactivestreams.p<? super T> pVar = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.queue;
            long j5 = this.produced;
            int i5 = 1;
            do {
                long j6 = this.requested.get();
                while (j5 != j6) {
                    try {
                        T poll = qVar.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (poll == null) {
                            this.cancelled = true;
                            pVar.onComplete();
                            this.worker.dispose();
                            return;
                        }
                        pVar.onNext(poll);
                        j5++;
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        pVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (qVar.isEmpty()) {
                    this.cancelled = true;
                    pVar.onComplete();
                    this.worker.dispose();
                    return;
                }
                this.produced = j5;
                i5 = addAndGet(-i5);
            } while (i5 != 0);
        }
    }

    public n2(io.reactivex.rxjava3.core.o<T> oVar, io.reactivex.rxjava3.core.q0 q0Var, boolean z4, int i5) {
        super(oVar);
        this.f16903c = q0Var;
        this.f16904d = z4;
        this.f16905e = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        q0.c c5 = this.f16903c.c();
        if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
            this.f16598b.N6(new b((io.reactivex.rxjava3.internal.fuseable.c) pVar, c5, this.f16904d, this.f16905e));
        } else {
            this.f16598b.N6(new c(pVar, c5, this.f16904d, this.f16905e));
        }
    }
}
