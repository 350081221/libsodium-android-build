package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "child", "Landroidx/compose/ui/node/TraversableNode;", "invoke", "androidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1\n+ 2 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n*L\n1#1,307:1\n218#2,2:308\n*E\n"})
/* loaded from: classes.dex */
public final class DragAndDropNode$onMoved$$inlined$firstChildOrNull$1 extends n0 implements l<TraversableNode, TraversableNode.Companion.TraverseDescendantsAction> {
    final /* synthetic */ DragAndDropEvent $event$inlined;
    final /* synthetic */ k1.h $match;
    final /* synthetic */ DragAndDropNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onMoved$$inlined$firstChildOrNull$1(k1.h hVar, DragAndDropNode dragAndDropNode, DragAndDropEvent dragAndDropEvent) {
        super(1);
        this.$match = hVar;
        this.this$0 = dragAndDropNode;
        this.$event$inlined = dragAndDropEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    @p4.l
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(@p4.l TraversableNode traversableNode) {
        if (traversableNode instanceof DragAndDropModifierNode) {
            DragAndDropModifierNode dragAndDropModifierNode = (DragAndDropModifierNode) traversableNode;
            if (DelegatableNodeKt.requireOwner(this.this$0).getDragAndDropManager().isInterestedNode(dragAndDropModifierNode) && DragAndDropNodeKt.m3384access$containsUv8p0NA(dragAndDropModifierNode, DragAndDrop_androidKt.getPositionInRoot(this.$event$inlined))) {
                this.$match.element = traversableNode;
                return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
            }
        }
        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
