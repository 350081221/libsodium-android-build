package io.reactivex.rxjava3.internal.jdk8;

import java.util.Objects;
import java.util.Optional;

/* loaded from: classes3.dex */
public final class d0<T, R> extends io.reactivex.rxjava3.parallel.b<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<T> f16322a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, Optional<? extends R>> f16323b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> f16324c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16325a;

        static {
            int[] iArr = new int[io.reactivex.rxjava3.parallel.a.values().length];
            f16325a = iArr;
            try {
                iArr[io.reactivex.rxjava3.parallel.a.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16325a[io.reactivex.rxjava3.parallel.a.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16325a[io.reactivex.rxjava3.parallel.a.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, R> implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.fuseable.c<? super R> f16326a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, Optional<? extends R>> f16327b;

        /* renamed from: c, reason: collision with root package name */
        final m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> f16328c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f16329d;

        /* renamed from: e, reason: collision with root package name */
        boolean f16330e;

        b(io.reactivex.rxjava3.internal.fuseable.c<? super R> cVar, m3.o<? super T, Optional<? extends R>> oVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar2) {
            this.f16326a = cVar;
            this.f16327b = oVar;
            this.f16328c = cVar2;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16329d.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16330e) {
                return;
            }
            this.f16330e = true;
            this.f16326a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16330e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f16330e = true;
                this.f16326a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5) && !this.f16330e) {
                this.f16329d.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16329d, qVar)) {
                this.f16329d = qVar;
                this.f16326a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16329d.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            int i5;
            if (this.f16330e) {
                return false;
            }
            long j5 = 0;
            do {
                try {
                    Optional<? extends R> apply = this.f16327b.apply(t5);
                    Objects.requireNonNull(apply, "The mapper returned a null Optional");
                    Optional<? extends R> optional = apply;
                    if (!optional.isPresent() || !this.f16326a.tryOnNext(optional.get())) {
                        return false;
                    }
                    return true;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    try {
                        j5++;
                        io.reactivex.rxjava3.parallel.a apply2 = this.f16328c.apply(Long.valueOf(j5), th);
                        Objects.requireNonNull(apply2, "The errorHandler returned a null ParallelFailureHandling");
                        i5 = a.f16325a[apply2.ordinal()];
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
        final org.reactivestreams.p<? super R> f16331a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, Optional<? extends R>> f16332b;

        /* renamed from: c, reason: collision with root package name */
        final m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> f16333c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f16334d;

        /* renamed from: e, reason: collision with root package name */
        boolean f16335e;

        c(org.reactivestreams.p<? super R> pVar, m3.o<? super T, Optional<? extends R>> oVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar) {
            this.f16331a = pVar;
            this.f16332b = oVar;
            this.f16333c = cVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16334d.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16335e) {
                return;
            }
            this.f16335e = true;
            this.f16331a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16335e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f16335e = true;
                this.f16331a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5) && !this.f16335e) {
                this.f16334d.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16334d, qVar)) {
                this.f16334d = qVar;
                this.f16331a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16334d.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            int i5;
            if (this.f16335e) {
                return false;
            }
            long j5 = 0;
            do {
                try {
                    Optional<? extends R> apply = this.f16332b.apply(t5);
                    Objects.requireNonNull(apply, "The mapper returned a null Optional");
                    Optional<? extends R> optional = apply;
                    if (!optional.isPresent()) {
                        return false;
                    }
                    this.f16331a.onNext(optional.get());
                    return true;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    try {
                        j5++;
                        io.reactivex.rxjava3.parallel.a apply2 = this.f16333c.apply(Long.valueOf(j5), th);
                        Objects.requireNonNull(apply2, "The errorHandler returned a null ParallelFailureHandling");
                        i5 = a.f16325a[apply2.ordinal()];
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

    public d0(io.reactivex.rxjava3.parallel.b<T> bVar, m3.o<? super T, Optional<? extends R>> oVar, m3.c<? super Long, ? super Throwable, io.reactivex.rxjava3.parallel.a> cVar) {
        this.f16322a = bVar;
        this.f16323b = oVar;
        this.f16324c = cVar;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f16322a.M();
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
                pVarArr2[i5] = new b((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f16323b, this.f16324c);
            } else {
                pVarArr2[i5] = new c(pVar, this.f16323b, this.f16324c);
            }
        }
        this.f16322a.X(pVarArr2);
    }
}
