package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class s2<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.observables.a<T> f18087a;

    /* renamed from: b, reason: collision with root package name */
    final int f18088b;

    /* renamed from: c, reason: collision with root package name */
    final long f18089c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f18090d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18091e;

    /* renamed from: f, reason: collision with root package name */
    a f18092f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements Runnable, m3.g<io.reactivex.rxjava3.disposables.e> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final s2<?> parent;
        long subscriberCount;
        io.reactivex.rxjava3.disposables.e timer;

        a(s2<?> s2Var) {
            this.parent = s2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.K8(this);
        }

        @Override // m3.g
        public void accept(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    this.parent.f18087a.T8();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends AtomicBoolean implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -7419642935409022375L;
        final a connection;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final s2<T> parent;
        io.reactivex.rxjava3.disposables.e upstream;

        b(io.reactivex.rxjava3.core.p0<? super T> p0Var, s2<T> s2Var, a aVar) {
            this.downstream = p0Var;
            this.parent = s2Var;
            this.connection = aVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                this.parent.I8(this.connection);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.J8(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.J8(this.connection);
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public s2(io.reactivex.rxjava3.observables.a<T> aVar) {
        this(aVar, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    void I8(a aVar) {
        synchronized (this) {
            a aVar2 = this.f18092f;
            if (aVar2 != null && aVar2 == aVar) {
                long j5 = aVar.subscriberCount - 1;
                aVar.subscriberCount = j5;
                if (j5 == 0 && aVar.connected) {
                    if (this.f18089c == 0) {
                        K8(aVar);
                        return;
                    }
                    io.reactivex.rxjava3.internal.disposables.f fVar = new io.reactivex.rxjava3.internal.disposables.f();
                    aVar.timer = fVar;
                    fVar.replace(this.f18091e.g(aVar, this.f18089c, this.f18090d));
                }
            }
        }
    }

    void J8(a aVar) {
        synchronized (this) {
            if (this.f18092f == aVar) {
                io.reactivex.rxjava3.disposables.e eVar = aVar.timer;
                if (eVar != null) {
                    eVar.dispose();
                    aVar.timer = null;
                }
                long j5 = aVar.subscriberCount - 1;
                aVar.subscriberCount = j5;
                if (j5 == 0) {
                    this.f18092f = null;
                    this.f18087a.T8();
                }
            }
        }
    }

    void K8(a aVar) {
        synchronized (this) {
            if (aVar.subscriberCount == 0 && aVar == this.f18092f) {
                this.f18092f = null;
                io.reactivex.rxjava3.disposables.e eVar = aVar.get();
                io.reactivex.rxjava3.internal.disposables.c.dispose(aVar);
                if (eVar == null) {
                    aVar.disconnectedEarly = true;
                } else {
                    this.f18087a.T8();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        a aVar;
        boolean z4;
        io.reactivex.rxjava3.disposables.e eVar;
        synchronized (this) {
            aVar = this.f18092f;
            if (aVar == null) {
                aVar = new a(this);
                this.f18092f = aVar;
            }
            long j5 = aVar.subscriberCount;
            if (j5 == 0 && (eVar = aVar.timer) != null) {
                eVar.dispose();
            }
            long j6 = j5 + 1;
            aVar.subscriberCount = j6;
            if (!aVar.connected && j6 == this.f18088b) {
                z4 = true;
                aVar.connected = true;
            } else {
                z4 = false;
            }
        }
        this.f18087a.subscribe(new b(p0Var, this, aVar));
        if (z4) {
            this.f18087a.M8(aVar);
        }
    }

    public s2(io.reactivex.rxjava3.observables.a<T> aVar, int i5, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f18087a = aVar;
        this.f18088b = i5;
        this.f18089c = j5;
        this.f18090d = timeUnit;
        this.f18091e = q0Var;
    }
}
