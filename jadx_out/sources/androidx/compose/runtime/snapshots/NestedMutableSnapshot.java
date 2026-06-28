package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u0007\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Lkotlin/r2;", "deactivate", "dispose", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "parent", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "deactivated", "Z", "Landroidx/compose/runtime/snapshots/Snapshot;", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lv3/l;Lv3/l;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2294:1\n1714#2:2295\n82#3:2296\n1#4:2297\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1412#1:2295\n1412#1:2296\n*E\n"})
/* loaded from: classes.dex */
public final class NestedMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    private boolean deactivated;

    @l
    private final MutableSnapshot parent;

    public NestedMutableSnapshot(int i5, @l SnapshotIdSet snapshotIdSet, @m v3.l<Object, r2> lVar, @m v3.l<Object, r2> lVar2, @l MutableSnapshot mutableSnapshot) {
        super(i5, snapshotIdSet, lVar, lVar2);
        this.parent = mutableSnapshot;
        mutableSnapshot.mo3352nestedActivated$runtime_release(this);
    }

    private final void deactivate() {
        if (!this.deactivated) {
            this.deactivated = true;
            this.parent.mo3353nestedDeactivated$runtime_release(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[Catch: all -> 0x00bb, TryCatch #0 {, blocks: (B:11:0x002e, B:13:0x0033, B:16:0x003a, B:21:0x0054, B:23:0x005c, B:24:0x006c, B:26:0x0074, B:27:0x0079, B:32:0x0060, B:33:0x0069), top: B:10:0x002e }] */
    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            r7 = this;
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent
            boolean r0 = r0.getApplied$runtime_release()
            if (r0 != 0) goto Lbe
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent
            boolean r0 = r0.getDisposed$runtime_release()
            if (r0 == 0) goto L12
            goto Lbe
        L12:
            androidx.compose.runtime.collection.IdentityArraySet r0 = r7.getModified$runtime_release()
            int r1 = r7.getId()
            r2 = 0
            if (r0 == 0) goto L28
            androidx.compose.runtime.snapshots.MutableSnapshot r3 = r7.parent
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = r3.getInvalid$runtime_release()
            java.util.Map r3 = androidx.compose.runtime.snapshots.SnapshotKt.access$optimisticMerges(r3, r7, r4)
            goto L29
        L28:
            r3 = r2
        L29:
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r4)
            androidx.compose.runtime.snapshots.SnapshotKt.access$validateOpen(r7)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L69
            int r5 = r0.size()     // Catch: java.lang.Throwable -> Lbb
            if (r5 != 0) goto L3a
            goto L69
        L3a:
            androidx.compose.runtime.snapshots.MutableSnapshot r5 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            int r5 = r5.getId()     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.MutableSnapshot r6 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r6.getInvalid$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotApplyResult r3 = r7.innerApplyLocked$runtime_release(r5, r3, r6)     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r5 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE     // Catch: java.lang.Throwable -> Lbb
            boolean r5 = kotlin.jvm.internal.l0.g(r3, r5)     // Catch: java.lang.Throwable -> Lbb
            if (r5 != 0) goto L54
            monitor-exit(r4)
            return r3
        L54:
            androidx.compose.runtime.snapshots.MutableSnapshot r3 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.collection.IdentityArraySet r3 = r3.getModified$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            if (r3 == 0) goto L60
            r3.addAll(r0)     // Catch: java.lang.Throwable -> Lbb
            goto L6c
        L60:
            androidx.compose.runtime.snapshots.MutableSnapshot r3 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            r3.setModified(r0)     // Catch: java.lang.Throwable -> Lbb
            r7.setModified(r2)     // Catch: java.lang.Throwable -> Lbb
            goto L6c
        L69:
            r7.closeAndReleasePinning$runtime_release()     // Catch: java.lang.Throwable -> Lbb
        L6c:
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            int r0 = r0.getId()     // Catch: java.lang.Throwable -> Lbb
            if (r0 >= r1) goto L79
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            r0.advance$runtime_release()     // Catch: java.lang.Throwable -> Lbb
        L79:
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r0.getInvalid$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.clear(r1)     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r7.getPreviousIds$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.andNot(r3)     // Catch: java.lang.Throwable -> Lbb
            r0.setInvalid$runtime_release(r2)     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            r0.recordPrevious$runtime_release(r1)     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            int r1 = r7.takeoverPinnedSnapshot$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            r0.recordPreviousPinnedSnapshot$runtime_release(r1)     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r7.getPreviousIds$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            r0.recordPreviousList$runtime_release(r1)     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            int[] r1 = r7.getPreviousPinnedSnapshots$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            r0.recordPreviousPinnedSnapshots$runtime_release(r1)     // Catch: java.lang.Throwable -> Lbb
            kotlin.r2 r0 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r4)
            r0 = 1
            r7.setApplied$runtime_release(r0)
            r7.deactivate()
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r0 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE
            return r0
        Lbb:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        Lbe:
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure r0 = new androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.NestedMutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (!getDisposed$runtime_release()) {
            super.dispose();
            deactivate();
        }
    }

    @l
    public final MutableSnapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }
}
