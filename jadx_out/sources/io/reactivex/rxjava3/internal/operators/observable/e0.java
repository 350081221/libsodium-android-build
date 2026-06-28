package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f17633b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f17634c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17635d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements Runnable, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final b<T> parent;
        final T value;

        a(T t5, long j5, b<T> bVar) {
            this.value = t5;
            this.idx = j5;
            this.parent = bVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.a(this.idx, this.value, this);
            }
        }

        public void setResource(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17636a;

        /* renamed from: b, reason: collision with root package name */
        final long f17637b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f17638c;

        /* renamed from: d, reason: collision with root package name */
        final q0.c f17639d;

        /* renamed from: e, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17640e;

        /* renamed from: f, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17641f;

        /* renamed from: g, reason: collision with root package name */
        volatile long f17642g;

        /* renamed from: h, reason: collision with root package name */
        boolean f17643h;

        b(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, TimeUnit timeUnit, q0.c cVar) {
            this.f17636a = p0Var;
            this.f17637b = j5;
            this.f17638c = timeUnit;
            this.f17639d = cVar;
        }

        void a(long j5, T t5, a<T> aVar) {
            if (j5 == this.f17642g) {
                this.f17636a.onNext(t5);
                aVar.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17640e.dispose();
            this.f17639d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17639d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17643h) {
                return;
            }
            this.f17643h = true;
            io.reactivex.rxjava3.disposables.e eVar = this.f17641f;
            if (eVar != null) {
                eVar.dispose();
            }
            a aVar = (a) eVar;
            if (aVar != null) {
                aVar.run();
            }
            this.f17636a.onComplete();
            this.f17639d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17643h) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            io.reactivex.rxjava3.disposables.e eVar = this.f17641f;
            if (eVar != null) {
                eVar.dispose();
            }
            this.f17643h = true;
            this.f17636a.onError(th);
            this.f17639d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17643h) {
                return;
            }
            long j5 = this.f17642g + 1;
            this.f17642g = j5;
            io.reactivex.rxjava3.disposables.e eVar = this.f17641f;
            if (eVar != null) {
                eVar.dispose();
            }
            a aVar = new a(t5, j5, this);
            this.f17641f = aVar;
            aVar.setResource(this.f17639d.c(aVar, this.f17637b, this.f17638c));
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17640e, eVar)) {
                this.f17640e = eVar;
                this.f17636a.onSubscribe(this);
            }
        }
    }

    public e0(io.reactivex.rxjava3.core.n0<T> n0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        super(n0Var);
        this.f17633b = j5;
        this.f17634c = timeUnit;
        this.f17635d = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new b(new io.reactivex.rxjava3.observers.m(p0Var), this.f17633b, this.f17634c, this.f17635d.c()));
    }
}
