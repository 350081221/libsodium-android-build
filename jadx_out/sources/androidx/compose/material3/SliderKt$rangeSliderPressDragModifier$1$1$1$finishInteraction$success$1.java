package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.internal.k1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1 extends kotlin.jvm.internal.n0 implements v3.l<PointerInputChange, r2> {
    final /* synthetic */ k1.a $draggingStart;
    final /* synthetic */ RangeSliderState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1(RangeSliderState rangeSliderState, k1.a aVar) {
        super(1);
        this.$state = rangeSliderState;
        this.$draggingStart = aVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange) {
        invoke2(pointerInputChange);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l PointerInputChange pointerInputChange) {
        float m3493getXimpl = Offset.m3493getXimpl(PointerEventKt.positionChange(pointerInputChange));
        RangeSliderState rangeSliderState = this.$state;
        boolean z4 = this.$draggingStart.element;
        if (rangeSliderState.isRtl$material3_release()) {
            m3493getXimpl = -m3493getXimpl;
        }
        rangeSliderState.onDrag$material3_release(z4, m3493getXimpl);
    }
}
