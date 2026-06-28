package io.reactivex.rxjava3.internal.operators.observable;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class q0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f17979b;

    /* renamed from: c, reason: collision with root package name */
    final T f17980c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f17981d;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17982a;

        /* renamed from: b, reason: collision with root package name */
        final long f17983b;

        /* renamed from: c, reason: collision with root package name */
        final T f17984c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f17985d;

        /* renamed from: e, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17986e;

        /* renamed from: f, reason: collision with root package name */
        long f17987f;

        /* renamed from: g, reason: collision with root package name */
        boolean f17988g;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, T t5, boolean z4) {
            this.f17982a = p0Var;
            this.f17983b = j5;
            this.f17984c = t5;
            this.f17985d = z4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17986e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17986e.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!this.f17988g) {
                this.f17988g = true;
                T t5 = this.f17984c;
                if (t5 == null && this.f17985d) {
                    this.f17982a.onError(new NoSuchElementException());
                    return;
                }
                if (t5 != null) {
                    this.f17982a.onNext(t5);
                }
                this.f17982a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17988g) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17988g = true;
                this.f17982a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17988g) {
                return;
            }
            long j5 = this.f17987f;
            if (j5 == this.f17983b) {
                this.f17988g = true;
                this.f17986e.dispose();
                this.f17982a.onNext(t5);
                this.f17982a.onComplete();
                return;
            }
            this.f17987f = j5 + 1;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17986e, eVar)) {
                this.f17986e = eVar;
                this.f17982a.onSubscribe(this);
            }
        }
    }

    public q0(io.reactivex.rxjava3.core.n0<T> n0Var, long j5, T t5, boolean z4) {
        super(n0Var);
        this.f17979b = j5;
        this.f17980c = t5;
        this.f17981d = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17979b, this.f17980c, this.f17981d));
    }
}
