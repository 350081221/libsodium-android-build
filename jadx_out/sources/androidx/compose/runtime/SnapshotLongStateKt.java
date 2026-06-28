package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.i0;
import kotlin.reflect.o;
import p4.l;
import p4.m;

@i0(d1 = {"androidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotLongStateKt {
    public static final long getValue(@l LongState longState, @m Object obj, @l o<?> oVar) {
        return SnapshotLongStateKt__SnapshotLongStateKt.getValue(longState, obj, oVar);
    }

    @l
    @StateFactoryMarker
    public static final MutableLongState mutableLongStateOf(long j5) {
        return SnapshotLongStateKt__SnapshotLongStateKt.mutableLongStateOf(j5);
    }

    public static final void setValue(@l MutableLongState mutableLongState, @m Object obj, @l o<?> oVar, long j5) {
        SnapshotLongStateKt__SnapshotLongStateKt.setValue(mutableLongState, obj, oVar, j5);
    }
}
