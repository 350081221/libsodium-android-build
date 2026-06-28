package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlinx.coroutines.l2;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H'R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/a1;", "T", "Lkotlinx/coroutines/l2;", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "", "q", "Lkotlinx/coroutines/selects/g;", "a0", "()Lkotlinx/coroutines/selects/g;", "onAwait", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface a1<T> extends l2 {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static <T, R> R b(@p4.l a1<? extends T> a1Var, R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) l2.a.d(a1Var, r5, pVar);
        }

        @p4.m
        public static <T, E extends g.b> E c(@p4.l a1<? extends T> a1Var, @p4.l g.c<E> cVar) {
            return (E) l2.a.e(a1Var, cVar);
        }

        @p4.l
        public static <T> kotlin.coroutines.g d(@p4.l a1<? extends T> a1Var, @p4.l g.c<?> cVar) {
            return l2.a.h(a1Var, cVar);
        }

        @p4.l
        public static <T> kotlin.coroutines.g e(@p4.l a1<? extends T> a1Var, @p4.l kotlin.coroutines.g gVar) {
            return l2.a.i(a1Var, gVar);
        }

        @p4.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> l2 f(@p4.l a1<? extends T> a1Var, @p4.l l2 l2Var) {
            return l2.a.j(a1Var, l2Var);
        }
    }

    @p4.l
    kotlinx.coroutines.selects.g<T> a0();

    @p4.m
    Object b(@p4.l kotlin.coroutines.d<? super T> dVar);

    @a2
    T j();

    @a2
    @p4.m
    Throwable q();
}
