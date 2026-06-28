package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.ranges.f;
import kotlin.ranges.t;
import kotlin.ranges.u;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isStart", "", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/r2;", "invoke", "(ZF)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2$onDrag$1$1 extends n0 implements p<Boolean, Float, r2> {
    final /* synthetic */ k1.e $maxPx;
    final /* synthetic */ k1.e $minPx;
    final /* synthetic */ State<l<f<Float>, r2>> $onValueChangeState;
    final /* synthetic */ MutableFloatState $rawOffsetEnd;
    final /* synthetic */ MutableFloatState $rawOffsetStart;
    final /* synthetic */ f<Float> $value;
    final /* synthetic */ f<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$onDrag$1$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, f<Float> fVar, k1.e eVar, k1.e eVar2, State<? extends l<? super f<Float>, r2>> state, f<Float> fVar2) {
        super(2);
        this.$rawOffsetStart = mutableFloatState;
        this.$rawOffsetEnd = mutableFloatState2;
        this.$value = fVar;
        this.$minPx = eVar;
        this.$maxPx = eVar2;
        this.$onValueChangeState = state;
        this.$valueRange = fVar2;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Boolean bool, Float f5) {
        invoke(bool.booleanValue(), f5.floatValue());
        return r2.f19517a;
    }

    public final void invoke(boolean z4, float f5) {
        float H;
        f e5;
        f<Float> invoke$scaleToUserValue;
        float H2;
        if (z4) {
            MutableFloatState mutableFloatState = this.$rawOffsetStart;
            mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f5);
            this.$rawOffsetEnd.setFloatValue(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, this.$value.getEndInclusive().floatValue()));
            float floatValue = this.$rawOffsetEnd.getFloatValue();
            H2 = u.H(this.$rawOffsetStart.getFloatValue(), this.$minPx.element, floatValue);
            e5 = t.e(H2, floatValue);
        } else {
            MutableFloatState mutableFloatState2 = this.$rawOffsetEnd;
            mutableFloatState2.setFloatValue(mutableFloatState2.getFloatValue() + f5);
            this.$rawOffsetStart.setFloatValue(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, this.$value.getStart().floatValue()));
            float floatValue2 = this.$rawOffsetStart.getFloatValue();
            H = u.H(this.$rawOffsetEnd.getFloatValue(), floatValue2, this.$maxPx.element);
            e5 = t.e(floatValue2, H);
        }
        l<f<Float>, r2> value = this.$onValueChangeState.getValue();
        invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, e5);
        value.invoke(invoke$scaleToUserValue);
    }
}
