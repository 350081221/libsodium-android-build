package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$3 extends n0 implements l<DrawScope, r2> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ State<Float> $baseRotation$delegate;
    final /* synthetic */ long $color;
    final /* synthetic */ State<Integer> $currentRotation$delegate;
    final /* synthetic */ State<Float> $endAngle$delegate;
    final /* synthetic */ State<Float> $startAngle$delegate;
    final /* synthetic */ Stroke $stroke;
    final /* synthetic */ float $strokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$3(long j5, Stroke stroke, float f5, long j6, State<Integer> state, State<Float> state2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$backgroundColor = j5;
        this.$stroke = stroke;
        this.$strokeWidth = f5;
        this.$color = j6;
        this.$currentRotation$delegate = state;
        this.$endAngle$delegate = state2;
        this.$startAngle$delegate = state3;
        this.$baseRotation$delegate = state4;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope drawScope) {
        int CircularProgressIndicator_LxG7B9w$lambda$8;
        float CircularProgressIndicator_LxG7B9w$lambda$10;
        float CircularProgressIndicator_LxG7B9w$lambda$11;
        float CircularProgressIndicator_LxG7B9w$lambda$9;
        float CircularProgressIndicator_LxG7B9w$lambda$112;
        ProgressIndicatorKt.m1412drawCircularIndicatorBackgroundbw27NRU(drawScope, this.$backgroundColor, this.$stroke);
        CircularProgressIndicator_LxG7B9w$lambda$8 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(this.$currentRotation$delegate);
        CircularProgressIndicator_LxG7B9w$lambda$10 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(this.$endAngle$delegate);
        CircularProgressIndicator_LxG7B9w$lambda$11 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(this.$startAngle$delegate);
        float abs = Math.abs(CircularProgressIndicator_LxG7B9w$lambda$10 - CircularProgressIndicator_LxG7B9w$lambda$11);
        CircularProgressIndicator_LxG7B9w$lambda$9 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(this.$baseRotation$delegate);
        float f5 = (((CircularProgressIndicator_LxG7B9w$lambda$8 * 216.0f) % 360.0f) - 90.0f) + CircularProgressIndicator_LxG7B9w$lambda$9;
        CircularProgressIndicator_LxG7B9w$lambda$112 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(this.$startAngle$delegate);
        ProgressIndicatorKt.m1414drawIndeterminateCircularIndicatorhrjfTZI(drawScope, CircularProgressIndicator_LxG7B9w$lambda$112 + f5, this.$strokeWidth, abs, this.$color, this.$stroke);
    }
}
