package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class o1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.rxjava3.internal.operators.observable.a<TLeft, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends TRight> f17915b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super TLeft, ? extends io.reactivex.rxjava3.core.n0<TLeftEnd>> f17916c;

    /* renamed from: d, reason: collision with root package name */
    final m3.o<? super TRight, ? extends io.reactivex.rxjava3.core.n0<TRightEnd>> f17917d;

    /* renamed from: e, reason: collision with root package name */
    final m3.c<? super TLeft, ? super io.reactivex.rxjava3.core.i0<TRight>, ? extends R> f17918e;

    /* loaded from: classes3.dex */
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e, b {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final io.reactivex.rxjava3.core.p0<? super R> downstream;
        final m3.o<? super TLeft, ? extends io.reactivex.rxjava3.core.n0<TLeftEnd>> leftEnd;
        int leftIndex;
        final m3.c<? super TLeft, ? super io.reactivex.rxjava3.core.i0<TRight>, ? extends R> resultSelector;
        final m3.o<? super TRight, ? extends io.reactivex.rxjava3.core.n0<TRightEnd>> rightEnd;
        int rightIndex;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_VALUE = 2;
        static final Integer LEFT_CLOSE = 3;
        static final Integer RIGHT_CLOSE = 4;
        final io.reactivex.rxjava3.disposables.c disposables = new io.reactivex.rxjava3.disposables.c();
        final io.reactivex.rxjava3.internal.queue.c<Object> queue = new io.reactivex.rxjava3.internal.queue.c<>(io.reactivex.rxjava3.core.i0.Z());
        final Map<Integer, io.reactivex.rxjava3.subjects.j<TRight>> lefts = new LinkedHashMap();
        final Map<Integer, TRight> rights = new LinkedHashMap();
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger active = new AtomicInteger(2);

        a(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super TLeft, ? extends io.reactivex.rxjava3.core.n0<TLeftEnd>> oVar, m3.o<? super TRight, ? extends io.reactivex.rxjava3.core.n0<TRightEnd>> oVar2, m3.c<? super TLeft, ? super io.reactivex.rxjava3.core.i0<TRight>, ? extends R> cVar) {
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
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                this.queue.clear();
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
                    Iterator<io.reactivex.rxjava3.subjects.j<TRight>> it = this.lefts.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
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
                        io.reactivex.rxjava3.subjects.j N8 = io.reactivex.rxjava3.subjects.j.N8();
                        int i6 = this.leftIndex;
                        this.leftIndex = i6 + 1;
                        this.lefts.put(Integer.valueOf(i6), N8);
                        try {
                            io.reactivex.rxjava3.core.n0 apply = this.leftEnd.apply(poll);
                            Objects.requireNonNull(apply, "The leftEnd returned a null ObservableSource");
                            io.reactivex.rxjava3.core.n0 n0Var = apply;
                            c cVar2 = new c(this, true, i6);
                            this.disposables.b(cVar2);
                            n0Var.subscribe(cVar2);
                            if (this.error.get() != null) {
                                cVar.clear();
                                cancelAll();
                                errorAll(p0Var);
                                return;
                            }
                            try {
                                R apply2 = this.resultSelector.apply(poll, N8);
                                Objects.requireNonNull(apply2, "The resultSelector returned a null value");
                                p0Var.onNext(apply2);
                                Iterator<TRight> it2 = this.rights.values().iterator();
                                while (it2.hasNext()) {
                                    N8.onNext(it2.next());
                                }
                            } catch (Throwable th) {
                                fail(th, p0Var, cVar);
                                return;
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
                            c cVar3 = new c(this, false, i7);
                            this.disposables.b(cVar3);
                            n0Var2.subscribe(cVar3);
                            if (this.error.get() != null) {
                                cVar.clear();
                                cancelAll();
                                errorAll(p0Var);
                                return;
                            } else {
                                Iterator<io.reactivex.rxjava3.subjects.j<TRight>> it3 = this.lefts.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(poll);
                                }
                            }
                        } catch (Throwable th3) {
                            fail(th3, p0Var, cVar);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        c cVar4 = (c) poll;
                        io.reactivex.rxjava3.subjects.j<TRight> remove = this.lefts.remove(Integer.valueOf(cVar4.index));
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

        void errorAll(io.reactivex.rxjava3.core.p0<?> p0Var) {
            Throwable f5 = io.reactivex.rxjava3.internal.util.k.f(this.error);
            Iterator<io.reactivex.rxjava3.subjects.j<TRight>> it = this.lefts.values().iterator();
            while (it.hasNext()) {
                it.next().onError(f5);
            }
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

        @Override // io.reactivex.rxjava3.internal.operators.observable.o1.b
        public void innerCloseError(Throwable th) {
            if (io.reactivex.rxjava3.internal.util.k.a(this.error, th)) {
                drain();
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.o1.b
        public void innerComplete(d dVar) {
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
    public static final class c extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<Object>, io.reactivex.rxjava3.disposables.e {
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
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.parent.innerClose(this.isLeft, this);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.parent.innerCloseError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(Object obj) {
            if (io.reactivex.rxjava3.internal.disposables.c.dispose(this)) {
                this.parent.innerClose(this.isLeft, this);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }
    }

    /* loaded from: classes3.dex */
    static final class d extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<Object>, io.reactivex.rxjava3.disposables.e {
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
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.parent.innerComplete(this);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(Object obj) {
            this.parent.innerValue(this.isLeft, obj);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }
    }

    public o1(io.reactivex.rxjava3.core.n0<TLeft> n0Var, io.reactivex.rxjava3.core.n0<? extends TRight> n0Var2, m3.o<? super TLeft, ? extends io.reactivex.rxjava3.core.n0<TLeftEnd>> oVar, m3.o<? super TRight, ? extends io.reactivex.rxjava3.core.n0<TRightEnd>> oVar2, m3.c<? super TLeft, ? super io.reactivex.rxjava3.core.i0<TRight>, ? extends R> cVar) {
        super(n0Var);
        this.f17915b = n0Var2;
        this.f17916c = oVar;
        this.f17917d = oVar2;
        this.f17918e = cVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        a aVar = new a(p0Var, this.f17916c, this.f17917d, this.f17918e);
        p0Var.onSubscribe(aVar);
        d dVar = new d(aVar, true);
        aVar.disposables.b(dVar);
        d dVar2 = new d(aVar, false);
        aVar.disposables.b(dVar2);
        this.f17528a.subscribe(dVar);
        this.f17915b.subscribe(dVar2);
    }
}
