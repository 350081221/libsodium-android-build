package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.r0;
import io.reactivex.rxjava3.core.u0;
import io.reactivex.rxjava3.internal.util.k;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class h<T> extends r0<T> implements u0<T> {

    /* renamed from: e, reason: collision with root package name */
    static final a[] f18907e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    static final a[] f18908f = new a[0];

    /* renamed from: c, reason: collision with root package name */
    T f18911c;

    /* renamed from: d, reason: collision with root package name */
    Throwable f18912d;

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f18910b = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f18909a = new AtomicReference<>(f18907e);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<h<T>> implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -7650903191002190468L;
        final u0<? super T> downstream;

        a(u0<? super T> u0Var, h<T> hVar) {
            this.downstream = u0Var;
            lazySet(hVar);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            h<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.Q2(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == null;
        }
    }

    h() {
    }

    @l3.d
    @l3.f
    public static <T> h<T> J2() {
        return new h<>();
    }

    boolean I2(@l3.f a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18909a.get();
            if (aVarArr == f18908f) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f18909a, aVarArr, aVarArr2));
        return true;
    }

    @l3.g
    public Throwable K2() {
        if (this.f18909a.get() == f18908f) {
            return this.f18912d;
        }
        return null;
    }

    @l3.g
    public T L2() {
        if (this.f18909a.get() == f18908f) {
            return this.f18911c;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(@l3.f u0<? super T> u0Var) {
        a<T> aVar = new a<>(u0Var, this);
        u0Var.onSubscribe(aVar);
        if (I2(aVar)) {
            if (aVar.isDisposed()) {
                Q2(aVar);
            }
        } else {
            Throwable th = this.f18912d;
            if (th != null) {
                u0Var.onError(th);
            } else {
                u0Var.onSuccess(this.f18911c);
            }
        }
    }

    public boolean M2() {
        return this.f18909a.get().length != 0;
    }

    public boolean N2() {
        return this.f18909a.get() == f18908f && this.f18912d != null;
    }

    public boolean O2() {
        return this.f18909a.get() == f18908f && this.f18911c != null;
    }

    int P2() {
        return this.f18909a.get().length;
    }

    void Q2(@l3.f a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18909a.get();
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
                aVarArr2 = f18907e;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18909a, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(@l3.f Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        if (this.f18910b.compareAndSet(false, true)) {
            this.f18912d = th;
            for (a<T> aVar : this.f18909a.getAndSet(f18908f)) {
                aVar.downstream.onError(th);
            }
            return;
        }
        io.reactivex.rxjava3.plugins.a.Y(th);
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        if (this.f18909a.get() == f18908f) {
            eVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.u0
    public void onSuccess(@l3.f T t5) {
        k.d(t5, "onSuccess called with a null value.");
        if (this.f18910b.compareAndSet(false, true)) {
            this.f18911c = t5;
            for (a<T> aVar : this.f18909a.getAndSet(f18908f)) {
                aVar.downstream.onSuccess(t5);
            }
        }
    }
}
