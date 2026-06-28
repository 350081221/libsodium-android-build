.class public final Landroidx/compose/material3/SnackbarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\u001a\u0099\u0001\u0010\u0013\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0015\u0008\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u00042\u0015\u0008\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001aj\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000bH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001ae\u0010\u001e\u001a\u00020\u00032\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001ag\u0010\"\u001a\u00020\u00032\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u00042\u0013\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\u001d\"\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010%\"\u0014\u0010\'\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010%\"\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010%\"\u0014\u0010)\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010%\"\u0014\u0010*\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010%\"\u0014\u0010+\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010%\"\u0014\u0010,\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010%\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006-"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "action",
        "dismissAction",
        "",
        "actionOnNewLine",
        "Landroidx/compose/ui/graphics/Shape;",
        "shape",
        "Landroidx/compose/ui/graphics/Color;",
        "containerColor",
        "contentColor",
        "actionContentColor",
        "dismissActionContentColor",
        "content",
        "Snackbar-eQBnUkQ",
        "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;ZLandroidx/compose/ui/graphics/Shape;JJJJLv3/p;Landroidx/compose/runtime/Composer;II)V",
        "Snackbar",
        "Landroidx/compose/material3/SnackbarData;",
        "snackbarData",
        "actionColor",
        "Snackbar-sDKtq54",
        "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V",
        "text",
        "Landroidx/compose/ui/text/TextStyle;",
        "actionTextStyle",
        "NewLineButtonSnackbar-kKq0p4A",
        "(Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V",
        "NewLineButtonSnackbar",
        "actionTextColor",
        "dismissActionColor",
        "OneRowSnackbar-kKq0p4A",
        "OneRowSnackbar",
        "Landroidx/compose/ui/unit/Dp;",
        "ContainerMaxWidth",
        "F",
        "HeightToFirstLine",
        "HorizontalSpacing",
        "HorizontalSpacingButtonSide",
        "SeparateButtonExtraY",
        "SnackbarVerticalPadding",
        "TextEndExtraSpacing",
        "LongButtonVerticalOffset",
        "material3_release"
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
        "SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,437:1\n154#2:438\n154#2:514\n154#2:601\n154#2:760\n154#2:761\n154#2:762\n154#2:763\n154#2:764\n154#2:765\n154#2:766\n154#2:767\n74#3,6:439\n80#3:473\n84#3:600\n78#4,11:445\n78#4,11:480\n91#4:512\n78#4,11:521\n78#4,11:557\n91#4:589\n91#4:594\n91#4:599\n78#4,11:608\n78#4,11:642\n91#4:674\n78#4,11:682\n91#4:714\n78#4,11:722\n91#4:754\n91#4:759\n456#5,8:456\n464#5,3:470\n456#5,8:491\n464#5,3:505\n467#5,3:509\n456#5,8:532\n464#5,3:546\n456#5,8:568\n464#5,3:582\n467#5,3:586\n467#5,3:591\n467#5,3:596\n456#5,8:619\n464#5,3:633\n456#5,8:653\n464#5,3:667\n467#5,3:671\n456#5,8:693\n464#5,3:707\n467#5,3:711\n456#5,8:733\n464#5,3:747\n467#5,3:751\n467#5,3:756\n3737#6,6:464\n3737#6,6:499\n3737#6,6:540\n3737#6,6:576\n3737#6,6:627\n3737#6,6:661\n3737#6,6:701\n3737#6,6:741\n68#7,6:474\n74#7:508\n78#7:513\n68#7,6:515\n74#7:549\n78#7:595\n68#7,6:636\n74#7:670\n78#7:675\n68#7,6:676\n74#7:710\n78#7:715\n68#7,6:716\n74#7:750\n78#7:755\n86#8,7:550\n93#8:585\n97#8:590\n1116#9,6:602\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n*L\n240#1:438\n279#1:514\n333#1:601\n429#1:760\n430#1:761\n431#1:762\n432#1:763\n433#1:764\n434#1:765\n435#1:766\n436#1:767\n262#1:439,6\n262#1:473\n262#1:600\n262#1:445,11\n272#1:480,11\n272#1:512\n277#1:521,11\n281#1:557,11\n281#1:589\n277#1:594\n262#1:599\n310#1:608,11\n312#1:642,11\n312#1:674\n314#1:682,11\n314#1:714\n323#1:722,11\n323#1:754\n310#1:759\n262#1:456,8\n262#1:470,3\n272#1:491,8\n272#1:505,3\n272#1:509,3\n277#1:532,8\n277#1:546,3\n281#1:568,8\n281#1:582,3\n281#1:586,3\n277#1:591,3\n262#1:596,3\n310#1:619,8\n310#1:633,3\n312#1:653,8\n312#1:667,3\n312#1:671,3\n314#1:693,8\n314#1:707,3\n314#1:711,3\n323#1:733,8\n323#1:747,3\n323#1:751,3\n310#1:756,3\n262#1:464,6\n272#1:499,6\n277#1:540,6\n281#1:576,6\n310#1:627,6\n312#1:661,6\n314#1:701,6\n323#1:741,6\n272#1:474,6\n272#1:508\n272#1:513\n277#1:515,6\n277#1:549\n277#1:595\n312#1:636,6\n312#1:670\n312#1:675\n314#1:676,6\n314#1:710\n314#1:715\n323#1:716,6\n323#1:750\n323#1:755\n281#1:550,7\n281#1:585\n281#1:590\n335#1:602,6\n*E\n"
    }
.end annotation


# static fields
.field private static final ContainerMaxWidth:F

.field private static final HeightToFirstLine:F

.field private static final HorizontalSpacing:F

.field private static final HorizontalSpacingButtonSide:F

.field private static final LongButtonVerticalOffset:F

.field private static final SeparateButtonExtraY:F

.field private static final SnackbarVerticalPadding:F

.field private static final TextEndExtraSpacing:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x258

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Landroidx/compose/material3/SnackbarKt;->ContainerMaxWidth:F

    .line 9
    .line 10
    const/16 v0, 0x1e

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sput v0, Landroidx/compose/material3/SnackbarKt;->HeightToFirstLine:F

    .line 18
    .line 19
    const/16 v0, 0x10

    .line 20
    .line 21
    int-to-float v0, v0

    .line 22
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sput v0, Landroidx/compose/material3/SnackbarKt;->HorizontalSpacing:F

    .line 27
    .line 28
    const/16 v0, 0x8

    .line 29
    .line 30
    int-to-float v0, v0

    .line 31
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    sput v1, Landroidx/compose/material3/SnackbarKt;->HorizontalSpacingButtonSide:F

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    int-to-float v1, v1

    .line 39
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    sput v1, Landroidx/compose/material3/SnackbarKt;->SeparateButtonExtraY:F

    .line 44
    .line 45
    const/4 v1, 0x6

    .line 46
    int-to-float v1, v1

    .line 47
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    sput v1, Landroidx/compose/material3/SnackbarKt;->SnackbarVerticalPadding:F

    .line 52
    .line 53
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    sput v0, Landroidx/compose/material3/SnackbarKt;->TextEndExtraSpacing:F

    .line 58
    .line 59
    const/16 v0, 0xc

    .line 60
    .line 61
    int-to-float v0, v0

    .line 62
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    sput v0, Landroidx/compose/material3/SnackbarKt;->LongButtonVerticalOffset:F

    .line 67
    .line 68
    return-void
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
.end method

.method private static final NewLineButtonSnackbar-kKq0p4A(Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V
    .locals 31
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/text/TextStyle;",
            "JJ",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v9, p9

    .line 10
    .line 11
    const v0, -0x4f6c4929

    .line 12
    .line 13
    .line 14
    move-object/from16 v5, p8

    .line 15
    .line 16
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    and-int/lit8 v6, v9, 0x6

    .line 21
    .line 22
    if-nez v6, :cond_1

    .line 23
    .line 24
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    const/4 v6, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v6, 0x2

    .line 33
    :goto_0
    or-int/2addr v6, v9

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v6, v9

    .line 36
    :goto_1
    and-int/lit8 v8, v9, 0x30

    .line 37
    .line 38
    if-nez v8, :cond_3

    .line 39
    .line 40
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-eqz v8, :cond_2

    .line 45
    .line 46
    const/16 v8, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v8, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v6, v8

    .line 52
    :cond_3
    and-int/lit16 v8, v9, 0x180

    .line 53
    .line 54
    if-nez v8, :cond_5

    .line 55
    .line 56
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_4

    .line 61
    .line 62
    const/16 v8, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v8, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v6, v8

    .line 68
    :cond_5
    and-int/lit16 v8, v9, 0xc00

    .line 69
    .line 70
    if-nez v8, :cond_7

    .line 71
    .line 72
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_6

    .line 77
    .line 78
    const/16 v8, 0x800

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_6
    const/16 v8, 0x400

    .line 82
    .line 83
    :goto_4
    or-int/2addr v6, v8

    .line 84
    :cond_7
    and-int/lit16 v8, v9, 0x6000

    .line 85
    .line 86
    move-wide/from16 v10, p4

    .line 87
    .line 88
    if-nez v8, :cond_9

    .line 89
    .line 90
    invoke-interface {v5, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_8

    .line 95
    .line 96
    const/16 v8, 0x4000

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    const/16 v8, 0x2000

    .line 100
    .line 101
    :goto_5
    or-int/2addr v6, v8

    .line 102
    :cond_9
    const/high16 v8, 0x30000

    .line 103
    .line 104
    and-int/2addr v8, v9

    .line 105
    move-wide/from16 v12, p6

    .line 106
    .line 107
    if-nez v8, :cond_b

    .line 108
    .line 109
    invoke-interface {v5, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-eqz v8, :cond_a

    .line 114
    .line 115
    const/high16 v8, 0x20000

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_a
    const/high16 v8, 0x10000

    .line 119
    .line 120
    :goto_6
    or-int/2addr v6, v8

    .line 121
    :cond_b
    const v8, 0x12493

    .line 122
    .line 123
    .line 124
    and-int/2addr v8, v6

    .line 125
    const v14, 0x12492

    .line 126
    .line 127
    .line 128
    if-ne v8, v14, :cond_d

    .line 129
    .line 130
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-nez v8, :cond_c

    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_d

    .line 141
    .line 142
    :cond_d
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_e

    .line 147
    .line 148
    const/4 v8, -0x1

    .line 149
    const-string v14, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:260)"

    .line 150
    .line 151
    invoke-static {v0, v6, v8, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_e
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 155
    .line 156
    sget v8, Landroidx/compose/material3/SnackbarKt;->ContainerMaxWidth:F

    .line 157
    .line 158
    const/4 v14, 0x0

    .line 159
    const/4 v15, 0x1

    .line 160
    const/4 v7, 0x0

    .line 161
    invoke-static {v0, v14, v8, v15, v7}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    invoke-static {v8, v14, v15, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 166
    .line 167
    .line 168
    move-result-object v16

    .line 169
    sget v17, Landroidx/compose/material3/SnackbarKt;->HorizontalSpacing:F

    .line 170
    .line 171
    const/16 v18, 0x0

    .line 172
    .line 173
    const/16 v19, 0x0

    .line 174
    .line 175
    sget v20, Landroidx/compose/material3/SnackbarKt;->SeparateButtonExtraY:F

    .line 176
    .line 177
    const/16 v21, 0x6

    .line 178
    .line 179
    const/16 v22, 0x0

    .line 180
    .line 181
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    const v8, -0x1cd0f17e

    .line 186
    .line 187
    .line 188
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 189
    .line 190
    .line 191
    sget-object v8, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 192
    .line 193
    invoke-virtual {v8}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    sget-object v16, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 198
    .line 199
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 200
    .line 201
    .line 202
    move-result-object v15

    .line 203
    const/4 v9, 0x0

    .line 204
    invoke-static {v14, v15, v5, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    const v15, -0x4ee9b9da

    .line 209
    .line 210
    .line 211
    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 212
    .line 213
    .line 214
    invoke-static {v5, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 215
    .line 216
    .line 217
    move-result v18

    .line 218
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    sget-object v20, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 223
    .line 224
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 233
    .line 234
    .line 235
    move-result-object v10

    .line 236
    instance-of v10, v10, Landroidx/compose/runtime/Applier;

    .line 237
    .line 238
    if-nez v10, :cond_f

    .line 239
    .line 240
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 241
    .line 242
    .line 243
    :cond_f
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 244
    .line 245
    .line 246
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    if-eqz v10, :cond_10

    .line 251
    .line 252
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 253
    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_10
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 257
    .line 258
    .line 259
    :goto_8
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 264
    .line 265
    .line 266
    move-result-object v10

    .line 267
    invoke-static {v9, v14, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    invoke-static {v9, v15, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 282
    .line 283
    .line 284
    move-result v11

    .line 285
    if-nez v11, :cond_11

    .line 286
    .line 287
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v11

    .line 291
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object v14

    .line 295
    invoke-static {v11, v14}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v11

    .line 299
    if-nez v11, :cond_12

    .line 300
    .line 301
    :cond_11
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v11

    .line 305
    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v11

    .line 312
    invoke-interface {v9, v11, v10}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 313
    .line 314
    .line 315
    :cond_12
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 316
    .line 317
    .line 318
    move-result-object v9

    .line 319
    invoke-static {v9}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    const/4 v10, 0x0

    .line 324
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v11

    .line 328
    invoke-interface {v7, v9, v5, v11}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    const v7, 0x7ab4aae9

    .line 332
    .line 333
    .line 334
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 335
    .line 336
    .line 337
    sget-object v9, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 338
    .line 339
    sget v10, Landroidx/compose/material3/SnackbarKt;->HeightToFirstLine:F

    .line 340
    .line 341
    sget v11, Landroidx/compose/material3/SnackbarKt;->LongButtonVerticalOffset:F

    .line 342
    .line 343
    invoke-static {v0, v10, v11}, Landroidx/compose/foundation/layout/AlignmentLineKt;->paddingFromBaseline-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 344
    .line 345
    .line 346
    move-result-object v22

    .line 347
    const/16 v23, 0x0

    .line 348
    .line 349
    const/16 v24, 0x0

    .line 350
    .line 351
    sget v10, Landroidx/compose/material3/SnackbarKt;->HorizontalSpacingButtonSide:F

    .line 352
    .line 353
    const/16 v26, 0x0

    .line 354
    .line 355
    const/16 v27, 0xb

    .line 356
    .line 357
    const/16 v28, 0x0

    .line 358
    .line 359
    move/from16 v25, v10

    .line 360
    .line 361
    invoke-static/range {v22 .. v28}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 362
    .line 363
    .line 364
    move-result-object v11

    .line 365
    const v14, 0x2bb5b5d7

    .line 366
    .line 367
    .line 368
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 372
    .line 373
    .line 374
    move-result-object v15

    .line 375
    const/4 v14, 0x0

    .line 376
    invoke-static {v15, v14, v5, v14}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 377
    .line 378
    .line 379
    move-result-object v15

    .line 380
    const v7, -0x4ee9b9da

    .line 381
    .line 382
    .line 383
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 384
    .line 385
    .line 386
    invoke-static {v5, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 391
    .line 392
    .line 393
    move-result-object v14

    .line 394
    move/from16 v23, v10

    .line 395
    .line 396
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 397
    .line 398
    .line 399
    move-result-object v10

    .line 400
    invoke-static {v11}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 401
    .line 402
    .line 403
    move-result-object v11

    .line 404
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    instance-of v12, v12, Landroidx/compose/runtime/Applier;

    .line 409
    .line 410
    if-nez v12, :cond_13

    .line 411
    .line 412
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 413
    .line 414
    .line 415
    :cond_13
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 416
    .line 417
    .line 418
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 419
    .line 420
    .line 421
    move-result v12

    .line 422
    if-eqz v12, :cond_14

    .line 423
    .line 424
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 425
    .line 426
    .line 427
    goto :goto_9

    .line 428
    :cond_14
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 429
    .line 430
    .line 431
    :goto_9
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 432
    .line 433
    .line 434
    move-result-object v10

    .line 435
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 436
    .line 437
    .line 438
    move-result-object v12

    .line 439
    invoke-static {v10, v15, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 443
    .line 444
    .line 445
    move-result-object v12

    .line 446
    invoke-static {v10, v14, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 450
    .line 451
    .line 452
    move-result-object v12

    .line 453
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 454
    .line 455
    .line 456
    move-result v13

    .line 457
    if-nez v13, :cond_15

    .line 458
    .line 459
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v13

    .line 463
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object v14

    .line 467
    invoke-static {v13, v14}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v13

    .line 471
    if-nez v13, :cond_16

    .line 472
    .line 473
    :cond_15
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object v13

    .line 477
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 481
    .line 482
    .line 483
    move-result-object v7

    .line 484
    invoke-interface {v10, v7, v12}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 485
    .line 486
    .line 487
    :cond_16
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 488
    .line 489
    .line 490
    move-result-object v7

    .line 491
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 492
    .line 493
    .line 494
    move-result-object v7

    .line 495
    const/4 v10, 0x0

    .line 496
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object v12

    .line 500
    invoke-interface {v11, v7, v5, v12}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    const v7, 0x7ab4aae9

    .line 504
    .line 505
    .line 506
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 507
    .line 508
    .line 509
    sget-object v7, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 510
    .line 511
    and-int/lit8 v7, v6, 0xe

    .line 512
    .line 513
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 514
    .line 515
    .line 516
    move-result-object v7

    .line 517
    invoke-interface {v1, v5, v7}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 521
    .line 522
    .line 523
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 524
    .line 525
    .line 526
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 527
    .line 528
    .line 529
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getEnd()Landroidx/compose/ui/Alignment$Horizontal;

    .line 533
    .line 534
    .line 535
    move-result-object v7

    .line 536
    invoke-interface {v9, v0, v7}, Landroidx/compose/foundation/layout/ColumnScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;

    .line 537
    .line 538
    .line 539
    move-result-object v24

    .line 540
    const/16 v25, 0x0

    .line 541
    .line 542
    const/16 v26, 0x0

    .line 543
    .line 544
    if-nez v3, :cond_17

    .line 545
    .line 546
    move/from16 v27, v23

    .line 547
    .line 548
    goto :goto_a

    .line 549
    :cond_17
    const/4 v7, 0x0

    .line 550
    int-to-float v9, v7

    .line 551
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 552
    .line 553
    .line 554
    move-result v10

    .line 555
    move/from16 v27, v10

    .line 556
    .line 557
    :goto_a
    const/16 v28, 0x0

    .line 558
    .line 559
    const/16 v29, 0xb

    .line 560
    .line 561
    const/16 v30, 0x0

    .line 562
    .line 563
    invoke-static/range {v24 .. v30}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 564
    .line 565
    .line 566
    move-result-object v7

    .line 567
    const v9, 0x2bb5b5d7

    .line 568
    .line 569
    .line 570
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 574
    .line 575
    .line 576
    move-result-object v9

    .line 577
    const/4 v10, 0x0

    .line 578
    invoke-static {v9, v10, v5, v10}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 579
    .line 580
    .line 581
    move-result-object v9

    .line 582
    const v11, -0x4ee9b9da

    .line 583
    .line 584
    .line 585
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 586
    .line 587
    .line 588
    invoke-static {v5, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 589
    .line 590
    .line 591
    move-result v11

    .line 592
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 593
    .line 594
    .line 595
    move-result-object v10

    .line 596
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 597
    .line 598
    .line 599
    move-result-object v12

    .line 600
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 601
    .line 602
    .line 603
    move-result-object v7

    .line 604
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 605
    .line 606
    .line 607
    move-result-object v13

    .line 608
    instance-of v13, v13, Landroidx/compose/runtime/Applier;

    .line 609
    .line 610
    if-nez v13, :cond_18

    .line 611
    .line 612
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 613
    .line 614
    .line 615
    :cond_18
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 616
    .line 617
    .line 618
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 619
    .line 620
    .line 621
    move-result v13

    .line 622
    if-eqz v13, :cond_19

    .line 623
    .line 624
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 625
    .line 626
    .line 627
    goto :goto_b

    .line 628
    :cond_19
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 629
    .line 630
    .line 631
    :goto_b
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 632
    .line 633
    .line 634
    move-result-object v12

    .line 635
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 636
    .line 637
    .line 638
    move-result-object v13

    .line 639
    invoke-static {v12, v9, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 643
    .line 644
    .line 645
    move-result-object v9

    .line 646
    invoke-static {v12, v10, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 650
    .line 651
    .line 652
    move-result-object v9

    .line 653
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 654
    .line 655
    .line 656
    move-result v10

    .line 657
    if-nez v10, :cond_1a

    .line 658
    .line 659
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v10

    .line 663
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 664
    .line 665
    .line 666
    move-result-object v13

    .line 667
    invoke-static {v10, v13}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    move-result v10

    .line 671
    if-nez v10, :cond_1b

    .line 672
    .line 673
    :cond_1a
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 674
    .line 675
    .line 676
    move-result-object v10

    .line 677
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 678
    .line 679
    .line 680
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 681
    .line 682
    .line 683
    move-result-object v10

    .line 684
    invoke-interface {v12, v10, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 685
    .line 686
    .line 687
    :cond_1b
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 688
    .line 689
    .line 690
    move-result-object v9

    .line 691
    invoke-static {v9}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 692
    .line 693
    .line 694
    move-result-object v9

    .line 695
    const/4 v10, 0x0

    .line 696
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 697
    .line 698
    .line 699
    move-result-object v11

    .line 700
    invoke-interface {v7, v9, v5, v11}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    const v7, 0x7ab4aae9

    .line 704
    .line 705
    .line 706
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 707
    .line 708
    .line 709
    const v7, 0x2952b718

    .line 710
    .line 711
    .line 712
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v8}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 716
    .line 717
    .line 718
    move-result-object v7

    .line 719
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 720
    .line 721
    .line 722
    move-result-object v8

    .line 723
    invoke-static {v7, v8, v5, v10}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 724
    .line 725
    .line 726
    move-result-object v7

    .line 727
    const v8, -0x4ee9b9da

    .line 728
    .line 729
    .line 730
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 731
    .line 732
    .line 733
    invoke-static {v5, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 734
    .line 735
    .line 736
    move-result v8

    .line 737
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 738
    .line 739
    .line 740
    move-result-object v9

    .line 741
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 742
    .line 743
    .line 744
    move-result-object v10

    .line 745
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 750
    .line 751
    .line 752
    move-result-object v11

    .line 753
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 754
    .line 755
    if-nez v11, :cond_1c

    .line 756
    .line 757
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 758
    .line 759
    .line 760
    :cond_1c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 761
    .line 762
    .line 763
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 764
    .line 765
    .line 766
    move-result v11

    .line 767
    if-eqz v11, :cond_1d

    .line 768
    .line 769
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 770
    .line 771
    .line 772
    goto :goto_c

    .line 773
    :cond_1d
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 774
    .line 775
    .line 776
    :goto_c
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 777
    .line 778
    .line 779
    move-result-object v10

    .line 780
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 781
    .line 782
    .line 783
    move-result-object v11

    .line 784
    invoke-static {v10, v7, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 788
    .line 789
    .line 790
    move-result-object v7

    .line 791
    invoke-static {v10, v9, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 795
    .line 796
    .line 797
    move-result-object v7

    .line 798
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 799
    .line 800
    .line 801
    move-result v9

    .line 802
    if-nez v9, :cond_1e

    .line 803
    .line 804
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v9

    .line 808
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 809
    .line 810
    .line 811
    move-result-object v11

    .line 812
    invoke-static {v9, v11}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result v9

    .line 816
    if-nez v9, :cond_1f

    .line 817
    .line 818
    :cond_1e
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 819
    .line 820
    .line 821
    move-result-object v9

    .line 822
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 823
    .line 824
    .line 825
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 826
    .line 827
    .line 828
    move-result-object v8

    .line 829
    invoke-interface {v10, v8, v7}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 830
    .line 831
    .line 832
    :cond_1f
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 833
    .line 834
    .line 835
    move-result-object v7

    .line 836
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 837
    .line 838
    .line 839
    move-result-object v7

    .line 840
    const/4 v8, 0x0

    .line 841
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 842
    .line 843
    .line 844
    move-result-object v9

    .line 845
    invoke-interface {v0, v7, v5, v9}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    const v0, 0x7ab4aae9

    .line 849
    .line 850
    .line 851
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 852
    .line 853
    .line 854
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 855
    .line 856
    const/4 v0, 0x2

    .line 857
    new-array v0, v0, [Landroidx/compose/runtime/ProvidedValue;

    .line 858
    .line 859
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 860
    .line 861
    .line 862
    move-result-object v7

    .line 863
    invoke-static/range {p4 .. p5}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 864
    .line 865
    .line 866
    move-result-object v9

    .line 867
    invoke-virtual {v7, v9}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 868
    .line 869
    .line 870
    move-result-object v7

    .line 871
    aput-object v7, v0, v8

    .line 872
    .line 873
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 874
    .line 875
    .line 876
    move-result-object v7

    .line 877
    invoke-virtual {v7, v4}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 878
    .line 879
    .line 880
    move-result-object v7

    .line 881
    const/4 v8, 0x1

    .line 882
    aput-object v7, v0, v8

    .line 883
    .line 884
    and-int/lit8 v7, v6, 0x70

    .line 885
    .line 886
    invoke-static {v0, v2, v5, v7}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 887
    .line 888
    .line 889
    const v0, 0x1205c16c

    .line 890
    .line 891
    .line 892
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 893
    .line 894
    .line 895
    if-eqz v3, :cond_20

    .line 896
    .line 897
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-static/range {p6 .. p7}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 902
    .line 903
    .line 904
    move-result-object v7

    .line 905
    invoke-virtual {v0, v7}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    sget v7, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    .line 910
    .line 911
    const/4 v8, 0x0

    .line 912
    or-int/2addr v7, v8

    .line 913
    shr-int/lit8 v6, v6, 0x3

    .line 914
    .line 915
    and-int/lit8 v6, v6, 0x70

    .line 916
    .line 917
    or-int/2addr v6, v7

    .line 918
    invoke-static {v0, v3, v5, v6}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 919
    .line 920
    .line 921
    :cond_20
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 922
    .line 923
    .line 924
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 925
    .line 926
    .line 927
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 928
    .line 929
    .line 930
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 931
    .line 932
    .line 933
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 934
    .line 935
    .line 936
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 937
    .line 938
    .line 939
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 940
    .line 941
    .line 942
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 943
    .line 944
    .line 945
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 946
    .line 947
    .line 948
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 949
    .line 950
    .line 951
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 952
    .line 953
    .line 954
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 955
    .line 956
    .line 957
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 958
    .line 959
    .line 960
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 961
    .line 962
    .line 963
    move-result v0

    .line 964
    if-eqz v0, :cond_21

    .line 965
    .line 966
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 967
    .line 968
    .line 969
    :cond_21
    :goto_d
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 970
    .line 971
    .line 972
    move-result-object v10

    .line 973
    if-eqz v10, :cond_22

    .line 974
    .line 975
    new-instance v11, Landroidx/compose/material3/SnackbarKt$NewLineButtonSnackbar$2;

    .line 976
    .line 977
    move-object v0, v11

    .line 978
    move-object/from16 v1, p0

    .line 979
    .line 980
    move-object/from16 v2, p1

    .line 981
    .line 982
    move-object/from16 v3, p2

    .line 983
    .line 984
    move-object/from16 v4, p3

    .line 985
    .line 986
    move-wide/from16 v5, p4

    .line 987
    .line 988
    move-wide/from16 v7, p6

    .line 989
    .line 990
    move/from16 v9, p9

    .line 991
    .line 992
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/SnackbarKt$NewLineButtonSnackbar$2;-><init>(Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/text/TextStyle;JJI)V

    .line 993
    .line 994
    .line 995
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 996
    .line 997
    .line 998
    :cond_22
    return-void
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
.end method

.method private static final OneRowSnackbar-kKq0p4A(Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/text/TextStyle;",
            "JJ",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v9, p9

    .line 10
    .line 11
    const v0, -0x35d64793

    .line 12
    .line 13
    .line 14
    move-object/from16 v5, p8

    .line 15
    .line 16
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    and-int/lit8 v6, v9, 0x6

    .line 21
    .line 22
    if-nez v6, :cond_1

    .line 23
    .line 24
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    const/4 v6, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v6, 0x2

    .line 33
    :goto_0
    or-int/2addr v6, v9

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v6, v9

    .line 36
    :goto_1
    and-int/lit8 v8, v9, 0x30

    .line 37
    .line 38
    if-nez v8, :cond_3

    .line 39
    .line 40
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-eqz v8, :cond_2

    .line 45
    .line 46
    const/16 v8, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v8, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v6, v8

    .line 52
    :cond_3
    and-int/lit16 v8, v9, 0x180

    .line 53
    .line 54
    if-nez v8, :cond_5

    .line 55
    .line 56
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_4

    .line 61
    .line 62
    const/16 v8, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v8, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v6, v8

    .line 68
    :cond_5
    and-int/lit16 v8, v9, 0xc00

    .line 69
    .line 70
    if-nez v8, :cond_7

    .line 71
    .line 72
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_6

    .line 77
    .line 78
    const/16 v8, 0x800

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_6
    const/16 v8, 0x400

    .line 82
    .line 83
    :goto_4
    or-int/2addr v6, v8

    .line 84
    :cond_7
    and-int/lit16 v8, v9, 0x6000

    .line 85
    .line 86
    move-wide/from16 v10, p4

    .line 87
    .line 88
    if-nez v8, :cond_9

    .line 89
    .line 90
    invoke-interface {v5, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_8

    .line 95
    .line 96
    const/16 v8, 0x4000

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    const/16 v8, 0x2000

    .line 100
    .line 101
    :goto_5
    or-int/2addr v6, v8

    .line 102
    :cond_9
    const/high16 v8, 0x30000

    .line 103
    .line 104
    and-int/2addr v8, v9

    .line 105
    move-wide/from16 v12, p6

    .line 106
    .line 107
    if-nez v8, :cond_b

    .line 108
    .line 109
    invoke-interface {v5, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-eqz v8, :cond_a

    .line 114
    .line 115
    const/high16 v8, 0x20000

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_a
    const/high16 v8, 0x10000

    .line 119
    .line 120
    :goto_6
    or-int/2addr v6, v8

    .line 121
    :cond_b
    const v8, 0x12493

    .line 122
    .line 123
    .line 124
    and-int/2addr v8, v6

    .line 125
    const v14, 0x12492

    .line 126
    .line 127
    .line 128
    if-ne v8, v14, :cond_d

    .line 129
    .line 130
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-nez v8, :cond_c

    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_d

    .line 141
    .line 142
    :cond_d
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_e

    .line 147
    .line 148
    const/4 v8, -0x1

    .line 149
    const-string v14, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:305)"

    .line 150
    .line 151
    invoke-static {v0, v6, v8, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_e
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 155
    .line 156
    sget v16, Landroidx/compose/material3/SnackbarKt;->HorizontalSpacing:F

    .line 157
    .line 158
    const/16 v17, 0x0

    .line 159
    .line 160
    const/4 v8, 0x0

    .line 161
    if-nez v3, :cond_f

    .line 162
    .line 163
    sget v14, Landroidx/compose/material3/SnackbarKt;->HorizontalSpacingButtonSide:F

    .line 164
    .line 165
    goto :goto_8

    .line 166
    :cond_f
    int-to-float v14, v8

    .line 167
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 168
    .line 169
    .line 170
    move-result v14

    .line 171
    :goto_8
    move/from16 v18, v14

    .line 172
    .line 173
    const/16 v19, 0x0

    .line 174
    .line 175
    const/16 v20, 0xa

    .line 176
    .line 177
    const/16 v21, 0x0

    .line 178
    .line 179
    move-object v15, v0

    .line 180
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    const v15, 0x2aaab40

    .line 185
    .line 186
    .line 187
    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v15

    .line 194
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 195
    .line 196
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    const-string v8, "text"

    .line 201
    .line 202
    const-string v9, "action"

    .line 203
    .line 204
    const-string v10, "dismissAction"

    .line 205
    .line 206
    if-ne v15, v7, :cond_10

    .line 207
    .line 208
    new-instance v15, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1;

    .line 209
    .line 210
    invoke-direct {v15, v9, v10, v8}, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    :cond_10
    check-cast v15, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 217
    .line 218
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 219
    .line 220
    .line 221
    const v7, -0x4ee9b9da

    .line 222
    .line 223
    .line 224
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 225
    .line 226
    .line 227
    const/4 v11, 0x0

    .line 228
    invoke-static {v5, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 229
    .line 230
    .line 231
    move-result v17

    .line 232
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    sget-object v18, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 237
    .line 238
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-static {v14}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 243
    .line 244
    .line 245
    move-result-object v14

    .line 246
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 247
    .line 248
    .line 249
    move-result-object v12

    .line 250
    instance-of v12, v12, Landroidx/compose/runtime/Applier;

    .line 251
    .line 252
    if-nez v12, :cond_11

    .line 253
    .line 254
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 255
    .line 256
    .line 257
    :cond_11
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 258
    .line 259
    .line 260
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 261
    .line 262
    .line 263
    move-result v12

    .line 264
    if-eqz v12, :cond_12

    .line 265
    .line 266
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 267
    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_12
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 271
    .line 272
    .line 273
    :goto_9
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    invoke-static {v7, v15, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    invoke-static {v7, v11, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 292
    .line 293
    .line 294
    move-result-object v11

    .line 295
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 296
    .line 297
    .line 298
    move-result v12

    .line 299
    if-nez v12, :cond_13

    .line 300
    .line 301
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v12

    .line 305
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v13

    .line 309
    invoke-static {v12, v13}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v12

    .line 313
    if-nez v12, :cond_14

    .line 314
    .line 315
    :cond_13
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    invoke-interface {v7, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object v12

    .line 326
    invoke-interface {v7, v12, v11}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 327
    .line 328
    .line 329
    :cond_14
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    const/4 v11, 0x0

    .line 338
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v12

    .line 342
    invoke-interface {v14, v7, v5, v12}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    const v7, 0x7ab4aae9

    .line 346
    .line 347
    .line 348
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 349
    .line 350
    .line 351
    invoke-static {v0, v8}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 352
    .line 353
    .line 354
    move-result-object v8

    .line 355
    sget v11, Landroidx/compose/material3/SnackbarKt;->SnackbarVerticalPadding:F

    .line 356
    .line 357
    const/4 v12, 0x0

    .line 358
    const/4 v13, 0x0

    .line 359
    const/4 v14, 0x1

    .line 360
    invoke-static {v8, v13, v11, v14, v12}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 361
    .line 362
    .line 363
    move-result-object v8

    .line 364
    const v11, 0x2bb5b5d7

    .line 365
    .line 366
    .line 367
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 368
    .line 369
    .line 370
    sget-object v12, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 371
    .line 372
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 373
    .line 374
    .line 375
    move-result-object v13

    .line 376
    const/4 v15, 0x0

    .line 377
    invoke-static {v13, v15, v5, v15}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 378
    .line 379
    .line 380
    move-result-object v13

    .line 381
    const v14, -0x4ee9b9da

    .line 382
    .line 383
    .line 384
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 385
    .line 386
    .line 387
    invoke-static {v5, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 388
    .line 389
    .line 390
    move-result v14

    .line 391
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 392
    .line 393
    .line 394
    move-result-object v15

    .line 395
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 396
    .line 397
    .line 398
    move-result-object v11

    .line 399
    invoke-static {v8}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 404
    .line 405
    .line 406
    move-result-object v7

    .line 407
    instance-of v7, v7, Landroidx/compose/runtime/Applier;

    .line 408
    .line 409
    if-nez v7, :cond_15

    .line 410
    .line 411
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 412
    .line 413
    .line 414
    :cond_15
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 415
    .line 416
    .line 417
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 418
    .line 419
    .line 420
    move-result v7

    .line 421
    if-eqz v7, :cond_16

    .line 422
    .line 423
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 424
    .line 425
    .line 426
    goto :goto_a

    .line 427
    :cond_16
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 428
    .line 429
    .line 430
    :goto_a
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 431
    .line 432
    .line 433
    move-result-object v7

    .line 434
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 435
    .line 436
    .line 437
    move-result-object v11

    .line 438
    invoke-static {v7, v13, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 442
    .line 443
    .line 444
    move-result-object v11

    .line 445
    invoke-static {v7, v15, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 449
    .line 450
    .line 451
    move-result-object v11

    .line 452
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 453
    .line 454
    .line 455
    move-result v13

    .line 456
    if-nez v13, :cond_17

    .line 457
    .line 458
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v13

    .line 462
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v15

    .line 466
    invoke-static {v13, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    move-result v13

    .line 470
    if-nez v13, :cond_18

    .line 471
    .line 472
    :cond_17
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 473
    .line 474
    .line 475
    move-result-object v13

    .line 476
    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 480
    .line 481
    .line 482
    move-result-object v13

    .line 483
    invoke-interface {v7, v13, v11}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 484
    .line 485
    .line 486
    :cond_18
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 487
    .line 488
    .line 489
    move-result-object v7

    .line 490
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 491
    .line 492
    .line 493
    move-result-object v7

    .line 494
    const/4 v11, 0x0

    .line 495
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 496
    .line 497
    .line 498
    move-result-object v13

    .line 499
    invoke-interface {v8, v7, v5, v13}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    const v7, 0x7ab4aae9

    .line 503
    .line 504
    .line 505
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 506
    .line 507
    .line 508
    sget-object v7, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 509
    .line 510
    and-int/lit8 v7, v6, 0xe

    .line 511
    .line 512
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 513
    .line 514
    .line 515
    move-result-object v7

    .line 516
    invoke-interface {v1, v5, v7}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 520
    .line 521
    .line 522
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 523
    .line 524
    .line 525
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 526
    .line 527
    .line 528
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 529
    .line 530
    .line 531
    const v7, -0x9ff6bf4

    .line 532
    .line 533
    .line 534
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 535
    .line 536
    .line 537
    if-eqz v2, :cond_1d

    .line 538
    .line 539
    invoke-static {v0, v9}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 540
    .line 541
    .line 542
    move-result-object v7

    .line 543
    const v8, 0x2bb5b5d7

    .line 544
    .line 545
    .line 546
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 550
    .line 551
    .line 552
    move-result-object v8

    .line 553
    const/4 v9, 0x0

    .line 554
    invoke-static {v8, v9, v5, v9}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 555
    .line 556
    .line 557
    move-result-object v8

    .line 558
    const v11, -0x4ee9b9da

    .line 559
    .line 560
    .line 561
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 562
    .line 563
    .line 564
    invoke-static {v5, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 565
    .line 566
    .line 567
    move-result v11

    .line 568
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 569
    .line 570
    .line 571
    move-result-object v9

    .line 572
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 573
    .line 574
    .line 575
    move-result-object v13

    .line 576
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 577
    .line 578
    .line 579
    move-result-object v7

    .line 580
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 581
    .line 582
    .line 583
    move-result-object v14

    .line 584
    instance-of v14, v14, Landroidx/compose/runtime/Applier;

    .line 585
    .line 586
    if-nez v14, :cond_19

    .line 587
    .line 588
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 589
    .line 590
    .line 591
    :cond_19
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 592
    .line 593
    .line 594
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 595
    .line 596
    .line 597
    move-result v14

    .line 598
    if-eqz v14, :cond_1a

    .line 599
    .line 600
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 601
    .line 602
    .line 603
    goto :goto_b

    .line 604
    :cond_1a
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 605
    .line 606
    .line 607
    :goto_b
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 608
    .line 609
    .line 610
    move-result-object v13

    .line 611
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 612
    .line 613
    .line 614
    move-result-object v14

    .line 615
    invoke-static {v13, v8, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 619
    .line 620
    .line 621
    move-result-object v8

    .line 622
    invoke-static {v13, v9, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 626
    .line 627
    .line 628
    move-result-object v8

    .line 629
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 630
    .line 631
    .line 632
    move-result v9

    .line 633
    if-nez v9, :cond_1b

    .line 634
    .line 635
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v9

    .line 639
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 640
    .line 641
    .line 642
    move-result-object v14

    .line 643
    invoke-static {v9, v14}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    move-result v9

    .line 647
    if-nez v9, :cond_1c

    .line 648
    .line 649
    :cond_1b
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 650
    .line 651
    .line 652
    move-result-object v9

    .line 653
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 657
    .line 658
    .line 659
    move-result-object v9

    .line 660
    invoke-interface {v13, v9, v8}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 661
    .line 662
    .line 663
    :cond_1c
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 664
    .line 665
    .line 666
    move-result-object v8

    .line 667
    invoke-static {v8}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 668
    .line 669
    .line 670
    move-result-object v8

    .line 671
    const/4 v9, 0x0

    .line 672
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 673
    .line 674
    .line 675
    move-result-object v11

    .line 676
    invoke-interface {v7, v8, v5, v11}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    const v7, 0x7ab4aae9

    .line 680
    .line 681
    .line 682
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 683
    .line 684
    .line 685
    const/4 v7, 0x2

    .line 686
    new-array v7, v7, [Landroidx/compose/runtime/ProvidedValue;

    .line 687
    .line 688
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 689
    .line 690
    .line 691
    move-result-object v8

    .line 692
    invoke-static/range {p4 .. p5}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 693
    .line 694
    .line 695
    move-result-object v11

    .line 696
    invoke-virtual {v8, v11}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 697
    .line 698
    .line 699
    move-result-object v8

    .line 700
    aput-object v8, v7, v9

    .line 701
    .line 702
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 703
    .line 704
    .line 705
    move-result-object v8

    .line 706
    invoke-virtual {v8, v4}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 707
    .line 708
    .line 709
    move-result-object v8

    .line 710
    const/4 v9, 0x1

    .line 711
    aput-object v8, v7, v9

    .line 712
    .line 713
    and-int/lit8 v8, v6, 0x70

    .line 714
    .line 715
    invoke-static {v7, v2, v5, v8}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 716
    .line 717
    .line 718
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 719
    .line 720
    .line 721
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 722
    .line 723
    .line 724
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 725
    .line 726
    .line 727
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 728
    .line 729
    .line 730
    :cond_1d
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 731
    .line 732
    .line 733
    const v7, 0x2aaa953

    .line 734
    .line 735
    .line 736
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 737
    .line 738
    .line 739
    if-eqz v3, :cond_22

    .line 740
    .line 741
    invoke-static {v0, v10}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    const v7, 0x2bb5b5d7

    .line 746
    .line 747
    .line 748
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 752
    .line 753
    .line 754
    move-result-object v7

    .line 755
    const/4 v8, 0x0

    .line 756
    invoke-static {v7, v8, v5, v8}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 757
    .line 758
    .line 759
    move-result-object v7

    .line 760
    const v9, -0x4ee9b9da

    .line 761
    .line 762
    .line 763
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 764
    .line 765
    .line 766
    invoke-static {v5, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 767
    .line 768
    .line 769
    move-result v9

    .line 770
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 771
    .line 772
    .line 773
    move-result-object v8

    .line 774
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 775
    .line 776
    .line 777
    move-result-object v10

    .line 778
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 783
    .line 784
    .line 785
    move-result-object v11

    .line 786
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 787
    .line 788
    if-nez v11, :cond_1e

    .line 789
    .line 790
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 791
    .line 792
    .line 793
    :cond_1e
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 794
    .line 795
    .line 796
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 797
    .line 798
    .line 799
    move-result v11

    .line 800
    if-eqz v11, :cond_1f

    .line 801
    .line 802
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 803
    .line 804
    .line 805
    goto :goto_c

    .line 806
    :cond_1f
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 807
    .line 808
    .line 809
    :goto_c
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 810
    .line 811
    .line 812
    move-result-object v10

    .line 813
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 814
    .line 815
    .line 816
    move-result-object v11

    .line 817
    invoke-static {v10, v7, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 821
    .line 822
    .line 823
    move-result-object v7

    .line 824
    invoke-static {v10, v8, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 828
    .line 829
    .line 830
    move-result-object v7

    .line 831
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 832
    .line 833
    .line 834
    move-result v8

    .line 835
    if-nez v8, :cond_20

    .line 836
    .line 837
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v8

    .line 841
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 842
    .line 843
    .line 844
    move-result-object v11

    .line 845
    invoke-static {v8, v11}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    move-result v8

    .line 849
    if-nez v8, :cond_21

    .line 850
    .line 851
    :cond_20
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 852
    .line 853
    .line 854
    move-result-object v8

    .line 855
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 856
    .line 857
    .line 858
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 859
    .line 860
    .line 861
    move-result-object v8

    .line 862
    invoke-interface {v10, v8, v7}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 863
    .line 864
    .line 865
    :cond_21
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 866
    .line 867
    .line 868
    move-result-object v7

    .line 869
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 870
    .line 871
    .line 872
    move-result-object v7

    .line 873
    const/4 v8, 0x0

    .line 874
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 875
    .line 876
    .line 877
    move-result-object v9

    .line 878
    invoke-interface {v0, v7, v5, v9}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    const v0, 0x7ab4aae9

    .line 882
    .line 883
    .line 884
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 885
    .line 886
    .line 887
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    invoke-static/range {p6 .. p7}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 892
    .line 893
    .line 894
    move-result-object v7

    .line 895
    invoke-virtual {v0, v7}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    sget v7, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    .line 900
    .line 901
    or-int/2addr v7, v8

    .line 902
    shr-int/lit8 v6, v6, 0x3

    .line 903
    .line 904
    and-int/lit8 v6, v6, 0x70

    .line 905
    .line 906
    or-int/2addr v6, v7

    .line 907
    invoke-static {v0, v3, v5, v6}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 908
    .line 909
    .line 910
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 911
    .line 912
    .line 913
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 914
    .line 915
    .line 916
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 917
    .line 918
    .line 919
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 920
    .line 921
    .line 922
    :cond_22
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 923
    .line 924
    .line 925
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 926
    .line 927
    .line 928
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 929
    .line 930
    .line 931
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 932
    .line 933
    .line 934
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 935
    .line 936
    .line 937
    move-result v0

    .line 938
    if-eqz v0, :cond_23

    .line 939
    .line 940
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 941
    .line 942
    .line 943
    :cond_23
    :goto_d
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 944
    .line 945
    .line 946
    move-result-object v10

    .line 947
    if-eqz v10, :cond_24

    .line 948
    .line 949
    new-instance v11, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;

    .line 950
    .line 951
    move-object v0, v11

    .line 952
    move-object/from16 v1, p0

    .line 953
    .line 954
    move-object/from16 v2, p1

    .line 955
    .line 956
    move-object/from16 v3, p2

    .line 957
    .line 958
    move-object/from16 v4, p3

    .line 959
    .line 960
    move-wide/from16 v5, p4

    .line 961
    .line 962
    move-wide/from16 v7, p6

    .line 963
    .line 964
    move/from16 v9, p9

    .line 965
    .line 966
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;-><init>(Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/text/TextStyle;JJI)V

    .line 967
    .line 968
    .line 969
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 970
    .line 971
    .line 972
    :cond_24
    return-void
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
.end method

.method public static final Snackbar-eQBnUkQ(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;ZLandroidx/compose/ui/graphics/Shape;JJJJLv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p1    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p13    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p14    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;Z",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJJJ",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v15, p15

    .line 2
    .line 3
    move/from16 v14, p16

    .line 4
    .line 5
    const v0, -0x49a8a49b

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p14

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, v14, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v3, v15, 0x6

    .line 19
    .line 20
    move v4, v3

    .line 21
    move-object/from16 v3, p0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v3, v15, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    move-object/from16 v3, p0

    .line 29
    .line 30
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v4, 0x2

    .line 39
    :goto_0
    or-int/2addr v4, v15

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object/from16 v3, p0

    .line 42
    .line 43
    move v4, v15

    .line 44
    :goto_1
    and-int/lit8 v5, v14, 0x2

    .line 45
    .line 46
    if-eqz v5, :cond_3

    .line 47
    .line 48
    or-int/lit8 v4, v4, 0x30

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_3
    and-int/lit8 v6, v15, 0x30

    .line 52
    .line 53
    if-nez v6, :cond_5

    .line 54
    .line 55
    move-object/from16 v6, p1

    .line 56
    .line 57
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_4

    .line 62
    .line 63
    const/16 v7, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const/16 v7, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v4, v7

    .line 69
    goto :goto_4

    .line 70
    :cond_5
    :goto_3
    move-object/from16 v6, p1

    .line 71
    .line 72
    :goto_4
    and-int/lit8 v7, v14, 0x4

    .line 73
    .line 74
    if-eqz v7, :cond_6

    .line 75
    .line 76
    or-int/lit16 v4, v4, 0x180

    .line 77
    .line 78
    goto :goto_6

    .line 79
    :cond_6
    and-int/lit16 v8, v15, 0x180

    .line 80
    .line 81
    if-nez v8, :cond_8

    .line 82
    .line 83
    move-object/from16 v8, p2

    .line 84
    .line 85
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    if-eqz v9, :cond_7

    .line 90
    .line 91
    const/16 v9, 0x100

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_7
    const/16 v9, 0x80

    .line 95
    .line 96
    :goto_5
    or-int/2addr v4, v9

    .line 97
    goto :goto_7

    .line 98
    :cond_8
    :goto_6
    move-object/from16 v8, p2

    .line 99
    .line 100
    :goto_7
    and-int/lit8 v9, v14, 0x8

    .line 101
    .line 102
    if-eqz v9, :cond_9

    .line 103
    .line 104
    or-int/lit16 v4, v4, 0xc00

    .line 105
    .line 106
    goto :goto_9

    .line 107
    :cond_9
    and-int/lit16 v10, v15, 0xc00

    .line 108
    .line 109
    if-nez v10, :cond_b

    .line 110
    .line 111
    move/from16 v10, p3

    .line 112
    .line 113
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    if-eqz v11, :cond_a

    .line 118
    .line 119
    const/16 v11, 0x800

    .line 120
    .line 121
    goto :goto_8

    .line 122
    :cond_a
    const/16 v11, 0x400

    .line 123
    .line 124
    :goto_8
    or-int/2addr v4, v11

    .line 125
    goto :goto_a

    .line 126
    :cond_b
    :goto_9
    move/from16 v10, p3

    .line 127
    .line 128
    :goto_a
    and-int/lit16 v11, v15, 0x6000

    .line 129
    .line 130
    if-nez v11, :cond_e

    .line 131
    .line 132
    and-int/lit8 v11, v14, 0x10

    .line 133
    .line 134
    if-nez v11, :cond_c

    .line 135
    .line 136
    move-object/from16 v11, p4

    .line 137
    .line 138
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    if-eqz v12, :cond_d

    .line 143
    .line 144
    const/16 v12, 0x4000

    .line 145
    .line 146
    goto :goto_b

    .line 147
    :cond_c
    move-object/from16 v11, p4

    .line 148
    .line 149
    :cond_d
    const/16 v12, 0x2000

    .line 150
    .line 151
    :goto_b
    or-int/2addr v4, v12

    .line 152
    goto :goto_c

    .line 153
    :cond_e
    move-object/from16 v11, p4

    .line 154
    .line 155
    :goto_c
    const/high16 v12, 0x30000

    .line 156
    .line 157
    and-int/2addr v12, v15

    .line 158
    if-nez v12, :cond_11

    .line 159
    .line 160
    and-int/lit8 v12, v14, 0x20

    .line 161
    .line 162
    if-nez v12, :cond_f

    .line 163
    .line 164
    move-wide/from16 v12, p5

    .line 165
    .line 166
    invoke-interface {v1, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 167
    .line 168
    .line 169
    move-result v16

    .line 170
    if-eqz v16, :cond_10

    .line 171
    .line 172
    const/high16 v16, 0x20000

    .line 173
    .line 174
    goto :goto_d

    .line 175
    :cond_f
    move-wide/from16 v12, p5

    .line 176
    .line 177
    :cond_10
    const/high16 v16, 0x10000

    .line 178
    .line 179
    :goto_d
    or-int v4, v4, v16

    .line 180
    .line 181
    goto :goto_e

    .line 182
    :cond_11
    move-wide/from16 v12, p5

    .line 183
    .line 184
    :goto_e
    const/high16 v16, 0x180000

    .line 185
    .line 186
    and-int v16, v15, v16

    .line 187
    .line 188
    if-nez v16, :cond_13

    .line 189
    .line 190
    and-int/lit8 v16, v14, 0x40

    .line 191
    .line 192
    move-wide/from16 v10, p7

    .line 193
    .line 194
    if-nez v16, :cond_12

    .line 195
    .line 196
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 197
    .line 198
    .line 199
    move-result v16

    .line 200
    if-eqz v16, :cond_12

    .line 201
    .line 202
    const/high16 v16, 0x100000

    .line 203
    .line 204
    goto :goto_f

    .line 205
    :cond_12
    const/high16 v16, 0x80000

    .line 206
    .line 207
    :goto_f
    or-int v4, v4, v16

    .line 208
    .line 209
    goto :goto_10

    .line 210
    :cond_13
    move-wide/from16 v10, p7

    .line 211
    .line 212
    :goto_10
    const/high16 v16, 0xc00000

    .line 213
    .line 214
    and-int v16, v15, v16

    .line 215
    .line 216
    if-nez v16, :cond_15

    .line 217
    .line 218
    and-int/lit16 v0, v14, 0x80

    .line 219
    .line 220
    move-wide/from16 v10, p9

    .line 221
    .line 222
    if-nez v0, :cond_14

    .line 223
    .line 224
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_14

    .line 229
    .line 230
    const/high16 v0, 0x800000

    .line 231
    .line 232
    goto :goto_11

    .line 233
    :cond_14
    const/high16 v0, 0x400000

    .line 234
    .line 235
    :goto_11
    or-int/2addr v4, v0

    .line 236
    goto :goto_12

    .line 237
    :cond_15
    move-wide/from16 v10, p9

    .line 238
    .line 239
    :goto_12
    const/high16 v0, 0x6000000

    .line 240
    .line 241
    and-int/2addr v0, v15

    .line 242
    if-nez v0, :cond_17

    .line 243
    .line 244
    and-int/lit16 v0, v14, 0x100

    .line 245
    .line 246
    move-wide/from16 v10, p11

    .line 247
    .line 248
    if-nez v0, :cond_16

    .line 249
    .line 250
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_16

    .line 255
    .line 256
    const/high16 v0, 0x4000000

    .line 257
    .line 258
    goto :goto_13

    .line 259
    :cond_16
    const/high16 v0, 0x2000000

    .line 260
    .line 261
    :goto_13
    or-int/2addr v4, v0

    .line 262
    goto :goto_14

    .line 263
    :cond_17
    move-wide/from16 v10, p11

    .line 264
    .line 265
    :goto_14
    and-int/lit16 v0, v14, 0x200

    .line 266
    .line 267
    const/high16 v17, 0x30000000

    .line 268
    .line 269
    if-eqz v0, :cond_18

    .line 270
    .line 271
    or-int v4, v4, v17

    .line 272
    .line 273
    goto :goto_16

    .line 274
    :cond_18
    and-int v0, v15, v17

    .line 275
    .line 276
    if-nez v0, :cond_1a

    .line 277
    .line 278
    move-object/from16 v0, p13

    .line 279
    .line 280
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v17

    .line 284
    if-eqz v17, :cond_19

    .line 285
    .line 286
    const/high16 v17, 0x20000000

    .line 287
    .line 288
    goto :goto_15

    .line 289
    :cond_19
    const/high16 v17, 0x10000000

    .line 290
    .line 291
    :goto_15
    or-int v4, v4, v17

    .line 292
    .line 293
    goto :goto_17

    .line 294
    :cond_1a
    :goto_16
    move-object/from16 v0, p13

    .line 295
    .line 296
    :goto_17
    const v17, 0x12492493

    .line 297
    .line 298
    .line 299
    and-int v0, v4, v17

    .line 300
    .line 301
    const v3, 0x12492492

    .line 302
    .line 303
    .line 304
    if-ne v0, v3, :cond_1c

    .line 305
    .line 306
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-nez v0, :cond_1b

    .line 311
    .line 312
    goto :goto_18

    .line 313
    :cond_1b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 314
    .line 315
    .line 316
    move-object/from16 v2, p0

    .line 317
    .line 318
    move/from16 v4, p3

    .line 319
    .line 320
    move-object/from16 v5, p4

    .line 321
    .line 322
    move-object v3, v8

    .line 323
    move-wide/from16 v16, v10

    .line 324
    .line 325
    move-wide/from16 v8, p7

    .line 326
    .line 327
    move-wide/from16 v10, p9

    .line 328
    .line 329
    goto/16 :goto_21

    .line 330
    .line 331
    :cond_1c
    :goto_18
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 332
    .line 333
    .line 334
    and-int/lit8 v0, v15, 0x1

    .line 335
    .line 336
    const v3, -0xe000001

    .line 337
    .line 338
    .line 339
    const v17, -0x1c00001

    .line 340
    .line 341
    .line 342
    const v18, -0x380001

    .line 343
    .line 344
    .line 345
    const v19, -0x70001

    .line 346
    .line 347
    .line 348
    const v20, -0xe001

    .line 349
    .line 350
    .line 351
    if-eqz v0, :cond_23

    .line 352
    .line 353
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-eqz v0, :cond_1d

    .line 358
    .line 359
    goto :goto_19

    .line 360
    :cond_1d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 361
    .line 362
    .line 363
    and-int/lit8 v0, v14, 0x10

    .line 364
    .line 365
    if-eqz v0, :cond_1e

    .line 366
    .line 367
    and-int v4, v4, v20

    .line 368
    .line 369
    :cond_1e
    and-int/lit8 v0, v14, 0x20

    .line 370
    .line 371
    if-eqz v0, :cond_1f

    .line 372
    .line 373
    and-int v4, v4, v19

    .line 374
    .line 375
    :cond_1f
    and-int/lit8 v0, v14, 0x40

    .line 376
    .line 377
    if-eqz v0, :cond_20

    .line 378
    .line 379
    and-int v4, v4, v18

    .line 380
    .line 381
    :cond_20
    and-int/lit16 v0, v14, 0x80

    .line 382
    .line 383
    if-eqz v0, :cond_21

    .line 384
    .line 385
    and-int v4, v4, v17

    .line 386
    .line 387
    :cond_21
    and-int/lit16 v0, v14, 0x100

    .line 388
    .line 389
    if-eqz v0, :cond_22

    .line 390
    .line 391
    and-int/2addr v4, v3

    .line 392
    :cond_22
    move-object/from16 v0, p0

    .line 393
    .line 394
    move/from16 v5, p3

    .line 395
    .line 396
    move-object/from16 v7, p4

    .line 397
    .line 398
    move-wide/from16 v19, p7

    .line 399
    .line 400
    move-wide/from16 v21, p9

    .line 401
    .line 402
    move-object v2, v8

    .line 403
    goto :goto_20

    .line 404
    :cond_23
    :goto_19
    if-eqz v2, :cond_24

    .line 405
    .line 406
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 407
    .line 408
    goto :goto_1a

    .line 409
    :cond_24
    move-object/from16 v0, p0

    .line 410
    .line 411
    :goto_1a
    const/4 v2, 0x0

    .line 412
    if-eqz v5, :cond_25

    .line 413
    .line 414
    move-object v6, v2

    .line 415
    :cond_25
    if-eqz v7, :cond_26

    .line 416
    .line 417
    goto :goto_1b

    .line 418
    :cond_26
    move-object v2, v8

    .line 419
    :goto_1b
    if-eqz v9, :cond_27

    .line 420
    .line 421
    const/4 v5, 0x0

    .line 422
    goto :goto_1c

    .line 423
    :cond_27
    move/from16 v5, p3

    .line 424
    .line 425
    :goto_1c
    and-int/lit8 v7, v14, 0x10

    .line 426
    .line 427
    const/4 v8, 0x6

    .line 428
    if-eqz v7, :cond_28

    .line 429
    .line 430
    sget-object v7, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 431
    .line 432
    invoke-virtual {v7, v1, v8}, Landroidx/compose/material3/SnackbarDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    and-int v4, v4, v20

    .line 437
    .line 438
    goto :goto_1d

    .line 439
    :cond_28
    move-object/from16 v7, p4

    .line 440
    .line 441
    :goto_1d
    and-int/lit8 v9, v14, 0x20

    .line 442
    .line 443
    if-eqz v9, :cond_29

    .line 444
    .line 445
    sget-object v9, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 446
    .line 447
    invoke-virtual {v9, v1, v8}, Landroidx/compose/material3/SnackbarDefaults;->getColor(Landroidx/compose/runtime/Composer;I)J

    .line 448
    .line 449
    .line 450
    move-result-wide v12

    .line 451
    and-int v4, v4, v19

    .line 452
    .line 453
    :cond_29
    and-int/lit8 v9, v14, 0x40

    .line 454
    .line 455
    if-eqz v9, :cond_2a

    .line 456
    .line 457
    sget-object v9, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 458
    .line 459
    invoke-virtual {v9, v1, v8}, Landroidx/compose/material3/SnackbarDefaults;->getContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 460
    .line 461
    .line 462
    move-result-wide v19

    .line 463
    and-int v4, v4, v18

    .line 464
    .line 465
    goto :goto_1e

    .line 466
    :cond_2a
    move-wide/from16 v19, p7

    .line 467
    .line 468
    :goto_1e
    and-int/lit16 v9, v14, 0x80

    .line 469
    .line 470
    if-eqz v9, :cond_2b

    .line 471
    .line 472
    sget-object v9, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 473
    .line 474
    invoke-virtual {v9, v1, v8}, Landroidx/compose/material3/SnackbarDefaults;->getActionContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 475
    .line 476
    .line 477
    move-result-wide v21

    .line 478
    and-int v4, v4, v17

    .line 479
    .line 480
    goto :goto_1f

    .line 481
    :cond_2b
    move-wide/from16 v21, p9

    .line 482
    .line 483
    :goto_1f
    and-int/lit16 v9, v14, 0x100

    .line 484
    .line 485
    if-eqz v9, :cond_2c

    .line 486
    .line 487
    sget-object v9, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 488
    .line 489
    invoke-virtual {v9, v1, v8}, Landroidx/compose/material3/SnackbarDefaults;->getDismissActionContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 490
    .line 491
    .line 492
    move-result-wide v8

    .line 493
    and-int/2addr v4, v3

    .line 494
    move-wide v10, v8

    .line 495
    :cond_2c
    :goto_20
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 496
    .line 497
    .line 498
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 499
    .line 500
    .line 501
    move-result v3

    .line 502
    if-eqz v3, :cond_2d

    .line 503
    .line 504
    const/4 v3, -0x1

    .line 505
    const-string v8, "androidx.compose.material3.Snackbar (Snackbar.kt:107)"

    .line 506
    .line 507
    const v9, -0x49a8a49b

    .line 508
    .line 509
    .line 510
    invoke-static {v9, v4, v3, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 511
    .line 512
    .line 513
    :cond_2d
    sget-object v8, Landroidx/compose/material3/tokens/SnackbarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SnackbarTokens;

    .line 514
    .line 515
    invoke-virtual {v8}, Landroidx/compose/material3/tokens/SnackbarTokens;->getContainerElevation-D9Ej5fM()F

    .line 516
    .line 517
    .line 518
    move-result v8

    .line 519
    new-instance v9, Landroidx/compose/material3/SnackbarKt$Snackbar$1;

    .line 520
    .line 521
    move-object/from16 p0, v9

    .line 522
    .line 523
    move-object/from16 p1, v6

    .line 524
    .line 525
    move-object/from16 p2, p13

    .line 526
    .line 527
    move-object/from16 p3, v2

    .line 528
    .line 529
    move-wide/from16 p4, v21

    .line 530
    .line 531
    move-wide/from16 p6, v10

    .line 532
    .line 533
    move/from16 p8, v5

    .line 534
    .line 535
    invoke-direct/range {p0 .. p8}, Landroidx/compose/material3/SnackbarKt$Snackbar$1;-><init>(Lv3/p;Lv3/p;Lv3/p;JJZ)V

    .line 536
    .line 537
    .line 538
    const v3, -0x6d0e72d6

    .line 539
    .line 540
    .line 541
    move-object/from16 p14, v2

    .line 542
    .line 543
    const/4 v2, 0x1

    .line 544
    invoke-static {v1, v3, v2, v9}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    and-int/lit8 v3, v4, 0xe

    .line 549
    .line 550
    const/high16 v9, 0xc30000

    .line 551
    .line 552
    or-int/2addr v3, v9

    .line 553
    shr-int/lit8 v4, v4, 0x9

    .line 554
    .line 555
    and-int/lit8 v9, v4, 0x70

    .line 556
    .line 557
    or-int/2addr v3, v9

    .line 558
    and-int/lit16 v9, v4, 0x380

    .line 559
    .line 560
    or-int/2addr v3, v9

    .line 561
    and-int/lit16 v4, v4, 0x1c00

    .line 562
    .line 563
    or-int/2addr v3, v4

    .line 564
    const/16 v4, 0x50

    .line 565
    .line 566
    move-object/from16 p0, v0

    .line 567
    .line 568
    move-object/from16 p1, v7

    .line 569
    .line 570
    move-wide/from16 p2, v12

    .line 571
    .line 572
    move-wide/from16 p4, v19

    .line 573
    .line 574
    const/4 v9, 0x0

    .line 575
    move/from16 p6, v9

    .line 576
    .line 577
    move/from16 p7, v8

    .line 578
    .line 579
    const/4 v8, 0x0

    .line 580
    move-object/from16 p8, v8

    .line 581
    .line 582
    move-object/from16 p9, v2

    .line 583
    .line 584
    move-object/from16 p10, v1

    .line 585
    .line 586
    move/from16 p11, v3

    .line 587
    .line 588
    move/from16 p12, v4

    .line 589
    .line 590
    invoke-static/range {p0 .. p12}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 591
    .line 592
    .line 593
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    if-eqz v2, :cond_2e

    .line 598
    .line 599
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 600
    .line 601
    .line 602
    :cond_2e
    move-object/from16 v3, p14

    .line 603
    .line 604
    move-object v2, v0

    .line 605
    move v4, v5

    .line 606
    move-object v5, v7

    .line 607
    move-wide/from16 v16, v10

    .line 608
    .line 609
    move-wide/from16 v8, v19

    .line 610
    .line 611
    move-wide/from16 v10, v21

    .line 612
    .line 613
    :goto_21
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 614
    .line 615
    .line 616
    move-result-object v7

    .line 617
    if-eqz v7, :cond_2f

    .line 618
    .line 619
    new-instance v1, Landroidx/compose/material3/SnackbarKt$Snackbar$2;

    .line 620
    .line 621
    move-object v0, v1

    .line 622
    move-object/from16 v23, v1

    .line 623
    .line 624
    move-object v1, v2

    .line 625
    move-object v2, v6

    .line 626
    move-object/from16 v24, v7

    .line 627
    .line 628
    move-wide v6, v12

    .line 629
    move-wide/from16 v12, v16

    .line 630
    .line 631
    move-object/from16 v14, p13

    .line 632
    .line 633
    move/from16 v15, p15

    .line 634
    .line 635
    move/from16 v16, p16

    .line 636
    .line 637
    invoke-direct/range {v0 .. v16}, Landroidx/compose/material3/SnackbarKt$Snackbar$2;-><init>(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;ZLandroidx/compose/ui/graphics/Shape;JJJJLv3/p;II)V

    .line 638
    .line 639
    .line 640
    move-object/from16 v1, v23

    .line 641
    .line 642
    move-object/from16 v0, v24

    .line 643
    .line 644
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 645
    .line 646
    .line 647
    :cond_2f
    return-void
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method public static final Snackbar-sDKtq54(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V
    .locals 39
    .param p0    # Landroidx/compose/material3/SnackbarData;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p14    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v15, p15

    .line 4
    .line 5
    move/from16 v13, p16

    .line 6
    .line 7
    const v0, 0x105e641f

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p14

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    and-int/lit8 v3, v13, 0x1

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    or-int/lit8 v3, v15, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v3, v15, 0x6

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v3, v15

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v3, v15

    .line 39
    :goto_1
    and-int/lit8 v4, v13, 0x2

    .line 40
    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    or-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v5, v15, 0x30

    .line 47
    .line 48
    if-nez v5, :cond_5

    .line 49
    .line 50
    move-object/from16 v5, p1

    .line 51
    .line 52
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_4

    .line 57
    .line 58
    const/16 v6, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const/16 v6, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v3, v6

    .line 64
    goto :goto_4

    .line 65
    :cond_5
    :goto_3
    move-object/from16 v5, p1

    .line 66
    .line 67
    :goto_4
    and-int/lit8 v6, v13, 0x4

    .line 68
    .line 69
    if-eqz v6, :cond_6

    .line 70
    .line 71
    or-int/lit16 v3, v3, 0x180

    .line 72
    .line 73
    goto :goto_6

    .line 74
    :cond_6
    and-int/lit16 v7, v15, 0x180

    .line 75
    .line 76
    if-nez v7, :cond_8

    .line 77
    .line 78
    move/from16 v7, p2

    .line 79
    .line 80
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_7

    .line 85
    .line 86
    const/16 v8, 0x100

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_7
    const/16 v8, 0x80

    .line 90
    .line 91
    :goto_5
    or-int/2addr v3, v8

    .line 92
    goto :goto_7

    .line 93
    :cond_8
    :goto_6
    move/from16 v7, p2

    .line 94
    .line 95
    :goto_7
    and-int/lit16 v8, v15, 0xc00

    .line 96
    .line 97
    if-nez v8, :cond_b

    .line 98
    .line 99
    and-int/lit8 v8, v13, 0x8

    .line 100
    .line 101
    if-nez v8, :cond_9

    .line 102
    .line 103
    move-object/from16 v8, p3

    .line 104
    .line 105
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-eqz v9, :cond_a

    .line 110
    .line 111
    const/16 v9, 0x800

    .line 112
    .line 113
    goto :goto_8

    .line 114
    :cond_9
    move-object/from16 v8, p3

    .line 115
    .line 116
    :cond_a
    const/16 v9, 0x400

    .line 117
    .line 118
    :goto_8
    or-int/2addr v3, v9

    .line 119
    goto :goto_9

    .line 120
    :cond_b
    move-object/from16 v8, p3

    .line 121
    .line 122
    :goto_9
    and-int/lit16 v9, v15, 0x6000

    .line 123
    .line 124
    if-nez v9, :cond_e

    .line 125
    .line 126
    and-int/lit8 v9, v13, 0x10

    .line 127
    .line 128
    if-nez v9, :cond_c

    .line 129
    .line 130
    move-wide/from16 v9, p4

    .line 131
    .line 132
    invoke-interface {v2, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-eqz v11, :cond_d

    .line 137
    .line 138
    const/16 v11, 0x4000

    .line 139
    .line 140
    goto :goto_a

    .line 141
    :cond_c
    move-wide/from16 v9, p4

    .line 142
    .line 143
    :cond_d
    const/16 v11, 0x2000

    .line 144
    .line 145
    :goto_a
    or-int/2addr v3, v11

    .line 146
    goto :goto_b

    .line 147
    :cond_e
    move-wide/from16 v9, p4

    .line 148
    .line 149
    :goto_b
    const/high16 v11, 0x30000

    .line 150
    .line 151
    and-int/2addr v11, v15

    .line 152
    if-nez v11, :cond_11

    .line 153
    .line 154
    and-int/lit8 v11, v13, 0x20

    .line 155
    .line 156
    if-nez v11, :cond_f

    .line 157
    .line 158
    move-wide/from16 v11, p6

    .line 159
    .line 160
    invoke-interface {v2, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 161
    .line 162
    .line 163
    move-result v14

    .line 164
    if-eqz v14, :cond_10

    .line 165
    .line 166
    const/high16 v14, 0x20000

    .line 167
    .line 168
    goto :goto_c

    .line 169
    :cond_f
    move-wide/from16 v11, p6

    .line 170
    .line 171
    :cond_10
    const/high16 v14, 0x10000

    .line 172
    .line 173
    :goto_c
    or-int/2addr v3, v14

    .line 174
    goto :goto_d

    .line 175
    :cond_11
    move-wide/from16 v11, p6

    .line 176
    .line 177
    :goto_d
    const/high16 v14, 0x180000

    .line 178
    .line 179
    and-int/2addr v14, v15

    .line 180
    if-nez v14, :cond_13

    .line 181
    .line 182
    and-int/lit8 v14, v13, 0x40

    .line 183
    .line 184
    move-wide/from16 v0, p8

    .line 185
    .line 186
    if-nez v14, :cond_12

    .line 187
    .line 188
    invoke-interface {v2, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 189
    .line 190
    .line 191
    move-result v16

    .line 192
    if-eqz v16, :cond_12

    .line 193
    .line 194
    const/high16 v16, 0x100000

    .line 195
    .line 196
    goto :goto_e

    .line 197
    :cond_12
    const/high16 v16, 0x80000

    .line 198
    .line 199
    :goto_e
    or-int v3, v3, v16

    .line 200
    .line 201
    goto :goto_f

    .line 202
    :cond_13
    move-wide/from16 v0, p8

    .line 203
    .line 204
    :goto_f
    const/high16 v16, 0xc00000

    .line 205
    .line 206
    and-int v16, v15, v16

    .line 207
    .line 208
    if-nez v16, :cond_15

    .line 209
    .line 210
    and-int/lit16 v14, v13, 0x80

    .line 211
    .line 212
    move-wide/from16 v0, p10

    .line 213
    .line 214
    if-nez v14, :cond_14

    .line 215
    .line 216
    invoke-interface {v2, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 217
    .line 218
    .line 219
    move-result v14

    .line 220
    if-eqz v14, :cond_14

    .line 221
    .line 222
    const/high16 v14, 0x800000

    .line 223
    .line 224
    goto :goto_10

    .line 225
    :cond_14
    const/high16 v14, 0x400000

    .line 226
    .line 227
    :goto_10
    or-int/2addr v3, v14

    .line 228
    goto :goto_11

    .line 229
    :cond_15
    move-wide/from16 v0, p10

    .line 230
    .line 231
    :goto_11
    const/high16 v14, 0x6000000

    .line 232
    .line 233
    and-int/2addr v14, v15

    .line 234
    if-nez v14, :cond_17

    .line 235
    .line 236
    and-int/lit16 v14, v13, 0x100

    .line 237
    .line 238
    move-wide/from16 v0, p12

    .line 239
    .line 240
    if-nez v14, :cond_16

    .line 241
    .line 242
    invoke-interface {v2, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 243
    .line 244
    .line 245
    move-result v14

    .line 246
    if-eqz v14, :cond_16

    .line 247
    .line 248
    const/high16 v14, 0x4000000

    .line 249
    .line 250
    goto :goto_12

    .line 251
    :cond_16
    const/high16 v14, 0x2000000

    .line 252
    .line 253
    :goto_12
    or-int/2addr v3, v14

    .line 254
    goto :goto_13

    .line 255
    :cond_17
    move-wide/from16 v0, p12

    .line 256
    .line 257
    :goto_13
    const v14, 0x2492493

    .line 258
    .line 259
    .line 260
    and-int/2addr v14, v3

    .line 261
    const v0, 0x2492492

    .line 262
    .line 263
    .line 264
    if-ne v14, v0, :cond_19

    .line 265
    .line 266
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-nez v0, :cond_18

    .line 271
    .line 272
    goto :goto_14

    .line 273
    :cond_18
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 274
    .line 275
    .line 276
    move-object/from16 v14, p0

    .line 277
    .line 278
    move-wide/from16 v33, p10

    .line 279
    .line 280
    move-wide/from16 v35, p12

    .line 281
    .line 282
    move v3, v7

    .line 283
    move-object v4, v8

    .line 284
    move-wide v7, v9

    .line 285
    move-wide v9, v11

    .line 286
    move-wide/from16 v11, p8

    .line 287
    .line 288
    goto/16 :goto_20

    .line 289
    .line 290
    :cond_19
    :goto_14
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 291
    .line 292
    .line 293
    and-int/lit8 v0, v15, 0x1

    .line 294
    .line 295
    const v1, -0xe000001

    .line 296
    .line 297
    .line 298
    const v14, -0x1c00001

    .line 299
    .line 300
    .line 301
    const v16, -0x380001

    .line 302
    .line 303
    .line 304
    const v17, -0x70001

    .line 305
    .line 306
    .line 307
    const v18, -0xe001

    .line 308
    .line 309
    .line 310
    if-eqz v0, :cond_21

    .line 311
    .line 312
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_1a

    .line 317
    .line 318
    goto :goto_15

    .line 319
    :cond_1a
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 320
    .line 321
    .line 322
    and-int/lit8 v0, v13, 0x8

    .line 323
    .line 324
    if-eqz v0, :cond_1b

    .line 325
    .line 326
    and-int/lit16 v3, v3, -0x1c01

    .line 327
    .line 328
    :cond_1b
    and-int/lit8 v0, v13, 0x10

    .line 329
    .line 330
    if-eqz v0, :cond_1c

    .line 331
    .line 332
    and-int v3, v3, v18

    .line 333
    .line 334
    :cond_1c
    and-int/lit8 v0, v13, 0x20

    .line 335
    .line 336
    if-eqz v0, :cond_1d

    .line 337
    .line 338
    and-int v3, v3, v17

    .line 339
    .line 340
    :cond_1d
    and-int/lit8 v0, v13, 0x40

    .line 341
    .line 342
    if-eqz v0, :cond_1e

    .line 343
    .line 344
    and-int v3, v3, v16

    .line 345
    .line 346
    :cond_1e
    and-int/lit16 v0, v13, 0x80

    .line 347
    .line 348
    if-eqz v0, :cond_1f

    .line 349
    .line 350
    and-int/2addr v3, v14

    .line 351
    :cond_1f
    and-int/lit16 v0, v13, 0x100

    .line 352
    .line 353
    if-eqz v0, :cond_20

    .line 354
    .line 355
    and-int/2addr v3, v1

    .line 356
    :cond_20
    move-wide/from16 v33, p10

    .line 357
    .line 358
    move-wide/from16 v35, p12

    .line 359
    .line 360
    move-object v0, v5

    .line 361
    move v4, v7

    .line 362
    move-object v5, v8

    .line 363
    move-wide v7, v9

    .line 364
    move-wide v9, v11

    .line 365
    move-wide/from16 v11, p8

    .line 366
    .line 367
    goto/16 :goto_1d

    .line 368
    .line 369
    :cond_21
    :goto_15
    if-eqz v4, :cond_22

    .line 370
    .line 371
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 372
    .line 373
    goto :goto_16

    .line 374
    :cond_22
    move-object v0, v5

    .line 375
    :goto_16
    if-eqz v6, :cond_23

    .line 376
    .line 377
    const/4 v4, 0x0

    .line 378
    goto :goto_17

    .line 379
    :cond_23
    move v4, v7

    .line 380
    :goto_17
    and-int/lit8 v5, v13, 0x8

    .line 381
    .line 382
    const/4 v6, 0x6

    .line 383
    if-eqz v5, :cond_24

    .line 384
    .line 385
    sget-object v5, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 386
    .line 387
    invoke-virtual {v5, v2, v6}, Landroidx/compose/material3/SnackbarDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    and-int/lit16 v3, v3, -0x1c01

    .line 392
    .line 393
    goto :goto_18

    .line 394
    :cond_24
    move-object v5, v8

    .line 395
    :goto_18
    and-int/lit8 v7, v13, 0x10

    .line 396
    .line 397
    if-eqz v7, :cond_25

    .line 398
    .line 399
    sget-object v7, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 400
    .line 401
    invoke-virtual {v7, v2, v6}, Landroidx/compose/material3/SnackbarDefaults;->getColor(Landroidx/compose/runtime/Composer;I)J

    .line 402
    .line 403
    .line 404
    move-result-wide v7

    .line 405
    and-int v3, v3, v18

    .line 406
    .line 407
    goto :goto_19

    .line 408
    :cond_25
    move-wide v7, v9

    .line 409
    :goto_19
    and-int/lit8 v9, v13, 0x20

    .line 410
    .line 411
    if-eqz v9, :cond_26

    .line 412
    .line 413
    sget-object v9, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 414
    .line 415
    invoke-virtual {v9, v2, v6}, Landroidx/compose/material3/SnackbarDefaults;->getContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 416
    .line 417
    .line 418
    move-result-wide v9

    .line 419
    and-int v3, v3, v17

    .line 420
    .line 421
    goto :goto_1a

    .line 422
    :cond_26
    move-wide v9, v11

    .line 423
    :goto_1a
    and-int/lit8 v11, v13, 0x40

    .line 424
    .line 425
    if-eqz v11, :cond_27

    .line 426
    .line 427
    sget-object v11, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 428
    .line 429
    invoke-virtual {v11, v2, v6}, Landroidx/compose/material3/SnackbarDefaults;->getActionColor(Landroidx/compose/runtime/Composer;I)J

    .line 430
    .line 431
    .line 432
    move-result-wide v11

    .line 433
    and-int v3, v3, v16

    .line 434
    .line 435
    goto :goto_1b

    .line 436
    :cond_27
    move-wide/from16 v11, p8

    .line 437
    .line 438
    :goto_1b
    and-int/lit16 v1, v13, 0x80

    .line 439
    .line 440
    if-eqz v1, :cond_28

    .line 441
    .line 442
    sget-object v1, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 443
    .line 444
    invoke-virtual {v1, v2, v6}, Landroidx/compose/material3/SnackbarDefaults;->getActionContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 445
    .line 446
    .line 447
    move-result-wide v17

    .line 448
    and-int v1, v3, v14

    .line 449
    .line 450
    move v3, v1

    .line 451
    goto :goto_1c

    .line 452
    :cond_28
    move-wide/from16 v17, p10

    .line 453
    .line 454
    :goto_1c
    and-int/lit16 v1, v13, 0x100

    .line 455
    .line 456
    if-eqz v1, :cond_29

    .line 457
    .line 458
    sget-object v1, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 459
    .line 460
    invoke-virtual {v1, v2, v6}, Landroidx/compose/material3/SnackbarDefaults;->getDismissActionContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 461
    .line 462
    .line 463
    move-result-wide v19

    .line 464
    const v1, -0xe000001

    .line 465
    .line 466
    .line 467
    and-int/2addr v3, v1

    .line 468
    move-wide/from16 v33, v17

    .line 469
    .line 470
    move-wide/from16 v35, v19

    .line 471
    .line 472
    goto :goto_1d

    .line 473
    :cond_29
    move-wide/from16 v35, p12

    .line 474
    .line 475
    move-wide/from16 v33, v17

    .line 476
    .line 477
    :goto_1d
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 478
    .line 479
    .line 480
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    if-eqz v1, :cond_2a

    .line 485
    .line 486
    const/4 v1, -0x1

    .line 487
    const-string v6, "androidx.compose.material3.Snackbar (Snackbar.kt:209)"

    .line 488
    .line 489
    const v14, 0x105e641f

    .line 490
    .line 491
    .line 492
    invoke-static {v14, v3, v1, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 493
    .line 494
    .line 495
    :cond_2a
    invoke-interface/range {p0 .. p0}, Landroidx/compose/material3/SnackbarData;->getVisuals()Landroidx/compose/material3/SnackbarVisuals;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    invoke-interface {v1}, Landroidx/compose/material3/SnackbarVisuals;->getActionLabel()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    if-eqz v1, :cond_2b

    .line 504
    .line 505
    new-instance v6, Landroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1;

    .line 506
    .line 507
    move-object/from16 v14, p0

    .line 508
    .line 509
    invoke-direct {v6, v11, v12, v14, v1}, Landroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1;-><init>(JLandroidx/compose/material3/SnackbarData;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    const v1, -0x5227657f

    .line 513
    .line 514
    .line 515
    move-wide/from16 p3, v11

    .line 516
    .line 517
    const/4 v11, 0x1

    .line 518
    invoke-static {v2, v1, v11, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    move-object/from16 v17, v1

    .line 523
    .line 524
    goto :goto_1e

    .line 525
    :cond_2b
    move-object/from16 v14, p0

    .line 526
    .line 527
    move-wide/from16 p3, v11

    .line 528
    .line 529
    const/4 v11, 0x1

    .line 530
    const/16 v17, 0x0

    .line 531
    .line 532
    :goto_1e
    invoke-interface/range {p0 .. p0}, Landroidx/compose/material3/SnackbarData;->getVisuals()Landroidx/compose/material3/SnackbarVisuals;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    invoke-interface {v1}, Landroidx/compose/material3/SnackbarVisuals;->getWithDismissAction()Z

    .line 537
    .line 538
    .line 539
    move-result v1

    .line 540
    if-eqz v1, :cond_2c

    .line 541
    .line 542
    new-instance v1, Landroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1;

    .line 543
    .line 544
    invoke-direct {v1, v14}, Landroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1;-><init>(Landroidx/compose/material3/SnackbarData;)V

    .line 545
    .line 546
    .line 547
    const v6, -0x6c0a98b1

    .line 548
    .line 549
    .line 550
    invoke-static {v2, v6, v11, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    move-object/from16 v18, v1

    .line 555
    .line 556
    goto :goto_1f

    .line 557
    :cond_2c
    const/16 v18, 0x0

    .line 558
    .line 559
    :goto_1f
    const/16 v1, 0xc

    .line 560
    .line 561
    int-to-float v1, v1

    .line 562
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 567
    .line 568
    .line 569
    move-result-object v16

    .line 570
    new-instance v1, Landroidx/compose/material3/SnackbarKt$Snackbar$3;

    .line 571
    .line 572
    invoke-direct {v1, v14}, Landroidx/compose/material3/SnackbarKt$Snackbar$3;-><init>(Landroidx/compose/material3/SnackbarData;)V

    .line 573
    .line 574
    .line 575
    const v6, -0x4b7b9086

    .line 576
    .line 577
    .line 578
    invoke-static {v2, v6, v11, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 579
    .line 580
    .line 581
    move-result-object v29

    .line 582
    shl-int/lit8 v1, v3, 0x3

    .line 583
    .line 584
    and-int/lit16 v6, v1, 0x1c00

    .line 585
    .line 586
    const/high16 v11, 0x30000000

    .line 587
    .line 588
    or-int/2addr v6, v11

    .line 589
    const v11, 0xe000

    .line 590
    .line 591
    .line 592
    and-int/2addr v11, v1

    .line 593
    or-int/2addr v6, v11

    .line 594
    const/high16 v11, 0x70000

    .line 595
    .line 596
    and-int/2addr v11, v1

    .line 597
    or-int/2addr v6, v11

    .line 598
    const/high16 v11, 0x380000

    .line 599
    .line 600
    and-int/2addr v1, v11

    .line 601
    or-int/2addr v1, v6

    .line 602
    const/high16 v6, 0x1c00000

    .line 603
    .line 604
    and-int/2addr v6, v3

    .line 605
    or-int/2addr v1, v6

    .line 606
    const/high16 v6, 0xe000000

    .line 607
    .line 608
    and-int/2addr v3, v6

    .line 609
    or-int v31, v1, v3

    .line 610
    .line 611
    const/16 v32, 0x0

    .line 612
    .line 613
    move/from16 v19, v4

    .line 614
    .line 615
    move-object/from16 v20, v5

    .line 616
    .line 617
    move-wide/from16 v21, v7

    .line 618
    .line 619
    move-wide/from16 v23, v9

    .line 620
    .line 621
    move-wide/from16 v25, v33

    .line 622
    .line 623
    move-wide/from16 v27, v35

    .line 624
    .line 625
    move-object/from16 v30, v2

    .line 626
    .line 627
    invoke-static/range {v16 .. v32}, Landroidx/compose/material3/SnackbarKt;->Snackbar-eQBnUkQ(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;ZLandroidx/compose/ui/graphics/Shape;JJJJLv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 628
    .line 629
    .line 630
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 631
    .line 632
    .line 633
    move-result v1

    .line 634
    if-eqz v1, :cond_2d

    .line 635
    .line 636
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 637
    .line 638
    .line 639
    :cond_2d
    move-wide/from16 v11, p3

    .line 640
    .line 641
    move v3, v4

    .line 642
    move-object v4, v5

    .line 643
    move-object v5, v0

    .line 644
    :goto_20
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 645
    .line 646
    .line 647
    move-result-object v6

    .line 648
    if-eqz v6, :cond_2e

    .line 649
    .line 650
    new-instance v2, Landroidx/compose/material3/SnackbarKt$Snackbar$4;

    .line 651
    .line 652
    move-object v0, v2

    .line 653
    move-object/from16 v1, p0

    .line 654
    .line 655
    move-object v14, v2

    .line 656
    move-object v2, v5

    .line 657
    move-object/from16 v37, v6

    .line 658
    .line 659
    move-wide v5, v7

    .line 660
    move-wide v7, v9

    .line 661
    move-wide v9, v11

    .line 662
    move-wide/from16 v11, v33

    .line 663
    .line 664
    move-object/from16 v38, v14

    .line 665
    .line 666
    move-wide/from16 v13, v35

    .line 667
    .line 668
    move/from16 v15, p15

    .line 669
    .line 670
    move/from16 v16, p16

    .line 671
    .line 672
    invoke-direct/range {v0 .. v16}, Landroidx/compose/material3/SnackbarKt$Snackbar$4;-><init>(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJII)V

    .line 673
    .line 674
    .line 675
    move-object/from16 v0, v37

    .line 676
    .line 677
    move-object/from16 v1, v38

    .line 678
    .line 679
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 680
    .line 681
    .line 682
    :cond_2e
    return-void
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
.end method

.method public static final synthetic access$NewLineButtonSnackbar-kKq0p4A(Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p9}, Landroidx/compose/material3/SnackbarKt;->NewLineButtonSnackbar-kKq0p4A(Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$OneRowSnackbar-kKq0p4A(Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p9}, Landroidx/compose/material3/SnackbarKt;->OneRowSnackbar-kKq0p4A(Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$getContainerMaxWidth$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/SnackbarKt;->ContainerMaxWidth:F

    return v0
.end method

.method public static final synthetic access$getHeightToFirstLine$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/SnackbarKt;->HeightToFirstLine:F

    return v0
.end method

.method public static final synthetic access$getTextEndExtraSpacing$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/SnackbarKt;->TextEndExtraSpacing:F

    return v0
.end method
