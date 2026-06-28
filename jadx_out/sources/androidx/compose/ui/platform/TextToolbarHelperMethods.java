package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/TextToolbarHelperMethods;", "", "Landroid/view/View;", "view", "Landroid/view/ActionMode$Callback;", "actionModeCallback", "", "type", "Landroid/view/ActionMode;", "startActionMode", "actionMode", "Lkotlin/r2;", "invalidateContentRect", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(23)
/* loaded from: classes.dex */
public final class TextToolbarHelperMethods {
    public static final int $stable = 0;

    @p4.l
    public static final TextToolbarHelperMethods INSTANCE = new TextToolbarHelperMethods();

    private TextToolbarHelperMethods() {
    }

    @DoNotInline
    @RequiresApi(23)
    public final void invalidateContentRect(@p4.l ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    @DoNotInline
    @RequiresApi(23)
    @p4.m
    public final ActionMode startActionMode(@p4.l View view, @p4.l ActionMode.Callback callback, int i5) {
        return view.startActionMode(callback, i5);
    }
}
