package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0004¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/ViewLayerContainer;", "Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/r2;", "dispatchDraw", "dispatchGetDisplayList", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ViewLayerContainer extends DrawChildContainer {
    public static final int $stable = 0;

    public ViewLayerContainer(@p4.l Context context) {
        super(context);
    }

    @Override // androidx.compose.ui.platform.DrawChildContainer, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@p4.l Canvas canvas) {
    }

    protected final void dispatchGetDisplayList() {
    }
}
