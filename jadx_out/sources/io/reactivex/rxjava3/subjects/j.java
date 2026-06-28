package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.internal.fuseable.q;
import io.reactivex.rxjava3.internal.util.k;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class j<T> extends i<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.queue.c<T> f18913a;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<Runnable> f18915c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f18916d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f18917e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f18918f;

    /* renamed from: g, reason: collision with root package name */
    Throwable f18919g;

    /* renamed from: j, reason: collision with root package name */
    boolean f18922j;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<p0<? super T>> f18914b = new AtomicReference<>();

    /* renamed from: h, reason: collision with root package name */
    final AtomicBoolean f18920h = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.observers.b<T> f18921i = new a();

    /* loaded from: classes3.dex */
    final class a extends io.reactivex.rxjava3.internal.observers.b<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        a() {
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            j.this.f18913a.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!j.this.f18917e) {
                j.this.f18917e = true;
                j.this.S8();
                j.this.f18914b.lazySet(null);
                if (j.this.f18921i.getAndIncrement() == 0) {
                    j.this.f18914b.lazySet(null);
                    j jVar = j.this;
                    if (!jVar.f18922j) {
                        jVar.f18913a.clear();
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return j.this.f18917e;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return j.this.f18913a.isEmpty();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            return j.this.f18913a.poll();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 2) == 0) {
                return 0;
            }
            j.this.f18922j = true;
            return 2;
        }
    }

    j(int i5, Runnable runnable, boolean z4) {
        this.f18913a = new io.reactivex.rxjava3.internal.queue.c<>(i5);
        this.f18915c = new AtomicReference<>(runnable);
        this.f18916d = z4;
    }

    @l3.d
    @l3.f
    public static <T> j<T> N8() {
        return new j<>(i0.Z(), null, true);
    }

    @l3.d
    @l3.f
    public static <T> j<T> O8(int i5) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "capacityHint");
        return new j<>(i5, null, true);
    }

    @l3.d
    @l3.f
    public static <T> j<T> P8(int i5, @l3.f Runnable runnable) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "capacityHint");
        Objects.requireNonNull(runnable, "onTerminate");
        return new j<>(i5, runnable, true);
    }

    @l3.d
    @l3.f
    public static <T> j<T> Q8(int i5, @l3.f Runnable runnable, boolean z4) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "capacityHint");
        Objects.requireNonNull(runnable, "onTerminate");
        return new j<>(i5, runnable, z4);
    }

    @l3.d
    @l3.f
    public static <T> j<T> R8(boolean z4) {
        return new j<>(i0.Z(), null, z4);
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    @l3.g
    public Throwable I8() {
        if (this.f18918f) {
            return this.f18919g;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean J8() {
        return this.f18918f && this.f18919g == null;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean K8() {
        return this.f18914b.get() != null;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean L8() {
        return this.f18918f && this.f18919g != null;
    }

    void S8() {
        Runnable runnable = this.f18915c.get();
        if (runnable != null && androidx.compose.animation.core.h.a(this.f18915c, runnable, null)) {
            runnable.run();
        }
    }

    void T8() {
        if (this.f18921i.getAndIncrement() != 0) {
            return;
        }
        p0<? super T> p0Var = this.f18914b.get();
        int i5 = 1;
        while (p0Var == null) {
            i5 = this.f18921i.addAndGet(-i5);
            if (i5 == 0) {
                return;
            } else {
                p0Var = this.f18914b.get();
            }
        }
        if (this.f18922j) {
            U8(p0Var);
        } else {
            V8(p0Var);
        }
    }

    void U8(p0<? super T> p0Var) {
        io.reactivex.rxjava3.internal.queue.c<T> cVar = this.f18913a;
        int i5 = 1;
        boolean z4 = !this.f18916d;
        while (!this.f18917e) {
            boolean z5 = this.f18918f;
            if (z4 && z5 && X8(cVar, p0Var)) {
                return;
            }
            p0Var.onNext(null);
            if (z5) {
                W8(p0Var);
                return;
            } else {
                i5 = this.f18921i.addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
        }
        this.f18914b.lazySet(null);
    }

    void V8(p0<? super T> p0Var) {
        boolean z4;
        io.reactivex.rxjava3.internal.queue.c<T> cVar = this.f18913a;
        boolean z5 = !this.f18916d;
        boolean z6 = true;
        int i5 = 1;
        while (!this.f18917e) {
            boolean z7 = this.f18918f;
            T poll = this.f18913a.poll();
            if (poll == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z7) {
                if (z5 && z6) {
                    if (X8(cVar, p0Var)) {
                        return;
                    } else {
                        z6 = false;
                    }
                }
                if (z4) {
                    W8(p0Var);
                    return;
                }
            }
            if (z4) {
                i5 = this.f18921i.addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            } else {
                p0Var.onNext(poll);
            }
        }
        this.f18914b.lazySet(null);
        cVar.clear();
    }

    void W8(p0<? super T> p0Var) {
        this.f18914b.lazySet(null);
        Throwable th = this.f18919g;
        if (th != null) {
            p0Var.onError(th);
        } else {
            p0Var.onComplete();
        }
    }

    boolean X8(q<T> qVar, p0<? super T> p0Var) {
        Throwable th = this.f18919g;
        if (th != null) {
            this.f18914b.lazySet(null);
            qVar.clear();
            p0Var.onError(th);
            return true;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super T> p0Var) {
        if (!this.f18920h.get() && this.f18920h.compareAndSet(false, true)) {
            p0Var.onSubscribe(this.f18921i);
            this.f18914b.lazySet(p0Var);
            if (this.f18917e) {
                this.f18914b.lazySet(null);
                return;
            } else {
                T8();
                return;
            }
        }
        io.reactivex.rxjava3.internal.disposables.d.error(new IllegalStateException("Only a single observer allowed."), p0Var);
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (!this.f18918f && !this.f18917e) {
            this.f18918f = true;
            S8();
            T8();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        if (!this.f18918f && !this.f18917e) {
            this.f18919g = th;
            this.f18918f = true;
            S8();
            T8();
            return;
        }
        io.reactivex.rxjava3.plugins.a.Y(th);
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        k.d(t5, "onNext called with a null value.");
        if (!this.f18918f && !this.f18917e) {
            this.f18913a.offer(t5);
            T8();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (this.f18918f || this.f18917e) {
            eVar.dispose();
        }
    }
}
