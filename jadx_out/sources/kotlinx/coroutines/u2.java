package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005\"\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"", socket.g.f22386a, bi.aJ, "Lkotlinx/coroutines/internal/t0;", bi.ay, "Lkotlinx/coroutines/internal/t0;", "COMPLETING_ALREADY", "b", "COMPLETING_WAITING_CHILDREN", "c", "COMPLETING_RETRY", "d", "TOO_LATE_TO_CANCEL", "", "e", "I", "RETRY", "f", "FALSE", "TRUE", "SEALED", "Lkotlinx/coroutines/q1;", "i", "Lkotlinx/coroutines/q1;", "EMPTY_NEW", "j", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class u2 {

    /* renamed from: e, reason: collision with root package name */
    private static final int f20655e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f20656f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f20657g = 1;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final kotlinx.coroutines.internal.t0 f20651a = new kotlinx.coroutines.internal.t0("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final kotlinx.coroutines.internal.t0 f20652b = new kotlinx.coroutines.internal.t0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final kotlinx.coroutines.internal.t0 f20653c = new kotlinx.coroutines.internal.t0("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final kotlinx.coroutines.internal.t0 f20654d = new kotlinx.coroutines.internal.t0("TOO_LATE_TO_CANCEL");

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private static final kotlinx.coroutines.internal.t0 f20658h = new kotlinx.coroutines.internal.t0("SEALED");

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private static final q1 f20659i = new q1(false);

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private static final q1 f20660j = new q1(true);

    @p4.m
    public static final Object g(@p4.m Object obj) {
        return obj instanceof e2 ? new f2((e2) obj) : obj;
    }

    @p4.m
    public static final Object h(@p4.m Object obj) {
        e2 e2Var;
        f2 f2Var = obj instanceof f2 ? (f2) obj : null;
        return (f2Var == null || (e2Var = f2Var.f20024a) == null) ? obj : e2Var;
    }
}
