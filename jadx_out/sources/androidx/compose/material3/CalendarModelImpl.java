package androidx.compose.material3;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.u0;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 /2\u00020\u0001:\u0001/B\u0013\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0004H\u0002J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0007H\u0002J\u0014\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J$\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0016R\u001a\u0010 \u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R,\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Landroidx/compose/material3/CalendarModelImpl;", "Landroidx/compose/material3/CalendarModel;", "Ljava/time/LocalDate;", "firstDayLocalDate", "Landroidx/compose/material3/CalendarMonth;", "getMonth", "toLocalDate", "Landroidx/compose/material3/CalendarDate;", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "Landroidx/compose/material3/DateInputFormat;", "getDateInputFormat", "", "timeInMillis", "getCanonicalDate", "date", "", "year", "month", "getDayOfWeek", TypedValues.TransitionType.S_FROM, "addedMonthsCount", "plusMonths", "subtractedMonthsCount", "minusMonths", "utcTimeMillis", "", "pattern", "formatWithPattern", "parse", "toString", "firstDayOfWeek", "I", "getFirstDayOfWeek", "()I", "", "Lkotlin/u0;", "weekdayNames", "Ljava/util/List;", "getWeekdayNames", "()Ljava/util/List;", "getToday", "()Landroidx/compose/material3/CalendarDate;", "today", "<init>", "(Ljava/util/Locale;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(26)
@r1({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,235:1\n11335#2:236\n11670#2,3:237\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl\n*L\n62#1:236\n62#1:237,3\n*E\n"})
/* loaded from: classes.dex */
public final class CalendarModelImpl extends CalendarModel {

    @p4.l
    private static final ZoneId utcTimeZoneId;
    private final int firstDayOfWeek;

    @p4.l
    private final List<u0<String, String>> weekdayNames;

    @p4.l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0010J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/CalendarModelImpl$Companion;", "", "()V", "utcTimeZoneId", "Ljava/time/ZoneId;", "getUtcTimeZoneId$material3_release", "()Ljava/time/ZoneId;", "formatWithPattern", "", "utcTimeMillis", "", "pattern", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "cache", "", "getCachedDateTimeFormatter", "Ljava/time/format/DateTimeFormatter;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,235:1\n361#2,7:236\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl$Companion\n*L\n197#1:236,7\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        private final DateTimeFormatter getCachedDateTimeFormatter(String str, Locale locale, Map<String, Object> map) {
            DateTimeFormatter ofPattern;
            DecimalStyle of;
            String str2 = "P:" + str + locale.toLanguageTag();
            Object obj = map.get(str2);
            if (obj == null) {
                ofPattern = DateTimeFormatter.ofPattern(str, locale);
                of = DecimalStyle.of(locale);
                obj = ofPattern.withDecimalStyle(of);
                map.put(str2, obj);
            }
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return (DateTimeFormatter) obj;
        }

        @p4.l
        public final String formatWithPattern(long j5, @p4.l String str, @p4.l Locale locale, @p4.l Map<String, Object> map) {
            Instant ofEpochMilli;
            ZonedDateTime atZone;
            LocalDate localDate;
            String format;
            DateTimeFormatter cachedDateTimeFormatter = getCachedDateTimeFormatter(str, locale, map);
            ofEpochMilli = Instant.ofEpochMilli(j5);
            atZone = ofEpochMilli.atZone(getUtcTimeZoneId$material3_release());
            localDate = atZone.toLocalDate();
            format = localDate.format(cachedDateTimeFormatter);
            return format;
        }

        @p4.l
        public final ZoneId getUtcTimeZoneId$material3_release() {
            return CalendarModelImpl.utcTimeZoneId;
        }
    }

    static {
        ZoneId of;
        of = ZoneId.of("UTC");
        utcTimeZoneId = of;
    }

    public CalendarModelImpl(@p4.l Locale locale) {
        super(locale);
        WeekFields of;
        DayOfWeek firstDayOfWeek;
        int value;
        DayOfWeek[] values;
        TextStyle textStyle;
        String displayName;
        TextStyle textStyle2;
        String displayName2;
        of = WeekFields.of(locale);
        firstDayOfWeek = of.getFirstDayOfWeek();
        value = firstDayOfWeek.getValue();
        this.firstDayOfWeek = value;
        values = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (DayOfWeek dayOfWeek : values) {
            textStyle = TextStyle.FULL;
            displayName = dayOfWeek.getDisplayName(textStyle, locale);
            textStyle2 = TextStyle.NARROW;
            displayName2 = dayOfWeek.getDisplayName(textStyle2, locale);
            arrayList.add(q1.a(displayName, displayName2));
        }
        this.weekdayNames = arrayList;
    }

    private final LocalDate toLocalDate(CalendarMonth calendarMonth) {
        Instant ofEpochMilli;
        ZonedDateTime atZone;
        LocalDate localDate;
        ofEpochMilli = Instant.ofEpochMilli(calendarMonth.getStartUtcTimeMillis());
        atZone = ofEpochMilli.atZone(utcTimeZoneId);
        localDate = atZone.toLocalDate();
        return localDate;
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public String formatWithPattern(long j5, @p4.l String str, @p4.l Locale locale) {
        return Companion.formatWithPattern(j5, str, locale, getFormatterCache$material3_release());
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarDate getCanonicalDate(long j5) {
        Instant ofEpochMilli;
        ZonedDateTime atZone;
        LocalDate localDate;
        int year;
        int monthValue;
        int dayOfMonth;
        LocalDateTime atStartOfDay;
        ZoneOffset zoneOffset;
        ofEpochMilli = Instant.ofEpochMilli(j5);
        atZone = ofEpochMilli.atZone(utcTimeZoneId);
        localDate = atZone.toLocalDate();
        year = localDate.getYear();
        monthValue = localDate.getMonthValue();
        dayOfMonth = localDate.getDayOfMonth();
        atStartOfDay = localDate.atStartOfDay();
        zoneOffset = ZoneOffset.UTC;
        return new CalendarDate(year, monthValue, dayOfMonth, atStartOfDay.toEpochSecond(zoneOffset) * 1000);
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public DateInputFormat getDateInputFormat(@p4.l Locale locale) {
        FormatStyle formatStyle;
        Chronology ofLocale;
        String localizedDateTimePattern;
        formatStyle = FormatStyle.SHORT;
        ofLocale = Chronology.ofLocale(locale);
        localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(formatStyle, null, ofLocale, locale);
        return CalendarModelKt.datePatternAsInputFormat(localizedDateTimePattern);
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getDayOfWeek(@p4.l CalendarDate calendarDate) {
        DayOfWeek dayOfWeek;
        int value;
        dayOfWeek = toLocalDate(calendarDate).getDayOfWeek();
        value = dayOfWeek.getValue();
        return value;
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarMonth getMonth(long j5) {
        Instant ofEpochMilli;
        ZonedDateTime atZone;
        ZonedDateTime withDayOfMonth;
        LocalDate localDate;
        ofEpochMilli = Instant.ofEpochMilli(j5);
        atZone = ofEpochMilli.atZone(utcTimeZoneId);
        withDayOfMonth = atZone.withDayOfMonth(1);
        localDate = withDayOfMonth.toLocalDate();
        return getMonth(localDate);
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarDate getToday() {
        LocalDate now;
        int year;
        int monthValue;
        int dayOfMonth;
        LocalTime localTime;
        LocalDateTime atTime;
        ZonedDateTime atZone;
        long epochMilli;
        now = LocalDate.now();
        year = now.getYear();
        monthValue = now.getMonthValue();
        dayOfMonth = now.getDayOfMonth();
        localTime = LocalTime.MIDNIGHT;
        atTime = now.atTime(localTime);
        atZone = atTime.atZone(utcTimeZoneId);
        epochMilli = atZone.toInstant().toEpochMilli();
        return new CalendarDate(year, monthValue, dayOfMonth, epochMilli);
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public List<u0<String, String>> getWeekdayNames() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarMonth minusMonths(@p4.l CalendarMonth calendarMonth, int i5) {
        LocalDate minusMonths;
        if (i5 <= 0) {
            return calendarMonth;
        }
        minusMonths = toLocalDate(calendarMonth).minusMonths(i5);
        return getMonth(minusMonths);
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.m
    public CalendarDate parse(@p4.l String str, @p4.l String str2) {
        DateTimeFormatter ofPattern;
        LocalDate parse;
        int year;
        Month month;
        int value;
        int dayOfMonth;
        LocalTime localTime;
        LocalDateTime atTime;
        ZonedDateTime atZone;
        long epochMilli;
        ofPattern = DateTimeFormatter.ofPattern(str2);
        try {
            parse = LocalDate.parse(str, ofPattern);
            year = parse.getYear();
            month = parse.getMonth();
            value = month.getValue();
            dayOfMonth = parse.getDayOfMonth();
            localTime = LocalTime.MIDNIGHT;
            atTime = parse.atTime(localTime);
            atZone = atTime.atZone(utcTimeZoneId);
            epochMilli = atZone.toInstant().toEpochMilli();
            return new CalendarDate(year, value, dayOfMonth, epochMilli);
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarMonth plusMonths(@p4.l CalendarMonth calendarMonth, int i5) {
        LocalDate plusMonths;
        if (i5 <= 0) {
            return calendarMonth;
        }
        plusMonths = toLocalDate(calendarMonth).plusMonths(i5);
        return getMonth(plusMonths);
    }

    @p4.l
    public String toString() {
        return "CalendarModel";
    }

    private final LocalDate toLocalDate(CalendarDate calendarDate) {
        LocalDate of;
        of = LocalDate.of(calendarDate.getYear(), calendarDate.getMonth(), calendarDate.getDayOfMonth());
        return of;
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarMonth getMonth(@p4.l CalendarDate calendarDate) {
        LocalDate of;
        of = LocalDate.of(calendarDate.getYear(), calendarDate.getMonth(), 1);
        return getMonth(of);
    }

    @Override // androidx.compose.material3.CalendarModel
    @p4.l
    public CalendarMonth getMonth(int i5, int i6) {
        LocalDate of;
        of = LocalDate.of(i5, i6, 1);
        return getMonth(of);
    }

    private final CalendarMonth getMonth(LocalDate localDate) {
        DayOfWeek dayOfWeek;
        int value;
        LocalTime localTime;
        LocalDateTime atTime;
        ZonedDateTime atZone;
        long epochMilli;
        int year;
        int monthValue;
        int lengthOfMonth;
        dayOfWeek = localDate.getDayOfWeek();
        value = dayOfWeek.getValue();
        int firstDayOfWeek = value - getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            firstDayOfWeek += 7;
        }
        int i5 = firstDayOfWeek;
        localTime = LocalTime.MIDNIGHT;
        atTime = localDate.atTime(localTime);
        atZone = atTime.atZone(utcTimeZoneId);
        epochMilli = atZone.toInstant().toEpochMilli();
        year = localDate.getYear();
        monthValue = localDate.getMonthValue();
        lengthOfMonth = localDate.lengthOfMonth();
        return new CalendarMonth(year, monthValue, lengthOfMonth, i5, epochMilli);
    }
}
