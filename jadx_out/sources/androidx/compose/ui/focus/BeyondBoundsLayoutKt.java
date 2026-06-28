package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0002\b\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/u;", "block", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILv3/l;)Ljava/lang/Object;", "searchBeyondBounds", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBeyondBoundsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,58:1\n90#2:59\n262#3:60\n230#3,5:61\n58#3:66\n59#3,8:68\n385#3,5:76\n263#3:81\n390#3:82\n395#3,2:84\n397#3,8:89\n405#3,9:100\n414#3,8:112\n68#3,7:120\n265#3:127\n1#4:67\n261#5:83\n234#6,3:86\n237#6,3:109\n1208#7:97\n1187#7,2:98\n*S KotlinDebug\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n*L\n39#1:59\n39#1:60\n39#1:61,5\n39#1:66\n39#1:68,8\n39#1:76,5\n39#1:81\n39#1:82\n39#1:84,2\n39#1:89,8\n39#1:100,9\n39#1:112,8\n39#1:120,7\n39#1:127\n39#1:67\n39#1:83\n39#1:86,3\n39#1:109,3\n39#1:97\n39#1:98,2\n*E\n"})
/* loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    @m
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m3409searchBeyondBoundsOMvw8(@l FocusTargetNode focusTargetNode, int i5, @l v3.l<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> lVar) {
        Modifier.Node node;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int m4984getBeforehoxUOeE;
        NodeChain nodes$ui_release;
        boolean z4;
        boolean z5;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode != null) {
                    if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                node = parent$ui_release;
                                MutableVector mutableVector = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        break loop0;
                                    }
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
                                        if (i6 == 1) {
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
                } else {
                    node = null;
                    break;
                }
            }
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
            if ((focusTargetNode2 != null && l0.g(focusTargetNode2.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) == null) {
                return null;
            }
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m3413equalsimpl0(i5, companion.m3426getUpdhqQ8s())) {
                m4984getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m4982getAbovehoxUOeE();
            } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3419getDowndhqQ8s())) {
                m4984getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m4985getBelowhoxUOeE();
            } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3422getLeftdhqQ8s())) {
                m4984getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m4986getLefthoxUOeE();
            } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3425getRightdhqQ8s())) {
                m4984getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m4987getRighthoxUOeE();
            } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3423getNextdhqQ8s())) {
                m4984getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m4983getAfterhoxUOeE();
            } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3424getPreviousdhqQ8s())) {
                m4984getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m4984getBeforehoxUOeE();
            } else {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            return (T) beyondBoundsLayoutParent.mo713layouto7g1Pn8(m4984getBeforehoxUOeE, lVar);
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }
}
