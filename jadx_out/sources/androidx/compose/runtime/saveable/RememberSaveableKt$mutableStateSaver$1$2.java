package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/MutableState;", "T", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RememberSaveableKt$mutableStateSaver$1$2<T> extends n0 implements l<MutableState<Object>, MutableState<T>> {
    final /* synthetic */ Saver<T, Object> $this_with;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$mutableStateSaver$1$2(Saver<T, Object> saver) {
        super(1);
        this.$this_with = saver;
    }

    @Override // v3.l
    @m
    public final MutableState<T> invoke(@p4.l MutableState<Object> mutableState) {
        T t5;
        if (mutableState instanceof SnapshotMutableState) {
            if (mutableState.getValue() != null) {
                Saver<T, Object> saver = this.$this_with;
                Object value = mutableState.getValue();
                l0.m(value);
                t5 = saver.restore(value);
            } else {
                t5 = null;
            }
            SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) mutableState).getPolicy();
            l0.n(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$2?>");
            MutableState<T> mutableStateOf = SnapshotStateKt.mutableStateOf(t5, policy);
            l0.n(mutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$2>");
            return mutableStateOf;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
