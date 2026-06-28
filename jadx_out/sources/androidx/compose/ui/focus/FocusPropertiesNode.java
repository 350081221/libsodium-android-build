package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "Lkotlin/r2;", "applyFocusProperties", "Landroidx/compose/ui/focus/FocusPropertiesScope;", "focusPropertiesScope", "Landroidx/compose/ui/focus/FocusPropertiesScope;", "getFocusPropertiesScope", "()Landroidx/compose/ui/focus/FocusPropertiesScope;", "setFocusPropertiesScope", "(Landroidx/compose/ui/focus/FocusPropertiesScope;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FocusPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {

    @l
    private FocusPropertiesScope focusPropertiesScope;

    public FocusPropertiesNode(@l FocusPropertiesScope focusPropertiesScope) {
        this.focusPropertiesScope = focusPropertiesScope;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@l FocusProperties focusProperties) {
        this.focusPropertiesScope.apply(focusProperties);
    }

    @l
    public final FocusPropertiesScope getFocusPropertiesScope() {
        return this.focusPropertiesScope;
    }

    public final void setFocusPropertiesScope(@l FocusPropertiesScope focusPropertiesScope) {
        this.focusPropertiesScope = focusPropertiesScope;
    }
}
