package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/MutableState;", "", "T", "Landroidx/compose/runtime/saveable/SaverScope;", "state", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SavedStateHandleSaverKt$mutableStateSaver$1$1<T> extends n0 implements p<SaverScope, MutableState<T>, MutableState<Object>> {
    final /* synthetic */ Saver<T, Object> $this_with;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedStateHandleSaverKt$mutableStateSaver$1$1(Saver<T, Object> saver) {
        super(2);
        this.$this_with = saver;
    }

    @Override // v3.p
    @m
    public final MutableState<Object> invoke(@l SaverScope saverScope, @l MutableState<T> mutableState) {
        if (mutableState instanceof SnapshotMutableState) {
            Object save = this.$this_with.save(saverScope, mutableState.getValue());
            SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) mutableState).getPolicy();
            l0.n(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return SnapshotStateKt.mutableStateOf(save, policy);
        }
        throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
    }
}
