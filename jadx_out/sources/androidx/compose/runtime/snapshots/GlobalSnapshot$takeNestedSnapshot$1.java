package androidx.compose.runtime.snapshots;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2294:1\n1714#2:2295\n82#3:2296\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1\n*L\n1334#1:2295\n1334#1:2296\n*E\n"})
/* loaded from: classes.dex */
final class GlobalSnapshot$takeNestedSnapshot$1 extends n0 implements l<SnapshotIdSet, ReadonlySnapshot> {
    final /* synthetic */ l<Object, r2> $readObserver;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedSnapshot$1(l<Object, r2> lVar) {
        super(1);
        this.$readObserver = lVar;
    }

    @Override // v3.l
    @p4.l
    public final ReadonlySnapshot invoke(@p4.l SnapshotIdSet snapshotIdSet) {
        int i5;
        synchronized (SnapshotKt.getLock()) {
            i5 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i5 + 1;
        }
        return new ReadonlySnapshot(i5, snapshotIdSet, this.$readObserver);
    }
}
