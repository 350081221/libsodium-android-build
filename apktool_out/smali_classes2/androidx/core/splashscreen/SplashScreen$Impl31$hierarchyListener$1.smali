.class public final Landroidx/core/splashscreen/SplashScreen$Impl31$hierarchyListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/splashscreen/SplashScreen$Impl31;-><init>(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00052\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "androidx/core/splashscreen/SplashScreen$Impl31$hierarchyListener$1",
        "Landroid/view/ViewGroup$OnHierarchyChangeListener;",
        "Landroid/view/View;",
        "parent",
        "child",
        "Lkotlin/r2;",
        "onChildViewAdded",
        "onChildViewRemoved",
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
.field final synthetic $activity:Landroid/app/Activity;

.field final synthetic this$0:Landroidx/core/splashscreen/SplashScreen$Impl31;


# direct methods
.method constructor <init>(Landroidx/core/splashscreen/SplashScreen$Impl31;Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl31$hierarchyListener$1;->this$0:Landroidx/core/splashscreen/SplashScreen$Impl31;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/core/splashscreen/SplashScreen$Impl31$hierarchyListener$1;->$activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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


# virtual methods
.method public onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    instance-of p1, p2, Landroid/window/SplashScreenView;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl31$hierarchyListener$1;->this$0:Landroidx/core/splashscreen/SplashScreen$Impl31;

    .line 6
    .line 7
    check-cast p2, Landroid/window/SplashScreenView;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroidx/core/splashscreen/SplashScreen$Impl31;->computeDecorFitsWindow(Landroid/window/SplashScreenView;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-virtual {p1, p2}, Landroidx/core/splashscreen/SplashScreen$Impl31;->setMDecorFitWindowInsets(Z)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl31$hierarchyListener$1;->$activity:Landroid/app/Activity;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/view/ViewGroup;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
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

.method public onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lp4/m;
        .end annotation
    .end param

    return-void
.end method
