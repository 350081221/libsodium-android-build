package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SelectionGesturesKt$mouseSelection$shouldConsumeUp$1 extends n0 implements l<PointerInputChange, r2> {
    final /* synthetic */ MouseSelectionObserver $observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$mouseSelection$shouldConsumeUp$1(MouseSelectionObserver mouseSelectionObserver) {
        super(1);
        this.$observer = mouseSelectionObserver;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange) {
        invoke2(pointerInputChange);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l PointerInputChange pointerInputChange) {
        if (this.$observer.mo970onExtendDragk4lQ0M(pointerInputChange.m4872getPositionF1C5BW0())) {
            pointerInputChange.consume();
        }
    }
}
