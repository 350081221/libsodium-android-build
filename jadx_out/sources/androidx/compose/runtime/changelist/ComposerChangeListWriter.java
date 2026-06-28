package androidx.compose.runtime.changelist;

import android.net.http.Headers;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.y;
import p4.l;
import p4.m;
import t0.b;
import v3.a;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0083\u0001B\u0019\u0012\u0006\u0010c\u001a\u00020b\u0012\u0006\u0010e\u001a\u00020\u001c¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J \u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fJ\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u001b\u001a\u00020\u0002J\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0086\bJ\u0017\u0010!\u001a\u00020\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0086\bJ\u000e\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"J\u0018\u0010&\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00012\u0006\u0010%\u001a\u00020\u000fJ\u0006\u0010'\u001a\u00020\u0002J\u0010\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0001J\u0006\u0010*\u001a\u00020\u0002J\u0006\u0010+\u001a\u00020\u0002J\u0006\u0010,\u001a\u00020\u0002J\u0006\u0010-\u001a\u00020\u0002J\u0016\u0010/\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020.J\u001e\u0010/\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020.2\u0006\u00101\u001a\u000200J\u000e\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u000fJ\"\u00108\u001a\u00020\u00022\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0002042\u0006\u00107\u001a\u000205J\u0010\u0010:\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0001J@\u0010?\u001a\u00020\u0002\"\u0004\b\u0000\u0010;\"\u0004\b\u0001\u0010<2\u0006\u0010#\u001a\u00028\u00012\u001d\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00020=¢\u0006\u0002\b>¢\u0006\u0004\b?\u0010@J\u0016\u0010B\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fJ\u001e\u0010C\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010D\u001a\u00020\u0002J\u0006\u0010E\u001a\u00020\u0002J\u0016\u0010G\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000fJ\u0006\u0010H\u001a\u00020\u0002J\u0010\u0010I\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0001J\u0014\u0010K\u001a\u00020\u00022\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eJ\u0016\u0010N\u001a\u00020\u00022\u0006\u0010M\u001a\u00020L2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010R\u001a\u00020\u00022\u000e\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010O2\u0006\u0010Q\u001a\u00020LJ(\u0010X\u001a\u00020\u00022\b\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010V\u001a\u00020U2\u0006\u0010\u0014\u001a\u00020W2\u0006\u0010\u0013\u001a\u00020WJ\u001e\u0010[\u001a\u00020\u00022\u0006\u00107\u001a\u00020Y2\u0006\u0010V\u001a\u00020U2\u0006\u0010Z\u001a\u00020WJ\u0006\u0010\\\u001a\u00020\u0002J\u001a\u0010^\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u001c2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010LJ\u0006\u0010_\u001a\u00020\u0002J\u0006\u0010`\u001a\u00020\u0002J\u0006\u0010a\u001a\u00020\u0002R\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010e\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010p\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010l\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010vR\u001e\u0010y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010vR\u0016\u0010{\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010vR\u0016\u0010|\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010vR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010vR\u0015\u0010\u0080\u0001\u001a\u00020}8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007f¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "", "Lkotlin/r2;", "pushApplierOperationPreamble", "pushSlotEditingOperationPreamble", "", "useParentSlot", "pushSlotTableOperationPreamble", "ensureRootStarted", "Landroidx/compose/runtime/Anchor;", "anchor", "ensureGroupStarted", "forParent", "realizeOperationLocation", "realizeNodeMovementOperations", "", "removeFrom", "moveCount", "realizeRemoveNode", TypedValues.TransitionType.S_TO, TypedValues.TransitionType.S_FROM, "count", "realizeMoveNode", "pushPendingUpsAndDowns", Headers.LOCATION, "moveReaderRelativeTo", "moveReaderToAbsolute", "recordSlotEditing", "Landroidx/compose/runtime/changelist/ChangeList;", "newChangeList", "Lkotlin/Function0;", "block", "withChangeList", "withoutImplicitRootStart", "Landroidx/compose/runtime/RememberObserver;", b.f22420d, "remember", "groupSlotIndex", "updateValue", "resetSlots", "data", "updateAuxData", "endRoot", "endCurrentGroup", "skipToEndOfCurrentGroup", "removeCurrentGroup", "Landroidx/compose/runtime/SlotTable;", "insertSlots", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", TypedValues.CycleType.S_WAVE_OFFSET, "moveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "action", "composition", "endCompositionScope", "node", "useNode", "T", "V", "Lkotlin/Function2;", "Lkotlin/u;", "updateNode", "(Ljava/lang/Object;Lv3/p;)V", "nodeIndex", "removeNode", "moveNode", "releaseMovableContent", "endNodeMovement", "group", "endNodeMovementAndDeleteNode", "moveUp", "moveDown", "effect", "sideEffect", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "determineMovableContentNodeIndex", "", "nodes", "effectiveNodeIndex", "copyNodesToNewAnchorLocation", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "copySlotTableToAnchorLocation", "Landroidx/compose/runtime/ControlledComposition;", "reference", "releaseMovableGroupAtCurrent", "endMovableContentPlacement", "other", "includeOperationsIn", "finalizeComposition", "resetTransientState", "deactivateCurrentGroup", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "changeList", "Landroidx/compose/runtime/changelist/ChangeList;", "getChangeList", "()Landroidx/compose/runtime/changelist/ChangeList;", "setChangeList", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "startedGroup", "Z", "Landroidx/compose/runtime/IntStack;", "startedGroups", "Landroidx/compose/runtime/IntStack;", "implicitRootStart", "getImplicitRootStart", "()Z", "setImplicitRootStart", "(Z)V", "writersReaderDelta", "I", "pendingUps", "Landroidx/compose/runtime/Stack;", "pendingDownNodes", "Landroidx/compose/runtime/Stack;", "moveFrom", "moveTo", "Landroidx/compose/runtime/SlotReader;", "getReader", "()Landroidx/compose/runtime/SlotReader;", "reader", "<init>", "(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/changelist/ChangeList;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nComposerChangeListWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,461:1\n4178#2,5:462\n4178#2,5:467\n4178#2,5:472\n4178#2,5:477\n*S KotlinDebug\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n*L\n167#1:462,5\n229#1:467,5\n297#1:472,5\n443#1:477,5\n*E\n"})
/* loaded from: classes.dex */
public final class ComposerChangeListWriter {
    private static final int invalidGroupLocation = -2;

    @l
    private ChangeList changeList;

    @l
    private final ComposerImpl composer;
    private int moveCount;
    private int pendingUps;
    private boolean startedGroup;
    private int writersReaderDelta;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private final IntStack startedGroups = new IntStack();
    private boolean implicitRootStart = true;

    @l
    private Stack<Object> pendingDownNodes = new Stack<>();
    private int removeFrom = -1;
    private int moveFrom = -1;
    private int moveTo = -1;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter$Companion;", "", "()V", "invalidGroupLocation", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public ComposerChangeListWriter(@l ComposerImpl composerImpl, @l ChangeList changeList) {
        this.composer = composerImpl;
        this.changeList = changeList;
    }

    private final void ensureGroupStarted(Anchor anchor) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureGroupStarted(anchor);
        this.startedGroup = true;
    }

    private final void ensureRootStarted() {
        if (!this.startedGroup && this.implicitRootStart) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.changeList.pushEnsureRootStarted();
            this.startedGroup = true;
        }
    }

    private final SlotReader getReader() {
        return this.composer.getReader$runtime_release();
    }

    public static /* synthetic */ void includeOperationsIn$default(ComposerChangeListWriter composerChangeListWriter, ChangeList changeList, IntRef intRef, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            intRef = null;
        }
        composerChangeListWriter.includeOperationsIn(changeList, intRef);
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushPendingUpsAndDowns() {
        int i5 = this.pendingUps;
        if (i5 > 0) {
            this.changeList.pushUps(i5);
            this.pendingUps = 0;
        }
        if (this.pendingDownNodes.isNotEmpty()) {
            this.changeList.pushDowns(this.pendingDownNodes.toArray());
            this.pendingDownNodes.clear();
        }
    }

    private final void pushSlotEditingOperationPreamble() {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
    }

    private final void pushSlotTableOperationPreamble(boolean z4) {
        realizeOperationLocation(z4);
    }

    static /* synthetic */ void pushSlotTableOperationPreamble$default(ComposerChangeListWriter composerChangeListWriter, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        composerChangeListWriter.pushSlotTableOperationPreamble(z4);
    }

    private final void realizeMoveNode(int i5, int i6, int i7) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(i5, i6, i7);
    }

    private final void realizeNodeMovementOperations() {
        int i5 = this.moveCount;
        if (i5 > 0) {
            int i6 = this.removeFrom;
            if (i6 >= 0) {
                realizeRemoveNode(i6, i5);
                this.removeFrom = -1;
            } else {
                realizeMoveNode(this.moveTo, this.moveFrom, i5);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void realizeOperationLocation(boolean z4) {
        int currentGroup;
        boolean z5;
        if (z4) {
            currentGroup = getReader().getParent();
        } else {
            currentGroup = getReader().getCurrentGroup();
        }
        int i5 = currentGroup - this.writersReaderDelta;
        if (i5 >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            if (i5 > 0) {
                this.changeList.pushAdvanceSlotsBy(i5);
                this.writersReaderDelta = currentGroup;
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Tried to seek backward".toString());
        throw new y();
    }

    static /* synthetic */ void realizeOperationLocation$default(ComposerChangeListWriter composerChangeListWriter, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        composerChangeListWriter.realizeOperationLocation(z4);
    }

    private final void realizeRemoveNode(int i5, int i6) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(i5, i6);
    }

    public final void copyNodesToNewAnchorLocation(@l List<? extends Object> list, @l IntRef intRef) {
        this.changeList.pushCopyNodesToNewAnchorLocation(list, intRef);
    }

    public final void copySlotTableToAnchorLocation(@m MovableContentState movableContentState, @l CompositionContext compositionContext, @l MovableContentStateReference movableContentStateReference, @l MovableContentStateReference movableContentStateReference2) {
        this.changeList.pushCopySlotTableToAnchorLocation(movableContentState, compositionContext, movableContentStateReference, movableContentStateReference2);
    }

    public final void deactivateCurrentGroup() {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushDeactivateCurrentGroup();
    }

    public final void determineMovableContentNodeIndex(@l IntRef intRef, @l Anchor anchor) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(intRef, anchor);
    }

    public final void endCompositionScope(@l v3.l<? super Composition, r2> lVar, @l Composition composition) {
        this.changeList.pushEndCompositionScope(lVar, composition);
    }

    public final void endCurrentGroup() {
        boolean z4;
        int parent = getReader().getParent();
        if (this.startedGroups.peekOr(-1) <= parent) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.startedGroups.peekOr(-1) == parent) {
                pushSlotTableOperationPreamble$default(this, false, 1, null);
                this.startedGroups.pop();
                this.changeList.pushEndCurrentGroup();
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Missed recording an endGroup".toString());
        throw new y();
    }

    public final void endMovableContentPlacement() {
        this.changeList.pushEndMovableContentPlacement();
        this.writersReaderDelta = 0;
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int i5, int i6) {
        int nodeCount;
        endNodeMovement();
        pushPendingUpsAndDowns();
        if (getReader().isNode(i6)) {
            nodeCount = 1;
        } else {
            nodeCount = getReader().nodeCount(i6);
        }
        if (nodeCount > 0) {
            removeNode(i5, nodeCount);
        }
    }

    public final void endRoot() {
        if (this.startedGroup) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.changeList.pushEndCurrentGroup();
            this.startedGroup = false;
        }
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        if (this.startedGroups.isEmpty()) {
            return;
        }
        ComposerKt.composeRuntimeError("Missed recording an endGroup()".toString());
        throw new y();
    }

    @l
    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void includeOperationsIn(@l ChangeList changeList, @m IntRef intRef) {
        this.changeList.pushExecuteOperationsIn(changeList, intRef);
    }

    public final void insertSlots(@l Anchor anchor, @l SlotTable slotTable) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        this.changeList.pushInsertSlots(anchor, slotTable);
    }

    public final void moveCurrentGroup(int i5) {
        pushSlotEditingOperationPreamble();
        this.changeList.pushMoveCurrentGroup(i5);
    }

    public final void moveDown(@m Object obj) {
        this.pendingDownNodes.push(obj);
    }

    public final void moveNode(int i5, int i6, int i7) {
        if (i7 > 0) {
            int i8 = this.moveCount;
            if (i8 > 0 && this.moveFrom == i5 - i8 && this.moveTo == i6 - i8) {
                this.moveCount = i8 + i7;
                return;
            }
            realizeNodeMovementOperations();
            this.moveFrom = i5;
            this.moveTo = i6;
            this.moveCount = i7;
        }
    }

    public final void moveReaderRelativeTo(int i5) {
        this.writersReaderDelta += i5 - getReader().getCurrentGroup();
    }

    public final void moveReaderToAbsolute(int i5) {
        this.writersReaderDelta = i5;
    }

    public final void moveUp() {
        if (this.pendingDownNodes.isNotEmpty()) {
            this.pendingDownNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    public final void recordSlotEditing() {
        SlotReader reader;
        int parent;
        if (getReader().getSize() > 0 && this.startedGroups.peekOr(-2) != (parent = (reader = getReader()).getParent())) {
            ensureRootStarted();
            if (parent > 0) {
                Anchor anchor = reader.anchor(parent);
                this.startedGroups.push(parent);
                ensureGroupStarted(anchor);
            }
        }
    }

    public final void releaseMovableContent() {
        pushPendingUpsAndDowns();
        if (this.startedGroup) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void releaseMovableGroupAtCurrent(@l ControlledComposition controlledComposition, @l CompositionContext compositionContext, @l MovableContentStateReference movableContentStateReference) {
        this.changeList.pushReleaseMovableGroupAtCurrent(controlledComposition, compositionContext, movableContentStateReference);
    }

    public final void remember(@l RememberObserver rememberObserver) {
        this.changeList.pushRemember(rememberObserver);
    }

    public final void removeCurrentGroup() {
        pushSlotEditingOperationPreamble();
        this.changeList.pushRemoveCurrentGroup();
        this.writersReaderDelta += getReader().getGroupSize();
    }

    public final void removeNode(int i5, int i6) {
        boolean z4;
        if (i6 > 0) {
            if (i5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (this.removeFrom == i5) {
                    this.moveCount += i6;
                    return;
                }
                realizeNodeMovementOperations();
                this.removeFrom = i5;
                this.moveCount = i6;
                return;
            }
            ComposerKt.composeRuntimeError(("Invalid remove index " + i5).toString());
            throw new y();
        }
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void resetTransientState() {
        this.startedGroup = false;
        this.startedGroups.clear();
        this.writersReaderDelta = 0;
    }

    public final void setChangeList(@l ChangeList changeList) {
        this.changeList = changeList;
    }

    public final void setImplicitRootStart(boolean z4) {
        this.implicitRootStart = z4;
    }

    public final void sideEffect(@l a<r2> aVar) {
        this.changeList.pushSideEffect(aVar);
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void updateAuxData(@m Object obj) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushUpdateAuxData(obj);
    }

    public final <T, V> void updateNode(V v4, @l p<? super T, ? super V, r2> pVar) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(v4, pVar);
    }

    public final void updateValue(@m Object obj, int i5) {
        pushSlotTableOperationPreamble(true);
        this.changeList.pushUpdateValue(obj, i5);
    }

    public final void useNode(@m Object obj) {
        pushApplierOperationPreamble();
        this.changeList.pushUseNode(obj);
    }

    public final void withChangeList(@l ChangeList changeList, @l a<r2> aVar) {
        ChangeList changeList2 = getChangeList();
        try {
            setChangeList(changeList);
            aVar.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            setChangeList(changeList2);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public final void withoutImplicitRootStart(@l a<r2> aVar) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            aVar.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            setImplicitRootStart(implicitRootStart);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public final void insertSlots(@l Anchor anchor, @l SlotTable slotTable, @l FixupList fixupList) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        this.changeList.pushInsertSlots(anchor, slotTable, fixupList);
    }
}
