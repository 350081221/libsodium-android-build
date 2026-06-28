package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H&J\b\u0010\u0005\u001a\u00020\u0000H&R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/snapshots/StateRecord;", "", t0.b.f22420d, "Lkotlin/r2;", "assign", "create", "", "snapshotId", "I", "getSnapshotId$runtime_release", "()I", "setSnapshotId$runtime_release", "(I)V", "next", "Landroidx/compose/runtime/snapshots/StateRecord;", "getNext$runtime_release", "()Landroidx/compose/runtime/snapshots/StateRecord;", "setNext$runtime_release", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class StateRecord {
    public static final int $stable = 8;

    @m
    private StateRecord next;
    private int snapshotId = SnapshotKt.currentSnapshot().getId();

    public abstract void assign(@l StateRecord stateRecord);

    @l
    public abstract StateRecord create();

    @m
    public final StateRecord getNext$runtime_release() {
        return this.next;
    }

    public final int getSnapshotId$runtime_release() {
        return this.snapshotId;
    }

    public final void setNext$runtime_release(@m StateRecord stateRecord) {
        this.next = stateRecord;
    }

    public final void setSnapshotId$runtime_release(int i5) {
        this.snapshotId = i5;
    }
}
