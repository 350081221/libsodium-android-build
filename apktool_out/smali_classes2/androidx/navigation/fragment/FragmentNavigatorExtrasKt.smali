.class public final Landroidx/navigation/fragment/FragmentNavigatorExtrasKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a9\u0010\u0006\u001a\u00020\u00052*\u0010\u0004\u001a\u0016\u0012\u0012\u0008\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "Lkotlin/u0;",
        "Landroid/view/View;",
        "",
        "sharedElements",
        "Landroidx/navigation/fragment/FragmentNavigator$Extras;",
        "FragmentNavigatorExtras",
        "([Lkotlin/u0;)Landroidx/navigation/fragment/FragmentNavigator$Extras;",
        "navigation-fragment_release"
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
        "SMAP\nFragmentNavigatorExtras.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorExtras.kt\nandroidx/navigation/fragment/FragmentNavigatorExtrasKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n13579#2,2:36\n*S KotlinDebug\n*F\n+ 1 FragmentNavigatorExtras.kt\nandroidx/navigation/fragment/FragmentNavigatorExtrasKt\n*L\n31#1:36,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final varargs FragmentNavigatorExtras([Lkotlin/u0;)Landroidx/navigation/fragment/FragmentNavigator$Extras;
    .locals 5
    .param p0    # [Lkotlin/u0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lkotlin/u0<",
            "+",
            "Landroid/view/View;",
            "Ljava/lang/String;",
            ">;)",
            "Landroidx/navigation/fragment/FragmentNavigator$Extras;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "sharedElements"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;

    .line 7
    .line 8
    invoke-direct {v0}, Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;-><init>()V

    .line 9
    .line 10
    .line 11
    array-length v1, p0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_0

    .line 14
    .line 15
    aget-object v3, p0, v2

    .line 16
    .line 17
    invoke-virtual {v3}, Lkotlin/u0;->component1()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v3}, Lkotlin/u0;->component2()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v4, v3}, Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;->addSharedElement(Landroid/view/View;Ljava/lang/String;)Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;

    .line 30
    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v0}, Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;->build()Landroidx/navigation/fragment/FragmentNavigator$Extras;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
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
