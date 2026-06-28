package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class b<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T> f17544a;

    /* renamed from: b, reason: collision with root package name */
    final int f17545b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<T>, Iterator<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 6695226475494099826L;
        final Condition condition;
        volatile boolean done;
        volatile Throwable error;
        final Lock lock;
        final io.reactivex.rxjava3.internal.queue.c<T> queue;

        a(int i5) {
            this.queue = new io.reactivex.rxjava3.internal.queue.c<>(i5);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
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
                    try {
                        io.reactivex.rxjava3.internal.util.e.b();
                        this.lock.lock();
                        while (!this.done && this.queue.isEmpty() && !isDisposed()) {
                            try {
                                this.condition.await();
                            } finally {
                            }
                        }
                        this.lock.unlock();
                    } catch (InterruptedException e5) {
                        io.reactivex.rxjava3.internal.disposables.c.dispose(this);
                        signalConsumer();
                        throw io.reactivex.rxjava3.internal.util.k.i(e5);
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
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.queue.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.done = true;
            signalConsumer();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            signalConsumer();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.queue.offer(t5);
            signalConsumer();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
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

    public b(io.reactivex.rxjava3.core.n0<? extends T> n0Var, int i5) {
        this.f17544a = n0Var;
        this.f17545b = i5;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f17545b);
        this.f17544a.subscribe(aVar);
        return aVar;
    }
}
