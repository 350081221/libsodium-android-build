package io.reactivex.rxjava3.internal.operators.single;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class b0<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18328b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends Iterable<? extends R>> f18329c;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends io.reactivex.rxjava3.internal.subscriptions.c<R> implements io.reactivex.rxjava3.core.u0<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        volatile boolean cancelled;
        final org.reactivestreams.p<? super R> downstream;
        volatile Iterator<? extends R> it;
        final m3.o<? super T, ? extends Iterable<? extends R>> mapper;
        boolean outputFused;
        final AtomicLong requested = new AtomicLong();
        io.reactivex.rxjava3.disposables.e upstream;

        a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.downstream = pVar;
            this.mapper = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            this.upstream.dispose();
            this.upstream = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.it = null;
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super R> pVar = this.downstream;
            Iterator<? extends R> it = this.it;
            if (this.outputFused && it != null) {
                pVar.onNext(null);
                pVar.onComplete();
                return;
            }
            int i5 = 1;
            while (true) {
                if (it != null) {
                    long j5 = this.requested.get();
                    if (j5 == Long.MAX_VALUE) {
                        fastPath(pVar, it);
                        return;
                    }
                    long j6 = 0;
                    while (j6 != j5) {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            R next = it.next();
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            pVar.onNext(next);
                            if (this.cancelled) {
                                return;
                            }
                            j6++;
                            try {
                                if (!it.hasNext()) {
                                    pVar.onComplete();
                                    return;
                                }
                            } catch (Throwable th) {
                                io.reactivex.rxjava3.exceptions.b.b(th);
                                pVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.b.b(th2);
                            pVar.onError(th2);
                            return;
                        }
                    }
                    if (j6 != 0) {
                        io.reactivex.rxjava3.internal.util.d.e(this.requested, j6);
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
                if (it == null) {
                    it = this.it;
                }
            }
        }

        void fastPath(org.reactivestreams.p<? super R> pVar, Iterator<? extends R> it) {
            while (!this.cancelled) {
                try {
                    pVar.onNext(it.next());
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            pVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        pVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    pVar.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.it == null;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.upstream = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                Iterator<? extends R> it = this.mapper.apply(t5).iterator();
                if (!it.hasNext()) {
                    this.downstream.onComplete();
                } else {
                    this.it = it;
                    drain();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public R poll() {
            Iterator<? extends R> it = this.it;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.it = null;
            }
            return next;
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

    public b0(io.reactivex.rxjava3.core.x0<T> x0Var, m3.o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f18328b = x0Var;
        this.f18329c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f18328b.a(new a(pVar, this.f18329c));
    }
}
