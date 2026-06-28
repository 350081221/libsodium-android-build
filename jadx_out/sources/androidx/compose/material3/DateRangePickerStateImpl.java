package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
@kotlin.i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'BI\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\u0006\u0010!\u001a\u00020 \u0012\n\u0010$\u001a\u00060\"j\u0002`#¢\u0006\u0004\b%\u0010&J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R*\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/material3/DateRangePickerStateImpl;", "Landroidx/compose/material3/BaseDatePickerStateImpl;", "Landroidx/compose/material3/DateRangePickerState;", "", "startDateMillis", "endDateMillis", "Lkotlin/r2;", "setSelection", "(Ljava/lang/Long;Ljava/lang/Long;)V", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/CalendarDate;", "_selectedStartDate", "Landroidx/compose/runtime/MutableState;", "_selectedEndDate", "Landroidx/compose/material3/DisplayMode;", "_displayMode", "getSelectedStartDateMillis", "()Ljava/lang/Long;", "selectedStartDateMillis", "getSelectedEndDateMillis", "selectedEndDateMillis", "displayMode", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/l;", "yearRange", "initialDisplayMode", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;Lkotlin/jvm/internal/w;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class DateRangePickerStateImpl extends BaseDatePickerStateImpl implements DateRangePickerState {

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    private MutableState<DisplayMode> _displayMode;

    @p4.l
    private MutableState<CalendarDate> _selectedEndDate;

    @p4.l
    private MutableState<CalendarDate> _selectedStartDate;

    @kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/DateRangePickerStateImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DateRangePickerStateImpl;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final Saver<DateRangePickerStateImpl, Object> Saver(@p4.l SelectableDates selectableDates, @p4.l Locale locale) {
            return ListSaverKt.listSaver(DateRangePickerStateImpl$Companion$Saver$1.INSTANCE, new DateRangePickerStateImpl$Companion$Saver$2(selectableDates, locale));
        }
    }

    private DateRangePickerStateImpl(Long l5, Long l6, Long l7, kotlin.ranges.l lVar, int i5, SelectableDates selectableDates, Locale locale) {
        super(l7, lVar, selectableDates, locale);
        MutableState<CalendarDate> mutableStateOf$default;
        MutableState<CalendarDate> mutableStateOf$default2;
        MutableState<DisplayMode> mutableStateOf$default3;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._selectedStartDate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._selectedEndDate = mutableStateOf$default2;
        setSelection(l5, l6);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m1841boximpl(i5), null, 2, null);
        this._displayMode = mutableStateOf$default3;
    }

    public /* synthetic */ DateRangePickerStateImpl(Long l5, Long l6, Long l7, kotlin.ranges.l lVar, int i5, SelectableDates selectableDates, Locale locale, kotlin.jvm.internal.w wVar) {
        this(l5, l6, l7, lVar, i5, selectableDates, locale);
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* renamed from: getDisplayMode-jFl-4v0 */
    public int mo1831getDisplayModejFl4v0() {
        return this._displayMode.getValue().m1847unboximpl();
    }

    @Override // androidx.compose.material3.DateRangePickerState
    @p4.m
    public Long getSelectedEndDateMillis() {
        CalendarDate value = this._selectedEndDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    @p4.m
    public Long getSelectedStartDateMillis() {
        CalendarDate value = this._selectedStartDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* renamed from: setDisplayMode-vCnGnXg */
    public void mo1832setDisplayModevCnGnXg(int i5) {
        Long selectedStartDateMillis = getSelectedStartDateMillis();
        if (selectedStartDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedStartDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.m1841boximpl(i5));
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public void setSelection(@p4.m Long l5, @p4.m Long l6) {
        CalendarDate calendarDate;
        boolean z4;
        CalendarDate calendarDate2 = null;
        if (l5 != null) {
            calendarDate = getCalendarModel().getCanonicalDate(l5.longValue());
        } else {
            calendarDate = null;
        }
        if (l6 != null) {
            calendarDate2 = getCalendarModel().getCanonicalDate(l6.longValue());
        }
        if (calendarDate != null && !getYearRange().l(calendarDate.getYear())) {
            throw new IllegalArgumentException(("The provided start date year (" + calendarDate.getYear() + ") is out of the years range of " + getYearRange() + external.org.apache.commons.lang3.d.f15957a).toString());
        }
        if (calendarDate2 != null && !getYearRange().l(calendarDate2.getYear())) {
            throw new IllegalArgumentException(("The provided end date year (" + calendarDate2.getYear() + ") is out of the years range of " + getYearRange() + external.org.apache.commons.lang3.d.f15957a).toString());
        }
        if (calendarDate2 != null) {
            if (calendarDate != null) {
                if (calendarDate.getUtcTimeMillis() <= calendarDate2.getUtcTimeMillis()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    throw new IllegalArgumentException("The provided end date appears before the start date.".toString());
                }
            } else {
                throw new IllegalArgumentException("An end date was provided without a start date.".toString());
            }
        }
        this._selectedStartDate.setValue(calendarDate);
        this._selectedEndDate.setValue(calendarDate2);
    }
}
