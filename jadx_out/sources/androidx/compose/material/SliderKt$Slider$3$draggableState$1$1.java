package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.ranges.f;
import kotlin.ranges.u;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderKt$Slider$3$draggableState$1$1 extends n0 implements l<Float, r2> {
    final /* synthetic */ k1.e $maxPx;
    final /* synthetic */ k1.e $minPx;
    final /* synthetic */ State<l<Float, r2>> $onValueChangeState;
    final /* synthetic */ MutableFloatState $pressOffset;
    final /* synthetic */ MutableFloatState $rawOffset;
    final /* synthetic */ f<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3$draggableState$1$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, k1.e eVar, k1.e eVar2, State<? extends l<? super Float, r2>> state, f<Float> fVar) {
        super(1);
        this.$rawOffset = mutableFloatState;
        this.$pressOffset = mutableFloatState2;
        this.$minPx = eVar;
        this.$maxPx = eVar2;
        this.$onValueChangeState = state;
        this.$valueRange = fVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Float f5) {
        invoke(f5.floatValue());
        return r2.f19517a;
    }

    public final void invoke(float f5) {
        float H;
        float invoke$scaleToUserValue;
        MutableFloatState mutableFloatState = this.$rawOffset;
        mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f5 + this.$pressOffset.getFloatValue());
        this.$pressOffset.setFloatValue(0.0f);
        H = u.H(this.$rawOffset.getFloatValue(), this.$minPx.element, this.$maxPx.element);
        l<Float, r2> value = this.$onValueChangeState.getValue();
        invoke$scaleToUserValue = SliderKt$Slider$3.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, H);
        value.invoke(Float.valueOf(invoke$scaleToUserValue));
    }
}
