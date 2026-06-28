.class public final Landroidx/compose/foundation/pager/PagerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\u001a\u00d8\u0001\u0010$\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00102%\u0008\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001921\u0010!\u001a-\u0012\u0004\u0012\u00020\u001c\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u001d\u0012\u0004\u0012\u00020\u001e0\u001b\u00a2\u0006\u0002\u0008\u001f\u00a2\u0006\u0002\u0008 H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\"\u0010#\u001a\u00d8\u0001\u0010)\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010&\u001a\u00020%2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00102%\u0008\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001921\u0010!\u001a-\u0012\u0004\u0012\u00020\u001c\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u001d\u0012\u0004\u0012\u00020\u001e0\u001b\u00a2\u0006\u0002\u0008\u001f\u00a2\u0006\u0002\u0008 H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010(\u001a.\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0-2\u0006\u00100\u001a\u00020.H\u0002\u001a#\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0010H\u0001\u00a2\u0006\u0004\u00084\u00105\u001a\u0017\u00109\u001a\u00020\u001e2\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020706H\u0082\u0008\u001a\u000c\u0010:\u001a\u00020\u0010*\u00020\u0000H\u0002\u001a\u000c\u0010;\u001a\u00020.*\u00020\u0000H\u0002\"\u0014\u0010<\u001a\u00020\u00088\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008<\u0010=\"\u0014\u0010>\u001a\u00020\u00108\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008>\u0010?\"\u0014\u0010@\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008@\u0010?\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006A"
    }
    d2 = {
        "Landroidx/compose/foundation/pager/PagerState;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "contentPadding",
        "Landroidx/compose/foundation/pager/PageSize;",
        "pageSize",
        "",
        "beyondBoundsPageCount",
        "Landroidx/compose/ui/unit/Dp;",
        "pageSpacing",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "verticalAlignment",
        "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;",
        "flingBehavior",
        "",
        "userScrollEnabled",
        "reverseLayout",
        "Lkotlin/Function1;",
        "Lkotlin/v0;",
        "name",
        "index",
        "",
        "key",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "pageNestedScrollConnection",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/pager/PagerScope;",
        "page",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/u;",
        "pageContent",
        "HorizontalPager-xYaah8o",
        "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLv3/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/r;Landroidx/compose/runtime/Composer;III)V",
        "HorizontalPager",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "horizontalAlignment",
        "VerticalPager-xYaah8o",
        "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLv3/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/r;Landroidx/compose/runtime/Composer;III)V",
        "VerticalPager",
        "pagerState",
        "Landroidx/compose/foundation/pager/PagerSnapDistance;",
        "pagerSnapDistance",
        "Landroidx/compose/animation/core/DecayAnimationSpec;",
        "",
        "decayAnimationSpec",
        "snapPositionalThreshold",
        "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;",
        "SnapLayoutInfoProvider",
        "isVertical",
        "pagerSemantics",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;",
        "Lkotlin/Function0;",
        "",
        "generateMsg",
        "debugLog",
        "isScrollingForward",
        "dragGestureDelta",
        "LowVelocityAnimationDefaultDuration",
        "I",
        "PagerDebugEnable",
        "Z",
        "DEBUG",
        "foundation_release"
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
        "SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,970:1\n154#2:971\n154#2:972\n154#2:980\n154#2:981\n36#3:973\n36#3:982\n25#3:993\n1116#4,6:974\n1116#4,6:983\n1116#4,3:994\n1119#4,3:1000\n487#5,4:989\n491#5,2:997\n495#5:1003\n487#6:999\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n112#1:971\n115#1:972\n192#1:980\n195#1:981\n121#1:973\n201#1:982\n916#1:993\n121#1:974,6\n201#1:983,6\n916#1:994,3\n916#1:1000,3\n916#1:989,4\n916#1:997,2\n916#1:1003\n916#1:999\n*E\n"
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final LowVelocityAnimationDefaultDuration:I = 0x1f4

.field public static final PagerDebugEnable:Z = false


# direct methods
.method public static final HorizontalPager-xYaah8o(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLv3/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/r;Landroidx/compose/runtime/Composer;III)V
    .locals 36
    .param p0    # Landroidx/compose/foundation/pager/PagerState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/pager/PageSize;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/ui/Alignment$Vertical;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p10    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p12    # Lv3/r;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/pager/PagerState;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/foundation/pager/PageSize;",
            "IF",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;",
            "ZZ",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
            "Lv3/r<",
            "-",
            "Landroidx/compose/foundation/pager/PagerScope;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    move/from16 v14, p14

    .line 4
    .line 5
    move/from16 v13, p15

    .line 6
    .line 7
    move/from16 v11, p16

    .line 8
    .line 9
    const v10, 0x58e189a1

    .line 10
    .line 11
    .line 12
    move-object/from16 v0, p13

    .line 13
    .line 14
    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v12

    .line 18
    and-int/lit8 v0, v11, 0x1

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    or-int/lit8 v0, v14, 0x6

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    and-int/lit8 v0, v14, 0xe

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v0, 0x2

    .line 38
    :goto_0
    or-int/2addr v0, v14

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v0, v14

    .line 41
    :goto_1
    and-int/lit8 v3, v11, 0x2

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    or-int/lit8 v0, v0, 0x30

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    and-int/lit8 v4, v14, 0x70

    .line 49
    .line 50
    if-nez v4, :cond_5

    .line 51
    .line 52
    move-object/from16 v4, p1

    .line 53
    .line 54
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_4

    .line 59
    .line 60
    const/16 v5, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    const/16 v5, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v0, v5

    .line 66
    goto :goto_4

    .line 67
    :cond_5
    :goto_3
    move-object/from16 v4, p1

    .line 68
    .line 69
    :goto_4
    and-int/lit8 v5, v11, 0x4

    .line 70
    .line 71
    if-eqz v5, :cond_6

    .line 72
    .line 73
    or-int/lit16 v0, v0, 0x180

    .line 74
    .line 75
    goto :goto_6

    .line 76
    :cond_6
    and-int/lit16 v8, v14, 0x380

    .line 77
    .line 78
    if-nez v8, :cond_8

    .line 79
    .line 80
    move-object/from16 v8, p2

    .line 81
    .line 82
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-eqz v9, :cond_7

    .line 87
    .line 88
    const/16 v9, 0x100

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_7
    const/16 v9, 0x80

    .line 92
    .line 93
    :goto_5
    or-int/2addr v0, v9

    .line 94
    goto :goto_7

    .line 95
    :cond_8
    :goto_6
    move-object/from16 v8, p2

    .line 96
    .line 97
    :goto_7
    and-int/lit8 v9, v11, 0x8

    .line 98
    .line 99
    if-eqz v9, :cond_9

    .line 100
    .line 101
    or-int/lit16 v0, v0, 0xc00

    .line 102
    .line 103
    goto :goto_9

    .line 104
    :cond_9
    and-int/lit16 v2, v14, 0x1c00

    .line 105
    .line 106
    if-nez v2, :cond_b

    .line 107
    .line 108
    move-object/from16 v2, p3

    .line 109
    .line 110
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v17

    .line 114
    if-eqz v17, :cond_a

    .line 115
    .line 116
    const/16 v17, 0x800

    .line 117
    .line 118
    goto :goto_8

    .line 119
    :cond_a
    const/16 v17, 0x400

    .line 120
    .line 121
    :goto_8
    or-int v0, v0, v17

    .line 122
    .line 123
    goto :goto_a

    .line 124
    :cond_b
    :goto_9
    move-object/from16 v2, p3

    .line 125
    .line 126
    :goto_a
    and-int/lit8 v17, v11, 0x10

    .line 127
    .line 128
    const v18, 0xe000

    .line 129
    .line 130
    .line 131
    if-eqz v17, :cond_c

    .line 132
    .line 133
    or-int/lit16 v0, v0, 0x6000

    .line 134
    .line 135
    move/from16 v6, p4

    .line 136
    .line 137
    goto :goto_c

    .line 138
    :cond_c
    and-int v19, v14, v18

    .line 139
    .line 140
    move/from16 v6, p4

    .line 141
    .line 142
    if-nez v19, :cond_e

    .line 143
    .line 144
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 145
    .line 146
    .line 147
    move-result v20

    .line 148
    if-eqz v20, :cond_d

    .line 149
    .line 150
    const/16 v20, 0x4000

    .line 151
    .line 152
    goto :goto_b

    .line 153
    :cond_d
    const/16 v20, 0x2000

    .line 154
    .line 155
    :goto_b
    or-int v0, v0, v20

    .line 156
    .line 157
    :cond_e
    :goto_c
    and-int/lit8 v20, v11, 0x20

    .line 158
    .line 159
    const/high16 v21, 0x70000

    .line 160
    .line 161
    if-eqz v20, :cond_f

    .line 162
    .line 163
    const/high16 v22, 0x30000

    .line 164
    .line 165
    or-int v0, v0, v22

    .line 166
    .line 167
    move/from16 v7, p5

    .line 168
    .line 169
    goto :goto_e

    .line 170
    :cond_f
    and-int v22, v14, v21

    .line 171
    .line 172
    move/from16 v7, p5

    .line 173
    .line 174
    if-nez v22, :cond_11

    .line 175
    .line 176
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 177
    .line 178
    .line 179
    move-result v23

    .line 180
    if-eqz v23, :cond_10

    .line 181
    .line 182
    const/high16 v23, 0x20000

    .line 183
    .line 184
    goto :goto_d

    .line 185
    :cond_10
    const/high16 v23, 0x10000

    .line 186
    .line 187
    :goto_d
    or-int v0, v0, v23

    .line 188
    .line 189
    :cond_11
    :goto_e
    and-int/lit8 v23, v11, 0x40

    .line 190
    .line 191
    const/high16 v24, 0x380000

    .line 192
    .line 193
    if-eqz v23, :cond_12

    .line 194
    .line 195
    const/high16 v25, 0x180000

    .line 196
    .line 197
    or-int v0, v0, v25

    .line 198
    .line 199
    move-object/from16 v10, p6

    .line 200
    .line 201
    goto :goto_10

    .line 202
    :cond_12
    and-int v25, v14, v24

    .line 203
    .line 204
    move-object/from16 v10, p6

    .line 205
    .line 206
    if-nez v25, :cond_14

    .line 207
    .line 208
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v26

    .line 212
    if-eqz v26, :cond_13

    .line 213
    .line 214
    const/high16 v26, 0x100000

    .line 215
    .line 216
    goto :goto_f

    .line 217
    :cond_13
    const/high16 v26, 0x80000

    .line 218
    .line 219
    :goto_f
    or-int v0, v0, v26

    .line 220
    .line 221
    :cond_14
    :goto_10
    const/high16 v26, 0x1c00000

    .line 222
    .line 223
    and-int v26, v14, v26

    .line 224
    .line 225
    if-nez v26, :cond_17

    .line 226
    .line 227
    and-int/lit16 v1, v11, 0x80

    .line 228
    .line 229
    if-nez v1, :cond_15

    .line 230
    .line 231
    move-object/from16 v1, p7

    .line 232
    .line 233
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v27

    .line 237
    if-eqz v27, :cond_16

    .line 238
    .line 239
    const/high16 v27, 0x800000

    .line 240
    .line 241
    goto :goto_11

    .line 242
    :cond_15
    move-object/from16 v1, p7

    .line 243
    .line 244
    :cond_16
    const/high16 v27, 0x400000

    .line 245
    .line 246
    :goto_11
    or-int v0, v0, v27

    .line 247
    .line 248
    goto :goto_12

    .line 249
    :cond_17
    move-object/from16 v1, p7

    .line 250
    .line 251
    :goto_12
    and-int/lit16 v6, v11, 0x100

    .line 252
    .line 253
    if-eqz v6, :cond_18

    .line 254
    .line 255
    const/high16 v27, 0x6000000

    .line 256
    .line 257
    or-int v0, v0, v27

    .line 258
    .line 259
    goto :goto_14

    .line 260
    :cond_18
    const/high16 v27, 0xe000000

    .line 261
    .line 262
    and-int v27, v14, v27

    .line 263
    .line 264
    if-nez v27, :cond_1a

    .line 265
    .line 266
    move/from16 v27, v6

    .line 267
    .line 268
    move/from16 v6, p8

    .line 269
    .line 270
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 271
    .line 272
    .line 273
    move-result v28

    .line 274
    if-eqz v28, :cond_19

    .line 275
    .line 276
    const/high16 v28, 0x4000000

    .line 277
    .line 278
    goto :goto_13

    .line 279
    :cond_19
    const/high16 v28, 0x2000000

    .line 280
    .line 281
    :goto_13
    or-int v0, v0, v28

    .line 282
    .line 283
    goto :goto_15

    .line 284
    :cond_1a
    :goto_14
    move/from16 v27, v6

    .line 285
    .line 286
    move/from16 v6, p8

    .line 287
    .line 288
    :goto_15
    and-int/lit16 v6, v11, 0x200

    .line 289
    .line 290
    if-eqz v6, :cond_1b

    .line 291
    .line 292
    const/high16 v28, 0x30000000

    .line 293
    .line 294
    or-int v0, v0, v28

    .line 295
    .line 296
    move/from16 v29, v0

    .line 297
    .line 298
    move/from16 v28, v6

    .line 299
    .line 300
    move/from16 v6, p9

    .line 301
    .line 302
    goto :goto_18

    .line 303
    :cond_1b
    const/high16 v28, 0x70000000

    .line 304
    .line 305
    and-int v28, v14, v28

    .line 306
    .line 307
    if-nez v28, :cond_1d

    .line 308
    .line 309
    move/from16 v28, v6

    .line 310
    .line 311
    move/from16 v6, p9

    .line 312
    .line 313
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 314
    .line 315
    .line 316
    move-result v29

    .line 317
    if-eqz v29, :cond_1c

    .line 318
    .line 319
    const/high16 v29, 0x20000000

    .line 320
    .line 321
    goto :goto_16

    .line 322
    :cond_1c
    const/high16 v29, 0x10000000

    .line 323
    .line 324
    :goto_16
    or-int v0, v0, v29

    .line 325
    .line 326
    goto :goto_17

    .line 327
    :cond_1d
    move/from16 v28, v6

    .line 328
    .line 329
    move/from16 v6, p9

    .line 330
    .line 331
    :goto_17
    move/from16 v29, v0

    .line 332
    .line 333
    :goto_18
    and-int/lit16 v0, v11, 0x400

    .line 334
    .line 335
    if-eqz v0, :cond_1e

    .line 336
    .line 337
    or-int/lit8 v16, v13, 0x6

    .line 338
    .line 339
    move-object/from16 v6, p10

    .line 340
    .line 341
    goto :goto_1a

    .line 342
    :cond_1e
    and-int/lit8 v30, v13, 0xe

    .line 343
    .line 344
    move-object/from16 v6, p10

    .line 345
    .line 346
    if-nez v30, :cond_20

    .line 347
    .line 348
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v30

    .line 352
    if-eqz v30, :cond_1f

    .line 353
    .line 354
    const/16 v16, 0x4

    .line 355
    .line 356
    goto :goto_19

    .line 357
    :cond_1f
    const/16 v16, 0x2

    .line 358
    .line 359
    :goto_19
    or-int v16, v13, v16

    .line 360
    .line 361
    goto :goto_1a

    .line 362
    :cond_20
    move/from16 v16, v13

    .line 363
    .line 364
    :goto_1a
    and-int/lit16 v6, v11, 0x800

    .line 365
    .line 366
    if-eqz v6, :cond_21

    .line 367
    .line 368
    or-int/lit8 v16, v16, 0x10

    .line 369
    .line 370
    :cond_21
    move/from16 v30, v0

    .line 371
    .line 372
    move/from16 v0, v16

    .line 373
    .line 374
    and-int/lit16 v1, v11, 0x1000

    .line 375
    .line 376
    if-eqz v1, :cond_22

    .line 377
    .line 378
    or-int/lit16 v0, v0, 0x180

    .line 379
    .line 380
    goto :goto_1c

    .line 381
    :cond_22
    and-int/lit16 v1, v13, 0x380

    .line 382
    .line 383
    if-nez v1, :cond_24

    .line 384
    .line 385
    move-object/from16 v1, p12

    .line 386
    .line 387
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v16

    .line 391
    if-eqz v16, :cond_23

    .line 392
    .line 393
    const/16 v19, 0x100

    .line 394
    .line 395
    goto :goto_1b

    .line 396
    :cond_23
    const/16 v19, 0x80

    .line 397
    .line 398
    :goto_1b
    or-int v0, v0, v19

    .line 399
    .line 400
    goto :goto_1c

    .line 401
    :cond_24
    move-object/from16 v1, p12

    .line 402
    .line 403
    :goto_1c
    const/16 v1, 0x800

    .line 404
    .line 405
    if-ne v6, v1, :cond_26

    .line 406
    .line 407
    const v1, 0x5b6db6db

    .line 408
    .line 409
    .line 410
    and-int v1, v29, v1

    .line 411
    .line 412
    const v2, 0x12492492

    .line 413
    .line 414
    .line 415
    if-ne v1, v2, :cond_26

    .line 416
    .line 417
    and-int/lit16 v1, v0, 0x2db

    .line 418
    .line 419
    const/16 v2, 0x92

    .line 420
    .line 421
    if-ne v1, v2, :cond_26

    .line 422
    .line 423
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    if-nez v1, :cond_25

    .line 428
    .line 429
    goto :goto_1d

    .line 430
    :cond_25
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 431
    .line 432
    .line 433
    move/from16 v5, p4

    .line 434
    .line 435
    move/from16 v9, p8

    .line 436
    .line 437
    move-object/from16 v11, p10

    .line 438
    .line 439
    move-object v2, v4

    .line 440
    move v6, v7

    .line 441
    move-object v3, v8

    .line 442
    move-object v7, v10

    .line 443
    move-object/from16 v25, v12

    .line 444
    .line 445
    move-object/from16 v4, p3

    .line 446
    .line 447
    move-object/from16 v8, p7

    .line 448
    .line 449
    move/from16 v10, p9

    .line 450
    .line 451
    move-object/from16 v12, p11

    .line 452
    .line 453
    goto/16 :goto_2a

    .line 454
    .line 455
    :cond_26
    :goto_1d
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 456
    .line 457
    .line 458
    and-int/lit8 v1, v14, 0x1

    .line 459
    .line 460
    if-eqz v1, :cond_2a

    .line 461
    .line 462
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    if-eqz v1, :cond_27

    .line 467
    .line 468
    goto :goto_1e

    .line 469
    :cond_27
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 470
    .line 471
    .line 472
    and-int/lit16 v1, v11, 0x80

    .line 473
    .line 474
    if-eqz v1, :cond_28

    .line 475
    .line 476
    const v1, -0x1c00001

    .line 477
    .line 478
    .line 479
    and-int v29, v29, v1

    .line 480
    .line 481
    :cond_28
    if-eqz v6, :cond_29

    .line 482
    .line 483
    and-int/lit8 v0, v0, -0x71

    .line 484
    .line 485
    :cond_29
    move-object/from16 v22, p3

    .line 486
    .line 487
    move/from16 v23, p4

    .line 488
    .line 489
    move-object/from16 v28, p7

    .line 490
    .line 491
    move/from16 v31, p9

    .line 492
    .line 493
    move-object/from16 v30, p10

    .line 494
    .line 495
    move-object/from16 v32, p11

    .line 496
    .line 497
    move-object/from16 v19, v4

    .line 498
    .line 499
    move/from16 v26, v7

    .line 500
    .line 501
    move-object/from16 v20, v8

    .line 502
    .line 503
    move-object/from16 v27, v10

    .line 504
    .line 505
    move/from16 v1, v29

    .line 506
    .line 507
    move/from16 v29, p8

    .line 508
    .line 509
    goto/16 :goto_29

    .line 510
    .line 511
    :cond_2a
    :goto_1e
    if-eqz v3, :cond_2b

    .line 512
    .line 513
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 514
    .line 515
    move-object/from16 v16, v1

    .line 516
    .line 517
    goto :goto_1f

    .line 518
    :cond_2b
    move-object/from16 v16, v4

    .line 519
    .line 520
    :goto_1f
    const/4 v4, 0x0

    .line 521
    if-eqz v5, :cond_2c

    .line 522
    .line 523
    int-to-float v1, v4

    .line 524
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    invoke-static {v1}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    move-object/from16 v19, v1

    .line 533
    .line 534
    goto :goto_20

    .line 535
    :cond_2c
    move-object/from16 v19, v8

    .line 536
    .line 537
    :goto_20
    if-eqz v9, :cond_2d

    .line 538
    .line 539
    sget-object v1, Landroidx/compose/foundation/pager/PageSize$Fill;->INSTANCE:Landroidx/compose/foundation/pager/PageSize$Fill;

    .line 540
    .line 541
    move-object/from16 v22, v1

    .line 542
    .line 543
    goto :goto_21

    .line 544
    :cond_2d
    move-object/from16 v22, p3

    .line 545
    .line 546
    :goto_21
    if-eqz v17, :cond_2e

    .line 547
    .line 548
    move/from16 v17, v4

    .line 549
    .line 550
    goto :goto_22

    .line 551
    :cond_2e
    move/from16 v17, p4

    .line 552
    .line 553
    :goto_22
    if-eqz v20, :cond_2f

    .line 554
    .line 555
    int-to-float v1, v4

    .line 556
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    move/from16 v20, v1

    .line 561
    .line 562
    goto :goto_23

    .line 563
    :cond_2f
    move/from16 v20, v7

    .line 564
    .line 565
    :goto_23
    if-eqz v23, :cond_30

    .line 566
    .line 567
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 568
    .line 569
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    move-object v10, v1

    .line 574
    :cond_30
    and-int/lit16 v1, v11, 0x80

    .line 575
    .line 576
    if-eqz v1, :cond_31

    .line 577
    .line 578
    sget-object v1, Landroidx/compose/foundation/pager/PagerDefaults;->INSTANCE:Landroidx/compose/foundation/pager/PagerDefaults;

    .line 579
    .line 580
    const/4 v2, 0x0

    .line 581
    const/4 v3, 0x0

    .line 582
    const/4 v5, 0x0

    .line 583
    const/4 v7, 0x0

    .line 584
    const/4 v8, 0x0

    .line 585
    and-int/lit8 v9, v29, 0xe

    .line 586
    .line 587
    const/high16 v23, 0x200000

    .line 588
    .line 589
    or-int v9, v9, v23

    .line 590
    .line 591
    const/16 v23, 0x3e

    .line 592
    .line 593
    move/from16 v26, v0

    .line 594
    .line 595
    move-object v0, v1

    .line 596
    move-object/from16 v1, p0

    .line 597
    .line 598
    move/from16 v31, v4

    .line 599
    .line 600
    move-object v4, v5

    .line 601
    move-object v5, v7

    .line 602
    move/from16 v32, v6

    .line 603
    .line 604
    move v6, v8

    .line 605
    move-object v7, v12

    .line 606
    move v8, v9

    .line 607
    move/from16 v9, v23

    .line 608
    .line 609
    invoke-virtual/range {v0 .. v9}, Landroidx/compose/foundation/pager/PagerDefaults;->flingBehavior(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    const v1, -0x1c00001

    .line 614
    .line 615
    .line 616
    and-int v29, v29, v1

    .line 617
    .line 618
    goto :goto_24

    .line 619
    :cond_31
    move/from16 v26, v0

    .line 620
    .line 621
    move/from16 v31, v4

    .line 622
    .line 623
    move/from16 v32, v6

    .line 624
    .line 625
    move-object/from16 v0, p7

    .line 626
    .line 627
    :goto_24
    if-eqz v27, :cond_32

    .line 628
    .line 629
    const/4 v1, 0x1

    .line 630
    goto :goto_25

    .line 631
    :cond_32
    move/from16 v1, p8

    .line 632
    .line 633
    :goto_25
    if-eqz v28, :cond_33

    .line 634
    .line 635
    goto :goto_26

    .line 636
    :cond_33
    move/from16 v31, p9

    .line 637
    .line 638
    :goto_26
    if-eqz v30, :cond_34

    .line 639
    .line 640
    const/4 v2, 0x0

    .line 641
    goto :goto_27

    .line 642
    :cond_34
    move-object/from16 v2, p10

    .line 643
    .line 644
    :goto_27
    if-eqz v32, :cond_37

    .line 645
    .line 646
    const v3, 0x44faf204

    .line 647
    .line 648
    .line 649
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 650
    .line 651
    .line 652
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v3

    .line 656
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v4

    .line 660
    if-nez v3, :cond_35

    .line 661
    .line 662
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 663
    .line 664
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v3

    .line 668
    if-ne v4, v3, :cond_36

    .line 669
    .line 670
    :cond_35
    sget-object v3, Landroidx/compose/foundation/pager/PagerDefaults;->INSTANCE:Landroidx/compose/foundation/pager/PagerDefaults;

    .line 671
    .line 672
    sget-object v4, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 673
    .line 674
    invoke-virtual {v3, v15, v4}, Landroidx/compose/foundation/pager/PagerDefaults;->pageNestedScrollConnection(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 679
    .line 680
    .line 681
    :cond_36
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 682
    .line 683
    .line 684
    check-cast v4, Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    .line 685
    .line 686
    and-int/lit8 v3, v26, -0x71

    .line 687
    .line 688
    move-object/from16 v28, v0

    .line 689
    .line 690
    move-object/from16 v30, v2

    .line 691
    .line 692
    move v0, v3

    .line 693
    move-object/from16 v32, v4

    .line 694
    .line 695
    move-object/from16 v27, v10

    .line 696
    .line 697
    move/from16 v23, v17

    .line 698
    .line 699
    goto :goto_28

    .line 700
    :cond_37
    move-object/from16 v32, p11

    .line 701
    .line 702
    move-object/from16 v28, v0

    .line 703
    .line 704
    move-object/from16 v30, v2

    .line 705
    .line 706
    move-object/from16 v27, v10

    .line 707
    .line 708
    move/from16 v23, v17

    .line 709
    .line 710
    move/from16 v0, v26

    .line 711
    .line 712
    :goto_28
    move/from16 v26, v20

    .line 713
    .line 714
    move-object/from16 v20, v19

    .line 715
    .line 716
    move-object/from16 v19, v16

    .line 717
    .line 718
    move/from16 v35, v29

    .line 719
    .line 720
    move/from16 v29, v1

    .line 721
    .line 722
    move/from16 v1, v35

    .line 723
    .line 724
    :goto_29
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 725
    .line 726
    .line 727
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 728
    .line 729
    .line 730
    move-result v2

    .line 731
    if-eqz v2, :cond_38

    .line 732
    .line 733
    const-string v2, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:124)"

    .line 734
    .line 735
    const v3, 0x58e189a1

    .line 736
    .line 737
    .line 738
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 739
    .line 740
    .line 741
    :cond_38
    sget-object v4, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 742
    .line 743
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 744
    .line 745
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    move-object/from16 v25, v12

    .line 750
    .line 751
    move-object v12, v2

    .line 752
    shr-int/lit8 v2, v1, 0x3

    .line 753
    .line 754
    and-int/lit8 v2, v2, 0xe

    .line 755
    .line 756
    or-int/lit16 v2, v2, 0x6000

    .line 757
    .line 758
    shl-int/lit8 v3, v1, 0x3

    .line 759
    .line 760
    and-int/lit8 v3, v3, 0x70

    .line 761
    .line 762
    or-int/2addr v2, v3

    .line 763
    and-int/lit16 v3, v1, 0x380

    .line 764
    .line 765
    or-int/2addr v2, v3

    .line 766
    shr-int/lit8 v3, v1, 0x12

    .line 767
    .line 768
    and-int/lit16 v3, v3, 0x1c00

    .line 769
    .line 770
    or-int/2addr v2, v3

    .line 771
    shr-int/lit8 v3, v1, 0x6

    .line 772
    .line 773
    and-int v5, v3, v21

    .line 774
    .line 775
    or-int/2addr v2, v5

    .line 776
    and-int v3, v3, v24

    .line 777
    .line 778
    or-int/2addr v2, v3

    .line 779
    shl-int/lit8 v3, v1, 0x9

    .line 780
    .line 781
    const/high16 v5, 0x1c00000

    .line 782
    .line 783
    and-int/2addr v5, v3

    .line 784
    or-int/2addr v2, v5

    .line 785
    const/high16 v5, 0xe000000

    .line 786
    .line 787
    and-int/2addr v3, v5

    .line 788
    or-int/2addr v2, v3

    .line 789
    shl-int/lit8 v3, v1, 0x12

    .line 790
    .line 791
    const/high16 v5, 0x70000000

    .line 792
    .line 793
    and-int/2addr v3, v5

    .line 794
    or-int v16, v2, v3

    .line 795
    .line 796
    shl-int/lit8 v2, v0, 0x3

    .line 797
    .line 798
    and-int/lit8 v2, v2, 0x70

    .line 799
    .line 800
    or-int/lit16 v2, v2, 0x188

    .line 801
    .line 802
    shr-int/lit8 v1, v1, 0x9

    .line 803
    .line 804
    and-int/lit16 v1, v1, 0x1c00

    .line 805
    .line 806
    or-int/2addr v1, v2

    .line 807
    shl-int/lit8 v0, v0, 0x6

    .line 808
    .line 809
    and-int v0, v0, v18

    .line 810
    .line 811
    or-int v17, v1, v0

    .line 812
    .line 813
    const/16 v18, 0x0

    .line 814
    .line 815
    move-object/from16 v0, v19

    .line 816
    .line 817
    move-object/from16 v1, p0

    .line 818
    .line 819
    move-object/from16 v2, v20

    .line 820
    .line 821
    move/from16 v3, v31

    .line 822
    .line 823
    move-object/from16 v5, v28

    .line 824
    .line 825
    move/from16 v6, v29

    .line 826
    .line 827
    move/from16 v7, v23

    .line 828
    .line 829
    move/from16 v8, v26

    .line 830
    .line 831
    move-object/from16 v9, v22

    .line 832
    .line 833
    move-object/from16 v10, v32

    .line 834
    .line 835
    move-object/from16 v11, v30

    .line 836
    .line 837
    move-object/from16 v13, v27

    .line 838
    .line 839
    move-object/from16 v14, p12

    .line 840
    .line 841
    move-object/from16 v15, v25

    .line 842
    .line 843
    invoke-static/range {v0 .. v18}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt;->Pager-fs30GE4(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZIFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/l;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lv3/r;Landroidx/compose/runtime/Composer;III)V

    .line 844
    .line 845
    .line 846
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 847
    .line 848
    .line 849
    move-result v0

    .line 850
    if-eqz v0, :cond_39

    .line 851
    .line 852
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 853
    .line 854
    .line 855
    :cond_39
    move-object/from16 v2, v19

    .line 856
    .line 857
    move-object/from16 v3, v20

    .line 858
    .line 859
    move-object/from16 v4, v22

    .line 860
    .line 861
    move/from16 v5, v23

    .line 862
    .line 863
    move/from16 v6, v26

    .line 864
    .line 865
    move-object/from16 v7, v27

    .line 866
    .line 867
    move-object/from16 v8, v28

    .line 868
    .line 869
    move/from16 v9, v29

    .line 870
    .line 871
    move-object/from16 v11, v30

    .line 872
    .line 873
    move/from16 v10, v31

    .line 874
    .line 875
    move-object/from16 v12, v32

    .line 876
    .line 877
    :goto_2a
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 878
    .line 879
    .line 880
    move-result-object v15

    .line 881
    if-eqz v15, :cond_3a

    .line 882
    .line 883
    new-instance v14, Landroidx/compose/foundation/pager/PagerKt$HorizontalPager$2;

    .line 884
    .line 885
    move-object v0, v14

    .line 886
    move-object/from16 v1, p0

    .line 887
    .line 888
    move-object/from16 v13, p12

    .line 889
    .line 890
    move-object/from16 v33, v14

    .line 891
    .line 892
    move/from16 v14, p14

    .line 893
    .line 894
    move-object/from16 v34, v15

    .line 895
    .line 896
    move/from16 v15, p15

    .line 897
    .line 898
    move/from16 v16, p16

    .line 899
    .line 900
    invoke-direct/range {v0 .. v16}, Landroidx/compose/foundation/pager/PagerKt$HorizontalPager$2;-><init>(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLv3/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/r;III)V

    .line 901
    .line 902
    .line 903
    move-object/from16 v1, v33

    .line 904
    .line 905
    move-object/from16 v0, v34

    .line 906
    .line 907
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 908
    .line 909
    .line 910
    :cond_3a
    return-void
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
.end method

.method private static final SnapLayoutInfoProvider(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/DecayAnimationSpec;F)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/pager/PagerState;",
            "Landroidx/compose/foundation/pager/PagerSnapDistance;",
            "Landroidx/compose/animation/core/DecayAnimationSpec<",
            "Ljava/lang/Float;",
            ">;F)",
            "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;"
        }
    .end annotation

    new-instance v0, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;

    invoke-direct {v0, p0, p3, p2, p1}, Landroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1;-><init>(Landroidx/compose/foundation/pager/PagerState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/foundation/pager/PagerSnapDistance;)V

    return-object v0
.end method

.method public static final VerticalPager-xYaah8o(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLv3/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/r;Landroidx/compose/runtime/Composer;III)V
    .locals 36
    .param p0    # Landroidx/compose/foundation/pager/PagerState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/pager/PageSize;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/ui/Alignment$Horizontal;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p10    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p12    # Lv3/r;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/pager/PagerState;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/foundation/pager/PageSize;",
            "IF",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;",
            "ZZ",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
            "Lv3/r<",
            "-",
            "Landroidx/compose/foundation/pager/PagerScope;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    move/from16 v14, p14

    .line 4
    .line 5
    move/from16 v12, p15

    .line 6
    .line 7
    move/from16 v11, p16

    .line 8
    .line 9
    const v10, -0x56d91adf

    .line 10
    .line 11
    .line 12
    move-object/from16 v0, p13

    .line 13
    .line 14
    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v13

    .line 18
    and-int/lit8 v0, v11, 0x1

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    or-int/lit8 v0, v14, 0x6

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    and-int/lit8 v0, v14, 0xe

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v0, 0x2

    .line 38
    :goto_0
    or-int/2addr v0, v14

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v0, v14

    .line 41
    :goto_1
    and-int/lit8 v3, v11, 0x2

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    or-int/lit8 v0, v0, 0x30

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    and-int/lit8 v4, v14, 0x70

    .line 49
    .line 50
    if-nez v4, :cond_5

    .line 51
    .line 52
    move-object/from16 v4, p1

    .line 53
    .line 54
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_4

    .line 59
    .line 60
    const/16 v5, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    const/16 v5, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v0, v5

    .line 66
    goto :goto_4

    .line 67
    :cond_5
    :goto_3
    move-object/from16 v4, p1

    .line 68
    .line 69
    :goto_4
    and-int/lit8 v5, v11, 0x4

    .line 70
    .line 71
    if-eqz v5, :cond_6

    .line 72
    .line 73
    or-int/lit16 v0, v0, 0x180

    .line 74
    .line 75
    goto :goto_6

    .line 76
    :cond_6
    and-int/lit16 v8, v14, 0x380

    .line 77
    .line 78
    if-nez v8, :cond_8

    .line 79
    .line 80
    move-object/from16 v8, p2

    .line 81
    .line 82
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-eqz v9, :cond_7

    .line 87
    .line 88
    const/16 v9, 0x100

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_7
    const/16 v9, 0x80

    .line 92
    .line 93
    :goto_5
    or-int/2addr v0, v9

    .line 94
    goto :goto_7

    .line 95
    :cond_8
    :goto_6
    move-object/from16 v8, p2

    .line 96
    .line 97
    :goto_7
    and-int/lit8 v9, v11, 0x8

    .line 98
    .line 99
    if-eqz v9, :cond_9

    .line 100
    .line 101
    or-int/lit16 v0, v0, 0xc00

    .line 102
    .line 103
    goto :goto_9

    .line 104
    :cond_9
    and-int/lit16 v2, v14, 0x1c00

    .line 105
    .line 106
    if-nez v2, :cond_b

    .line 107
    .line 108
    move-object/from16 v2, p3

    .line 109
    .line 110
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v17

    .line 114
    if-eqz v17, :cond_a

    .line 115
    .line 116
    const/16 v17, 0x800

    .line 117
    .line 118
    goto :goto_8

    .line 119
    :cond_a
    const/16 v17, 0x400

    .line 120
    .line 121
    :goto_8
    or-int v0, v0, v17

    .line 122
    .line 123
    goto :goto_a

    .line 124
    :cond_b
    :goto_9
    move-object/from16 v2, p3

    .line 125
    .line 126
    :goto_a
    and-int/lit8 v17, v11, 0x10

    .line 127
    .line 128
    const v18, 0xe000

    .line 129
    .line 130
    .line 131
    if-eqz v17, :cond_c

    .line 132
    .line 133
    or-int/lit16 v0, v0, 0x6000

    .line 134
    .line 135
    move/from16 v6, p4

    .line 136
    .line 137
    goto :goto_c

    .line 138
    :cond_c
    and-int v19, v14, v18

    .line 139
    .line 140
    move/from16 v6, p4

    .line 141
    .line 142
    if-nez v19, :cond_e

    .line 143
    .line 144
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 145
    .line 146
    .line 147
    move-result v20

    .line 148
    if-eqz v20, :cond_d

    .line 149
    .line 150
    const/16 v20, 0x4000

    .line 151
    .line 152
    goto :goto_b

    .line 153
    :cond_d
    const/16 v20, 0x2000

    .line 154
    .line 155
    :goto_b
    or-int v0, v0, v20

    .line 156
    .line 157
    :cond_e
    :goto_c
    and-int/lit8 v20, v11, 0x20

    .line 158
    .line 159
    const/high16 v21, 0x70000

    .line 160
    .line 161
    if-eqz v20, :cond_f

    .line 162
    .line 163
    const/high16 v22, 0x30000

    .line 164
    .line 165
    or-int v0, v0, v22

    .line 166
    .line 167
    move/from16 v7, p5

    .line 168
    .line 169
    goto :goto_e

    .line 170
    :cond_f
    and-int v22, v14, v21

    .line 171
    .line 172
    move/from16 v7, p5

    .line 173
    .line 174
    if-nez v22, :cond_11

    .line 175
    .line 176
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 177
    .line 178
    .line 179
    move-result v23

    .line 180
    if-eqz v23, :cond_10

    .line 181
    .line 182
    const/high16 v23, 0x20000

    .line 183
    .line 184
    goto :goto_d

    .line 185
    :cond_10
    const/high16 v23, 0x10000

    .line 186
    .line 187
    :goto_d
    or-int v0, v0, v23

    .line 188
    .line 189
    :cond_11
    :goto_e
    and-int/lit8 v23, v11, 0x40

    .line 190
    .line 191
    const/high16 v24, 0x380000

    .line 192
    .line 193
    if-eqz v23, :cond_12

    .line 194
    .line 195
    const/high16 v25, 0x180000

    .line 196
    .line 197
    or-int v0, v0, v25

    .line 198
    .line 199
    move-object/from16 v10, p6

    .line 200
    .line 201
    goto :goto_10

    .line 202
    :cond_12
    and-int v25, v14, v24

    .line 203
    .line 204
    move-object/from16 v10, p6

    .line 205
    .line 206
    if-nez v25, :cond_14

    .line 207
    .line 208
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v26

    .line 212
    if-eqz v26, :cond_13

    .line 213
    .line 214
    const/high16 v26, 0x100000

    .line 215
    .line 216
    goto :goto_f

    .line 217
    :cond_13
    const/high16 v26, 0x80000

    .line 218
    .line 219
    :goto_f
    or-int v0, v0, v26

    .line 220
    .line 221
    :cond_14
    :goto_10
    const/high16 v26, 0x1c00000

    .line 222
    .line 223
    and-int v26, v14, v26

    .line 224
    .line 225
    if-nez v26, :cond_17

    .line 226
    .line 227
    and-int/lit16 v1, v11, 0x80

    .line 228
    .line 229
    if-nez v1, :cond_15

    .line 230
    .line 231
    move-object/from16 v1, p7

    .line 232
    .line 233
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v27

    .line 237
    if-eqz v27, :cond_16

    .line 238
    .line 239
    const/high16 v27, 0x800000

    .line 240
    .line 241
    goto :goto_11

    .line 242
    :cond_15
    move-object/from16 v1, p7

    .line 243
    .line 244
    :cond_16
    const/high16 v27, 0x400000

    .line 245
    .line 246
    :goto_11
    or-int v0, v0, v27

    .line 247
    .line 248
    goto :goto_12

    .line 249
    :cond_17
    move-object/from16 v1, p7

    .line 250
    .line 251
    :goto_12
    and-int/lit16 v6, v11, 0x100

    .line 252
    .line 253
    if-eqz v6, :cond_18

    .line 254
    .line 255
    const/high16 v27, 0x6000000

    .line 256
    .line 257
    or-int v0, v0, v27

    .line 258
    .line 259
    goto :goto_14

    .line 260
    :cond_18
    const/high16 v27, 0xe000000

    .line 261
    .line 262
    and-int v27, v14, v27

    .line 263
    .line 264
    if-nez v27, :cond_1a

    .line 265
    .line 266
    move/from16 v27, v6

    .line 267
    .line 268
    move/from16 v6, p8

    .line 269
    .line 270
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 271
    .line 272
    .line 273
    move-result v28

    .line 274
    if-eqz v28, :cond_19

    .line 275
    .line 276
    const/high16 v28, 0x4000000

    .line 277
    .line 278
    goto :goto_13

    .line 279
    :cond_19
    const/high16 v28, 0x2000000

    .line 280
    .line 281
    :goto_13
    or-int v0, v0, v28

    .line 282
    .line 283
    goto :goto_15

    .line 284
    :cond_1a
    :goto_14
    move/from16 v27, v6

    .line 285
    .line 286
    move/from16 v6, p8

    .line 287
    .line 288
    :goto_15
    and-int/lit16 v6, v11, 0x200

    .line 289
    .line 290
    if-eqz v6, :cond_1b

    .line 291
    .line 292
    const/high16 v28, 0x30000000

    .line 293
    .line 294
    or-int v0, v0, v28

    .line 295
    .line 296
    move/from16 v29, v0

    .line 297
    .line 298
    move/from16 v28, v6

    .line 299
    .line 300
    move/from16 v6, p9

    .line 301
    .line 302
    goto :goto_18

    .line 303
    :cond_1b
    const/high16 v28, 0x70000000

    .line 304
    .line 305
    and-int v28, v14, v28

    .line 306
    .line 307
    if-nez v28, :cond_1d

    .line 308
    .line 309
    move/from16 v28, v6

    .line 310
    .line 311
    move/from16 v6, p9

    .line 312
    .line 313
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 314
    .line 315
    .line 316
    move-result v29

    .line 317
    if-eqz v29, :cond_1c

    .line 318
    .line 319
    const/high16 v29, 0x20000000

    .line 320
    .line 321
    goto :goto_16

    .line 322
    :cond_1c
    const/high16 v29, 0x10000000

    .line 323
    .line 324
    :goto_16
    or-int v0, v0, v29

    .line 325
    .line 326
    goto :goto_17

    .line 327
    :cond_1d
    move/from16 v28, v6

    .line 328
    .line 329
    move/from16 v6, p9

    .line 330
    .line 331
    :goto_17
    move/from16 v29, v0

    .line 332
    .line 333
    :goto_18
    and-int/lit16 v0, v11, 0x400

    .line 334
    .line 335
    if-eqz v0, :cond_1e

    .line 336
    .line 337
    or-int/lit8 v16, v12, 0x6

    .line 338
    .line 339
    move-object/from16 v6, p10

    .line 340
    .line 341
    goto :goto_1a

    .line 342
    :cond_1e
    and-int/lit8 v30, v12, 0xe

    .line 343
    .line 344
    move-object/from16 v6, p10

    .line 345
    .line 346
    if-nez v30, :cond_20

    .line 347
    .line 348
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v30

    .line 352
    if-eqz v30, :cond_1f

    .line 353
    .line 354
    const/16 v16, 0x4

    .line 355
    .line 356
    goto :goto_19

    .line 357
    :cond_1f
    const/16 v16, 0x2

    .line 358
    .line 359
    :goto_19
    or-int v16, v12, v16

    .line 360
    .line 361
    goto :goto_1a

    .line 362
    :cond_20
    move/from16 v16, v12

    .line 363
    .line 364
    :goto_1a
    and-int/lit16 v6, v11, 0x800

    .line 365
    .line 366
    if-eqz v6, :cond_21

    .line 367
    .line 368
    or-int/lit8 v16, v16, 0x10

    .line 369
    .line 370
    :cond_21
    move/from16 v30, v0

    .line 371
    .line 372
    move/from16 v0, v16

    .line 373
    .line 374
    and-int/lit16 v1, v11, 0x1000

    .line 375
    .line 376
    if-eqz v1, :cond_22

    .line 377
    .line 378
    or-int/lit16 v0, v0, 0x180

    .line 379
    .line 380
    goto :goto_1c

    .line 381
    :cond_22
    and-int/lit16 v1, v12, 0x380

    .line 382
    .line 383
    if-nez v1, :cond_24

    .line 384
    .line 385
    move-object/from16 v1, p12

    .line 386
    .line 387
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v16

    .line 391
    if-eqz v16, :cond_23

    .line 392
    .line 393
    const/16 v19, 0x100

    .line 394
    .line 395
    goto :goto_1b

    .line 396
    :cond_23
    const/16 v19, 0x80

    .line 397
    .line 398
    :goto_1b
    or-int v0, v0, v19

    .line 399
    .line 400
    goto :goto_1c

    .line 401
    :cond_24
    move-object/from16 v1, p12

    .line 402
    .line 403
    :goto_1c
    const/16 v1, 0x800

    .line 404
    .line 405
    if-ne v6, v1, :cond_26

    .line 406
    .line 407
    const v1, 0x5b6db6db

    .line 408
    .line 409
    .line 410
    and-int v1, v29, v1

    .line 411
    .line 412
    const v2, 0x12492492

    .line 413
    .line 414
    .line 415
    if-ne v1, v2, :cond_26

    .line 416
    .line 417
    and-int/lit16 v1, v0, 0x2db

    .line 418
    .line 419
    const/16 v2, 0x92

    .line 420
    .line 421
    if-ne v1, v2, :cond_26

    .line 422
    .line 423
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    if-nez v1, :cond_25

    .line 428
    .line 429
    goto :goto_1d

    .line 430
    :cond_25
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 431
    .line 432
    .line 433
    move/from16 v5, p4

    .line 434
    .line 435
    move/from16 v9, p8

    .line 436
    .line 437
    move-object/from16 v11, p10

    .line 438
    .line 439
    move-object/from16 v12, p11

    .line 440
    .line 441
    move-object v2, v4

    .line 442
    move v6, v7

    .line 443
    move-object v3, v8

    .line 444
    move-object v7, v10

    .line 445
    move-object/from16 v25, v13

    .line 446
    .line 447
    move-object/from16 v4, p3

    .line 448
    .line 449
    move-object/from16 v8, p7

    .line 450
    .line 451
    move/from16 v10, p9

    .line 452
    .line 453
    goto/16 :goto_2a

    .line 454
    .line 455
    :cond_26
    :goto_1d
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 456
    .line 457
    .line 458
    and-int/lit8 v1, v14, 0x1

    .line 459
    .line 460
    if-eqz v1, :cond_2a

    .line 461
    .line 462
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    if-eqz v1, :cond_27

    .line 467
    .line 468
    goto :goto_1e

    .line 469
    :cond_27
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 470
    .line 471
    .line 472
    and-int/lit16 v1, v11, 0x80

    .line 473
    .line 474
    if-eqz v1, :cond_28

    .line 475
    .line 476
    const v1, -0x1c00001

    .line 477
    .line 478
    .line 479
    and-int v29, v29, v1

    .line 480
    .line 481
    :cond_28
    if-eqz v6, :cond_29

    .line 482
    .line 483
    and-int/lit8 v0, v0, -0x71

    .line 484
    .line 485
    :cond_29
    move-object/from16 v22, p3

    .line 486
    .line 487
    move/from16 v23, p4

    .line 488
    .line 489
    move-object/from16 v28, p7

    .line 490
    .line 491
    move/from16 v31, p9

    .line 492
    .line 493
    move-object/from16 v30, p10

    .line 494
    .line 495
    move-object/from16 v32, p11

    .line 496
    .line 497
    move-object/from16 v19, v4

    .line 498
    .line 499
    move/from16 v26, v7

    .line 500
    .line 501
    move-object/from16 v20, v8

    .line 502
    .line 503
    move-object/from16 v27, v10

    .line 504
    .line 505
    move/from16 v1, v29

    .line 506
    .line 507
    move/from16 v29, p8

    .line 508
    .line 509
    goto/16 :goto_29

    .line 510
    .line 511
    :cond_2a
    :goto_1e
    if-eqz v3, :cond_2b

    .line 512
    .line 513
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 514
    .line 515
    move-object/from16 v16, v1

    .line 516
    .line 517
    goto :goto_1f

    .line 518
    :cond_2b
    move-object/from16 v16, v4

    .line 519
    .line 520
    :goto_1f
    const/4 v4, 0x0

    .line 521
    if-eqz v5, :cond_2c

    .line 522
    .line 523
    int-to-float v1, v4

    .line 524
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    invoke-static {v1}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    move-object/from16 v19, v1

    .line 533
    .line 534
    goto :goto_20

    .line 535
    :cond_2c
    move-object/from16 v19, v8

    .line 536
    .line 537
    :goto_20
    if-eqz v9, :cond_2d

    .line 538
    .line 539
    sget-object v1, Landroidx/compose/foundation/pager/PageSize$Fill;->INSTANCE:Landroidx/compose/foundation/pager/PageSize$Fill;

    .line 540
    .line 541
    move-object/from16 v22, v1

    .line 542
    .line 543
    goto :goto_21

    .line 544
    :cond_2d
    move-object/from16 v22, p3

    .line 545
    .line 546
    :goto_21
    if-eqz v17, :cond_2e

    .line 547
    .line 548
    move/from16 v17, v4

    .line 549
    .line 550
    goto :goto_22

    .line 551
    :cond_2e
    move/from16 v17, p4

    .line 552
    .line 553
    :goto_22
    if-eqz v20, :cond_2f

    .line 554
    .line 555
    int-to-float v1, v4

    .line 556
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    move/from16 v20, v1

    .line 561
    .line 562
    goto :goto_23

    .line 563
    :cond_2f
    move/from16 v20, v7

    .line 564
    .line 565
    :goto_23
    if-eqz v23, :cond_30

    .line 566
    .line 567
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 568
    .line 569
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    move-object v10, v1

    .line 574
    :cond_30
    and-int/lit16 v1, v11, 0x80

    .line 575
    .line 576
    if-eqz v1, :cond_31

    .line 577
    .line 578
    sget-object v1, Landroidx/compose/foundation/pager/PagerDefaults;->INSTANCE:Landroidx/compose/foundation/pager/PagerDefaults;

    .line 579
    .line 580
    const/4 v2, 0x0

    .line 581
    const/4 v3, 0x0

    .line 582
    const/4 v5, 0x0

    .line 583
    const/4 v7, 0x0

    .line 584
    const/4 v8, 0x0

    .line 585
    and-int/lit8 v9, v29, 0xe

    .line 586
    .line 587
    const/high16 v23, 0x200000

    .line 588
    .line 589
    or-int v9, v9, v23

    .line 590
    .line 591
    const/16 v23, 0x3e

    .line 592
    .line 593
    move/from16 v26, v0

    .line 594
    .line 595
    move-object v0, v1

    .line 596
    move-object/from16 v1, p0

    .line 597
    .line 598
    move/from16 v31, v4

    .line 599
    .line 600
    move-object v4, v5

    .line 601
    move-object v5, v7

    .line 602
    move/from16 v32, v6

    .line 603
    .line 604
    move v6, v8

    .line 605
    move-object v7, v13

    .line 606
    move v8, v9

    .line 607
    move/from16 v9, v23

    .line 608
    .line 609
    invoke-virtual/range {v0 .. v9}, Landroidx/compose/foundation/pager/PagerDefaults;->flingBehavior(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    const v1, -0x1c00001

    .line 614
    .line 615
    .line 616
    and-int v29, v29, v1

    .line 617
    .line 618
    goto :goto_24

    .line 619
    :cond_31
    move/from16 v26, v0

    .line 620
    .line 621
    move/from16 v31, v4

    .line 622
    .line 623
    move/from16 v32, v6

    .line 624
    .line 625
    move-object/from16 v0, p7

    .line 626
    .line 627
    :goto_24
    if-eqz v27, :cond_32

    .line 628
    .line 629
    const/4 v1, 0x1

    .line 630
    goto :goto_25

    .line 631
    :cond_32
    move/from16 v1, p8

    .line 632
    .line 633
    :goto_25
    if-eqz v28, :cond_33

    .line 634
    .line 635
    goto :goto_26

    .line 636
    :cond_33
    move/from16 v31, p9

    .line 637
    .line 638
    :goto_26
    if-eqz v30, :cond_34

    .line 639
    .line 640
    const/4 v2, 0x0

    .line 641
    goto :goto_27

    .line 642
    :cond_34
    move-object/from16 v2, p10

    .line 643
    .line 644
    :goto_27
    if-eqz v32, :cond_37

    .line 645
    .line 646
    const v3, 0x44faf204

    .line 647
    .line 648
    .line 649
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 650
    .line 651
    .line 652
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v3

    .line 656
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v4

    .line 660
    if-nez v3, :cond_35

    .line 661
    .line 662
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 663
    .line 664
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v3

    .line 668
    if-ne v4, v3, :cond_36

    .line 669
    .line 670
    :cond_35
    sget-object v3, Landroidx/compose/foundation/pager/PagerDefaults;->INSTANCE:Landroidx/compose/foundation/pager/PagerDefaults;

    .line 671
    .line 672
    sget-object v4, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 673
    .line 674
    invoke-virtual {v3, v15, v4}, Landroidx/compose/foundation/pager/PagerDefaults;->pageNestedScrollConnection(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 679
    .line 680
    .line 681
    :cond_36
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 682
    .line 683
    .line 684
    check-cast v4, Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    .line 685
    .line 686
    and-int/lit8 v3, v26, -0x71

    .line 687
    .line 688
    move-object/from16 v28, v0

    .line 689
    .line 690
    move-object/from16 v30, v2

    .line 691
    .line 692
    move v0, v3

    .line 693
    move-object/from16 v32, v4

    .line 694
    .line 695
    move-object/from16 v27, v10

    .line 696
    .line 697
    move/from16 v23, v17

    .line 698
    .line 699
    goto :goto_28

    .line 700
    :cond_37
    move-object/from16 v32, p11

    .line 701
    .line 702
    move-object/from16 v28, v0

    .line 703
    .line 704
    move-object/from16 v30, v2

    .line 705
    .line 706
    move-object/from16 v27, v10

    .line 707
    .line 708
    move/from16 v23, v17

    .line 709
    .line 710
    move/from16 v0, v26

    .line 711
    .line 712
    :goto_28
    move/from16 v26, v20

    .line 713
    .line 714
    move-object/from16 v20, v19

    .line 715
    .line 716
    move-object/from16 v19, v16

    .line 717
    .line 718
    move/from16 v35, v29

    .line 719
    .line 720
    move/from16 v29, v1

    .line 721
    .line 722
    move/from16 v1, v35

    .line 723
    .line 724
    :goto_29
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 725
    .line 726
    .line 727
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 728
    .line 729
    .line 730
    move-result v2

    .line 731
    if-eqz v2, :cond_38

    .line 732
    .line 733
    const-string v2, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:204)"

    .line 734
    .line 735
    const v3, -0x56d91adf

    .line 736
    .line 737
    .line 738
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 739
    .line 740
    .line 741
    :cond_38
    sget-object v4, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 742
    .line 743
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 744
    .line 745
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    move-object/from16 v25, v13

    .line 750
    .line 751
    move-object v13, v2

    .line 752
    shr-int/lit8 v2, v1, 0x3

    .line 753
    .line 754
    and-int/lit8 v2, v2, 0xe

    .line 755
    .line 756
    or-int/lit16 v2, v2, 0x6000

    .line 757
    .line 758
    shl-int/lit8 v3, v1, 0x3

    .line 759
    .line 760
    and-int/lit8 v3, v3, 0x70

    .line 761
    .line 762
    or-int/2addr v2, v3

    .line 763
    and-int/lit16 v3, v1, 0x380

    .line 764
    .line 765
    or-int/2addr v2, v3

    .line 766
    shr-int/lit8 v3, v1, 0x12

    .line 767
    .line 768
    and-int/lit16 v3, v3, 0x1c00

    .line 769
    .line 770
    or-int/2addr v2, v3

    .line 771
    shr-int/lit8 v3, v1, 0x6

    .line 772
    .line 773
    and-int v5, v3, v21

    .line 774
    .line 775
    or-int/2addr v2, v5

    .line 776
    and-int v3, v3, v24

    .line 777
    .line 778
    or-int/2addr v2, v3

    .line 779
    shl-int/lit8 v3, v1, 0x9

    .line 780
    .line 781
    const/high16 v5, 0x1c00000

    .line 782
    .line 783
    and-int/2addr v5, v3

    .line 784
    or-int/2addr v2, v5

    .line 785
    const/high16 v5, 0xe000000

    .line 786
    .line 787
    and-int/2addr v3, v5

    .line 788
    or-int/2addr v2, v3

    .line 789
    shl-int/lit8 v3, v1, 0x12

    .line 790
    .line 791
    const/high16 v5, 0x70000000

    .line 792
    .line 793
    and-int/2addr v3, v5

    .line 794
    or-int v16, v2, v3

    .line 795
    .line 796
    shl-int/lit8 v2, v0, 0x3

    .line 797
    .line 798
    and-int/lit8 v2, v2, 0x70

    .line 799
    .line 800
    or-int/lit16 v2, v2, 0xc08

    .line 801
    .line 802
    shr-int/lit8 v1, v1, 0xc

    .line 803
    .line 804
    and-int/lit16 v1, v1, 0x380

    .line 805
    .line 806
    or-int/2addr v1, v2

    .line 807
    shl-int/lit8 v0, v0, 0x6

    .line 808
    .line 809
    and-int v0, v0, v18

    .line 810
    .line 811
    or-int v17, v1, v0

    .line 812
    .line 813
    const/16 v18, 0x0

    .line 814
    .line 815
    move-object/from16 v0, v19

    .line 816
    .line 817
    move-object/from16 v1, p0

    .line 818
    .line 819
    move-object/from16 v2, v20

    .line 820
    .line 821
    move/from16 v3, v31

    .line 822
    .line 823
    move-object/from16 v5, v28

    .line 824
    .line 825
    move/from16 v6, v29

    .line 826
    .line 827
    move/from16 v7, v23

    .line 828
    .line 829
    move/from16 v8, v26

    .line 830
    .line 831
    move-object/from16 v9, v22

    .line 832
    .line 833
    move-object/from16 v10, v32

    .line 834
    .line 835
    move-object/from16 v11, v30

    .line 836
    .line 837
    move-object/from16 v12, v27

    .line 838
    .line 839
    move-object/from16 v14, p12

    .line 840
    .line 841
    move-object/from16 v15, v25

    .line 842
    .line 843
    invoke-static/range {v0 .. v18}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt;->Pager-fs30GE4(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZIFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/l;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lv3/r;Landroidx/compose/runtime/Composer;III)V

    .line 844
    .line 845
    .line 846
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 847
    .line 848
    .line 849
    move-result v0

    .line 850
    if-eqz v0, :cond_39

    .line 851
    .line 852
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 853
    .line 854
    .line 855
    :cond_39
    move-object/from16 v2, v19

    .line 856
    .line 857
    move-object/from16 v3, v20

    .line 858
    .line 859
    move-object/from16 v4, v22

    .line 860
    .line 861
    move/from16 v5, v23

    .line 862
    .line 863
    move/from16 v6, v26

    .line 864
    .line 865
    move-object/from16 v7, v27

    .line 866
    .line 867
    move-object/from16 v8, v28

    .line 868
    .line 869
    move/from16 v9, v29

    .line 870
    .line 871
    move-object/from16 v11, v30

    .line 872
    .line 873
    move/from16 v10, v31

    .line 874
    .line 875
    move-object/from16 v12, v32

    .line 876
    .line 877
    :goto_2a
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 878
    .line 879
    .line 880
    move-result-object v15

    .line 881
    if-eqz v15, :cond_3a

    .line 882
    .line 883
    new-instance v14, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;

    .line 884
    .line 885
    move-object v0, v14

    .line 886
    move-object/from16 v1, p0

    .line 887
    .line 888
    move-object/from16 v13, p12

    .line 889
    .line 890
    move-object/from16 v33, v14

    .line 891
    .line 892
    move/from16 v14, p14

    .line 893
    .line 894
    move-object/from16 v34, v15

    .line 895
    .line 896
    move/from16 v15, p15

    .line 897
    .line 898
    move/from16 v16, p16

    .line 899
    .line 900
    invoke-direct/range {v0 .. v16}, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$2;-><init>(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLv3/l;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/r;III)V

    .line 901
    .line 902
    .line 903
    move-object/from16 v1, v33

    .line 904
    .line 905
    move-object/from16 v0, v34

    .line 906
    .line 907
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 908
    .line 909
    .line 910
    :cond_3a
    return-void
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
.end method

.method public static final synthetic access$SnapLayoutInfoProvider(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/DecayAnimationSpec;F)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/pager/PagerKt;->SnapLayoutInfoProvider(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/DecayAnimationSpec;F)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$dragGestureDelta(Landroidx/compose/foundation/pager/PagerState;)F
    .locals 0

    invoke-static {p0}, Landroidx/compose/foundation/pager/PagerKt;->dragGestureDelta(Landroidx/compose/foundation/pager/PagerState;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$isScrollingForward(Landroidx/compose/foundation/pager/PagerState;)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/foundation/pager/PagerKt;->isScrollingForward(Landroidx/compose/foundation/pager/PagerState;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$pagerSemantics$performBackwardPaging(Landroidx/compose/foundation/pager/PagerState;Lkotlinx/coroutines/s0;)Z
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/foundation/pager/PagerKt;->pagerSemantics$performBackwardPaging(Landroidx/compose/foundation/pager/PagerState;Lkotlinx/coroutines/s0;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$pagerSemantics$performForwardPaging(Landroidx/compose/foundation/pager/PagerState;Lkotlinx/coroutines/s0;)Z
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/foundation/pager/PagerKt;->pagerSemantics$performForwardPaging(Landroidx/compose/foundation/pager/PagerState;Lkotlinx/coroutines/s0;)Z

    move-result p0

    return p0
.end method

.method private static final debugLog(Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method private static final dragGestureDelta(Landroidx/compose/foundation/pager/PagerState;)F
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getOrientation()Landroidx/compose/foundation/gestures/Orientation;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getUpDownDifference-F1C5BW0$foundation_release()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getUpDownDifference-F1C5BW0$foundation_release()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    :goto_0
    return p0
    .line 31
    .line 32
.end method

.method private static final isScrollingForward(Landroidx/compose/foundation/pager/PagerState;)Z
    .locals 1

    invoke-static {p0}, Landroidx/compose/foundation/pager/PagerKt;->dragGestureDelta(Landroidx/compose/foundation/pager/PagerState;)F

    move-result p0

    const/4 v0, 0x0

    cmpg-float p0, p0, v0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final pagerSemantics(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 3
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/pager/PagerState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const v0, 0x59fe4150

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:914)"

    .line 15
    .line 16
    invoke-static {v0, p4, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const p4, 0x2e20b340

    .line 20
    .line 21
    .line 22
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 23
    .line 24
    .line 25
    const p4, -0x1d58f75c

    .line 26
    .line 27
    .line 28
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-ne p4, v0, :cond_1

    .line 42
    .line 43
    sget-object p4, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 44
    .line 45
    invoke-static {p4, p3}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/s0;

    .line 46
    .line 47
    .line 48
    move-result-object p4

    .line 49
    new-instance v0, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 50
    .line 51
    invoke-direct {v0, p4}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/s0;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object p4, v0

    .line 58
    :cond_1
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 59
    .line 60
    .line 61
    check-cast p4, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 62
    .line 63
    invoke-virtual {p4}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 68
    .line 69
    .line 70
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 71
    .line 72
    new-instance v1, Landroidx/compose/foundation/pager/PagerKt$pagerSemantics$1;

    .line 73
    .line 74
    invoke-direct {v1, p2, p1, p4}, Landroidx/compose/foundation/pager/PagerKt$pagerSemantics$1;-><init>(ZLandroidx/compose/foundation/pager/PagerState;Lkotlinx/coroutines/s0;)V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x1

    .line 78
    const/4 p2, 0x0

    .line 79
    const/4 p4, 0x0

    .line 80
    invoke-static {v0, p4, v1, p1, p2}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 95
    .line 96
    .line 97
    :cond_2
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 98
    .line 99
    .line 100
    return-object p0
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
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

.method private static final pagerSemantics$performBackwardPaging(Landroidx/compose/foundation/pager/PagerState;Lkotlinx/coroutines/s0;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getCanScrollBackward()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    new-instance v4, Landroidx/compose/foundation/pager/PagerKt$pagerSemantics$performBackwardPaging$1;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {v4, p0, v0}, Landroidx/compose/foundation/pager/PagerKt$pagerSemantics$performBackwardPaging$1;-><init>(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/d;)V

    .line 13
    .line 14
    .line 15
    const/4 v5, 0x3

    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v1, p1

    .line 18
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    :goto_0
    return p0
    .line 25
    .line 26
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
.end method

.method private static final pagerSemantics$performForwardPaging(Landroidx/compose/foundation/pager/PagerState;Lkotlinx/coroutines/s0;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getCanScrollForward()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    new-instance v4, Landroidx/compose/foundation/pager/PagerKt$pagerSemantics$performForwardPaging$1;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {v4, p0, v0}, Landroidx/compose/foundation/pager/PagerKt$pagerSemantics$performForwardPaging$1;-><init>(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/d;)V

    .line 13
    .line 14
    .line 15
    const/4 v5, 0x3

    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v1, p1

    .line 18
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    :goto_0
    return p0
    .line 25
    .line 26
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
.end method
