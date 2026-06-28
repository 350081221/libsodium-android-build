.class final Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DatePickerKt;->updateDisplayedMonth(Landroidx/compose/foundation/lazy/LazyListState;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/j;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "Lkotlin/r2;",
        "emit",
        "(ILkotlin/coroutines/d;)Ljava/lang/Object;",
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

.field final synthetic $lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

.field final synthetic $onDisplayedMonthChange:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $yearRange:Lkotlin/ranges/l;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/LazyListState;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/material3/CalendarModel;",
            "Lkotlin/ranges/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;->$lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    iput-object p2, p0, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;->$onDisplayedMonthChange:Lv3/l;

    iput-object p3, p0, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;->$calendarModel:Landroidx/compose/material3/CalendarModel;

    iput-object p4, p0, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;->$yearRange:Lkotlin/ranges/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(ILkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 3
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 2
    iget-object p1, p0, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;->$lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemIndex()I

    move-result p1

    div-int/lit8 p1, p1, 0xc

    .line 3
    iget-object p2, p0, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;->$lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemIndex()I

    move-result p2

    rem-int/lit8 p2, p2, 0xc

    add-int/lit8 p2, p2, 0x1

    .line 4
    iget-object v0, p0, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;->$onDisplayedMonthChange:Lv3/l;

    .line 5
    iget-object v1, p0, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;->$calendarModel:Landroidx/compose/material3/CalendarModel;

    .line 6
    iget-object v2, p0, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;->$yearRange:Lkotlin/ranges/l;

    invoke-virtual {v2}, Lkotlin/ranges/j;->e()I

    move-result v2

    add-int/2addr v2, p1

    .line 7
    invoke-virtual {v1, v2, p2}, Landroidx/compose/material3/CalendarModel;->getMonth(II)Landroidx/compose/material3/CalendarMonth;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroidx/compose/material3/CalendarMonth;->getStartUtcTimeMillis()J

    move-result-wide p1

    invoke-static {p1, p2}, Lkotlin/coroutines/jvm/internal/b;->g(J)Ljava/lang/Long;

    move-result-object p1

    .line 9
    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/DatePickerKt$updateDisplayedMonth$3;->emit(ILkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
