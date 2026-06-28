package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ChipKt$SelectableChip$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $avatar;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$SelectableChip$2(SelectableChipColors selectableChipColors, boolean z4, boolean z5, v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, float f5, PaddingValues paddingValues) {
        super(2);
        this.$colors = selectableChipColors;
        this.$enabled = z4;
        this.$selected = z5;
        this.$label = pVar;
        this.$labelTextStyle = textStyle;
        this.$leadingIcon = pVar2;
        this.$avatar = pVar3;
        this.$trailingIcon = pVar4;
        this.$minHeight = f5;
        this.$paddingValues = paddingValues;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-577614814, i5, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:1920)");
        }
        ChipKt.m1669ChipContentfe0OD_I(this.$label, this.$labelTextStyle, this.$colors.m2157labelColorWaAFU9c$material3_release(this.$enabled, this.$selected), this.$leadingIcon, this.$avatar, this.$trailingIcon, this.$colors.m2158leadingIconContentColorWaAFU9c$material3_release(this.$enabled, this.$selected), this.$colors.m2159trailingIconContentColorWaAFU9c$material3_release(this.$enabled, this.$selected), this.$minHeight, this.$paddingValues, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
