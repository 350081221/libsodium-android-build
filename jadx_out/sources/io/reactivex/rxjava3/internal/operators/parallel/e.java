package io.reactivex.rxjava3.internal.operators.parallel;

import java.util.Objects;
import m3.r;

/* loaded from: classes3.dex */
public final class e<T> extends io.reactivex.rxjava3.parallel.b<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<T> f18234a;

    /* renamed from: b, reason: collision with root package name */
    final r<? super T> f18235b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> f18236c;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18237a;

        static {
            int[] iArr = new int[io.reactivex.rxjava3.parallel.a.values().length];
            f18237a = iArr;
            try {
                iArr[io.reactivex.rxjava3.parallel.a.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18237a[io.reactivex.rxjava3.parallel.a.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18237a[io.reactivex.rxjava3.parallel.a.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class b<T> implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final r<? super T> f18238a;

        /* renamed from: b, reason: collision with root package name */
        final m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> f18239b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f18240c;

        /* renamed from: d, reason: collision with root package name */
        boolean f18241d;

        b(r<? super T> rVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar) {
            this.f18238a = rVar;
            this.f18239b = cVar;
        }

        @Override // org.reactivestreams.q
        public final void cancel() {
            this.f18240c.cancel();
        }

        @Override // org.reactivestreams.p
        public final void onNext(T t5) {
            if (!tryOnNext(t5) && !this.f18241d) {
                this.f18240c.request(1L);
            }
        }

        @Override // org.reactivestreams.q
        public final void request(long j5) {
            this.f18240c.request(j5);
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> extends b<T> {

        /* renamed from: e, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.fuseable.c<? super T> f18242e;

        c(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, r<? super T> rVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar2) {
            super(rVar, cVar2);
            this.f18242e = cVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.f18241d) {
                this.f18241d = true;
                this.f18242e.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18241d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18241d = true;
                this.f18242e.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18240c, qVar)) {
                this.f18240c = qVar;
                this.f18242e.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            int i5;
            if (!this.f18241d) {
                long j5 = 0;
                do {
                    try {
                        if (!this.f18238a.test(t5) || !this.f18242e.tryOnNext(t5)) {
                            return false;
                        }
                        return true;
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        try {
                            j5++;
                            io.reactivex.rxjava3.parallel.a apply = this.f18239b.apply(Long.valueOf(j5), th);
                            Objects.requireNonNull(apply, "The errorHandler returned a null ParallelFailureHandling");
                            i5 = a.f18237a[apply.ordinal()];
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.b.b(th2);
                            cancel();
                            onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
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
            return false;
        }
    }

    /* loaded from: classes3.dex */
    static final class d<T> extends b<T> {

        /* renamed from: e, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f18243e;

        d(org.reactivestreams.p<? super T> pVar, r<? super T> rVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar) {
            super(rVar, cVar);
            this.f18243e = pVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.f18241d) {
                this.f18241d = true;
                this.f18243e.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18241d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18241d = true;
                this.f18243e.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18240c, qVar)) {
                this.f18240c = qVar;
                this.f18243e.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            int i5;
            if (!this.f18241d) {
                long j5 = 0;
                do {
                    try {
                        if (!this.f18238a.test(t5)) {
                            return false;
                        }
                        this.f18243e.onNext(t5);
                        return true;
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        try {
                            j5++;
                            io.reactivex.rxjava3.parallel.a apply = this.f18239b.apply(Long.valueOf(j5), th);
                            Objects.requireNonNull(apply, "The errorHandler returned a null ParallelFailureHandling");
                            i5 = a.f18237a[apply.ordinal()];
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.b.b(th2);
                            cancel();
                            onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
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
            return false;
        }
    }

    public e(io.reactivex.rxjava3.parallel.b<T> bVar, r<? super T> rVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar) {
        this.f18234a = bVar;
        this.f18235b = rVar;
        this.f18236c = cVar;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18234a.M();
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
                pVarArr2[i5] = new c((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f18235b, this.f18236c);
            } else {
                pVarArr2[i5] = new d(pVar, this.f18235b, this.f18236c);
            }
        }
        this.f18234a.X(pVarArr2);
    }
}
