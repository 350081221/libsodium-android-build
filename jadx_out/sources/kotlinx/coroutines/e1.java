package kotlinx.coroutines;

import kotlinx.coroutines.c1;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/e1;", "Lkotlinx/coroutines/c1;", "Lkotlin/time/e;", m0.a.Z, "", "O", "(J)Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@g2
/* loaded from: classes4.dex */
public interface e1 extends c1 {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @p4.m
        public static Object a(@p4.l e1 e1Var, long j5, @p4.l kotlin.coroutines.d<? super kotlin.r2> dVar) {
            Object l5;
            Object a5 = c1.a.a(e1Var, j5, dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            return a5 == l5 ? a5 : kotlin.r2.f19517a;
        }

        @p4.l
        public static n1 b(@p4.l e1 e1Var, long j5, @p4.l Runnable runnable, @p4.l kotlin.coroutines.g gVar) {
            return c1.a.b(e1Var, j5, runnable, gVar);
        }
    }

    @p4.l
    String O(long j5);
}
