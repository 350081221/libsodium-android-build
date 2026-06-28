package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MonthAdapter extends BaseAdapter {
    private static final int NO_DAY_NUMBER = -1;
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector<?> dateSelector;

    @Nullable
    final DayViewDecorator dayViewDecorator;
    final Month month;
    private Collection<Long> previouslySelectedDates;
    static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
    private static final int MAXIMUM_GRID_CELLS = (UtcDates.getUtcCalendar().getMaximum(5) + UtcDates.getUtcCalendar().getMaximum(7)) - 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.dayViewDecorator = dayViewDecorator;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    private String getDayContentDescription(Context context, long j5) {
        return DateStrings.getDayContentDescription(context, j5, isToday(j5), isStartOfRange(j5), isEndOfRange(j5));
    }

    private void initializeStyles(Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new CalendarStyle(context);
        }
    }

    private boolean isSelected(long j5) {
        Iterator<Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (UtcDates.canonicalYearMonthDay(j5) == UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean isToday(long j5) {
        return UtcDates.getTodayCalendar().getTimeInMillis() == j5;
    }

    private void updateSelectedState(@Nullable TextView textView, long j5, int i5) {
        boolean z4;
        CalendarItemStyle calendarItemStyle;
        CalendarItemStyle calendarItemStyle2;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String dayContentDescription = getDayContentDescription(context, j5);
        textView.setContentDescription(dayContentDescription);
        boolean isValid = this.calendarConstraints.getDateValidator().isValid(j5);
        if (isValid) {
            textView.setEnabled(true);
            boolean isSelected = isSelected(j5);
            textView.setSelected(isSelected);
            if (isSelected) {
                calendarItemStyle2 = this.calendarStyle.selectedDay;
            } else if (isToday(j5)) {
                calendarItemStyle2 = this.calendarStyle.todayDay;
            } else {
                calendarItemStyle2 = this.calendarStyle.day;
            }
            calendarItemStyle = calendarItemStyle2;
            z4 = isSelected;
        } else {
            textView.setEnabled(false);
            z4 = false;
            calendarItemStyle = this.calendarStyle.invalidDay;
        }
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        if (dayViewDecorator != null && i5 != -1) {
            Month month = this.month;
            int i6 = month.year;
            int i7 = month.month;
            ColorStateList backgroundColor = dayViewDecorator.getBackgroundColor(context, i6, i7, i5, isValid, z4);
            boolean z5 = z4;
            calendarItemStyle.styleItem(textView, backgroundColor, this.dayViewDecorator.getTextColor(context, i6, i7, i5, isValid, z5));
            Drawable compoundDrawableLeft = this.dayViewDecorator.getCompoundDrawableLeft(context, i6, i7, i5, isValid, z5);
            Drawable compoundDrawableTop = this.dayViewDecorator.getCompoundDrawableTop(context, i6, i7, i5, isValid, z5);
            Drawable compoundDrawableRight = this.dayViewDecorator.getCompoundDrawableRight(context, i6, i7, i5, isValid, z5);
            boolean z6 = z4;
            textView.setCompoundDrawables(compoundDrawableLeft, compoundDrawableTop, compoundDrawableRight, this.dayViewDecorator.getCompoundDrawableBottom(context, i6, i7, i5, isValid, z6));
            textView.setContentDescription(this.dayViewDecorator.getContentDescription(context, i6, i7, i5, isValid, z6, dayContentDescription));
            return;
        }
        calendarItemStyle.styleItem(textView);
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j5) {
        if (Month.create(j5).equals(this.month)) {
            int dayOfMonth = this.month.getDayOfMonth(j5);
            updateSelectedState((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().dayToPosition(dayOfMonth) - materialCalendarGridView.getFirstVisiblePosition()), j5, dayOfMonth);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int dayToPosition(int i5) {
        return firstPositionInMonth() + (i5 - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth(this.calendarConstraints.getFirstDayOfWeek());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return i5 / this.month.daysInWeek;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @VisibleForTesting
    boolean isEndOfRange(long j5) {
        Iterator<Pair<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l5 = it.next().second;
            if (l5 != null && l5.longValue() == j5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isFirstInRow(int i5) {
        return i5 % this.month.daysInWeek == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isLastInRow(int i5) {
        return (i5 + 1) % this.month.daysInWeek == 0;
    }

    @VisibleForTesting
    boolean isStartOfRange(long j5) {
        Iterator<Pair<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l5 = it.next().first;
            if (l5 != null && l5.longValue() == j5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    int positionToDay(int i5) {
        return (i5 - firstPositionInMonth()) + 1;
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.previouslySelectedDates.iterator();
        while (it.hasNext()) {
            updateSelectedStateForDate(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                updateSelectedStateForDate(materialCalendarGridView, it2.next().longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean withinMonth(int i5) {
        return i5 >= firstPositionInMonth() && i5 <= lastPositionInMonth();
    }

    @Override // android.widget.Adapter
    @Nullable
    public Long getItem(int i5) {
        if (i5 < firstPositionInMonth() || i5 > lastPositionInMonth()) {
            return null;
        }
        return Long.valueOf(this.month.getDay(positionToDay(i5)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    @Override // android.widget.Adapter
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, @androidx.annotation.Nullable android.view.View r7, @androidx.annotation.NonNull android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.initializeStyles(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.firstPositionInMonth()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.Month r8 = r5.month
            int r2 = r8.daysInMonth
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.updateSelectedState(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MonthAdapter.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }
}
