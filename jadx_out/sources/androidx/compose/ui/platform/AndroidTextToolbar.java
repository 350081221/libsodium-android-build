package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJP\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/Function0;", "Lkotlin/r2;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "showMenu", "hide", "Landroid/view/View;", "view", "Landroid/view/View;", "Landroid/view/ActionMode;", "actionMode", "Landroid/view/ActionMode;", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "textActionModeCallback", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "Landroidx/compose/ui/platform/TextToolbarStatus;", "<set-?>", "status", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidTextToolbar implements TextToolbar {
    public static final int $stable = 8;

    @p4.m
    private ActionMode actionMode;

    @p4.l
    private final View view;

    @p4.l
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new AndroidTextToolbar$textActionModeCallback$1(this), null, null, null, null, null, 62, null);

    @p4.l
    private TextToolbarStatus status = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(@p4.l View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    @p4.l
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(@p4.l Rect rect, @p4.m v3.a<r2> aVar, @p4.m v3.a<r2> aVar2, @p4.m v3.a<r2> aVar3, @p4.m v3.a<r2> aVar4) {
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(aVar);
        this.textActionModeCallback.setOnCutRequested(aVar3);
        this.textActionModeCallback.setOnPasteRequested(aVar2);
        this.textActionModeCallback.setOnSelectAllRequested(aVar4);
        ActionMode actionMode = this.actionMode;
        if (actionMode == null) {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }
}
