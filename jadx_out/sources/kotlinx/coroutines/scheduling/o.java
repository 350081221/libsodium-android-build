package kotlinx.coroutines.scheduling;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.TimeUnit;
import kotlin.i0;
import kotlin.ranges.u;
import kotlinx.coroutines.internal.w0;

@i0(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u0013\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\n\"\u0014\u0010\u0017\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\n\"\u0014\u0010\u001b\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0019\u0010!\u001a\u00020\u001f*\u00020\u001e8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010 ¨\u0006\""}, d2 = {"", bi.ay, "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "", "b", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "c", "I", "CORE_POOL_SIZE", "d", "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "Lkotlinx/coroutines/scheduling/j;", "f", "Lkotlinx/coroutines/scheduling/j;", "schedulerTimeSource", socket.g.f22386a, "TASK_NON_BLOCKING", bi.aJ, "TASK_PROBABLY_BLOCKING", "Lkotlinx/coroutines/scheduling/l;", "i", "Lkotlinx/coroutines/scheduling/l;", "NonBlockingContext", "j", "BlockingContext", "Lkotlinx/coroutines/scheduling/k;", "", "(Lkotlinx/coroutines/scheduling/k;)Z", "isBlocking", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final String f20535a = w0.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    @u3.e
    public static final long f20536b = w0.h("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: c, reason: collision with root package name */
    @u3.e
    public static final int f20537c;

    /* renamed from: d, reason: collision with root package name */
    @u3.e
    public static final int f20538d;

    /* renamed from: e, reason: collision with root package name */
    @u3.e
    public static final long f20539e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    @u3.e
    public static j f20540f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final int f20541g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f20542h = 1;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final l f20543i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final l f20544j;

    static {
        int u4;
        u4 = u.u(w0.a(), 2);
        f20537c = w0.g("kotlinx.coroutines.scheduler.core.pool.size", u4, 1, 0, 8, null);
        f20538d = w0.g("kotlinx.coroutines.scheduler.max.pool.size", a.f20490v, 0, a.f20490v, 4, null);
        f20539e = TimeUnit.SECONDS.toNanos(w0.h("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        f20540f = h.f20525a;
        f20543i = new m(0);
        f20544j = new m(1);
    }

    public static final boolean a(@p4.l k kVar) {
        return kVar.f20532b.i0() == 1;
    }
}
