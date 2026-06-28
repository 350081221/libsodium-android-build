package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import java.util.Set;
import kotlin.d1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.flow.e0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "changed", "Landroidx/compose/runtime/snapshots/Snapshot;", "<anonymous parameter 1>", "Lkotlin/r2;", "invoke", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 4 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1564:1\n82#2:1565\n396#3,2:1566\n399#3:1575\n401#3:1578\n108#4,5:1568\n114#4:1574\n50#5:1573\n1855#6,2:1576\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n*L\n977#1:1565\n979#1:1566,2\n979#1:1575\n979#1:1578\n979#1:1568,5\n979#1:1574\n982#1:1573\n979#1:1576,2\n*E\n"})
/* loaded from: classes.dex */
final class Recomposer$recompositionRunner$2$unregisterApplyObserver$1 extends n0 implements p<Set<? extends Object>, Snapshot, r2> {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2$unregisterApplyObserver$1(Recomposer recomposer) {
        super(2);
        this.this$0 = recomposer;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Set<? extends Object> set, Snapshot snapshot) {
        invoke2(set, snapshot);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l Set<? extends Object> set, @l Snapshot snapshot) {
        e0 e0Var;
        kotlinx.coroutines.p pVar;
        int i5;
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            e0Var = recomposer._state;
            if (((Recomposer.State) e0Var.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                if (set instanceof IdentityArraySet) {
                    IdentityArraySet identityArraySet = (IdentityArraySet) set;
                    Object[] values = identityArraySet.getValues();
                    int size = identityArraySet.size();
                    while (i5 < size) {
                        Object obj2 = values[i5];
                        l0.n(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        if (obj2 instanceof StateObjectImpl) {
                            ReaderKind.Companion companion = ReaderKind.Companion;
                            i5 = ((StateObjectImpl) obj2).m3368isReadInh_f27i8$runtime_release(ReaderKind.m3356constructorimpl(1)) ? 0 : i5 + 1;
                        }
                        recomposer.snapshotInvalidations.add(obj2);
                    }
                } else {
                    for (Object obj3 : set) {
                        if (obj3 instanceof StateObjectImpl) {
                            ReaderKind.Companion companion2 = ReaderKind.Companion;
                            if (!((StateObjectImpl) obj3).m3368isReadInh_f27i8$runtime_release(ReaderKind.m3356constructorimpl(1))) {
                            }
                        }
                        recomposer.snapshotInvalidations.add(obj3);
                    }
                }
                pVar = recomposer.deriveStateLocked();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            d1.a aVar = d1.Companion;
            pVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
        }
    }
}
