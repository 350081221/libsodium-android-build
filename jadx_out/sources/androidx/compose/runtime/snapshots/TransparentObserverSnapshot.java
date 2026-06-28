package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.i0;
import kotlin.r2;
import kotlin.y;
import p4.m;
import v3.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u0016J\u000f\u0010\u0011\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010#\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010%R$\u0010.\u001a\u00020(2\u0006\u0010)\u001a\u00020(8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00104\u001a\u00020/2\u0006\u0010)\u001a\u00020/8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R4\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001052\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001058P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006A"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lkotlin/r2;", "dispose", "", "hasPendingChanges", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "Lkotlin/Function1;", "", "readObserver", "takeNestedSnapshot", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "snapshot", "", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "previousSnapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "mergeParentObservers", "Z", "ownsPreviousSnapshot", "Lv3/l;", "getReadObserver$runtime_release", "()Lv3/l;", "writeObserver", "getWriteObserver$runtime_release", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "getCurrentSnapshot", "currentSnapshot", "", t0.b.f22420d, "getId", "()I", "setId$runtime_release", "(I)V", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "Landroidx/compose/runtime/collection/IdentityArraySet;", "getModified$runtime_release", "()Landroidx/compose/runtime/collection/IdentityArraySet;", "setModified", "(Landroidx/compose/runtime/collection/IdentityArraySet;)V", "modified", "getReadOnly", "()Z", "readOnly", "specifiedReadObserver", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;Lv3/l;ZZ)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TransparentObserverSnapshot extends Snapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsPreviousSnapshot;

    @m
    private final Snapshot previousSnapshot;

    @m
    private final l<Object, r2> readObserver;

    @p4.l
    private final Snapshot root;

    @m
    private final l<Object, r2> writeObserver;

    public TransparentObserverSnapshot(@m Snapshot snapshot, @m l<Object, r2> lVar, boolean z4, boolean z5) {
        super(0, SnapshotIdSet.Companion.getEMPTY(), null);
        AtomicReference atomicReference;
        l<Object, r2> readObserver$runtime_release;
        l<Object, r2> mergedReadObserver;
        this.previousSnapshot = snapshot;
        this.mergeParentObservers = z4;
        this.ownsPreviousSnapshot = z5;
        if (snapshot == null || (readObserver$runtime_release = snapshot.getReadObserver$runtime_release()) == null) {
            atomicReference = SnapshotKt.currentGlobalSnapshot;
            readObserver$runtime_release = ((GlobalSnapshot) atomicReference.get()).getReadObserver$runtime_release();
        }
        mergedReadObserver = SnapshotKt.mergedReadObserver(lVar, readObserver$runtime_release, z4);
        this.readObserver = mergedReadObserver;
        this.root = this;
    }

    private final Snapshot getCurrentSnapshot() {
        AtomicReference atomicReference;
        Snapshot snapshot = this.previousSnapshot;
        if (snapshot != null) {
            return snapshot;
        }
        atomicReference = SnapshotKt.currentGlobalSnapshot;
        return (Snapshot) atomicReference.get();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        Snapshot snapshot;
        setDisposed$runtime_release(true);
        if (this.ownsPreviousSnapshot && (snapshot = this.previousSnapshot) != null) {
            snapshot.dispose();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getId() {
        return getCurrentSnapshot().getId();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @p4.l
    public SnapshotIdSet getInvalid$runtime_release() {
        return getCurrentSnapshot().getInvalid$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @m
    public IdentityArraySet<StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @m
    public l<Object, r2> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @p4.l
    public Snapshot getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @m
    public l<Object, r2> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo3354recordModified$runtime_release(@p4.l StateObject stateObject) {
        getCurrentSnapshot().mo3354recordModified$runtime_release(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setId$runtime_release(int i5) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(@p4.l SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    public void setModified(@m IdentityArraySet<StateObject> identityArraySet) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @p4.l
    public Snapshot takeNestedSnapshot(@m l<Object, r2> lVar) {
        Snapshot createTransparentSnapshotWithNoParentReadObserver;
        l<Object, r2> mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(lVar, getReadObserver$runtime_release(), false, 4, null);
        if (!this.mergeParentObservers) {
            createTransparentSnapshotWithNoParentReadObserver = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), mergedReadObserver$default, true);
            return createTransparentSnapshotWithNoParentReadObserver;
        }
        return getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver$default);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @p4.l
    /* renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo3352nestedActivated$runtime_release(@p4.l Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @p4.l
    /* renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo3353nestedDeactivated$runtime_release(@p4.l Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }
}
