package kotlinx.coroutines;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;

@kotlin.i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aO\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u001a\u001e\u0010\u0016\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015\u001a\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0000\u001a\u0013\u0010\u0018\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001b\u0010\u001f\u001a\u00020\u001a*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "m", "b", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", socket.g.f22386a, "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", bi.ay, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/r2;", "d", "", CrashHianalyticsData.MESSAGE, "", "c", "j", bi.aJ, "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "k", "(Lkotlinx/coroutines/s0;)Z", "isActive$annotations", "(Lkotlinx/coroutines/s0;)V", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class t0 {
    @p4.l
    public static final s0 a(@p4.l kotlin.coroutines.g gVar) {
        if (gVar.get(l2.U) == null) {
            gVar = gVar.plus(p2.c(null, 1, null));
        }
        return new kotlinx.coroutines.internal.g(gVar);
    }

    @p4.l
    public static final s0 b() {
        return new kotlinx.coroutines.internal.g(m3.c(null, 1, null).plus(k1.e()));
    }

    public static final void c(@p4.l s0 s0Var, @p4.l String str, @p4.m Throwable th) {
        d(s0Var, w1.a(str, th));
    }

    public static final void d(@p4.l s0 s0Var, @p4.m CancellationException cancellationException) {
        l2 l2Var = (l2) s0Var.getCoroutineContext().get(l2.U);
        if (l2Var != null) {
            l2Var.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + s0Var).toString());
    }

    public static /* synthetic */ void e(s0 s0Var, String str, Throwable th, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        c(s0Var, str, th);
    }

    public static /* synthetic */ void f(s0 s0Var, CancellationException cancellationException, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cancellationException = null;
        }
        d(s0Var, cancellationException);
    }

    @p4.m
    public static final <R> Object g(@p4.l v3.p<? super s0, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @p4.l kotlin.coroutines.d<? super R> dVar) {
        Object l5;
        kotlinx.coroutines.internal.p0 p0Var = new kotlinx.coroutines.internal.p0(dVar.getContext(), dVar);
        Object e5 = h4.b.e(p0Var, p0Var, pVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (e5 == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e5;
    }

    @p4.m
    public static final Object h(@p4.l kotlin.coroutines.d<? super kotlin.coroutines.g> dVar) {
        return dVar.getContext();
    }

    private static final Object i(kotlin.coroutines.d<? super kotlin.coroutines.g> dVar) {
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }

    public static final void j(@p4.l s0 s0Var) {
        p2.z(s0Var.getCoroutineContext());
    }

    public static final boolean k(@p4.l s0 s0Var) {
        l2 l2Var = (l2) s0Var.getCoroutineContext().get(l2.U);
        if (l2Var != null) {
            return l2Var.isActive();
        }
        return true;
    }

    public static /* synthetic */ void l(s0 s0Var) {
    }

    @p4.l
    public static final s0 m(@p4.l s0 s0Var, @p4.l kotlin.coroutines.g gVar) {
        return new kotlinx.coroutines.internal.g(s0Var.getCoroutineContext().plus(gVar));
    }
}
