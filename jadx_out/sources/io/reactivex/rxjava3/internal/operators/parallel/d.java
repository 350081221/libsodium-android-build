package io.reactivex.rxjava3.internal.operators.parallel;

import m3.r;

/* loaded from: classes3.dex */
public final class d<T> extends io.reactivex.rxjava3.parallel.b<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<T> f18227a;

    /* renamed from: b, reason: collision with root package name */
    final r<? super T> f18228b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class a<T> implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final r<? super T> f18229a;

        /* renamed from: b, reason: collision with root package name */
        org.reactivestreams.q f18230b;

        /* renamed from: c, reason: collision with root package name */
        boolean f18231c;

        a(r<? super T> rVar) {
            this.f18229a = rVar;
        }

        @Override // org.reactivestreams.q
        public final void cancel() {
            this.f18230b.cancel();
        }

        @Override // org.reactivestreams.p
        public final void onNext(T t5) {
            if (!tryOnNext(t5) && !this.f18231c) {
                this.f18230b.request(1L);
            }
        }

        @Override // org.reactivestreams.q
        public final void request(long j5) {
            this.f18230b.request(j5);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends a<T> {

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.fuseable.c<? super T> f18232d;

        b(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, r<? super T> rVar) {
            super(rVar);
            this.f18232d = cVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.f18231c) {
                this.f18231c = true;
                this.f18232d.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18231c) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18231c = true;
                this.f18232d.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18230b, qVar)) {
                this.f18230b = qVar;
                this.f18232d.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            if (!this.f18231c) {
                try {
                    if (this.f18229a.test(t5)) {
                        return this.f18232d.tryOnNext(t5);
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    cancel();
                    onError(th);
                }
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> extends a<T> {

        /* renamed from: d, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f18233d;

        c(org.reactivestreams.p<? super T> pVar, r<? super T> rVar) {
            super(rVar);
            this.f18233d = pVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.f18231c) {
                this.f18231c = true;
                this.f18233d.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18231c) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18231c = true;
                this.f18233d.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18230b, qVar)) {
                this.f18230b = qVar;
                this.f18233d.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            if (!this.f18231c) {
                try {
                    if (this.f18229a.test(t5)) {
                        this.f18233d.onNext(t5);
                        return true;
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    cancel();
                    onError(th);
                }
            }
            return false;
        }
    }

    public d(io.reactivex.rxjava3.parallel.b<T> bVar, r<? super T> rVar) {
        this.f18227a = bVar;
        this.f18228b = rVar;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18227a.M();
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public void X(org.reactivestreams.p<? super T>[] pVarArr) {
        if (!b0(pVarArr)) {
            return;
        }
        int length = pVarArr.length;
        org.reactivestreams.p<? super T>[] pVarArr2 = new org.reactivestreams.p[length];
        for (int i5 = 0; i5 < length; i5++) {
            org.reactivestreams.p<? super T> pVar = pVarArr[i5];
            if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
                pVarArr2[i5] = new b((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f18228b);
            } else {
                pVarArr2[i5] = new c(pVar, this.f18228b);
            }
        }
        this.f18227a.X(pVarArr2);
    }
}
