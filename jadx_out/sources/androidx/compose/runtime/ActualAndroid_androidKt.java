package androidx.compose.runtime;

import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.k;
import p4.l;
import t0.b;

@i0(d1 = {"\u0000d\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0007H\u0000\u001a\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\nH\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\rH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0010H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"!\u0010#\u001a\u00020\u001c8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \"\u0014\u0010$\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%\"\u001a\u0010&\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)*\f\b\u0000\u0010+\"\u00020*2\u00020*¨\u0006,"}, d2 = {"T", b.f22420d, "Landroidx/compose/runtime/SnapshotMutationPolicy;", bi.bt, "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "createSnapshotMutableState", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "Landroidx/compose/runtime/MutableIntState;", "createSnapshotMutableIntState", "", "Landroidx/compose/runtime/MutableLongState;", "createSnapshotMutableLongState", "", "Landroidx/compose/runtime/MutableFloatState;", "createSnapshotMutableFloatState", "", "Landroidx/compose/runtime/MutableDoubleState;", "createSnapshotMutableDoubleState", "", CrashHianalyticsData.MESSAGE, "", "e", "Lkotlin/r2;", "logError", "", "DisallowDefaultMonotonicFrameClock", "Z", "Landroidx/compose/runtime/MonotonicFrameClock;", "DefaultMonotonicFrameClock$delegate", "Lkotlin/d0;", "getDefaultMonotonicFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "getDefaultMonotonicFrameClock$annotations", "()V", "DefaultMonotonicFrameClock", "LogTag", "Ljava/lang/String;", "MainThreadId", "J", "getMainThreadId", "()J", "Landroidx/annotation/CheckResult;", "CheckResult", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ActualAndroid_androidKt {

    @l
    private static final d0 DefaultMonotonicFrameClock$delegate;
    private static final boolean DisallowDefaultMonotonicFrameClock = false;

    @l
    private static final String LogTag = "ComposeInternal";
    private static final long MainThreadId;

    static {
        d0 c5;
        long j5;
        c5 = f0.c(ActualAndroid_androidKt$DefaultMonotonicFrameClock$2.INSTANCE);
        DefaultMonotonicFrameClock$delegate = c5;
        try {
            j5 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j5 = -1;
        }
        MainThreadId = j5;
    }

    @l
    public static final MutableDoubleState createSnapshotMutableDoubleState(double d5) {
        return new ParcelableSnapshotMutableDoubleState(d5);
    }

    @l
    public static final MutableFloatState createSnapshotMutableFloatState(float f5) {
        return new ParcelableSnapshotMutableFloatState(f5);
    }

    @l
    public static final MutableIntState createSnapshotMutableIntState(int i5) {
        return new ParcelableSnapshotMutableIntState(i5);
    }

    @l
    public static final MutableLongState createSnapshotMutableLongState(long j5) {
        return new ParcelableSnapshotMutableLongState(j5);
    }

    @l
    public static final <T> SnapshotMutableState<T> createSnapshotMutableState(T t5, @l SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return new ParcelableSnapshotMutableState(t5, snapshotMutationPolicy);
    }

    @l
    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) DefaultMonotonicFrameClock$delegate.getValue();
    }

    @k(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }

    public static final long getMainThreadId() {
        return MainThreadId;
    }

    public static final void logError(@l String str, @l Throwable th) {
        Log.e(LogTag, str, th);
    }
}
