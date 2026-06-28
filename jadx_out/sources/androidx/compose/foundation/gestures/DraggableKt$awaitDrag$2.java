package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.channels.h0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DraggableKt$awaitDrag$2 extends n0 implements l<PointerInputChange, r2> {
    final /* synthetic */ h0<DragEvent> $channel;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ VelocityTracker $velocityTracker;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableKt$awaitDrag$2(VelocityTracker velocityTracker, h0<? super DragEvent> h0Var, boolean z4) {
        super(1);
        this.$velocityTracker = velocityTracker;
        this.$channel = h0Var;
        this.$reverseDirection = z4;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange) {
        invoke2(pointerInputChange);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l PointerInputChange pointerInputChange) {
        VelocityTrackerKt.addPointerInputChange(this.$velocityTracker, pointerInputChange);
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            return;
        }
        long positionChange = PointerEventKt.positionChange(pointerInputChange);
        pointerInputChange.consume();
        h0<DragEvent> h0Var = this.$channel;
        if (this.$reverseDirection) {
            positionChange = Offset.m3500timestuRUvjQ(positionChange, -1.0f);
        }
        h0Var.p(new DragEvent.DragDelta(positionChange, null));
    }
}
