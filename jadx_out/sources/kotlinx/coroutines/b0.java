package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlinx.coroutines.l2;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/b0;", "Lkotlinx/coroutines/l2;", "", "complete", "", "exception", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface b0 extends l2 {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static <R> R b(@p4.l b0 b0Var, R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) l2.a.d(b0Var, r5, pVar);
        }

        @p4.m
        public static <E extends g.b> E c(@p4.l b0 b0Var, @p4.l g.c<E> cVar) {
            return (E) l2.a.e(b0Var, cVar);
        }

        @p4.l
        public static kotlin.coroutines.g d(@p4.l b0 b0Var, @p4.l g.c<?> cVar) {
            return l2.a.h(b0Var, cVar);
        }

        @p4.l
        public static kotlin.coroutines.g e(@p4.l b0 b0Var, @p4.l kotlin.coroutines.g gVar) {
            return l2.a.i(b0Var, gVar);
        }

        @p4.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static l2 f(@p4.l b0 b0Var, @p4.l l2 l2Var) {
            return l2.a.j(b0Var, l2Var);
        }
    }

    boolean c(@p4.l Throwable th);

    boolean complete();
}
