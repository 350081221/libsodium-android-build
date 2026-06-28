package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import u3.h;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001'B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007H\u0096\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\"\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001a¨\u0006("}, d2 = {"Landroidx/compose/runtime/SnapshotMutableIntStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "component1", "()Ljava/lang/Integer;", "Lkotlin/Function1;", "Lkotlin/r2;", "component2", "Landroidx/compose/runtime/snapshots/StateRecord;", b.f22420d, "prependStateRecord", "previous", "current", "applied", "mergeRecords", "", "toString", "Landroidx/compose/runtime/SnapshotMutableIntStateImpl$IntStateStateRecord;", "next", "Landroidx/compose/runtime/SnapshotMutableIntStateImpl$IntStateStateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getIntValue", "()I", "setIntValue", "(I)V", "intValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", bi.bt, "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "debuggerDisplayValue", "<init>", "IntStateStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapshotIntState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotMutableIntStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,191:1\n2283#2:192\n2204#2,2:193\n1714#2:195\n2206#2,5:197\n2283#2:202\n2283#2:203\n82#3:196\n*S KotlinDebug\n*F\n+ 1 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotMutableIntStateImpl\n*L\n139#1:192\n141#1:193,2\n141#1:195\n141#1:197,5\n172#1:202\n179#1:203\n141#1:196\n*E\n"})
/* loaded from: classes.dex */
public class SnapshotMutableIntStateImpl extends StateObjectImpl implements MutableIntState, SnapshotMutableState<Integer> {
    public static final int $stable = 0;

    @l
    private IntStateStateRecord next;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0001H\u0016R\"\u0010\u0002\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableIntStateImpl$IntStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", b.f22420d, "Lkotlin/r2;", "assign", "create", "", "I", "getValue", "()I", "setValue", "(I)V", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class IntStateStateRecord extends StateRecord {
        private int value;

        public IntStateStateRecord(int i5) {
            this.value = i5;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@l StateRecord stateRecord) {
            l0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.value = ((IntStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @l
        public StateRecord create() {
            return new IntStateStateRecord(this.value);
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i5) {
            this.value = i5;
        }
    }

    public SnapshotMutableIntStateImpl(int i5) {
        this.next = new IntStateStateRecord(i5);
    }

    @InternalComposeApi
    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // androidx.compose.runtime.MutableState
    @l
    public v3.l<Integer, r2> component2() {
        return new SnapshotMutableIntStateImpl$component2$1(this);
    }

    @h(name = "getDebuggerDisplayValue")
    public final int getDebuggerDisplayValue() {
        return ((IntStateStateRecord) SnapshotKt.current(this.next)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @l
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableIntState, androidx.compose.runtime.IntState
    public int getIntValue() {
        return ((IntStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    @l
    public SnapshotMutationPolicy<Integer> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @m
    public StateRecord mergeRecords(@l StateRecord stateRecord, @l StateRecord stateRecord2, @l StateRecord stateRecord3) {
        l0.n(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        l0.n(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((IntStateStateRecord) stateRecord2).getValue() != ((IntStateStateRecord) stateRecord3).getValue()) {
            return null;
        }
        return stateRecord2;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@l StateRecord stateRecord) {
        l0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.next = (IntStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableIntState
    public void setIntValue(int i5) {
        Snapshot current;
        IntStateStateRecord intStateStateRecord = (IntStateStateRecord) SnapshotKt.current(this.next);
        if (intStateStateRecord.getValue() != i5) {
            IntStateStateRecord intStateStateRecord2 = this.next;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((IntStateStateRecord) SnapshotKt.overwritableRecord(intStateStateRecord2, this, current, intStateStateRecord)).setValue(i5);
                r2 r2Var = r2.f19517a;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @l
    public String toString() {
        return "MutableIntState(value=" + ((IntStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    @l
    public Integer component1() {
        return Integer.valueOf(getIntValue());
    }
}
