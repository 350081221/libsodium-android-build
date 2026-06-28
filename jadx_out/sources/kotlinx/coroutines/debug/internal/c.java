package kotlinx.coroutines.debug.internal;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.internal.t0;

@i0(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002\u001a\b\u0010\u0004\u001a\u00020\u0003H\u0002\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0012"}, d2 = {"", "Lkotlinx/coroutines/debug/internal/l;", "d", "", "e", "", bi.ay, "I", "MAGIC", "b", "MIN_CAPACITY", "Lkotlinx/coroutines/internal/t0;", "c", "Lkotlinx/coroutines/internal/t0;", "REHASH", "Lkotlinx/coroutines/debug/internal/l;", "MARKED_NULL", "MARKED_TRUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f19974a = -1640531527;

    /* renamed from: b, reason: collision with root package name */
    private static final int f19975b = 16;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final t0 f19976c = new t0("REHASH");

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final l f19977d = new l(null);

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final l f19978e = new l(Boolean.TRUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final l d(Object obj) {
        if (obj == null) {
            return f19977d;
        }
        if (l0.g(obj, Boolean.TRUE)) {
            return f19978e;
        }
        return new l(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
