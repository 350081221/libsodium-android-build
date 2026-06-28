package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "destination", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,335:1\n90#2:336\n262#3:337\n230#3,5:338\n58#3:343\n59#3,8:345\n385#3,5:353\n263#3:358\n390#3:359\n395#3,2:361\n397#3,8:366\n405#3,9:377\n414#3,8:389\n68#3,7:397\n265#3:404\n1#4:344\n1#4:412\n261#5:360\n234#6,3:363\n237#6,3:386\n1208#7:374\n1187#7,2:375\n39#8,7:405\n46#8,4:415\n728#9,2:413\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1\n*L\n182#1:336\n182#1:337\n182#1:338,5\n182#1:343\n182#1:345,8\n182#1:353,5\n182#1:358\n182#1:359\n182#1:361,2\n182#1:366,8\n182#1:377,9\n182#1:389,8\n182#1:397,7\n182#1:404\n182#1:344\n187#1:412\n182#1:360\n182#1:363,3\n182#1:386,3\n182#1:374\n182#1:375,2\n187#1:405,7\n187#1:415,4\n187#1:413,2\n*E\n"})
/* loaded from: classes.dex */
public final class FocusOwnerImpl$moveFocus$foundNextItem$1 extends n0 implements l<FocusTargetNode, Boolean> {
    final /* synthetic */ int $focusDirection;
    final /* synthetic */ k1.a $isCancelled;
    final /* synthetic */ FocusTargetNode $source;
    final /* synthetic */ FocusOwnerImpl this$0;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$moveFocus$foundNextItem$1(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, int i5, k1.a aVar) {
        super(1);
        this.$source = focusTargetNode;
        this.this$0 = focusOwnerImpl;
        this.$focusDirection = i5;
        this.$isCancelled = aVar;
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        boolean z4;
        NodeChain nodes$ui_release;
        if (l0.g(focusTargetNode, this.$source)) {
            return Boolean.FALSE;
        }
        int m5204constructorimpl = NodeKind.m5204constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                node = null;
                z4 = true;
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
                                if (((node2.getKindSet$ui_release() & m5204constructorimpl) != 0) && (node2 instanceof DelegatingNode)) {
                                    int i5 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
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
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            if (node != null) {
                FocusTransactionManager focusTransactionManager = this.this$0.getFocusTransactionManager();
                int i6 = this.$focusDirection;
                k1.a aVar = this.$isCancelled;
                try {
                    if (focusTransactionManager.ongoingTransaction) {
                        focusTransactionManager.cancelTransaction();
                    }
                    focusTransactionManager.beginTransaction();
                    int i7 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m3444performCustomRequestFocusMxy_nc0(focusTargetNode, i6).ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2 && i7 != 3) {
                            if (i7 != 4) {
                                throw new j0();
                            }
                            z4 = FocusTransactionsKt.performRequestFocus(focusTargetNode);
                        } else {
                            aVar.element = true;
                        }
                    }
                    return Boolean.valueOf(z4);
                } finally {
                    focusTransactionManager.commitTransaction();
                }
            }
            throw new IllegalStateException("Focus search landed at the root.".toString());
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }
}
