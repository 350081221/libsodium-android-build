package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AbstractDraggableNode$_canDrag$1 extends n0 implements l<PointerInputChange, Boolean> {
    final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDraggableNode$_canDrag$1(AbstractDraggableNode abstractDraggableNode) {
        super(1);
        this.this$0 = abstractDraggableNode;
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l PointerInputChange pointerInputChange) {
        return this.this$0.getCanDrag().invoke(pointerInputChange);
    }
}
