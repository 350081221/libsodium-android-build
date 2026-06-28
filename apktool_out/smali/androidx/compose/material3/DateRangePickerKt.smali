.class public final Landroidx/compose/material3/DateRangePickerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001am\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0015\u0008\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0008\u00082\u0015\u0008\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0008\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001aT\u0010\u001d\u001a\u00020\u00002\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0019H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a`\u0010#\u001a\u00020\u00002\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0019H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"\u001a\u00bd\u0001\u00105\u001a\u00020\u00072\u0008\u0010$\u001a\u0004\u0018\u00010\u00112\u0008\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020\u00172:\u0010-\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\u000c\u0008)\u0012\u0008\u0008*\u0012\u0004\u0008\u0008(+\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\u000c\u0008)\u0012\u0008\u0008*\u0012\u0004\u0008\u0008(,\u0012\u0004\u0012\u00020\u00070(2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\u000c\u0008)\u0012\u0008\u0008*\u0012\u0004\u0008\u0008(/\u0012\u0004\u0012\u00020\u00070.2\u0006\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u00083\u00104\u001a\u00b2\u0001\u00106\u001a\u00020\u00072\u0008\u0010$\u001a\u0004\u0018\u00010\u00112\u0008\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u00112:\u0010-\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\u000c\u0008)\u0012\u0008\u0008*\u0012\u0004\u0008\u0008(+\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\u000c\u0008)\u0012\u0008\u0008*\u0012\u0004\u0008\u0008(,\u0012\u0004\u0012\u00020\u00070(2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\u000c\u0008)\u0012\u0008\u0008*\u0012\u0004\u0008\u0008(/\u0012\u0004\u0012\u00020\u00070.2\u0006\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u00086\u00107\u001a\u00b2\u0001\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u0002082\u0008\u0010$\u001a\u0004\u0018\u00010\u00112\u0008\u0010%\u001a\u0004\u0018\u00010\u00112:\u0010-\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\u000c\u0008)\u0012\u0008\u0008*\u0012\u0004\u0008\u0008(+\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\u000c\u0008)\u0012\u0008\u0008*\u0012\u0004\u0008\u0008(,\u0012\u0004\u0012\u00020\u00070(2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\u000c\u0008)\u0012\u0008\u0008*\u0012\u0004\u0008\u0008(/\u0012\u0004\u0012\u00020\u00070.2\u0006\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008:\u0010;\u001ag\u0010?\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00112\u0008\u0010=\u001a\u0004\u0018\u00010\u00112\u0008\u0010>\u001a\u0004\u0018\u00010\u00112:\u0010-\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\u000c\u0008)\u0012\u0008\u0008*\u0012\u0004\u0008\u0008(+\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\u000c\u0008)\u0012\u0008\u0008*\u0012\u0004\u0008\u0008(,\u0012\u0004\u0012\u00020\u00070(H\u0002\u00a2\u0006\u0004\u0008?\u0010@\u001a&\u0010H\u001a\u00020\u0007*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008F\u0010G\u001a.\u0010P\u001a\u0008\u0012\u0004\u0012\u00020O0N2\u0006\u0010\u0001\u001a\u0002082\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020KH\u0002\"\u001a\u0010R\u001a\u00020Q8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008R\u0010S\u001a\u0004\u0008T\u0010U\"\u0014\u0010V\u001a\u00020Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u0010S\"\u0014\u0010W\u001a\u00020Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010S\"\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010Z\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006["
    }
    d2 = {
        "Landroidx/compose/material3/DateRangePickerState;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/material3/DatePickerFormatter;",
        "dateFormatter",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "title",
        "headline",
        "",
        "showModeToggle",
        "Landroidx/compose/material3/DatePickerColors;",
        "colors",
        "DateRangePicker",
        "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lv3/p;Lv3/p;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V",
        "",
        "initialSelectedStartDateMillis",
        "initialSelectedEndDateMillis",
        "initialDisplayedMonthMillis",
        "Lkotlin/ranges/l;",
        "yearRange",
        "Landroidx/compose/material3/DisplayMode;",
        "initialDisplayMode",
        "Landroidx/compose/material3/SelectableDates;",
        "selectableDates",
        "rememberDateRangePickerState-IlFM19s",
        "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;",
        "rememberDateRangePickerState",
        "Ljava/util/Locale;",
        "Landroidx/compose/material3/CalendarLocale;",
        "locale",
        "DateRangePickerState-HVP43zI",
        "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DateRangePickerState;",
        "DateRangePickerState",
        "selectedStartDateMillis",
        "selectedEndDateMillis",
        "displayedMonthMillis",
        "displayMode",
        "Lkotlin/Function2;",
        "Lkotlin/v0;",
        "name",
        "startDateMillis",
        "endDateMillis",
        "onDatesSelectionChange",
        "Lkotlin/Function1;",
        "monthInMillis",
        "onDisplayedMonthChange",
        "Landroidx/compose/material3/CalendarModel;",
        "calendarModel",
        "SwitchableDateEntryContent-RN-2D1Q",
        "(Ljava/lang/Long;Ljava/lang/Long;JILv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V",
        "SwitchableDateEntryContent",
        "DateRangePickerContent",
        "(Ljava/lang/Long;Ljava/lang/Long;JLv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/foundation/lazy/LazyListState;",
        "lazyListState",
        "VerticalMonthsList",
        "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V",
        "dateInMillis",
        "currentStartDateMillis",
        "currentEndDateMillis",
        "updateDateSelection",
        "(JLjava/lang/Long;Ljava/lang/Long;Lv3/p;)V",
        "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;",
        "Landroidx/compose/material3/SelectedRangeInfo;",
        "selectedRangeInfo",
        "Landroidx/compose/ui/graphics/Color;",
        "color",
        "drawRangeBackground-mxwnekA",
        "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V",
        "drawRangeBackground",
        "Lkotlinx/coroutines/s0;",
        "coroutineScope",
        "",
        "scrollUpLabel",
        "scrollDownLabel",
        "",
        "Landroidx/compose/ui/semantics/CustomAccessibilityAction;",
        "customScrollActions",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "CalendarMonthSubheadPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "getCalendarMonthSubheadPadding",
        "()Landroidx/compose/foundation/layout/PaddingValues;",
        "DateRangePickerTitlePadding",
        "DateRangePickerHeadlinePadding",
        "Landroidx/compose/ui/unit/Dp;",
        "HeaderHeightOffset",
        "F",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1099:1\n1116#2,6:1100\n1116#2,6:1106\n1116#2,6:1113\n1116#2,6:1159\n1116#2,6:1165\n58#3:1112\n74#4,6:1119\n80#4:1153\n84#4:1158\n78#5,11:1125\n91#5:1157\n456#6,8:1136\n464#6,3:1150\n467#6,3:1154\n3737#7,6:1144\n154#8:1171\n154#8:1172\n154#8:1173\n154#8:1174\n154#8:1175\n154#8:1176\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n*L\n88#1:1100,6\n108#1:1106,6\n266#1:1113,6\n772#1:1159,6\n873#1:1165,6\n127#1:1112\n736#1:1119,6\n736#1:1153\n736#1:1158\n736#1:1125,11\n736#1:1157\n736#1:1136,8\n736#1:1150,3\n736#1:1154,3\n736#1:1144,6\n904#1:1171\n905#1:1172\n906#1:1173\n1091#1:1174\n1093#1:1175\n1098#1:1176\n*E\n"
    }
.end annotation


# static fields
.field private static final CalendarMonthSubheadPadding:Landroidx/compose/foundation/layout/PaddingValues;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final DateRangePickerHeadlinePadding:Landroidx/compose/foundation/layout/PaddingValues;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final DateRangePickerTitlePadding:Landroidx/compose/foundation/layout/PaddingValues;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final HeaderHeightOffset:F


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/16 v0, 0x14

    .line 9
    .line 10
    int-to-float v0, v0

    .line 11
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    int-to-float v0, v0

    .line 19
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/4 v5, 0x4

    .line 24
    const/4 v6, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Landroidx/compose/material3/DateRangePickerKt;->CalendarMonthSubheadPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 30
    .line 31
    const/16 v0, 0x40

    .line 32
    .line 33
    int-to-float v0, v0

    .line 34
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x0

    .line 39
    const/16 v3, 0xc

    .line 40
    .line 41
    int-to-float v7, v3

    .line 42
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/4 v4, 0x0

    .line 47
    const/16 v5, 0xa

    .line 48
    .line 49
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sput-object v1, Landroidx/compose/material3/DateRangePickerKt;->DateRangePickerTitlePadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 54
    .line 55
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    const/4 v9, 0x0

    .line 60
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    const/4 v12, 0x2

    .line 69
    const/4 v13, 0x0

    .line 70
    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sput-object v0, Landroidx/compose/material3/DateRangePickerKt;->DateRangePickerHeadlinePadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 75
    .line 76
    const/16 v0, 0x3c

    .line 77
    .line 78
    int-to-float v0, v0

    .line 79
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    sput v0, Landroidx/compose/material3/DateRangePickerKt;->HeaderHeightOffset:F

    .line 84
    .line 85
    return-void
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public static final DateRangePicker(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lv3/p;Lv3/p;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .param p0    # Landroidx/compose/material3/DateRangePickerState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material3/DatePickerFormatter;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/material3/DatePickerColors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/DateRangePickerState;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material3/DatePickerFormatter;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;Z",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move/from16 v8, p8

    .line 6
    .line 7
    const v2, 0x26cae3b6

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p7

    .line 11
    .line 12
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    and-int/lit8 v4, p9, 0x1

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    or-int/lit8 v4, v8, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v4, v8, 0x6

    .line 24
    .line 25
    if-nez v4, :cond_2

    .line 26
    .line 27
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v4, 0x2

    .line 36
    :goto_0
    or-int/2addr v4, v8

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v4, v8

    .line 39
    :goto_1
    and-int/lit8 v5, p9, 0x2

    .line 40
    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    or-int/lit8 v4, v4, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v6, v8, 0x30

    .line 47
    .line 48
    if-nez v6, :cond_5

    .line 49
    .line 50
    move-object/from16 v6, p1

    .line 51
    .line 52
    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_4

    .line 57
    .line 58
    const/16 v7, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const/16 v7, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v4, v7

    .line 64
    goto :goto_4

    .line 65
    :cond_5
    :goto_3
    move-object/from16 v6, p1

    .line 66
    .line 67
    :goto_4
    and-int/lit16 v7, v8, 0x180

    .line 68
    .line 69
    if-nez v7, :cond_8

    .line 70
    .line 71
    and-int/lit8 v7, p9, 0x4

    .line 72
    .line 73
    if-nez v7, :cond_7

    .line 74
    .line 75
    and-int/lit16 v7, v8, 0x200

    .line 76
    .line 77
    if-nez v7, :cond_6

    .line 78
    .line 79
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    goto :goto_5

    .line 84
    :cond_6
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    :goto_5
    if-eqz v7, :cond_7

    .line 89
    .line 90
    const/16 v7, 0x100

    .line 91
    .line 92
    goto :goto_6

    .line 93
    :cond_7
    const/16 v7, 0x80

    .line 94
    .line 95
    :goto_6
    or-int/2addr v4, v7

    .line 96
    :cond_8
    and-int/lit8 v7, p9, 0x8

    .line 97
    .line 98
    if-eqz v7, :cond_9

    .line 99
    .line 100
    or-int/lit16 v4, v4, 0xc00

    .line 101
    .line 102
    goto :goto_8

    .line 103
    :cond_9
    and-int/lit16 v9, v8, 0xc00

    .line 104
    .line 105
    if-nez v9, :cond_b

    .line 106
    .line 107
    move-object/from16 v9, p3

    .line 108
    .line 109
    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-eqz v10, :cond_a

    .line 114
    .line 115
    const/16 v10, 0x800

    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_a
    const/16 v10, 0x400

    .line 119
    .line 120
    :goto_7
    or-int/2addr v4, v10

    .line 121
    goto :goto_9

    .line 122
    :cond_b
    :goto_8
    move-object/from16 v9, p3

    .line 123
    .line 124
    :goto_9
    and-int/lit8 v10, p9, 0x10

    .line 125
    .line 126
    if-eqz v10, :cond_c

    .line 127
    .line 128
    or-int/lit16 v4, v4, 0x6000

    .line 129
    .line 130
    goto :goto_b

    .line 131
    :cond_c
    and-int/lit16 v11, v8, 0x6000

    .line 132
    .line 133
    if-nez v11, :cond_e

    .line 134
    .line 135
    move-object/from16 v11, p4

    .line 136
    .line 137
    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    if-eqz v12, :cond_d

    .line 142
    .line 143
    const/16 v12, 0x4000

    .line 144
    .line 145
    goto :goto_a

    .line 146
    :cond_d
    const/16 v12, 0x2000

    .line 147
    .line 148
    :goto_a
    or-int/2addr v4, v12

    .line 149
    goto :goto_c

    .line 150
    :cond_e
    :goto_b
    move-object/from16 v11, p4

    .line 151
    .line 152
    :goto_c
    and-int/lit8 v12, p9, 0x20

    .line 153
    .line 154
    const/high16 v13, 0x30000

    .line 155
    .line 156
    if-eqz v12, :cond_f

    .line 157
    .line 158
    or-int/2addr v4, v13

    .line 159
    goto :goto_e

    .line 160
    :cond_f
    and-int/2addr v13, v8

    .line 161
    if-nez v13, :cond_11

    .line 162
    .line 163
    move/from16 v13, p5

    .line 164
    .line 165
    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 166
    .line 167
    .line 168
    move-result v14

    .line 169
    if-eqz v14, :cond_10

    .line 170
    .line 171
    const/high16 v14, 0x20000

    .line 172
    .line 173
    goto :goto_d

    .line 174
    :cond_10
    const/high16 v14, 0x10000

    .line 175
    .line 176
    :goto_d
    or-int/2addr v4, v14

    .line 177
    goto :goto_f

    .line 178
    :cond_11
    :goto_e
    move/from16 v13, p5

    .line 179
    .line 180
    :goto_f
    const/high16 v14, 0x180000

    .line 181
    .line 182
    and-int/2addr v14, v8

    .line 183
    if-nez v14, :cond_14

    .line 184
    .line 185
    and-int/lit8 v14, p9, 0x40

    .line 186
    .line 187
    if-nez v14, :cond_12

    .line 188
    .line 189
    move-object/from16 v14, p6

    .line 190
    .line 191
    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v15

    .line 195
    if-eqz v15, :cond_13

    .line 196
    .line 197
    const/high16 v15, 0x100000

    .line 198
    .line 199
    goto :goto_10

    .line 200
    :cond_12
    move-object/from16 v14, p6

    .line 201
    .line 202
    :cond_13
    const/high16 v15, 0x80000

    .line 203
    .line 204
    :goto_10
    or-int/2addr v4, v15

    .line 205
    goto :goto_11

    .line 206
    :cond_14
    move-object/from16 v14, p6

    .line 207
    .line 208
    :goto_11
    const v15, 0x92493

    .line 209
    .line 210
    .line 211
    and-int/2addr v15, v4

    .line 212
    const v2, 0x92492

    .line 213
    .line 214
    .line 215
    if-ne v15, v2, :cond_16

    .line 216
    .line 217
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-nez v2, :cond_15

    .line 222
    .line 223
    goto :goto_12

    .line 224
    :cond_15
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 225
    .line 226
    .line 227
    move-object v4, v0

    .line 228
    move-object v2, v6

    .line 229
    move-object v5, v11

    .line 230
    move v6, v13

    .line 231
    move-object v7, v14

    .line 232
    goto/16 :goto_17

    .line 233
    .line 234
    :cond_16
    :goto_12
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 235
    .line 236
    .line 237
    and-int/lit8 v2, v8, 0x1

    .line 238
    .line 239
    const/4 v15, 0x1

    .line 240
    if-eqz v2, :cond_1a

    .line 241
    .line 242
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_17

    .line 247
    .line 248
    goto :goto_14

    .line 249
    :cond_17
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 250
    .line 251
    .line 252
    and-int/lit8 v2, p9, 0x4

    .line 253
    .line 254
    if-eqz v2, :cond_18

    .line 255
    .line 256
    and-int/lit16 v4, v4, -0x381

    .line 257
    .line 258
    :cond_18
    and-int/lit8 v2, p9, 0x40

    .line 259
    .line 260
    if-eqz v2, :cond_19

    .line 261
    .line 262
    const v2, -0x380001

    .line 263
    .line 264
    .line 265
    and-int/2addr v4, v2

    .line 266
    :cond_19
    move-object v2, v9

    .line 267
    move v5, v13

    .line 268
    move-object v7, v14

    .line 269
    :goto_13
    move v9, v4

    .line 270
    move-object v4, v11

    .line 271
    goto/16 :goto_15

    .line 272
    .line 273
    :cond_1a
    :goto_14
    if-eqz v5, :cond_1b

    .line 274
    .line 275
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 276
    .line 277
    move-object v6, v2

    .line 278
    :cond_1b
    and-int/lit8 v2, p9, 0x4

    .line 279
    .line 280
    if-eqz v2, :cond_1d

    .line 281
    .line 282
    const v0, -0x44dc9815

    .line 283
    .line 284
    .line 285
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 286
    .line 287
    .line 288
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 293
    .line 294
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    if-ne v0, v2, :cond_1c

    .line 299
    .line 300
    sget-object v18, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 301
    .line 302
    const/16 v19, 0x0

    .line 303
    .line 304
    const/16 v20, 0x0

    .line 305
    .line 306
    const/16 v21, 0x0

    .line 307
    .line 308
    const/16 v22, 0x7

    .line 309
    .line 310
    const/16 v23, 0x0

    .line 311
    .line 312
    invoke-static/range {v18 .. v23}, Landroidx/compose/material3/DatePickerDefaults;->dateFormatter$default(Landroidx/compose/material3/DatePickerDefaults;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/compose/material3/DatePickerFormatter;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    :cond_1c
    check-cast v0, Landroidx/compose/material3/DatePickerFormatter;

    .line 320
    .line 321
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 322
    .line 323
    .line 324
    and-int/lit16 v4, v4, -0x381

    .line 325
    .line 326
    :cond_1d
    if-eqz v7, :cond_1e

    .line 327
    .line 328
    new-instance v2, Landroidx/compose/material3/DateRangePickerKt$DateRangePicker$2;

    .line 329
    .line 330
    invoke-direct {v2, v1}, Landroidx/compose/material3/DateRangePickerKt$DateRangePicker$2;-><init>(Landroidx/compose/material3/DateRangePickerState;)V

    .line 331
    .line 332
    .line 333
    const v5, -0x9aa6fd6

    .line 334
    .line 335
    .line 336
    invoke-static {v3, v5, v15, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    move-object v9, v2

    .line 341
    :cond_1e
    if-eqz v10, :cond_1f

    .line 342
    .line 343
    new-instance v2, Landroidx/compose/material3/DateRangePickerKt$DateRangePicker$3;

    .line 344
    .line 345
    invoke-direct {v2, v1, v0}, Landroidx/compose/material3/DateRangePickerKt$DateRangePicker$3;-><init>(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;)V

    .line 346
    .line 347
    .line 348
    const v5, -0xb0b23ac

    .line 349
    .line 350
    .line 351
    invoke-static {v3, v5, v15, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    move-object v11, v2

    .line 356
    :cond_1f
    if-eqz v12, :cond_20

    .line 357
    .line 358
    move v13, v15

    .line 359
    :cond_20
    and-int/lit8 v2, p9, 0x40

    .line 360
    .line 361
    if-eqz v2, :cond_19

    .line 362
    .line 363
    sget-object v2, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 364
    .line 365
    const/4 v5, 0x6

    .line 366
    invoke-virtual {v2, v3, v5}, Landroidx/compose/material3/DatePickerDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    const v5, -0x380001

    .line 371
    .line 372
    .line 373
    and-int/2addr v4, v5

    .line 374
    move-object v7, v2

    .line 375
    move-object v2, v9

    .line 376
    move v5, v13

    .line 377
    goto :goto_13

    .line 378
    :goto_15
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 379
    .line 380
    .line 381
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    if-eqz v10, :cond_21

    .line 386
    .line 387
    const/4 v10, -0x1

    .line 388
    const-string v11, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)"

    .line 389
    .line 390
    const v12, 0x26cae3b6

    .line 391
    .line 392
    .line 393
    invoke-static {v12, v9, v10, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 394
    .line 395
    .line 396
    :cond_21
    const/4 v10, 0x0

    .line 397
    invoke-static {v3, v10}, Landroidx/compose/material3/ActualAndroid_androidKt;->defaultLocale(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;

    .line 398
    .line 399
    .line 400
    move-result-object v10

    .line 401
    const v11, -0x44dc94d3

    .line 402
    .line 403
    .line 404
    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 405
    .line 406
    .line 407
    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v11

    .line 411
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v12

    .line 415
    if-nez v11, :cond_22

    .line 416
    .line 417
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 418
    .line 419
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v11

    .line 423
    if-ne v12, v11, :cond_23

    .line 424
    .line 425
    :cond_22
    invoke-static {v10}, Landroidx/compose/material3/CalendarModel_androidKt;->createCalendarModel(Ljava/util/Locale;)Landroidx/compose/material3/CalendarModel;

    .line 426
    .line 427
    .line 428
    move-result-object v12

    .line 429
    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    :cond_23
    check-cast v12, Landroidx/compose/material3/CalendarModel;

    .line 433
    .line 434
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 435
    .line 436
    .line 437
    if-eqz v5, :cond_24

    .line 438
    .line 439
    new-instance v10, Landroidx/compose/material3/DateRangePickerKt$DateRangePicker$4;

    .line 440
    .line 441
    invoke-direct {v10, v1}, Landroidx/compose/material3/DateRangePickerKt$DateRangePicker$4;-><init>(Landroidx/compose/material3/DateRangePickerState;)V

    .line 442
    .line 443
    .line 444
    const v11, -0x58cfc21c

    .line 445
    .line 446
    .line 447
    invoke-static {v3, v11, v15, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 448
    .line 449
    .line 450
    move-result-object v10

    .line 451
    goto :goto_16

    .line 452
    :cond_24
    const/4 v10, 0x0

    .line 453
    :goto_16
    move-object v13, v10

    .line 454
    sget-object v10, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 455
    .line 456
    const/4 v11, 0x6

    .line 457
    invoke-virtual {v10, v3, v11}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    .line 458
    .line 459
    .line 460
    move-result-object v10

    .line 461
    sget-object v11, Landroidx/compose/material3/tokens/DatePickerModalTokens;->INSTANCE:Landroidx/compose/material3/tokens/DatePickerModalTokens;

    .line 462
    .line 463
    invoke-virtual {v11}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getRangeSelectionHeaderHeadlineFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 464
    .line 465
    .line 466
    move-result-object v14

    .line 467
    invoke-static {v10, v14}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    .line 468
    .line 469
    .line 470
    move-result-object v14

    .line 471
    invoke-virtual {v11}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getRangeSelectionHeaderContainerHeight-D9Ej5fM()F

    .line 472
    .line 473
    .line 474
    move-result v10

    .line 475
    sget v11, Landroidx/compose/material3/DateRangePickerKt;->HeaderHeightOffset:F

    .line 476
    .line 477
    sub-float/2addr v10, v11

    .line 478
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 479
    .line 480
    .line 481
    move-result v16

    .line 482
    new-instance v10, Landroidx/compose/material3/DateRangePickerKt$DateRangePicker$5;

    .line 483
    .line 484
    invoke-direct {v10, v1, v12, v0, v7}, Landroidx/compose/material3/DateRangePickerKt$DateRangePicker$5;-><init>(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/CalendarModel;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/DatePickerColors;)V

    .line 485
    .line 486
    .line 487
    const v11, -0x36de77b

    .line 488
    .line 489
    .line 490
    invoke-static {v3, v11, v15, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 491
    .line 492
    .line 493
    move-result-object v18

    .line 494
    shr-int/lit8 v10, v9, 0x3

    .line 495
    .line 496
    and-int/lit8 v10, v10, 0xe

    .line 497
    .line 498
    const/high16 v11, 0xd80000

    .line 499
    .line 500
    or-int/2addr v10, v11

    .line 501
    const/4 v11, 0x6

    .line 502
    shr-int/2addr v9, v11

    .line 503
    and-int/lit8 v11, v9, 0x70

    .line 504
    .line 505
    or-int/2addr v10, v11

    .line 506
    and-int/lit16 v11, v9, 0x380

    .line 507
    .line 508
    or-int/2addr v10, v11

    .line 509
    const v11, 0xe000

    .line 510
    .line 511
    .line 512
    and-int/2addr v9, v11

    .line 513
    or-int v19, v10, v9

    .line 514
    .line 515
    move-object v9, v6

    .line 516
    move-object v10, v2

    .line 517
    move-object v11, v4

    .line 518
    move-object v12, v13

    .line 519
    move-object v13, v7

    .line 520
    move/from16 v15, v16

    .line 521
    .line 522
    move-object/from16 v16, v18

    .line 523
    .line 524
    move-object/from16 v17, v3

    .line 525
    .line 526
    move/from16 v18, v19

    .line 527
    .line 528
    invoke-static/range {v9 .. v18}, Landroidx/compose/material3/DatePickerKt;->DateEntryContainer-au3_HiA(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 529
    .line 530
    .line 531
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 532
    .line 533
    .line 534
    move-result v9

    .line 535
    if-eqz v9, :cond_25

    .line 536
    .line 537
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 538
    .line 539
    .line 540
    :cond_25
    move-object v9, v2

    .line 541
    move-object v2, v6

    .line 542
    move v6, v5

    .line 543
    move-object v5, v4

    .line 544
    move-object v4, v0

    .line 545
    :goto_17
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 546
    .line 547
    .line 548
    move-result-object v10

    .line 549
    if-eqz v10, :cond_26

    .line 550
    .line 551
    new-instance v11, Landroidx/compose/material3/DateRangePickerKt$DateRangePicker$6;

    .line 552
    .line 553
    move-object v0, v11

    .line 554
    move-object/from16 v1, p0

    .line 555
    .line 556
    move-object v3, v4

    .line 557
    move-object v4, v9

    .line 558
    move/from16 v8, p8

    .line 559
    .line 560
    move/from16 v9, p9

    .line 561
    .line 562
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/DateRangePickerKt$DateRangePicker$6;-><init>(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lv3/p;Lv3/p;ZLandroidx/compose/material3/DatePickerColors;II)V

    .line 563
    .line 564
    .line 565
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 566
    .line 567
    .line 568
    :cond_26
    return-void
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
.end method

.method private static final DateRangePickerContent(Ljava/lang/Long;Ljava/lang/Long;JLv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "J",
            "Lv3/p<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/material3/CalendarModel;",
            "Lkotlin/ranges/l;",
            "Landroidx/compose/material3/DatePickerFormatter;",
            "Landroidx/compose/material3/SelectableDates;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-wide/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v2, p6

    .line 4
    .line 5
    move-object/from16 v1, p7

    .line 6
    .line 7
    move-object/from16 v0, p8

    .line 8
    .line 9
    move-object/from16 v15, p10

    .line 10
    .line 11
    move/from16 v14, p12

    .line 12
    .line 13
    const v5, -0x2ee9a3a9

    .line 14
    .line 15
    .line 16
    move-object/from16 v6, p11

    .line 17
    .line 18
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 19
    .line 20
    .line 21
    move-result-object v13

    .line 22
    and-int/lit8 v6, v14, 0x6

    .line 23
    .line 24
    move-object/from16 v12, p0

    .line 25
    .line 26
    if-nez v6, :cond_1

    .line 27
    .line 28
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    const/4 v6, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v6, 0x2

    .line 37
    :goto_0
    or-int/2addr v6, v14

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v6, v14

    .line 40
    :goto_1
    and-int/lit8 v8, v14, 0x30

    .line 41
    .line 42
    move-object/from16 v11, p1

    .line 43
    .line 44
    if-nez v8, :cond_3

    .line 45
    .line 46
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-eqz v8, :cond_2

    .line 51
    .line 52
    const/16 v8, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v8, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v6, v8

    .line 58
    :cond_3
    and-int/lit16 v8, v14, 0x180

    .line 59
    .line 60
    if-nez v8, :cond_5

    .line 61
    .line 62
    invoke-interface {v13, v3, v4}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-eqz v8, :cond_4

    .line 67
    .line 68
    const/16 v8, 0x100

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const/16 v8, 0x80

    .line 72
    .line 73
    :goto_3
    or-int/2addr v6, v8

    .line 74
    :cond_5
    and-int/lit16 v8, v14, 0xc00

    .line 75
    .line 76
    move-object/from16 v10, p4

    .line 77
    .line 78
    if-nez v8, :cond_7

    .line 79
    .line 80
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_6

    .line 85
    .line 86
    const/16 v8, 0x800

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    const/16 v8, 0x400

    .line 90
    .line 91
    :goto_4
    or-int/2addr v6, v8

    .line 92
    :cond_7
    and-int/lit16 v8, v14, 0x6000

    .line 93
    .line 94
    move-object/from16 v9, p5

    .line 95
    .line 96
    if-nez v8, :cond_9

    .line 97
    .line 98
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_8

    .line 103
    .line 104
    const/16 v8, 0x4000

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_8
    const/16 v8, 0x2000

    .line 108
    .line 109
    :goto_5
    or-int/2addr v6, v8

    .line 110
    :cond_9
    const/high16 v8, 0x30000

    .line 111
    .line 112
    and-int/2addr v8, v14

    .line 113
    if-nez v8, :cond_b

    .line 114
    .line 115
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_a

    .line 120
    .line 121
    const/high16 v8, 0x20000

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_a
    const/high16 v8, 0x10000

    .line 125
    .line 126
    :goto_6
    or-int/2addr v6, v8

    .line 127
    :cond_b
    const/high16 v8, 0x180000

    .line 128
    .line 129
    and-int/2addr v8, v14

    .line 130
    if-nez v8, :cond_d

    .line 131
    .line 132
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-eqz v8, :cond_c

    .line 137
    .line 138
    const/high16 v8, 0x100000

    .line 139
    .line 140
    goto :goto_7

    .line 141
    :cond_c
    const/high16 v8, 0x80000

    .line 142
    .line 143
    :goto_7
    or-int/2addr v6, v8

    .line 144
    :cond_d
    const/high16 v8, 0xc00000

    .line 145
    .line 146
    and-int/2addr v8, v14

    .line 147
    if-nez v8, :cond_10

    .line 148
    .line 149
    const/high16 v8, 0x1000000

    .line 150
    .line 151
    and-int/2addr v8, v14

    .line 152
    if-nez v8, :cond_e

    .line 153
    .line 154
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    goto :goto_8

    .line 159
    :cond_e
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    :goto_8
    if-eqz v8, :cond_f

    .line 164
    .line 165
    const/high16 v8, 0x800000

    .line 166
    .line 167
    goto :goto_9

    .line 168
    :cond_f
    const/high16 v8, 0x400000

    .line 169
    .line 170
    :goto_9
    or-int/2addr v6, v8

    .line 171
    :cond_10
    const/high16 v8, 0x6000000

    .line 172
    .line 173
    and-int/2addr v8, v14

    .line 174
    if-nez v8, :cond_12

    .line 175
    .line 176
    move-object/from16 v8, p9

    .line 177
    .line 178
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v16

    .line 182
    if-eqz v16, :cond_11

    .line 183
    .line 184
    const/high16 v16, 0x4000000

    .line 185
    .line 186
    goto :goto_a

    .line 187
    :cond_11
    const/high16 v16, 0x2000000

    .line 188
    .line 189
    :goto_a
    or-int v6, v6, v16

    .line 190
    .line 191
    goto :goto_b

    .line 192
    :cond_12
    move-object/from16 v8, p9

    .line 193
    .line 194
    :goto_b
    const/high16 v16, 0x30000000

    .line 195
    .line 196
    and-int v16, v14, v16

    .line 197
    .line 198
    if-nez v16, :cond_14

    .line 199
    .line 200
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v16

    .line 204
    if-eqz v16, :cond_13

    .line 205
    .line 206
    const/high16 v16, 0x20000000

    .line 207
    .line 208
    goto :goto_c

    .line 209
    :cond_13
    const/high16 v16, 0x10000000

    .line 210
    .line 211
    :goto_c
    or-int v6, v6, v16

    .line 212
    .line 213
    :cond_14
    const v16, 0x12492493

    .line 214
    .line 215
    .line 216
    and-int v7, v6, v16

    .line 217
    .line 218
    const v5, 0x12492492

    .line 219
    .line 220
    .line 221
    if-ne v7, v5, :cond_16

    .line 222
    .line 223
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-nez v5, :cond_15

    .line 228
    .line 229
    goto :goto_d

    .line 230
    :cond_15
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 231
    .line 232
    .line 233
    move-object v0, v13

    .line 234
    goto/16 :goto_f

    .line 235
    .line 236
    :cond_16
    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-eqz v5, :cond_17

    .line 241
    .line 242
    const/4 v5, -0x1

    .line 243
    const-string v7, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:731)"

    .line 244
    .line 245
    const v0, -0x2ee9a3a9

    .line 246
    .line 247
    .line 248
    invoke-static {v0, v6, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 249
    .line 250
    .line 251
    :cond_17
    invoke-virtual {v2, v3, v4}, Landroidx/compose/material3/CalendarModel;->getMonth(J)Landroidx/compose/material3/CalendarMonth;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0, v1}, Landroidx/compose/material3/CalendarMonth;->indexIn(Lkotlin/ranges/l;)I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    const/4 v5, 0x0

    .line 260
    const/4 v7, 0x2

    .line 261
    invoke-static {v0, v5, v13, v5, v7}, Landroidx/compose/foundation/lazy/LazyListStateKt;->rememberLazyListState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 266
    .line 267
    invoke-static {}, Landroidx/compose/material3/DatePickerKt;->getDatePickerHorizontalPadding()F

    .line 268
    .line 269
    .line 270
    move-result v7

    .line 271
    const/4 v1, 0x0

    .line 272
    const/4 v3, 0x0

    .line 273
    const/4 v4, 0x2

    .line 274
    invoke-static {v5, v7, v1, v4, v3}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    const v3, -0x1cd0f17e

    .line 279
    .line 280
    .line 281
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 282
    .line 283
    .line 284
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 285
    .line 286
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 291
    .line 292
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    const/4 v5, 0x0

    .line 297
    invoke-static {v3, v4, v13, v5}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    const v4, -0x4ee9b9da

    .line 302
    .line 303
    .line 304
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 305
    .line 306
    .line 307
    invoke-static {v13, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 316
    .line 317
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    instance-of v9, v9, Landroidx/compose/runtime/Applier;

    .line 330
    .line 331
    if-nez v9, :cond_18

    .line 332
    .line 333
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 334
    .line 335
    .line 336
    :cond_18
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 337
    .line 338
    .line 339
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 340
    .line 341
    .line 342
    move-result v9

    .line 343
    if-eqz v9, :cond_19

    .line 344
    .line 345
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 346
    .line 347
    .line 348
    goto :goto_e

    .line 349
    :cond_19
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 350
    .line 351
    .line 352
    :goto_e
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 357
    .line 358
    .line 359
    move-result-object v9

    .line 360
    invoke-static {v8, v3, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    invoke-static {v8, v5, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    if-nez v5, :cond_1a

    .line 379
    .line 380
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object v7

    .line 388
    invoke-static {v5, v7}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    if-nez v5, :cond_1b

    .line 393
    .line 394
    :cond_1a
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-interface {v8, v4, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 406
    .line 407
    .line 408
    :cond_1b
    invoke-static {v13}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    invoke-static {v3}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    const/4 v4, 0x0

    .line 417
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    invoke-interface {v1, v3, v13, v4}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    const v1, 0x7ab4aae9

    .line 425
    .line 426
    .line 427
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 428
    .line 429
    .line 430
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 431
    .line 432
    shr-int/lit8 v1, v6, 0x1b

    .line 433
    .line 434
    and-int/lit8 v1, v1, 0xe

    .line 435
    .line 436
    shr-int/lit8 v3, v6, 0xc

    .line 437
    .line 438
    and-int/lit8 v3, v3, 0x70

    .line 439
    .line 440
    or-int/2addr v1, v3

    .line 441
    invoke-static {v15, v2, v13, v1}, Landroidx/compose/material3/DatePickerKt;->WeekDays(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/CalendarModel;Landroidx/compose/runtime/Composer;I)V

    .line 442
    .line 443
    .line 444
    shl-int/lit8 v1, v6, 0x3

    .line 445
    .line 446
    and-int/lit8 v3, v1, 0x70

    .line 447
    .line 448
    and-int/lit16 v1, v1, 0x380

    .line 449
    .line 450
    or-int/2addr v1, v3

    .line 451
    and-int/lit16 v3, v6, 0x1c00

    .line 452
    .line 453
    or-int/2addr v1, v3

    .line 454
    const v3, 0xe000

    .line 455
    .line 456
    .line 457
    and-int/2addr v3, v6

    .line 458
    or-int/2addr v1, v3

    .line 459
    const/high16 v3, 0x70000

    .line 460
    .line 461
    and-int/2addr v3, v6

    .line 462
    or-int/2addr v1, v3

    .line 463
    const/high16 v3, 0x380000

    .line 464
    .line 465
    and-int/2addr v3, v6

    .line 466
    or-int/2addr v1, v3

    .line 467
    const/high16 v3, 0x1c00000

    .line 468
    .line 469
    and-int/2addr v3, v6

    .line 470
    or-int/2addr v1, v3

    .line 471
    const/high16 v3, 0xe000000

    .line 472
    .line 473
    and-int/2addr v3, v6

    .line 474
    or-int/2addr v1, v3

    .line 475
    const/high16 v3, 0x70000000

    .line 476
    .line 477
    and-int/2addr v3, v6

    .line 478
    or-int v16, v1, v3

    .line 479
    .line 480
    move-object v5, v0

    .line 481
    move-object/from16 v6, p0

    .line 482
    .line 483
    move-object/from16 v7, p1

    .line 484
    .line 485
    move-object/from16 v8, p4

    .line 486
    .line 487
    move-object/from16 v9, p5

    .line 488
    .line 489
    move-object/from16 v10, p6

    .line 490
    .line 491
    move-object/from16 v11, p7

    .line 492
    .line 493
    move-object/from16 v12, p8

    .line 494
    .line 495
    move-object v0, v13

    .line 496
    move-object/from16 v13, p9

    .line 497
    .line 498
    move-object/from16 v14, p10

    .line 499
    .line 500
    move-object v15, v0

    .line 501
    invoke-static/range {v5 .. v16}, Landroidx/compose/material3/DateRangePickerKt;->VerticalMonthsList(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 502
    .line 503
    .line 504
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 505
    .line 506
    .line 507
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 508
    .line 509
    .line 510
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 511
    .line 512
    .line 513
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 514
    .line 515
    .line 516
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    if-eqz v1, :cond_1c

    .line 521
    .line 522
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 523
    .line 524
    .line 525
    :cond_1c
    :goto_f
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 526
    .line 527
    .line 528
    move-result-object v13

    .line 529
    if-eqz v13, :cond_1d

    .line 530
    .line 531
    new-instance v14, Landroidx/compose/material3/DateRangePickerKt$DateRangePickerContent$2;

    .line 532
    .line 533
    move-object v0, v14

    .line 534
    move-object/from16 v1, p0

    .line 535
    .line 536
    move-object/from16 v2, p1

    .line 537
    .line 538
    move-wide/from16 v3, p2

    .line 539
    .line 540
    move-object/from16 v5, p4

    .line 541
    .line 542
    move-object/from16 v6, p5

    .line 543
    .line 544
    move-object/from16 v7, p6

    .line 545
    .line 546
    move-object/from16 v8, p7

    .line 547
    .line 548
    move-object/from16 v9, p8

    .line 549
    .line 550
    move-object/from16 v10, p9

    .line 551
    .line 552
    move-object/from16 v11, p10

    .line 553
    .line 554
    move/from16 v12, p12

    .line 555
    .line 556
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/DateRangePickerKt$DateRangePickerContent$2;-><init>(Ljava/lang/Long;Ljava/lang/Long;JLv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;I)V

    .line 557
    .line 558
    .line 559
    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 560
    .line 561
    .line 562
    :cond_1d
    return-void
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
.end method

.method public static final DateRangePickerState-HVP43zI(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DateRangePickerState;
    .locals 10
    .param p0    # Ljava/util/Locale;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Long;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Long;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Lkotlin/ranges/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/material3/SelectableDates;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v9, Landroidx/compose/material3/DateRangePickerStateImpl;

    const/4 v8, 0x0

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object/from16 v6, p6

    move-object v7, p0

    invoke-direct/range {v0 .. v8}, Landroidx/compose/material3/DateRangePickerStateImpl;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;Lkotlin/jvm/internal/w;)V

    return-object v9
.end method

.method public static synthetic DateRangePickerState-HVP43zI$default(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;ILjava/lang/Object;)Landroidx/compose/material3/DateRangePickerState;
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p8, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x4

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p8, p7, 0x8

    .line 13
    .line 14
    if-eqz p8, :cond_2

    .line 15
    .line 16
    move-object p3, p1

    .line 17
    :cond_2
    and-int/lit8 p8, p7, 0x10

    .line 18
    .line 19
    if-eqz p8, :cond_3

    .line 20
    .line 21
    sget-object p4, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 22
    .line 23
    invoke-virtual {p4}, Landroidx/compose/material3/DatePickerDefaults;->getYearRange()Lkotlin/ranges/l;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    :cond_3
    and-int/lit8 p8, p7, 0x20

    .line 28
    .line 29
    if-eqz p8, :cond_4

    .line 30
    .line 31
    sget-object p5, Landroidx/compose/material3/DisplayMode;->Companion:Landroidx/compose/material3/DisplayMode$Companion;

    .line 32
    .line 33
    invoke-virtual {p5}, Landroidx/compose/material3/DisplayMode$Companion;->getPicker-jFl-4v0()I

    .line 34
    .line 35
    .line 36
    move-result p5

    .line 37
    :cond_4
    and-int/lit8 p7, p7, 0x40

    .line 38
    .line 39
    if-eqz p7, :cond_5

    .line 40
    .line 41
    sget-object p6, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 42
    .line 43
    invoke-virtual {p6}, Landroidx/compose/material3/DatePickerDefaults;->getAllDates()Landroidx/compose/material3/SelectableDates;

    .line 44
    .line 45
    .line 46
    move-result-object p6

    .line 47
    :cond_5
    invoke-static/range {p0 .. p6}, Landroidx/compose/material3/DateRangePickerKt;->DateRangePickerState-HVP43zI(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DateRangePickerState;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
.end method

.method private static final SwitchableDateEntryContent-RN-2D1Q(Ljava/lang/Long;Ljava/lang/Long;JILv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "JI",
            "Lv3/p<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/material3/CalendarModel;",
            "Lkotlin/ranges/l;",
            "Landroidx/compose/material3/DatePickerFormatter;",
            "Landroidx/compose/material3/SelectableDates;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v12, p9

    .line 2
    .line 3
    move/from16 v13, p13

    .line 4
    .line 5
    const v0, -0x1fc1b857

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p12

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v14

    .line 14
    and-int/lit8 v1, v13, 0x6

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    move-object/from16 v15, p0

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    move v1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v1, 0x2

    .line 30
    :goto_0
    or-int/2addr v1, v13

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v1, v13

    .line 33
    :goto_1
    and-int/lit8 v4, v13, 0x30

    .line 34
    .line 35
    move-object/from16 v11, p1

    .line 36
    .line 37
    if-nez v4, :cond_3

    .line 38
    .line 39
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    const/16 v4, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v4, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v1, v4

    .line 51
    :cond_3
    and-int/lit16 v4, v13, 0x180

    .line 52
    .line 53
    move-wide/from16 v9, p2

    .line 54
    .line 55
    if-nez v4, :cond_5

    .line 56
    .line 57
    invoke-interface {v14, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_4

    .line 62
    .line 63
    const/16 v4, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v4, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v1, v4

    .line 69
    :cond_5
    and-int/lit16 v4, v13, 0xc00

    .line 70
    .line 71
    move/from16 v8, p4

    .line 72
    .line 73
    if-nez v4, :cond_7

    .line 74
    .line 75
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_6

    .line 80
    .line 81
    const/16 v4, 0x800

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    const/16 v4, 0x400

    .line 85
    .line 86
    :goto_4
    or-int/2addr v1, v4

    .line 87
    :cond_7
    and-int/lit16 v4, v13, 0x6000

    .line 88
    .line 89
    move-object/from16 v7, p5

    .line 90
    .line 91
    if-nez v4, :cond_9

    .line 92
    .line 93
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_8

    .line 98
    .line 99
    const/16 v4, 0x4000

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_8
    const/16 v4, 0x2000

    .line 103
    .line 104
    :goto_5
    or-int/2addr v1, v4

    .line 105
    :cond_9
    const/high16 v4, 0x30000

    .line 106
    .line 107
    and-int/2addr v4, v13

    .line 108
    move-object/from16 v6, p6

    .line 109
    .line 110
    if-nez v4, :cond_b

    .line 111
    .line 112
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_a

    .line 117
    .line 118
    const/high16 v4, 0x20000

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_a
    const/high16 v4, 0x10000

    .line 122
    .line 123
    :goto_6
    or-int/2addr v1, v4

    .line 124
    :cond_b
    const/high16 v4, 0x180000

    .line 125
    .line 126
    and-int/2addr v4, v13

    .line 127
    move-object/from16 v5, p7

    .line 128
    .line 129
    if-nez v4, :cond_d

    .line 130
    .line 131
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_c

    .line 136
    .line 137
    const/high16 v4, 0x100000

    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_c
    const/high16 v4, 0x80000

    .line 141
    .line 142
    :goto_7
    or-int/2addr v1, v4

    .line 143
    :cond_d
    const/high16 v4, 0xc00000

    .line 144
    .line 145
    and-int/2addr v4, v13

    .line 146
    if-nez v4, :cond_f

    .line 147
    .line 148
    move-object/from16 v4, p8

    .line 149
    .line 150
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v16

    .line 154
    if-eqz v16, :cond_e

    .line 155
    .line 156
    const/high16 v16, 0x800000

    .line 157
    .line 158
    goto :goto_8

    .line 159
    :cond_e
    const/high16 v16, 0x400000

    .line 160
    .line 161
    :goto_8
    or-int v1, v1, v16

    .line 162
    .line 163
    goto :goto_9

    .line 164
    :cond_f
    move-object/from16 v4, p8

    .line 165
    .line 166
    :goto_9
    const/high16 v16, 0x6000000

    .line 167
    .line 168
    and-int v16, v13, v16

    .line 169
    .line 170
    if-nez v16, :cond_12

    .line 171
    .line 172
    const/high16 v16, 0x8000000

    .line 173
    .line 174
    and-int v16, v13, v16

    .line 175
    .line 176
    if-nez v16, :cond_10

    .line 177
    .line 178
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v16

    .line 182
    goto :goto_a

    .line 183
    :cond_10
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v16

    .line 187
    :goto_a
    if-eqz v16, :cond_11

    .line 188
    .line 189
    const/high16 v16, 0x4000000

    .line 190
    .line 191
    goto :goto_b

    .line 192
    :cond_11
    const/high16 v16, 0x2000000

    .line 193
    .line 194
    :goto_b
    or-int v1, v1, v16

    .line 195
    .line 196
    :cond_12
    const/high16 v16, 0x30000000

    .line 197
    .line 198
    and-int v16, v13, v16

    .line 199
    .line 200
    move-object/from16 v0, p10

    .line 201
    .line 202
    if-nez v16, :cond_14

    .line 203
    .line 204
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v17

    .line 208
    if-eqz v17, :cond_13

    .line 209
    .line 210
    const/high16 v17, 0x20000000

    .line 211
    .line 212
    goto :goto_c

    .line 213
    :cond_13
    const/high16 v17, 0x10000000

    .line 214
    .line 215
    :goto_c
    or-int v1, v1, v17

    .line 216
    .line 217
    :cond_14
    and-int/lit8 v17, p14, 0x6

    .line 218
    .line 219
    move-object/from16 v3, p11

    .line 220
    .line 221
    if-nez v17, :cond_16

    .line 222
    .line 223
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v17

    .line 227
    if-eqz v17, :cond_15

    .line 228
    .line 229
    goto :goto_d

    .line 230
    :cond_15
    const/4 v2, 0x2

    .line 231
    :goto_d
    or-int v2, p14, v2

    .line 232
    .line 233
    goto :goto_e

    .line 234
    :cond_16
    move/from16 v2, p14

    .line 235
    .line 236
    :goto_e
    const v17, 0x12492493

    .line 237
    .line 238
    .line 239
    and-int v0, v1, v17

    .line 240
    .line 241
    const v3, 0x12492492

    .line 242
    .line 243
    .line 244
    if-ne v0, v3, :cond_18

    .line 245
    .line 246
    and-int/lit8 v0, v2, 0x3

    .line 247
    .line 248
    const/4 v3, 0x2

    .line 249
    if-ne v0, v3, :cond_18

    .line 250
    .line 251
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-nez v0, :cond_17

    .line 256
    .line 257
    goto :goto_f

    .line 258
    :cond_17
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_10

    .line 262
    .line 263
    :cond_18
    :goto_f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_19

    .line 268
    .line 269
    const-string v0, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:680)"

    .line 270
    .line 271
    const v3, -0x1fc1b857

    .line 272
    .line 273
    .line 274
    invoke-static {v3, v1, v2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 275
    .line 276
    .line 277
    :cond_19
    const/4 v0, 0x7

    .line 278
    const/4 v2, 0x0

    .line 279
    const/4 v3, 0x0

    .line 280
    invoke-static {v2, v2, v3, v0, v3}, Landroidx/compose/animation/core/AnimationSpecKt;->spring$default(FFLjava/lang/Object;ILjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;

    .line 281
    .line 282
    .line 283
    move-result-object v16

    .line 284
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 285
    .line 286
    const/4 v2, 0x0

    .line 287
    move/from16 p12, v1

    .line 288
    .line 289
    sget-object v1, Landroidx/compose/material3/DateRangePickerKt$SwitchableDateEntryContent$1;->INSTANCE:Landroidx/compose/material3/DateRangePickerKt$SwitchableDateEntryContent$1;

    .line 290
    .line 291
    const/4 v12, 0x1

    .line 292
    invoke-static {v0, v2, v1, v12, v3}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 293
    .line 294
    .line 295
    move-result-object v17

    .line 296
    invoke-static/range {p4 .. p4}, Landroidx/compose/material3/DisplayMode;->box-impl(I)Landroidx/compose/material3/DisplayMode;

    .line 297
    .line 298
    .line 299
    move-result-object v18

    .line 300
    const/16 v19, 0x0

    .line 301
    .line 302
    new-instance v3, Landroidx/compose/material3/DateRangePickerKt$SwitchableDateEntryContent$2;

    .line 303
    .line 304
    move-object v0, v3

    .line 305
    move/from16 v20, p12

    .line 306
    .line 307
    move-object/from16 v1, p0

    .line 308
    .line 309
    move-object/from16 v2, p1

    .line 310
    .line 311
    move-object v13, v3

    .line 312
    move-wide/from16 v3, p2

    .line 313
    .line 314
    move-object/from16 v5, p5

    .line 315
    .line 316
    move-object/from16 v6, p6

    .line 317
    .line 318
    move-object/from16 v7, p7

    .line 319
    .line 320
    move-object/from16 v8, p8

    .line 321
    .line 322
    move-object/from16 v9, p9

    .line 323
    .line 324
    move-object/from16 v10, p10

    .line 325
    .line 326
    move-object/from16 v11, p11

    .line 327
    .line 328
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/DateRangePickerKt$SwitchableDateEntryContent$2;-><init>(Ljava/lang/Long;Ljava/lang/Long;JLv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;)V

    .line 329
    .line 330
    .line 331
    const v0, -0x3d3152bb

    .line 332
    .line 333
    .line 334
    invoke-static {v14, v0, v12, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    shr-int/lit8 v0, v20, 0x9

    .line 339
    .line 340
    and-int/lit8 v0, v0, 0xe

    .line 341
    .line 342
    or-int/lit16 v7, v0, 0x6180

    .line 343
    .line 344
    const/16 v8, 0x8

    .line 345
    .line 346
    move-object/from16 v1, v18

    .line 347
    .line 348
    move-object/from16 v2, v17

    .line 349
    .line 350
    move-object/from16 v3, v16

    .line 351
    .line 352
    move-object/from16 v4, v19

    .line 353
    .line 354
    move-object v6, v14

    .line 355
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/CrossfadeKt;->Crossfade(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 356
    .line 357
    .line 358
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-eqz v0, :cond_1a

    .line 363
    .line 364
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 365
    .line 366
    .line 367
    :cond_1a
    :goto_10
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 368
    .line 369
    .line 370
    move-result-object v14

    .line 371
    if-eqz v14, :cond_1b

    .line 372
    .line 373
    new-instance v13, Landroidx/compose/material3/DateRangePickerKt$SwitchableDateEntryContent$3;

    .line 374
    .line 375
    move-object v0, v13

    .line 376
    move-object/from16 v1, p0

    .line 377
    .line 378
    move-object/from16 v2, p1

    .line 379
    .line 380
    move-wide/from16 v3, p2

    .line 381
    .line 382
    move/from16 v5, p4

    .line 383
    .line 384
    move-object/from16 v6, p5

    .line 385
    .line 386
    move-object/from16 v7, p6

    .line 387
    .line 388
    move-object/from16 v8, p7

    .line 389
    .line 390
    move-object/from16 v9, p8

    .line 391
    .line 392
    move-object/from16 v10, p9

    .line 393
    .line 394
    move-object/from16 v11, p10

    .line 395
    .line 396
    move-object/from16 v12, p11

    .line 397
    .line 398
    move-object v15, v13

    .line 399
    move/from16 v13, p13

    .line 400
    .line 401
    move-object/from16 v21, v14

    .line 402
    .line 403
    move/from16 v14, p14

    .line 404
    .line 405
    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/DateRangePickerKt$SwitchableDateEntryContent$3;-><init>(Ljava/lang/Long;Ljava/lang/Long;JILv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;II)V

    .line 406
    .line 407
    .line 408
    move-object/from16 v0, v21

    .line 409
    .line 410
    invoke-interface {v0, v15}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 411
    .line 412
    .line 413
    :cond_1b
    return-void
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
.end method

.method private static final VerticalMonthsList(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Lv3/p<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/material3/CalendarModel;",
            "Lkotlin/ranges/l;",
            "Landroidx/compose/material3/DatePickerFormatter;",
            "Landroidx/compose/material3/SelectableDates;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v12, p0

    .line 2
    .line 3
    move-object/from16 v13, p5

    .line 4
    .line 5
    move-object/from16 v14, p6

    .line 6
    .line 7
    move-object/from16 v15, p7

    .line 8
    .line 9
    move/from16 v11, p11

    .line 10
    .line 11
    const v0, 0x4af1de09    # 7925508.5f

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p10

    .line 15
    .line 16
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v10

    .line 20
    and-int/lit8 v1, v11, 0x6

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v1, 0x2

    .line 33
    :goto_0
    or-int/2addr v1, v11

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v1, v11

    .line 36
    :goto_1
    and-int/lit8 v2, v11, 0x30

    .line 37
    .line 38
    move-object/from16 v8, p1

    .line 39
    .line 40
    if-nez v2, :cond_3

    .line 41
    .line 42
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    const/16 v2, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v2, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v1, v2

    .line 54
    :cond_3
    and-int/lit16 v2, v11, 0x180

    .line 55
    .line 56
    move-object/from16 v7, p2

    .line 57
    .line 58
    if-nez v2, :cond_5

    .line 59
    .line 60
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    const/16 v2, 0x100

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/16 v2, 0x80

    .line 70
    .line 71
    :goto_3
    or-int/2addr v1, v2

    .line 72
    :cond_5
    and-int/lit16 v2, v11, 0xc00

    .line 73
    .line 74
    move-object/from16 v6, p3

    .line 75
    .line 76
    if-nez v2, :cond_7

    .line 77
    .line 78
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_6

    .line 83
    .line 84
    const/16 v2, 0x800

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_6
    const/16 v2, 0x400

    .line 88
    .line 89
    :goto_4
    or-int/2addr v1, v2

    .line 90
    :cond_7
    and-int/lit16 v2, v11, 0x6000

    .line 91
    .line 92
    move-object/from16 v4, p4

    .line 93
    .line 94
    if-nez v2, :cond_9

    .line 95
    .line 96
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_8

    .line 101
    .line 102
    const/16 v2, 0x4000

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_8
    const/16 v2, 0x2000

    .line 106
    .line 107
    :goto_5
    or-int/2addr v1, v2

    .line 108
    :cond_9
    const/high16 v2, 0x30000

    .line 109
    .line 110
    and-int/2addr v2, v11

    .line 111
    if-nez v2, :cond_b

    .line 112
    .line 113
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_a

    .line 118
    .line 119
    const/high16 v2, 0x20000

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_a
    const/high16 v2, 0x10000

    .line 123
    .line 124
    :goto_6
    or-int/2addr v1, v2

    .line 125
    :cond_b
    const/high16 v2, 0x180000

    .line 126
    .line 127
    and-int/2addr v2, v11

    .line 128
    if-nez v2, :cond_d

    .line 129
    .line 130
    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_c

    .line 135
    .line 136
    const/high16 v2, 0x100000

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_c
    const/high16 v2, 0x80000

    .line 140
    .line 141
    :goto_7
    or-int/2addr v1, v2

    .line 142
    :cond_d
    const/high16 v2, 0xc00000

    .line 143
    .line 144
    and-int/2addr v2, v11

    .line 145
    if-nez v2, :cond_10

    .line 146
    .line 147
    const/high16 v2, 0x1000000

    .line 148
    .line 149
    and-int/2addr v2, v11

    .line 150
    if-nez v2, :cond_e

    .line 151
    .line 152
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    goto :goto_8

    .line 157
    :cond_e
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    :goto_8
    if-eqz v2, :cond_f

    .line 162
    .line 163
    const/high16 v2, 0x800000

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_f
    const/high16 v2, 0x400000

    .line 167
    .line 168
    :goto_9
    or-int/2addr v1, v2

    .line 169
    :cond_10
    const/high16 v2, 0x6000000

    .line 170
    .line 171
    and-int/2addr v2, v11

    .line 172
    move-object/from16 v3, p8

    .line 173
    .line 174
    if-nez v2, :cond_12

    .line 175
    .line 176
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_11

    .line 181
    .line 182
    const/high16 v2, 0x4000000

    .line 183
    .line 184
    goto :goto_a

    .line 185
    :cond_11
    const/high16 v2, 0x2000000

    .line 186
    .line 187
    :goto_a
    or-int/2addr v1, v2

    .line 188
    :cond_12
    const/high16 v2, 0x30000000

    .line 189
    .line 190
    and-int/2addr v2, v11

    .line 191
    if-nez v2, :cond_14

    .line 192
    .line 193
    move-object/from16 v2, p9

    .line 194
    .line 195
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v16

    .line 199
    if-eqz v16, :cond_13

    .line 200
    .line 201
    const/high16 v16, 0x20000000

    .line 202
    .line 203
    goto :goto_b

    .line 204
    :cond_13
    const/high16 v16, 0x10000000

    .line 205
    .line 206
    :goto_b
    or-int v1, v1, v16

    .line 207
    .line 208
    goto :goto_c

    .line 209
    :cond_14
    move-object/from16 v2, p9

    .line 210
    .line 211
    :goto_c
    const v16, 0x12492493

    .line 212
    .line 213
    .line 214
    and-int v5, v1, v16

    .line 215
    .line 216
    const v9, 0x12492492

    .line 217
    .line 218
    .line 219
    if-ne v5, v9, :cond_16

    .line 220
    .line 221
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-nez v5, :cond_15

    .line 226
    .line 227
    goto :goto_d

    .line 228
    :cond_15
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 229
    .line 230
    .line 231
    move-object v8, v10

    .line 232
    move-object v2, v12

    .line 233
    move-object v7, v14

    .line 234
    goto/16 :goto_f

    .line 235
    .line 236
    :cond_16
    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-eqz v5, :cond_17

    .line 241
    .line 242
    const/4 v5, -0x1

    .line 243
    const-string v9, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:769)"

    .line 244
    .line 245
    invoke-static {v0, v1, v5, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :cond_17
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/material3/CalendarModel;->getToday()Landroidx/compose/material3/CalendarDate;

    .line 249
    .line 250
    .line 251
    move-result-object v17

    .line 252
    const v0, 0x56b9411b

    .line 253
    .line 254
    .line 255
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    const/4 v9, 0x1

    .line 267
    if-nez v0, :cond_18

    .line 268
    .line 269
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 270
    .line 271
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    if-ne v5, v0, :cond_19

    .line 276
    .line 277
    :cond_18
    invoke-virtual/range {p6 .. p6}, Lkotlin/ranges/j;->e()I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    invoke-virtual {v13, v0, v9}, Landroidx/compose/material3/CalendarModel;->getMonth(II)Landroidx/compose/material3/CalendarMonth;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    :cond_19
    move-object/from16 v18, v5

    .line 289
    .line 290
    check-cast v18, Landroidx/compose/material3/CalendarMonth;

    .line 291
    .line 292
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 293
    .line 294
    .line 295
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 296
    .line 297
    const/4 v5, 0x6

    .line 298
    invoke-virtual {v0, v10, v5}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    sget-object v5, Landroidx/compose/material3/tokens/DatePickerModalTokens;->INSTANCE:Landroidx/compose/material3/tokens/DatePickerModalTokens;

    .line 303
    .line 304
    invoke-virtual {v5}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getDateLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    invoke-static {v0, v5}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    .line 309
    .line 310
    .line 311
    move-result-object v5

    .line 312
    new-instance v0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1;

    .line 313
    .line 314
    move-object/from16 v19, v0

    .line 315
    .line 316
    move/from16 v20, v1

    .line 317
    .line 318
    move-object/from16 v1, p1

    .line 319
    .line 320
    move-object/from16 v2, p2

    .line 321
    .line 322
    move-object/from16 v3, p3

    .line 323
    .line 324
    move-object/from16 v4, p0

    .line 325
    .line 326
    move-object v15, v5

    .line 327
    const/16 v12, 0x4000

    .line 328
    .line 329
    move-object/from16 v5, p6

    .line 330
    .line 331
    move-object/from16 v6, p5

    .line 332
    .line 333
    move-object/from16 v7, v18

    .line 334
    .line 335
    move-object/from16 v8, p7

    .line 336
    .line 337
    move v12, v9

    .line 338
    move-object/from16 v9, p9

    .line 339
    .line 340
    move-object v14, v10

    .line 341
    move-object/from16 v10, v17

    .line 342
    .line 343
    move-object/from16 v11, p8

    .line 344
    .line 345
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1;-><init>(Ljava/lang/Long;Ljava/lang/Long;Lv3/p;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/ranges/l;Landroidx/compose/material3/CalendarModel;Landroidx/compose/material3/CalendarMonth;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/CalendarDate;Landroidx/compose/material3/SelectableDates;)V

    .line 346
    .line 347
    .line 348
    const v0, 0x4103e1b8

    .line 349
    .line 350
    .line 351
    move-object/from16 v1, v19

    .line 352
    .line 353
    invoke-static {v14, v0, v12, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    const/16 v1, 0x30

    .line 358
    .line 359
    invoke-static {v15, v0, v14, v1}, Landroidx/compose/material3/TextKt;->ProvideTextStyle(Landroidx/compose/ui/text/TextStyle;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 360
    .line 361
    .line 362
    const v0, 0x56b952e5

    .line 363
    .line 364
    .line 365
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 366
    .line 367
    .line 368
    and-int/lit8 v6, v20, 0xe

    .line 369
    .line 370
    const/4 v9, 0x0

    .line 371
    const/4 v0, 0x4

    .line 372
    if-ne v6, v0, :cond_1a

    .line 373
    .line 374
    move v0, v12

    .line 375
    goto :goto_e

    .line 376
    :cond_1a
    move v0, v9

    .line 377
    :goto_e
    const v1, 0xe000

    .line 378
    .line 379
    .line 380
    and-int v1, v20, v1

    .line 381
    .line 382
    const/16 v2, 0x4000

    .line 383
    .line 384
    if-ne v1, v2, :cond_1b

    .line 385
    .line 386
    move v9, v12

    .line 387
    :cond_1b
    or-int/2addr v0, v9

    .line 388
    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    or-int/2addr v0, v1

    .line 393
    move-object/from16 v7, p6

    .line 394
    .line 395
    move-object v8, v14

    .line 396
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    or-int/2addr v0, v1

    .line 401
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    if-nez v0, :cond_1c

    .line 406
    .line 407
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 408
    .line 409
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    if-ne v1, v0, :cond_1d

    .line 414
    .line 415
    :cond_1c
    new-instance v9, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$2$1;

    .line 416
    .line 417
    const/4 v5, 0x0

    .line 418
    move-object v0, v9

    .line 419
    move-object/from16 v1, p0

    .line 420
    .line 421
    move-object/from16 v2, p4

    .line 422
    .line 423
    move-object/from16 v3, p5

    .line 424
    .line 425
    move-object/from16 v4, p6

    .line 426
    .line 427
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$2$1;-><init>(Landroidx/compose/foundation/lazy/LazyListState;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Lkotlin/coroutines/d;)V

    .line 428
    .line 429
    .line 430
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    move-object v1, v9

    .line 434
    :cond_1d
    check-cast v1, Lv3/p;

    .line 435
    .line 436
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 437
    .line 438
    .line 439
    move-object/from16 v2, p0

    .line 440
    .line 441
    invoke-static {v2, v1, v8, v6}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 442
    .line 443
    .line 444
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    if-eqz v0, :cond_1e

    .line 449
    .line 450
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 451
    .line 452
    .line 453
    :cond_1e
    :goto_f
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 454
    .line 455
    .line 456
    move-result-object v12

    .line 457
    if-eqz v12, :cond_1f

    .line 458
    .line 459
    new-instance v14, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$3;

    .line 460
    .line 461
    move-object v0, v14

    .line 462
    move-object/from16 v1, p0

    .line 463
    .line 464
    move-object/from16 v2, p1

    .line 465
    .line 466
    move-object/from16 v3, p2

    .line 467
    .line 468
    move-object/from16 v4, p3

    .line 469
    .line 470
    move-object/from16 v5, p4

    .line 471
    .line 472
    move-object/from16 v6, p5

    .line 473
    .line 474
    move-object/from16 v7, p6

    .line 475
    .line 476
    move-object/from16 v8, p7

    .line 477
    .line 478
    move-object/from16 v9, p8

    .line 479
    .line 480
    move-object/from16 v10, p9

    .line 481
    .line 482
    move/from16 v11, p11

    .line 483
    .line 484
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$3;-><init>(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;I)V

    .line 485
    .line 486
    .line 487
    invoke-interface {v12, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 488
    .line 489
    .line 490
    :cond_1f
    return-void
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
.end method

.method public static final synthetic access$DateRangePickerContent(Ljava/lang/Long;Ljava/lang/Long;JLv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p12}, Landroidx/compose/material3/DateRangePickerKt;->DateRangePickerContent(Ljava/lang/Long;Ljava/lang/Long;JLv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$SwitchableDateEntryContent-RN-2D1Q(Ljava/lang/Long;Ljava/lang/Long;JILv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    invoke-static/range {p0 .. p14}, Landroidx/compose/material3/DateRangePickerKt;->SwitchableDateEntryContent-RN-2D1Q(Ljava/lang/Long;Ljava/lang/Long;JILv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final synthetic access$VerticalMonthsList(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p11}, Landroidx/compose/material3/DateRangePickerKt;->VerticalMonthsList(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lv3/p;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$customScrollActions(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/s0;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/DateRangePickerKt;->customScrollActions(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/s0;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDateRangePickerHeadlinePadding$p()Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1

    sget-object v0, Landroidx/compose/material3/DateRangePickerKt;->DateRangePickerHeadlinePadding:Landroidx/compose/foundation/layout/PaddingValues;

    return-object v0
.end method

.method public static final synthetic access$getDateRangePickerTitlePadding$p()Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1

    sget-object v0, Landroidx/compose/material3/DateRangePickerKt;->DateRangePickerTitlePadding:Landroidx/compose/foundation/layout/PaddingValues;

    return-object v0
.end method

.method public static final synthetic access$updateDateSelection(JLjava/lang/Long;Ljava/lang/Long;Lv3/p;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/DateRangePickerKt;->updateDateSelection(JLjava/lang/Long;Ljava/lang/Long;Lv3/p;)V

    return-void
.end method

.method private static final customScrollActions(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/s0;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Lkotlinx/coroutines/s0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/ui/semantics/CustomAccessibilityAction;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/material3/DateRangePickerKt$customScrollActions$scrollUpAction$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroidx/compose/material3/DateRangePickerKt$customScrollActions$scrollUpAction$1;-><init>(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/s0;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/compose/material3/DateRangePickerKt$customScrollActions$scrollDownAction$1;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Landroidx/compose/material3/DateRangePickerKt$customScrollActions$scrollDownAction$1;-><init>(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/s0;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x2

    .line 12
    new-array p0, p0, [Landroidx/compose/ui/semantics/CustomAccessibilityAction;

    .line 13
    .line 14
    new-instance p1, Landroidx/compose/ui/semantics/CustomAccessibilityAction;

    .line 15
    .line 16
    invoke-direct {p1, p2, v0}, Landroidx/compose/ui/semantics/CustomAccessibilityAction;-><init>(Ljava/lang/String;Lv3/a;)V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    aput-object p1, p0, p2

    .line 21
    .line 22
    new-instance p1, Landroidx/compose/ui/semantics/CustomAccessibilityAction;

    .line 23
    .line 24
    invoke-direct {p1, p3, v1}, Landroidx/compose/ui/semantics/CustomAccessibilityAction;-><init>(Ljava/lang/String;Lv3/a;)V

    .line 25
    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    aput-object p1, p0, p2

    .line 29
    .line 30
    invoke-static {p0}, Lkotlin/collections/u;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public static final drawRangeBackground-mxwnekA(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V
    .locals 28
    .param p0    # Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/material3/SelectedRangeInfo;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    move-object/from16 v13, p0

    .line 2
    .line 3
    invoke-static {}, Landroidx/compose/material3/DatePickerKt;->getRecommendedSizeForAccessibility()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {v13, v0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {}, Landroidx/compose/material3/DatePickerKt;->getRecommendedSizeForAccessibility()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-interface {v13, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 16
    .line 17
    .line 18
    move-result v14

    .line 19
    sget-object v1, Landroidx/compose/material3/tokens/DatePickerModalTokens;->INSTANCE:Landroidx/compose/material3/tokens/DatePickerModalTokens;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/DatePickerModalTokens;->getDateStateLayerHeight-D9Ej5fM()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-interface {v13, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 26
    .line 27
    .line 28
    move-result v15

    .line 29
    sub-float v1, v14, v15

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    int-to-float v2, v2

    .line 33
    div-float/2addr v1, v2

    .line 34
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v4, 0x7

    .line 43
    int-to-float v4, v4

    .line 44
    mul-float v5, v4, v0

    .line 45
    .line 46
    sub-float/2addr v3, v5

    .line 47
    div-float/2addr v3, v4

    .line 48
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/material3/SelectedRangeInfo;->getGridStartCoordinates-nOcc-ac()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->component1-impl(J)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->component2-impl(J)I

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/material3/SelectedRangeInfo;->getGridEndCoordinates-nOcc-ac()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->component1-impl(J)I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->component2-impl(J)I

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    int-to-float v4, v6

    .line 73
    add-float v5, v0, v3

    .line 74
    .line 75
    mul-float/2addr v4, v5

    .line 76
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/material3/SelectedRangeInfo;->getFirstIsSelectionStart()Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    const/4 v10, 0x0

    .line 81
    if-eqz v6, :cond_0

    .line 82
    .line 83
    div-float v6, v0, v2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    move v6, v10

    .line 87
    :goto_0
    add-float/2addr v4, v6

    .line 88
    div-float/2addr v3, v2

    .line 89
    add-float/2addr v4, v3

    .line 90
    int-to-float v6, v12

    .line 91
    mul-float/2addr v6, v14

    .line 92
    add-float v9, v6, v1

    .line 93
    .line 94
    int-to-float v6, v7

    .line 95
    mul-float/2addr v6, v5

    .line 96
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/material3/SelectedRangeInfo;->getLastIsSelectionEnd()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_1

    .line 101
    .line 102
    div-float/2addr v0, v2

    .line 103
    :cond_1
    add-float/2addr v6, v0

    .line 104
    add-float/2addr v6, v3

    .line 105
    int-to-float v0, v11

    .line 106
    mul-float/2addr v0, v14

    .line 107
    add-float v8, v0, v1

    .line 108
    .line 109
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sget-object v1, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    .line 114
    .line 115
    const/16 v16, 0x1

    .line 116
    .line 117
    if-ne v0, v1, :cond_2

    .line 118
    .line 119
    move/from16 v17, v16

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    const/4 v0, 0x0

    .line 123
    move/from16 v17, v0

    .line 124
    .line 125
    :goto_1
    if-eqz v17, :cond_3

    .line 126
    .line 127
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 128
    .line 129
    .line 130
    move-result-wide v0

    .line 131
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    sub-float v4, v0, v4

    .line 136
    .line 137
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 138
    .line 139
    .line 140
    move-result-wide v0

    .line 141
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    sub-float v6, v0, v6

    .line 146
    .line 147
    :cond_3
    move/from16 v18, v6

    .line 148
    .line 149
    invoke-static {v4, v9}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 150
    .line 151
    .line 152
    move-result-wide v5

    .line 153
    if-ne v12, v11, :cond_4

    .line 154
    .line 155
    sub-float v0, v18, v4

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_4
    if-eqz v17, :cond_5

    .line 159
    .line 160
    neg-float v0, v4

    .line 161
    goto :goto_2

    .line 162
    :cond_5
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 163
    .line 164
    .line 165
    move-result-wide v0

    .line 166
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    sub-float/2addr v0, v4

    .line 171
    :goto_2
    invoke-static {v0, v15}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 172
    .line 173
    .line 174
    move-result-wide v19

    .line 175
    const/4 v7, 0x0

    .line 176
    const/16 v21, 0x0

    .line 177
    .line 178
    const/16 v22, 0x0

    .line 179
    .line 180
    const/16 v23, 0x0

    .line 181
    .line 182
    const/16 v24, 0x78

    .line 183
    .line 184
    const/16 v25, 0x0

    .line 185
    .line 186
    move-object/from16 v0, p0

    .line 187
    .line 188
    move-wide/from16 v1, p2

    .line 189
    .line 190
    move-wide v3, v5

    .line 191
    move-wide/from16 v5, v19

    .line 192
    .line 193
    move/from16 v26, v8

    .line 194
    .line 195
    move-object/from16 v8, v21

    .line 196
    .line 197
    move/from16 v19, v9

    .line 198
    .line 199
    move-object/from16 v9, v22

    .line 200
    .line 201
    move/from16 v10, v23

    .line 202
    .line 203
    move/from16 v27, v11

    .line 204
    .line 205
    move/from16 v11, v24

    .line 206
    .line 207
    move v13, v12

    .line 208
    move-object/from16 v12, v25

    .line 209
    .line 210
    invoke-static/range {v0 .. v12}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRect-n-J9OG0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    move/from16 v0, v27

    .line 214
    .line 215
    if-eq v13, v0, :cond_9

    .line 216
    .line 217
    sub-int v11, v0, v13

    .line 218
    .line 219
    add-int/lit8 v11, v11, -0x1

    .line 220
    .line 221
    move v13, v11

    .line 222
    :goto_3
    if-lez v13, :cond_6

    .line 223
    .line 224
    int-to-float v0, v13

    .line 225
    mul-float/2addr v0, v14

    .line 226
    add-float v9, v19, v0

    .line 227
    .line 228
    const/4 v12, 0x0

    .line 229
    invoke-static {v12, v9}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 230
    .line 231
    .line 232
    move-result-wide v3

    .line 233
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 234
    .line 235
    .line 236
    move-result-wide v0

    .line 237
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    invoke-static {v0, v15}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 242
    .line 243
    .line 244
    move-result-wide v5

    .line 245
    const/4 v7, 0x0

    .line 246
    const/4 v8, 0x0

    .line 247
    const/4 v9, 0x0

    .line 248
    const/4 v10, 0x0

    .line 249
    const/16 v11, 0x78

    .line 250
    .line 251
    const/16 v16, 0x0

    .line 252
    .line 253
    move-object/from16 v0, p0

    .line 254
    .line 255
    move-wide/from16 v1, p2

    .line 256
    .line 257
    move/from16 v20, v12

    .line 258
    .line 259
    move-object/from16 v12, v16

    .line 260
    .line 261
    invoke-static/range {v0 .. v12}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRect-n-J9OG0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    add-int/lit8 v13, v13, -0x1

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_6
    const/16 v20, 0x0

    .line 268
    .line 269
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    sget-object v1, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 274
    .line 275
    if-ne v0, v1, :cond_7

    .line 276
    .line 277
    move/from16 v10, v20

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_7
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 281
    .line 282
    .line 283
    move-result-wide v0

    .line 284
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    :goto_4
    move/from16 v0, v26

    .line 289
    .line 290
    invoke-static {v10, v0}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 291
    .line 292
    .line 293
    move-result-wide v3

    .line 294
    if-eqz v17, :cond_8

    .line 295
    .line 296
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 297
    .line 298
    .line 299
    move-result-wide v0

    .line 300
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    sub-float v18, v18, v0

    .line 305
    .line 306
    :cond_8
    move/from16 v0, v18

    .line 307
    .line 308
    invoke-static {v0, v15}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 309
    .line 310
    .line 311
    move-result-wide v5

    .line 312
    const/4 v7, 0x0

    .line 313
    const/4 v8, 0x0

    .line 314
    const/4 v9, 0x0

    .line 315
    const/4 v10, 0x0

    .line 316
    const/16 v11, 0x78

    .line 317
    .line 318
    const/4 v12, 0x0

    .line 319
    move-object/from16 v0, p0

    .line 320
    .line 321
    move-wide/from16 v1, p2

    .line 322
    .line 323
    invoke-static/range {v0 .. v12}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRect-n-J9OG0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    :cond_9
    return-void
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
.end method

.method public static final getCalendarMonthSubheadPadding()Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material3/DateRangePickerKt;->CalendarMonthSubheadPadding:Landroidx/compose/foundation/layout/PaddingValues;

    return-object v0
.end method

.method public static final rememberDateRangePickerState-IlFM19s(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;
    .locals 17
    .param p0    # Ljava/lang/Long;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Long;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lkotlin/ranges/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/material3/SelectableDates;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v7, p6

    .line 2
    .line 3
    move/from16 v0, p7

    .line 4
    .line 5
    const v1, -0x77ee04a5

    .line 6
    .line 7
    .line 8
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 9
    .line 10
    .line 11
    and-int/lit8 v2, p8, 0x1

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    move-object v9, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object/from16 v9, p0

    .line 19
    .line 20
    :goto_0
    and-int/lit8 v2, p8, 0x2

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    move-object v10, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-object/from16 v10, p1

    .line 27
    .line 28
    :goto_1
    and-int/lit8 v2, p8, 0x4

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    move-object v11, v9

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move-object/from16 v11, p2

    .line 35
    .line 36
    :goto_2
    and-int/lit8 v2, p8, 0x8

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    sget-object v2, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 41
    .line 42
    invoke-virtual {v2}, Landroidx/compose/material3/DatePickerDefaults;->getYearRange()Lkotlin/ranges/l;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    move-object v12, v2

    .line 47
    goto :goto_3

    .line 48
    :cond_3
    move-object/from16 v12, p3

    .line 49
    .line 50
    :goto_3
    and-int/lit8 v2, p8, 0x10

    .line 51
    .line 52
    if-eqz v2, :cond_4

    .line 53
    .line 54
    sget-object v2, Landroidx/compose/material3/DisplayMode;->Companion:Landroidx/compose/material3/DisplayMode$Companion;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroidx/compose/material3/DisplayMode$Companion;->getPicker-jFl-4v0()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    move v13, v2

    .line 61
    goto :goto_4

    .line 62
    :cond_4
    move/from16 v13, p4

    .line 63
    .line 64
    :goto_4
    const/16 v2, 0x20

    .line 65
    .line 66
    and-int/lit8 v3, p8, 0x20

    .line 67
    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    sget-object v3, Landroidx/compose/material3/DatePickerDefaults;->INSTANCE:Landroidx/compose/material3/DatePickerDefaults;

    .line 71
    .line 72
    invoke-virtual {v3}, Landroidx/compose/material3/DatePickerDefaults;->getAllDates()Landroidx/compose/material3/SelectableDates;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    move-object v14, v3

    .line 77
    goto :goto_5

    .line 78
    :cond_5
    move-object/from16 v14, p5

    .line 79
    .line 80
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_6

    .line 85
    .line 86
    const/4 v3, -0x1

    .line 87
    const-string v4, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:261)"

    .line 88
    .line 89
    invoke-static {v1, v0, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_6
    const/4 v1, 0x0

    .line 93
    invoke-static {v7, v1}, Landroidx/compose/material3/ActualAndroid_androidKt;->defaultLocale(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;

    .line 94
    .line 95
    .line 96
    move-result-object v15

    .line 97
    new-array v3, v1, [Ljava/lang/Object;

    .line 98
    .line 99
    sget-object v4, Landroidx/compose/material3/DateRangePickerStateImpl;->Companion:Landroidx/compose/material3/DateRangePickerStateImpl$Companion;

    .line 100
    .line 101
    invoke-virtual {v4, v14, v15}, Landroidx/compose/material3/DateRangePickerStateImpl$Companion;->Saver(Landroidx/compose/material3/SelectableDates;Ljava/util/Locale;)Landroidx/compose/runtime/saveable/Saver;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const/4 v5, 0x0

    .line 106
    const v6, 0x1008c55c

    .line 107
    .line 108
    .line 109
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 110
    .line 111
    .line 112
    and-int/lit8 v6, v0, 0xe

    .line 113
    .line 114
    xor-int/lit8 v6, v6, 0x6

    .line 115
    .line 116
    const/4 v8, 0x4

    .line 117
    const/16 v16, 0x1

    .line 118
    .line 119
    if-le v6, v8, :cond_7

    .line 120
    .line 121
    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-nez v6, :cond_8

    .line 126
    .line 127
    :cond_7
    and-int/lit8 v6, v0, 0x6

    .line 128
    .line 129
    if-ne v6, v8, :cond_9

    .line 130
    .line 131
    :cond_8
    move/from16 v6, v16

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_9
    move v6, v1

    .line 135
    :goto_6
    and-int/lit8 v8, v0, 0x70

    .line 136
    .line 137
    xor-int/lit8 v8, v8, 0x30

    .line 138
    .line 139
    if-le v8, v2, :cond_a

    .line 140
    .line 141
    invoke-interface {v7, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-nez v8, :cond_b

    .line 146
    .line 147
    :cond_a
    and-int/lit8 v8, v0, 0x30

    .line 148
    .line 149
    if-ne v8, v2, :cond_c

    .line 150
    .line 151
    :cond_b
    move/from16 v2, v16

    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_c
    move v2, v1

    .line 155
    :goto_7
    or-int/2addr v2, v6

    .line 156
    and-int/lit16 v6, v0, 0x380

    .line 157
    .line 158
    xor-int/lit16 v6, v6, 0x180

    .line 159
    .line 160
    const/16 v8, 0x100

    .line 161
    .line 162
    if-le v6, v8, :cond_d

    .line 163
    .line 164
    invoke-interface {v7, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-nez v6, :cond_e

    .line 169
    .line 170
    :cond_d
    and-int/lit16 v6, v0, 0x180

    .line 171
    .line 172
    if-ne v6, v8, :cond_f

    .line 173
    .line 174
    :cond_e
    move/from16 v6, v16

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_f
    move v6, v1

    .line 178
    :goto_8
    or-int/2addr v2, v6

    .line 179
    invoke-interface {v7, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    or-int/2addr v2, v6

    .line 184
    const v6, 0xe000

    .line 185
    .line 186
    .line 187
    and-int/2addr v6, v0

    .line 188
    xor-int/lit16 v6, v6, 0x6000

    .line 189
    .line 190
    const/16 v8, 0x4000

    .line 191
    .line 192
    if-le v6, v8, :cond_10

    .line 193
    .line 194
    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-nez v6, :cond_11

    .line 199
    .line 200
    :cond_10
    and-int/lit16 v6, v0, 0x6000

    .line 201
    .line 202
    if-ne v6, v8, :cond_12

    .line 203
    .line 204
    :cond_11
    move/from16 v6, v16

    .line 205
    .line 206
    goto :goto_9

    .line 207
    :cond_12
    move v6, v1

    .line 208
    :goto_9
    or-int/2addr v2, v6

    .line 209
    const/high16 v6, 0x70000

    .line 210
    .line 211
    and-int/2addr v6, v0

    .line 212
    const/high16 v8, 0x30000

    .line 213
    .line 214
    xor-int/2addr v6, v8

    .line 215
    const/high16 v1, 0x20000

    .line 216
    .line 217
    if-le v6, v1, :cond_13

    .line 218
    .line 219
    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    if-nez v6, :cond_14

    .line 224
    .line 225
    :cond_13
    and-int/2addr v0, v8

    .line 226
    if-ne v0, v1, :cond_15

    .line 227
    .line 228
    :cond_14
    move/from16 v1, v16

    .line 229
    .line 230
    goto :goto_a

    .line 231
    :cond_15
    const/4 v1, 0x0

    .line 232
    :goto_a
    or-int v0, v2, v1

    .line 233
    .line 234
    invoke-interface {v7, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    or-int/2addr v0, v1

    .line 239
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    if-nez v0, :cond_16

    .line 244
    .line 245
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 246
    .line 247
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    if-ne v1, v0, :cond_17

    .line 252
    .line 253
    :cond_16
    new-instance v1, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;

    .line 254
    .line 255
    move-object v8, v1

    .line 256
    invoke-direct/range {v8 .. v15}, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;)V

    .line 257
    .line 258
    .line 259
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_17
    move-object v6, v1

    .line 263
    check-cast v6, Lv3/a;

    .line 264
    .line 265
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 266
    .line 267
    .line 268
    const/4 v8, 0x0

    .line 269
    const/4 v9, 0x4

    .line 270
    move-object v0, v3

    .line 271
    move-object v1, v4

    .line 272
    move-object v2, v5

    .line 273
    move-object v3, v6

    .line 274
    move-object/from16 v4, p6

    .line 275
    .line 276
    move v5, v8

    .line 277
    move v6, v9

    .line 278
    invoke-static/range {v0 .. v6}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, Landroidx/compose/material3/DateRangePickerStateImpl;

    .line 283
    .line 284
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_18

    .line 289
    .line 290
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 291
    .line 292
    .line 293
    :cond_18
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 294
    .line 295
    .line 296
    return-object v0
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
.end method

.method private static final updateDateSelection(JLjava/lang/Long;Ljava/lang/Long;Lv3/p;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Lv3/p<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    if-eqz p3, :cond_1

    .line 5
    .line 6
    :cond_0
    if-eqz p2, :cond_2

    .line 7
    .line 8
    if-eqz p3, :cond_2

    .line 9
    .line 10
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p4, p0, v0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    if-eqz p2, :cond_3

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    cmp-long p3, p0, v1

    .line 25
    .line 26
    if-ltz p3, :cond_3

    .line 27
    .line 28
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-interface {p4, p2, p0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {p4, p0, v0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
