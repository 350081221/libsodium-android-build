package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Lkotlin/r2;", "invalidateFocusProperties", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusPropertiesModifierNodeKt {
    public static final void invalidateFocusProperties(@l FocusPropertiesModifierNode focusPropertiesModifierNode) {
        DelegatableNodeKt.requireOwner(focusPropertiesModifierNode).getFocusOwner().scheduleInvalidation(focusPropertiesModifierNode);
    }
}
