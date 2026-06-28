package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import kotlin.d1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p3;
import kotlinx.coroutines.x3;

@kotlin.i0(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aW\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0000\u001a;\u0010\u0017\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0082\b\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"T", "Lkotlin/coroutines/d;", "Lkotlin/d1;", "result", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "cause", "Lkotlin/r2;", "onCancellation", "d", "(Lkotlin/coroutines/d;Ljava/lang/Object;Lv3/l;)V", "Lkotlinx/coroutines/internal/l;", "", "f", "", "contState", "", "mode", "doYield", "Lkotlin/Function0;", "block", "b", "Lkotlinx/coroutines/internal/t0;", bi.ay, "Lkotlinx/coroutines/internal/t0;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,315:1\n295#1,5:323\n300#1,12:329\n312#1:385\n299#1:387\n300#1,12:389\n312#1:418\n215#2,7:316\n222#2:344\n241#2,8:345\n223#2:353\n253#2:354\n254#2,2:365\n256#2:369\n225#2:370\n227#2:386\n1#3:328\n1#3:388\n1#3:419\n198#4,3:341\n201#4,14:371\n198#4,17:401\n198#4,17:420\n107#5,10:355\n118#5,2:367\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n280#1:323,5\n280#1:329,12\n280#1:385\n285#1:387\n285#1:389,12\n285#1:418\n280#1:316,7\n280#1:344\n280#1:345,8\n280#1:353\n280#1:354\n280#1:365,2\n280#1:369\n280#1:370\n280#1:386\n280#1:328\n285#1:388\n280#1:341,3\n280#1:371,14\n285#1:401,17\n311#1:420,17\n280#1:355,10\n280#1:367,2\n*E\n"})
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a */
    @p4.l
    private static final t0 f20373a = new t0("UNDEFINED");

    /* renamed from: b */
    @p4.l
    @u3.e
    public static final t0 f20374b = new t0("REUSABLE_CLAIMED");

    private static final boolean b(l<?> lVar, Object obj, int i5, boolean z4, v3.a<r2> aVar) {
        kotlinx.coroutines.r1 b5 = p3.f20437a.b();
        if (z4 && b5.L0()) {
            return false;
        }
        if (b5.K0()) {
            lVar.f20371f = obj;
            lVar.f20294c = i5;
            b5.F0(lVar);
            return true;
        }
        b5.H0(true);
        try {
            aVar.invoke();
            do {
            } while (b5.N0());
            kotlin.jvm.internal.i0.d(1);
        } catch (Throwable th) {
            try {
                lVar.m(th, null);
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.i0.d(1);
                b5.C0(true);
                kotlin.jvm.internal.i0.c(1);
                throw th2;
            }
        }
        b5.C0(true);
        kotlin.jvm.internal.i0.c(1);
        return false;
    }

    static /* synthetic */ boolean c(l lVar, Object obj, int i5, boolean z4, v3.a aVar, int i6, Object obj2) {
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        kotlinx.coroutines.r1 b5 = p3.f20437a.b();
        if (z4 && b5.L0()) {
            return false;
        }
        if (b5.K0()) {
            lVar.f20371f = obj;
            lVar.f20294c = i5;
            b5.F0(lVar);
            return true;
        }
        b5.H0(true);
        try {
            aVar.invoke();
            do {
            } while (b5.N0());
            kotlin.jvm.internal.i0.d(1);
        } catch (Throwable th) {
            try {
                lVar.m(th, null);
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.i0.d(1);
                b5.C0(true);
                kotlin.jvm.internal.i0.c(1);
                throw th2;
            }
        }
        b5.C0(true);
        kotlin.jvm.internal.i0.c(1);
        return false;
    }

    /* JADX WARN: Finally extract failed */
    @g2
    public static final <T> void d(@p4.l kotlin.coroutines.d<? super T> dVar, @p4.l Object obj, @p4.m v3.l<? super Throwable, r2> lVar) {
        boolean z4;
        x3<?> x3Var;
        if (dVar instanceof l) {
            l lVar2 = (l) dVar;
            Object c5 = kotlinx.coroutines.j0.c(obj, lVar);
            if (lVar2.f20369d.isDispatchNeeded(lVar2.getContext())) {
                lVar2.f20371f = c5;
                lVar2.f20294c = 1;
                lVar2.f20369d.dispatch(lVar2.getContext(), lVar2);
                return;
            }
            kotlinx.coroutines.r1 b5 = p3.f20437a.b();
            if (b5.K0()) {
                lVar2.f20371f = c5;
                lVar2.f20294c = 1;
                b5.F0(lVar2);
                return;
            }
            b5.H0(true);
            try {
                l2 l2Var = (l2) lVar2.getContext().get(l2.U);
                if (l2Var != null && !l2Var.isActive()) {
                    CancellationException y4 = l2Var.y();
                    lVar2.f(c5, y4);
                    d1.a aVar = kotlin.d1.Companion;
                    lVar2.resumeWith(kotlin.d1.m6444constructorimpl(kotlin.e1.a(y4)));
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    kotlin.coroutines.d<T> dVar2 = lVar2.f20370e;
                    Object obj2 = lVar2.f20372g;
                    kotlin.coroutines.g context = dVar2.getContext();
                    Object c6 = z0.c(context, obj2);
                    if (c6 != z0.f20411a) {
                        x3Var = kotlinx.coroutines.m0.g(dVar2, context, c6);
                    } else {
                        x3Var = null;
                    }
                    try {
                        lVar2.f20370e.resumeWith(obj);
                        r2 r2Var = r2.f19517a;
                        if (x3Var == null || x3Var.x1()) {
                            z0.a(context, c6);
                        }
                    } catch (Throwable th) {
                        if (x3Var == null || x3Var.x1()) {
                            z0.a(context, c6);
                        }
                        throw th;
                    }
                }
                do {
                } while (b5.N0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.resumeWith(obj);
    }

    public static /* synthetic */ void e(kotlin.coroutines.d dVar, Object obj, v3.l lVar, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        d(dVar, obj, lVar);
    }

    public static final boolean f(@p4.l l<? super r2> lVar) {
        r2 r2Var = r2.f19517a;
        kotlinx.coroutines.r1 b5 = p3.f20437a.b();
        if (b5.L0()) {
            return false;
        }
        if (b5.K0()) {
            lVar.f20371f = r2Var;
            lVar.f20294c = 1;
            b5.F0(lVar);
            return true;
        }
        b5.H0(true);
        try {
            lVar.run();
            do {
            } while (b5.N0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
