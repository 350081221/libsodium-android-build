package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.y;
import p4.l;
import t0.b;
import u3.f;
import v3.a;
import v3.p;
import v3.q;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:!!\"#$%&'()*+,-./0123456789:;<=>?@AB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J(\u0010\n\u001a\u00020\t*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\b\u0010\u0014\u001a\u00020\rH\u0016R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u001fBCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006a"}, d2 = {"Landroidx/compose/runtime/changelist/Operation;", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "objectParamName", "toString", "", "ints", "I", "getInts", "()I", "objects", "getObjects", "getName", "()Ljava/lang/String;", "name", "<init>", "(II)V", "AdvanceSlotsBy", "ApplyChangeList", "CopyNodesToNewAnchorLocation", "CopySlotTableToAnchorLocation", "DeactivateCurrentGroup", "DetermineMovableContentNodeIndex", "Downs", "EndCompositionScope", "EndCurrentGroup", "EndMovableContentPlacement", "EnsureGroupStarted", "EnsureRootGroupStarted", "InsertNodeFixup", "InsertSlots", "InsertSlotsWithFixups", "IntParameter", "MoveCurrentGroup", "MoveNode", "ObjectParameter", "PostInsertNodeFixup", "ReleaseMovableGroupAtCurrent", "Remember", "RemoveCurrentGroup", "RemoveNode", "ResetSlots", "SideEffect", "SkipToEndOfCurrentGroup", "TestOperation", "UpdateAuxData", "UpdateNode", "UpdateValue", "Ups", "UseCurrentNode", "Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class Operation {
    public static final int $stable = 0;
    private final int ints;
    private final int objects;

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0018\u0010\u0013\u001a\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "getDistance-jn0FJLE", "()I", "Distance", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n1#1,879:1\n116#1:880\n116#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n119#1:880\n128#1:881\n*E\n"})
    /* loaded from: classes.dex */
    public static final class AdvanceSlotsBy extends Operation {
        public static final int $stable = 0;

        @l
        public static final AdvanceSlotsBy INSTANCE = new AdvanceSlotsBy();

        private AdvanceSlotsBy() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            slotWriter.advanceBy(operationArgContainer.mo3334getIntw8GmfQM(IntParameter.m3302constructorimpl(0)));
        }

        /* renamed from: getDistance-jn0FJLE, reason: not valid java name */
        public final int m3278getDistancejn0FJLE() {
            return IntParameter.m3302constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: intParamName-w8GmfQM */
        public String mo3276intParamNamew8GmfQM(int i5) {
            if (IntParameter.m3304equalsimpl0(i5, IntParameter.m3302constructorimpl(0))) {
                return "distance";
            }
            return super.mo3276intParamNamew8GmfQM(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Landroidx/compose/runtime/changelist/ChangeList;", "getChanges-HpuvwBQ", "()I", "Changes", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "EffectiveNodeIndex", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,879:1\n681#1:880\n682#1:881\n682#1:882\n681#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n685#1:880\n686#1:881\n695#1:882\n697#1:883\n*E\n"})
    /* loaded from: classes.dex */
    public static final class ApplyChangeList extends Operation {
        public static final int $stable = 0;

        @l
        public static final ApplyChangeList INSTANCE = new ApplyChangeList();

        private ApplyChangeList() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            int i5;
            IntRef intRef = (IntRef) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(1));
            if (intRef != null) {
                i5 = intRef.getElement();
            } else {
                i5 = 0;
            }
            ChangeList changeList = (ChangeList) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0));
            if (i5 > 0) {
                applier = new OffsetApplier(applier, i5);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotWriter, rememberManager);
        }

        /* renamed from: getChanges-HpuvwBQ, reason: not valid java name */
        public final int m3279getChangesHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        /* renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m3280getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "changes";
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(1))) {
                return "effectiveNodeIndex";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R&\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "()I", "EffectiveNodeIndex", "", "", "getNodes-HpuvwBQ", "Nodes", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,879:1\n567#1:880\n568#1:881\n567#1:882\n568#1:883\n64#2,6:884\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n*L\n571#1:880\n572#1:881\n581#1:882\n582#1:883\n584#1:884,6\n*E\n"})
    /* loaded from: classes.dex */
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable = 0;

        @l
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();

        private CopyNodesToNewAnchorLocation() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            int element = ((IntRef) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0))).getElement();
            List list = (List) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(1));
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = list.get(i5);
                l0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i6 = element + i5;
                applier.insertBottomUp(i6, obj);
                applier.insertTopDown(i6, obj);
            }
        }

        /* renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m3281getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        /* renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m3282getNodesHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "effectiveNodeIndex";
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(1))) {
                return "nodes";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R \u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Landroidx/compose/runtime/MovableContentState;", "getResolvedState-HpuvwBQ", "()I", "ResolvedState", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "ParentCompositionContext", "Landroidx/compose/runtime/MovableContentStateReference;", "getFrom-HpuvwBQ", "From", "getTo-HpuvwBQ", "To", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n1#1,879:1\n594#1:880\n595#1:881\n596#1:882\n597#1:883\n596#1:884\n597#1:885\n595#1:886\n594#1:887\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n600#1:880\n601#1:881\n602#1:882\n603#1:883\n612#1:884\n613#1:885\n615#1:886\n617#1:887\n*E\n"})
    /* loaded from: classes.dex */
    public static final class CopySlotTableToAnchorLocation extends Operation {
        public static final int $stable = 0;

        @l
        public static final CopySlotTableToAnchorLocation INSTANCE = new CopySlotTableToAnchorLocation();

        private CopySlotTableToAnchorLocation() {
            super(0, 4, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(2));
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(3));
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(1));
            MovableContentState movableContentState = (MovableContentState) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0));
            if (movableContentState == null && (movableContentState = compositionContext.movableContentStateResolve$runtime_release(movableContentStateReference)) == null) {
                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                throw new y();
            }
            List<Anchor> moveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, movableContentState.getSlotTable$runtime_release(), 2);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            ControlledComposition composition$runtime_release = movableContentStateReference2.getComposition$runtime_release();
            l0.n(composition$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.adoptAnchoredScopes$runtime_release(slotWriter, moveIntoGroupFrom, (RecomposeScopeOwner) composition$runtime_release);
        }

        /* renamed from: getFrom-HpuvwBQ, reason: not valid java name */
        public final int m3283getFromHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(2);
        }

        /* renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m3284getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(1);
        }

        /* renamed from: getResolvedState-HpuvwBQ, reason: not valid java name */
        public final int m3285getResolvedStateHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        /* renamed from: getTo-HpuvwBQ, reason: not valid java name */
        public final int m3286getToHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "resolvedState";
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(1))) {
                return "resolvedCompositionContext";
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(2))) {
                return TypedValues.TransitionType.S_FROM;
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(3))) {
                return TypedValues.TransitionType.S_TO;
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\n\u001a\u00020\t*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class DeactivateCurrentGroup extends Operation {
        public static final int $stable = 0;

        @l
        public static final DeactivateCurrentGroup INSTANCE = new DeactivateCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private DeactivateCurrentGroup() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.DeactivateCurrentGroup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            ComposerKt.deactivateCurrentGroup(slotWriter, rememberManager);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndexOut-HpuvwBQ", "()I", "EffectiveNodeIndexOut", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "Anchor", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n1#1,879:1\n539#1:880\n540#1:881\n539#1:882\n540#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n543#1:880\n544#1:881\n554#1:882\n558#1:883\n*E\n"})
    /* loaded from: classes.dex */
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable = 0;

        @l
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();

        private DetermineMovableContentNodeIndex() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            IntRef intRef = (IntRef) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0));
            Anchor anchor = (Anchor) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(1));
            l0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            intRef.setElement(OperationKt.access$positionToInsert(slotWriter, anchor, applier));
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3287getAnchorHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(1);
        }

        /* renamed from: getEffectiveNodeIndexOut-HpuvwBQ, reason: not valid java name */
        public final int m3288getEffectiveNodeIndexOutHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "effectiveNodeIndexOut";
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(1))) {
                return "anchor";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R&\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "", "", "getNodes-HpuvwBQ", "()I", "Nodes", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n1#1,879:1\n94#1:880\n94#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n97#1:880\n108#1:881\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Downs extends Operation {
        public static final int $stable = 0;

        @l
        public static final Downs INSTANCE = new Downs();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Downs() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.Downs.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            l0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0))) {
                applier.down(obj);
            }
        }

        /* renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m3289getNodesHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "nodes";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R*\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "getAction-HpuvwBQ", "()I", "Action", "getComposition-HpuvwBQ", "Composition", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n1#1,879:1\n294#1:880\n295#1:881\n294#1:882\n295#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n298#1:880\n299#1:881\n308#1:882\n309#1:883\n*E\n"})
    /* loaded from: classes.dex */
    public static final class EndCompositionScope extends Operation {
        public static final int $stable = 0;

        @l
        public static final EndCompositionScope INSTANCE = new EndCompositionScope();

        private EndCompositionScope() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            ((v3.l) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0))).invoke((Composition) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(1)));
        }

        /* renamed from: getAction-HpuvwBQ, reason: not valid java name */
        public final int m3290getActionHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        /* renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m3291getCompositionHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "anchor";
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(1))) {
                return "composition";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\n\u001a\u00020\t*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class EndCurrentGroup extends Operation {
        public static final int $stable = 0;

        @l
        public static final EndCurrentGroup INSTANCE = new EndCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private EndCurrentGroup() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EndCurrentGroup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            slotWriter.endGroup();
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\n\u001a\u00020\t*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class EndMovableContentPlacement extends Operation {
        public static final int $stable = 0;

        @l
        public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private EndMovableContentPlacement() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EndMovableContentPlacement.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            l0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            OperationKt.access$positionToParentOf(slotWriter, applier, 0);
            slotWriter.endGroup();
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Anchor", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n1#1,879:1\n230#1:880\n230#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n233#1:880\n242#1:881\n*E\n"})
    /* loaded from: classes.dex */
    public static final class EnsureGroupStarted extends Operation {
        public static final int $stable = 0;

        @l
        public static final EnsureGroupStarted INSTANCE = new EnsureGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private EnsureGroupStarted() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EnsureGroupStarted.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            slotWriter.ensureStarted((Anchor) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0)));
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3292getAnchorHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "anchor";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\n\u001a\u00020\t*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class EnsureRootGroupStarted extends Operation {
        public static final int $stable = 0;

        @l
        public static final EnsureRootGroupStarted INSTANCE = new EnsureRootGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private EnsureRootGroupStarted() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.EnsureRootGroupStarted.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            slotWriter.ensureStarted(0);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J(\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R&\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Lkotlin/Function0;", "", "getFactory-HpuvwBQ", "()I", "Factory", "getInsertIndex-jn0FJLE", "InsertIndex", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "GroupAnchor", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n1#1,879:1\n457#1:880\n456#1:881\n458#1:882\n456#1:883\n458#1:884\n457#1:885\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n461#1:880\n466#1:881\n467#1:882\n476#1:883\n477#1:884\n478#1:885\n*E\n"})
    /* loaded from: classes.dex */
    public static final class InsertNodeFixup extends Operation {
        public static final int $stable = 0;

        @l
        public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();

        private InsertNodeFixup() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            Object invoke = ((a) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0))).invoke();
            Anchor anchor = (Anchor) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(1));
            int mo3334getIntw8GmfQM = operationArgContainer.mo3334getIntw8GmfQM(IntParameter.m3302constructorimpl(0));
            l0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter.updateNode(anchor, invoke);
            applier.insertTopDown(mo3334getIntw8GmfQM, invoke);
            applier.down(invoke);
        }

        /* renamed from: getFactory-HpuvwBQ, reason: not valid java name */
        public final int m3293getFactoryHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        /* renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3294getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(1);
        }

        /* renamed from: getInsertIndex-jn0FJLE, reason: not valid java name */
        public final int m3295getInsertIndexjn0FJLE() {
            return IntParameter.m3302constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: intParamName-w8GmfQM */
        public String mo3276intParamNamew8GmfQM(int i5) {
            if (IntParameter.m3304equalsimpl0(i5, IntParameter.m3302constructorimpl(0))) {
                return "insertIndex";
            }
            return super.mo3276intParamNamew8GmfQM(i5);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "factory";
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(1))) {
                return "groupAnchor";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Anchor", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "FromSlotTable", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n1#1,879:1\n394#1:880\n395#1:881\n395#1:882\n394#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n398#1:880\n399#1:881\n408#1:882\n409#1:883\n*E\n"})
    /* loaded from: classes.dex */
    public static final class InsertSlots extends Operation {
        public static final int $stable = 0;

        @l
        public static final InsertSlots INSTANCE = new InsertSlots();

        private InsertSlots() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0));
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3296getAnchorHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        /* renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m3297getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "anchor";
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(1))) {
                return TypedValues.TransitionType.S_FROM;
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Anchor", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "FromSlotTable", "Landroidx/compose/runtime/changelist/FixupList;", "getFixups-HpuvwBQ", "Fixups", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,879:1\n422#1:880\n423#1:881\n424#1:882\n423#1:883\n422#1:884\n424#1:885\n166#2,8:886\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n*L\n427#1:880\n428#1:881\n429#1:882\n438#1:883\n439#1:884\n440#1:885\n442#1:886,8\n*E\n"})
    /* loaded from: classes.dex */
    public static final class InsertSlotsWithFixups extends Operation {
        public static final int $stable = 0;

        @l
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();

        private InsertSlotsWithFixups() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0));
            FixupList fixupList = (FixupList) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(2));
            SlotWriter openWriter = slotTable.openWriter();
            try {
                fixupList.executeAndFlushAllPendingFixups(applier, openWriter, rememberManager);
                r2 r2Var = r2.f19517a;
                openWriter.close();
                slotWriter.beginInsert();
                slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
                slotWriter.endInsert();
            } catch (Throwable th) {
                openWriter.close();
                throw th;
            }
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3298getAnchorHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        /* renamed from: getFixups-HpuvwBQ, reason: not valid java name */
        public final int m3299getFixupsHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(2);
        }

        /* renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m3300getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "anchor";
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(1))) {
                return TypedValues.TransitionType.S_FROM;
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(2))) {
                return "fixups";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$IntParameter;", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "constructor-impl", "(I)I", "getOffset", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @f
    /* loaded from: classes.dex */
    public static final class IntParameter {
        private final int offset;

        private /* synthetic */ IntParameter(int i5) {
            this.offset = i5;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IntParameter m3301boximpl(int i5) {
            return new IntParameter(i5);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m3302constructorimpl(int i5) {
            return i5;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m3303equalsimpl(int i5, Object obj) {
            return (obj instanceof IntParameter) && i5 == ((IntParameter) obj).m3307unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3304equalsimpl0(int i5, int i6) {
            return i5 == i6;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m3305hashCodeimpl(int i5) {
            return Integer.hashCode(i5);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m3306toStringimpl(int i5) {
            return "IntParameter(offset=" + i5 + ')';
        }

        public boolean equals(Object obj) {
            return m3303equalsimpl(this.offset, obj);
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return m3305hashCodeimpl(this.offset);
        }

        public String toString() {
            return m3306toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m3307unboximpl() {
            return this.offset;
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0018\u0010\u0013\u001a\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "getOffset-jn0FJLE", "()I", "Offset", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n1#1,879:1\n257#1:880\n257#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n260#1:880\n269#1:881\n*E\n"})
    /* loaded from: classes.dex */
    public static final class MoveCurrentGroup extends Operation {
        public static final int $stable = 0;

        @l
        public static final MoveCurrentGroup INSTANCE = new MoveCurrentGroup();

        private MoveCurrentGroup() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            slotWriter.moveGroup(operationArgContainer.mo3334getIntw8GmfQM(IntParameter.m3302constructorimpl(0)));
        }

        /* renamed from: getOffset-jn0FJLE, reason: not valid java name */
        public final int m3308getOffsetjn0FJLE() {
            return IntParameter.m3302constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: intParamName-w8GmfQM */
        public String mo3276intParamNamew8GmfQM(int i5) {
            if (IntParameter.m3304equalsimpl0(i5, IntParameter.m3302constructorimpl(0))) {
                return TypedValues.CycleType.S_WAVE_OFFSET;
            }
            return super.mo3276intParamNamew8GmfQM(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0018\u0010\u0013\u001a\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0017\u001a\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "getFrom-jn0FJLE", "()I", "From", "getTo-jn0FJLE", "To", "getCount-jn0FJLE", "Count", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n1#1,879:1\n369#1:880\n370#1:881\n371#1:882\n369#1:883\n370#1:884\n371#1:885\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n374#1:880\n375#1:881\n376#1:882\n386#1:883\n387#1:884\n388#1:885\n*E\n"})
    /* loaded from: classes.dex */
    public static final class MoveNode extends Operation {
        public static final int $stable = 0;

        @l
        public static final MoveNode INSTANCE = new MoveNode();

        private MoveNode() {
            super(3, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            applier.move(operationArgContainer.mo3334getIntw8GmfQM(IntParameter.m3302constructorimpl(0)), operationArgContainer.mo3334getIntw8GmfQM(IntParameter.m3302constructorimpl(1)), operationArgContainer.mo3334getIntw8GmfQM(IntParameter.m3302constructorimpl(2)));
        }

        /* renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m3309getCountjn0FJLE() {
            return IntParameter.m3302constructorimpl(2);
        }

        /* renamed from: getFrom-jn0FJLE, reason: not valid java name */
        public final int m3310getFromjn0FJLE() {
            return IntParameter.m3302constructorimpl(0);
        }

        /* renamed from: getTo-jn0FJLE, reason: not valid java name */
        public final int m3311getTojn0FJLE() {
            return IntParameter.m3302constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: intParamName-w8GmfQM */
        public String mo3276intParamNamew8GmfQM(int i5) {
            if (IntParameter.m3304equalsimpl0(i5, IntParameter.m3302constructorimpl(0))) {
                return TypedValues.TransitionType.S_FROM;
            }
            if (IntParameter.m3304equalsimpl0(i5, IntParameter.m3302constructorimpl(1))) {
                return TypedValues.TransitionType.S_TO;
            }
            if (IntParameter.m3304equalsimpl0(i5, IntParameter.m3302constructorimpl(2))) {
                return "count";
            }
            return super.mo3276intParamNamew8GmfQM(i5);
        }
    }

    @f
    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0003¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "T", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "constructor-impl", "(I)I", "getOffset", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ObjectParameter<T> {
        private final int offset;

        private /* synthetic */ ObjectParameter(int i5) {
            this.offset = i5;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ObjectParameter m3312boximpl(int i5) {
            return new ObjectParameter(i5);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static <T> int m3313constructorimpl(int i5) {
            return i5;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m3314equalsimpl(int i5, Object obj) {
            return (obj instanceof ObjectParameter) && i5 == ((ObjectParameter) obj).m3318unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3315equalsimpl0(int i5, int i6) {
            return i5 == i6;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m3316hashCodeimpl(int i5) {
            return Integer.hashCode(i5);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m3317toStringimpl(int i5) {
            return "ObjectParameter(offset=" + i5 + ')';
        }

        public boolean equals(Object obj) {
            return m3314equalsimpl(this.offset, obj);
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return m3316hashCodeimpl(this.offset);
        }

        public String toString() {
            return m3317toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m3318unboximpl() {
            return this.offset;
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J(\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0018\u0010\u0016\u001a\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "getInsertIndex-jn0FJLE", "()I", "InsertIndex", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "GroupAnchor", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n1#1,879:1\n488#1:880\n489#1:881\n489#1:882\n488#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n492#1:880\n497#1:881\n506#1:882\n507#1:883\n*E\n"})
    /* loaded from: classes.dex */
    public static final class PostInsertNodeFixup extends Operation {
        public static final int $stable = 0;

        @l
        public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private PostInsertNodeFixup() {
            /*
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            Anchor anchor = (Anchor) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0));
            int mo3334getIntw8GmfQM = operationArgContainer.mo3334getIntw8GmfQM(IntParameter.m3302constructorimpl(0));
            applier.up();
            l0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier.insertBottomUp(mo3334getIntw8GmfQM, slotWriter.node(anchor));
        }

        /* renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m3319getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        /* renamed from: getInsertIndex-jn0FJLE, reason: not valid java name */
        public final int m3320getInsertIndexjn0FJLE() {
            return IntParameter.m3302constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: intParamName-w8GmfQM */
        public String mo3276intParamNamew8GmfQM(int i5) {
            if (IntParameter.m3304equalsimpl0(i5, IntParameter.m3302constructorimpl(0))) {
                return "insertIndex";
            }
            return super.mo3276intParamNamew8GmfQM(i5);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "groupAnchor";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Landroidx/compose/runtime/ControlledComposition;", "getComposition-HpuvwBQ", "()I", "Composition", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "ParentCompositionContext", "Landroidx/compose/runtime/MovableContentStateReference;", "getReference-HpuvwBQ", "Reference", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n1#1,879:1\n655#1:880\n656#1:881\n657#1:882\n655#1:883\n656#1:884\n657#1:885\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n660#1:880\n661#1:881\n662#1:882\n672#1:883\n673#1:884\n674#1:885\n*E\n"})
    /* loaded from: classes.dex */
    public static final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final int $stable = 0;

        @l
        public static final ReleaseMovableGroupAtCurrent INSTANCE = new ReleaseMovableGroupAtCurrent();

        private ReleaseMovableGroupAtCurrent() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            OperationKt.access$releaseMovableGroupAtCurrent((ControlledComposition) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0)), (CompositionContext) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(1)), (MovableContentStateReference) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(2)), slotWriter);
        }

        /* renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m3321getCompositionHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        /* renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m3322getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(1);
        }

        /* renamed from: getReference-HpuvwBQ, reason: not valid java name */
        public final int m3323getReferenceHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "composition";
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(1))) {
                return "parentCompositionContext";
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(2))) {
                return "reference";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Landroidx/compose/runtime/RememberObserver;", "getValue-HpuvwBQ", "()I", "Value", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n1#1,879:1\n152#1:880\n152#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n155#1:880\n164#1:881\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Remember extends Operation {
        public static final int $stable = 0;

        @l
        public static final Remember INSTANCE = new Remember();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Remember() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.Remember.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            rememberManager.remembering((RememberObserver) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0)));
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m3324getValueHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return b.f22420d;
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\n\u001a\u00020\t*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class RemoveCurrentGroup extends Operation {
        public static final int $stable = 0;

        @l
        public static final RemoveCurrentGroup INSTANCE = new RemoveCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private RemoveCurrentGroup() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.RemoveCurrentGroup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0018\u0010\u0013\u001a\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "getRemoveIndex-jn0FJLE", "()I", "RemoveIndex", "getCount-jn0FJLE", "Count", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n1#1,879:1\n347#1:880\n348#1:881\n347#1:882\n348#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n351#1:880\n352#1:881\n362#1:882\n363#1:883\n*E\n"})
    /* loaded from: classes.dex */
    public static final class RemoveNode extends Operation {
        public static final int $stable = 0;

        @l
        public static final RemoveNode INSTANCE = new RemoveNode();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private RemoveNode() {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                r2 = 2
                r3.<init>(r2, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.RemoveNode.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            applier.remove(operationArgContainer.mo3334getIntw8GmfQM(IntParameter.m3302constructorimpl(0)), operationArgContainer.mo3334getIntw8GmfQM(IntParameter.m3302constructorimpl(1)));
        }

        /* renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m3325getCountjn0FJLE() {
            return IntParameter.m3302constructorimpl(1);
        }

        /* renamed from: getRemoveIndex-jn0FJLE, reason: not valid java name */
        public final int m3326getRemoveIndexjn0FJLE() {
            return IntParameter.m3302constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: intParamName-w8GmfQM */
        public String mo3276intParamNamew8GmfQM(int i5) {
            if (IntParameter.m3304equalsimpl0(i5, IntParameter.m3302constructorimpl(0))) {
                return "removeIndex";
            }
            if (IntParameter.m3304equalsimpl0(i5, IntParameter.m3302constructorimpl(1))) {
                return "count";
            }
            return super.mo3276intParamNamew8GmfQM(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\n\u001a\u00020\t*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class ResetSlots extends Operation {
        public static final int $stable = 0;

        @l
        public static final ResetSlots INSTANCE = new ResetSlots();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private ResetSlots() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.ResetSlots.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            slotWriter.reset();
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "Lkotlin/Function0;", "getEffect-HpuvwBQ", "()I", "Effect", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n1#1,879:1\n135#1:880\n135#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n138#1:880\n147#1:881\n*E\n"})
    /* loaded from: classes.dex */
    public static final class SideEffect extends Operation {
        public static final int $stable = 0;

        @l
        public static final SideEffect INSTANCE = new SideEffect();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private SideEffect() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.SideEffect.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            rememberManager.sideEffect((a) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0)));
        }

        /* renamed from: getEffect-HpuvwBQ, reason: not valid java name */
        public final int m3327getEffectHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "effect";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\n\u001a\u00020\t*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class SkipToEndOfCurrentGroup extends Operation {
        public static final int $stable = 0;

        @l
        public static final SkipToEndOfCurrentGroup INSTANCE = new SkipToEndOfCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private SkipToEndOfCurrentGroup() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.SkipToEndOfCurrentGroup.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            slotWriter.skipToGroupEnd();
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R \u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "", "getData-HpuvwBQ", "()I", "Data", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n1#1,879:1\n203#1:880\n203#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n206#1:880\n215#1:881\n*E\n"})
    /* loaded from: classes.dex */
    public static final class UpdateAuxData extends Operation {
        public static final int $stable = 0;

        @l
        public static final UpdateAuxData INSTANCE = new UpdateAuxData();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private UpdateAuxData() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.UpdateAuxData.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            slotWriter.updateAux(operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0)));
        }

        /* renamed from: getData-HpuvwBQ, reason: not valid java name */
        public final int m3328getDataHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return "data";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R \u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R9\u0010\u0018\u001a#\u0012\u001f\u0012\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0002\b\u00160\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "", "getValue-HpuvwBQ", "()I", "Value", "Lkotlin/Function2;", "Lkotlin/u;", "getBlock-HpuvwBQ", "Block", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,879:1\n326#1:880\n327#1:881\n326#1:882\n327#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n330#1:880\n331#1:881\n340#1:882\n341#1:883\n*E\n"})
    /* loaded from: classes.dex */
    public static final class UpdateNode extends Operation {
        public static final int $stable = 0;

        @l
        public static final UpdateNode INSTANCE = new UpdateNode();

        private UpdateNode() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            ((p) operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(1))).invoke(applier.getCurrent(), operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0)));
        }

        /* renamed from: getBlock-HpuvwBQ, reason: not valid java name */
        public final int m3329getBlockHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(1);
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m3330getValueHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return b.f22420d;
            }
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(1))) {
                return "block";
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J(\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R \u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "", "getValue-HpuvwBQ", "()I", "Value", "getGroupSlotIndex-jn0FJLE", "GroupSlotIndex", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n1#1,879:1\n170#1:880\n169#1:881\n169#1:882\n170#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n173#1:880\n178#1:881\n187#1:882\n188#1:883\n*E\n"})
    /* loaded from: classes.dex */
    public static final class UpdateValue extends Operation {
        public static final int $stable = 0;

        @l
        public static final UpdateValue INSTANCE = new UpdateValue();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private UpdateValue() {
            /*
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.UpdateValue.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            Object mo3335getObject31yXWZQ = operationArgContainer.mo3335getObject31yXWZQ(ObjectParameter.m3313constructorimpl(0));
            int mo3334getIntw8GmfQM = operationArgContainer.mo3334getIntw8GmfQM(IntParameter.m3302constructorimpl(0));
            if (mo3335getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering(((RememberObserverHolder) mo3335getObject31yXWZQ).getWrapped());
            }
            Object obj = slotWriter.set(mo3334getIntw8GmfQM, mo3335getObject31yXWZQ);
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting(((RememberObserverHolder) obj).getWrapped());
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }

        /* renamed from: getGroupSlotIndex-jn0FJLE, reason: not valid java name */
        public final int m3331getGroupSlotIndexjn0FJLE() {
            return IntParameter.m3302constructorimpl(0);
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m3332getValueHpuvwBQ() {
            return ObjectParameter.m3313constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: intParamName-w8GmfQM */
        public String mo3276intParamNamew8GmfQM(int i5) {
            if (IntParameter.m3304equalsimpl0(i5, IntParameter.m3302constructorimpl(0))) {
                return "groupSlotIndex";
            }
            return super.mo3276intParamNamew8GmfQM(i5);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: objectParamName-31yXWZQ */
        public String mo3277objectParamName31yXWZQ(int i5) {
            if (ObjectParameter.m3315equalsimpl0(i5, ObjectParameter.m3313constructorimpl(0))) {
                return b.f22420d;
            }
            return super.mo3277objectParamName31yXWZQ(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0010\u001a\u00020\u000f*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0018\u0010\u0013\u001a\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "getCount-jn0FJLE", "()I", "Count", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,879:1\n77#1:880\n77#1:881\n1#2:882\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n*L\n80#1:880\n89#1:881\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Ups extends Operation {
        public static final int $stable = 0;

        @l
        public static final Ups INSTANCE = new Ups();

        private Ups() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            int mo3334getIntw8GmfQM = operationArgContainer.mo3334getIntw8GmfQM(IntParameter.m3302constructorimpl(0));
            for (int i5 = 0; i5 < mo3334getIntw8GmfQM; i5++) {
                applier.up();
            }
        }

        /* renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m3333getCountjn0FJLE() {
            return IntParameter.m3302constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        /* renamed from: intParamName-w8GmfQM */
        public String mo3276intParamNamew8GmfQM(int i5) {
            if (IntParameter.m3304equalsimpl0(i5, IntParameter.m3302constructorimpl(0))) {
                return "count";
            }
            return super.mo3276intParamNamew8GmfQM(i5);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\n\u001a\u00020\t*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class UseCurrentNode extends Operation {
        public static final int $stable = 0;

        @l
        public static final UseCurrentNode INSTANCE = new UseCurrentNode();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private UseCurrentNode() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.Operation.UseCurrentNode.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            Object current = applier.getCurrent();
            l0.n(current, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((ComposeNodeLifecycleCallback) current).onReuse();
        }
    }

    private Operation(int i5, int i6) {
        this.ints = i5;
        this.objects = i6;
    }

    public /* synthetic */ Operation(int i5, int i6, w wVar) {
        this(i5, i6);
    }

    public abstract void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager);

    public final int getInts() {
        return this.ints;
    }

    @l
    public final String getName() {
        String t5 = l1.d(getClass()).t();
        return t5 == null ? "" : t5;
    }

    public final int getObjects() {
        return this.objects;
    }

    @l
    /* renamed from: intParamName-w8GmfQM, reason: not valid java name */
    public String mo3276intParamNamew8GmfQM(int i5) {
        return "IntParameter(" + i5 + ')';
    }

    @l
    /* renamed from: objectParamName-31yXWZQ, reason: not valid java name */
    public String mo3277objectParamName31yXWZQ(int i5) {
        return "ObjectParameter(" + i5 + ')';
    }

    @l
    public String toString() {
        return getName();
    }

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001c\u0012$\b\u0002\u0010\u000e\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u001f\u0010 J(\u0010\n\u001a\u00020\t*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R3\u0010\u000e\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00180\u00128\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006!"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Lkotlin/r2;", "execute", "", "toString", "Lkotlin/Function3;", "block", "Lv3/q;", "getBlock", "()Lv3/q;", "", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "intParams", "Ljava/util/List;", "getIntParams", "()Ljava/util/List;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "objParams", "getObjParams", "", "ints", "objects", "<init>", "(IILv3/q;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TestOperation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,879:1\n1#2:880\n*E\n"})
    /* loaded from: classes.dex */
    public static final class TestOperation extends Operation {
        public static final int $stable = 8;

        @l
        private final q<Applier<?>, SlotWriter, RememberManager, r2> block;

        @l
        private final List<IntParameter> intParams;

        @l
        private final List<ObjectParameter<Object>> objParams;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/runtime/Applier;", "<anonymous parameter 0>", "Landroidx/compose/runtime/SlotWriter;", "<anonymous parameter 1>", "Landroidx/compose/runtime/RememberManager;", "<anonymous parameter 2>", "Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.runtime.changelist.Operation$TestOperation$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends n0 implements q<Applier<?>, SlotWriter, RememberManager, r2> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(3);
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ r2 invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            }
        }

        @p4.p
        public TestOperation() {
            this(0, 0, null, 7, null);
        }

        public /* synthetic */ TestOperation(int i5, int i6, q qVar, int i7, w wVar) {
            this((i7 & 1) != 0 ? 0 : i5, (i7 & 2) != 0 ? 0 : i6, (i7 & 4) != 0 ? AnonymousClass1.INSTANCE : qVar);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@l OperationArgContainer operationArgContainer, @l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
            this.block.invoke(applier, slotWriter, rememberManager);
        }

        @l
        public final q<Applier<?>, SlotWriter, RememberManager, r2> getBlock() {
            return this.block;
        }

        @l
        public final List<IntParameter> getIntParams() {
            return this.intParams;
        }

        @l
        public final List<ObjectParameter<Object>> getObjParams() {
            return this.objParams;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @l
        public String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + System.identityHashCode(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @p4.p
        public TestOperation(int i5, int i6, @l q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, r2> qVar) {
            super(i5, i6, null);
            this.block = qVar;
            ArrayList arrayList = new ArrayList(i5);
            for (int i7 = 0; i7 < i5; i7++) {
                arrayList.add(IntParameter.m3301boximpl(IntParameter.m3302constructorimpl(i7)));
            }
            this.intParams = arrayList;
            ArrayList arrayList2 = new ArrayList(i6);
            for (int i8 = 0; i8 < i6; i8++) {
                arrayList2.add(ObjectParameter.m3312boximpl(ObjectParameter.m3313constructorimpl(i8)));
            }
            this.objParams = arrayList2;
        }
    }

    public /* synthetic */ Operation(int i5, int i6, int i7, w wVar) {
        this((i7 & 1) != 0 ? 0 : i5, (i7 & 2) != 0 ? 0 : i6, null);
    }
}
