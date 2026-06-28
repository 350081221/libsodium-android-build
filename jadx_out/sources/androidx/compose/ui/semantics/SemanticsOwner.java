package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsOwner;", "", "rootNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "rootSemanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRootSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedRootSemanticsNode", "getUnmergedRootSemanticsNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwner\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,100:1\n76#2:101\n771#3:102\n702#3,8:103\n725#3,3:111\n710#3,2:114\n703#3:116\n772#3:122\n704#3,11:161\n728#3,3:172\n715#3:175\n705#3:176\n774#3:177\n385#4,5:117\n390#4:123\n395#4,2:125\n397#4,8:130\n405#4,9:141\n414#4,8:153\n261#5:124\n234#6,3:127\n237#6,3:150\n1208#7:138\n1187#7,2:139\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwner\n*L\n42#1:101\n42#1:102\n42#1:103,8\n42#1:111,3\n42#1:114,2\n42#1:116\n42#1:122\n42#1:161,11\n42#1:172,3\n42#1:175\n42#1:176\n42#1:177\n42#1:117,5\n42#1:123\n42#1:125,2\n42#1:130,8\n42#1:141,9\n42#1:153,8\n42#1:124\n42#1:127,3\n42#1:150,3\n42#1:138\n42#1:139,2\n*E\n"})
/* loaded from: classes.dex */
public final class SemanticsOwner {
    public static final int $stable = 8;

    @l
    private final LayoutNode rootNode;

    public SemanticsOwner(@l LayoutNode layoutNode) {
        this.rootNode = layoutNode;
    }

    @l
    public final SemanticsNode getRootSemanticsNode() {
        return SemanticsNodeKt.SemanticsNode(this.rootNode, true);
    }

    @l
    public final SemanticsNode getUnmergedRootSemanticsNode() {
        boolean z4;
        boolean z5;
        NodeChain nodes$ui_release = this.rootNode.getNodes$ui_release();
        int m5204constructorimpl = NodeKind.m5204constructorimpl(8);
        Object obj = null;
        if ((NodeChain.access$getAggregateChildKindSet(nodes$ui_release) & m5204constructorimpl) != 0) {
            Modifier.Node head$ui_release = nodes$ui_release.getHead$ui_release();
            loop0: while (true) {
                if (head$ui_release == null) {
                    break;
                }
                if ((head$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    Modifier.Node node = head$ui_release;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof SemanticsModifierNode) {
                            obj = node;
                            break loop0;
                        }
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
                        node = DelegatableNodeKt.access$pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                    break;
                }
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        l0.m(obj);
        return new SemanticsNode(((SemanticsModifierNode) obj).getNode(), false, this.rootNode, new SemanticsConfiguration());
    }
}
