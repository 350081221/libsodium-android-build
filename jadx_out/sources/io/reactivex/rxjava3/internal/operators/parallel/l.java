package io.reactivex.rxjava3.internal.operators.parallel;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class l<T, R> extends io.reactivex.rxjava3.parallel.b<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<T> f18272a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends R> f18273b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> f18274c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18275a;

        static {
            int[] iArr = new int[io.reactivex.rxjava3.parallel.a.values().length];
            f18275a = iArr;
            try {
                iArr[io.reactivex.rxjava3.parallel.a.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18275a[io.reactivex.rxjava3.parallel.a.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18275a[io.reactivex.rxjava3.parallel.a.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, R> implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.fuseable.c<? super R> f18276a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends R> f18277b;

        /* renamed from: c, reason: collision with root package name */
        final m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> f18278c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f18279d;

        /* renamed from: e, reason: collision with root package name */
        boolean f18280e;

        b(io.reactivex.rxjava3.internal.fuseable.c<? super R> cVar, m3.o<? super T, ? extends R> oVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar2) {
            this.f18276a = cVar;
            this.f18277b = oVar;
            this.f18278c = cVar2;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f18279d.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f18280e) {
                return;
            }
            this.f18280e = true;
            this.f18276a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18280e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18280e = true;
                this.f18276a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5) && !this.f18280e) {
                this.f18279d.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18279d, qVar)) {
                this.f18279d = qVar;
                this.f18276a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f18279d.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            int i5;
            if (this.f18280e) {
                return false;
            }
            long j5 = 0;
            do {
                try {
                    R apply = this.f18277b.apply(t5);
                    Objects.requireNonNull(apply, "The mapper returned a null value");
                    return this.f18276a.tryOnNext(apply);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    try {
                        j5++;
                        io.reactivex.rxjava3.parallel.a apply2 = this.f18278c.apply(Long.valueOf(j5), th);
                        Objects.requireNonNull(apply2, "The errorHandler returned a null ParallelFailureHandling");
                        i5 = a.f18275a[apply2.ordinal()];
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        cancel();
                        onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
                        return false;
                    }
                }
            } while (i5 == 1);
            if (i5 != 2) {
                if (i5 != 3) {
                    cancel();
                    onError(th);
                    return false;
                }
                cancel();
                onComplete();
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T, R> implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super R> f18281a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends R> f18282b;

        /* renamed from: c, reason: collision with root package name */
        final m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> f18283c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f18284d;

        /* renamed from: e, reason: collision with root package name */
        boolean f18285e;

        c(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends R> oVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar) {
            this.f18281a = pVar;
            this.f18282b = oVar;
            this.f18283c = cVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f18284d.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f18285e) {
                return;
            }
            this.f18285e = true;
            this.f18281a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18285e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18285e = true;
                this.f18281a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5) && !this.f18285e) {
                this.f18284d.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18284d, qVar)) {
                this.f18284d = qVar;
                this.f18281a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f18284d.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            int i5;
            if (this.f18285e) {
                return false;
            }
            long j5 = 0;
            do {
                try {
                    R apply = this.f18282b.apply(t5);
                    Objects.requireNonNull(apply, "The mapper returned a null value");
                    this.f18281a.onNext(apply);
                    return true;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    try {
                        j5++;
                        io.reactivex.rxjava3.parallel.a apply2 = this.f18283c.apply(Long.valueOf(j5), th);
                        Objects.requireNonNull(apply2, "The errorHandler returned a null ParallelFailureHandling");
                        i5 = a.f18275a[apply2.ordinal()];
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        cancel();
                        onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
                        return false;
                    }
                }
            } while (i5 == 1);
            if (i5 != 2) {
                if (i5 != 3) {
                    cancel();
                    onError(th);
                    return false;
                }
                cancel();
                onComplete();
            }
            return false;
        }
    }

    public l(io.reactivex.rxjava3.parallel.b<T> bVar, m3.o<? super T, ? extends R> oVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar) {
        this.f18272a = bVar;
        this.f18273b = oVar;
        this.f18274c = cVar;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18272a.M();
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
                pVarArr2[i5] = new b((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f18273b, this.f18274c);
            } else {
                pVarArr2[i5] = new c(pVar, this.f18273b, this.f18274c);
            }
        }
        this.f18272a.X(pVarArr2);
    }
}
