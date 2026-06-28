package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.channels.l;
import v3.p;

@i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "", "", "changed", "Landroidx/compose/runtime/snapshots/Snapshot;", "<anonymous parameter 1>", "Lkotlin/r2;", "invoke", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n*L\n1#1,181:1\n1747#2,2:182\n1749#2:185\n52#3:184\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1\n*L\n127#1:182,2\n127#1:185\n128#1:184\n*E\n"})
/* loaded from: classes.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 extends n0 implements p<Set<? extends Object>, Snapshot, r2> {
    final /* synthetic */ l<Set<Object>> $appliedChanges;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1(l<Set<Object>> lVar) {
        super(2);
        this.$appliedChanges = lVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Set<? extends Object> set, Snapshot snapshot) {
        invoke2(set, snapshot);
        return r2.f19517a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:11:0x0016->B:22:?, LOOP_END, SYNTHETIC] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(@p4.l java.util.Set<? extends java.lang.Object> r5, @p4.l androidx.compose.runtime.snapshots.Snapshot r6) {
        /*
            r4 = this;
            r6 = r5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L12
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            goto L3b
        L12:
            java.util.Iterator r6 = r6.iterator()
        L16:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r6.next()
            boolean r2 = r0 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
            r3 = 1
            if (r2 == 0) goto L37
            androidx.compose.runtime.snapshots.StateObjectImpl r0 = (androidx.compose.runtime.snapshots.StateObjectImpl) r0
            androidx.compose.runtime.snapshots.ReaderKind$Companion r2 = androidx.compose.runtime.snapshots.ReaderKind.Companion
            r2 = 4
            int r2 = androidx.compose.runtime.snapshots.ReaderKind.m3356constructorimpl(r2)
            boolean r0 = r0.m3368isReadInh_f27i8$runtime_release(r2)
            if (r0 == 0) goto L35
            goto L37
        L35:
            r0 = r1
            goto L38
        L37:
            r0 = r3
        L38:
            if (r0 == 0) goto L16
            r1 = r3
        L3b:
            if (r1 == 0) goto L42
            kotlinx.coroutines.channels.l<java.util.Set<java.lang.Object>> r6 = r4.$appliedChanges
            r6.p(r5)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1.invoke2(java.util.Set, androidx.compose.runtime.snapshots.Snapshot):void");
    }
}
