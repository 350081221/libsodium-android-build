package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$4$1 extends kotlin.jvm.internal.n0 implements v3.l<DrawScope, r2> {
    final /* synthetic */ long $color;
    final /* synthetic */ State<Float> $firstLineHead;
    final /* synthetic */ State<Float> $firstLineTail;
    final /* synthetic */ State<Float> $secondLineHead;
    final /* synthetic */ State<Float> $secondLineTail;
    final /* synthetic */ int $strokeCap;
    final /* synthetic */ long $trackColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$4$1(long j5, int i5, State<Float> state, State<Float> state2, long j6, State<Float> state3, State<Float> state4) {
        super(1);
        this.$trackColor = j5;
        this.$strokeCap = i5;
        this.$firstLineHead = state;
        this.$firstLineTail = state2;
        this.$color = j6;
        this.$secondLineHead = state3;
        this.$secondLineTail = state4;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope drawScope) {
        float m3559getHeightimpl = Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc());
        ProgressIndicatorKt.m2089drawLinearIndicatorTrackAZGd3zU(drawScope, this.$trackColor, m3559getHeightimpl, this.$strokeCap);
        if (this.$firstLineHead.getValue().floatValue() - this.$firstLineTail.getValue().floatValue() > 0.0f) {
            ProgressIndicatorKt.m2088drawLinearIndicatorqYKTg0g(drawScope, this.$firstLineHead.getValue().floatValue(), this.$firstLineTail.getValue().floatValue(), this.$color, m3559getHeightimpl, this.$strokeCap);
        }
        if (this.$secondLineHead.getValue().floatValue() - this.$secondLineTail.getValue().floatValue() > 0.0f) {
            ProgressIndicatorKt.m2088drawLinearIndicatorqYKTg0g(drawScope, this.$secondLineHead.getValue().floatValue(), this.$secondLineTail.getValue().floatValue(), this.$color, m3559getHeightimpl, this.$strokeCap);
        }
    }
}
