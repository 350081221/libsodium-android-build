package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.DpOffset;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TimePickerKt$drawSelector$1 extends kotlin.jvm.internal.n0 implements v3.l<ContentDrawScope, r2> {
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$drawSelector$1(TimePickerState timePickerState, TimePickerColors timePickerColors) {
        super(1);
        this.$state = timePickerState;
        this.$colors = timePickerColors;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ContentDrawScope contentDrawScope) {
        long Offset = OffsetKt.Offset(contentDrawScope.mo304toPx0680j_4(DpOffset.m6105getXD9Ej5fM(this.$state.m2501getSelectorPosRKDOV3M$material3_release())), contentDrawScope.mo304toPx0680j_4(DpOffset.m6107getYD9Ej5fM(this.$state.m2501getSelectorPosRKDOV3M$material3_release())));
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        float f5 = 2;
        float mo304toPx0680j_4 = contentDrawScope.mo304toPx0680j_4(timePickerTokens.m3163getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f5;
        long m2467getSelectorColor0d7_KjU = this.$colors.m2467getSelectorColor0d7_KjU();
        long m3760getBlack0d7_KjU = Color.Companion.m3760getBlack0d7_KjU();
        BlendMode.Companion companion = BlendMode.Companion;
        DrawScope.m4259drawCircleVaOC9Bg$default(contentDrawScope, m3760getBlack0d7_KjU, mo304toPx0680j_4, Offset, 0.0f, null, null, companion.m3649getClear0nO6VwU(), 56, null);
        contentDrawScope.drawContent();
        DrawScope.m4259drawCircleVaOC9Bg$default(contentDrawScope, m2467getSelectorColor0d7_KjU, mo304toPx0680j_4, Offset, 0.0f, null, null, companion.m3677getXor0nO6VwU(), 56, null);
        DrawScope.m4264drawLineNGM6Ib0$default(contentDrawScope, m2467getSelectorColor0d7_KjU, SizeKt.m3572getCenteruvyYCjk(contentDrawScope.mo4277getSizeNHjbRc()), Offset.m3497minusMKHz9U(Offset, OffsetKt.Offset(((float) Math.cos(this.$state.getCurrentAngle$material3_release().getValue().floatValue())) * mo304toPx0680j_4, ((float) Math.sin(this.$state.getCurrentAngle$material3_release().getValue().floatValue())) * mo304toPx0680j_4)), contentDrawScope.mo304toPx0680j_4(timePickerTokens.m3164getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, companion.m3676getSrcOver0nO6VwU(), 240, null);
        DrawScope.m4259drawCircleVaOC9Bg$default(contentDrawScope, m2467getSelectorColor0d7_KjU, contentDrawScope.mo304toPx0680j_4(timePickerTokens.m3162getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f5, SizeKt.m3572getCenteruvyYCjk(contentDrawScope.mo4277getSizeNHjbRc()), 0.0f, null, null, 0, 120, null);
        DrawScope.m4259drawCircleVaOC9Bg$default(contentDrawScope, this.$colors.m2456clockDialContentColorvNxB06k$material3_release(true), mo304toPx0680j_4, Offset, 0.0f, null, null, companion.m3659getDstOver0nO6VwU(), 56, null);
    }
}
