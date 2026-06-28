package io.reactivex.rxjava3.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class v<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> f18124b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f18125c;

    /* renamed from: d, reason: collision with root package name */
    final int f18126d;

    /* renamed from: e, reason: collision with root package name */
    final int f18127e;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, io.reactivex.rxjava3.internal.observers.u<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        int activeCount;
        volatile boolean cancelled;
        io.reactivex.rxjava3.internal.observers.t<R> current;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super R> downstream;
        final io.reactivex.rxjava3.internal.util.j errorMode;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        int sourceMode;
        io.reactivex.rxjava3.disposables.e upstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final ArrayDeque<io.reactivex.rxjava3.internal.observers.t<R>> observers = new ArrayDeque<>();

        a(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> oVar, int i5, int i6, io.reactivex.rxjava3.internal.util.j jVar) {
            this.downstream = p0Var;
            this.mapper = oVar;
            this.maxConcurrency = i5;
            this.prefetch = i6;
            this.errorMode = jVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            this.errors.tryTerminateAndReport();
            drainAndDispose();
        }

        void disposeAll() {
            io.reactivex.rxjava3.internal.observers.t<R> tVar = this.current;
            if (tVar != null) {
                tVar.dispose();
            }
            while (true) {
                io.reactivex.rxjava3.internal.observers.t<R> poll = this.observers.poll();
                if (poll == null) {
                    return;
                } else {
                    poll.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.u
        public void drain() {
            R poll;
            boolean z4;
            boolean z5;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.queue;
            ArrayDeque<io.reactivex.rxjava3.internal.observers.t<R>> arrayDeque = this.observers;
            io.reactivex.rxjava3.core.p0<? super R> p0Var = this.downstream;
            io.reactivex.rxjava3.internal.util.j jVar = this.errorMode;
            int i5 = 1;
            while (true) {
                int i6 = this.activeCount;
                while (i6 != this.maxConcurrency) {
                    if (this.cancelled) {
                        qVar.clear();
                        disposeAll();
                        return;
                    }
                    if (jVar == io.reactivex.rxjava3.internal.util.j.IMMEDIATE && this.errors.get() != null) {
                        qVar.clear();
                        disposeAll();
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    try {
                        T poll2 = qVar.poll();
                        if (poll2 == null) {
                            break;
                        }
                        io.reactivex.rxjava3.core.n0<? extends R> apply = this.mapper.apply(poll2);
                        Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                        io.reactivex.rxjava3.core.n0<? extends R> n0Var = apply;
                        io.reactivex.rxjava3.internal.observers.t<R> tVar = new io.reactivex.rxjava3.internal.observers.t<>(this, this.prefetch);
                        arrayDeque.offer(tVar);
                        n0Var.subscribe(tVar);
                        i6++;
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.upstream.dispose();
                        qVar.clear();
                        disposeAll();
                        this.errors.tryAddThrowableOrReport(th);
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                }
                this.activeCount = i6;
                if (this.cancelled) {
                    qVar.clear();
                    disposeAll();
                    return;
                }
                if (jVar == io.reactivex.rxjava3.internal.util.j.IMMEDIATE && this.errors.get() != null) {
                    qVar.clear();
                    disposeAll();
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                }
                io.reactivex.rxjava3.internal.observers.t<R> tVar2 = this.current;
                if (tVar2 == null) {
                    if (jVar == io.reactivex.rxjava3.internal.util.j.BOUNDARY && this.errors.get() != null) {
                        qVar.clear();
                        disposeAll();
                        this.errors.tryTerminateConsumer(p0Var);
                        return;
                    }
                    boolean z6 = this.done;
                    io.reactivex.rxjava3.internal.observers.t<R> poll3 = arrayDeque.poll();
                    if (poll3 == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z6 && z5) {
                        if (this.errors.get() != null) {
                            qVar.clear();
                            disposeAll();
                            this.errors.tryTerminateConsumer(p0Var);
                            return;
                        }
                        p0Var.onComplete();
                        return;
                    }
                    if (!z5) {
                        this.current = poll3;
                    }
                    tVar2 = poll3;
                }
                if (tVar2 != null) {
                    io.reactivex.rxjava3.internal.fuseable.q<R> queue = tVar2.queue();
                    while (!this.cancelled) {
                        boolean isDone = tVar2.isDone();
                        if (jVar == io.reactivex.rxjava3.internal.util.j.IMMEDIATE && this.errors.get() != null) {
                            qVar.clear();
                            disposeAll();
                            this.errors.tryTerminateConsumer(p0Var);
                            return;
                        }
                        try {
                            poll = queue.poll();
                            if (poll == null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.b.b(th2);
                            this.errors.tryAddThrowableOrReport(th2);
                            this.current = null;
                            this.activeCount--;
                        }
                        if (isDone && z4) {
                            this.current = null;
                            this.activeCount--;
                        } else if (!z4) {
                            p0Var.onNext(poll);
                        }
                    }
                    qVar.clear();
                    disposeAll();
                    return;
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
        }

        void drainAndDispose() {
            if (getAndIncrement() != 0) {
                return;
            }
            do {
                this.queue.clear();
                disposeAll();
            } while (decrementAndGet() != 0);
        }

        @Override // io.reactivex.rxjava3.internal.observers.u
        public void innerComplete(io.reactivex.rxjava3.internal.observers.t<R> tVar) {
            tVar.setDone();
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.observers.u
        public void innerError(io.reactivex.rxjava3.internal.observers.t<R> tVar, Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.errorMode == io.reactivex.rxjava3.internal.util.j.IMMEDIATE) {
                    this.upstream.dispose();
                }
                tVar.setDone();
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.u
        public void innerNext(io.reactivex.rxjava3.internal.observers.t<R> tVar, R r5) {
            tVar.queue().offer(r5);
            drain();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.sourceMode == 0) {
                this.queue.offer(t5);
            }
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                if (eVar instanceof io.reactivex.rxjava3.internal.fuseable.l) {
                    io.reactivex.rxjava3.internal.fuseable.l lVar = (io.reactivex.rxjava3.internal.fuseable.l) eVar;
                    int requestFusion = lVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = lVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = lVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.c(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }
    }

    public v(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> oVar, io.reactivex.rxjava3.internal.util.j jVar, int i5, int i6) {
        super(n0Var);
        this.f18124b = oVar;
        this.f18125c = jVar;
        this.f18126d = i5;
        this.f18127e = i6;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f18124b, this.f18126d, this.f18127e, this.f18125c));
    }
}
