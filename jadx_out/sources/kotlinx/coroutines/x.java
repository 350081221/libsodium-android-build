package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlinx.coroutines.l2;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/x;", "Lkotlinx/coroutines/l2;", "Lkotlinx/coroutines/d3;", "parentJob", "Lkotlin/r2;", "A", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.k(level = kotlin.m.ERROR, message = "This is internal API and may be removed in the future releases")
@g2
/* loaded from: classes4.dex */
public interface x extends l2 {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static <R> R b(@p4.l x xVar, R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) l2.a.d(xVar, r5, pVar);
        }

        @p4.m
        public static <E extends g.b> E c(@p4.l x xVar, @p4.l g.c<E> cVar) {
            return (E) l2.a.e(xVar, cVar);
        }

        @p4.l
        public static kotlin.coroutines.g d(@p4.l x xVar, @p4.l g.c<?> cVar) {
            return l2.a.h(xVar, cVar);
        }

        @p4.l
        public static kotlin.coroutines.g e(@p4.l x xVar, @p4.l kotlin.coroutines.g gVar) {
            return l2.a.i(xVar, gVar);
        }

        @p4.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static l2 f(@p4.l x xVar, @p4.l l2 l2Var) {
            return l2.a.j(xVar, l2Var);
        }
    }

    @g2
    void A(@p4.l d3 d3Var);
}
