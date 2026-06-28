.class public final Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0008R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;",
        "",
        "Landroidx/window/layout/WindowLayoutInfo;",
        "windowLayoutInfo",
        "Landroidx/window/layout/FoldingFeature;",
        "getFoldingFeature",
        "Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;",
        "onFoldingFeatureChangeListener",
        "Lkotlin/r2;",
        "setOnFoldingFeatureChangeListener",
        "Landroid/app/Activity;",
        "activity",
        "registerLayoutStateChangeCallback",
        "unregisterLayoutStateChangeCallback",
        "Landroidx/window/layout/WindowInfoTracker;",
        "windowInfoTracker",
        "Landroidx/window/layout/WindowInfoTracker;",
        "Ljava/util/concurrent/Executor;",
        "executor",
        "Ljava/util/concurrent/Executor;",
        "Lkotlinx/coroutines/l2;",
        "job",
        "Lkotlinx/coroutines/l2;",
        "Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;",
        "<init>",
        "(Landroidx/window/layout/WindowInfoTracker;Ljava/util/concurrent/Executor;)V",
        "OnFoldingFeatureChangeListener",
        "slidingpanelayout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field private final executor:Ljava/util/concurrent/Executor;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private job:Lkotlinx/coroutines/l2;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private onFoldingFeatureChangeListener:Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final windowInfoTracker:Landroidx/window/layout/WindowInfoTracker;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/window/layout/WindowInfoTracker;Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p1    # Landroidx/window/layout/WindowInfoTracker;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string/jumbo v0, "windowInfoTracker"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "executor"

    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;->windowInfoTracker:Landroidx/window/layout/WindowInfoTracker;

    .line 16
    .line 17
    iput-object p2, p0, Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;->executor:Ljava/util/concurrent/Executor;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static final synthetic access$getFoldingFeature(Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;Landroidx/window/layout/WindowLayoutInfo;)Landroidx/window/layout/FoldingFeature;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;->getFoldingFeature(Landroidx/window/layout/WindowLayoutInfo;)Landroidx/window/layout/FoldingFeature;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getOnFoldingFeatureChangeListener$p(Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;)Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;
    .locals 0

    iget-object p0, p0, Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;->onFoldingFeatureChangeListener:Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;

    return-object p0
.end method

.method public static final synthetic access$getWindowInfoTracker$p(Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;)Landroidx/window/layout/WindowInfoTracker;
    .locals 0

    iget-object p0, p0, Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;->windowInfoTracker:Landroidx/window/layout/WindowInfoTracker;

    return-object p0
.end method

.method private final getFoldingFeature(Landroidx/window/layout/WindowLayoutInfo;)Landroidx/window/layout/FoldingFeature;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/window/layout/WindowLayoutInfo;->getDisplayFeatures()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    move-object v2, v0

    .line 23
    check-cast v2, Landroidx/window/layout/DisplayFeature;

    .line 24
    .line 25
    instance-of v2, v2, Landroidx/window/layout/FoldingFeature;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v0, v1

    .line 31
    :goto_0
    instance-of p1, v0, Landroidx/window/layout/FoldingFeature;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    move-object v1, v0

    .line 36
    check-cast v1, Landroidx/window/layout/FoldingFeature;

    .line 37
    .line 38
    :cond_2
    return-object v1
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method


# virtual methods
.method public final registerLayoutStateChangeCallback(Landroid/app/Activity;)V
    .locals 8
    .param p1    # Landroid/app/Activity;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;->job:Lkotlinx/coroutines/l2;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v2, 0x1

    .line 13
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/l2$a;->b(Lkotlinx/coroutines/l2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object v0, p0, Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;->executor:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    invoke-static {v0}, Lkotlinx/coroutines/z1;->c(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/n0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lkotlinx/coroutines/t0;->a(Lkotlin/coroutines/g;)Lkotlinx/coroutines/s0;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    new-instance v5, Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$registerLayoutStateChangeCallback$1;

    .line 29
    .line 30
    invoke-direct {v5, p0, p1, v1}, Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$registerLayoutStateChangeCallback$1;-><init>(Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;Landroid/app/Activity;Lkotlin/coroutines/d;)V

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x3

    .line 34
    const/4 v7, 0x0

    .line 35
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;->job:Lkotlinx/coroutines/l2;

    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public final setOnFoldingFeatureChangeListener(Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;)V
    .locals 1
    .param p1    # Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "onFoldingFeatureChangeListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;->onFoldingFeatureChangeListener:Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final unregisterLayoutStateChangeCallback()V
    .locals 3

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;->job:Lkotlinx/coroutines/l2;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/l2$a;->b(Lkotlinx/coroutines/l2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
