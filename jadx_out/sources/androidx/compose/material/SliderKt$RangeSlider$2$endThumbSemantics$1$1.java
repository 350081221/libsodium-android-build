package androidx.compose.material;

import androidx.compose.runtime.State;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.ranges.f;
import kotlin.ranges.t;
import t0.b;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", b.f22420d, "Lkotlin/r2;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SliderKt$RangeSlider$2$endThumbSemantics$1$1 extends n0 implements l<Float, r2> {
    final /* synthetic */ float $coercedStart;
    final /* synthetic */ State<l<f<Float>, r2>> $onValueChangeState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$endThumbSemantics$1$1(State<? extends l<? super f<Float>, r2>> state, float f5) {
        super(1);
        this.$onValueChangeState = state;
        this.$coercedStart = f5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Float f5) {
        invoke(f5.floatValue());
        return r2.f19517a;
    }

    public final void invoke(float f5) {
        f<Float> e5;
        l<f<Float>, r2> value = this.$onValueChangeState.getValue();
        e5 = t.e(this.$coercedStart, f5);
        value.invoke(e5);
    }
}
