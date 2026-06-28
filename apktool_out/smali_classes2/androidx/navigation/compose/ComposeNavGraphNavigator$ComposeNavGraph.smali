.class public final Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;
.super Landroidx/navigation/NavGraph;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/navigation/compose/ComposeNavGraphNavigator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ComposeNavGraph"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bRB\u0010\u0008\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u0006\u00a2\u0006\u0002\u0008\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rRB\u0010\u000f\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u0006\u00a2\u0006\u0002\u0008\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\t\u001a\u0004\u0008\u0010\u0010\u000b\"\u0004\u0008\u0011\u0010\rRB\u0010\u0012\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u0006\u00a2\u0006\u0002\u0008\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\t\u001a\u0004\u0008\u0013\u0010\u000b\"\u0004\u0008\u0014\u0010\rRB\u0010\u0015\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u0006\u00a2\u0006\u0002\u0008\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\t\u001a\u0004\u0008\u0016\u0010\u000b\"\u0004\u0008\u0017\u0010\r\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;",
        "Landroidx/navigation/NavGraph;",
        "Lkotlin/Function1;",
        "Landroidx/compose/animation/AnimatedContentTransitionScope;",
        "Landroidx/navigation/NavBackStackEntry;",
        "Landroidx/compose/animation/EnterTransition;",
        "Lu3/n;",
        "Lkotlin/u;",
        "enterTransition",
        "Lv3/l;",
        "getEnterTransition$navigation_compose_release",
        "()Lv3/l;",
        "setEnterTransition$navigation_compose_release",
        "(Lv3/l;)V",
        "Landroidx/compose/animation/ExitTransition;",
        "exitTransition",
        "getExitTransition$navigation_compose_release",
        "setExitTransition$navigation_compose_release",
        "popEnterTransition",
        "getPopEnterTransition$navigation_compose_release",
        "setPopEnterTransition$navigation_compose_release",
        "popExitTransition",
        "getPopExitTransition$navigation_compose_release",
        "setPopExitTransition$navigation_compose_release",
        "Landroidx/navigation/Navigator;",
        "navGraphNavigator",
        "<init>",
        "(Landroidx/navigation/Navigator;)V",
        "navigation-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private enterTransition:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private exitTransition:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private popEnterTransition:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private popExitTransition:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/navigation/Navigator;)V
    .locals 0
    .param p1    # Landroidx/navigation/Navigator;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/Navigator<",
            "+",
            "Landroidx/navigation/NavGraph;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Landroidx/navigation/NavGraph;-><init>(Landroidx/navigation/Navigator;)V

    return-void
.end method


# virtual methods
.method public final getEnterTransition$navigation_compose_release()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->enterTransition:Lv3/l;

    return-object v0
.end method

.method public final getExitTransition$navigation_compose_release()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->exitTransition:Lv3/l;

    return-object v0
.end method

.method public final getPopEnterTransition$navigation_compose_release()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->popEnterTransition:Lv3/l;

    return-object v0
.end method

.method public final getPopExitTransition$navigation_compose_release()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->popExitTransition:Lv3/l;

    return-object v0
.end method

.method public final setEnterTransition$navigation_compose_release(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->enterTransition:Lv3/l;

    return-void
.end method

.method public final setExitTransition$navigation_compose_release(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->exitTransition:Lv3/l;

    return-void
.end method

.method public final setPopEnterTransition$navigation_compose_release(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->popEnterTransition:Lv3/l;

    return-void
.end method

.method public final setPopExitTransition$navigation_compose_release(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->popExitTransition:Lv3/l;

    return-void
.end method
