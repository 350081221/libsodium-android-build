package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class t1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<TLeft, R> {

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<? extends TRight> f17058c;

    /* renamed from: d, reason: collision with root package name */
    final m3.o<? super TLeft, ? extends org.reactivestreams.o<TLeftEnd>> f17059d;

    /* renamed from: e, reason: collision with root package name */
    final m3.o<? super TRight, ? extends org.reactivestreams.o<TRightEnd>> f17060e;

    /* renamed from: f, reason: collision with root package name */
    final m3.c<? super TLeft, ? super io.reactivex.rxjava3.core.o<TRight>, ? extends R> f17061f;

    /* loaded from: classes3.dex */
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements org.reactivestreams.q, b {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final org.reactivestreams.p<? super R> downstream;
        final m3.o<? super TLeft, ? extends org.reactivestreams.o<TLeftEnd>> leftEnd;
        int leftIndex;
        final m3.c<? super TLeft, ? super io.reactivex.rxjava3.core.o<TRight>, ? extends R> resultSelector;
        final m3.o<? super TRight, ? extends org.reactivestreams.o<TRightEnd>> rightEnd;
        int rightIndex;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_VALUE = 2;
        static final Integer LEFT_CLOSE = 3;
        static final Integer RIGHT_CLOSE = 4;
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.disposables.c disposables = new io.reactivex.rxjava3.disposables.c();
        final io.reactivex.rxjava3.internal.queue.c<Object> queue = new io.reactivex.rxjava3.internal.queue.c<>(io.reactivex.rxjava3.core.o.c0());
        final Map<Integer, io.reactivex.rxjava3.processors.h<TRight>> lefts = new LinkedHashMap();
        final Map<Integer, TRight> rights = new LinkedHashMap();
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger active = new AtomicInteger(2);

        a(org.reactivestreams.p<? super R> pVar, m3.o<? super TLeft, ? extends org.reactivestreams.o<TLeftEnd>> oVar, m3.o<? super TRight, ? extends org.reactivestreams.o<TRightEnd>> oVar2, m3.c<? super TLeft, ? super io.reactivex.rxjava3.core.o<TRight>, ? extends R> cVar) {
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
            int i5 = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    cVar.clear();
                    cancelAll();
                    errorAll(pVar);
                    return;
                }
                if (this.active.get() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Integer num = (Integer) cVar.poll();
                if (num == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z4 && z5) {
                    Iterator<io.reactivex.rxjava3.processors.h<TRight>> it = this.lefts.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
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
                        io.reactivex.rxjava3.processors.h t9 = io.reactivex.rxjava3.processors.h.t9();
                        int i6 = this.leftIndex;
                        this.leftIndex = i6 + 1;
                        this.lefts.put(Integer.valueOf(i6), t9);
                        try {
                            org.reactivestreams.o apply = this.leftEnd.apply(poll);
                            Objects.requireNonNull(apply, "The leftEnd returned a null Publisher");
                            org.reactivestreams.o oVar = apply;
                            c cVar2 = new c(this, true, i6);
                            this.disposables.b(cVar2);
                            oVar.subscribe(cVar2);
                            if (this.error.get() != null) {
                                cVar.clear();
                                cancelAll();
                                errorAll(pVar);
                                return;
                            }
                            try {
                                R apply2 = this.resultSelector.apply(poll, t9);
                                Objects.requireNonNull(apply2, "The resultSelector returned a null value");
                                if (this.requested.get() != 0) {
                                    pVar.onNext(apply2);
                                    io.reactivex.rxjava3.internal.util.d.e(this.requested, 1L);
                                    Iterator<TRight> it2 = this.rights.values().iterator();
                                    while (it2.hasNext()) {
                                        t9.onNext(it2.next());
                                    }
                                } else {
                                    fail(new io.reactivex.rxjava3.exceptions.c("Could not emit value due to lack of requests"), pVar, cVar);
                                    return;
                                }
                            } catch (Throwable th) {
                                fail(th, pVar, cVar);
                                return;
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
                            c cVar3 = new c(this, false, i7);
                            this.disposables.b(cVar3);
                            oVar2.subscribe(cVar3);
                            if (this.error.get() != null) {
                                cVar.clear();
                                cancelAll();
                                errorAll(pVar);
                                return;
                            } else {
                                Iterator<io.reactivex.rxjava3.processors.h<TRight>> it3 = this.lefts.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(poll);
                                }
                            }
                        } catch (Throwable th3) {
                            fail(th3, pVar, cVar);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        c cVar4 = (c) poll;
                        io.reactivex.rxjava3.processors.h<TRight> remove = this.lefts.remove(Integer.valueOf(cVar4.index));
                        this.disposables.a(cVar4);
                        if (remove != null) {
                            remove.onComplete();
                        }
                    } else {
                        c cVar5 = (c) poll;
                        this.rights.remove(Integer.valueOf(cVar5.index));
                        this.disposables.a(cVar5);
                    }
                }
            }
            cVar.clear();
        }

        void errorAll(org.reactivestreams.p<?> pVar) {
            Throwable f5 = io.reactivex.rxjava3.internal.util.k.f(this.error);
            Iterator<io.reactivex.rxjava3.processors.h<TRight>> it = this.lefts.values().iterator();
            while (it.hasNext()) {
                it.next().onError(f5);
            }
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
        public void innerClose(boolean z4, c cVar) {
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
        public void innerComplete(d dVar) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface b {
        void innerClose(boolean z4, c cVar);

        void innerCloseError(Throwable th);

        void innerComplete(d dVar);

        void innerError(Throwable th);

        void innerValue(boolean z4, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<Object>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 1883890389173668373L;
        final int index;
        final boolean isLeft;
        final b parent;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(b bVar, boolean z4, int i5) {
            this.parent = bVar;
            this.isLeft = z4;
            this.index = i5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.parent.innerClose(this.isLeft, this);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.parent.innerCloseError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.cancel(this)) {
                this.parent.innerClose(this.isLeft, this);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
        }
    }

    /* loaded from: classes3.dex */
    static final class d extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<Object>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 1883890389173668373L;
        final boolean isLeft;
        final b parent;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(b bVar, boolean z4) {
            this.parent = bVar;
            this.isLeft = z4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.parent.innerComplete(this);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
            this.parent.innerValue(this.isLeft, obj);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
        }
    }

    public t1(io.reactivex.rxjava3.core.o<TLeft> oVar, org.reactivestreams.o<? extends TRight> oVar2, m3.o<? super TLeft, ? extends org.reactivestreams.o<TLeftEnd>> oVar3, m3.o<? super TRight, ? extends org.reactivestreams.o<TRightEnd>> oVar4, m3.c<? super TLeft, ? super io.reactivex.rxjava3.core.o<TRight>, ? extends R> cVar) {
        super(oVar);
        this.f17058c = oVar2;
        this.f17059d = oVar3;
        this.f17060e = oVar4;
        this.f17061f = cVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        a aVar = new a(pVar, this.f17059d, this.f17060e, this.f17061f);
        pVar.onSubscribe(aVar);
        d dVar = new d(aVar, true);
        aVar.disposables.b(dVar);
        d dVar2 = new d(aVar, false);
        aVar.disposables.b(dVar2);
        this.f16598b.N6(dVar);
        this.f17058c.subscribe(dVar2);
    }
}
