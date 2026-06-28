package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B2\u0012!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R2\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/draganddrop/DropTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/v0;", "name", NotificationCompat.CATEGORY_EVENT, "shouldStartDragAndDrop", "Lv3/l;", "getShouldStartDragAndDrop", "()Lv3/l;", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", TypedValues.AttributesType.S_TARGET, "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "getTarget", "()Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "<init>", "(Lv3/l;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class DropTargetElement extends ModifierNodeElement<DragAndDropTargetNode> {

    @l
    private final v3.l<DragAndDropEvent, Boolean> shouldStartDragAndDrop;

    @l
    private final DragAndDropTarget target;

    /* JADX WARN: Multi-variable type inference failed */
    public DropTargetElement(@l v3.l<? super DragAndDropEvent, Boolean> lVar, @l DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = lVar;
        this.target = dragAndDropTarget;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropTargetElement)) {
            return false;
        }
        DropTargetElement dropTargetElement = (DropTargetElement) obj;
        if (!l0.g(this.target, dropTargetElement.target)) {
            return false;
        }
        return l0.g(this.shouldStartDragAndDrop, dropTargetElement.shouldStartDragAndDrop);
    }

    @l
    public final v3.l<DragAndDropEvent, Boolean> getShouldStartDragAndDrop() {
        return this.shouldStartDragAndDrop;
    }

    @l
    public final DragAndDropTarget getTarget() {
        return this.target;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.target.hashCode() * 31) + this.shouldStartDragAndDrop.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dropTarget");
        inspectorInfo.getProperties().set(TypedValues.AttributesType.S_TARGET, this.target);
        inspectorInfo.getProperties().set("shouldStartDragAndDrop", this.shouldStartDragAndDrop);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public DragAndDropTargetNode create() {
        return new DragAndDropTargetNode(this.shouldStartDragAndDrop, this.target);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l DragAndDropTargetNode dragAndDropTargetNode) {
        dragAndDropTargetNode.setTarget(this.target);
        dragAndDropTargetNode.setShouldStartDragAndDrop(this.shouldStartDragAndDrop);
    }
}
