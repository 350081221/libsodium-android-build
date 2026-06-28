package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Lkotlin/r2;", bi.ay, "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class b4 {
    @p4.m
    public static final Object a(@p4.l kotlin.coroutines.d<? super kotlin.r2> dVar) {
        kotlin.coroutines.d e5;
        kotlinx.coroutines.internal.l lVar;
        Object obj;
        Object l5;
        Object l6;
        kotlin.coroutines.g context = dVar.getContext();
        p2.z(context);
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        if (e5 instanceof kotlinx.coroutines.internal.l) {
            lVar = (kotlinx.coroutines.internal.l) e5;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            obj = kotlin.r2.f19517a;
        } else {
            if (lVar.f20369d.isDispatchNeeded(context)) {
                lVar.q(context, kotlin.r2.f19517a);
            } else {
                a4 a4Var = new a4();
                kotlin.coroutines.g plus = context.plus(a4Var);
                kotlin.r2 r2Var = kotlin.r2.f19517a;
                lVar.q(plus, r2Var);
                if (a4Var.f19848a) {
                    if (kotlinx.coroutines.internal.m.f(lVar)) {
                        obj = kotlin.coroutines.intrinsics.d.l();
                    } else {
                        obj = r2Var;
                    }
                }
            }
            obj = kotlin.coroutines.intrinsics.d.l();
        }
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (obj == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        l6 = kotlin.coroutines.intrinsics.d.l();
        if (obj == l6) {
            return obj;
        }
        return kotlin.r2.f19517a;
    }
}
