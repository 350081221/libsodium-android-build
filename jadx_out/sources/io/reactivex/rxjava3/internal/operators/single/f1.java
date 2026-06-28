package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.operators.single.e1;
import io.reactivex.rxjava3.internal.operators.single.o0;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class f1<T, R> extends io.reactivex.rxjava3.core.r0<R> {

    /* renamed from: a, reason: collision with root package name */
    final Iterable<? extends io.reactivex.rxjava3.core.x0<? extends T>> f18371a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super Object[], ? extends R> f18372b;

    /* loaded from: classes3.dex */
    final class a implements m3.o<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // m3.o
        public R apply(T t5) throws Throwable {
            R apply = f1.this.f18372b.apply(new Object[]{t5});
            Objects.requireNonNull(apply, "The zipper returned a null value");
            return apply;
        }
    }

    public f1(Iterable<? extends io.reactivex.rxjava3.core.x0<? extends T>> iterable, m3.o<? super Object[], ? extends R> oVar) {
        this.f18371a = iterable;
        this.f18372b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super R> u0Var) {
        io.reactivex.rxjava3.core.x0[] x0VarArr = new io.reactivex.rxjava3.core.x0[8];
        try {
            int i5 = 0;
            for (io.reactivex.rxjava3.core.x0<? extends T> x0Var : this.f18371a) {
                if (x0Var == null) {
                    io.reactivex.rxjava3.internal.disposables.d.error(new NullPointerException("One of the sources is null"), u0Var);
                    return;
                }
                if (i5 == x0VarArr.length) {
                    x0VarArr = (io.reactivex.rxjava3.core.x0[]) Arrays.copyOf(x0VarArr, (i5 >> 2) + i5);
                }
                int i6 = i5 + 1;
                x0VarArr[i5] = x0Var;
                i5 = i6;
            }
            if (i5 == 0) {
                io.reactivex.rxjava3.internal.disposables.d.error(new NoSuchElementException(), u0Var);
                return;
            }
            if (i5 == 1) {
                x0VarArr[0].a(new o0.a(u0Var, new a()));
                return;
            }
            e1.b bVar = new e1.b(u0Var, i5, this.f18372b);
            u0Var.onSubscribe(bVar);
            for (int i7 = 0; i7 < i5 && !bVar.isDisposed(); i7++) {
                x0VarArr[i7].a(bVar.observers[i7]);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
        }
    }
}
