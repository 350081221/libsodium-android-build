.class public final Landroidx/navigation/ui/AppBarConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/navigation/ui/AppBarConfiguration$Builder;,
        Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B)\u0008\u0002\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8G\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/navigation/ui/AppBarConfiguration;",
        "",
        "topLevelDestinations",
        "",
        "",
        "openableLayout",
        "Landroidx/customview/widget/Openable;",
        "fallbackOnNavigateUpListener",
        "Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;",
        "(Ljava/util/Set;Landroidx/customview/widget/Openable;Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;)V",
        "drawerLayout",
        "Landroidx/drawerlayout/widget/DrawerLayout;",
        "getDrawerLayout",
        "()Landroidx/drawerlayout/widget/DrawerLayout;",
        "getFallbackOnNavigateUpListener",
        "()Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;",
        "getOpenableLayout",
        "()Landroidx/customview/widget/Openable;",
        "getTopLevelDestinations",
        "()Ljava/util/Set;",
        "isTopLevelDestination",
        "",
        "destination",
        "Landroidx/navigation/NavDestination;",
        "Builder",
        "OnNavigateUpListener",
        "navigation-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,307:1\n1229#2,2:308\n*S KotlinDebug\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n*L\n100#1:308,2\n*E\n"
    }
.end annotation


# instance fields
.field private final fallbackOnNavigateUpListener:Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final openableLayout:Landroidx/customview/widget/Openable;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final topLevelDestinations:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/Set;Landroidx/customview/widget/Openable;Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/customview/widget/Openable;",
            "Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/navigation/ui/AppBarConfiguration;->topLevelDestinations:Ljava/util/Set;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/navigation/ui/AppBarConfiguration;->openableLayout:Landroidx/customview/widget/Openable;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/navigation/ui/AppBarConfiguration;->fallbackOnNavigateUpListener:Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;

    .line 9
    .line 10
    return-void
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

.method public synthetic constructor <init>(Ljava/util/Set;Landroidx/customview/widget/Openable;Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/navigation/ui/AppBarConfiguration;-><init>(Ljava/util/Set;Landroidx/customview/widget/Openable;Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;)V

    return-void
.end method


# virtual methods
.method public final getDrawerLayout()Landroidx/drawerlayout/widget/DrawerLayout;
    .locals 2
    .annotation runtime Lkotlin/k;
        message = "Use {@link #getOpenableLayout()}."
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/ui/AppBarConfiguration;->openableLayout:Landroidx/customview/widget/Openable;

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    return-object v0
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
.end method

.method public final getFallbackOnNavigateUpListener()Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/navigation/ui/AppBarConfiguration;->fallbackOnNavigateUpListener:Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;

    return-object v0
.end method

.method public final getOpenableLayout()Landroidx/customview/widget/Openable;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/navigation/ui/AppBarConfiguration;->openableLayout:Landroidx/customview/widget/Openable;

    return-object v0
.end method

.method public final getTopLevelDestinations()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/navigation/ui/AppBarConfiguration;->topLevelDestinations:Ljava/util/Set;

    return-object v0
.end method

.method public final isTopLevelDestination(Landroidx/navigation/NavDestination;)Z
    .locals 6
    .param p1    # Landroidx/navigation/NavDestination;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "destination"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/navigation/NavDestination;->Companion:Landroidx/navigation/NavDestination$Companion;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/navigation/NavDestination$Companion;->getHierarchy(Landroidx/navigation/NavDestination;)Lkotlin/sequences/m;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lkotlin/sequences/m;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroidx/navigation/NavDestination;

    .line 28
    .line 29
    iget-object v3, p0, Landroidx/navigation/ui/AppBarConfiguration;->topLevelDestinations:Ljava/util/Set;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroidx/navigation/NavDestination;->getId()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v4, 0x1

    .line 44
    if-ne v3, v4, :cond_2

    .line 45
    .line 46
    instance-of v3, v1, Landroidx/navigation/NavGraph;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1}, Landroidx/navigation/NavDestination;->getId()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    sget-object v5, Landroidx/navigation/NavGraph;->Companion:Landroidx/navigation/NavGraph$Companion;

    .line 55
    .line 56
    check-cast v1, Landroidx/navigation/NavGraph;

    .line 57
    .line 58
    invoke-virtual {v5, v1}, Landroidx/navigation/NavGraph$Companion;->findStartDestination(Landroidx/navigation/NavGraph;)Landroidx/navigation/NavDestination;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Landroidx/navigation/NavDestination;->getId()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-ne v3, v1, :cond_2

    .line 67
    .line 68
    :cond_1
    move v2, v4

    .line 69
    :cond_2
    if-eqz v2, :cond_0

    .line 70
    .line 71
    move v2, v4

    .line 72
    :cond_3
    return v2
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
