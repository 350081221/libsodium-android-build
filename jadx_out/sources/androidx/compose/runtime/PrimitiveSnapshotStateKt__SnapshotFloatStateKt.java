package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.i0;
import kotlin.reflect.o;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\n\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\n¨\u0006\f"}, d2 = {"", b.f22420d, "Landroidx/compose/runtime/MutableFloatState;", "mutableFloatStateOf", "Landroidx/compose/runtime/FloatState;", "", "thisObj", "Lkotlin/reflect/o;", "property", "getValue", "Lkotlin/r2;", "setValue", "runtime_release"}, k = 5, mv = {1, 8, 0}, xs = "androidx/compose/runtime/PrimitiveSnapshotStateKt")
/* loaded from: classes.dex */
final /* synthetic */ class PrimitiveSnapshotStateKt__SnapshotFloatStateKt {
    public static final float getValue(@l FloatState floatState, @m Object obj, @l o<?> oVar) {
        return floatState.getFloatValue();
    }

    @l
    @StateFactoryMarker
    public static final MutableFloatState mutableFloatStateOf(float f5) {
        return ActualAndroid_androidKt.createSnapshotMutableFloatState(f5);
    }

    public static final void setValue(@l MutableFloatState mutableFloatState, @m Object obj, @l o<?> oVar, float f5) {
        mutableFloatState.setFloatValue(f5);
    }
}
