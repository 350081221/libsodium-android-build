package androidx.compose.ui.draganddrop;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J;\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "Lkotlin/u;", "drawDragDecoration", "drag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLv3/l;)V", "drag", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "startEvent", "", "acceptDragAndDropTransfer", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface DragAndDropModifierNode extends DelegatableNode, DragAndDropTarget {
    boolean acceptDragAndDropTransfer(@l DragAndDropEvent dragAndDropEvent);

    /* renamed from: drag-12SF9DM, reason: not valid java name */
    void mo3383drag12SF9DM(@l DragAndDropTransferData dragAndDropTransferData, long j5, @l v3.l<? super DrawScope, r2> lVar);
}
