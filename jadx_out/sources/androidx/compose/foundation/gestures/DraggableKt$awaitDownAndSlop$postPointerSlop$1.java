package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/r2;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DraggableKt$awaitDownAndSlop$postPointerSlop$1 extends n0 implements p<PointerInputChange, Offset, r2> {
    final /* synthetic */ k1.g $initialDelta;
    final /* synthetic */ VelocityTracker $velocityTracker;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDownAndSlop$postPointerSlop$1(VelocityTracker velocityTracker, k1.g gVar) {
        super(2);
        this.$velocityTracker = velocityTracker;
        this.$initialDelta = gVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange, Offset offset) {
        m361invokeUv8p0NA(pointerInputChange, offset.m3503unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m361invokeUv8p0NA(@l PointerInputChange pointerInputChange, long j5) {
        VelocityTrackerKt.addPointerInputChange(this.$velocityTracker, pointerInputChange);
        pointerInputChange.consume();
        this.$initialDelta.element = j5;
    }
}
