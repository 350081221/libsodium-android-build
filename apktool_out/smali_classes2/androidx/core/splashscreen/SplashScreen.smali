.class public final Landroidx/core/splashscreen/SplashScreen;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "CustomSplashScreen"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/splashscreen/SplashScreen$Companion;,
        Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;,
        Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;,
        Landroidx/core/splashscreen/SplashScreen$Impl;,
        Landroidx/core/splashscreen/SplashScreen$Impl31;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u00112\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\u0011\u0008\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroidx/core/splashscreen/SplashScreen;",
        "",
        "Lkotlin/r2;",
        "install",
        "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;",
        "condition",
        "setKeepOnScreenCondition",
        "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;",
        "listener",
        "setOnExitAnimationListener",
        "Landroidx/core/splashscreen/SplashScreen$Impl;",
        "impl",
        "Landroidx/core/splashscreen/SplashScreen$Impl;",
        "Landroid/app/Activity;",
        "activity",
        "<init>",
        "(Landroid/app/Activity;)V",
        "Companion",
        "Impl",
        "Impl31",
        "KeepOnScreenCondition",
        "OnExitAnimationListener",
        "core-splashscreen_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/core/splashscreen/SplashScreen$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final MASK_FACTOR:F = 0.6666667f


# instance fields
.field private final impl:Landroidx/core/splashscreen/SplashScreen$Impl;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/core/splashscreen/SplashScreen$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/core/splashscreen/SplashScreen$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/core/splashscreen/SplashScreen;->Companion:Landroidx/core/splashscreen/SplashScreen$Companion;

    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1f

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroidx/core/splashscreen/SplashScreen$Impl31;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Landroidx/core/splashscreen/SplashScreen$Impl31;-><init>(Landroid/app/Activity;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Landroidx/core/splashscreen/SplashScreen$Impl;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Landroidx/core/splashscreen/SplashScreen$Impl;-><init>(Landroid/app/Activity;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iput-object v0, p0, Landroidx/core/splashscreen/SplashScreen;->impl:Landroidx/core/splashscreen/SplashScreen$Impl;

    .line 22
    .line 23
    return-void
    .line 24
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/splashscreen/SplashScreen;-><init>(Landroid/app/Activity;)V

    return-void
.end method

.method public static final synthetic access$install(Landroidx/core/splashscreen/SplashScreen;)V
    .locals 0

    invoke-direct {p0}, Landroidx/core/splashscreen/SplashScreen;->install()V

    return-void
.end method

.method private final install()V
    .locals 1

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen;->impl:Landroidx/core/splashscreen/SplashScreen$Impl;

    invoke-virtual {v0}, Landroidx/core/splashscreen/SplashScreen$Impl;->install()V

    return-void
.end method

.method public static final installSplashScreen(Landroid/app/Activity;)Landroidx/core/splashscreen/SplashScreen;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Landroidx/core/splashscreen/SplashScreen;->Companion:Landroidx/core/splashscreen/SplashScreen$Companion;

    invoke-virtual {v0, p0}, Landroidx/core/splashscreen/SplashScreen$Companion;->installSplashScreen(Landroid/app/Activity;)Landroidx/core/splashscreen/SplashScreen;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final setKeepOnScreenCondition(Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;)V
    .locals 1
    .param p1    # Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "condition"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen;->impl:Landroidx/core/splashscreen/SplashScreen$Impl;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/core/splashscreen/SplashScreen$Impl;->setKeepOnScreenCondition(Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public final setOnExitAnimationListener(Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;)V
    .locals 1
    .param p1    # Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen;->impl:Landroidx/core/splashscreen/SplashScreen$Impl;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/core/splashscreen/SplashScreen$Impl;->setOnExitAnimationListener(Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;)V

    .line 9
    .line 10
    .line 11
    return-void
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
