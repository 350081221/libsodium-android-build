package kotlinx.coroutines;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/c1;", "", "", CrashHianalyticsData.TIME, "Lkotlin/r2;", "p0", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "timeMillis", "Lkotlinx/coroutines/p;", "continuation", bi.aA, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlinx/coroutines/n1;", "I", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@g2
/* loaded from: classes4.dex */
public interface c1 {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n*L\n30#1:163,11\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a {
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @p4.m
        public static Object a(@p4.l c1 c1Var, long j5, @p4.l kotlin.coroutines.d<? super kotlin.r2> dVar) {
            kotlin.coroutines.d e5;
            Object l5;
            Object l6;
            if (j5 <= 0) {
                return kotlin.r2.f19517a;
            }
            e5 = kotlin.coroutines.intrinsics.c.e(dVar);
            q qVar = new q(e5, 1);
            qVar.B();
            c1Var.p(j5, qVar);
            Object E = qVar.E();
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (E == l5) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            l6 = kotlin.coroutines.intrinsics.d.l();
            if (E == l6) {
                return E;
            }
            return kotlin.r2.f19517a;
        }

        @p4.l
        public static n1 b(@p4.l c1 c1Var, long j5, @p4.l Runnable runnable, @p4.l kotlin.coroutines.g gVar) {
            return z0.a().I(j5, runnable, gVar);
        }
    }

    @p4.l
    n1 I(long j5, @p4.l Runnable runnable, @p4.l kotlin.coroutines.g gVar);

    void p(long j5, @p4.l p<? super kotlin.r2> pVar);

    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @p4.m
    Object p0(long j5, @p4.l kotlin.coroutines.d<? super kotlin.r2> dVar);
}
