package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.concurrent.CancellationException;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", CrashHianalyticsData.TIME, "", "(J)V", "fillInStackTrace", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,775:1\n26#2:776\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException\n*L\n745#1:776\n*E\n"})
/* loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public static final int $stable = 0;

    public PointerEventTimeoutCancellationException(long j5) {
        super("Timed out waiting for " + j5 + " ms");
    }

    @Override // java.lang.Throwable
    @l
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
