package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "applySemantics", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EmptySemanticsModifier extends Modifier.Node implements SemanticsModifierNode {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
