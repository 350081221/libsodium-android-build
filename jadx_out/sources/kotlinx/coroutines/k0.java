package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlinx.coroutines.n3;

@kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/k0;", "S", "Lkotlinx/coroutines/n3;", "J", "Lkotlin/coroutines/g$b;", "overwritingElement", "Lkotlin/coroutines/g;", "m", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@f1
@a2
/* loaded from: classes4.dex */
public interface k0<S> extends n3<S> {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static <S, R> R a(@p4.l k0<S> k0Var, R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) n3.a.a(k0Var, r5, pVar);
        }

        @p4.m
        public static <S, E extends g.b> E b(@p4.l k0<S> k0Var, @p4.l g.c<E> cVar) {
            return (E) n3.a.b(k0Var, cVar);
        }

        @p4.l
        public static <S> kotlin.coroutines.g c(@p4.l k0<S> k0Var, @p4.l g.c<?> cVar) {
            return n3.a.c(k0Var, cVar);
        }

        @p4.l
        public static <S> kotlin.coroutines.g d(@p4.l k0<S> k0Var, @p4.l kotlin.coroutines.g gVar) {
            return n3.a.d(k0Var, gVar);
        }
    }

    @p4.l
    k0<S> J();

    @p4.l
    kotlin.coroutines.g m(@p4.l g.b bVar);
}
