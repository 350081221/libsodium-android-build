package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.operators.observable.o1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class v1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.rxjava3.internal.operators.observable.a<TLeft, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends TRight> f18130b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super TLeft, ? extends io.reactivex.rxjava3.core.n0<TLeftEnd>> f18131c;

    /* renamed from: d, reason: collision with root package name */
    final m3.o<? super TRight, ? extends io.reactivex.rxjava3.core.n0<TRightEnd>> f18132d;

    /* renamed from: e, reason: collision with root package name */
    final m3.c<? super TLeft, ? super TRight, ? extends R> f18133e;

    /* loaded from: classes3.dex */
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e, o1.b {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final io.reactivex.rxjava3.core.p0<? super R> downstream;
        final m3.o<? super TLeft, ? extends io.reactivex.rxjava3.core.n0<TLeftEnd>> leftEnd;
        int leftIndex;
        final m3.c<? super TLeft, ? super TRight, ? extends R> resultSelector;
        final m3.o<? super TRight, ? extends io.reactivex.rxjava3.core.n0<TRightEnd>> rightEnd;
        int rightIndex;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_VALUE = 2;
        static final Integer LEFT_CLOSE = 3;
        static final Integer RIGHT_CLOSE = 4;
        final io.reactivex.rxjava3.disposables.c disposables = new io.reactivex.rxjava3.disposables.c();
        final io.reactivex.rxjava3.internal.queue.c<Object> queue = new io.reactivex.rxjava3.internal.queue.c<>(io.reactivex.rxjava3.core.i0.Z());
        final Map<Integer, TLeft> lefts = new LinkedHashMap();
        final Map<Integer, TRight> rights = new LinkedHashMap();
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger active = new AtomicInteger(2);

        a(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super TLeft, ? extends io.reactivex.rxjava3.core.n0<TLeftEnd>> oVar, m3.o<? super TRight, ? extends io.reactivex.rxjava3.core.n0<TRightEnd>> oVar2, m3.c<? super TLeft, ? super TRight, ? extends R> cVar) {
            this.downstream = p0Var;
            this.leftEnd = oVar;
            this.rightEnd = oVar2;
            this.resultSelector = cVar;
        }

        void cancelAll() {
            this.disposables.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        void drain() {
            boolean z4;
            boolean z5;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.queue.c<?> cVar = this.queue;
            io.reactivex.rxjava3.core.p0<? super R> p0Var = this.downstream;
            int i5 = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    cVar.clear();
                    cancelAll();
                    errorAll(p0Var);
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
                    this.lefts.clear();
                    this.rights.clear();
                    this.disposables.dispose();
                    p0Var.onComplete();
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
                            io.reactivex.rxjava3.core.n0 apply = this.leftEnd.apply(poll);
                            Objects.requireNonNull(apply, "The leftEnd returned a null ObservableSource");
                            io.reactivex.rxjava3.core.n0 n0Var = apply;
                            o1.c cVar2 = new o1.c(this, true, i6);
                            this.disposables.b(cVar2);
                            n0Var.subscribe(cVar2);
                            if (this.error.get() != null) {
                                cVar.clear();
                                cancelAll();
                                errorAll(p0Var);
                                return;
                            }
                            Iterator<TRight> it = this.rights.values().iterator();
                            while (it.hasNext()) {
                                try {
                                    R apply2 = this.resultSelector.apply(poll, it.next());
                                    Objects.requireNonNull(apply2, "The resultSelector returned a null value");
                                    p0Var.onNext(apply2);
                                } catch (Throwable th) {
                                    fail(th, p0Var, cVar);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            fail(th2, p0Var, cVar);
                            return;
                        }
                    } else if (num == RIGHT_VALUE) {
                        int i7 = this.rightIndex;
                        this.rightIndex = i7 + 1;
                        this.rights.put(Integer.valueOf(i7), poll);
                        try {
                            io.reactivex.rxjava3.core.n0 apply3 = this.rightEnd.apply(poll);
                            Objects.requireNonNull(apply3, "The rightEnd returned a null ObservableSource");
                            io.reactivex.rxjava3.core.n0 n0Var2 = apply3;
                            o1.c cVar3 = new o1.c(this, false, i7);
                            this.disposables.b(cVar3);
                            n0Var2.subscribe(cVar3);
                            if (this.error.get() != null) {
                                cVar.clear();
                                cancelAll();
                                errorAll(p0Var);
                                return;
                            }
                            Iterator<TLeft> it2 = this.lefts.values().iterator();
                            while (it2.hasNext()) {
                                try {
                                    R apply4 = this.resultSelector.apply(it2.next(), poll);
                                    Objects.requireNonNull(apply4, "The resultSelector returned a null value");
                                    p0Var.onNext(apply4);
                                } catch (Throwable th3) {
                                    fail(th3, p0Var, cVar);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            fail(th4, p0Var, cVar);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        o1.c cVar4 = (o1.c) poll;
                        this.lefts.remove(Integer.valueOf(cVar4.index));
                        this.disposables.a(cVar4);
                    } else {
                        o1.c cVar5 = (o1.c) poll;
                        this.rights.remove(Integer.valueOf(cVar5.index));
                        this.disposables.a(cVar5);
                    }
                }
            }
            cVar.clear();
        }

        void errorAll(io.reactivex.rxjava3.core.p0<?> p0Var) {
            Throwable f5 = io.reactivex.rxjava3.internal.util.k.f(this.error);
            this.lefts.clear();
            this.rights.clear();
            p0Var.onError(f5);
        }

        void fail(Throwable th, io.reactivex.rxjava3.core.p0<?> p0Var, io.reactivex.rxjava3.internal.queue.c<?> cVar) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.util.k.a(this.error, th);
            cVar.clear();
            cancelAll();
            errorAll(p0Var);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.o1.b
        public void innerClose(boolean z4, o1.c cVar) {
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

        @Override // io.reactivex.rxjava3.internal.operators.observable.o1.b
        public void innerCloseError(Throwable th) {
            if (io.reactivex.rxjava3.internal.util.k.a(this.error, th)) {
                drain();
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.o1.b
        public void innerComplete(o1.d dVar) {
            this.disposables.c(dVar);
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.o1.b
        public void innerError(Throwable th) {
            if (io.reactivex.rxjava3.internal.util.k.a(this.error, th)) {
                this.active.decrementAndGet();
                drain();
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.o1.b
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

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }
    }

    public v1(io.reactivex.rxjava3.core.n0<TLeft> n0Var, io.reactivex.rxjava3.core.n0<? extends TRight> n0Var2, m3.o<? super TLeft, ? extends io.reactivex.rxjava3.core.n0<TLeftEnd>> oVar, m3.o<? super TRight, ? extends io.reactivex.rxjava3.core.n0<TRightEnd>> oVar2, m3.c<? super TLeft, ? super TRight, ? extends R> cVar) {
        super(n0Var);
        this.f18130b = n0Var2;
        this.f18131c = oVar;
        this.f18132d = oVar2;
        this.f18133e = cVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        a aVar = new a(p0Var, this.f18131c, this.f18132d, this.f18133e);
        p0Var.onSubscribe(aVar);
        o1.d dVar = new o1.d(aVar, true);
        aVar.disposables.b(dVar);
        o1.d dVar2 = new o1.d(aVar, false);
        aVar.disposables.b(dVar2);
        this.f17528a.subscribe(dVar);
        this.f18130b.subscribe(dVar2);
    }
}
