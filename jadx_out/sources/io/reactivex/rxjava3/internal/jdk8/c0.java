package io.reactivex.rxjava3.internal.jdk8;

import java.util.Objects;
import java.util.Optional;

/* loaded from: classes3.dex */
public final class c0<T, R> extends io.reactivex.rxjava3.parallel.b<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<T> f16304a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, Optional<? extends R>> f16305b;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.fuseable.c<? super R> f16306a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, Optional<? extends R>> f16307b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f16308c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16309d;

        a(io.reactivex.rxjava3.internal.fuseable.c<? super R> cVar, m3.o<? super T, Optional<? extends R>> oVar) {
            this.f16306a = cVar;
            this.f16307b = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16308c.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16309d) {
                return;
            }
            this.f16309d = true;
            this.f16306a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16309d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f16309d = true;
                this.f16306a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5)) {
                this.f16308c.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16308c, qVar)) {
                this.f16308c = qVar;
                this.f16306a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16308c.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            if (this.f16309d) {
                return false;
            }
            try {
                Optional<? extends R> apply = this.f16307b.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null value");
                Optional<? extends R> optional = apply;
                if (!optional.isPresent() || !this.f16306a.tryOnNext(optional.get())) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                cancel();
                onError(th);
                return false;
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, R> implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super R> f16310a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, Optional<? extends R>> f16311b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f16312c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16313d;

        b(org.reactivestreams.p<? super R> pVar, m3.o<? super T, Optional<? extends R>> oVar) {
            this.f16310a = pVar;
            this.f16311b = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16312c.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16313d) {
                return;
            }
            this.f16313d = true;
            this.f16310a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16313d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f16313d = true;
                this.f16310a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5)) {
                this.f16312c.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16312c, qVar)) {
                this.f16312c = qVar;
                this.f16310a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16312c.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            if (this.f16313d) {
                return true;
            }
            try {
                Optional<? extends R> apply = this.f16311b.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null Optional");
                Optional<? extends R> optional = apply;
                if (optional.isPresent()) {
                    this.f16310a.onNext(optional.get());
                    return true;
                }
                return false;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                cancel();
                onError(th);
                return true;
            }
        }
    }

    public c0(io.reactivex.rxjava3.parallel.b<T> bVar, m3.o<? super T, Optional<? extends R>> oVar) {
        this.f16304a = bVar;
        this.f16305b = oVar;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f16304a.M();
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public void X(org.reactivestreams.p<? super R>[] pVarArr) {
        if (!b0(pVarArr)) {
            return;
        }
        int length = pVarArr.length;
        org.reactivestreams.p<? super T>[] pVarArr2 = new org.reactivestreams.p[length];
        for (int i5 = 0; i5 < length; i5++) {
            org.reactivestreams.p<? super R> pVar = pVarArr[i5];
            if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
                pVarArr2[i5] = new a((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f16305b);
            } else {
                pVarArr2[i5] = new b(pVar, this.f16305b);
            }
        }
        this.f16304a.X(pVarArr2);
    }
}
