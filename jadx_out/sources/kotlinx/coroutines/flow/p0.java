package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlinx.coroutines.flow.o0;

@kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/o0$a;", "Lkotlin/time/e;", "stopTimeout", "replayExpiration", "Lkotlinx/coroutines/flow/o0;", bi.ay, "(Lkotlinx/coroutines/flow/o0$a;JJ)Lkotlinx/coroutines/flow/o0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class p0 {
    @p4.l
    public static final o0 a(@p4.l o0.a aVar, long j5, long j6) {
        return new s0(kotlin.time.e.M(j5), kotlin.time.e.M(j6));
    }

    public static /* synthetic */ o0 b(o0.a aVar, long j5, long j6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = kotlin.time.e.f19812b.W();
        }
        if ((i5 & 2) != 0) {
            j6 = kotlin.time.e.f19812b.q();
        }
        return a(aVar, j5, j6);
    }
}
