package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d0<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<U>> f17590b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, U> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17591a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<U>> f17592b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17593c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.rxjava3.disposables.e> f17594d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        volatile long f17595e;

        /* renamed from: f, reason: collision with root package name */
        boolean f17596f;

        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.d0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0501a<T, U> extends io.reactivex.rxjava3.observers.e<U> {

            /* renamed from: b, reason: collision with root package name */
            final a<T, U> f17597b;

            /* renamed from: c, reason: collision with root package name */
            final long f17598c;

            /* renamed from: d, reason: collision with root package name */
            final T f17599d;

            /* renamed from: e, reason: collision with root package name */
            boolean f17600e;

            /* renamed from: f, reason: collision with root package name */
            final AtomicBoolean f17601f = new AtomicBoolean();

            C0501a(a<T, U> aVar, long j5, T t5) {
                this.f17597b = aVar;
                this.f17598c = j5;
                this.f17599d = t5;
            }

            void b() {
                if (this.f17601f.compareAndSet(false, true)) {
                    this.f17597b.a(this.f17598c, this.f17599d);
                }
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onComplete() {
                if (this.f17600e) {
                    return;
                }
                this.f17600e = true;
                b();
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onError(Throwable th) {
                if (this.f17600e) {
                    io.reactivex.rxjava3.plugins.a.Y(th);
                } else {
                    this.f17600e = true;
                    this.f17597b.onError(th);
                }
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onNext(U u4) {
                if (this.f17600e) {
                    return;
                }
                this.f17600e = true;
                dispose();
                b();
            }
        }

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<U>> oVar) {
            this.f17591a = p0Var;
            this.f17592b = oVar;
        }

        void a(long j5, T t5) {
            if (j5 == this.f17595e) {
                this.f17591a.onNext(t5);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17593c.dispose();
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.f17594d);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17593c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17596f) {
                return;
            }
            this.f17596f = true;
            io.reactivex.rxjava3.disposables.e eVar = this.f17594d.get();
            if (eVar != io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
                C0501a c0501a = (C0501a) eVar;
                if (c0501a != null) {
                    c0501a.b();
                }
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.f17594d);
                this.f17591a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.f17594d);
            this.f17591a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17596f) {
                return;
            }
            long j5 = this.f17595e + 1;
            this.f17595e = j5;
            io.reactivex.rxjava3.disposables.e eVar = this.f17594d.get();
            if (eVar != null) {
                eVar.dispose();
            }
            try {
                io.reactivex.rxjava3.core.n0<U> apply = this.f17592b.apply(t5);
                Objects.requireNonNull(apply, "The ObservableSource supplied is null");
                io.reactivex.rxjava3.core.n0<U> n0Var = apply;
                C0501a c0501a = new C0501a(this, j5, t5);
                if (androidx.compose.animation.core.h.a(this.f17594d, eVar, c0501a)) {
                    n0Var.subscribe(c0501a);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                dispose();
                this.f17591a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17593c, eVar)) {
                this.f17593c = eVar;
                this.f17591a.onSubscribe(this);
            }
        }
    }

    public d0(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<U>> oVar) {
        super(n0Var);
        this.f17590b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(new io.reactivex.rxjava3.observers.m(p0Var), this.f17590b));
    }
}
