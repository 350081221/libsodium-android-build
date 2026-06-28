.class final Landroidx/compose/foundation/pager/PagerStateKt$rememberPagerState$1$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/pager/PagerStateKt;->rememberPagerState(IFLv3/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Landroidx/compose/foundation/pager/PagerStateImpl;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/foundation/pager/PagerStateImpl;",
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
.field final synthetic $initialPage:I

.field final synthetic $initialPageOffsetFraction:F

.field final synthetic $pageCount:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(IFLv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IF",
            "Lv3/a<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Landroidx/compose/foundation/pager/PagerStateKt$rememberPagerState$1$1;->$initialPage:I

    iput p2, p0, Landroidx/compose/foundation/pager/PagerStateKt$rememberPagerState$1$1;->$initialPageOffsetFraction:F

    iput-object p3, p0, Landroidx/compose/foundation/pager/PagerStateKt$rememberPagerState$1$1;->$pageCount:Lv3/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/compose/foundation/pager/PagerStateImpl;
    .locals 4
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/foundation/pager/PagerStateImpl;

    .line 3
    iget v1, p0, Landroidx/compose/foundation/pager/PagerStateKt$rememberPagerState$1$1;->$initialPage:I

    .line 4
    iget v2, p0, Landroidx/compose/foundation/pager/PagerStateKt$rememberPagerState$1$1;->$initialPageOffsetFraction:F

    .line 5
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerStateKt$rememberPagerState$1$1;->$pageCount:Lv3/a;

    .line 6
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/pager/PagerStateImpl;-><init>(IFLv3/a;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerStateKt$rememberPagerState$1$1;->invoke()Landroidx/compose/foundation/pager/PagerStateImpl;

    move-result-object v0

    return-object v0
.end method
