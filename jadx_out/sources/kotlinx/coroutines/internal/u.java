package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "Lkotlin/r2;", bi.ay, "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes4.dex */
public final class u {
    public static final void a(int i5) {
        if (i5 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i5).toString());
    }
}
