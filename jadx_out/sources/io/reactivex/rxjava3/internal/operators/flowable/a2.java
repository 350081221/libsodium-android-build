package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.t1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a2<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<TLeft, R> {

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<? extends TRight> f16603c;

    /* renamed from: d, reason: collision with root package name */
    final m3.o<? super TLeft, ? extends org.reactivestreams.o<TLeftEnd>> f16604d;

    /* renamed from: e, reason: collision with root package name */
    final m3.o<? super TRight, ? extends org.reactivestreams.o<TRightEnd>> f16605e;

    /* renamed from: f, reason: collision with root package name */
    final m3.c<? super TLeft, ? super TRight, ? extends R> f16606f;

    /* loaded from: classes3.dex */
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements org.reactivestreams.q, t1.b {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final org.reactivestreams.p<? super R> downstream;
        final m3.o<? super TLeft, ? extends org.reactivestreams.o<TLeftEnd>> leftEnd;
        int leftIndex;
        final m3.c<? super TLeft, ? super TRight, ? extends R> resultSelector;
        final m3.o<? super TRight, ? extends org.reactivestreams.o<TRightEnd>> rightEnd;
        int rightIndex;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_VALUE = 2;
        static final Integer LEFT_CLOSE = 3;
        static final Integer RIGHT_CLOSE = 4;
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.disposables.c disposables = new io.reactivex.rxjava3.disposables.c();
        final io.reactivex.rxjava3.internal.queue.c<Object> queue = new io.reactivex.rxjava3.internal.queue.c<>(io.reactivex.rxjava3.core.o.c0());
        final Map<Integer, TLeft> lefts = new LinkedHashMap();
        final Map<Integer, TRight> rights = new LinkedHashMap();
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger active = new AtomicInteger(2);

        a(org.reactivestreams.p<? super R> pVar, m3.o<? super TLeft, ? extends org.reactivestreams.o<TLeftEnd>> oVar, m3.o<? super TRight, ? extends org.reactivestreams.o<TRightEnd>> oVar2, m3.c<? super TLeft, ? super TRight, ? extends R> cVar) {
            this.downstream = pVar;
            this.leftEnd = oVar;
            this.rightEnd = oVar2;
            this.resultSelector = cVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        void cancelAll() {
            this.disposables.dispose();
        }

        void drain() {
            boolean z4;
            boolean z5;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.queue.c<Object> cVar = this.queue;
            org.reactivestreams.p<? super R> pVar = this.downstream;
            boolean z6 = true;
            int i5 = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    cVar.clear();
                    cancelAll();
                    errorAll(pVar);
                    return;
                }
                if (this.active.get() == 0) {
                    z4 = z6;
                } else {
                    z4 = false;
                }
                Integer num = (Integer) cVar.poll();
                if (num == null) {
                    z5 = z6;
                } else {
                    z5 = false;
                }
                if (z4 && z5) {
                    this.lefts.clear();
                    this.rights.clear();
                    this.disposables.dispose();
                    pVar.onComplete();
                    return;
                }
                if (z5) {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else {
                    Object poll = cVar.poll();
                    if (num == LEFT_VALUE) {
                        int i6 = this.leftIndex;
                        this.leftIndex = i6 + 1;
                        this.lefts.put(Integer.valueOf(i6), poll);
                        try {
                            org.reactivestreams.o apply = this.leftEnd.apply(poll);
                            Objects.requireNonNull(apply, "The leftEnd returned a null Publisher");
                            org.reactivestreams.o oVar = apply;
                            t1.c cVar2 = new t1.c(this, z6, i6);
                            this.disposables.b(cVar2);
                            oVar.subscribe(cVar2);
                            if (this.error.get() != null) {
                                cVar.clear();
                                cancelAll();
                                errorAll(pVar);
                                return;
                            }
                            long j5 = this.requested.get();
                            Iterator<TRight> it = this.rights.values().iterator();
                            long j6 = 0;
                            while (it.hasNext()) {
                                try {
                                    R apply2 = this.resultSelector.apply(poll, it.next());
                                    Objects.requireNonNull(apply2, "The resultSelector returned a null value");
                                    if (j6 != j5) {
                                        pVar.onNext(apply2);
                                        j6++;
                                    } else {
                                        io.reactivex.rxjava3.internal.util.k.a(this.error, new io.reactivex.rxjava3.exceptions.c("Could not emit value due to lack of requests"));
                                        cVar.clear();
                                        cancelAll();
                                        errorAll(pVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    fail(th, pVar, cVar);
                                    return;
                                }
                            }
                            if (j6 != 0) {
                                io.reactivex.rxjava3.internal.util.d.e(this.requested, j6);
                            }
                        } catch (Throwable th2) {
                            fail(th2, pVar, cVar);
                            return;
                        }
                    } else if (num == RIGHT_VALUE) {
                        int i7 = this.rightIndex;
                        this.rightIndex = i7 + 1;
                        this.rights.put(Integer.valueOf(i7), poll);
                        try {
                            org.reactivestreams.o apply3 = this.rightEnd.apply(poll);
                            Objects.requireNonNull(apply3, "The rightEnd returned a null Publisher");
                            org.reactivestreams.o oVar2 = apply3;
                            t1.c cVar3 = new t1.c(this, false, i7);
                            this.disposables.b(cVar3);
                            oVar2.subscribe(cVar3);
                            if (this.error.get() != null) {
                                cVar.clear();
                                cancelAll();
                                errorAll(pVar);
                                return;
                            }
                            long j7 = this.requested.get();
                            Iterator<TLeft> it2 = this.lefts.values().iterator();
                            long j8 = 0;
                            while (it2.hasNext()) {
                                try {
                                    R apply4 = this.resultSelector.apply(it2.next(), poll);
                                    Objects.requireNonNull(apply4, "The resultSelector returned a null value");
                                    if (j8 != j7) {
                                        pVar.onNext(apply4);
                                        j8++;
                                    } else {
                                        io.reactivex.rxjava3.internal.util.k.a(this.error, new io.reactivex.rxjava3.exceptions.c("Could not emit value due to lack of requests"));
                                        cVar.clear();
                                        cancelAll();
                                        errorAll(pVar);
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    fail(th3, pVar, cVar);
                                    return;
                                }
                            }
                            if (j8 != 0) {
                                io.reactivex.rxjava3.internal.util.d.e(this.requested, j8);
                            }
                        } catch (Throwable th4) {
                            fail(th4, pVar, cVar);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        t1.c cVar4 = (t1.c) poll;
                        this.lefts.remove(Integer.valueOf(cVar4.index));
                        this.disposables.a(cVar4);
                    } else {
                        t1.c cVar5 = (t1.c) poll;
                        this.rights.remove(Integer.valueOf(cVar5.index));
                        this.disposables.a(cVar5);
                    }
                    z6 = true;
                }
            }
            cVar.clear();
        }

        void errorAll(org.reactivestreams.p<?> pVar) {
            Throwable f5 = io.reactivex.rxjava3.internal.util.k.f(this.error);
            this.lefts.clear();
            this.rights.clear();
            pVar.onError(f5);
        }

        void fail(Throwable th, org.reactivestreams.p<?> pVar, io.reactivex.rxjava3.internal.fuseable.q<?> qVar) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.util.k.a(this.error, th);
            qVar.clear();
            cancelAll();
            errorAll(pVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.t1.b
        public void innerClose(boolean z4, t1.c cVar) {
            Integer num;
            synchronized (this) {
                io.reactivex.rxjava3.internal.queue.c<Object> cVar2 = this.queue;
                if (z4) {
                    num = LEFT_CLOSE;
                } else {
                    num = RIGHT_CLOSE;
                }
                cVar2.offer(num, cVar);
            }
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.t1.b
        public void innerCloseError(Throwable th) {
            if (io.reactivex.rxjava3.internal.util.k.a(this.error, th)) {
                drain();
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.t1.b
        public void innerComplete(t1.d dVar) {
            this.disposables.c(dVar);
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.t1.b
        public void innerError(Throwable th) {
            if (io.reactivex.rxjava3.internal.util.k.a(this.error, th)) {
                this.active.decrementAndGet();
                drain();
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.t1.b
        public void innerValue(boolean z4, Object obj) {
            Integer num;
            synchronized (this) {
                io.reactivex.rxjava3.internal.queue.c<Object> cVar = this.queue;
                if (z4) {
                    num = LEFT_VALUE;
                } else {
                    num = RIGHT_VALUE;
                }
                cVar.offer(num, obj);
            }
            drain();
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
            }
        }
    }

    public a2(io.reactivex.rxjava3.core.o<TLeft> oVar, org.reactivestreams.o<? extends TRight> oVar2, m3.o<? super TLeft, ? extends org.reactivestreams.o<TLeftEnd>> oVar3, m3.o<? super TRight, ? extends org.reactivestreams.o<TRightEnd>> oVar4, m3.c<? super TLeft, ? super TRight, ? extends R> cVar) {
        super(oVar);
        this.f16603c = oVar2;
        this.f16604d = oVar3;
        this.f16605e = oVar4;
        this.f16606f = cVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        a aVar = new a(pVar, this.f16604d, this.f16605e, this.f16606f);
        pVar.onSubscribe(aVar);
        t1.d dVar = new t1.d(aVar, true);
        aVar.disposables.b(dVar);
        t1.d dVar2 = new t1.d(aVar, false);
        aVar.disposables.b(dVar2);
        this.f16598b.N6(dVar);
        this.f16603c.subscribe(dVar2);
    }
}
