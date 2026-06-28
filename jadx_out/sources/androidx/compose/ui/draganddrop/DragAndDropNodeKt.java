package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a1\u0010\u0001\u001a\u00020\u00002!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "DragAndDropModifierNode", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/v0;", "name", NotificationCompat.CATEGORY_EVENT, "", "shouldStartDragAndDrop", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", TypedValues.AttributesType.S_TARGET, "Lkotlin/r2;", "dispatchEntered", "Landroidx/compose/ui/geometry/Offset;", "position", "contains-Uv8p0NA", "(Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;J)Z", "contains", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,307:1\n56#2,4:308\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n300#1:308,4\n*E\n"})
/* loaded from: classes.dex */
public final class DragAndDropNodeKt {
    @l
    public static final DragAndDropModifierNode DragAndDropModifierNode() {
        return new DragAndDropNode(DragAndDropNodeKt$DragAndDropModifierNode$1.INSTANCE);
    }

    /* renamed from: access$contains-Uv8p0NA */
    public static final /* synthetic */ boolean m3384access$containsUv8p0NA(DragAndDropModifierNode dragAndDropModifierNode, long j5) {
        return m3385containsUv8p0NA(dragAndDropModifierNode, j5);
    }

    /* renamed from: contains-Uv8p0NA */
    public static final boolean m3385containsUv8p0NA(DragAndDropModifierNode dragAndDropModifierNode, long j5) {
        boolean z4;
        boolean z5;
        if (!dragAndDropModifierNode.getNode().isAttached()) {
            return false;
        }
        LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(dragAndDropModifierNode).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long mo5005getSizeYbymL2g = coordinates.mo5005getSizeYbymL2g();
        int m6214getWidthimpl = IntSize.m6214getWidthimpl(mo5005getSizeYbymL2g);
        int m6213getHeightimpl = IntSize.m6213getHeightimpl(mo5005getSizeYbymL2g);
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
        float m3483component1impl = Offset.m3483component1impl(positionInRoot);
        float m3484component2impl = Offset.m3484component2impl(positionInRoot);
        float f5 = m6214getWidthimpl + m3483component1impl;
        float f6 = m6213getHeightimpl + m3484component2impl;
        float m3493getXimpl = Offset.m3493getXimpl(j5);
        if (m3483component1impl <= m3493getXimpl && m3493getXimpl <= f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        float m3494getYimpl = Offset.m3494getYimpl(j5);
        if (m3484component2impl <= m3494getYimpl && m3494getYimpl <= f6) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        return true;
    }

    public static final void dispatchEntered(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.onEntered(dragAndDropEvent);
        dragAndDropTarget.onMoved(dragAndDropEvent);
    }

    @l
    public static final DragAndDropModifierNode DragAndDropModifierNode(@l v3.l<? super DragAndDropEvent, Boolean> lVar, @l DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(new DragAndDropNodeKt$DragAndDropModifierNode$2(lVar, dragAndDropTarget));
    }
}
