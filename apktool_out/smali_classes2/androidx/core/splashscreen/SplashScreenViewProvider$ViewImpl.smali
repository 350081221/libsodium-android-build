.class Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/splashscreen/SplashScreenViewProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ViewImpl"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0008\u0008\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0018\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;",
        "",
        "Lkotlin/r2;",
        "createSplashScreenView",
        "remove",
        "Landroid/app/Activity;",
        "activity",
        "Landroid/app/Activity;",
        "getActivity",
        "()Landroid/app/Activity;",
        "Landroid/view/ViewGroup;",
        "_splashScreenView$delegate",
        "Lkotlin/d0;",
        "get_splashScreenView",
        "()Landroid/view/ViewGroup;",
        "_splashScreenView",
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
.field private final _splashScreenView$delegate:Lkotlin/d0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final activity:Landroid/app/Activity;
    .annotation build Lp4/l;
    .end annotation
.end field


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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->activity:Landroid/app/Activity;

    .line 10
    .line 11
    new-instance p1, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl$_splashScreenView$2;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl$_splashScreenView$2;-><init>(Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/e0;->c(Lv3/a;)Lkotlin/d0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->_splashScreenView$delegate:Lkotlin/d0;

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method private final get_splashScreenView()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->_splashScreenView$delegate:Lkotlin/d0;

    invoke-interface {v0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method


# virtual methods
.method public createSplashScreenView()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    const v1, 0x1020002

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast v0, Landroid/view/ViewGroup;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->get_splashScreenView()Landroid/view/ViewGroup;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
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

.method public final getActivity()Landroid/app/Activity;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->activity:Landroid/app/Activity;

    return-object v0
.end method

.method public getIconAnimationDurationMillis()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getIconAnimationStartMillis()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getIconView()Landroid/view/View;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->getSplashScreenView()Landroid/view/ViewGroup;

    move-result-object v0

    sget v1, Landroidx/core/splashscreen/R$id;->splashscreen_icon_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "splashScreenView.findVie\u2026d.splashscreen_icon_view)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getSplashScreenView()Landroid/view/ViewGroup;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-direct {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->get_splashScreenView()Landroid/view/ViewGroup;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    invoke-virtual {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->getSplashScreenView()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;->getSplashScreenView()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    return-void
.end method
