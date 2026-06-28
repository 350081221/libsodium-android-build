package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class b<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f16611a;

    /* renamed from: b, reason: collision with root package name */
    final int f16612b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<T>, Iterator<T>, Runnable, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 6695226475494099826L;
        final long batchSize;
        final Condition condition;
        volatile boolean done;
        volatile Throwable error;
        final long limit;
        final Lock lock;
        long produced;
        final io.reactivex.rxjava3.internal.queue.b<T> queue;

        a(int i5) {
            this.queue = new io.reactivex.rxjava3.internal.queue.b<>(i5);
            this.batchSize = i5;
            this.limit = i5 - (i5 >> 2);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
            signalConsumer();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z4 = this.done;
                boolean isEmpty = this.queue.isEmpty();
                if (z4) {
                    Throwable th = this.error;
                    if (th == null) {
                        if (isEmpty) {
                            return false;
                        }
                    } else {
                        throw io.reactivex.rxjava3.internal.util.k.i(th);
                    }
                }
                if (isEmpty) {
                    io.reactivex.rxjava3.internal.util.e.b();
                    this.lock.lock();
                    while (!this.done && this.queue.isEmpty() && !isDisposed()) {
                        try {
                            try {
                                this.condition.await();
                            } catch (InterruptedException e5) {
                                run();
                                throw io.reactivex.rxjava3.internal.util.k.i(e5);
                            }
                        } finally {
                            this.lock.unlock();
                        }
                    }
                } else {
                    return true;
                }
            }
            Throwable th2 = this.error;
            if (th2 == null) {
                return false;
            }
            throw io.reactivex.rxjava3.internal.util.k.i(th2);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T poll = this.queue.poll();
                long j5 = this.produced + 1;
                if (j5 == this.limit) {
                    this.produced = 0L;
                    get().request(j5);
                } else {
                    this.produced = j5;
                }
                return poll;
            }
            throw new NoSuchElementException();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            signalConsumer();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            signalConsumer();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!this.queue.offer(t5)) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
                onError(new io.reactivex.rxjava3.exceptions.c("Queue full?!"));
            } else {
                signalConsumer();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, this.batchSize);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.lang.Runnable
        public void run() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
            signalConsumer();
        }

        void signalConsumer() {
            this.lock.lock();
            try {
                this.condition.signalAll();
            } finally {
                this.lock.unlock();
            }
        }
    }

    public b(io.reactivex.rxjava3.core.o<T> oVar, int i5) {
        this.f16611a = oVar;
        this.f16612b = i5;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f16612b);
        this.f16611a.N6(aVar);
        return aVar;
    }
}
