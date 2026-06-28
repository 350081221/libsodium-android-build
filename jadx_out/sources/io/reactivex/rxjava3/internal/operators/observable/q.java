package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class q<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> implements io.reactivex.rxjava3.core.p0<T> {

    /* renamed from: k, reason: collision with root package name */
    static final a[] f17966k = new a[0];

    /* renamed from: l, reason: collision with root package name */
    static final a[] f17967l = new a[0];

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f17968b;

    /* renamed from: c, reason: collision with root package name */
    final int f17969c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<a<T>[]> f17970d;

    /* renamed from: e, reason: collision with root package name */
    volatile long f17971e;

    /* renamed from: f, reason: collision with root package name */
    final b<T> f17972f;

    /* renamed from: g, reason: collision with root package name */
    b<T> f17973g;

    /* renamed from: h, reason: collision with root package name */
    int f17974h;

    /* renamed from: i, reason: collision with root package name */
    Throwable f17975i;

    /* renamed from: j, reason: collision with root package name */
    volatile boolean f17976j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        long index;
        b<T> node;
        int offset;
        final q<T> parent;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, q<T> qVar) {
            this.downstream = p0Var;
            this.parent = qVar;
            this.node = qVar.f17972f;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.parent.M8(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.disposed;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        final T[] f17977a;

        /* renamed from: b, reason: collision with root package name */
        volatile b<T> f17978b;

        b(int i5) {
            this.f17977a = (T[]) new Object[i5];
        }
    }

    public q(io.reactivex.rxjava3.core.i0<T> i0Var, int i5) {
        super(i0Var);
        this.f17969c = i5;
        this.f17968b = new AtomicBoolean();
        b<T> bVar = new b<>(i5);
        this.f17972f = bVar;
        this.f17973g = bVar;
        this.f17970d = new AtomicReference<>(f17966k);
    }

    void I8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f17970d.get();
            if (aVarArr == f17967l) {
                return;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f17970d, aVarArr, aVarArr2));
    }

    long J8() {
        return this.f17971e;
    }

    boolean K8() {
        return this.f17970d.get().length != 0;
    }

    boolean L8() {
        return this.f17968b.get();
    }

    void M8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f17970d.get();
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
                aVarArr2 = f17966k;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!androidx.compose.animation.core.h.a(this.f17970d, aVarArr, aVarArr2));
    }

    void N8(a<T> aVar) {
        boolean z4;
        if (aVar.getAndIncrement() != 0) {
            return;
        }
        long j5 = aVar.index;
        int i5 = aVar.offset;
        b<T> bVar = aVar.node;
        io.reactivex.rxjava3.core.p0<? super T> p0Var = aVar.downstream;
        int i6 = this.f17969c;
        int i7 = 1;
        while (!aVar.disposed) {
            boolean z5 = this.f17976j;
            if (this.f17971e == j5) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z5 && z4) {
                aVar.node = null;
                Throwable th = this.f17975i;
                if (th != null) {
                    p0Var.onError(th);
                    return;
                } else {
                    p0Var.onComplete();
                    return;
                }
            }
            if (!z4) {
                if (i5 == i6) {
                    bVar = bVar.f17978b;
                    i5 = 0;
                }
                p0Var.onNext(bVar.f17977a[i5]);
                i5++;
                j5++;
            } else {
                aVar.index = j5;
                aVar.offset = i5;
                aVar.node = bVar;
                i7 = aVar.addAndGet(-i7);
                if (i7 == 0) {
                    return;
                }
            }
        }
        aVar.node = null;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        a<T> aVar = new a<>(p0Var, this);
        p0Var.onSubscribe(aVar);
        I8(aVar);
        if (!this.f17968b.get() && this.f17968b.compareAndSet(false, true)) {
            this.f17528a.subscribe(this);
        } else {
            N8(aVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        this.f17976j = true;
        for (a<T> aVar : this.f17970d.getAndSet(f17967l)) {
            N8(aVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        this.f17975i = th;
        this.f17976j = true;
        for (a<T> aVar : this.f17970d.getAndSet(f17967l)) {
            N8(aVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        int i5 = this.f17974h;
        if (i5 == this.f17969c) {
            b<T> bVar = new b<>(i5);
            bVar.f17977a[0] = t5;
            this.f17974h = 1;
            this.f17973g.f17978b = bVar;
            this.f17973g = bVar;
        } else {
            this.f17973g.f17977a[i5] = t5;
            this.f17974h = i5 + 1;
        }
        this.f17971e++;
        for (a<T> aVar : this.f17970d.get()) {
            N8(aVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
    }
}
