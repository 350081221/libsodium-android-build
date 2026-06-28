package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.r2;
import kotlin.y;
import p4.m;
import v3.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010-\u001a\u00020\u001b\u0012\u0006\u0010/\u001a\u00020.\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016J\u000f\u0010\u000b\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0006H\u0016J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\"\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001aR4\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010&2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010&8P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00062"}, d2 = {"Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "hasPendingChanges", "Lkotlin/Function1;", "", "Lkotlin/r2;", "readObserver", "takeNestedSnapshot", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "dispose", "snapshot", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "Lv3/l;", "getReadObserver$runtime_release", "()Lv3/l;", "", "snapshots", "I", "getReadOnly", "()Z", "readOnly", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "getWriteObserver$runtime_release", "writeObserver", "Landroidx/compose/runtime/collection/IdentityArraySet;", t0.b.f22420d, "getModified$runtime_release", "()Landroidx/compose/runtime/collection/IdentityArraySet;", "setModified", "(Landroidx/compose/runtime/collection/IdentityArraySet;)V", "modified", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lv3/l;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;

    @m
    private final l<Object, r2> readObserver;
    private int snapshots;

    public ReadonlySnapshot(int i5, @p4.l SnapshotIdSet snapshotIdSet, @m l<Object, r2> lVar) {
        super(i5, snapshotIdSet, null);
        this.readObserver = lVar;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (!getDisposed$runtime_release()) {
            mo3353nestedDeactivated$runtime_release(this);
            super.dispose();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @m
    public IdentityArraySet<StateObject> getModified$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @m
    public l<Object, r2> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @p4.l
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @m
    public l<Object, r2> getWriteObserver$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo3352nestedActivated$runtime_release(@p4.l Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo3353nestedDeactivated$runtime_release(@p4.l Snapshot snapshot) {
        int i5 = this.snapshots - 1;
        this.snapshots = i5;
        if (i5 == 0) {
            closeAndReleasePinning$runtime_release();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo3354recordModified$runtime_release(@p4.l StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new y();
    }

    public void setModified(@m IdentityArraySet<StateObject> identityArraySet) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @p4.l
    public Snapshot takeNestedSnapshot(@m l<Object, r2> lVar) {
        SnapshotKt.validateOpen(this);
        return new NestedReadonlySnapshot(getId(), getInvalid$runtime_release(), lVar, this);
    }
}
