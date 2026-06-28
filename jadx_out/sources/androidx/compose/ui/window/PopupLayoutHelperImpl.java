package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.i0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/window/PopupLayoutHelperImpl;", "Landroidx/compose/ui/window/PopupLayoutHelper;", "Landroid/view/View;", "composeView", "Landroid/graphics/Rect;", "outRect", "Lkotlin/r2;", "getWindowVisibleDisplayFrame", "", "width", "height", "setGestureExclusionRects", "Landroid/view/WindowManager;", "windowManager", "popupView", "Landroid/view/ViewGroup$LayoutParams;", "params", "updateViewLayout", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class PopupLayoutHelperImpl implements PopupLayoutHelper {
    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public void getWindowVisibleDisplayFrame(@l View view, @l Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(@l View view, int i5, int i6) {
    }

    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public void updateViewLayout(@l WindowManager windowManager, @l View view, @l ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }
}
