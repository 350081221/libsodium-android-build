package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.operators.flowable.w3;
import io.reactivex.rxjava3.internal.operators.maybe.s1;
import io.reactivex.rxjava3.internal.operators.observable.j3;
import io.reactivex.rxjava3.internal.operators.single.a1;
import io.reactivex.rxjava3.internal.operators.single.b1;
import io.reactivex.rxjava3.internal.operators.single.c1;
import io.reactivex.rxjava3.internal.operators.single.d1;
import io.reactivex.rxjava3.internal.operators.single.e1;
import io.reactivex.rxjava3.internal.operators.single.f1;
import io.reactivex.rxjava3.internal.operators.single.z0;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public abstract class r0<T> implements x0<T> {
    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> A(@l3.f Iterable<? extends x0<? extends T>> iterable) {
        return o.l3(iterable).v1(io.reactivex.rxjava3.internal.functions.a.k());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, T4, T5, T6, R> r0<R> A2(@l3.f x0<? extends T1> x0Var, @l3.f x0<? extends T2> x0Var2, @l3.f x0<? extends T3> x0Var3, @l3.f x0<? extends T4> x0Var4, @l3.f x0<? extends T5> x0Var5, @l3.f x0<? extends T6> x0Var6, @l3.f m3.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        Objects.requireNonNull(x0Var4, "source4 is null");
        Objects.requireNonNull(x0Var5, "source5 is null");
        Objects.requireNonNull(x0Var6, "source6 is null");
        Objects.requireNonNull(kVar, "zipper is null");
        return G2(io.reactivex.rxjava3.internal.functions.a.B(kVar), x0Var, x0Var2, x0Var3, x0Var4, x0Var5, x0Var6);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> B(@l3.f org.reactivestreams.o<? extends x0<? extends T>> oVar) {
        return o.p3(oVar).v1(io.reactivex.rxjava3.internal.functions.a.k());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, T4, T5, R> r0<R> B2(@l3.f x0<? extends T1> x0Var, @l3.f x0<? extends T2> x0Var2, @l3.f x0<? extends T3> x0Var3, @l3.f x0<? extends T4> x0Var4, @l3.f x0<? extends T5> x0Var5, @l3.f m3.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        Objects.requireNonNull(x0Var4, "source4 is null");
        Objects.requireNonNull(x0Var5, "source5 is null");
        Objects.requireNonNull(jVar, "zipper is null");
        return G2(io.reactivex.rxjava3.internal.functions.a.A(jVar), x0Var, x0Var2, x0Var3, x0Var4, x0Var5);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> C(@l3.f org.reactivestreams.o<? extends x0<? extends T>> oVar, int i5) {
        return o.p3(oVar).x1(io.reactivex.rxjava3.internal.functions.a.k(), true, i5);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> C0(@l3.f Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.g0(callable));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<Boolean> C1(@l3.f x0<? extends T> x0Var, @l3.f x0<? extends T> x0Var2) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.w(x0Var, x0Var2));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, T4, R> r0<R> C2(@l3.f x0<? extends T1> x0Var, @l3.f x0<? extends T2> x0Var2, @l3.f x0<? extends T3> x0Var3, @l3.f x0<? extends T4> x0Var4, @l3.f m3.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        Objects.requireNonNull(x0Var4, "source4 is null");
        Objects.requireNonNull(iVar, "zipper is null");
        return G2(io.reactivex.rxjava3.internal.functions.a.z(iVar), x0Var, x0Var2, x0Var3, x0Var4);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> D(@l3.f Iterable<? extends x0<? extends T>> iterable) {
        return o.l3(iterable).k1(io.reactivex.rxjava3.internal.operators.single.l0.c(), false);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> D0(@l3.f CompletionStage<T> completionStage) {
        Objects.requireNonNull(completionStage, "stage is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.jdk8.g0(completionStage));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, R> r0<R> D2(@l3.f x0<? extends T1> x0Var, @l3.f x0<? extends T2> x0Var2, @l3.f x0<? extends T3> x0Var3, @l3.f m3.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        Objects.requireNonNull(hVar, "zipper is null");
        return G2(io.reactivex.rxjava3.internal.functions.a.y(hVar), x0Var, x0Var2, x0Var3);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> E(@l3.f Iterable<? extends x0<? extends T>> iterable, int i5) {
        return o.l3(iterable).l1(io.reactivex.rxjava3.internal.operators.single.l0.c(), false, i5, 1);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> E0(@l3.f Future<? extends T> future) {
        return r2(o.j3(future));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, R> r0<R> E2(@l3.f x0<? extends T1> x0Var, @l3.f x0<? extends T2> x0Var2, @l3.f m3.c<? super T1, ? super T2, ? extends R> cVar) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(cVar, "zipper is null");
        return G2(io.reactivex.rxjava3.internal.functions.a.x(cVar), x0Var, x0Var2);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> F(@l3.f org.reactivestreams.o<? extends x0<? extends T>> oVar) {
        return o.p3(oVar).i1(io.reactivex.rxjava3.internal.operators.single.l0.c());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> F0(@l3.f Future<? extends T> future, long j5, @l3.f TimeUnit timeUnit) {
        return r2(o.k3(future, j5, timeUnit));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T, R> r0<R> F2(@l3.f Iterable<? extends x0<? extends T>> iterable, @l3.f m3.o<? super Object[], ? extends R> oVar) {
        Objects.requireNonNull(oVar, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        return io.reactivex.rxjava3.plugins.a.S(new f1(iterable, oVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> G(@l3.f org.reactivestreams.o<? extends x0<? extends T>> oVar, int i5) {
        return o.p3(oVar).j1(io.reactivex.rxjava3.internal.operators.single.l0.c(), i5, 1);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> G0(@l3.f d0<T> d0Var) {
        Objects.requireNonNull(d0Var, "maybe is null");
        return io.reactivex.rxjava3.plugins.a.S(new s1(d0Var, null));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    public static <T, R> r0<R> G2(@l3.f m3.o<? super Object[], ? extends R> oVar, @l3.f x0<? extends T>... x0VarArr) {
        Objects.requireNonNull(oVar, "zipper is null");
        Objects.requireNonNull(x0VarArr, "sources is null");
        if (x0VarArr.length == 0) {
            return o0(new NoSuchElementException());
        }
        return io.reactivex.rxjava3.plugins.a.S(new e1(x0VarArr, oVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> H(@l3.f Iterable<? extends x0<? extends T>> iterable) {
        return o.l3(iterable).k1(io.reactivex.rxjava3.internal.operators.single.l0.c(), true);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> H0(@l3.f d0<T> d0Var, @l3.f T t5) {
        Objects.requireNonNull(d0Var, "maybe is null");
        Objects.requireNonNull(t5, "defaultItem is null");
        return io.reactivex.rxjava3.plugins.a.S(new s1(d0Var, t5));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> I(@l3.f Iterable<? extends x0<? extends T>> iterable, int i5) {
        return o.l3(iterable).l1(io.reactivex.rxjava3.internal.operators.single.l0.c(), true, i5, 1);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> I0(@l3.f n0<? extends T> n0Var) {
        Objects.requireNonNull(n0Var, "observable is null");
        return io.reactivex.rxjava3.plugins.a.S(new j3(n0Var, null));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> J(@l3.f org.reactivestreams.o<? extends x0<? extends T>> oVar) {
        return o.p3(oVar).k1(io.reactivex.rxjava3.internal.operators.single.l0.c(), true);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public static <T> r0<T> J0(@l3.f org.reactivestreams.o<? extends T> oVar) {
        Objects.requireNonNull(oVar, "publisher is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.h0(oVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> K(@l3.f org.reactivestreams.o<? extends x0<? extends T>> oVar, int i5) {
        return o.p3(oVar).l1(io.reactivex.rxjava3.internal.operators.single.l0.c(), true, i5, 1);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> K0(@l3.f m3.s<? extends T> sVar) {
        Objects.requireNonNull(sVar, "supplier is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.i0(sVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> N0(T t5) {
        Objects.requireNonNull(t5, "item is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.m0(t5));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> P1(@l3.f org.reactivestreams.o<? extends x0<? extends T>> oVar) {
        Objects.requireNonNull(oVar, "sources is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.mixed.m(oVar, io.reactivex.rxjava3.internal.functions.a.k(), false));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> Q1(@l3.f org.reactivestreams.o<? extends x0<? extends T>> oVar) {
        Objects.requireNonNull(oVar, "sources is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.mixed.m(oVar, io.reactivex.rxjava3.internal.functions.a.k(), true));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> R(@l3.f v0<T> v0Var) {
        Objects.requireNonNull(v0Var, "source is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.d(v0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> S(@l3.f m3.s<? extends x0<? extends T>> sVar) {
        Objects.requireNonNull(sVar, "supplier is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.e(sVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> S0(@l3.f x0<? extends T> x0Var, @l3.f x0<? extends T> x0Var2) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        return o.f3(x0Var, x0Var2).X2(io.reactivex.rxjava3.internal.functions.a.k(), false, Integer.MAX_VALUE);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> T0(@l3.f x0<? extends T> x0Var, @l3.f x0<? extends T> x0Var2, @l3.f x0<? extends T> x0Var3) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        return o.f3(x0Var, x0Var2, x0Var3).X2(io.reactivex.rxjava3.internal.functions.a.k(), false, Integer.MAX_VALUE);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> U0(@l3.f x0<? extends T> x0Var, @l3.f x0<? extends T> x0Var2, @l3.f x0<? extends T> x0Var3, @l3.f x0<? extends T> x0Var4) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        Objects.requireNonNull(x0Var4, "source4 is null");
        return o.f3(x0Var, x0Var2, x0Var3, x0Var4).X2(io.reactivex.rxjava3.internal.functions.a.k(), false, Integer.MAX_VALUE);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> V0(@l3.f Iterable<? extends x0<? extends T>> iterable) {
        return o.l3(iterable).W2(io.reactivex.rxjava3.internal.functions.a.k());
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> W0(@l3.f org.reactivestreams.o<? extends x0<? extends T>> oVar) {
        Objects.requireNonNull(oVar, "sources is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.flowable.f1(oVar, io.reactivex.rxjava3.internal.functions.a.k(), false, Integer.MAX_VALUE));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> X0(@l3.f x0<? extends x0<? extends T>> x0Var) {
        Objects.requireNonNull(x0Var, "source is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.y(x0Var, io.reactivex.rxjava3.internal.functions.a.k()));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> Y0(x0<? extends T>... x0VarArr) {
        return o.f3(x0VarArr).X2(io.reactivex.rxjava3.internal.functions.a.k(), false, Math.max(1, x0VarArr.length));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> Z0(@l3.f x0<? extends T>... x0VarArr) {
        return o.f3(x0VarArr).X2(io.reactivex.rxjava3.internal.functions.a.k(), true, Math.max(1, x0VarArr.length));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> a1(@l3.f x0<? extends T> x0Var, @l3.f x0<? extends T> x0Var2) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        return o.f3(x0Var, x0Var2).X2(io.reactivex.rxjava3.internal.functions.a.k(), true, Integer.MAX_VALUE);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> b1(@l3.f x0<? extends T> x0Var, @l3.f x0<? extends T> x0Var2, @l3.f x0<? extends T> x0Var3) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        return o.f3(x0Var, x0Var2, x0Var3).X2(io.reactivex.rxjava3.internal.functions.a.k(), true, Integer.MAX_VALUE);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> c1(@l3.f x0<? extends T> x0Var, @l3.f x0<? extends T> x0Var2, @l3.f x0<? extends T> x0Var3, @l3.f x0<? extends T> x0Var4) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        Objects.requireNonNull(x0Var4, "source4 is null");
        return o.f3(x0Var, x0Var2, x0Var3, x0Var4).X2(io.reactivex.rxjava3.internal.functions.a.k(), true, Integer.MAX_VALUE);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> d1(@l3.f Iterable<? extends x0<? extends T>> iterable) {
        return o.l3(iterable).X2(io.reactivex.rxjava3.internal.functions.a.k(), true, Integer.MAX_VALUE);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> e(@l3.f Iterable<? extends x0<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.a(null, iterable));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> e1(@l3.f org.reactivestreams.o<? extends x0<? extends T>> oVar) {
        Objects.requireNonNull(oVar, "sources is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.flowable.f1(oVar, io.reactivex.rxjava3.internal.functions.a.k(), true, Integer.MAX_VALUE));
    }

    private r0<T> e2(long j5, TimeUnit timeUnit, q0 q0Var, x0<? extends T> x0Var) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.y0(this, j5, timeUnit, q0Var, x0Var));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    public static <T> r0<T> f(@l3.f x0<? extends T>... x0VarArr) {
        Objects.requireNonNull(x0VarArr, "sources is null");
        if (x0VarArr.length == 0) {
            return p0(io.reactivex.rxjava3.internal.operators.single.l0.a());
        }
        if (x0VarArr.length == 1) {
            return w2(x0VarArr[0]);
        }
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.a(x0VarArr, null));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public static r0<Long> f2(long j5, @l3.f TimeUnit timeUnit) {
        return g2(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> g1() {
        return io.reactivex.rxjava3.plugins.a.S(io.reactivex.rxjava3.internal.operators.single.q0.f18430a);
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public static r0<Long> g2(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.S(new z0(j5, timeUnit, q0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> o0(@l3.f Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return p0(io.reactivex.rxjava3.internal.functions.a.o(th));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> p(@l3.f x0<? extends T> x0Var, @l3.f x0<? extends T> x0Var2) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        return o.f3(x0Var, x0Var2).w1(io.reactivex.rxjava3.internal.functions.a.k(), false);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> p0(@l3.f m3.s<? extends Throwable> sVar) {
        Objects.requireNonNull(sVar, "supplier is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.x(sVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> q(@l3.f x0<? extends T> x0Var, @l3.f x0<? extends T> x0Var2, @l3.f x0<? extends T> x0Var3) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        return o.f3(x0Var, x0Var2, x0Var3).w1(io.reactivex.rxjava3.internal.functions.a.k(), false);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> r(@l3.f x0<? extends T> x0Var, @l3.f x0<? extends T> x0Var2, @l3.f x0<? extends T> x0Var3, @l3.f x0<? extends T> x0Var4) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        Objects.requireNonNull(x0Var4, "source4 is null");
        return o.f3(x0Var, x0Var2, x0Var3, x0Var4).w1(io.reactivex.rxjava3.internal.functions.a.k(), false);
    }

    @l3.f
    private static <T> r0<T> r2(@l3.f o<T> oVar) {
        return io.reactivex.rxjava3.plugins.a.S(new w3(oVar, null));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> s(@l3.f Iterable<? extends x0<? extends T>> iterable) {
        return o.l3(iterable).w1(io.reactivex.rxjava3.internal.functions.a.k(), false);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> s2(@l3.f x0<T> x0Var) {
        Objects.requireNonNull(x0Var, "onSubscribe is null");
        if (!(x0Var instanceof r0)) {
            return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.j0(x0Var));
        }
        throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> t(@l3.f org.reactivestreams.o<? extends x0<? extends T>> oVar) {
        return u(oVar, 2);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> u(@l3.f org.reactivestreams.o<? extends x0<? extends T>> oVar, int i5) {
        Objects.requireNonNull(oVar, "sources is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "prefetch");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.mixed.g(oVar, io.reactivex.rxjava3.internal.functions.a.k(), io.reactivex.rxjava3.internal.util.j.IMMEDIATE, i5));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T, U> r0<T> u2(@l3.f m3.s<U> sVar, @l3.f m3.o<? super U, ? extends x0<? extends T>> oVar, @l3.f m3.g<? super U> gVar) {
        return v2(sVar, oVar, gVar, true);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> i0<T> v(@l3.f n0<? extends x0<? extends T>> n0Var) {
        Objects.requireNonNull(n0Var, "sources is null");
        return io.reactivex.rxjava3.plugins.a.R(new io.reactivex.rxjava3.internal.operators.mixed.s(n0Var, io.reactivex.rxjava3.internal.functions.a.k(), io.reactivex.rxjava3.internal.util.j.IMMEDIATE, 2));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T, U> r0<T> v2(@l3.f m3.s<U> sVar, @l3.f m3.o<? super U, ? extends x0<? extends T>> oVar, @l3.f m3.g<? super U> gVar, boolean z4) {
        Objects.requireNonNull(sVar, "resourceSupplier is null");
        Objects.requireNonNull(oVar, "sourceSupplier is null");
        Objects.requireNonNull(gVar, "resourceCleanup is null");
        return io.reactivex.rxjava3.plugins.a.S(new d1(sVar, oVar, gVar, z4));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> w(@l3.f x0<? extends T>... x0VarArr) {
        return o.f3(x0VarArr).w1(io.reactivex.rxjava3.internal.functions.a.k(), false);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<T> w2(@l3.f x0<T> x0Var) {
        Objects.requireNonNull(x0Var, "source is null");
        if (x0Var instanceof r0) {
            return io.reactivex.rxjava3.plugins.a.S((r0) x0Var);
        }
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.j0(x0Var));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> x(@l3.f x0<? extends T>... x0VarArr) {
        return o.f3(x0VarArr).w1(io.reactivex.rxjava3.internal.functions.a.k(), true);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> r0<R> x2(@l3.f x0<? extends T1> x0Var, @l3.f x0<? extends T2> x0Var2, @l3.f x0<? extends T3> x0Var3, @l3.f x0<? extends T4> x0Var4, @l3.f x0<? extends T5> x0Var5, @l3.f x0<? extends T6> x0Var6, @l3.f x0<? extends T7> x0Var7, @l3.f x0<? extends T8> x0Var8, @l3.f x0<? extends T9> x0Var9, @l3.f m3.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        Objects.requireNonNull(x0Var4, "source4 is null");
        Objects.requireNonNull(x0Var5, "source5 is null");
        Objects.requireNonNull(x0Var6, "source6 is null");
        Objects.requireNonNull(x0Var7, "source7 is null");
        Objects.requireNonNull(x0Var8, "source8 is null");
        Objects.requireNonNull(x0Var9, "source9 is null");
        Objects.requireNonNull(nVar, "zipper is null");
        return G2(io.reactivex.rxjava3.internal.functions.a.E(nVar), x0Var, x0Var2, x0Var3, x0Var4, x0Var5, x0Var6, x0Var7, x0Var8, x0Var9);
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> y(@l3.f x0<? extends T>... x0VarArr) {
        return o.f3(x0VarArr).i1(io.reactivex.rxjava3.internal.operators.single.l0.c());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> r0<R> y2(@l3.f x0<? extends T1> x0Var, @l3.f x0<? extends T2> x0Var2, @l3.f x0<? extends T3> x0Var3, @l3.f x0<? extends T4> x0Var4, @l3.f x0<? extends T5> x0Var5, @l3.f x0<? extends T6> x0Var6, @l3.f x0<? extends T7> x0Var7, @l3.f x0<? extends T8> x0Var8, @l3.f m3.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        Objects.requireNonNull(x0Var4, "source4 is null");
        Objects.requireNonNull(x0Var5, "source5 is null");
        Objects.requireNonNull(x0Var6, "source6 is null");
        Objects.requireNonNull(x0Var7, "source7 is null");
        Objects.requireNonNull(x0Var8, "source8 is null");
        Objects.requireNonNull(mVar, "zipper is null");
        return G2(io.reactivex.rxjava3.internal.functions.a.D(mVar), x0Var, x0Var2, x0Var3, x0Var4, x0Var5, x0Var6, x0Var7, x0Var8);
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> z(@l3.f x0<? extends T>... x0VarArr) {
        return o.f3(x0VarArr).k1(io.reactivex.rxjava3.internal.operators.single.l0.c(), true);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, T4, T5, T6, T7, R> r0<R> z2(@l3.f x0<? extends T1> x0Var, @l3.f x0<? extends T2> x0Var2, @l3.f x0<? extends T3> x0Var3, @l3.f x0<? extends T4> x0Var4, @l3.f x0<? extends T5> x0Var5, @l3.f x0<? extends T6> x0Var6, @l3.f x0<? extends T7> x0Var7, @l3.f m3.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        Objects.requireNonNull(x0Var, "source1 is null");
        Objects.requireNonNull(x0Var2, "source2 is null");
        Objects.requireNonNull(x0Var3, "source3 is null");
        Objects.requireNonNull(x0Var4, "source4 is null");
        Objects.requireNonNull(x0Var5, "source5 is null");
        Objects.requireNonNull(x0Var6, "source6 is null");
        Objects.requireNonNull(x0Var7, "source7 is null");
        Objects.requireNonNull(lVar, "zipper is null");
        return G2(io.reactivex.rxjava3.internal.functions.a.C(lVar), x0Var, x0Var2, x0Var3, x0Var4, x0Var5, x0Var6, x0Var7);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <R> o<R> A0(@l3.f m3.o<? super T, ? extends Stream<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.jdk8.e0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> A1(@l3.f m3.o<? super o<Throwable>, ? extends org.reactivestreams.o<?>> oVar) {
        return r2(n2().T5(oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> i0<R> B0(@l3.f m3.o<? super T, ? extends Stream<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.R(new io.reactivex.rxjava3.internal.jdk8.f0(this, oVar));
    }

    @l3.h("none")
    public final void B1(@l3.f u0<? super T> u0Var) {
        Objects.requireNonNull(u0Var, "observer is null");
        a(new io.reactivex.rxjava3.internal.observers.d0(u0Var));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> D1(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "other is null");
        return o.D0(c.A1(iVar).p1(), n2());
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> E1(@l3.f d0<T> d0Var) {
        Objects.requireNonNull(d0Var, "other is null");
        return o.D0(x.I2(d0Var).A2(), n2());
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> F1(@l3.f x0<T> x0Var) {
        Objects.requireNonNull(x0Var, "other is null");
        return o.D0(w2(x0Var).n2(), n2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> G1(@l3.f org.reactivestreams.o<T> oVar) {
        Objects.requireNonNull(oVar, "other is null");
        return n2().F6(oVar);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final i0<T> H1(@l3.f n0<T> n0Var) {
        Objects.requireNonNull(n0Var, "other is null");
        return i0.q8(n0Var).x1(q2());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U, R> r0<R> H2(@l3.f x0<U> x0Var, @l3.f m3.c<? super T, ? super U, ? extends R> cVar) {
        return E2(this, x0Var, cVar);
    }

    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.disposables.e I1() {
        return L1(io.reactivex.rxjava3.internal.functions.a.h(), io.reactivex.rxjava3.internal.functions.a.f16254f);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.disposables.e J1(@l3.f m3.b<? super T, ? super Throwable> bVar) {
        Objects.requireNonNull(bVar, "onCallback is null");
        io.reactivex.rxjava3.internal.observers.d dVar = new io.reactivex.rxjava3.internal.observers.d(bVar);
        a(dVar);
        return dVar;
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.disposables.e K1(@l3.f m3.g<? super T> gVar) {
        return L1(gVar, io.reactivex.rxjava3.internal.functions.a.f16254f);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> r0<R> L(@l3.f m3.o<? super T, ? extends x0<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.y(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> L0() {
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.k0(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.disposables.e L1(@l3.f m3.g<? super T> gVar, @l3.f m3.g<? super Throwable> gVar2) {
        Objects.requireNonNull(gVar, "onSuccess is null");
        Objects.requireNonNull(gVar2, "onError is null");
        io.reactivex.rxjava3.internal.observers.l lVar = new io.reactivex.rxjava3.internal.observers.l(gVar, gVar2);
        a(lVar);
        return lVar;
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c M(@l3.f m3.o<? super T, ? extends i> oVar) {
        return u0(oVar);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c M0() {
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.v(this));
    }

    protected abstract void M1(@l3.f u0<? super T> u0Var);

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> N(@l3.f m3.o<? super T, ? extends d0<? extends R>> oVar) {
        return v0(oVar);
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final r0<T> N1(@l3.f q0 q0Var) {
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.v0(this, q0Var));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> O(@l3.f x0<? extends T> x0Var) {
        return p(this, x0Var);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> r0<R> O0(@l3.f w0<? extends R, ? super T> w0Var) {
        Objects.requireNonNull(w0Var, "lift is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.n0(this, w0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <E extends u0<? super T>> E O1(E e5) {
        a(e5);
        return e5;
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<Boolean> P(@l3.f Object obj) {
        return Q(obj, io.reactivex.rxjava3.internal.functions.b.a());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> r0<R> P0(@l3.f m3.o<? super T, ? extends R> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.o0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<Boolean> Q(@l3.f Object obj, @l3.f m3.d<Object, Object> dVar) {
        Objects.requireNonNull(obj, "item is null");
        Objects.requireNonNull(dVar, "comparer is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.c(this, obj, dVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> Q0(@l3.f m3.o<? super T, Optional<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.jdk8.h0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<f0<T>> R0() {
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.p0(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> R1(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "other is null");
        return T1(new io.reactivex.rxjava3.internal.operators.completable.q0(iVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <E> r0<T> S1(@l3.f x0<? extends E> x0Var) {
        Objects.requireNonNull(x0Var, "other is null");
        return T1(new a1(x0Var));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final r0<T> T(long j5, @l3.f TimeUnit timeUnit) {
        return V(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a(), false);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <E> r0<T> T1(@l3.f org.reactivestreams.o<E> oVar) {
        Objects.requireNonNull(oVar, "other is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.w0(this, oVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final r0<T> U(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        return V(j5, timeUnit, q0Var, false);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.observers.n<T> U1() {
        io.reactivex.rxjava3.observers.n<T> nVar = new io.reactivex.rxjava3.observers.n<>();
        a(nVar);
        return nVar;
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final r0<T> V(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var, boolean z4) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.f(this, j5, timeUnit, q0Var, z4));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.observers.n<T> V1(boolean z4) {
        io.reactivex.rxjava3.observers.n<T> nVar = new io.reactivex.rxjava3.observers.n<>();
        if (z4) {
            nVar.dispose();
        }
        a(nVar);
        return nVar;
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final r0<T> W(long j5, @l3.f TimeUnit timeUnit, boolean z4) {
        return V(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a(), z4);
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final r0<io.reactivex.rxjava3.schedulers.d<T>> W1() {
        return Z1(TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final r0<T> X(long j5, @l3.f TimeUnit timeUnit) {
        return Y(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final r0<io.reactivex.rxjava3.schedulers.d<T>> X1(@l3.f q0 q0Var) {
        return Z1(TimeUnit.MILLISECONDS, q0Var);
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final r0<T> Y(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        return a0(i0.t7(j5, timeUnit, q0Var));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final r0<io.reactivex.rxjava3.schedulers.d<T>> Y1(@l3.f TimeUnit timeUnit) {
        return Z1(timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> Z(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "subscriptionIndicator is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.g(this, iVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final r0<io.reactivex.rxjava3.schedulers.d<T>> Z1(@l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.x0(this, timeUnit, q0Var, true));
    }

    @Override // io.reactivex.rxjava3.core.x0
    @l3.h("none")
    public final void a(@l3.f u0<? super T> u0Var) {
        Objects.requireNonNull(u0Var, "observer is null");
        u0<? super T> g02 = io.reactivex.rxjava3.plugins.a.g0(this, u0Var);
        Objects.requireNonNull(g02, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            M1(g02);
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U> r0<T> a0(@l3.f n0<U> n0Var) {
        Objects.requireNonNull(n0Var, "subscriptionIndicator is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.h(this, n0Var));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final r0<T> a2(long j5, @l3.f TimeUnit timeUnit) {
        return e2(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a(), null);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U> r0<T> b0(@l3.f x0<U> x0Var) {
        Objects.requireNonNull(x0Var, "subscriptionIndicator is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.j(this, x0Var));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final r0<T> b2(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        return e2(j5, timeUnit, q0Var, null);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <U> r0<T> c0(@l3.f org.reactivestreams.o<U> oVar) {
        Objects.requireNonNull(oVar, "subscriptionIndicator is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.i(this, oVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final r0<T> c2(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var, @l3.f x0<? extends T> x0Var) {
        Objects.requireNonNull(x0Var, "fallback is null");
        return e2(j5, timeUnit, q0Var, x0Var);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> d0(@l3.f m3.o<? super T, f0<R>> oVar) {
        Objects.requireNonNull(oVar, "selector is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.single.k(this, oVar));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final r0<T> d2(long j5, @l3.f TimeUnit timeUnit, @l3.f x0<? extends T> x0Var) {
        Objects.requireNonNull(x0Var, "fallback is null");
        return e2(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a(), x0Var);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> e0(@l3.f m3.g<? super T> gVar) {
        Objects.requireNonNull(gVar, "onAfterSuccess is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.m(this, gVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> f0(@l3.f m3.a aVar) {
        Objects.requireNonNull(aVar, "onAfterTerminate is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.n(this, aVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> f1(@l3.f x0<? extends T> x0Var) {
        return S0(this, x0Var);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> g(@l3.f x0<? extends T> x0Var) {
        Objects.requireNonNull(x0Var, "other is null");
        return f(this, x0Var);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> g0(@l3.f m3.a aVar) {
        Objects.requireNonNull(aVar, "onFinally is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.o(this, aVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final T h() {
        io.reactivex.rxjava3.internal.observers.i iVar = new io.reactivex.rxjava3.internal.observers.i();
        a(iVar);
        return (T) iVar.c();
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> h0(@l3.f m3.a aVar) {
        Objects.requireNonNull(aVar, "onDispose is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.p(this, aVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final r0<T> h1(@l3.f q0 q0Var) {
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.r0(this, q0Var));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final r0<io.reactivex.rxjava3.schedulers.d<T>> h2() {
        return k2(TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.h("none")
    public final void i() {
        l(io.reactivex.rxjava3.internal.functions.a.h(), io.reactivex.rxjava3.internal.functions.a.f16253e);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> i0(@l3.f m3.g<? super Throwable> gVar) {
        Objects.requireNonNull(gVar, "onError is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.q(this, gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.h("none")
    @l3.f
    public final <U> x<U> i1(@l3.f Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return q0(io.reactivex.rxjava3.internal.functions.a.l(cls)).o(cls);
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final r0<io.reactivex.rxjava3.schedulers.d<T>> i2(@l3.f q0 q0Var) {
        return k2(TimeUnit.MILLISECONDS, q0Var);
    }

    @l3.h("none")
    public final void j(@l3.f u0<? super T> u0Var) {
        Objects.requireNonNull(u0Var, "observer is null");
        io.reactivex.rxjava3.internal.observers.f fVar = new io.reactivex.rxjava3.internal.observers.f();
        u0Var.onSubscribe(fVar);
        a(fVar);
        fVar.c(u0Var);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> j0(@l3.f m3.b<? super T, ? super Throwable> bVar) {
        Objects.requireNonNull(bVar, "onEvent is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.r(this, bVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> j1() {
        return k1(io.reactivex.rxjava3.internal.functions.a.c());
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final r0<io.reactivex.rxjava3.schedulers.d<T>> j2(@l3.f TimeUnit timeUnit) {
        return k2(timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.h("none")
    public final void k(@l3.f m3.g<? super T> gVar) {
        l(gVar, io.reactivex.rxjava3.internal.functions.a.f16253e);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> k0(@l3.f m3.g<? super io.reactivex.rxjava3.disposables.e> gVar, @l3.f m3.a aVar) {
        Objects.requireNonNull(gVar, "onSubscribe is null");
        Objects.requireNonNull(aVar, "onDispose is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.s(this, gVar, aVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> k1(@l3.f m3.r<? super Throwable> rVar) {
        Objects.requireNonNull(rVar, "predicate is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.single.s0(this, rVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final r0<io.reactivex.rxjava3.schedulers.d<T>> k2(@l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.x0(this, timeUnit, q0Var, false));
    }

    @l3.h("none")
    public final void l(@l3.f m3.g<? super T> gVar, @l3.f m3.g<? super Throwable> gVar2) {
        Objects.requireNonNull(gVar, "onSuccess is null");
        Objects.requireNonNull(gVar2, "onError is null");
        io.reactivex.rxjava3.internal.observers.i iVar = new io.reactivex.rxjava3.internal.observers.i();
        a(iVar);
        iVar.b(gVar, gVar2, io.reactivex.rxjava3.internal.functions.a.f16251c);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> l0(@l3.f m3.g<? super io.reactivex.rxjava3.disposables.e> gVar) {
        Objects.requireNonNull(gVar, "onSubscribe is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.t(this, gVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> l1(@l3.f m3.o<? super Throwable, ? extends x0<? extends T>> oVar) {
        Objects.requireNonNull(oVar, "fallbackSupplier is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.u0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    public final <R> R l2(@l3.f s0<T, ? extends R> s0Var) {
        Objects.requireNonNull(s0Var, "converter is null");
        return s0Var.a(this);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> m() {
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.b(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> m0(@l3.f m3.g<? super T> gVar) {
        Objects.requireNonNull(gVar, "onSuccess is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.u(this, gVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> m1(@l3.f x0<? extends T> x0Var) {
        Objects.requireNonNull(x0Var, "fallback is null");
        return l1(io.reactivex.rxjava3.internal.functions.a.n(x0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final CompletionStage<T> m2() {
        return (CompletionStage) O1(new io.reactivex.rxjava3.internal.jdk8.b(false, null));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U> r0<U> n(@l3.f Class<? extends U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return (r0<U>) P0(io.reactivex.rxjava3.internal.functions.a.e(cls));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> n0(@l3.f m3.a aVar) {
        Objects.requireNonNull(aVar, "onTerminate is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.v(this, aVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> n1(@l3.f m3.o<Throwable, ? extends T> oVar) {
        Objects.requireNonNull(oVar, "itemSupplier is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.t0(this, oVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> n2() {
        if (this instanceof io.reactivex.rxjava3.internal.fuseable.d) {
            return ((io.reactivex.rxjava3.internal.fuseable.d) this).d();
        }
        return io.reactivex.rxjava3.plugins.a.P(new a1(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> r0<R> o(@l3.f y0<? super T, ? extends R> y0Var) {
        Objects.requireNonNull(y0Var, "transformer is null");
        return w2(y0Var.a(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> o1(@l3.f T t5) {
        Objects.requireNonNull(t5, "item is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.t0(this, null, t5));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final Future<T> o2() {
        return (Future) O1(new io.reactivex.rxjava3.internal.observers.r());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> p1() {
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.l(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> p2() {
        if (this instanceof io.reactivex.rxjava3.internal.fuseable.e) {
            return ((io.reactivex.rxjava3.internal.fuseable.e) this).c();
        }
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.o0(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> q0(@l3.f m3.r<? super T> rVar) {
        Objects.requireNonNull(rVar, "predicate is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.b0(this, rVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> q1() {
        return n2().r5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.h("none")
    @l3.f
    public final i0<T> q2() {
        if (this instanceof io.reactivex.rxjava3.internal.fuseable.f) {
            return ((io.reactivex.rxjava3.internal.fuseable.f) this).b();
        }
        return io.reactivex.rxjava3.plugins.a.R(new b1(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> r0<R> r0(@l3.f m3.o<? super T, ? extends x0<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.y(this, oVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> r1(long j5) {
        return n2().s5(j5);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U, R> r0<R> s0(@l3.f m3.o<? super T, ? extends x0<? extends U>> oVar, @l3.f m3.c<? super T, ? super U, ? extends R> cVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        Objects.requireNonNull(cVar, "combiner is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.z(this, oVar, cVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> s1(@l3.f m3.e eVar) {
        return n2().t5(eVar);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> r0<R> t0(@l3.f m3.o<? super T, ? extends x0<? extends R>> oVar, @l3.f m3.o<? super Throwable, ? extends x0<? extends R>> oVar2) {
        Objects.requireNonNull(oVar, "onSuccessMapper is null");
        Objects.requireNonNull(oVar2, "onErrorMapper is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.e0(this, oVar, oVar2));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> t1(@l3.f m3.o<? super o<Object>, ? extends org.reactivestreams.o<?>> oVar) {
        return n2().u5(oVar);
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final r0<T> t2(@l3.f q0 q0Var) {
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.S(new c1(this, q0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c u0(@l3.f m3.o<? super T, ? extends i> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.single.a0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> u1() {
        return r2(n2().N5());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> v0(@l3.f m3.o<? super T, ? extends d0<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.single.d0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> v1(long j5) {
        return r2(n2().O5(j5));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> i0<R> w0(@l3.f m3.o<? super T, ? extends n0<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.R(new io.reactivex.rxjava3.internal.operators.mixed.x(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> w1(long j5, @l3.f m3.r<? super Throwable> rVar) {
        return r2(n2().P5(j5, rVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <R> o<R> x0(@l3.f m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.single.f0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> x1(@l3.f m3.d<? super Integer, ? super Throwable> dVar) {
        return r2(n2().Q5(dVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <U> o<U> y0(@l3.f m3.o<? super T, ? extends Iterable<? extends U>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.single.b0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> y1(@l3.f m3.r<? super Throwable> rVar) {
        return r2(n2().R5(rVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U> i0<U> z0(@l3.f m3.o<? super T, ? extends Iterable<? extends U>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.R(new io.reactivex.rxjava3.internal.operators.single.c0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> z1(@l3.f m3.e eVar) {
        Objects.requireNonNull(eVar, "stop is null");
        return w1(Long.MAX_VALUE, io.reactivex.rxjava3.internal.functions.a.v(eVar));
    }
}
