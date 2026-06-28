package androidx.compose.ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0012\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;", "Landroid/view/ActionMode$Callback2;", "Landroid/view/ActionMode;", "mode", "Landroid/view/MenuItem;", "item", "", "onActionItemClicked", "Landroid/view/Menu;", "menu", "onCreateActionMode", "onPrepareActionMode", "Lkotlin/r2;", "onDestroyActionMode", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "outRect", "onGetContentRect", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "callback", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "<init>", "(Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(23)
/* loaded from: classes.dex */
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {
    public static final int $stable = 8;

    @l
    private final TextActionModeCallback callback;

    public FloatingTextActionModeCallback(@l TextActionModeCallback textActionModeCallback) {
        this.callback = textActionModeCallback;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@m ActionMode actionMode, @m MenuItem menuItem) {
        return this.callback.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@m ActionMode actionMode, @m Menu menu) {
        return this.callback.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@m ActionMode actionMode) {
        this.callback.onDestroyActionMode();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(@m ActionMode actionMode, @m View view, @m Rect rect) {
        androidx.compose.ui.geometry.Rect rect2 = this.callback.getRect();
        if (rect != null) {
            rect.set((int) rect2.getLeft(), (int) rect2.getTop(), (int) rect2.getRight(), (int) rect2.getBottom());
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@m ActionMode actionMode, @m Menu menu) {
        return this.callback.onPrepareActionMode(actionMode, menu);
    }
}
