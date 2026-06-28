package kotlinx.coroutines;

import kotlin.coroutines.g;

@kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/n3;", "S", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "updateThreadContext", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "oldState", "Lkotlin/r2;", "restoreThreadContext", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface n3<S> extends g.b {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static <S, R> R a(@p4.l n3<S> n3Var, R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(n3Var, r5, pVar);
        }

        @p4.m
        public static <S, E extends g.b> E b(@p4.l n3<S> n3Var, @p4.l g.c<E> cVar) {
            return (E) g.b.a.b(n3Var, cVar);
        }

        @p4.l
        public static <S> kotlin.coroutines.g c(@p4.l n3<S> n3Var, @p4.l g.c<?> cVar) {
            return g.b.a.c(n3Var, cVar);
        }

        @p4.l
        public static <S> kotlin.coroutines.g d(@p4.l n3<S> n3Var, @p4.l kotlin.coroutines.g gVar) {
            return g.b.a.d(n3Var, gVar);
        }
    }

    void restoreThreadContext(@p4.l kotlin.coroutines.g gVar, S s5);

    S updateThreadContext(@p4.l kotlin.coroutines.g gVar);
}
