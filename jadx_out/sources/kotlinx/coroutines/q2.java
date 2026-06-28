package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/l2;", "Ljava/util/concurrent/Future;", "future", "Lkotlinx/coroutines/n1;", "b", "Lkotlinx/coroutines/p;", "Lkotlin/r2;", bi.ay, "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/JobKt")
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 {
    public static final void a(@p4.l p<?> pVar, @p4.l Future<?> future) {
        pVar.g(new l(future));
    }

    @p4.l
    @g2
    public static final n1 b(@p4.l l2 l2Var, @p4.l Future<?> future) {
        return l2Var.t0(new m(future));
    }
}
