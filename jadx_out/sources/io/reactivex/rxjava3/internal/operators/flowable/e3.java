package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e3<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.flowables.a<T> f16717b;

    /* renamed from: c, reason: collision with root package name */
    final int f16718c;

    /* renamed from: d, reason: collision with root package name */
    final long f16719d;

    /* renamed from: e, reason: collision with root package name */
    final TimeUnit f16720e;

    /* renamed from: f, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16721f;

    /* renamed from: g, reason: collision with root package name */
    a f16722g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements Runnable, m3.g<io.reactivex.rxjava3.disposables.e> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final e3<?> parent;
        long subscriberCount;
        io.reactivex.rxjava3.disposables.e timer;

        a(e3<?> e3Var) {
            this.parent = e3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.p9(this);
        }

        @Override // m3.g
        public void accept(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    this.parent.f16717b.y9();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends AtomicBoolean implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -7419642935409022375L;
        final a connection;
        final org.reactivestreams.p<? super T> downstream;
        final e3<T> parent;
        org.reactivestreams.q upstream;

        b(org.reactivestreams.p<? super T> pVar, e3<T> e3Var, a aVar) {
            this.downstream = pVar;
            this.parent = e3Var;
            this.connection = aVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.cancel();
            if (compareAndSet(false, true)) {
                this.parent.n9(this.connection);
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.o9(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.o9(this.connection);
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.upstream.request(j5);
        }
    }

    public e3(io.reactivex.rxjava3.flowables.a<T> aVar) {
        this(aVar, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        a aVar;
        boolean z4;
        io.reactivex.rxjava3.disposables.e eVar;
        synchronized (this) {
            aVar = this.f16722g;
            if (aVar == null) {
                aVar = new a(this);
                this.f16722g = aVar;
            }
            long j5 = aVar.subscriberCount;
            if (j5 == 0 && (eVar = aVar.timer) != null) {
                eVar.dispose();
            }
            long j6 = j5 + 1;
            aVar.subscriberCount = j6;
            if (!aVar.connected && j6 == this.f16718c) {
                z4 = true;
                aVar.connected = true;
            } else {
                z4 = false;
            }
        }
        this.f16717b.N6(new b(pVar, this, aVar));
        if (z4) {
            this.f16717b.r9(aVar);
        }
    }

    void n9(a aVar) {
        synchronized (this) {
            a aVar2 = this.f16722g;
            if (aVar2 != null && aVar2 == aVar) {
                long j5 = aVar.subscriberCount - 1;
                aVar.subscriberCount = j5;
                if (j5 == 0 && aVar.connected) {
                    if (this.f16719d == 0) {
                        p9(aVar);
                        return;
                    }
                    io.reactivex.rxjava3.internal.disposables.f fVar = new io.reactivex.rxjava3.internal.disposables.f();
                    aVar.timer = fVar;
                    fVar.replace(this.f16721f.g(aVar, this.f16719d, this.f16720e));
                }
            }
        }
    }

    void o9(a aVar) {
        synchronized (this) {
            if (this.f16722g == aVar) {
                io.reactivex.rxjava3.disposables.e eVar = aVar.timer;
                if (eVar != null) {
                    eVar.dispose();
                    aVar.timer = null;
                }
                long j5 = aVar.subscriberCount - 1;
                aVar.subscriberCount = j5;
                if (j5 == 0) {
                    this.f16722g = null;
                    this.f16717b.y9();
                }
            }
        }
    }

    void p9(a aVar) {
        synchronized (this) {
            if (aVar.subscriberCount == 0 && aVar == this.f16722g) {
                this.f16722g = null;
                io.reactivex.rxjava3.disposables.e eVar = aVar.get();
                io.reactivex.rxjava3.internal.disposables.c.dispose(aVar);
                if (eVar == null) {
                    aVar.disconnectedEarly = true;
                } else {
                    this.f16717b.y9();
                }
            }
        }
    }

    public e3(io.reactivex.rxjava3.flowables.a<T> aVar, int i5, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f16717b = aVar;
        this.f16718c = i5;
        this.f16719d = j5;
        this.f16720e = timeUnit;
        this.f16721f = q0Var;
    }
}
