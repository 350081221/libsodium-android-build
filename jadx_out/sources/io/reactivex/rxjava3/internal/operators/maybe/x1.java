package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.operators.maybe.w1;
import io.reactivex.rxjava3.internal.operators.maybe.x0;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class x1<T, R> extends io.reactivex.rxjava3.core.x<R> {

    /* renamed from: a, reason: collision with root package name */
    final Iterable<? extends io.reactivex.rxjava3.core.d0<? extends T>> f17434a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super Object[], ? extends R> f17435b;

    /* loaded from: classes3.dex */
    final class a implements m3.o<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // m3.o
        public R apply(T t5) throws Throwable {
            R apply = x1.this.f17435b.apply(new Object[]{t5});
            Objects.requireNonNull(apply, "The zipper returned a null value");
            return apply;
        }
    }

    public x1(Iterable<? extends io.reactivex.rxjava3.core.d0<? extends T>> iterable, m3.o<? super Object[], ? extends R> oVar) {
        this.f17434a = iterable;
        this.f17435b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        io.reactivex.rxjava3.core.d0[] d0VarArr = new io.reactivex.rxjava3.core.d0[8];
        try {
            int i5 = 0;
            for (io.reactivex.rxjava3.core.d0<? extends T> d0Var : this.f17434a) {
                if (d0Var == null) {
                    io.reactivex.rxjava3.internal.disposables.d.error(new NullPointerException("One of the sources is null"), a0Var);
                    return;
                }
                if (i5 == d0VarArr.length) {
                    d0VarArr = (io.reactivex.rxjava3.core.d0[]) Arrays.copyOf(d0VarArr, (i5 >> 2) + i5);
                }
                int i6 = i5 + 1;
                d0VarArr[i5] = d0Var;
                i5 = i6;
            }
            if (i5 == 0) {
                io.reactivex.rxjava3.internal.disposables.d.complete(a0Var);
                return;
            }
            if (i5 == 1) {
                d0VarArr[0].a(new x0.a(a0Var, new a()));
                return;
            }
            w1.b bVar = new w1.b(a0Var, i5, this.f17435b);
            a0Var.onSubscribe(bVar);
            for (int i7 = 0; i7 < i5 && !bVar.isDisposed(); i7++) {
                d0VarArr[i7].a(bVar.observers[i7]);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, a0Var);
        }
    }
}
