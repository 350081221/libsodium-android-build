.class public final Landroidx/compose/ui/text/android/style/IndentationFixSpanKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/text/android/style/IndentationFixSpanKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001e\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u0000\u001a\u001e\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "EllipsisChar",
        "",
        "getEllipsizedLeftPadding",
        "",
        "Landroid/text/Layout;",
        "lineIndex",
        "",
        "paint",
        "Landroid/graphics/Paint;",
        "getEllipsizedRightPadding",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final EllipsisChar:Ljava/lang/String; = "\u2026"
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public static final getEllipsizedLeftPadding(Landroid/text/Layout;ILandroid/graphics/Paint;)F
    .locals 4
    .param p0    # Landroid/text/Layout;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineLeft(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0, p1}, Landroidx/compose/ui/text/android/TextLayoutKt;->isLineEllipsized(Landroid/text/Layout;I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v3, 0x1

    .line 17
    if-ne v1, v3, :cond_2

    .line 18
    .line 19
    cmpg-float v1, v0, v2

    .line 20
    .line 21
    if-gez v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineStart(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/2addr v1, v2

    .line 32
    invoke-virtual {p0, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sub-float/2addr v1, v0

    .line 37
    const-string/jumbo v2, "\u2026"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    add-float/2addr v1, p2

    .line 45
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphAlignment(I)Landroid/text/Layout$Alignment;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-nez p1, :cond_0

    .line 50
    .line 51
    const/4 p1, -0x1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    sget-object p2, Landroidx/compose/ui/text/android/style/IndentationFixSpanKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    aget p1, p2, p1

    .line 60
    .line 61
    :goto_0
    if-ne p1, v3, :cond_1

    .line 62
    .line 63
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    int-to-float p0, p0

    .line 72
    sub-float/2addr p0, v1

    .line 73
    const/high16 p2, 0x40000000    # 2.0f

    .line 74
    .line 75
    div-float/2addr p0, p2

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    int-to-float p0, p0

    .line 86
    sub-float/2addr p0, v1

    .line 87
    :goto_1
    add-float/2addr p1, p0

    .line 88
    return p1

    .line 89
    :cond_2
    return v2
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

.method public static synthetic getEllipsizedLeftPadding$default(Landroid/text/Layout;ILandroid/graphics/Paint;ILjava/lang/Object;)F
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/text/android/style/IndentationFixSpanKt;->getEllipsizedLeftPadding(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    move-result p0

    return p0
.end method

.method public static final getEllipsizedRightPadding(Landroid/text/Layout;ILandroid/graphics/Paint;)F
    .locals 3
    .param p0    # Landroid/text/Layout;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/text/android/TextLayoutKt;->isLineEllipsized(Landroid/text/Layout;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-ne v0, v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    int-to-float v0, v0

    .line 19
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    cmpg-float v0, v0, v2

    .line 24
    .line 25
    if-gez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineStart(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/2addr v0, v2

    .line 36
    invoke-virtual {p0, v0}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    sub-float/2addr v2, v0

    .line 45
    const-string/jumbo v0, "\u2026"

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    add-float/2addr v2, p2

    .line 53
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphAlignment(I)Landroid/text/Layout$Alignment;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    if-nez p2, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    sget-object v0, Landroidx/compose/ui/text/android/style/IndentationFixSpanKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    aget v1, v0, p2

    .line 67
    .line 68
    :goto_0
    const/4 p2, 0x1

    .line 69
    if-ne v1, p2, :cond_1

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    int-to-float p2, p2

    .line 76
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    sub-float/2addr p2, p1

    .line 81
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    int-to-float p0, p0

    .line 86
    sub-float/2addr p0, v2

    .line 87
    const/high16 p1, 0x40000000    # 2.0f

    .line 88
    .line 89
    div-float/2addr p0, p1

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    int-to-float p2, p2

    .line 96
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    sub-float/2addr p2, p1

    .line 101
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    int-to-float p0, p0

    .line 106
    sub-float/2addr p0, v2

    .line 107
    :goto_1
    sub-float/2addr p2, p0

    .line 108
    return p2

    .line 109
    :cond_2
    const/4 p0, 0x0

    .line 110
    return p0
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

.method public static synthetic getEllipsizedRightPadding$default(Landroid/text/Layout;ILandroid/graphics/Paint;ILjava/lang/Object;)F
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/text/android/style/IndentationFixSpanKt;->getEllipsizedRightPadding(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    move-result p0

    return p0
.end method
