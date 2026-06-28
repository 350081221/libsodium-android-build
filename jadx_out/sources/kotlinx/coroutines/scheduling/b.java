package kotlinx.coroutines.scheduling;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlinx.coroutines.scheduling.a;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¨\u0006\u0005"}, d2 = {"Ljava/lang/Thread;", "thread", "", bi.ay, "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class b {
    @u3.h(name = "isSchedulerWorker")
    public static final boolean a(@p4.l Thread thread) {
        return thread instanceof a.c;
    }

    @u3.h(name = "mayNotBlock")
    public static final boolean b(@p4.l Thread thread) {
        if ((thread instanceof a.c) && ((a.c) thread).f20505c == a.d.CPU_ACQUIRED) {
            return true;
        }
        return false;
    }
}
