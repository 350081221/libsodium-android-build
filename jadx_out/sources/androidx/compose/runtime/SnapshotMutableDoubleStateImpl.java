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

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001#B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007H\u0096\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\"\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableDoubleState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "component1", "()Ljava/lang/Double;", "Lkotlin/Function1;", "Lkotlin/r2;", "component2", "Landroidx/compose/runtime/snapshots/StateRecord;", b.f22420d, "prependStateRecord", "previous", "current", "applied", "mergeRecords", "", "toString", "Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "next", "Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getDoubleValue", "()D", "setDoubleValue", "(D)V", "doubleValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", bi.bt, "<init>", "DoubleStateStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapshotDoubleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 FloatingPointEquality.android.kt\nandroidx/compose/runtime/internal/FloatingPointEquality_androidKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,187:1\n2283#2:188\n2204#2,2:194\n1714#2:196\n2206#2,5:198\n2283#2:208\n49#3,5:189\n49#3,5:203\n82#4:197\n*S KotlinDebug\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n*L\n140#1:188\n142#1:194,2\n142#1:196\n142#1:198,5\n173#1:208\n141#1:189,5\n166#1:203,5\n142#1:197\n*E\n"})
/* loaded from: classes.dex */
public class SnapshotMutableDoubleStateImpl extends StateObjectImpl implements MutableDoubleState, SnapshotMutableState<Double> {
    public static final int $stable = 0;

    @l
    private DoubleStateStateRecord next;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0001H\u0016R\"\u0010\u0002\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", b.f22420d, "Lkotlin/r2;", "assign", "create", "", "D", "getValue", "()D", "setValue", "(D)V", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class DoubleStateStateRecord extends StateRecord {
        private double value;

        public DoubleStateStateRecord(double d5) {
            this.value = d5;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@l StateRecord stateRecord) {
            l0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.value = ((DoubleStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @l
        public StateRecord create() {
            return new DoubleStateStateRecord(this.value);
        }

        public final double getValue() {
            return this.value;
        }

        public final void setValue(double d5) {
            this.value = d5;
        }
    }

    public SnapshotMutableDoubleStateImpl(double d5) {
        this.next = new DoubleStateStateRecord(d5);
    }

    @Override // androidx.compose.runtime.MutableState
    @l
    public v3.l<Double, r2> component2() {
        return new SnapshotMutableDoubleStateImpl$component2$1(this);
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState
    public double getDoubleValue() {
        return ((DoubleStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @l
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    @l
    public SnapshotMutationPolicy<Double> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @m
    public StateRecord mergeRecords(@l StateRecord stateRecord, @l StateRecord stateRecord2, @l StateRecord stateRecord3) {
        boolean z4;
        l0.n(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        l0.n(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((DoubleStateStateRecord) stateRecord2).getValue() == ((DoubleStateStateRecord) stateRecord3).getValue()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return null;
        }
        return stateRecord2;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@l StateRecord stateRecord) {
        l0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.next = (DoubleStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public void setDoubleValue(double d5) {
        boolean z4;
        Snapshot current;
        DoubleStateStateRecord doubleStateStateRecord = (DoubleStateStateRecord) SnapshotKt.current(this.next);
        if (doubleStateStateRecord.getValue() == d5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            DoubleStateStateRecord doubleStateStateRecord2 = this.next;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((DoubleStateStateRecord) SnapshotKt.overwritableRecord(doubleStateStateRecord2, this, current, doubleStateStateRecord)).setValue(d5);
                r2 r2Var = r2.f19517a;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @l
    public String toString() {
        return "MutableDoubleState(value=" + ((DoubleStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    @l
    public Double component1() {
        return Double.valueOf(getDoubleValue());
    }
}
