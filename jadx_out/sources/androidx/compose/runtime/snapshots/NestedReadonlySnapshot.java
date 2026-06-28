package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.r2;
import kotlin.y;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b/\u00100J\u001e\u0010\u0006\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\t\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u001c\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010%8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001f¨\u00061"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lkotlin/Function1;", "", "Lkotlin/r2;", "readObserver", "takeNestedSnapshot", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "", "hasPendingChanges", "dispose", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)Ljava/lang/Void;", "recordModified", "snapshot", "nestedDeactivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedDeactivated", "nestedActivated$runtime_release", "nestedActivated", "parent", "Landroidx/compose/runtime/snapshots/Snapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "Lv3/l;", "getReadObserver$runtime_release", "()Lv3/l;", "getReadOnly", "()Z", "readOnly", "getRoot", "root", "Landroidx/compose/runtime/collection/IdentityArraySet;", "getModified$runtime_release", "()Landroidx/compose/runtime/collection/IdentityArraySet;", "modified", "getWriteObserver$runtime_release", "writeObserver", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lv3/l;Landroidx/compose/runtime/snapshots/Snapshot;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NestedReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;

    @l
    private final Snapshot parent;

    @m
    private final v3.l<Object, r2> readObserver;

    public NestedReadonlySnapshot(int i5, @l SnapshotIdSet snapshotIdSet, @m v3.l<Object, r2> lVar, @l Snapshot snapshot) {
        super(i5, snapshotIdSet, null);
        this.parent = snapshot;
        snapshot.mo3352nestedActivated$runtime_release(this);
        if (lVar != null) {
            v3.l<Object, r2> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
            if (readObserver$runtime_release != null) {
                lVar = new NestedReadonlySnapshot$readObserver$1$1$1(lVar, readObserver$runtime_release);
            }
        } else {
            lVar = snapshot.getReadObserver$runtime_release();
        }
        this.readObserver = lVar;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (!getDisposed$runtime_release()) {
            if (getId() != this.parent.getId()) {
                closeAndReleasePinning$runtime_release();
            }
            this.parent.mo3353nestedDeactivated$runtime_release(this);
            super.dispose();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @m
    public IdentityArraySet<StateObject> getModified$runtime_release() {
        return null;
    }

    @l
    public final Snapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @m
    public v3.l<Object, r2> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @m
    public v3.l<Object, r2> getWriteObserver$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public /* bridge */ /* synthetic */ Snapshot takeNestedSnapshot(v3.l lVar) {
        return takeNestedSnapshot((v3.l<Object, r2>) lVar);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    /* renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo3352nestedActivated$runtime_release(@l Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    /* renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo3353nestedDeactivated$runtime_release(@l Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    /* renamed from: recordModified$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo3354recordModified$runtime_release(@l StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new y();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    public NestedReadonlySnapshot takeNestedSnapshot(@m v3.l<Object, r2> lVar) {
        return new NestedReadonlySnapshot(getId(), getInvalid$runtime_release(), lVar, this.parent);
    }
}
