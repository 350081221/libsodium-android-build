package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$Day$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $animateChecked;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ String $description;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $inRange;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<r2> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ boolean $today;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$Day$3(Modifier modifier, boolean z4, v3.a<r2> aVar, boolean z5, boolean z6, boolean z7, boolean z8, String str, DatePickerColors datePickerColors, v3.p<? super Composer, ? super Integer, r2> pVar, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$selected = z4;
        this.$onClick = aVar;
        this.$animateChecked = z5;
        this.$enabled = z6;
        this.$today = z7;
        this.$inRange = z8;
        this.$description = str;
        this.$colors = datePickerColors;
        this.$content = pVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        DatePickerKt.Day(this.$modifier, this.$selected, this.$onClick, this.$animateChecked, this.$enabled, this.$today, this.$inRange, this.$description, this.$colors, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
