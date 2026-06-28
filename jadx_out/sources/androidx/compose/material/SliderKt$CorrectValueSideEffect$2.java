package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.ranges.f;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$CorrectValueSideEffect$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ l<Float, Float> $scaleToOffset;
    final /* synthetic */ f<Float> $trackRange;
    final /* synthetic */ float $value;
    final /* synthetic */ f<Float> $valueRange;
    final /* synthetic */ MutableState<Float> $valueState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$CorrectValueSideEffect$2(l<? super Float, Float> lVar, f<Float> fVar, f<Float> fVar2, MutableState<Float> mutableState, float f5, int i5) {
        super(2);
        this.$scaleToOffset = lVar;
        this.$valueRange = fVar;
        this.$trackRange = fVar2;
        this.$valueState = mutableState;
        this.$value = f5;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        SliderKt.CorrectValueSideEffect(this.$scaleToOffset, this.$valueRange, this.$trackRange, this.$valueState, this.$value, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
