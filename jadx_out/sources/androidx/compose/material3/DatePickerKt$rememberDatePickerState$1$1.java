package androidx.compose.material3;

import java.util.Locale;

@kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material3/DatePickerStateImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DatePickerKt$rememberDatePickerState$1$1 extends kotlin.jvm.internal.n0 implements v3.a<DatePickerStateImpl> {
    final /* synthetic */ int $initialDisplayMode;
    final /* synthetic */ Long $initialDisplayedMonthMillis;
    final /* synthetic */ Long $initialSelectedDateMillis;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$rememberDatePickerState$1$1(Long l5, Long l6, kotlin.ranges.l lVar, int i5, SelectableDates selectableDates, Locale locale) {
        super(0);
        this.$initialSelectedDateMillis = l5;
        this.$initialDisplayedMonthMillis = l6;
        this.$yearRange = lVar;
        this.$initialDisplayMode = i5;
        this.$selectableDates = selectableDates;
        this.$locale = locale;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final DatePickerStateImpl invoke() {
        return new DatePickerStateImpl(this.$initialSelectedDateMillis, this.$initialDisplayedMonthMillis, this.$yearRange, this.$initialDisplayMode, this.$selectableDates, this.$locale, null);
    }
}
