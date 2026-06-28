package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e5<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<? extends T>[] f16726b;

    /* renamed from: c, reason: collision with root package name */
    final Iterable<? extends org.reactivestreams.o<? extends T>> f16727c;

    /* renamed from: d, reason: collision with root package name */
    final m3.o<? super Object[], ? extends R> f16728d;

    /* renamed from: e, reason: collision with root package name */
    final int f16729e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f16730f;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements org.reactivestreams.q {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final org.reactivestreams.p<? super R> downstream;
        final io.reactivex.rxjava3.internal.util.c errors;
        final AtomicLong requested;
        final b<T, R>[] subscribers;
        final m3.o<? super Object[], ? extends R> zipper;

        a(org.reactivestreams.p<? super R> pVar, m3.o<? super Object[], ? extends R> oVar, int i5, int i6, boolean z4) {
            this.downstream = pVar;
            this.zipper = oVar;
            this.delayErrors = z4;
            b<T, R>[] bVarArr = new b[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                bVarArr[i7] = new b<>(this, i6);
            }
            this.current = new Object[i5];
            this.subscribers = bVarArr;
            this.requested = new AtomicLong();
            this.errors = new io.reactivex.rxjava3.internal.util.c();
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
            }
        }

        void cancelAll() {
            for (b<T, R> bVar : this.subscribers) {
                bVar.cancel();
            }
        }

        void drain() {
            T t5;
            boolean z4;
            T t6;
            boolean z5;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super R> pVar = this.downstream;
            b<T, R>[] bVarArr = this.subscribers;
            int length = bVarArr.length;
            Object[] objArr = this.current;
            int i5 = 1;
            do {
                long j5 = this.requested.get();
                long j6 = 0;
                while (j5 != j6) {
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        this.errors.tryTerminateConsumer(pVar);
                        return;
                    }
                    boolean z6 = false;
                    for (int i6 = 0; i6 < length; i6++) {
                        b<T, R> bVar = bVarArr[i6];
                        if (objArr[i6] == null) {
                            boolean z7 = bVar.done;
                            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = bVar.queue;
                            if (qVar != null) {
                                try {
                                    t6 = qVar.poll();
                                } catch (Throwable th) {
                                    io.reactivex.rxjava3.exceptions.b.b(th);
                                    this.errors.tryAddThrowableOrReport(th);
                                    if (!this.delayErrors) {
                                        cancelAll();
                                        this.errors.tryTerminateConsumer(pVar);
                                        return;
                                    } else {
                                        t6 = null;
                                        z7 = true;
                                    }
                                }
                            } else {
                                t6 = null;
                            }
                            if (t6 == null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z7 && z5) {
                                cancelAll();
                                this.errors.tryTerminateConsumer(pVar);
                                return;
                            } else if (!z5) {
                                objArr[i6] = t6;
                            } else {
                                z6 = true;
                            }
                        }
                    }
                    if (z6) {
                        break;
                    }
                    try {
                        R apply = this.zipper.apply(objArr.clone());
                        Objects.requireNonNull(apply, "The zipper returned a null value");
                        pVar.onNext(apply);
                        j6++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        cancelAll();
                        this.errors.tryAddThrowableOrReport(th2);
                        this.errors.tryTerminateConsumer(pVar);
                        return;
                    }
                }
                if (j5 == j6) {
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        this.errors.tryTerminateConsumer(pVar);
                        return;
                    }
                    for (int i7 = 0; i7 < length; i7++) {
                        b<T, R> bVar2 = bVarArr[i7];
                        if (objArr[i7] == null) {
                            boolean z8 = bVar2.done;
                            io.reactivex.rxjava3.internal.fuseable.q<T> qVar2 = bVar2.queue;
                            if (qVar2 != null) {
                                try {
                                    t5 = qVar2.poll();
                                } catch (Throwable th3) {
                                    io.reactivex.rxjava3.exceptions.b.b(th3);
                                    this.errors.tryAddThrowableOrReport(th3);
                                    if (!this.delayErrors) {
                                        cancelAll();
                                        this.errors.tryTerminateConsumer(pVar);
                                        return;
                                    } else {
                                        t5 = null;
                                        z8 = true;
                                    }
                                }
                            } else {
                                t5 = null;
                            }
                            if (t5 == null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z8 && z4) {
                                cancelAll();
                                this.errors.tryTerminateConsumer(pVar);
                                return;
                            } else if (!z4) {
                                objArr[i7] = t5;
                            }
                        }
                    }
                }
                if (j6 != 0) {
                    for (b<T, R> bVar3 : bVarArr) {
                        bVar3.request(j6);
                    }
                    if (j5 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j6);
                    }
                }
                i5 = addAndGet(-i5);
            } while (i5 != 0);
        }

        void error(b<T, R> bVar, Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                bVar.done = true;
                drain();
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
        }

        void subscribe(org.reactivestreams.o<? extends T>[] oVarArr, int i5) {
            b<T, R>[] bVarArr = this.subscribers;
            for (int i6 = 0; i6 < i5 && !this.cancelled; i6++) {
                if (this.delayErrors || this.errors.get() == null) {
                    oVarArr[i6].subscribe(bVarArr[i6]);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T, R> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final a<T, R> parent;
        final int prefetch;
        long produced;
        io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        int sourceMode;

        b(a<T, R> aVar, int i5) {
            this.parent = aVar;
            this.prefetch = i5;
            this.limit = i5 - (i5 >> 2);
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.parent.error(this, th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.sourceMode != 2) {
                this.queue.offer(t5);
            }
            this.parent.drain();
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar)) {
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                    int requestFusion = nVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = nVar;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = nVar;
                        qVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.prefetch);
                qVar.request(this.prefetch);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (this.sourceMode != 1) {
                long j6 = this.produced + j5;
                if (j6 >= this.limit) {
                    this.produced = 0L;
                    get().request(j6);
                } else {
                    this.produced = j6;
                }
            }
        }
    }

    public e5(org.reactivestreams.o<? extends T>[] oVarArr, Iterable<? extends org.reactivestreams.o<? extends T>> iterable, m3.o<? super Object[], ? extends R> oVar, int i5, boolean z4) {
        this.f16726b = oVarArr;
        this.f16727c = iterable;
        this.f16728d = oVar;
        this.f16729e = i5;
        this.f16730f = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super R> pVar) {
        int length;
        org.reactivestreams.o<? extends T>[] oVarArr = this.f16726b;
        if (oVarArr == null) {
            oVarArr = new org.reactivestreams.o[8];
            length = 0;
            for (org.reactivestreams.o<? extends T> oVar : this.f16727c) {
                if (length == oVarArr.length) {
                    org.reactivestreams.o<? extends T>[] oVarArr2 = new org.reactivestreams.o[(length >> 2) + length];
                    System.arraycopy(oVarArr, 0, oVarArr2, 0, length);
                    oVarArr = oVarArr2;
                }
                oVarArr[length] = oVar;
                length++;
            }
        } else {
            length = oVarArr.length;
        }
        int i5 = length;
        if (i5 == 0) {
            io.reactivex.rxjava3.internal.subscriptions.g.complete(pVar);
            return;
        }
        a aVar = new a(pVar, this.f16728d, i5, this.f16729e, this.f16730f);
        pVar.onSubscribe(aVar);
        aVar.subscribe(oVarArr, i5);
    }
}
