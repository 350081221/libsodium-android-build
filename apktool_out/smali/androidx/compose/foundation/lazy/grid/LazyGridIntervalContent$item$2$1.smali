.class final Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent$item$2$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;->item(Ljava/lang/Object;Lv3/l;Ljava/lang/Object;Lv3/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/foundation/lazy/grid/GridItemSpan;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/foundation/lazy/grid/GridItemSpan;",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;",
        "it",
        "",
        "invoke-_-orMbw",
        "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"
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
.field final synthetic $span:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;",
            "Landroidx/compose/foundation/lazy/grid/GridItemSpan;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lv3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;",
            "Landroidx/compose/foundation/lazy/grid/GridItemSpan;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent$item$2$1;->$span:Lv3/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent$item$2$1;->invoke-_-orMbw(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J

    move-result-wide p1

    invoke-static {p1, p2}, Landroidx/compose/foundation/lazy/grid/GridItemSpan;->box-impl(J)Landroidx/compose/foundation/lazy/grid/GridItemSpan;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-_-orMbw(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J
    .locals 0
    .param p1    # Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object p2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent$item$2$1;->$span:Lv3/l;

    invoke-interface {p2, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/lazy/grid/GridItemSpan;

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/grid/GridItemSpan;->unbox-impl()J

    move-result-wide p1

    return-wide p1
.end method
