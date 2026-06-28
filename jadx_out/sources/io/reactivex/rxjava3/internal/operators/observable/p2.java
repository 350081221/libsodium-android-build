package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class p2<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f17952a;

    /* renamed from: b, reason: collision with root package name */
    final m3.c<T, T, T> f17953b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17954a;

        /* renamed from: b, reason: collision with root package name */
        final m3.c<T, T, T> f17955b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17956c;

        /* renamed from: d, reason: collision with root package name */
        T f17957d;

        /* renamed from: e, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17958e;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, m3.c<T, T, T> cVar) {
            this.f17954a = a0Var;
            this.f17955b = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17958e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17958e.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17956c) {
                return;
            }
            this.f17956c = true;
            T t5 = this.f17957d;
            this.f17957d = null;
            if (t5 != null) {
                this.f17954a.onSuccess(t5);
            } else {
                this.f17954a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17956c) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f17956c = true;
            this.f17957d = null;
            this.f17954a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (!this.f17956c) {
                T t6 = this.f17957d;
                if (t6 == null) {
                    this.f17957d = t5;
                    return;
                }
                try {
                    T apply = this.f17955b.apply(t6, t5);
                    Objects.requireNonNull(apply, "The reducer returned a null value");
                    this.f17957d = apply;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.f17958e.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17958e, eVar)) {
                this.f17958e = eVar;
                this.f17954a.onSubscribe(this);
            }
        }
    }

    public p2(io.reactivex.rxjava3.core.n0<T> n0Var, m3.c<T, T, T> cVar) {
        this.f17952a = n0Var;
        this.f17953b = cVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17952a.subscribe(new a(a0Var, this.f17953b));
    }
}
