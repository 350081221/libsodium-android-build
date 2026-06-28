package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.operators.maybe.x0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class w1<T, R> extends io.reactivex.rxjava3.core.x<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<? extends T>[] f17424a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super Object[], ? extends R> f17425b;

    /* loaded from: classes3.dex */
    final class a implements m3.o<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // m3.o
        public R apply(T t5) throws Throwable {
            R apply = w1.this.f17425b.apply(new Object[]{t5});
            Objects.requireNonNull(apply, "The zipper returned a null value");
            return apply;
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -5556924161382950569L;
        final io.reactivex.rxjava3.core.a0<? super R> downstream;
        final c<T>[] observers;
        final Object[] values;
        final m3.o<? super Object[], ? extends R> zipper;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(io.reactivex.rxjava3.core.a0<? super R> a0Var, int i5, m3.o<? super Object[], ? extends R> oVar) {
            super(i5);
            this.downstream = a0Var;
            this.zipper = oVar;
            c<T>[] cVarArr = new c[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                cVarArr[i6] = new c<>(this, i6);
            }
            this.observers = cVarArr;
            this.values = new Object[i5];
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.observers) {
                    cVar.dispose();
                }
            }
        }

        void disposeExcept(int i5) {
            c<T>[] cVarArr = this.observers;
            int length = cVarArr.length;
            for (int i6 = 0; i6 < i5; i6++) {
                cVarArr[i6].dispose();
            }
            while (true) {
                i5++;
                if (i5 < length) {
                    cVarArr[i5].dispose();
                } else {
                    return;
                }
            }
        }

        void innerComplete(int i5) {
            if (getAndSet(0) > 0) {
                disposeExcept(i5);
                this.downstream.onComplete();
            }
        }

        void innerError(Throwable th, int i5) {
            if (getAndSet(0) > 0) {
                disposeExcept(i5);
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        void innerSuccess(T t5, int i5) {
            this.values[i5] = t5;
            if (decrementAndGet() == 0) {
                try {
                    R apply = this.zipper.apply(this.values);
                    Objects.requireNonNull(apply, "The zipper returned a null value");
                    this.downstream.onSuccess(apply);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.downstream.onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final b<T, ?> parent;

        c(b<T, ?> bVar, int i5) {
            this.parent = bVar;
            this.index = i5;
        }

        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.parent.innerError(th, this.index);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.parent.innerSuccess(t5, this.index);
        }
    }

    public w1(io.reactivex.rxjava3.core.d0<? extends T>[] d0VarArr, m3.o<? super Object[], ? extends R> oVar) {
        this.f17424a = d0VarArr;
        this.f17425b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        io.reactivex.rxjava3.core.d0<? extends T>[] d0VarArr = this.f17424a;
        int length = d0VarArr.length;
        if (length == 1) {
            d0VarArr[0].a(new x0.a(a0Var, new a()));
            return;
        }
        b bVar = new b(a0Var, length, this.f17425b);
        a0Var.onSubscribe(bVar);
        for (int i5 = 0; i5 < length && !bVar.isDisposed(); i5++) {
            io.reactivex.rxjava3.core.d0<? extends T> d0Var = d0VarArr[i5];
            if (d0Var == null) {
                bVar.innerError(new NullPointerException("One of the sources is null"), i5);
                return;
            }
            d0Var.a(bVar.observers[i5]);
        }
    }
}
