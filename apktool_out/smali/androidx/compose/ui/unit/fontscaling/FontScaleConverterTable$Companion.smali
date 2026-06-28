.class public final Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable$Companion;",
        "",
        "()V",
        "lookupAndInterpolate",
        "",
        "sourceValue",
        "sourceValues",
        "",
        "targetValues",
        "ui-unit_release"
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

    invoke-direct {p0}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$lookupAndInterpolate(Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable$Companion;F[F[F)F
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable$Companion;->lookupAndInterpolate(F[F[F)F

    move-result p0

    return p0
.end method

.method private final lookupAndInterpolate(F[F[F)F
    .locals 7

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v5

    .line 5
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 6
    .line 7
    .line 8
    move-result v6

    .line 9
    invoke-static {p2, v5}, Ljava/util/Arrays;->binarySearch([FF)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ltz v0, :cond_0

    .line 14
    .line 15
    aget p1, p3, v0

    .line 16
    .line 17
    :goto_0
    mul-float/2addr v6, p1

    .line 18
    goto :goto_3

    .line 19
    :cond_0
    const/4 v1, 0x1

    .line 20
    add-int/2addr v0, v1

    .line 21
    neg-int v0, v0

    .line 22
    sub-int/2addr v0, v1

    .line 23
    array-length v2, p2

    .line 24
    sub-int/2addr v2, v1

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    if-lt v0, v2, :cond_3

    .line 28
    .line 29
    array-length v0, p2

    .line 30
    sub-int/2addr v0, v1

    .line 31
    aget v0, p2, v0

    .line 32
    .line 33
    array-length p2, p2

    .line 34
    sub-int/2addr p2, v1

    .line 35
    aget p2, p3, p2

    .line 36
    .line 37
    cmpg-float p3, v0, v4

    .line 38
    .line 39
    if-nez p3, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v1, v3

    .line 43
    :goto_1
    if-eqz v1, :cond_2

    .line 44
    .line 45
    return v4

    .line 46
    :cond_2
    div-float/2addr p2, v0

    .line 47
    mul-float/2addr p1, p2

    .line 48
    return p1

    .line 49
    :cond_3
    const/4 p1, -0x1

    .line 50
    if-ne v0, p1, :cond_4

    .line 51
    .line 52
    aget p1, p2, v3

    .line 53
    .line 54
    aget p2, p3, v3

    .line 55
    .line 56
    move v2, p2

    .line 57
    move v1, v4

    .line 58
    move v3, v1

    .line 59
    move v4, p1

    .line 60
    goto :goto_2

    .line 61
    :cond_4
    aget p1, p2, v0

    .line 62
    .line 63
    add-int/lit8 v1, v0, 0x1

    .line 64
    .line 65
    aget p2, p2, v1

    .line 66
    .line 67
    aget v0, p3, v0

    .line 68
    .line 69
    aget p3, p3, v1

    .line 70
    .line 71
    move v3, p1

    .line 72
    move v4, p2

    .line 73
    move v2, p3

    .line 74
    move v1, v0

    .line 75
    :goto_2
    sget-object v0, Landroidx/compose/ui/unit/fontscaling/MathUtils;->INSTANCE:Landroidx/compose/ui/unit/fontscaling/MathUtils;

    .line 76
    .line 77
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/unit/fontscaling/MathUtils;->constrainedMap(FFFFF)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    goto :goto_0

    .line 82
    :goto_3
    return v6
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
