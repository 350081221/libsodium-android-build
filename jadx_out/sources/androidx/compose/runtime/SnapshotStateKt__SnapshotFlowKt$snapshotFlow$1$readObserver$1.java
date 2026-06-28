package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n*L\n1#1,181:1\n52#2:182\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1\n*L\n116#1:182\n*E\n"})
/* loaded from: classes.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 extends n0 implements l<Object, r2> {
    final /* synthetic */ MutableScatterSet<Object> $readSet;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1(MutableScatterSet<Object> mutableScatterSet) {
        super(1);
        this.$readSet = mutableScatterSet;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
        invoke2(obj);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Object obj) {
        if (obj instanceof StateObjectImpl) {
            ReaderKind.Companion companion = ReaderKind.Companion;
            ((StateObjectImpl) obj).m3369recordReadInh_f27i8$runtime_release(ReaderKind.m3356constructorimpl(4));
        }
        this.$readSet.add(obj);
    }
}
