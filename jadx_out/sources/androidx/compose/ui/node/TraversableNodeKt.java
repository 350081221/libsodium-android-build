package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0006\u001a(\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u001a/\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a(\u0010\r\u001a\u00020\n*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u001a/\u0010\r\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\f\u001a(\u0010\u000f\u001a\u00020\n*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0007\u001a/\u0010\u000f\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", DatabaseFileArchive.COLUMN_KEY, "Landroidx/compose/ui/node/TraversableNode;", "findNearestAncestor", "T", "(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode;", "Lkotlin/Function1;", "", "block", "Lkotlin/r2;", "traverseAncestors", "(Landroidx/compose/ui/node/TraversableNode;Lv3/l;)V", "traverseChildren", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "traverseDescendants", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTraversableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,230:1\n106#2:231\n106#2:297\n106#2:363\n106#2:429\n106#2:495\n106#2:566\n106#2:637\n106#2:710\n230#3,5:232\n58#3:237\n59#3,8:239\n385#3,6:247\n395#3,2:254\n397#3,8:259\n405#3,9:270\n414#3,8:282\n68#3,7:290\n230#3,5:298\n58#3:303\n59#3,8:305\n385#3,6:313\n395#3,2:320\n397#3,8:325\n405#3,9:336\n414#3,8:348\n68#3,7:356\n230#3,5:364\n58#3:369\n59#3,8:371\n385#3,6:379\n395#3,2:386\n397#3,8:391\n405#3,9:402\n414#3,8:414\n68#3,7:422\n230#3,5:430\n58#3:435\n59#3,8:437\n385#3,6:445\n395#3,2:452\n397#3,8:457\n405#3,9:468\n414#3,8:480\n68#3,7:488\n276#3:496\n133#3:497\n134#3:499\n135#3,7:503\n142#3,9:511\n385#3,6:520\n395#3,2:527\n397#3,17:532\n414#3,8:552\n151#3,6:560\n276#3:567\n133#3:568\n134#3:570\n135#3,7:574\n142#3,9:582\n385#3,6:591\n395#3,2:598\n397#3,17:603\n414#3,8:623\n151#3,6:631\n289#3:638\n163#3:639\n164#3:641\n165#3,12:645\n290#3:657\n385#3,5:658\n291#3,2:663\n390#3:665\n395#3,2:667\n397#3,17:672\n414#3,8:692\n293#3:700\n177#3,8:701\n294#3:709\n289#3:711\n163#3:712\n164#3:714\n165#3,12:718\n290#3:730\n385#3,5:731\n291#3,2:736\n390#3:738\n395#3,2:740\n397#3,17:745\n414#3,8:765\n293#3:773\n177#3,8:774\n294#3:782\n1#4:238\n1#4:304\n1#4:370\n1#4:436\n1#4:498\n1#4:569\n1#4:640\n1#4:713\n261#5:253\n261#5:319\n261#5:385\n261#5:451\n261#5:526\n261#5:597\n261#5:666\n261#5:739\n234#6,3:256\n237#6,3:279\n234#6,3:322\n237#6,3:345\n234#6,3:388\n237#6,3:411\n234#6,3:454\n237#6,3:477\n234#6,3:529\n237#6,3:549\n234#6,3:600\n237#6,3:620\n234#6,3:669\n237#6,3:689\n234#6,3:742\n237#6,3:762\n1208#7:267\n1187#7,2:268\n1208#7:333\n1187#7,2:334\n1208#7:399\n1187#7,2:400\n1208#7:465\n1187#7,2:466\n1208#7:500\n1187#7,2:501\n1208#7:571\n1187#7,2:572\n1208#7:642\n1187#7,2:643\n1208#7:715\n1187#7,2:716\n48#8:510\n48#8:581\n*S KotlinDebug\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n*L\n58#1:231\n70#1:297\n92#1:363\n111#1:429\n138#1:495\n159#1:566\n187#1:637\n214#1:710\n58#1:232,5\n58#1:237\n58#1:239,8\n58#1:247,6\n58#1:254,2\n58#1:259,8\n58#1:270,9\n58#1:282,8\n58#1:290,7\n70#1:298,5\n70#1:303\n70#1:305,8\n70#1:313,6\n70#1:320,2\n70#1:325,8\n70#1:336,9\n70#1:348,8\n70#1:356,7\n92#1:364,5\n92#1:369\n92#1:371,8\n92#1:379,6\n92#1:386,2\n92#1:391,8\n92#1:402,9\n92#1:414,8\n92#1:422,7\n111#1:430,5\n111#1:435\n111#1:437,8\n111#1:445,6\n111#1:452,2\n111#1:457,8\n111#1:468,9\n111#1:480,8\n111#1:488,7\n138#1:496\n138#1:497\n138#1:499\n138#1:503,7\n138#1:511,9\n138#1:520,6\n138#1:527,2\n138#1:532,17\n138#1:552,8\n138#1:560,6\n159#1:567\n159#1:568\n159#1:570\n159#1:574,7\n159#1:582,9\n159#1:591,6\n159#1:598,2\n159#1:603,17\n159#1:623,8\n159#1:631,6\n187#1:638\n187#1:639\n187#1:641\n187#1:645,12\n187#1:657\n187#1:658,5\n187#1:663,2\n187#1:665\n187#1:667,2\n187#1:672,17\n187#1:692,8\n187#1:700\n187#1:701,8\n187#1:709\n214#1:711\n214#1:712\n214#1:714\n214#1:718,12\n214#1:730\n214#1:731,5\n214#1:736,2\n214#1:738\n214#1:740,2\n214#1:745,17\n214#1:765,8\n214#1:773\n214#1:774,8\n214#1:782\n58#1:238\n70#1:304\n92#1:370\n111#1:436\n138#1:498\n159#1:569\n187#1:640\n214#1:713\n58#1:253\n70#1:319\n92#1:385\n111#1:451\n138#1:526\n159#1:597\n187#1:666\n214#1:739\n58#1:256,3\n58#1:279,3\n70#1:322,3\n70#1:345,3\n92#1:388,3\n92#1:411,3\n111#1:454,3\n111#1:477,3\n138#1:529,3\n138#1:549,3\n159#1:600,3\n159#1:620,3\n187#1:669,3\n187#1:689,3\n214#1:742,3\n214#1:762,3\n58#1:267\n58#1:268,2\n70#1:333\n70#1:334,2\n92#1:399\n92#1:400,2\n111#1:465\n111#1:466,2\n138#1:500\n138#1:501,2\n159#1:571\n159#1:572,2\n187#1:642\n187#1:643,2\n214#1:715\n214#1:716,2\n138#1:510\n159#1:581\n*E\n"})
/* loaded from: classes.dex */
public final class TraversableNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @m
    public static final TraversableNode findNearestAncestor(@l DelegatableNode delegatableNode, @m Object obj) {
        NodeChain nodes$ui_release;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(262144);
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            DelegatingNode delegatingNode = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                    if (l0.g(obj, traversableNode.getTraverseKey())) {
                                        return traversableNode;
                                    }
                                } else {
                                    if (((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) && (delegatingNode instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                        int i5 = 0;
                                        delegatingNode = delegatingNode;
                                        while (delegate$ui_release != null) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
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
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    public static final void traverseAncestors(@l DelegatableNode delegatableNode, @m Object obj, @l v3.l<? super TraversableNode, Boolean> lVar) {
        NodeChain nodes$ui_release;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(262144);
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            DelegatingNode delegatingNode = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                    if (!(l0.g(obj, traversableNode.getTraverseKey()) ? lVar.invoke(traversableNode).booleanValue() : true)) {
                                        return;
                                    }
                                } else {
                                    if (((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) && (delegatingNode instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                        int i5 = 0;
                                        delegatingNode = delegatingNode;
                                        while (delegate$ui_release != null) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
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
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x002f, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v8, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void traverseChildren(@p4.l androidx.compose.ui.node.DelegatableNode r10, @p4.m java.lang.Object r11, @p4.l v3.l<? super androidx.compose.ui.node.TraversableNode, java.lang.Boolean> r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.ui.node.NodeKind.m5204constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r10.getNode()
            boolean r1 = r1.isAttached()
            if (r1 == 0) goto Lc9
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r10.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            if (r3 != 0) goto L2c
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r10)
            goto L2f
        L2c:
            r1.add(r3)
        L2f:
            boolean r10 = r1.isNotEmpty()
            if (r10 == 0) goto Lc8
            int r10 = r1.getSize()
            r3 = 1
            int r10 = r10 - r3
            java.lang.Object r10 = r1.removeAt(r10)
            androidx.compose.ui.Modifier$Node r10 = (androidx.compose.ui.Modifier.Node) r10
            int r5 = r10.getAggregateChildKindSet$ui_release()
            r5 = r5 & r0
            if (r5 != 0) goto L4c
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r10)
            goto L2f
        L4c:
            if (r10 == 0) goto L2f
            int r5 = r10.getKindSet$ui_release()
            r5 = r5 & r0
            if (r5 == 0) goto Lc3
            r5 = 0
            r6 = r5
        L57:
            if (r10 == 0) goto L2f
            boolean r7 = r10 instanceof androidx.compose.ui.node.TraversableNode
            if (r7 == 0) goto L78
            androidx.compose.ui.node.TraversableNode r10 = (androidx.compose.ui.node.TraversableNode) r10
            java.lang.Object r7 = r10.getTraverseKey()
            boolean r7 = kotlin.jvm.internal.l0.g(r11, r7)
            if (r7 == 0) goto L74
            java.lang.Object r10 = r12.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            goto L75
        L74:
            r10 = r3
        L75:
            if (r10 != 0) goto Lbe
            return
        L78:
            int r7 = r10.getKindSet$ui_release()
            r7 = r7 & r0
            if (r7 == 0) goto L81
            r7 = r3
            goto L82
        L81:
            r7 = r4
        L82:
            if (r7 == 0) goto Lbe
            boolean r7 = r10 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto Lbe
            r7 = r10
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate$ui_release()
            r8 = r4
        L90:
            if (r7 == 0) goto Lbb
            int r9 = r7.getKindSet$ui_release()
            r9 = r9 & r0
            if (r9 == 0) goto L9b
            r9 = r3
            goto L9c
        L9b:
            r9 = r4
        L9c:
            if (r9 == 0) goto Lb6
            int r8 = r8 + 1
            if (r8 != r3) goto La4
            r10 = r7
            goto Lb6
        La4:
            if (r6 != 0) goto Lad
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r2]
            r6.<init>(r9, r4)
        Lad:
            if (r10 == 0) goto Lb3
            r6.add(r10)
            r10 = r5
        Lb3:
            r6.add(r7)
        Lb6:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui_release()
            goto L90
        Lbb:
            if (r8 != r3) goto Lbe
            goto L57
        Lbe:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L57
        Lc3:
            androidx.compose.ui.Modifier$Node r10 = r10.getChild$ui_release()
            goto L4c
        Lc8:
            return
        Lc9:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "visitChildren called on an unattached node"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.DelegatableNode, java.lang.Object, v3.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    public static final void traverseDescendants(@l DelegatableNode delegatableNode, @m Object obj, @l v3.l<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
        boolean z4;
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(262144);
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                    for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                        if ((node2.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            DelegatingNode delegatingNode = node2;
                            MutableVector mutableVector2 = null;
                            while (true) {
                                if (delegatingNode == 0) {
                                    z4 = true;
                                    break;
                                }
                                if (delegatingNode instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                    if (l0.g(obj, traversableNode.getTraverseKey())) {
                                        traverseDescendantsAction = lVar.invoke(traversableNode);
                                    } else {
                                        traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                    }
                                    if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                        return;
                                    }
                                    if (!(traverseDescendantsAction != TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal)) {
                                        z4 = false;
                                        break;
                                    }
                                } else if (((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i5 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector2.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector2.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector2);
                            }
                            if (z4) {
                            }
                        }
                    }
                }
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @m
    public static final <T extends TraversableNode> T findNearestAncestor(@l T t5) {
        NodeChain nodes$ui_release;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(262144);
        if (t5.getNode().isAttached()) {
            Modifier.Node parent$ui_release = t5.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(t5);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            DelegatingNode delegatingNode = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof TraversableNode) {
                                    T t6 = (T) delegatingNode;
                                    if (l0.g(t5.getTraverseKey(), t6.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t5, t6)) {
                                        return t6;
                                    }
                                } else {
                                    if (((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) && (delegatingNode instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                        int i5 = 0;
                                        delegatingNode = delegatingNode;
                                        while (delegate$ui_release != null) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
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
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    public static final <T extends TraversableNode> void traverseAncestors(@l T t5, @l v3.l<? super T, Boolean> lVar) {
        NodeChain nodes$ui_release;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(262144);
        if (t5.getNode().isAttached()) {
            Modifier.Node parent$ui_release = t5.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(t5);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            DelegatingNode delegatingNode = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                boolean z4 = true;
                                if (delegatingNode instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                    if (l0.g(t5.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t5, traversableNode)) {
                                        z4 = lVar.invoke(traversableNode).booleanValue();
                                    }
                                    if (!z4) {
                                        return;
                                    }
                                } else {
                                    if (((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) && (delegatingNode instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                        int i5 = 0;
                                        delegatingNode = delegatingNode;
                                        while (delegate$ui_release != null) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
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
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x002f, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.compose.ui.node.TraversableNode> void traverseChildren(@p4.l T r11, @p4.l v3.l<? super T, java.lang.Boolean> r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.ui.node.NodeKind.m5204constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r11.getNode()
            boolean r1 = r1.isAttached()
            if (r1 == 0) goto Ld4
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            if (r3 != 0) goto L2c
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3)
            goto L2f
        L2c:
            r1.add(r3)
        L2f:
            boolean r3 = r1.isNotEmpty()
            if (r3 == 0) goto Ld3
            int r3 = r1.getSize()
            r5 = 1
            int r3 = r3 - r5
            java.lang.Object r3 = r1.removeAt(r3)
            androidx.compose.ui.Modifier$Node r3 = (androidx.compose.ui.Modifier.Node) r3
            int r6 = r3.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L4c
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3)
            goto L2f
        L4c:
            if (r3 == 0) goto L2f
            int r6 = r3.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Lcd
            r6 = 0
            r7 = r6
        L57:
            if (r3 == 0) goto L2f
            boolean r8 = r3 instanceof androidx.compose.ui.node.TraversableNode
            if (r8 == 0) goto L82
            androidx.compose.ui.node.TraversableNode r3 = (androidx.compose.ui.node.TraversableNode) r3
            java.lang.Object r8 = r11.getTraverseKey()
            java.lang.Object r9 = r3.getTraverseKey()
            boolean r8 = kotlin.jvm.internal.l0.g(r8, r9)
            if (r8 == 0) goto L7e
            boolean r8 = androidx.compose.ui.Actual_jvmKt.areObjectsOfSameType(r11, r3)
            if (r8 == 0) goto L7e
            java.lang.Object r3 = r12.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L7f
        L7e:
            r3 = r5
        L7f:
            if (r3 != 0) goto Lc8
            return
        L82:
            int r8 = r3.getKindSet$ui_release()
            r8 = r8 & r0
            if (r8 == 0) goto L8b
            r8 = r5
            goto L8c
        L8b:
            r8 = r4
        L8c:
            if (r8 == 0) goto Lc8
            boolean r8 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r8 == 0) goto Lc8
            r8 = r3
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate$ui_release()
            r9 = r4
        L9a:
            if (r8 == 0) goto Lc5
            int r10 = r8.getKindSet$ui_release()
            r10 = r10 & r0
            if (r10 == 0) goto La5
            r10 = r5
            goto La6
        La5:
            r10 = r4
        La6:
            if (r10 == 0) goto Lc0
            int r9 = r9 + 1
            if (r9 != r5) goto Lae
            r3 = r8
            goto Lc0
        Lae:
            if (r7 != 0) goto Lb7
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r2]
            r7.<init>(r10, r4)
        Lb7:
            if (r3 == 0) goto Lbd
            r7.add(r3)
            r3 = r6
        Lbd:
            r7.add(r8)
        Lc0:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild$ui_release()
            goto L9a
        Lc5:
            if (r9 != r5) goto Lc8
            goto L57
        Lc8:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r7)
            goto L57
        Lcd:
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            goto L4c
        Ld3:
            return
        Ld4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "visitChildren called on an unattached node"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.TraversableNode, v3.l):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r7 == false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.compose.ui.node.TraversableNode> void traverseDescendants(@p4.l T r13, @p4.l v3.l<? super T, ? extends androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction> r14) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.traverseDescendants(androidx.compose.ui.node.TraversableNode, v3.l):void");
    }
}
