package kotlinx.coroutines.channels;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.a1;
import kotlin.r2;
import kotlin.u0;
import kotlinx.coroutines.c3;

@kotlin.i0(d1 = {"kotlinx/coroutines/channels/t", "kotlinx/coroutines/channels/u", "kotlinx/coroutines/channels/v"}, d2 = {}, k = 4, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final String f19945a = "Channel was closed";

    @p4.l
    @a1
    public static final <E, R> g0<R> J(@p4.l g0<? extends E> g0Var, @p4.l kotlin.coroutines.g gVar, @p4.l v3.p<? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return v.E(g0Var, gVar, pVar);
    }

    @p4.l
    @a1
    public static final <E, R> g0<R> L(@p4.l g0<? extends E> g0Var, @p4.l kotlin.coroutines.g gVar, @p4.l v3.q<? super Integer, ? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return v.G(g0Var, gVar, qVar);
    }

    @a1
    public static final void b(@p4.l g0<?> g0Var, @p4.m Throwable th) {
        u.a(g0Var, th);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @c3
    public static final <E, R> R c(@p4.l d<E> dVar, @p4.l v3.l<? super g0<? extends E>, ? extends R> lVar) {
        return (R) u.b(dVar, lVar);
    }

    public static final <E, R> R d(@p4.l g0<? extends E> g0Var, @p4.l v3.l<? super g0<? extends E>, ? extends R> lVar) {
        return (R) u.c(g0Var, lVar);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @p4.m
    public static final <E> Object e(@p4.l d<E> dVar, @p4.l v3.l<? super E, r2> lVar, @p4.l kotlin.coroutines.d<? super r2> dVar2) {
        return u.d(dVar, lVar, dVar2);
    }

    @a1
    @p4.m
    public static final <E, C extends h0<? super E>> Object e0(@p4.l g0<? extends E> g0Var, @p4.l C c5, @p4.l kotlin.coroutines.d<? super C> dVar) {
        return v.W(g0Var, c5, dVar);
    }

    @p4.m
    public static final <E> Object f(@p4.l g0<? extends E> g0Var, @p4.l v3.l<? super E, r2> lVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return u.e(g0Var, lVar, dVar);
    }

    @a1
    @p4.m
    public static final <E, C extends Collection<? super E>> Object f0(@p4.l g0<? extends E> g0Var, @p4.l C c5, @p4.l kotlin.coroutines.d<? super C> dVar) {
        return v.X(g0Var, c5, dVar);
    }

    @p4.l
    @a1
    public static final v3.l<Throwable, r2> g(@p4.l g0<?> g0Var) {
        return v.b(g0Var);
    }

    @p4.m
    public static final <E> Object g0(@p4.l g0<? extends E> g0Var, @p4.l kotlin.coroutines.d<? super List<? extends E>> dVar) {
        return u.j(g0Var, dVar);
    }

    @p4.l
    @a1
    public static final v3.l<Throwable, r2> h(@p4.l g0<?>... g0VarArr) {
        return v.c(g0VarArr);
    }

    @a1
    @p4.m
    public static final <K, V, M extends Map<? super K, ? super V>> Object h0(@p4.l g0<? extends u0<? extends K, ? extends V>> g0Var, @p4.l M m5, @p4.l kotlin.coroutines.d<? super M> dVar) {
        return v.Y(g0Var, m5, dVar);
    }

    @p4.l
    @a1
    public static final <E, K> g0<E> k(@p4.l g0<? extends E> g0Var, @p4.l kotlin.coroutines.g gVar, @p4.l v3.p<? super E, ? super kotlin.coroutines.d<? super K>, ? extends Object> pVar) {
        return v.f(g0Var, gVar, pVar);
    }

    @a1
    @p4.m
    public static final <E> Object k0(@p4.l g0<? extends E> g0Var, @p4.l kotlin.coroutines.d<? super Set<E>> dVar) {
        return v.b0(g0Var, dVar);
    }

    @p4.l
    public static final <E> Object m0(@p4.l h0<? super E> h0Var, E e5) {
        return t.b(h0Var, e5);
    }

    @p4.l
    @a1
    public static final <E, R, V> g0<V> q0(@p4.l g0<? extends E> g0Var, @p4.l g0<? extends R> g0Var2, @p4.l kotlin.coroutines.g gVar, @p4.l v3.p<? super E, ? super R, ? extends V> pVar) {
        return v.g0(g0Var, g0Var2, gVar, pVar);
    }

    @p4.l
    @a1
    public static final <E> g0<E> s(@p4.l g0<? extends E> g0Var, @p4.l kotlin.coroutines.g gVar, @p4.l v3.p<? super E, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return v.n(g0Var, gVar, pVar);
    }

    @p4.l
    @a1
    public static final <E> g0<E> y(@p4.l g0<? extends E> g0Var) {
        return v.t(g0Var);
    }
}
