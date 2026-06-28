package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.concurrent.CancellationException;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/gestures/GestureCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", CrashHianalyticsData.MESSAGE, "", "(Ljava/lang/String;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GestureCancellationException extends CancellationException {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public GestureCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public GestureCancellationException(@m String str) {
        super(str);
    }

    public /* synthetic */ GestureCancellationException(String str, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : str);
    }
}
