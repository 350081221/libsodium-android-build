.class final Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;
.super Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1f
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/splashscreen/SplashScreenViewProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ViewImpl31"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\tR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0014\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;",
        "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;",
        "Lkotlin/r2;",
        "createSplashScreenView",
        "remove",
        "Landroid/window/SplashScreenView;",
        "platformView",
        "Landroid/window/SplashScreenView;",
        "getPlatformView",
        "()Landroid/window/SplashScreenView;",
        "setPlatformView",
        "(Landroid/window/SplashScreenView;)V",
        "getSplashScreenView",
        "splashScreenView",
        "Landroid/view/View;",
        "getIconView",
        "()Landroid/view/View;",
        "iconView",
        "",
        "getIconAnimationStartMillis",
        "()J",
        "iconAnimationStartMillis",
        "getIconAnimationDurationMillis",
        "iconAnimationDurationMillis",
        "Landroid/app/Activity;",
        "activity",
        "<init>",
        "(Landroid/app/Activity;)V",
        "core-splashscreen_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public platformView:Landroid/window/SplashScreenView;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
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
    invoke-direct {p0, p1}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;-><init>(Landroid/app/Activity;)V

    .line 7
    .line 8
    .line 9
    return-void
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


# virtual methods
.method public createSplashScreenView()V
    .locals 0

    return-void
.end method

.method public getIconAnimationDurationMillis()J
    .locals 2

    invoke-virtual {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;->getPlatformView()Landroid/window/SplashScreenView;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/splashscreen/k;->a(Landroid/window/SplashScreenView;)Ljava/time/Duration;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/core/splashscreen/l;->a(Ljava/time/Duration;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public getIconAnimationStartMillis()J
    .locals 2

    invoke-virtual {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;->getPlatformView()Landroid/window/SplashScreenView;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/splashscreen/m;->a(Landroid/window/SplashScreenView;)Ljava/time/Instant;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/compose/material3/s;->a(Ljava/time/Instant;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public getIconView()Landroid/view/View;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;->getPlatformView()Landroid/window/SplashScreenView;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/splashscreen/j;->a(Landroid/window/SplashScreenView;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final getPlatformView()Landroid/window/SplashScreenView;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;->platformView:Landroid/window/SplashScreenView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "platformView"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic getSplashScreenView()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;->getSplashScreenView()Landroid/window/SplashScreenView;

    move-result-object v0

    return-object v0
.end method

.method public getSplashScreenView()Landroid/window/SplashScreenView;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-virtual {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;->getPlatformView()Landroid/window/SplashScreenView;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;->getPlatformView()Landroid/window/SplashScreenView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/core/splashscreen/i;->a(Landroid/window/SplashScreenView;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->getActivity()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "activity.theme"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->getActivity()Landroid/app/Activity;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "activity.window.decorView"

    .line 34
    .line 35
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x4

    .line 40
    invoke-static {v0, v1, v2, v3, v2}, Landroidx/core/splashscreen/ThemeUtils$Api31;->applyThemesSystemBarAppearance$default(Landroid/content/res/Resources$Theme;Landroid/view/View;Landroid/util/TypedValue;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final setPlatformView(Landroid/window/SplashScreenView;)V
    .locals 1
    .param p1    # Landroid/window/SplashScreenView;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;->platformView:Landroid/window/SplashScreenView;

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
