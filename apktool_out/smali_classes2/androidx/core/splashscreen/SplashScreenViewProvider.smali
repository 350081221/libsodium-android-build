.class public final Landroidx/core/splashscreen/SplashScreenViewProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;,
        Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0011\u0008\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u0019\u0008\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u000c\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\tR\u0011\u0010\u0010\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/core/splashscreen/SplashScreenViewProvider;",
        "",
        "Lkotlin/r2;",
        "remove",
        "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;",
        "impl",
        "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;",
        "Landroid/view/View;",
        "getView",
        "()Landroid/view/View;",
        "view",
        "getIconView",
        "iconView",
        "",
        "getIconAnimationStartMillis",
        "()J",
        "iconAnimationStartMillis",
        "getIconAnimationDurationMillis",
        "iconAnimationDurationMillis",
        "Landroid/app/Activity;",
        "ctx",
        "<init>",
        "(Landroid/app/Activity;)V",
        "Landroid/window/SplashScreenView;",
        "platformView",
        "(Landroid/window/SplashScreenView;Landroid/app/Activity;)V",
        "ViewImpl",
        "ViewImpl31",
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
.field private final impl:Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;

    invoke-direct {v0, p1}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;

    invoke-direct {v0, p1}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;-><init>(Landroid/app/Activity;)V

    .line 4
    :goto_0
    invoke-virtual {v0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->createSplashScreenView()V

    .line 5
    iput-object v0, p0, Landroidx/core/splashscreen/SplashScreenViewProvider;->impl:Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;

    return-void
.end method

.method public constructor <init>(Landroid/window/SplashScreenView;Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/window/SplashScreenView;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/app/Activity;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1f
    .end annotation

    const-string v0, "platformView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctx"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0, p2}, Landroidx/core/splashscreen/SplashScreenViewProvider;-><init>(Landroid/app/Activity;)V

    .line 7
    iget-object p2, p0, Landroidx/core/splashscreen/SplashScreenViewProvider;->impl:Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;

    check-cast p2, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;

    invoke-virtual {p2, p1}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;->setPlatformView(Landroid/window/SplashScreenView;)V

    return-void
.end method


# virtual methods
.method public final getIconAnimationDurationMillis()J
    .locals 2

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreenViewProvider;->impl:Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;

    invoke-virtual {v0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->getIconAnimationDurationMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getIconAnimationStartMillis()J
    .locals 2

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreenViewProvider;->impl:Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;

    invoke-virtual {v0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->getIconAnimationStartMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getIconView()Landroid/view/View;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreenViewProvider;->impl:Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;

    invoke-virtual {v0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->getIconView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreenViewProvider;->impl:Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;

    invoke-virtual {v0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->getSplashScreenView()Landroid/view/ViewGroup;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreenViewProvider;->impl:Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;

    invoke-virtual {v0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->remove()V

    return-void
.end method
