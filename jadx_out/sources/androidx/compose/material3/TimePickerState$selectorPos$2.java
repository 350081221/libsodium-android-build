package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/DpOffset;", "invoke-RKDOV3M", "()J"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState$selectorPos$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1843:1\n75#2:1844\n58#2:1845\n51#2:1846\n88#2:1847\n75#2:1848\n51#2:1849\n88#2:1850\n75#2:1851\n51#2:1852\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState$selectorPos$2\n*L\n623#1:1844\n628#1:1845\n630#1:1846\n631#1:1847\n631#1:1848\n631#1:1849\n632#1:1850\n632#1:1851\n632#1:1852\n*E\n"})
/* loaded from: classes.dex */
public final class TimePickerState$selectorPos$2 extends kotlin.jvm.internal.n0 implements v3.a<DpOffset> {
    final /* synthetic */ boolean $is24Hour;
    final /* synthetic */ TimePickerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerState$selectorPos$2(TimePickerState timePickerState, boolean z4) {
        super(0);
        this.this$0 = timePickerState;
        this.$is24Hour = z4;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ DpOffset invoke() {
        return DpOffset.m6099boximpl(m2504invokeRKDOV3M());
    }

    /* renamed from: invoke-RKDOV3M, reason: not valid java name */
    public final long m2504invokeRKDOV3M() {
        float f5;
        boolean isInnerCircle$material3_release = this.this$0.isInnerCircle$material3_release();
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        float f6 = 2;
        float m6044constructorimpl = Dp.m6044constructorimpl(timePickerTokens.m3163getClockDialSelectorHandleContainerSizeD9Ej5fM() / f6);
        if (this.$is24Hour && isInnerCircle$material3_release && Selection.m2172equalsimpl0(this.this$0.m2500getSelectionJiIwxys$material3_release(), Selection.Companion.m2176getHourJiIwxys())) {
            f5 = TimePickerKt.InnerCircleRadius;
        } else {
            f5 = TimePickerKt.OuterCircleSizeRadius;
        }
        float m6044constructorimpl2 = Dp.m6044constructorimpl(Dp.m6044constructorimpl(f5 - m6044constructorimpl) + m6044constructorimpl);
        return DpKt.m6065DpOffsetYgX7TsA(Dp.m6044constructorimpl(Dp.m6044constructorimpl(((float) Math.cos(this.this$0.getCurrentAngle$material3_release().getValue().floatValue())) * m6044constructorimpl2) + Dp.m6044constructorimpl(timePickerTokens.m3161getClockDialContainerSizeD9Ej5fM() / f6)), Dp.m6044constructorimpl(Dp.m6044constructorimpl(m6044constructorimpl2 * ((float) Math.sin(this.this$0.getCurrentAngle$material3_release().getValue().floatValue()))) + Dp.m6044constructorimpl(timePickerTokens.m3161getClockDialContainerSizeD9Ej5fM() / f6)));
    }
}
