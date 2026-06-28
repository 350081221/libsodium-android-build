package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$3$1 extends n0 implements l<DrawScope, r2> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $color;
    final /* synthetic */ State<Float> $firstLineHead$delegate;
    final /* synthetic */ State<Float> $firstLineTail$delegate;
    final /* synthetic */ State<Float> $secondLineHead$delegate;
    final /* synthetic */ State<Float> $secondLineTail$delegate;
    final /* synthetic */ int $strokeCap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$3$1(long j5, int i5, long j6, State<Float> state, State<Float> state2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$backgroundColor = j5;
        this.$strokeCap = i5;
        this.$color = j6;
        this.$firstLineHead$delegate = state;
        this.$firstLineTail$delegate = state2;
        this.$secondLineHead$delegate = state3;
        this.$secondLineTail$delegate = state4;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope drawScope) {
        float LinearProgressIndicator_2cYBFYY$lambda$1;
        float LinearProgressIndicator_2cYBFYY$lambda$2;
        float LinearProgressIndicator_2cYBFYY$lambda$3;
        float LinearProgressIndicator_2cYBFYY$lambda$4;
        float LinearProgressIndicator_2cYBFYY$lambda$32;
        float LinearProgressIndicator_2cYBFYY$lambda$42;
        float LinearProgressIndicator_2cYBFYY$lambda$12;
        float LinearProgressIndicator_2cYBFYY$lambda$22;
        float m3559getHeightimpl = Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc());
        ProgressIndicatorKt.m1416drawLinearIndicatorBackgroundAZGd3zU(drawScope, this.$backgroundColor, m3559getHeightimpl, this.$strokeCap);
        LinearProgressIndicator_2cYBFYY$lambda$1 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(this.$firstLineHead$delegate);
        LinearProgressIndicator_2cYBFYY$lambda$2 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(this.$firstLineTail$delegate);
        if (LinearProgressIndicator_2cYBFYY$lambda$1 - LinearProgressIndicator_2cYBFYY$lambda$2 > 0.0f) {
            LinearProgressIndicator_2cYBFYY$lambda$12 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(this.$firstLineHead$delegate);
            LinearProgressIndicator_2cYBFYY$lambda$22 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(this.$firstLineTail$delegate);
            ProgressIndicatorKt.m1415drawLinearIndicatorqYKTg0g(drawScope, LinearProgressIndicator_2cYBFYY$lambda$12, LinearProgressIndicator_2cYBFYY$lambda$22, this.$color, m3559getHeightimpl, this.$strokeCap);
        }
        LinearProgressIndicator_2cYBFYY$lambda$3 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(this.$secondLineHead$delegate);
        LinearProgressIndicator_2cYBFYY$lambda$4 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(this.$secondLineTail$delegate);
        if (LinearProgressIndicator_2cYBFYY$lambda$3 - LinearProgressIndicator_2cYBFYY$lambda$4 > 0.0f) {
            LinearProgressIndicator_2cYBFYY$lambda$32 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(this.$secondLineHead$delegate);
            LinearProgressIndicator_2cYBFYY$lambda$42 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(this.$secondLineTail$delegate);
            ProgressIndicatorKt.m1415drawLinearIndicatorqYKTg0g(drawScope, LinearProgressIndicator_2cYBFYY$lambda$32, LinearProgressIndicator_2cYBFYY$lambda$42, this.$color, m3559getHeightimpl, this.$strokeCap);
        }
    }
}
