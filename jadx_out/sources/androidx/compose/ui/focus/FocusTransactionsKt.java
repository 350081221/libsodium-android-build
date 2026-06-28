package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.Owner;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001e\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u001e\u0010\u0011\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u001e\u0010\u0013\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000e\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0002\u001a\f\u0010\u0019\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u001a\u001a\u00020\u0002*\u00020\u0002H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "clearChildFocus", "forced", "refreshFocusEvents", "clearFocus", "freeFocus", "grantFocus", "performCustomClearFocus", "Landroidx/compose/ui/focus/CustomDestinationResult;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "performCustomClearFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomEnter", "performCustomEnter-Mxy_nc0", "performCustomExit", "performCustomExit-Mxy_nc0", "performCustomRequestFocus", "performCustomRequestFocus-Mxy_nc0", "performRequestFocus", "requestFocus", "requestFocusForChild", "childNode", "requestFocusForOwner", "requireActiveChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n1#1,308:1\n39#2,7:309\n46#2,4:319\n39#2,7:392\n46#2,4:402\n39#2,7:406\n46#2,4:416\n1#3:316\n1#3:331\n1#3:399\n1#3:413\n1#3:428\n1#3:497\n1#3:558\n1#3:567\n1#3:628\n728#4,2:317\n728#4,2:400\n728#4,2:414\n90#5:323\n90#5:420\n90#5:489\n90#5:559\n262#6:324\n230#6,5:325\n58#6:330\n59#6,8:332\n385#6,5:340\n263#6:345\n390#6:346\n395#6,2:348\n397#6,8:353\n405#6,9:364\n414#6,8:376\n68#6,7:384\n265#6:391\n262#6:421\n230#6,5:422\n58#6:427\n59#6,8:429\n385#6,5:437\n263#6:442\n390#6:443\n395#6,2:445\n397#6,8:450\n405#6,9:461\n414#6,8:473\n68#6,7:481\n265#6:488\n262#6:490\n230#6,5:491\n58#6:496\n59#6,8:498\n385#6,5:506\n263#6:511\n390#6:512\n395#6,2:514\n397#6,8:519\n405#6,9:530\n414#6,8:542\n68#6,7:550\n265#6:557\n262#6:560\n230#6,5:561\n58#6:566\n59#6,8:568\n385#6,5:576\n263#6:581\n390#6:582\n395#6,2:584\n397#6,8:589\n405#6,9:600\n414#6,8:612\n68#6,7:620\n265#6:627\n261#7:347\n261#7:444\n261#7:513\n261#7:583\n234#8,3:350\n237#8,3:373\n234#8,3:447\n237#8,3:470\n234#8,3:516\n237#8,3:539\n234#8,3:586\n237#8,3:609\n1208#9:361\n1187#9,2:362\n1208#9:458\n1187#9,2:459\n1208#9:527\n1187#9,2:528\n1208#9:597\n1187#9,2:598\n119#10,12:629\n146#10,12:641\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n43#1:309,7\n43#1:319,4\n89#1:392,7\n89#1:402,4\n108#1:406,7\n108#1:416,4\n43#1:316\n64#1:331\n89#1:399\n108#1:413\n199#1:428\n217#1:497\n264#1:567\n43#1:317,2\n89#1:400,2\n108#1:414,2\n64#1:323\n199#1:420\n217#1:489\n264#1:559\n64#1:324\n64#1:325,5\n64#1:330\n64#1:332,8\n64#1:340,5\n64#1:345\n64#1:346\n64#1:348,2\n64#1:353,8\n64#1:364,9\n64#1:376,8\n64#1:384,7\n64#1:391\n199#1:421\n199#1:422,5\n199#1:427\n199#1:429,8\n199#1:437,5\n199#1:442\n199#1:443\n199#1:445,2\n199#1:450,8\n199#1:461,9\n199#1:473,8\n199#1:481,7\n199#1:488\n217#1:490\n217#1:491,5\n217#1:496\n217#1:498,8\n217#1:506,5\n217#1:511\n217#1:512\n217#1:514,2\n217#1:519,8\n217#1:530,9\n217#1:542,8\n217#1:550,7\n217#1:557\n264#1:560\n264#1:561,5\n264#1:566\n264#1:568,8\n264#1:576,5\n264#1:581\n264#1:582\n264#1:584,2\n264#1:589,8\n264#1:600,9\n264#1:612,8\n264#1:620,7\n264#1:627\n64#1:347\n199#1:444\n217#1:513\n264#1:583\n64#1:350,3\n64#1:373,3\n199#1:447,3\n199#1:470,3\n217#1:516,3\n217#1:539,3\n264#1:586,3\n264#1:609,3\n64#1:361\n64#1:362,2\n199#1:458\n199#1:459,2\n217#1:527\n217#1:528,2\n264#1:597\n264#1:598,2\n291#1:629,12\n302#1:641,12\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTransactionsKt {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean captureFocus(@l FocusTargetNode focusTargetNode) {
        FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (requireTransactionManager.ongoingTransaction) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            int i5 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
            boolean z4 = true;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3 && i5 != 4) {
                        throw new j0();
                    }
                    z4 = false;
                }
            } else {
                focusTargetNode.setFocusState(FocusStateImpl.Captured);
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
            return z4;
        } finally {
            requireTransactionManager.commitTransaction();
        }
    }

    private static final boolean clearChildFocus(FocusTargetNode focusTargetNode, boolean z4, boolean z5) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z4, z5);
        }
        return true;
    }

    static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode focusTargetNode, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        return clearChildFocus(focusTargetNode, z4, z5);
    }

    public static final boolean clearFocus(@l FocusTargetNode focusTargetNode, boolean z4, boolean z5) {
        int i5 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new j0();
                    }
                } else if (clearChildFocus(focusTargetNode, z4, z5)) {
                    focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                    if (z5) {
                        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                    }
                } else {
                    return false;
                }
            } else {
                if (z4) {
                    focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                    if (z5) {
                        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                        return z4;
                    }
                    return z4;
                }
                return z4;
            }
        } else {
            focusTargetNode.setFocusState(FocusStateImpl.Inactive);
            if (z5) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        return clearFocus(focusTargetNode, z4, z5);
    }

    public static final boolean freeFocus(@l FocusTargetNode focusTargetNode) {
        FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (requireTransactionManager.ongoingTransaction) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            int i5 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
            boolean z4 = true;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3 && i5 != 4) {
                        throw new j0();
                    }
                    z4 = false;
                } else {
                    focusTargetNode.setFocusState(FocusStateImpl.Active);
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                }
            }
            return z4;
        } finally {
            requireTransactionManager.commitTransaction();
        }
    }

    private static final boolean grantFocus(FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new FocusTransactionsKt$grantFocus$1(focusTargetNode));
        int i5 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i5 == 3 || i5 == 4) {
            focusTargetNode.setFocusState(FocusStateImpl.Active);
            return true;
        }
        return true;
    }

    @l
    /* renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m3441performCustomClearFocusMxy_nc0(@l FocusTargetNode focusTargetNode, int i5) {
        int i6 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        boolean z4 = true;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        throw new j0();
                    }
                } else {
                    CustomDestinationResult m3441performCustomClearFocusMxy_nc0 = m3441performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i5);
                    if (m3441performCustomClearFocusMxy_nc0 != CustomDestinationResult.None) {
                        z4 = false;
                    }
                    if (z4) {
                        m3441performCustomClearFocusMxy_nc0 = null;
                    }
                    if (m3441performCustomClearFocusMxy_nc0 == null) {
                        return m3443performCustomExitMxy_nc0(focusTargetNode, i5);
                    }
                    return m3441performCustomClearFocusMxy_nc0;
                }
            } else {
                return CustomDestinationResult.Cancelled;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m3442performCustomEnterMxy_nc0(FocusTargetNode focusTargetNode, int i5) {
        CustomDestinationResult customDestinationResult;
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusRequester invoke = focusTargetNode.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m3410boximpl(i5));
                FocusRequester.Companion companion = FocusRequester.Companion;
                if (invoke != companion.getDefault()) {
                    if (invoke == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (invoke.focus$ui_release()) {
                        customDestinationResult = CustomDestinationResult.Redirected;
                    } else {
                        customDestinationResult = CustomDestinationResult.RedirectCancelled;
                    }
                    return customDestinationResult;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m3443performCustomExitMxy_nc0(FocusTargetNode focusTargetNode, int i5) {
        CustomDestinationResult customDestinationResult;
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusRequester invoke = focusTargetNode.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m3410boximpl(i5));
                FocusRequester.Companion companion = FocusRequester.Companion;
                if (invoke != companion.getDefault()) {
                    if (invoke == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (invoke.focus$ui_release()) {
                        customDestinationResult = CustomDestinationResult.Redirected;
                    } else {
                        customDestinationResult = CustomDestinationResult.RedirectCancelled;
                    }
                    return customDestinationResult;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return CustomDestinationResult.None;
    }

    @l
    /* renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m3444performCustomRequestFocusMxy_nc0(@l FocusTargetNode focusTargetNode, int i5) {
        CustomDestinationResult customDestinationResult;
        Modifier.Node node;
        NodeChain nodes$ui_release;
        boolean z4;
        boolean z5;
        int i6 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        boolean z6 = true;
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                if (i6 == 4) {
                    int m5204constructorimpl = NodeKind.m5204constructorimpl(1024);
                    if (focusTargetNode.getNode().isAttached()) {
                        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
                        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                        loop0: while (true) {
                            customDestinationResult = null;
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
                                                    int i7 = 0;
                                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                                        if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        if (z5) {
                                                            i7++;
                                                            if (i7 == 1) {
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
                                                    if (i7 == 1) {
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
                        if (focusTargetNode2 == null) {
                            return CustomDestinationResult.None;
                        }
                        int i8 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 != 3) {
                                    if (i8 == 4) {
                                        CustomDestinationResult m3444performCustomRequestFocusMxy_nc0 = m3444performCustomRequestFocusMxy_nc0(focusTargetNode2, i5);
                                        if (m3444performCustomRequestFocusMxy_nc0 != CustomDestinationResult.None) {
                                            z6 = false;
                                        }
                                        if (!z6) {
                                            customDestinationResult = m3444performCustomRequestFocusMxy_nc0;
                                        }
                                        if (customDestinationResult == null) {
                                            return m3442performCustomEnterMxy_nc0(focusTargetNode2, i5);
                                        }
                                        return customDestinationResult;
                                    }
                                    throw new j0();
                                }
                                return m3444performCustomRequestFocusMxy_nc0(focusTargetNode2, i5);
                            }
                            return CustomDestinationResult.Cancelled;
                        }
                        return m3442performCustomEnterMxy_nc0(focusTargetNode2, i5);
                    }
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                throw new j0();
            }
            return m3441performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i5);
        }
        return CustomDestinationResult.None;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e4, code lost:
    
        if (grantFocus(r11) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0104, code lost:
    
        if (grantFocus(r11) != false) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean performRequestFocus(@p4.l androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.performRequestFocus(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean requestFocus(@l FocusTargetNode focusTargetNode) {
        FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (requireTransactionManager.ongoingTransaction) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            int i5 = WhenMappings.$EnumSwitchMapping$0[m3444performCustomRequestFocusMxy_nc0(focusTargetNode, FocusDirection.Companion.m3420getEnterdhqQ8s()).ordinal()];
            boolean z4 = true;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3 && i5 != 4) {
                        throw new j0();
                    }
                    z4 = false;
                }
            } else {
                z4 = performRequestFocus(focusTargetNode);
            }
            return z4;
        } finally {
            requireTransactionManager.commitTransaction();
        }
    }

    private static final boolean requestFocusForChild(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        Modifier.Node node;
        boolean z4;
        Modifier.Node node2;
        NodeChain nodes$ui_release;
        boolean z5;
        boolean z6;
        NodeChain nodes$ui_release2;
        boolean z7;
        boolean z8;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(1024);
        if (focusTargetNode2.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetNode2.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
            loop0: while (true) {
                node = null;
                z4 = true;
                if (requireLayoutNode != null) {
                    if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                node2 = parent$ui_release;
                                MutableVector mutableVector = null;
                                while (node2 != null) {
                                    if (node2 instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((node2.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7 && (node2 instanceof DelegatingNode)) {
                                        int i5 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            if (z8) {
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
                    if (requireLayoutNode != null && (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) != null) {
                        parent$ui_release = nodes$ui_release2.getTail$ui_release();
                    } else {
                        parent$ui_release = null;
                    }
                } else {
                    node2 = null;
                    break;
                }
            }
            if (l0.g(node2, focusTargetNode)) {
                int i6 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4) {
                                int m5204constructorimpl2 = NodeKind.m5204constructorimpl(1024);
                                if (focusTargetNode.getNode().isAttached()) {
                                    Modifier.Node parent$ui_release2 = focusTargetNode.getNode().getParent$ui_release();
                                    LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                                    loop4: while (true) {
                                        if (requireLayoutNode2 == null) {
                                            break;
                                        }
                                        if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                            while (parent$ui_release2 != null) {
                                                if ((parent$ui_release2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                                    Modifier.Node node3 = parent$ui_release2;
                                                    MutableVector mutableVector2 = null;
                                                    while (node3 != null) {
                                                        if (node3 instanceof FocusTargetNode) {
                                                            node = node3;
                                                            break loop4;
                                                        }
                                                        if ((node3.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        if (z5 && (node3 instanceof DelegatingNode)) {
                                                            int i7 = 0;
                                                            for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                                                if ((delegate$ui_release2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                                                    z6 = true;
                                                                } else {
                                                                    z6 = false;
                                                                }
                                                                if (z6) {
                                                                    i7++;
                                                                    if (i7 == 1) {
                                                                        node3 = delegate$ui_release2;
                                                                    } else {
                                                                        if (mutableVector2 == null) {
                                                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                                        }
                                                                        if (node3 != null) {
                                                                            mutableVector2.add(node3);
                                                                            node3 = null;
                                                                        }
                                                                        mutableVector2.add(delegate$ui_release2);
                                                                    }
                                                                }
                                                            }
                                                            if (i7 == 1) {
                                                            }
                                                        }
                                                        node3 = DelegatableNodeKt.pop(mutableVector2);
                                                    }
                                                }
                                                parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                                            }
                                        }
                                        requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                                        if (requireLayoutNode2 != null && (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) != null) {
                                            parent$ui_release2 = nodes$ui_release.getTail$ui_release();
                                        } else {
                                            parent$ui_release2 = null;
                                        }
                                    }
                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
                                    if (focusTargetNode3 == null && requestFocusForOwner(focusTargetNode)) {
                                        focusTargetNode.setFocusState(FocusStateImpl.Active);
                                        return requestFocusForChild(focusTargetNode, focusTargetNode2);
                                    }
                                    if (focusTargetNode3 != null && requestFocusForChild(focusTargetNode3, focusTargetNode)) {
                                        boolean requestFocusForChild = requestFocusForChild(focusTargetNode, focusTargetNode2);
                                        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            if (requestFocusForChild) {
                                                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode3);
                                            }
                                            return requestFocusForChild;
                                        }
                                        throw new IllegalStateException("Deactivated node is focused".toString());
                                    }
                                } else {
                                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                                }
                            } else {
                                throw new j0();
                            }
                        } else {
                            requireActiveChild(focusTargetNode);
                            if (clearChildFocus$default(focusTargetNode, false, false, 3, null) && grantFocus(focusTargetNode2)) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                boolean grantFocus = grantFocus(focusTargetNode2);
                if (grantFocus) {
                    focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
                    return grantFocus;
                }
                return grantFocus;
            }
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    private static final boolean requestFocusForOwner(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        Owner owner$ui_release;
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        if (coordinator$ui_release == null || (layoutNode = coordinator$ui_release.getLayoutNode()) == null || (owner$ui_release = layoutNode.getOwner$ui_release()) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return owner$ui_release.requestFocus();
    }

    private static final FocusTargetNode requireActiveChild(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return activeChild;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child".toString());
    }
}
