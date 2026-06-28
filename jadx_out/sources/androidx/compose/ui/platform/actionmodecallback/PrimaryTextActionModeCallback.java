package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/PrimaryTextActionModeCallback;", "Landroid/view/ActionMode$Callback;", "Landroid/view/ActionMode;", "mode", "Landroid/view/MenuItem;", "item", "", "onActionItemClicked", "Landroid/view/Menu;", "menu", "onCreateActionMode", "onPrepareActionMode", "Lkotlin/r2;", "onDestroyActionMode", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "callback", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "<init>", "(Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PrimaryTextActionModeCallback implements ActionMode.Callback {
    public static final int $stable = 8;

    @l
    private final TextActionModeCallback callback;

    public PrimaryTextActionModeCallback(@l TextActionModeCallback textActionModeCallback) {
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

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@m ActionMode actionMode, @m Menu menu) {
        return this.callback.onPrepareActionMode(actionMode, menu);
    }
}
