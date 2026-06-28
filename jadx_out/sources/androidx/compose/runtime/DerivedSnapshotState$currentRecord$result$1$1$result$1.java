package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.snapshots.StateObject;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DerivedSnapshotState$currentRecord$result$1$1$result$1 extends n0 implements l<Object, r2> {
    final /* synthetic */ IntRef $calculationLevelRef;
    final /* synthetic */ int $nestedCalculationLevel;
    final /* synthetic */ MutableObjectIntMap<StateObject> $newDependencies;
    final /* synthetic */ DerivedSnapshotState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DerivedSnapshotState$currentRecord$result$1$1$result$1(DerivedSnapshotState<T> derivedSnapshotState, IntRef intRef, MutableObjectIntMap<StateObject> mutableObjectIntMap, int i5) {
        super(1);
        this.this$0 = derivedSnapshotState;
        this.$calculationLevelRef = intRef;
        this.$newDependencies = mutableObjectIntMap;
        this.$nestedCalculationLevel = i5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
        invoke2(obj);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Object obj) {
        if (obj != this.this$0) {
            if (obj instanceof StateObject) {
                int element = this.$calculationLevelRef.getElement();
                MutableObjectIntMap<StateObject> mutableObjectIntMap = this.$newDependencies;
                mutableObjectIntMap.set(obj, Math.min(element - this.$nestedCalculationLevel, mutableObjectIntMap.getOrDefault(obj, Integer.MAX_VALUE)));
                return;
            }
            return;
        }
        throw new IllegalStateException("A derived state calculation cannot read itself".toString());
    }
}
