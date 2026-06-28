.class final Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/pullrefresh/PullRefreshStateKt;->rememberPullRefreshState-UuyPYSY(ZLv3/a;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/pullrefresh/PullRefreshState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/r2;",
        "invoke",
        "()V",
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
.field final synthetic $refreshing:Z

.field final synthetic $refreshingOffsetPx:Lkotlin/jvm/internal/k1$e;

.field final synthetic $state:Landroidx/compose/material/pullrefresh/PullRefreshState;

.field final synthetic $thresholdPx:Lkotlin/jvm/internal/k1$e;


# direct methods
.method constructor <init>(Landroidx/compose/material/pullrefresh/PullRefreshState;ZLkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;->$state:Landroidx/compose/material/pullrefresh/PullRefreshState;

    iput-boolean p2, p0, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;->$refreshing:Z

    iput-object p3, p0, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;->$thresholdPx:Lkotlin/jvm/internal/k1$e;

    iput-object p4, p0, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;->$refreshingOffsetPx:Lkotlin/jvm/internal/k1$e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;->$state:Landroidx/compose/material/pullrefresh/PullRefreshState;

    iget-boolean v1, p0, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;->$refreshing:Z

    invoke-virtual {v0, v1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->setRefreshing$material_release(Z)V

    .line 3
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;->$state:Landroidx/compose/material/pullrefresh/PullRefreshState;

    iget-object v1, p0, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;->$thresholdPx:Lkotlin/jvm/internal/k1$e;

    iget v1, v1, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-virtual {v0, v1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->setThreshold$material_release(F)V

    .line 4
    iget-object v0, p0, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;->$state:Landroidx/compose/material/pullrefresh/PullRefreshState;

    iget-object v1, p0, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;->$refreshingOffsetPx:Lkotlin/jvm/internal/k1$e;

    iget v1, v1, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-virtual {v0, v1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->setRefreshingOffset$material_release(F)V

    return-void
.end method
