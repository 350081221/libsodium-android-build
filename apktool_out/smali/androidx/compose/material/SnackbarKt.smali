.class public final Landroidx/compose/material/SnackbarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u001ax\u0010\u0012\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0015\u0008\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a`\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\"\u0010\u0018\u001a\u00020\u00032\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u0004H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a5\u0010\u001b\u001a\u00020\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u0004H\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a5\u0010\u001d\u001a\u00020\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u0004H\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001f\"\u0014\u0010!\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001f\"\u0014\u0010\"\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u001f\"\u0014\u0010#\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u001f\"\u0014\u0010$\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010\u001f\"\u0014\u0010%\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u001f\"\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\u001f\"\u0014\u0010\'\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u001f\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006("
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "action",
        "",
        "actionOnNewLine",
        "Landroidx/compose/ui/graphics/Shape;",
        "shape",
        "Landroidx/compose/ui/graphics/Color;",
        "backgroundColor",
        "contentColor",
        "Landroidx/compose/ui/unit/Dp;",
        "elevation",
        "content",
        "Snackbar-7zSek6w",
        "(Landroidx/compose/ui/Modifier;Lv3/p;ZLandroidx/compose/ui/graphics/Shape;JJFLv3/p;Landroidx/compose/runtime/Composer;II)V",
        "Snackbar",
        "Landroidx/compose/material/SnackbarData;",
        "snackbarData",
        "actionColor",
        "Snackbar-sPrSdHI",
        "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V",
        "TextOnlySnackbar",
        "(Lv3/p;Landroidx/compose/runtime/Composer;I)V",
        "text",
        "NewLineButtonSnackbar",
        "(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V",
        "OneRowSnackbar",
        "HeightToFirstLine",
        "F",
        "HorizontalSpacing",
        "HorizontalSpacingButtonSide",
        "SeparateButtonExtraY",
        "SnackbarVerticalPadding",
        "TextEndExtraSpacing",
        "LongButtonVerticalOffset",
        "SnackbarMinHeightOneLine",
        "SnackbarMinHeightTwoLines",
        "material_release"
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
        "SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,366:1\n154#2:367\n154#2:368\n154#2:369\n154#2:683\n154#2:684\n154#2:685\n154#2:686\n154#2:687\n154#2:688\n154#2:689\n154#2:690\n154#2:691\n76#3,14:370\n79#3,11:407\n92#3:439\n92#3:444\n79#3,11:451\n79#3,11:486\n92#3:518\n79#3,11:526\n92#3:558\n92#3:563\n79#3,11:571\n79#3,11:605\n92#3:637\n79#3,11:645\n92#3:677\n92#3:682\n456#4,8:384\n464#4,3:398\n456#4,8:418\n464#4,3:432\n467#4,3:436\n467#4,3:441\n456#4,8:462\n464#4,3:476\n456#4,8:497\n464#4,3:511\n467#4,3:515\n456#4,8:537\n464#4,3:551\n467#4,3:555\n467#4,3:560\n456#4,8:582\n464#4,3:596\n456#4,8:616\n464#4,3:630\n467#4,3:634\n456#4,8:656\n464#4,3:670\n467#4,3:674\n467#4,3:679\n3737#5,6:392\n3737#5,6:426\n3737#5,6:470\n3737#5,6:505\n3737#5,6:545\n3737#5,6:590\n3737#5,6:624\n3737#5,6:664\n68#6,6:401\n74#6:435\n78#6:440\n68#6,6:480\n74#6:514\n78#6:519\n68#6,6:520\n74#6:554\n78#6:559\n68#6,6:599\n74#6:633\n78#6:638\n68#6,6:639\n74#6:673\n78#6:678\n74#7,6:445\n80#7:479\n84#7:564\n1116#8,6:565\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n*L\n89#1:367\n161#1:368\n176#1:369\n357#1:683\n358#1:684\n359#1:685\n360#1:686\n361#1:687\n362#1:688\n363#1:689\n364#1:690\n365#1:691\n238#1:370,14\n239#1:407,11\n239#1:439\n238#1:444\n276#1:451,11\n284#1:486,11\n284#1:518\n288#1:526,11\n288#1:558\n276#1:563\n299#1:571,11\n301#1:605,11\n301#1:637\n302#1:645,11\n302#1:677\n299#1:682\n238#1:384,8\n238#1:398,3\n239#1:418,8\n239#1:432,3\n239#1:436,3\n238#1:441,3\n276#1:462,8\n276#1:476,3\n284#1:497,8\n284#1:511,3\n284#1:515,3\n288#1:537,8\n288#1:551,3\n288#1:555,3\n276#1:560,3\n299#1:582,8\n299#1:596,3\n301#1:616,8\n301#1:630,3\n301#1:634,3\n302#1:656,8\n302#1:670,3\n302#1:674,3\n299#1:679,3\n238#1:392,6\n239#1:426,6\n276#1:470,6\n284#1:505,6\n288#1:545,6\n299#1:590,6\n301#1:624,6\n302#1:664,6\n239#1:401,6\n239#1:435\n239#1:440\n284#1:480,6\n284#1:514\n284#1:519\n288#1:520,6\n288#1:554\n288#1:559\n301#1:599,6\n301#1:633\n301#1:638\n302#1:639,6\n302#1:673\n302#1:678\n276#1:445,6\n276#1:479\n276#1:564\n308#1:565,6\n*E\n"
    }
.end annotation


# static fields
.field private static final HeightToFirstLine:F

.field private static final HorizontalSpacing:F

.field private static final HorizontalSpacingButtonSide:F

.field private static final LongButtonVerticalOffset:F

.field private static final SeparateButtonExtraY:F

.field private static final SnackbarMinHeightOneLine:F

.field private static final SnackbarMinHeightTwoLines:F

.field private static final SnackbarVerticalPadding:F

.field private static final TextEndExtraSpacing:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x1e

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
    sput v0, Landroidx/compose/material/SnackbarKt;->HeightToFirstLine:F

    .line 9
    .line 10
    const/16 v0, 0x10

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
    sput v0, Landroidx/compose/material/SnackbarKt;->HorizontalSpacing:F

    .line 18
    .line 19
    const/16 v0, 0x8

    .line 20
    .line 21
    int-to-float v0, v0

    .line 22
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    sput v1, Landroidx/compose/material/SnackbarKt;->HorizontalSpacingButtonSide:F

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    int-to-float v1, v1

    .line 30
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    sput v1, Landroidx/compose/material/SnackbarKt;->SeparateButtonExtraY:F

    .line 35
    .line 36
    const/4 v1, 0x6

    .line 37
    int-to-float v1, v1

    .line 38
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sput v1, Landroidx/compose/material/SnackbarKt;->SnackbarVerticalPadding:F

    .line 43
    .line 44
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    sput v0, Landroidx/compose/material/SnackbarKt;->TextEndExtraSpacing:F

    .line 49
    .line 50
    const/16 v0, 0xc

    .line 51
    .line 52
    int-to-float v0, v0

    .line 53
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    sput v0, Landroidx/compose/material/SnackbarKt;->LongButtonVerticalOffset:F

    .line 58
    .line 59
    const/16 v0, 0x30

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
    sput v0, Landroidx/compose/material/SnackbarKt;->SnackbarMinHeightOneLine:F

    .line 67
    .line 68
    const/16 v0, 0x44

    .line 69
    .line 70
    int-to-float v0, v0

    .line 71
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    sput v0, Landroidx/compose/material/SnackbarKt;->SnackbarMinHeightTwoLines:F

    .line 76
    .line 77
    return-void
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

.method private static final NewLineButtonSnackbar(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V
    .locals 20
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
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
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, -0x494235bc

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    and-int/lit8 v5, v2, 0xe

    .line 17
    .line 18
    if-nez v5, :cond_1

    .line 19
    .line 20
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    const/4 v5, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v5, 0x2

    .line 29
    :goto_0
    or-int/2addr v5, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v5, v2

    .line 32
    :goto_1
    and-int/lit8 v6, v2, 0x70

    .line 33
    .line 34
    if-nez v6, :cond_3

    .line 35
    .line 36
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    const/16 v6, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v6, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v5, v6

    .line 48
    :cond_3
    and-int/lit8 v6, v5, 0x5b

    .line 49
    .line 50
    const/16 v7, 0x12

    .line 51
    .line 52
    if-ne v6, v7, :cond_5

    .line 53
    .line 54
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_6

    .line 71
    .line 72
    const/4 v6, -0x1

    .line 73
    const-string v7, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:274)"

    .line 74
    .line 75
    invoke-static {v3, v5, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_6
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 79
    .line 80
    const/4 v6, 0x1

    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, 0x0

    .line 83
    invoke-static {v3, v8, v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    sget v10, Landroidx/compose/material/SnackbarKt;->HorizontalSpacing:F

    .line 88
    .line 89
    const/4 v11, 0x0

    .line 90
    sget v6, Landroidx/compose/material/SnackbarKt;->HorizontalSpacingButtonSide:F

    .line 91
    .line 92
    sget v13, Landroidx/compose/material/SnackbarKt;->SeparateButtonExtraY:F

    .line 93
    .line 94
    const/4 v14, 0x2

    .line 95
    const/4 v15, 0x0

    .line 96
    move v12, v6

    .line 97
    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    const v8, -0x1cd0f17e

    .line 102
    .line 103
    .line 104
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 105
    .line 106
    .line 107
    sget-object v8, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 108
    .line 109
    invoke-virtual {v8}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    sget-object v9, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 114
    .line 115
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    const/4 v11, 0x0

    .line 120
    invoke-static {v8, v10, v4, v11}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    const v10, -0x4ee9b9da

    .line 125
    .line 126
    .line 127
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 128
    .line 129
    .line 130
    invoke-static {v4, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    sget-object v19, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 139
    .line 140
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 149
    .line 150
    .line 151
    move-result-object v15

    .line 152
    instance-of v15, v15, Landroidx/compose/runtime/Applier;

    .line 153
    .line 154
    if-nez v15, :cond_7

    .line 155
    .line 156
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 157
    .line 158
    .line 159
    :cond_7
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 160
    .line 161
    .line 162
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 163
    .line 164
    .line 165
    move-result v15

    .line 166
    if-eqz v15, :cond_8

    .line 167
    .line 168
    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_8
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 173
    .line 174
    .line 175
    :goto_4
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    invoke-static {v14, v8, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    invoke-static {v14, v13, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 198
    .line 199
    .line 200
    move-result v13

    .line 201
    if-nez v13, :cond_9

    .line 202
    .line 203
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v13

    .line 207
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v15

    .line 211
    invoke-static {v13, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    if-nez v13, :cond_a

    .line 216
    .line 217
    :cond_9
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v13

    .line 221
    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    invoke-interface {v14, v12, v8}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 229
    .line 230
    .line 231
    :cond_a
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-static {v8}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v12

    .line 243
    invoke-interface {v7, v8, v4, v12}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    const v7, 0x7ab4aae9

    .line 247
    .line 248
    .line 249
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 250
    .line 251
    .line 252
    sget-object v8, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 253
    .line 254
    sget v12, Landroidx/compose/material/SnackbarKt;->HeightToFirstLine:F

    .line 255
    .line 256
    sget v13, Landroidx/compose/material/SnackbarKt;->LongButtonVerticalOffset:F

    .line 257
    .line 258
    invoke-static {v3, v12, v13}, Landroidx/compose/foundation/layout/AlignmentLineKt;->paddingFromBaseline-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    const/4 v13, 0x0

    .line 263
    const/4 v14, 0x0

    .line 264
    const/16 v16, 0x0

    .line 265
    .line 266
    const/16 v17, 0xb

    .line 267
    .line 268
    const/16 v18, 0x0

    .line 269
    .line 270
    move v15, v6

    .line 271
    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    const v12, 0x2bb5b5d7

    .line 276
    .line 277
    .line 278
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 282
    .line 283
    .line 284
    move-result-object v13

    .line 285
    invoke-static {v13, v11, v4, v11}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 286
    .line 287
    .line 288
    move-result-object v13

    .line 289
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 290
    .line 291
    .line 292
    invoke-static {v4, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 293
    .line 294
    .line 295
    move-result v14

    .line 296
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 297
    .line 298
    .line 299
    move-result-object v15

    .line 300
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-static {v6}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 309
    .line 310
    .line 311
    move-result-object v12

    .line 312
    instance-of v12, v12, Landroidx/compose/runtime/Applier;

    .line 313
    .line 314
    if-nez v12, :cond_b

    .line 315
    .line 316
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 317
    .line 318
    .line 319
    :cond_b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 320
    .line 321
    .line 322
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 323
    .line 324
    .line 325
    move-result v12

    .line 326
    if-eqz v12, :cond_c

    .line 327
    .line 328
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 329
    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 333
    .line 334
    .line 335
    :goto_5
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 336
    .line 337
    .line 338
    move-result-object v10

    .line 339
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 340
    .line 341
    .line 342
    move-result-object v12

    .line 343
    invoke-static {v10, v13, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 347
    .line 348
    .line 349
    move-result-object v12

    .line 350
    invoke-static {v10, v15, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 354
    .line 355
    .line 356
    move-result-object v12

    .line 357
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 358
    .line 359
    .line 360
    move-result v13

    .line 361
    if-nez v13, :cond_d

    .line 362
    .line 363
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v13

    .line 367
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 368
    .line 369
    .line 370
    move-result-object v15

    .line 371
    invoke-static {v13, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v13

    .line 375
    if-nez v13, :cond_e

    .line 376
    .line 377
    :cond_d
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 378
    .line 379
    .line 380
    move-result-object v13

    .line 381
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object v13

    .line 388
    invoke-interface {v10, v13, v12}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 389
    .line 390
    .line 391
    :cond_e
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 392
    .line 393
    .line 394
    move-result-object v10

    .line 395
    invoke-static {v10}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 396
    .line 397
    .line 398
    move-result-object v10

    .line 399
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v12

    .line 403
    invoke-interface {v6, v10, v4, v12}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 407
    .line 408
    .line 409
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 410
    .line 411
    and-int/lit8 v6, v5, 0xe

    .line 412
    .line 413
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    invoke-interface {v0, v4, v6}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 421
    .line 422
    .line 423
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 424
    .line 425
    .line 426
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 427
    .line 428
    .line 429
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getEnd()Landroidx/compose/ui/Alignment$Horizontal;

    .line 433
    .line 434
    .line 435
    move-result-object v6

    .line 436
    invoke-interface {v8, v3, v6}, Landroidx/compose/foundation/layout/ColumnScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    const v6, 0x2bb5b5d7

    .line 441
    .line 442
    .line 443
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 447
    .line 448
    .line 449
    move-result-object v6

    .line 450
    invoke-static {v6, v11, v4, v11}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    const v8, -0x4ee9b9da

    .line 455
    .line 456
    .line 457
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 458
    .line 459
    .line 460
    invoke-static {v4, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 461
    .line 462
    .line 463
    move-result v8

    .line 464
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 465
    .line 466
    .line 467
    move-result-object v9

    .line 468
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 469
    .line 470
    .line 471
    move-result-object v10

    .line 472
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 477
    .line 478
    .line 479
    move-result-object v12

    .line 480
    instance-of v12, v12, Landroidx/compose/runtime/Applier;

    .line 481
    .line 482
    if-nez v12, :cond_f

    .line 483
    .line 484
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 485
    .line 486
    .line 487
    :cond_f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 488
    .line 489
    .line 490
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 491
    .line 492
    .line 493
    move-result v12

    .line 494
    if-eqz v12, :cond_10

    .line 495
    .line 496
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 497
    .line 498
    .line 499
    goto :goto_6

    .line 500
    :cond_10
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 501
    .line 502
    .line 503
    :goto_6
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 504
    .line 505
    .line 506
    move-result-object v10

    .line 507
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 508
    .line 509
    .line 510
    move-result-object v12

    .line 511
    invoke-static {v10, v6, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 515
    .line 516
    .line 517
    move-result-object v6

    .line 518
    invoke-static {v10, v9, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 522
    .line 523
    .line 524
    move-result-object v6

    .line 525
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 526
    .line 527
    .line 528
    move-result v9

    .line 529
    if-nez v9, :cond_11

    .line 530
    .line 531
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v9

    .line 535
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 536
    .line 537
    .line 538
    move-result-object v12

    .line 539
    invoke-static {v9, v12}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-result v9

    .line 543
    if-nez v9, :cond_12

    .line 544
    .line 545
    :cond_11
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 546
    .line 547
    .line 548
    move-result-object v9

    .line 549
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 553
    .line 554
    .line 555
    move-result-object v8

    .line 556
    invoke-interface {v10, v8, v6}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 557
    .line 558
    .line 559
    :cond_12
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 560
    .line 561
    .line 562
    move-result-object v6

    .line 563
    invoke-static {v6}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 564
    .line 565
    .line 566
    move-result-object v6

    .line 567
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 568
    .line 569
    .line 570
    move-result-object v8

    .line 571
    invoke-interface {v3, v6, v4, v8}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 575
    .line 576
    .line 577
    shr-int/lit8 v3, v5, 0x3

    .line 578
    .line 579
    and-int/lit8 v3, v3, 0xe

    .line 580
    .line 581
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    invoke-interface {v1, v4, v3}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 589
    .line 590
    .line 591
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 592
    .line 593
    .line 594
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 595
    .line 596
    .line 597
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 598
    .line 599
    .line 600
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 601
    .line 602
    .line 603
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 604
    .line 605
    .line 606
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 607
    .line 608
    .line 609
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 610
    .line 611
    .line 612
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    if-eqz v3, :cond_13

    .line 617
    .line 618
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 619
    .line 620
    .line 621
    :cond_13
    :goto_7
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    if-eqz v3, :cond_14

    .line 626
    .line 627
    new-instance v4, Landroidx/compose/material/SnackbarKt$NewLineButtonSnackbar$2;

    .line 628
    .line 629
    invoke-direct {v4, v0, v1, v2}, Landroidx/compose/material/SnackbarKt$NewLineButtonSnackbar$2;-><init>(Lv3/p;Lv3/p;I)V

    .line 630
    .line 631
    .line 632
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 633
    .line 634
    .line 635
    :cond_14
    return-void
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
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
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
.end method

.method private static final OneRowSnackbar(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
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
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, -0x1fe09a12

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    and-int/lit8 v5, v2, 0xe

    .line 17
    .line 18
    if-nez v5, :cond_1

    .line 19
    .line 20
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    const/4 v5, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v5, 0x2

    .line 29
    :goto_0
    or-int/2addr v5, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v5, v2

    .line 32
    :goto_1
    and-int/lit8 v6, v2, 0x70

    .line 33
    .line 34
    if-nez v6, :cond_3

    .line 35
    .line 36
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    const/16 v6, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v6, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v5, v6

    .line 48
    :cond_3
    and-int/lit8 v6, v5, 0x5b

    .line 49
    .line 50
    const/16 v7, 0x12

    .line 51
    .line 52
    if-ne v6, v7, :cond_5

    .line 53
    .line 54
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_6

    .line 71
    .line 72
    const/4 v6, -0x1

    .line 73
    const-string v7, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:295)"

    .line 74
    .line 75
    invoke-static {v3, v5, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_6
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 79
    .line 80
    sget v9, Landroidx/compose/material/SnackbarKt;->HorizontalSpacing:F

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    sget v11, Landroidx/compose/material/SnackbarKt;->HorizontalSpacingButtonSide:F

    .line 84
    .line 85
    const/4 v12, 0x0

    .line 86
    const/16 v13, 0xa

    .line 87
    .line 88
    const/4 v14, 0x0

    .line 89
    move-object v8, v3

    .line 90
    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    const v7, -0x651d40b3

    .line 95
    .line 96
    .line 97
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 98
    .line 99
    .line 100
    const-string v7, "action"

    .line 101
    .line 102
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    const-string v9, "text"

    .line 107
    .line 108
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    or-int/2addr v8, v10

    .line 113
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    if-nez v8, :cond_7

    .line 118
    .line 119
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 120
    .line 121
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    if-ne v10, v8, :cond_8

    .line 126
    .line 127
    :cond_7
    new-instance v10, Landroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1;

    .line 128
    .line 129
    invoke-direct {v10, v7, v9}, Landroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_8
    check-cast v10, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 136
    .line 137
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 138
    .line 139
    .line 140
    const v8, -0x4ee9b9da

    .line 141
    .line 142
    .line 143
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 144
    .line 145
    .line 146
    const/4 v11, 0x0

    .line 147
    invoke-static {v4, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 152
    .line 153
    .line 154
    move-result-object v13

    .line 155
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 156
    .line 157
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 158
    .line 159
    .line 160
    move-result-object v15

    .line 161
    invoke-static {v6}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    instance-of v8, v8, Landroidx/compose/runtime/Applier;

    .line 170
    .line 171
    if-nez v8, :cond_9

    .line 172
    .line 173
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 174
    .line 175
    .line 176
    :cond_9
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 177
    .line 178
    .line 179
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    if-eqz v8, :cond_a

    .line 184
    .line 185
    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 190
    .line 191
    .line 192
    :goto_4
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 197
    .line 198
    .line 199
    move-result-object v15

    .line 200
    invoke-static {v8, v10, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    invoke-static {v8, v13, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 215
    .line 216
    .line 217
    move-result v13

    .line 218
    if-nez v13, :cond_b

    .line 219
    .line 220
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v13

    .line 224
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v15

    .line 228
    invoke-static {v13, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    if-nez v13, :cond_c

    .line 233
    .line 234
    :cond_b
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object v13

    .line 238
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v12

    .line 245
    invoke-interface {v8, v12, v10}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 246
    .line 247
    .line 248
    :cond_c
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    invoke-static {v8}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    invoke-interface {v6, v8, v4, v10}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    const v6, 0x7ab4aae9

    .line 264
    .line 265
    .line 266
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 267
    .line 268
    .line 269
    invoke-static {v3, v9}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 270
    .line 271
    .line 272
    move-result-object v8

    .line 273
    sget v9, Landroidx/compose/material/SnackbarKt;->SnackbarVerticalPadding:F

    .line 274
    .line 275
    const/4 v10, 0x1

    .line 276
    const/4 v12, 0x0

    .line 277
    const/4 v13, 0x0

    .line 278
    invoke-static {v8, v13, v9, v10, v12}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    const v9, 0x2bb5b5d7

    .line 283
    .line 284
    .line 285
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 286
    .line 287
    .line 288
    sget-object v10, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 289
    .line 290
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    invoke-static {v12, v11, v4, v11}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 295
    .line 296
    .line 297
    move-result-object v12

    .line 298
    const v13, -0x4ee9b9da

    .line 299
    .line 300
    .line 301
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 302
    .line 303
    .line 304
    invoke-static {v4, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 305
    .line 306
    .line 307
    move-result v13

    .line 308
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 309
    .line 310
    .line 311
    move-result-object v15

    .line 312
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    invoke-static {v8}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    instance-of v6, v6, Landroidx/compose/runtime/Applier;

    .line 325
    .line 326
    if-nez v6, :cond_d

    .line 327
    .line 328
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 329
    .line 330
    .line 331
    :cond_d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 332
    .line 333
    .line 334
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    if-eqz v6, :cond_e

    .line 339
    .line 340
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 341
    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_e
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 345
    .line 346
    .line 347
    :goto_5
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    invoke-static {v6, v12, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    invoke-static {v6, v15, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 370
    .line 371
    .line 372
    move-result v12

    .line 373
    if-nez v12, :cond_f

    .line 374
    .line 375
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v12

    .line 379
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 380
    .line 381
    .line 382
    move-result-object v15

    .line 383
    invoke-static {v12, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v12

    .line 387
    if-nez v12, :cond_10

    .line 388
    .line 389
    :cond_f
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 390
    .line 391
    .line 392
    move-result-object v12

    .line 393
    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v12

    .line 400
    invoke-interface {v6, v12, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 401
    .line 402
    .line 403
    :cond_10
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    invoke-static {v6}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 412
    .line 413
    .line 414
    move-result-object v9

    .line 415
    invoke-interface {v8, v6, v4, v9}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    const v6, 0x7ab4aae9

    .line 419
    .line 420
    .line 421
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 422
    .line 423
    .line 424
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 425
    .line 426
    and-int/lit8 v6, v5, 0xe

    .line 427
    .line 428
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    invoke-interface {v0, v4, v6}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 436
    .line 437
    .line 438
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 439
    .line 440
    .line 441
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 442
    .line 443
    .line 444
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 445
    .line 446
    .line 447
    invoke-static {v3, v7}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 448
    .line 449
    .line 450
    move-result-object v3

    .line 451
    const v6, 0x2bb5b5d7

    .line 452
    .line 453
    .line 454
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 458
    .line 459
    .line 460
    move-result-object v6

    .line 461
    invoke-static {v6, v11, v4, v11}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 462
    .line 463
    .line 464
    move-result-object v6

    .line 465
    const v7, -0x4ee9b9da

    .line 466
    .line 467
    .line 468
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 469
    .line 470
    .line 471
    invoke-static {v4, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 472
    .line 473
    .line 474
    move-result v7

    .line 475
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 476
    .line 477
    .line 478
    move-result-object v8

    .line 479
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 480
    .line 481
    .line 482
    move-result-object v9

    .line 483
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 488
    .line 489
    .line 490
    move-result-object v10

    .line 491
    instance-of v10, v10, Landroidx/compose/runtime/Applier;

    .line 492
    .line 493
    if-nez v10, :cond_11

    .line 494
    .line 495
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 496
    .line 497
    .line 498
    :cond_11
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 499
    .line 500
    .line 501
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 502
    .line 503
    .line 504
    move-result v10

    .line 505
    if-eqz v10, :cond_12

    .line 506
    .line 507
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 508
    .line 509
    .line 510
    goto :goto_6

    .line 511
    :cond_12
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 512
    .line 513
    .line 514
    :goto_6
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 515
    .line 516
    .line 517
    move-result-object v9

    .line 518
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 519
    .line 520
    .line 521
    move-result-object v10

    .line 522
    invoke-static {v9, v6, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 526
    .line 527
    .line 528
    move-result-object v6

    .line 529
    invoke-static {v9, v8, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 533
    .line 534
    .line 535
    move-result-object v6

    .line 536
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 537
    .line 538
    .line 539
    move-result v8

    .line 540
    if-nez v8, :cond_13

    .line 541
    .line 542
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v8

    .line 546
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 547
    .line 548
    .line 549
    move-result-object v10

    .line 550
    invoke-static {v8, v10}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v8

    .line 554
    if-nez v8, :cond_14

    .line 555
    .line 556
    :cond_13
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 557
    .line 558
    .line 559
    move-result-object v8

    .line 560
    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 564
    .line 565
    .line 566
    move-result-object v7

    .line 567
    invoke-interface {v9, v7, v6}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 568
    .line 569
    .line 570
    :cond_14
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 571
    .line 572
    .line 573
    move-result-object v6

    .line 574
    invoke-static {v6}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 575
    .line 576
    .line 577
    move-result-object v6

    .line 578
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 579
    .line 580
    .line 581
    move-result-object v7

    .line 582
    invoke-interface {v3, v6, v4, v7}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    const v3, 0x7ab4aae9

    .line 586
    .line 587
    .line 588
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 589
    .line 590
    .line 591
    shr-int/lit8 v3, v5, 0x3

    .line 592
    .line 593
    and-int/lit8 v3, v3, 0xe

    .line 594
    .line 595
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 596
    .line 597
    .line 598
    move-result-object v3

    .line 599
    invoke-interface {v1, v4, v3}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 603
    .line 604
    .line 605
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 606
    .line 607
    .line 608
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 609
    .line 610
    .line 611
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 612
    .line 613
    .line 614
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 615
    .line 616
    .line 617
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 618
    .line 619
    .line 620
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 621
    .line 622
    .line 623
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 624
    .line 625
    .line 626
    move-result v3

    .line 627
    if-eqz v3, :cond_15

    .line 628
    .line 629
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 630
    .line 631
    .line 632
    :cond_15
    :goto_7
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 633
    .line 634
    .line 635
    move-result-object v3

    .line 636
    if-eqz v3, :cond_16

    .line 637
    .line 638
    new-instance v4, Landroidx/compose/material/SnackbarKt$OneRowSnackbar$3;

    .line 639
    .line 640
    invoke-direct {v4, v0, v1, v2}, Landroidx/compose/material/SnackbarKt$OneRowSnackbar$3;-><init>(Lv3/p;Lv3/p;I)V

    .line 641
    .line 642
    .line 643
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 644
    .line 645
    .line 646
    :cond_16
    return-void
    .line 647
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
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
.end method

.method public static final Snackbar-7zSek6w(Landroidx/compose/ui/Modifier;Lv3/p;ZLandroidx/compose/ui/graphics/Shape;JJFLv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p1    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
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
            ">;Z",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJF",
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
    move-object/from16 v10, p9

    .line 2
    .line 3
    move/from16 v11, p11

    .line 4
    .line 5
    move/from16 v12, p12

    .line 6
    .line 7
    const v0, -0x21465a48

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p10

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    and-int/lit8 v2, v12, 0x1

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    or-int/lit8 v3, v11, 0x6

    .line 21
    .line 22
    move v4, v3

    .line 23
    move-object/from16 v3, p0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    and-int/lit8 v3, v11, 0xe

    .line 27
    .line 28
    if-nez v3, :cond_2

    .line 29
    .line 30
    move-object/from16 v3, p0

    .line 31
    .line 32
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    const/4 v4, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v4, 0x2

    .line 41
    :goto_0
    or-int/2addr v4, v11

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object/from16 v3, p0

    .line 44
    .line 45
    move v4, v11

    .line 46
    :goto_1
    and-int/lit8 v5, v12, 0x2

    .line 47
    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    or-int/lit8 v4, v4, 0x30

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    and-int/lit8 v6, v11, 0x70

    .line 54
    .line 55
    if-nez v6, :cond_5

    .line 56
    .line 57
    move-object/from16 v6, p1

    .line 58
    .line 59
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    const/16 v7, 0x20

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    const/16 v7, 0x10

    .line 69
    .line 70
    :goto_2
    or-int/2addr v4, v7

    .line 71
    goto :goto_4

    .line 72
    :cond_5
    :goto_3
    move-object/from16 v6, p1

    .line 73
    .line 74
    :goto_4
    and-int/lit8 v7, v12, 0x4

    .line 75
    .line 76
    if-eqz v7, :cond_6

    .line 77
    .line 78
    or-int/lit16 v4, v4, 0x180

    .line 79
    .line 80
    goto :goto_6

    .line 81
    :cond_6
    and-int/lit16 v8, v11, 0x380

    .line 82
    .line 83
    if-nez v8, :cond_8

    .line 84
    .line 85
    move/from16 v8, p2

    .line 86
    .line 87
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    if-eqz v9, :cond_7

    .line 92
    .line 93
    const/16 v9, 0x100

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_7
    const/16 v9, 0x80

    .line 97
    .line 98
    :goto_5
    or-int/2addr v4, v9

    .line 99
    goto :goto_7

    .line 100
    :cond_8
    :goto_6
    move/from16 v8, p2

    .line 101
    .line 102
    :goto_7
    and-int/lit16 v9, v11, 0x1c00

    .line 103
    .line 104
    if-nez v9, :cond_b

    .line 105
    .line 106
    and-int/lit8 v9, v12, 0x8

    .line 107
    .line 108
    if-nez v9, :cond_9

    .line 109
    .line 110
    move-object/from16 v9, p3

    .line 111
    .line 112
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_a

    .line 117
    .line 118
    const/16 v13, 0x800

    .line 119
    .line 120
    goto :goto_8

    .line 121
    :cond_9
    move-object/from16 v9, p3

    .line 122
    .line 123
    :cond_a
    const/16 v13, 0x400

    .line 124
    .line 125
    :goto_8
    or-int/2addr v4, v13

    .line 126
    goto :goto_9

    .line 127
    :cond_b
    move-object/from16 v9, p3

    .line 128
    .line 129
    :goto_9
    const v13, 0xe000

    .line 130
    .line 131
    .line 132
    and-int/2addr v13, v11

    .line 133
    if-nez v13, :cond_e

    .line 134
    .line 135
    and-int/lit8 v13, v12, 0x10

    .line 136
    .line 137
    if-nez v13, :cond_c

    .line 138
    .line 139
    move-wide/from16 v13, p4

    .line 140
    .line 141
    invoke-interface {v1, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 142
    .line 143
    .line 144
    move-result v15

    .line 145
    if-eqz v15, :cond_d

    .line 146
    .line 147
    const/16 v15, 0x4000

    .line 148
    .line 149
    goto :goto_a

    .line 150
    :cond_c
    move-wide/from16 v13, p4

    .line 151
    .line 152
    :cond_d
    const/16 v15, 0x2000

    .line 153
    .line 154
    :goto_a
    or-int/2addr v4, v15

    .line 155
    goto :goto_b

    .line 156
    :cond_e
    move-wide/from16 v13, p4

    .line 157
    .line 158
    :goto_b
    const/high16 v15, 0x70000

    .line 159
    .line 160
    and-int v16, v11, v15

    .line 161
    .line 162
    if-nez v16, :cond_10

    .line 163
    .line 164
    and-int/lit8 v16, v12, 0x20

    .line 165
    .line 166
    move-wide/from16 v8, p6

    .line 167
    .line 168
    if-nez v16, :cond_f

    .line 169
    .line 170
    invoke-interface {v1, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 171
    .line 172
    .line 173
    move-result v16

    .line 174
    if-eqz v16, :cond_f

    .line 175
    .line 176
    const/high16 v16, 0x20000

    .line 177
    .line 178
    goto :goto_c

    .line 179
    :cond_f
    const/high16 v16, 0x10000

    .line 180
    .line 181
    :goto_c
    or-int v4, v4, v16

    .line 182
    .line 183
    goto :goto_d

    .line 184
    :cond_10
    move-wide/from16 v8, p6

    .line 185
    .line 186
    :goto_d
    and-int/lit8 v16, v12, 0x40

    .line 187
    .line 188
    const/high16 v17, 0x180000

    .line 189
    .line 190
    if-eqz v16, :cond_11

    .line 191
    .line 192
    or-int v4, v4, v17

    .line 193
    .line 194
    move/from16 v15, p8

    .line 195
    .line 196
    goto :goto_f

    .line 197
    :cond_11
    const/high16 v18, 0x380000

    .line 198
    .line 199
    and-int v18, v11, v18

    .line 200
    .line 201
    move/from16 v15, p8

    .line 202
    .line 203
    if-nez v18, :cond_13

    .line 204
    .line 205
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 206
    .line 207
    .line 208
    move-result v18

    .line 209
    if-eqz v18, :cond_12

    .line 210
    .line 211
    const/high16 v18, 0x100000

    .line 212
    .line 213
    goto :goto_e

    .line 214
    :cond_12
    const/high16 v18, 0x80000

    .line 215
    .line 216
    :goto_e
    or-int v4, v4, v18

    .line 217
    .line 218
    :cond_13
    :goto_f
    and-int/lit16 v0, v12, 0x80

    .line 219
    .line 220
    if-eqz v0, :cond_14

    .line 221
    .line 222
    const/high16 v0, 0xc00000

    .line 223
    .line 224
    :goto_10
    or-int/2addr v4, v0

    .line 225
    goto :goto_11

    .line 226
    :cond_14
    const/high16 v0, 0x1c00000

    .line 227
    .line 228
    and-int/2addr v0, v11

    .line 229
    if-nez v0, :cond_16

    .line 230
    .line 231
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_15

    .line 236
    .line 237
    const/high16 v0, 0x800000

    .line 238
    .line 239
    goto :goto_10

    .line 240
    :cond_15
    const/high16 v0, 0x400000

    .line 241
    .line 242
    goto :goto_10

    .line 243
    :cond_16
    :goto_11
    const v0, 0x16db6db

    .line 244
    .line 245
    .line 246
    and-int/2addr v0, v4

    .line 247
    const v3, 0x492492

    .line 248
    .line 249
    .line 250
    if-ne v0, v3, :cond_18

    .line 251
    .line 252
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_17

    .line 257
    .line 258
    goto :goto_12

    .line 259
    :cond_17
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 260
    .line 261
    .line 262
    move-object/from16 v2, p0

    .line 263
    .line 264
    move/from16 v3, p2

    .line 265
    .line 266
    move-object/from16 v4, p3

    .line 267
    .line 268
    move-wide v7, v8

    .line 269
    move v9, v15

    .line 270
    goto/16 :goto_19

    .line 271
    .line 272
    :cond_18
    :goto_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 273
    .line 274
    .line 275
    and-int/lit8 v0, v11, 0x1

    .line 276
    .line 277
    const v3, -0x70001

    .line 278
    .line 279
    .line 280
    const v19, -0xe001

    .line 281
    .line 282
    .line 283
    if-eqz v0, :cond_1e

    .line 284
    .line 285
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_19

    .line 290
    .line 291
    goto :goto_14

    .line 292
    :cond_19
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 293
    .line 294
    .line 295
    and-int/lit8 v0, v12, 0x8

    .line 296
    .line 297
    if-eqz v0, :cond_1a

    .line 298
    .line 299
    and-int/lit16 v4, v4, -0x1c01

    .line 300
    .line 301
    :cond_1a
    and-int/lit8 v0, v12, 0x10

    .line 302
    .line 303
    if-eqz v0, :cond_1b

    .line 304
    .line 305
    and-int v4, v4, v19

    .line 306
    .line 307
    :cond_1b
    and-int/lit8 v0, v12, 0x20

    .line 308
    .line 309
    if-eqz v0, :cond_1c

    .line 310
    .line 311
    and-int/2addr v4, v3

    .line 312
    :cond_1c
    move-object/from16 v0, p0

    .line 313
    .line 314
    move/from16 v2, p2

    .line 315
    .line 316
    move-object/from16 v5, p3

    .line 317
    .line 318
    :cond_1d
    move v7, v15

    .line 319
    :goto_13
    move-wide/from16 v25, v13

    .line 320
    .line 321
    move v13, v4

    .line 322
    move-wide/from16 v3, v25

    .line 323
    .line 324
    goto :goto_18

    .line 325
    :cond_1e
    :goto_14
    if-eqz v2, :cond_1f

    .line 326
    .line 327
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 328
    .line 329
    goto :goto_15

    .line 330
    :cond_1f
    move-object/from16 v0, p0

    .line 331
    .line 332
    :goto_15
    if-eqz v5, :cond_20

    .line 333
    .line 334
    const/4 v2, 0x0

    .line 335
    move-object v6, v2

    .line 336
    :cond_20
    if-eqz v7, :cond_21

    .line 337
    .line 338
    const/4 v2, 0x0

    .line 339
    goto :goto_16

    .line 340
    :cond_21
    move/from16 v2, p2

    .line 341
    .line 342
    :goto_16
    and-int/lit8 v5, v12, 0x8

    .line 343
    .line 344
    const/4 v7, 0x6

    .line 345
    if-eqz v5, :cond_22

    .line 346
    .line 347
    sget-object v5, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 348
    .line 349
    invoke-virtual {v5, v1, v7}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    invoke-virtual {v5}, Landroidx/compose/material/Shapes;->getSmall()Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 354
    .line 355
    .line 356
    move-result-object v5

    .line 357
    and-int/lit16 v4, v4, -0x1c01

    .line 358
    .line 359
    goto :goto_17

    .line 360
    :cond_22
    move-object/from16 v5, p3

    .line 361
    .line 362
    :goto_17
    and-int/lit8 v20, v12, 0x10

    .line 363
    .line 364
    if-eqz v20, :cond_23

    .line 365
    .line 366
    sget-object v13, Landroidx/compose/material/SnackbarDefaults;->INSTANCE:Landroidx/compose/material/SnackbarDefaults;

    .line 367
    .line 368
    invoke-virtual {v13, v1, v7}, Landroidx/compose/material/SnackbarDefaults;->getBackgroundColor(Landroidx/compose/runtime/Composer;I)J

    .line 369
    .line 370
    .line 371
    move-result-wide v13

    .line 372
    and-int v4, v4, v19

    .line 373
    .line 374
    :cond_23
    and-int/lit8 v19, v12, 0x20

    .line 375
    .line 376
    if-eqz v19, :cond_24

    .line 377
    .line 378
    sget-object v8, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 379
    .line 380
    invoke-virtual {v8, v1, v7}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 381
    .line 382
    .line 383
    move-result-object v8

    .line 384
    invoke-virtual {v8}, Landroidx/compose/material/Colors;->getSurface-0d7_KjU()J

    .line 385
    .line 386
    .line 387
    move-result-wide v8

    .line 388
    and-int/2addr v3, v4

    .line 389
    move v4, v3

    .line 390
    :cond_24
    if-eqz v16, :cond_1d

    .line 391
    .line 392
    int-to-float v3, v7

    .line 393
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    move v7, v3

    .line 398
    goto :goto_13

    .line 399
    :goto_18
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 400
    .line 401
    .line 402
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 403
    .line 404
    .line 405
    move-result v14

    .line 406
    if-eqz v14, :cond_25

    .line 407
    .line 408
    const/4 v14, -0x1

    .line 409
    const-string v15, "androidx.compose.material.Snackbar (Snackbar.kt:90)"

    .line 410
    .line 411
    const v11, -0x21465a48

    .line 412
    .line 413
    .line 414
    invoke-static {v11, v13, v14, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 415
    .line 416
    .line 417
    :cond_25
    const/16 v19, 0x0

    .line 418
    .line 419
    new-instance v11, Landroidx/compose/material/SnackbarKt$Snackbar$1;

    .line 420
    .line 421
    invoke-direct {v11, v6, v10, v2}, Landroidx/compose/material/SnackbarKt$Snackbar$1;-><init>(Lv3/p;Lv3/p;Z)V

    .line 422
    .line 423
    .line 424
    const v14, -0x7c3ab304

    .line 425
    .line 426
    .line 427
    const/4 v15, 0x1

    .line 428
    invoke-static {v1, v14, v15, v11}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 429
    .line 430
    .line 431
    move-result-object v21

    .line 432
    and-int/lit8 v11, v13, 0xe

    .line 433
    .line 434
    or-int v11, v11, v17

    .line 435
    .line 436
    shr-int/lit8 v14, v13, 0x6

    .line 437
    .line 438
    and-int/lit8 v15, v14, 0x70

    .line 439
    .line 440
    or-int/2addr v11, v15

    .line 441
    and-int/lit16 v15, v14, 0x380

    .line 442
    .line 443
    or-int/2addr v11, v15

    .line 444
    and-int/lit16 v14, v14, 0x1c00

    .line 445
    .line 446
    or-int/2addr v11, v14

    .line 447
    shr-int/lit8 v13, v13, 0x3

    .line 448
    .line 449
    const/high16 v14, 0x70000

    .line 450
    .line 451
    and-int/2addr v13, v14

    .line 452
    or-int v23, v11, v13

    .line 453
    .line 454
    const/16 v24, 0x10

    .line 455
    .line 456
    move-object v13, v0

    .line 457
    move-object v14, v5

    .line 458
    move-wide v15, v3

    .line 459
    move-wide/from16 v17, v8

    .line 460
    .line 461
    move/from16 v20, v7

    .line 462
    .line 463
    move-object/from16 v22, v1

    .line 464
    .line 465
    invoke-static/range {v13 .. v24}, Landroidx/compose/material/SurfaceKt;->Surface-F-jzlyU(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 466
    .line 467
    .line 468
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 469
    .line 470
    .line 471
    move-result v11

    .line 472
    if-eqz v11, :cond_26

    .line 473
    .line 474
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 475
    .line 476
    .line 477
    :cond_26
    move-wide v13, v3

    .line 478
    move-object v4, v5

    .line 479
    move v3, v2

    .line 480
    move-object v2, v0

    .line 481
    move-wide/from16 v25, v8

    .line 482
    .line 483
    move v9, v7

    .line 484
    move-wide/from16 v7, v25

    .line 485
    .line 486
    :goto_19
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 487
    .line 488
    .line 489
    move-result-object v15

    .line 490
    if-eqz v15, :cond_27

    .line 491
    .line 492
    new-instance v11, Landroidx/compose/material/SnackbarKt$Snackbar$2;

    .line 493
    .line 494
    move-object v0, v11

    .line 495
    move-object v1, v2

    .line 496
    move-object v2, v6

    .line 497
    move-wide v5, v13

    .line 498
    move-object/from16 v10, p9

    .line 499
    .line 500
    move-object v13, v11

    .line 501
    move/from16 v11, p11

    .line 502
    .line 503
    move/from16 v12, p12

    .line 504
    .line 505
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material/SnackbarKt$Snackbar$2;-><init>(Landroidx/compose/ui/Modifier;Lv3/p;ZLandroidx/compose/ui/graphics/Shape;JJFLv3/p;II)V

    .line 506
    .line 507
    .line 508
    invoke-interface {v15, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 509
    .line 510
    .line 511
    :cond_27
    return-void
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
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
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
.end method

.method public static final Snackbar-sPrSdHI(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V
    .locals 29
    .param p0    # Landroidx/compose/material/SnackbarData;
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
    .param p11    # Landroidx/compose/runtime/Composer;
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
    move/from16 v12, p12

    .line 4
    .line 5
    move/from16 v13, p13

    .line 6
    .line 7
    const v0, 0xf6ad9ce

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p11

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
    or-int/lit8 v3, v12, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v3, v12, 0xe

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
    or-int/2addr v3, v12

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v3, v12

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
    and-int/lit8 v5, v12, 0x70

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
    and-int/lit16 v7, v12, 0x380

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
    and-int/lit16 v8, v12, 0x1c00

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
    const v9, 0xe000

    .line 123
    .line 124
    .line 125
    and-int v10, v12, v9

    .line 126
    .line 127
    if-nez v10, :cond_e

    .line 128
    .line 129
    and-int/lit8 v10, v13, 0x10

    .line 130
    .line 131
    if-nez v10, :cond_c

    .line 132
    .line 133
    move-wide/from16 v10, p4

    .line 134
    .line 135
    invoke-interface {v2, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    if-eqz v14, :cond_d

    .line 140
    .line 141
    const/16 v14, 0x4000

    .line 142
    .line 143
    goto :goto_a

    .line 144
    :cond_c
    move-wide/from16 v10, p4

    .line 145
    .line 146
    :cond_d
    const/16 v14, 0x2000

    .line 147
    .line 148
    :goto_a
    or-int/2addr v3, v14

    .line 149
    goto :goto_b

    .line 150
    :cond_e
    move-wide/from16 v10, p4

    .line 151
    .line 152
    :goto_b
    const/high16 v14, 0x70000

    .line 153
    .line 154
    and-int v15, v12, v14

    .line 155
    .line 156
    if-nez v15, :cond_11

    .line 157
    .line 158
    and-int/lit8 v15, v13, 0x20

    .line 159
    .line 160
    if-nez v15, :cond_f

    .line 161
    .line 162
    move-wide/from16 v14, p6

    .line 163
    .line 164
    invoke-interface {v2, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 165
    .line 166
    .line 167
    move-result v16

    .line 168
    if-eqz v16, :cond_10

    .line 169
    .line 170
    const/high16 v16, 0x20000

    .line 171
    .line 172
    goto :goto_c

    .line 173
    :cond_f
    move-wide/from16 v14, p6

    .line 174
    .line 175
    :cond_10
    const/high16 v16, 0x10000

    .line 176
    .line 177
    :goto_c
    or-int v3, v3, v16

    .line 178
    .line 179
    goto :goto_d

    .line 180
    :cond_11
    move-wide/from16 v14, p6

    .line 181
    .line 182
    :goto_d
    const/high16 v16, 0x380000

    .line 183
    .line 184
    and-int v17, v12, v16

    .line 185
    .line 186
    if-nez v17, :cond_13

    .line 187
    .line 188
    and-int/lit8 v17, v13, 0x40

    .line 189
    .line 190
    move-wide/from16 v9, p8

    .line 191
    .line 192
    if-nez v17, :cond_12

    .line 193
    .line 194
    invoke-interface {v2, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    if-eqz v11, :cond_12

    .line 199
    .line 200
    const/high16 v11, 0x100000

    .line 201
    .line 202
    goto :goto_e

    .line 203
    :cond_12
    const/high16 v11, 0x80000

    .line 204
    .line 205
    :goto_e
    or-int/2addr v3, v11

    .line 206
    goto :goto_f

    .line 207
    :cond_13
    move-wide/from16 v9, p8

    .line 208
    .line 209
    :goto_f
    and-int/lit16 v11, v13, 0x80

    .line 210
    .line 211
    const/high16 v18, 0xc00000

    .line 212
    .line 213
    if-eqz v11, :cond_14

    .line 214
    .line 215
    or-int v3, v3, v18

    .line 216
    .line 217
    move/from16 v0, p10

    .line 218
    .line 219
    goto :goto_11

    .line 220
    :cond_14
    const/high16 v19, 0x1c00000

    .line 221
    .line 222
    and-int v19, v12, v19

    .line 223
    .line 224
    move/from16 v0, p10

    .line 225
    .line 226
    if-nez v19, :cond_16

    .line 227
    .line 228
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 229
    .line 230
    .line 231
    move-result v20

    .line 232
    if-eqz v20, :cond_15

    .line 233
    .line 234
    const/high16 v20, 0x800000

    .line 235
    .line 236
    goto :goto_10

    .line 237
    :cond_15
    const/high16 v20, 0x400000

    .line 238
    .line 239
    :goto_10
    or-int v3, v3, v20

    .line 240
    .line 241
    :cond_16
    :goto_11
    const v20, 0x16db6db

    .line 242
    .line 243
    .line 244
    and-int v0, v3, v20

    .line 245
    .line 246
    const v5, 0x492492

    .line 247
    .line 248
    .line 249
    if-ne v0, v5, :cond_18

    .line 250
    .line 251
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-nez v0, :cond_17

    .line 256
    .line 257
    goto :goto_12

    .line 258
    :cond_17
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 259
    .line 260
    .line 261
    move-object/from16 v3, p1

    .line 262
    .line 263
    move/from16 v13, p10

    .line 264
    .line 265
    move v4, v7

    .line 266
    move-object v6, v8

    .line 267
    move-wide v11, v9

    .line 268
    move-wide v9, v14

    .line 269
    move-wide/from16 v7, p4

    .line 270
    .line 271
    goto/16 :goto_1d

    .line 272
    .line 273
    :cond_18
    :goto_12
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 274
    .line 275
    .line 276
    and-int/lit8 v0, v12, 0x1

    .line 277
    .line 278
    const v5, -0x380001

    .line 279
    .line 280
    .line 281
    const v20, -0x70001

    .line 282
    .line 283
    .line 284
    const v21, -0xe001

    .line 285
    .line 286
    .line 287
    if-eqz v0, :cond_1e

    .line 288
    .line 289
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_19

    .line 294
    .line 295
    goto :goto_14

    .line 296
    :cond_19
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 297
    .line 298
    .line 299
    and-int/lit8 v0, v13, 0x8

    .line 300
    .line 301
    if-eqz v0, :cond_1a

    .line 302
    .line 303
    and-int/lit16 v3, v3, -0x1c01

    .line 304
    .line 305
    :cond_1a
    and-int/lit8 v0, v13, 0x10

    .line 306
    .line 307
    if-eqz v0, :cond_1b

    .line 308
    .line 309
    and-int v3, v3, v21

    .line 310
    .line 311
    :cond_1b
    and-int/lit8 v0, v13, 0x20

    .line 312
    .line 313
    if-eqz v0, :cond_1c

    .line 314
    .line 315
    and-int v3, v3, v20

    .line 316
    .line 317
    :cond_1c
    and-int/lit8 v0, v13, 0x40

    .line 318
    .line 319
    if-eqz v0, :cond_1d

    .line 320
    .line 321
    and-int/2addr v3, v5

    .line 322
    :cond_1d
    move-object/from16 v0, p1

    .line 323
    .line 324
    move/from16 v5, p10

    .line 325
    .line 326
    move v4, v7

    .line 327
    move-object v6, v8

    .line 328
    move-wide/from16 v7, p4

    .line 329
    .line 330
    move-wide/from16 v27, v9

    .line 331
    .line 332
    :goto_13
    move-wide v9, v14

    .line 333
    move-wide/from16 v14, v27

    .line 334
    .line 335
    goto :goto_1b

    .line 336
    :cond_1e
    :goto_14
    if-eqz v4, :cond_1f

    .line 337
    .line 338
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 339
    .line 340
    goto :goto_15

    .line 341
    :cond_1f
    move-object/from16 v0, p1

    .line 342
    .line 343
    :goto_15
    if-eqz v6, :cond_20

    .line 344
    .line 345
    const/4 v4, 0x0

    .line 346
    goto :goto_16

    .line 347
    :cond_20
    move v4, v7

    .line 348
    :goto_16
    and-int/lit8 v6, v13, 0x8

    .line 349
    .line 350
    const/4 v7, 0x6

    .line 351
    if-eqz v6, :cond_21

    .line 352
    .line 353
    sget-object v6, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 354
    .line 355
    invoke-virtual {v6, v2, v7}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    invoke-virtual {v6}, Landroidx/compose/material/Shapes;->getSmall()Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    and-int/lit16 v3, v3, -0x1c01

    .line 364
    .line 365
    goto :goto_17

    .line 366
    :cond_21
    move-object v6, v8

    .line 367
    :goto_17
    and-int/lit8 v8, v13, 0x10

    .line 368
    .line 369
    if-eqz v8, :cond_22

    .line 370
    .line 371
    sget-object v8, Landroidx/compose/material/SnackbarDefaults;->INSTANCE:Landroidx/compose/material/SnackbarDefaults;

    .line 372
    .line 373
    invoke-virtual {v8, v2, v7}, Landroidx/compose/material/SnackbarDefaults;->getBackgroundColor(Landroidx/compose/runtime/Composer;I)J

    .line 374
    .line 375
    .line 376
    move-result-wide v22

    .line 377
    and-int v3, v3, v21

    .line 378
    .line 379
    goto :goto_18

    .line 380
    :cond_22
    move-wide/from16 v22, p4

    .line 381
    .line 382
    :goto_18
    and-int/lit8 v8, v13, 0x20

    .line 383
    .line 384
    if-eqz v8, :cond_23

    .line 385
    .line 386
    sget-object v8, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 387
    .line 388
    invoke-virtual {v8, v2, v7}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 389
    .line 390
    .line 391
    move-result-object v8

    .line 392
    invoke-virtual {v8}, Landroidx/compose/material/Colors;->getSurface-0d7_KjU()J

    .line 393
    .line 394
    .line 395
    move-result-wide v14

    .line 396
    and-int v3, v3, v20

    .line 397
    .line 398
    :cond_23
    and-int/lit8 v8, v13, 0x40

    .line 399
    .line 400
    if-eqz v8, :cond_24

    .line 401
    .line 402
    sget-object v8, Landroidx/compose/material/SnackbarDefaults;->INSTANCE:Landroidx/compose/material/SnackbarDefaults;

    .line 403
    .line 404
    invoke-virtual {v8, v2, v7}, Landroidx/compose/material/SnackbarDefaults;->getPrimaryActionColor(Landroidx/compose/runtime/Composer;I)J

    .line 405
    .line 406
    .line 407
    move-result-wide v8

    .line 408
    and-int/2addr v3, v5

    .line 409
    goto :goto_19

    .line 410
    :cond_24
    move-wide v8, v9

    .line 411
    :goto_19
    if-eqz v11, :cond_25

    .line 412
    .line 413
    int-to-float v5, v7

    .line 414
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 415
    .line 416
    .line 417
    move-result v5

    .line 418
    goto :goto_1a

    .line 419
    :cond_25
    move/from16 v5, p10

    .line 420
    .line 421
    :goto_1a
    move-wide/from16 v27, v8

    .line 422
    .line 423
    move-wide/from16 v7, v22

    .line 424
    .line 425
    goto :goto_13

    .line 426
    :goto_1b
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 427
    .line 428
    .line 429
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 430
    .line 431
    .line 432
    move-result v11

    .line 433
    if-eqz v11, :cond_26

    .line 434
    .line 435
    const/4 v11, -0x1

    .line 436
    const-string v12, "androidx.compose.material.Snackbar (Snackbar.kt:161)"

    .line 437
    .line 438
    const v13, 0xf6ad9ce

    .line 439
    .line 440
    .line 441
    invoke-static {v13, v3, v11, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 442
    .line 443
    .line 444
    :cond_26
    invoke-interface/range {p0 .. p0}, Landroidx/compose/material/SnackbarData;->getActionLabel()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v11

    .line 448
    const/4 v12, 0x1

    .line 449
    if-eqz v11, :cond_27

    .line 450
    .line 451
    new-instance v13, Landroidx/compose/material/SnackbarKt$Snackbar$actionComposable$1;

    .line 452
    .line 453
    invoke-direct {v13, v14, v15, v1, v11}, Landroidx/compose/material/SnackbarKt$Snackbar$actionComposable$1;-><init>(JLandroidx/compose/material/SnackbarData;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    const v11, 0x6de142b0

    .line 457
    .line 458
    .line 459
    invoke-static {v2, v11, v12, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 460
    .line 461
    .line 462
    move-result-object v11

    .line 463
    goto :goto_1c

    .line 464
    :cond_27
    const/4 v11, 0x0

    .line 465
    :goto_1c
    const/16 v13, 0xc

    .line 466
    .line 467
    int-to-float v13, v13

    .line 468
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 469
    .line 470
    .line 471
    move-result v13

    .line 472
    invoke-static {v0, v13}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 473
    .line 474
    .line 475
    move-result-object v13

    .line 476
    new-instance v12, Landroidx/compose/material/SnackbarKt$Snackbar$3;

    .line 477
    .line 478
    invoke-direct {v12, v1}, Landroidx/compose/material/SnackbarKt$Snackbar$3;-><init>(Landroidx/compose/material/SnackbarData;)V

    .line 479
    .line 480
    .line 481
    move-object/from16 p2, v0

    .line 482
    .line 483
    const v0, -0xf9b7319

    .line 484
    .line 485
    .line 486
    const/4 v1, 0x1

    .line 487
    invoke-static {v2, v0, v1, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 488
    .line 489
    .line 490
    move-result-object v23

    .line 491
    and-int/lit16 v0, v3, 0x380

    .line 492
    .line 493
    or-int v0, v0, v18

    .line 494
    .line 495
    and-int/lit16 v1, v3, 0x1c00

    .line 496
    .line 497
    or-int/2addr v0, v1

    .line 498
    const v1, 0xe000

    .line 499
    .line 500
    .line 501
    and-int/2addr v1, v3

    .line 502
    or-int/2addr v0, v1

    .line 503
    const/high16 v1, 0x70000

    .line 504
    .line 505
    and-int/2addr v1, v3

    .line 506
    or-int/2addr v0, v1

    .line 507
    shr-int/lit8 v1, v3, 0x3

    .line 508
    .line 509
    and-int v1, v1, v16

    .line 510
    .line 511
    or-int v25, v0, v1

    .line 512
    .line 513
    const/16 v26, 0x0

    .line 514
    .line 515
    move-wide v0, v14

    .line 516
    move-object v14, v13

    .line 517
    move-object v15, v11

    .line 518
    move/from16 v16, v4

    .line 519
    .line 520
    move-object/from16 v17, v6

    .line 521
    .line 522
    move-wide/from16 v18, v7

    .line 523
    .line 524
    move-wide/from16 v20, v9

    .line 525
    .line 526
    move/from16 v22, v5

    .line 527
    .line 528
    move-object/from16 v24, v2

    .line 529
    .line 530
    invoke-static/range {v14 .. v26}, Landroidx/compose/material/SnackbarKt;->Snackbar-7zSek6w(Landroidx/compose/ui/Modifier;Lv3/p;ZLandroidx/compose/ui/graphics/Shape;JJFLv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 531
    .line 532
    .line 533
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 534
    .line 535
    .line 536
    move-result v3

    .line 537
    if-eqz v3, :cond_28

    .line 538
    .line 539
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 540
    .line 541
    .line 542
    :cond_28
    move-object/from16 v3, p2

    .line 543
    .line 544
    move-wide v11, v0

    .line 545
    move v13, v5

    .line 546
    :goto_1d
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 547
    .line 548
    .line 549
    move-result-object v14

    .line 550
    if-eqz v14, :cond_29

    .line 551
    .line 552
    new-instance v15, Landroidx/compose/material/SnackbarKt$Snackbar$4;

    .line 553
    .line 554
    move-object v0, v15

    .line 555
    move-object/from16 v1, p0

    .line 556
    .line 557
    move-object v2, v3

    .line 558
    move v3, v4

    .line 559
    move-object v4, v6

    .line 560
    move-wide v5, v7

    .line 561
    move-wide v7, v9

    .line 562
    move-wide v9, v11

    .line 563
    move v11, v13

    .line 564
    move/from16 v12, p12

    .line 565
    .line 566
    move/from16 v13, p13

    .line 567
    .line 568
    invoke-direct/range {v0 .. v13}, Landroidx/compose/material/SnackbarKt$Snackbar$4;-><init>(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFII)V

    .line 569
    .line 570
    .line 571
    invoke-interface {v14, v15}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 572
    .line 573
    .line 574
    :cond_29
    return-void
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
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
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
.end method

.method private static final TextOnlySnackbar(Lv3/p;Landroidx/compose/runtime/Composer;I)V
    .locals 11
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
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
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, 0x36ae61c7

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    and-int/lit8 v1, p2, 0xe

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    or-int/2addr v1, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v1, p2

    .line 25
    :goto_1
    and-int/lit8 v3, v1, 0xb

    .line 26
    .line 27
    if-ne v3, v2, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    const/4 v2, -0x1

    .line 48
    const-string v3, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:236)"

    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_4
    sget-object v0, Landroidx/compose/material/SnackbarKt$TextOnlySnackbar$2;->INSTANCE:Landroidx/compose/material/SnackbarKt$TextOnlySnackbar$2;

    .line 54
    .line 55
    const v2, -0x4ee9b9da

    .line 56
    .line 57
    .line 58
    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 59
    .line 60
    .line 61
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-static {p1, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 73
    .line 74
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    instance-of v10, v10, Landroidx/compose/runtime/Applier;

    .line 87
    .line 88
    if-nez v10, :cond_5

    .line 89
    .line 90
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 91
    .line 92
    .line 93
    :cond_5
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 94
    .line 95
    .line 96
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    if-eqz v10, :cond_6

    .line 101
    .line 102
    invoke-interface {p1, v8}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 107
    .line 108
    .line 109
    :goto_3
    invoke-static {p1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-static {v8, v0, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v8, v6, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-nez v6, :cond_7

    .line 136
    .line 137
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    invoke-static {v6, v10}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-nez v6, :cond_8

    .line 150
    .line 151
    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-interface {v8, v5, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 163
    .line 164
    .line 165
    :cond_8
    invoke-static {p1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-interface {v9, v0, p1, v5}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    const v0, 0x7ab4aae9

    .line 181
    .line 182
    .line 183
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 184
    .line 185
    .line 186
    sget v5, Landroidx/compose/material/SnackbarKt;->HorizontalSpacing:F

    .line 187
    .line 188
    sget v6, Landroidx/compose/material/SnackbarKt;->SnackbarVerticalPadding:F

    .line 189
    .line 190
    invoke-static {v3, v5, v6}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    const v5, 0x2bb5b5d7

    .line 195
    .line 196
    .line 197
    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 198
    .line 199
    .line 200
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 201
    .line 202
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-static {v5, v4, p1, v4}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 211
    .line 212
    .line 213
    invoke-static {p1, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    instance-of v9, v9, Landroidx/compose/runtime/Applier;

    .line 234
    .line 235
    if-nez v9, :cond_9

    .line 236
    .line 237
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 238
    .line 239
    .line 240
    :cond_9
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 241
    .line 242
    .line 243
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 244
    .line 245
    .line 246
    move-result v9

    .line 247
    if-eqz v9, :cond_a

    .line 248
    .line 249
    invoke-interface {p1, v8}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 250
    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_a
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 254
    .line 255
    .line 256
    :goto_4
    invoke-static {p1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    invoke-static {v8, v5, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    invoke-static {v8, v6, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    if-nez v6, :cond_b

    .line 283
    .line 284
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    invoke-static {v6, v7}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v6

    .line 296
    if-nez v6, :cond_c

    .line 297
    .line 298
    :cond_b
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-interface {v8, v2, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 310
    .line 311
    .line 312
    :cond_c
    invoke-static {p1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    invoke-interface {v3, v2, p1, v4}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 328
    .line 329
    .line 330
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 331
    .line 332
    and-int/lit8 v0, v1, 0xe

    .line 333
    .line 334
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-interface {p0, p1, v0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 342
    .line 343
    .line 344
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 345
    .line 346
    .line 347
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 348
    .line 349
    .line 350
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 351
    .line 352
    .line 353
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 354
    .line 355
    .line 356
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 357
    .line 358
    .line 359
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 360
    .line 361
    .line 362
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_d

    .line 367
    .line 368
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 369
    .line 370
    .line 371
    :cond_d
    :goto_5
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    if-eqz p1, :cond_e

    .line 376
    .line 377
    new-instance v0, Landroidx/compose/material/SnackbarKt$TextOnlySnackbar$3;

    .line 378
    .line 379
    invoke-direct {v0, p0, p2}, Landroidx/compose/material/SnackbarKt$TextOnlySnackbar$3;-><init>(Lv3/p;I)V

    .line 380
    .line 381
    .line 382
    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 383
    .line 384
    .line 385
    :cond_e
    return-void
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
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
.end method

.method public static final synthetic access$NewLineButtonSnackbar(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material/SnackbarKt;->NewLineButtonSnackbar(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$OneRowSnackbar(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material/SnackbarKt;->OneRowSnackbar(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$TextOnlySnackbar(Lv3/p;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/material/SnackbarKt;->TextOnlySnackbar(Lv3/p;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$getHeightToFirstLine$p()F
    .locals 1

    sget v0, Landroidx/compose/material/SnackbarKt;->HeightToFirstLine:F

    return v0
.end method

.method public static final synthetic access$getSnackbarMinHeightOneLine$p()F
    .locals 1

    sget v0, Landroidx/compose/material/SnackbarKt;->SnackbarMinHeightOneLine:F

    return v0
.end method

.method public static final synthetic access$getSnackbarMinHeightTwoLines$p()F
    .locals 1

    sget v0, Landroidx/compose/material/SnackbarKt;->SnackbarMinHeightTwoLines:F

    return v0
.end method

.method public static final synthetic access$getTextEndExtraSpacing$p()F
    .locals 1

    sget v0, Landroidx/compose/material/SnackbarKt;->TextEndExtraSpacing:F

    return v0
.end method
