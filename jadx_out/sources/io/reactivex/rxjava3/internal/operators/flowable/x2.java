package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class x2<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super io.reactivex.rxjava3.core.o<T>, ? extends org.reactivestreams.o<? extends R>> f17161c;

    /* renamed from: d, reason: collision with root package name */
    final int f17162d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f17163e;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.core.o<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: m, reason: collision with root package name */
        static final b[] f17164m = new b[0];

        /* renamed from: n, reason: collision with root package name */
        static final b[] f17165n = new b[0];

        /* renamed from: d, reason: collision with root package name */
        final int f17168d;

        /* renamed from: e, reason: collision with root package name */
        final int f17169e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f17170f;

        /* renamed from: h, reason: collision with root package name */
        volatile io.reactivex.rxjava3.internal.fuseable.q<T> f17172h;

        /* renamed from: i, reason: collision with root package name */
        int f17173i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f17174j;

        /* renamed from: k, reason: collision with root package name */
        Throwable f17175k;

        /* renamed from: l, reason: collision with root package name */
        int f17176l;

        /* renamed from: b, reason: collision with root package name */
        final AtomicInteger f17166b = new AtomicInteger();

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.q> f17171g = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<b<T>[]> f17167c = new AtomicReference<>(f17164m);

        a(int i5, boolean z4) {
            this.f17168d = i5;
            this.f17169e = i5 - (i5 >> 2);
            this.f17170f = z4;
        }

        @Override // io.reactivex.rxjava3.core.o
        protected void O6(org.reactivestreams.p<? super T> pVar) {
            b<T> bVar = new b<>(pVar, this);
            pVar.onSubscribe(bVar);
            if (n9(bVar)) {
                if (bVar.isCancelled()) {
                    r9(bVar);
                    return;
                } else {
                    p9();
                    return;
                }
            }
            Throwable th = this.f17175k;
            if (th != null) {
                pVar.onError(th);
            } else {
                pVar.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar;
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.f17171g);
            if (this.f17166b.getAndIncrement() == 0 && (qVar = this.f17172h) != null) {
                qVar.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17171g.get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        boolean n9(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f17167c.get();
                if (bVarArr == f17165n) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!androidx.compose.animation.core.h.a(this.f17167c, bVarArr, bVarArr2));
            return true;
        }

        void o9() {
            for (b<T> bVar : this.f17167c.getAndSet(f17165n)) {
                if (bVar.get() != Long.MIN_VALUE) {
                    bVar.downstream.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.f17174j) {
                this.f17174j = true;
                p9();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f17174j) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f17175k = th;
            this.f17174j = true;
            p9();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f17174j) {
                return;
            }
            if (this.f17173i == 0 && !this.f17172h.offer(t5)) {
                this.f17171g.get().cancel();
                onError(new io.reactivex.rxjava3.exceptions.c());
            } else {
                p9();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.f17171g, qVar)) {
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                    int requestFusion = nVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f17173i = requestFusion;
                        this.f17172h = nVar;
                        this.f17174j = true;
                        p9();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.f17173i = requestFusion;
                        this.f17172h = nVar;
                        io.reactivex.rxjava3.internal.util.v.j(qVar, this.f17168d);
                        return;
                    }
                }
                this.f17172h = io.reactivex.rxjava3.internal.util.v.c(this.f17168d);
                io.reactivex.rxjava3.internal.util.v.j(qVar, this.f17168d);
            }
        }

        void p9() {
            boolean z4;
            AtomicReference<b<T>[]> atomicReference;
            Throwable th;
            boolean z5;
            Throwable th2;
            if (this.f17166b.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.f17172h;
            int i5 = this.f17176l;
            int i6 = this.f17169e;
            if (this.f17173i != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            AtomicReference<b<T>[]> atomicReference2 = this.f17167c;
            b<T>[] bVarArr = atomicReference2.get();
            int i7 = 1;
            while (true) {
                int length = bVarArr.length;
                if (qVar != null && length != 0) {
                    int length2 = bVarArr.length;
                    long j5 = Long.MAX_VALUE;
                    long j6 = Long.MAX_VALUE;
                    int i8 = 0;
                    while (i8 < length2) {
                        b<T> bVar = bVarArr[i8];
                        AtomicReference<b<T>[]> atomicReference3 = atomicReference2;
                        long j7 = bVar.get() - bVar.emitted;
                        if (j7 != Long.MIN_VALUE) {
                            if (j6 > j7) {
                                j6 = j7;
                            }
                        } else {
                            length--;
                        }
                        i8++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j8 = 0;
                    if (length == 0) {
                        j6 = 0;
                    }
                    while (j6 != j8) {
                        if (isDisposed()) {
                            qVar.clear();
                            return;
                        }
                        boolean z6 = this.f17174j;
                        if (z6 && !this.f17170f && (th2 = this.f17175k) != null) {
                            q9(th2);
                            return;
                        }
                        try {
                            T poll = qVar.poll();
                            if (poll == null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z6 && z5) {
                                Throwable th3 = this.f17175k;
                                if (th3 != null) {
                                    q9(th3);
                                    return;
                                } else {
                                    o9();
                                    return;
                                }
                            }
                            if (z5) {
                                break;
                            }
                            int length3 = bVarArr.length;
                            int i9 = 0;
                            boolean z7 = false;
                            while (i9 < length3) {
                                b<T> bVar2 = bVarArr[i9];
                                long j9 = bVar2.get();
                                if (j9 != Long.MIN_VALUE) {
                                    if (j9 != j5) {
                                        bVar2.emitted++;
                                    }
                                    bVar2.downstream.onNext(poll);
                                } else {
                                    z7 = true;
                                }
                                i9++;
                                j5 = Long.MAX_VALUE;
                            }
                            j6--;
                            if (z4 && (i5 = i5 + 1) == i6) {
                                this.f17171g.get().request(i6);
                                i5 = 0;
                            }
                            b<T>[] bVarArr2 = atomicReference.get();
                            if (!z7 && bVarArr2 == bVarArr) {
                                j8 = 0;
                                j5 = Long.MAX_VALUE;
                            } else {
                                bVarArr = bVarArr2;
                                break;
                            }
                        } catch (Throwable th4) {
                            io.reactivex.rxjava3.exceptions.b.b(th4);
                            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.f17171g);
                            q9(th4);
                            return;
                        }
                    }
                    if (j6 == j8) {
                        if (isDisposed()) {
                            qVar.clear();
                            return;
                        }
                        boolean z8 = this.f17174j;
                        if (z8 && !this.f17170f && (th = this.f17175k) != null) {
                            q9(th);
                            return;
                        }
                        if (z8 && qVar.isEmpty()) {
                            Throwable th5 = this.f17175k;
                            if (th5 != null) {
                                q9(th5);
                                return;
                            } else {
                                o9();
                                return;
                            }
                        }
                    }
                } else {
                    atomicReference = atomicReference2;
                }
                this.f17176l = i5;
                i7 = this.f17166b.addAndGet(-i7);
                if (i7 == 0) {
                    return;
                }
                if (qVar == null) {
                    qVar = this.f17172h;
                }
                bVarArr = atomicReference.get();
                atomicReference2 = atomicReference;
            }
        }

        void q9(Throwable th) {
            for (b<T> bVar : this.f17167c.getAndSet(f17165n)) {
                if (bVar.get() != Long.MIN_VALUE) {
                    bVar.downstream.onError(th);
                }
            }
        }

        void r9(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f17167c.get();
                int length = bVarArr.length;
                if (length == 0) {
                    return;
                }
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (bVarArr[i5] == bVar) {
                            break;
                        } else {
                            i5++;
                        }
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                if (i5 < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr2 = f17164m;
                } else {
                    b[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr, 0, bVarArr3, 0, i5);
                    System.arraycopy(bVarArr, i5 + 1, bVarArr3, i5, (length - i5) - 1);
                    bVarArr2 = bVarArr3;
                }
            } while (!androidx.compose.animation.core.h.a(this.f17167c, bVarArr, bVarArr2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AtomicLong implements org.reactivestreams.q {
        private static final long serialVersionUID = 8664815189257569791L;
        final org.reactivestreams.p<? super T> downstream;
        long emitted;
        final a<T> parent;

        b(org.reactivestreams.p<? super T> pVar, a<T> aVar) {
            this.downstream = pVar;
            this.parent = aVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.r9(this);
                this.parent.p9();
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.b(this, j5);
                this.parent.p9();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class c<R> implements io.reactivex.rxjava3.core.t<R>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super R> f17177a;

        /* renamed from: b, reason: collision with root package name */
        final a<?> f17178b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f17179c;

        c(org.reactivestreams.p<? super R> pVar, a<?> aVar) {
            this.f17177a = pVar;
            this.f17178b = aVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f17179c.cancel();
            this.f17178b.dispose();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f17177a.onComplete();
            this.f17178b.dispose();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f17177a.onError(th);
            this.f17178b.dispose();
        }

        @Override // org.reactivestreams.p
        public void onNext(R r5) {
            this.f17177a.onNext(r5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17179c, qVar)) {
                this.f17179c = qVar;
                this.f17177a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f17179c.request(j5);
        }
    }

    public x2(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super io.reactivex.rxjava3.core.o<T>, ? extends org.reactivestreams.o<? extends R>> oVar2, int i5, boolean z4) {
        super(oVar);
        this.f17161c = oVar2;
        this.f17162d = i5;
        this.f17163e = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        a aVar = new a(this.f17162d, this.f17163e);
        try {
            org.reactivestreams.o<? extends R> apply = this.f17161c.apply(aVar);
            Objects.requireNonNull(apply, "selector returned a null Publisher");
            apply.subscribe(new c(pVar, aVar));
            this.f16598b.N6(aVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
