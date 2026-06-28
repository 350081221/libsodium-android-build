package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.r1;
import kotlin.u0;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B\u0013\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b1\u00102J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\f\u0010\t\u001a\u00020\u0005*\u00020\u0007H\u0002J\u0014\u0010\t\u001a\u00020\u0005*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0014\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J$\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016J\u001a\u0010\"\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016R\u001a\u0010$\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R,\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064"}, d2 = {"Landroidx/compose/material3/LegacyCalendarModelImpl;", "Landroidx/compose/material3/CalendarModel;", "", "day", "dayInISO8601", "Ljava/util/Calendar;", "firstDayCalendar", "Landroidx/compose/material3/CalendarMonth;", "getMonth", "toCalendar", "Landroidx/compose/material3/CalendarDate;", "Ljava/util/TimeZone;", "timeZone", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "Landroidx/compose/material3/DateInputFormat;", "getDateInputFormat", "", "timeInMillis", "getCanonicalDate", "date", "year", "month", "getDayOfWeek", TypedValues.TransitionType.S_FROM, "addedMonthsCount", "plusMonths", "subtractedMonthsCount", "minusMonths", "utcTimeMillis", "", "pattern", "formatWithPattern", "parse", "toString", "firstDayOfWeek", "I", "getFirstDayOfWeek", "()I", "", "Lkotlin/u0;", "weekdayNames", "Ljava/util/List;", "getWeekdayNames", "()Ljava/util/List;", "getToday", "()Landroidx/compose/material3/CalendarDate;", "today", "<init>", "(Ljava/util/Locale;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLegacyCalendarModelImpl.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/LegacyCalendarModelImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,244:1\n69#2,6:245\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/LegacyCalendarModelImpl\n*L\n60#1:245,6\n*E\n"})
/* loaded from: classes.dex */
public final class LegacyCalendarModelImpl extends CalendarModel {
    private final int firstDayOfWeek;

    @p4.l
    private final List<u0<String, String>> weekdayNames;

    @p4.l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @p4.l
    private static final TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");

    @kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0010J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/LegacyCalendarModelImpl$Companion;", "", "()V", "utcTimeZone", "Ljava/util/TimeZone;", "getUtcTimeZone$material3_release", "()Ljava/util/TimeZone;", "formatWithPattern", "", "utcTimeMillis", "", "pattern", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "cache", "", "getCachedSimpleDateFormat", "Ljava/text/SimpleDateFormat;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLegacyCalendarModelImpl.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/LegacyCalendarModelImpl$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,244:1\n361#2,7:245\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/LegacyCalendarModelImpl$Companion\n*L\n196#1:245,7\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        private final SimpleDateFormat getCachedSimpleDateFormat(String str, Locale locale, Map<String, Object> map) {
            String str2 = str + locale.toLanguageTag();
            Object obj = map.get(str2);
            Object obj2 = obj;
            if (obj == null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
                simpleDateFormat.setTimeZone(LegacyCalendarModelImpl.Companion.getUtcTimeZone$material3_release());
                map.put(str2, simpleDateFormat);
                obj2 = simpleDateFormat;
            }
            return (SimpleDateFormat) obj2;
        }

        @p4.l
        public final String formatWithPattern(long j5, @p4.l String str, @p4.l Locale locale, @p4.l Map<String, Object> map) {
            SimpleDateFormat cachedSimpleDateFormat = getCachedSimpleDateFormat(str, locale, map);
            Calendar calendar = Calendar.getInstance(getUtcTimeZone$material3_release());
            calendar.setTimeInMillis(j5);
            return cachedSimpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
        }

        @p4.l
        public final TimeZone getUtcTimeZone$material3_release() {
            return LegacyCalendarModelImpl.utcTimeZone;
        }
    }

    public LegacyCalendarModelImpl(@p4.l Locale locale) {
        super(locale);
        List i5;
        List l9;
        List<u0<String, String>> a5;
        this.firstDayOfWeek = dayInISO8601(Calendar.getInstance(locale).getFirstDayOfWeek());
        i5 = kotlin.collections.v.i();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        l9 = kotlin.collections.p.l9(weekdays, 2);
        int size = l9.size();
        for (int i6 = 0; i6 < size; i6++) {
            i5.add(new u0((String) l9.get(i6), shortWeekdays[i6 + 2]));
        }
        i5.add(new u0(weekdays[1], shortWeekdays[1]));
        a5 = kotlin.collections.v.a(i5);
        this.weekdayNames = a5;
    }

    private final int dayInISO8601(int i5) {
        int i6 = (i5 + 6) % 7;
        if (i6 == 0) {
            return 7;
        }
        return i6;
    }

    private final Calendar toCalendar(CalendarMonth calendarMonth) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(calendarMonth.getStartUtcTimeMillis());
        return calendar;
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public String formatWithPattern(long j5, @p4.l String str, @p4.l Locale locale) {
        return Companion.formatWithPattern(j5, str, locale, getFormatterCache$material3_release());
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarDate getCanonicalDate(long j5) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(j5);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public DateInputFormat getDateInputFormat(@p4.l Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        kotlin.jvm.internal.l0.n(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return CalendarModelKt.datePatternAsInputFormat(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getDayOfWeek(@p4.l CalendarDate calendarDate) {
        return dayInISO8601(toCalendar(calendarDate, TimeZone.getDefault()).get(7));
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarMonth getMonth(long j5) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(j5);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarDate getToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + calendar.get(15) + calendar.get(16));
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public List<u0<String, String>> getWeekdayNames() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarMonth minusMonths(@p4.l CalendarMonth calendarMonth, int i5) {
        if (i5 <= 0) {
            return calendarMonth;
        }
        Calendar calendar = toCalendar(calendarMonth);
        calendar.add(2, -i5);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.m
    public CalendarDate parse(@p4.l String str, @p4.l String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = utcTimeZone;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(parse);
            return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarMonth plusMonths(@p4.l CalendarMonth calendarMonth, int i5) {
        if (i5 <= 0) {
            return calendarMonth;
        }
        Calendar calendar = toCalendar(calendarMonth);
        calendar.add(2, i5);
        return getMonth(calendar);
    }

    @p4.l
    public String toString() {
        return "LegacyCalendarModel";
    }

    private final Calendar toCalendar(CalendarDate calendarDate, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();
        calendar.set(1, calendarDate.getYear());
        calendar.set(2, calendarDate.getMonth() - 1);
        calendar.set(5, calendarDate.getDayOfMonth());
        return calendar;
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarMonth getMonth(@p4.l CalendarDate calendarDate) {
        return getMonth(calendarDate.getYear(), calendarDate.getMonth());
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarMonth getMonth(int i5, int i6) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.clear();
        calendar.set(1, i5);
        calendar.set(2, i6 - 1);
        calendar.set(5, 1);
        return getMonth(calendar);
    }

    private final CalendarMonth getMonth(Calendar calendar) {
        int dayInISO8601 = dayInISO8601(calendar.get(7)) - getFirstDayOfWeek();
        if (dayInISO8601 < 0) {
            dayInISO8601 += 7;
        }
        return new CalendarMonth(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), dayInISO8601, calendar.getTimeInMillis());
    }
}
