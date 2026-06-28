package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u000b\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J.\u0010\f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/input/pointer/NodeParent;", "", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "buildCache", "dispatchMainEventPass", "dispatchFinalEventPass", "Lkotlin/r2;", "dispatchCancel", "clear", "removeDetachedPointerInputFilters", "cleanUpHits", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/Node;", "children", "Landroidx/compose/runtime/collection/MutableVector;", "getChildren", "()Landroidx/compose/runtime/collection/MutableVector;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,554:1\n1208#2:555\n1187#2,2:556\n460#3,11:558\n460#3,11:569\n460#3,11:580\n460#3,11:591\n523#3:602\n48#3:603\n523#3:604\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n145#1:555\n145#1:556,2\n154#1:558,11\n184#1:569,11\n203#1:580,11\n214#1:591,11\n230#1:602\n242#1:603\n243#1:604\n*E\n"})
/* loaded from: classes.dex */
public class NodeParent {
    public static final int $stable = MutableVector.$stable;

    @l
    private final MutableVector<Node> children = new MutableVector<>(new Node[16], 0);

    public boolean buildCache(@l LongSparseArray<PointerInputChange> longSparseArray, @l LayoutCoordinates layoutCoordinates, @l InternalPointerEvent internalPointerEvent, boolean z4) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] content = mutableVector.getContent();
        int i5 = 0;
        boolean z5 = false;
        do {
            if (!content[i5].buildCache(longSparseArray, layoutCoordinates, internalPointerEvent, z4) && !z5) {
                z5 = false;
            } else {
                z5 = true;
            }
            i5++;
        } while (i5 < size);
        return z5;
    }

    public void cleanUpHits(@l InternalPointerEvent internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 < size) {
                if (this.children.getContent()[size].getPointerIds().isEmpty()) {
                    this.children.removeAt(size);
                }
            } else {
                return;
            }
        }
    }

    public final void clear() {
        this.children.clear();
    }

    public void dispatchCancel() {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size > 0) {
            Node[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                content[i5].dispatchCancel();
                i5++;
            } while (i5 < size);
        }
    }

    public boolean dispatchFinalEventPass(@l InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        boolean z4 = false;
        if (size > 0) {
            Node[] content = mutableVector.getContent();
            int i5 = 0;
            boolean z5 = false;
            do {
                if (!content[i5].dispatchFinalEventPass(internalPointerEvent) && !z5) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                i5++;
            } while (i5 < size);
            z4 = z5;
        }
        cleanUpHits(internalPointerEvent);
        return z4;
    }

    public boolean dispatchMainEventPass(@l LongSparseArray<PointerInputChange> longSparseArray, @l LayoutCoordinates layoutCoordinates, @l InternalPointerEvent internalPointerEvent, boolean z4) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] content = mutableVector.getContent();
        int i5 = 0;
        boolean z5 = false;
        do {
            if (!content[i5].dispatchMainEventPass(longSparseArray, layoutCoordinates, internalPointerEvent, z4) && !z5) {
                z5 = false;
            } else {
                z5 = true;
            }
            i5++;
        } while (i5 < size);
        return z5;
    }

    @l
    public final MutableVector<Node> getChildren() {
        return this.children;
    }

    public final void removeDetachedPointerInputFilters() {
        int i5 = 0;
        while (i5 < this.children.getSize()) {
            Node node = this.children.getContent()[i5];
            if (!node.getModifierNode().isAttached()) {
                this.children.removeAt(i5);
                node.dispatchCancel();
            } else {
                i5++;
                node.removeDetachedPointerInputFilters();
            }
        }
    }
}
