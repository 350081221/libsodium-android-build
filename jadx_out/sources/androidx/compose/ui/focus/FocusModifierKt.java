package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.b1;
import kotlin.i0;
import kotlin.k;
import p4.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"focusModifier", "Landroidx/compose/ui/Modifier;", "focusTarget", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusModifierKt {
    @l
    @k(message = "Replaced by focusTarget", replaceWith = @b1(expression = "focusTarget()", imports = {"androidx.compose.ui.focus.focusTarget"}))
    public static final Modifier focusModifier(@l Modifier modifier) {
        return focusTarget(modifier);
    }

    @l
    public static final Modifier focusTarget(@l Modifier modifier) {
        return modifier.then(FocusTargetNode.FocusTargetElement.INSTANCE);
    }
}
