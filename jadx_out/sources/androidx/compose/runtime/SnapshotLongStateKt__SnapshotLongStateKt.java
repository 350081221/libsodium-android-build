package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.i0;
import kotlin.reflect.o;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000&\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\n\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\n¨\u0006\f"}, d2 = {"", b.f22420d, "Landroidx/compose/runtime/MutableLongState;", "mutableLongStateOf", "Landroidx/compose/runtime/LongState;", "", "thisObj", "Lkotlin/reflect/o;", "property", "getValue", "Lkotlin/r2;", "setValue", "runtime_release"}, k = 5, mv = {1, 8, 0}, xs = "androidx/compose/runtime/SnapshotLongStateKt")
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotLongStateKt__SnapshotLongStateKt {
    public static final long getValue(@l LongState longState, @m Object obj, @l o<?> oVar) {
        return longState.getLongValue();
    }

    @l
    @StateFactoryMarker
    public static final MutableLongState mutableLongStateOf(long j5) {
        return ActualAndroid_androidKt.createSnapshotMutableLongState(j5);
    }

    public static final void setValue(@l MutableLongState mutableLongState, @m Object obj, @l o<?> oVar, long j5) {
        mutableLongState.setLongValue(j5);
    }
}
