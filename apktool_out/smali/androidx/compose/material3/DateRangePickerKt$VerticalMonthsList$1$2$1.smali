.class final Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/foundation/lazy/LazyListScope;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/LazyListScope;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/foundation/lazy/LazyListScope;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $calendarModel:Landroidx/compose/material3/CalendarModel;

.field final synthetic $colors:Landroidx/compose/material3/DatePickerColors;

.field final synthetic $customAccessibilityAction:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/semantics/CustomAccessibilityAction;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $dateFormatter:Landroidx/compose/material3/DatePickerFormatter;

.field final synthetic $firstMonth:Landroidx/compose/material3/CalendarMonth;

.field final synthetic $onDateSelectionChange:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectableDates:Landroidx/compose/material3/SelectableDates;

.field final synthetic $selectedEndDateMillis:Ljava/lang/Long;

.field final synthetic $selectedStartDateMillis:Ljava/lang/Long;

.field final synthetic $today:Landroidx/compose/material3/CalendarDate;

.field final synthetic $yearRange:Lkotlin/ranges/l;


# direct methods
.method constructor <init>(Lkotlin/ranges/l;Landroidx/compose/material3/CalendarModel;Landroidx/compose/material3/CalendarMonth;Ljava/lang/Long;Ljava/lang/Long;Lv3/l;Landroidx/compose/material3/CalendarDate;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/l;",
            "Landroidx/compose/material3/CalendarModel;",
            "Landroidx/compose/material3/CalendarMonth;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/material3/CalendarDate;",
            "Landroidx/compose/material3/DatePickerFormatter;",
            "Landroidx/compose/material3/SelectableDates;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Ljava/util/List<",
            "Landroidx/compose/ui/semantics/CustomAccessibilityAction;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$yearRange:Lkotlin/ranges/l;

    iput-object p2, p0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$calendarModel:Landroidx/compose/material3/CalendarModel;

    iput-object p3, p0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$firstMonth:Landroidx/compose/material3/CalendarMonth;

    iput-object p4, p0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$selectedStartDateMillis:Ljava/lang/Long;

    iput-object p5, p0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$selectedEndDateMillis:Ljava/lang/Long;

    iput-object p6, p0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$onDateSelectionChange:Lv3/l;

    iput-object p7, p0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$today:Landroidx/compose/material3/CalendarDate;

    iput-object p8, p0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$dateFormatter:Landroidx/compose/material3/DatePickerFormatter;

    iput-object p9, p0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$selectableDates:Landroidx/compose/material3/SelectableDates;

    iput-object p10, p0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$colors:Landroidx/compose/material3/DatePickerColors;

    iput-object p11, p0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$customAccessibilityAction:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V
    .locals 17
    .param p1    # Landroidx/compose/foundation/lazy/LazyListScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$yearRange:Lkotlin/ranges/l;

    invoke-static {v1}, Landroidx/compose/material3/DatePickerKt;->numberOfMonthsInRange(Lkotlin/ranges/l;)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v1, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1;

    iget-object v7, v0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$calendarModel:Landroidx/compose/material3/CalendarModel;

    iget-object v8, v0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$firstMonth:Landroidx/compose/material3/CalendarMonth;

    iget-object v9, v0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$selectedStartDateMillis:Ljava/lang/Long;

    iget-object v10, v0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$selectedEndDateMillis:Ljava/lang/Long;

    iget-object v11, v0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$onDateSelectionChange:Lv3/l;

    iget-object v12, v0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$today:Landroidx/compose/material3/CalendarDate;

    iget-object v13, v0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$dateFormatter:Landroidx/compose/material3/DatePickerFormatter;

    iget-object v14, v0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$selectableDates:Landroidx/compose/material3/SelectableDates;

    iget-object v15, v0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$colors:Landroidx/compose/material3/DatePickerColors;

    iget-object v2, v0, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1;->$customAccessibilityAction:Ljava/util/List;

    move-object v6, v1

    move-object/from16 v16, v2

    invoke-direct/range {v6 .. v16}, Landroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1;-><init>(Landroidx/compose/material3/CalendarModel;Landroidx/compose/material3/CalendarMonth;Ljava/lang/Long;Ljava/lang/Long;Lv3/l;Landroidx/compose/material3/CalendarDate;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Ljava/util/List;)V

    const v2, -0x544051c5

    const/4 v6, 0x1

    invoke-static {v2, v6, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/lazy/LazyListScope;->items$default(Landroidx/compose/foundation/lazy/LazyListScope;ILv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V

    return-void
.end method
