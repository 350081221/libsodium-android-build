.class public final Landroidx/compose/material/CheckboxKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/material/CheckboxKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000`\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u001aU\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00002\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001aO\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00002\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a6\u0010 \u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a>\u0010)\u001a\u00020\u0003*\u00020\u00172\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020%H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010(\"\u0014\u0010+\u001a\u00020*8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008-\u0010,\"\u0014\u0010.\u001a\u00020*8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008.\u0010,\"\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101\"\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00101\"\u0014\u00103\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00101\"\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00101\"\u0014\u00105\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00101\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00068\u00b2\u0006\u000c\u00106\u001a\u00020\u001b8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u00107\u001a\u00020\u001b8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010!\u001a\u00020\u00188\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u001a\u001a\u00020\u00188\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "checked",
        "Lkotlin/Function1;",
        "Lkotlin/r2;",
        "onCheckedChange",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "enabled",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "Landroidx/compose/material/CheckboxColors;",
        "colors",
        "Checkbox",
        "(ZLv3/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/state/ToggleableState;",
        "state",
        "Lkotlin/Function0;",
        "onClick",
        "TriStateCheckbox",
        "(Landroidx/compose/ui/state/ToggleableState;Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V",
        "value",
        "CheckboxImpl",
        "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "Landroidx/compose/ui/graphics/Color;",
        "boxColor",
        "borderColor",
        "",
        "radius",
        "strokeWidth",
        "drawBox-1wkBAMs",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V",
        "drawBox",
        "checkColor",
        "checkFraction",
        "crossCenterGravitation",
        "strokeWidthPx",
        "Landroidx/compose/material/CheckDrawingCache;",
        "drawingCache",
        "drawCheck-3IgeMak",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V",
        "drawCheck",
        "",
        "BoxInDuration",
        "I",
        "BoxOutDuration",
        "CheckAnimationDuration",
        "Landroidx/compose/ui/unit/Dp;",
        "CheckboxRippleRadius",
        "F",
        "CheckboxDefaultPadding",
        "CheckboxSize",
        "StrokeWidth",
        "RadiusSize",
        "checkDrawFraction",
        "checkCenterGravitationShiftFraction",
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
        "SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,485:1\n25#2:486\n25#2:499\n25#2:524\n1116#3,6:487\n1116#3,6:493\n1116#3,6:500\n1116#3,6:525\n1116#3,6:531\n1163#4,4:506\n1083#4,5:510\n1163#4,4:515\n1083#4,5:519\n81#5:537\n81#5:538\n81#5:539\n81#5:540\n81#5:541\n154#6:542\n154#6:543\n154#6:544\n154#6:545\n154#6:546\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n*L\n91#1:486\n137#1:499\n297#1:524\n91#1:487,6\n96#1:493,6\n137#1:500,6\n297#1:525,6\n301#1:531,6\n266#1:506,4\n266#1:510,5\n282#1:515,4\n282#1:519,5\n266#1:537\n282#1:538\n298#1:539\n299#1:540\n300#1:541\n480#1:542\n481#1:543\n482#1:544\n483#1:545\n484#1:546\n*E\n"
    }
.end annotation


# static fields
.field private static final BoxInDuration:I = 0x32

.field private static final BoxOutDuration:I = 0x64

.field private static final CheckAnimationDuration:I = 0x64

.field private static final CheckboxDefaultPadding:F

.field private static final CheckboxRippleRadius:F

.field private static final CheckboxSize:F

.field private static final RadiusSize:F

.field private static final StrokeWidth:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x18

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
    sput v0, Landroidx/compose/material/CheckboxKt;->CheckboxRippleRadius:F

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    int-to-float v0, v0

    .line 12
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sput v1, Landroidx/compose/material/CheckboxKt;->CheckboxDefaultPadding:F

    .line 17
    .line 18
    const/16 v1, 0x14

    .line 19
    .line 20
    int-to-float v1, v1

    .line 21
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sput v1, Landroidx/compose/material/CheckboxKt;->CheckboxSize:F

    .line 26
    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    sput v1, Landroidx/compose/material/CheckboxKt;->StrokeWidth:F

    .line 32
    .line 33
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sput v0, Landroidx/compose/material/CheckboxKt;->RadiusSize:F

    .line 38
    .line 39
    return-void
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
.end method

.method public static final Checkbox(ZLv3/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .param p1    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/material/CheckboxColors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lv3/l<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/material/CheckboxColors;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v7, p7

    .line 6
    .line 7
    const v0, -0x7e483386

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p6

    .line 11
    .line 12
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    and-int/lit8 v4, p8, 0x1

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    or-int/lit8 v4, v7, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v4, v7, 0xe

    .line 24
    .line 25
    if-nez v4, :cond_2

    .line 26
    .line 27
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v4, 0x2

    .line 36
    :goto_0
    or-int/2addr v4, v7

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v4, v7

    .line 39
    :goto_1
    and-int/lit8 v5, p8, 0x2

    .line 40
    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    or-int/lit8 v4, v4, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v5, v7, 0x70

    .line 47
    .line 48
    if-nez v5, :cond_5

    .line 49
    .line 50
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_4

    .line 55
    .line 56
    const/16 v5, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    const/16 v5, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v4, v5

    .line 62
    :cond_5
    :goto_3
    and-int/lit8 v5, p8, 0x4

    .line 63
    .line 64
    if-eqz v5, :cond_6

    .line 65
    .line 66
    or-int/lit16 v4, v4, 0x180

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    and-int/lit16 v6, v7, 0x380

    .line 70
    .line 71
    if-nez v6, :cond_8

    .line 72
    .line 73
    move-object/from16 v6, p2

    .line 74
    .line 75
    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_7

    .line 80
    .line 81
    const/16 v8, 0x100

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_7
    const/16 v8, 0x80

    .line 85
    .line 86
    :goto_4
    or-int/2addr v4, v8

    .line 87
    goto :goto_6

    .line 88
    :cond_8
    :goto_5
    move-object/from16 v6, p2

    .line 89
    .line 90
    :goto_6
    and-int/lit8 v8, p8, 0x8

    .line 91
    .line 92
    if-eqz v8, :cond_9

    .line 93
    .line 94
    or-int/lit16 v4, v4, 0xc00

    .line 95
    .line 96
    goto :goto_8

    .line 97
    :cond_9
    and-int/lit16 v9, v7, 0x1c00

    .line 98
    .line 99
    if-nez v9, :cond_b

    .line 100
    .line 101
    move/from16 v9, p3

    .line 102
    .line 103
    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-eqz v10, :cond_a

    .line 108
    .line 109
    const/16 v10, 0x800

    .line 110
    .line 111
    goto :goto_7

    .line 112
    :cond_a
    const/16 v10, 0x400

    .line 113
    .line 114
    :goto_7
    or-int/2addr v4, v10

    .line 115
    goto :goto_9

    .line 116
    :cond_b
    :goto_8
    move/from16 v9, p3

    .line 117
    .line 118
    :goto_9
    and-int/lit8 v10, p8, 0x10

    .line 119
    .line 120
    const v22, 0xe000

    .line 121
    .line 122
    .line 123
    if-eqz v10, :cond_c

    .line 124
    .line 125
    or-int/lit16 v4, v4, 0x6000

    .line 126
    .line 127
    goto :goto_b

    .line 128
    :cond_c
    and-int v11, v7, v22

    .line 129
    .line 130
    if-nez v11, :cond_e

    .line 131
    .line 132
    move-object/from16 v11, p4

    .line 133
    .line 134
    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    if-eqz v12, :cond_d

    .line 139
    .line 140
    const/16 v12, 0x4000

    .line 141
    .line 142
    goto :goto_a

    .line 143
    :cond_d
    const/16 v12, 0x2000

    .line 144
    .line 145
    :goto_a
    or-int/2addr v4, v12

    .line 146
    goto :goto_c

    .line 147
    :cond_e
    :goto_b
    move-object/from16 v11, p4

    .line 148
    .line 149
    :goto_c
    const/high16 v23, 0x70000

    .line 150
    .line 151
    and-int v12, v7, v23

    .line 152
    .line 153
    if-nez v12, :cond_11

    .line 154
    .line 155
    and-int/lit8 v12, p8, 0x20

    .line 156
    .line 157
    if-nez v12, :cond_f

    .line 158
    .line 159
    move-object/from16 v12, p5

    .line 160
    .line 161
    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    if-eqz v13, :cond_10

    .line 166
    .line 167
    const/high16 v13, 0x20000

    .line 168
    .line 169
    goto :goto_d

    .line 170
    :cond_f
    move-object/from16 v12, p5

    .line 171
    .line 172
    :cond_10
    const/high16 v13, 0x10000

    .line 173
    .line 174
    :goto_d
    or-int/2addr v4, v13

    .line 175
    goto :goto_e

    .line 176
    :cond_11
    move-object/from16 v12, p5

    .line 177
    .line 178
    :goto_e
    const v13, 0x5b6db

    .line 179
    .line 180
    .line 181
    and-int/2addr v13, v4

    .line 182
    const v14, 0x12492

    .line 183
    .line 184
    .line 185
    if-ne v13, v14, :cond_13

    .line 186
    .line 187
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    if-nez v13, :cond_12

    .line 192
    .line 193
    goto :goto_f

    .line 194
    :cond_12
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 195
    .line 196
    .line 197
    move-object v5, v6

    .line 198
    move v4, v9

    .line 199
    move-object/from16 v25, v11

    .line 200
    .line 201
    move-object v6, v12

    .line 202
    goto/16 :goto_17

    .line 203
    .line 204
    :cond_13
    :goto_f
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 205
    .line 206
    .line 207
    and-int/lit8 v13, v7, 0x1

    .line 208
    .line 209
    const v24, -0x70001

    .line 210
    .line 211
    .line 212
    if-eqz v13, :cond_16

    .line 213
    .line 214
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 215
    .line 216
    .line 217
    move-result v13

    .line 218
    if-eqz v13, :cond_14

    .line 219
    .line 220
    goto :goto_11

    .line 221
    :cond_14
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 222
    .line 223
    .line 224
    and-int/lit8 v5, p8, 0x20

    .line 225
    .line 226
    if-eqz v5, :cond_15

    .line 227
    .line 228
    and-int v4, v4, v24

    .line 229
    .line 230
    :cond_15
    move v8, v4

    .line 231
    move-object v5, v6

    .line 232
    move v6, v9

    .line 233
    move-object/from16 v25, v11

    .line 234
    .line 235
    :goto_10
    move-object v4, v12

    .line 236
    goto :goto_15

    .line 237
    :cond_16
    :goto_11
    if-eqz v5, :cond_17

    .line 238
    .line 239
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 240
    .line 241
    goto :goto_12

    .line 242
    :cond_17
    move-object v5, v6

    .line 243
    :goto_12
    if-eqz v8, :cond_18

    .line 244
    .line 245
    const/4 v6, 0x1

    .line 246
    goto :goto_13

    .line 247
    :cond_18
    move v6, v9

    .line 248
    :goto_13
    if-eqz v10, :cond_1a

    .line 249
    .line 250
    const v8, -0x1d58f75c

    .line 251
    .line 252
    .line 253
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 261
    .line 262
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    if-ne v8, v9, :cond_19

    .line 267
    .line 268
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_19
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 276
    .line 277
    .line 278
    check-cast v8, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 279
    .line 280
    move-object/from16 v25, v8

    .line 281
    .line 282
    goto :goto_14

    .line 283
    :cond_1a
    move-object/from16 v25, v11

    .line 284
    .line 285
    :goto_14
    and-int/lit8 v8, p8, 0x20

    .line 286
    .line 287
    if-eqz v8, :cond_1b

    .line 288
    .line 289
    sget-object v8, Landroidx/compose/material/CheckboxDefaults;->INSTANCE:Landroidx/compose/material/CheckboxDefaults;

    .line 290
    .line 291
    const-wide/16 v9, 0x0

    .line 292
    .line 293
    const-wide/16 v11, 0x0

    .line 294
    .line 295
    const-wide/16 v13, 0x0

    .line 296
    .line 297
    const-wide/16 v15, 0x0

    .line 298
    .line 299
    const-wide/16 v17, 0x0

    .line 300
    .line 301
    const/high16 v20, 0x30000

    .line 302
    .line 303
    const/16 v21, 0x1f

    .line 304
    .line 305
    move-object/from16 v19, v3

    .line 306
    .line 307
    invoke-virtual/range {v8 .. v21}, Landroidx/compose/material/CheckboxDefaults;->colors-zjMxDiM(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    and-int v4, v4, v24

    .line 312
    .line 313
    move-object/from16 v26, v8

    .line 314
    .line 315
    move v8, v4

    .line 316
    move-object/from16 v4, v26

    .line 317
    .line 318
    goto :goto_15

    .line 319
    :cond_1b
    move v8, v4

    .line 320
    goto :goto_10

    .line 321
    :goto_15
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 322
    .line 323
    .line 324
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    if-eqz v9, :cond_1c

    .line 329
    .line 330
    const/4 v9, -0x1

    .line 331
    const-string v10, "androidx.compose.material.Checkbox (Checkbox.kt:92)"

    .line 332
    .line 333
    invoke-static {v0, v8, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 334
    .line 335
    .line 336
    :cond_1c
    invoke-static/range {p0 .. p0}, Landroidx/compose/ui/state/ToggleableStateKt;->ToggleableState(Z)Landroidx/compose/ui/state/ToggleableState;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    if-eqz v2, :cond_1f

    .line 341
    .line 342
    const v9, 0x7c3c1ba1

    .line 343
    .line 344
    .line 345
    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 346
    .line 347
    .line 348
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 353
    .line 354
    .line 355
    move-result v10

    .line 356
    or-int/2addr v9, v10

    .line 357
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v10

    .line 361
    if-nez v9, :cond_1d

    .line 362
    .line 363
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 364
    .line 365
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    if-ne v10, v9, :cond_1e

    .line 370
    .line 371
    :cond_1d
    new-instance v10, Landroidx/compose/material/CheckboxKt$Checkbox$2$1;

    .line 372
    .line 373
    invoke-direct {v10, v2, v1}, Landroidx/compose/material/CheckboxKt$Checkbox$2$1;-><init>(Lv3/l;Z)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    :cond_1e
    check-cast v10, Lv3/a;

    .line 380
    .line 381
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 382
    .line 383
    .line 384
    move-object v9, v10

    .line 385
    goto :goto_16

    .line 386
    :cond_1f
    const/4 v9, 0x0

    .line 387
    :goto_16
    and-int/lit16 v10, v8, 0x380

    .line 388
    .line 389
    and-int/lit16 v11, v8, 0x1c00

    .line 390
    .line 391
    or-int/2addr v10, v11

    .line 392
    and-int v11, v8, v22

    .line 393
    .line 394
    or-int/2addr v10, v11

    .line 395
    and-int v8, v8, v23

    .line 396
    .line 397
    or-int v15, v10, v8

    .line 398
    .line 399
    const/16 v16, 0x0

    .line 400
    .line 401
    move-object v8, v0

    .line 402
    move-object v10, v5

    .line 403
    move v11, v6

    .line 404
    move-object/from16 v12, v25

    .line 405
    .line 406
    move-object v13, v4

    .line 407
    move-object v14, v3

    .line 408
    invoke-static/range {v8 .. v16}, Landroidx/compose/material/CheckboxKt;->TriStateCheckbox(Landroidx/compose/ui/state/ToggleableState;Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V

    .line 409
    .line 410
    .line 411
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-eqz v0, :cond_20

    .line 416
    .line 417
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 418
    .line 419
    .line 420
    :cond_20
    move/from16 v26, v6

    .line 421
    .line 422
    move-object v6, v4

    .line 423
    move/from16 v4, v26

    .line 424
    .line 425
    :goto_17
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 426
    .line 427
    .line 428
    move-result-object v9

    .line 429
    if-eqz v9, :cond_21

    .line 430
    .line 431
    new-instance v10, Landroidx/compose/material/CheckboxKt$Checkbox$3;

    .line 432
    .line 433
    move-object v0, v10

    .line 434
    move/from16 v1, p0

    .line 435
    .line 436
    move-object/from16 v2, p1

    .line 437
    .line 438
    move-object v3, v5

    .line 439
    move-object/from16 v5, v25

    .line 440
    .line 441
    move/from16 v7, p7

    .line 442
    .line 443
    move/from16 v8, p8

    .line 444
    .line 445
    invoke-direct/range {v0 .. v8}, Landroidx/compose/material/CheckboxKt$Checkbox$3;-><init>(ZLv3/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;II)V

    .line 446
    .line 447
    .line 448
    invoke-interface {v9, v10}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 449
    .line 450
    .line 451
    :cond_21
    return-void
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
.end method

.method private static final CheckboxImpl(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V
    .locals 37
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move/from16 v1, p0

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
    move/from16 v5, p5

    .line 10
    .line 11
    const v0, -0x7e4bc86f

    .line 12
    .line 13
    .line 14
    move-object/from16 v6, p4

    .line 15
    .line 16
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v14

    .line 20
    and-int/lit8 v6, v5, 0xe

    .line 21
    .line 22
    const/4 v15, 0x2

    .line 23
    if-nez v6, :cond_1

    .line 24
    .line 25
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    const/4 v6, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v6, v15

    .line 34
    :goto_0
    or-int/2addr v6, v5

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v6, v5

    .line 37
    :goto_1
    and-int/lit8 v7, v5, 0x70

    .line 38
    .line 39
    if-nez v7, :cond_3

    .line 40
    .line 41
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-eqz v7, :cond_2

    .line 46
    .line 47
    const/16 v7, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v7, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v6, v7

    .line 53
    :cond_3
    and-int/lit16 v7, v5, 0x380

    .line 54
    .line 55
    if-nez v7, :cond_5

    .line 56
    .line 57
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_4

    .line 62
    .line 63
    const/16 v7, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v7, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v6, v7

    .line 69
    :cond_5
    and-int/lit16 v7, v5, 0x1c00

    .line 70
    .line 71
    if-nez v7, :cond_7

    .line 72
    .line 73
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_6

    .line 78
    .line 79
    const/16 v7, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v7, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v6, v7

    .line 85
    :cond_7
    move v13, v6

    .line 86
    and-int/lit16 v6, v13, 0x16db

    .line 87
    .line 88
    const/16 v7, 0x492

    .line 89
    .line 90
    if-ne v6, v7, :cond_9

    .line 91
    .line 92
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-nez v6, :cond_8

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_e

    .line 103
    .line 104
    :cond_9
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    const/4 v12, -0x1

    .line 109
    if-eqz v6, :cond_a

    .line 110
    .line 111
    const-string v6, "androidx.compose.material.CheckboxImpl (Checkbox.kt:263)"

    .line 112
    .line 113
    invoke-static {v0, v13, v12, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_a
    shr-int/lit8 v0, v13, 0x3

    .line 117
    .line 118
    and-int/lit8 v11, v0, 0xe

    .line 119
    .line 120
    const/4 v10, 0x0

    .line 121
    invoke-static {v2, v10, v14, v11, v15}, Landroidx/compose/animation/core/TransitionKt;->updateTransition(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;

    .line 122
    .line 123
    .line 124
    move-result-object v16

    .line 125
    sget-object v6, Landroidx/compose/material/CheckboxKt$CheckboxImpl$checkDrawFraction$2;->INSTANCE:Landroidx/compose/material/CheckboxKt$CheckboxImpl$checkDrawFraction$2;

    .line 126
    .line 127
    const v9, -0x4fcbfb15

    .line 128
    .line 129
    .line 130
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 131
    .line 132
    .line 133
    const-string v17, "FloatAnimation"

    .line 134
    .line 135
    sget-object v18, Lkotlin/jvm/internal/a0;->a:Lkotlin/jvm/internal/a0;

    .line 136
    .line 137
    invoke-static/range {v18 .. v18}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/a0;)Landroidx/compose/animation/core/TwoWayConverter;

    .line 138
    .line 139
    .line 140
    move-result-object v19

    .line 141
    const v8, -0x880d1ef

    .line 142
    .line 143
    .line 144
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    check-cast v7, Landroidx/compose/ui/state/ToggleableState;

    .line 152
    .line 153
    const v8, -0x6b309374

    .line 154
    .line 155
    .line 156
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 157
    .line 158
    .line 159
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 160
    .line 161
    .line 162
    move-result v20

    .line 163
    const-string v9, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:274)"

    .line 164
    .line 165
    move/from16 v22, v13

    .line 166
    .line 167
    const/4 v13, 0x0

    .line 168
    if-eqz v20, :cond_b

    .line 169
    .line 170
    invoke-static {v8, v13, v12, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 171
    .line 172
    .line 173
    :cond_b
    sget-object v20, Landroidx/compose/material/CheckboxKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 174
    .line 175
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    aget v7, v20, v7

    .line 180
    .line 181
    const/4 v12, 0x1

    .line 182
    const/4 v13, 0x3

    .line 183
    const/16 v25, 0x0

    .line 184
    .line 185
    const/high16 v26, 0x3f800000    # 1.0f

    .line 186
    .line 187
    if-eq v7, v12, :cond_e

    .line 188
    .line 189
    if-eq v7, v15, :cond_d

    .line 190
    .line 191
    if-ne v7, v13, :cond_c

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_c
    new-instance v0, Lkotlin/j0;

    .line 195
    .line 196
    invoke-direct {v0}, Lkotlin/j0;-><init>()V

    .line 197
    .line 198
    .line 199
    throw v0

    .line 200
    :cond_d
    move/from16 v7, v25

    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_e
    :goto_6
    move/from16 v7, v26

    .line 204
    .line 205
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 206
    .line 207
    .line 208
    move-result v27

    .line 209
    if-eqz v27, :cond_f

    .line 210
    .line 211
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 212
    .line 213
    .line 214
    :cond_f
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 215
    .line 216
    .line 217
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v27

    .line 225
    check-cast v27, Landroidx/compose/ui/state/ToggleableState;

    .line 226
    .line 227
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 228
    .line 229
    .line 230
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 231
    .line 232
    .line 233
    move-result v28

    .line 234
    if-eqz v28, :cond_10

    .line 235
    .line 236
    const/4 v10, 0x0

    .line 237
    const/4 v13, -0x1

    .line 238
    invoke-static {v8, v10, v13, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_10
    const/4 v13, -0x1

    .line 243
    :goto_8
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Enum;->ordinal()I

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    aget v8, v20, v8

    .line 248
    .line 249
    if-eq v8, v12, :cond_13

    .line 250
    .line 251
    if-eq v8, v15, :cond_12

    .line 252
    .line 253
    const/4 v10, 0x3

    .line 254
    if-ne v8, v10, :cond_11

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_11
    new-instance v0, Lkotlin/j0;

    .line 258
    .line 259
    invoke-direct {v0}, Lkotlin/j0;-><init>()V

    .line 260
    .line 261
    .line 262
    throw v0

    .line 263
    :cond_12
    const/4 v10, 0x3

    .line 264
    move/from16 v8, v25

    .line 265
    .line 266
    goto :goto_a

    .line 267
    :cond_13
    const/4 v10, 0x3

    .line 268
    :goto_9
    move/from16 v8, v26

    .line 269
    .line 270
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    if-eqz v9, :cond_14

    .line 275
    .line 276
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 277
    .line 278
    .line 279
    :cond_14
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 280
    .line 281
    .line 282
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    const/16 v23, 0x0

    .line 291
    .line 292
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object v10

    .line 296
    invoke-interface {v6, v9, v14, v10}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    move-object v9, v6

    .line 301
    check-cast v9, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 302
    .line 303
    const/16 v27, 0x0

    .line 304
    .line 305
    move-object/from16 v6, v16

    .line 306
    .line 307
    const v10, -0x880d1ef

    .line 308
    .line 309
    .line 310
    const v15, -0x4fcbfb15

    .line 311
    .line 312
    .line 313
    const/16 v21, 0x3

    .line 314
    .line 315
    move-object/from16 v10, v19

    .line 316
    .line 317
    move/from16 v19, v11

    .line 318
    .line 319
    move-object/from16 v11, v17

    .line 320
    .line 321
    move v13, v12

    .line 322
    move-object v12, v14

    .line 323
    move/from16 v17, v22

    .line 324
    .line 325
    move/from16 v13, v27

    .line 326
    .line 327
    invoke-static/range {v6 .. v13}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 328
    .line 329
    .line 330
    move-result-object v13

    .line 331
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 332
    .line 333
    .line 334
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 335
    .line 336
    .line 337
    sget-object v6, Landroidx/compose/material/CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2;->INSTANCE:Landroidx/compose/material/CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2;

    .line 338
    .line 339
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 340
    .line 341
    .line 342
    const-string v11, "FloatAnimation"

    .line 343
    .line 344
    invoke-static/range {v18 .. v18}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/a0;)Landroidx/compose/animation/core/TwoWayConverter;

    .line 345
    .line 346
    .line 347
    move-result-object v10

    .line 348
    const v7, -0x880d1ef

    .line 349
    .line 350
    .line 351
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    check-cast v7, Landroidx/compose/ui/state/ToggleableState;

    .line 359
    .line 360
    const v8, -0x7d1b526b

    .line 361
    .line 362
    .line 363
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 364
    .line 365
    .line 366
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 367
    .line 368
    .line 369
    move-result v9

    .line 370
    const-string v12, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:290)"

    .line 371
    .line 372
    if-eqz v9, :cond_15

    .line 373
    .line 374
    const/4 v9, -0x1

    .line 375
    const/4 v15, 0x0

    .line 376
    invoke-static {v8, v15, v9, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 377
    .line 378
    .line 379
    goto :goto_b

    .line 380
    :cond_15
    const/4 v9, -0x1

    .line 381
    const/4 v15, 0x0

    .line 382
    :goto_b
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 383
    .line 384
    .line 385
    move-result v7

    .line 386
    aget v7, v20, v7

    .line 387
    .line 388
    const/4 v9, 0x1

    .line 389
    if-eq v7, v9, :cond_17

    .line 390
    .line 391
    const/4 v9, 0x2

    .line 392
    if-eq v7, v9, :cond_17

    .line 393
    .line 394
    const/4 v9, 0x3

    .line 395
    if-ne v7, v9, :cond_16

    .line 396
    .line 397
    move/from16 v7, v26

    .line 398
    .line 399
    goto :goto_c

    .line 400
    :cond_16
    new-instance v0, Lkotlin/j0;

    .line 401
    .line 402
    invoke-direct {v0}, Lkotlin/j0;-><init>()V

    .line 403
    .line 404
    .line 405
    throw v0

    .line 406
    :cond_17
    const/4 v9, 0x3

    .line 407
    move/from16 v7, v25

    .line 408
    .line 409
    :goto_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 410
    .line 411
    .line 412
    move-result v18

    .line 413
    if-eqz v18, :cond_18

    .line 414
    .line 415
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 416
    .line 417
    .line 418
    :cond_18
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 419
    .line 420
    .line 421
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 422
    .line 423
    .line 424
    move-result-object v7

    .line 425
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v18

    .line 429
    check-cast v18, Landroidx/compose/ui/state/ToggleableState;

    .line 430
    .line 431
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 432
    .line 433
    .line 434
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 435
    .line 436
    .line 437
    move-result v21

    .line 438
    if-eqz v21, :cond_19

    .line 439
    .line 440
    const/4 v9, -0x1

    .line 441
    invoke-static {v8, v15, v9, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 442
    .line 443
    .line 444
    :cond_19
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    .line 445
    .line 446
    .line 447
    move-result v8

    .line 448
    aget v8, v20, v8

    .line 449
    .line 450
    const/4 v9, 0x1

    .line 451
    if-eq v8, v9, :cond_1b

    .line 452
    .line 453
    const/4 v9, 0x2

    .line 454
    if-eq v8, v9, :cond_1b

    .line 455
    .line 456
    const/4 v9, 0x3

    .line 457
    if-ne v8, v9, :cond_1a

    .line 458
    .line 459
    move/from16 v25, v26

    .line 460
    .line 461
    goto :goto_d

    .line 462
    :cond_1a
    new-instance v0, Lkotlin/j0;

    .line 463
    .line 464
    invoke-direct {v0}, Lkotlin/j0;-><init>()V

    .line 465
    .line 466
    .line 467
    throw v0

    .line 468
    :cond_1b
    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 469
    .line 470
    .line 471
    move-result v8

    .line 472
    if-eqz v8, :cond_1c

    .line 473
    .line 474
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 475
    .line 476
    .line 477
    :cond_1c
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 478
    .line 479
    .line 480
    invoke-static/range {v25 .. v25}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    .line 485
    .line 486
    .line 487
    move-result-object v9

    .line 488
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v12

    .line 492
    invoke-interface {v6, v9, v14, v12}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v6

    .line 496
    move-object v9, v6

    .line 497
    check-cast v9, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 498
    .line 499
    move-object/from16 v6, v16

    .line 500
    .line 501
    move-object v12, v14

    .line 502
    move-object/from16 v36, v13

    .line 503
    .line 504
    move/from16 v13, v27

    .line 505
    .line 506
    invoke-static/range {v6 .. v13}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 507
    .line 508
    .line 509
    move-result-object v6

    .line 510
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 511
    .line 512
    .line 513
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 514
    .line 515
    .line 516
    const v7, -0x1d58f75c

    .line 517
    .line 518
    .line 519
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 520
    .line 521
    .line 522
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v7

    .line 526
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 527
    .line 528
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v9

    .line 532
    if-ne v7, v9, :cond_1d

    .line 533
    .line 534
    new-instance v7, Landroidx/compose/material/CheckDrawingCache;

    .line 535
    .line 536
    const/16 v21, 0x0

    .line 537
    .line 538
    const/16 v22, 0x0

    .line 539
    .line 540
    const/16 v23, 0x0

    .line 541
    .line 542
    const/16 v24, 0x7

    .line 543
    .line 544
    const/16 v25, 0x0

    .line 545
    .line 546
    move-object/from16 v20, v7

    .line 547
    .line 548
    invoke-direct/range {v20 .. v25}, Landroidx/compose/material/CheckDrawingCache;-><init>(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/PathMeasure;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/internal/w;)V

    .line 549
    .line 550
    .line 551
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    :cond_1d
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 555
    .line 556
    .line 557
    check-cast v7, Landroidx/compose/material/CheckDrawingCache;

    .line 558
    .line 559
    shr-int/lit8 v9, v17, 0x6

    .line 560
    .line 561
    and-int/lit8 v9, v9, 0x70

    .line 562
    .line 563
    or-int v9, v19, v9

    .line 564
    .line 565
    invoke-interface {v4, v2, v14, v9}, Landroidx/compose/material/CheckboxColors;->checkmarkColor(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 566
    .line 567
    .line 568
    move-result-object v9

    .line 569
    and-int/lit8 v10, v17, 0xe

    .line 570
    .line 571
    and-int/lit8 v11, v17, 0x70

    .line 572
    .line 573
    or-int/2addr v10, v11

    .line 574
    and-int/lit16 v0, v0, 0x380

    .line 575
    .line 576
    or-int/2addr v0, v10

    .line 577
    invoke-interface {v4, v1, v2, v14, v0}, Landroidx/compose/material/CheckboxColors;->boxColor(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 578
    .line 579
    .line 580
    move-result-object v10

    .line 581
    invoke-interface {v4, v1, v2, v14, v0}, Landroidx/compose/material/CheckboxColors;->borderColor(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    sget-object v11, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 586
    .line 587
    invoke-virtual {v11}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 588
    .line 589
    .line 590
    move-result-object v11

    .line 591
    const/4 v12, 0x0

    .line 592
    const/4 v13, 0x2

    .line 593
    invoke-static {v3, v11, v15, v13, v12}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentSize$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 594
    .line 595
    .line 596
    move-result-object v11

    .line 597
    sget v12, Landroidx/compose/material/CheckboxKt;->CheckboxSize:F

    .line 598
    .line 599
    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/SizeKt;->requiredSize-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 600
    .line 601
    .line 602
    move-result-object v11

    .line 603
    const v12, 0x7c3c3afa

    .line 604
    .line 605
    .line 606
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 607
    .line 608
    .line 609
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result v12

    .line 613
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v13

    .line 617
    or-int/2addr v12, v13

    .line 618
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    move-result v13

    .line 622
    or-int/2addr v12, v13

    .line 623
    move-object/from16 v13, v36

    .line 624
    .line 625
    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v16

    .line 629
    or-int v12, v12, v16

    .line 630
    .line 631
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    move-result v16

    .line 635
    or-int v12, v12, v16

    .line 636
    .line 637
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v16

    .line 641
    or-int v12, v12, v16

    .line 642
    .line 643
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v15

    .line 647
    if-nez v12, :cond_1e

    .line 648
    .line 649
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v8

    .line 653
    if-ne v15, v8, :cond_1f

    .line 654
    .line 655
    :cond_1e
    new-instance v15, Landroidx/compose/material/CheckboxKt$CheckboxImpl$1$1;

    .line 656
    .line 657
    move-object/from16 v29, v15

    .line 658
    .line 659
    move-object/from16 v30, v7

    .line 660
    .line 661
    move-object/from16 v31, v10

    .line 662
    .line 663
    move-object/from16 v32, v0

    .line 664
    .line 665
    move-object/from16 v33, v9

    .line 666
    .line 667
    move-object/from16 v34, v13

    .line 668
    .line 669
    move-object/from16 v35, v6

    .line 670
    .line 671
    invoke-direct/range {v29 .. v35}, Landroidx/compose/material/CheckboxKt$CheckboxImpl$1$1;-><init>(Landroidx/compose/material/CheckDrawingCache;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    .line 672
    .line 673
    .line 674
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    :cond_1f
    check-cast v15, Lv3/l;

    .line 678
    .line 679
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 680
    .line 681
    .line 682
    const/4 v0, 0x0

    .line 683
    invoke-static {v11, v15, v14, v0}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 684
    .line 685
    .line 686
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    if-eqz v0, :cond_20

    .line 691
    .line 692
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 693
    .line 694
    .line 695
    :cond_20
    :goto_e
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 696
    .line 697
    .line 698
    move-result-object v6

    .line 699
    if-eqz v6, :cond_21

    .line 700
    .line 701
    new-instance v7, Landroidx/compose/material/CheckboxKt$CheckboxImpl$2;

    .line 702
    .line 703
    move-object v0, v7

    .line 704
    move/from16 v1, p0

    .line 705
    .line 706
    move-object/from16 v2, p1

    .line 707
    .line 708
    move-object/from16 v3, p2

    .line 709
    .line 710
    move-object/from16 v4, p3

    .line 711
    .line 712
    move/from16 v5, p5

    .line 713
    .line 714
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material/CheckboxKt$CheckboxImpl$2;-><init>(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;I)V

    .line 715
    .line 716
    .line 717
    invoke-interface {v6, v7}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 718
    .line 719
    .line 720
    :cond_21
    return-void
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
.end method

.method private static final CheckboxImpl$lambda$10(Landroidx/compose/runtime/State;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/graphics/Color;",
            ">;)J"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final CheckboxImpl$lambda$4(Landroidx/compose/runtime/State;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final CheckboxImpl$lambda$6(Landroidx/compose/runtime/State;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final CheckboxImpl$lambda$8(Landroidx/compose/runtime/State;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/graphics/Color;",
            ">;)J"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final CheckboxImpl$lambda$9(Landroidx/compose/runtime/State;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/graphics/Color;",
            ">;)J"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final TriStateCheckbox(Landroidx/compose/ui/state/ToggleableState;Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .param p0    # Landroidx/compose/ui/state/ToggleableState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/a;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/material/CheckboxColors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/state/ToggleableState;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/material/CheckboxColors;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v7, p1

    .line 2
    .line 3
    move/from16 v8, p7

    .line 4
    .line 5
    const v0, 0x79127e9a

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p6

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v6

    .line 14
    and-int/lit8 v1, p8, 0x1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    or-int/lit8 v1, v8, 0x6

    .line 19
    .line 20
    move-object/from16 v5, p0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v1, v8, 0xe

    .line 24
    .line 25
    move-object/from16 v5, p0

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x2

    .line 38
    :goto_0
    or-int/2addr v1, v8

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v1, v8

    .line 41
    :goto_1
    and-int/lit8 v2, p8, 0x2

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    or-int/lit8 v1, v1, 0x30

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    and-int/lit8 v2, v8, 0x70

    .line 49
    .line 50
    if-nez v2, :cond_5

    .line 51
    .line 52
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    const/16 v2, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const/16 v2, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v1, v2

    .line 64
    :cond_5
    :goto_3
    and-int/lit8 v2, p8, 0x4

    .line 65
    .line 66
    if-eqz v2, :cond_6

    .line 67
    .line 68
    or-int/lit16 v1, v1, 0x180

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_6
    and-int/lit16 v3, v8, 0x380

    .line 72
    .line 73
    if-nez v3, :cond_8

    .line 74
    .line 75
    move-object/from16 v3, p2

    .line 76
    .line 77
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_7

    .line 82
    .line 83
    const/16 v4, 0x100

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_7
    const/16 v4, 0x80

    .line 87
    .line 88
    :goto_4
    or-int/2addr v1, v4

    .line 89
    goto :goto_6

    .line 90
    :cond_8
    :goto_5
    move-object/from16 v3, p2

    .line 91
    .line 92
    :goto_6
    and-int/lit8 v4, p8, 0x8

    .line 93
    .line 94
    if-eqz v4, :cond_9

    .line 95
    .line 96
    or-int/lit16 v1, v1, 0xc00

    .line 97
    .line 98
    goto :goto_8

    .line 99
    :cond_9
    and-int/lit16 v9, v8, 0x1c00

    .line 100
    .line 101
    if-nez v9, :cond_b

    .line 102
    .line 103
    move/from16 v9, p3

    .line 104
    .line 105
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-eqz v10, :cond_a

    .line 110
    .line 111
    const/16 v10, 0x800

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_a
    const/16 v10, 0x400

    .line 115
    .line 116
    :goto_7
    or-int/2addr v1, v10

    .line 117
    goto :goto_9

    .line 118
    :cond_b
    :goto_8
    move/from16 v9, p3

    .line 119
    .line 120
    :goto_9
    and-int/lit8 v10, p8, 0x10

    .line 121
    .line 122
    if-eqz v10, :cond_c

    .line 123
    .line 124
    or-int/lit16 v1, v1, 0x6000

    .line 125
    .line 126
    goto :goto_b

    .line 127
    :cond_c
    const v11, 0xe000

    .line 128
    .line 129
    .line 130
    and-int/2addr v11, v8

    .line 131
    if-nez v11, :cond_e

    .line 132
    .line 133
    move-object/from16 v11, p4

    .line 134
    .line 135
    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    if-eqz v12, :cond_d

    .line 140
    .line 141
    const/16 v12, 0x4000

    .line 142
    .line 143
    goto :goto_a

    .line 144
    :cond_d
    const/16 v12, 0x2000

    .line 145
    .line 146
    :goto_a
    or-int/2addr v1, v12

    .line 147
    goto :goto_c

    .line 148
    :cond_e
    :goto_b
    move-object/from16 v11, p4

    .line 149
    .line 150
    :goto_c
    const/high16 v12, 0x70000

    .line 151
    .line 152
    and-int/2addr v12, v8

    .line 153
    if-nez v12, :cond_11

    .line 154
    .line 155
    and-int/lit8 v12, p8, 0x20

    .line 156
    .line 157
    if-nez v12, :cond_f

    .line 158
    .line 159
    move-object/from16 v12, p5

    .line 160
    .line 161
    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    if-eqz v13, :cond_10

    .line 166
    .line 167
    const/high16 v13, 0x20000

    .line 168
    .line 169
    goto :goto_d

    .line 170
    :cond_f
    move-object/from16 v12, p5

    .line 171
    .line 172
    :cond_10
    const/high16 v13, 0x10000

    .line 173
    .line 174
    :goto_d
    or-int/2addr v1, v13

    .line 175
    goto :goto_e

    .line 176
    :cond_11
    move-object/from16 v12, p5

    .line 177
    .line 178
    :goto_e
    const v13, 0x5b6db

    .line 179
    .line 180
    .line 181
    and-int/2addr v13, v1

    .line 182
    const v14, 0x12492

    .line 183
    .line 184
    .line 185
    if-ne v13, v14, :cond_13

    .line 186
    .line 187
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    if-nez v13, :cond_12

    .line 192
    .line 193
    goto :goto_f

    .line 194
    :cond_12
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 195
    .line 196
    .line 197
    move-object v10, v6

    .line 198
    move v4, v9

    .line 199
    move-object v5, v11

    .line 200
    move-object v6, v12

    .line 201
    goto/16 :goto_18

    .line 202
    .line 203
    :cond_13
    :goto_f
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 204
    .line 205
    .line 206
    and-int/lit8 v13, v8, 0x1

    .line 207
    .line 208
    const v23, -0x70001

    .line 209
    .line 210
    .line 211
    if-eqz v13, :cond_16

    .line 212
    .line 213
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    if-eqz v13, :cond_14

    .line 218
    .line 219
    goto :goto_10

    .line 220
    :cond_14
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 221
    .line 222
    .line 223
    and-int/lit8 v2, p8, 0x20

    .line 224
    .line 225
    if-eqz v2, :cond_15

    .line 226
    .line 227
    and-int v1, v1, v23

    .line 228
    .line 229
    :cond_15
    move-object v4, v3

    .line 230
    move/from16 v16, v9

    .line 231
    .line 232
    move-object/from16 v17, v11

    .line 233
    .line 234
    move-object/from16 v18, v12

    .line 235
    .line 236
    move v3, v1

    .line 237
    goto :goto_15

    .line 238
    :cond_16
    :goto_10
    if-eqz v2, :cond_17

    .line 239
    .line 240
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 241
    .line 242
    goto :goto_11

    .line 243
    :cond_17
    move-object v2, v3

    .line 244
    :goto_11
    if-eqz v4, :cond_18

    .line 245
    .line 246
    const/4 v3, 0x1

    .line 247
    goto :goto_12

    .line 248
    :cond_18
    move v3, v9

    .line 249
    :goto_12
    if-eqz v10, :cond_1a

    .line 250
    .line 251
    const v4, -0x1d58f75c

    .line 252
    .line 253
    .line 254
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 262
    .line 263
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    if-ne v4, v9, :cond_19

    .line 268
    .line 269
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    :cond_19
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 277
    .line 278
    .line 279
    check-cast v4, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 280
    .line 281
    goto :goto_13

    .line 282
    :cond_1a
    move-object v4, v11

    .line 283
    :goto_13
    and-int/lit8 v9, p8, 0x20

    .line 284
    .line 285
    if-eqz v9, :cond_1b

    .line 286
    .line 287
    sget-object v9, Landroidx/compose/material/CheckboxDefaults;->INSTANCE:Landroidx/compose/material/CheckboxDefaults;

    .line 288
    .line 289
    const-wide/16 v10, 0x0

    .line 290
    .line 291
    const-wide/16 v12, 0x0

    .line 292
    .line 293
    const-wide/16 v14, 0x0

    .line 294
    .line 295
    const-wide/16 v16, 0x0

    .line 296
    .line 297
    const-wide/16 v18, 0x0

    .line 298
    .line 299
    const/high16 v21, 0x30000

    .line 300
    .line 301
    const/16 v22, 0x1f

    .line 302
    .line 303
    move-object/from16 v20, v6

    .line 304
    .line 305
    invoke-virtual/range {v9 .. v22}, Landroidx/compose/material/CheckboxDefaults;->colors-zjMxDiM(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    and-int v1, v1, v23

    .line 310
    .line 311
    move/from16 v16, v3

    .line 312
    .line 313
    move-object/from16 v17, v4

    .line 314
    .line 315
    move-object/from16 v18, v9

    .line 316
    .line 317
    goto :goto_14

    .line 318
    :cond_1b
    move/from16 v16, v3

    .line 319
    .line 320
    move-object/from16 v17, v4

    .line 321
    .line 322
    move-object/from16 v18, v12

    .line 323
    .line 324
    :goto_14
    move v3, v1

    .line 325
    move-object v4, v2

    .line 326
    :goto_15
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 327
    .line 328
    .line 329
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-eqz v1, :cond_1c

    .line 334
    .line 335
    const/4 v1, -0x1

    .line 336
    const-string v2, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:138)"

    .line 337
    .line 338
    invoke-static {v0, v3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 339
    .line 340
    .line 341
    :cond_1c
    const v0, -0x5a73f7ca

    .line 342
    .line 343
    .line 344
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 345
    .line 346
    .line 347
    if-eqz v7, :cond_1d

    .line 348
    .line 349
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 350
    .line 351
    sget-object v1, Landroidx/compose/ui/semantics/Role;->Companion:Landroidx/compose/ui/semantics/Role$Companion;

    .line 352
    .line 353
    invoke-virtual {v1}, Landroidx/compose/ui/semantics/Role$Companion;->getCheckbox-o7Vup1c()I

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    const/4 v9, 0x0

    .line 358
    sget v10, Landroidx/compose/material/CheckboxKt;->CheckboxRippleRadius:F

    .line 359
    .line 360
    const-wide/16 v11, 0x0

    .line 361
    .line 362
    const/16 v14, 0x36

    .line 363
    .line 364
    const/4 v15, 0x4

    .line 365
    move-object v13, v6

    .line 366
    invoke-static/range {v9 .. v15}, Landroidx/compose/material/ripple/RippleKt;->rememberRipple-9IZ8Weo(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;

    .line 367
    .line 368
    .line 369
    move-result-object v9

    .line 370
    invoke-static {v1}, Landroidx/compose/ui/semantics/Role;->box-impl(I)Landroidx/compose/ui/semantics/Role;

    .line 371
    .line 372
    .line 373
    move-result-object v10

    .line 374
    move-object/from16 v1, p0

    .line 375
    .line 376
    move-object/from16 v2, v17

    .line 377
    .line 378
    move v11, v3

    .line 379
    move-object v3, v9

    .line 380
    move-object v9, v4

    .line 381
    move/from16 v4, v16

    .line 382
    .line 383
    move-object v5, v10

    .line 384
    move-object v10, v6

    .line 385
    move-object/from16 v6, p1

    .line 386
    .line 387
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/ToggleableKt;->triStateToggleable-O2vRcR0(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lv3/a;)Landroidx/compose/ui/Modifier;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    goto :goto_16

    .line 392
    :cond_1d
    move v11, v3

    .line 393
    move-object v9, v4

    .line 394
    move-object v10, v6

    .line 395
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 396
    .line 397
    :goto_16
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 398
    .line 399
    .line 400
    if-eqz v7, :cond_1e

    .line 401
    .line 402
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 403
    .line 404
    invoke-static {v1}, Landroidx/compose/material/InteractiveComponentSizeKt;->minimumInteractiveComponentSize(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    goto :goto_17

    .line 409
    :cond_1e
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 410
    .line 411
    :goto_17
    invoke-interface {v9, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-interface {v1, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    sget v1, Landroidx/compose/material/CheckboxKt;->CheckboxDefaultPadding:F

    .line 420
    .line 421
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    shr-int/lit8 v0, v11, 0x9

    .line 426
    .line 427
    and-int/lit8 v0, v0, 0xe

    .line 428
    .line 429
    shl-int/lit8 v1, v11, 0x3

    .line 430
    .line 431
    and-int/lit8 v1, v1, 0x70

    .line 432
    .line 433
    or-int/2addr v0, v1

    .line 434
    shr-int/lit8 v1, v11, 0x6

    .line 435
    .line 436
    and-int/lit16 v1, v1, 0x1c00

    .line 437
    .line 438
    or-int v6, v0, v1

    .line 439
    .line 440
    move/from16 v1, v16

    .line 441
    .line 442
    move-object/from16 v2, p0

    .line 443
    .line 444
    move-object/from16 v4, v18

    .line 445
    .line 446
    move-object v5, v10

    .line 447
    invoke-static/range {v1 .. v6}, Landroidx/compose/material/CheckboxKt;->CheckboxImpl(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V

    .line 448
    .line 449
    .line 450
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    if-eqz v0, :cond_1f

    .line 455
    .line 456
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 457
    .line 458
    .line 459
    :cond_1f
    move-object v3, v9

    .line 460
    move/from16 v4, v16

    .line 461
    .line 462
    move-object/from16 v5, v17

    .line 463
    .line 464
    move-object/from16 v6, v18

    .line 465
    .line 466
    :goto_18
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 467
    .line 468
    .line 469
    move-result-object v9

    .line 470
    if-eqz v9, :cond_20

    .line 471
    .line 472
    new-instance v10, Landroidx/compose/material/CheckboxKt$TriStateCheckbox$2;

    .line 473
    .line 474
    move-object v0, v10

    .line 475
    move-object/from16 v1, p0

    .line 476
    .line 477
    move-object/from16 v2, p1

    .line 478
    .line 479
    move/from16 v7, p7

    .line 480
    .line 481
    move/from16 v8, p8

    .line 482
    .line 483
    invoke-direct/range {v0 .. v8}, Landroidx/compose/material/CheckboxKt$TriStateCheckbox$2;-><init>(Landroidx/compose/ui/state/ToggleableState;Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;II)V

    .line 484
    .line 485
    .line 486
    invoke-interface {v9, v10}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 487
    .line 488
    .line 489
    :cond_20
    return-void
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
.end method

.method public static final synthetic access$CheckboxImpl(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Landroidx/compose/material/CheckboxKt;->CheckboxImpl(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$CheckboxImpl$lambda$10(Landroidx/compose/runtime/State;)J
    .locals 2

    invoke-static {p0}, Landroidx/compose/material/CheckboxKt;->CheckboxImpl$lambda$10(Landroidx/compose/runtime/State;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$CheckboxImpl$lambda$4(Landroidx/compose/runtime/State;)F
    .locals 0

    invoke-static {p0}, Landroidx/compose/material/CheckboxKt;->CheckboxImpl$lambda$4(Landroidx/compose/runtime/State;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$CheckboxImpl$lambda$6(Landroidx/compose/runtime/State;)F
    .locals 0

    invoke-static {p0}, Landroidx/compose/material/CheckboxKt;->CheckboxImpl$lambda$6(Landroidx/compose/runtime/State;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$CheckboxImpl$lambda$8(Landroidx/compose/runtime/State;)J
    .locals 2

    invoke-static {p0}, Landroidx/compose/material/CheckboxKt;->CheckboxImpl$lambda$8(Landroidx/compose/runtime/State;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$CheckboxImpl$lambda$9(Landroidx/compose/runtime/State;)J
    .locals 2

    invoke-static {p0}, Landroidx/compose/material/CheckboxKt;->CheckboxImpl$lambda$9(Landroidx/compose/runtime/State;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$drawBox-1wkBAMs(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/material/CheckboxKt;->drawBox-1wkBAMs(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V

    return-void
.end method

.method public static final synthetic access$drawCheck-3IgeMak(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/material/CheckboxKt;->drawCheck-3IgeMak(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V

    return-void
.end method

.method public static final synthetic access$getRadiusSize$p()F
    .locals 1

    sget v0, Landroidx/compose/material/CheckboxKt;->RadiusSize:F

    return v0
.end method

.method public static final synthetic access$getStrokeWidth$p()F
    .locals 1

    sget v0, Landroidx/compose/material/CheckboxKt;->StrokeWidth:F

    return v0
.end method

.method private static final drawBox-1wkBAMs(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V
    .locals 51

    .line 1
    move/from16 v0, p5

    .line 2
    .line 3
    move/from16 v9, p6

    .line 4
    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    div-float v10, v9, v1

    .line 8
    .line 9
    new-instance v20, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/16 v7, 0x1e

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    move-object/from16 v1, v20

    .line 19
    .line 20
    move/from16 v2, p6

    .line 21
    .line 22
    invoke-direct/range {v1 .. v8}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/w;)V

    .line 23
    .line 24
    .line 25
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static/range {p1 .. p4}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    const-wide/16 v24, 0x0

    .line 43
    .line 44
    invoke-static {v1, v1}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 45
    .line 46
    .line 47
    move-result-wide v26

    .line 48
    invoke-static {v0, v4, v5, v3}, Landroidx/compose/ui/geometry/CornerRadiusKt;->CornerRadius$default(FFILjava/lang/Object;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v28

    .line 52
    sget-object v30, Landroidx/compose/ui/graphics/drawscope/Fill;->INSTANCE:Landroidx/compose/ui/graphics/drawscope/Fill;

    .line 53
    .line 54
    const/16 v31, 0x0

    .line 55
    .line 56
    const/16 v32, 0x0

    .line 57
    .line 58
    const/16 v33, 0x0

    .line 59
    .line 60
    const/16 v34, 0xe2

    .line 61
    .line 62
    const/16 v35, 0x0

    .line 63
    .line 64
    move-object/from16 v21, p0

    .line 65
    .line 66
    move-wide/from16 v22, p1

    .line 67
    .line 68
    invoke-static/range {v21 .. v35}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-static {v9, v9}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 73
    .line 74
    .line 75
    move-result-wide v39

    .line 76
    int-to-float v2, v5

    .line 77
    mul-float/2addr v2, v9

    .line 78
    sub-float v2, v1, v2

    .line 79
    .line 80
    invoke-static {v2, v2}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 81
    .line 82
    .line 83
    move-result-wide v41

    .line 84
    sub-float v2, v0, v9

    .line 85
    .line 86
    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-static {v2, v4, v5, v3}, Landroidx/compose/ui/geometry/CornerRadiusKt;->CornerRadius$default(FFILjava/lang/Object;)J

    .line 91
    .line 92
    .line 93
    move-result-wide v43

    .line 94
    sget-object v45, Landroidx/compose/ui/graphics/drawscope/Fill;->INSTANCE:Landroidx/compose/ui/graphics/drawscope/Fill;

    .line 95
    .line 96
    const/16 v46, 0x0

    .line 97
    .line 98
    const/16 v47, 0x0

    .line 99
    .line 100
    const/16 v48, 0x0

    .line 101
    .line 102
    const/16 v49, 0xe0

    .line 103
    .line 104
    const/16 v50, 0x0

    .line 105
    .line 106
    move-object/from16 v36, p0

    .line 107
    .line 108
    move-wide/from16 v37, p1

    .line 109
    .line 110
    invoke-static/range {v36 .. v50}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v10, v10}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 114
    .line 115
    .line 116
    move-result-wide v14

    .line 117
    sub-float/2addr v1, v9

    .line 118
    invoke-static {v1, v1}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 119
    .line 120
    .line 121
    move-result-wide v16

    .line 122
    sub-float/2addr v0, v10

    .line 123
    invoke-static {v0, v4, v5, v3}, Landroidx/compose/ui/geometry/CornerRadiusKt;->CornerRadius$default(FFILjava/lang/Object;)J

    .line 124
    .line 125
    .line 126
    move-result-wide v18

    .line 127
    const/16 v21, 0x0

    .line 128
    .line 129
    const/16 v22, 0x0

    .line 130
    .line 131
    const/16 v23, 0x0

    .line 132
    .line 133
    const/16 v24, 0xe0

    .line 134
    .line 135
    const/16 v25, 0x0

    .line 136
    .line 137
    move-object/from16 v11, p0

    .line 138
    .line 139
    move-wide/from16 v12, p3

    .line 140
    .line 141
    invoke-static/range {v11 .. v25}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :goto_0
    return-void
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
.end method

.method private static final drawCheck-3IgeMak(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V
    .locals 11

    .line 1
    move v0, p4

    .line 2
    new-instance v9, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 3
    .line 4
    const/4 v3, 0x0

    .line 5
    sget-object v1, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getSquare-KaPHkGw()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/16 v7, 0x1a

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    move-object v1, v9

    .line 17
    move/from16 v2, p5

    .line 18
    .line 19
    invoke-direct/range {v1 .. v8}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/w;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const v2, 0x3ecccccd    # 0.4f

    .line 31
    .line 32
    .line 33
    const/high16 v3, 0x3f000000    # 0.5f

    .line 34
    .line 35
    invoke-static {v2, v3, p4}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const v4, 0x3f333333    # 0.7f

    .line 40
    .line 41
    .line 42
    invoke-static {v4, v3, p4}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-static {v3, v3, p4}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const v6, 0x3e99999a    # 0.3f

    .line 51
    .line 52
    .line 53
    invoke-static {v6, v3, p4}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material/CheckDrawingCache;->getCheckPath()Landroidx/compose/ui/graphics/Path;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v3}, Landroidx/compose/ui/graphics/Path;->reset()V

    .line 62
    .line 63
    .line 64
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material/CheckDrawingCache;->getCheckPath()Landroidx/compose/ui/graphics/Path;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const v6, 0x3e4ccccd    # 0.2f

    .line 69
    .line 70
    .line 71
    mul-float/2addr v6, v1

    .line 72
    mul-float/2addr v5, v1

    .line 73
    invoke-interface {v3, v6, v5}, Landroidx/compose/ui/graphics/Path;->moveTo(FF)V

    .line 74
    .line 75
    .line 76
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material/CheckDrawingCache;->getCheckPath()Landroidx/compose/ui/graphics/Path;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    mul-float/2addr v2, v1

    .line 81
    mul-float/2addr v4, v1

    .line 82
    invoke-interface {v3, v2, v4}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 83
    .line 84
    .line 85
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material/CheckDrawingCache;->getCheckPath()Landroidx/compose/ui/graphics/Path;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const v3, 0x3f4ccccd    # 0.8f

    .line 90
    .line 91
    .line 92
    mul-float/2addr v3, v1

    .line 93
    mul-float/2addr v1, v0

    .line 94
    invoke-interface {v2, v3, v1}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material/CheckDrawingCache;->getPathMeasure()Landroidx/compose/ui/graphics/PathMeasure;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material/CheckDrawingCache;->getCheckPath()Landroidx/compose/ui/graphics/Path;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const/4 v2, 0x0

    .line 106
    invoke-interface {v0, v1, v2}, Landroidx/compose/ui/graphics/PathMeasure;->setPath(Landroidx/compose/ui/graphics/Path;Z)V

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material/CheckDrawingCache;->getPathToDraw()Landroidx/compose/ui/graphics/Path;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-interface {v0}, Landroidx/compose/ui/graphics/Path;->reset()V

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material/CheckDrawingCache;->getPathMeasure()Landroidx/compose/ui/graphics/PathMeasure;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material/CheckDrawingCache;->getPathMeasure()Landroidx/compose/ui/graphics/PathMeasure;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-interface {v1}, Landroidx/compose/ui/graphics/PathMeasure;->getLength()F

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    mul-float/2addr v1, p3

    .line 129
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material/CheckDrawingCache;->getPathToDraw()Landroidx/compose/ui/graphics/Path;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    const/4 v3, 0x1

    .line 134
    const/4 v4, 0x0

    .line 135
    invoke-interface {v0, v4, v1, v2, v3}, Landroidx/compose/ui/graphics/PathMeasure;->getSegment(FFLandroidx/compose/ui/graphics/Path;Z)Z

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material/CheckDrawingCache;->getPathToDraw()Landroidx/compose/ui/graphics/Path;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    const/4 v6, 0x0

    .line 143
    const/4 v7, 0x0

    .line 144
    const/16 v8, 0x34

    .line 145
    .line 146
    const/4 v10, 0x0

    .line 147
    move-object v0, p0

    .line 148
    move-wide v2, p1

    .line 149
    move-object v5, v9

    .line 150
    move-object v9, v10

    .line 151
    invoke-static/range {v0 .. v9}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawPath-LG529CI$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    return-void
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
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
.end method
