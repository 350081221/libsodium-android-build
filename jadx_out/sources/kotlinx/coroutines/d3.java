package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import kotlinx.coroutines.l2;

@kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/d3;", "Lkotlinx/coroutines/l2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "P", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.k(level = kotlin.m.ERROR, message = "This is internal API and may be removed in the future releases")
@g2
/* loaded from: classes4.dex */
public interface d3 extends l2 {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static <R> R b(@p4.l d3 d3Var, R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) l2.a.d(d3Var, r5, pVar);
        }

        @p4.m
        public static <E extends g.b> E c(@p4.l d3 d3Var, @p4.l g.c<E> cVar) {
            return (E) l2.a.e(d3Var, cVar);
        }

        @p4.l
        public static kotlin.coroutines.g d(@p4.l d3 d3Var, @p4.l g.c<?> cVar) {
            return l2.a.h(d3Var, cVar);
        }

        @p4.l
        public static kotlin.coroutines.g e(@p4.l d3 d3Var, @p4.l kotlin.coroutines.g gVar) {
            return l2.a.i(d3Var, gVar);
        }

        @p4.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static l2 f(@p4.l d3 d3Var, @p4.l l2 l2Var) {
            return l2.a.j(d3Var, l2Var);
        }
    }

    @p4.l
    @g2
    CancellationException P();
}
