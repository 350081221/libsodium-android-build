package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "child", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "invoke", "(Landroidx/compose/ui/draganddrop/DragAndDropNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragAndDropNode$acceptDragAndDropTransfer$2 extends n0 implements l<DragAndDropNode, Boolean> {
    final /* synthetic */ k1.a $handledByChild;
    final /* synthetic */ DragAndDropEvent $startEvent;
    final /* synthetic */ DragAndDropNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$acceptDragAndDropTransfer$2(k1.a aVar, DragAndDropEvent dragAndDropEvent, DragAndDropNode dragAndDropNode) {
        super(1);
        this.$handledByChild = aVar;
        this.$startEvent = dragAndDropEvent;
        this.this$0 = dragAndDropNode;
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l DragAndDropNode dragAndDropNode) {
        k1.a aVar = this.$handledByChild;
        boolean z4 = aVar.element;
        boolean acceptDragAndDropTransfer = dragAndDropNode.acceptDragAndDropTransfer(this.$startEvent);
        DragAndDropNode dragAndDropNode2 = this.this$0;
        if (acceptDragAndDropTransfer) {
            DelegatableNodeKt.requireOwner(dragAndDropNode2).getDragAndDropManager().registerNodeInterest(dragAndDropNode);
        }
        r2 r2Var = r2.f19517a;
        aVar.element = z4 | acceptDragAndDropTransfer;
        return Boolean.TRUE;
    }
}
