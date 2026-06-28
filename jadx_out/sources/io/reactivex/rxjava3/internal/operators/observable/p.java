package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class p<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final long f17930b;

    /* renamed from: c, reason: collision with root package name */
    final long f17931c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f17932d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17933e;

    /* renamed from: f, reason: collision with root package name */
    final m3.s<U> f17934f;

    /* renamed from: g, reason: collision with root package name */
    final int f17935g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f17936h;

    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.observers.w<T, U, U> implements Runnable, io.reactivex.rxjava3.disposables.e {
        final m3.s<U> K;
        final long L;
        final TimeUnit M;
        final int X;
        final boolean Y;
        final q0.c Z;

        /* renamed from: s0, reason: collision with root package name */
        U f17937s0;

        /* renamed from: t0, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17938t0;

        /* renamed from: u0, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17939u0;

        /* renamed from: v0, reason: collision with root package name */
        long f17940v0;

        /* renamed from: w0, reason: collision with root package name */
        long f17941w0;

        a(io.reactivex.rxjava3.core.p0<? super U> p0Var, m3.s<U> sVar, long j5, TimeUnit timeUnit, int i5, boolean z4, q0.c cVar) {
            super(p0Var, new io.reactivex.rxjava3.internal.queue.a());
            this.K = sVar;
            this.L = j5;
            this.M = timeUnit;
            this.X = i5;
            this.Y = z4;
            this.Z = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.H) {
                this.H = true;
                this.f17939u0.dispose();
                this.Z.dispose();
                synchronized (this) {
                    this.f17937s0 = null;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.H;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            U u4;
            this.Z.dispose();
            synchronized (this) {
                u4 = this.f17937s0;
                this.f17937s0 = null;
            }
            if (u4 != null) {
                this.G.offer(u4);
                this.I = true;
                if (b()) {
                    io.reactivex.rxjava3.internal.util.v.d(this.G, this.F, false, this, this);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            synchronized (this) {
                this.f17937s0 = null;
            }
            this.F.onError(th);
            this.Z.dispose();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            synchronized (this) {
                U u4 = this.f17937s0;
                if (u4 == null) {
                    return;
                }
                u4.add(t5);
                if (u4.size() < this.X) {
                    return;
                }
                this.f17937s0 = null;
                this.f17940v0++;
                if (this.Y) {
                    this.f17938t0.dispose();
                }
                q(u4, false, this);
                try {
                    U u5 = this.K.get();
                    Objects.requireNonNull(u5, "The buffer supplied is null");
                    U u6 = u5;
                    synchronized (this) {
                        this.f17937s0 = u6;
                        this.f17941w0++;
                    }
                    if (this.Y) {
                        q0.c cVar = this.Z;
                        long j5 = this.L;
                        this.f17938t0 = cVar.d(this, j5, j5, this.M);
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.F.onError(th);
                    dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17939u0, eVar)) {
                this.f17939u0 = eVar;
                try {
                    U u4 = this.K.get();
                    Objects.requireNonNull(u4, "The buffer supplied is null");
                    this.f17937s0 = u4;
                    this.F.onSubscribe(this);
                    q0.c cVar = this.Z;
                    long j5 = this.L;
                    this.f17938t0 = cVar.d(this, j5, j5, this.M);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    eVar.dispose();
                    io.reactivex.rxjava3.internal.disposables.d.error(th, this.F);
                    this.Z.dispose();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.observers.w, io.reactivex.rxjava3.internal.util.r
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void g(io.reactivex.rxjava3.core.p0<? super U> p0Var, U u4) {
            p0Var.onNext(u4);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u4 = this.K.get();
                Objects.requireNonNull(u4, "The bufferSupplier returned a null buffer");
                U u5 = u4;
                synchronized (this) {
                    U u6 = this.f17937s0;
                    if (u6 != null && this.f17940v0 == this.f17941w0) {
                        this.f17937s0 = u5;
                        q(u6, false, this);
                    }
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                dispose();
                this.F.onError(th);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.observers.w<T, U, U> implements Runnable, io.reactivex.rxjava3.disposables.e {
        final m3.s<U> K;
        final long L;
        final TimeUnit M;
        final io.reactivex.rxjava3.core.q0 X;
        io.reactivex.rxjava3.disposables.e Y;
        U Z;

        /* renamed from: s0, reason: collision with root package name */
        final AtomicReference<io.reactivex.rxjava3.disposables.e> f17942s0;

        b(io.reactivex.rxjava3.core.p0<? super U> p0Var, m3.s<U> sVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
            super(p0Var, new io.reactivex.rxjava3.internal.queue.a());
            this.f17942s0 = new AtomicReference<>();
            this.K = sVar;
            this.L = j5;
            this.M = timeUnit;
            this.X = q0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.f17942s0);
            this.Y.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17942s0.get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            U u4;
            synchronized (this) {
                u4 = this.Z;
                this.Z = null;
            }
            if (u4 != null) {
                this.G.offer(u4);
                this.I = true;
                if (b()) {
                    io.reactivex.rxjava3.internal.util.v.d(this.G, this.F, false, null, this);
                }
            }
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.f17942s0);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            synchronized (this) {
                this.Z = null;
            }
            this.F.onError(th);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.f17942s0);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            synchronized (this) {
                U u4 = this.Z;
                if (u4 == null) {
                    return;
                }
                u4.add(t5);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.Y, eVar)) {
                this.Y = eVar;
                try {
                    U u4 = this.K.get();
                    Objects.requireNonNull(u4, "The buffer supplied is null");
                    this.Z = u4;
                    this.F.onSubscribe(this);
                    if (!io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.f17942s0.get())) {
                        io.reactivex.rxjava3.core.q0 q0Var = this.X;
                        long j5 = this.L;
                        io.reactivex.rxjava3.internal.disposables.c.set(this.f17942s0, q0Var.o(this, j5, j5, this.M));
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    dispose();
                    io.reactivex.rxjava3.internal.disposables.d.error(th, this.F);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.w, io.reactivex.rxjava3.internal.util.r
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void g(io.reactivex.rxjava3.core.p0<? super U> p0Var, U u4) {
            this.F.onNext(u4);
        }

        @Override // java.lang.Runnable
        public void run() {
            U u4;
            try {
                U u5 = this.K.get();
                Objects.requireNonNull(u5, "The bufferSupplier returned a null buffer");
                U u6 = u5;
                synchronized (this) {
                    u4 = this.Z;
                    if (u4 != null) {
                        this.Z = u6;
                    }
                }
                if (u4 == null) {
                    io.reactivex.rxjava3.internal.disposables.c.dispose(this.f17942s0);
                } else {
                    o(u4, false, this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.F.onError(th);
                dispose();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.observers.w<T, U, U> implements Runnable, io.reactivex.rxjava3.disposables.e {
        final m3.s<U> K;
        final long L;
        final long M;
        final TimeUnit X;
        final q0.c Y;
        final List<U> Z;

        /* renamed from: s0, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17943s0;

        /* loaded from: classes3.dex */
        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final U f17944a;

            a(U u4) {
                this.f17944a = u4;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.Z.remove(this.f17944a);
                }
                c cVar = c.this;
                cVar.q(this.f17944a, false, cVar.Y);
            }
        }

        /* loaded from: classes3.dex */
        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final U f17946a;

            b(U u4) {
                this.f17946a = u4;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.Z.remove(this.f17946a);
                }
                c cVar = c.this;
                cVar.q(this.f17946a, false, cVar.Y);
            }
        }

        c(io.reactivex.rxjava3.core.p0<? super U> p0Var, m3.s<U> sVar, long j5, long j6, TimeUnit timeUnit, q0.c cVar) {
            super(p0Var, new io.reactivex.rxjava3.internal.queue.a());
            this.K = sVar;
            this.L = j5;
            this.M = j6;
            this.X = timeUnit;
            this.Y = cVar;
            this.Z = new LinkedList();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.H) {
                this.H = true;
                u();
                this.f17943s0.dispose();
                this.Y.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.H;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.Z);
                this.Z.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.G.offer((Collection) it.next());
            }
            this.I = true;
            if (b()) {
                io.reactivex.rxjava3.internal.util.v.d(this.G, this.F, false, this.Y, this);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.I = true;
            u();
            this.F.onError(th);
            this.Y.dispose();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            synchronized (this) {
                Iterator<U> it = this.Z.iterator();
                while (it.hasNext()) {
                    it.next().add(t5);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17943s0, eVar)) {
                this.f17943s0 = eVar;
                try {
                    U u4 = this.K.get();
                    Objects.requireNonNull(u4, "The buffer supplied is null");
                    U u5 = u4;
                    this.Z.add(u5);
                    this.F.onSubscribe(this);
                    q0.c cVar = this.Y;
                    long j5 = this.M;
                    cVar.d(this, j5, j5, this.X);
                    this.Y.c(new b(u5), this.L, this.X);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    eVar.dispose();
                    io.reactivex.rxjava3.internal.disposables.d.error(th, this.F);
                    this.Y.dispose();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.observers.w, io.reactivex.rxjava3.internal.util.r
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void g(io.reactivex.rxjava3.core.p0<? super U> p0Var, U u4) {
            p0Var.onNext(u4);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.H) {
                return;
            }
            try {
                U u4 = this.K.get();
                Objects.requireNonNull(u4, "The bufferSupplier returned a null buffer");
                U u5 = u4;
                synchronized (this) {
                    if (this.H) {
                        return;
                    }
                    this.Z.add(u5);
                    this.Y.c(new a(u5), this.L, this.X);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.F.onError(th);
                dispose();
            }
        }

        void u() {
            synchronized (this) {
                this.Z.clear();
            }
        }
    }

    public p(io.reactivex.rxjava3.core.n0<T> n0Var, long j5, long j6, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, m3.s<U> sVar, int i5, boolean z4) {
        super(n0Var);
        this.f17930b = j5;
        this.f17931c = j6;
        this.f17932d = timeUnit;
        this.f17933e = q0Var;
        this.f17934f = sVar;
        this.f17935g = i5;
        this.f17936h = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super U> p0Var) {
        if (this.f17930b == this.f17931c && this.f17935g == Integer.MAX_VALUE) {
            this.f17528a.subscribe(new b(new io.reactivex.rxjava3.observers.m(p0Var), this.f17934f, this.f17930b, this.f17932d, this.f17933e));
            return;
        }
        q0.c c5 = this.f17933e.c();
        if (this.f17930b == this.f17931c) {
            this.f17528a.subscribe(new a(new io.reactivex.rxjava3.observers.m(p0Var), this.f17934f, this.f17930b, this.f17932d, this.f17935g, this.f17936h, c5));
        } else {
            this.f17528a.subscribe(new c(new io.reactivex.rxjava3.observers.m(p0Var), this.f17934f, this.f17930b, this.f17931c, this.f17932d, c5));
        }
    }
}
