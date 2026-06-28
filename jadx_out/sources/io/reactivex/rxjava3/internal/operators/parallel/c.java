package io.reactivex.rxjava3.internal.operators.parallel;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class c<T> extends io.reactivex.rxjava3.parallel.b<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<T> f18213a;

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super T> f18214b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> f18215c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18216a;

        static {
            int[] iArr = new int[io.reactivex.rxjava3.parallel.a.values().length];
            f18216a = iArr;
            try {
                iArr[io.reactivex.rxjava3.parallel.a.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18216a[io.reactivex.rxjava3.parallel.a.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18216a[io.reactivex.rxjava3.parallel.a.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.fuseable.c<? super T> f18217a;

        /* renamed from: b, reason: collision with root package name */
        final m3.g<? super T> f18218b;

        /* renamed from: c, reason: collision with root package name */
        final m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> f18219c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f18220d;

        /* renamed from: e, reason: collision with root package name */
        boolean f18221e;

        b(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, m3.g<? super T> gVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar2) {
            this.f18217a = cVar;
            this.f18218b = gVar;
            this.f18219c = cVar2;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f18220d.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f18221e) {
                return;
            }
            this.f18221e = true;
            this.f18217a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18221e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18221e = true;
                this.f18217a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5) && !this.f18221e) {
                this.f18220d.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18220d, qVar)) {
                this.f18220d = qVar;
                this.f18217a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f18220d.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            int i5;
            if (this.f18221e) {
                return false;
            }
            long j5 = 0;
            do {
                try {
                    this.f18218b.accept(t5);
                    return this.f18217a.tryOnNext(t5);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    try {
                        j5++;
                        io.reactivex.rxjava3.parallel.a apply = this.f18219c.apply(Long.valueOf(j5), th);
                        Objects.requireNonNull(apply, "The errorHandler returned a null ParallelFailureHandling");
                        i5 = a.f18216a[apply.ordinal()];
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

    /* renamed from: io.reactivex.rxjava3.internal.operators.parallel.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0519c<T> implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f18222a;

        /* renamed from: b, reason: collision with root package name */
        final m3.g<? super T> f18223b;

        /* renamed from: c, reason: collision with root package name */
        final m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> f18224c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f18225d;

        /* renamed from: e, reason: collision with root package name */
        boolean f18226e;

        C0519c(org.reactivestreams.p<? super T> pVar, m3.g<? super T> gVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar) {
            this.f18222a = pVar;
            this.f18223b = gVar;
            this.f18224c = cVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f18225d.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f18226e) {
                return;
            }
            this.f18226e = true;
            this.f18222a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18226e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18226e = true;
                this.f18222a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5)) {
                this.f18225d.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18225d, qVar)) {
                this.f18225d = qVar;
                this.f18222a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f18225d.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            int i5;
            if (this.f18226e) {
                return false;
            }
            long j5 = 0;
            do {
                try {
                    this.f18223b.accept(t5);
                    this.f18222a.onNext(t5);
                    return true;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    try {
                        j5++;
                        io.reactivex.rxjava3.parallel.a apply = this.f18224c.apply(Long.valueOf(j5), th);
                        Objects.requireNonNull(apply, "The errorHandler returned a null ParallelFailureHandling");
                        i5 = a.f18216a[apply.ordinal()];
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

    public c(io.reactivex.rxjava3.parallel.b<T> bVar, m3.g<? super T> gVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar) {
        this.f18213a = bVar;
        this.f18214b = gVar;
        this.f18215c = cVar;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18213a.M();
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
                pVarArr2[i5] = new b((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f18214b, this.f18215c);
            } else {
                pVarArr2[i5] = new C0519c(pVar, this.f18214b, this.f18215c);
            }
        }
        this.f18213a.X(pVarArr2);
    }
}
