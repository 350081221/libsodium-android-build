package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlinx.coroutines.a1;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/y;", "T", "Lkotlinx/coroutines/a1;", t0.b.f22420d, "", "M", "(Ljava/lang/Object;)Z", "", "exception", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface y<T> extends a1<T> {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static <T, R> R b(@p4.l y<T> yVar, R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) a1.a.b(yVar, r5, pVar);
        }

        @p4.m
        public static <T, E extends g.b> E c(@p4.l y<T> yVar, @p4.l g.c<E> cVar) {
            return (E) a1.a.c(yVar, cVar);
        }

        @p4.l
        public static <T> kotlin.coroutines.g d(@p4.l y<T> yVar, @p4.l g.c<?> cVar) {
            return a1.a.d(yVar, cVar);
        }

        @p4.l
        public static <T> kotlin.coroutines.g e(@p4.l y<T> yVar, @p4.l kotlin.coroutines.g gVar) {
            return a1.a.e(yVar, gVar);
        }

        @p4.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> l2 f(@p4.l y<T> yVar, @p4.l l2 l2Var) {
            return a1.a.f(yVar, l2Var);
        }
    }

    boolean M(T t5);

    boolean c(@p4.l Throwable th);
}
