package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class q<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> implements io.reactivex.rxjava3.core.t<T> {

    /* renamed from: l, reason: collision with root package name */
    static final a[] f16958l = new a[0];

    /* renamed from: m, reason: collision with root package name */
    static final a[] f16959m = new a[0];

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f16960c;

    /* renamed from: d, reason: collision with root package name */
    final int f16961d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReference<a<T>[]> f16962e;

    /* renamed from: f, reason: collision with root package name */
    volatile long f16963f;

    /* renamed from: g, reason: collision with root package name */
    final b<T> f16964g;

    /* renamed from: h, reason: collision with root package name */
    b<T> f16965h;

    /* renamed from: i, reason: collision with root package name */
    int f16966i;

    /* renamed from: j, reason: collision with root package name */
    Throwable f16967j;

    /* renamed from: k, reason: collision with root package name */
    volatile boolean f16968k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicInteger implements org.reactivestreams.q {
        private static final long serialVersionUID = 6770240836423125754L;
        final org.reactivestreams.p<? super T> downstream;
        long index;
        b<T> node;
        int offset;
        final q<T> parent;
        final AtomicLong requested = new AtomicLong();

        a(org.reactivestreams.p<? super T> pVar, q<T> qVar) {
            this.downstream = pVar;
            this.parent = qVar;
            this.node = qVar.f16964g;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.r9(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.b(this.requested, j5);
                this.parent.s9(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        final T[] f16969a;

        /* renamed from: b, reason: collision with root package name */
        volatile b<T> f16970b;

        b(int i5) {
            this.f16969a = (T[]) new Object[i5];
        }
    }

    public q(io.reactivex.rxjava3.core.o<T> oVar, int i5) {
        super(oVar);
        this.f16961d = i5;
        this.f16960c = new AtomicBoolean();
        b<T> bVar = new b<>(i5);
        this.f16964g = bVar;
        this.f16965h = bVar;
        this.f16962e = new AtomicReference<>(f16958l);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        a<T> aVar = new a<>(pVar, this);
        pVar.onSubscribe(aVar);
        n9(aVar);
        if (!this.f16960c.get() && this.f16960c.compareAndSet(false, true)) {
            this.f16598b.N6(this);
        } else {
            s9(aVar);
        }
    }

    void n9(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f16962e.get();
            if (aVarArr == f16959m) {
                return;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f16962e, aVarArr, aVarArr2));
    }

    long o9() {
        return this.f16963f;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        this.f16968k = true;
        for (a<T> aVar : this.f16962e.getAndSet(f16959m)) {
            s9(aVar);
        }
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        if (this.f16968k) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        this.f16967j = th;
        this.f16968k = true;
        for (a<T> aVar : this.f16962e.getAndSet(f16959m)) {
            s9(aVar);
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        int i5 = this.f16966i;
        if (i5 == this.f16961d) {
            b<T> bVar = new b<>(i5);
            bVar.f16969a[0] = t5;
            this.f16966i = 1;
            this.f16965h.f16970b = bVar;
            this.f16965h = bVar;
        } else {
            this.f16965h.f16969a[i5] = t5;
            this.f16966i = i5 + 1;
        }
        this.f16963f++;
        for (a<T> aVar : this.f16962e.get()) {
            s9(aVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public void onSubscribe(org.reactivestreams.q qVar) {
        qVar.request(Long.MAX_VALUE);
    }

    boolean p9() {
        return this.f16962e.get().length != 0;
    }

    boolean q9() {
        return this.f16960c.get();
    }

    void r9(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f16962e.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    if (aVarArr[i5] == aVar) {
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
                aVarArr2 = f16958l;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!androidx.compose.animation.core.h.a(this.f16962e, aVarArr, aVarArr2));
    }

    void s9(a<T> aVar) {
        boolean z4;
        if (aVar.getAndIncrement() != 0) {
            return;
        }
        long j5 = aVar.index;
        int i5 = aVar.offset;
        b<T> bVar = aVar.node;
        AtomicLong atomicLong = aVar.requested;
        org.reactivestreams.p<? super T> pVar = aVar.downstream;
        int i6 = this.f16961d;
        int i7 = 1;
        while (true) {
            boolean z5 = this.f16968k;
            if (this.f16963f == j5) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z5 && z4) {
                aVar.node = null;
                Throwable th = this.f16967j;
                if (th != null) {
                    pVar.onError(th);
                    return;
                } else {
                    pVar.onComplete();
                    return;
                }
            }
            if (!z4) {
                long j6 = atomicLong.get();
                if (j6 == Long.MIN_VALUE) {
                    aVar.node = null;
                    return;
                } else if (j6 != j5) {
                    if (i5 == i6) {
                        bVar = bVar.f16970b;
                        i5 = 0;
                    }
                    pVar.onNext(bVar.f16969a[i5]);
                    i5++;
                    j5++;
                }
            }
            aVar.index = j5;
            aVar.offset = i5;
            aVar.node = bVar;
            i7 = aVar.addAndGet(-i7);
            if (i7 == 0) {
                return;
            }
        }
    }
}
