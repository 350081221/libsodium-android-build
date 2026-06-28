.class public final Landroidx/compose/ui/node/ViewInterop_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a3\u0010\u0007\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\u000e\u0010\r\u001a\u0004\u0018\u00010\u000c*\u00020\u0002H\u0000\u001a\u000c\u0010\u000e\u001a\u00020\u000c*\u00020\u0002H\u0000\"\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/node/ViewAdapter;",
        "T",
        "Landroid/view/View;",
        "",
        "id",
        "Lkotlin/Function0;",
        "factory",
        "getOrAddAdapter",
        "(Landroid/view/View;ILv3/a;)Landroidx/compose/ui/node/ViewAdapter;",
        "",
        "key",
        "tagKey",
        "Landroidx/compose/ui/node/MergedViewAdapter;",
        "getViewAdapterIfExists",
        "getViewAdapter",
        "viewAdaptersKey",
        "I",
        "ui_release"
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
        "SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,92:1\n48#2:93\n49#2,4:103\n116#3,2:94\n33#3,6:96\n118#3:102\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n39#1:93\n39#1:103,4\n39#1:94,2\n39#1:96,6\n39#1:102\n*E\n"
    }
.end annotation


# static fields
.field private static final viewAdaptersKey:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "ViewAdapter"

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/ViewInterop_androidKt;->tagKey(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Landroidx/compose/ui/node/ViewInterop_androidKt;->viewAdaptersKey:I

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
.end method

.method public static final getOrAddAdapter(Landroid/view/View;ILv3/a;)Landroidx/compose/ui/node/ViewAdapter;
    .locals 7
    .param p0    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/compose/ui/node/ViewAdapter;",
            ">(",
            "Landroid/view/View;",
            "I",
            "Lv3/a<",
            "+TT;>;)TT;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/ViewInterop_androidKt;->getViewAdapter(Landroid/view/View;)Landroidx/compose/ui/node/MergedViewAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/node/MergedViewAdapter;->getAdapters()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    const/4 v4, 0x0

    .line 16
    if-ge v3, v1, :cond_2

    .line 17
    .line 18
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    move-object v6, v5

    .line 23
    check-cast v6, Landroidx/compose/ui/node/ViewAdapter;

    .line 24
    .line 25
    invoke-interface {v6}, Landroidx/compose/ui/node/ViewAdapter;->getId()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-ne v6, p1, :cond_0

    .line 30
    .line 31
    const/4 v6, 0x1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move v6, v2

    .line 34
    :goto_1
    if-eqz v6, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move-object v5, v4

    .line 41
    :goto_2
    instance-of p1, v5, Landroidx/compose/ui/node/ViewAdapter;

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    move-object v4, v5

    .line 46
    check-cast v4, Landroidx/compose/ui/node/ViewAdapter;

    .line 47
    .line 48
    :cond_3
    if-nez v4, :cond_4

    .line 49
    .line 50
    invoke-interface {p2}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    move-object v4, p1

    .line 55
    check-cast v4, Landroidx/compose/ui/node/ViewAdapter;

    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/compose/ui/node/MergedViewAdapter;->getAdapters()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {p0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_4
    return-object v4
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method public static final getViewAdapter(Landroid/view/View;)Landroidx/compose/ui/node/MergedViewAdapter;
    .locals 3
    .param p0    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    sget v0, Landroidx/compose/ui/node/ViewInterop_androidKt;->viewAdaptersKey:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v2, v1, Landroidx/compose/ui/node/MergedViewAdapter;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast v1, Landroidx/compose/ui/node/MergedViewAdapter;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-nez v1, :cond_1

    .line 16
    .line 17
    new-instance v1, Landroidx/compose/ui/node/MergedViewAdapter;

    .line 18
    .line 19
    invoke-direct {v1}, Landroidx/compose/ui/node/MergedViewAdapter;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-object v1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final getViewAdapterIfExists(Landroid/view/View;)Landroidx/compose/ui/node/MergedViewAdapter;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    sget v0, Landroidx/compose/ui/node/ViewInterop_androidKt;->viewAdaptersKey:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroidx/compose/ui/node/MergedViewAdapter;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/compose/ui/node/MergedViewAdapter;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final tagKey(Ljava/lang/String;)I
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const/high16 v0, 0x3000000

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    or-int/2addr p0, v0

    return p0
.end method
