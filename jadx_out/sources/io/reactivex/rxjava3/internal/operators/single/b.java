package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b<T> extends io.reactivex.rxjava3.core.r0<T> implements io.reactivex.rxjava3.core.u0<T> {

    /* renamed from: f, reason: collision with root package name */
    static final a[] f18321f = new a[0];

    /* renamed from: g, reason: collision with root package name */
    static final a[] f18322g = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18323a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicInteger f18324b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<a<T>[]> f18325c = new AtomicReference<>(f18321f);

    /* renamed from: d, reason: collision with root package name */
    T f18326d;

    /* renamed from: e, reason: collision with root package name */
    Throwable f18327e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicBoolean implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 7514387411091976596L;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        final b<T> parent;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, b<T> bVar) {
            this.downstream = u0Var;
            this.parent = bVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.J2(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get();
        }
    }

    public b(io.reactivex.rxjava3.core.x0<? extends T> x0Var) {
        this.f18323a = x0Var;
    }

    boolean I2(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18325c.get();
            if (aVarArr == f18322g) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f18325c, aVarArr, aVarArr2));
        return true;
    }

    void J2(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18325c.get();
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
                aVarArr2 = f18321f;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18325c, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        a<T> aVar = new a<>(u0Var, this);
        u0Var.onSubscribe(aVar);
        if (I2(aVar)) {
            if (aVar.isDisposed()) {
                J2(aVar);
            }
            if (this.f18324b.getAndIncrement() == 0) {
                this.f18323a.a(this);
                return;
            }
            return;
        }
        Throwable th = this.f18327e;
        if (th != null) {
            u0Var.onError(th);
        } else {
            u0Var.onSuccess(this.f18326d);
        }
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        this.f18327e = th;
        for (a<T> aVar : this.f18325c.getAndSet(f18322g)) {
            if (!aVar.isDisposed()) {
                aVar.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
    }

    @Override // io.reactivex.rxjava3.core.u0
    public void onSuccess(T t5) {
        this.f18326d = t5;
        for (a<T> aVar : this.f18325c.getAndSet(f18322g)) {
            if (!aVar.isDisposed()) {
                aVar.downstream.onSuccess(t5);
            }
        }
    }
}
