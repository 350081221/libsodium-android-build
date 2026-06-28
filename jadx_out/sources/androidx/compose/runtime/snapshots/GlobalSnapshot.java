package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.y;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J4\u0010\t\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0012\u0010\u0010J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Lkotlin/Function1;", "", "Lkotlin/r2;", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeNestedSnapshot", "writeObserver", "takeNestedMutableSnapshot", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "snapshot", "", "nestedDeactivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedDeactivated", "nestedActivated$runtime_release", "nestedActivated", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "dispose", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2294:1\n1714#2:2295\n1714#2:2297\n82#3:2296\n82#3:2298\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n*L\n1322#1:2295\n1368#1:2297\n1322#1:2296\n1368#1:2298\n*E\n"})
/* loaded from: classes.dex */
public final class GlobalSnapshot extends MutableSnapshot {
    public static final int $stable = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GlobalSnapshot(int r4, @p4.l androidx.compose.runtime.snapshots.SnapshotIdSet r5) {
        /*
            r3 = this;
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r0)
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.access$getGlobalWriteObservers$p()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = kotlin.collections.u.h5(r1)     // Catch: java.lang.Throwable -> L1c
            v3.l r2 = (v3.l) r2     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L16
            androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1 r2 = new androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1c
        L16:
            monitor-exit(r0)
            r0 = 0
            r3.<init>(r4, r5, r0, r2)
            return
        L1c:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.GlobalSnapshot.<init>(int, androidx.compose.runtime.snapshots.SnapshotIdSet):void");
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @l
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            r2 r2Var = r2.f19517a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        SnapshotKt.advanceGlobalSnapshot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @l
    public MutableSnapshot takeNestedMutableSnapshot(@m v3.l<Object, r2> lVar, @m v3.l<Object, r2> lVar2) {
        Snapshot takeNewSnapshot;
        takeNewSnapshot = SnapshotKt.takeNewSnapshot(new GlobalSnapshot$takeNestedMutableSnapshot$1(lVar, lVar2));
        return (MutableSnapshot) takeNewSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot takeNestedSnapshot(@m v3.l<Object, r2> lVar) {
        Snapshot takeNewSnapshot;
        takeNewSnapshot = SnapshotKt.takeNewSnapshot(new GlobalSnapshot$takeNestedSnapshot$1(lVar));
        return takeNewSnapshot;
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
