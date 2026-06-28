package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<?> f17562b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f17563c;

    /* loaded from: classes3.dex */
    static final class a<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final AtomicInteger wip;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, io.reactivex.rxjava3.core.n0<?> n0Var) {
            super(p0Var, n0Var);
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.c
        void completion() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.c
        void run() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            do {
                boolean z4 = this.done;
                emit();
                if (z4) {
                    this.downstream.onComplete();
                    return;
                }
            } while (this.wip.decrementAndGet() != 0);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        b(io.reactivex.rxjava3.core.p0<? super T> p0Var, io.reactivex.rxjava3.core.n0<?> n0Var) {
            super(p0Var, n0Var);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.c
        void completion() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.b3.c
        void run() {
            emit();
        }
    }

    /* loaded from: classes3.dex */
    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -3517602651313910099L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> other = new AtomicReference<>();
        final io.reactivex.rxjava3.core.n0<?> sampler;
        io.reactivex.rxjava3.disposables.e upstream;

        c(io.reactivex.rxjava3.core.p0<? super T> p0Var, io.reactivex.rxjava3.core.n0<?> n0Var) {
            this.downstream = p0Var;
            this.sampler = n0Var;
        }

        public void complete() {
            this.upstream.dispose();
            completion();
        }

        abstract void completion();

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.other);
            this.upstream.dispose();
        }

        void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        public void error(Throwable th) {
            this.upstream.dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.other.get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.other);
            completion();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.other);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            lazySet(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new d(this));
                }
            }
        }

        abstract void run();

        boolean setOther(io.reactivex.rxjava3.disposables.e eVar) {
            return io.reactivex.rxjava3.internal.disposables.c.setOnce(this.other, eVar);
        }
    }

    /* loaded from: classes3.dex */
    static final class d<T> implements io.reactivex.rxjava3.core.p0<Object> {

        /* renamed from: a, reason: collision with root package name */
        final c<T> f17564a;

        d(c<T> cVar) {
            this.f17564a = cVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17564a.complete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17564a.error(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(Object obj) {
            this.f17564a.run();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f17564a.setOther(eVar);
        }
    }

    public b3(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.n0<?> n0Var2, boolean z4) {
        super(n0Var);
        this.f17562b = n0Var2;
        this.f17563c = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        io.reactivex.rxjava3.observers.m mVar = new io.reactivex.rxjava3.observers.m(p0Var);
        if (this.f17563c) {
            this.f17528a.subscribe(new a(mVar, this.f17562b));
        } else {
            this.f17528a.subscribe(new b(mVar, this.f17562b));
        }
    }
}
