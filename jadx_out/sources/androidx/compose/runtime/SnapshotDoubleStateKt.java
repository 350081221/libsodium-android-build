package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.i0;
import kotlin.reflect.o;
import p4.l;
import p4.m;

@i0(d1 = {"androidx/compose/runtime/SnapshotDoubleStateKt__SnapshotDoubleStateKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotDoubleStateKt {
    public static final double getValue(@l DoubleState doubleState, @m Object obj, @l o<?> oVar) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.getValue(doubleState, obj, oVar);
    }

    @l
    @StateFactoryMarker
    public static final MutableDoubleState mutableDoubleStateOf(double d5) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.mutableDoubleStateOf(d5);
    }

    public static final void setValue(@l MutableDoubleState mutableDoubleState, @m Object obj, @l o<?> oVar, double d5) {
        SnapshotDoubleStateKt__SnapshotDoubleStateKt.setValue(mutableDoubleState, obj, oVar, d5);
    }
}
