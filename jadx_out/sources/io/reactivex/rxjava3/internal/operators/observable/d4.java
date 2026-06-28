package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d4<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f17615b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f17616c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17617d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T> f17618e;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17619a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.rxjava3.disposables.e> f17620b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(io.reactivex.rxjava3.core.p0<? super T> p0Var, AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference) {
            this.f17619a = p0Var;
            this.f17620b = atomicReference;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17619a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17619a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f17619a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this.f17620b, eVar);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, d {
        private static final long serialVersionUID = 3764492702657003550L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        io.reactivex.rxjava3.core.n0<? extends T> fallback;
        final long timeout;
        final TimeUnit unit;
        final q0.c worker;
        final io.reactivex.rxjava3.internal.disposables.f task = new io.reactivex.rxjava3.internal.disposables.f();
        final AtomicLong index = new AtomicLong();
        final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream = new AtomicReference<>();

        b(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, TimeUnit timeUnit, q0.c cVar, io.reactivex.rxjava3.core.n0<? extends T> n0Var) {
            this.downstream = p0Var;
            this.timeout = j5;
            this.unit = timeUnit;
            this.worker = cVar;
            this.fallback = n0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            this.worker.dispose();
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
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
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
                    this.task.get().dispose();
                    this.downstream.onNext(t5);
                    startTimeout(j6);
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
                n0Var.subscribe(new a(this.downstream, this));
                this.worker.dispose();
            }
        }

        void startTimeout(long j5) {
            this.task.replace(this.worker.c(new e(j5, this), this.timeout, this.unit));
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> extends AtomicLong implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, d {
        private static final long serialVersionUID = 3764492702657003550L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final long timeout;
        final TimeUnit unit;
        final q0.c worker;
        final io.reactivex.rxjava3.internal.disposables.f task = new io.reactivex.rxjava3.internal.disposables.f();
        final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream = new AtomicReference<>();

        c(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, TimeUnit timeUnit, q0.c cVar) {
            this.downstream = p0Var;
            this.timeout = j5;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            this.worker.dispose();
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
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            long j5 = get();
            if (j5 != Long.MAX_VALUE) {
                long j6 = 1 + j5;
                if (compareAndSet(j5, j6)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t5);
                    startTimeout(j6);
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
                this.downstream.onError(new TimeoutException(io.reactivex.rxjava3.internal.util.k.h(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        void startTimeout(long j5) {
            this.task.replace(this.worker.c(new e(j5, this), this.timeout, this.unit));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface d {
        void onTimeout(long j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final d f17621a;

        /* renamed from: b, reason: collision with root package name */
        final long f17622b;

        e(long j5, d dVar) {
            this.f17622b = j5;
            this.f17621a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17621a.onTimeout(this.f17622b);
        }
    }

    public d4(io.reactivex.rxjava3.core.i0<T> i0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, io.reactivex.rxjava3.core.n0<? extends T> n0Var) {
        super(i0Var);
        this.f17615b = j5;
        this.f17616c = timeUnit;
        this.f17617d = q0Var;
        this.f17618e = n0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        if (this.f17618e == null) {
            c cVar = new c(p0Var, this.f17615b, this.f17616c, this.f17617d.c());
            p0Var.onSubscribe(cVar);
            cVar.startTimeout(0L);
            this.f17528a.subscribe(cVar);
            return;
        }
        b bVar = new b(p0Var, this.f17615b, this.f17616c, this.f17617d.c(), this.f17618e);
        p0Var.onSubscribe(bVar);
        bVar.startTimeout(0L);
        this.f17528a.subscribe(bVar);
    }
}
