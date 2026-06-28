.class public final Landroidx/compose/material/pullrefresh/PullRefreshKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u001as\u0010\u0005\u001a\u00020\u0000*\u00020\u00002!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\n\u0012\u0004\u0012\u00020\u00070\u000621\u0010\u0010\u001a-\u0008\u0001\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\r\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000c2\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Landroidx/compose/material/pullrefresh/PullRefreshState;",
        "state",
        "",
        "enabled",
        "pullRefresh",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/v0;",
        "name",
        "pullDelta",
        "onPull",
        "Lkotlin/Function2;",
        "flingVelocity",
        "Lkotlin/coroutines/d;",
        "",
        "onRelease",
        "(Landroidx/compose/ui/Modifier;Lv3/l;Lv3/p;Z)Landroidx/compose/ui/Modifier;",
        "material_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nPullRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,120:1\n135#2:121\n146#2:122\n135#2:123\n146#2:124\n*S KotlinDebug\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n*L\n47#1:121\n47#1:122\n82#1:123\n82#1:124\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic access$pullRefresh$lambda$1$onRelease(Landroidx/compose/material/pullrefresh/PullRefreshState;FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/material/pullrefresh/PullRefreshKt;->pullRefresh$lambda$1$onRelease(Landroidx/compose/material/pullrefresh/PullRefreshState;FLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final pullRefresh(Landroidx/compose/ui/Modifier;Landroidx/compose/material/pullrefresh/PullRefreshState;Z)Landroidx/compose/ui/Modifier;
    .locals 4
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/material/pullrefresh/PullRefreshState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material/ExperimentalMaterialApi;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/InspectableValueKt;->isDebugInspectorInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/compose/material/pullrefresh/PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1;

    invoke-direct {v0, p1, p2}, Landroidx/compose/material/pullrefresh/PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1;-><init>(Landroidx/compose/material/pullrefresh/PullRefreshState;Z)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/InspectableValueKt;->getNoInspectorInfo()Lv3/l;

    move-result-object v0

    .line 2
    :goto_0
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 3
    new-instance v2, Landroidx/compose/material/pullrefresh/PullRefreshKt$pullRefresh$2$1;

    invoke-direct {v2, p1}, Landroidx/compose/material/pullrefresh/PullRefreshKt$pullRefresh$2$1;-><init>(Ljava/lang/Object;)V

    new-instance v3, Landroidx/compose/material/pullrefresh/PullRefreshKt$pullRefresh$2$2;

    invoke-direct {v3, p1}, Landroidx/compose/material/pullrefresh/PullRefreshKt$pullRefresh$2$2;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v2, v3, p2}, Landroidx/compose/material/pullrefresh/PullRefreshKt;->pullRefresh(Landroidx/compose/ui/Modifier;Lv3/l;Lv3/p;Z)Landroidx/compose/ui/Modifier;

    move-result-object p1

    .line 4
    invoke-static {p0, v0, p1}, Landroidx/compose/ui/platform/InspectableValueKt;->inspectableWrapper(Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final pullRefresh(Landroidx/compose/ui/Modifier;Lv3/l;Lv3/p;Z)Landroidx/compose/ui/Modifier;
    .locals 3
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material/ExperimentalMaterialApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;",
            "Lv3/p<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Ljava/lang/Float;",
            ">;+",
            "Ljava/lang/Object;",
            ">;Z)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 5
    invoke-static {}, Landroidx/compose/ui/platform/InspectableValueKt;->isDebugInspectorInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/compose/material/pullrefresh/PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2;

    invoke-direct {v0, p1, p2, p3}, Landroidx/compose/material/pullrefresh/PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2;-><init>(Lv3/l;Lv3/p;Z)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/InspectableValueKt;->getNoInspectorInfo()Lv3/l;

    move-result-object v0

    .line 6
    :goto_0
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 7
    new-instance v2, Landroidx/compose/material/pullrefresh/PullRefreshNestedScrollConnection;

    invoke-direct {v2, p1, p2, p3}, Landroidx/compose/material/pullrefresh/PullRefreshNestedScrollConnection;-><init>(Lv3/l;Lv3/p;Z)V

    const/4 p1, 0x2

    const/4 p2, 0x0

    invoke-static {v1, v2, p2, p1, p2}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt;->nestedScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    .line 8
    invoke-static {p0, v0, p1}, Landroidx/compose/ui/platform/InspectableValueKt;->inspectableWrapper(Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic pullRefresh$default(Landroidx/compose/ui/Modifier;Landroidx/compose/material/pullrefresh/PullRefreshState;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 1
    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/compose/material/pullrefresh/PullRefreshKt;->pullRefresh(Landroidx/compose/ui/Modifier;Landroidx/compose/material/pullrefresh/PullRefreshState;Z)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic pullRefresh$default(Landroidx/compose/ui/Modifier;Lv3/l;Lv3/p;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    .line 2
    :cond_0
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material/pullrefresh/PullRefreshKt;->pullRefresh(Landroidx/compose/ui/Modifier;Lv3/l;Lv3/p;Z)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic pullRefresh$lambda$1$onRelease(Landroidx/compose/material/pullrefresh/PullRefreshState;FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/material/pullrefresh/PullRefreshState;->onRelease$material_release(F)F

    move-result p0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method
