.class public final Landroidx/navigation/Navigation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u001e\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u00042\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/navigation/Navigation;",
        "",
        "Landroid/app/Activity;",
        "activity",
        "",
        "viewId",
        "Landroidx/navigation/NavController;",
        "findNavController",
        "Landroid/view/View;",
        "view",
        "resId",
        "Landroid/os/Bundle;",
        "args",
        "Landroid/view/View$OnClickListener;",
        "createNavigateOnClickListener",
        "Landroidx/navigation/NavDirections;",
        "directions",
        "controller",
        "Lkotlin/r2;",
        "setViewNavController",
        "findViewNavController",
        "getViewNavController",
        "<init>",
        "()V",
        "navigation-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/navigation/Navigation;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/navigation/Navigation;

    invoke-direct {v0}, Landroidx/navigation/Navigation;-><init>()V

    sput-object v0, Landroidx/navigation/Navigation;->INSTANCE:Landroidx/navigation/Navigation;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(ILandroid/os/Bundle;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/navigation/Navigation;->createNavigateOnClickListener$lambda$0(ILandroid/os/Bundle;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getViewNavController(Landroidx/navigation/Navigation;Landroid/view/View;)Landroidx/navigation/NavController;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/navigation/Navigation;->getViewNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/navigation/NavDirections;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/navigation/Navigation;->createNavigateOnClickListener$lambda$1(Landroidx/navigation/NavDirections;Landroid/view/View;)V

    return-void
.end method

.method public static final createNavigateOnClickListener(I)Landroid/view/View$OnClickListener;
    .locals 2
    .param p0    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, Landroidx/navigation/Navigation;->createNavigateOnClickListener$default(ILandroid/os/Bundle;ILjava/lang/Object;)Landroid/view/View$OnClickListener;

    move-result-object p0

    return-object p0
.end method

.method public static final createNavigateOnClickListener(ILandroid/os/Bundle;)Landroid/view/View$OnClickListener;
    .locals 1
    .param p0    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param
    .param p1    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    .line 1
    new-instance v0, Landroidx/navigation/c;

    invoke-direct {v0, p0, p1}, Landroidx/navigation/c;-><init>(ILandroid/os/Bundle;)V

    return-object v0
.end method

.method public static final createNavigateOnClickListener(Landroidx/navigation/NavDirections;)Landroid/view/View$OnClickListener;
    .locals 1
    .param p0    # Landroidx/navigation/NavDirections;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    const-string v0, "directions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/navigation/b;

    invoke-direct {v0, p0}, Landroidx/navigation/b;-><init>(Landroidx/navigation/NavDirections;)V

    return-object v0
.end method

.method public static synthetic createNavigateOnClickListener$default(ILandroid/os/Bundle;ILjava/lang/Object;)Landroid/view/View$OnClickListener;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Landroidx/navigation/Navigation;->createNavigateOnClickListener(ILandroid/os/Bundle;)Landroid/view/View$OnClickListener;

    move-result-object p0

    return-object p0
.end method

.method private static final createNavigateOnClickListener$lambda$0(ILandroid/os/Bundle;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "view"

    .line 2
    .line 3
    .line 4
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Landroidx/navigation/Navigation;->findNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2, p0, p1}, Landroidx/navigation/NavController;->navigate(ILandroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method private static final createNavigateOnClickListener$lambda$1(Landroidx/navigation/NavDirections;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "$directions"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "view"

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Landroidx/navigation/Navigation;->findNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1, p0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 17
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

.method public static final findNavController(Landroid/app/Activity;I)Landroidx/navigation/NavController;
    .locals 3
    .param p0    # Landroid/app/Activity;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    const-string v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0, p1}, Landroidx/core/app/ActivityCompat;->requireViewById(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    const-string v1, "requireViewById<View>(activity, viewId)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v1, Landroidx/navigation/Navigation;->INSTANCE:Landroidx/navigation/Navigation;

    invoke-direct {v1, v0}, Landroidx/navigation/Navigation;->findViewNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Activity "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " does not have a NavController set on "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 5
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final findNavController(Landroid/view/View;)Landroidx/navigation/NavController;
    .locals 3
    .param p0    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget-object v0, Landroidx/navigation/Navigation;->INSTANCE:Landroidx/navigation/Navigation;

    invoke-direct {v0, p0}, Landroidx/navigation/Navigation;->findViewNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "View "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " does not have a NavController set"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final findViewNavController(Landroid/view/View;)Landroidx/navigation/NavController;
    .locals 1

    .line 1
    sget-object v0, Landroidx/navigation/Navigation$findViewNavController$1;->INSTANCE:Landroidx/navigation/Navigation$findViewNavController$1;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/sequences/p;->l(Ljava/lang/Object;Lv3/l;)Lkotlin/sequences/m;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Landroidx/navigation/Navigation$findViewNavController$2;->INSTANCE:Landroidx/navigation/Navigation$findViewNavController$2;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/sequences/p;->p1(Lkotlin/sequences/m;Lv3/l;)Lkotlin/sequences/m;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lkotlin/sequences/p;->F0(Lkotlin/sequences/m;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroidx/navigation/NavController;

    .line 18
    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private final getViewNavController(Landroid/view/View;)Landroidx/navigation/NavController;
    .locals 1

    .line 1
    sget v0, Landroidx/navigation/R$id;->nav_controller_view_tag:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of v0, p1, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroidx/navigation/NavController;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    instance-of v0, p1, Landroidx/navigation/NavController;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p1, Landroidx/navigation/NavController;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    :goto_0
    return-object p1
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

.method public static final setViewNavController(Landroid/view/View;Landroidx/navigation/NavController;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/navigation/NavController;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation runtime Lu3/m;
    .end annotation

    .line 1
    const-string/jumbo v0, "view"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sget v0, Landroidx/navigation/R$id;->nav_controller_view_tag:I

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
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
