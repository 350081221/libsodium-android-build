package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.ranges.f;
import v3.a;
import v3.l;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SliderKt$CorrectValueSideEffect$1$1 extends n0 implements a<r2> {
    final /* synthetic */ l<Float, Float> $scaleToOffset;
    final /* synthetic */ f<Float> $trackRange;
    final /* synthetic */ float $value;
    final /* synthetic */ f<Float> $valueRange;
    final /* synthetic */ MutableState<Float> $valueState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$CorrectValueSideEffect$1$1(f<Float> fVar, l<? super Float, Float> lVar, float f5, MutableState<Float> mutableState, f<Float> fVar2) {
        super(0);
        this.$valueRange = fVar;
        this.$scaleToOffset = lVar;
        this.$value = f5;
        this.$valueState = mutableState;
        this.$trackRange = fVar2;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        float floatValue = (this.$valueRange.getEndInclusive().floatValue() - this.$valueRange.getStart().floatValue()) / 1000;
        float floatValue2 = this.$scaleToOffset.invoke(Float.valueOf(this.$value)).floatValue();
        if (Math.abs(floatValue2 - this.$valueState.getValue().floatValue()) <= floatValue || !this.$trackRange.contains(this.$valueState.getValue())) {
            return;
        }
        this.$valueState.setValue(Float.valueOf(floatValue2));
    }
}
