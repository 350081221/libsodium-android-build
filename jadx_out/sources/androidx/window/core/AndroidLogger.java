package androidx.window.core;

import android.util.Log;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/window/core/AndroidLogger;", "Landroidx/window/core/Logger;", "", TTDownloadField.TT_TAG, CrashHianalyticsData.MESSAGE, "Lkotlin/r2;", "debug", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class AndroidLogger implements Logger {

    @l
    public static final AndroidLogger INSTANCE = new AndroidLogger();

    private AndroidLogger() {
    }

    @Override // androidx.window.core.Logger
    public void debug(@l String tag, @l String message) {
        l0.p(tag, "tag");
        l0.p(message, "message");
        Log.d(tag, message);
    }
}
