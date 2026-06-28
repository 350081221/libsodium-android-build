package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001:\u0001YB\u000f\u0012\u0006\u0010/\u001a\u00020\u0002¢\u0006\u0004\bW\u0010XJ$\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\u0010\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0082\bJ\b\u0010\u0011\u001a\u00020\fH\u0002J$\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0002J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0014\u0010\u0019\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0006J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0006J\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0006J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010$\u001a\u00020\u00062\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eJ\u0006\u0010%\u001a\u00020\fJ \u0010$\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000e\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(J\u0016\u0010+\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0006J\u0010\u0010-\u001a\u00020\f2\b\b\u0002\u0010,\u001a\u00020\u0006J\u000e\u0010.\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0002R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020(098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010>\u001a\u00020<2\u0006\u0010=\u001a\u00020<8F@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010;R\u001e\u0010D\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u0004\u0018\u00010F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010K\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0018\u0010M\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0018\u0010O\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010JR\u0018\u0010Q\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010JR\u0011\u0010T\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bU\u0010S\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "doLookaheadRemeasure-sdFAvZA", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/unit/Constraints;)Z", "doLookaheadRemeasure", "doRemeasure-sdFAvZA", "doRemeasure", "Lkotlin/r2;", "remeasureLookaheadRootsInSubtree", "Lkotlin/Function0;", "block", "performMeasureAndLayout", "callOnLayoutCompletedListeners", "affectsLookahead", "relayoutNeeded", "remeasureAndRelayoutIfNeeded", "remeasureOnly", "node", "onlyRemeasureIfScheduled", "forceMeasureTheSubtreeInternal", "measurePending", "updateRootConstraints-BRTryo0", "(J)V", "updateRootConstraints", "forced", "requestLookaheadRemeasure", "requestRemeasure", "requestLookaheadRelayout", "requestRelayout", "requestOnPositionedCallback", "onLayout", "measureAndLayout", "measureOnly", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "listener", "registerOnLayoutCompletedListener", "forceMeasureTheSubtree", "forceDispatch", "dispatchOnPositionedCallbacks", "onNodeDetached", "root", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "duringMeasureLayout", "Z", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "onPositionedDispatcher", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "Landroidx/compose/runtime/collection/MutableVector;", "onLayoutCompletedListeners", "Landroidx/compose/runtime/collection/MutableVector;", "", "<set-?>", "measureIteration", "J", "getMeasureIteration", "()J", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "postponedMeasureRequests", "rootConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "consistencyChecker", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "getMeasureAffectsParent", "(Landroidx/compose/ui/node/LayoutNode;)Z", "measureAffectsParent", "getCanAffectParent", "canAffectParent", "getCanAffectParentInLookahead", "canAffectParentInLookahead", "getMeasureAffectsParentLookahead", "measureAffectsParentLookahead", "getHasPendingMeasureOrLayout", "()Z", "hasPendingMeasureOrLayout", "getHasPendingOnPositionedCallbacks", "hasPendingOnPositionedCallbacks", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "PostponedRequest", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 5 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 6 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,683:1\n454#1:691\n455#1,7:693\n463#1,5:707\n454#1:712\n455#1,13:714\n454#1:739\n455#1,13:741\n1208#2:684\n1187#2,2:685\n1208#2:687\n1187#2,2:688\n1#3:690\n1#3:692\n1#3:713\n1#3:740\n171#4,2:700\n173#4,4:703\n96#5:702\n197#6:727\n197#6:778\n460#7,11:728\n728#7,2:754\n460#7,11:756\n460#7,11:767\n460#7,11:779\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n374#1:691\n374#1:693,7\n374#1:707,5\n395#1:712\n395#1:714,13\n434#1:739\n434#1:741,13\n68#1:684\n68#1:685,2\n89#1:687\n89#1:688,2\n374#1:692\n395#1:713\n434#1:740\n376#1:700,2\n376#1:703,4\n376#1:702\n413#1:727\n603#1:778\n413#1:728,11\n470#1:754,2\n474#1:756,11\n538#1:767,11\n603#1:779,11\n*E\n"})
/* loaded from: classes.dex */
public final class MeasureAndLayoutDelegate {
    public static final int $stable = 8;

    @m
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringMeasureLayout;
    private long measureIteration;

    @l
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;

    @l
    private final OnPositionedDispatcher onPositionedDispatcher;

    @l
    private final MutableVector<PostponedRequest> postponedMeasureRequests;

    @l
    private final DepthSortedSetsForDifferentPasses relayoutNodes;

    @l
    private final LayoutNode root;

    @m
    private Constraints rootConstraints;

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "", "node", "Landroidx/compose/ui/node/LayoutNode;", "isLookahead", "", "isForced", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "()Z", "getNode", "()Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class PostponedRequest {
        public static final int $stable = 8;
        private final boolean isForced;
        private final boolean isLookahead;

        @l
        private final LayoutNode node;

        public PostponedRequest(@l LayoutNode layoutNode, boolean z4, boolean z5) {
            this.node = layoutNode;
            this.isLookahead = z4;
            this.isForced = z5;
        }

        @l
        public final LayoutNode getNode() {
            return this.node;
        }

        public final boolean isForced() {
            return this.isForced;
        }

        public final boolean isLookahead() {
            return this.isLookahead;
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(@l LayoutNode layoutNode) {
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker;
        this.root = layoutNode;
        Owner.Companion companion = Owner.Companion;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        if (companion.getEnableExtraAssertions()) {
            layoutTreeConsistencyChecker = new LayoutTreeConsistencyChecker(layoutNode, depthSortedSetsForDifferentPasses, mutableVector.asMutableList());
        } else {
            layoutTreeConsistencyChecker = null;
        }
        this.consistencyChecker = layoutTreeConsistencyChecker;
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        int size = mutableVector.getSize();
        if (size > 0) {
            Owner.OnLayoutCompletedListener[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                content[i5].onLayoutComplete();
                i5++;
            } while (i5 < size);
        }
        this.onLayoutCompletedListeners.clear();
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z4);
    }

    /* renamed from: doLookaheadRemeasure-sdFAvZA */
    private final boolean m5158doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean m5125lookaheadRemeasure_Sx5XlM$ui_release$default;
        if (layoutNode.getLookaheadRoot$ui_release() == null) {
            return false;
        }
        if (constraints != null) {
            m5125lookaheadRemeasure_Sx5XlM$ui_release$default = layoutNode.m5129lookaheadRemeasure_Sx5XlM$ui_release(constraints);
        } else {
            m5125lookaheadRemeasure_Sx5XlM$ui_release$default = LayoutNode.m5125lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m5125lookaheadRemeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot$ui_release() == null) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestLookaheadRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestLookaheadRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m5125lookaheadRemeasure_Sx5XlM$ui_release$default;
    }

    /* renamed from: doRemeasure-sdFAvZA */
    private final boolean m5159doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean m5126remeasure_Sx5XlM$ui_release$default;
        if (constraints != null) {
            m5126remeasure_Sx5XlM$ui_release$default = layoutNode.m5130remeasure_Sx5XlM$ui_release(constraints);
        } else {
            m5126remeasure_Sx5XlM$ui_release$default = LayoutNode.m5126remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m5126remeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m5126remeasure_Sx5XlM$ui_release$default;
    }

    private final void forceMeasureTheSubtreeInternal(LayoutNode layoutNode, boolean z4) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                LayoutNode layoutNode2 = content[i5];
                if ((!z4 && getMeasureAffectsParent(layoutNode2)) || (z4 && getMeasureAffectsParentLookahead(layoutNode2))) {
                    if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2) && !z4) {
                        if (layoutNode2.getLookaheadMeasurePending$ui_release() && this.relayoutNodes.contains(layoutNode2, true)) {
                            remeasureAndRelayoutIfNeeded(layoutNode2, true, false);
                        } else {
                            forceMeasureTheSubtree(layoutNode2, true);
                        }
                    }
                    onlyRemeasureIfScheduled(layoutNode2, z4);
                    if (!measurePending(layoutNode2, z4)) {
                        forceMeasureTheSubtreeInternal(layoutNode2, z4);
                    }
                }
                i5++;
            } while (i5 < size);
        }
        onlyRemeasureIfScheduled(layoutNode, z4);
    }

    private final boolean getCanAffectParent(LayoutNode layoutNode) {
        return layoutNode.getMeasurePending$ui_release() && getMeasureAffectsParent(layoutNode);
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        return layoutNode.getLookaheadMeasurePending$ui_release() && getMeasureAffectsParentLookahead(layoutNode);
    }

    private final boolean getMeasureAffectsParent(LayoutNode layoutNode) {
        if (layoutNode.getMeasuredByParent$ui_release() != LayoutNode.UsageByParent.InMeasureBlock && !layoutNode.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return false;
        }
        return true;
    }

    private final boolean getMeasureAffectsParentLookahead(LayoutNode layoutNode) {
        boolean z4;
        AlignmentLines alignmentLines;
        if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        if (lookaheadAlignmentLinesOwner$ui_release != null && (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) != null && alignmentLines.getRequired$ui_release()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, v3.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(aVar);
    }

    private final boolean measurePending(LayoutNode layoutNode, boolean z4) {
        return z4 ? layoutNode.getLookaheadMeasurePending$ui_release() : layoutNode.getMeasurePending$ui_release();
    }

    private final void onlyRemeasureIfScheduled(LayoutNode layoutNode, boolean z4) {
        if (measurePending(layoutNode, z4) && this.relayoutNodes.contains(layoutNode, z4)) {
            remeasureAndRelayoutIfNeeded(layoutNode, z4, false);
        }
    }

    private final void performMeasureAndLayout(v3.a<r2> aVar) {
        if (this.root.isAttached()) {
            if (this.root.isPlaced()) {
                if (!this.duringMeasureLayout) {
                    if (this.rootConstraints != null) {
                        this.duringMeasureLayout = true;
                        try {
                            aVar.invoke();
                            kotlin.jvm.internal.i0.d(1);
                            this.duringMeasureLayout = false;
                            kotlin.jvm.internal.i0.c(1);
                            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                            if (layoutTreeConsistencyChecker != null) {
                                layoutTreeConsistencyChecker.assertConsistent();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            kotlin.jvm.internal.i0.d(1);
                            this.duringMeasureLayout = false;
                            kotlin.jvm.internal.i0.c(1);
                            throw th;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
            }
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
    }

    private final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode, boolean z4, boolean z5) {
        Constraints constraints;
        boolean z6;
        boolean m5159doRemeasuresdFAvZA;
        boolean z7;
        int i5 = 0;
        if (layoutNode.isDeactivated()) {
            return false;
        }
        if (!layoutNode.isPlaced() && !layoutNode.isPlacedByParent() && !getCanAffectParent(layoutNode) && !l0.g(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && !getCanAffectParentInLookahead(layoutNode) && !layoutNode.getAlignmentLinesRequired$ui_release()) {
            return false;
        }
        if (!layoutNode.getLookaheadMeasurePending$ui_release() && !layoutNode.getMeasurePending$ui_release()) {
            m5159doRemeasuresdFAvZA = false;
            z6 = false;
        } else {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                l0.m(constraints);
            } else {
                constraints = null;
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release() && z4) {
                z6 = m5158doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
            } else {
                z6 = false;
            }
            m5159doRemeasuresdFAvZA = m5159doRemeasuresdFAvZA(layoutNode, constraints);
        }
        if (z5) {
            if ((z6 || layoutNode.getLookaheadLayoutPending$ui_release()) && l0.g(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && z4) {
                layoutNode.lookaheadReplace$ui_release();
            }
            if (layoutNode.getLayoutPending$ui_release()) {
                boolean z8 = true;
                if (layoutNode != this.root) {
                    LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                    if (parent$ui_release != null && parent$ui_release.isPlaced()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!z7 || !layoutNode.isPlacedByParent()) {
                        z8 = false;
                    }
                }
                if (z8) {
                    if (layoutNode == this.root) {
                        layoutNode.place$ui_release(0, 0);
                    } else {
                        layoutNode.replace$ui_release();
                    }
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                }
            }
        }
        if (this.postponedMeasureRequests.isNotEmpty()) {
            MutableVector<PostponedRequest> mutableVector = this.postponedMeasureRequests;
            int size = mutableVector.getSize();
            if (size > 0) {
                PostponedRequest[] content = mutableVector.getContent();
                do {
                    PostponedRequest postponedRequest = content[i5];
                    if (postponedRequest.getNode().isAttached()) {
                        if (!postponedRequest.isLookahead()) {
                            requestRemeasure(postponedRequest.getNode(), postponedRequest.isForced());
                        } else {
                            requestLookaheadRemeasure(postponedRequest.getNode(), postponedRequest.isForced());
                        }
                    }
                    i5++;
                } while (i5 < size);
            }
            this.postponedMeasureRequests.clear();
        }
        return m5159doRemeasuresdFAvZA;
    }

    static /* synthetic */ boolean remeasureAndRelayoutIfNeeded$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        if ((i5 & 4) != 0) {
            z5 = true;
        }
        return measureAndLayoutDelegate.remeasureAndRelayoutIfNeeded(layoutNode, z4, z5);
    }

    private final void remeasureLookaheadRootsInSubtree(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                LayoutNode layoutNode2 = content[i5];
                if (getMeasureAffectsParent(layoutNode2)) {
                    if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2)) {
                        remeasureOnly(layoutNode2, true);
                    } else {
                        remeasureLookaheadRootsInSubtree(layoutNode2);
                    }
                }
                i5++;
            } while (i5 < size);
        }
    }

    private final void remeasureOnly(LayoutNode layoutNode, boolean z4) {
        Constraints constraints;
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            l0.m(constraints);
        } else {
            constraints = null;
        }
        if (z4) {
            m5158doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            m5159doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z4);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z4);
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z4);
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z4);
    }

    public final void dispatchOnPositionedCallbacks(boolean z4) {
        if (z4) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void forceMeasureTheSubtree(@l LayoutNode layoutNode, boolean z4) {
        if (this.relayoutNodes.isEmpty(z4)) {
            return;
        }
        if (this.duringMeasureLayout) {
            if (!measurePending(layoutNode, z4)) {
                forceMeasureTheSubtreeInternal(layoutNode, z4);
                return;
            }
            throw new IllegalArgumentException("node not yet measured".toString());
        }
        throw new IllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass".toString());
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.relayoutNodes.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.onPositionedDispatcher.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (this.duringMeasureLayout) {
            return this.measureIteration;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public final boolean measureAndLayout(@m v3.a<r2> aVar) {
        boolean z4;
        DepthSortedSet depthSortedSet;
        if (this.root.isAttached()) {
            if (this.root.isPlaced()) {
                if (!this.duringMeasureLayout) {
                    boolean z5 = false;
                    if (this.rootConstraints != null) {
                        this.duringMeasureLayout = true;
                        try {
                            if (this.relayoutNodes.isNotEmpty()) {
                                DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                                z4 = false;
                                while (depthSortedSetsForDifferentPasses.isNotEmpty()) {
                                    boolean z6 = !depthSortedSetsForDifferentPasses.lookaheadSet.isEmpty();
                                    if (z6) {
                                        depthSortedSet = depthSortedSetsForDifferentPasses.lookaheadSet;
                                    } else {
                                        depthSortedSet = depthSortedSetsForDifferentPasses.set;
                                    }
                                    LayoutNode pop = depthSortedSet.pop();
                                    boolean remeasureAndRelayoutIfNeeded$default = remeasureAndRelayoutIfNeeded$default(this, pop, z6, false, 4, null);
                                    if (pop == this.root && remeasureAndRelayoutIfNeeded$default) {
                                        z4 = true;
                                    }
                                }
                                if (aVar != null) {
                                    aVar.invoke();
                                }
                            } else {
                                z4 = false;
                            }
                            this.duringMeasureLayout = false;
                            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                            if (layoutTreeConsistencyChecker != null) {
                                layoutTreeConsistencyChecker.assertConsistent();
                            }
                            z5 = z4;
                        } catch (Throwable th) {
                            this.duringMeasureLayout = false;
                            throw th;
                        }
                    }
                    callOnLayoutCompletedListeners();
                    return z5;
                }
                throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
            }
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
    }

    /* renamed from: measureAndLayout-0kLqBqw */
    public final void m5160measureAndLayout0kLqBqw(@l LayoutNode layoutNode, long j5) {
        if (layoutNode.isDeactivated()) {
            return;
        }
        if (!l0.g(layoutNode, this.root)) {
            if (this.root.isAttached()) {
                if (this.root.isPlaced()) {
                    if (!this.duringMeasureLayout) {
                        if (this.rootConstraints != null) {
                            this.duringMeasureLayout = true;
                            try {
                                this.relayoutNodes.remove(layoutNode);
                                boolean m5158doLookaheadRemeasuresdFAvZA = m5158doLookaheadRemeasuresdFAvZA(layoutNode, Constraints.m5988boximpl(j5));
                                m5159doRemeasuresdFAvZA(layoutNode, Constraints.m5988boximpl(j5));
                                if ((m5158doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) && l0.g(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                                    layoutNode.lookaheadReplace$ui_release();
                                }
                                if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
                                    layoutNode.replace$ui_release();
                                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                                }
                                this.duringMeasureLayout = false;
                                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                                if (layoutTreeConsistencyChecker != null) {
                                    layoutTreeConsistencyChecker.assertConsistent();
                                }
                            } catch (Throwable th) {
                                this.duringMeasureLayout = false;
                                throw th;
                            }
                        }
                        callOnLayoutCompletedListeners();
                        return;
                    }
                    throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
                }
                throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
            }
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
        throw new IllegalArgumentException("measureAndLayout called on root".toString());
    }

    public final void measureOnly() {
        if (this.relayoutNodes.isNotEmpty()) {
            if (this.root.isAttached()) {
                if (this.root.isPlaced()) {
                    if (!this.duringMeasureLayout) {
                        if (this.rootConstraints != null) {
                            this.duringMeasureLayout = true;
                            try {
                                if (!this.relayoutNodes.isEmpty(true)) {
                                    if (this.root.getLookaheadRoot$ui_release() != null) {
                                        remeasureOnly(this.root, true);
                                    } else {
                                        remeasureLookaheadRootsInSubtree(this.root);
                                    }
                                }
                                remeasureOnly(this.root, false);
                                this.duringMeasureLayout = false;
                                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                                if (layoutTreeConsistencyChecker != null) {
                                    layoutTreeConsistencyChecker.assertConsistent();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                this.duringMeasureLayout = false;
                                throw th;
                            }
                        }
                        return;
                    }
                    throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
                }
                throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
            }
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
    }

    public final void onNodeDetached(@l LayoutNode layoutNode) {
        this.relayoutNodes.remove(layoutNode);
    }

    public final void registerOnLayoutCompletedListener(@l Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.onLayoutCompletedListeners.add(onLayoutCompletedListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestLookaheadRelayout(@p4.l androidx.compose.ui.node.LayoutNode r5, boolean r6) {
        /*
            r4 = this;
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r5.getLayoutState$ui_release()
            int[] r1 = androidx.compose.ui.node.MeasureAndLayoutDelegate.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto La2
            r3 = 2
            if (r0 == r3) goto L23
            r3 = 3
            if (r0 == r3) goto La2
            r3 = 4
            if (r0 == r3) goto L23
            r3 = 5
            if (r0 != r3) goto L1d
            goto L23
        L1d:
            kotlin.j0 r5 = new kotlin.j0
            r5.<init>()
            throw r5
        L23:
            boolean r0 = r5.getLookaheadMeasurePending$ui_release()
            if (r0 != 0) goto L2f
            boolean r0 = r5.getLookaheadLayoutPending$ui_release()
            if (r0 == 0) goto L3a
        L2f:
            if (r6 != 0) goto L3a
            androidx.compose.ui.node.LayoutTreeConsistencyChecker r5 = r4.consistencyChecker
            if (r5 == 0) goto La9
            r5.assertConsistent()
            goto La9
        L3a:
            r5.markLookaheadLayoutPending$ui_release()
            r5.markLayoutPending$ui_release()
            boolean r6 = r5.isDeactivated()
            if (r6 == 0) goto L48
            goto La9
        L48:
            androidx.compose.ui.node.LayoutNode r6 = r5.getParent$ui_release()
            java.lang.Boolean r0 = r5.isPlacedInLookahead()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.l0.g(r0, r3)
            if (r0 == 0) goto L78
            if (r6 == 0) goto L62
            boolean r0 = r6.getLookaheadMeasurePending$ui_release()
            if (r0 != r1) goto L62
            r0 = r1
            goto L63
        L62:
            r0 = r2
        L63:
            if (r0 != 0) goto L78
            if (r6 == 0) goto L6f
            boolean r0 = r6.getLookaheadLayoutPending$ui_release()
            if (r0 != r1) goto L6f
            r0 = r1
            goto L70
        L6f:
            r0 = r2
        L70:
            if (r0 != 0) goto L78
            androidx.compose.ui.node.DepthSortedSetsForDifferentPasses r6 = r4.relayoutNodes
            r6.add(r5, r1)
            goto L9d
        L78:
            boolean r0 = r5.isPlaced()
            if (r0 == 0) goto L9d
            if (r6 == 0) goto L88
            boolean r0 = r6.getLayoutPending$ui_release()
            if (r0 != r1) goto L88
            r0 = r1
            goto L89
        L88:
            r0 = r2
        L89:
            if (r0 != 0) goto L9d
            if (r6 == 0) goto L95
            boolean r6 = r6.getMeasurePending$ui_release()
            if (r6 != r1) goto L95
            r6 = r1
            goto L96
        L95:
            r6 = r2
        L96:
            if (r6 != 0) goto L9d
            androidx.compose.ui.node.DepthSortedSetsForDifferentPasses r6 = r4.relayoutNodes
            r6.add(r5, r2)
        L9d:
            boolean r5 = r4.duringMeasureLayout
            if (r5 != 0) goto La9
            goto Laa
        La2:
            androidx.compose.ui.node.LayoutTreeConsistencyChecker r5 = r4.consistencyChecker
            if (r5 == 0) goto La9
            r5.assertConsistent()
        La9:
            r1 = r2
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.requestLookaheadRelayout(androidx.compose.ui.node.LayoutNode, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestLookaheadRemeasure(@p4.l androidx.compose.ui.node.LayoutNode r5, boolean r6) {
        /*
            r4 = this;
            androidx.compose.ui.node.LayoutNode r0 = r5.getLookaheadRoot$ui_release()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            r0 = r1
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto La8
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r5.getLayoutState$ui_release()
            int[] r3 = androidx.compose.ui.node.MeasureAndLayoutDelegate.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r3[r0]
            if (r0 == r1) goto La6
            r3 = 2
            if (r0 == r3) goto L95
            r3 = 3
            if (r0 == r3) goto L95
            r3 = 4
            if (r0 == r3) goto L95
            r3 = 5
            if (r0 != r3) goto L8f
            boolean r0 = r5.getLookaheadMeasurePending$ui_release()
            if (r0 == 0) goto L31
            if (r6 != 0) goto L31
            goto La6
        L31:
            r5.markLookaheadMeasurePending$ui_release()
            r5.markMeasurePending$ui_release()
            boolean r6 = r5.isDeactivated()
            if (r6 == 0) goto L3f
            goto La6
        L3f:
            java.lang.Boolean r6 = r5.isPlacedInLookahead()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.l0.g(r6, r0)
            if (r6 != 0) goto L51
            boolean r6 = r4.getCanAffectParentInLookahead(r5)
            if (r6 == 0) goto L68
        L51:
            androidx.compose.ui.node.LayoutNode r6 = r5.getParent$ui_release()
            if (r6 == 0) goto L5f
            boolean r6 = r6.getLookaheadMeasurePending$ui_release()
            if (r6 != r1) goto L5f
            r6 = r1
            goto L60
        L5f:
            r6 = r2
        L60:
            if (r6 != 0) goto L68
            androidx.compose.ui.node.DepthSortedSetsForDifferentPasses r6 = r4.relayoutNodes
            r6.add(r5, r1)
            goto L8a
        L68:
            boolean r6 = r5.isPlaced()
            if (r6 != 0) goto L74
            boolean r6 = r4.getCanAffectParent(r5)
            if (r6 == 0) goto L8a
        L74:
            androidx.compose.ui.node.LayoutNode r6 = r5.getParent$ui_release()
            if (r6 == 0) goto L82
            boolean r6 = r6.getMeasurePending$ui_release()
            if (r6 != r1) goto L82
            r6 = r1
            goto L83
        L82:
            r6 = r2
        L83:
            if (r6 != 0) goto L8a
            androidx.compose.ui.node.DepthSortedSetsForDifferentPasses r6 = r4.relayoutNodes
            r6.add(r5, r2)
        L8a:
            boolean r5 = r4.duringMeasureLayout
            if (r5 != 0) goto La6
            goto La7
        L8f:
            kotlin.j0 r5 = new kotlin.j0
            r5.<init>()
            throw r5
        L95:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest> r0 = r4.postponedMeasureRequests
            androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest r3 = new androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest
            r3.<init>(r5, r1, r6)
            r0.add(r3)
            androidx.compose.ui.node.LayoutTreeConsistencyChecker r5 = r4.consistencyChecker
            if (r5 == 0) goto La6
            r5.assertConsistent()
        La6:
            r1 = r2
        La7:
            return r1
        La8:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.requestLookaheadRemeasure(androidx.compose.ui.node.LayoutNode, boolean):boolean");
    }

    public final void requestOnPositionedCallback(@l LayoutNode layoutNode) {
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    public final boolean requestRelayout(@l LayoutNode layoutNode, boolean z4) {
        boolean z5;
        boolean z6;
        int i5 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4) {
            if (i5 == 5) {
                if (!z4 && layoutNode.isPlaced() == layoutNode.isPlacedByParent() && (layoutNode.getMeasurePending$ui_release() || layoutNode.getLayoutPending$ui_release())) {
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                } else {
                    layoutNode.markLayoutPending$ui_release();
                    if (!layoutNode.isDeactivated()) {
                        if (layoutNode.isPlacedByParent()) {
                            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                            if (parent$ui_release != null && parent$ui_release.getLayoutPending$ui_release()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (!z5) {
                                if (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release()) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (!z6) {
                                    this.relayoutNodes.add(layoutNode, false);
                                }
                            }
                        }
                        if (!this.duringMeasureLayout) {
                            return true;
                        }
                    }
                }
            } else {
                throw new j0();
            }
        } else {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
            if (layoutTreeConsistencyChecker2 != null) {
                layoutTreeConsistencyChecker2.assertConsistent();
            }
        }
        return false;
    }

    public final boolean requestRemeasure(@l LayoutNode layoutNode, boolean z4) {
        boolean z5;
        int i5 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3 && i5 != 4) {
                if (i5 == 5) {
                    if (!layoutNode.getMeasurePending$ui_release() || z4) {
                        layoutNode.markMeasurePending$ui_release();
                        if (!layoutNode.isDeactivated()) {
                            if (layoutNode.isPlaced() || getCanAffectParent(layoutNode)) {
                                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                                if (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (!z5) {
                                    this.relayoutNodes.add(layoutNode, false);
                                }
                            }
                            if (!this.duringMeasureLayout) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new j0();
                }
            } else {
                this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, z4));
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
        }
        return false;
    }

    /* renamed from: updateRootConstraints-BRTryo0 */
    public final void m5161updateRootConstraintsBRTryo0(long j5) {
        boolean m5993equalsimpl0;
        Constraints constraints = this.rootConstraints;
        boolean z4 = false;
        if (constraints == null) {
            m5993equalsimpl0 = false;
        } else {
            m5993equalsimpl0 = Constraints.m5993equalsimpl0(constraints.m6006unboximpl(), j5);
        }
        if (!m5993equalsimpl0) {
            if (!this.duringMeasureLayout) {
                this.rootConstraints = Constraints.m5988boximpl(j5);
                if (this.root.getLookaheadRoot$ui_release() != null) {
                    this.root.markLookaheadMeasurePending$ui_release();
                }
                this.root.markMeasurePending$ui_release();
                DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                LayoutNode layoutNode = this.root;
                if (layoutNode.getLookaheadRoot$ui_release() != null) {
                    z4 = true;
                }
                depthSortedSetsForDifferentPasses.add(layoutNode, z4);
                return;
            }
            throw new IllegalArgumentException("updateRootConstraints called while measuring".toString());
        }
    }
}
