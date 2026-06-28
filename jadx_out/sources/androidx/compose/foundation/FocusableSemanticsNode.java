package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.i0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\t\u001a\u00020\u0006*\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/FocusableSemanticsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "", "focused", "Lkotlin/r2;", "setFocus", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfigurationCache", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "isFocused", "Z", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusableSemanticsNode extends Modifier.Node implements SemanticsModifierNode, FocusRequesterModifierNode {
    private boolean isFocused;

    @p4.l
    private SemanticsConfiguration semanticsConfigurationCache = new SemanticsConfiguration();

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.isFocused);
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, new FocusableSemanticsNode$applySemantics$1(this), 1, null);
    }

    public final void setFocus(boolean z4) {
        this.isFocused = z4;
    }
}
