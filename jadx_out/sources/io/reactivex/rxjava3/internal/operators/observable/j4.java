package io.reactivex.rxjava3.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class j4<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, io.reactivex.rxjava3.core.i0<T>> {

    /* renamed from: b, reason: collision with root package name */
    final long f17794b;

    /* renamed from: c, reason: collision with root package name */
    final long f17795c;

    /* renamed from: d, reason: collision with root package name */
    final int f17796d;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> downstream;
        long size;
        io.reactivex.rxjava3.disposables.e upstream;
        io.reactivex.rxjava3.subjects.j<T> window;

        a(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var, long j5, int i5) {
            this.downstream = p0Var;
            this.count = j5;
            this.capacityHint = i5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            io.reactivex.rxjava3.subjects.j<T> jVar = this.window;
            if (jVar != null) {
                this.window = null;
                jVar.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.subjects.j<T> jVar = this.window;
            if (jVar != null) {
                this.window = null;
                jVar.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            m4 m4Var;
            io.reactivex.rxjava3.subjects.j<T> jVar = this.window;
            if (jVar == null && !this.cancelled) {
                jVar = io.reactivex.rxjava3.subjects.j.P8(this.capacityHint, this);
                this.window = jVar;
                m4Var = new m4(jVar);
                this.downstream.onNext(m4Var);
            } else {
                m4Var = null;
            }
            if (jVar != null) {
                jVar.onNext(t5);
                long j5 = this.size + 1;
                this.size = j5;
                if (j5 >= this.count) {
                    this.size = 0L;
                    this.window = null;
                    jVar.onComplete();
                    if (this.cancelled) {
                        this.upstream.dispose();
                    }
                }
                if (m4Var != null && m4Var.I8()) {
                    jVar.onComplete();
                    this.window = null;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.upstream.dispose();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends AtomicBoolean implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> downstream;
        long firstEmission;
        long index;
        final long skip;
        io.reactivex.rxjava3.disposables.e upstream;
        final AtomicInteger wip = new AtomicInteger();
        final ArrayDeque<io.reactivex.rxjava3.subjects.j<T>> windows = new ArrayDeque<>();

        b(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var, long j5, long j6, int i5) {
            this.downstream = p0Var;
            this.count = j5;
            this.skip = j6;
            this.capacityHint = i5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            ArrayDeque<io.reactivex.rxjava3.subjects.j<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            ArrayDeque<io.reactivex.rxjava3.subjects.j<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            m4 m4Var;
            ArrayDeque<io.reactivex.rxjava3.subjects.j<T>> arrayDeque = this.windows;
            long j5 = this.index;
            long j6 = this.skip;
            if (j5 % j6 == 0 && !this.cancelled) {
                this.wip.getAndIncrement();
                io.reactivex.rxjava3.subjects.j<T> P8 = io.reactivex.rxjava3.subjects.j.P8(this.capacityHint, this);
                m4Var = new m4(P8);
                arrayDeque.offer(P8);
                this.downstream.onNext(m4Var);
            } else {
                m4Var = null;
            }
            long j7 = this.firstEmission + 1;
            Iterator<io.reactivex.rxjava3.subjects.j<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t5);
            }
            if (j7 >= this.count) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.cancelled) {
                    this.upstream.dispose();
                    return;
                }
                this.firstEmission = j7 - j6;
            } else {
                this.firstEmission = j7;
            }
            this.index = j5 + 1;
            if (m4Var != null && m4Var.I8()) {
                m4Var.f17865a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.decrementAndGet() == 0 && this.cancelled) {
                this.upstream.dispose();
            }
        }
    }

    public j4(io.reactivex.rxjava3.core.n0<T> n0Var, long j5, long j6, int i5) {
        super(n0Var);
        this.f17794b = j5;
        this.f17795c = j6;
        this.f17796d = i5;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.i0<T>> p0Var) {
        if (this.f17794b == this.f17795c) {
            this.f17528a.subscribe(new a(p0Var, this.f17794b, this.f17796d));
        } else {
            this.f17528a.subscribe(new b(p0Var, this.f17794b, this.f17795c, this.f17796d));
        }
    }
}
