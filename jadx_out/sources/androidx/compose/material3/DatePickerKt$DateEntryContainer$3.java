package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$DateEntryContainer$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ float $headerMinHeight;
    final /* synthetic */ v3.p<Composer, Integer, r2> $headline;
    final /* synthetic */ TextStyle $headlineTextStyle;
    final /* synthetic */ v3.p<Composer, Integer, r2> $modeToggleButton;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$DateEntryContainer$3(Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, DatePickerColors datePickerColors, TextStyle textStyle, float f5, v3.p<? super Composer, ? super Integer, r2> pVar4, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$title = pVar;
        this.$headline = pVar2;
        this.$modeToggleButton = pVar3;
        this.$colors = datePickerColors;
        this.$headlineTextStyle = textStyle;
        this.$headerMinHeight = f5;
        this.$content = pVar4;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        DatePickerKt.m1806DateEntryContainerau3_HiA(this.$modifier, this.$title, this.$headline, this.$modeToggleButton, this.$colors, this.$headlineTextStyle, this.$headerMinHeight, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
