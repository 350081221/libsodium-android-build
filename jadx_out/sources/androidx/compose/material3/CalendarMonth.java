package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$¨\u0006)"}, d2 = {"Landroidx/compose/material3/CalendarMonth;", "", "Lkotlin/ranges/l;", "years", "", "indexIn", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "", "skeleton", "format", "component1", "component2", "component3", "component4", "", "component5", "year", "month", "numberOfDays", "daysFromStartOfWeekToFirstOfMonth", "startUtcTimeMillis", "copy", "toString", TTDownloadField.TT_HASHCODE, "other", "", "equals", "I", "getYear", "()I", "getMonth", "getNumberOfDays", "getDaysFromStartOfWeekToFirstOfMonth", "J", "getStartUtcTimeMillis", "()J", "endUtcTimeMillis", "getEndUtcTimeMillis", "<init>", "(IIIIJ)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class CalendarMonth {
    public static final int $stable = 0;
    private final int daysFromStartOfWeekToFirstOfMonth;
    private final long endUtcTimeMillis;
    private final int month;
    private final int numberOfDays;
    private final long startUtcTimeMillis;
    private final int year;

    public CalendarMonth(int i5, int i6, int i7, int i8, long j5) {
        this.year = i5;
        this.month = i6;
        this.numberOfDays = i7;
        this.daysFromStartOfWeekToFirstOfMonth = i8;
        this.startUtcTimeMillis = j5;
        this.endUtcTimeMillis = (j5 + (i7 * 86400000)) - 1;
    }

    public static /* synthetic */ CalendarMonth copy$default(CalendarMonth calendarMonth, int i5, int i6, int i7, int i8, long j5, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = calendarMonth.year;
        }
        if ((i9 & 2) != 0) {
            i6 = calendarMonth.month;
        }
        int i10 = i6;
        if ((i9 & 4) != 0) {
            i7 = calendarMonth.numberOfDays;
        }
        int i11 = i7;
        if ((i9 & 8) != 0) {
            i8 = calendarMonth.daysFromStartOfWeekToFirstOfMonth;
        }
        int i12 = i8;
        if ((i9 & 16) != 0) {
            j5 = calendarMonth.startUtcTimeMillis;
        }
        return calendarMonth.copy(i5, i10, i11, i12, j5);
    }

    public final int component1() {
        return this.year;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.numberOfDays;
    }

    public final int component4() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long component5() {
        return this.startUtcTimeMillis;
    }

    @p4.l
    public final CalendarMonth copy(int i5, int i6, int i7, int i8, long j5) {
        return new CalendarMonth(i5, i6, i7, i8, j5);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) obj;
        return this.year == calendarMonth.year && this.month == calendarMonth.month && this.numberOfDays == calendarMonth.numberOfDays && this.daysFromStartOfWeekToFirstOfMonth == calendarMonth.daysFromStartOfWeekToFirstOfMonth && this.startUtcTimeMillis == calendarMonth.startUtcTimeMillis;
    }

    @p4.l
    public final String format(@p4.l CalendarModel calendarModel, @p4.l String str) {
        return calendarModel.formatWithSkeleton(this, str, calendarModel.getLocale());
    }

    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long getEndUtcTimeMillis() {
        return this.endUtcTimeMillis;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    public final long getStartUtcTimeMillis() {
        return this.startUtcTimeMillis;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.year) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.numberOfDays)) * 31) + Integer.hashCode(this.daysFromStartOfWeekToFirstOfMonth)) * 31) + Long.hashCode(this.startUtcTimeMillis);
    }

    public final int indexIn(@p4.l kotlin.ranges.l lVar) {
        return (((this.year - lVar.e()) * 12) + this.month) - 1;
    }

    @p4.l
    public String toString() {
        return "CalendarMonth(year=" + this.year + ", month=" + this.month + ", numberOfDays=" + this.numberOfDays + ", daysFromStartOfWeekToFirstOfMonth=" + this.daysFromStartOfWeekToFirstOfMonth + ", startUtcTimeMillis=" + this.startUtcTimeMillis + ')';
    }
}
