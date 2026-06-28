.class public final Landroidx/compose/material3/ListItemType$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/material3/ListItemType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\u0005\u0010\u0006R\u0019\u0010\u0008\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/material3/ListItemType$Companion;",
        "",
        "()V",
        "OneLine",
        "Landroidx/compose/material3/ListItemType;",
        "getOneLine-AlXitO8",
        "()I",
        "I",
        "ThreeLine",
        "getThreeLine-AlXitO8",
        "TwoLine",
        "getTwoLine-AlXitO8",
        "getListItemType",
        "hasOverline",
        "",
        "hasSupporting",
        "isSupportingMultiline",
        "getListItemType-Z-LSjz4$material3_release",
        "(ZZZ)I",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/material3/ListItemType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getListItemType-Z-LSjz4$material3_release(ZZZ)I
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_1

    .line 4
    .line 5
    :cond_0
    if-eqz p3, :cond_2

    .line 6
    .line 7
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/material3/ListItemType$Companion;->getThreeLine-AlXitO8()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    goto :goto_1

    .line 12
    :cond_2
    if-nez p1, :cond_4

    .line 13
    .line 14
    if-eqz p2, :cond_3

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/material3/ListItemType$Companion;->getOneLine-AlXitO8()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    goto :goto_1

    .line 22
    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/material3/ListItemType$Companion;->getTwoLine-AlXitO8()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    :goto_1
    return p1
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

.method public final getOneLine-AlXitO8()I
    .locals 1

    invoke-static {}, Landroidx/compose/material3/ListItemType;->access$getOneLine$cp()I

    move-result v0

    return v0
.end method

.method public final getThreeLine-AlXitO8()I
    .locals 1

    invoke-static {}, Landroidx/compose/material3/ListItemType;->access$getThreeLine$cp()I

    move-result v0

    return v0
.end method

.method public final getTwoLine-AlXitO8()I
    .locals 1

    invoke-static {}, Landroidx/compose/material3/ListItemType;->access$getTwoLine$cp()I

    move-result v0

    return v0
.end method
