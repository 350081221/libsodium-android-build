package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.internal.subscriptions.j;
import io.reactivex.rxjava3.internal.util.k;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.p;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public final class h<T> extends c<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.queue.c<T> f18826b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<Runnable> f18827c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f18828d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f18829e;

    /* renamed from: f, reason: collision with root package name */
    Throwable f18830f;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f18832h;

    /* renamed from: l, reason: collision with root package name */
    boolean f18836l;

    /* renamed from: g, reason: collision with root package name */
    final AtomicReference<p<? super T>> f18831g = new AtomicReference<>();

    /* renamed from: i, reason: collision with root package name */
    final AtomicBoolean f18833i = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.subscriptions.c<T> f18834j = new a();

    /* renamed from: k, reason: collision with root package name */
    final AtomicLong f18835k = new AtomicLong();

    /* loaded from: classes3.dex */
    final class a extends io.reactivex.rxjava3.internal.subscriptions.c<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        a() {
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (h.this.f18832h) {
                return;
            }
            h.this.f18832h = true;
            h.this.y9();
            h.this.f18831g.lazySet(null);
            if (h.this.f18834j.getAndIncrement() == 0) {
                h.this.f18831g.lazySet(null);
                h hVar = h.this;
                if (!hVar.f18836l) {
                    hVar.f18826b.clear();
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            h.this.f18826b.clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return h.this.f18826b.isEmpty();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            return h.this.f18826b.poll();
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(h.this.f18835k, j5);
                h.this.z9();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 2) == 0) {
                return 0;
            }
            h.this.f18836l = true;
            return 2;
        }
    }

    h(int i5, Runnable runnable, boolean z4) {
        this.f18826b = new io.reactivex.rxjava3.internal.queue.c<>(i5);
        this.f18827c = new AtomicReference<>(runnable);
        this.f18828d = z4;
    }

    @l3.d
    @l3.f
    public static <T> h<T> t9() {
        return new h<>(o.c0(), null, true);
    }

    @l3.d
    @l3.f
    public static <T> h<T> u9(int i5) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "capacityHint");
        return new h<>(i5, null, true);
    }

    @l3.d
    @l3.f
    public static <T> h<T> v9(int i5, @l3.f Runnable runnable) {
        return w9(i5, runnable, true);
    }

    @l3.d
    @l3.f
    public static <T> h<T> w9(int i5, @l3.f Runnable runnable, boolean z4) {
        Objects.requireNonNull(runnable, "onTerminate");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "capacityHint");
        return new h<>(i5, runnable, z4);
    }

    @l3.d
    @l3.f
    public static <T> h<T> x9(boolean z4) {
        return new h<>(o.c0(), null, z4);
    }

    void A9(p<? super T> pVar) {
        io.reactivex.rxjava3.internal.queue.c<T> cVar = this.f18826b;
        int i5 = 1;
        boolean z4 = !this.f18828d;
        while (!this.f18832h) {
            boolean z5 = this.f18829e;
            if (z4 && z5 && this.f18830f != null) {
                cVar.clear();
                this.f18831g.lazySet(null);
                pVar.onError(this.f18830f);
                return;
            }
            pVar.onNext(null);
            if (z5) {
                this.f18831g.lazySet(null);
                Throwable th = this.f18830f;
                if (th != null) {
                    pVar.onError(th);
                    return;
                } else {
                    pVar.onComplete();
                    return;
                }
            }
            i5 = this.f18834j.addAndGet(-i5);
            if (i5 == 0) {
                return;
            }
        }
        this.f18831g.lazySet(null);
    }

    void B9(p<? super T> pVar) {
        long j5;
        boolean z4;
        io.reactivex.rxjava3.internal.queue.c<T> cVar = this.f18826b;
        boolean z5 = true;
        boolean z6 = !this.f18828d;
        int i5 = 1;
        while (true) {
            long j6 = this.f18835k.get();
            long j7 = 0;
            while (true) {
                if (j6 != j7) {
                    boolean z7 = this.f18829e;
                    T poll = cVar.poll();
                    if (poll == null) {
                        z4 = z5;
                    } else {
                        z4 = false;
                    }
                    j5 = j7;
                    if (s9(z6, z7, z4, pVar, cVar)) {
                        return;
                    }
                    if (z4) {
                        break;
                    }
                    pVar.onNext(poll);
                    j7 = 1 + j5;
                    z5 = true;
                } else {
                    j5 = j7;
                    break;
                }
            }
            if (j6 == j7 && s9(z6, this.f18829e, cVar.isEmpty(), pVar, cVar)) {
                return;
            }
            if (j5 != 0 && j6 != Long.MAX_VALUE) {
                this.f18835k.addAndGet(-j5);
            }
            i5 = this.f18834j.addAndGet(-i5);
            if (i5 == 0) {
                return;
            } else {
                z5 = true;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(p<? super T> pVar) {
        if (!this.f18833i.get() && this.f18833i.compareAndSet(false, true)) {
            pVar.onSubscribe(this.f18834j);
            this.f18831g.set(pVar);
            if (this.f18832h) {
                this.f18831g.lazySet(null);
                return;
            } else {
                z9();
                return;
            }
        }
        io.reactivex.rxjava3.internal.subscriptions.g.error(new IllegalStateException("This processor allows only a single Subscriber"), pVar);
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    @l3.g
    public Throwable n9() {
        if (this.f18829e) {
            return this.f18830f;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean o9() {
        return this.f18829e && this.f18830f == null;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        if (!this.f18829e && !this.f18832h) {
            this.f18829e = true;
            y9();
            z9();
        }
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        if (!this.f18829e && !this.f18832h) {
            this.f18830f = th;
            this.f18829e = true;
            y9();
            z9();
            return;
        }
        io.reactivex.rxjava3.plugins.a.Y(th);
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        k.d(t5, "onNext called with a null value.");
        if (!this.f18829e && !this.f18832h) {
            this.f18826b.offer(t5);
            z9();
        }
    }

    @Override // org.reactivestreams.p
    public void onSubscribe(q qVar) {
        if (!this.f18829e && !this.f18832h) {
            qVar.request(Long.MAX_VALUE);
        } else {
            qVar.cancel();
        }
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean p9() {
        return this.f18831g.get() != null;
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean q9() {
        return this.f18829e && this.f18830f != null;
    }

    boolean s9(boolean z4, boolean z5, boolean z6, p<? super T> pVar, io.reactivex.rxjava3.internal.queue.c<T> cVar) {
        if (this.f18832h) {
            cVar.clear();
            this.f18831g.lazySet(null);
            return true;
        }
        if (z5) {
            if (z4 && this.f18830f != null) {
                cVar.clear();
                this.f18831g.lazySet(null);
                pVar.onError(this.f18830f);
                return true;
            }
            if (z6) {
                Throwable th = this.f18830f;
                this.f18831g.lazySet(null);
                if (th != null) {
                    pVar.onError(th);
                } else {
                    pVar.onComplete();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    void y9() {
        Runnable andSet = this.f18827c.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    void z9() {
        if (this.f18834j.getAndIncrement() != 0) {
            return;
        }
        p<? super T> pVar = this.f18831g.get();
        int i5 = 1;
        while (pVar == null) {
            i5 = this.f18834j.addAndGet(-i5);
            if (i5 == 0) {
                return;
            } else {
                pVar = this.f18831g.get();
            }
        }
        if (this.f18836l) {
            A9(pVar);
        } else {
            B9(pVar);
        }
    }
}
