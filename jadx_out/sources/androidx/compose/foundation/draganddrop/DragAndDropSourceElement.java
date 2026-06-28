package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000b\u0012'\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r¢\u0006\u0002\b\u000b¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u001a\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000bHÆ\u0003J1\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r¢\u0006\u0002\b\u000bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JV\u0010\u0015\u001a\u00020\u00002\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000b2)\b\u0002\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r¢\u0006\u0002\b\u000bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010HÖ\u0003R(\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R8\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r¢\u0006\u0002\b\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006%"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/u;", "component1", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/d;", "", "component2", "()Lv3/p;", "drawDragDecoration", "dragAndDropSourceHandler", "copy", "(Lv3/l;Lv3/p;)Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "Lv3/l;", "getDrawDragDecoration", "()Lv3/l;", "Lv3/p;", "getDragAndDropSourceHandler", "<init>", "(Lv3/l;Lv3/p;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class DragAndDropSourceElement extends ModifierNodeElement<DragAndDropSourceNode> {

    @l
    private final p<DragAndDropSourceScope, d<? super r2>, Object> dragAndDropSourceHandler;

    @l
    private final v3.l<DrawScope, r2> drawDragDecoration;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropSourceElement(@l v3.l<? super DrawScope, r2> lVar, @l p<? super DragAndDropSourceScope, ? super d<? super r2>, ? extends Object> pVar) {
        this.drawDragDecoration = lVar;
        this.dragAndDropSourceHandler = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DragAndDropSourceElement copy$default(DragAndDropSourceElement dragAndDropSourceElement, v3.l lVar, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = dragAndDropSourceElement.drawDragDecoration;
        }
        if ((i5 & 2) != 0) {
            pVar = dragAndDropSourceElement.dragAndDropSourceHandler;
        }
        return dragAndDropSourceElement.copy(lVar, pVar);
    }

    @l
    public final v3.l<DrawScope, r2> component1() {
        return this.drawDragDecoration;
    }

    @l
    public final p<DragAndDropSourceScope, d<? super r2>, Object> component2() {
        return this.dragAndDropSourceHandler;
    }

    @l
    public final DragAndDropSourceElement copy(@l v3.l<? super DrawScope, r2> lVar, @l p<? super DragAndDropSourceScope, ? super d<? super r2>, ? extends Object> pVar) {
        return new DragAndDropSourceElement(lVar, pVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceElement)) {
            return false;
        }
        DragAndDropSourceElement dragAndDropSourceElement = (DragAndDropSourceElement) obj;
        return l0.g(this.drawDragDecoration, dragAndDropSourceElement.drawDragDecoration) && l0.g(this.dragAndDropSourceHandler, dragAndDropSourceElement.dragAndDropSourceHandler);
    }

    @l
    public final p<DragAndDropSourceScope, d<? super r2>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    @l
    public final v3.l<DrawScope, r2> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.drawDragDecoration.hashCode() * 31) + this.dragAndDropSourceHandler.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }

    @l
    public String toString() {
        return "DragAndDropSourceElement(drawDragDecoration=" + this.drawDragDecoration + ", dragAndDropSourceHandler=" + this.dragAndDropSourceHandler + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public DragAndDropSourceNode create() {
        return new DragAndDropSourceNode(this.drawDragDecoration, this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l DragAndDropSourceNode dragAndDropSourceNode) {
        dragAndDropSourceNode.setDrawDragDecoration(this.drawDragDecoration);
        dragAndDropSourceNode.setDragAndDropSourceHandler(this.dragAndDropSourceHandler);
    }
}
