.class public interface abstract Landroidx/compose/material3/pulltorefresh/PullToRefreshState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
.end annotation

.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008g\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H&J\u0008\u0010\u0004\u001a\u00020\u0002H&R\u0014\u0010\u0008\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007R\u0014\u0010\u000c\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00058gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u0007R\u001c\u0010\u0015\u001a\u00020\u00108&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0016\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;",
        "",
        "Lkotlin/r2;",
        "startRefresh",
        "endRefresh",
        "",
        "getPositionalThreshold",
        "()F",
        "positionalThreshold",
        "getProgress",
        "progress",
        "",
        "isRefreshing",
        "()Z",
        "getVerticalOffset",
        "verticalOffset",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "getNestedScrollConnection",
        "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "setNestedScrollConnection",
        "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V",
        "nestedScrollConnection",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract endRefresh()V
.end method

.method public abstract getNestedScrollConnection()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getPositionalThreshold()F
.end method

.method public abstract getProgress()F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
    .end annotation
.end method

.method public abstract getVerticalOffset()F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
    .end annotation
.end method

.method public abstract isRefreshing()Z
.end method

.method public abstract setNestedScrollConnection(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V
    .param p1    # Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract startRefresh()V
.end method
