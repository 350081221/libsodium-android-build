package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import java.util.Locale;

@Stable
@kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Landroidx/compose/material3/BaseDatePickerStateImpl;", "", "Lkotlin/ranges/l;", "yearRange", "Lkotlin/ranges/l;", "getYearRange", "()Lkotlin/ranges/l;", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "getSelectableDates", "()Landroidx/compose/material3/SelectableDates;", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "Landroidx/compose/material3/CalendarModel;", "getCalendarModel", "()Landroidx/compose/material3/CalendarModel;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/CalendarMonth;", "_displayedMonth", "Landroidx/compose/runtime/MutableState;", "", "monthMillis", "getDisplayedMonthMillis", "()J", "setDisplayedMonthMillis", "(J)V", "displayedMonthMillis", "initialDisplayedMonthMillis", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Lkotlin/ranges/l;Landroidx/compose/material3/SelectableDates;Ljava/util/Locale;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class BaseDatePickerStateImpl {
    public static final int $stable = 0;

    @p4.l
    private MutableState<CalendarMonth> _displayedMonth;

    @p4.l
    private final CalendarModel calendarModel;

    @p4.l
    private final SelectableDates selectableDates;

    @p4.l
    private final kotlin.ranges.l yearRange;

    public BaseDatePickerStateImpl(@p4.m Long l5, @p4.l kotlin.ranges.l lVar, @p4.l SelectableDates selectableDates, @p4.l Locale locale) {
        CalendarMonth month;
        MutableState<CalendarMonth> mutableStateOf$default;
        this.yearRange = lVar;
        this.selectableDates = selectableDates;
        CalendarModel createCalendarModel = CalendarModel_androidKt.createCalendarModel(locale);
        this.calendarModel = createCalendarModel;
        if (l5 != null) {
            month = createCalendarModel.getMonth(l5.longValue());
            if (!lVar.l(month.getYear())) {
                throw new IllegalArgumentException(("The initial display month's year (" + month.getYear() + ") is out of the years range of " + lVar + external.org.apache.commons.lang3.d.f15957a).toString());
            }
        } else {
            month = createCalendarModel.getMonth(createCalendarModel.getToday());
        }
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(month, null, 2, null);
        this._displayedMonth = mutableStateOf$default;
    }

    @p4.l
    public final CalendarModel getCalendarModel() {
        return this.calendarModel;
    }

    public final long getDisplayedMonthMillis() {
        return this._displayedMonth.getValue().getStartUtcTimeMillis();
    }

    @p4.l
    public final SelectableDates getSelectableDates() {
        return this.selectableDates;
    }

    @p4.l
    public final kotlin.ranges.l getYearRange() {
        return this.yearRange;
    }

    public final void setDisplayedMonthMillis(long j5) {
        CalendarMonth month = this.calendarModel.getMonth(j5);
        if (this.yearRange.l(month.getYear())) {
            this._displayedMonth.setValue(month);
            return;
        }
        throw new IllegalArgumentException(("The display month's year (" + month.getYear() + ") is out of the years range of " + this.yearRange + external.org.apache.commons.lang3.d.f15957a).toString());
    }
}
