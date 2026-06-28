package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.operators.observable.d4;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c4<T, U, V> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<U> f17582b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<V>> f17583c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T> f17584d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<Object>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final d parent;

        a(long j5, d dVar) {
            this.idx = j5;
            this.parent = dVar;
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
            Object obj = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (obj != cVar) {
                lazySet(cVar);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            Object obj = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (obj != cVar) {
                lazySet(cVar);
                this.parent.onTimeoutError(this.idx, th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(Object obj) {
            io.reactivex.rxjava3.disposables.e eVar = (io.reactivex.rxjava3.disposables.e) get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar) {
                eVar.dispose();
                lazySet(cVar);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, d {
        private static final long serialVersionUID = -7508389464265974549L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        io.reactivex.rxjava3.core.n0<? extends T> fallback;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<?>> itemTimeoutIndicator;
        final io.reactivex.rxjava3.internal.disposables.f task = new io.reactivex.rxjava3.internal.disposables.f();
        final AtomicLong index = new AtomicLong();
        final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream = new AtomicReference<>();

        b(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<?>> oVar, io.reactivex.rxjava3.core.n0<? extends T> n0Var) {
            this.downstream = p0Var;
            this.itemTimeoutIndicator = oVar;
            this.fallback = n0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            this.task.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.task.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.task.dispose();
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            long j5 = this.index.get();
            if (j5 != Long.MAX_VALUE) {
                long j6 = 1 + j5;
                if (this.index.compareAndSet(j5, j6)) {
                    io.reactivex.rxjava3.disposables.e eVar = this.task.get();
                    if (eVar != null) {
                        eVar.dispose();
                    }
                    this.downstream.onNext(t5);
                    try {
                        io.reactivex.rxjava3.core.n0<?> apply = this.itemTimeoutIndicator.apply(t5);
                        Objects.requireNonNull(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        io.reactivex.rxjava3.core.n0<?> n0Var = apply;
                        a aVar = new a(j6, this);
                        if (this.task.replace(aVar)) {
                            n0Var.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.upstream.get().dispose();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.upstream, eVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.d4.d
        public void onTimeout(long j5) {
            if (this.index.compareAndSet(j5, Long.MAX_VALUE)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
                io.reactivex.rxjava3.core.n0<? extends T> n0Var = this.fallback;
                this.fallback = null;
                n0Var.subscribe(new d4.a(this.downstream, this));
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.c4.d
        public void onTimeoutError(long j5, Throwable th) {
            if (this.index.compareAndSet(j5, Long.MAX_VALUE)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        void startFirstTimeout(io.reactivex.rxjava3.core.n0<?> n0Var) {
            if (n0Var != null) {
                a aVar = new a(0L, this);
                if (this.task.replace(aVar)) {
                    n0Var.subscribe(aVar);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> extends AtomicLong implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, d {
        private static final long serialVersionUID = 3764492702657003550L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<?>> itemTimeoutIndicator;
        final io.reactivex.rxjava3.internal.disposables.f task = new io.reactivex.rxjava3.internal.disposables.f();
        final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream = new AtomicReference<>();

        c(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<?>> oVar) {
            this.downstream = p0Var;
            this.itemTimeoutIndicator = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            this.task.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            long j5 = get();
            if (j5 != Long.MAX_VALUE) {
                long j6 = 1 + j5;
                if (compareAndSet(j5, j6)) {
                    io.reactivex.rxjava3.disposables.e eVar = this.task.get();
                    if (eVar != null) {
                        eVar.dispose();
                    }
                    this.downstream.onNext(t5);
                    try {
                        io.reactivex.rxjava3.core.n0<?> apply = this.itemTimeoutIndicator.apply(t5);
                        Objects.requireNonNull(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        io.reactivex.rxjava3.core.n0<?> n0Var = apply;
                        a aVar = new a(j6, this);
                        if (this.task.replace(aVar)) {
                            n0Var.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.upstream.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.upstream, eVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.d4.d
        public void onTimeout(long j5) {
            if (compareAndSet(j5, Long.MAX_VALUE)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
                this.downstream.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.c4.d
        public void onTimeoutError(long j5, Throwable th) {
            if (compareAndSet(j5, Long.MAX_VALUE)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        void startFirstTimeout(io.reactivex.rxjava3.core.n0<?> n0Var) {
            if (n0Var != null) {
                a aVar = new a(0L, this);
                if (this.task.replace(aVar)) {
                    n0Var.subscribe(aVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface d extends d4.d {
        void onTimeoutError(long j5, Throwable th);
    }

    public c4(io.reactivex.rxjava3.core.i0<T> i0Var, io.reactivex.rxjava3.core.n0<U> n0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<V>> oVar, io.reactivex.rxjava3.core.n0<? extends T> n0Var2) {
        super(i0Var);
        this.f17582b = n0Var;
        this.f17583c = oVar;
        this.f17584d = n0Var2;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        if (this.f17584d == null) {
            c cVar = new c(p0Var, this.f17583c);
            p0Var.onSubscribe(cVar);
            cVar.startFirstTimeout(this.f17582b);
            this.f17528a.subscribe(cVar);
            return;
        }
        b bVar = new b(p0Var, this.f17583c, this.f17584d);
        p0Var.onSubscribe(bVar);
        bVar.startFirstTimeout(this.f17582b);
        this.f17528a.subscribe(bVar);
    }
}
