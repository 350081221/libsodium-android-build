package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.internal.t0;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"E", "", "capacity", "Lkotlinx/coroutines/channels/d;", bi.ay, "Lkotlinx/coroutines/internal/t0;", "Lkotlinx/coroutines/internal/t0;", "NO_ELEMENT", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final t0 f19877a = new t0("NO_ELEMENT");

    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported")
    @c3
    public static final <E> d<E> a(int i5) {
        if (i5 != -2) {
            if (i5 != -1) {
                if (i5 != 0) {
                    if (i5 != Integer.MAX_VALUE) {
                        return new e(i5);
                    }
                    throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
                }
                throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
            }
            return new y();
        }
        return new e(l.V.a());
    }

    public static final /* synthetic */ t0 b() {
        return f19877a;
    }
}
