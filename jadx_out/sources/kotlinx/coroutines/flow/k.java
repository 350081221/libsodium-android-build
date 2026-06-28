package kotlinx.coroutines.flow;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.a1;
import kotlin.b1;
import kotlin.r2;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.l2;

@kotlin.i0(d1 = {"kotlinx/coroutines/flow/l", "kotlinx/coroutines/flow/m", "kotlinx/coroutines/flow/n", "kotlinx/coroutines/flow/o", "kotlinx/coroutines/flow/p", "kotlinx/coroutines/flow/q", "kotlinx/coroutines/flow/r", "kotlinx/coroutines/flow/s", "kotlinx/coroutines/flow/t", "kotlinx/coroutines/flow/u", "kotlinx/coroutines/flow/v", "kotlinx/coroutines/flow/w", "kotlinx/coroutines/flow/x", "kotlinx/coroutines/flow/y", "kotlinx/coroutines/flow/z", "kotlinx/coroutines/flow/a0", "kotlinx/coroutines/flow/b0"}, d2 = {}, k = 4, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final String f20164a = "kotlinx.coroutines.flow.defaultConcurrency";

    @p4.m
    public static final <T> Object A(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return n.f(iVar, pVar, dVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @b1(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> A0(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return x.l(iVar, pVar);
    }

    @p4.l
    public static final <T> i<T> A1(@p4.l i<? extends T> iVar, @p4.l v3.q<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar) {
        return a0.j(iVar, qVar);
    }

    @p4.m
    public static final <T> Object B(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return v.b(iVar, pVar, dVar);
    }

    @p4.l
    @a2
    public static final <T, R> i<R> B0(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.a(iVar, pVar);
    }

    @p4.l
    @b2
    public static final <T> i<T> B1(@p4.l i<? extends T> iVar, long j5) {
        return r.h(iVar, j5);
    }

    @p4.l
    @a2
    public static final <T, R> i<R> C0(@p4.l i<? extends T> iVar, @kotlin.b @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.b(iVar, pVar);
    }

    @p4.l
    @b2
    public static final <T> i<T> C1(@p4.l i<? extends T> iVar, long j5) {
        return r.i(iVar, j5);
    }

    @p4.l
    public static final <T1, T2, T3, T4, T5, R> i<R> D(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l i<? extends T3> iVar3, @p4.l i<? extends T4> iVar4, @p4.l i<? extends T5> iVar5, @p4.l v3.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super R>, ? extends Object> tVar) {
        return b0.c(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @p4.l
    @a2
    public static final <T, R> i<R> D0(@p4.l i<? extends T> iVar, int i5, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.c(iVar, i5, pVar);
    }

    @p4.l
    public static final <T, R> i<R> D1(@p4.l i<? extends T> iVar, R r5, @kotlin.b @p4.l v3.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return a0.k(iVar, r5, qVar);
    }

    @p4.l
    public static final <T1, T2, T3, T4, R> i<R> E(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l i<? extends T3> iVar3, @p4.l i<? extends T4> iVar4, @p4.l v3.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super R>, ? extends Object> sVar) {
        return b0.d(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @b1(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> i<R> E1(@p4.l i<? extends T> iVar, R r5, @kotlin.b @p4.l v3.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return x.B(iVar, r5, qVar);
    }

    @p4.l
    public static final <T1, T2, T3, R> i<R> F(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l i<? extends T3> iVar3, @kotlin.b @p4.l v3.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super R>, ? extends Object> rVar) {
        return b0.e(iVar, iVar2, iVar3, rVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @b1(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> F0(@p4.l i<? extends i<? extends T>> iVar) {
        return x.m(iVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @b1(expression = "runningReduce(operation)", imports = {}))
    public static final <T> i<T> F1(@p4.l i<? extends T> iVar, @p4.l v3.q<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar) {
        return x.C(iVar, qVar);
    }

    @p4.l
    public static final <T1, T2, R> i<R> G(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return b0.f(iVar, iVar2, qVar);
    }

    @p4.l
    @a2
    public static final <T> i<T> G0(@p4.l i<? extends i<? extends T>> iVar) {
        return w.e(iVar);
    }

    @p4.l
    public static final <T> i0<T> G1(@p4.l i<? extends T> iVar, @p4.l kotlinx.coroutines.s0 s0Var, @p4.l o0 o0Var, int i5) {
        return z.g(iVar, s0Var, o0Var, i5);
    }

    @p4.l
    @a2
    public static final <T> i<T> H0(@p4.l i<? extends i<? extends T>> iVar, int i5) {
        return w.f(iVar, i5);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> i<R> I(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l i<? extends T3> iVar3, @p4.l i<? extends T4> iVar4, @p4.l i<? extends T5> iVar5, @p4.l v3.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super R>, ? extends Object> tVar) {
        return x.b(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @p4.m
    public static final <T> Object I1(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        return y.j(iVar, dVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> i<R> J(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l i<? extends T3> iVar3, @p4.l i<? extends T4> iVar4, @p4.l v3.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super R>, ? extends Object> sVar) {
        return x.c(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @p4.l
    public static final <T> i<T> J0(@kotlin.b @p4.l v3.p<? super j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return l.n(pVar);
    }

    @p4.m
    public static final <T> Object J1(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        return y.k(iVar, dVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> i<R> K(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l i<? extends T3> iVar3, @p4.l v3.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super R>, ? extends Object> rVar) {
        return x.d(iVar, iVar2, iVar3, rVar);
    }

    @p4.l
    @u3.h(name = "flowCombine")
    public static final <T1, T2, R> i<R> K0(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return b0.p(iVar, iVar2, qVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @b1(expression = "drop(count)", imports = {}))
    public static final <T> i<T> K1(@p4.l i<? extends T> iVar, int i5) {
        return x.D(iVar, i5);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> i<R> L(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return x.e(iVar, iVar2, qVar);
    }

    @p4.l
    @u3.h(name = "flowCombineTransform")
    public static final <T1, T2, R> i<R> L0(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @kotlin.b @p4.l v3.r<? super j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super r2>, ? extends Object> rVar) {
        return b0.q(iVar, iVar2, rVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @b1(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> i<T> L1(@p4.l i<? extends T> iVar, T t5) {
        return x.E(iVar, t5);
    }

    @p4.l
    public static final <T> i<T> M0(T t5) {
        return l.o(t5);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @b1(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> i<T> M1(@p4.l i<? extends T> iVar, @p4.l i<? extends T> iVar2) {
        return x.F(iVar, iVar2);
    }

    @p4.l
    public static final <T1, T2, T3, T4, T5, R> i<R> N(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l i<? extends T3> iVar3, @p4.l i<? extends T4> iVar4, @p4.l i<? extends T5> iVar5, @kotlin.b @p4.l v3.u<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super r2>, ? extends Object> uVar) {
        return b0.i(iVar, iVar2, iVar3, iVar4, iVar5, uVar);
    }

    @p4.l
    public static final <T> i<T> N0(@p4.l T... tArr) {
        return l.p(tArr);
    }

    @p4.m
    public static final <T> Object N1(@p4.l i<? extends T> iVar, @p4.l kotlinx.coroutines.s0 s0Var, @p4.l kotlin.coroutines.d<? super t0<? extends T>> dVar) {
        return z.i(iVar, s0Var, dVar);
    }

    @p4.l
    public static final <T1, T2, T3, T4, R> i<R> O(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l i<? extends T3> iVar3, @p4.l i<? extends T4> iVar4, @kotlin.b @p4.l v3.t<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super r2>, ? extends Object> tVar) {
        return b0.j(iVar, iVar2, iVar3, iVar4, tVar);
    }

    @p4.l
    public static final <T> i<T> O0(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.g gVar) {
        return p.h(iVar, gVar);
    }

    @p4.l
    public static final <T> t0<T> O1(@p4.l i<? extends T> iVar, @p4.l kotlinx.coroutines.s0 s0Var, @p4.l o0 o0Var, T t5) {
        return z.j(iVar, s0Var, o0Var, t5);
    }

    @p4.l
    public static final <T1, T2, T3, R> i<R> P(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l i<? extends T3> iVar3, @kotlin.b @p4.l v3.s<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super r2>, ? extends Object> sVar) {
        return b0.k(iVar, iVar2, iVar3, sVar);
    }

    @p4.m
    public static final <T, R> Object P0(@p4.l i<? extends T> iVar, R r5, @p4.l v3.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, @p4.l kotlin.coroutines.d<? super R> dVar) {
        return y.e(iVar, r5, qVar, dVar);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void P1(@p4.l i<? extends T> iVar) {
        x.G(iVar);
    }

    @p4.l
    public static final <T1, T2, R> i<R> Q(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @kotlin.b @p4.l v3.r<? super j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super r2>, ? extends Object> rVar) {
        return b0.l(iVar, iVar2, rVar);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @b1(expression = "collect(action)", imports = {}))
    public static final <T> void Q0(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        x.n(iVar, pVar);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Q1(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        x.H(iVar, pVar);
    }

    public static final int R0() {
        return w.h();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void R1(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, @p4.l v3.p<? super Throwable, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar2) {
        x.I(iVar, pVar, pVar2);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @b1(expression = "let(transformer)", imports = {}))
    public static final <T, R> i<R> S(@p4.l i<? extends T> iVar, @p4.l v3.l<? super i<? extends T>, ? extends i<? extends R>> lVar) {
        return x.f(iVar, lVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'flowOn' instead")
    public static final <T> i<T> S1(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.g gVar) {
        return x.J(iVar, gVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @b1(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> T(@p4.l i<? extends T> iVar, @p4.l v3.l<? super T, ? extends i<? extends R>> lVar) {
        return x.g(iVar, lVar);
    }

    @p4.m
    public static final <T> Object T0(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        return y.g(iVar, dVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @b1(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> i<R> T1(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return x.K(iVar, pVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @b1(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> i<T> U(@p4.l i<? extends T> iVar, T t5) {
        return x.h(iVar, t5);
    }

    @p4.m
    public static final <T> Object U0(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        return y.h(iVar, dVar);
    }

    @p4.l
    public static final <T> i<T> U1(@p4.l i<? extends T> iVar, int i5) {
        return v.g(iVar, i5);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @b1(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> i<T> V(@p4.l i<? extends T> iVar, @p4.l i<? extends T> iVar2) {
        return x.i(iVar, iVar2);
    }

    @p4.l
    public static final <T> l2 V0(@p4.l i<? extends T> iVar, @p4.l kotlinx.coroutines.s0 s0Var) {
        return n.h(iVar, s0Var);
    }

    @p4.l
    public static final <T> i<T> V1(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return v.h(iVar, pVar);
    }

    @p4.l
    public static final <T> i<T> W(@p4.l i<? extends T> iVar) {
        return p.g(iVar);
    }

    @p4.l
    public static final <T, R> i<R> W0(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return a0.f(iVar, pVar);
    }

    @p4.l
    @b2
    public static final <T> i<T> W1(@p4.l i<? extends T> iVar, long j5) {
        return r.j(iVar, j5);
    }

    @p4.l
    public static final <T> i<T> X(@p4.l kotlinx.coroutines.channels.g0<? extends T> g0Var) {
        return m.c(g0Var);
    }

    @p4.l
    @a2
    public static final <T, R> i<R> X0(@p4.l i<? extends T> iVar, @kotlin.b @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return w.k(iVar, pVar);
    }

    @p4.m
    public static final <T, C extends Collection<? super T>> Object X1(@p4.l i<? extends T> iVar, @p4.l C c5, @p4.l kotlin.coroutines.d<? super C> dVar) {
        return o.a(iVar, c5, dVar);
    }

    @p4.m
    public static final <T> Object Y(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.d<? super Integer> dVar) {
        return q.a(iVar, dVar);
    }

    @p4.l
    public static final <T, R> i<R> Y0(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return a0.g(iVar, pVar);
    }

    @p4.m
    public static final <T> Object Y1(@p4.l i<? extends T> iVar, @p4.l List<T> list, @p4.l kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return o.b(iVar, list, dVar);
    }

    @p4.m
    public static final <T> Object Z(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, @p4.l kotlin.coroutines.d<? super Integer> dVar) {
        return q.b(iVar, pVar, dVar);
    }

    @p4.l
    public static final <T> i<T> Z0(@p4.l Iterable<? extends i<? extends T>> iterable) {
        return w.l(iterable);
    }

    @p4.l
    public static final <T> i<T> a(@p4.l Iterable<? extends T> iterable) {
        return l.a(iterable);
    }

    @p4.l
    @b2
    public static final <T> i<T> a0(@p4.l i<? extends T> iVar, long j5) {
        return r.a(iVar, j5);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @b1(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> a1(@p4.l i<? extends i<? extends T>> iVar) {
        return x.o(iVar);
    }

    @p4.m
    public static final <T> Object a2(@p4.l i<? extends T> iVar, @p4.l Set<T> set, @p4.l kotlin.coroutines.d<? super Set<? extends T>> dVar) {
        return o.d(iVar, set, dVar);
    }

    @p4.l
    public static final <T> i<T> b(@p4.l Iterator<? extends T> it) {
        return l.b(it);
    }

    @p4.l
    @b2
    @kotlin.t0
    public static final <T> i<T> b0(@p4.l i<? extends T> iVar, @p4.l v3.l<? super T, Long> lVar) {
        return r.b(iVar, lVar);
    }

    @p4.l
    public static final <T> i<T> b1(@p4.l i<? extends T>... iVarArr) {
        return w.m(iVarArr);
    }

    @p4.l
    public static final i<Integer> c(@p4.l kotlin.ranges.l lVar) {
        return l.c(lVar);
    }

    @p4.l
    @b2
    public static final <T> i<T> c0(@p4.l i<? extends T> iVar, long j5) {
        return r.c(iVar, j5);
    }

    @p4.l
    public static final Void c1() {
        return x.p();
    }

    @p4.l
    public static final <T, R> i<R> c2(@p4.l i<? extends T> iVar, @kotlin.b @p4.l v3.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        return t.g(iVar, qVar);
    }

    @p4.l
    public static final i<Long> d(@p4.l kotlin.ranges.o oVar) {
        return l.d(oVar);
    }

    @u3.h(name = "debounceDuration")
    @kotlin.t0
    @p4.l
    @b2
    public static final <T> i<T> d0(@p4.l i<? extends T> iVar, @p4.l v3.l<? super T, kotlin.time.e> lVar) {
        return r.d(iVar, lVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> i<T> d1(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.g gVar) {
        return x.q(iVar, gVar);
    }

    @p4.l
    @a2
    public static final <T, R> i<R> d2(@p4.l i<? extends T> iVar, @kotlin.b @p4.l v3.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        return w.n(iVar, qVar);
    }

    @p4.l
    public static final <T> i<T> e(@p4.l kotlin.sequences.m<? extends T> mVar) {
        return l.e(mVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @b1(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> e0(@p4.l i<? extends T> iVar, long j5) {
        return x.j(iVar, j5);
    }

    @p4.l
    public static final <T> i<T> e1(@p4.l i<? extends T> iVar, @p4.l v3.q<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        return t.d(iVar, qVar);
    }

    @p4.l
    public static final <T, R> i<R> e2(@p4.l i<? extends T> iVar, @kotlin.b @p4.l v3.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> qVar) {
        return v.i(iVar, qVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> i<T> f(@p4.l kotlinx.coroutines.channels.d<T> dVar) {
        return m.b(dVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @b1(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> f0(@p4.l i<? extends T> iVar, long j5) {
        return x.k(iVar, j5);
    }

    @p4.l
    public static final <T> i<T> f1(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return a0.h(iVar, pVar);
    }

    @p4.l
    @a1
    public static final <T, R> i<R> f2(@p4.l i<? extends T> iVar, @kotlin.b @p4.l v3.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        return t.h(iVar, qVar);
    }

    @p4.l
    public static final <T> i<T> g(@p4.l v3.a<? extends T> aVar) {
        return l.f(aVar);
    }

    @p4.l
    public static final <T> i<T> g0(@p4.l i<? extends T> iVar) {
        return s.a(iVar);
    }

    @p4.l
    public static final <T> i<T> g1(@p4.l i<? extends T> iVar, @p4.l v3.p<? super j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return t.e(iVar, pVar);
    }

    @p4.l
    public static final <T> i<kotlin.collections.p0<T>> g2(@p4.l i<? extends T> iVar) {
        return a0.l(iVar);
    }

    @p4.l
    public static final <T> i<T> h(@p4.l v3.l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar) {
        return l.g(lVar);
    }

    @p4.l
    public static final <T> i<T> h0(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super T, Boolean> pVar) {
        return s.b(iVar, pVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @b1(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> h1(@p4.l i<? extends T> iVar, @p4.l i<? extends T> iVar2) {
        return x.r(iVar, iVar2);
    }

    @p4.l
    public static final <T1, T2, R> i<R> h2(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return b0.s(iVar, iVar2, qVar);
    }

    @p4.l
    public static final i<Integer> i(@p4.l int[] iArr) {
        return l.h(iArr);
    }

    @p4.l
    public static final <T, K> i<T> i0(@p4.l i<? extends T> iVar, @p4.l v3.l<? super T, ? extends K> lVar) {
        return s.c(iVar, lVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @b1(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> i1(@p4.l i<? extends T> iVar, @p4.l i<? extends T> iVar2) {
        return x.s(iVar, iVar2);
    }

    @p4.l
    public static final i<Long> j(@p4.l long[] jArr) {
        return l.i(jArr);
    }

    @p4.l
    public static final <T> i<T> j0(@p4.l i<? extends T> iVar, int i5) {
        return v.d(iVar, i5);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @b1(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> i<T> j1(@p4.l i<? extends T> iVar, T t5) {
        return x.t(iVar, t5);
    }

    @p4.l
    public static final <T> i<T> k(@p4.l T[] tArr) {
        return l.j(tArr);
    }

    @p4.l
    public static final <T> i<T> k0(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return v.e(iVar, pVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @b1(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> i<T> k1(@p4.l i<? extends T> iVar, T t5, @p4.l v3.l<? super Throwable, Boolean> lVar) {
        return x.u(iVar, t5, lVar);
    }

    @p4.l
    public static final <T> i0<T> l(@p4.l d0<T> d0Var) {
        return z.a(d0Var);
    }

    @p4.m
    public static final <T> Object l0(@p4.l j<? super T> jVar, @p4.l kotlinx.coroutines.channels.g0<? extends T> g0Var, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return m.d(jVar, g0Var, dVar);
    }

    @p4.l
    public static final <T> t0<T> m(@p4.l e0<T> e0Var) {
        return z.b(e0Var);
    }

    @p4.m
    public static final <T> Object m0(@p4.l j<? super T> jVar, @p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return n.g(jVar, iVar, dVar);
    }

    @p4.l
    public static final <T> i<T> m1(@p4.l i<? extends T> iVar, @p4.l v3.p<? super j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return t.f(iVar, pVar);
    }

    @p4.l
    public static final <T> i<T> n0() {
        return l.m();
    }

    @p4.l
    public static final <T> i0<T> n1(@p4.l i0<? extends T> i0Var, @p4.l v3.p<? super j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return z.f(i0Var, pVar);
    }

    @p4.l
    public static final <T> i<T> o(@p4.l i<? extends T> iVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar2) {
        return p.b(iVar, i5, iVar2);
    }

    public static final void o0(@p4.l j<?> jVar) {
        t.b(jVar);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.channels.g0<T> o1(@p4.l i<? extends T> iVar, @p4.l kotlinx.coroutines.s0 s0Var) {
        return m.f(iVar, s0Var);
    }

    @p4.l
    public static final <T> i<T> p0(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return a0.a(iVar, pVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> p1(@p4.l i<? extends T> iVar) {
        return x.w(iVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> q1(@p4.l i<? extends T> iVar, int i5) {
        return x.x(iVar, i5);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @b1(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> i<T> r(@p4.l i<? extends T> iVar) {
        return x.a(iVar);
    }

    @p4.l
    public static final <R> i<R> r0(@p4.l i<?> iVar, @p4.l kotlin.reflect.d<R> dVar) {
        return a0.c(iVar, dVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> i<T> r1(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.g gVar) {
        return x.y(iVar, gVar);
    }

    @p4.l
    public static final <T> i<T> s(@kotlin.b @p4.l v3.p<? super kotlinx.coroutines.channels.e0<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return l.k(pVar);
    }

    @p4.l
    public static final <T> i<T> s0(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return a0.d(iVar, pVar);
    }

    @p4.l
    public static final <T> i<T> s1(@p4.l kotlinx.coroutines.channels.g0<? extends T> g0Var) {
        return m.g(g0Var);
    }

    @p4.l
    public static final <T> i<T> t(@p4.l i<? extends T> iVar) {
        return p.e(iVar);
    }

    @p4.l
    public static final <T> i<T> t0(@p4.l i<? extends T> iVar) {
        return a0.e(iVar);
    }

    @p4.m
    public static final <S, T extends S> Object t1(@p4.l i<? extends T> iVar, @p4.l v3.q<? super S, ? super T, ? super kotlin.coroutines.d<? super S>, ? extends Object> qVar, @p4.l kotlin.coroutines.d<? super S> dVar) {
        return y.i(iVar, qVar, dVar);
    }

    @p4.l
    public static final <T> i<T> u(@p4.l i<? extends T> iVar, @p4.l v3.q<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        return u.a(iVar, qVar);
    }

    @p4.m
    public static final <T> Object u0(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        return y.a(iVar, dVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> i<T> u1(@p4.l i<? extends T> iVar) {
        return x.z(iVar);
    }

    @p4.m
    public static final <T> Object v(@p4.l i<? extends T> iVar, @p4.l j<? super T> jVar, @p4.l kotlin.coroutines.d<? super Throwable> dVar) {
        return u.b(iVar, jVar, dVar);
    }

    @p4.m
    public static final <T> Object v0(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        return y.b(iVar, pVar, dVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> i<T> v1(@p4.l i<? extends T> iVar, int i5) {
        return x.A(iVar, i5);
    }

    @p4.l
    public static final <T> i<T> w(@kotlin.b @p4.l v3.p<? super kotlinx.coroutines.channels.e0<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return l.l(pVar);
    }

    @p4.m
    public static final <T> Object w0(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        return y.c(iVar, dVar);
    }

    @p4.l
    public static final <T> i<T> w1(@p4.l i<? extends T> iVar, long j5, @p4.l v3.p<? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return u.e(iVar, j5, pVar);
    }

    @p4.m
    public static final Object x(@p4.l i<?> iVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return n.a(iVar, dVar);
    }

    @p4.m
    public static final <T> Object x0(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        return y.d(iVar, pVar, dVar);
    }

    @p4.l
    public static final kotlinx.coroutines.channels.g0<r2> y0(@p4.l kotlinx.coroutines.s0 s0Var, long j5, long j6) {
        return r.f(s0Var, j5, j6);
    }

    @p4.l
    public static final <T> i<T> y1(@p4.l i<? extends T> iVar, @p4.l v3.r<? super j<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> rVar) {
        return u.g(iVar, rVar);
    }

    @p4.m
    public static final <T> Object z(@p4.l i<? extends T> iVar, @p4.l v3.q<? super Integer, ? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return n.d(iVar, qVar, dVar);
    }

    @p4.l
    public static final <T, R> i<R> z1(@p4.l i<? extends T> iVar, R r5, @kotlin.b @p4.l v3.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return a0.i(iVar, r5, qVar);
    }
}
