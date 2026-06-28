package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "it", "Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerHoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1 extends n0 implements l<PointerHoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction> {
    final /* synthetic */ k1.a $hasIconRightsOverDescendants;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerHoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1(k1.a aVar) {
        super(1);
        this.$hasIconRightsOverDescendants = aVar;
    }

    @Override // v3.l
    @p4.l
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(@p4.l PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        boolean z4;
        z4 = pointerHoverIconModifierNode.cursorInBoundsOfNode;
        if (z4) {
            this.$hasIconRightsOverDescendants.element = false;
            return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
        }
        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
