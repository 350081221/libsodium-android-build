package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
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
import p4.m;

@i0(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\"\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0000\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0007H\u0002\u001a\"\u0010\u0011\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0013H\u0000\u001a\f\u0010\u0014\u001a\u00020\u0010*\u00020\u0007H\u0002\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"outerMergingSemantics", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/LayoutNode;", "getOuterMergingSemantics", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/SemanticsModifierNode;", "role", "Landroidx/compose/ui/semantics/Role;", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRole", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;", "SemanticsNode", "layoutNode", "mergingEnabled", "", "outerSemanticsNode", "contentDescriptionFakeNodeId", "", "findClosestParentNode", "selector", "Lkotlin/Function1;", "roleFakeNodeId", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,475:1\n76#2:476\n76#2:553\n771#3:477\n702#3,8:478\n725#3,3:486\n710#3,2:489\n703#3:491\n772#3:497\n704#3,11:536\n728#3,3:547\n715#3:550\n705#3:551\n774#3:552\n695#3,15:554\n725#3,3:569\n710#3,2:572\n703#3:574\n696#3,2:580\n704#3,11:620\n728#3,3:631\n715#3:634\n705#3:635\n698#3:636\n385#4,5:492\n390#4:498\n395#4,2:500\n397#4,8:505\n405#4,9:516\n414#4,8:528\n385#4,5:575\n390#4:582\n395#4,2:584\n397#4,8:589\n405#4,9:600\n414#4,8:612\n261#5:499\n261#5:583\n234#6,3:502\n237#6,3:525\n234#6,3:586\n237#6,3:609\n1208#7:513\n1187#7,2:514\n1208#7:597\n1187#7,2:598\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n45#1:476\n450#1:553\n45#1:477\n45#1:478,8\n45#1:486,3\n45#1:489,2\n45#1:491\n45#1:497\n45#1:536,11\n45#1:547,3\n45#1:550\n45#1:551\n45#1:552\n450#1:554,15\n450#1:569,3\n450#1:572,2\n450#1:574\n450#1:580,2\n450#1:620,11\n450#1:631,3\n450#1:634\n450#1:635\n450#1:636\n45#1:492,5\n45#1:498\n45#1:500,2\n45#1:505,8\n45#1:516,9\n45#1:528,8\n450#1:575,5\n450#1:582\n450#1:584,2\n450#1:589,8\n450#1:600,9\n450#1:612,8\n45#1:499\n450#1:583\n45#1:502,3\n45#1:525,3\n450#1:586,3\n450#1:609,3\n45#1:513\n45#1:514,2\n450#1:597\n450#1:598,2\n*E\n"})
/* loaded from: classes.dex */
public final class SemanticsNodeKt {
    @l
    public static final SemanticsNode SemanticsNode(@l LayoutNode layoutNode, boolean z4) {
        NodeChain nodes$ui_release = layoutNode.getNodes$ui_release();
        int m5204constructorimpl = NodeKind.m5204constructorimpl(8);
        Object obj = null;
        if ((nodes$ui_release.getAggregateChildKindSet() & m5204constructorimpl) != 0) {
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
                        if (((node.getKindSet$ui_release() & m5204constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                            int i5 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
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
                        node = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                    break;
                }
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        l0.m(obj);
        Modifier.Node node2 = ((SemanticsModifierNode) obj).getNode();
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        l0.m(collapsedSemantics$ui_release);
        return new SemanticsNode(node2, z4, layoutNode, collapsedSemantics$ui_release);
    }

    public static /* synthetic */ SemanticsNode SemanticsNode$default(SemanticsModifierNode semanticsModifierNode, boolean z4, LayoutNode layoutNode, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            layoutNode = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode);
        }
        return SemanticsNode(semanticsModifierNode, z4, layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int contentDescriptionFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    @m
    public static final LayoutNode findClosestParentNode(@l LayoutNode layoutNode, @l v3.l<? super LayoutNode, Boolean> lVar) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (lVar.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    @m
    public static final SemanticsModifierNode getOuterMergingSemantics(@l LayoutNode layoutNode) {
        boolean z4;
        boolean z5;
        NodeChain nodes$ui_release = layoutNode.getNodes$ui_release();
        int m5204constructorimpl = NodeKind.m5204constructorimpl(8);
        Object obj = null;
        if ((nodes$ui_release.getAggregateChildKindSet() & m5204constructorimpl) != 0) {
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
                            if (((SemanticsModifierNode) node).getShouldMergeDescendantSemantics()) {
                                obj = node;
                                break loop0;
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
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                    break;
                }
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        return (SemanticsModifierNode) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Role getRole(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int roleFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }

    @l
    public static final SemanticsNode SemanticsNode(@l SemanticsModifierNode semanticsModifierNode, boolean z4, @l LayoutNode layoutNode) {
        Modifier.Node node = semanticsModifierNode.getNode();
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        if (collapsedSemantics$ui_release == null) {
            collapsedSemantics$ui_release = new SemanticsConfiguration();
        }
        return new SemanticsNode(node, z4, layoutNode, collapsedSemantics$ui_release);
    }
}
