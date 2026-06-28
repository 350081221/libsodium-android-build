.class public final Landroidx/compose/material3/tokens/TypographyTokensKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "DefaultLineHeightStyle",
        "Landroidx/compose/ui/text/style/LineHeightStyle;",
        "getDefaultLineHeightStyle",
        "()Landroidx/compose/ui/text/style/LineHeightStyle;",
        "DefaultTextStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "getDefaultTextStyle",
        "()Landroidx/compose/ui/text/TextStyle;",
        "material3_release"
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
.field private static final DefaultLineHeightStyle:Landroidx/compose/ui/text/style/LineHeightStyle;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final DefaultTextStyle:Landroidx/compose/ui/text/TextStyle;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 32

    .line 1
    new-instance v0, Landroidx/compose/ui/text/style/LineHeightStyle;

    .line 2
    .line 3
    move-object/from16 v26, v0

    .line 4
    .line 5
    sget-object v1, Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;->Companion:Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;->getCenter-PIaL0Z0()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    sget-object v2, Landroidx/compose/ui/text/style/LineHeightStyle$Trim;->Companion:Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;->getNone-EVpEnUU()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/text/style/LineHeightStyle;-><init>(FILkotlin/jvm/internal/w;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Landroidx/compose/material3/tokens/TypographyTokensKt;->DefaultLineHeightStyle:Landroidx/compose/ui/text/style/LineHeightStyle;

    .line 22
    .line 23
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-wide/16 v1, 0x0

    .line 30
    .line 31
    const-wide/16 v3, 0x0

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const-wide/16 v10, 0x0

    .line 39
    .line 40
    const/4 v12, 0x0

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v14, 0x0

    .line 43
    const-wide/16 v15, 0x0

    .line 44
    .line 45
    const/16 v17, 0x0

    .line 46
    .line 47
    const/16 v18, 0x0

    .line 48
    .line 49
    const/16 v19, 0x0

    .line 50
    .line 51
    const/16 v20, 0x0

    .line 52
    .line 53
    const/16 v21, 0x0

    .line 54
    .line 55
    const-wide/16 v22, 0x0

    .line 56
    .line 57
    const/16 v24, 0x0

    .line 58
    .line 59
    invoke-static {}, Landroidx/compose/material3/DefaultPlatformTextStyle_androidKt;->defaultPlatformTextStyle()Landroidx/compose/ui/text/PlatformTextStyle;

    .line 60
    .line 61
    .line 62
    move-result-object v25

    .line 63
    const/16 v27, 0x0

    .line 64
    .line 65
    const/16 v28, 0x0

    .line 66
    .line 67
    const/16 v29, 0x0

    .line 68
    .line 69
    const v30, 0xe7ffff

    .line 70
    .line 71
    .line 72
    const/16 v31, 0x0

    .line 73
    .line 74
    invoke-static/range {v0 .. v31}, Landroidx/compose/ui/text/TextStyle;->copy-p1EtxEg$default(Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, Landroidx/compose/material3/tokens/TypographyTokensKt;->DefaultTextStyle:Landroidx/compose/ui/text/TextStyle;

    .line 79
    .line 80
    return-void
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
.end method

.method public static final getDefaultLineHeightStyle()Landroidx/compose/ui/text/style/LineHeightStyle;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material3/tokens/TypographyTokensKt;->DefaultLineHeightStyle:Landroidx/compose/ui/text/style/LineHeightStyle;

    return-object v0
.end method

.method public static final getDefaultTextStyle()Landroidx/compose/ui/text/TextStyle;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material3/tokens/TypographyTokensKt;->DefaultTextStyle:Landroidx/compose/ui/text/TextStyle;

    return-object v0
.end method
