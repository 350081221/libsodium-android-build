package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1 extends n0 implements l<PointerInputChange, r2> {
    final /* synthetic */ k1.a $draggingStart;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ State<p<Boolean, Float, r2>> $onDrag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1(State<? extends p<? super Boolean, ? super Float, r2>> state, k1.a aVar, boolean z4) {
        super(1);
        this.$onDrag = state;
        this.$draggingStart = aVar;
        this.$isRtl = z4;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange) {
        invoke2(pointerInputChange);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l PointerInputChange pointerInputChange) {
        float m3493getXimpl = Offset.m3493getXimpl(PointerEventKt.positionChange(pointerInputChange));
        p<Boolean, Float, r2> value = this.$onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(this.$draggingStart.element);
        if (this.$isRtl) {
            m3493getXimpl = -m3493getXimpl;
        }
        value.invoke(valueOf, Float.valueOf(m3493getXimpl));
    }
}
