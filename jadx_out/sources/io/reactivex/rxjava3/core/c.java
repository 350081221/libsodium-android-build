package io.reactivex.rxjava3.core;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class c implements i {
    @l3.d
    @l3.h("none")
    @l3.f
    public static c A(@l3.f Iterable<? extends i> iterable) {
        return o.l3(iterable).c1(io.reactivex.rxjava3.internal.functions.a.k());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c A1(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "source is null");
        if (iVar instanceof c) {
            return io.reactivex.rxjava3.plugins.a.O((c) iVar);
        }
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.x(iVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static c B(@l3.f org.reactivestreams.o<? extends i> oVar) {
        return C(oVar, 2);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static c C(@l3.f org.reactivestreams.o<? extends i> oVar, int i5) {
        return o.p3(oVar).e1(io.reactivex.rxjava3.internal.functions.a.k(), true, i5);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c E(@l3.f g gVar) {
        Objects.requireNonNull(gVar, "source is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.g(gVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c F(@l3.f m3.s<? extends i> sVar) {
        Objects.requireNonNull(sVar, "supplier is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.h(sVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static r0<Boolean> P0(@l3.f i iVar, @l3.f i iVar2) {
        Objects.requireNonNull(iVar, "source1 is null");
        Objects.requireNonNull(iVar2, "source2 is null");
        return p0(iVar, iVar2).l(r0.N0(Boolean.TRUE));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    private c S(m3.g<? super io.reactivex.rxjava3.disposables.e> gVar, m3.g<? super Throwable> gVar2, m3.a aVar, m3.a aVar2, m3.a aVar3, m3.a aVar4) {
        Objects.requireNonNull(gVar, "onSubscribe is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        Objects.requireNonNull(aVar2, "onTerminate is null");
        Objects.requireNonNull(aVar3, "onAfterTerminate is null");
        Objects.requireNonNull(aVar4, "onDispose is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.k0(this, gVar, gVar2, aVar, aVar2, aVar3, aVar4));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c V(@l3.f Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.o(th));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c W(@l3.f m3.s<? extends Throwable> sVar) {
        Objects.requireNonNull(sVar, "supplier is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.p(sVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c X(@l3.f m3.a aVar) {
        Objects.requireNonNull(aVar, "action is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.q(aVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c Y(@l3.f Callable<?> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.r(callable));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c Z(@l3.f CompletionStage<?> completionStage) {
        Objects.requireNonNull(completionStage, "stage is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.jdk8.a(completionStage));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c a0(@l3.f Future<?> future) {
        Objects.requireNonNull(future, "future is null");
        return X(io.reactivex.rxjava3.internal.functions.a.j(future));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> c b0(@l3.f d0<T> d0Var) {
        Objects.requireNonNull(d0Var, "maybe is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.maybe.s0(d0Var));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public static c b1(@l3.f org.reactivestreams.o<? extends i> oVar) {
        Objects.requireNonNull(oVar, "sources is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.mixed.i(oVar, io.reactivex.rxjava3.internal.functions.a.k(), false));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> c c0(@l3.f n0<T> n0Var) {
        Objects.requireNonNull(n0Var, "observable is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.s(n0Var));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public static c c1(@l3.f org.reactivestreams.o<? extends i> oVar) {
        Objects.requireNonNull(oVar, "sources is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.mixed.i(oVar, io.reactivex.rxjava3.internal.functions.a.k(), true));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public static <T> c d0(@l3.f org.reactivestreams.o<T> oVar) {
        Objects.requireNonNull(oVar, "publisher is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.t(oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c e(@l3.f Iterable<? extends i> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.a(null, iterable));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c e0(@l3.f Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.u(runnable));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    public static c f(@l3.f i... iVarArr) {
        Objects.requireNonNull(iVarArr, "sources is null");
        if (iVarArr.length == 0) {
            return t();
        }
        if (iVarArr.length == 1) {
            return A1(iVarArr[0]);
        }
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.a(iVarArr, null));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <T> c f0(@l3.f x0<T> x0Var) {
        Objects.requireNonNull(x0Var, "single is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.v(x0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c g0(@l3.f m3.s<?> sVar) {
        Objects.requireNonNull(sVar, "supplier is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.w(sVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c k0(@l3.f Iterable<? extends i> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.f0(iterable));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    private c k1(long j5, TimeUnit timeUnit, q0 q0Var, i iVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.o0(this, j5, timeUnit, q0Var, iVar));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public static c l0(@l3.f org.reactivestreams.o<? extends i> oVar) {
        return n0(oVar, Integer.MAX_VALUE, false);
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public static c l1(long j5, @l3.f TimeUnit timeUnit) {
        return m1(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static c m0(@l3.f org.reactivestreams.o<? extends i> oVar, int i5) {
        return n0(oVar, i5, false);
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public static c m1(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.p0(j5, timeUnit, q0Var));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    private static c n0(@l3.f org.reactivestreams.o<? extends i> oVar, int i5, boolean z4) {
        Objects.requireNonNull(oVar, "sources is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "maxConcurrency");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.b0(oVar, i5, z4));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    public static c o0(@l3.f i... iVarArr) {
        Objects.requireNonNull(iVarArr, "sources is null");
        if (iVarArr.length == 0) {
            return t();
        }
        if (iVarArr.length == 1) {
            return A1(iVarArr[0]);
        }
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.c0(iVarArr));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    public static c p0(@l3.f i... iVarArr) {
        Objects.requireNonNull(iVarArr, "sources is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.d0(iVarArr));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c q0(@l3.f Iterable<? extends i> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.e0(iterable));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public static c r0(@l3.f org.reactivestreams.o<? extends i> oVar) {
        return n0(oVar, Integer.MAX_VALUE, true);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static c s0(@l3.f org.reactivestreams.o<? extends i> oVar, int i5) {
        return n0(oVar, i5, true);
    }

    private static NullPointerException s1(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c t() {
        return io.reactivex.rxjava3.plugins.a.O(io.reactivex.rxjava3.internal.operators.completable.n.f16549a);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c u0() {
        return io.reactivex.rxjava3.plugins.a.O(io.reactivex.rxjava3.internal.operators.completable.g0.f16502a);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c v(@l3.f Iterable<? extends i> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.f(iterable));
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static c w(@l3.f org.reactivestreams.o<? extends i> oVar) {
        return x(oVar, 2);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static c w1(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "onSubscribe is null");
        if (!(iVar instanceof c)) {
            return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.x(iVar));
        }
        throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public static c x(@l3.f org.reactivestreams.o<? extends i> oVar, int i5) {
        Objects.requireNonNull(oVar, "sources is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "prefetch");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.d(oVar, i5));
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    public static c y(@l3.f i... iVarArr) {
        Objects.requireNonNull(iVarArr, "sources is null");
        if (iVarArr.length == 0) {
            return t();
        }
        if (iVarArr.length == 1) {
            return A1(iVarArr[0]);
        }
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.e(iVarArr));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <R> c y1(@l3.f m3.s<R> sVar, @l3.f m3.o<? super R, ? extends i> oVar, @l3.f m3.g<? super R> gVar) {
        return z1(sVar, oVar, gVar, true);
    }

    @l3.d
    @l3.f
    @SafeVarargs
    @l3.h("none")
    public static c z(@l3.f i... iVarArr) {
        return o.f3(iVarArr).e1(io.reactivex.rxjava3.internal.functions.a.k(), true, 2);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public static <R> c z1(@l3.f m3.s<R> sVar, @l3.f m3.o<? super R, ? extends i> oVar, @l3.f m3.g<? super R> gVar, boolean z4) {
        Objects.requireNonNull(sVar, "resourceSupplier is null");
        Objects.requireNonNull(oVar, "sourceSupplier is null");
        Objects.requireNonNull(gVar, "resourceCleanup is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.t0(sVar, oVar, gVar, z4));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <T> x<T> A0(@l3.f m3.o<? super Throwable, ? extends T> oVar) {
        Objects.requireNonNull(oVar, "itemSupplier is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.completable.j0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <T> x<T> B0(@l3.f T t5) {
        Objects.requireNonNull(t5, "item is null");
        return A0(io.reactivex.rxjava3.internal.functions.a.n(t5));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c C0() {
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.j(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c D(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "other is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.b(this, iVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c D0() {
        return d0(p1().r5());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c E0(long j5) {
        return d0(p1().s5(j5));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c F0(@l3.f m3.e eVar) {
        return d0(p1().t5(eVar));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final c G(long j5, @l3.f TimeUnit timeUnit) {
        return I(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a(), false);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c G0(@l3.f m3.o<? super o<Object>, ? extends org.reactivestreams.o<?>> oVar) {
        return d0(p1().u5(oVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final c H(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        return I(j5, timeUnit, q0Var, false);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c H0() {
        return d0(p1().N5());
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final c I(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var, boolean z4) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.i(this, j5, timeUnit, q0Var, z4));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c I0(long j5) {
        return d0(p1().O5(j5));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final c J(long j5, @l3.f TimeUnit timeUnit) {
        return K(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c J0(long j5, @l3.f m3.r<? super Throwable> rVar) {
        return d0(p1().P5(j5, rVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final c K(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        return m1(j5, timeUnit, q0Var).h(this);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c K0(@l3.f m3.d<? super Integer, ? super Throwable> dVar) {
        return d0(p1().Q5(dVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c L(@l3.f m3.a aVar) {
        m3.g<? super io.reactivex.rxjava3.disposables.e> h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g<? super Throwable> h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar2 = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return S(h5, h6, aVar2, aVar2, aVar, aVar2);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c L0(@l3.f m3.r<? super Throwable> rVar) {
        return d0(p1().R5(rVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c M(@l3.f m3.a aVar) {
        Objects.requireNonNull(aVar, "onFinally is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.l(this, aVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c M0(@l3.f m3.e eVar) {
        Objects.requireNonNull(eVar, "stop is null");
        return J0(Long.MAX_VALUE, io.reactivex.rxjava3.internal.functions.a.v(eVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c N(@l3.f m3.a aVar) {
        m3.g<? super io.reactivex.rxjava3.disposables.e> h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g<? super Throwable> h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar2 = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return S(h5, h6, aVar, aVar2, aVar2, aVar2);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c N0(@l3.f m3.o<? super o<Throwable>, ? extends org.reactivestreams.o<?>> oVar) {
        return d0(p1().T5(oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c O(@l3.f m3.a aVar) {
        m3.g<? super io.reactivex.rxjava3.disposables.e> h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g<? super Throwable> h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar2 = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return S(h5, h6, aVar2, aVar2, aVar2, aVar);
    }

    @l3.h("none")
    public final void O0(@l3.f f fVar) {
        Objects.requireNonNull(fVar, "observer is null");
        a(new io.reactivex.rxjava3.internal.observers.b0(fVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c P(@l3.f m3.g<? super Throwable> gVar) {
        m3.g<? super io.reactivex.rxjava3.disposables.e> h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return S(h5, gVar, aVar, aVar, aVar, aVar);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c Q(@l3.f m3.g<? super Throwable> gVar) {
        Objects.requireNonNull(gVar, "onEvent is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.m(this, gVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c Q0(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "other is null");
        return y(iVar, this);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c R(@l3.f m3.g<? super io.reactivex.rxjava3.disposables.e> gVar, @l3.f m3.a aVar) {
        m3.g<? super Throwable> h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar2 = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return S(gVar, h5, aVar2, aVar2, aVar2, aVar);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <T> o<T> R0(@l3.f d0<T> d0Var) {
        Objects.requireNonNull(d0Var, "other is null");
        return o.D0(x.I2(d0Var).A2(), p1());
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <T> o<T> S0(@l3.f x0<T> x0Var) {
        Objects.requireNonNull(x0Var, "other is null");
        return o.D0(r0.w2(x0Var).n2(), p1());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c T(@l3.f m3.g<? super io.reactivex.rxjava3.disposables.e> gVar) {
        m3.g<? super Throwable> h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return S(gVar, h5, aVar, aVar, aVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <T> o<T> T0(@l3.f org.reactivestreams.o<T> oVar) {
        Objects.requireNonNull(oVar, "other is null");
        return p1().F6(oVar);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c U(@l3.f m3.a aVar) {
        m3.g<? super io.reactivex.rxjava3.disposables.e> h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g<? super Throwable> h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar2 = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return S(h5, h6, aVar2, aVar, aVar2, aVar2);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <T> i0<T> U0(@l3.f n0<T> n0Var) {
        Objects.requireNonNull(n0Var, "other is null");
        return i0.q8(n0Var).x1(t1());
    }

    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.disposables.e V0() {
        io.reactivex.rxjava3.internal.observers.p pVar = new io.reactivex.rxjava3.internal.observers.p();
        a(pVar);
        return pVar;
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.disposables.e W0(@l3.f m3.a aVar) {
        Objects.requireNonNull(aVar, "onComplete is null");
        io.reactivex.rxjava3.internal.observers.k kVar = new io.reactivex.rxjava3.internal.observers.k(aVar);
        a(kVar);
        return kVar;
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.disposables.e X0(@l3.f m3.a aVar, @l3.f m3.g<? super Throwable> gVar) {
        Objects.requireNonNull(gVar, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        io.reactivex.rxjava3.internal.observers.k kVar = new io.reactivex.rxjava3.internal.observers.k(gVar, aVar);
        a(kVar);
        return kVar;
    }

    protected abstract void Y0(@l3.f f fVar);

    @l3.d
    @l3.h("custom")
    @l3.f
    public final c Z0(@l3.f q0 q0Var) {
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.m0(this, q0Var));
    }

    @Override // io.reactivex.rxjava3.core.i
    @l3.h("none")
    public final void a(@l3.f f fVar) {
        Objects.requireNonNull(fVar, "observer is null");
        try {
            f d02 = io.reactivex.rxjava3.plugins.a.d0(this, fVar);
            Objects.requireNonNull(d02, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            Y0(d02);
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
            throw s1(th);
        }
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <E extends f> E a1(E e5) {
        a(e5);
        return e5;
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c d1(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "other is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.n0(this, iVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.observers.n<Void> e1() {
        io.reactivex.rxjava3.observers.n<Void> nVar = new io.reactivex.rxjava3.observers.n<>();
        a(nVar);
        return nVar;
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final io.reactivex.rxjava3.observers.n<Void> f1(boolean z4) {
        io.reactivex.rxjava3.observers.n<Void> nVar = new io.reactivex.rxjava3.observers.n<>();
        if (z4) {
            nVar.dispose();
        }
        a(nVar);
        return nVar;
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c g(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "other is null");
        return f(this, iVar);
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final c g1(long j5, @l3.f TimeUnit timeUnit) {
        return k1(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a(), null);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c h(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "next is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.b(this, iVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c h0() {
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.y(this));
    }

    @l3.d
    @l3.h(l3.h.f20735h)
    @l3.f
    public final c h1(long j5, @l3.f TimeUnit timeUnit, @l3.f i iVar) {
        Objects.requireNonNull(iVar, "fallback is null");
        return k1(j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a(), iVar);
    }

    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <T> o<T> i(@l3.f org.reactivestreams.o<T> oVar) {
        Objects.requireNonNull(oVar, "next is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.mixed.b(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c i0(@l3.f h hVar) {
        Objects.requireNonNull(hVar, "onLift is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.z(this, hVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final c i1(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        return k1(j5, timeUnit, q0Var, null);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <T> x<T> j(@l3.f d0<T> d0Var) {
        Objects.requireNonNull(d0Var, "next is null");
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.o(d0Var, this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <T> r0<f0<T>> j0() {
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.completable.a0(this));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final c j1(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var, @l3.f i iVar) {
        Objects.requireNonNull(iVar, "fallback is null");
        return k1(j5, timeUnit, q0Var, iVar);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <T> i0<T> k(@l3.f n0<T> n0Var) {
        Objects.requireNonNull(n0Var, "next is null");
        return io.reactivex.rxjava3.plugins.a.R(new io.reactivex.rxjava3.internal.operators.mixed.a(this, n0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <T> r0<T> l(@l3.f x0<T> x0Var) {
        Objects.requireNonNull(x0Var, "next is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.single.g(x0Var, this));
    }

    @l3.h("none")
    public final void m() {
        io.reactivex.rxjava3.internal.observers.i iVar = new io.reactivex.rxjava3.internal.observers.i();
        a(iVar);
        iVar.c();
    }

    @l3.d
    @l3.h("none")
    public final boolean n(long j5, @l3.f TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit, "unit is null");
        io.reactivex.rxjava3.internal.observers.i iVar = new io.reactivex.rxjava3.internal.observers.i();
        a(iVar);
        return iVar.a(j5, timeUnit);
    }

    @l3.d
    @l3.h("none")
    public final <R> R n1(@l3.f d<? extends R> dVar) {
        Objects.requireNonNull(dVar, "converter is null");
        return dVar.a(this);
    }

    @l3.h("none")
    public final void o() {
        r(io.reactivex.rxjava3.internal.functions.a.f16251c, io.reactivex.rxjava3.internal.functions.a.f16253e);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <T> CompletionStage<T> o1(@l3.g T t5) {
        return (CompletionStage) a1(new io.reactivex.rxjava3.internal.jdk8.b(true, t5));
    }

    @l3.h("none")
    public final void p(@l3.f f fVar) {
        Objects.requireNonNull(fVar, "observer is null");
        io.reactivex.rxjava3.internal.observers.f fVar2 = new io.reactivex.rxjava3.internal.observers.f();
        fVar.onSubscribe(fVar2);
        a(fVar2);
        fVar2.a(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.f
    @l3.h("none")
    @l3.b(l3.a.FULL)
    public final <T> o<T> p1() {
        if (this instanceof io.reactivex.rxjava3.internal.fuseable.d) {
            return ((io.reactivex.rxjava3.internal.fuseable.d) this).d();
        }
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.completable.q0(this));
    }

    @l3.h("none")
    public final void q(@l3.f m3.a aVar) {
        r(aVar, io.reactivex.rxjava3.internal.functions.a.f16253e);
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final Future<Void> q1() {
        return (Future) a1(new io.reactivex.rxjava3.internal.observers.r());
    }

    @l3.h("none")
    public final void r(@l3.f m3.a aVar, @l3.f m3.g<? super Throwable> gVar) {
        Objects.requireNonNull(aVar, "onComplete is null");
        Objects.requireNonNull(gVar, "onError is null");
        io.reactivex.rxjava3.internal.observers.i iVar = new io.reactivex.rxjava3.internal.observers.i();
        a(iVar);
        iVar.b(io.reactivex.rxjava3.internal.functions.a.h(), gVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.h("none")
    @l3.f
    public final <T> x<T> r1() {
        if (this instanceof io.reactivex.rxjava3.internal.fuseable.e) {
            return ((io.reactivex.rxjava3.internal.fuseable.e) this).c();
        }
        return io.reactivex.rxjava3.plugins.a.Q(new io.reactivex.rxjava3.internal.operators.maybe.l0(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c s() {
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.c(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c t0(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "other is null");
        return o0(this, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @l3.h("none")
    @l3.f
    public final <T> i0<T> t1() {
        if (this instanceof io.reactivex.rxjava3.internal.fuseable.f) {
            return ((io.reactivex.rxjava3.internal.fuseable.f) this).b();
        }
        return io.reactivex.rxjava3.plugins.a.R(new io.reactivex.rxjava3.internal.operators.completable.r0(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c u(@l3.f j jVar) {
        Objects.requireNonNull(jVar, "transformer is null");
        return A1(jVar.a(this));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <T> r0<T> u1(@l3.f m3.s<? extends T> sVar) {
        Objects.requireNonNull(sVar, "completionValueSupplier is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.completable.s0(this, sVar, null));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final c v0(@l3.f q0 q0Var) {
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.h0(this, q0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final <T> r0<T> v1(T t5) {
        Objects.requireNonNull(t5, "completionValue is null");
        return io.reactivex.rxjava3.plugins.a.S(new io.reactivex.rxjava3.internal.operators.completable.s0(this, null, t5));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c w0() {
        return x0(io.reactivex.rxjava3.internal.functions.a.c());
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c x0(@l3.f m3.r<? super Throwable> rVar) {
        Objects.requireNonNull(rVar, "predicate is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.i0(this, rVar));
    }

    @l3.d
    @l3.h("custom")
    @l3.f
    public final c x1(@l3.f q0 q0Var) {
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.k(this, q0Var));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c y0(@l3.f m3.o<? super Throwable, ? extends i> oVar) {
        Objects.requireNonNull(oVar, "fallbackSupplier is null");
        return io.reactivex.rxjava3.plugins.a.O(new io.reactivex.rxjava3.internal.operators.completable.l0(this, oVar));
    }

    @l3.d
    @l3.h("none")
    @l3.f
    public final c z0(@l3.f i iVar) {
        Objects.requireNonNull(iVar, "fallback is null");
        return y0(io.reactivex.rxjava3.internal.functions.a.n(iVar));
    }
}
