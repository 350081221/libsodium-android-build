package kotlinx.coroutines;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;

@kotlin.i0(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0080\b*\n\u0010\n\"\u00020\u00042\u00020\u0004¨\u0006\u000b"}, d2 = {"", CrashHianalyticsData.MESSAGE, "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", bi.ay, "other", "Lkotlin/r2;", "b", "CancellationException", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
/* loaded from: classes4.dex */
public final class w1 {
    @p4.l
    public static final CancellationException a(@p4.m String str, @p4.m Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void b(@p4.l Throwable th, @p4.l Throwable th2) {
        kotlin.p.a(th, th2);
    }
}
