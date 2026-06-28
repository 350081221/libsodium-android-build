package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.i0;
import kotlin.r2;
import kotlin.y;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016J4\u0010\u0013\u001a\u00020\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016J\u000f\u0010\u0016\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010%\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R$\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020&8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00102\u001a\u00020-2\u0006\u0010'\u001a\u00020-8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R4\u00108\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001032\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001038P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010;\u001a\u00020&2\u0006\u0010'\u001a\u00020&8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b9\u0010)\"\u0004\b:\u0010+R\u0014\u0010>\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006C"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Lkotlin/r2;", "dispose", "", "hasPendingChanges", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "Lkotlin/Function1;", "", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeNestedSnapshot", "writeObserver", "takeNestedMutableSnapshot", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "snapshot", "", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "parentSnapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "mergeParentObservers", "Z", "ownsParentSnapshot", "getCurrentSnapshot", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "currentSnapshot", "", t0.b.f22420d, "getId", "()I", "setId$runtime_release", "(I)V", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "Landroidx/compose/runtime/collection/IdentityArraySet;", "getModified$runtime_release", "()Landroidx/compose/runtime/collection/IdentityArraySet;", "setModified", "(Landroidx/compose/runtime/collection/IdentityArraySet;)V", "modified", "getWriteCount$runtime_release", "setWriteCount$runtime_release", "writeCount", "getReadOnly", "()Z", "readOnly", "specifiedReadObserver", "specifiedWriteObserver", "<init>", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;Lv3/l;Lv3/l;ZZ)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsParentSnapshot;

    @m
    private final MutableSnapshot parentSnapshot;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TransparentObserverMutableSnapshot(@p4.m androidx.compose.runtime.snapshots.MutableSnapshot r3, @p4.m v3.l<java.lang.Object, kotlin.r2> r4, @p4.m v3.l<java.lang.Object, kotlin.r2> r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            androidx.compose.runtime.snapshots.SnapshotIdSet$Companion r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.Companion
            androidx.compose.runtime.snapshots.SnapshotIdSet r0 = r0.getEMPTY()
            if (r3 == 0) goto Le
            v3.l r1 = r3.getReadObserver$runtime_release()
            if (r1 != 0) goto L1c
        Le:
            java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.SnapshotKt.access$getCurrentGlobalSnapshot$p()
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r1 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r1
            v3.l r1 = r1.getReadObserver$runtime_release()
        L1c:
            v3.l r4 = androidx.compose.runtime.snapshots.SnapshotKt.access$mergedReadObserver(r4, r1, r6)
            if (r3 == 0) goto L28
            v3.l r1 = r3.getWriteObserver$runtime_release()
            if (r1 != 0) goto L36
        L28:
            java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.SnapshotKt.access$getCurrentGlobalSnapshot$p()
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r1 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r1
            v3.l r1 = r1.getWriteObserver$runtime_release()
        L36:
            v3.l r5 = androidx.compose.runtime.snapshots.SnapshotKt.access$mergedWriteObserver(r5, r1)
            r1 = 0
            r2.<init>(r1, r0, r4, r5)
            r2.parentSnapshot = r3
            r2.mergeParentObservers = r6
            r2.ownsParentSnapshot = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot.<init>(androidx.compose.runtime.snapshots.MutableSnapshot, v3.l, v3.l, boolean, boolean):void");
    }

    private final MutableSnapshot getCurrentSnapshot() {
        AtomicReference atomicReference;
        MutableSnapshot mutableSnapshot = this.parentSnapshot;
        if (mutableSnapshot != null) {
            return mutableSnapshot;
        }
        atomicReference = SnapshotKt.currentGlobalSnapshot;
        return (MutableSnapshot) atomicReference.get();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @l
    public SnapshotApplyResult apply() {
        return getCurrentSnapshot().apply();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        MutableSnapshot mutableSnapshot;
        setDisposed$runtime_release(true);
        if (this.ownsParentSnapshot && (mutableSnapshot = this.parentSnapshot) != null) {
            mutableSnapshot.dispose();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getId() {
        return getCurrentSnapshot().getId();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    public SnapshotIdSet getInvalid$runtime_release() {
        return getCurrentSnapshot().getInvalid$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @m
    public IdentityArraySet<StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return getCurrentSnapshot().getWriteCount$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo3354recordModified$runtime_release(@l StateObject stateObject) {
        getCurrentSnapshot().mo3354recordModified$runtime_release(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setId$runtime_release(int i5) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(@l SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public void setModified(@m IdentityArraySet<StateObject> identityArraySet) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i5) {
        getCurrentSnapshot().setWriteCount$runtime_release(i5);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @l
    public MutableSnapshot takeNestedMutableSnapshot(@m v3.l<Object, r2> lVar, @m v3.l<Object, r2> lVar2) {
        v3.l<Object, r2> mergedWriteObserver;
        v3.l<Object, r2> mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(lVar, getReadObserver$runtime_release(), false, 4, null);
        mergedWriteObserver = SnapshotKt.mergedWriteObserver(lVar2, getWriteObserver$runtime_release());
        if (!this.mergeParentObservers) {
            return new TransparentObserverMutableSnapshot(getCurrentSnapshot().takeNestedMutableSnapshot(null, mergedWriteObserver), mergedReadObserver$default, mergedWriteObserver, false, true);
        }
        return getCurrentSnapshot().takeNestedMutableSnapshot(mergedReadObserver$default, mergedWriteObserver);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot takeNestedSnapshot(@m v3.l<Object, r2> lVar) {
        Snapshot createTransparentSnapshotWithNoParentReadObserver;
        v3.l<Object, r2> mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(lVar, getReadObserver$runtime_release(), false, 4, null);
        if (!this.mergeParentObservers) {
            createTransparentSnapshotWithNoParentReadObserver = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), mergedReadObserver$default, true);
            return createTransparentSnapshotWithNoParentReadObserver;
        }
        return getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver$default);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @l
    /* renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo3352nestedActivated$runtime_release(@l Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @l
    /* renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo3353nestedDeactivated$runtime_release(@l Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }
}
