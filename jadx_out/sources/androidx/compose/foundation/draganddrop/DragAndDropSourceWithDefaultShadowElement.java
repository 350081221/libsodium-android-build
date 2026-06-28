package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
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

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B0\u0012'\u0010\u0013\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R8\u0010\u0013\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f¢\u0006\u0002\b\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/d;", "Lkotlin/u;", "dragAndDropSourceHandler", "Lv3/p;", "getDragAndDropSourceHandler", "()Lv3/p;", "<init>", "(Lv3/p;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class DragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<DragSourceNodeWithDefaultPainter> {

    @l
    private final p<DragAndDropSourceScope, d<? super r2>, Object> dragAndDropSourceHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropSourceWithDefaultShadowElement(@l p<? super DragAndDropSourceScope, ? super d<? super r2>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        return l0.g(this.dragAndDropSourceHandler, ((DragAndDropSourceWithDefaultShadowElement) obj).dragAndDropSourceHandler);
    }

    @l
    public final p<DragAndDropSourceScope, d<? super r2>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.dragAndDropSourceHandler.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSourceWithDefaultPainter");
        inspectorInfo.getProperties().set("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public DragSourceNodeWithDefaultPainter create() {
        return new DragSourceNodeWithDefaultPainter(this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        dragSourceNodeWithDefaultPainter.setDragAndDropSourceHandler(this.dragAndDropSourceHandler);
    }
}
