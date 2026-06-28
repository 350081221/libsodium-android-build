.class final Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DatePickerKt$YearPicker$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;)V",
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
.field final synthetic $colors:Landroidx/compose/material3/DatePickerColors;

.field final synthetic $coroutineScope:Lkotlinx/coroutines/s0;

.field final synthetic $currentYear:I

.field final synthetic $displayedYear:I

.field final synthetic $lazyGridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

.field final synthetic $onYearSelected:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scrollToEarlierYearsLabel:Ljava/lang/String;

.field final synthetic $scrollToLaterYearsLabel:Ljava/lang/String;

.field final synthetic $selectableDates:Landroidx/compose/material3/SelectableDates;

.field final synthetic $yearRange:Lkotlin/ranges/l;


# direct methods
.method constructor <init>(Lkotlin/ranges/l;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlinx/coroutines/s0;Ljava/lang/String;Ljava/lang/String;IILv3/l;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/l;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Lkotlinx/coroutines/s0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/material3/SelectableDates;",
            "Landroidx/compose/material3/DatePickerColors;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$yearRange:Lkotlin/ranges/l;

    iput-object p2, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$lazyGridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    iput-object p3, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$coroutineScope:Lkotlinx/coroutines/s0;

    iput-object p4, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$scrollToEarlierYearsLabel:Ljava/lang/String;

    iput-object p5, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$scrollToLaterYearsLabel:Ljava/lang/String;

    iput p6, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$displayedYear:I

    iput p7, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$currentYear:I

    iput-object p8, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$onYearSelected:Lv3/l;

    iput-object p9, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$selectableDates:Landroidx/compose/material3/SelectableDates;

    iput-object p10, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$colors:Landroidx/compose/material3/DatePickerColors;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/grid/LazyGridScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->invoke(Landroidx/compose/foundation/lazy/grid/LazyGridScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/grid/LazyGridScope;)V
    .locals 18
    .param p1    # Landroidx/compose/foundation/lazy/grid/LazyGridScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$yearRange:Lkotlin/ranges/l;

    invoke-static {v1}, Lkotlin/collections/u;->U1(Ljava/lang/Iterable;)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v1, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1;

    iget-object v8, v0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$yearRange:Lkotlin/ranges/l;

    iget-object v9, v0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$lazyGridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    iget-object v10, v0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$coroutineScope:Lkotlinx/coroutines/s0;

    iget-object v11, v0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$scrollToEarlierYearsLabel:Ljava/lang/String;

    iget-object v12, v0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$scrollToLaterYearsLabel:Ljava/lang/String;

    iget v13, v0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$displayedYear:I

    iget v14, v0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$currentYear:I

    iget-object v15, v0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$onYearSelected:Lv3/l;

    iget-object v2, v0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$selectableDates:Landroidx/compose/material3/SelectableDates;

    iget-object v7, v0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$colors:Landroidx/compose/material3/DatePickerColors;

    move-object/from16 v17, v7

    move-object v7, v1

    move-object/from16 v16, v2

    invoke-direct/range {v7 .. v17}, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1;-><init>(Lkotlin/ranges/l;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlinx/coroutines/s0;Ljava/lang/String;Ljava/lang/String;IILv3/l;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;)V

    const v2, 0x3e06a802

    const/4 v7, 0x1

    invoke-static {v2, v7, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v7

    const/16 v8, 0xe

    const/4 v9, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v9}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items$default(Landroidx/compose/foundation/lazy/grid/LazyGridScope;ILv3/l;Lv3/p;Lv3/l;Lv3/r;ILjava/lang/Object;)V

    return-void
.end method
