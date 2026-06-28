package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.internal.util.k;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e<T> extends i<T> {

    /* renamed from: c, reason: collision with root package name */
    static final a[] f18893c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    static final a[] f18894d = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f18895a = new AtomicReference<>(f18894d);

    /* renamed from: b, reason: collision with root package name */
    Throwable f18896b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicBoolean implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 3562861878281475070L;
        final p0<? super T> downstream;
        final e<T> parent;

        a(p0<? super T> p0Var, e<T> eVar) {
            this.downstream = p0Var;
            this.parent = eVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.P8(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get();
        }

        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get()) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.downstream.onError(th);
            }
        }

        public void onNext(T t5) {
            if (!get()) {
                this.downstream.onNext(t5);
            }
        }
    }

    e() {
    }

    @l3.d
    @l3.f
    public static <T> e<T> O8() {
        return new e<>();
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    @l3.g
    public Throwable I8() {
        if (this.f18895a.get() == f18893c) {
            return this.f18896b;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean J8() {
        return this.f18895a.get() == f18893c && this.f18896b == null;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean K8() {
        return this.f18895a.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean L8() {
        return this.f18895a.get() == f18893c && this.f18896b != null;
    }

    boolean N8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18895a.get();
            if (aVarArr == f18893c) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f18895a, aVarArr, aVarArr2));
        return true;
    }

    void P8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18895a.get();
            if (aVarArr != f18893c && aVarArr != f18894d) {
                int length = aVarArr.length;
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
                    aVarArr2 = f18894d;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                    System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                    aVarArr2 = aVarArr3;
                }
            } else {
                return;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18895a, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super T> p0Var) {
        a<T> aVar = new a<>(p0Var, this);
        p0Var.onSubscribe(aVar);
        if (N8(aVar)) {
            if (aVar.isDisposed()) {
                P8(aVar);
            }
        } else {
            Throwable th = this.f18896b;
            if (th != null) {
                p0Var.onError(th);
            } else {
                p0Var.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        a<T>[] aVarArr = this.f18895a.get();
        a<T>[] aVarArr2 = f18893c;
        if (aVarArr == aVarArr2) {
            return;
        }
        for (a<T> aVar : this.f18895a.getAndSet(aVarArr2)) {
            aVar.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        a<T>[] aVarArr = this.f18895a.get();
        a<T>[] aVarArr2 = f18893c;
        if (aVarArr == aVarArr2) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        this.f18896b = th;
        for (a<T> aVar : this.f18895a.getAndSet(aVarArr2)) {
            aVar.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        k.d(t5, "onNext called with a null value.");
        for (a<T> aVar : this.f18895a.get()) {
            aVar.onNext(t5);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (this.f18895a.get() == f18893c) {
            eVar.dispose();
        }
    }
}
