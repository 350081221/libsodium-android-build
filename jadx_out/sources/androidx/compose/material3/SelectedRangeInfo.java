package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffsetKt;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo;", "", "Landroidx/compose/ui/unit/IntOffset;", "gridStartCoordinates", "J", "getGridStartCoordinates-nOcc-ac", "()J", "gridEndCoordinates", "getGridEndCoordinates-nOcc-ac", "", "firstIsSelectionStart", "Z", "getFirstIsSelectionStart", "()Z", "lastIsSelectionEnd", "getLastIsSelectionEnd", "<init>", "(JJZZLkotlin/jvm/internal/w;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectedRangeInfo {
    public static final int $stable = 0;

    @p4.l
    public static final Companion Companion = new Companion(null);
    private final boolean firstIsSelectionStart;
    private final long gridEndCoordinates;
    private final long gridStartCoordinates;
    private final boolean lastIsSelectionEnd;

    @kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo$Companion;", "", "()V", "calculateRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", "month", "Landroidx/compose/material3/CalendarMonth;", "startDate", "Landroidx/compose/material3/CalendarDate;", "endDate", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.m
        public final SelectedRangeInfo calculateRangeInfo(@p4.l CalendarMonth calendarMonth, @p4.l CalendarDate calendarDate, @p4.l CalendarDate calendarDate2) {
            boolean z4;
            boolean z5;
            int daysFromStartOfWeekToFirstOfMonth;
            int daysFromStartOfWeekToFirstOfMonth2;
            if (calendarDate.getUtcTimeMillis() <= calendarMonth.getEndUtcTimeMillis() && calendarDate2.getUtcTimeMillis() >= calendarMonth.getStartUtcTimeMillis()) {
                if (calendarDate.getUtcTimeMillis() >= calendarMonth.getStartUtcTimeMillis()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (calendarDate2.getUtcTimeMillis() <= calendarMonth.getEndUtcTimeMillis()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z4) {
                    daysFromStartOfWeekToFirstOfMonth = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarDate.getDayOfMonth()) - 1;
                } else {
                    daysFromStartOfWeekToFirstOfMonth = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
                }
                if (z5) {
                    daysFromStartOfWeekToFirstOfMonth2 = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarDate2.getDayOfMonth()) - 1;
                } else {
                    daysFromStartOfWeekToFirstOfMonth2 = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) - 1;
                }
                return new SelectedRangeInfo(IntOffsetKt.IntOffset(daysFromStartOfWeekToFirstOfMonth % 7, daysFromStartOfWeekToFirstOfMonth / 7), IntOffsetKt.IntOffset(daysFromStartOfWeekToFirstOfMonth2 % 7, daysFromStartOfWeekToFirstOfMonth2 / 7), z4, z5, null);
            }
            return null;
        }
    }

    private SelectedRangeInfo(long j5, long j6, boolean z4, boolean z5) {
        this.gridStartCoordinates = j5;
        this.gridEndCoordinates = j6;
        this.firstIsSelectionStart = z4;
        this.lastIsSelectionEnd = z5;
    }

    public /* synthetic */ SelectedRangeInfo(long j5, long j6, boolean z4, boolean z5, kotlin.jvm.internal.w wVar) {
        this(j5, j6, z4, z5);
    }

    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    /* renamed from: getGridEndCoordinates-nOcc-ac, reason: not valid java name */
    public final long m2167getGridEndCoordinatesnOccac() {
        return this.gridEndCoordinates;
    }

    /* renamed from: getGridStartCoordinates-nOcc-ac, reason: not valid java name */
    public final long m2168getGridStartCoordinatesnOccac() {
        return this.gridStartCoordinates;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }
}
