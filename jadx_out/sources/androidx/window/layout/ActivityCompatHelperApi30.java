package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Landroidx/window/layout/ActivityCompatHelperApi30;", "", "()V", "currentWindowBounds", "Landroid/graphics/Rect;", "activity", "Landroid/app/Activity;", "maximumWindowBounds", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@RequiresApi(30)
/* loaded from: classes2.dex */
public final class ActivityCompatHelperApi30 {

    @l
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    @l
    public final Rect currentWindowBounds(@l Activity activity) {
        android.view.WindowMetrics currentWindowMetrics;
        Rect bounds;
        l0.p(activity, "activity");
        currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        l0.o(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    @l
    public final Rect maximumWindowBounds(@l Activity activity) {
        android.view.WindowMetrics maximumWindowMetrics;
        Rect bounds;
        l0.p(activity, "activity");
        maximumWindowMetrics = activity.getWindowManager().getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        l0.o(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
