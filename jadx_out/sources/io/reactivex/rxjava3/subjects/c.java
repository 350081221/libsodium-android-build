package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.internal.util.k;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c extends io.reactivex.rxjava3.core.c implements io.reactivex.rxjava3.core.f {

    /* renamed from: d, reason: collision with root package name */
    static final a[] f18882d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    static final a[] f18883e = new a[0];

    /* renamed from: c, reason: collision with root package name */
    Throwable f18886c;

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f18885b = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<a[]> f18884a = new AtomicReference<>(f18882d);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends AtomicReference<c> implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -7650903191002190468L;
        final io.reactivex.rxjava3.core.f downstream;

        a(io.reactivex.rxjava3.core.f fVar, c cVar) {
            this.downstream = fVar;
            lazySet(cVar);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            c andSet = getAndSet(null);
            if (andSet != null) {
                andSet.I1(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == null;
        }
    }

    c() {
    }

    @l3.d
    @l3.f
    public static c C1() {
        return new c();
    }

    boolean B1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18884a.get();
            if (aVarArr == f18883e) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f18884a, aVarArr, aVarArr2));
        return true;
    }

    @l3.g
    public Throwable D1() {
        if (this.f18884a.get() == f18883e) {
            return this.f18886c;
        }
        return null;
    }

    public boolean E1() {
        return this.f18884a.get() == f18883e && this.f18886c == null;
    }

    public boolean F1() {
        return this.f18884a.get().length != 0;
    }

    public boolean G1() {
        return this.f18884a.get() == f18883e && this.f18886c != null;
    }

    int H1() {
        return this.f18884a.get().length;
    }

    void I1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18884a.get();
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
                aVarArr2 = f18882d;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18884a, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        a aVar = new a(fVar, this);
        fVar.onSubscribe(aVar);
        if (B1(aVar)) {
            if (aVar.isDisposed()) {
                I1(aVar);
            }
        } else {
            Throwable th = this.f18886c;
            if (th != null) {
                fVar.onError(th);
            } else {
                fVar.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onComplete() {
        if (this.f18885b.compareAndSet(false, true)) {
            for (a aVar : this.f18884a.getAndSet(f18883e)) {
                aVar.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        if (this.f18885b.compareAndSet(false, true)) {
            this.f18886c = th;
            for (a aVar : this.f18884a.getAndSet(f18883e)) {
                aVar.downstream.onError(th);
            }
            return;
        }
        io.reactivex.rxjava3.plugins.a.Y(th);
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (this.f18884a.get() == f18883e) {
            eVar.dispose();
        }
    }
}
