package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u000b\"\u0014\u0010\u0011\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010\"\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007*\u001e\b\u0002\u0010\u001a\u001a\u0004\b\u0000\u0010\u0018\"\b\u0012\u0004\u0012\u00028\u00000\u00192\b\u0012\u0004\u0012\u00028\u00000\u0019¨\u0006\u001b"}, d2 = {"", "timeMillis", "d", "timeNanos", "c", "Lkotlinx/coroutines/internal/t0;", bi.ay, "Lkotlinx/coroutines/internal/t0;", "DISPOSED_TASK", "", "b", "I", "SCHEDULE_OK", "SCHEDULE_COMPLETED", "SCHEDULE_DISPOSED", "e", "J", "MS_TO_NS", "f", "MAX_MS", socket.g.f22386a, "MAX_DELAY_NS", bi.aJ, "CLOSED_EMPTY", "T", "Lkotlinx/coroutines/internal/b0;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class v1 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f20663b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f20664c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f20665d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final long f20666e = 1000000;

    /* renamed from: f, reason: collision with root package name */
    private static final long f20667f = 9223372036854L;

    /* renamed from: g, reason: collision with root package name */
    private static final long f20668g = 4611686018427387903L;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final kotlinx.coroutines.internal.t0 f20662a = new kotlinx.coroutines.internal.t0("REMOVED_TASK");

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private static final kotlinx.coroutines.internal.t0 f20669h = new kotlinx.coroutines.internal.t0("CLOSED_EMPTY");

    public static final long c(long j5) {
        return j5 / 1000000;
    }

    public static final long d(long j5) {
        if (j5 <= 0) {
            return 0L;
        }
        if (j5 >= f20667f) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j5;
    }
}
