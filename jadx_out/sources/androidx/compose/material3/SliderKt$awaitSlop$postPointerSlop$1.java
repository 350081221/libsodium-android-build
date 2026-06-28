package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.k1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "pointerInput", "", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;F)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SliderKt$awaitSlop$postPointerSlop$1 extends kotlin.jvm.internal.n0 implements v3.p<PointerInputChange, Float, r2> {
    final /* synthetic */ k1.e $initialDelta;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$awaitSlop$postPointerSlop$1(k1.e eVar) {
        super(2);
        this.$initialDelta = eVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange, Float f5) {
        invoke(pointerInputChange, f5.floatValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.l PointerInputChange pointerInputChange, float f5) {
        pointerInputChange.consume();
        this.$initialDelta.element = f5;
    }
}
