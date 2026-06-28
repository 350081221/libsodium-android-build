package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.internal.fuseable.n;
import io.reactivex.rxjava3.internal.fuseable.q;
import io.reactivex.rxjava3.internal.subscriptions.j;
import io.reactivex.rxjava3.internal.util.k;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.p;

@l3.h("none")
@l3.b(l3.a.FULL)
/* loaded from: classes3.dex */
public final class d<T> extends c<T> {

    /* renamed from: m, reason: collision with root package name */
    static final a[] f18780m = new a[0];

    /* renamed from: n, reason: collision with root package name */
    static final a[] f18781n = new a[0];

    /* renamed from: e, reason: collision with root package name */
    final int f18785e;

    /* renamed from: f, reason: collision with root package name */
    final int f18786f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f18787g;

    /* renamed from: h, reason: collision with root package name */
    volatile q<T> f18788h;

    /* renamed from: i, reason: collision with root package name */
    volatile boolean f18789i;

    /* renamed from: j, reason: collision with root package name */
    volatile Throwable f18790j;

    /* renamed from: k, reason: collision with root package name */
    int f18791k;

    /* renamed from: l, reason: collision with root package name */
    int f18792l;

    /* renamed from: b, reason: collision with root package name */
    final AtomicInteger f18782b = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<a<T>[]> f18784d = new AtomicReference<>(f18780m);

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<org.reactivestreams.q> f18783c = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicLong implements org.reactivestreams.q {
        private static final long serialVersionUID = -363282618957264509L;
        final p<? super T> downstream;
        long emitted;
        final d<T> parent;

        a(p<? super T> pVar, d<T> dVar) {
            this.downstream = pVar;
            this.parent = dVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.z9(this);
            }
        }

        void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            }
        }

        void onNext(T t5) {
            if (get() != Long.MIN_VALUE) {
                this.emitted++;
                this.downstream.onNext(t5);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (j.validate(j5)) {
                long b5 = io.reactivex.rxjava3.internal.util.d.b(this, j5);
                if (b5 != Long.MIN_VALUE && b5 != Long.MAX_VALUE) {
                    this.parent.x9();
                }
            }
        }
    }

    d(int i5, boolean z4) {
        this.f18785e = i5;
        this.f18786f = i5 - (i5 >> 2);
        this.f18787g = z4;
    }

    @l3.d
    @l3.f
    public static <T> d<T> t9() {
        return new d<>(o.c0(), false);
    }

    @l3.d
    @l3.f
    public static <T> d<T> u9(int i5) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "bufferSize");
        return new d<>(i5, false);
    }

    @l3.d
    @l3.f
    public static <T> d<T> v9(int i5, boolean z4) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "bufferSize");
        return new d<>(i5, z4);
    }

    @l3.d
    @l3.f
    public static <T> d<T> w9(boolean z4) {
        return new d<>(o.c0(), z4);
    }

    public void A9() {
        if (j.setOnce(this.f18783c, io.reactivex.rxjava3.internal.subscriptions.g.INSTANCE)) {
            this.f18788h = new io.reactivex.rxjava3.internal.queue.b(this.f18785e);
        }
    }

    public void B9() {
        if (j.setOnce(this.f18783c, io.reactivex.rxjava3.internal.subscriptions.g.INSTANCE)) {
            this.f18788h = new io.reactivex.rxjava3.internal.queue.c(this.f18785e);
        }
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(@l3.f p<? super T> pVar) {
        Throwable th;
        a<T> aVar = new a<>(pVar, this);
        pVar.onSubscribe(aVar);
        if (s9(aVar)) {
            if (aVar.get() == Long.MIN_VALUE) {
                z9(aVar);
                return;
            } else {
                x9();
                return;
            }
        }
        if (this.f18789i && (th = this.f18790j) != null) {
            pVar.onError(th);
        } else {
            pVar.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public Throwable n9() {
        if (this.f18789i) {
            return this.f18790j;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean o9() {
        return this.f18789i && this.f18790j == null;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        this.f18789i = true;
        x9();
    }

    @Override // org.reactivestreams.p
    public void onError(@l3.f Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        if (!this.f18789i) {
            this.f18790j = th;
            this.f18789i = true;
            x9();
            return;
        }
        io.reactivex.rxjava3.plugins.a.Y(th);
    }

    @Override // org.reactivestreams.p
    public void onNext(@l3.f T t5) {
        if (this.f18789i) {
            return;
        }
        if (this.f18792l == 0) {
            k.d(t5, "onNext called with a null value.");
            if (!this.f18788h.offer(t5)) {
                j.cancel(this.f18783c);
                onError(new io.reactivex.rxjava3.exceptions.c());
                return;
            }
        }
        x9();
    }

    @Override // org.reactivestreams.p
    public void onSubscribe(@l3.f org.reactivestreams.q qVar) {
        if (j.setOnce(this.f18783c, qVar)) {
            if (qVar instanceof n) {
                n nVar = (n) qVar;
                int requestFusion = nVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.f18792l = requestFusion;
                    this.f18788h = nVar;
                    this.f18789i = true;
                    x9();
                    return;
                }
                if (requestFusion == 2) {
                    this.f18792l = requestFusion;
                    this.f18788h = nVar;
                    qVar.request(this.f18785e);
                    return;
                }
            }
            this.f18788h = new io.reactivex.rxjava3.internal.queue.b(this.f18785e);
            qVar.request(this.f18785e);
        }
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean p9() {
        return this.f18784d.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean q9() {
        return this.f18789i && this.f18790j != null;
    }

    boolean s9(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18784d.get();
            if (aVarArr == f18781n) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f18784d, aVarArr, aVarArr2));
        return true;
    }

    void x9() {
        T t5;
        boolean z4;
        if (this.f18782b.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<a<T>[]> atomicReference = this.f18784d;
        int i5 = this.f18791k;
        int i6 = this.f18786f;
        int i7 = this.f18792l;
        int i8 = 1;
        while (true) {
            q<T> qVar = this.f18788h;
            if (qVar != null) {
                a<T>[] aVarArr = atomicReference.get();
                if (aVarArr.length != 0) {
                    int length = aVarArr.length;
                    long j5 = -1;
                    long j6 = -1;
                    int i9 = 0;
                    while (i9 < length) {
                        a<T> aVar = aVarArr[i9];
                        long j7 = aVar.get();
                        if (j7 >= 0) {
                            if (j6 == j5) {
                                j6 = j7 - aVar.emitted;
                            } else {
                                j6 = Math.min(j6, j7 - aVar.emitted);
                            }
                        }
                        i9++;
                        j5 = -1;
                    }
                    int i10 = i5;
                    while (j6 > 0) {
                        a<T>[] aVarArr2 = atomicReference.get();
                        if (aVarArr2 == f18781n) {
                            qVar.clear();
                            return;
                        }
                        if (aVarArr != aVarArr2) {
                            break;
                        }
                        boolean z5 = this.f18789i;
                        try {
                            t5 = qVar.poll();
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            j.cancel(this.f18783c);
                            this.f18790j = th;
                            this.f18789i = true;
                            t5 = null;
                            z5 = true;
                        }
                        if (t5 == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z5 && z4) {
                            Throwable th2 = this.f18790j;
                            if (th2 != null) {
                                for (a<T> aVar2 : atomicReference.getAndSet(f18781n)) {
                                    aVar2.onError(th2);
                                }
                                return;
                            }
                            for (a<T> aVar3 : atomicReference.getAndSet(f18781n)) {
                                aVar3.onComplete();
                            }
                            return;
                        }
                        if (z4) {
                            break;
                        }
                        for (a<T> aVar4 : aVarArr) {
                            aVar4.onNext(t5);
                        }
                        j6--;
                        if (i7 != 1 && (i10 = i10 + 1) == i6) {
                            this.f18783c.get().request(i6);
                            i10 = 0;
                        }
                    }
                    if (j6 == 0) {
                        a<T>[] aVarArr3 = atomicReference.get();
                        a<T>[] aVarArr4 = f18781n;
                        if (aVarArr3 == aVarArr4) {
                            qVar.clear();
                            return;
                        }
                        if (aVarArr != aVarArr3) {
                            i5 = i10;
                        } else if (this.f18789i && qVar.isEmpty()) {
                            Throwable th3 = this.f18790j;
                            if (th3 != null) {
                                for (a<T> aVar5 : atomicReference.getAndSet(aVarArr4)) {
                                    aVar5.onError(th3);
                                }
                                return;
                            }
                            for (a<T> aVar6 : atomicReference.getAndSet(aVarArr4)) {
                                aVar6.onComplete();
                            }
                            return;
                        }
                    }
                    i5 = i10;
                }
            }
            this.f18791k = i5;
            i8 = this.f18782b.addAndGet(-i8);
            if (i8 == 0) {
                return;
            }
        }
    }

    @l3.d
    public boolean y9(@l3.f T t5) {
        k.d(t5, "offer called with a null value.");
        if (this.f18789i) {
            return false;
        }
        if (this.f18792l == 0) {
            if (!this.f18788h.offer(t5)) {
                return false;
            }
            x9();
            return true;
        }
        throw new IllegalStateException("offer() should not be called in fusion mode!");
    }

    void z9(a<T> aVar) {
        while (true) {
            a<T>[] aVarArr = this.f18784d.get();
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
            if (i5 >= 0) {
                if (length == 1) {
                    if (this.f18787g) {
                        if (androidx.compose.animation.core.h.a(this.f18784d, aVarArr, f18781n)) {
                            j.cancel(this.f18783c);
                            this.f18789i = true;
                            return;
                        }
                    } else if (androidx.compose.animation.core.h.a(this.f18784d, aVarArr, f18780m)) {
                        return;
                    }
                } else {
                    a[] aVarArr2 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, i5);
                    System.arraycopy(aVarArr, i5 + 1, aVarArr2, i5, (length - i5) - 1);
                    if (androidx.compose.animation.core.h.a(this.f18784d, aVarArr, aVarArr2)) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }
}
