package io.reactivex.rxjava3.parallel;

import io.reactivex.rxjava3.core.q0;
import io.reactivex.rxjava3.internal.jdk8.a0;
import io.reactivex.rxjava3.internal.jdk8.b0;
import io.reactivex.rxjava3.internal.jdk8.c0;
import io.reactivex.rxjava3.internal.jdk8.d0;
import io.reactivex.rxjava3.internal.operators.parallel.e;
import io.reactivex.rxjava3.internal.operators.parallel.i;
import io.reactivex.rxjava3.internal.operators.parallel.j;
import io.reactivex.rxjava3.internal.operators.parallel.k;
import io.reactivex.rxjava3.internal.operators.parallel.l;
import io.reactivex.rxjava3.internal.operators.parallel.m;
import io.reactivex.rxjava3.internal.operators.parallel.n;
import io.reactivex.rxjava3.internal.operators.parallel.p;
import io.reactivex.rxjava3.internal.operators.parallel.q;
import io.reactivex.rxjava3.internal.subscriptions.g;
import io.reactivex.rxjava3.internal.util.w;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;
import l3.f;
import l3.h;
import m3.r;
import m3.s;
import org.reactivestreams.o;

/* loaded from: classes3.dex */
public abstract class b<T> {
    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public static <T> b<T> C(@f o<? extends T> oVar) {
        return E(oVar, Runtime.getRuntime().availableProcessors(), io.reactivex.rxjava3.core.o.c0());
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public static <T> b<T> D(@f o<? extends T> oVar, int i5) {
        return E(oVar, i5, io.reactivex.rxjava3.core.o.c0());
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public static <T> b<T> E(@f o<? extends T> oVar, int i5, int i6) {
        Objects.requireNonNull(oVar, "source is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "parallelism");
        io.reactivex.rxjava3.internal.functions.b.b(i6, "prefetch");
        return io.reactivex.rxjava3.plugins.a.V(new i(oVar, i5, i6));
    }

    @l3.d
    @f
    @SafeVarargs
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public static <T> b<T> F(@f o<T>... oVarArr) {
        Objects.requireNonNull(oVarArr, "publishers is null");
        if (oVarArr.length != 0) {
            return io.reactivex.rxjava3.plugins.a.V(new io.reactivex.rxjava3.internal.operators.parallel.h(oVarArr));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final <R> b<R> A(@f m3.o<? super T, ? extends Stream<? extends R>> oVar) {
        return B(oVar, io.reactivex.rxjava3.core.o.c0());
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final <R> b<R> B(@f m3.o<? super T, ? extends Stream<? extends R>> oVar, int i5) {
        Objects.requireNonNull(oVar, "mapper is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "prefetch");
        return io.reactivex.rxjava3.plugins.a.V(new b0(this, oVar, i5));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final <R> b<R> G(@f m3.o<? super T, ? extends R> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.V(new k(this, oVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final <R> b<R> H(@f m3.o<? super T, ? extends R> oVar, @f a aVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        Objects.requireNonNull(aVar, "errorHandler is null");
        return io.reactivex.rxjava3.plugins.a.V(new l(this, oVar, aVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final <R> b<R> I(@f m3.o<? super T, ? extends R> oVar, @f m3.c<? super Long, ? super Throwable, a> cVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        Objects.requireNonNull(cVar, "errorHandler is null");
        return io.reactivex.rxjava3.plugins.a.V(new l(this, oVar, cVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final <R> b<R> J(@f m3.o<? super T, Optional<? extends R>> oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return io.reactivex.rxjava3.plugins.a.V(new c0(this, oVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final <R> b<R> K(@f m3.o<? super T, Optional<? extends R>> oVar, @f a aVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        Objects.requireNonNull(aVar, "errorHandler is null");
        return io.reactivex.rxjava3.plugins.a.V(new d0(this, oVar, aVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final <R> b<R> L(@f m3.o<? super T, Optional<? extends R>> oVar, @f m3.c<? super Long, ? super Throwable, a> cVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        Objects.requireNonNull(cVar, "errorHandler is null");
        return io.reactivex.rxjava3.plugins.a.V(new d0(this, oVar, cVar));
    }

    @l3.d
    public abstract int M();

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final io.reactivex.rxjava3.core.o<T> N(@f m3.c<T, T, T> cVar) {
        Objects.requireNonNull(cVar, "reducer is null");
        return io.reactivex.rxjava3.plugins.a.P(new io.reactivex.rxjava3.internal.operators.parallel.o(this, cVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final <R> b<R> O(@f s<R> sVar, @f m3.c<R, ? super T, R> cVar) {
        Objects.requireNonNull(sVar, "initialSupplier is null");
        Objects.requireNonNull(cVar, "reducer is null");
        return io.reactivex.rxjava3.plugins.a.V(new n(this, sVar, cVar));
    }

    @l3.d
    @f
    @h("custom")
    @l3.b(l3.a.FULL)
    public final b<T> P(@f q0 q0Var) {
        return Q(q0Var, io.reactivex.rxjava3.core.o.c0());
    }

    @l3.d
    @f
    @h("custom")
    @l3.b(l3.a.FULL)
    public final b<T> Q(@f q0 q0Var, int i5) {
        Objects.requireNonNull(q0Var, "scheduler is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "prefetch");
        return io.reactivex.rxjava3.plugins.a.V(new p(this, q0Var, i5));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final io.reactivex.rxjava3.core.o<T> R() {
        return S(io.reactivex.rxjava3.core.o.c0());
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final io.reactivex.rxjava3.core.o<T> S(int i5) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "prefetch");
        return io.reactivex.rxjava3.plugins.a.P(new j(this, i5, false));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final io.reactivex.rxjava3.core.o<T> T() {
        return U(io.reactivex.rxjava3.core.o.c0());
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final io.reactivex.rxjava3.core.o<T> U(int i5) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "prefetch");
        return io.reactivex.rxjava3.plugins.a.P(new j(this, i5, true));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final io.reactivex.rxjava3.core.o<T> V(@f Comparator<? super T> comparator) {
        return W(comparator, 16);
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final io.reactivex.rxjava3.core.o<T> W(@f Comparator<? super T> comparator, int i5) {
        Objects.requireNonNull(comparator, "comparator is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "capacityHint");
        return io.reactivex.rxjava3.plugins.a.P(new q(O(io.reactivex.rxjava3.internal.functions.a.f((i5 / M()) + 1), io.reactivex.rxjava3.internal.util.o.instance()).G(new w(comparator)), comparator));
    }

    @h("none")
    @l3.b(l3.a.SPECIAL)
    public abstract void X(@f org.reactivestreams.p<? super T>[] pVarArr);

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final <R> R Y(@f c<T, R> cVar) {
        Objects.requireNonNull(cVar, "converter is null");
        return cVar.a(this);
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final io.reactivex.rxjava3.core.o<List<T>> Z(@f Comparator<? super T> comparator) {
        return a0(comparator, 16);
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final <A, R> io.reactivex.rxjava3.core.o<R> a(@f Collector<T, A, R> collector) {
        Objects.requireNonNull(collector, "collector is null");
        return io.reactivex.rxjava3.plugins.a.P(new a0(this, collector));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final io.reactivex.rxjava3.core.o<List<T>> a0(@f Comparator<? super T> comparator, int i5) {
        Objects.requireNonNull(comparator, "comparator is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "capacityHint");
        return io.reactivex.rxjava3.plugins.a.P(O(io.reactivex.rxjava3.internal.functions.a.f((i5 / M()) + 1), io.reactivex.rxjava3.internal.util.o.instance()).G(new w(comparator)).N(new io.reactivex.rxjava3.internal.util.p(comparator)));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.UNBOUNDED_IN)
    public final <C> b<C> b(@f s<? extends C> sVar, @f m3.b<? super C, ? super T> bVar) {
        Objects.requireNonNull(sVar, "collectionSupplier is null");
        Objects.requireNonNull(bVar, "collector is null");
        return io.reactivex.rxjava3.plugins.a.V(new io.reactivex.rxjava3.internal.operators.parallel.a(this, sVar, bVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b0(@f org.reactivestreams.p<?>[] pVarArr) {
        Objects.requireNonNull(pVarArr, "subscribers is null");
        int M = M();
        if (pVarArr.length != M) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("parallelism = " + M + ", subscribers = " + pVarArr.length);
            int length = pVarArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                g.error(illegalArgumentException, pVarArr[i5]);
            }
            return false;
        }
        return true;
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final <U> b<U> c(@f d<T, U> dVar) {
        Objects.requireNonNull(dVar, "composer is null");
        return io.reactivex.rxjava3.plugins.a.V(dVar.a(this));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final <R> b<R> d(@f m3.o<? super T, ? extends o<? extends R>> oVar) {
        return e(oVar, 2);
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final <R> b<R> e(@f m3.o<? super T, ? extends o<? extends R>> oVar, int i5) {
        Objects.requireNonNull(oVar, "mapper is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "prefetch");
        return io.reactivex.rxjava3.plugins.a.V(new io.reactivex.rxjava3.internal.operators.parallel.b(this, oVar, i5, io.reactivex.rxjava3.internal.util.j.IMMEDIATE));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final <R> b<R> f(@f m3.o<? super T, ? extends o<? extends R>> oVar, int i5, boolean z4) {
        io.reactivex.rxjava3.internal.util.j jVar;
        Objects.requireNonNull(oVar, "mapper is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "prefetch");
        if (z4) {
            jVar = io.reactivex.rxjava3.internal.util.j.END;
        } else {
            jVar = io.reactivex.rxjava3.internal.util.j.BOUNDARY;
        }
        return io.reactivex.rxjava3.plugins.a.V(new io.reactivex.rxjava3.internal.operators.parallel.b(this, oVar, i5, jVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final <R> b<R> g(@f m3.o<? super T, ? extends o<? extends R>> oVar, boolean z4) {
        return f(oVar, 2, z4);
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> h(@f m3.g<? super T> gVar) {
        Objects.requireNonNull(gVar, "onAfterNext is null");
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return io.reactivex.rxjava3.plugins.a.V(new m(this, h5, gVar, h6, aVar, aVar, io.reactivex.rxjava3.internal.functions.a.h(), io.reactivex.rxjava3.internal.functions.a.f16255g, aVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> i(@f m3.a aVar) {
        Objects.requireNonNull(aVar, "onAfterTerminate is null");
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h7 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar2 = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return io.reactivex.rxjava3.plugins.a.V(new m(this, h5, h6, h7, aVar2, aVar, io.reactivex.rxjava3.internal.functions.a.h(), io.reactivex.rxjava3.internal.functions.a.f16255g, aVar2));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> j(@f m3.a aVar) {
        Objects.requireNonNull(aVar, "onCancel is null");
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h7 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar2 = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return io.reactivex.rxjava3.plugins.a.V(new m(this, h5, h6, h7, aVar2, aVar2, io.reactivex.rxjava3.internal.functions.a.h(), io.reactivex.rxjava3.internal.functions.a.f16255g, aVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> k(@f m3.a aVar) {
        Objects.requireNonNull(aVar, "onComplete is null");
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h7 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar2 = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return io.reactivex.rxjava3.plugins.a.V(new m(this, h5, h6, h7, aVar, aVar2, io.reactivex.rxjava3.internal.functions.a.h(), io.reactivex.rxjava3.internal.functions.a.f16255g, aVar2));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> l(@f m3.g<? super Throwable> gVar) {
        Objects.requireNonNull(gVar, "onError is null");
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return io.reactivex.rxjava3.plugins.a.V(new m(this, h5, h6, gVar, aVar, aVar, io.reactivex.rxjava3.internal.functions.a.h(), io.reactivex.rxjava3.internal.functions.a.f16255g, aVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> m(@f m3.g<? super T> gVar) {
        Objects.requireNonNull(gVar, "onNext is null");
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return io.reactivex.rxjava3.plugins.a.V(new m(this, gVar, h5, h6, aVar, aVar, io.reactivex.rxjava3.internal.functions.a.h(), io.reactivex.rxjava3.internal.functions.a.f16255g, aVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> n(@f m3.g<? super T> gVar, @f a aVar) {
        Objects.requireNonNull(gVar, "onNext is null");
        Objects.requireNonNull(aVar, "errorHandler is null");
        return io.reactivex.rxjava3.plugins.a.V(new io.reactivex.rxjava3.internal.operators.parallel.c(this, gVar, aVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> o(@f m3.g<? super T> gVar, @f m3.c<? super Long, ? super Throwable, a> cVar) {
        Objects.requireNonNull(gVar, "onNext is null");
        Objects.requireNonNull(cVar, "errorHandler is null");
        return io.reactivex.rxjava3.plugins.a.V(new io.reactivex.rxjava3.internal.operators.parallel.c(this, gVar, cVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> p(@f m3.q qVar) {
        Objects.requireNonNull(qVar, "onRequest is null");
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h7 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return io.reactivex.rxjava3.plugins.a.V(new m(this, h5, h6, h7, aVar, aVar, io.reactivex.rxjava3.internal.functions.a.h(), qVar, aVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> q(@f m3.g<? super org.reactivestreams.q> gVar) {
        Objects.requireNonNull(gVar, "onSubscribe is null");
        m3.g h5 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h6 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.g h7 = io.reactivex.rxjava3.internal.functions.a.h();
        m3.a aVar = io.reactivex.rxjava3.internal.functions.a.f16251c;
        return io.reactivex.rxjava3.plugins.a.V(new m(this, h5, h6, h7, aVar, aVar, gVar, io.reactivex.rxjava3.internal.functions.a.f16255g, aVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> r(@f r<? super T> rVar) {
        Objects.requireNonNull(rVar, "predicate is null");
        return io.reactivex.rxjava3.plugins.a.V(new io.reactivex.rxjava3.internal.operators.parallel.d(this, rVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> s(@f r<? super T> rVar, @f a aVar) {
        Objects.requireNonNull(rVar, "predicate is null");
        Objects.requireNonNull(aVar, "errorHandler is null");
        return io.reactivex.rxjava3.plugins.a.V(new e(this, rVar, aVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final b<T> t(@f r<? super T> rVar, @f m3.c<? super Long, ? super Throwable, a> cVar) {
        Objects.requireNonNull(rVar, "predicate is null");
        Objects.requireNonNull(cVar, "errorHandler is null");
        return io.reactivex.rxjava3.plugins.a.V(new e(this, rVar, cVar));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final <R> b<R> u(@f m3.o<? super T, ? extends o<? extends R>> oVar) {
        return x(oVar, false, io.reactivex.rxjava3.core.o.c0(), io.reactivex.rxjava3.core.o.c0());
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final <R> b<R> v(@f m3.o<? super T, ? extends o<? extends R>> oVar, boolean z4) {
        return x(oVar, z4, io.reactivex.rxjava3.core.o.c0(), io.reactivex.rxjava3.core.o.c0());
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final <R> b<R> w(@f m3.o<? super T, ? extends o<? extends R>> oVar, boolean z4, int i5) {
        return x(oVar, z4, i5, io.reactivex.rxjava3.core.o.c0());
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final <R> b<R> x(@f m3.o<? super T, ? extends o<? extends R>> oVar, boolean z4, int i5, int i6) {
        Objects.requireNonNull(oVar, "mapper is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "maxConcurrency");
        io.reactivex.rxjava3.internal.functions.b.b(i6, "prefetch");
        return io.reactivex.rxjava3.plugins.a.V(new io.reactivex.rxjava3.internal.operators.parallel.f(this, oVar, z4, i5, i6));
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final <U> b<U> y(@f m3.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return z(oVar, io.reactivex.rxjava3.core.o.c0());
    }

    @l3.d
    @f
    @h("none")
    @l3.b(l3.a.FULL)
    public final <U> b<U> z(@f m3.o<? super T, ? extends Iterable<? extends U>> oVar, int i5) {
        Objects.requireNonNull(oVar, "mapper is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "bufferSize");
        return io.reactivex.rxjava3.plugins.a.V(new io.reactivex.rxjava3.internal.operators.parallel.g(this, oVar, i5));
    }
}
