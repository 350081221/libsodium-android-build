package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c<T> extends io.reactivex.rxjava3.core.x<T> implements io.reactivex.rxjava3.core.a0<T> {

    /* renamed from: e, reason: collision with root package name */
    static final a[] f17250e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    static final a[] f17251f = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<io.reactivex.rxjava3.core.d0<T>> f17252a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<a<T>[]> f17253b = new AtomicReference<>(f17250e);

    /* renamed from: c, reason: collision with root package name */
    T f17254c;

    /* renamed from: d, reason: collision with root package name */
    Throwable f17255d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<c<T>> implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -5791853038359966195L;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, c<T> cVar) {
            super(cVar);
            this.downstream = a0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            c<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.V2(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == null;
        }
    }

    public c(io.reactivex.rxjava3.core.d0<T> d0Var) {
        this.f17252a = new AtomicReference<>(d0Var);
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        a<T> aVar = new a<>(a0Var, this);
        a0Var.onSubscribe(aVar);
        if (U2(aVar)) {
            if (aVar.isDisposed()) {
                V2(aVar);
                return;
            }
            io.reactivex.rxjava3.core.d0<T> andSet = this.f17252a.getAndSet(null);
            if (andSet != null) {
                andSet.a(this);
                return;
            }
            return;
        }
        if (!aVar.isDisposed()) {
            Throwable th = this.f17255d;
            if (th != null) {
                a0Var.onError(th);
                return;
            }
            T t5 = this.f17254c;
            if (t5 != null) {
                a0Var.onSuccess(t5);
            } else {
                a0Var.onComplete();
            }
        }
    }

    boolean U2(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f17253b.get();
            if (aVarArr == f17251f) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f17253b, aVarArr, aVarArr2));
        return true;
    }

    void V2(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f17253b.get();
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
                aVarArr2 = f17250e;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!androidx.compose.animation.core.h.a(this.f17253b, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
    public void onComplete() {
        for (a<T> aVar : this.f17253b.getAndSet(f17251f)) {
            if (!aVar.isDisposed()) {
                aVar.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        this.f17255d = th;
        for (a<T> aVar : this.f17253b.getAndSet(f17251f)) {
            if (!aVar.isDisposed()) {
                aVar.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
    public void onSuccess(T t5) {
        this.f17254c = t5;
        for (a<T> aVar : this.f17253b.getAndSet(f17251f)) {
            if (!aVar.isDisposed()) {
                aVar.downstream.onSuccess(t5);
            }
        }
    }
}
