package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "down", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableKt$CanDragCalculation$1 extends n0 implements l<PointerInputChange, Boolean> {
    public static final ScrollableKt$CanDragCalculation$1 INSTANCE = new ScrollableKt$CanDragCalculation$1();

    ScrollableKt$CanDragCalculation$1() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l PointerInputChange pointerInputChange) {
        return Boolean.valueOf(!PointerType.m4944equalsimpl0(pointerInputChange.m4875getTypeT8wyACA(), PointerType.Companion.m4949getMouseT8wyACA()));
    }
}
