package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
@kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B?\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d¢\u0006\u0004\b\u001f\u0010 R\u001e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0006R(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/material3/DatePickerStateImpl;", "Landroidx/compose/material3/BaseDatePickerStateImpl;", "Landroidx/compose/material3/DatePickerState;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/CalendarDate;", "_selectedDate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/DisplayMode;", "_displayMode", "", "dateMillis", "getSelectedDateMillis", "()Ljava/lang/Long;", "setSelectedDateMillis", "(Ljava/lang/Long;)V", "selectedDateMillis", "displayMode", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/l;", "yearRange", "initialDisplayMode", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;Lkotlin/jvm/internal/w;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DatePickerStateImpl extends BaseDatePickerStateImpl implements DatePickerState {

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    private MutableState<DisplayMode> _displayMode;

    @p4.l
    private MutableState<CalendarDate> _selectedDate;

    @kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/DatePickerStateImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DatePickerStateImpl;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final Saver<DatePickerStateImpl, Object> Saver(@p4.l SelectableDates selectableDates, @p4.l Locale locale) {
            return ListSaverKt.listSaver(DatePickerStateImpl$Companion$Saver$1.INSTANCE, new DatePickerStateImpl$Companion$Saver$2(selectableDates, locale));
        }
    }

    private DatePickerStateImpl(Long l5, Long l6, kotlin.ranges.l lVar, int i5, SelectableDates selectableDates, Locale locale) {
        super(l6, lVar, selectableDates, locale);
        CalendarDate calendarDate;
        MutableState<CalendarDate> mutableStateOf$default;
        MutableState<DisplayMode> mutableStateOf$default2;
        if (l5 != null) {
            calendarDate = getCalendarModel().getCanonicalDate(l5.longValue());
            if (!lVar.l(calendarDate.getYear())) {
                throw new IllegalArgumentException(("The provided initial date's year (" + calendarDate.getYear() + ") is out of the years range of " + lVar + external.org.apache.commons.lang3.d.f15957a).toString());
            }
        } else {
            calendarDate = null;
        }
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(calendarDate, null, 2, null);
        this._selectedDate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m1841boximpl(i5), null, 2, null);
        this._displayMode = mutableStateOf$default2;
    }

    public /* synthetic */ DatePickerStateImpl(Long l5, Long l6, kotlin.ranges.l lVar, int i5, SelectableDates selectableDates, Locale locale, kotlin.jvm.internal.w wVar) {
        this(l5, l6, lVar, i5, selectableDates, locale);
    }

    @Override // androidx.compose.material3.DatePickerState
    /* renamed from: getDisplayMode-jFl-4v0 */
    public int mo1817getDisplayModejFl4v0() {
        return this._displayMode.getValue().m1847unboximpl();
    }

    @Override // androidx.compose.material3.DatePickerState
    @p4.m
    public Long getSelectedDateMillis() {
        CalendarDate value = this._selectedDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DatePickerState
    /* renamed from: setDisplayMode-vCnGnXg */
    public void mo1818setDisplayModevCnGnXg(int i5) {
        Long selectedDateMillis = getSelectedDateMillis();
        if (selectedDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.m1841boximpl(i5));
    }

    @Override // androidx.compose.material3.DatePickerState
    public void setSelectedDateMillis(@p4.m Long l5) {
        if (l5 != null) {
            CalendarDate canonicalDate = getCalendarModel().getCanonicalDate(l5.longValue());
            if (getYearRange().l(canonicalDate.getYear())) {
                this._selectedDate.setValue(canonicalDate);
                return;
            }
            throw new IllegalArgumentException(("The provided date's year (" + canonicalDate.getYear() + ") is out of the years range of " + getYearRange() + external.org.apache.commons.lang3.d.f15957a).toString());
        }
        this._selectedDate.setValue(null);
    }
}
