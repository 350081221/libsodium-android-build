package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b6\u00107J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0082\bJ.\u0010\u0014\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J.\u0010\u0016\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0006\u0010\u0018\u001a\u00020\u0007J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u001d\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "oldEvent", "newEvent", "", "hasPositionChanged", "Lkotlin/r2;", "clearCache", "Lkotlin/Function0;", "block", "dispatchIfNeeded", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "isInBounds", "dispatchMainEventPass", "dispatchFinalEventPass", "buildCache", "dispatchCancel", "markIsIn", "cleanUpHits", "", "toString", "Landroidx/compose/ui/Modifier$Node;", "modifierNode", "Landroidx/compose/ui/Modifier$Node;", "getModifierNode", "()Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "pointerIds", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "getPointerIds", "()Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "relevantChanges", "Landroidx/collection/LongSparseArray;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "wasIn", "Z", "isIn", "hasExited", "Landroidx/compose/runtime/collection/MutableVector;", "", "vec", "Landroidx/compose/runtime/collection/MutableVector;", "getVec", "()Landroidx/compose/runtime/collection/MutableVector;", "<init>", "(Landroidx/compose/ui/Modifier$Node;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n*L\n1#1,554:1\n500#1,5:558\n507#1:662\n500#1,5:663\n507#1:723\n1208#2:555\n1187#2,2:556\n1208#2:584\n1187#2,2:585\n1208#2:639\n1187#2,2:640\n1208#2:689\n1187#2,2:690\n1208#2:745\n1187#2,2:746\n1208#2:816\n1187#2,2:817\n78#3:563\n78#3:618\n78#3:668\n78#3:724\n78#3:795\n385#4,6:564\n395#4,2:571\n397#4,8:576\n405#4,9:587\n414#4,8:599\n385#4,6:619\n395#4,2:626\n397#4,8:631\n405#4,9:642\n414#4,8:654\n385#4,6:669\n395#4,2:676\n397#4,8:681\n405#4,9:692\n414#4,8:704\n385#4,6:725\n395#4,2:732\n397#4,8:737\n405#4,9:748\n414#4,8:760\n385#4,6:796\n395#4,2:803\n397#4,8:808\n405#4,9:819\n414#4,8:831\n261#5:570\n261#5:625\n261#5:675\n261#5:731\n261#5:802\n234#6,3:573\n237#6,3:596\n234#6,3:628\n237#6,3:651\n234#6,3:678\n237#6,3:701\n234#6,3:734\n237#6,3:757\n234#6,3:805\n237#6,3:828\n460#7,11:607\n460#7,11:712\n460#7,11:784\n33#8,6:768\n116#8,2:775\n33#8,6:777\n118#8:783\n33#8,6:839\n178#9:774\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n292#1:558,5\n292#1:662\n330#1:663,5\n330#1:723\n279#1:555\n279#1:556,2\n296#1:584\n296#1:585,2\n316#1:639\n316#1:640,2\n334#1:689\n334#1:690,2\n373#1:745\n373#1:746,2\n519#1:816\n519#1:817,2\n296#1:563\n316#1:618\n334#1:668\n373#1:724\n519#1:795\n296#1:564,6\n296#1:571,2\n296#1:576,8\n296#1:587,9\n296#1:599,8\n316#1:619,6\n316#1:626,2\n316#1:631,8\n316#1:642,9\n316#1:654,8\n334#1:669,6\n334#1:676,2\n334#1:681,8\n334#1:692,9\n334#1:704,8\n373#1:725,6\n373#1:732,2\n373#1:737,8\n373#1:748,9\n373#1:760,8\n519#1:796,6\n519#1:803,2\n519#1:808,8\n519#1:819,9\n519#1:831,8\n296#1:570\n316#1:625\n334#1:675\n373#1:731\n519#1:802\n296#1:573,3\n296#1:596,3\n316#1:628,3\n316#1:651,3\n334#1:678,3\n334#1:701,3\n373#1:734,3\n373#1:757,3\n519#1:805,3\n519#1:828,3\n302#1:607,11\n340#1:712,11\n518#1:784,11\n386#1:768,6\n429#1:775,2\n429#1:777,6\n429#1:783\n535#1:839,6\n417#1:774\n*E\n"})
/* loaded from: classes.dex */
public final class Node extends NodeParent {
    public static final int $stable = 8;

    @m
    private LayoutCoordinates coordinates;

    @l
    private final Modifier.Node modifierNode;

    @m
    private PointerEvent pointerEvent;
    private boolean wasIn;

    @l
    private final PointerIdArray pointerIds = new PointerIdArray();

    @l
    private final LongSparseArray<PointerInputChange> relevantChanges = new LongSparseArray<>(2);
    private boolean isIn = true;
    private boolean hasExited = true;

    @l
    private final MutableVector<Long> vec = new MutableVector<>(new Long[16], 0);

    public Node(@l Modifier.Node node) {
        this.modifierNode = node;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(v3.a<r2> aVar) {
        if (this.relevantChanges.isEmpty() || !this.modifierNode.isAttached()) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    private final boolean hasPositionChanged(PointerEvent pointerEvent, PointerEvent pointerEvent2) {
        if (pointerEvent == null || pointerEvent.getChanges().size() != pointerEvent2.getChanges().size()) {
            return true;
        }
        int size = pointerEvent2.getChanges().size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!Offset.m3490equalsimpl0(pointerEvent.getChanges().get(i5).m4872getPositionF1C5BW0(), pointerEvent2.getChanges().get(i5).m4872getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dc  */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean buildCache(@p4.l androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> r36, @p4.l androidx.compose.ui.layout.LayoutCoordinates r37, @p4.l androidx.compose.ui.input.pointer.InternalPointerEvent r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.buildCache(androidx.collection.LongSparseArray, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(@l InternalPointerEvent internalPointerEvent) {
        boolean z4;
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i5 = 0; i5 < size; i5++) {
            PointerInputChange pointerInputChange = changes.get(i5);
            if (!pointerInputChange.getPressed() && (!internalPointerEvent.m4801issuesEnterExitEvent0FcD4WY(pointerInputChange.m4870getIdJ3iCeTQ()) || !this.isIn)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.pointerIds.m4968remove0FcD4WY(pointerInputChange.m4870getIdJ3iCeTQ());
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m4821equalsimpl0(pointerEvent.m4814getType7fucELk(), PointerEventType.Companion.m4826getExit7fucELk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        boolean z4;
        boolean z5;
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            Node[] content = children.getContent();
            int i5 = 0;
            do {
                content[i5].dispatchCancel();
                i5++;
            } while (i5 < size);
        }
        DelegatingNode delegatingNode = this.modifierNode;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNode).onCancelPointerInput();
            } else {
                if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (delegatingNode instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                    int i6 = 0;
                    delegatingNode = delegatingNode;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            i6++;
                            if (i6 == 1) {
                                delegatingNode = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNode != 0) {
                                    mutableVector.add(delegatingNode);
                                    delegatingNode = 0;
                                }
                                mutableVector.add(delegate$ui_release);
                            }
                        }
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                        delegatingNode = delegatingNode;
                    }
                    if (i6 == 1) {
                    }
                }
            }
            delegatingNode = DelegatableNodeKt.pop(mutableVector);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(@l InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> children;
        int size;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        int i5 = 0;
        z6 = false;
        if (!this.relevantChanges.isEmpty() && this.modifierNode.isAttached()) {
            PointerEvent pointerEvent = this.pointerEvent;
            l0.m(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            l0.m(layoutCoordinates);
            long mo5005getSizeYbymL2g = layoutCoordinates.mo5005getSizeYbymL2g();
            DelegatingNode delegatingNode = this.modifierNode;
            int m5204constructorimpl = NodeKind.m5204constructorimpl(16);
            MutableVector mutableVector = null;
            while (delegatingNode != 0) {
                if (delegatingNode instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNode).mo170onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, mo5005getSizeYbymL2g);
                } else {
                    if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                        int i6 = 0;
                        delegatingNode = delegatingNode;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                i6++;
                                if (i6 == 1) {
                                    delegatingNode = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNode != 0) {
                                        mutableVector.add(delegatingNode);
                                        delegatingNode = 0;
                                    }
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                            delegate$ui_release = delegate$ui_release.getChild$ui_release();
                            delegatingNode = delegatingNode;
                        }
                        if (i6 == 1) {
                        }
                    }
                }
                delegatingNode = DelegatableNodeKt.pop(mutableVector);
            }
            if (this.modifierNode.isAttached() && (size = (children = getChildren()).getSize()) > 0) {
                Node[] content = children.getContent();
                do {
                    content[i5].dispatchFinalEventPass(internalPointerEvent);
                    i5++;
                } while (i5 < size);
            }
            z6 = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(@l LongSparseArray<PointerInputChange> longSparseArray, @l LayoutCoordinates layoutCoordinates, @l InternalPointerEvent internalPointerEvent, boolean z4) {
        boolean z5;
        boolean z6;
        MutableVector<Node> children;
        int size;
        boolean z7;
        boolean z8;
        if (this.relevantChanges.isEmpty() || !this.modifierNode.isAttached()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        l0.m(pointerEvent);
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        l0.m(layoutCoordinates2);
        long mo5005getSizeYbymL2g = layoutCoordinates2.mo5005getSizeYbymL2g();
        DelegatingNode delegatingNode = this.modifierNode;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNode).mo170onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, mo5005getSizeYbymL2g);
            } else {
                if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7 && (delegatingNode instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                    int i5 = 0;
                    delegatingNode = delegatingNode;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            i5++;
                            if (i5 == 1) {
                                delegatingNode = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNode != 0) {
                                    mutableVector.add(delegatingNode);
                                    delegatingNode = 0;
                                }
                                mutableVector.add(delegate$ui_release);
                            }
                        }
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                        delegatingNode = delegatingNode;
                    }
                    if (i5 == 1) {
                    }
                }
            }
            delegatingNode = DelegatableNodeKt.pop(mutableVector);
        }
        if (this.modifierNode.isAttached() && (size = (children = getChildren()).getSize()) > 0) {
            Node[] content = children.getContent();
            int i6 = 0;
            do {
                Node node = content[i6];
                LongSparseArray<PointerInputChange> longSparseArray2 = this.relevantChanges;
                LayoutCoordinates layoutCoordinates3 = this.coordinates;
                l0.m(layoutCoordinates3);
                node.dispatchMainEventPass(longSparseArray2, layoutCoordinates3, internalPointerEvent, z4);
                i6++;
            } while (i6 < size);
        }
        if (this.modifierNode.isAttached()) {
            DelegatingNode delegatingNode2 = this.modifierNode;
            int m5204constructorimpl2 = NodeKind.m5204constructorimpl(16);
            MutableVector mutableVector2 = null;
            while (delegatingNode2 != 0) {
                if (delegatingNode2 instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNode2).mo170onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, mo5005getSizeYbymL2g);
                } else {
                    if ((delegatingNode2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5 && (delegatingNode2 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release2 = delegatingNode2.getDelegate$ui_release();
                        int i7 = 0;
                        delegatingNode2 = delegatingNode2;
                        while (delegate$ui_release2 != null) {
                            if ((delegate$ui_release2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                i7++;
                                if (i7 == 1) {
                                    delegatingNode2 = delegate$ui_release2;
                                } else {
                                    if (mutableVector2 == null) {
                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNode2 != 0) {
                                        mutableVector2.add(delegatingNode2);
                                        delegatingNode2 = 0;
                                    }
                                    mutableVector2.add(delegate$ui_release2);
                                }
                            }
                            delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                            delegatingNode2 = delegatingNode2;
                        }
                        if (i7 == 1) {
                        }
                    }
                }
                delegatingNode2 = DelegatableNodeKt.pop(mutableVector2);
            }
        }
        return true;
    }

    @l
    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    @l
    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    @l
    public final MutableVector<Long> getVec() {
        return this.vec;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @l
    public String toString() {
        return "Node(pointerInputFilter=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
