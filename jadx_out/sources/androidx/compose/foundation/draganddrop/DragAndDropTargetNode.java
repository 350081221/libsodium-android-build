package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.node.DelegatingNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B2\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016R=\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/v0;", "name", NotificationCompat.CATEGORY_EVENT, "", "shouldStartDragAndDrop", "Lv3/l;", "getShouldStartDragAndDrop", "()Lv3/l;", "setShouldStartDragAndDrop", "(Lv3/l;)V", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", TypedValues.AttributesType.S_TARGET, "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "getTarget", "()Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "setTarget", "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V", "<init>", "(Lv3/l;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class DragAndDropTargetNode extends DelegatingNode {

    @l
    private v3.l<? super DragAndDropEvent, Boolean> shouldStartDragAndDrop;

    @l
    private DragAndDropTarget target;

    public DragAndDropTargetNode(@l v3.l<? super DragAndDropEvent, Boolean> lVar, @l DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = lVar;
        this.target = dragAndDropTarget;
        delegate(DragAndDropNodeKt.DragAndDropModifierNode(lVar, dragAndDropTarget));
    }

    @l
    public final v3.l<DragAndDropEvent, Boolean> getShouldStartDragAndDrop() {
        return this.shouldStartDragAndDrop;
    }

    @l
    public final DragAndDropTarget getTarget() {
        return this.target;
    }

    public final void setShouldStartDragAndDrop(@l v3.l<? super DragAndDropEvent, Boolean> lVar) {
        this.shouldStartDragAndDrop = lVar;
    }

    public final void setTarget(@l DragAndDropTarget dragAndDropTarget) {
        this.target = dragAndDropTarget;
    }
}
