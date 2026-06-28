package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.i0;
import kotlin.reflect.o;
import p4.l;
import p4.m;

@i0(d1 = {"androidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotIntStateKt {
    public static final int getValue(@l IntState intState, @m Object obj, @l o<?> oVar) {
        return SnapshotIntStateKt__SnapshotIntStateKt.getValue(intState, obj, oVar);
    }

    @l
    @StateFactoryMarker
    public static final MutableIntState mutableIntStateOf(int i5) {
        return SnapshotIntStateKt__SnapshotIntStateKt.mutableIntStateOf(i5);
    }

    public static final void setValue(@l MutableIntState mutableIntState, @m Object obj, @l o<?> oVar, int i5) {
        SnapshotIntStateKt__SnapshotIntStateKt.setValue(mutableIntState, obj, oVar, i5);
    }
}
