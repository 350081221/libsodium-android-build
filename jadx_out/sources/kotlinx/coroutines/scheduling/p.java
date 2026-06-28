package kotlinx.coroutines.scheduling;

import kotlin.i0;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.n0;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0017J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0017¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/scheduling/p;", "Lkotlinx/coroutines/n0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/r2;", "dispatchYield", "dispatch", "", "parallelism", "limitedParallelism", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class p extends n0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final p f20545a = new p();

    private p() {
    }

    @Override // kotlinx.coroutines.n0
    public void dispatch(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        d.f20513g.E0(runnable, o.f20544j, false);
    }

    @Override // kotlinx.coroutines.n0
    @g2
    public void dispatchYield(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        d.f20513g.E0(runnable, o.f20544j, true);
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    @a2
    public n0 limitedParallelism(int i5) {
        u.a(i5);
        if (i5 >= o.f20538d) {
            return this;
        }
        return super.limitedParallelism(i5);
    }
}
