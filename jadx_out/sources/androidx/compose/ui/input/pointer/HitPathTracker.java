package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0007R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "Landroidx/compose/ui/Modifier$Node;", "pointerInputNodes", "Lkotlin/r2;", "addHitPath-KNwqfcY", "(JLjava/util/List;)V", "addHitPath", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "dispatchChanges", "processCancel", "removeDetachedPointerInputFilters", "Landroidx/compose/ui/layout/LayoutCoordinates;", "rootCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/input/pointer/NodeParent;", "root", "Landroidx/compose/ui/input/pointer/NodeParent;", "getRoot$ui_release", "()Landroidx/compose/ui/input/pointer/NodeParent;", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,554:1\n366#2,12:555\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n63#1:555,12\n*E\n"})
/* loaded from: classes.dex */
public final class HitPathTracker {
    public static final int $stable = MutableVector.$stable;

    @l
    private final NodeParent root = new NodeParent();

    @l
    private final LayoutCoordinates rootCoordinates;

    public HitPathTracker(@l LayoutCoordinates layoutCoordinates) {
        this.rootCoordinates = layoutCoordinates;
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker hitPathTracker, InternalPointerEvent internalPointerEvent, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z4);
    }

    /* renamed from: addHitPath-KNwqfcY, reason: not valid java name */
    public final void m4800addHitPathKNwqfcY(long j5, @l List<? extends Modifier.Node> list) {
        Node node;
        NodeParent nodeParent = this.root;
        int size = list.size();
        boolean z4 = true;
        for (int i5 = 0; i5 < size; i5++) {
            Modifier.Node node2 = list.get(i5);
            if (z4) {
                MutableVector<Node> children = nodeParent.getChildren();
                int size2 = children.getSize();
                if (size2 > 0) {
                    Node[] content = children.getContent();
                    int i6 = 0;
                    do {
                        node = content[i6];
                        if (l0.g(node.getModifierNode(), node2)) {
                            break;
                        } else {
                            i6++;
                        }
                    } while (i6 < size2);
                }
                node = null;
                Node node3 = node;
                if (node3 != null) {
                    node3.markIsIn();
                    node3.getPointerIds().m4965add0FcD4WY(j5);
                    nodeParent = node3;
                } else {
                    z4 = false;
                }
            }
            Node node4 = new Node(node2);
            node4.getPointerIds().m4965add0FcD4WY(j5);
            nodeParent.getChildren().add(node4);
            nodeParent = node4;
        }
    }

    public final boolean dispatchChanges(@l InternalPointerEvent internalPointerEvent, boolean z4) {
        if (!this.root.buildCache(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z4)) {
            return false;
        }
        boolean dispatchMainEventPass = this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z4);
        if (!this.root.dispatchFinalEventPass(internalPointerEvent) && !dispatchMainEventPass) {
            return false;
        }
        return true;
    }

    @l
    public final NodeParent getRoot$ui_release() {
        return this.root;
    }

    public final void processCancel() {
        this.root.dispatchCancel();
        this.root.clear();
    }

    public final void removeDetachedPointerInputFilters() {
        this.root.removeDetachedPointerInputFilters();
    }
}
