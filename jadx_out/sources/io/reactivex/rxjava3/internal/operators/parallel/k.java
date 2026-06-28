package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.t;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class k<T, R> extends io.reactivex.rxjava3.parallel.b<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<T> f18262a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends R> f18263b;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.fuseable.c<? super R> f18264a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends R> f18265b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f18266c;

        /* renamed from: d, reason: collision with root package name */
        boolean f18267d;

        a(io.reactivex.rxjava3.internal.fuseable.c<? super R> cVar, m3.o<? super T, ? extends R> oVar) {
            this.f18264a = cVar;
            this.f18265b = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f18266c.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f18267d) {
                return;
            }
            this.f18267d = true;
            this.f18264a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18267d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18267d = true;
                this.f18264a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f18267d) {
                return;
            }
            try {
                R apply = this.f18265b.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null value");
                this.f18264a.onNext(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18266c, qVar)) {
                this.f18266c = qVar;
                this.f18264a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f18266c.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            if (this.f18267d) {
                return false;
            }
            try {
                R apply = this.f18265b.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null value");
                return this.f18264a.tryOnNext(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                cancel();
                onError(th);
                return false;
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, R> implements t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super R> f18268a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends R> f18269b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f18270c;

        /* renamed from: d, reason: collision with root package name */
        boolean f18271d;

        b(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends R> oVar) {
            this.f18268a = pVar;
            this.f18269b = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f18270c.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f18271d) {
                return;
            }
            this.f18271d = true;
            this.f18268a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18271d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18271d = true;
                this.f18268a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f18271d) {
                return;
            }
            try {
                R apply = this.f18269b.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null value");
                this.f18268a.onNext(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18270c, qVar)) {
                this.f18270c = qVar;
                this.f18268a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f18270c.request(j5);
        }
    }

    public k(io.reactivex.rxjava3.parallel.b<T> bVar, m3.o<? super T, ? extends R> oVar) {
        this.f18262a = bVar;
        this.f18263b = oVar;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18262a.M();
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
                pVarArr2[i5] = new a((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f18263b);
            } else {
                pVarArr2[i5] = new b(pVar, this.f18263b);
            }
        }
        this.f18262a.X(pVarArr2);
    }
}
