package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicInteger;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\".\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00028À\u0002@À\u0002X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlinx/coroutines/internal/LocalAtomicInt;", "", t0.b.f22420d, bi.ay, "(Ljava/util/concurrent/atomic/AtomicInteger;)I", "b", "(Ljava/util/concurrent/atomic/AtomicInteger;I)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class w {
    public static final int a(@p4.l AtomicInteger atomicInteger) {
        return atomicInteger.get();
    }

    public static final void b(@p4.l AtomicInteger atomicInteger, int i5) {
        atomicInteger.set(i5);
    }
}
