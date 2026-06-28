package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.internal.observers.m;
import io.reactivex.rxjava3.internal.util.k;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a<T> extends i<T> {

    /* renamed from: d, reason: collision with root package name */
    static final C0536a[] f18860d = new C0536a[0];

    /* renamed from: e, reason: collision with root package name */
    static final C0536a[] f18861e = new C0536a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<C0536a<T>[]> f18862a = new AtomicReference<>(f18860d);

    /* renamed from: b, reason: collision with root package name */
    Throwable f18863b;

    /* renamed from: c, reason: collision with root package name */
    T f18864c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.reactivex.rxjava3.subjects.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0536a<T> extends m<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final a<T> parent;

        C0536a(p0<? super T> p0Var, a<T> aVar) {
            super(p0Var);
            this.parent = aVar;
        }

        @Override // io.reactivex.rxjava3.internal.observers.m, io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (super.tryDispose()) {
                this.parent.R8(this);
            }
        }

        void onComplete() {
            if (!isDisposed()) {
                this.downstream.onComplete();
            }
        }

        void onError(Throwable th) {
            if (isDisposed()) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }

    a() {
    }

    @l3.d
    @l3.f
    public static <T> a<T> O8() {
        return new a<>();
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public Throwable I8() {
        if (this.f18862a.get() == f18861e) {
            return this.f18863b;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean J8() {
        return this.f18862a.get() == f18861e && this.f18863b == null;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean K8() {
        return this.f18862a.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean L8() {
        return this.f18862a.get() == f18861e && this.f18863b != null;
    }

    boolean N8(C0536a<T> c0536a) {
        C0536a<T>[] c0536aArr;
        C0536a[] c0536aArr2;
        do {
            c0536aArr = this.f18862a.get();
            if (c0536aArr == f18861e) {
                return false;
            }
            int length = c0536aArr.length;
            c0536aArr2 = new C0536a[length + 1];
            System.arraycopy(c0536aArr, 0, c0536aArr2, 0, length);
            c0536aArr2[length] = c0536a;
        } while (!androidx.compose.animation.core.h.a(this.f18862a, c0536aArr, c0536aArr2));
        return true;
    }

    @l3.d
    @l3.g
    public T P8() {
        if (this.f18862a.get() == f18861e) {
            return this.f18864c;
        }
        return null;
    }

    @l3.d
    public boolean Q8() {
        return this.f18862a.get() == f18861e && this.f18864c != null;
    }

    void R8(C0536a<T> c0536a) {
        C0536a<T>[] c0536aArr;
        C0536a[] c0536aArr2;
        do {
            c0536aArr = this.f18862a.get();
            int length = c0536aArr.length;
            if (length == 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    if (c0536aArr[i5] == c0536a) {
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
                c0536aArr2 = f18860d;
            } else {
                C0536a[] c0536aArr3 = new C0536a[length - 1];
                System.arraycopy(c0536aArr, 0, c0536aArr3, 0, i5);
                System.arraycopy(c0536aArr, i5 + 1, c0536aArr3, i5, (length - i5) - 1);
                c0536aArr2 = c0536aArr3;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18862a, c0536aArr, c0536aArr2));
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super T> p0Var) {
        C0536a<T> c0536a = new C0536a<>(p0Var, this);
        p0Var.onSubscribe(c0536a);
        if (N8(c0536a)) {
            if (c0536a.isDisposed()) {
                R8(c0536a);
                return;
            }
            return;
        }
        Throwable th = this.f18863b;
        if (th != null) {
            p0Var.onError(th);
            return;
        }
        T t5 = this.f18864c;
        if (t5 != null) {
            c0536a.complete(t5);
        } else {
            c0536a.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        C0536a<T>[] c0536aArr = this.f18862a.get();
        C0536a<T>[] c0536aArr2 = f18861e;
        if (c0536aArr == c0536aArr2) {
            return;
        }
        T t5 = this.f18864c;
        C0536a<T>[] andSet = this.f18862a.getAndSet(c0536aArr2);
        int i5 = 0;
        if (t5 == null) {
            int length = andSet.length;
            while (i5 < length) {
                andSet[i5].onComplete();
                i5++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i5 < length2) {
            andSet[i5].complete(t5);
            i5++;
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        C0536a<T>[] c0536aArr = this.f18862a.get();
        C0536a<T>[] c0536aArr2 = f18861e;
        if (c0536aArr == c0536aArr2) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        this.f18864c = null;
        this.f18863b = th;
        for (C0536a<T> c0536a : this.f18862a.getAndSet(c0536aArr2)) {
            c0536a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        k.d(t5, "onNext called with a null value.");
        if (this.f18862a.get() == f18861e) {
            return;
        }
        this.f18864c = t5;
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (this.f18862a.get() == f18861e) {
            eVar.dispose();
        }
    }
}
