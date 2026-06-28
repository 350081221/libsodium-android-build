package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.Locale;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateInputKt$DateInputTextField$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DateInputFormat $dateInputFormat;
    final /* synthetic */ DateInputValidator $dateInputValidator;
    final /* synthetic */ Long $initialDateMillis;
    final /* synthetic */ int $inputIdentifier;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<Long, r2> $onDateSelectionChange;
    final /* synthetic */ v3.p<Composer, Integer, r2> $placeholder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateInputKt$DateInputTextField$4(Modifier modifier, Long l5, v3.l<? super Long, r2> lVar, CalendarModel calendarModel, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, int i5, DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, Locale locale, DatePickerColors datePickerColors, int i6, int i7) {
        super(2);
        this.$modifier = modifier;
        this.$initialDateMillis = l5;
        this.$onDateSelectionChange = lVar;
        this.$calendarModel = calendarModel;
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$inputIdentifier = i5;
        this.$dateInputValidator = dateInputValidator;
        this.$dateInputFormat = dateInputFormat;
        this.$locale = locale;
        this.$colors = datePickerColors;
        this.$$changed = i6;
        this.$$changed1 = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        DateInputKt.m1773DateInputTextFieldtQNruF0(this.$modifier, this.$initialDateMillis, this.$onDateSelectionChange, this.$calendarModel, this.$label, this.$placeholder, this.$inputIdentifier, this.$dateInputValidator, this.$dateInputFormat, this.$locale, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}
