package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class w2<T> extends io.reactivex.rxjava3.flowables.a<T> implements io.reactivex.rxjava3.internal.fuseable.j<T> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<T> f17115b;

    /* renamed from: c, reason: collision with root package name */
    final int f17116c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<b<T>> f17117d = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicLong implements org.reactivestreams.q {
        private static final long serialVersionUID = 2845000326761540265L;
        final org.reactivestreams.p<? super T> downstream;
        long emitted;
        final b<T> parent;

        a(org.reactivestreams.p<? super T> pVar, b<T> bVar) {
            this.downstream = pVar;
            this.parent = bVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.drain();
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.b(this, j5);
                this.parent.drain();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {
        static final a[] EMPTY = new a[0];
        static final a[] TERMINATED = new a[0];
        private static final long serialVersionUID = -1672047311619175801L;
        final int bufferSize;
        int consumed;
        final AtomicReference<b<T>> current;
        volatile boolean done;
        Throwable error;
        volatile io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        int sourceMode;
        final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<a<T>[]> subscribers = new AtomicReference<>(EMPTY);

        b(AtomicReference<b<T>> atomicReference, int i5) {
            this.current = atomicReference;
            this.bufferSize = i5;
        }

        boolean add(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.subscribers.get();
                if (aVarArr == TERMINATED) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!androidx.compose.animation.core.h.a(this.subscribers, aVarArr, aVarArr2));
            return true;
        }

        boolean checkTerminated(boolean z4, boolean z5) {
            if (!z4 || !z5) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                signalError(th);
                return true;
            }
            for (a<T> aVar : this.subscribers.getAndSet(TERMINATED)) {
                if (!aVar.isCancelled()) {
                    aVar.downstream.onComplete();
                }
            }
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.subscribers.getAndSet(TERMINATED);
            androidx.compose.animation.core.h.a(this.current, this, null);
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
        }

        void drain() {
            boolean z4;
            boolean z5;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.queue;
            int i5 = this.consumed;
            int i6 = this.bufferSize;
            int i7 = i6 - (i6 >> 2);
            if (this.sourceMode != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i8 = 1;
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar2 = qVar;
            int i9 = i5;
            while (true) {
                if (qVar2 != null) {
                    a<T>[] aVarArr = this.subscribers.get();
                    long j5 = Long.MAX_VALUE;
                    boolean z6 = false;
                    for (a<T> aVar : aVarArr) {
                        long j6 = aVar.get();
                        if (j6 != Long.MIN_VALUE) {
                            j5 = Math.min(j6 - aVar.emitted, j5);
                            z6 = true;
                        }
                    }
                    if (!z6) {
                        j5 = 0;
                    }
                    for (long j7 = 0; j5 != j7; j7 = 0) {
                        boolean z7 = this.done;
                        try {
                            T poll = qVar2.poll();
                            if (poll == null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (checkTerminated(z7, z5)) {
                                return;
                            }
                            if (z5) {
                                break;
                            }
                            for (a<T> aVar2 : aVarArr) {
                                if (!aVar2.isCancelled()) {
                                    aVar2.downstream.onNext(poll);
                                    aVar2.emitted++;
                                }
                            }
                            if (z4 && (i9 = i9 + 1) == i7) {
                                this.upstream.get().request(i7);
                                i9 = 0;
                            }
                            j5--;
                            if (aVarArr != this.subscribers.get()) {
                                break;
                            }
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            this.upstream.get().cancel();
                            qVar2.clear();
                            this.done = true;
                            signalError(th);
                            return;
                        }
                    }
                    if (checkTerminated(this.done, qVar2.isEmpty())) {
                        return;
                    }
                }
                this.consumed = i9;
                i8 = addAndGet(-i8);
                if (i8 == 0) {
                    return;
                }
                if (qVar2 == null) {
                    qVar2 = this.queue;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.subscribers.get() == TERMINATED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.sourceMode == 0 && !this.queue.offer(t5)) {
                onError(new io.reactivex.rxjava3.exceptions.c("Prefetch queue is full?!"));
            } else {
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.upstream, qVar)) {
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                    int requestFusion = nVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = nVar;
                        this.done = true;
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = nVar;
                        qVar.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.bufferSize);
                qVar.request(this.bufferSize);
            }
        }

        void remove(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.subscribers.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            if (aVarArr[i5] == aVar) {
                                break;
                            } else {
                                i5++;
                            }
                        } else {
                            i5 = -1;
                            break;
                        }
                    }
                    if (i5 < 0) {
                        return;
                    }
                    if (length == 1) {
                        aVarArr2 = EMPTY;
                    } else {
                        a[] aVarArr3 = new a[length - 1];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                        System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } while (!androidx.compose.animation.core.h.a(this.subscribers, aVarArr, aVarArr2));
        }

        void signalError(Throwable th) {
            for (a<T> aVar : this.subscribers.getAndSet(TERMINATED)) {
                if (!aVar.isCancelled()) {
                    aVar.downstream.onError(th);
                }
            }
        }
    }

    public w2(org.reactivestreams.o<T> oVar, int i5) {
        this.f17115b = oVar;
        this.f17116c = i5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        b<T> bVar;
        while (true) {
            bVar = this.f17117d.get();
            if (bVar != null) {
                break;
            }
            b<T> bVar2 = new b<>(this.f17117d, this.f17116c);
            if (androidx.compose.animation.core.h.a(this.f17117d, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        a<T> aVar = new a<>(pVar, bVar);
        pVar.onSubscribe(aVar);
        if (bVar.add(aVar)) {
            if (aVar.isCancelled()) {
                bVar.remove(aVar);
                return;
            } else {
                bVar.drain();
                return;
            }
        }
        Throwable th = bVar.error;
        if (th != null) {
            aVar.downstream.onError(th);
        } else {
            aVar.downstream.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.flowables.a
    public void r9(m3.g<? super io.reactivex.rxjava3.disposables.e> gVar) {
        b<T> bVar;
        while (true) {
            bVar = this.f17117d.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(this.f17117d, this.f17116c);
            if (androidx.compose.animation.core.h.a(this.f17117d, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z4 = false;
        if (!bVar.connect.get() && bVar.connect.compareAndSet(false, true)) {
            z4 = true;
        }
        try {
            gVar.accept(bVar);
            if (z4) {
                this.f17115b.subscribe(bVar);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            throw io.reactivex.rxjava3.internal.util.k.i(th);
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.j
    public org.reactivestreams.o<T> source() {
        return this.f17115b;
    }

    @Override // io.reactivex.rxjava3.flowables.a
    public void y9() {
        b<T> bVar = this.f17117d.get();
        if (bVar != null && bVar.isDisposed()) {
            androidx.compose.animation.core.h.a(this.f17117d, bVar, null);
        }
    }
}
