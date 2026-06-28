package kotlin;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/NotImplementedError;", "Ljava/lang/Error;", "Lkotlin/Error;", CrashHianalyticsData.MESSAGE, "", "(Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k0 extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public k0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(@p4.l String message) {
        super(message);
        kotlin.jvm.internal.l0.p(message, "message");
    }

    public /* synthetic */ k0(String str, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
