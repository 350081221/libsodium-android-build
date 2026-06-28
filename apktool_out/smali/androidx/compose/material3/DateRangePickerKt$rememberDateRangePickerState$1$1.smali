.class final Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DateRangePickerKt;->rememberDateRangePickerState-IlFM19s(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Landroidx/compose/material3/DateRangePickerStateImpl;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/material3/DateRangePickerStateImpl;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $initialDisplayMode:I

.field final synthetic $initialDisplayedMonthMillis:Ljava/lang/Long;

.field final synthetic $initialSelectedEndDateMillis:Ljava/lang/Long;

.field final synthetic $initialSelectedStartDateMillis:Ljava/lang/Long;

.field final synthetic $locale:Ljava/util/Locale;

.field final synthetic $selectableDates:Landroidx/compose/material3/SelectableDates;

.field final synthetic $yearRange:Lkotlin/ranges/l;


# direct methods
.method constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$initialSelectedStartDateMillis:Ljava/lang/Long;

    iput-object p2, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$initialSelectedEndDateMillis:Ljava/lang/Long;

    iput-object p3, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$initialDisplayedMonthMillis:Ljava/lang/Long;

    iput-object p4, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$yearRange:Lkotlin/ranges/l;

    iput p5, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$initialDisplayMode:I

    iput-object p6, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$selectableDates:Landroidx/compose/material3/SelectableDates;

    iput-object p7, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$locale:Ljava/util/Locale;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/compose/material3/DateRangePickerStateImpl;
    .locals 10
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v9, Landroidx/compose/material3/DateRangePickerStateImpl;

    .line 3
    iget-object v1, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$initialSelectedStartDateMillis:Ljava/lang/Long;

    .line 4
    iget-object v2, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$initialSelectedEndDateMillis:Ljava/lang/Long;

    .line 5
    iget-object v3, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$initialDisplayedMonthMillis:Ljava/lang/Long;

    .line 6
    iget-object v4, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$yearRange:Lkotlin/ranges/l;

    .line 7
    iget v5, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$initialDisplayMode:I

    .line 8
    iget-object v6, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$selectableDates:Landroidx/compose/material3/SelectableDates;

    .line 9
    iget-object v7, p0, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->$locale:Ljava/util/Locale;

    const/4 v8, 0x0

    move-object v0, v9

    .line 10
    invoke-direct/range {v0 .. v8}, Landroidx/compose/material3/DateRangePickerStateImpl;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;Lkotlin/jvm/internal/w;)V

    return-object v9
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/DateRangePickerKt$rememberDateRangePickerState$1$1;->invoke()Landroidx/compose/material3/DateRangePickerStateImpl;

    move-result-object v0

    return-object v0
.end method
