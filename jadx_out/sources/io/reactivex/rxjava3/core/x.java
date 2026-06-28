package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.operators.flowable.d1;
import io.reactivex.rxjava3.internal.operators.maybe.a1;
import io.reactivex.rxjava3.internal.operators.maybe.b1;
import io.reactivex.rxjava3.internal.operators.maybe.c1;
import io.reactivex.rxjava3.internal.operators.maybe.e1;
import io.reactivex.rxjava3.internal.operators.maybe.f1;
import io.reactivex.rxjava3.internal.operators.maybe.g1;
import io.reactivex.rxjava3.internal.operators.maybe.h1;
import io.reactivex.rxjava3.internal.operators.maybe.i1;
import io.reactivex.rxjava3.internal.operators.maybe.j1;
import io.reactivex.rxjava3.internal.operators.maybe.k1;
import io.reactivex.rxjava3.internal.operators.maybe.l1;
import io.reactivex.rxjava3.internal.operators.maybe.m1;
import io.reactivex.rxjava3.internal.operators.maybe.n1;
import io.reactivex.rxjava3.internal.operators.maybe.o1;
import io.reactivex.rxjava3.internal.operators.maybe.p1;
import io.reactivex.rxjava3.internal.operators.maybe.q1;
import io.reactivex.rxjava3.internal.operators.maybe.r1;
import io.reactivex.rxjava3.internal.operators.maybe.s1;
import io.reactivex.rxjava3.internal.operators.maybe.t1;
import io.reactivex.rxjava3.internal.operators.maybe.u1;
import io.reactivex.rxjava3.internal.operators.maybe.v1;
import io.reactivex.rxjava3.internal.operators.maybe.w1;
import io.reactivex.rxjava3.internal.operators.maybe.x1;
import io.reactivex.rxjava3.internal.operators.maybe.z0;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public abstract class x<T> implements d0<T> {
    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> A(@l3.f Iterable<? extends d0<? extends T>> iterable) {
        return o.l3(iterable).q1(io.reactivex.rxjava3.internal.functions.a.k());
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> B(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar) {
        return o.p3(oVar).q1(io.reactivex.rxjava3.internal.functions.a.k());
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> C(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar, int i5) {
        return o.p3(oVar).s1(io.reactivex.rxjava3.internal.functions.a.k(), true, i5);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> D(@l3.f Iterable<? extends d0<? extends T>> iterable) {
        return o.l3(iterable).k1(r1.instance(), false);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> D0(@l3.f m3.a aVar) {
        Objects.requireNonNull(aVar, "action is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.j0(aVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> E(@l3.f Iterable<? extends d0<? extends T>> iterable, int i5) {
        return o.l3(iterable).l1(r1.instance(), false, i5, 1);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> E0(@l3.f Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.k0(callable));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> E2(@l3.f d0<T> d0Var) {
        if (!(d0Var instanceof x)) {
            Objects.requireNonNull(d0Var, "onSubscribe is null");
            return io.reactivex.rxjava3.plugins.a.Q(new t1(d0Var));
        }
        throw new IllegalArgumentException("unsafeCreate(Maybe) should be upgraded");
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> F(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar) {
        return o.p3(oVar).i1(r1.instance());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> F0(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "completableSource is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.l0(iVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> G(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar, int i5) {
        return o.p3(oVar).j1(r1.instance(), i5, 1);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> G0(@l3.f CompletionStage<T> completionStage) {
        Objects.requireNonNull(completionStage, "stage is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.jdk8.o(completionStage));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T, D> x<T> G2(@l3.f m3.s<? extends D> sVar, @l3.f m3.o<? super D, ? extends d0<? extends T>> oVar, @l3.f m3.g<? super D> gVar) {
        return H2(sVar, oVar, gVar, true);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> H(@l3.f Iterable<? extends d0<? extends T>> iterable) {
        return o.l3(iterable).k1(r1.instance(), true);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> H0(@l3.f Future<? extends T> future) {
        Objects.requireNonNull(future, "future is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.m0(future, 0L, null));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T, D> x<T> H2(@l3.f m3.s<? extends D> sVar, @l3.f m3.o<? super D, ? extends d0<? extends T>> oVar, @l3.f m3.g<? super D> gVar, boolean z4) {
        Objects.requireNonNull(sVar, "resourceSupplier is null");
        Objects.requireNonNull(oVar, "sourceSupplier is null");
        Objects.requireNonNull(gVar, "resourceCleanup is null");
        return io.reactivex.rxjava3.plugins.a.Q(new v1(sVar, oVar, gVar, z4));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> I(@l3.f Iterable<? extends d0<? extends T>> iterable, int i5) {
        return o.l3(iterable).l1(r1.instance(), true, i5, 1);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> I0(@l3.f Future<? extends T> future, long j5, @l3.f TimeUnit timeUnit) {
        Objects.requireNonNull(future, "future is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.m0(future, j5, timeUnit));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> I2(@l3.f d0<T> d0Var) {
        if (d0Var instanceof x) {
            return io.reactivex.rxjava3.plugins.a.Q((x) d0Var);
        }
        Objects.requireNonNull(d0Var, "source is null");
        return io.reactivex.rxjava3.plugins.a.Q(new t1(d0Var));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> J(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar) {
        return o.p3(oVar).k1(r1.instance(), true);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> J0(@l3.f n0<T> n0Var) {
        Objects.requireNonNull(n0Var, "source is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.observable.r0(n0Var, 0L));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<Boolean> J1(@l3.f d0<? extends T> d0Var, @l3.f d0<? extends T> d0Var2) {
        return K1(d0Var, d0Var2, io.reactivex.rxjava3.internal.functions.b.a());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> x<R> J2(@l3.f d0<? extends T1> d0Var, @l3.f d0<? extends T2> d0Var2, @l3.f d0<? extends T3> d0Var3, @l3.f d0<? extends T4> d0Var4, @l3.f d0<? extends T5> d0Var5, @l3.f d0<? extends T6> d0Var6, @l3.f d0<? extends T7> d0Var7, @l3.f d0<? extends T8> d0Var8, @l3.f d0<? extends T9> d0Var9, @l3.f m3.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        Objects.requireNonNull(d0Var4, "source4 is null");
        Objects.requireNonNull(d0Var5, "source5 is null");
        Objects.requireNonNull(d0Var6, "source6 is null");
        Objects.requireNonNull(d0Var7, "source7 is null");
        Objects.requireNonNull(d0Var8, "source8 is null");
        Objects.requireNonNull(d0Var9, "source9 is null");
        Objects.requireNonNull(nVar, "zipper is null");
        return S2(io.reactivex.rxjava3.internal.functions.a.E(nVar), d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> K(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar, int i5) {
        return o.p3(oVar).l1(r1.instance(), true, i5, 1);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> K0(@l3.f Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return (x) optional.map(new Function() { // from class: io.reactivex.rxjava3.core.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x.S0(obj);
            }
        }).orElseGet(new Supplier() { // from class: io.reactivex.rxjava3.core.w
            @Override // java.util.function.Supplier
            public final Object get() {
                return x.o0();
            }
        });
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> r0<Boolean> K1(@l3.f d0<? extends T> d0Var, @l3.f d0<? extends T> d0Var2, @l3.f m3.d<? super T, ? super T> dVar) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(dVar, "isEqual is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.maybe.x(d0Var, d0Var2, dVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> x<R> K2(@l3.f d0<? extends T1> d0Var, @l3.f d0<? extends T2> d0Var2, @l3.f d0<? extends T3> d0Var3, @l3.f d0<? extends T4> d0Var4, @l3.f d0<? extends T5> d0Var5, @l3.f d0<? extends T6> d0Var6, @l3.f d0<? extends T7> d0Var7, @l3.f d0<? extends T8> d0Var8, @l3.f m3.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        Objects.requireNonNull(d0Var4, "source4 is null");
        Objects.requireNonNull(d0Var5, "source5 is null");
        Objects.requireNonNull(d0Var6, "source6 is null");
        Objects.requireNonNull(d0Var7, "source7 is null");
        Objects.requireNonNull(d0Var8, "source8 is null");
        Objects.requireNonNull(mVar, "zipper is null");
        return S2(io.reactivex.rxjava3.internal.functions.a.D(mVar), d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public static <T> x<T> L0(@l3.f org.reactivestreams.o<T> oVar) {
        Objects.requireNonNull(oVar, "source is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.flowable.u0(oVar, 0L));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, T4, T5, T6, T7, R> x<R> L2(@l3.f d0<? extends T1> d0Var, @l3.f d0<? extends T2> d0Var2, @l3.f d0<? extends T3> d0Var3, @l3.f d0<? extends T4> d0Var4, @l3.f d0<? extends T5> d0Var5, @l3.f d0<? extends T6> d0Var6, @l3.f d0<? extends T7> d0Var7, @l3.f m3.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        Objects.requireNonNull(d0Var4, "source4 is null");
        Objects.requireNonNull(d0Var5, "source5 is null");
        Objects.requireNonNull(d0Var6, "source6 is null");
        Objects.requireNonNull(d0Var7, "source7 is null");
        Objects.requireNonNull(lVar, "zipper is null");
        return S2(io.reactivex.rxjava3.internal.functions.a.C(lVar), d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> M0(@l3.f Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.n0(runnable));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, T4, T5, T6, R> x<R> M2(@l3.f d0<? extends T1> d0Var, @l3.f d0<? extends T2> d0Var2, @l3.f d0<? extends T3> d0Var3, @l3.f d0<? extends T4> d0Var4, @l3.f d0<? extends T5> d0Var5, @l3.f d0<? extends T6> d0Var6, @l3.f m3.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        Objects.requireNonNull(d0Var4, "source4 is null");
        Objects.requireNonNull(d0Var5, "source5 is null");
        Objects.requireNonNull(d0Var6, "source6 is null");
        Objects.requireNonNull(kVar, "zipper is null");
        return S2(io.reactivex.rxjava3.internal.functions.a.B(kVar), d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> N0(@l3.f x0<T> x0Var) {
        Objects.requireNonNull(x0Var, "single is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.o0(x0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, T4, T5, R> x<R> N2(@l3.f d0<? extends T1> d0Var, @l3.f d0<? extends T2> d0Var2, @l3.f d0<? extends T3> d0Var3, @l3.f d0<? extends T4> d0Var4, @l3.f d0<? extends T5> d0Var5, @l3.f m3.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        Objects.requireNonNull(d0Var4, "source4 is null");
        Objects.requireNonNull(d0Var5, "source5 is null");
        Objects.requireNonNull(jVar, "zipper is null");
        return S2(io.reactivex.rxjava3.internal.functions.a.A(jVar), d0Var, d0Var2, d0Var3, d0Var4, d0Var5);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> O0(@l3.f m3.s<? extends T> sVar) {
        Objects.requireNonNull(sVar, "supplier is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.p0(sVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, T4, R> x<R> O2(@l3.f d0<? extends T1> d0Var, @l3.f d0<? extends T2> d0Var2, @l3.f d0<? extends T3> d0Var3, @l3.f d0<? extends T4> d0Var4, @l3.f m3.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        Objects.requireNonNull(d0Var4, "source4 is null");
        Objects.requireNonNull(iVar, "zipper is null");
        return S2(io.reactivex.rxjava3.internal.functions.a.z(iVar), d0Var, d0Var2, d0Var3, d0Var4);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, T3, R> x<R> P2(@l3.f d0<? extends T1> d0Var, @l3.f d0<? extends T2> d0Var2, @l3.f d0<? extends T3> d0Var3, @l3.f m3.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        Objects.requireNonNull(hVar, "zipper is null");
        return S2(io.reactivex.rxjava3.internal.functions.a.y(hVar), d0Var, d0Var2, d0Var3);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T1, T2, R> x<R> Q2(@l3.f d0<? extends T1> d0Var, @l3.f d0<? extends T2> d0Var2, @l3.f m3.c<? super T1, ? super T2, ? extends R> cVar) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(cVar, "zipper is null");
        return S2(io.reactivex.rxjava3.internal.functions.a.x(cVar), d0Var, d0Var2);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> R(@l3.f b0<T> b0Var) {
        Objects.requireNonNull(b0Var, "onSubscribe is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.j(b0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T, R> x<R> R2(@l3.f Iterable<? extends d0<? extends T>> iterable, @l3.f m3.o<? super Object[], ? extends R> oVar) {
        Objects.requireNonNull(oVar, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        return io.reactivex.rxjava3.plugins.a.Q(new x1(iterable, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> S0(T t5) {
        Objects.requireNonNull(t5, "item is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.v0(t5));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    public static <T, R> x<R> S2(@l3.f m3.o<? super Object[], ? extends R> oVar, @l3.f d0<? extends T>... d0VarArr) {
        Objects.requireNonNull(d0VarArr, "sources is null");
        if (d0VarArr.length == 0) {
            return o0();
        }
        Objects.requireNonNull(oVar, "zipper is null");
        return io.reactivex.rxjava3.plugins.a.Q(new w1(d0VarArr, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> T(@l3.f m3.s<? extends d0<? extends T>> sVar) {
        Objects.requireNonNull(sVar, "supplier is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.k(sVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> X0(@l3.f d0<? extends T> d0Var, @l3.f d0<? extends T> d0Var2) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        return e1(d0Var, d0Var2);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> Y0(@l3.f d0<? extends T> d0Var, @l3.f d0<? extends T> d0Var2, @l3.f d0<? extends T> d0Var3) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        return e1(d0Var, d0Var2, d0Var3);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> Z0(@l3.f d0<? extends T> d0Var, @l3.f d0<? extends T> d0Var2, @l3.f d0<? extends T> d0Var3, @l3.f d0<? extends T> d0Var4) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        Objects.requireNonNull(d0Var4, "source4 is null");
        return e1(d0Var, d0Var2, d0Var3, d0Var4);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public static <T> o<T> Z1(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar) {
        Objects.requireNonNull(oVar, "sources is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.mixed.k(oVar, io.reactivex.rxjava3.internal.functions.a.k(), false));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> a1(@l3.f Iterable<? extends d0<? extends T>> iterable) {
        return o.l3(iterable).V2(io.reactivex.rxjava3.internal.functions.a.k(), false, Integer.MAX_VALUE);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> a2(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar) {
        Objects.requireNonNull(oVar, "sources is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.mixed.k(oVar, io.reactivex.rxjava3.internal.functions.a.k(), true));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> b1(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar) {
        return c1(oVar, Integer.MAX_VALUE);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> c(@l3.f Iterable<? extends d0<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.b(null, iterable));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> c1(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar, int i5) {
        Objects.requireNonNull(oVar, "sources is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "maxConcurrency");
        return io.reactivex.rxjava3.plugins.a.P(new d1(oVar, io.reactivex.rxjava3.internal.functions.a.k(), false, i5));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> d1(@l3.f d0<? extends d0<? extends T>> d0Var) {
        Objects.requireNonNull(d0Var, "source is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.i0(d0Var, io.reactivex.rxjava3.internal.functions.a.k()));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    public static <T> x<T> e(@l3.f d0<? extends T>... d0VarArr) {
        Objects.requireNonNull(d0VarArr, "sources is null");
        if (d0VarArr.length == 0) {
            return o0();
        }
        if (d0VarArr.length == 1) {
            return I2(d0VarArr[0]);
        }
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.b(d0VarArr, null));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> e1(d0<? extends T>... d0VarArr) {
        Objects.requireNonNull(d0VarArr, "sources is null");
        if (d0VarArr.length == 0) {
            return o.t2();
        }
        if (d0VarArr.length == 1) {
            return io.reactivex.rxjava3.plugins.a.P(new p1(d0VarArr[0]));
        }
        return io.reactivex.rxjava3.plugins.a.P(new z0(d0VarArr));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> f1(@l3.f d0<? extends T>... d0VarArr) {
        Objects.requireNonNull(d0VarArr, "sources is null");
        return o.f3(d0VarArr).V2(io.reactivex.rxjava3.internal.functions.a.k(), true, Math.max(1, d0VarArr.length));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> g1(@l3.f d0<? extends T> d0Var, @l3.f d0<? extends T> d0Var2) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        return f1(d0Var, d0Var2);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> h1(@l3.f d0<? extends T> d0Var, @l3.f d0<? extends T> d0Var2, @l3.f d0<? extends T> d0Var3) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        return f1(d0Var, d0Var2, d0Var3);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> i1(@l3.f d0<? extends T> d0Var, @l3.f d0<? extends T> d0Var2, @l3.f d0<? extends T> d0Var3, @l3.f d0<? extends T> d0Var4) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        Objects.requireNonNull(d0Var4, "source4 is null");
        return f1(d0Var, d0Var2, d0Var3, d0Var4);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> j1(@l3.f Iterable<? extends d0<? extends T>> iterable) {
        return o.l3(iterable).V2(io.reactivex.rxjava3.internal.functions.a.k(), true, Integer.MAX_VALUE);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> k1(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar) {
        return l1(oVar, Integer.MAX_VALUE);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> l1(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar, int i5) {
        Objects.requireNonNull(oVar, "sources is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "maxConcurrency");
        return io.reactivex.rxjava3.plugins.a.P(new d1(oVar, io.reactivex.rxjava3.internal.functions.a.k(), true, i5));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> n1() {
        return io.reactivex.rxjava3.plugins.a.Q(a1.f17237a);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> o0() {
        return io.reactivex.rxjava3.plugins.a.Q(io.reactivex.rxjava3.internal.operators.maybe.w.f17422a);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> p0(@l3.f Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.y(th));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> q(@l3.f d0<? extends T> d0Var, @l3.f d0<? extends T> d0Var2) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        return w(d0Var, d0Var2);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> x<T> q0(@l3.f m3.s<? extends Throwable> sVar) {
        Objects.requireNonNull(sVar, "supplier is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.z(sVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> r(@l3.f d0<? extends T> d0Var, @l3.f d0<? extends T> d0Var2, @l3.f d0<? extends T> d0Var3) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        return w(d0Var, d0Var2, d0Var3);
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public static x<Long> r2(long j5, @l3.f TimeUnit timeUnit) {
        return s2(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> s(@l3.f d0<? extends T> d0Var, @l3.f d0<? extends T> d0Var2, @l3.f d0<? extends T> d0Var3, @l3.f d0<? extends T> d0Var4) {
        Objects.requireNonNull(d0Var, "source1 is null");
        Objects.requireNonNull(d0Var2, "source2 is null");
        Objects.requireNonNull(d0Var3, "source3 is null");
        Objects.requireNonNull(d0Var4, "source4 is null");
        return w(d0Var, d0Var2, d0Var3, d0Var4);
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public static x<Long> s2(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.Q(new o1(Math.max(0L, j5), timeUnit, q0Var));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> t(@l3.f Iterable<? extends d0<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.maybe.g(iterable));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> u(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar) {
        return v(oVar, 2);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> v(@l3.f org.reactivestreams.o<? extends d0<? extends T>> oVar, int i5) {
        Objects.requireNonNull(oVar, "sources is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "prefetch");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.mixed.e(oVar, io.reactivex.rxjava3.internal.functions.a.k(), io.reactivex.rxjava3.internal.util.j.IMMEDIATE, i5));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> w(@l3.f d0<? extends T>... d0VarArr) {
        Objects.requireNonNull(d0VarArr, "sources is null");
        if (d0VarArr.length == 0) {
            return o.t2();
        }
        if (d0VarArr.length == 1) {
            return io.reactivex.rxjava3.plugins.a.P(new p1(d0VarArr[0]));
        }
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.maybe.e(d0VarArr));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> x(@l3.f d0<? extends T>... d0VarArr) {
        Objects.requireNonNull(d0VarArr, "sources is null");
        if (d0VarArr.length == 0) {
            return o.t2();
        }
        if (d0VarArr.length == 1) {
            return io.reactivex.rxjava3.plugins.a.P(new p1(d0VarArr[0]));
        }
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.maybe.f(d0VarArr));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> y(@l3.f d0<? extends T>... d0VarArr) {
        return o.f3(d0VarArr).i1(r1.instance());
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static <T> o<T> z(@l3.f d0<? extends T>... d0VarArr) {
        return o.f3(d0VarArr).k1(r1.instance(), true);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U> i0<U> A0(@l3.f m3.o<? super T, ? extends Iterable<? extends U>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.R(new io.reactivex.rxjava3.internal.operators.maybe.f0(this, oVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> A1(@l3.f m3.o<? super o<Object>, ? extends org.reactivestreams.o<?>> oVar) {
        return A2().u5(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> A2() {
        if (this instanceof io.reactivex.rxjava3.internal.fuseable.d) {
            return ((io.reactivex.rxjava3.internal.fuseable.d) this).d();
        }
        return io.reactivex.rxjava3.plugins.a.P(new p1(this));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <R> o<R> B0(@l3.f m3.o<? super T, ? extends Stream<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.jdk8.m(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> B1() {
        return D1(Long.MAX_VALUE, io.reactivex.rxjava3.internal.functions.a.c());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final Future<T> B2() {
        return (Future) W1(new io.reactivex.rxjava3.internal.observers.r());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> i0<R> C0(@l3.f m3.o<? super T, ? extends Stream<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.R(new io.reactivex.rxjava3.internal.jdk8.n(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> C1(long j5) {
        return D1(j5, io.reactivex.rxjava3.internal.functions.a.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.h("none")
    @l3.f
    public final i0<T> C2() {
        if (this instanceof io.reactivex.rxjava3.internal.fuseable.f) {
            return ((io.reactivex.rxjava3.internal.fuseable.f) this).b();
        }
        return io.reactivex.rxjava3.plugins.a.R(new q1(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> D1(long j5, @l3.f m3.r<? super Throwable> rVar) {
        return A2().P5(j5, rVar).l6();
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> D2() {
        return io.reactivex.rxjava3.plugins.a.S(new s1(this, null));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> E1(@l3.f m3.d<? super Integer, ? super Throwable> dVar) {
        return A2().Q5(dVar).l6();
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> F1(@l3.f m3.r<? super Throwable> rVar) {
        return D1(Long.MAX_VALUE, rVar);
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final x<T> F2(@l3.f q0 q0Var) {
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.Q(new u1(this, q0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> G1(@l3.f m3.e eVar) {
        Objects.requireNonNull(eVar, "stop is null");
        return D1(Long.MAX_VALUE, io.reactivex.rxjava3.internal.functions.a.v(eVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> H1(@l3.f m3.o<? super o<Throwable>, ? extends org.reactivestreams.o<?>> oVar) {
        return A2().T5(oVar).l6();
    }

    @l3.h("none")
    public final void I1(@l3.f a0<? super T> a0Var) {
        Objects.requireNonNull(a0Var, "observer is null");
        a(new io.reactivex.rxjava3.internal.observers.c0(a0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> L(@l3.f m3.o<? super T, ? extends d0<? extends R>> oVar) {
        return s0(oVar);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> L1(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "other is null");
        return o.D0(c.A1(iVar).p1(), A2());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c M(@l3.f m3.o<? super T, ? extends i> oVar) {
        return v0(oVar);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> M1(@l3.f d0<T> d0Var) {
        Objects.requireNonNull(d0Var, "other is null");
        return o.D0(I2(d0Var).A2(), A2());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> N(@l3.f m3.o<? super T, ? extends x0<? extends R>> oVar) {
        return y0(oVar);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> N1(@l3.f x0<T> x0Var) {
        Objects.requireNonNull(x0Var, "other is null");
        return o.D0(r0.w2(x0Var).n2(), A2());
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> O(@l3.f d0<? extends T> d0Var) {
        Objects.requireNonNull(d0Var, "other is null");
        return q(this, d0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> O1(@l3.f org.reactivestreams.o<T> oVar) {
        Objects.requireNonNull(oVar, "other is null");
        return A2().F6(oVar);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<Boolean> P(@l3.f Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.maybe.h(this, obj));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> P0() {
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.q0(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final i0<T> P1(@l3.f n0<T> n0Var) {
        Objects.requireNonNull(n0Var, "other is null");
        return i0.q8(n0Var).x1(C2());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<Long> Q() {
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.maybe.i(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c Q0() {
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.maybe.s0(this));
    }

    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.disposables.e Q1() {
        return T1(io.reactivex.rxjava3.internal.functions.a.h(), io.reactivex.rxjava3.internal.functions.a.f16254f, io.reactivex.rxjava3.internal.functions.a.f16251c);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<Boolean> R0() {
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.maybe.u0(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.disposables.e R1(@l3.f m3.g<? super T> gVar) {
        return T1(gVar, io.reactivex.rxjava3.internal.functions.a.f16254f, io.reactivex.rxjava3.internal.functions.a.f16251c);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> S(@l3.f T t5) {
        Objects.requireNonNull(t5, "defaultItem is null");
        return io.reactivex.rxjava3.plugins.a.S(new s1(this, t5));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.disposables.e S1(@l3.f m3.g<? super T> gVar, @l3.f m3.g<? super Throwable> gVar2) {
        return T1(gVar, gVar2, io.reactivex.rxjava3.internal.functions.a.f16251c);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> T0(@l3.f c0<? extends R, ? super T> c0Var) {
        Objects.requireNonNull(c0Var, "lift is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.w0(this, c0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.disposables.e T1(@l3.f m3.g<? super T> gVar, @l3.f m3.g<? super Throwable> gVar2, @l3.f m3.a aVar) {
        Objects.requireNonNull(gVar, "onSuccess is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        return (io.reactivex.rxjava3.disposables.e) W1(new io.reactivex.rxjava3.internal.operators.maybe.d(gVar, gVar2, aVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U, R> x<R> T2(@l3.f d0<? extends U> d0Var, @l3.f m3.c<? super T, ? super U, ? extends R> cVar) {
        Objects.requireNonNull(d0Var, "other is null");
        return Q2(this, d0Var, cVar);
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final x<T> U(long j5, @l3.f TimeUnit timeUnit) {
        return W(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a(), false);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> U0(@l3.f m3.o<? super T, ? extends R> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.x0(this, oVar));
    }

    protected abstract void U1(@l3.f a0<? super T> a0Var);

    @l3.d
    @l3.h("custom")
    @l3.f
    public final x<T> V(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        return W(j5, timeUnit, q0Var, false);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> V0(@l3.f m3.o<? super T, Optional<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.jdk8.p(this, oVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final x<T> V1(@l3.f q0 q0Var) {
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.Q(new g1(this, q0Var));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final x<T> W(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var, boolean z4) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.l(this, Math.max(0L, j5), timeUnit, q0Var, z4));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<f0<T>> W0() {
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.maybe.y0(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <E extends a0<? super T>> E W1(E e5) {
        a(e5);
        return e5;
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final x<T> X(long j5, @l3.f TimeUnit timeUnit, boolean z4) {
        return W(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a(), z4);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> X1(@l3.f d0<? extends T> d0Var) {
        Objects.requireNonNull(d0Var, "other is null");
        return io.reactivex.rxjava3.plugins.a.Q(new h1(this, d0Var));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final <U> x<T> Y(@l3.f org.reactivestreams.o<U> oVar) {
        Objects.requireNonNull(oVar, "delayIndicator is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.m(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final r0<T> Y1(@l3.f x0<? extends T> x0Var) {
        Objects.requireNonNull(x0Var, "other is null");
        return io.reactivex.rxjava3.plugins.a.S(new i1(this, x0Var));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final x<T> Z(long j5, @l3.f TimeUnit timeUnit) {
        return a0(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @Override // io.reactivex.rxjava3.core.d0
    @l3.h("none")
    public final void a(@l3.f a0<? super T> a0Var) {
        Objects.requireNonNull(a0Var, "observer is null");
        a0<? super T> e02 = io.reactivex.rxjava3.plugins.a.e0(this, a0Var);
        Objects.requireNonNull(e02, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            U1(e02);
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
    @l3.h("custom")
    @l3.f
    public final x<T> a0(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        return b0(o.Z7(j5, timeUnit, q0Var));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final <U> x<T> b0(@l3.f org.reactivestreams.o<U> oVar) {
        Objects.requireNonNull(oVar, "subscriptionIndicator is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.n(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U> x<T> b2(@l3.f d0<U> d0Var) {
        Objects.requireNonNull(d0Var, "other is null");
        return io.reactivex.rxjava3.plugins.a.Q(new j1(this, d0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> c0(@l3.f m3.o<? super T, f0<R>> oVar) {
        Objects.requireNonNull(oVar, "selector is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.p(this, oVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final <U> x<T> c2(@l3.f org.reactivestreams.o<U> oVar) {
        Objects.requireNonNull(oVar, "other is null");
        return io.reactivex.rxjava3.plugins.a.Q(new k1(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> d0(@l3.f m3.g<? super T> gVar) {
        Objects.requireNonNull(gVar, "onAfterSuccess is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.r(this, gVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.observers.n<T> d2() {
        io.reactivex.rxjava3.observers.n<T> nVar = new io.reactivex.rxjava3.observers.n<>();
        a(nVar);
        return nVar;
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> e0(@l3.f m3.a aVar) {
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h7 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar2 = io.reactivex.rxjava3.internal.functions.a.f16251c;
        Objects.requireNonNull(aVar, "onAfterTerminate is null");
        return io.reactivex.rxjava3.plugins.a.Q(new f1(this, h5, h6, h7, aVar2, aVar, aVar2));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.observers.n<T> e2(boolean z4) {
        io.reactivex.rxjava3.observers.n<T> nVar = new io.reactivex.rxjava3.observers.n<>();
        if (z4) {
            nVar.dispose();
        }
        a(nVar);
        return nVar;
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> f(@l3.f d0<? extends T> d0Var) {
        Objects.requireNonNull(d0Var, "other is null");
        return e(this, d0Var);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> f0(@l3.f m3.a aVar) {
        Objects.requireNonNull(aVar, "onFinally is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.s(this, aVar));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final x<io.reactivex.rxjava3.schedulers.d<T>> f2() {
        return i2(TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.d
    @l3.h("none")
    @l3.g
    public final T g() {
        io.reactivex.rxjava3.internal.observers.i iVar = new io.reactivex.rxjava3.internal.observers.i();
        a(iVar);
        return (T) iVar.c();
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> g0(@l3.f m3.a aVar) {
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h7 = io.reactivex.rxjava3.internal.functions.a.h();
        Objects.requireNonNull(aVar, "onComplete is null");
        m3.a aVar2 = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return io.reactivex.rxjava3.plugins.a.Q(new f1(this, h5, h6, h7, aVar, aVar2, aVar2));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final x<io.reactivex.rxjava3.schedulers.d<T>> g2(@l3.f q0 q0Var) {
        return i2(TimeUnit.MILLISECONDS, q0Var);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final T h(@l3.f T t5) {
        Objects.requireNonNull(t5, "defaultValue is null");
        io.reactivex.rxjava3.internal.observers.i iVar = new io.reactivex.rxjava3.internal.observers.i();
        a(iVar);
        return (T) iVar.d(t5);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> h0(@l3.f m3.a aVar) {
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h7 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar2 = io.reactivex.rxjava3.internal.functions.a.f16251c;
        Objects.requireNonNull(aVar, "onDispose is null");
        return io.reactivex.rxjava3.plugins.a.Q(new f1(this, h5, h6, h7, aVar2, aVar2, aVar));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final x<io.reactivex.rxjava3.schedulers.d<T>> h2(@l3.f TimeUnit timeUnit) {
        return i2(timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.h("none")
    public final void i() {
        m(io.reactivex.rxjava3.internal.functions.a.h(), io.reactivex.rxjava3.internal.functions.a.f16253e, io.reactivex.rxjava3.internal.functions.a.f16251c);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> i0(@l3.f m3.g<? super Throwable> gVar) {
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        Objects.requireNonNull(gVar, "onError is null");
        m3.a aVar = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return io.reactivex.rxjava3.plugins.a.Q(new f1(this, h5, h6, gVar, aVar, aVar, aVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final x<io.reactivex.rxjava3.schedulers.d<T>> i2(@l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.Q(new l1(this, timeUnit, q0Var, true));
    }

    @l3.h("none")
    public final void j(@l3.f a0<? super T> a0Var) {
        Objects.requireNonNull(a0Var, "observer is null");
        io.reactivex.rxjava3.internal.observers.f fVar = new io.reactivex.rxjava3.internal.observers.f();
        a0Var.onSubscribe(fVar);
        a(fVar);
        fVar.b(a0Var);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> j0(@l3.f m3.b<? super T, ? super Throwable> bVar) {
        Objects.requireNonNull(bVar, "onEvent is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.t(this, bVar));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final x<T> j2(long j5, @l3.f TimeUnit timeUnit) {
        return l2(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.h("none")
    public final void k(@l3.f m3.g<? super T> gVar) {
        m(gVar, io.reactivex.rxjava3.internal.functions.a.f16253e, io.reactivex.rxjava3.internal.functions.a.f16251c);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> k0(@l3.f m3.g<? super io.reactivex.rxjava3.disposables.e> gVar, @l3.f m3.a aVar) {
        Objects.requireNonNull(gVar, "onSubscribe is null");
        Objects.requireNonNull(aVar, "onDispose is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.u(this, gVar, aVar));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final x<T> k2(long j5, @l3.f TimeUnit timeUnit, @l3.f d0<? extends T> d0Var) {
        Objects.requireNonNull(d0Var, "fallback is null");
        return m2(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a(), d0Var);
    }

    @l3.h("none")
    public final void l(@l3.f m3.g<? super T> gVar, @l3.f m3.g<? super Throwable> gVar2) {
        m(gVar, gVar2, io.reactivex.rxjava3.internal.functions.a.f16251c);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> l0(@l3.f m3.g<? super io.reactivex.rxjava3.disposables.e> gVar) {
        Objects.requireNonNull(gVar, "onSubscribe is null");
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return io.reactivex.rxjava3.plugins.a.Q(new f1(this, gVar, h5, h6, aVar, aVar, aVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final x<T> l2(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        return n2(s2(j5, timeUnit, q0Var));
    }

    @l3.h("none")
    public final void m(@l3.f m3.g<? super T> gVar, @l3.f m3.g<? super Throwable> gVar2, @l3.f m3.a aVar) {
        Objects.requireNonNull(gVar, "onSuccess is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        io.reactivex.rxjava3.internal.observers.i iVar = new io.reactivex.rxjava3.internal.observers.i();
        a(iVar);
        iVar.b(gVar, gVar2, aVar);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> m0(@l3.f m3.g<? super T> gVar) {
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        Objects.requireNonNull(gVar, "onSuccess is null");
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return io.reactivex.rxjava3.plugins.a.Q(new f1(this, h5, gVar, h6, aVar, aVar, aVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> m1(@l3.f d0<? extends T> d0Var) {
        Objects.requireNonNull(d0Var, "other is null");
        return X0(this, d0Var);
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final x<T> m2(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var, @l3.f d0<? extends T> d0Var) {
        Objects.requireNonNull(d0Var, "fallback is null");
        return o2(s2(j5, timeUnit, q0Var), d0Var);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> n() {
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.c(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> n0(@l3.f m3.a aVar) {
        Objects.requireNonNull(aVar, "onTerminate is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.v(this, aVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U> x<T> n2(@l3.f d0<U> d0Var) {
        Objects.requireNonNull(d0Var, "timeoutIndicator is null");
        return io.reactivex.rxjava3.plugins.a.Q(new m1(this, d0Var, null));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U> x<U> o(@l3.f Class<? extends U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return (x<U>) U0(io.reactivex.rxjava3.internal.functions.a.e(cls));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final x<T> o1(@l3.f q0 q0Var) {
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.Q(new b1(this, q0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U> x<T> o2(@l3.f d0<U> d0Var, @l3.f d0<? extends T> d0Var2) {
        Objects.requireNonNull(d0Var, "timeoutIndicator is null");
        Objects.requireNonNull(d0Var2, "fallback is null");
        return io.reactivex.rxjava3.plugins.a.Q(new m1(this, d0Var, d0Var2));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> p(@l3.f e0<? super T, ? extends R> e0Var) {
        Objects.requireNonNull(e0Var, "transformer is null");
        return I2(e0Var.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.h("none")
    @l3.f
    public final <U> x<U> p1(@l3.f Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return r0(io.reactivex.rxjava3.internal.functions.a.l(cls)).o(cls);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final <U> x<T> p2(@l3.f org.reactivestreams.o<U> oVar) {
        Objects.requireNonNull(oVar, "timeoutIndicator is null");
        return io.reactivex.rxjava3.plugins.a.Q(new n1(this, oVar, null));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> q1() {
        return r1(io.reactivex.rxjava3.internal.functions.a.c());
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final <U> x<T> q2(@l3.f org.reactivestreams.o<U> oVar, @l3.f d0<? extends T> d0Var) {
        Objects.requireNonNull(oVar, "timeoutIndicator is null");
        Objects.requireNonNull(d0Var, "fallback is null");
        return io.reactivex.rxjava3.plugins.a.Q(new n1(this, oVar, d0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> r0(@l3.f m3.r<? super T> rVar) {
        Objects.requireNonNull(rVar, "predicate is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.a0(this, rVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> r1(@l3.f m3.r<? super Throwable> rVar) {
        Objects.requireNonNull(rVar, "predicate is null");
        return io.reactivex.rxjava3.plugins.a.Q(new c1(this, rVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> s0(@l3.f m3.o<? super T, ? extends d0<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.i0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> s1(@l3.f m3.o<? super Throwable, ? extends d0<? extends T>> oVar) {
        Objects.requireNonNull(oVar, "fallbackSupplier is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.d1(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <U, R> x<R> t0(@l3.f m3.o<? super T, ? extends d0<? extends U>> oVar, @l3.f m3.c<? super T, ? super U, ? extends R> cVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        Objects.requireNonNull(cVar, "combiner is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.c0(this, oVar, cVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> t1(@l3.f d0<? extends T> d0Var) {
        Objects.requireNonNull(d0Var, "fallback is null");
        return s1(io.reactivex.rxjava3.internal.functions.a.n(d0Var));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final x<io.reactivex.rxjava3.schedulers.d<T>> t2() {
        return w2(TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> u0(@l3.f m3.o<? super T, ? extends d0<? extends R>> oVar, @l3.f m3.o<? super Throwable, ? extends d0<? extends R>> oVar2, @l3.f m3.s<? extends d0<? extends R>> sVar) {
        Objects.requireNonNull(oVar, "onSuccessMapper is null");
        Objects.requireNonNull(oVar2, "onErrorMapper is null");
        Objects.requireNonNull(sVar, "onCompleteSupplier is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.g0(this, oVar, oVar2, sVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> u1(@l3.f m3.o<? super Throwable, ? extends T> oVar) {
        Objects.requireNonNull(oVar, "itemSupplier is null");
        return io.reactivex.rxjava3.plugins.a.Q(new e1(this, oVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final x<io.reactivex.rxjava3.schedulers.d<T>> u2(@l3.f q0 q0Var) {
        return w2(TimeUnit.MILLISECONDS, q0Var);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c v0(@l3.f m3.o<? super T, ? extends i> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.maybe.d0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> v1(@l3.f T t5) {
        Objects.requireNonNull(t5, "item is null");
        return u1(io.reactivex.rxjava3.internal.functions.a.n(t5));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final x<io.reactivex.rxjava3.schedulers.d<T>> v2(@l3.f TimeUnit timeUnit) {
        return w2(timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> i0<R> w0(@l3.f m3.o<? super T, ? extends n0<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.R(new io.reactivex.rxjava3.internal.operators.mixed.o(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final x<T> w1() {
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.q(this));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final x<io.reactivex.rxjava3.schedulers.d<T>> w2(@l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.Q(new l1(this, timeUnit, q0Var, false));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <R> o<R> x0(@l3.f m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.mixed.p(this, oVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> x1() {
        return y1(Long.MAX_VALUE);
    }

    @l3.d
    @l3.h("none")
    public final <R> R x2(@l3.f y<T, ? extends R> yVar) {
        Objects.requireNonNull(yVar, "converter is null");
        return yVar.a(this);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <R> x<R> y0(@l3.f m3.o<? super T, ? extends x0<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.h0(this, oVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> y1(long j5) {
        return A2().s5(j5);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final CompletionStage<T> y2() {
        return (CompletionStage) W1(new io.reactivex.rxjava3.internal.jdk8.b(false, null));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <U> o<U> z0(@l3.f m3.o<? super T, ? extends Iterable<? extends U>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.maybe.e0(this, oVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final o<T> z1(@l3.f m3.e eVar) {
        return A2().t5(eVar);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final CompletionStage<T> z2(@l3.g T t5) {
        return (CompletionStage) W1(new io.reactivex.rxjava3.internal.jdk8.b(true, t5));
    }
}
