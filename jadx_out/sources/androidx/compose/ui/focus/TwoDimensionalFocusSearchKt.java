package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a4\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a2\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a:\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a:\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u001a\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013H\u0002\u001a.\u0010\u001b\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a2\u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a2\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010 \u001a\f\u0010'\u001a\u00020\u0017*\u00020\u0017H\u0002\u001a\f\u0010(\u001a\u00020\u0017*\u00020\u0017H\u0002\u001a\f\u0010)\u001a\u00020\u0000*\u00020\u0000H\u0002\"\u001a\u0010+\u001a\u00020*8\u0002X\u0082T¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010.\"\u001a\u0010/\u001a\u00020*8\u0002X\u0082T¢\u0006\f\n\u0004\b/\u0010,\u0012\u0004\b0\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/Function1;", "", "onFound", "twoDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILv3/l;)Ljava/lang/Boolean;", "twoDimensionalFocusSearch", "findChildCorrespondingToFocusEnter--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILv3/l;)Z", "findChildCorrespondingToFocusEnter", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILv3/l;)Z", "generateAndSearchChildren", "searchChildren-4C6V_qg", "searchChildren", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/runtime/collection/MutableVector;", "accessibleChildren", "Lkotlin/r2;", "collectAccessibleChildren", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "findBestCandidate-4WY_MpI", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusTargetNode;", "findBestCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "source", "rect1", "rect2", "beamBeats-I7lrPNg", "beamBeats", "topLeft", "bottomRight", "activeNode", "", "InvalidFocusDirection", "Ljava/lang/String;", "getInvalidFocusDirection$annotations", "()V", "NoActiveChild", "getNoActiveChild$annotations", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,386:1\n1187#2,2:387\n1187#2,2:392\n1208#2:399\n1187#2,2:400\n1208#2:470\n1187#2,2:471\n359#3:389\n523#3:390\n48#3:409\n48#3:480\n460#3,11:536\n1#4:391\n1#4:397\n1#4:468\n90#5:394\n90#5:465\n276#6:395\n133#6:396\n134#6:398\n135#6,7:402\n142#6,9:410\n385#6,6:419\n395#6,2:426\n397#6,17:431\n414#6,8:451\n151#6,6:459\n276#6:466\n133#6:467\n134#6:469\n135#6,7:473\n142#6,9:481\n385#6,6:490\n395#6,2:497\n397#6,17:502\n414#6,8:522\n151#6,6:530\n261#7:425\n261#7:496\n234#8,3:428\n237#8,3:448\n234#8,3:499\n237#8,3:519\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n104#1:387,2\n160#1:392,2\n161#1:399\n161#1:400,2\n190#1:470\n190#1:471,2\n109#1:389\n109#1:390\n161#1:409\n190#1:480\n221#1:536,11\n161#1:397\n190#1:468\n161#1:394\n190#1:465\n161#1:395\n161#1:396\n161#1:398\n161#1:402,7\n161#1:410,9\n161#1:419,6\n161#1:426,2\n161#1:431,17\n161#1:451,8\n161#1:459,6\n190#1:466\n190#1:467\n190#1:469\n190#1:473,7\n190#1:481,9\n190#1:490,6\n190#1:497,2\n190#1:502,17\n190#1:522,8\n190#1:530,6\n161#1:425\n190#1:496\n161#1:428,3\n161#1:448,3\n190#1:499,3\n190#1:519,3\n*E\n"})
/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt {

    @l
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";

    @l
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final FocusTargetNode activeNode(FocusTargetNode focusTargetNode) {
        boolean z4;
        if (focusTargetNode.getFocusState() == FocusStateImpl.ActiveParent) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
            if (findActiveFocusNode != null) {
                return findActiveFocusNode;
            }
            throw new IllegalStateException(NoActiveChild.toString());
        }
        throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
    }

    /* renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m3452beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i5) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i5, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i5, rect)) {
            return false;
        }
        if (beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i5, rect)) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (!FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s()) && !FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s()) && beamBeats_I7lrPNg$majorAxisDistance$6(rect2, i5, rect) >= beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i5, rect)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i5, Rect rect2) {
        boolean m3413equalsimpl0;
        boolean m3413equalsimpl02;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s())) {
            m3413equalsimpl0 = true;
        } else {
            m3413equalsimpl0 = FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s());
        }
        if (m3413equalsimpl0) {
            if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
                return true;
            }
        } else {
            if (FocusDirection.m3413equalsimpl0(i5, companion.m3426getUpdhqQ8s())) {
                m3413equalsimpl02 = true;
            } else {
                m3413equalsimpl02 = FocusDirection.m3413equalsimpl0(i5, companion.m3419getDowndhqQ8s());
            }
            if (m3413equalsimpl02) {
                if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                    return true;
                }
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i5, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s())) {
            if (rect2.getLeft() >= rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s())) {
            if (rect2.getRight() <= rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3426getUpdhqQ8s())) {
            if (rect2.getTop() >= rect.getBottom()) {
                return true;
            }
        } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3419getDowndhqQ8s())) {
            if (rect2.getBottom() <= rect.getTop()) {
                return true;
            }
        } else {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        }
        return false;
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistance$6(Rect rect, int i5, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f5;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s())) {
            top2 = rect2.getLeft();
            bottom2 = rect.getRight();
        } else {
            if (FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3426getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3419getDowndhqQ8s())) {
                top = rect.getTop();
                bottom = rect2.getBottom();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f5 = top - bottom;
            return Math.max(0.0f, f5);
        }
        f5 = top2 - bottom2;
        return Math.max(0.0f, f5);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i5, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f5;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s())) {
            top = rect2.getLeft();
            top2 = rect.getLeft();
        } else {
            if (FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3426getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3419getDowndhqQ8s())) {
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f5 = bottom - bottom2;
            return Math.max(1.0f, f5);
        }
        f5 = top - top2;
        return Math.max(1.0f, f5);
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final void collectAccessibleChildren(DelegatableNode delegatableNode, MutableVector<FocusTargetNode> mutableVector) {
        boolean z4;
        boolean z5;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(1024);
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                                    if (focusTargetNode.isAttached()) {
                                        if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                            mutableVector.add(focusTargetNode);
                                        } else {
                                            collectAccessibleChildren(focusTargetNode, mutableVector);
                                        }
                                    }
                                } else {
                                    if ((node.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 && (node instanceof DelegatingNode)) {
                                        int i5 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                i5++;
                                                if (i5 == 1) {
                                                    node = delegate$ui_release;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        mutableVector3.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector3.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector3);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetNode m3453findBestCandidate4WY_MpI(MutableVector<FocusTargetNode> mutableVector, Rect rect, int i5) {
        Rect translate;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s())) {
            translate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s())) {
            translate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3426getUpdhqQ8s())) {
            translate = rect.translate(0.0f, rect.getHeight() + 1);
        } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3419getDowndhqQ8s())) {
            translate = rect.translate(0.0f, -(rect.getHeight() + 1));
        } else {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        }
        int size = mutableVector.getSize();
        FocusTargetNode focusTargetNode = null;
        if (size > 0) {
            FocusTargetNode[] content = mutableVector.getContent();
            int i6 = 0;
            do {
                FocusTargetNode focusTargetNode2 = content[i6];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                    Rect focusRect = FocusTraversalKt.focusRect(focusTargetNode2);
                    if (m3456isBetterCandidateI7lrPNg(focusRect, translate, rect, i5)) {
                        focusTargetNode = focusTargetNode2;
                        translate = focusRect;
                    }
                }
                i6++;
            } while (i6 < size);
        }
        return focusTargetNode;
    }

    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m3454findChildCorrespondingToFocusEnterOMvw8(@l FocusTargetNode focusTargetNode, int i5, @l v3.l<? super FocusTargetNode, Boolean> lVar) {
        boolean m3413equalsimpl0;
        Rect bottomRight;
        Object obj;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        collectAccessibleChildren(focusTargetNode, mutableVector);
        boolean z4 = true;
        if (mutableVector.getSize() <= 1) {
            if (mutableVector.isEmpty()) {
                obj = null;
            } else {
                obj = mutableVector.getContent()[0];
            }
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) obj;
            if (focusTargetNode2 == null) {
                return false;
            }
            return lVar.invoke(focusTargetNode2).booleanValue();
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3420getEnterdhqQ8s())) {
            i5 = companion.m3425getRightdhqQ8s();
        }
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s())) {
            m3413equalsimpl0 = true;
        } else {
            m3413equalsimpl0 = FocusDirection.m3413equalsimpl0(i5, companion.m3419getDowndhqQ8s());
        }
        if (m3413equalsimpl0) {
            bottomRight = topLeft(FocusTraversalKt.focusRect(focusTargetNode));
        } else {
            if (!FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s())) {
                z4 = FocusDirection.m3413equalsimpl0(i5, companion.m3426getUpdhqQ8s());
            }
            if (z4) {
                bottomRight = bottomRight(FocusTraversalKt.focusRect(focusTargetNode));
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
        }
        FocusTargetNode m3453findBestCandidate4WY_MpI = m3453findBestCandidate4WY_MpI(mutableVector, bottomRight, i5);
        if (m3453findBestCandidate4WY_MpI == null) {
            return false;
        }
        return lVar.invoke(m3453findBestCandidate4WY_MpI).booleanValue();
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m3455generateAndSearchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i5, v3.l<? super FocusTargetNode, Boolean> lVar) {
        if (m3457searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i5, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m3409searchBeyondBoundsOMvw8(focusTargetNode, i5, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetNode, focusTargetNode2, i5, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }

    /* renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    private static final boolean m3456isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i5) {
        if (!isBetterCandidate_I7lrPNg$isCandidate(rect, i5, rect3)) {
            return false;
        }
        if (isBetterCandidate_I7lrPNg$isCandidate(rect2, i5, rect3) && !m3452beamBeatsI7lrPNg(rect3, rect, rect2, i5) && (m3452beamBeatsI7lrPNg(rect3, rect2, rect, i5) || isBetterCandidate_I7lrPNg$weightedDistance(i5, rect3, rect) >= isBetterCandidate_I7lrPNg$weightedDistance(i5, rect3, rect2))) {
            return false;
        }
        return true;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i5, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s())) {
            if ((rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s())) {
            if ((rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3426getUpdhqQ8s())) {
            if ((rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop()) {
                return true;
            }
        } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3419getDowndhqQ8s())) {
            if ((rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom()) {
                return true;
            }
        } else {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        }
        return false;
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i5, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f5;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s())) {
            top2 = rect2.getLeft();
            bottom2 = rect.getRight();
        } else {
            if (FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3426getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3419getDowndhqQ8s())) {
                top = rect.getTop();
                bottom = rect2.getBottom();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f5 = top - bottom;
            return Math.max(0.0f, f5);
        }
        f5 = top2 - bottom2;
        return Math.max(0.0f, f5);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i5, Rect rect2) {
        boolean m3413equalsimpl0;
        float f5;
        float left;
        float left2;
        float width;
        FocusDirection.Companion companion = FocusDirection.Companion;
        boolean z4 = true;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s())) {
            m3413equalsimpl0 = true;
        } else {
            m3413equalsimpl0 = FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s());
        }
        if (m3413equalsimpl0) {
            f5 = 2;
            left = rect2.getTop() + (rect2.getHeight() / f5);
            left2 = rect.getTop();
            width = rect.getHeight();
        } else {
            if (!FocusDirection.m3413equalsimpl0(i5, companion.m3426getUpdhqQ8s())) {
                z4 = FocusDirection.m3413equalsimpl0(i5, companion.m3419getDowndhqQ8s());
            }
            if (z4) {
                f5 = 2;
                left = rect2.getLeft() + (rect2.getWidth() / f5);
                left2 = rect.getLeft();
                width = rect.getWidth();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
        }
        return left - (left2 + (width / f5));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i5, Rect rect, Rect rect2) {
        long abs = Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i5, rect));
        long abs2 = Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i5, rect));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m3457searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i5, v3.l<? super FocusTargetNode, Boolean> lVar) {
        FocusTargetNode m3453findBestCandidate4WY_MpI;
        boolean z4;
        boolean z5;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m5204constructorimpl = NodeKind.m5204constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    mutableVector.add((FocusTargetNode) node);
                                } else {
                                    if ((node.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 && (node instanceof DelegatingNode)) {
                                        int i6 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                i6++;
                                                if (i6 == 1) {
                                                    node = delegate$ui_release;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        mutableVector3.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector3.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector3);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            while (mutableVector.isNotEmpty() && (m3453findBestCandidate4WY_MpI = m3453findBestCandidate4WY_MpI(mutableVector, FocusTraversalKt.focusRect(focusTargetNode2), i5)) != null) {
                if (m3453findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getCanFocus()) {
                    return lVar.invoke(m3453findBestCandidate4WY_MpI).booleanValue();
                }
                if (m3455generateAndSearchChildren4C6V_qg(m3453findBestCandidate4WY_MpI, focusTargetNode2, i5, lVar)) {
                    return true;
                }
                mutableVector.remove(m3453findBestCandidate4WY_MpI);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    @m
    /* renamed from: twoDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final Boolean m3458twoDimensionalFocusSearchOMvw8(@l FocusTargetNode focusTargetNode, int i5, @l v3.l<? super FocusTargetNode, Boolean> lVar) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i6 = iArr[focusState.ordinal()];
        if (i6 != 1) {
            if (i6 != 2 && i6 != 3) {
                if (i6 == 4) {
                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                        return lVar.invoke(focusTargetNode);
                    }
                    return Boolean.FALSE;
                }
                throw new j0();
            }
            return Boolean.valueOf(m3454findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i5, lVar));
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            int i7 = iArr[activeChild.getFocusState().ordinal()];
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    if (i7 != 4) {
                        throw new j0();
                    }
                    throw new IllegalStateException(NoActiveChild.toString());
                }
                return Boolean.valueOf(m3455generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, i5, lVar));
            }
            Boolean m3458twoDimensionalFocusSearchOMvw8 = m3458twoDimensionalFocusSearchOMvw8(activeChild, i5, lVar);
            if (!l0.g(m3458twoDimensionalFocusSearchOMvw8, Boolean.FALSE)) {
                return m3458twoDimensionalFocusSearchOMvw8;
            }
            return Boolean.valueOf(m3455generateAndSearchChildren4C6V_qg(focusTargetNode, activeNode(activeChild), i5, lVar));
        }
        throw new IllegalStateException(NoActiveChild.toString());
    }
}
