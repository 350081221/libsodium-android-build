package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.util.k;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d<T> extends x<T> implements a0<T> {

    /* renamed from: e, reason: collision with root package name */
    static final a[] f18887e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    static final a[] f18888f = new a[0];

    /* renamed from: c, reason: collision with root package name */
    T f18891c;

    /* renamed from: d, reason: collision with root package name */
    Throwable f18892d;

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f18890b = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f18889a = new AtomicReference<>(f18887e);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<d<T>> implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -7650903191002190468L;
        final a0<? super T> downstream;

        a(a0<? super T> a0Var, d<T> dVar) {
            this.downstream = a0Var;
            lazySet(dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            d<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.d3(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == null;
        }
    }

    d() {
    }

    @l3.d
    @l3.f
    public static <T> d<T> V2() {
        return new d<>();
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(a0<? super T> a0Var) {
        a<T> aVar = new a<>(a0Var, this);
        a0Var.onSubscribe(aVar);
        if (U2(aVar)) {
            if (aVar.isDisposed()) {
                d3(aVar);
                return;
            }
            return;
        }
        Throwable th = this.f18892d;
        if (th != null) {
            a0Var.onError(th);
            return;
        }
        T t5 = this.f18891c;
        if (t5 == null) {
            a0Var.onComplete();
        } else {
            a0Var.onSuccess(t5);
        }
    }

    boolean U2(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18889a.get();
            if (aVarArr == f18888f) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f18889a, aVarArr, aVarArr2));
        return true;
    }

    @l3.g
    public Throwable W2() {
        if (this.f18889a.get() == f18888f) {
            return this.f18892d;
        }
        return null;
    }

    @l3.g
    public T X2() {
        if (this.f18889a.get() == f18888f) {
            return this.f18891c;
        }
        return null;
    }

    public boolean Y2() {
        return this.f18889a.get() == f18888f && this.f18891c == null && this.f18892d == null;
    }

    public boolean Z2() {
        return this.f18889a.get().length != 0;
    }

    public boolean a3() {
        return this.f18889a.get() == f18888f && this.f18892d != null;
    }

    public boolean b3() {
        return this.f18889a.get() == f18888f && this.f18891c != null;
    }

    int c3() {
        return this.f18889a.get().length;
    }

    void d3(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18889a.get();
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
                aVarArr2 = f18887e;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18889a, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
    public void onComplete() {
        if (this.f18890b.compareAndSet(false, true)) {
            for (a<T> aVar : this.f18889a.getAndSet(f18888f)) {
                aVar.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        if (this.f18890b.compareAndSet(false, true)) {
            this.f18892d = th;
            for (a<T> aVar : this.f18889a.getAndSet(f18888f)) {
                aVar.downstream.onError(th);
            }
            return;
        }
        io.reactivex.rxjava3.plugins.a.Y(th);
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (this.f18889a.get() == f18888f) {
            eVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
    public void onSuccess(T t5) {
        k.d(t5, "onSuccess called with a null value.");
        if (this.f18890b.compareAndSet(false, true)) {
            this.f18891c = t5;
            for (a<T> aVar : this.f18889a.getAndSet(f18888f)) {
                aVar.downstream.onSuccess(t5);
            }
        }
    }
}
