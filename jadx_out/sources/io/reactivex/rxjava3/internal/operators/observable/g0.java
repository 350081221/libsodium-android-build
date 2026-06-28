package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class g0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f17687b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f17688c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17689d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f17690e;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17691a;

        /* renamed from: b, reason: collision with root package name */
        final long f17692b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f17693c;

        /* renamed from: d, reason: collision with root package name */
        final q0.c f17694d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f17695e;

        /* renamed from: f, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17696f;

        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.g0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0505a implements Runnable {
            RunnableC0505a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f17691a.onComplete();
                } finally {
                    a.this.f17694d.dispose();
                }
            }
        }

        /* loaded from: classes3.dex */
        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f17698a;

            b(Throwable th) {
                this.f17698a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f17691a.onError(this.f17698a);
                } finally {
                    a.this.f17694d.dispose();
                }
            }
        }

        /* loaded from: classes3.dex */
        final class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final T f17700a;

            c(T t5) {
                this.f17700a = t5;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f17691a.onNext(this.f17700a);
            }
        }

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, TimeUnit timeUnit, q0.c cVar, boolean z4) {
            this.f17691a = p0Var;
            this.f17692b = j5;
            this.f17693c = timeUnit;
            this.f17694d = cVar;
            this.f17695e = z4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17696f.dispose();
            this.f17694d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17694d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17694d.c(new RunnableC0505a(), this.f17692b, this.f17693c);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17694d.c(new b(th), this.f17695e ? this.f17692b : 0L, this.f17693c);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f17694d.c(new c(t5), this.f17692b, this.f17693c);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17696f, eVar)) {
                this.f17696f = eVar;
                this.f17691a.onSubscribe(this);
            }
        }
    }

    public g0(io.reactivex.rxjava3.core.n0<T> n0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        super(n0Var);
        this.f17687b = j5;
        this.f17688c = timeUnit;
        this.f17689d = q0Var;
        this.f17690e = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        io.reactivex.rxjava3.core.p0<? super T> mVar;
        if (this.f17690e) {
            mVar = p0Var;
        } else {
            mVar = new io.reactivex.rxjava3.observers.m(p0Var);
        }
        this.f17528a.subscribe(new a(mVar, this.f17687b, this.f17688c, this.f17689d.c(), this.f17690e));
    }
}
