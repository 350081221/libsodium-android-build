package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\u001a\u0010\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0001\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\n\u0010\u0006\u0012\u0004\b\u000b\u0010\b\"\u001a\u0010\u000f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000e\u0010\b\" \u0010\u0014\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0013\u0010\b\u001a\u0004\b\u0005\u0010\u0012*\f\b\u0002\u0010\u0015\"\u00020\u00012\u00020\u0001¨\u0006\u0016"}, d2 = {"", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "f", "", bi.ay, "I", "getUNDECIDED$annotations", "()V", "UNDECIDED", "b", "getSUCCESS$annotations", z.c.f22689p, "c", "getFAILURE$annotations", "FAILURE", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "getCONDITION_FALSE$annotations", "CONDITION_FALSE", "Node", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20401a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f20402b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20403c = 2;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final Object f20404d = new t0("CONDITION_FALSE");

    @p4.l
    public static final Object a() {
        return f20404d;
    }

    @kotlin.a1
    public static /* synthetic */ void b() {
    }

    @kotlin.a1
    public static /* synthetic */ void c() {
    }

    @kotlin.a1
    public static /* synthetic */ void d() {
    }

    @kotlin.a1
    public static /* synthetic */ void e() {
    }

    @p4.l
    @kotlin.a1
    public static final z f(@p4.l Object obj) {
        z zVar;
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        if (n0Var != null && (zVar = n0Var.f20375a) != null) {
            return zVar;
        }
        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (z) obj;
    }
}
