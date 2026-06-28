package io.reactivex.rxjava3.internal.operators.flowable;

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
public final class p<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    final long f16930c;

    /* renamed from: d, reason: collision with root package name */
    final long f16931d;

    /* renamed from: e, reason: collision with root package name */
    final TimeUnit f16932e;

    /* renamed from: f, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16933f;

    /* renamed from: g, reason: collision with root package name */
    final m3.s<U> f16934g;

    /* renamed from: h, reason: collision with root package name */
    final int f16935h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f16936i;

    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.subscribers.n<T, U, U> implements org.reactivestreams.q, Runnable, io.reactivex.rxjava3.disposables.e {
        final m3.s<U> C0;
        final long D0;
        final TimeUnit E0;
        final int F0;
        final boolean G0;
        final q0.c H0;
        U I0;
        io.reactivex.rxjava3.disposables.e J0;
        org.reactivestreams.q K0;
        long L0;
        long M0;

        a(org.reactivestreams.p<? super U> pVar, m3.s<U> sVar, long j5, TimeUnit timeUnit, int i5, boolean z4, q0.c cVar) {
            super(pVar, new io.reactivex.rxjava3.internal.queue.a());
            this.C0 = sVar;
            this.D0 = j5;
            this.E0 = timeUnit;
            this.F0 = i5;
            this.G0 = z4;
            this.H0 = cVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.f18650z0) {
                this.f18650z0 = true;
                dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            synchronized (this) {
                this.I0 = null;
            }
            this.K0.cancel();
            this.H0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.H0.isDisposed();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            U u4;
            synchronized (this) {
                u4 = this.I0;
                this.I0 = null;
            }
            if (u4 != null) {
                this.f18649y0.offer(u4);
                this.A0 = true;
                if (b()) {
                    io.reactivex.rxjava3.internal.util.v.e(this.f18649y0, this.f18648x0, false, this, this);
                }
                this.H0.dispose();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            synchronized (this) {
                this.I0 = null;
            }
            this.f18648x0.onError(th);
            this.H0.dispose();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            synchronized (this) {
                U u4 = this.I0;
                if (u4 == null) {
                    return;
                }
                u4.add(t5);
                if (u4.size() < this.F0) {
                    return;
                }
                this.I0 = null;
                this.L0++;
                if (this.G0) {
                    this.J0.dispose();
                }
                s(u4, false, this);
                try {
                    U u5 = this.C0.get();
                    Objects.requireNonNull(u5, "The supplied buffer is null");
                    U u6 = u5;
                    synchronized (this) {
                        this.I0 = u6;
                        this.M0++;
                    }
                    if (this.G0) {
                        q0.c cVar = this.H0;
                        long j5 = this.D0;
                        this.J0 = cVar.d(this, j5, j5, this.E0);
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    cancel();
                    this.f18648x0.onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (!io.reactivex.rxjava3.internal.subscriptions.j.validate(this.K0, qVar)) {
                return;
            }
            this.K0 = qVar;
            try {
                U u4 = this.C0.get();
                Objects.requireNonNull(u4, "The supplied buffer is null");
                this.I0 = u4;
                this.f18648x0.onSubscribe(this);
                q0.c cVar = this.H0;
                long j5 = this.D0;
                this.J0 = cVar.d(this, j5, j5, this.E0);
                qVar.request(Long.MAX_VALUE);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.H0.dispose();
                qVar.cancel();
                io.reactivex.rxjava3.internal.subscriptions.g.error(th, this.f18648x0);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            t(j5);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u4 = this.C0.get();
                Objects.requireNonNull(u4, "The supplied buffer is null");
                U u5 = u4;
                synchronized (this) {
                    U u6 = this.I0;
                    if (u6 != null && this.L0 == this.M0) {
                        this.I0 = u5;
                        s(u6, false, this);
                    }
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                cancel();
                this.f18648x0.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.subscribers.n, io.reactivex.rxjava3.internal.util.u
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public boolean g(org.reactivestreams.p<? super U> pVar, U u4) {
            pVar.onNext(u4);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.subscribers.n<T, U, U> implements org.reactivestreams.q, Runnable, io.reactivex.rxjava3.disposables.e {
        final m3.s<U> C0;
        final long D0;
        final TimeUnit E0;
        final io.reactivex.rxjava3.core.q0 F0;
        org.reactivestreams.q G0;
        U H0;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> I0;

        b(org.reactivestreams.p<? super U> pVar, m3.s<U> sVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
            super(pVar, new io.reactivex.rxjava3.internal.queue.a());
            this.I0 = new AtomicReference<>();
            this.C0 = sVar;
            this.D0 = j5;
            this.E0 = timeUnit;
            this.F0 = q0Var;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f18650z0 = true;
            this.G0.cancel();
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.I0);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.I0.get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.I0);
            synchronized (this) {
                U u4 = this.H0;
                if (u4 == null) {
                    return;
                }
                this.H0 = null;
                this.f18649y0.offer(u4);
                this.A0 = true;
                if (b()) {
                    io.reactivex.rxjava3.internal.util.v.e(this.f18649y0, this.f18648x0, false, null, this);
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.I0);
            synchronized (this) {
                this.H0 = null;
            }
            this.f18648x0.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            synchronized (this) {
                U u4 = this.H0;
                if (u4 != null) {
                    u4.add(t5);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.G0, qVar)) {
                this.G0 = qVar;
                try {
                    U u4 = this.C0.get();
                    Objects.requireNonNull(u4, "The supplied buffer is null");
                    this.H0 = u4;
                    this.f18648x0.onSubscribe(this);
                    if (!this.f18650z0) {
                        qVar.request(Long.MAX_VALUE);
                        io.reactivex.rxjava3.core.q0 q0Var = this.F0;
                        long j5 = this.D0;
                        io.reactivex.rxjava3.disposables.e o5 = q0Var.o(this, j5, j5, this.E0);
                        if (!androidx.compose.animation.core.h.a(this.I0, null, o5)) {
                            o5.dispose();
                        }
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    cancel();
                    io.reactivex.rxjava3.internal.subscriptions.g.error(th, this.f18648x0);
                }
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            t(j5);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u4 = this.C0.get();
                Objects.requireNonNull(u4, "The supplied buffer is null");
                U u5 = u4;
                synchronized (this) {
                    U u6 = this.H0;
                    if (u6 == null) {
                        return;
                    }
                    this.H0 = u5;
                    r(u6, false, this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                cancel();
                this.f18648x0.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.n, io.reactivex.rxjava3.internal.util.u
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public boolean g(org.reactivestreams.p<? super U> pVar, U u4) {
            this.f18648x0.onNext(u4);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.subscribers.n<T, U, U> implements org.reactivestreams.q, Runnable {
        final m3.s<U> C0;
        final long D0;
        final long E0;
        final TimeUnit F0;
        final q0.c G0;
        final List<U> H0;
        org.reactivestreams.q I0;

        /* loaded from: classes3.dex */
        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final U f16937a;

            a(U u4) {
                this.f16937a = u4;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.H0.remove(this.f16937a);
                }
                c cVar = c.this;
                cVar.s(this.f16937a, false, cVar.G0);
            }
        }

        c(org.reactivestreams.p<? super U> pVar, m3.s<U> sVar, long j5, long j6, TimeUnit timeUnit, q0.c cVar) {
            super(pVar, new io.reactivex.rxjava3.internal.queue.a());
            this.C0 = sVar;
            this.D0 = j5;
            this.E0 = j6;
            this.F0 = timeUnit;
            this.G0 = cVar;
            this.H0 = new LinkedList();
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f18650z0 = true;
            this.I0.cancel();
            this.G0.dispose();
            w();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.H0);
                this.H0.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f18649y0.offer((Collection) it.next());
            }
            this.A0 = true;
            if (b()) {
                io.reactivex.rxjava3.internal.util.v.e(this.f18649y0, this.f18648x0, false, this.G0, this);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.A0 = true;
            this.G0.dispose();
            w();
            this.f18648x0.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            synchronized (this) {
                Iterator<U> it = this.H0.iterator();
                while (it.hasNext()) {
                    it.next().add(t5);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (!io.reactivex.rxjava3.internal.subscriptions.j.validate(this.I0, qVar)) {
                return;
            }
            this.I0 = qVar;
            try {
                U u4 = this.C0.get();
                Objects.requireNonNull(u4, "The supplied buffer is null");
                U u5 = u4;
                this.H0.add(u5);
                this.f18648x0.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
                q0.c cVar = this.G0;
                long j5 = this.E0;
                cVar.d(this, j5, j5, this.F0);
                this.G0.c(new a(u5), this.D0, this.F0);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.G0.dispose();
                qVar.cancel();
                io.reactivex.rxjava3.internal.subscriptions.g.error(th, this.f18648x0);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            t(j5);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18650z0) {
                return;
            }
            try {
                U u4 = this.C0.get();
                Objects.requireNonNull(u4, "The supplied buffer is null");
                U u5 = u4;
                synchronized (this) {
                    if (this.f18650z0) {
                        return;
                    }
                    this.H0.add(u5);
                    this.G0.c(new a(u5), this.D0, this.F0);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                cancel();
                this.f18648x0.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.subscribers.n, io.reactivex.rxjava3.internal.util.u
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public boolean g(org.reactivestreams.p<? super U> pVar, U u4) {
            pVar.onNext(u4);
            return true;
        }

        void w() {
            synchronized (this) {
                this.H0.clear();
            }
        }
    }

    public p(io.reactivex.rxjava3.core.o<T> oVar, long j5, long j6, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, m3.s<U> sVar, int i5, boolean z4) {
        super(oVar);
        this.f16930c = j5;
        this.f16931d = j6;
        this.f16932e = timeUnit;
        this.f16933f = q0Var;
        this.f16934g = sVar;
        this.f16935h = i5;
        this.f16936i = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super U> pVar) {
        if (this.f16930c == this.f16931d && this.f16935h == Integer.MAX_VALUE) {
            this.f16598b.N6(new b(new io.reactivex.rxjava3.subscribers.e(pVar), this.f16934g, this.f16930c, this.f16932e, this.f16933f));
            return;
        }
        q0.c c5 = this.f16933f.c();
        if (this.f16930c == this.f16931d) {
            this.f16598b.N6(new a(new io.reactivex.rxjava3.subscribers.e(pVar), this.f16934g, this.f16930c, this.f16932e, this.f16935h, this.f16936i, c5));
        } else {
            this.f16598b.N6(new c(new io.reactivex.rxjava3.subscribers.e(pVar), this.f16934g, this.f16930c, this.f16931d, this.f16932e, c5));
        }
    }
}
