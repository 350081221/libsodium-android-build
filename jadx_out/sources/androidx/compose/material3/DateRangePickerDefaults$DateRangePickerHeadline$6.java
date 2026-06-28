package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangePickerDefaults$DateRangePickerHeadline$6 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ v3.p<Composer, Integer, r2> $datesDelimiter;
    final /* synthetic */ int $displayMode;
    final /* synthetic */ v3.p<Composer, Integer, r2> $endDatePlaceholder;
    final /* synthetic */ String $endDateText;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Long $selectedEndDateMillis;
    final /* synthetic */ Long $selectedStartDateMillis;
    final /* synthetic */ v3.p<Composer, Integer, r2> $startDatePlaceholder;
    final /* synthetic */ String $startDateText;
    final /* synthetic */ DateRangePickerDefaults $tmp7_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateRangePickerDefaults$DateRangePickerHeadline$6(DateRangePickerDefaults dateRangePickerDefaults, Long l5, Long l6, int i5, DatePickerFormatter datePickerFormatter, Modifier modifier, String str, String str2, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, int i6, int i7) {
        super(2);
        this.$tmp7_rcvr = dateRangePickerDefaults;
        this.$selectedStartDateMillis = l5;
        this.$selectedEndDateMillis = l6;
        this.$displayMode = i5;
        this.$dateFormatter = datePickerFormatter;
        this.$modifier = modifier;
        this.$startDateText = str;
        this.$endDateText = str2;
        this.$startDatePlaceholder = pVar;
        this.$endDatePlaceholder = pVar2;
        this.$datesDelimiter = pVar3;
        this.$$changed = i6;
        this.$$changed1 = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        this.$tmp7_rcvr.m1819DateRangePickerHeadline0YIUgSQ(this.$selectedStartDateMillis, this.$selectedEndDateMillis, this.$displayMode, this.$dateFormatter, this.$modifier, this.$startDateText, this.$endDateText, this.$startDatePlaceholder, this.$endDatePlaceholder, this.$datesDelimiter, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}
