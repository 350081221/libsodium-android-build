package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c extends io.reactivex.rxjava3.core.c implements io.reactivex.rxjava3.core.f {

    /* renamed from: e, reason: collision with root package name */
    static final a[] f16482e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    static final a[] f16483f = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16484a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<a[]> f16485b = new AtomicReference<>(f16482e);

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f16486c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    Throwable f16487d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class a extends AtomicBoolean implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 8943152917179642732L;
        final io.reactivex.rxjava3.core.f downstream;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.downstream = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (compareAndSet(false, true)) {
                c.this.C1(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get();
        }
    }

    public c(io.reactivex.rxjava3.core.i iVar) {
        this.f16484a = iVar;
    }

    boolean B1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f16485b.get();
            if (aVarArr == f16483f) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f16485b, aVarArr, aVarArr2));
        return true;
    }

    void C1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f16485b.get();
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
                aVarArr2 = f16482e;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!androidx.compose.animation.core.h.a(this.f16485b, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        a aVar = new a(fVar);
        fVar.onSubscribe(aVar);
        if (B1(aVar)) {
            if (aVar.isDisposed()) {
                C1(aVar);
            }
            if (this.f16486c.compareAndSet(false, true)) {
                this.f16484a.a(this);
                return;
            }
            return;
        }
        Throwable th = this.f16487d;
        if (th != null) {
            fVar.onError(th);
        } else {
            fVar.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onComplete() {
        for (a aVar : this.f16485b.getAndSet(f16483f)) {
            if (!aVar.get()) {
                aVar.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        this.f16487d = th;
        for (a aVar : this.f16485b.getAndSet(f16483f)) {
            if (!aVar.get()) {
                aVar.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
    }
}
