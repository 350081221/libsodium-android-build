.class final Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$rememberPullToRefreshState$2$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->rememberPullToRefreshState--orJrPs(FLv3/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;",
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
.field final synthetic $enabled:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $positionalThresholdPx:F


# direct methods
.method constructor <init>(FLv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$rememberPullToRefreshState$2$1;->$positionalThresholdPx:F

    iput-object p2, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$rememberPullToRefreshState$2$1;->$enabled:Lv3/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/compose/material3/pulltorefresh/PullToRefreshState;
    .locals 4
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;

    .line 3
    iget v1, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$rememberPullToRefreshState$2$1;->$positionalThresholdPx:F

    .line 4
    iget-object v2, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$rememberPullToRefreshState$2$1;->$enabled:Lv3/a;

    const/4 v3, 0x0

    .line 5
    invoke-direct {v0, v3, v1, v2}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;-><init>(ZFLv3/a;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$rememberPullToRefreshState$2$1;->invoke()Landroidx/compose/material3/pulltorefresh/PullToRefreshState;

    move-result-object v0

    return-object v0
.end method
