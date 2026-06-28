package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.i0;
import kotlin.reflect.o;
import p4.l;
import p4.m;

@i0(d1 = {"androidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PrimitiveSnapshotStateKt {
    public static final float getValue(@l FloatState floatState, @m Object obj, @l o<?> oVar) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.getValue(floatState, obj, oVar);
    }

    @l
    @StateFactoryMarker
    public static final MutableFloatState mutableFloatStateOf(float f5) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.mutableFloatStateOf(f5);
    }

    public static final void setValue(@l MutableFloatState mutableFloatState, @m Object obj, @l o<?> oVar, float f5) {
        PrimitiveSnapshotStateKt__SnapshotFloatStateKt.setValue(mutableFloatState, obj, oVar, f5);
    }
}
