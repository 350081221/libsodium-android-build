package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import v3.a;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b`\u0010aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\"\u0010\r\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0018\u0010\u0014\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0005J\u0010\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0005J\u0006\u0010\u001f\u001a\u00020\u0005J\u0016\u0010\"\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 J\u001e\u0010\"\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010$\u001a\u00020#J\u000e\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0012J\"\u0010+\u001a\u00020\u00052\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00050'2\u0006\u0010*\u001a\u00020(J\u0010\u0010-\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010\u0011J@\u00103\u001a\u00020\u0005\"\u0004\b\u0000\u0010.\"\u0004\b\u0001\u0010/2\u0006\u0010\u000f\u001a\u00028\u00012\u001d\u00102\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000500¢\u0006\u0002\b1¢\u0006\u0004\b3\u00104J\u0016\u00107\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u0012J\u001e\u0010:\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u0012J\u000e\u0010<\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0012J\u000e\u0010=\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0012J\u001d\u0010@\u001a\u00020\u00052\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110>¢\u0006\u0004\b@\u0010AJ\u0014\u0010D\u001a\u00020\u00052\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00050BJ\u0016\u0010G\u001a\u00020\u00052\u0006\u0010F\u001a\u00020E2\u0006\u0010\u001b\u001a\u00020\u001aJ\u001e\u0010J\u001a\u00020\u00052\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110H2\u0006\u0010I\u001a\u00020EJ(\u0010P\u001a\u00020\u00052\b\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010N\u001a\u00020M2\u0006\u0010!\u001a\u00020O2\u0006\u00108\u001a\u00020OJ\u001e\u0010S\u001a\u00020\u00052\u0006\u0010*\u001a\u00020Q2\u0006\u0010N\u001a\u00020M2\u0006\u0010R\u001a\u00020OJ\u0006\u0010T\u001a\u00020\u0005J\u001a\u0010V\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u00002\n\b\u0002\u0010I\u001a\u0004\u0018\u00010EJ\u0010\u0010Y\u001a\u00020W2\u0006\u0010X\u001a\u00020WH\u0016R\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0011\u0010_\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006b"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "", "isEmpty", "isNotEmpty", "Lkotlin/r2;", "clear", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingChanges", "Landroidx/compose/runtime/RememberObserver;", b.f22420d, "pushRemember", "", "", "groupSlotIndex", "pushUpdateValue", "pushResetSlots", "pushDeactivateCurrentGroup", "data", "pushUpdateAuxData", "pushEnsureRootStarted", "Landroidx/compose/runtime/Anchor;", "anchor", "pushEnsureGroupStarted", "pushEndCurrentGroup", "pushSkipToEndOfCurrentGroup", "pushRemoveCurrentGroup", "Landroidx/compose/runtime/SlotTable;", TypedValues.TransitionType.S_FROM, "pushInsertSlots", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", TypedValues.CycleType.S_WAVE_OFFSET, "pushMoveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "action", "composition", "pushEndCompositionScope", "node", "pushUseNode", "T", "V", "Lkotlin/Function2;", "Lkotlin/u;", "block", "pushUpdateNode", "(Ljava/lang/Object;Lv3/p;)V", "removeFrom", "moveCount", "pushRemoveNode", TypedValues.TransitionType.S_TO, "count", "pushMoveNode", "distance", "pushAdvanceSlotsBy", "pushUps", "", "nodes", "pushDowns", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "pushSideEffect", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "pushDetermineMovableContentNodeIndex", "", "effectiveNodeIndex", "pushCopyNodesToNewAnchorLocation", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "pushCopySlotTableToAnchorLocation", "Landroidx/compose/runtime/ControlledComposition;", "reference", "pushReleaseMovableGroupAtCurrent", "pushEndMovableContentPlacement", "changeList", "pushExecuteOperationsIn", "", "linePrefix", "toDebugString", "Landroidx/compose/runtime/changelist/Operations;", "operations", "Landroidx/compose/runtime/changelist/Operations;", "getSize", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nChangeList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 3 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n+ 8 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 9 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n+ 10 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n+ 11 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n+ 12 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n+ 13 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n+ 14 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n+ 15 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 16 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n+ 17 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n+ 18 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n+ 19 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 20 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n+ 21 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n+ 22 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,302:1\n164#2,5:303\n172#2,2:309\n171#2,31:311\n164#2,5:342\n172#2,2:349\n171#2,31:351\n164#2,5:382\n172#2,2:388\n171#2,31:390\n164#2,5:421\n172#2,2:427\n171#2,31:429\n164#2,5:460\n172#2,2:467\n171#2,31:469\n164#2,5:500\n172#2,2:508\n171#2,31:510\n164#2,5:541\n172#2,2:547\n171#2,31:549\n164#2,5:580\n172#2,2:587\n171#2,31:589\n164#2,5:620\n172#2,2:627\n171#2,31:629\n164#2,5:660\n172#2,2:667\n171#2,31:669\n164#2,5:700\n172#2,2:708\n171#2,31:710\n164#2,5:741\n172#2,2:747\n171#2,31:749\n164#2,5:780\n172#2,2:786\n171#2,31:788\n164#2,5:819\n172#2,2:825\n171#2,31:827\n164#2,5:858\n172#2,2:864\n171#2,31:866\n164#2,5:897\n172#2,2:904\n171#2,31:906\n164#2,5:937\n172#2,2:944\n171#2,31:946\n164#2,5:977\n172#2,2:986\n171#2,31:988\n164#2,5:1019\n172#2,2:1027\n171#2,31:1029\n164#2,5:1060\n172#2,2:1067\n171#2,31:1069\n152#3:308\n169#4:347\n170#4:348\n203#5:387\n230#6:426\n394#7:465\n395#7:466\n422#8:505\n423#8:506\n424#8:507\n257#9:546\n294#10:585\n295#10:586\n326#11:625\n327#11:626\n347#12:665\n348#12:666\n370#13:705\n369#13:706\n371#13:707\n116#14:746\n77#15:785\n94#16:824\n135#17:863\n539#18:902\n540#18:903\n568#19:942\n567#19:943\n594#20:982\n595#20:983\n597#20:984\n596#20:985\n655#21:1024\n656#21:1025\n657#21:1026\n681#22:1065\n682#22:1066\n*S KotlinDebug\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n*L\n81#1:303,5\n81#1:309,2\n81#1:311,31\n87#1:342,5\n87#1:349,2\n87#1:351,31\n102#1:382,5\n102#1:388,2\n102#1:390,31\n112#1:421,5\n112#1:427,2\n112#1:429,31\n133#1:460,5\n133#1:467,2\n133#1:469,31\n144#1:500,5\n144#1:508,2\n144#1:510,31\n154#1:541,5\n154#1:547,2\n154#1:549,31\n163#1:580,5\n163#1:587,2\n163#1:589,31\n176#1:620,5\n176#1:627,2\n176#1:629,31\n184#1:660,5\n184#1:667,2\n184#1:669,31\n191#1:700,5\n191#1:708,2\n191#1:710,31\n199#1:741,5\n199#1:747,2\n199#1:749,31\n205#1:780,5\n205#1:786,2\n205#1:788,31\n212#1:819,5\n212#1:825,2\n212#1:827,31\n219#1:858,5\n219#1:864,2\n219#1:866,31\n228#1:897,5\n228#1:904,2\n228#1:906,31\n239#1:937,5\n239#1:944,2\n239#1:946,31\n253#1:977,5\n253#1:986,2\n253#1:988,31\n267#1:1019,5\n267#1:1027,2\n267#1:1029,31\n283#1:1060,5\n283#1:1067,2\n283#1:1069,31\n82#1:308\n88#1:347\n89#1:348\n103#1:387\n113#1:426\n134#1:465\n135#1:466\n145#1:505\n146#1:506\n147#1:507\n155#1:546\n164#1:585\n165#1:586\n177#1:625\n179#1:626\n185#1:665\n186#1:666\n192#1:705\n193#1:706\n194#1:707\n200#1:746\n206#1:785\n213#1:824\n220#1:863\n229#1:902\n230#1:903\n240#1:942\n241#1:943\n254#1:982\n255#1:983\n256#1:984\n257#1:985\n268#1:1024\n269#1:1025\n270#1:1026\n284#1:1065\n285#1:1066\n*E\n"})
/* loaded from: classes.dex */
public final class ChangeList implements OperationsDebugStringFormattable {
    public static final int $stable = 8;

    @l
    private final Operations operations = new Operations();

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(@l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
        this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager);
    }

    public final int getSize() {
        return this.operations.getSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void pushAdvanceSlotsBy(int i5) {
        boolean z4;
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations.WriteScope.m3346setIntA6tL2VI(Operations.WriteScope.m3341constructorimpl(operations), Operation.IntParameter.m3302constructorimpl(0), i5);
        if (operations.pushedIntMask == operations.createExpectedArgMask(advanceSlotsBy.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(advanceSlotsBy.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = advanceSlotsBy.getInts();
            int i6 = 0;
            for (int i7 = 0; i7 < ints; i7++) {
                if (((1 << i7) & operations.pushedIntMask) != 0) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(advanceSlotsBy.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i7)));
                    i6++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = advanceSlotsBy.getObjects();
            int i8 = 0;
            for (int i9 = 0; i9 < objects; i9++) {
                if (((1 << i9) & operations.pushedObjectMask) != 0) {
                    if (i6 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(advanceSlotsBy.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i9)));
                    i8++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + advanceSlotsBy + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + sb2 + ") and " + i8 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushCopyNodesToNewAnchorLocation(@l List<? extends Object> list, @l IntRef intRef) {
        boolean z4;
        if (!list.isEmpty()) {
            Operations operations = this.operations;
            Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
            operations.pushOp(copyNodesToNewAnchorLocation);
            Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations);
            Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(1), list);
            Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(0), intRef);
            if (operations.pushedIntMask == operations.createExpectedArgMask(copyNodesToNewAnchorLocation.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(copyNodesToNewAnchorLocation.getObjects())) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                StringBuilder sb = new StringBuilder();
                int ints = copyNodesToNewAnchorLocation.getInts();
                int i5 = 0;
                for (int i6 = 0; i6 < ints; i6++) {
                    if (((1 << i6) & operations.pushedIntMask) != 0) {
                        if (i5 > 0) {
                            sb.append(", ");
                        }
                        sb.append(copyNodesToNewAnchorLocation.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                        i5++;
                    }
                }
                String sb2 = sb.toString();
                l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb3 = new StringBuilder();
                int objects = copyNodesToNewAnchorLocation.getObjects();
                int i7 = 0;
                for (int i8 = 0; i8 < objects; i8++) {
                    if (((1 << i8) & operations.pushedObjectMask) != 0) {
                        if (i5 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(copyNodesToNewAnchorLocation.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                        i7++;
                    }
                }
                String sb4 = sb3.toString();
                l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
                throw new IllegalStateException(("Error while pushing " + copyNodesToNewAnchorLocation + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
            }
        }
    }

    public final void pushCopySlotTableToAnchorLocation(@m MovableContentState movableContentState, @l CompositionContext compositionContext, @l MovableContentStateReference movableContentStateReference, @l MovableContentStateReference movableContentStateReference2) {
        boolean z4;
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(0), movableContentState);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(1), compositionContext);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(3), movableContentStateReference2);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(2), movableContentStateReference);
        if (operations.pushedIntMask == operations.createExpectedArgMask(copySlotTableToAnchorLocation.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(copySlotTableToAnchorLocation.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = copySlotTableToAnchorLocation.getInts();
            int i5 = 0;
            for (int i6 = 0; i6 < ints; i6++) {
                if (((1 << i6) & operations.pushedIntMask) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(copySlotTableToAnchorLocation.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = copySlotTableToAnchorLocation.getObjects();
            int i7 = 0;
            for (int i8 = 0; i8 < objects; i8++) {
                if (((1 << i8) & operations.pushedObjectMask) != 0) {
                    if (i5 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(copySlotTableToAnchorLocation.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                    i7++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + copySlotTableToAnchorLocation + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushDetermineMovableContentNodeIndex(@l IntRef intRef, @l Anchor anchor) {
        boolean z4;
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(0), intRef);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(1), anchor);
        if (operations.pushedIntMask == operations.createExpectedArgMask(determineMovableContentNodeIndex.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(determineMovableContentNodeIndex.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = determineMovableContentNodeIndex.getInts();
            int i5 = 0;
            for (int i6 = 0; i6 < ints; i6++) {
                if (((1 << i6) & operations.pushedIntMask) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(determineMovableContentNodeIndex.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = determineMovableContentNodeIndex.getObjects();
            int i7 = 0;
            for (int i8 = 0; i8 < objects; i8++) {
                if (((1 << i8) & operations.pushedObjectMask) != 0) {
                    if (i5 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(determineMovableContentNodeIndex.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                    i7++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + determineMovableContentNodeIndex + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushDowns(@l Object[] objArr) {
        boolean z4;
        boolean z5;
        if (objArr.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            Operations operations = this.operations;
            Operation.Downs downs = Operation.Downs.INSTANCE;
            operations.pushOp(downs);
            Operations.WriteScope.m3347setObjectDKhxnng(Operations.WriteScope.m3341constructorimpl(operations), Operation.ObjectParameter.m3313constructorimpl(0), objArr);
            if (operations.pushedIntMask == operations.createExpectedArgMask(downs.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(downs.getObjects())) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                StringBuilder sb = new StringBuilder();
                int ints = downs.getInts();
                int i5 = 0;
                for (int i6 = 0; i6 < ints; i6++) {
                    if (((1 << i6) & operations.pushedIntMask) != 0) {
                        if (i5 > 0) {
                            sb.append(", ");
                        }
                        sb.append(downs.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                        i5++;
                    }
                }
                String sb2 = sb.toString();
                l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb3 = new StringBuilder();
                int objects = downs.getObjects();
                int i7 = 0;
                for (int i8 = 0; i8 < objects; i8++) {
                    if (((1 << i8) & operations.pushedObjectMask) != 0) {
                        if (i5 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(downs.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                        i7++;
                    }
                }
                String sb4 = sb3.toString();
                l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
                throw new IllegalStateException(("Error while pushing " + downs + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
            }
        }
    }

    public final void pushEndCompositionScope(@l v3.l<? super Composition, r2> lVar, @l Composition composition) {
        boolean z4;
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(0), lVar);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(1), composition);
        if (operations.pushedIntMask == operations.createExpectedArgMask(endCompositionScope.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(endCompositionScope.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = endCompositionScope.getInts();
            int i5 = 0;
            for (int i6 = 0; i6 < ints; i6++) {
                if (((1 << i6) & operations.pushedIntMask) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(endCompositionScope.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = endCompositionScope.getObjects();
            int i7 = 0;
            for (int i8 = 0; i8 < objects; i8++) {
                if (((1 << i8) & operations.pushedObjectMask) != 0) {
                    if (i5 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(endCompositionScope.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                    i7++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + endCompositionScope + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushEnsureGroupStarted(@l Anchor anchor) {
        boolean z4;
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations.WriteScope.m3347setObjectDKhxnng(Operations.WriteScope.m3341constructorimpl(operations), Operation.ObjectParameter.m3313constructorimpl(0), anchor);
        if (operations.pushedIntMask == operations.createExpectedArgMask(ensureGroupStarted.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(ensureGroupStarted.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = ensureGroupStarted.getInts();
            int i5 = 0;
            for (int i6 = 0; i6 < ints; i6++) {
                if (((1 << i6) & operations.pushedIntMask) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(ensureGroupStarted.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = ensureGroupStarted.getObjects();
            int i7 = 0;
            for (int i8 = 0; i8 < objects; i8++) {
                if (((1 << i8) & operations.pushedObjectMask) != 0) {
                    if (i5 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(ensureGroupStarted.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                    i7++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + ensureGroupStarted + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushExecuteOperationsIn(@l ChangeList changeList, @m IntRef intRef) {
        boolean z4;
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations);
            Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(0), changeList);
            Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(1), intRef);
            if (operations.pushedIntMask == operations.createExpectedArgMask(applyChangeList.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(applyChangeList.getObjects())) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                StringBuilder sb = new StringBuilder();
                int ints = applyChangeList.getInts();
                int i5 = 0;
                for (int i6 = 0; i6 < ints; i6++) {
                    if (((1 << i6) & operations.pushedIntMask) != 0) {
                        if (i5 > 0) {
                            sb.append(", ");
                        }
                        sb.append(applyChangeList.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                        i5++;
                    }
                }
                String sb2 = sb.toString();
                l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb3 = new StringBuilder();
                int objects = applyChangeList.getObjects();
                int i7 = 0;
                for (int i8 = 0; i8 < objects; i8++) {
                    if (((1 << i8) & operations.pushedObjectMask) != 0) {
                        if (i5 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(applyChangeList.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                        i7++;
                    }
                }
                String sb4 = sb3.toString();
                l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
                throw new IllegalStateException(("Error while pushing " + applyChangeList + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
            }
        }
    }

    public final void pushInsertSlots(@l Anchor anchor, @l SlotTable slotTable) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(0), anchor);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(1), slotTable);
        if (operations.pushedIntMask == operations.createExpectedArgMask(insertSlots.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(insertSlots.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = insertSlots.getInts();
        int i5 = 0;
        for (int i6 = 0; i6 < ints; i6++) {
            if (((1 << i6) & operations.pushedIntMask) != 0) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlots.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                i5++;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = insertSlots.getObjects();
        int i7 = 0;
        for (int i8 = 0; i8 < objects; i8++) {
            if (((1 << i8) & operations.pushedObjectMask) != 0) {
                if (i5 > 0) {
                    sb3.append(", ");
                }
                sb3.append(insertSlots.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                i7++;
            }
        }
        String sb4 = sb3.toString();
        l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + insertSlots + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushMoveCurrentGroup(int i5) {
        boolean z4;
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations.WriteScope.m3346setIntA6tL2VI(Operations.WriteScope.m3341constructorimpl(operations), Operation.IntParameter.m3302constructorimpl(0), i5);
        if (operations.pushedIntMask == operations.createExpectedArgMask(moveCurrentGroup.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(moveCurrentGroup.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = moveCurrentGroup.getInts();
            int i6 = 0;
            for (int i7 = 0; i7 < ints; i7++) {
                if (((1 << i7) & operations.pushedIntMask) != 0) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(moveCurrentGroup.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i7)));
                    i6++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = moveCurrentGroup.getObjects();
            int i8 = 0;
            for (int i9 = 0; i9 < objects; i9++) {
                if (((1 << i9) & operations.pushedObjectMask) != 0) {
                    if (i6 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(moveCurrentGroup.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i9)));
                    i8++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + moveCurrentGroup + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + sb2 + ") and " + i8 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushMoveNode(int i5, int i6, int i7) {
        boolean z4;
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations);
        Operations.WriteScope.m3346setIntA6tL2VI(m3341constructorimpl, Operation.IntParameter.m3302constructorimpl(1), i5);
        Operations.WriteScope.m3346setIntA6tL2VI(m3341constructorimpl, Operation.IntParameter.m3302constructorimpl(0), i6);
        Operations.WriteScope.m3346setIntA6tL2VI(m3341constructorimpl, Operation.IntParameter.m3302constructorimpl(2), i7);
        if (operations.pushedIntMask == operations.createExpectedArgMask(moveNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(moveNode.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = moveNode.getInts();
            int i8 = 0;
            for (int i9 = 0; i9 < ints; i9++) {
                if (((1 << i9) & operations.pushedIntMask) != 0) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(moveNode.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i9)));
                    i8++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = moveNode.getObjects();
            int i10 = 0;
            for (int i11 = 0; i11 < objects; i11++) {
                if (((1 << i11) & operations.pushedObjectMask) != 0) {
                    if (i8 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(moveNode.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i11)));
                    i10++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + moveNode + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushReleaseMovableGroupAtCurrent(@l ControlledComposition controlledComposition, @l CompositionContext compositionContext, @l MovableContentStateReference movableContentStateReference) {
        boolean z4;
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(0), controlledComposition);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(1), compositionContext);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(2), movableContentStateReference);
        if (operations.pushedIntMask == operations.createExpectedArgMask(releaseMovableGroupAtCurrent.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(releaseMovableGroupAtCurrent.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = releaseMovableGroupAtCurrent.getInts();
            int i5 = 0;
            for (int i6 = 0; i6 < ints; i6++) {
                if (((1 << i6) & operations.pushedIntMask) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(releaseMovableGroupAtCurrent.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = releaseMovableGroupAtCurrent.getObjects();
            int i7 = 0;
            for (int i8 = 0; i8 < objects; i8++) {
                if (((1 << i8) & operations.pushedObjectMask) != 0) {
                    if (i5 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(releaseMovableGroupAtCurrent.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                    i7++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + releaseMovableGroupAtCurrent + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushRemember(@l RememberObserver rememberObserver) {
        boolean z4;
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations.WriteScope.m3347setObjectDKhxnng(Operations.WriteScope.m3341constructorimpl(operations), Operation.ObjectParameter.m3313constructorimpl(0), rememberObserver);
        if (operations.pushedIntMask == operations.createExpectedArgMask(remember.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(remember.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = remember.getInts();
            int i5 = 0;
            for (int i6 = 0; i6 < ints; i6++) {
                if (((1 << i6) & operations.pushedIntMask) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(remember.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = remember.getObjects();
            int i7 = 0;
            for (int i8 = 0; i8 < objects; i8++) {
                if (((1 << i8) & operations.pushedObjectMask) != 0) {
                    if (i5 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(remember.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                    i7++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + remember + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushRemoveNode(int i5, int i6) {
        boolean z4;
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations);
        Operations.WriteScope.m3346setIntA6tL2VI(m3341constructorimpl, Operation.IntParameter.m3302constructorimpl(0), i5);
        Operations.WriteScope.m3346setIntA6tL2VI(m3341constructorimpl, Operation.IntParameter.m3302constructorimpl(1), i6);
        if (operations.pushedIntMask == operations.createExpectedArgMask(removeNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(removeNode.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = removeNode.getInts();
            int i7 = 0;
            for (int i8 = 0; i8 < ints; i8++) {
                if (((1 << i8) & operations.pushedIntMask) != 0) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(removeNode.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i8)));
                    i7++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = removeNode.getObjects();
            int i9 = 0;
            for (int i10 = 0; i10 < objects; i10++) {
                if (((1 << i10) & operations.pushedObjectMask) != 0) {
                    if (i7 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(removeNode.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i10)));
                    i9++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + removeNode + ". Not all arguments were provided. Missing " + i7 + " int arguments (" + sb2 + ") and " + i9 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushSideEffect(@l a<r2> aVar) {
        boolean z4;
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m3347setObjectDKhxnng(Operations.WriteScope.m3341constructorimpl(operations), Operation.ObjectParameter.m3313constructorimpl(0), aVar);
        if (operations.pushedIntMask == operations.createExpectedArgMask(sideEffect.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(sideEffect.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = sideEffect.getInts();
            int i5 = 0;
            for (int i6 = 0; i6 < ints; i6++) {
                if (((1 << i6) & operations.pushedIntMask) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(sideEffect.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = sideEffect.getObjects();
            int i7 = 0;
            for (int i8 = 0; i8 < objects; i8++) {
                if (((1 << i8) & operations.pushedObjectMask) != 0) {
                    if (i5 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(sideEffect.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                    i7++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + sideEffect + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushUpdateAuxData(@m Object obj) {
        boolean z4;
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m3347setObjectDKhxnng(Operations.WriteScope.m3341constructorimpl(operations), Operation.ObjectParameter.m3313constructorimpl(0), obj);
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateAuxData.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateAuxData.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = updateAuxData.getInts();
            int i5 = 0;
            for (int i6 = 0; i6 < ints; i6++) {
                if (((1 << i6) & operations.pushedIntMask) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(updateAuxData.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = updateAuxData.getObjects();
            int i7 = 0;
            for (int i8 = 0; i8 < objects; i8++) {
                if (((1 << i8) & operations.pushedObjectMask) != 0) {
                    if (i5 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(updateAuxData.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                    i7++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + updateAuxData + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final <T, V> void pushUpdateNode(V v4, @l p<? super T, ? super V, r2> pVar) {
        boolean z4;
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(0), v4);
        int m3313constructorimpl = Operation.ObjectParameter.m3313constructorimpl(1);
        l0.n(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, m3313constructorimpl, (p) u1.q(pVar, 2));
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateNode.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = updateNode.getInts();
            int i5 = 0;
            for (int i6 = 0; i6 < ints; i6++) {
                if (((1 << i6) & operations.pushedIntMask) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(updateNode.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = updateNode.getObjects();
            int i7 = 0;
            for (int i8 = 0; i8 < objects; i8++) {
                if (((1 << i8) & operations.pushedObjectMask) != 0) {
                    if (i5 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(updateNode.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                    i7++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + updateNode + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushUpdateValue(@m Object obj, int i5) {
        boolean z4;
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(0), obj);
        Operations.WriteScope.m3346setIntA6tL2VI(m3341constructorimpl, Operation.IntParameter.m3302constructorimpl(0), i5);
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateValue.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateValue.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = updateValue.getInts();
            int i6 = 0;
            for (int i7 = 0; i7 < ints; i7++) {
                if (((1 << i7) & operations.pushedIntMask) != 0) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(updateValue.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i7)));
                    i6++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = updateValue.getObjects();
            int i8 = 0;
            for (int i9 = 0; i9 < objects; i9++) {
                if (((1 << i9) & operations.pushedObjectMask) != 0) {
                    if (i6 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(updateValue.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i9)));
                    i8++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + updateValue + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + sb2 + ") and " + i8 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushUps(int i5) {
        boolean z4;
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations.WriteScope.m3346setIntA6tL2VI(Operations.WriteScope.m3341constructorimpl(operations), Operation.IntParameter.m3302constructorimpl(0), i5);
        if (operations.pushedIntMask == operations.createExpectedArgMask(ups.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(ups.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = ups.getInts();
            int i6 = 0;
            for (int i7 = 0; i7 < ints; i7++) {
                if (((1 << i7) & operations.pushedIntMask) != 0) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(ups.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i7)));
                    i6++;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = ups.getObjects();
            int i8 = 0;
            for (int i9 = 0; i9 < objects; i9++) {
                if (((1 << i9) & operations.pushedObjectMask) != 0) {
                    if (i6 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(ups.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i9)));
                    i8++;
                }
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + ups + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + sb2 + ") and " + i8 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushUseNode(@m Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @l
    public String toDebugString(@l String str) {
        boolean z4;
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList instance containing");
        sb.append(getSize());
        sb.append(" operations");
        if (sb.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            sb.append(":\n");
            sb.append(this.operations.toDebugString(str));
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void pushInsertSlots(@l Anchor anchor, @l SlotTable slotTable, @l FixupList fixupList) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(0), anchor);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(1), slotTable);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(2), fixupList);
        if (operations.pushedIntMask == operations.createExpectedArgMask(insertSlotsWithFixups.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(insertSlotsWithFixups.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = insertSlotsWithFixups.getInts();
        int i5 = 0;
        for (int i6 = 0; i6 < ints; i6++) {
            if (((1 << i6) & operations.pushedIntMask) != 0) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlotsWithFixups.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i6)));
                i5++;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = insertSlotsWithFixups.getObjects();
        int i7 = 0;
        for (int i8 = 0; i8 < objects; i8++) {
            if (((1 << i8) & operations.pushedObjectMask) != 0) {
                if (i5 > 0) {
                    sb3.append(", ");
                }
                sb3.append(insertSlotsWithFixups.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i8)));
                i7++;
            }
        }
        String sb4 = sb3.toString();
        l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + insertSlotsWithFixups + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
    }
}
