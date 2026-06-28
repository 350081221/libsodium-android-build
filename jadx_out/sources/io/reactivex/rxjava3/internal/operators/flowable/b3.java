package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class b3<T> extends io.reactivex.rxjava3.core.x<T> implements io.reactivex.rxjava3.internal.fuseable.j<T>, io.reactivex.rxjava3.internal.fuseable.d<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f16619a;

    /* renamed from: b, reason: collision with root package name */
    final m3.c<T, T, T> f16620b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f16621a;

        /* renamed from: b, reason: collision with root package name */
        final m3.c<T, T, T> f16622b;

        /* renamed from: c, reason: collision with root package name */
        T f16623c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f16624d;

        /* renamed from: e, reason: collision with root package name */
        boolean f16625e;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, m3.c<T, T, T> cVar) {
            this.f16621a = a0Var;
            this.f16622b = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16624d.cancel();
            this.f16625e = true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16625e;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16625e) {
                return;
            }
            this.f16625e = true;
            T t5 = this.f16623c;
            if (t5 != null) {
                this.f16621a.onSuccess(t5);
            } else {
                this.f16621a.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16625e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f16625e = true;
                this.f16621a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f16625e) {
                return;
            }
            T t6 = this.f16623c;
            if (t6 == null) {
                this.f16623c = t5;
                return;
            }
            try {
                T apply = this.f16622b.apply(t6, t5);
                Objects.requireNonNull(apply, "The reducer returned a null value");
                this.f16623c = apply;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16624d.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16624d, qVar)) {
                this.f16624d = qVar;
                this.f16621a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public b3(io.reactivex.rxjava3.core.o<T> oVar, m3.c<T, T, T> cVar) {
        this.f16619a = oVar;
        this.f16620b = cVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f16619a.N6(new a(a0Var, this.f16620b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<T> d() {
        return io.reactivex.rxjava3.plugins.a.P(new a3(this.f16619a, this.f16620b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.j
    public org.reactivestreams.o<T> source() {
        return this.f16619a;
    }
}
