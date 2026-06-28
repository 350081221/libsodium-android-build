.class public final Landroidx/navigation/ActivityNavigatorExtrasKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "ActivityNavigatorExtras",
        "Landroidx/navigation/ActivityNavigator$Extras;",
        "activityOptions",
        "Landroidx/core/app/ActivityOptionsCompat;",
        "flags",
        "",
        "navigation-runtime_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final ActivityNavigatorExtras(Landroidx/core/app/ActivityOptionsCompat;I)Landroidx/navigation/ActivityNavigator$Extras;
    .locals 1
    .param p0    # Landroidx/core/app/ActivityOptionsCompat;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Landroidx/navigation/ActivityNavigator$Extras$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/navigation/ActivityNavigator$Extras$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroidx/navigation/ActivityNavigator$Extras$Builder;->setActivityOptions(Landroidx/core/app/ActivityOptionsCompat;)Landroidx/navigation/ActivityNavigator$Extras$Builder;

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/navigation/ActivityNavigator$Extras$Builder;->addFlags(I)Landroidx/navigation/ActivityNavigator$Extras$Builder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/navigation/ActivityNavigator$Extras$Builder;->build()Landroidx/navigation/ActivityNavigator$Extras;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
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

.method public static synthetic ActivityNavigatorExtras$default(Landroidx/core/app/ActivityOptionsCompat;IILjava/lang/Object;)Landroidx/navigation/ActivityNavigator$Extras;
    .locals 0

    and-int/lit8 p3, p2, 0x1

    if-eqz p3, :cond_0

    const/4 p0, 0x0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    :cond_1
    invoke-static {p0, p1}, Landroidx/navigation/ActivityNavigatorExtrasKt;->ActivityNavigatorExtras(Landroidx/core/app/ActivityOptionsCompat;I)Landroidx/navigation/ActivityNavigator$Extras;

    move-result-object p0

    return-object p0
.end method
