.class public final Landroidx/compose/ui/text/AndroidTextStyle_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0000\u001a\u001c\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u001e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c\u001a\u001e\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "DefaultIncludeFontPadding",
        "",
        "createPlatformTextStyle",
        "Landroidx/compose/ui/text/PlatformTextStyle;",
        "spanStyle",
        "Landroidx/compose/ui/text/PlatformSpanStyle;",
        "paragraphStyle",
        "Landroidx/compose/ui/text/PlatformParagraphStyle;",
        "lerp",
        "start",
        "stop",
        "fraction",
        "",
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
.field public static final DefaultIncludeFontPadding:Z = false


# direct methods
.method public static final createPlatformTextStyle(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)Landroidx/compose/ui/text/PlatformTextStyle;
    .locals 1
    .param p0    # Landroidx/compose/ui/text/PlatformSpanStyle;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/text/PlatformParagraphStyle;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/ui/text/PlatformTextStyle;

    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/text/PlatformTextStyle;-><init>(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)V

    return-object v0
.end method

.method public static final lerp(Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;F)Landroidx/compose/ui/text/PlatformParagraphStyle;
    .locals 3
    .param p0    # Landroidx/compose/ui/text/PlatformParagraphStyle;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/text/PlatformParagraphStyle;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/text/PlatformParagraphStyle;->getIncludeFontPadding()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroidx/compose/ui/text/PlatformParagraphStyle;->getIncludeFontPadding()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Landroidx/compose/ui/text/PlatformParagraphStyle;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/compose/ui/text/PlatformParagraphStyle;->getEmojiSupportMatch-_3YsG6Y()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v1}, Landroidx/compose/ui/text/EmojiSupportMatch;->box-impl(I)Landroidx/compose/ui/text/EmojiSupportMatch;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1}, Landroidx/compose/ui/text/PlatformParagraphStyle;->getEmojiSupportMatch-_3YsG6Y()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v2}, Landroidx/compose/ui/text/EmojiSupportMatch;->box-impl(I)Landroidx/compose/ui/text/EmojiSupportMatch;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v1, v2, p2}, Landroidx/compose/ui/text/SpanStyleKt;->lerpDiscrete(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroidx/compose/ui/text/EmojiSupportMatch;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroidx/compose/ui/text/EmojiSupportMatch;->unbox-impl()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {p0}, Landroidx/compose/ui/text/PlatformParagraphStyle;->getIncludeFontPadding()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p1}, Landroidx/compose/ui/text/PlatformParagraphStyle;->getIncludeFontPadding()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/text/SpanStyleKt;->lerpDiscrete(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    const/4 p1, 0x0

    .line 67
    invoke-direct {v0, v1, p0, p1}, Landroidx/compose/ui/text/PlatformParagraphStyle;-><init>(IZLkotlin/jvm/internal/w;)V

    .line 68
    .line 69
    .line 70
    return-object v0
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

.method public static final lerp(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformSpanStyle;F)Landroidx/compose/ui/text/PlatformSpanStyle;
    .locals 0
    .param p0    # Landroidx/compose/ui/text/PlatformSpanStyle;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/text/PlatformSpanStyle;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    return-object p0
.end method
