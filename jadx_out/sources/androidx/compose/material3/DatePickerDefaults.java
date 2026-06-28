package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.bytedance.pangle.ZeusPluginEventCallback;
import kotlin.jvm.internal.r1;

@ExperimentalMaterial3Api
@Stable
@kotlin.i0(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u008e\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J$\u0010'\u001a\u00020&2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"J$\u0010/\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.J6\u00104\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020*H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103J'\u0010=\u001a\u00020:2\u0006\u00106\u001a\u0002052\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010D\u001a\u00020C8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\"8\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\"8\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010P\u001a\u00020\"8\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010NR\u0018\u0010T\u001a\u00020\u0002*\u00020Q8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010X\u001a\u00020U8G¢\u0006\u0006\u001a\u0004\bV\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/material3/DatePickerDefaults;", "", "Landroidx/compose/material3/DatePickerColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContentColor", "dayInSelectionRangeContainerColor", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "dateTextFieldColors", "colors-bSRYm20", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/DatePickerColors;", "", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Landroidx/compose/material3/DisplayMode;", "displayMode", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/r2;", "DatePickerTitle-hOD91z4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DatePickerTitle", "", "selectedDateMillis", "DatePickerHeadline-3kbWawI", "(Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DatePickerHeadline", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/foundation/gestures/FlingBehavior;", "rememberSnapFlingBehavior$material3_release", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "rememberSnapFlingBehavior", "Lkotlin/ranges/l;", "YearRange", "Lkotlin/ranges/l;", "getYearRange", "()Lkotlin/ranges/l;", "Landroidx/compose/ui/unit/Dp;", "TonalElevation", "F", "getTonalElevation-D9Ej5fM", "()F", "Landroidx/compose/material3/SelectableDates;", "AllDates", "Landroidx/compose/material3/SelectableDates;", "getAllDates", "()Landroidx/compose/material3/SelectableDates;", "YearMonthSkeleton", "Ljava/lang/String;", "YearAbbrMonthDaySkeleton", "YearMonthWeekdayDaySkeleton", "Landroidx/compose/material3/ColorScheme;", "getDefaultDatePickerColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "defaultDatePickerColors", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,2268:1\n63#2:2269\n89#2:2270\n81#2:2271\n97#2:2272\n65#2:2273\n91#2:2274\n79#2:2275\n95#2:2276\n1116#3,6:2277\n1116#3,6:2284\n74#4:2283\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n*L\n625#1:2269\n630#1:2270\n663#1:2271\n664#1:2272\n669#1:2273\n670#1:2274\n675#1:2275\n676#1:2276\n682#1:2277,6\n703#1:2284,6\n702#1:2283\n*E\n"})
/* loaded from: classes.dex */
public final class DatePickerDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final String YearAbbrMonthDaySkeleton = "yMMMd";

    @p4.l
    public static final String YearMonthSkeleton = "yMMMM";

    @p4.l
    public static final String YearMonthWeekdayDaySkeleton = "yMMMMEEEEd";

    @p4.l
    public static final DatePickerDefaults INSTANCE = new DatePickerDefaults();

    @p4.l
    private static final kotlin.ranges.l YearRange = new kotlin.ranges.l(1900, ZeusPluginEventCallback.EVENT_FINISH_LOAD);
    private static final float TonalElevation = DatePickerModalTokens.INSTANCE.m2765getContainerElevationD9Ej5fM();

    @p4.l
    private static final SelectableDates AllDates = new SelectableDates() { // from class: androidx.compose.material3.DatePickerDefaults$AllDates$1
    };

    private DatePickerDefaults() {
    }

    public static /* synthetic */ DatePickerFormatter dateFormatter$default(DatePickerDefaults datePickerDefaults, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = YearMonthSkeleton;
        }
        if ((i5 & 2) != 0) {
            str2 = YearAbbrMonthDaySkeleton;
        }
        if ((i5 & 4) != 0) {
            str3 = YearMonthWeekdayDaySkeleton;
        }
        return datePickerDefaults.dateFormatter(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0095  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: DatePickerHeadline-3kbWawI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1801DatePickerHeadline3kbWawI(@p4.m java.lang.Long r36, int r37, @p4.l androidx.compose.material3.DatePickerFormatter r38, @p4.m androidx.compose.ui.Modifier r39, @p4.m androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.m1801DatePickerHeadline3kbWawI(java.lang.Long, int, androidx.compose.material3.DatePickerFormatter, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: DatePickerTitle-hOD91z4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1802DatePickerTitlehOD91z4(int r30, @p4.m androidx.compose.ui.Modifier r31, @p4.m androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.m1802DatePickerTitlehOD91z4(int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    @p4.l
    @Composable
    public final DatePickerColors colors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-275219611);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-275219611, i5, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:433)");
        }
        DatePickerColors defaultDatePickerColors = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultDatePickerColors;
    }

    @p4.l
    @Composable
    /* renamed from: colors-bSRYm20, reason: not valid java name */
    public final DatePickerColors m1803colorsbSRYm20(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, @p4.m TextFieldColors textFieldColors, @p4.m Composer composer, int i5, int i6, int i7, int i8) {
        composer.startReplaceableGroup(1991626358);
        long m3770getUnspecified0d7_KjU = (i8 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5;
        long m3770getUnspecified0d7_KjU2 = (i8 & 2) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j6;
        long m3770getUnspecified0d7_KjU3 = (i8 & 4) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j7;
        long m3770getUnspecified0d7_KjU4 = (i8 & 8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j8;
        long m3770getUnspecified0d7_KjU5 = (i8 & 16) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j9;
        long m3770getUnspecified0d7_KjU6 = (i8 & 32) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j10;
        long m3770getUnspecified0d7_KjU7 = (i8 & 64) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j11;
        long m3770getUnspecified0d7_KjU8 = (i8 & 128) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j12;
        long m3770getUnspecified0d7_KjU9 = (i8 & 256) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j13;
        long m3770getUnspecified0d7_KjU10 = (i8 & 512) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j14;
        long m3770getUnspecified0d7_KjU11 = (i8 & 1024) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j15;
        long m3770getUnspecified0d7_KjU12 = (i8 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j16;
        long m3770getUnspecified0d7_KjU13 = (i8 & 4096) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j17;
        long m3770getUnspecified0d7_KjU14 = (i8 & 8192) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j18;
        long m3770getUnspecified0d7_KjU15 = (i8 & 16384) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j19;
        long m3770getUnspecified0d7_KjU16 = (32768 & i8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j20;
        long m3770getUnspecified0d7_KjU17 = (65536 & i8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j21;
        long m3770getUnspecified0d7_KjU18 = (131072 & i8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j22;
        long m3770getUnspecified0d7_KjU19 = (262144 & i8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j23;
        long m3770getUnspecified0d7_KjU20 = (524288 & i8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j24;
        long m3770getUnspecified0d7_KjU21 = (1048576 & i8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j25;
        long m3770getUnspecified0d7_KjU22 = (2097152 & i8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j26;
        long m3770getUnspecified0d7_KjU23 = (4194304 & i8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j27;
        long m3770getUnspecified0d7_KjU24 = (8388608 & i8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j28;
        TextFieldColors textFieldColors2 = (i8 & 16777216) != 0 ? null : textFieldColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1991626358, i5, i6, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:502)");
        }
        DatePickerColors m1776copytNwlRmA = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i7 >> 12) & 112).m1776copytNwlRmA(m3770getUnspecified0d7_KjU, m3770getUnspecified0d7_KjU2, m3770getUnspecified0d7_KjU3, m3770getUnspecified0d7_KjU4, m3770getUnspecified0d7_KjU5, m3770getUnspecified0d7_KjU6, m3770getUnspecified0d7_KjU7, m3770getUnspecified0d7_KjU8, m3770getUnspecified0d7_KjU9, m3770getUnspecified0d7_KjU10, m3770getUnspecified0d7_KjU11, m3770getUnspecified0d7_KjU12, m3770getUnspecified0d7_KjU13, m3770getUnspecified0d7_KjU14, m3770getUnspecified0d7_KjU15, m3770getUnspecified0d7_KjU16, m3770getUnspecified0d7_KjU17, m3770getUnspecified0d7_KjU18, m3770getUnspecified0d7_KjU19, m3770getUnspecified0d7_KjU20, m3770getUnspecified0d7_KjU21, m3770getUnspecified0d7_KjU23, m3770getUnspecified0d7_KjU22, m3770getUnspecified0d7_KjU24, textFieldColors2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1776copytNwlRmA;
    }

    @p4.l
    public final DatePickerFormatter dateFormatter(@p4.l String str, @p4.l String str2, @p4.l String str3) {
        return new DatePickerFormatterImpl(str, str2, str3);
    }

    @p4.l
    public final SelectableDates getAllDates() {
        return AllDates;
    }

    @p4.l
    @u3.h(name = "getDefaultDatePickerColors")
    @Composable
    public final DatePickerColors getDefaultDatePickerColors(@p4.l ColorScheme colorScheme, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1180555308);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1180555308, i5, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:532)");
        }
        DatePickerColors defaultDatePickerColorsCached$material3_release = colorScheme.getDefaultDatePickerColorsCached$material3_release();
        if (defaultDatePickerColorsCached$material3_release == null) {
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            defaultDatePickerColorsCached$material3_release = new DatePickerColors(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getHeaderSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getHeaderHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getWeekdaysLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getRangeSelectionMonthSubheadColor()), colorScheme.m1696getOnSurfaceVariant0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearUnselectedLabelTextColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateTodayLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedLabelTextColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedContainerColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateUnselectedLabelTextColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateSelectedLabelTextColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateSelectedContainerColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateTodayLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateTodayContainerOutlineColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getRangeSelectionActiveIndicatorContainerColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionDateInRangeLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, DividerTokens.INSTANCE.getColor()), OutlinedTextFieldDefaults.INSTANCE.getDefaultOutlinedTextFieldColors(colorScheme, composer, (i5 & 14) | 48), null);
            colorScheme.setDefaultDatePickerColorsCached$material3_release(defaultDatePickerColorsCached$material3_release);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultDatePickerColorsCached$material3_release;
    }

    @p4.l
    @u3.h(name = "getShape")
    @Composable
    public final Shape getShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(700927667);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(700927667, i5, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:719)");
        }
        Shape value = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m1804getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    @p4.l
    public final kotlin.ranges.l getYearRange() {
        return YearRange;
    }

    @p4.l
    @Composable
    public final FlingBehavior rememberSnapFlingBehavior$material3_release(@p4.l LazyListState lazyListState, @p4.m DecayAnimationSpec<Float> decayAnimationSpec, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-2036003494);
        if ((i6 & 2) != 0) {
            decayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036003494, i5, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:700)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-1872611444);
        boolean changed = composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SnapFlingBehavior(lazyListState, decayAnimationSpec, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), density);
            composer.updateRememberedValue(rememberedValue);
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior;
    }
}
