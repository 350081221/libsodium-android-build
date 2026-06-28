package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$MonthsNavigation$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $nextAvailable;
    final /* synthetic */ v3.a<r2> $onNextClicked;
    final /* synthetic */ v3.a<r2> $onPreviousClicked;
    final /* synthetic */ v3.a<r2> $onYearPickerButtonClicked;
    final /* synthetic */ boolean $previousAvailable;
    final /* synthetic */ String $yearPickerText;
    final /* synthetic */ boolean $yearPickerVisible;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$MonthsNavigation$2(Modifier modifier, boolean z4, boolean z5, boolean z6, String str, v3.a<r2> aVar, v3.a<r2> aVar2, v3.a<r2> aVar3, DatePickerColors datePickerColors, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$nextAvailable = z4;
        this.$previousAvailable = z5;
        this.$yearPickerVisible = z6;
        this.$yearPickerText = str;
        this.$onNextClicked = aVar;
        this.$onPreviousClicked = aVar2;
        this.$onYearPickerButtonClicked = aVar3;
        this.$colors = datePickerColors;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        DatePickerKt.MonthsNavigation(this.$modifier, this.$nextAvailable, this.$previousAvailable, this.$yearPickerVisible, this.$yearPickerText, this.$onNextClicked, this.$onPreviousClicked, this.$onYearPickerButtonClicked, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
