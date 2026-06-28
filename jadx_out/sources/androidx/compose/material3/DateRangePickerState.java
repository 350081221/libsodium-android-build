package androidx.compose.material3;

import androidx.compose.runtime.Stable;

@Stable
@kotlin.i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028fX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0011\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00128&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/DateRangePickerState;", "", "", "startDateMillis", "endDateMillis", "Lkotlin/r2;", "setSelection", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getSelectedStartDateMillis", "()Ljava/lang/Long;", "selectedStartDateMillis", "getSelectedEndDateMillis", "selectedEndDateMillis", "getDisplayedMonthMillis", "()J", "setDisplayedMonthMillis", "(J)V", "displayedMonthMillis", "Landroidx/compose/material3/DisplayMode;", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "displayMode", "Lkotlin/ranges/l;", "getYearRange", "()Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/SelectableDates;", "getSelectableDates", "()Landroidx/compose/material3/SelectableDates;", "selectableDates", "material3_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public interface DateRangePickerState {
    /* renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    int mo1831getDisplayModejFl4v0();

    long getDisplayedMonthMillis();

    @p4.l
    SelectableDates getSelectableDates();

    @p4.m
    Long getSelectedEndDateMillis();

    @p4.m
    Long getSelectedStartDateMillis();

    @p4.l
    kotlin.ranges.l getYearRange();

    /* renamed from: setDisplayMode-vCnGnXg, reason: not valid java name */
    void mo1832setDisplayModevCnGnXg(int i5);

    void setDisplayedMonthMillis(long j5);

    void setSelection(@p4.m Long l5, @p4.m Long l6);
}
