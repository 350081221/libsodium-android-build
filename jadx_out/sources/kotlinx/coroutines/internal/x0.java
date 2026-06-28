package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001a\u0010\u0007\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"", "propertyName", "b", "", bi.ay, "I", "()I", "AVAILABLE_PROCESSORS", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* loaded from: classes4.dex */
final /* synthetic */ class x0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f20400a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f20400a;
    }

    @p4.m
    public static final String b(@p4.l String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
