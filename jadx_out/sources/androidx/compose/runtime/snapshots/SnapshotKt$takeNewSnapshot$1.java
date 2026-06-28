package androidx.compose.runtime.snapshots;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "Landroidx/compose/runtime/snapshots/Snapshot;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/Snapshot;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2294:1\n1714#2:2295\n82#3:2296\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n*L\n1835#1:2295\n1835#1:2296\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotKt$takeNewSnapshot$1<T> extends n0 implements l<SnapshotIdSet, T> {
    final /* synthetic */ l<SnapshotIdSet, T> $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotKt$takeNewSnapshot$1(l<? super SnapshotIdSet, ? extends T> lVar) {
        super(1);
        this.$block = lVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
    @Override // v3.l
    @p4.l
    public final Snapshot invoke(@p4.l SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        Snapshot snapshot = (Snapshot) this.$block.invoke(snapshotIdSet);
        synchronized (SnapshotKt.getLock()) {
            snapshotIdSet2 = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet2.set(snapshot.getId());
            r2 r2Var = r2.f19517a;
        }
        return snapshot;
    }
}
