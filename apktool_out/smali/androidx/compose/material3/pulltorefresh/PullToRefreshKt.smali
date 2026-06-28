.class public final Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a]\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0019\u0008\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0008\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\nH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a,\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00132\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0007\u001a(\u0010 \u001a\u00020\u00052\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u001d\u001a\u00020\nH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a>\u0010*\u001a\u00020\u0005*\u00020!2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u0010H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008(\u0010)\u001a\u0010\u0010+\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002\u001aF\u00101\u001a\u00020\u0005*\u00020!2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0006\u0010\'\u001a\u00020\u0010H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008/\u00100\"\u0014\u00102\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00082\u00103\"\u0014\u00105\u001a\u0002048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00085\u00106\"\u0014\u00107\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00103\"\u0014\u00108\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00103\"\u001a\u00109\u001a\u00020\u00108\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00089\u00103\u001a\u0004\u0008:\u0010;\"\u001a\u0010<\u001a\u00020\u00108\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008<\u00103\u001a\u0004\u0008=\u0010;\"\u0014\u0010>\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u00103\"\u0014\u0010?\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u00103\"\u0014\u0010@\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u00103\"\u0014\u0010A\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008A\u00103\"\u0014\u0010B\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008B\u00103\"\u001a\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u00180C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010E\"\u0014\u0010F\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008F\u00103\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006H\u00b2\u0006\u000c\u0010G\u001a\u00020\u00188\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "indicator",
        "Landroidx/compose/ui/graphics/Shape;",
        "shape",
        "Landroidx/compose/ui/graphics/Color;",
        "containerColor",
        "contentColor",
        "PullToRefreshContainer-wBJOh4Y",
        "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Modifier;Lv3/q;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V",
        "PullToRefreshContainer",
        "Landroidx/compose/ui/unit/Dp;",
        "positionalThreshold",
        "Lkotlin/Function0;",
        "",
        "enabled",
        "rememberPullToRefreshState--orJrPs",
        "(FLv3/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;",
        "rememberPullToRefreshState",
        "",
        "positionalThresholdPx",
        "initialRefreshing",
        "PullToRefreshState",
        "progress",
        "color",
        "CircularArrowProgressIndicator-RPmYEkk",
        "(Lv3/a;JLandroidx/compose/runtime/Composer;I)V",
        "CircularArrowProgressIndicator",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "alpha",
        "Landroidx/compose/material3/pulltorefresh/ArrowValues;",
        "values",
        "Landroidx/compose/ui/geometry/Rect;",
        "arcBounds",
        "strokeWidth",
        "drawCircularIndicator-KzyDr3Q",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V",
        "drawCircularIndicator",
        "ArrowValues",
        "Landroidx/compose/ui/graphics/Path;",
        "arrow",
        "bounds",
        "drawArrow-uDrxG_w",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V",
        "drawArrow",
        "MaxProgressArc",
        "F",
        "",
        "CrossfadeDurationMs",
        "I",
        "StrokeWidth",
        "ArcRadius",
        "SpinnerSize",
        "getSpinnerSize",
        "()F",
        "SpinnerContainerSize",
        "getSpinnerContainerSize",
        "Elevation",
        "ArrowWidth",
        "ArrowHeight",
        "MinAlpha",
        "MaxAlpha",
        "Landroidx/compose/animation/core/TweenSpec;",
        "AlphaTween",
        "Landroidx/compose/animation/core/TweenSpec;",
        "DragMultiplier",
        "targetAlpha",
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
        "SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,558:1\n1116#2,6:559\n1116#2,6:567\n1116#2,6:573\n1116#2,6:579\n1116#2,6:585\n1116#2,6:591\n74#3:565\n1#4:566\n137#5,5:597\n262#5,11:602\n81#6:613\n164#7:614\n164#7:615\n154#7:616\n154#7:617\n154#7:618\n154#7:619\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n*L\n119#1:559,6\n262#1:567,6\n429#1:573,6\n431#1:579,6\n437#1:585,6\n442#1:591,6\n254#1:565\n529#1:597,5\n529#1:602,11\n431#1:613\n538#1:614\n539#1:615\n540#1:616\n541#1:617\n543#1:618\n544#1:619\n*E\n"
    }
.end annotation


# static fields
.field private static final AlphaTween:Landroidx/compose/animation/core/TweenSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/TweenSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final ArcRadius:F

.field private static final ArrowHeight:F

.field private static final ArrowWidth:F

.field private static final CrossfadeDurationMs:I = 0x64

.field private static final DragMultiplier:F = 0.5f

.field private static final Elevation:F

.field private static final MaxAlpha:F = 1.0f

.field private static final MaxProgressArc:F = 0.8f

.field private static final MinAlpha:F = 0.3f

.field private static final SpinnerContainerSize:F

.field private static final SpinnerSize:F

.field private static final StrokeWidth:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    .line 2
    .line 3
    double-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->StrokeWidth:F

    .line 9
    .line 10
    const-wide/high16 v0, 0x4016000000000000L    # 5.5

    .line 11
    .line 12
    double-to-float v0, v0

    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sput v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->ArcRadius:F

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
    sput v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->SpinnerSize:F

    .line 27
    .line 28
    const/16 v0, 0x28

    .line 29
    .line 30
    int-to-float v0, v0

    .line 31
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    sput v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->SpinnerContainerSize:F

    .line 36
    .line 37
    sget-object v0, Landroidx/compose/material3/tokens/ElevationTokens;->INSTANCE:Landroidx/compose/material3/tokens/ElevationTokens;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/ElevationTokens;->getLevel2-D9Ej5fM()F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    sput v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->Elevation:F

    .line 44
    .line 45
    const/16 v0, 0xa

    .line 46
    .line 47
    int-to-float v0, v0

    .line 48
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    sput v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->ArrowWidth:F

    .line 53
    .line 54
    const/4 v0, 0x5

    .line 55
    int-to-float v0, v0

    .line 56
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    sput v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->ArrowHeight:F

    .line 61
    .line 62
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getLinearEasing()Landroidx/compose/animation/core/Easing;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const/4 v1, 0x2

    .line 67
    const/4 v2, 0x0

    .line 68
    const/16 v3, 0x12c

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-static {v3, v4, v0, v1, v2}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->AlphaTween:Landroidx/compose/animation/core/TweenSpec;

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

.method private static final ArrowValues(F)Landroidx/compose/material3/pulltorefresh/ArrowValues;
    .locals 7

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0x3ecccccd    # 0.4f

    .line 8
    .line 9
    .line 10
    sub-float/2addr v1, v2

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v4, 0x5

    .line 17
    int-to-float v4, v4

    .line 18
    mul-float/2addr v1, v4

    .line 19
    const/4 v4, 0x3

    .line 20
    int-to-float v4, v4

    .line 21
    div-float/2addr v1, v4

    .line 22
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    sub-float/2addr p0, v0

    .line 27
    const/high16 v4, 0x40000000    # 2.0f

    .line 28
    .line 29
    invoke-static {p0, v3, v4}, Lkotlin/ranges/s;->H(FFF)F

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    float-to-double v3, p0

    .line 34
    const/4 v5, 0x2

    .line 35
    int-to-double v5, v5

    .line 36
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    double-to-float v3, v3

    .line 41
    const/4 v4, 0x4

    .line 42
    int-to-float v4, v4

    .line 43
    div-float/2addr v3, v4

    .line 44
    sub-float/2addr p0, v3

    .line 45
    const v3, 0x3f4ccccd    # 0.8f

    .line 46
    .line 47
    .line 48
    mul-float/2addr v3, v1

    .line 49
    const/high16 v4, -0x41800000    # -0.25f

    .line 50
    .line 51
    mul-float/2addr v2, v1

    .line 52
    add-float/2addr v2, v4

    .line 53
    add-float/2addr v2, p0

    .line 54
    const/high16 p0, 0x3f000000    # 0.5f

    .line 55
    .line 56
    mul-float/2addr v2, p0

    .line 57
    const/16 p0, 0x168

    .line 58
    .line 59
    int-to-float p0, p0

    .line 60
    mul-float v4, v2, p0

    .line 61
    .line 62
    add-float/2addr v3, v2

    .line 63
    mul-float/2addr v3, p0

    .line 64
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    new-instance v0, Landroidx/compose/material3/pulltorefresh/ArrowValues;

    .line 69
    .line 70
    invoke-direct {v0, v2, v4, v3, p0}, Landroidx/compose/material3/pulltorefresh/ArrowValues;-><init>(FFFF)V

    .line 71
    .line 72
    .line 73
    return-object v0
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
.end method

.method private static final CircularArrowProgressIndicator-RPmYEkk(Lv3/a;JLandroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Ljava/lang/Float;",
            ">;J",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-wide/from16 v7, p1

    .line 4
    .line 5
    move/from16 v9, p4

    .line 6
    .line 7
    const v0, -0x21f5381a    # -2.5000536E18f

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p3

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    and-int/lit8 v1, v9, 0x6

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    move v1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v1, 0x2

    .line 30
    :goto_0
    or-int/2addr v1, v9

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v1, v9

    .line 33
    :goto_1
    and-int/lit8 v3, v9, 0x30

    .line 34
    .line 35
    const/16 v4, 0x20

    .line 36
    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    invoke-interface {v5, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    move v3, v4

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v3, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v1, v3

    .line 50
    :cond_3
    and-int/lit8 v3, v1, 0x13

    .line 51
    .line 52
    const/16 v10, 0x12

    .line 53
    .line 54
    if-ne v3, v10, :cond_5

    .line 55
    .line 56
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_4

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 64
    .line 65
    .line 66
    move-object v10, v5

    .line 67
    goto/16 :goto_9

    .line 68
    .line 69
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_6

    .line 74
    .line 75
    const/4 v3, -0x1

    .line 76
    const-string v10, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:427)"

    .line 77
    .line 78
    invoke-static {v0, v1, v3, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_6
    const v0, -0x271aed6a

    .line 82
    .line 83
    .line 84
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 92
    .line 93
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    if-ne v0, v10, :cond_7

    .line 98
    .line 99
    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sget-object v10, Landroidx/compose/ui/graphics/PathFillType;->Companion:Landroidx/compose/ui/graphics/PathFillType$Companion;

    .line 104
    .line 105
    invoke-virtual {v10}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    invoke-interface {v0, v10}, Landroidx/compose/ui/graphics/Path;->setFillType-oQ8Xj4U(I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_7
    check-cast v0, Landroidx/compose/ui/graphics/Path;

    .line 116
    .line 117
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 118
    .line 119
    .line 120
    const v10, -0x271aecc8

    .line 121
    .line 122
    .line 123
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    if-ne v10, v11, :cond_8

    .line 135
    .line 136
    new-instance v10, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1;

    .line 137
    .line 138
    invoke-direct {v10, v6}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1;-><init>(Lv3/a;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v10}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lv3/a;)Landroidx/compose/runtime/State;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_8
    check-cast v10, Landroidx/compose/runtime/State;

    .line 149
    .line 150
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 151
    .line 152
    .line 153
    invoke-static {v10}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->CircularArrowProgressIndicator_RPmYEkk$lambda$6(Landroidx/compose/runtime/State;)F

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    sget-object v11, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->AlphaTween:Landroidx/compose/animation/core/TweenSpec;

    .line 158
    .line 159
    const/4 v12, 0x0

    .line 160
    const/4 v13, 0x0

    .line 161
    const/4 v14, 0x0

    .line 162
    const/16 v16, 0x30

    .line 163
    .line 164
    const/16 v17, 0x1c

    .line 165
    .line 166
    move-object v15, v5

    .line 167
    invoke-static/range {v10 .. v17}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateFloatAsState(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 172
    .line 173
    const v12, -0x271aebc2    # -2.01500082E15f

    .line 174
    .line 175
    .line 176
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 177
    .line 178
    .line 179
    and-int/lit8 v12, v1, 0xe

    .line 180
    .line 181
    const/4 v14, 0x1

    .line 182
    if-ne v12, v2, :cond_9

    .line 183
    .line 184
    move v15, v14

    .line 185
    goto :goto_4

    .line 186
    :cond_9
    const/4 v15, 0x0

    .line 187
    :goto_4
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v13

    .line 191
    if-nez v15, :cond_a

    .line 192
    .line 193
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v15

    .line 197
    if-ne v13, v15, :cond_b

    .line 198
    .line 199
    :cond_a
    new-instance v13, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$CircularArrowProgressIndicator$1$1;

    .line 200
    .line 201
    invoke-direct {v13, v6}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$CircularArrowProgressIndicator$1$1;-><init>(Lv3/a;)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :cond_b
    check-cast v13, Lv3/l;

    .line 208
    .line 209
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 210
    .line 211
    .line 212
    invoke-static {v11, v14, v13}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics(Landroidx/compose/ui/Modifier;ZLv3/l;)Landroidx/compose/ui/Modifier;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    sget v13, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->SpinnerSize:F

    .line 217
    .line 218
    invoke-static {v11, v13}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    const v13, -0x271aeb26

    .line 223
    .line 224
    .line 225
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 226
    .line 227
    .line 228
    if-ne v12, v2, :cond_c

    .line 229
    .line 230
    move v2, v14

    .line 231
    goto :goto_5

    .line 232
    :cond_c
    const/4 v2, 0x0

    .line 233
    :goto_5
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v12

    .line 237
    or-int/2addr v2, v12

    .line 238
    and-int/lit8 v1, v1, 0x70

    .line 239
    .line 240
    if-ne v1, v4, :cond_d

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_d
    const/4 v14, 0x0

    .line 244
    :goto_6
    or-int v1, v2, v14

    .line 245
    .line 246
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    or-int/2addr v1, v2

    .line 251
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    if-nez v1, :cond_f

    .line 256
    .line 257
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    if-ne v2, v1, :cond_e

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_e
    move-object v10, v5

    .line 265
    goto :goto_8

    .line 266
    :cond_f
    :goto_7
    new-instance v12, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$CircularArrowProgressIndicator$2$1;

    .line 267
    .line 268
    move-object v13, v0

    .line 269
    move-object v0, v12

    .line 270
    move-object/from16 v1, p0

    .line 271
    .line 272
    move-object v2, v10

    .line 273
    move-wide/from16 v3, p1

    .line 274
    .line 275
    move-object v10, v5

    .line 276
    move-object v5, v13

    .line 277
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$CircularArrowProgressIndicator$2$1;-><init>(Lv3/a;Landroidx/compose/runtime/State;JLandroidx/compose/ui/graphics/Path;)V

    .line 278
    .line 279
    .line 280
    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    move-object v2, v12

    .line 284
    :goto_8
    check-cast v2, Lv3/l;

    .line 285
    .line 286
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 287
    .line 288
    .line 289
    const/4 v0, 0x0

    .line 290
    invoke-static {v11, v2, v10, v0}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 291
    .line 292
    .line 293
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-eqz v0, :cond_10

    .line 298
    .line 299
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 300
    .line 301
    .line 302
    :cond_10
    :goto_9
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    if-eqz v0, :cond_11

    .line 307
    .line 308
    new-instance v1, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$CircularArrowProgressIndicator$3;

    .line 309
    .line 310
    invoke-direct {v1, v6, v7, v8, v9}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$CircularArrowProgressIndicator$3;-><init>(Lv3/a;JI)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 314
    .line 315
    .line 316
    :cond_11
    return-void
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

.method private static final CircularArrowProgressIndicator_RPmYEkk$lambda$6(Landroidx/compose/runtime/State;)F
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

.method public static final PullToRefreshContainer-wBJOh4Y(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Modifier;Lv3/q;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V
    .locals 17
    .param p0    # Landroidx/compose/material3/pulltorefresh/PullToRefreshState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lv3/q;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;",
            "Landroidx/compose/ui/Modifier;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJ",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v9, p9

    .line 4
    .line 5
    const v0, -0x2fcd327e    # -1.19992504E10f

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p8

    .line 9
    .line 10
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    and-int/lit8 v3, p10, 0x1

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    or-int/lit8 v3, v9, 0x6

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    and-int/lit8 v3, v9, 0x6

    .line 22
    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v3, 0x2

    .line 34
    :goto_0
    or-int/2addr v3, v9

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v3, v9

    .line 37
    :goto_1
    and-int/lit8 v4, p10, 0x2

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    or-int/lit8 v3, v3, 0x30

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    and-int/lit8 v5, v9, 0x30

    .line 45
    .line 46
    if-nez v5, :cond_5

    .line 47
    .line 48
    move-object/from16 v5, p1

    .line 49
    .line 50
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_4

    .line 55
    .line 56
    const/16 v6, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    const/16 v6, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v3, v6

    .line 62
    goto :goto_4

    .line 63
    :cond_5
    :goto_3
    move-object/from16 v5, p1

    .line 64
    .line 65
    :goto_4
    and-int/lit8 v6, p10, 0x4

    .line 66
    .line 67
    if-eqz v6, :cond_6

    .line 68
    .line 69
    or-int/lit16 v3, v3, 0x180

    .line 70
    .line 71
    goto :goto_6

    .line 72
    :cond_6
    and-int/lit16 v7, v9, 0x180

    .line 73
    .line 74
    if-nez v7, :cond_8

    .line 75
    .line 76
    move-object/from16 v7, p2

    .line 77
    .line 78
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-eqz v8, :cond_7

    .line 83
    .line 84
    const/16 v8, 0x100

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_7
    const/16 v8, 0x80

    .line 88
    .line 89
    :goto_5
    or-int/2addr v3, v8

    .line 90
    goto :goto_7

    .line 91
    :cond_8
    :goto_6
    move-object/from16 v7, p2

    .line 92
    .line 93
    :goto_7
    and-int/lit8 v8, p10, 0x8

    .line 94
    .line 95
    if-eqz v8, :cond_9

    .line 96
    .line 97
    or-int/lit16 v3, v3, 0xc00

    .line 98
    .line 99
    goto :goto_9

    .line 100
    :cond_9
    and-int/lit16 v10, v9, 0xc00

    .line 101
    .line 102
    if-nez v10, :cond_b

    .line 103
    .line 104
    move-object/from16 v10, p3

    .line 105
    .line 106
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    if-eqz v11, :cond_a

    .line 111
    .line 112
    const/16 v11, 0x800

    .line 113
    .line 114
    goto :goto_8

    .line 115
    :cond_a
    const/16 v11, 0x400

    .line 116
    .line 117
    :goto_8
    or-int/2addr v3, v11

    .line 118
    goto :goto_a

    .line 119
    :cond_b
    :goto_9
    move-object/from16 v10, p3

    .line 120
    .line 121
    :goto_a
    and-int/lit16 v11, v9, 0x6000

    .line 122
    .line 123
    if-nez v11, :cond_e

    .line 124
    .line 125
    and-int/lit8 v11, p10, 0x10

    .line 126
    .line 127
    if-nez v11, :cond_c

    .line 128
    .line 129
    move-wide/from16 v11, p4

    .line 130
    .line 131
    invoke-interface {v2, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    if-eqz v13, :cond_d

    .line 136
    .line 137
    const/16 v13, 0x4000

    .line 138
    .line 139
    goto :goto_b

    .line 140
    :cond_c
    move-wide/from16 v11, p4

    .line 141
    .line 142
    :cond_d
    const/16 v13, 0x2000

    .line 143
    .line 144
    :goto_b
    or-int/2addr v3, v13

    .line 145
    goto :goto_c

    .line 146
    :cond_e
    move-wide/from16 v11, p4

    .line 147
    .line 148
    :goto_c
    const/high16 v13, 0x30000

    .line 149
    .line 150
    and-int/2addr v13, v9

    .line 151
    if-nez v13, :cond_11

    .line 152
    .line 153
    and-int/lit8 v13, p10, 0x20

    .line 154
    .line 155
    if-nez v13, :cond_f

    .line 156
    .line 157
    move-wide/from16 v13, p6

    .line 158
    .line 159
    invoke-interface {v2, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 160
    .line 161
    .line 162
    move-result v15

    .line 163
    if-eqz v15, :cond_10

    .line 164
    .line 165
    const/high16 v15, 0x20000

    .line 166
    .line 167
    goto :goto_d

    .line 168
    :cond_f
    move-wide/from16 v13, p6

    .line 169
    .line 170
    :cond_10
    const/high16 v15, 0x10000

    .line 171
    .line 172
    :goto_d
    or-int/2addr v3, v15

    .line 173
    goto :goto_e

    .line 174
    :cond_11
    move-wide/from16 v13, p6

    .line 175
    .line 176
    :goto_e
    const v15, 0x12493

    .line 177
    .line 178
    .line 179
    and-int/2addr v15, v3

    .line 180
    const v0, 0x12492

    .line 181
    .line 182
    .line 183
    if-ne v15, v0, :cond_14

    .line 184
    .line 185
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_12

    .line 190
    .line 191
    goto :goto_10

    .line 192
    :cond_12
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 193
    .line 194
    .line 195
    :cond_13
    :goto_f
    move-object v3, v7

    .line 196
    move-object v4, v10

    .line 197
    move-wide v7, v13

    .line 198
    goto/16 :goto_14

    .line 199
    .line 200
    :cond_14
    :goto_10
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 201
    .line 202
    .line 203
    and-int/lit8 v0, v9, 0x1

    .line 204
    .line 205
    const v15, -0x70001

    .line 206
    .line 207
    .line 208
    const v16, -0xe001

    .line 209
    .line 210
    .line 211
    if-eqz v0, :cond_17

    .line 212
    .line 213
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_15

    .line 218
    .line 219
    goto :goto_12

    .line 220
    :cond_15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 221
    .line 222
    .line 223
    and-int/lit8 v0, p10, 0x10

    .line 224
    .line 225
    if-eqz v0, :cond_16

    .line 226
    .line 227
    and-int v3, v3, v16

    .line 228
    .line 229
    :cond_16
    and-int/lit8 v0, p10, 0x20

    .line 230
    .line 231
    if-eqz v0, :cond_1c

    .line 232
    .line 233
    :goto_11
    and-int/2addr v3, v15

    .line 234
    goto :goto_13

    .line 235
    :cond_17
    :goto_12
    if-eqz v4, :cond_18

    .line 236
    .line 237
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 238
    .line 239
    move-object v5, v0

    .line 240
    :cond_18
    if-eqz v6, :cond_19

    .line 241
    .line 242
    sget-object v0, Landroidx/compose/material3/pulltorefresh/ComposableSingletons$PullToRefreshKt;->INSTANCE:Landroidx/compose/material3/pulltorefresh/ComposableSingletons$PullToRefreshKt;

    .line 243
    .line 244
    invoke-virtual {v0}, Landroidx/compose/material3/pulltorefresh/ComposableSingletons$PullToRefreshKt;->getLambda-1$material3_release()Lv3/q;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    move-object v7, v0

    .line 249
    :cond_19
    if-eqz v8, :cond_1a

    .line 250
    .line 251
    sget-object v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;->INSTANCE:Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;

    .line 252
    .line 253
    invoke-virtual {v0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;->getShape()Landroidx/compose/ui/graphics/Shape;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    move-object v10, v0

    .line 258
    :cond_1a
    and-int/lit8 v0, p10, 0x10

    .line 259
    .line 260
    const/4 v4, 0x6

    .line 261
    if-eqz v0, :cond_1b

    .line 262
    .line 263
    sget-object v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;->INSTANCE:Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;

    .line 264
    .line 265
    invoke-virtual {v0, v2, v4}, Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 266
    .line 267
    .line 268
    move-result-wide v11

    .line 269
    and-int v3, v3, v16

    .line 270
    .line 271
    :cond_1b
    and-int/lit8 v0, p10, 0x20

    .line 272
    .line 273
    if-eqz v0, :cond_1c

    .line 274
    .line 275
    sget-object v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;->INSTANCE:Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;

    .line 276
    .line 277
    invoke-virtual {v0, v2, v4}, Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;->getContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 278
    .line 279
    .line 280
    move-result-wide v13

    .line 281
    goto :goto_11

    .line 282
    :cond_1c
    :goto_13
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 283
    .line 284
    .line 285
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_1d

    .line 290
    .line 291
    const/4 v0, -0x1

    .line 292
    const-string v4, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)"

    .line 293
    .line 294
    const v6, -0x2fcd327e    # -1.19992504E10f

    .line 295
    .line 296
    .line 297
    invoke-static {v6, v3, v0, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 298
    .line 299
    .line 300
    :cond_1d
    const v0, 0x2cc7cbea

    .line 301
    .line 302
    .line 303
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 304
    .line 305
    .line 306
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 311
    .line 312
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    if-ne v0, v3, :cond_1e

    .line 317
    .line 318
    new-instance v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$PullToRefreshContainer$showElevation$1$1;

    .line 319
    .line 320
    invoke-direct {v0, v1}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$PullToRefreshContainer$showElevation$1$1;-><init>(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;)V

    .line 321
    .line 322
    .line 323
    invoke-static {v0}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lv3/a;)Landroidx/compose/runtime/State;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    :cond_1e
    check-cast v0, Landroidx/compose/runtime/State;

    .line 331
    .line 332
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 333
    .line 334
    .line 335
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-static {v13, v14}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    new-instance v4, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$PullToRefreshContainer$1;

    .line 348
    .line 349
    move-object/from16 p1, v4

    .line 350
    .line 351
    move-object/from16 p2, v5

    .line 352
    .line 353
    move-object/from16 p3, p0

    .line 354
    .line 355
    move-object/from16 p4, v0

    .line 356
    .line 357
    move-object/from16 p5, v10

    .line 358
    .line 359
    move-wide/from16 p6, v11

    .line 360
    .line 361
    move-object/from16 p8, v7

    .line 362
    .line 363
    invoke-direct/range {p1 .. p8}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$PullToRefreshContainer$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/runtime/State;Landroidx/compose/ui/graphics/Shape;JLv3/q;)V

    .line 364
    .line 365
    .line 366
    const v0, 0x37c370c2

    .line 367
    .line 368
    .line 369
    const/4 v6, 0x1

    .line 370
    invoke-static {v2, v0, v6, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    sget v4, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    .line 375
    .line 376
    or-int/lit8 v4, v4, 0x0

    .line 377
    .line 378
    or-int/lit8 v4, v4, 0x30

    .line 379
    .line 380
    invoke-static {v3, v0, v2, v4}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 381
    .line 382
    .line 383
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-eqz v0, :cond_13

    .line 388
    .line 389
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 390
    .line 391
    .line 392
    goto/16 :goto_f

    .line 393
    .line 394
    :goto_14
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 395
    .line 396
    .line 397
    move-result-object v13

    .line 398
    if-eqz v13, :cond_1f

    .line 399
    .line 400
    new-instance v14, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$PullToRefreshContainer$2;

    .line 401
    .line 402
    move-object v0, v14

    .line 403
    move-object/from16 v1, p0

    .line 404
    .line 405
    move-object v2, v5

    .line 406
    move-wide v5, v11

    .line 407
    move/from16 v9, p9

    .line 408
    .line 409
    move/from16 v10, p10

    .line 410
    .line 411
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$PullToRefreshContainer$2;-><init>(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Modifier;Lv3/q;Landroidx/compose/ui/graphics/Shape;JJII)V

    .line 412
    .line 413
    .line 414
    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 415
    .line 416
    .line 417
    :cond_1f
    return-void
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

.method public static final PullToRefreshState(FZLv3/a;)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;
    .locals 1
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FZ",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;

    invoke-direct {v0, p1, p0, p2}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;-><init>(ZFLv3/a;)V

    return-object v0
.end method

.method public static synthetic PullToRefreshState$default(FZLv3/a;ILjava/lang/Object;)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x4

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    sget-object p2, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$PullToRefreshState$1;->INSTANCE:Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$PullToRefreshState$1;

    .line 11
    .line 12
    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->PullToRefreshState(FZLv3/a;)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
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

.method public static final synthetic access$ArrowValues(F)Landroidx/compose/material3/pulltorefresh/ArrowValues;
    .locals 0

    invoke-static {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->ArrowValues(F)Landroidx/compose/material3/pulltorefresh/ArrowValues;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$CircularArrowProgressIndicator-RPmYEkk(Lv3/a;JLandroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->CircularArrowProgressIndicator-RPmYEkk(Lv3/a;JLandroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$drawArrow-uDrxG_w(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V
    .locals 0

    invoke-static/range {p0 .. p7}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->drawArrow-uDrxG_w(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V

    return-void
.end method

.method public static final synthetic access$drawCircularIndicator-KzyDr3Q(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->drawCircularIndicator-KzyDr3Q(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V

    return-void
.end method

.method public static final synthetic access$getArcRadius$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->ArcRadius:F

    return v0
.end method

.method public static final synthetic access$getElevation$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->Elevation:F

    return v0
.end method

.method public static final synthetic access$getStrokeWidth$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->StrokeWidth:F

    return v0
.end method

.method private static final drawArrow-uDrxG_w(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p7

    .line 6
    .line 7
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/Path;->reset()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-interface {v1, v3, v3}, Landroidx/compose/ui/graphics/Path;->moveTo(FF)V

    .line 12
    .line 13
    .line 14
    sget v4, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->ArrowWidth:F

    .line 15
    .line 16
    invoke-interface {v0, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material3/pulltorefresh/ArrowValues;->getScale()F

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    mul-float/2addr v5, v6

    .line 25
    const/4 v6, 0x2

    .line 26
    int-to-float v6, v6

    .line 27
    div-float/2addr v5, v6

    .line 28
    sget v6, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->ArrowHeight:F

    .line 29
    .line 30
    invoke-interface {v0, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material3/pulltorefresh/ArrowValues;->getScale()F

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    mul-float/2addr v6, v7

    .line 39
    invoke-interface {v1, v5, v6}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material3/pulltorefresh/ArrowValues;->getScale()F

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    mul-float/2addr v5, v6

    .line 51
    invoke-interface {v1, v5, v3}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/geometry/Rect;->getWidth()F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/geometry/Rect;->getHeight()F

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/high16 v5, 0x40000000    # 2.0f

    .line 67
    .line 68
    div-float/2addr v3, v5

    .line 69
    invoke-interface {v0, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material3/pulltorefresh/ArrowValues;->getScale()F

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    mul-float/2addr v4, v6

    .line 78
    div-float/2addr v4, v5

    .line 79
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/geometry/Rect;->getCenter-F1C5BW0()J

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    add-float/2addr v3, v5

    .line 88
    sub-float/2addr v3, v4

    .line 89
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/geometry/Rect;->getCenter-F1C5BW0()J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    invoke-interface {v0, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    sub-float/2addr v4, v5

    .line 102
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    invoke-interface {v1, v3, v4}, Landroidx/compose/ui/graphics/Path;->translate-k-4lQ0M(J)V

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material3/pulltorefresh/ArrowValues;->getEndAngle()F

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-interface {v0, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    sub-float/2addr v3, v4

    .line 118
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-interface {v10}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getSize-NH-jbRc()J

    .line 127
    .line 128
    .line 129
    move-result-wide v11

    .line 130
    invoke-interface {v10}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-interface {v6}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 135
    .line 136
    .line 137
    invoke-interface {v10}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-interface {v6, v3, v4, v5}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->rotate-Uv8p0NA(FJ)V

    .line 142
    .line 143
    .line 144
    new-instance v5, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 145
    .line 146
    invoke-interface {v0, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    const/4 v15, 0x0

    .line 151
    const/16 v16, 0x0

    .line 152
    .line 153
    const/16 v17, 0x0

    .line 154
    .line 155
    const/16 v18, 0x0

    .line 156
    .line 157
    const/16 v19, 0x1e

    .line 158
    .line 159
    const/16 v20, 0x0

    .line 160
    .line 161
    move-object v13, v5

    .line 162
    invoke-direct/range {v13 .. v20}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/w;)V

    .line 163
    .line 164
    .line 165
    const/4 v6, 0x0

    .line 166
    const/4 v7, 0x0

    .line 167
    const/16 v8, 0x30

    .line 168
    .line 169
    const/4 v9, 0x0

    .line 170
    move-wide/from16 v2, p3

    .line 171
    .line 172
    move/from16 v4, p5

    .line 173
    .line 174
    invoke-static/range {v0 .. v9}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawPath-LG529CI$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v10}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-interface {v0}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 182
    .line 183
    .line 184
    invoke-interface {v10, v11, v12}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 185
    .line 186
    .line 187
    return-void
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
.end method

.method private static final drawCircularIndicator-KzyDr3Q(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V
    .locals 19

    .line 1
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/material3/pulltorefresh/ArrowValues;->getStartAngle()F

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/material3/pulltorefresh/ArrowValues;->getEndAngle()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/material3/pulltorefresh/ArrowValues;->getStartAngle()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-float v4, v0, v1

    .line 14
    .line 15
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    .line 16
    .line 17
    .line 18
    move-result-wide v6

    .line 19
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/ui/geometry/Rect;->getSize-NH-jbRc()J

    .line 20
    .line 21
    .line 22
    move-result-wide v8

    .line 23
    new-instance v18, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 24
    .line 25
    move-object/from16 v0, p0

    .line 26
    .line 27
    move/from16 v1, p6

    .line 28
    .line 29
    invoke-interface {v0, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 30
    .line 31
    .line 32
    move-result v11

    .line 33
    const/4 v12, 0x0

    .line 34
    sget-object v1, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 37
    .line 38
    .line 39
    move-result v13

    .line 40
    const/4 v14, 0x0

    .line 41
    const/4 v15, 0x0

    .line 42
    const/16 v16, 0x1a

    .line 43
    .line 44
    const/16 v17, 0x0

    .line 45
    .line 46
    move-object/from16 v10, v18

    .line 47
    .line 48
    invoke-direct/range {v10 .. v17}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/w;)V

    .line 49
    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v12, 0x0

    .line 53
    const/4 v13, 0x0

    .line 54
    const/16 v14, 0x300

    .line 55
    .line 56
    move-wide/from16 v1, p1

    .line 57
    .line 58
    move/from16 v10, p3

    .line 59
    .line 60
    move-object/from16 v11, v18

    .line 61
    .line 62
    invoke-static/range {v0 .. v15}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawArc-yD3GUKo$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void
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

.method public static final getSpinnerContainerSize()F
    .locals 1

    sget v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->SpinnerContainerSize:F

    return v0
.end method

.method public static final getSpinnerSize()F
    .locals 1

    sget v0, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->SpinnerSize:F

    return v0
.end method

.method public static final rememberPullToRefreshState--orJrPs(FLv3/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;
    .locals 9
    .param p1    # Lv3/a;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const v0, 0x73590316

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    and-int/lit8 v1, p4, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;->INSTANCE:Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;->getPositionalThreshold-D9Ej5fM()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    :cond_0
    const/4 v1, 0x2

    .line 18
    and-int/2addr p4, v1

    .line 19
    if-eqz p4, :cond_1

    .line 20
    .line 21
    sget-object p1, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$rememberPullToRefreshState$1;->INSTANCE:Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$rememberPullToRefreshState$1;

    .line 22
    .line 23
    :cond_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 24
    .line 25
    .line 26
    move-result p4

    .line 27
    if-eqz p4, :cond_2

    .line 28
    .line 29
    const/4 p4, -0x1

    .line 30
    const-string v2, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:252)"

    .line 31
    .line 32
    invoke-static {v0, p3, p4, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 36
    .line 37
    .line 38
    move-result-object p4

    .line 39
    invoke-interface {p2, p4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p4

    .line 43
    check-cast p4, Landroidx/compose/ui/unit/Density;

    .line 44
    .line 45
    invoke-interface {p4, p0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    new-array v2, v1, [Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 52
    .line 53
    .line 54
    move-result-object p4

    .line 55
    const/4 v0, 0x0

    .line 56
    aput-object p4, v2, v0

    .line 57
    .line 58
    const/4 p4, 0x1

    .line 59
    aput-object p1, v2, p4

    .line 60
    .line 61
    sget-object v1, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;->Companion:Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;

    .line 62
    .line 63
    invoke-virtual {v1, p0, p1}, Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;->Saver(FLv3/a;)Landroidx/compose/runtime/saveable/Saver;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const/4 v4, 0x0

    .line 68
    const v1, 0x2ff964e7

    .line 69
    .line 70
    .line 71
    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    and-int/lit8 v5, p3, 0x70

    .line 79
    .line 80
    xor-int/lit8 v5, v5, 0x30

    .line 81
    .line 82
    const/16 v6, 0x20

    .line 83
    .line 84
    if-le v5, v6, :cond_3

    .line 85
    .line 86
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_4

    .line 91
    .line 92
    :cond_3
    and-int/lit8 p3, p3, 0x30

    .line 93
    .line 94
    if-ne p3, v6, :cond_5

    .line 95
    .line 96
    :cond_4
    move v0, p4

    .line 97
    :cond_5
    or-int p3, v1, v0

    .line 98
    .line 99
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    if-nez p3, :cond_6

    .line 104
    .line 105
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 106
    .line 107
    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    if-ne p4, p3, :cond_7

    .line 112
    .line 113
    :cond_6
    new-instance p4, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$rememberPullToRefreshState$2$1;

    .line 114
    .line 115
    invoke-direct {p4, p0, p1}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt$rememberPullToRefreshState$2$1;-><init>(FLv3/a;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p2, p4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_7
    move-object v5, p4

    .line 122
    check-cast v5, Lv3/a;

    .line 123
    .line 124
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 125
    .line 126
    .line 127
    const/4 v7, 0x0

    .line 128
    const/4 v8, 0x4

    .line 129
    move-object v6, p2

    .line 130
    invoke-static/range {v2 .. v8}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    check-cast p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshState;

    .line 135
    .line 136
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_8

    .line 141
    .line 142
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 143
    .line 144
    .line 145
    :cond_8
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 146
    .line 147
    .line 148
    return-object p0
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
