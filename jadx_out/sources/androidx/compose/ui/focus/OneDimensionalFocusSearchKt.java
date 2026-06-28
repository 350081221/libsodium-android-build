package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a2\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\t\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a \u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a:\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\r\u001a \u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a \u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a\f\u0010\u0013\u001a\u00020\u0004*\u00020\u0000H\u0002\u001aG\u0010\u0019\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0003H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aG\u0010\u001b\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0003H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001b\u0010\u001a\"\u001a\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 \"\u001a\u0010!\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\f\n\u0004\b!\u0010\u001e\u0012\u0004\b\"\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/Function1;", "", "onFound", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILv3/l;)Z", "oneDimensionalFocusSearch", "forwardFocusSearch", "backwardFocusSearch", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILv3/l;)Z", "generateAndSearchChildren", "searchChildren-4C6V_qg", "searchChildren", "pickChildForForwardSearch", "pickChildForBackwardSearch", "isRoot", "T", "Landroidx/compose/runtime/collection/MutableVector;", "item", "Lkotlin/r2;", "action", "forEachItemAfter", "(Landroidx/compose/runtime/collection/MutableVector;Ljava/lang/Object;Lv3/l;)V", "forEachItemBefore", "", "InvalidFocusDirection", "Ljava/lang/String;", "getInvalidFocusDirection$annotations", "()V", "NoActiveChild", "getNoActiveChild$annotations", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,266:1\n181#1,3:340\n184#1,2:344\n187#1,5:347\n196#1,3:352\n199#1,2:356\n202#1,5:359\n1187#2,2:267\n1208#2:274\n1187#2,2:275\n1187#2,2:364\n1208#2:371\n1187#2,2:372\n1187#2,2:448\n1208#2:455\n1187#2,2:456\n1208#2:570\n1187#2,2:571\n90#3:269\n90#3:366\n90#3:450\n90#3:532\n276#4:270\n133#4:271\n134#4:273\n135#4,7:277\n142#4,9:285\n385#4,6:294\n395#4,2:301\n397#4,17:306\n414#4,8:326\n151#4,6:334\n276#4:367\n133#4:368\n134#4:370\n135#4,7:374\n142#4,9:382\n385#4,6:391\n395#4,2:398\n397#4,17:403\n414#4,8:423\n151#4,6:431\n276#4:451\n133#4:452\n134#4:454\n135#4,7:458\n142#4,9:466\n385#4,6:475\n395#4,2:482\n397#4,17:487\n414#4,8:507\n151#4,6:515\n262#4:533\n230#4,5:534\n58#4:539\n59#4,8:541\n385#4,5:549\n263#4:554\n390#4:555\n395#4,2:557\n397#4,8:562\n405#4,9:573\n414#4,8:585\n68#4,7:593\n265#4:600\n1#5:272\n1#5:369\n1#5:453\n1#5:540\n48#6:284\n53#6:343\n523#6:346\n53#6:355\n523#6:358\n48#6:381\n204#6,11:437\n48#6:465\n492#6,11:521\n53#6:601\n523#6:602\n523#6:603\n53#6:604\n523#6:605\n523#6:606\n261#7:300\n261#7:397\n261#7:481\n261#7:556\n234#8,3:303\n237#8,3:323\n234#8,3:400\n237#8,3:420\n234#8,3:484\n237#8,3:504\n234#8,3:559\n237#8,3:582\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n133#1:340,3\n133#1:344,2\n133#1:347,5\n136#1:352,3\n136#1:356,2\n136#1:359,5\n128#1:267,2\n129#1:274\n129#1:275,2\n154#1:364,2\n155#1:371\n155#1:372,2\n164#1:448,2\n165#1:455\n165#1:456,2\n176#1:570\n176#1:571,2\n129#1:269\n155#1:366\n165#1:450\n176#1:532\n129#1:270\n129#1:271\n129#1:273\n129#1:277,7\n129#1:285,9\n129#1:294,6\n129#1:301,2\n129#1:306,17\n129#1:326,8\n129#1:334,6\n155#1:367\n155#1:368\n155#1:370\n155#1:374,7\n155#1:382,9\n155#1:391,6\n155#1:398,2\n155#1:403,17\n155#1:423,8\n155#1:431,6\n165#1:451\n165#1:452\n165#1:454\n165#1:458,7\n165#1:466,9\n165#1:475,6\n165#1:482,2\n165#1:487,17\n165#1:507,8\n165#1:515,6\n176#1:533\n176#1:534,5\n176#1:539\n176#1:541,8\n176#1:549,5\n176#1:554\n176#1:555\n176#1:557,2\n176#1:562,8\n176#1:573,9\n176#1:585,8\n176#1:593,7\n176#1:600\n129#1:272\n155#1:369\n165#1:453\n176#1:540\n129#1:284\n133#1:343\n133#1:346\n136#1:355\n136#1:358\n155#1:381\n158#1:437,11\n165#1:465\n168#1:521,11\n183#1:601\n185#1:602\n187#1:603\n198#1:604\n200#1:605\n202#1:606\n129#1:300\n155#1:397\n165#1:481\n176#1:556\n129#1:303,3\n129#1:323,3\n155#1:400,3\n155#1:420,3\n165#1:484,3\n165#1:504,3\n176#1:559,3\n176#1:582,3\n*E\n"})
/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {

    @l
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";

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

    private static final boolean backwardFocusSearch(FocusTargetNode focusTargetNode, v3.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z4;
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i5 = iArr[focusState.ordinal()];
        if (i5 != 1) {
            if (i5 != 2 && i5 != 3) {
                if (i5 == 4) {
                    if (!pickChildForBackwardSearch(focusTargetNode, lVar)) {
                        if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                            z4 = lVar.invoke(focusTargetNode).booleanValue();
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            return false;
                        }
                    }
                } else {
                    throw new j0();
                }
            } else {
                return pickChildForBackwardSearch(focusTargetNode, lVar);
            }
        } else {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild != null) {
                int i6 = iArr[activeChild.getFocusState().ordinal()];
                if (i6 != 1) {
                    if (i6 != 2 && i6 != 3) {
                        if (i6 != 4) {
                            throw new j0();
                        }
                        throw new IllegalStateException(NoActiveChild.toString());
                    }
                    return m3448generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m3424getPreviousdhqQ8s(), lVar);
                }
                if (!backwardFocusSearch(activeChild, lVar) && !m3448generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m3424getPreviousdhqQ8s(), lVar) && (!activeChild.fetchFocusProperties$ui_release().getCanFocus() || !lVar.invoke(activeChild).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException(NoActiveChild.toString());
            }
        }
        return true;
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t5, v3.l<? super T, r2> lVar) {
        boolean z4 = false;
        kotlin.ranges.l lVar2 = new kotlin.ranges.l(0, mutableVector.getSize() - 1);
        int e5 = lVar2.e();
        int g5 = lVar2.g();
        if (e5 > g5) {
            return;
        }
        while (true) {
            if (z4) {
                lVar.invoke(mutableVector.getContent()[e5]);
            }
            if (l0.g(mutableVector.getContent()[e5], t5)) {
                z4 = true;
            }
            if (e5 != g5) {
                e5++;
            } else {
                return;
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t5, v3.l<? super T, r2> lVar) {
        boolean z4 = false;
        kotlin.ranges.l lVar2 = new kotlin.ranges.l(0, mutableVector.getSize() - 1);
        int e5 = lVar2.e();
        int g5 = lVar2.g();
        if (e5 > g5) {
            return;
        }
        while (true) {
            if (z4) {
                lVar.invoke(mutableVector.getContent()[g5]);
            }
            if (l0.g(mutableVector.getContent()[g5], t5)) {
                z4 = true;
            }
            if (g5 != e5) {
                g5--;
            } else {
                return;
            }
        }
    }

    private static final boolean forwardFocusSearch(FocusTargetNode focusTargetNode, v3.l<? super FocusTargetNode, Boolean> lVar) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i5 != 1) {
            if (i5 != 2 && i5 != 3) {
                if (i5 == 4) {
                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                        return lVar.invoke(focusTargetNode).booleanValue();
                    }
                    return pickChildForForwardSearch(focusTargetNode, lVar);
                }
                throw new j0();
            }
            return pickChildForForwardSearch(focusTargetNode, lVar);
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            if (forwardFocusSearch(activeChild, lVar) || m3448generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m3423getNextdhqQ8s(), lVar)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException(NoActiveChild.toString());
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m3448generateAndSearchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i5, v3.l<? super FocusTargetNode, Boolean> lVar) {
        if (m3450searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i5, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m3409searchBeyondBoundsOMvw8(focusTargetNode, i5, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetNode, focusTargetNode2, i5, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }

    private static final boolean isRoot(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodes$ui_release;
        boolean z4;
        boolean z5;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                node = null;
                if (requireLayoutNode == null) {
                    break;
                }
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            Modifier.Node node2 = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (node2 != null) {
                                if (node2 instanceof FocusTargetNode) {
                                    node = node2;
                                    break loop0;
                                }
                                if ((node2.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4 && (node2 instanceof DelegatingNode)) {
                                    int i5 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            i5++;
                                            if (i5 == 1) {
                                                node2 = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    mutableVector.add(node2);
                                                    node2 = null;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.pop(mutableVector);
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
            if (node != null) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m3449oneDimensionalFocusSearchOMvw8(@l FocusTargetNode focusTargetNode, int i5, @l v3.l<? super FocusTargetNode, Boolean> lVar) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3423getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetNode, lVar);
        }
        if (FocusDirection.m3413equalsimpl0(i5, companion.m3424getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetNode, lVar);
        }
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    private static final boolean pickChildForBackwardSearch(FocusTargetNode focusTargetNode, v3.l<? super FocusTargetNode, Boolean> lVar) {
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
            mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
            int size = mutableVector.getSize();
            if (size > 0) {
                int i6 = size - 1;
                Object[] content = mutableVector.getContent();
                do {
                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) content[i6];
                    if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && backwardFocusSearch(focusTargetNode2, lVar)) {
                        return true;
                    }
                    i6--;
                } while (i6 >= 0);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    private static final boolean pickChildForForwardSearch(FocusTargetNode focusTargetNode, v3.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z4;
        boolean z5;
        boolean z6;
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
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5 && (node instanceof DelegatingNode)) {
                                        int i5 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            if (z6) {
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
            mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
            int size = mutableVector.getSize();
            if (size <= 0) {
                return false;
            }
            Object[] content = mutableVector.getContent();
            int i6 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) content[i6];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && forwardFocusSearch(focusTargetNode2, lVar)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    return true;
                }
                i6++;
            } while (i6 < size);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m3450searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i5, v3.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z4;
        boolean z5;
        boolean z6;
        if (focusTargetNode.getFocusState() == FocusStateImpl.ActiveParent) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
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
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5 && (node instanceof DelegatingNode)) {
                                            int i6 = 0;
                                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (z6) {
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
                mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
                FocusDirection.Companion companion = FocusDirection.Companion;
                if (FocusDirection.m3413equalsimpl0(i5, companion.m3423getNextdhqQ8s())) {
                    kotlin.ranges.l lVar2 = new kotlin.ranges.l(0, mutableVector.getSize() - 1);
                    int e5 = lVar2.e();
                    int g5 = lVar2.g();
                    if (e5 <= g5) {
                        boolean z7 = false;
                        while (true) {
                            if (z7) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) mutableVector.getContent()[e5];
                                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && forwardFocusSearch(focusTargetNode3, lVar)) {
                                    return true;
                                }
                            }
                            if (l0.g(mutableVector.getContent()[e5], focusTargetNode2)) {
                                z7 = true;
                            }
                            if (e5 == g5) {
                                break;
                            }
                            e5++;
                        }
                    }
                } else if (FocusDirection.m3413equalsimpl0(i5, companion.m3424getPreviousdhqQ8s())) {
                    kotlin.ranges.l lVar3 = new kotlin.ranges.l(0, mutableVector.getSize() - 1);
                    int e6 = lVar3.e();
                    int g6 = lVar3.g();
                    if (e6 <= g6) {
                        boolean z8 = false;
                        while (true) {
                            if (z8) {
                                FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.getContent()[g6];
                                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && backwardFocusSearch(focusTargetNode4, lVar)) {
                                    return true;
                                }
                            }
                            if (l0.g(mutableVector.getContent()[g6], focusTargetNode2)) {
                                z8 = true;
                            }
                            if (g6 == e6) {
                                break;
                            }
                            g6--;
                        }
                    }
                } else {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                if (FocusDirection.m3413equalsimpl0(i5, FocusDirection.Companion.m3423getNextdhqQ8s()) || !focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() || isRoot(focusTargetNode)) {
                    return false;
                }
                return lVar.invoke(focusTargetNode).booleanValue();
            }
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
