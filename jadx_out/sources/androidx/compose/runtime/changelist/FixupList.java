package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.r2;
import kotlin.y;
import p4.l;
import t0.b;
import v3.a;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\"\u0010\r\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ&\u0010\u0015\u001a\u00020\u00052\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0005J@\u0010\u001d\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u001d\u0010\u001c\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001a¢\u0006\u0002\b\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0011\u0010(\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "", "isEmpty", "isNotEmpty", "Lkotlin/r2;", "clear", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingFixups", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "Landroidx/compose/runtime/Anchor;", "groupAnchor", "createAndInsertNode", "endNodeInsert", "V", "T", b.f22420d, "Lkotlin/Function2;", "Lkotlin/u;", "block", "updateNode", "(Ljava/lang/Object;Lv3/p;)V", "", "linePrefix", "toDebugString", "Landroidx/compose/runtime/changelist/Operations;", "operations", "Landroidx/compose/runtime/changelist/Operations;", "pendingOperations", "getSize", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFixupList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,91:1\n4178#2,5:92\n4178#2,5:178\n164#3,5:97\n172#3,2:105\n171#3,31:107\n164#3,5:138\n172#3,2:145\n171#3,31:147\n164#3,5:183\n172#3,2:190\n171#3,31:192\n456#4:102\n457#4:103\n458#4:104\n488#5:143\n489#5:144\n326#6:188\n327#6:189\n*S KotlinDebug\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n*L\n46#1:92,5\n71#1:178,5\n58#1:97,5\n58#1:105,2\n58#1:107,31\n64#1:138,5\n64#1:145,2\n64#1:147,31\n78#1:183,5\n78#1:190,2\n78#1:192,31\n59#1:102\n60#1:103\n61#1:104\n65#1:143\n66#1:144\n79#1:188\n80#1:189\n*E\n"})
/* loaded from: classes.dex */
public final class FixupList implements OperationsDebugStringFormattable {
    public static final int $stable = 8;

    @l
    private final Operations operations = new Operations();

    @l
    private final Operations pendingOperations = new Operations();

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void createAndInsertNode(@l a<? extends Object> aVar, int i5, @l Anchor anchor) {
        boolean z4;
        boolean z5;
        Operations operations;
        Operations operations2;
        Operations operations3 = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations3.pushOp(insertNodeFixup);
        Operations m3341constructorimpl = Operations.WriteScope.m3341constructorimpl(operations3);
        int i6 = 0;
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(0), aVar);
        Operations.WriteScope.m3346setIntA6tL2VI(m3341constructorimpl, Operation.IntParameter.m3302constructorimpl(0), i5);
        int i7 = 1;
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl, Operation.ObjectParameter.m3313constructorimpl(1), anchor);
        if (operations3.pushedIntMask == operations3.createExpectedArgMask(insertNodeFixup.getInts()) && operations3.pushedObjectMask == operations3.createExpectedArgMask(insertNodeFixup.getObjects())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            int ints = insertNodeFixup.getInts();
            int i8 = 0;
            while (i8 < ints) {
                if (((i7 << i8) & operations3.pushedIntMask) != 0) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(insertNodeFixup.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i8)));
                    i6++;
                }
                i8++;
                i7 = 1;
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = insertNodeFixup.getObjects();
            int i9 = 0;
            int i10 = 0;
            while (i10 < objects) {
                if (((1 << i10) & operations3.pushedObjectMask) != 0) {
                    if (i6 > 0) {
                        sb3.append(", ");
                    }
                    operations2 = operations3;
                    sb3.append(insertNodeFixup.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i10)));
                    i9++;
                } else {
                    operations2 = operations3;
                }
                i10++;
                operations3 = operations2;
            }
            String sb4 = sb3.toString();
            l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + insertNodeFixup + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + sb2 + ") and " + i9 + " object arguments (" + sb4 + ").").toString());
        }
        Operations operations4 = this.pendingOperations;
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        operations4.pushOp(postInsertNodeFixup);
        Operations m3341constructorimpl2 = Operations.WriteScope.m3341constructorimpl(operations4);
        Operations.WriteScope.m3346setIntA6tL2VI(m3341constructorimpl2, Operation.IntParameter.m3302constructorimpl(0), i5);
        Operations.WriteScope.m3347setObjectDKhxnng(m3341constructorimpl2, Operation.ObjectParameter.m3313constructorimpl(0), anchor);
        if (operations4.pushedIntMask == operations4.createExpectedArgMask(postInsertNodeFixup.getInts()) && operations4.pushedObjectMask == operations4.createExpectedArgMask(postInsertNodeFixup.getObjects())) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            StringBuilder sb5 = new StringBuilder();
            int ints2 = postInsertNodeFixup.getInts();
            int i11 = 0;
            for (int i12 = 0; i12 < ints2; i12++) {
                if (((1 << i12) & operations4.pushedIntMask) != 0) {
                    if (i11 > 0) {
                        sb5.append(", ");
                    }
                    sb5.append(postInsertNodeFixup.mo3276intParamNamew8GmfQM(Operation.IntParameter.m3302constructorimpl(i12)));
                    i11++;
                }
            }
            String sb6 = sb5.toString();
            l0.o(sb6, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb7 = new StringBuilder();
            int objects2 = postInsertNodeFixup.getObjects();
            int i13 = 0;
            int i14 = 0;
            while (i14 < objects2) {
                if (((1 << i14) & operations4.pushedObjectMask) != 0) {
                    if (i11 > 0) {
                        sb7.append(", ");
                    }
                    operations = operations4;
                    sb7.append(postInsertNodeFixup.mo3277objectParamName31yXWZQ(Operation.ObjectParameter.m3313constructorimpl(i14)));
                    i13++;
                } else {
                    operations = operations4;
                }
                i14++;
                operations4 = operations;
            }
            String sb8 = sb7.toString();
            l0.o(sb8, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + postInsertNodeFixup + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb6 + ") and " + i13 + " object arguments (" + sb8 + ").").toString());
        }
    }

    public final void endNodeInsert() {
        if (this.pendingOperations.isNotEmpty()) {
            this.pendingOperations.popInto(this.operations);
        } else {
            ComposerKt.composeRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.".toString());
            throw new y();
        }
    }

    public final void executeAndFlushAllPendingFixups(@l Applier<?> applier, @l SlotWriter slotWriter, @l RememberManager rememberManager) {
        if (this.pendingOperations.isEmpty()) {
            this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager);
        } else {
            ComposerKt.composeRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?".toString());
            throw new y();
        }
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

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @l
    public String toDebugString(@l String str) {
        boolean z4;
        StringBuilder sb = new StringBuilder();
        sb.append("FixupList instance containing " + getSize() + " operations");
        if (sb.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            sb.append(":\n" + this.operations.toDebugString(str));
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final <V, T> void updateNode(V v4, @l p<? super T, ? super V, r2> pVar) {
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
}
