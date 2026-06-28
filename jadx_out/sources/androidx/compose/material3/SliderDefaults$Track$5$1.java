package androidx.compose.material3;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderDefaults$Track$5$1 extends kotlin.jvm.internal.n0 implements v3.l<DrawScope, r2> {
    final /* synthetic */ long $activeTickColor;
    final /* synthetic */ long $activeTrackColor;
    final /* synthetic */ long $inactiveTickColor;
    final /* synthetic */ long $inactiveTrackColor;
    final /* synthetic */ RangeSliderState $rangeSliderState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$5$1(RangeSliderState rangeSliderState, long j5, long j6, long j7, long j8) {
        super(1);
        this.$rangeSliderState = rangeSliderState;
        this.$inactiveTrackColor = j5;
        this.$activeTrackColor = j6;
        this.$inactiveTickColor = j7;
        this.$activeTickColor = j8;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope drawScope) {
        SliderDefaults.INSTANCE.m2194drawTrackLUBghH0(drawScope, this.$rangeSliderState.getTickFractions$material3_release(), this.$rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), this.$rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), this.$inactiveTrackColor, this.$activeTrackColor, this.$inactiveTickColor, this.$activeTickColor);
    }
}
