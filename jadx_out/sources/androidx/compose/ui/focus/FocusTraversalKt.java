package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a&\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a:\u0010\u000e\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\f\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002\"\u0018\u0010\u0013\u001a\u00020\n*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch", "Lkotlin/Function1;", "", "onFound", "focusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Lv3/l;)Z", "focusSearch", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "findActiveFocusNode", "findNonDeactivatedParent", "isEligibleForFocusSearch", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "getActiveChild", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "activeChild", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,169:1\n1#2:170\n1#2:174\n1#2:245\n1#2:320\n90#3:171\n90#3:242\n90#3:313\n276#4:172\n133#4:173\n134#4:175\n135#4,7:179\n142#4,9:187\n385#4,6:196\n395#4,2:203\n397#4,17:208\n414#4,8:228\n151#4,6:236\n276#4:243\n133#4:244\n134#4:246\n135#4,7:250\n142#4,9:258\n385#4,6:267\n395#4,2:274\n397#4,17:279\n414#4,8:299\n151#4,6:307\n230#4,5:314\n58#4:319\n59#4,8:321\n385#4,6:329\n395#4,2:336\n397#4,8:341\n405#4,9:352\n414#4,8:364\n68#4,7:372\n1208#5:176\n1187#5,2:177\n1208#5:247\n1187#5,2:248\n1208#5:349\n1187#5,2:350\n48#6:186\n48#6:257\n261#7:202\n261#7:273\n261#7:335\n234#8,3:205\n237#8,3:225\n234#8,3:276\n237#8,3:296\n234#8,3:338\n237#8,3:361\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n139#1:174\n153#1:245\n164#1:320\n139#1:171\n153#1:242\n164#1:313\n139#1:172\n139#1:173\n139#1:175\n139#1:179,7\n139#1:187,9\n139#1:196,6\n139#1:203,2\n139#1:208,17\n139#1:228,8\n139#1:236,6\n153#1:243\n153#1:244\n153#1:246\n153#1:250,7\n153#1:258,9\n153#1:267,6\n153#1:274,2\n153#1:279,17\n153#1:299,8\n153#1:307,6\n164#1:314,5\n164#1:319\n164#1:321,8\n164#1:329,6\n164#1:336,2\n164#1:341,8\n164#1:352,9\n164#1:364,8\n164#1:372,7\n139#1:176\n139#1:177,2\n153#1:247\n153#1:248,2\n164#1:349\n164#1:350,2\n139#1:186\n153#1:257\n139#1:202\n153#1:273\n164#1:335\n139#1:205,3\n139#1:225,3\n153#1:276,3\n153#1:296,3\n164#1:338,3\n164#1:361,3\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTraversalKt {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @l
    /* renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m3445customFocusSearchOMvw8(@l FocusTargetNode focusTargetNode, int i5, @l LayoutDirection layoutDirection) {
        FocusRequester end;
        FocusProperties fetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3423getNextdhqQ8s())) {
            return fetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3424getPreviousdhqQ8s())) {
            return fetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3426getUpdhqQ8s())) {
            return fetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3419getDowndhqQ8s())) {
            return fetchFocusProperties$ui_release.getDown();
        }
        boolean z4 = false;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s())) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    end = fetchFocusProperties$ui_release.getEnd();
                } else {
                    throw new j0();
                }
            } else {
                end = fetchFocusProperties$ui_release.getStart();
            }
            if (end == FocusRequester.Companion.getDefault()) {
                z4 = true;
            }
            if (z4) {
                end = null;
            }
            if (end == null) {
                return fetchFocusProperties$ui_release.getLeft();
            }
        } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s())) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    end = fetchFocusProperties$ui_release.getStart();
                } else {
                    throw new j0();
                }
            } else {
                end = fetchFocusProperties$ui_release.getEnd();
            }
            if (end == FocusRequester.Companion.getDefault()) {
                z4 = true;
            }
            if (z4) {
                end = null;
            }
            if (end == null) {
                return fetchFocusProperties$ui_release.getRight();
            }
        } else {
            if (FocusDirection.m3413equalsimpl0(i5, companion.m3420getEnterdhqQ8s())) {
                return fetchFocusProperties$ui_release.getEnter().invoke(FocusDirection.m3410boximpl(i5));
            }
            if (FocusDirection.m3413equalsimpl0(i5, companion.m3421getExitdhqQ8s())) {
                return fetchFocusProperties$ui_release.getExit().invoke(FocusDirection.m3410boximpl(i5));
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return end;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x004f, code lost:
    
        continue;
     */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode(@p4.l androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode findNonDeactivatedParent(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        boolean z4;
        boolean z5;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            Modifier.Node node = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                    if (focusTargetNode2.fetchFocusProperties$ui_release().getCanFocus()) {
                                        return focusTargetNode2;
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
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        mutableVector.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @l
    public static final Rect focusRect(@l FocusTargetNode focusTargetNode) {
        Rect localBoundingBoxOf;
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        if (coordinator$ui_release == null || (localBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(coordinator$ui_release).localBoundingBoxOf(coordinator$ui_release, false)) == null) {
            return Rect.Companion.getZero();
        }
        return localBoundingBoxOf;
    }

    /* renamed from: focusSearch-sMXa3k8, reason: not valid java name */
    public static final boolean m3446focusSearchsMXa3k8(@l FocusTargetNode focusTargetNode, int i5, @l LayoutDirection layoutDirection, @l v3.l<? super FocusTargetNode, Boolean> lVar) {
        boolean m3413equalsimpl0;
        boolean m3413equalsimpl02;
        boolean m3413equalsimpl03;
        boolean m3413equalsimpl04;
        FocusTargetNode focusTargetNode2;
        int m3425getRightdhqQ8s;
        Boolean m3458twoDimensionalFocusSearchOMvw8;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3423getNextdhqQ8s())) {
            m3413equalsimpl0 = true;
        } else {
            m3413equalsimpl0 = FocusDirection.m3413equalsimpl0(i5, companion.m3424getPreviousdhqQ8s());
        }
        if (m3413equalsimpl0) {
            return OneDimensionalFocusSearchKt.m3449oneDimensionalFocusSearchOMvw8(focusTargetNode, i5, lVar);
        }
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s())) {
            m3413equalsimpl02 = true;
        } else {
            m3413equalsimpl02 = FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s());
        }
        if (m3413equalsimpl02) {
            m3413equalsimpl03 = true;
        } else {
            m3413equalsimpl03 = FocusDirection.m3413equalsimpl0(i5, companion.m3426getUpdhqQ8s());
        }
        if (m3413equalsimpl03) {
            m3413equalsimpl04 = true;
        } else {
            m3413equalsimpl04 = FocusDirection.m3413equalsimpl0(i5, companion.m3419getDowndhqQ8s());
        }
        if (m3413equalsimpl04) {
            Boolean m3458twoDimensionalFocusSearchOMvw82 = TwoDimensionalFocusSearchKt.m3458twoDimensionalFocusSearchOMvw8(focusTargetNode, i5, lVar);
            if (m3458twoDimensionalFocusSearchOMvw82 != null) {
                return m3458twoDimensionalFocusSearchOMvw82.booleanValue();
            }
        } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3420getEnterdhqQ8s())) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    m3425getRightdhqQ8s = companion.m3422getLeftdhqQ8s();
                } else {
                    throw new j0();
                }
            } else {
                m3425getRightdhqQ8s = companion.m3425getRightdhqQ8s();
            }
            FocusTargetNode findActiveFocusNode = findActiveFocusNode(focusTargetNode);
            if (findActiveFocusNode != null && (m3458twoDimensionalFocusSearchOMvw8 = TwoDimensionalFocusSearchKt.m3458twoDimensionalFocusSearchOMvw8(findActiveFocusNode, m3425getRightdhqQ8s, lVar)) != null) {
                return m3458twoDimensionalFocusSearchOMvw8.booleanValue();
            }
        } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3421getExitdhqQ8s())) {
            FocusTargetNode findActiveFocusNode2 = findActiveFocusNode(focusTargetNode);
            if (findActiveFocusNode2 != null) {
                focusTargetNode2 = findNonDeactivatedParent(findActiveFocusNode2);
            } else {
                focusTargetNode2 = null;
            }
            if (focusTargetNode2 != null && !l0.g(focusTargetNode2, focusTargetNode)) {
                return lVar.invoke(focusTargetNode2).booleanValue();
            }
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m3415toStringimpl(i5))).toString());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x003b, code lost:
    
        continue;
     */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode getActiveChild(@p4.l androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean isEligibleForFocusSearch(@l FocusTargetNode focusTargetNode) {
        boolean z4;
        boolean z5;
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        if (coordinator$ui_release != null && (layoutNode2 = coordinator$ui_release.getLayoutNode()) != null && layoutNode2.isPlaced()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            NodeCoordinator coordinator$ui_release2 = focusTargetNode.getCoordinator$ui_release();
            if (coordinator$ui_release2 != null && (layoutNode = coordinator$ui_release2.getLayoutNode()) != null && layoutNode.isAttached()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return true;
            }
        }
        return false;
    }
}
