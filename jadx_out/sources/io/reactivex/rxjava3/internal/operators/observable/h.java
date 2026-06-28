package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class h<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T>[] f17722a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.rxjava3.core.n0<? extends T>> f17723b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17724a;

        /* renamed from: b, reason: collision with root package name */
        final b<T>[] f17725b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f17726c = new AtomicInteger();

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, int i5) {
            this.f17724a = p0Var;
            this.f17725b = new b[i5];
        }

        public void a(io.reactivex.rxjava3.core.n0<? extends T>[] n0VarArr) {
            b<T>[] bVarArr = this.f17725b;
            int length = bVarArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = i5 + 1;
                bVarArr[i5] = new b<>(this, i6, this.f17724a);
                i5 = i6;
            }
            this.f17726c.lazySet(0);
            this.f17724a.onSubscribe(this);
            for (int i7 = 0; i7 < length && this.f17726c.get() == 0; i7++) {
                n0VarArr[i7].subscribe(bVarArr[i7]);
            }
        }

        public boolean b(int i5) {
            int i6 = 0;
            if (this.f17726c.get() != 0 || !this.f17726c.compareAndSet(0, i5)) {
                return false;
            }
            b<T>[] bVarArr = this.f17725b;
            int length = bVarArr.length;
            while (i6 < length) {
                int i7 = i6 + 1;
                if (i7 != i5) {
                    bVarArr[i6].dispose();
                }
                i6 = i7;
            }
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (this.f17726c.get() != -1) {
                this.f17726c.lazySet(-1);
                for (b<T> bVar : this.f17725b) {
                    bVar.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17726c.get() == -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final int index;
        final a<T> parent;
        boolean won;

        b(a<T> aVar, int i5, io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.parent = aVar;
            this.index = i5;
            this.downstream = p0Var;
        }

        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.b(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.b(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.won) {
                this.downstream.onNext(t5);
            } else if (this.parent.b(this.index)) {
                this.won = true;
                this.downstream.onNext(t5);
            } else {
                get().dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }
    }

    public h(io.reactivex.rxjava3.core.n0<? extends T>[] n0VarArr, Iterable<? extends io.reactivex.rxjava3.core.n0<? extends T>> iterable) {
        this.f17722a = n0VarArr;
        this.f17723b = iterable;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        int length;
        io.reactivex.rxjava3.core.n0<? extends T>[] n0VarArr = this.f17722a;
        if (n0VarArr == null) {
            n0VarArr = new io.reactivex.rxjava3.core.n0[8];
            try {
                length = 0;
                for (io.reactivex.rxjava3.core.n0<? extends T> n0Var : this.f17723b) {
                    if (n0Var == null) {
                        io.reactivex.rxjava3.internal.disposables.d.error(new NullPointerException("One of the sources is null"), p0Var);
                        return;
                    }
                    if (length == n0VarArr.length) {
                        io.reactivex.rxjava3.core.n0<? extends T>[] n0VarArr2 = new io.reactivex.rxjava3.core.n0[(length >> 2) + length];
                        System.arraycopy(n0VarArr, 0, n0VarArr2, 0, length);
                        n0VarArr = n0VarArr2;
                    }
                    int i5 = length + 1;
                    n0VarArr[length] = n0Var;
                    length = i5;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
                return;
            }
        } else {
            length = n0VarArr.length;
        }
        if (length == 0) {
            io.reactivex.rxjava3.internal.disposables.d.complete(p0Var);
        } else if (length == 1) {
            n0VarArr[0].subscribe(p0Var);
        } else {
            new a(p0Var, length).a(n0VarArr);
        }
    }
}
