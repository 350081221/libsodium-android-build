package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class z0<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<? extends T>[] f17440b;

    /* loaded from: classes3.dex */
    static final class a<T> extends ConcurrentLinkedQueue<T> implements d<T> {
        private static final long serialVersionUID = -4025173261791142821L;
        int consumerIndex;
        final AtomicInteger producerIndex = new AtomicInteger();

        a() {
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.z0.d
        public int consumerIndex() {
            return this.consumerIndex;
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.z0.d
        public void drop() {
            poll();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean offer(T t5, T t6) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.rxjava3.internal.operators.maybe.z0.d, io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            T t5 = (T) super.poll();
            if (t5 != null) {
                this.consumerIndex++;
            }
            return t5;
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.z0.d
        public int producerIndex() {
            return this.producerIndex.get();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.rxjava3.internal.fuseable.q
        public boolean offer(T t5) {
            this.producerIndex.getAndIncrement();
            return super.offer(t5);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends io.reactivex.rxjava3.internal.subscriptions.c<T> implements io.reactivex.rxjava3.core.a0<T> {
        private static final long serialVersionUID = -660395290758764731L;
        volatile boolean cancelled;
        long consumed;
        final org.reactivestreams.p<? super T> downstream;
        boolean outputFused;
        final d<Object> queue;
        final int sourceCount;
        final io.reactivex.rxjava3.disposables.c set = new io.reactivex.rxjava3.disposables.c();
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();

        b(org.reactivestreams.p<? super T> pVar, int i5, d<Object> dVar) {
            this.downstream = pVar;
            this.sourceCount = i5;
            this.queue = dVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.set.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.queue.clear();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        void drainFused() {
            boolean z4;
            org.reactivestreams.p<? super T> pVar = this.downstream;
            d<Object> dVar = this.queue;
            int i5 = 1;
            while (!this.cancelled) {
                Throwable th = this.errors.get();
                if (th != null) {
                    dVar.clear();
                    pVar.onError(th);
                    return;
                }
                if (dVar.producerIndex() == this.sourceCount) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!dVar.isEmpty()) {
                    pVar.onNext(null);
                }
                if (z4) {
                    pVar.onComplete();
                    return;
                } else {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                }
            }
            dVar.clear();
        }

        void drainNormal() {
            org.reactivestreams.p<? super T> pVar = this.downstream;
            d<Object> dVar = this.queue;
            long j5 = this.consumed;
            int i5 = 1;
            do {
                long j6 = this.requested.get();
                while (j5 != j6) {
                    if (this.cancelled) {
                        dVar.clear();
                        return;
                    }
                    if (this.errors.get() != null) {
                        dVar.clear();
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    } else {
                        if (dVar.consumerIndex() == this.sourceCount) {
                            pVar.onComplete();
                            return;
                        }
                        Object poll = dVar.poll();
                        if (poll == null) {
                            break;
                        } else if (poll != io.reactivex.rxjava3.internal.util.q.COMPLETE) {
                            pVar.onNext(poll);
                            j5++;
                        }
                    }
                }
                if (j5 == j6) {
                    if (this.errors.get() != null) {
                        dVar.clear();
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    } else {
                        while (dVar.peek() == io.reactivex.rxjava3.internal.util.q.COMPLETE) {
                            dVar.drop();
                        }
                        if (dVar.consumerIndex() == this.sourceCount) {
                            pVar.onComplete();
                            return;
                        }
                    }
                }
                this.consumed = j5;
                i5 = addAndGet(-i5);
            } while (i5 != 0);
        }

        boolean isCancelled() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.queue.offer(io.reactivex.rxjava3.internal.util.q.COMPLETE);
            drain();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.set.dispose();
                this.queue.offer(io.reactivex.rxjava3.internal.util.q.COMPLETE);
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.set.b(eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.queue.offer(t5);
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            T t5;
            do {
                t5 = (T) this.queue.poll();
            } while (t5 == io.reactivex.rxjava3.internal.util.q.COMPLETE);
            return t5;
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface d<T> extends io.reactivex.rxjava3.internal.fuseable.q<T> {
        int consumerIndex();

        void drop();

        T peek();

        @Override // java.util.Queue, io.reactivex.rxjava3.internal.operators.maybe.z0.d, io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        T poll();

        int producerIndex();
    }

    public z0(io.reactivex.rxjava3.core.d0<? extends T>[] d0VarArr) {
        this.f17440b = d0VarArr;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        d aVar;
        io.reactivex.rxjava3.core.d0[] d0VarArr = this.f17440b;
        int length = d0VarArr.length;
        if (length <= io.reactivex.rxjava3.core.o.c0()) {
            aVar = new c(length);
        } else {
            aVar = new a();
        }
        b bVar = new b(pVar, length, aVar);
        pVar.onSubscribe(bVar);
        io.reactivex.rxjava3.internal.util.c cVar = bVar.errors;
        for (io.reactivex.rxjava3.core.d0 d0Var : d0VarArr) {
            if (!bVar.isCancelled() && cVar.get() == null) {
                d0Var.a(bVar);
            } else {
                return;
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> extends AtomicReferenceArray<T> implements d<T> {
        private static final long serialVersionUID = -7969063454040569579L;
        int consumerIndex;
        final AtomicInteger producerIndex;

        c(int i5) {
            super(i5);
            this.producerIndex = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            while (poll() != null && !isEmpty()) {
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.z0.d
        public int consumerIndex() {
            return this.consumerIndex;
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.z0.d
        public void drop() {
            int i5 = this.consumerIndex;
            lazySet(i5, null);
            this.consumerIndex = i5 + 1;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.consumerIndex == producerIndex();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean offer(T t5) {
            Objects.requireNonNull(t5, "value is null");
            int andIncrement = this.producerIndex.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t5);
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.z0.d
        public T peek() {
            int i5 = this.consumerIndex;
            if (i5 == length()) {
                return null;
            }
            return get(i5);
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.z0.d, java.util.Queue, io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            int i5 = this.consumerIndex;
            if (i5 == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.producerIndex;
            do {
                T t5 = get(i5);
                if (t5 != null) {
                    this.consumerIndex = i5 + 1;
                    lazySet(i5, null);
                    return t5;
                }
            } while (atomicInteger.get() != i5);
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.z0.d
        public int producerIndex() {
            return this.producerIndex.get();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean offer(T t5, T t6) {
            throw new UnsupportedOperationException();
        }
    }
}
