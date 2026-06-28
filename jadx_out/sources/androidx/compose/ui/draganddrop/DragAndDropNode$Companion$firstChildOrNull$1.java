package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "child", "Landroidx/compose/ui/node/TraversableNode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1\n*L\n1#1,307:1\n*E\n"})
/* loaded from: classes.dex */
public final class DragAndDropNode$Companion$firstChildOrNull$1 extends n0 implements l<TraversableNode, TraversableNode.Companion.TraverseDescendantsAction> {
    final /* synthetic */ k1.h<DragAndDropModifierNode> $match;
    final /* synthetic */ l<DragAndDropModifierNode, Boolean> $predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode$Companion$firstChildOrNull$1(l<? super DragAndDropModifierNode, Boolean> lVar, k1.h<DragAndDropModifierNode> hVar) {
        super(1);
        this.$predicate = lVar;
        this.$match = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    @p4.l
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(@p4.l TraversableNode traversableNode) {
        if ((traversableNode instanceof DragAndDropModifierNode) && this.$predicate.invoke(traversableNode).booleanValue()) {
            this.$match.element = traversableNode;
            return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
        }
        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
