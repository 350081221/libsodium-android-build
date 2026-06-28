package androidx.compose.ui.input.pointer;

import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1 extends n0 implements l<PointerHoverIconModifierNode, Boolean> {
    final /* synthetic */ k1.h<PointerHoverIconModifierNode> $pointerHoverIconModifierNode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1(k1.h<PointerHoverIconModifierNode> hVar) {
        super(1);
        this.$pointerHoverIconModifierNode = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        boolean z4;
        boolean z5;
        if (this.$pointerHoverIconModifierNode.element == null) {
            z5 = pointerHoverIconModifierNode.cursorInBoundsOfNode;
            if (z5) {
                this.$pointerHoverIconModifierNode.element = pointerHoverIconModifierNode;
                return Boolean.TRUE;
            }
        }
        if (this.$pointerHoverIconModifierNode.element != null && pointerHoverIconModifierNode.getOverrideDescendants()) {
            z4 = pointerHoverIconModifierNode.cursorInBoundsOfNode;
            if (z4) {
                this.$pointerHoverIconModifierNode.element = pointerHoverIconModifierNode;
            }
        }
        return Boolean.TRUE;
    }
}
