.class final Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/grid/LazyGridState;->scroll(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.lazy.grid.LazyGridState"
    f = "LazyGridState.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x121,
        0x122
    }
    m = "scroll"
    n = {
        "this",
        "scrollPriority",
        "block"
    }
    s = {
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/compose/foundation/lazy/grid/LazyGridState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->this$0:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->label:I

    iget-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->this$0:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scroll(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
