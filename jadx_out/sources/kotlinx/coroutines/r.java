package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0082\b\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004\"\u0014\u0010\u0013\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0019\u0010\u0001\u001a\u00020\u0000*\u00020\u00008Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0014\"\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00008Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"", "decision", "index", bi.ay, "I", "UNDECIDED", "b", kotlinx.coroutines.debug.internal.f.f19993c, "c", "RESUMED", "d", "DECISION_SHIFT", "e", "INDEX_MASK", "f", "NO_INDEX", "Lkotlinx/coroutines/internal/t0;", socket.g.f22386a, "Lkotlinx/coroutines/internal/t0;", "RESUME_TOKEN", "(I)I", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final int f20450a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f20451b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f20452c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f20453d = 29;

    /* renamed from: e, reason: collision with root package name */
    private static final int f20454e = 536870911;

    /* renamed from: f, reason: collision with root package name */
    private static final int f20455f = 536870911;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final kotlinx.coroutines.internal.t0 f20456g = new kotlinx.coroutines.internal.t0("RESUME_TOKEN");

    private static final int a(int i5, int i6) {
        return (i5 << 29) + i6;
    }

    private static final int b(int i5) {
        return i5 >> 29;
    }

    private static final int c(int i5) {
        return i5 & 536870911;
    }
}
