package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00018B\u0007¢\u0006\u0004\b7\u0010\u0018J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001c\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u00102\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b1\u0010\u0018\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0013\u00106\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/r2;", "onObservedReadsChanged", "onReset", "Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties$ui_release", "()Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusRequester;", "block", "fetchCustomEnter-aToIllA$ui_release", "(ILv3/l;)V", "fetchCustomEnter", "fetchCustomExit-aToIllA$ui_release", "fetchCustomExit", "commitFocusState$ui_release", "()V", "commitFocusState", "invalidateFocus$ui_release", "invalidateFocus", "scheduleInvalidationForFocusEvents$ui_release", "scheduleInvalidationForFocusEvents", "", "isProcessingCustomExit", "Z", "isProcessingCustomEnter", "Landroidx/compose/ui/focus/FocusStateImpl;", "committedFocusState", "Landroidx/compose/ui/focus/FocusStateImpl;", "", "previouslyFocusedChildHash", "I", "getPreviouslyFocusedChildHash", "()I", "setPreviouslyFocusedChildHash", "(I)V", b.f22420d, "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "getFocusState$annotations", "focusState", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "beyondBoundsLayoutParent", "<init>", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFocusTargetNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,231:1\n1#2:232\n1#2:240\n1#2:252\n1#2:376\n39#3,7:233\n46#3,4:243\n728#4,2:241\n92#5:247\n90#5:248\n94#5:320\n94#5:364\n90#5:365\n90#5:385\n94#5:387\n241#6,2:249\n58#6:251\n59#6,8:253\n243#6:261\n244#6,2:263\n385#6,12:265\n397#6,8:280\n405#6,9:291\n414#6,8:303\n247#6:311\n68#6,7:312\n248#6:319\n385#6,6:321\n395#6,2:328\n397#6,8:333\n405#6,9:344\n414#6,8:356\n50#6,9:367\n59#6,8:377\n385#6,6:388\n395#6,2:395\n397#6,8:400\n405#6,9:411\n414#6,8:423\n68#6,7:431\n261#7:262\n261#7:327\n261#7:386\n261#7:394\n234#8,3:277\n237#8,3:300\n234#8,3:330\n237#8,3:353\n234#8,3:397\n237#8,3:420\n1208#9:288\n1187#9,2:289\n1208#9:341\n1187#9,2:342\n1208#9:408\n1187#9,2:409\n47#10:366\n*S KotlinDebug\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n86#1:240\n99#1:252\n196#1:376\n86#1:233,7\n86#1:243,4\n86#1:241,2\n99#1:247\n99#1:248\n189#1:320\n196#1:364\n196#1:365\n197#1:385\n200#1:387\n99#1:249,2\n99#1:251\n99#1:253,8\n99#1:261\n99#1:263,2\n99#1:265,12\n99#1:280,8\n99#1:291,9\n99#1:303,8\n99#1:311\n99#1:312,7\n99#1:319\n189#1:321,6\n189#1:328,2\n189#1:333,8\n189#1:344,9\n189#1:356,8\n196#1:367,9\n196#1:377,8\n200#1:388,6\n200#1:395,2\n200#1:400,8\n200#1:411,9\n200#1:423,8\n196#1:431,7\n99#1:262\n189#1:327\n197#1:386\n200#1:394\n99#1:277,3\n99#1:300,3\n189#1:330,3\n189#1:353,3\n200#1:397,3\n200#1:420,3\n99#1:288\n99#1:289,2\n189#1:341\n189#1:342,2\n200#1:408\n200#1:409,2\n196#1:366\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;

    @l
    private FocusStateImpl committedFocusState = FocusStateImpl.Inactive;
    private boolean isProcessingCustomEnter;
    private boolean isProcessingCustomExit;
    private int previouslyFocusedChildHash;

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {
        public static final int $stable = 0;

        @l
        public static final FocusTargetElement INSTANCE = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(@m Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(@l InspectorInfo inspectorInfo) {
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(@l FocusTargetNode focusTargetNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        @l
        public FocusTargetNode create() {
            return new FocusTargetNode();
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getFocusState$annotations() {
    }

    public final void commitFocusState$ui_release() {
        FocusStateImpl uncommittedFocusState = FocusTargetNodeKt.requireTransactionManager(this).getUncommittedFocusState(this);
        if (uncommittedFocusState != null) {
            this.committedFocusState = uncommittedFocusState;
            return;
        }
        throw new IllegalStateException("committing a node that was not updated in the current transaction".toString());
    }

    /* renamed from: fetchCustomEnter-aToIllA$ui_release, reason: not valid java name */
    public final void m3439fetchCustomEnteraToIllA$ui_release(int i5, @l v3.l<? super FocusRequester, r2> lVar) {
        if (!this.isProcessingCustomEnter) {
            this.isProcessingCustomEnter = true;
            try {
                FocusRequester invoke = fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m3410boximpl(i5));
                if (invoke != FocusRequester.Companion.getDefault()) {
                    lVar.invoke(invoke);
                }
            } finally {
                kotlin.jvm.internal.i0.d(1);
                this.isProcessingCustomEnter = false;
                kotlin.jvm.internal.i0.c(1);
            }
        }
    }

    /* renamed from: fetchCustomExit-aToIllA$ui_release, reason: not valid java name */
    public final void m3440fetchCustomExitaToIllA$ui_release(int i5, @l v3.l<? super FocusRequester, r2> lVar) {
        if (!this.isProcessingCustomExit) {
            this.isProcessingCustomExit = true;
            try {
                FocusRequester invoke = fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m3410boximpl(i5));
                if (invoke != FocusRequester.Companion.getDefault()) {
                    lVar.invoke(invoke);
                }
            } finally {
                kotlin.jvm.internal.i0.d(1);
                this.isProcessingCustomExit = false;
                kotlin.jvm.internal.i0.c(1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    @l
    public final FocusProperties fetchFocusProperties$ui_release() {
        NodeChain nodes$ui_release;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int m5204constructorimpl = NodeKind.m5204constructorimpl(2048);
        int m5204constructorimpl2 = NodeKind.m5204constructorimpl(1024);
        Modifier.Node node = getNode();
        int i5 = m5204constructorimpl | m5204constructorimpl2;
        if (getNode().isAttached()) {
            Modifier.Node node2 = getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            loop0: while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i5) != 0) {
                    while (node2 != null) {
                        if ((node2.getKindSet$ui_release() & i5) != 0) {
                            if (node2 != node) {
                                if ((node2.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    break loop0;
                                }
                            }
                            if ((node2.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                DelegatingNode delegatingNode = node2;
                                MutableVector mutableVector = null;
                                while (delegatingNode != 0) {
                                    if (delegatingNode instanceof FocusPropertiesModifierNode) {
                                        ((FocusPropertiesModifierNode) delegatingNode).applyFocusProperties(focusPropertiesImpl);
                                    } else {
                                        if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5 && (delegatingNode instanceof DelegatingNode)) {
                                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                            int i6 = 0;
                                            delegatingNode = delegatingNode;
                                            while (delegate$ui_release != null) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (z6) {
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
                        }
                        node2 = node2.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    node2 = nodes$ui_release.getTail$ui_release();
                } else {
                    node2 = null;
                }
            }
            return focusPropertiesImpl;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @m
    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return (BeyondBoundsLayout) getCurrent(androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    public final int getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    public final void invalidateFocus$ui_release() {
        FocusProperties focusProperties;
        int i5 = WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i5 == 1 || i5 == 2) {
            k1.h hVar = new k1.h();
            ObserverModifierNodeKt.observeReads(this, new FocusTargetNode$invalidateFocus$1(hVar, this));
            T t5 = hVar.element;
            if (t5 == 0) {
                l0.S("focusProperties");
                focusProperties = null;
            } else {
                focusProperties = (FocusProperties) t5;
            }
            if (!focusProperties.getCanFocus()) {
                DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
            }
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        FocusStateImpl focusState = getFocusState();
        invalidateFocus$ui_release();
        if (focusState != getFocusState()) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        int i5 = WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                if (i5 == 4) {
                    scheduleInvalidationForFocusEvents$ui_release();
                    return;
                }
                return;
            }
            scheduleInvalidationForFocusEvents$ui_release();
            FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(this);
            try {
                if (requireTransactionManager.ongoingTransaction) {
                    requireTransactionManager.cancelTransaction();
                }
                requireTransactionManager.beginTransaction();
                setFocusState(FocusStateImpl.Inactive);
                r2 r2Var = r2.f19517a;
                return;
            } finally {
                requireTransactionManager.commitTransaction();
            }
        }
        DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    public final void scheduleInvalidationForFocusEvents$ui_release() {
        NodeChain nodes$ui_release;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        DelegatingNode node = getNode();
        int m5204constructorimpl = NodeKind.m5204constructorimpl(4096);
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof FocusEventModifierNode) {
                FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
            } else {
                if ((node.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release = node.getDelegate$ui_release();
                    int i5 = 0;
                    node = node;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            i5++;
                            if (i5 == 1) {
                                node = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector.add(node);
                                    node = 0;
                                }
                                mutableVector.add(delegate$ui_release);
                            }
                        }
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                        node = node;
                    }
                    if (i5 == 1) {
                    }
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        int m5204constructorimpl2 = NodeKind.m5204constructorimpl(4096) | NodeKind.m5204constructorimpl(1024);
        if (getNode().isAttached()) {
            Modifier.Node parent$ui_release = getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl2) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                            if ((NodeKind.m5204constructorimpl(1024) & parent$ui_release.getKindSet$ui_release()) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4 && parent$ui_release.isAttached()) {
                                int m5204constructorimpl3 = NodeKind.m5204constructorimpl(4096);
                                MutableVector mutableVector2 = null;
                                DelegatingNode delegatingNode = parent$ui_release;
                                while (delegatingNode != 0) {
                                    if (delegatingNode instanceof FocusEventModifierNode) {
                                        FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) delegatingNode);
                                    } else {
                                        if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl3) != 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5 && (delegatingNode instanceof DelegatingNode)) {
                                            Modifier.Node delegate$ui_release2 = delegatingNode.getDelegate$ui_release();
                                            int i6 = 0;
                                            delegatingNode = delegatingNode;
                                            while (delegate$ui_release2 != null) {
                                                if ((delegate$ui_release2.getKindSet$ui_release() & m5204constructorimpl3) != 0) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (z6) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        delegatingNode = delegate$ui_release2;
                                                    } else {
                                                        if (mutableVector2 == null) {
                                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (delegatingNode != 0) {
                                                            mutableVector2.add(delegatingNode);
                                                            delegatingNode = 0;
                                                        }
                                                        mutableVector2.add(delegate$ui_release2);
                                                    }
                                                }
                                                delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                                                delegatingNode = delegatingNode;
                                            }
                                            if (i6 == 1) {
                                            }
                                        }
                                    }
                                    delegatingNode = DelegatableNodeKt.pop(mutableVector2);
                                }
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public void setFocusState(@l FocusStateImpl focusStateImpl) {
        FocusTargetNodeKt.requireTransactionManager(this).setUncommittedFocusState(this, focusStateImpl);
    }

    public final void setPreviouslyFocusedChildHash(int i5) {
        this.previouslyFocusedChildHash = i5;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    @l
    public FocusStateImpl getFocusState() {
        FocusStateImpl uncommittedFocusState;
        FocusTransactionManager access$getFocusTransactionManager = FocusTargetNodeKt.access$getFocusTransactionManager(this);
        return (access$getFocusTransactionManager == null || (uncommittedFocusState = access$getFocusTransactionManager.getUncommittedFocusState(this)) == null) ? this.committedFocusState : uncommittedFocusState;
    }
}
