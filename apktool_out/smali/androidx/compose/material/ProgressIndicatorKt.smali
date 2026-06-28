.class public final Landroidx/compose/material/ProgressIndicatorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u001a\u000c\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u001aD\u0010\r\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a:\u0010\r\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a8\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a0\u0010\r\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a>\u0010\u001a\u001a\u00020\n*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a.\u0010\u001d\u001a\u00020\n*\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001aN\u0010!\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 \u001aD\u0010!\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\"\u0010#\u001a8\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u001eH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008$\u0010%\u001a0\u0010!\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u001eH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008&\u0010\'\u001a6\u0010.\u001a\u00020\n*\u00020\u00142\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008,\u0010-\u001a&\u00101\u001a\u00020\n*\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008/\u00100\u001a6\u00103\u001a\u00020\n*\u00020\u00142\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u00082\u0010-\u001a>\u00106\u001a\u00020\n*\u00020\u00142\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u00084\u00105\"\u0014\u00107\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108\"\u0014\u00109\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u00108\"\u0014\u0010:\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u00108\"\u0014\u0010<\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008<\u0010=\"\u0014\u0010>\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008>\u0010=\"\u0014\u0010?\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008?\u0010=\"\u0014\u0010@\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008@\u0010=\"\u0014\u0010A\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008A\u0010=\"\u0014\u0010B\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008B\u0010=\"\u0014\u0010C\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008C\u0010=\"\u0014\u0010D\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008D\u0010=\"\u0014\u0010E\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008E\u0010=\"\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010H\"\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010H\"\u0014\u0010J\u001a\u00020F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010H\"\u0014\u0010K\u001a\u00020F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010H\"\u0014\u0010L\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008L\u0010=\"\u0014\u0010M\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008M\u0010=\"\u0014\u0010N\u001a\u00020\u00028\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008N\u00108\"\u0014\u0010O\u001a\u00020\u00028\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008O\u00108\"\u0014\u0010P\u001a\u00020\u00028\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008P\u00108\"\u0014\u0010Q\u001a\u00020\u00028\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008Q\u00108\"\u0014\u0010R\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008R\u0010=\"\u0014\u0010S\u001a\u00020;8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008S\u0010=\"\u0014\u0010T\u001a\u00020F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008T\u0010H\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\\\u00b2\u0006\u000c\u0010U\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010V\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010W\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010X\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010Y\u001a\u00020;8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010Z\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010[\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010(\u001a\u00020\u00028\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "increaseSemanticsBounds",
        "",
        "progress",
        "modifier",
        "Landroidx/compose/ui/graphics/Color;",
        "color",
        "backgroundColor",
        "Landroidx/compose/ui/graphics/StrokeCap;",
        "strokeCap",
        "Lkotlin/r2;",
        "LinearProgressIndicator-_5eSR-E",
        "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V",
        "LinearProgressIndicator",
        "LinearProgressIndicator-2cYBFYY",
        "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V",
        "LinearProgressIndicator-eaDK9VM",
        "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V",
        "LinearProgressIndicator-RIQooxk",
        "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "startFraction",
        "endFraction",
        "strokeWidth",
        "drawLinearIndicator-qYKTg0g",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V",
        "drawLinearIndicator",
        "drawLinearIndicatorBackground-AZGd3zU",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V",
        "drawLinearIndicatorBackground",
        "Landroidx/compose/ui/unit/Dp;",
        "CircularProgressIndicator-DUhRLBM",
        "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V",
        "CircularProgressIndicator",
        "CircularProgressIndicator-LxG7B9w",
        "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V",
        "CircularProgressIndicator-MBs18nI",
        "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V",
        "CircularProgressIndicator-aM-cp0Q",
        "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V",
        "startAngle",
        "sweep",
        "Landroidx/compose/ui/graphics/drawscope/Stroke;",
        "stroke",
        "drawCircularIndicator-42QJj7c",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V",
        "drawCircularIndicator",
        "drawCircularIndicatorBackground-bw27NRU",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V",
        "drawCircularIndicatorBackground",
        "drawDeterminateCircularIndicator-42QJj7c",
        "drawDeterminateCircularIndicator",
        "drawIndeterminateCircularIndicator-hrjfTZI",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V",
        "drawIndeterminateCircularIndicator",
        "LinearIndicatorHeight",
        "F",
        "LinearIndicatorWidth",
        "CircularIndicatorDiameter",
        "",
        "LinearAnimationDuration",
        "I",
        "FirstLineHeadDuration",
        "FirstLineTailDuration",
        "SecondLineHeadDuration",
        "SecondLineTailDuration",
        "FirstLineHeadDelay",
        "FirstLineTailDelay",
        "SecondLineHeadDelay",
        "SecondLineTailDelay",
        "Landroidx/compose/animation/core/CubicBezierEasing;",
        "FirstLineHeadEasing",
        "Landroidx/compose/animation/core/CubicBezierEasing;",
        "FirstLineTailEasing",
        "SecondLineHeadEasing",
        "SecondLineTailEasing",
        "RotationsPerCycle",
        "RotationDuration",
        "StartAngleOffset",
        "BaseRotationAngle",
        "JumpRotationAngle",
        "RotationAngleOffset",
        "HeadAndTailAnimationDuration",
        "HeadAndTailDelayDuration",
        "CircularEasing",
        "firstLineHead",
        "firstLineTail",
        "secondLineHead",
        "secondLineTail",
        "currentRotation",
        "baseRotation",
        "endAngle",
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
        "SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,619:1\n154#2:620\n154#2:650\n154#2:651\n1116#3,6:621\n1116#3,6:627\n74#4:633\n74#4:634\n75#5,7:635\n81#6:642\n81#6:643\n81#6:644\n81#6:645\n81#6:646\n81#6:647\n81#6:648\n81#6:649\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n*L\n57#1:620\n562#1:650\n566#1:651\n117#1:621,6\n197#1:627,6\n328#1:633\n366#1:634\n544#1:635,7\n148#1:642\n159#1:643\n170#1:644\n181#1:645\n372#1:646\n384#1:647\n395#1:648\n407#1:649\n*E\n"
    }
.end annotation


# static fields
.field private static final BaseRotationAngle:F = 286.0f

.field private static final CircularEasing:Landroidx/compose/animation/core/CubicBezierEasing;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final CircularIndicatorDiameter:F

.field private static final FirstLineHeadDelay:I = 0x0

.field private static final FirstLineHeadDuration:I = 0x2ee

.field private static final FirstLineHeadEasing:Landroidx/compose/animation/core/CubicBezierEasing;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final FirstLineTailDelay:I = 0x14d

.field private static final FirstLineTailDuration:I = 0x352

.field private static final FirstLineTailEasing:Landroidx/compose/animation/core/CubicBezierEasing;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final HeadAndTailAnimationDuration:I = 0x29a

.field private static final HeadAndTailDelayDuration:I = 0x29a

.field private static final JumpRotationAngle:F = 290.0f

.field private static final LinearAnimationDuration:I = 0x708

.field private static final LinearIndicatorHeight:F

.field private static final LinearIndicatorWidth:F

.field private static final RotationAngleOffset:F = 216.0f

.field private static final RotationDuration:I = 0x534

.field private static final RotationsPerCycle:I = 0x5

.field private static final SecondLineHeadDelay:I = 0x3e8

.field private static final SecondLineHeadDuration:I = 0x237

.field private static final SecondLineHeadEasing:Landroidx/compose/animation/core/CubicBezierEasing;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final SecondLineTailDelay:I = 0x4f3

.field private static final SecondLineTailDuration:I = 0x215

.field private static final SecondLineTailEasing:Landroidx/compose/animation/core/CubicBezierEasing;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final StartAngleOffset:F = -90.0f


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, Landroidx/compose/material/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material/ProgressIndicatorDefaults;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/material/ProgressIndicatorDefaults;->getStrokeWidth-D9Ej5fM()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Landroidx/compose/material/ProgressIndicatorKt;->LinearIndicatorHeight:F

    .line 8
    .line 9
    const/16 v0, 0xf0

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sput v0, Landroidx/compose/material/ProgressIndicatorKt;->LinearIndicatorWidth:F

    .line 17
    .line 18
    const/16 v0, 0x28

    .line 19
    .line 20
    int-to-float v0, v0

    .line 21
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sput v0, Landroidx/compose/material/ProgressIndicatorKt;->CircularIndicatorDiameter:F

    .line 26
    .line 27
    new-instance v0, Landroidx/compose/animation/core/CubicBezierEasing;

    .line 28
    .line 29
    const v1, 0x3e4ccccd    # 0.2f

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const v3, 0x3f4ccccd    # 0.8f

    .line 34
    .line 35
    .line 36
    const/high16 v4, 0x3f800000    # 1.0f

    .line 37
    .line 38
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Landroidx/compose/material/ProgressIndicatorKt;->FirstLineHeadEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 42
    .line 43
    new-instance v0, Landroidx/compose/animation/core/CubicBezierEasing;

    .line 44
    .line 45
    const v3, 0x3ecccccd    # 0.4f

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v3, v2, v4, v4}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Landroidx/compose/material/ProgressIndicatorKt;->FirstLineTailEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 52
    .line 53
    new-instance v0, Landroidx/compose/animation/core/CubicBezierEasing;

    .line 54
    .line 55
    const v5, 0x3f266666    # 0.65f

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v2, v2, v5, v4}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Landroidx/compose/material/ProgressIndicatorKt;->SecondLineHeadEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 62
    .line 63
    new-instance v0, Landroidx/compose/animation/core/CubicBezierEasing;

    .line 64
    .line 65
    const v5, 0x3dcccccd    # 0.1f

    .line 66
    .line 67
    .line 68
    const v6, 0x3ee66666    # 0.45f

    .line 69
    .line 70
    .line 71
    invoke-direct {v0, v5, v2, v6, v4}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Landroidx/compose/material/ProgressIndicatorKt;->SecondLineTailEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 75
    .line 76
    new-instance v0, Landroidx/compose/animation/core/CubicBezierEasing;

    .line 77
    .line 78
    invoke-direct {v0, v3, v2, v1, v4}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    .line 79
    .line 80
    .line 81
    sput-object v0, Landroidx/compose/material/ProgressIndicatorKt;->CircularEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 82
    .line 83
    return-void
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

.method public static final CircularProgressIndicator-DUhRLBM(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V
    .locals 18
    .param p0    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move/from16 v9, p9

    .line 4
    .line 5
    const v0, 0x681b4850

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
    and-int/lit8 v3, v9, 0xe

    .line 22
    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(F)Z

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
    and-int/lit8 v5, v9, 0x70

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
    and-int/lit16 v6, v9, 0x380

    .line 66
    .line 67
    if-nez v6, :cond_8

    .line 68
    .line 69
    and-int/lit8 v6, p10, 0x4

    .line 70
    .line 71
    if-nez v6, :cond_6

    .line 72
    .line 73
    move-wide/from16 v6, p2

    .line 74
    .line 75
    invoke-interface {v2, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

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
    goto :goto_5

    .line 84
    :cond_6
    move-wide/from16 v6, p2

    .line 85
    .line 86
    :cond_7
    const/16 v8, 0x80

    .line 87
    .line 88
    :goto_5
    or-int/2addr v3, v8

    .line 89
    goto :goto_6

    .line 90
    :cond_8
    move-wide/from16 v6, p2

    .line 91
    .line 92
    :goto_6
    and-int/lit8 v8, p10, 0x8

    .line 93
    .line 94
    if-eqz v8, :cond_9

    .line 95
    .line 96
    or-int/lit16 v3, v3, 0xc00

    .line 97
    .line 98
    goto :goto_8

    .line 99
    :cond_9
    and-int/lit16 v10, v9, 0x1c00

    .line 100
    .line 101
    if-nez v10, :cond_b

    .line 102
    .line 103
    move/from16 v10, p4

    .line 104
    .line 105
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    if-eqz v11, :cond_a

    .line 110
    .line 111
    const/16 v11, 0x800

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_a
    const/16 v11, 0x400

    .line 115
    .line 116
    :goto_7
    or-int/2addr v3, v11

    .line 117
    goto :goto_9

    .line 118
    :cond_b
    :goto_8
    move/from16 v10, p4

    .line 119
    .line 120
    :goto_9
    and-int/lit8 v11, p10, 0x10

    .line 121
    .line 122
    if-eqz v11, :cond_c

    .line 123
    .line 124
    or-int/lit16 v3, v3, 0x6000

    .line 125
    .line 126
    goto :goto_b

    .line 127
    :cond_c
    const v12, 0xe000

    .line 128
    .line 129
    .line 130
    and-int/2addr v12, v9

    .line 131
    if-nez v12, :cond_e

    .line 132
    .line 133
    move-wide/from16 v12, p5

    .line 134
    .line 135
    invoke-interface {v2, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

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
    :cond_d
    const/16 v14, 0x2000

    .line 145
    .line 146
    :goto_a
    or-int/2addr v3, v14

    .line 147
    goto :goto_c

    .line 148
    :cond_e
    :goto_b
    move-wide/from16 v12, p5

    .line 149
    .line 150
    :goto_c
    const/high16 v14, 0x70000

    .line 151
    .line 152
    and-int/2addr v14, v9

    .line 153
    if-nez v14, :cond_11

    .line 154
    .line 155
    and-int/lit8 v14, p10, 0x20

    .line 156
    .line 157
    if-nez v14, :cond_f

    .line 158
    .line 159
    move/from16 v14, p7

    .line 160
    .line 161
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 162
    .line 163
    .line 164
    move-result v15

    .line 165
    if-eqz v15, :cond_10

    .line 166
    .line 167
    const/high16 v15, 0x20000

    .line 168
    .line 169
    goto :goto_d

    .line 170
    :cond_f
    move/from16 v14, p7

    .line 171
    .line 172
    :cond_10
    const/high16 v15, 0x10000

    .line 173
    .line 174
    :goto_d
    or-int/2addr v3, v15

    .line 175
    goto :goto_e

    .line 176
    :cond_11
    move/from16 v14, p7

    .line 177
    .line 178
    :goto_e
    const v15, 0x5b6db

    .line 179
    .line 180
    .line 181
    and-int/2addr v15, v3

    .line 182
    const v0, 0x12492

    .line 183
    .line 184
    .line 185
    if-ne v15, v0, :cond_13

    .line 186
    .line 187
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-nez v0, :cond_12

    .line 192
    .line 193
    goto :goto_10

    .line 194
    :cond_12
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 195
    .line 196
    .line 197
    move-wide v3, v6

    .line 198
    move-wide v6, v12

    .line 199
    :goto_f
    move v8, v14

    .line 200
    goto/16 :goto_14

    .line 201
    .line 202
    :cond_13
    :goto_10
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 203
    .line 204
    .line 205
    and-int/lit8 v0, v9, 0x1

    .line 206
    .line 207
    const v15, -0x70001

    .line 208
    .line 209
    .line 210
    if-eqz v0, :cond_17

    .line 211
    .line 212
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_14

    .line 217
    .line 218
    goto :goto_11

    .line 219
    :cond_14
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 220
    .line 221
    .line 222
    and-int/lit8 v0, p10, 0x4

    .line 223
    .line 224
    if-eqz v0, :cond_15

    .line 225
    .line 226
    and-int/lit16 v3, v3, -0x381

    .line 227
    .line 228
    :cond_15
    and-int/lit8 v0, p10, 0x20

    .line 229
    .line 230
    if-eqz v0, :cond_16

    .line 231
    .line 232
    and-int/2addr v3, v15

    .line 233
    :cond_16
    move-wide v11, v12

    .line 234
    goto :goto_13

    .line 235
    :cond_17
    :goto_11
    if-eqz v4, :cond_18

    .line 236
    .line 237
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 238
    .line 239
    move-object v5, v0

    .line 240
    :cond_18
    and-int/lit8 v0, p10, 0x4

    .line 241
    .line 242
    if-eqz v0, :cond_19

    .line 243
    .line 244
    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 245
    .line 246
    const/4 v4, 0x6

    .line 247
    invoke-virtual {v0, v2, v4}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v0}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    .line 252
    .line 253
    .line 254
    move-result-wide v6

    .line 255
    and-int/lit16 v3, v3, -0x381

    .line 256
    .line 257
    :cond_19
    if-eqz v8, :cond_1a

    .line 258
    .line 259
    sget-object v0, Landroidx/compose/material/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material/ProgressIndicatorDefaults;

    .line 260
    .line 261
    invoke-virtual {v0}, Landroidx/compose/material/ProgressIndicatorDefaults;->getStrokeWidth-D9Ej5fM()F

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    move v10, v0

    .line 266
    :cond_1a
    if-eqz v11, :cond_1b

    .line 267
    .line 268
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 269
    .line 270
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 271
    .line 272
    .line 273
    move-result-wide v11

    .line 274
    goto :goto_12

    .line 275
    :cond_1b
    move-wide v11, v12

    .line 276
    :goto_12
    and-int/lit8 v0, p10, 0x20

    .line 277
    .line 278
    if-eqz v0, :cond_1c

    .line 279
    .line 280
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 281
    .line 282
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    and-int/2addr v3, v15

    .line 287
    move v14, v0

    .line 288
    :cond_1c
    :goto_13
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 289
    .line 290
    .line 291
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_1d

    .line 296
    .line 297
    const/4 v0, -0x1

    .line 298
    const-string v4, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:325)"

    .line 299
    .line 300
    const v8, 0x681b4850

    .line 301
    .line 302
    .line 303
    invoke-static {v8, v3, v0, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 304
    .line 305
    .line 306
    :cond_1d
    const/4 v0, 0x0

    .line 307
    const/high16 v3, 0x3f800000    # 1.0f

    .line 308
    .line 309
    invoke-static {v1, v0, v3}, Lkotlin/ranges/s;->H(FFF)F

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    check-cast v3, Landroidx/compose/ui/unit/Density;

    .line 322
    .line 323
    new-instance v4, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 324
    .line 325
    invoke-interface {v3, v10}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    const/4 v8, 0x0

    .line 330
    const/4 v13, 0x0

    .line 331
    const/4 v15, 0x0

    .line 332
    const/16 v16, 0x1a

    .line 333
    .line 334
    const/16 v17, 0x0

    .line 335
    .line 336
    move-object/from16 p1, v4

    .line 337
    .line 338
    move/from16 p2, v3

    .line 339
    .line 340
    move/from16 p3, v8

    .line 341
    .line 342
    move/from16 p4, v14

    .line 343
    .line 344
    move/from16 p5, v13

    .line 345
    .line 346
    move-object/from16 p6, v15

    .line 347
    .line 348
    move/from16 p7, v16

    .line 349
    .line 350
    move-object/from16 p8, v17

    .line 351
    .line 352
    invoke-direct/range {p1 .. p8}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/w;)V

    .line 353
    .line 354
    .line 355
    const/4 v3, 0x0

    .line 356
    const/4 v8, 0x0

    .line 357
    const/4 v13, 0x6

    .line 358
    move-object/from16 p1, v5

    .line 359
    .line 360
    move/from16 p2, v0

    .line 361
    .line 362
    move-object/from16 p3, v3

    .line 363
    .line 364
    move/from16 p4, v8

    .line 365
    .line 366
    move/from16 p5, v13

    .line 367
    .line 368
    invoke-static/range {p1 .. p6}, Landroidx/compose/foundation/ProgressSemanticsKt;->progressSemantics$default(Landroidx/compose/ui/Modifier;FLkotlin/ranges/f;IILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    sget v8, Landroidx/compose/material/ProgressIndicatorKt;->CircularIndicatorDiameter:F

    .line 373
    .line 374
    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    new-instance v8, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$1;

    .line 379
    .line 380
    move-object/from16 p1, v8

    .line 381
    .line 382
    move-wide/from16 p3, v11

    .line 383
    .line 384
    move-object/from16 p5, v4

    .line 385
    .line 386
    move-wide/from16 p6, v6

    .line 387
    .line 388
    invoke-direct/range {p1 .. p7}, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$1;-><init>(FJLandroidx/compose/ui/graphics/drawscope/Stroke;J)V

    .line 389
    .line 390
    .line 391
    const/4 v0, 0x0

    .line 392
    invoke-static {v3, v8, v2, v0}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 393
    .line 394
    .line 395
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-eqz v0, :cond_1e

    .line 400
    .line 401
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 402
    .line 403
    .line 404
    :cond_1e
    move-wide v3, v6

    .line 405
    move-wide v6, v11

    .line 406
    goto/16 :goto_f

    .line 407
    .line 408
    :goto_14
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 409
    .line 410
    .line 411
    move-result-object v11

    .line 412
    if-eqz v11, :cond_1f

    .line 413
    .line 414
    new-instance v12, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$2;

    .line 415
    .line 416
    move-object v0, v12

    .line 417
    move/from16 v1, p0

    .line 418
    .line 419
    move-object v2, v5

    .line 420
    move v5, v10

    .line 421
    move/from16 v9, p9

    .line 422
    .line 423
    move/from16 v10, p10

    .line 424
    .line 425
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$2;-><init>(FLandroidx/compose/ui/Modifier;JFJIII)V

    .line 426
    .line 427
    .line 428
    invoke-interface {v11, v12}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 429
    .line 430
    .line 431
    :cond_1f
    return-void
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

.method public static final CircularProgressIndicator-LxG7B9w(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V
    .locals 25
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move/from16 v8, p8

    .line 2
    .line 3
    const v0, -0x42b466e0

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p7

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, p9, 0x1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    or-int/lit8 v4, v8, 0x6

    .line 17
    .line 18
    move v5, v4

    .line 19
    move-object/from16 v4, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v4, v8, 0xe

    .line 23
    .line 24
    if-nez v4, :cond_2

    .line 25
    .line 26
    move-object/from16 v4, p0

    .line 27
    .line 28
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    const/4 v5, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v5, 0x2

    .line 37
    :goto_0
    or-int/2addr v5, v8

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object/from16 v4, p0

    .line 40
    .line 41
    move v5, v8

    .line 42
    :goto_1
    and-int/lit8 v6, v8, 0x70

    .line 43
    .line 44
    if-nez v6, :cond_5

    .line 45
    .line 46
    and-int/lit8 v6, p9, 0x2

    .line 47
    .line 48
    if-nez v6, :cond_3

    .line 49
    .line 50
    move-wide/from16 v6, p1

    .line 51
    .line 52
    invoke-interface {v1, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-eqz v9, :cond_4

    .line 57
    .line 58
    const/16 v9, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move-wide/from16 v6, p1

    .line 62
    .line 63
    :cond_4
    const/16 v9, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v5, v9

    .line 66
    goto :goto_3

    .line 67
    :cond_5
    move-wide/from16 v6, p1

    .line 68
    .line 69
    :goto_3
    and-int/lit8 v9, p9, 0x4

    .line 70
    .line 71
    if-eqz v9, :cond_6

    .line 72
    .line 73
    or-int/lit16 v5, v5, 0x180

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_6
    and-int/lit16 v10, v8, 0x380

    .line 77
    .line 78
    if-nez v10, :cond_8

    .line 79
    .line 80
    move/from16 v10, p3

    .line 81
    .line 82
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    if-eqz v11, :cond_7

    .line 87
    .line 88
    const/16 v11, 0x100

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_7
    const/16 v11, 0x80

    .line 92
    .line 93
    :goto_4
    or-int/2addr v5, v11

    .line 94
    goto :goto_6

    .line 95
    :cond_8
    :goto_5
    move/from16 v10, p3

    .line 96
    .line 97
    :goto_6
    and-int/lit8 v11, p9, 0x8

    .line 98
    .line 99
    if-eqz v11, :cond_9

    .line 100
    .line 101
    or-int/lit16 v5, v5, 0xc00

    .line 102
    .line 103
    goto :goto_8

    .line 104
    :cond_9
    and-int/lit16 v12, v8, 0x1c00

    .line 105
    .line 106
    if-nez v12, :cond_b

    .line 107
    .line 108
    move-wide/from16 v12, p4

    .line 109
    .line 110
    invoke-interface {v1, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 111
    .line 112
    .line 113
    move-result v14

    .line 114
    if-eqz v14, :cond_a

    .line 115
    .line 116
    const/16 v14, 0x800

    .line 117
    .line 118
    goto :goto_7

    .line 119
    :cond_a
    const/16 v14, 0x400

    .line 120
    .line 121
    :goto_7
    or-int/2addr v5, v14

    .line 122
    goto :goto_9

    .line 123
    :cond_b
    :goto_8
    move-wide/from16 v12, p4

    .line 124
    .line 125
    :goto_9
    const v14, 0xe000

    .line 126
    .line 127
    .line 128
    and-int/2addr v14, v8

    .line 129
    if-nez v14, :cond_e

    .line 130
    .line 131
    and-int/lit8 v14, p9, 0x10

    .line 132
    .line 133
    if-nez v14, :cond_c

    .line 134
    .line 135
    move/from16 v14, p6

    .line 136
    .line 137
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 138
    .line 139
    .line 140
    move-result v15

    .line 141
    if-eqz v15, :cond_d

    .line 142
    .line 143
    const/16 v15, 0x4000

    .line 144
    .line 145
    goto :goto_a

    .line 146
    :cond_c
    move/from16 v14, p6

    .line 147
    .line 148
    :cond_d
    const/16 v15, 0x2000

    .line 149
    .line 150
    :goto_a
    or-int/2addr v5, v15

    .line 151
    goto :goto_b

    .line 152
    :cond_e
    move/from16 v14, p6

    .line 153
    .line 154
    :goto_b
    const v15, 0xb6db

    .line 155
    .line 156
    .line 157
    and-int/2addr v15, v5

    .line 158
    const/16 v3, 0x2492

    .line 159
    .line 160
    if-ne v15, v3, :cond_10

    .line 161
    .line 162
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-nez v3, :cond_f

    .line 167
    .line 168
    goto :goto_c

    .line 169
    :cond_f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 170
    .line 171
    .line 172
    move-wide v2, v6

    .line 173
    move-wide v5, v12

    .line 174
    move v7, v14

    .line 175
    goto/16 :goto_10

    .line 176
    .line 177
    :cond_10
    :goto_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 178
    .line 179
    .line 180
    and-int/lit8 v3, v8, 0x1

    .line 181
    .line 182
    const v15, -0xe001

    .line 183
    .line 184
    .line 185
    if-eqz v3, :cond_15

    .line 186
    .line 187
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-eqz v3, :cond_11

    .line 192
    .line 193
    goto :goto_d

    .line 194
    :cond_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 195
    .line 196
    .line 197
    and-int/lit8 v2, p9, 0x2

    .line 198
    .line 199
    if-eqz v2, :cond_12

    .line 200
    .line 201
    and-int/lit8 v5, v5, -0x71

    .line 202
    .line 203
    :cond_12
    and-int/lit8 v2, p9, 0x10

    .line 204
    .line 205
    if-eqz v2, :cond_13

    .line 206
    .line 207
    and-int/2addr v5, v15

    .line 208
    :cond_13
    move-object v2, v4

    .line 209
    :cond_14
    move v9, v5

    .line 210
    move v3, v10

    .line 211
    move-wide v4, v12

    .line 212
    move/from16 v20, v14

    .line 213
    .line 214
    goto :goto_f

    .line 215
    :cond_15
    :goto_d
    if-eqz v2, :cond_16

    .line 216
    .line 217
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 218
    .line 219
    goto :goto_e

    .line 220
    :cond_16
    move-object v2, v4

    .line 221
    :goto_e
    and-int/lit8 v3, p9, 0x2

    .line 222
    .line 223
    if-eqz v3, :cond_17

    .line 224
    .line 225
    sget-object v3, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 226
    .line 227
    const/4 v4, 0x6

    .line 228
    invoke-virtual {v3, v1, v4}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v3}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    .line 233
    .line 234
    .line 235
    move-result-wide v3

    .line 236
    and-int/lit8 v5, v5, -0x71

    .line 237
    .line 238
    move-wide v6, v3

    .line 239
    :cond_17
    if-eqz v9, :cond_18

    .line 240
    .line 241
    sget-object v3, Landroidx/compose/material/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material/ProgressIndicatorDefaults;

    .line 242
    .line 243
    invoke-virtual {v3}, Landroidx/compose/material/ProgressIndicatorDefaults;->getStrokeWidth-D9Ej5fM()F

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    move v10, v3

    .line 248
    :cond_18
    if-eqz v11, :cond_19

    .line 249
    .line 250
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 251
    .line 252
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 253
    .line 254
    .line 255
    move-result-wide v3

    .line 256
    move-wide v12, v3

    .line 257
    :cond_19
    and-int/lit8 v3, p9, 0x10

    .line 258
    .line 259
    if-eqz v3, :cond_14

    .line 260
    .line 261
    sget-object v3, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 262
    .line 263
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getSquare-KaPHkGw()I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    and-int/2addr v5, v15

    .line 268
    move/from16 v20, v3

    .line 269
    .line 270
    move v9, v5

    .line 271
    move v3, v10

    .line 272
    move-wide v4, v12

    .line 273
    :goto_f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 274
    .line 275
    .line 276
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 277
    .line 278
    .line 279
    move-result v10

    .line 280
    if-eqz v10, :cond_1a

    .line 281
    .line 282
    const/4 v10, -0x1

    .line 283
    const-string v11, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:364)"

    .line 284
    .line 285
    invoke-static {v0, v9, v10, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 286
    .line 287
    .line 288
    :cond_1a
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    check-cast v0, Landroidx/compose/ui/unit/Density;

    .line 297
    .line 298
    new-instance v18, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 299
    .line 300
    invoke-interface {v0, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 301
    .line 302
    .line 303
    move-result v10

    .line 304
    const/4 v11, 0x0

    .line 305
    const/4 v13, 0x0

    .line 306
    const/4 v14, 0x0

    .line 307
    const/16 v15, 0x1a

    .line 308
    .line 309
    const/16 v16, 0x0

    .line 310
    .line 311
    move-object/from16 v9, v18

    .line 312
    .line 313
    move/from16 v12, v20

    .line 314
    .line 315
    invoke-direct/range {v9 .. v16}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/w;)V

    .line 316
    .line 317
    .line 318
    const/4 v0, 0x0

    .line 319
    const/4 v15, 0x0

    .line 320
    const/4 v9, 0x1

    .line 321
    invoke-static {v0, v1, v15, v9}, Landroidx/compose/animation/core/InfiniteTransitionKt;->rememberInfiniteTransition(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/InfiniteTransition;

    .line 322
    .line 323
    .line 324
    move-result-object v19

    .line 325
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object v10

    .line 329
    const/4 v9, 0x5

    .line 330
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object v11

    .line 334
    sget-object v9, Lkotlin/jvm/internal/j0;->a:Lkotlin/jvm/internal/j0;

    .line 335
    .line 336
    invoke-static {v9}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/j0;)Landroidx/compose/animation/core/TwoWayConverter;

    .line 337
    .line 338
    .line 339
    move-result-object v12

    .line 340
    const/16 v9, 0x1a04

    .line 341
    .line 342
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getLinearEasing()Landroidx/compose/animation/core/Easing;

    .line 343
    .line 344
    .line 345
    move-result-object v13

    .line 346
    const/4 v14, 0x2

    .line 347
    invoke-static {v9, v15, v13, v14, v0}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 348
    .line 349
    .line 350
    move-result-object v9

    .line 351
    const/4 v13, 0x0

    .line 352
    const-wide/16 v16, 0x0

    .line 353
    .line 354
    const/4 v14, 0x6

    .line 355
    const/16 v21, 0x0

    .line 356
    .line 357
    move-object/from16 p0, v9

    .line 358
    .line 359
    move-object/from16 p1, v13

    .line 360
    .line 361
    move-wide/from16 p2, v16

    .line 362
    .line 363
    move/from16 p4, v14

    .line 364
    .line 365
    move-object/from16 p5, v21

    .line 366
    .line 367
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 368
    .line 369
    .line 370
    move-result-object v13

    .line 371
    const/4 v14, 0x0

    .line 372
    sget v9, Landroidx/compose/animation/core/InfiniteTransition;->$stable:I

    .line 373
    .line 374
    or-int/lit16 v15, v9, 0x11b0

    .line 375
    .line 376
    sget v21, Landroidx/compose/animation/core/InfiniteRepeatableSpec;->$stable:I

    .line 377
    .line 378
    shl-int/lit8 v16, v21, 0xc

    .line 379
    .line 380
    or-int v16, v15, v16

    .line 381
    .line 382
    const/16 v17, 0x10

    .line 383
    .line 384
    move v15, v9

    .line 385
    move-object/from16 v9, v19

    .line 386
    .line 387
    move/from16 v22, v15

    .line 388
    .line 389
    move-object v15, v1

    .line 390
    invoke-static/range {v9 .. v17}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateValue(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 391
    .line 392
    .line 393
    move-result-object v16

    .line 394
    const/4 v9, 0x0

    .line 395
    const/high16 v10, 0x438f0000    # 286.0f

    .line 396
    .line 397
    const/16 v11, 0x534

    .line 398
    .line 399
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getLinearEasing()Landroidx/compose/animation/core/Easing;

    .line 400
    .line 401
    .line 402
    move-result-object v12

    .line 403
    const/4 v13, 0x2

    .line 404
    const/4 v14, 0x0

    .line 405
    invoke-static {v11, v14, v12, v13, v0}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    const/4 v11, 0x0

    .line 410
    const-wide/16 v12, 0x0

    .line 411
    .line 412
    const/4 v15, 0x6

    .line 413
    const/16 v17, 0x0

    .line 414
    .line 415
    move-object/from16 p0, v0

    .line 416
    .line 417
    move-object/from16 p1, v11

    .line 418
    .line 419
    move-wide/from16 p2, v12

    .line 420
    .line 421
    move/from16 p4, v15

    .line 422
    .line 423
    move-object/from16 p5, v17

    .line 424
    .line 425
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    move/from16 v12, v22

    .line 430
    .line 431
    or-int/lit16 v13, v12, 0x1b0

    .line 432
    .line 433
    shl-int/lit8 v15, v21, 0x9

    .line 434
    .line 435
    or-int/2addr v13, v15

    .line 436
    const/16 v15, 0x8

    .line 437
    .line 438
    move-object/from16 p0, v19

    .line 439
    .line 440
    move/from16 p1, v9

    .line 441
    .line 442
    move/from16 p2, v10

    .line 443
    .line 444
    move-object/from16 p3, v0

    .line 445
    .line 446
    move-object/from16 p4, v11

    .line 447
    .line 448
    move-object/from16 p5, v1

    .line 449
    .line 450
    move/from16 p6, v13

    .line 451
    .line 452
    move/from16 p7, v15

    .line 453
    .line 454
    invoke-static/range {p0 .. p7}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    const/high16 v10, 0x43910000    # 290.0f

    .line 459
    .line 460
    sget-object v11, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$endAngle$2;->INSTANCE:Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$endAngle$2;

    .line 461
    .line 462
    invoke-static {v11}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lv3/l;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 463
    .line 464
    .line 465
    move-result-object v11

    .line 466
    const/4 v13, 0x0

    .line 467
    const-wide/16 v22, 0x0

    .line 468
    .line 469
    const/4 v15, 0x6

    .line 470
    move-object/from16 p0, v11

    .line 471
    .line 472
    move-object/from16 p1, v13

    .line 473
    .line 474
    move-wide/from16 p2, v22

    .line 475
    .line 476
    move/from16 p4, v15

    .line 477
    .line 478
    move-object/from16 p5, v17

    .line 479
    .line 480
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 481
    .line 482
    .line 483
    move-result-object v11

    .line 484
    or-int/lit16 v15, v12, 0x1b0

    .line 485
    .line 486
    shl-int/lit8 v17, v21, 0x9

    .line 487
    .line 488
    or-int v15, v15, v17

    .line 489
    .line 490
    const/16 v17, 0x8

    .line 491
    .line 492
    move-object/from16 p0, v19

    .line 493
    .line 494
    move/from16 p1, v9

    .line 495
    .line 496
    move/from16 p2, v10

    .line 497
    .line 498
    move-object/from16 p3, v11

    .line 499
    .line 500
    move-object/from16 p4, v13

    .line 501
    .line 502
    move-object/from16 p5, v1

    .line 503
    .line 504
    move/from16 p6, v15

    .line 505
    .line 506
    move/from16 p7, v17

    .line 507
    .line 508
    invoke-static/range {p0 .. p7}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 509
    .line 510
    .line 511
    move-result-object v17

    .line 512
    sget-object v11, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$startAngle$2;->INSTANCE:Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$startAngle$2;

    .line 513
    .line 514
    invoke-static {v11}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lv3/l;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 515
    .line 516
    .line 517
    move-result-object v11

    .line 518
    const/4 v15, 0x6

    .line 519
    const/16 v24, 0x0

    .line 520
    .line 521
    move-object/from16 p0, v11

    .line 522
    .line 523
    move-object/from16 p1, v13

    .line 524
    .line 525
    move-wide/from16 p2, v22

    .line 526
    .line 527
    move/from16 p4, v15

    .line 528
    .line 529
    move-object/from16 p5, v24

    .line 530
    .line 531
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 532
    .line 533
    .line 534
    move-result-object v11

    .line 535
    or-int/lit16 v12, v12, 0x1b0

    .line 536
    .line 537
    shl-int/lit8 v15, v21, 0x9

    .line 538
    .line 539
    or-int/2addr v12, v15

    .line 540
    const/16 v15, 0x8

    .line 541
    .line 542
    move-object/from16 p0, v19

    .line 543
    .line 544
    move/from16 p1, v9

    .line 545
    .line 546
    move/from16 p2, v10

    .line 547
    .line 548
    move-object/from16 p3, v11

    .line 549
    .line 550
    move-object/from16 p4, v13

    .line 551
    .line 552
    move-object/from16 p5, v1

    .line 553
    .line 554
    move/from16 p6, v12

    .line 555
    .line 556
    move/from16 p7, v15

    .line 557
    .line 558
    invoke-static/range {p0 .. p7}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 559
    .line 560
    .line 561
    move-result-object v19

    .line 562
    invoke-static {v2}, Landroidx/compose/foundation/ProgressSemanticsKt;->progressSemantics(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 563
    .line 564
    .line 565
    move-result-object v9

    .line 566
    sget v10, Landroidx/compose/material/ProgressIndicatorKt;->CircularIndicatorDiameter:F

    .line 567
    .line 568
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 569
    .line 570
    .line 571
    move-result-object v15

    .line 572
    new-instance v13, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$3;

    .line 573
    .line 574
    move-object v9, v13

    .line 575
    move-wide v10, v4

    .line 576
    move-object/from16 v12, v18

    .line 577
    .line 578
    move-object/from16 p0, v2

    .line 579
    .line 580
    move-object v2, v13

    .line 581
    move v13, v3

    .line 582
    move/from16 v21, v3

    .line 583
    .line 584
    move-wide/from16 p1, v4

    .line 585
    .line 586
    move v4, v14

    .line 587
    move-object v3, v15

    .line 588
    move-wide v14, v6

    .line 589
    move-object/from16 v18, v19

    .line 590
    .line 591
    move-object/from16 v19, v0

    .line 592
    .line 593
    invoke-direct/range {v9 .. v19}, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$3;-><init>(JLandroidx/compose/ui/graphics/drawscope/Stroke;FJLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    .line 594
    .line 595
    .line 596
    invoke-static {v3, v2, v1, v4}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 597
    .line 598
    .line 599
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    if-eqz v0, :cond_1b

    .line 604
    .line 605
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 606
    .line 607
    .line 608
    :cond_1b
    move-object/from16 v4, p0

    .line 609
    .line 610
    move-wide v2, v6

    .line 611
    move/from16 v7, v20

    .line 612
    .line 613
    move/from16 v10, v21

    .line 614
    .line 615
    move-wide/from16 v5, p1

    .line 616
    .line 617
    :goto_10
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 618
    .line 619
    .line 620
    move-result-object v11

    .line 621
    if-eqz v11, :cond_1c

    .line 622
    .line 623
    new-instance v12, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$4;

    .line 624
    .line 625
    move-object v0, v12

    .line 626
    move-object v1, v4

    .line 627
    move v4, v10

    .line 628
    move/from16 v8, p8

    .line 629
    .line 630
    move/from16 v9, p9

    .line 631
    .line 632
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$4;-><init>(Landroidx/compose/ui/Modifier;JFJIII)V

    .line 633
    .line 634
    .line 635
    invoke-interface {v11, v12}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 636
    .line 637
    .line 638
    :cond_1c
    return-void
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
.end method

.method public static final synthetic CircularProgressIndicator-MBs18nI(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Maintained for binary compatibility"
    .end annotation

    .line 1
    move/from16 v6, p6

    .line 2
    .line 3
    const v0, -0x186ac24b

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p5

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, p7, 0x1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    or-int/lit8 v2, v6, 0x6

    .line 17
    .line 18
    move v3, v2

    .line 19
    move/from16 v2, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v2, v6, 0xe

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    move/from16 v2, p0

    .line 27
    .line 28
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v3, 0x2

    .line 37
    :goto_0
    or-int/2addr v3, v6

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move/from16 v2, p0

    .line 40
    .line 41
    move v3, v6

    .line 42
    :goto_1
    and-int/lit8 v4, p7, 0x2

    .line 43
    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    or-int/lit8 v3, v3, 0x30

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_3
    and-int/lit8 v5, v6, 0x70

    .line 50
    .line 51
    if-nez v5, :cond_5

    .line 52
    .line 53
    move-object/from16 v5, p1

    .line 54
    .line 55
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_4

    .line 60
    .line 61
    const/16 v7, 0x20

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    const/16 v7, 0x10

    .line 65
    .line 66
    :goto_2
    or-int/2addr v3, v7

    .line 67
    goto :goto_4

    .line 68
    :cond_5
    :goto_3
    move-object/from16 v5, p1

    .line 69
    .line 70
    :goto_4
    and-int/lit16 v7, v6, 0x380

    .line 71
    .line 72
    if-nez v7, :cond_8

    .line 73
    .line 74
    and-int/lit8 v7, p7, 0x4

    .line 75
    .line 76
    if-nez v7, :cond_6

    .line 77
    .line 78
    move-wide/from16 v7, p2

    .line 79
    .line 80
    invoke-interface {v1, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-eqz v9, :cond_7

    .line 85
    .line 86
    const/16 v9, 0x100

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_6
    move-wide/from16 v7, p2

    .line 90
    .line 91
    :cond_7
    const/16 v9, 0x80

    .line 92
    .line 93
    :goto_5
    or-int/2addr v3, v9

    .line 94
    goto :goto_6

    .line 95
    :cond_8
    move-wide/from16 v7, p2

    .line 96
    .line 97
    :goto_6
    and-int/lit8 v9, p7, 0x8

    .line 98
    .line 99
    if-eqz v9, :cond_9

    .line 100
    .line 101
    or-int/lit16 v3, v3, 0xc00

    .line 102
    .line 103
    goto :goto_8

    .line 104
    :cond_9
    and-int/lit16 v10, v6, 0x1c00

    .line 105
    .line 106
    if-nez v10, :cond_b

    .line 107
    .line 108
    move/from16 v10, p4

    .line 109
    .line 110
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    if-eqz v11, :cond_a

    .line 115
    .line 116
    const/16 v11, 0x800

    .line 117
    .line 118
    goto :goto_7

    .line 119
    :cond_a
    const/16 v11, 0x400

    .line 120
    .line 121
    :goto_7
    or-int/2addr v3, v11

    .line 122
    goto :goto_9

    .line 123
    :cond_b
    :goto_8
    move/from16 v10, p4

    .line 124
    .line 125
    :goto_9
    and-int/lit16 v11, v3, 0x16db

    .line 126
    .line 127
    const/16 v12, 0x492

    .line 128
    .line 129
    if-ne v11, v12, :cond_d

    .line 130
    .line 131
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    if-nez v11, :cond_c

    .line 136
    .line 137
    goto :goto_a

    .line 138
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 139
    .line 140
    .line 141
    move-object v4, v5

    .line 142
    move-wide/from16 v18, v7

    .line 143
    .line 144
    move v5, v10

    .line 145
    goto/16 :goto_e

    .line 146
    .line 147
    :cond_d
    :goto_a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 148
    .line 149
    .line 150
    and-int/lit8 v11, v6, 0x1

    .line 151
    .line 152
    if-eqz v11, :cond_11

    .line 153
    .line 154
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    if-eqz v11, :cond_e

    .line 159
    .line 160
    goto :goto_b

    .line 161
    :cond_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 162
    .line 163
    .line 164
    and-int/lit8 v4, p7, 0x4

    .line 165
    .line 166
    if-eqz v4, :cond_f

    .line 167
    .line 168
    and-int/lit16 v3, v3, -0x381

    .line 169
    .line 170
    :cond_f
    move-object v4, v5

    .line 171
    :cond_10
    move-wide/from16 v18, v7

    .line 172
    .line 173
    move v5, v10

    .line 174
    goto :goto_d

    .line 175
    :cond_11
    :goto_b
    if-eqz v4, :cond_12

    .line 176
    .line 177
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 178
    .line 179
    goto :goto_c

    .line 180
    :cond_12
    move-object v4, v5

    .line 181
    :goto_c
    and-int/lit8 v5, p7, 0x4

    .line 182
    .line 183
    if-eqz v5, :cond_13

    .line 184
    .line 185
    sget-object v5, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 186
    .line 187
    const/4 v7, 0x6

    .line 188
    invoke-virtual {v5, v1, v7}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-virtual {v5}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    .line 193
    .line 194
    .line 195
    move-result-wide v7

    .line 196
    and-int/lit16 v3, v3, -0x381

    .line 197
    .line 198
    :cond_13
    if-eqz v9, :cond_10

    .line 199
    .line 200
    sget-object v5, Landroidx/compose/material/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material/ProgressIndicatorDefaults;

    .line 201
    .line 202
    invoke-virtual {v5}, Landroidx/compose/material/ProgressIndicatorDefaults;->getStrokeWidth-D9Ej5fM()F

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    move-wide/from16 v18, v7

    .line 207
    .line 208
    :goto_d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 209
    .line 210
    .line 211
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-eqz v7, :cond_14

    .line 216
    .line 217
    const/4 v7, -0x1

    .line 218
    const-string v8, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:442)"

    .line 219
    .line 220
    invoke-static {v0, v3, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 221
    .line 222
    .line 223
    :cond_14
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 224
    .line 225
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 226
    .line 227
    .line 228
    move-result-wide v12

    .line 229
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 230
    .line 231
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 232
    .line 233
    .line 234
    move-result v14

    .line 235
    and-int/lit8 v0, v3, 0xe

    .line 236
    .line 237
    or-int/lit16 v0, v0, 0x6000

    .line 238
    .line 239
    and-int/lit8 v7, v3, 0x70

    .line 240
    .line 241
    or-int/2addr v0, v7

    .line 242
    and-int/lit16 v7, v3, 0x380

    .line 243
    .line 244
    or-int/2addr v0, v7

    .line 245
    and-int/lit16 v3, v3, 0x1c00

    .line 246
    .line 247
    or-int v16, v0, v3

    .line 248
    .line 249
    const/16 v17, 0x0

    .line 250
    .line 251
    move/from16 v7, p0

    .line 252
    .line 253
    move-object v8, v4

    .line 254
    move-wide/from16 v9, v18

    .line 255
    .line 256
    move v11, v5

    .line 257
    move-object v15, v1

    .line 258
    invoke-static/range {v7 .. v17}, Landroidx/compose/material/ProgressIndicatorKt;->CircularProgressIndicator-DUhRLBM(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V

    .line 259
    .line 260
    .line 261
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_15

    .line 266
    .line 267
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 268
    .line 269
    .line 270
    :cond_15
    :goto_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    if-eqz v8, :cond_16

    .line 275
    .line 276
    new-instance v9, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$5;

    .line 277
    .line 278
    move-object v0, v9

    .line 279
    move/from16 v1, p0

    .line 280
    .line 281
    move-object v2, v4

    .line 282
    move-wide/from16 v3, v18

    .line 283
    .line 284
    move/from16 v6, p6

    .line 285
    .line 286
    move/from16 v7, p7

    .line 287
    .line 288
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$5;-><init>(FLandroidx/compose/ui/Modifier;JFII)V

    .line 289
    .line 290
    .line 291
    invoke-interface {v8, v9}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 292
    .line 293
    .line 294
    :cond_16
    return-void
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

.method public static final synthetic CircularProgressIndicator-aM-cp0Q(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Maintained for binary compatibility"
    .end annotation

    .line 1
    move/from16 v5, p5

    .line 2
    .line 3
    const v0, -0x175ed17b

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p4

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, p6, 0x1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    or-int/lit8 v3, v5, 0x6

    .line 17
    .line 18
    move v4, v3

    .line 19
    move-object/from16 v3, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v3, v5, 0xe

    .line 23
    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    move-object/from16 v3, p0

    .line 27
    .line 28
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    const/4 v4, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v4, 0x2

    .line 37
    :goto_0
    or-int/2addr v4, v5

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object/from16 v3, p0

    .line 40
    .line 41
    move v4, v5

    .line 42
    :goto_1
    and-int/lit8 v6, v5, 0x70

    .line 43
    .line 44
    if-nez v6, :cond_5

    .line 45
    .line 46
    and-int/lit8 v6, p6, 0x2

    .line 47
    .line 48
    if-nez v6, :cond_3

    .line 49
    .line 50
    move-wide/from16 v6, p1

    .line 51
    .line 52
    invoke-interface {v1, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_4

    .line 57
    .line 58
    const/16 v8, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move-wide/from16 v6, p1

    .line 62
    .line 63
    :cond_4
    const/16 v8, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v4, v8

    .line 66
    goto :goto_3

    .line 67
    :cond_5
    move-wide/from16 v6, p1

    .line 68
    .line 69
    :goto_3
    and-int/lit8 v8, p6, 0x4

    .line 70
    .line 71
    if-eqz v8, :cond_6

    .line 72
    .line 73
    or-int/lit16 v4, v4, 0x180

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_6
    and-int/lit16 v9, v5, 0x380

    .line 77
    .line 78
    if-nez v9, :cond_8

    .line 79
    .line 80
    move/from16 v9, p3

    .line 81
    .line 82
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_7

    .line 87
    .line 88
    const/16 v10, 0x100

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_7
    const/16 v10, 0x80

    .line 92
    .line 93
    :goto_4
    or-int/2addr v4, v10

    .line 94
    goto :goto_6

    .line 95
    :cond_8
    :goto_5
    move/from16 v9, p3

    .line 96
    .line 97
    :goto_6
    and-int/lit16 v10, v4, 0x2db

    .line 98
    .line 99
    const/16 v11, 0x92

    .line 100
    .line 101
    if-ne v10, v11, :cond_a

    .line 102
    .line 103
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-nez v10, :cond_9

    .line 108
    .line 109
    goto :goto_7

    .line 110
    :cond_9
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 111
    .line 112
    .line 113
    move-object v2, v3

    .line 114
    move-wide v3, v6

    .line 115
    goto/16 :goto_c

    .line 116
    .line 117
    :cond_a
    :goto_7
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 118
    .line 119
    .line 120
    and-int/lit8 v10, v5, 0x1

    .line 121
    .line 122
    if-eqz v10, :cond_e

    .line 123
    .line 124
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    if-eqz v10, :cond_b

    .line 129
    .line 130
    goto :goto_9

    .line 131
    :cond_b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 132
    .line 133
    .line 134
    and-int/lit8 v2, p6, 0x2

    .line 135
    .line 136
    if-eqz v2, :cond_c

    .line 137
    .line 138
    and-int/lit8 v4, v4, -0x71

    .line 139
    .line 140
    :cond_c
    move-object v2, v3

    .line 141
    :cond_d
    move/from16 v16, v9

    .line 142
    .line 143
    :goto_8
    move-wide/from16 v17, v6

    .line 144
    .line 145
    move v6, v4

    .line 146
    move-wide/from16 v3, v17

    .line 147
    .line 148
    goto :goto_b

    .line 149
    :cond_e
    :goto_9
    if-eqz v2, :cond_f

    .line 150
    .line 151
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 152
    .line 153
    goto :goto_a

    .line 154
    :cond_f
    move-object v2, v3

    .line 155
    :goto_a
    and-int/lit8 v3, p6, 0x2

    .line 156
    .line 157
    if-eqz v3, :cond_10

    .line 158
    .line 159
    sget-object v3, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 160
    .line 161
    const/4 v6, 0x6

    .line 162
    invoke-virtual {v3, v1, v6}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v3}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    .line 167
    .line 168
    .line 169
    move-result-wide v6

    .line 170
    and-int/lit8 v4, v4, -0x71

    .line 171
    .line 172
    :cond_10
    if-eqz v8, :cond_d

    .line 173
    .line 174
    sget-object v3, Landroidx/compose/material/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material/ProgressIndicatorDefaults;

    .line 175
    .line 176
    invoke-virtual {v3}, Landroidx/compose/material/ProgressIndicatorDefaults;->getStrokeWidth-D9Ej5fM()F

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    move/from16 v16, v3

    .line 181
    .line 182
    goto :goto_8

    .line 183
    :goto_b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 184
    .line 185
    .line 186
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-eqz v7, :cond_11

    .line 191
    .line 192
    const/4 v7, -0x1

    .line 193
    const-string v8, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:457)"

    .line 194
    .line 195
    invoke-static {v0, v6, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :cond_11
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 199
    .line 200
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 201
    .line 202
    .line 203
    move-result-wide v10

    .line 204
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 205
    .line 206
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getSquare-KaPHkGw()I

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    and-int/lit8 v0, v6, 0xe

    .line 211
    .line 212
    or-int/lit16 v0, v0, 0xc00

    .line 213
    .line 214
    and-int/lit8 v7, v6, 0x70

    .line 215
    .line 216
    or-int/2addr v0, v7

    .line 217
    and-int/lit16 v6, v6, 0x380

    .line 218
    .line 219
    or-int v14, v0, v6

    .line 220
    .line 221
    const/4 v15, 0x0

    .line 222
    move-object v6, v2

    .line 223
    move-wide v7, v3

    .line 224
    move/from16 v9, v16

    .line 225
    .line 226
    move-object v13, v1

    .line 227
    invoke-static/range {v6 .. v15}, Landroidx/compose/material/ProgressIndicatorKt;->CircularProgressIndicator-LxG7B9w(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V

    .line 228
    .line 229
    .line 230
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_12

    .line 235
    .line 236
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 237
    .line 238
    .line 239
    :cond_12
    move/from16 v9, v16

    .line 240
    .line 241
    :goto_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    if-eqz v7, :cond_13

    .line 246
    .line 247
    new-instance v8, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$6;

    .line 248
    .line 249
    move-object v0, v8

    .line 250
    move-object v1, v2

    .line 251
    move-wide v2, v3

    .line 252
    move v4, v9

    .line 253
    move/from16 v5, p5

    .line 254
    .line 255
    move/from16 v6, p6

    .line 256
    .line 257
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material/ProgressIndicatorKt$CircularProgressIndicator$6;-><init>(Landroidx/compose/ui/Modifier;JFII)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v7, v8}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 261
    .line 262
    .line 263
    :cond_13
    return-void
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

.method private static final CircularProgressIndicator_LxG7B9w$lambda$10(Landroidx/compose/runtime/State;)F
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

.method private static final CircularProgressIndicator_LxG7B9w$lambda$11(Landroidx/compose/runtime/State;)F
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

.method private static final CircularProgressIndicator_LxG7B9w$lambda$8(Landroidx/compose/runtime/State;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final CircularProgressIndicator_LxG7B9w$lambda$9(Landroidx/compose/runtime/State;)F
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

.method public static final LinearProgressIndicator-2cYBFYY(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V
    .locals 29
    .param p0    # Landroidx/compose/ui/Modifier;
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

    .line 1
    move/from16 v7, p7

    .line 2
    .line 3
    const v0, 0x598122d0

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p6

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, p8, 0x1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    or-int/lit8 v3, v7, 0x6

    .line 17
    .line 18
    move v4, v3

    .line 19
    move-object/from16 v3, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v3, v7, 0xe

    .line 23
    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    move-object/from16 v3, p0

    .line 27
    .line 28
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    const/4 v4, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v4, 0x2

    .line 37
    :goto_0
    or-int/2addr v4, v7

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object/from16 v3, p0

    .line 40
    .line 41
    move v4, v7

    .line 42
    :goto_1
    and-int/lit8 v5, v7, 0x70

    .line 43
    .line 44
    if-nez v5, :cond_5

    .line 45
    .line 46
    and-int/lit8 v5, p8, 0x2

    .line 47
    .line 48
    if-nez v5, :cond_3

    .line 49
    .line 50
    move-wide/from16 v5, p1

    .line 51
    .line 52
    invoke-interface {v1, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_4

    .line 57
    .line 58
    const/16 v8, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move-wide/from16 v5, p1

    .line 62
    .line 63
    :cond_4
    const/16 v8, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v4, v8

    .line 66
    goto :goto_3

    .line 67
    :cond_5
    move-wide/from16 v5, p1

    .line 68
    .line 69
    :goto_3
    and-int/lit16 v8, v7, 0x380

    .line 70
    .line 71
    if-nez v8, :cond_8

    .line 72
    .line 73
    and-int/lit8 v8, p8, 0x4

    .line 74
    .line 75
    if-nez v8, :cond_6

    .line 76
    .line 77
    move-wide/from16 v8, p3

    .line 78
    .line 79
    invoke-interface {v1, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-eqz v10, :cond_7

    .line 84
    .line 85
    const/16 v10, 0x100

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    move-wide/from16 v8, p3

    .line 89
    .line 90
    :cond_7
    const/16 v10, 0x80

    .line 91
    .line 92
    :goto_4
    or-int/2addr v4, v10

    .line 93
    goto :goto_5

    .line 94
    :cond_8
    move-wide/from16 v8, p3

    .line 95
    .line 96
    :goto_5
    and-int/lit16 v10, v7, 0x1c00

    .line 97
    .line 98
    if-nez v10, :cond_b

    .line 99
    .line 100
    and-int/lit8 v10, p8, 0x8

    .line 101
    .line 102
    if-nez v10, :cond_9

    .line 103
    .line 104
    move/from16 v10, p5

    .line 105
    .line 106
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(I)Z

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
    goto :goto_6

    .line 115
    :cond_9
    move/from16 v10, p5

    .line 116
    .line 117
    :cond_a
    const/16 v11, 0x400

    .line 118
    .line 119
    :goto_6
    or-int/2addr v4, v11

    .line 120
    goto :goto_7

    .line 121
    :cond_b
    move/from16 v10, p5

    .line 122
    .line 123
    :goto_7
    and-int/lit16 v11, v4, 0x16db

    .line 124
    .line 125
    const/16 v12, 0x492

    .line 126
    .line 127
    if-ne v11, v12, :cond_d

    .line 128
    .line 129
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    if-nez v11, :cond_c

    .line 134
    .line 135
    goto :goto_8

    .line 136
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 137
    .line 138
    .line 139
    move-wide/from16 v18, v5

    .line 140
    .line 141
    move-wide v4, v8

    .line 142
    move v6, v10

    .line 143
    goto/16 :goto_f

    .line 144
    .line 145
    :cond_d
    :goto_8
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 146
    .line 147
    .line 148
    and-int/lit8 v11, v7, 0x1

    .line 149
    .line 150
    if-eqz v11, :cond_12

    .line 151
    .line 152
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    if-eqz v11, :cond_e

    .line 157
    .line 158
    goto :goto_9

    .line 159
    :cond_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 160
    .line 161
    .line 162
    and-int/lit8 v2, p8, 0x2

    .line 163
    .line 164
    if-eqz v2, :cond_f

    .line 165
    .line 166
    and-int/lit8 v4, v4, -0x71

    .line 167
    .line 168
    :cond_f
    and-int/lit8 v2, p8, 0x4

    .line 169
    .line 170
    if-eqz v2, :cond_10

    .line 171
    .line 172
    and-int/lit16 v4, v4, -0x381

    .line 173
    .line 174
    :cond_10
    and-int/lit8 v2, p8, 0x8

    .line 175
    .line 176
    if-eqz v2, :cond_11

    .line 177
    .line 178
    and-int/lit16 v4, v4, -0x1c01

    .line 179
    .line 180
    :cond_11
    move-object v2, v3

    .line 181
    goto :goto_b

    .line 182
    :cond_12
    :goto_9
    if-eqz v2, :cond_13

    .line 183
    .line 184
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 185
    .line 186
    goto :goto_a

    .line 187
    :cond_13
    move-object v2, v3

    .line 188
    :goto_a
    and-int/lit8 v3, p8, 0x2

    .line 189
    .line 190
    if-eqz v3, :cond_14

    .line 191
    .line 192
    sget-object v3, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 193
    .line 194
    const/4 v5, 0x6

    .line 195
    invoke-virtual {v3, v1, v5}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v3}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    .line 200
    .line 201
    .line 202
    move-result-wide v5

    .line 203
    and-int/lit8 v4, v4, -0x71

    .line 204
    .line 205
    :cond_14
    and-int/lit8 v3, p8, 0x4

    .line 206
    .line 207
    if-eqz v3, :cond_15

    .line 208
    .line 209
    const v13, 0x3e75c28f    # 0.24f

    .line 210
    .line 211
    .line 212
    const/4 v14, 0x0

    .line 213
    const/4 v15, 0x0

    .line 214
    const/16 v16, 0x0

    .line 215
    .line 216
    const/16 v17, 0xe

    .line 217
    .line 218
    const/16 v18, 0x0

    .line 219
    .line 220
    move-wide v11, v5

    .line 221
    invoke-static/range {v11 .. v18}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 222
    .line 223
    .line 224
    move-result-wide v8

    .line 225
    and-int/lit16 v3, v4, -0x381

    .line 226
    .line 227
    move v4, v3

    .line 228
    :cond_15
    and-int/lit8 v3, p8, 0x8

    .line 229
    .line 230
    if-eqz v3, :cond_16

    .line 231
    .line 232
    sget-object v3, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 233
    .line 234
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    and-int/lit16 v4, v4, -0x1c01

    .line 239
    .line 240
    move v15, v3

    .line 241
    goto :goto_c

    .line 242
    :cond_16
    :goto_b
    move v15, v10

    .line 243
    :goto_c
    move-wide/from16 v27, v8

    .line 244
    .line 245
    move v8, v4

    .line 246
    move-wide/from16 v3, v27

    .line 247
    .line 248
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 249
    .line 250
    .line 251
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    if-eqz v9, :cond_17

    .line 256
    .line 257
    const/4 v9, -0x1

    .line 258
    const-string v10, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:142)"

    .line 259
    .line 260
    invoke-static {v0, v8, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :cond_17
    const/4 v0, 0x0

    .line 264
    const/4 v14, 0x0

    .line 265
    const/4 v8, 0x1

    .line 266
    invoke-static {v0, v1, v14, v8}, Landroidx/compose/animation/core/InfiniteTransitionKt;->rememberInfiniteTransition(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/InfiniteTransition;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    const/4 v9, 0x0

    .line 271
    const/high16 v10, 0x3f800000    # 1.0f

    .line 272
    .line 273
    sget-object v8, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2;->INSTANCE:Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2;

    .line 274
    .line 275
    invoke-static {v8}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lv3/l;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    const/4 v11, 0x0

    .line 280
    const-wide/16 v12, 0x0

    .line 281
    .line 282
    const/16 v16, 0x6

    .line 283
    .line 284
    const/16 v17, 0x0

    .line 285
    .line 286
    move-object/from16 p0, v8

    .line 287
    .line 288
    move-object/from16 p1, v11

    .line 289
    .line 290
    move-wide/from16 p2, v12

    .line 291
    .line 292
    move/from16 p4, v16

    .line 293
    .line 294
    move-object/from16 p5, v17

    .line 295
    .line 296
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 297
    .line 298
    .line 299
    move-result-object v11

    .line 300
    const/4 v12, 0x0

    .line 301
    sget v13, Landroidx/compose/animation/core/InfiniteTransition;->$stable:I

    .line 302
    .line 303
    or-int/lit16 v8, v13, 0x1b0

    .line 304
    .line 305
    sget v16, Landroidx/compose/animation/core/InfiniteRepeatableSpec;->$stable:I

    .line 306
    .line 307
    shl-int/lit8 v17, v16, 0x9

    .line 308
    .line 309
    or-int v17, v8, v17

    .line 310
    .line 311
    const/16 v18, 0x8

    .line 312
    .line 313
    move-object v8, v0

    .line 314
    move/from16 v19, v13

    .line 315
    .line 316
    move-object v13, v1

    .line 317
    move/from16 v14, v17

    .line 318
    .line 319
    move v7, v15

    .line 320
    move/from16 v15, v18

    .line 321
    .line 322
    invoke-static/range {v8 .. v15}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 323
    .line 324
    .line 325
    move-result-object v15

    .line 326
    sget-object v8, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2;->INSTANCE:Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2;

    .line 327
    .line 328
    invoke-static {v8}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lv3/l;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 329
    .line 330
    .line 331
    move-result-object v8

    .line 332
    const/4 v11, 0x0

    .line 333
    const-wide/16 v12, 0x0

    .line 334
    .line 335
    const/4 v14, 0x6

    .line 336
    const/16 v17, 0x0

    .line 337
    .line 338
    move-object/from16 p0, v8

    .line 339
    .line 340
    move-object/from16 p1, v11

    .line 341
    .line 342
    move-wide/from16 p2, v12

    .line 343
    .line 344
    move/from16 p4, v14

    .line 345
    .line 346
    move-object/from16 p5, v17

    .line 347
    .line 348
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    const/4 v12, 0x0

    .line 353
    move/from16 v14, v19

    .line 354
    .line 355
    or-int/lit16 v8, v14, 0x1b0

    .line 356
    .line 357
    shl-int/lit8 v13, v16, 0x9

    .line 358
    .line 359
    or-int v17, v8, v13

    .line 360
    .line 361
    move-object v8, v0

    .line 362
    move-object v13, v1

    .line 363
    move/from16 v20, v14

    .line 364
    .line 365
    move/from16 v14, v17

    .line 366
    .line 367
    move-wide/from16 p0, v5

    .line 368
    .line 369
    move-object v5, v15

    .line 370
    move/from16 v15, v18

    .line 371
    .line 372
    invoke-static/range {v8 .. v15}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    sget-object v8, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2;->INSTANCE:Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2;

    .line 377
    .line 378
    invoke-static {v8}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lv3/l;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 379
    .line 380
    .line 381
    move-result-object v21

    .line 382
    const/16 v22, 0x0

    .line 383
    .line 384
    const-wide/16 v23, 0x0

    .line 385
    .line 386
    const/16 v25, 0x6

    .line 387
    .line 388
    const/16 v26, 0x0

    .line 389
    .line 390
    invoke-static/range {v21 .. v26}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 391
    .line 392
    .line 393
    move-result-object v11

    .line 394
    move/from16 v15, v20

    .line 395
    .line 396
    or-int/lit16 v8, v15, 0x1b0

    .line 397
    .line 398
    shl-int/lit8 v13, v16, 0x9

    .line 399
    .line 400
    or-int v14, v8, v13

    .line 401
    .line 402
    const/16 v17, 0x8

    .line 403
    .line 404
    move-object v8, v0

    .line 405
    move-object v13, v1

    .line 406
    move-object/from16 p2, v6

    .line 407
    .line 408
    move v6, v15

    .line 409
    move/from16 v15, v17

    .line 410
    .line 411
    invoke-static/range {v8 .. v15}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 412
    .line 413
    .line 414
    move-result-object v15

    .line 415
    sget-object v8, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2;->INSTANCE:Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2;

    .line 416
    .line 417
    invoke-static {v8}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lv3/l;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 418
    .line 419
    .line 420
    move-result-object v20

    .line 421
    const/16 v21, 0x0

    .line 422
    .line 423
    const-wide/16 v22, 0x0

    .line 424
    .line 425
    const/16 v24, 0x6

    .line 426
    .line 427
    const/16 v25, 0x0

    .line 428
    .line 429
    invoke-static/range {v20 .. v25}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 430
    .line 431
    .line 432
    move-result-object v11

    .line 433
    or-int/lit16 v6, v6, 0x1b0

    .line 434
    .line 435
    shl-int/lit8 v8, v16, 0x9

    .line 436
    .line 437
    or-int v14, v6, v8

    .line 438
    .line 439
    const/16 v6, 0x8

    .line 440
    .line 441
    move-object v8, v0

    .line 442
    move-object v0, v15

    .line 443
    move v15, v6

    .line 444
    invoke-static/range {v8 .. v15}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    invoke-static {v2}, Landroidx/compose/material/ProgressIndicatorKt;->increaseSemanticsBounds(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 449
    .line 450
    .line 451
    move-result-object v8

    .line 452
    invoke-static {v8}, Landroidx/compose/foundation/ProgressSemanticsKt;->progressSemantics(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 453
    .line 454
    .line 455
    move-result-object v8

    .line 456
    sget v9, Landroidx/compose/material/ProgressIndicatorKt;->LinearIndicatorWidth:F

    .line 457
    .line 458
    sget v10, Landroidx/compose/material/ProgressIndicatorKt;->LinearIndicatorHeight:F

    .line 459
    .line 460
    invoke-static {v8, v9, v10}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 461
    .line 462
    .line 463
    move-result-object v15

    .line 464
    const v8, -0x15f91981

    .line 465
    .line 466
    .line 467
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 468
    .line 469
    .line 470
    invoke-interface {v1, v3, v4}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 471
    .line 472
    .line 473
    move-result v8

    .line 474
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 475
    .line 476
    .line 477
    move-result v9

    .line 478
    or-int/2addr v8, v9

    .line 479
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v9

    .line 483
    or-int/2addr v8, v9

    .line 484
    move-object/from16 v14, p2

    .line 485
    .line 486
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v9

    .line 490
    or-int/2addr v8, v9

    .line 491
    move-wide/from16 v12, p0

    .line 492
    .line 493
    invoke-interface {v1, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 494
    .line 495
    .line 496
    move-result v9

    .line 497
    or-int/2addr v8, v9

    .line 498
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v9

    .line 502
    or-int/2addr v8, v9

    .line 503
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v9

    .line 507
    or-int/2addr v8, v9

    .line 508
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v9

    .line 512
    if-nez v8, :cond_19

    .line 513
    .line 514
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 515
    .line 516
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v8

    .line 520
    if-ne v9, v8, :cond_18

    .line 521
    .line 522
    goto :goto_d

    .line 523
    :cond_18
    move-object/from16 p0, v2

    .line 524
    .line 525
    move-wide/from16 v18, v12

    .line 526
    .line 527
    move-object v5, v15

    .line 528
    goto :goto_e

    .line 529
    :cond_19
    :goto_d
    new-instance v11, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$3$1;

    .line 530
    .line 531
    move-object v8, v11

    .line 532
    move-wide v9, v3

    .line 533
    move-object/from16 p0, v2

    .line 534
    .line 535
    move-object v2, v11

    .line 536
    move v11, v7

    .line 537
    move-wide/from16 v18, v12

    .line 538
    .line 539
    move-object/from16 v16, v14

    .line 540
    .line 541
    move-object v14, v5

    .line 542
    move-object v5, v15

    .line 543
    move-object/from16 v15, v16

    .line 544
    .line 545
    move-object/from16 v16, v0

    .line 546
    .line 547
    move-object/from16 v17, v6

    .line 548
    .line 549
    invoke-direct/range {v8 .. v17}, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$3$1;-><init>(JIJLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    .line 550
    .line 551
    .line 552
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    move-object v9, v2

    .line 556
    :goto_e
    check-cast v9, Lv3/l;

    .line 557
    .line 558
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 559
    .line 560
    .line 561
    const/4 v0, 0x0

    .line 562
    invoke-static {v5, v9, v1, v0}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 563
    .line 564
    .line 565
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    if-eqz v0, :cond_1a

    .line 570
    .line 571
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 572
    .line 573
    .line 574
    :cond_1a
    move-wide v4, v3

    .line 575
    move v6, v7

    .line 576
    move-object/from16 v3, p0

    .line 577
    .line 578
    :goto_f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 579
    .line 580
    .line 581
    move-result-object v9

    .line 582
    if-eqz v9, :cond_1b

    .line 583
    .line 584
    new-instance v10, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$4;

    .line 585
    .line 586
    move-object v0, v10

    .line 587
    move-object v1, v3

    .line 588
    move-wide/from16 v2, v18

    .line 589
    .line 590
    move/from16 v7, p7

    .line 591
    .line 592
    move/from16 v8, p8

    .line 593
    .line 594
    invoke-direct/range {v0 .. v8}, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$4;-><init>(Landroidx/compose/ui/Modifier;JJIII)V

    .line 595
    .line 596
    .line 597
    invoke-interface {v9, v10}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 598
    .line 599
    .line 600
    :cond_1b
    return-void
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

.method public static final synthetic LinearProgressIndicator-RIQooxk(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Maintained for binary compatibility"
    .end annotation

    .line 1
    move/from16 v6, p6

    .line 2
    .line 3
    const v0, -0x30d701c2

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p5

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, p7, 0x1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    or-int/lit8 v3, v6, 0x6

    .line 17
    .line 18
    move v4, v3

    .line 19
    move-object/from16 v3, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v3, v6, 0xe

    .line 23
    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    move-object/from16 v3, p0

    .line 27
    .line 28
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    const/4 v4, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v4, 0x2

    .line 37
    :goto_0
    or-int/2addr v4, v6

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object/from16 v3, p0

    .line 40
    .line 41
    move v4, v6

    .line 42
    :goto_1
    and-int/lit8 v5, v6, 0x70

    .line 43
    .line 44
    if-nez v5, :cond_4

    .line 45
    .line 46
    and-int/lit8 v5, p7, 0x2

    .line 47
    .line 48
    move-wide/from16 v7, p1

    .line 49
    .line 50
    if-nez v5, :cond_3

    .line 51
    .line 52
    invoke-interface {v1, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    const/16 v5, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    const/16 v5, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v4, v5

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    move-wide/from16 v7, p1

    .line 66
    .line 67
    :goto_3
    and-int/lit16 v5, v6, 0x380

    .line 68
    .line 69
    if-nez v5, :cond_6

    .line 70
    .line 71
    and-int/lit8 v5, p7, 0x4

    .line 72
    .line 73
    move-wide/from16 v9, p3

    .line 74
    .line 75
    if-nez v5, :cond_5

    .line 76
    .line 77
    invoke-interface {v1, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_5

    .line 82
    .line 83
    const/16 v5, 0x100

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_5
    const/16 v5, 0x80

    .line 87
    .line 88
    :goto_4
    or-int/2addr v4, v5

    .line 89
    goto :goto_5

    .line 90
    :cond_6
    move-wide/from16 v9, p3

    .line 91
    .line 92
    :goto_5
    and-int/lit16 v5, v4, 0x2db

    .line 93
    .line 94
    const/16 v11, 0x92

    .line 95
    .line 96
    if-ne v5, v11, :cond_8

    .line 97
    .line 98
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-nez v5, :cond_7

    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_7
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 106
    .line 107
    .line 108
    move-object v2, v3

    .line 109
    move-wide v3, v7

    .line 110
    goto/16 :goto_a

    .line 111
    .line 112
    :cond_8
    :goto_6
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 113
    .line 114
    .line 115
    and-int/lit8 v5, v6, 0x1

    .line 116
    .line 117
    if-eqz v5, :cond_c

    .line 118
    .line 119
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_9

    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_9
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 127
    .line 128
    .line 129
    and-int/lit8 v2, p7, 0x2

    .line 130
    .line 131
    if-eqz v2, :cond_a

    .line 132
    .line 133
    and-int/lit8 v4, v4, -0x71

    .line 134
    .line 135
    :cond_a
    and-int/lit8 v2, p7, 0x4

    .line 136
    .line 137
    if-eqz v2, :cond_b

    .line 138
    .line 139
    and-int/lit16 v4, v4, -0x381

    .line 140
    .line 141
    :cond_b
    move-object v2, v3

    .line 142
    goto :goto_9

    .line 143
    :cond_c
    :goto_7
    if-eqz v2, :cond_d

    .line 144
    .line 145
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 146
    .line 147
    goto :goto_8

    .line 148
    :cond_d
    move-object v2, v3

    .line 149
    :goto_8
    and-int/lit8 v3, p7, 0x2

    .line 150
    .line 151
    if-eqz v3, :cond_e

    .line 152
    .line 153
    sget-object v3, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 154
    .line 155
    const/4 v5, 0x6

    .line 156
    invoke-virtual {v3, v1, v5}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {v3}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    .line 161
    .line 162
    .line 163
    move-result-wide v7

    .line 164
    and-int/lit8 v4, v4, -0x71

    .line 165
    .line 166
    :cond_e
    and-int/lit8 v3, p7, 0x4

    .line 167
    .line 168
    if-eqz v3, :cond_f

    .line 169
    .line 170
    const v11, 0x3e75c28f    # 0.24f

    .line 171
    .line 172
    .line 173
    const/4 v12, 0x0

    .line 174
    const/4 v13, 0x0

    .line 175
    const/4 v14, 0x0

    .line 176
    const/16 v15, 0xe

    .line 177
    .line 178
    const/16 v16, 0x0

    .line 179
    .line 180
    move-wide v9, v7

    .line 181
    invoke-static/range {v9 .. v16}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 182
    .line 183
    .line 184
    move-result-wide v9

    .line 185
    and-int/lit16 v4, v4, -0x381

    .line 186
    .line 187
    :cond_f
    :goto_9
    move v5, v4

    .line 188
    move-wide v3, v7

    .line 189
    move-wide/from16 v16, v9

    .line 190
    .line 191
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 192
    .line 193
    .line 194
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-eqz v7, :cond_10

    .line 199
    .line 200
    const/4 v7, -0x1

    .line 201
    const-string v8, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:241)"

    .line 202
    .line 203
    invoke-static {v0, v5, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :cond_10
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 207
    .line 208
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    and-int/lit8 v0, v5, 0xe

    .line 213
    .line 214
    and-int/lit8 v7, v5, 0x70

    .line 215
    .line 216
    or-int/2addr v0, v7

    .line 217
    and-int/lit16 v5, v5, 0x380

    .line 218
    .line 219
    or-int v14, v0, v5

    .line 220
    .line 221
    const/4 v15, 0x0

    .line 222
    move-object v7, v2

    .line 223
    move-wide v8, v3

    .line 224
    move-wide/from16 v10, v16

    .line 225
    .line 226
    move-object v13, v1

    .line 227
    invoke-static/range {v7 .. v15}, Landroidx/compose/material/ProgressIndicatorKt;->LinearProgressIndicator-2cYBFYY(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V

    .line 228
    .line 229
    .line 230
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_11

    .line 235
    .line 236
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 237
    .line 238
    .line 239
    :cond_11
    move-wide/from16 v9, v16

    .line 240
    .line 241
    :goto_a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    if-eqz v8, :cond_12

    .line 246
    .line 247
    new-instance v11, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$6;

    .line 248
    .line 249
    move-object v0, v11

    .line 250
    move-object v1, v2

    .line 251
    move-wide v2, v3

    .line 252
    move-wide v4, v9

    .line 253
    move/from16 v6, p6

    .line 254
    .line 255
    move/from16 v7, p7

    .line 256
    .line 257
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$6;-><init>(Landroidx/compose/ui/Modifier;JJII)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v8, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 261
    .line 262
    .line 263
    :cond_12
    return-void
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

.method public static final LinearProgressIndicator-_5eSR-E(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V
    .locals 22
    .param p0    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move/from16 v8, p8

    .line 4
    .line 5
    const v0, -0x1fb571e0

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p7

    .line 9
    .line 10
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    and-int/lit8 v3, p9, 0x1

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    or-int/lit8 v3, v8, 0x6

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    and-int/lit8 v3, v8, 0xe

    .line 22
    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(F)Z

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
    or-int/2addr v3, v8

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v3, v8

    .line 37
    :goto_1
    and-int/lit8 v4, p9, 0x2

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
    and-int/lit8 v5, v8, 0x70

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
    and-int/lit16 v6, v8, 0x380

    .line 66
    .line 67
    if-nez v6, :cond_8

    .line 68
    .line 69
    and-int/lit8 v6, p9, 0x4

    .line 70
    .line 71
    if-nez v6, :cond_6

    .line 72
    .line 73
    move-wide/from16 v6, p2

    .line 74
    .line 75
    invoke-interface {v2, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_7

    .line 80
    .line 81
    const/16 v9, 0x100

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_6
    move-wide/from16 v6, p2

    .line 85
    .line 86
    :cond_7
    const/16 v9, 0x80

    .line 87
    .line 88
    :goto_5
    or-int/2addr v3, v9

    .line 89
    goto :goto_6

    .line 90
    :cond_8
    move-wide/from16 v6, p2

    .line 91
    .line 92
    :goto_6
    and-int/lit16 v9, v8, 0x1c00

    .line 93
    .line 94
    if-nez v9, :cond_b

    .line 95
    .line 96
    and-int/lit8 v9, p9, 0x8

    .line 97
    .line 98
    if-nez v9, :cond_9

    .line 99
    .line 100
    move-wide/from16 v9, p4

    .line 101
    .line 102
    invoke-interface {v2, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    if-eqz v11, :cond_a

    .line 107
    .line 108
    const/16 v11, 0x800

    .line 109
    .line 110
    goto :goto_7

    .line 111
    :cond_9
    move-wide/from16 v9, p4

    .line 112
    .line 113
    :cond_a
    const/16 v11, 0x400

    .line 114
    .line 115
    :goto_7
    or-int/2addr v3, v11

    .line 116
    goto :goto_8

    .line 117
    :cond_b
    move-wide/from16 v9, p4

    .line 118
    .line 119
    :goto_8
    const v11, 0xe000

    .line 120
    .line 121
    .line 122
    and-int/2addr v11, v8

    .line 123
    if-nez v11, :cond_e

    .line 124
    .line 125
    and-int/lit8 v11, p9, 0x10

    .line 126
    .line 127
    if-nez v11, :cond_c

    .line 128
    .line 129
    move/from16 v11, p6

    .line 130
    .line 131
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    if-eqz v12, :cond_d

    .line 136
    .line 137
    const/16 v12, 0x4000

    .line 138
    .line 139
    goto :goto_9

    .line 140
    :cond_c
    move/from16 v11, p6

    .line 141
    .line 142
    :cond_d
    const/16 v12, 0x2000

    .line 143
    .line 144
    :goto_9
    or-int/2addr v3, v12

    .line 145
    goto :goto_a

    .line 146
    :cond_e
    move/from16 v11, p6

    .line 147
    .line 148
    :goto_a
    const v12, 0xb6db

    .line 149
    .line 150
    .line 151
    and-int/2addr v12, v3

    .line 152
    const/16 v13, 0x2492

    .line 153
    .line 154
    if-ne v12, v13, :cond_10

    .line 155
    .line 156
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    if-nez v12, :cond_f

    .line 161
    .line 162
    goto :goto_b

    .line 163
    :cond_f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 164
    .line 165
    .line 166
    move-object v4, v5

    .line 167
    goto/16 :goto_f

    .line 168
    .line 169
    :cond_10
    :goto_b
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 170
    .line 171
    .line 172
    and-int/lit8 v12, v8, 0x1

    .line 173
    .line 174
    const v13, -0xe001

    .line 175
    .line 176
    .line 177
    if-eqz v12, :cond_15

    .line 178
    .line 179
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    if-eqz v12, :cond_11

    .line 184
    .line 185
    goto :goto_c

    .line 186
    :cond_11
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 187
    .line 188
    .line 189
    and-int/lit8 v4, p9, 0x4

    .line 190
    .line 191
    if-eqz v4, :cond_12

    .line 192
    .line 193
    and-int/lit16 v3, v3, -0x381

    .line 194
    .line 195
    :cond_12
    and-int/lit8 v4, p9, 0x8

    .line 196
    .line 197
    if-eqz v4, :cond_13

    .line 198
    .line 199
    and-int/lit16 v3, v3, -0x1c01

    .line 200
    .line 201
    :cond_13
    and-int/lit8 v4, p9, 0x10

    .line 202
    .line 203
    if-eqz v4, :cond_14

    .line 204
    .line 205
    and-int/2addr v3, v13

    .line 206
    :cond_14
    move-object v4, v5

    .line 207
    goto :goto_e

    .line 208
    :cond_15
    :goto_c
    if-eqz v4, :cond_16

    .line 209
    .line 210
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 211
    .line 212
    goto :goto_d

    .line 213
    :cond_16
    move-object v4, v5

    .line 214
    :goto_d
    and-int/lit8 v5, p9, 0x4

    .line 215
    .line 216
    if-eqz v5, :cond_17

    .line 217
    .line 218
    sget-object v5, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 219
    .line 220
    const/4 v6, 0x6

    .line 221
    invoke-virtual {v5, v2, v6}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    invoke-virtual {v5}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    .line 226
    .line 227
    .line 228
    move-result-wide v5

    .line 229
    and-int/lit16 v3, v3, -0x381

    .line 230
    .line 231
    move-wide v6, v5

    .line 232
    :cond_17
    and-int/lit8 v5, p9, 0x8

    .line 233
    .line 234
    if-eqz v5, :cond_18

    .line 235
    .line 236
    const v16, 0x3e75c28f    # 0.24f

    .line 237
    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const/16 v18, 0x0

    .line 242
    .line 243
    const/16 v19, 0x0

    .line 244
    .line 245
    const/16 v20, 0xe

    .line 246
    .line 247
    const/16 v21, 0x0

    .line 248
    .line 249
    move-wide v14, v6

    .line 250
    invoke-static/range {v14 .. v21}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 251
    .line 252
    .line 253
    move-result-wide v9

    .line 254
    and-int/lit16 v3, v3, -0x1c01

    .line 255
    .line 256
    :cond_18
    and-int/lit8 v5, p9, 0x10

    .line 257
    .line 258
    if-eqz v5, :cond_19

    .line 259
    .line 260
    sget-object v5, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 261
    .line 262
    invoke-virtual {v5}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    and-int/2addr v3, v13

    .line 267
    move v11, v5

    .line 268
    :cond_19
    :goto_e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 269
    .line 270
    .line 271
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    if-eqz v5, :cond_1a

    .line 276
    .line 277
    const/4 v5, -0x1

    .line 278
    const-string v12, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:109)"

    .line 279
    .line 280
    invoke-static {v0, v3, v5, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 281
    .line 282
    .line 283
    :cond_1a
    const/4 v0, 0x0

    .line 284
    const/high16 v3, 0x3f800000    # 1.0f

    .line 285
    .line 286
    invoke-static {v1, v0, v3}, Lkotlin/ranges/s;->H(FFF)F

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    invoke-static {v4}, Landroidx/compose/material/ProgressIndicatorKt;->increaseSemanticsBounds(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    const/4 v5, 0x0

    .line 295
    const/4 v12, 0x0

    .line 296
    const/4 v13, 0x6

    .line 297
    const/4 v14, 0x0

    .line 298
    move-object/from16 p1, v3

    .line 299
    .line 300
    move/from16 p2, v0

    .line 301
    .line 302
    move-object/from16 p3, v5

    .line 303
    .line 304
    move/from16 p4, v12

    .line 305
    .line 306
    move/from16 p5, v13

    .line 307
    .line 308
    move-object/from16 p6, v14

    .line 309
    .line 310
    invoke-static/range {p1 .. p6}, Landroidx/compose/foundation/ProgressSemanticsKt;->progressSemantics$default(Landroidx/compose/ui/Modifier;FLkotlin/ranges/f;IILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    sget v5, Landroidx/compose/material/ProgressIndicatorKt;->LinearIndicatorWidth:F

    .line 315
    .line 316
    sget v12, Landroidx/compose/material/ProgressIndicatorKt;->LinearIndicatorHeight:F

    .line 317
    .line 318
    invoke-static {v3, v5, v12}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    const v5, -0x15f925e0

    .line 323
    .line 324
    .line 325
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 326
    .line 327
    .line 328
    invoke-interface {v2, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 333
    .line 334
    .line 335
    move-result v12

    .line 336
    or-int/2addr v5, v12

    .line 337
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 338
    .line 339
    .line 340
    move-result v12

    .line 341
    or-int/2addr v5, v12

    .line 342
    invoke-interface {v2, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 343
    .line 344
    .line 345
    move-result v12

    .line 346
    or-int/2addr v5, v12

    .line 347
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v12

    .line 351
    if-nez v5, :cond_1b

    .line 352
    .line 353
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 354
    .line 355
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    if-ne v12, v5, :cond_1c

    .line 360
    .line 361
    :cond_1b
    new-instance v12, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$1$1;

    .line 362
    .line 363
    move-object/from16 p1, v12

    .line 364
    .line 365
    move-wide/from16 p2, v9

    .line 366
    .line 367
    move/from16 p4, v11

    .line 368
    .line 369
    move/from16 p5, v0

    .line 370
    .line 371
    move-wide/from16 p6, v6

    .line 372
    .line 373
    invoke-direct/range {p1 .. p7}, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$1$1;-><init>(JIFJ)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    :cond_1c
    check-cast v12, Lv3/l;

    .line 380
    .line 381
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 382
    .line 383
    .line 384
    const/4 v0, 0x0

    .line 385
    invoke-static {v3, v12, v2, v0}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 386
    .line 387
    .line 388
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-eqz v0, :cond_1d

    .line 393
    .line 394
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 395
    .line 396
    .line 397
    :cond_1d
    :goto_f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 398
    .line 399
    .line 400
    move-result-object v12

    .line 401
    if-eqz v12, :cond_1e

    .line 402
    .line 403
    new-instance v13, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$2;

    .line 404
    .line 405
    move-object v0, v13

    .line 406
    move/from16 v1, p0

    .line 407
    .line 408
    move-object v2, v4

    .line 409
    move-wide v3, v6

    .line 410
    move-wide v5, v9

    .line 411
    move v7, v11

    .line 412
    move/from16 v8, p8

    .line 413
    .line 414
    move/from16 v9, p9

    .line 415
    .line 416
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$2;-><init>(FLandroidx/compose/ui/Modifier;JJIII)V

    .line 417
    .line 418
    .line 419
    invoke-interface {v12, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 420
    .line 421
    .line 422
    :cond_1e
    return-void
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
.end method

.method public static final synthetic LinearProgressIndicator-eaDK9VM(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Maintained for binary compatibility"
    .end annotation

    .line 1
    move/from16 v7, p7

    .line 2
    .line 3
    const v0, -0x32aeb272

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p6

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, p8, 0x1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    or-int/lit8 v2, v7, 0x6

    .line 17
    .line 18
    move v3, v2

    .line 19
    move/from16 v2, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v2, v7, 0xe

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    move/from16 v2, p0

    .line 27
    .line 28
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v3, 0x2

    .line 37
    :goto_0
    or-int/2addr v3, v7

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move/from16 v2, p0

    .line 40
    .line 41
    move v3, v7

    .line 42
    :goto_1
    and-int/lit8 v4, p8, 0x2

    .line 43
    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    or-int/lit8 v3, v3, 0x30

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_3
    and-int/lit8 v5, v7, 0x70

    .line 50
    .line 51
    if-nez v5, :cond_5

    .line 52
    .line 53
    move-object/from16 v5, p1

    .line 54
    .line 55
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_4

    .line 60
    .line 61
    const/16 v6, 0x20

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    const/16 v6, 0x10

    .line 65
    .line 66
    :goto_2
    or-int/2addr v3, v6

    .line 67
    goto :goto_4

    .line 68
    :cond_5
    :goto_3
    move-object/from16 v5, p1

    .line 69
    .line 70
    :goto_4
    and-int/lit16 v6, v7, 0x380

    .line 71
    .line 72
    if-nez v6, :cond_7

    .line 73
    .line 74
    and-int/lit8 v6, p8, 0x4

    .line 75
    .line 76
    move-wide/from16 v8, p2

    .line 77
    .line 78
    if-nez v6, :cond_6

    .line 79
    .line 80
    invoke-interface {v1, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_6

    .line 85
    .line 86
    const/16 v6, 0x100

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_6
    const/16 v6, 0x80

    .line 90
    .line 91
    :goto_5
    or-int/2addr v3, v6

    .line 92
    goto :goto_6

    .line 93
    :cond_7
    move-wide/from16 v8, p2

    .line 94
    .line 95
    :goto_6
    and-int/lit16 v6, v7, 0x1c00

    .line 96
    .line 97
    if-nez v6, :cond_9

    .line 98
    .line 99
    and-int/lit8 v6, p8, 0x8

    .line 100
    .line 101
    move-wide/from16 v10, p4

    .line 102
    .line 103
    if-nez v6, :cond_8

    .line 104
    .line 105
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_8

    .line 110
    .line 111
    const/16 v6, 0x800

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_8
    const/16 v6, 0x400

    .line 115
    .line 116
    :goto_7
    or-int/2addr v3, v6

    .line 117
    goto :goto_8

    .line 118
    :cond_9
    move-wide/from16 v10, p4

    .line 119
    .line 120
    :goto_8
    and-int/lit16 v6, v3, 0x16db

    .line 121
    .line 122
    const/16 v12, 0x492

    .line 123
    .line 124
    if-ne v6, v12, :cond_b

    .line 125
    .line 126
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-nez v6, :cond_a

    .line 131
    .line 132
    goto :goto_9

    .line 133
    :cond_a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 134
    .line 135
    .line 136
    move-object v4, v5

    .line 137
    move-wide v5, v10

    .line 138
    goto/16 :goto_f

    .line 139
    .line 140
    :cond_b
    :goto_9
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 141
    .line 142
    .line 143
    and-int/lit8 v6, v7, 0x1

    .line 144
    .line 145
    if-eqz v6, :cond_f

    .line 146
    .line 147
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_c

    .line 152
    .line 153
    goto :goto_a

    .line 154
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 155
    .line 156
    .line 157
    and-int/lit8 v4, p8, 0x4

    .line 158
    .line 159
    if-eqz v4, :cond_d

    .line 160
    .line 161
    and-int/lit16 v3, v3, -0x381

    .line 162
    .line 163
    :cond_d
    and-int/lit8 v4, p8, 0x8

    .line 164
    .line 165
    if-eqz v4, :cond_e

    .line 166
    .line 167
    and-int/lit16 v3, v3, -0x1c01

    .line 168
    .line 169
    :cond_e
    move-object v4, v5

    .line 170
    move-wide v5, v8

    .line 171
    goto :goto_d

    .line 172
    :cond_f
    :goto_a
    if-eqz v4, :cond_10

    .line 173
    .line 174
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 175
    .line 176
    goto :goto_b

    .line 177
    :cond_10
    move-object v4, v5

    .line 178
    :goto_b
    and-int/lit8 v5, p8, 0x4

    .line 179
    .line 180
    if-eqz v5, :cond_11

    .line 181
    .line 182
    sget-object v5, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 183
    .line 184
    const/4 v6, 0x6

    .line 185
    invoke-virtual {v5, v1, v6}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-virtual {v5}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    .line 190
    .line 191
    .line 192
    move-result-wide v5

    .line 193
    and-int/lit16 v3, v3, -0x381

    .line 194
    .line 195
    goto :goto_c

    .line 196
    :cond_11
    move-wide v5, v8

    .line 197
    :goto_c
    and-int/lit8 v8, p8, 0x8

    .line 198
    .line 199
    if-eqz v8, :cond_12

    .line 200
    .line 201
    const v10, 0x3e75c28f    # 0.24f

    .line 202
    .line 203
    .line 204
    const/4 v11, 0x0

    .line 205
    const/4 v12, 0x0

    .line 206
    const/4 v13, 0x0

    .line 207
    const/16 v14, 0xe

    .line 208
    .line 209
    const/4 v15, 0x0

    .line 210
    move-wide v8, v5

    .line 211
    invoke-static/range {v8 .. v15}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 212
    .line 213
    .line 214
    move-result-wide v8

    .line 215
    and-int/lit16 v3, v3, -0x1c01

    .line 216
    .line 217
    move-wide/from16 v18, v8

    .line 218
    .line 219
    goto :goto_e

    .line 220
    :cond_12
    :goto_d
    move-wide/from16 v18, v10

    .line 221
    .line 222
    :goto_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 223
    .line 224
    .line 225
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    if-eqz v8, :cond_13

    .line 230
    .line 231
    const/4 v8, -0x1

    .line 232
    const-string v9, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:227)"

    .line 233
    .line 234
    invoke-static {v0, v3, v8, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :cond_13
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 238
    .line 239
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 240
    .line 241
    .line 242
    move-result v14

    .line 243
    and-int/lit8 v0, v3, 0xe

    .line 244
    .line 245
    and-int/lit8 v8, v3, 0x70

    .line 246
    .line 247
    or-int/2addr v0, v8

    .line 248
    and-int/lit16 v8, v3, 0x380

    .line 249
    .line 250
    or-int/2addr v0, v8

    .line 251
    and-int/lit16 v3, v3, 0x1c00

    .line 252
    .line 253
    or-int v16, v0, v3

    .line 254
    .line 255
    const/16 v17, 0x0

    .line 256
    .line 257
    move/from16 v8, p0

    .line 258
    .line 259
    move-object v9, v4

    .line 260
    move-wide v10, v5

    .line 261
    move-wide/from16 v12, v18

    .line 262
    .line 263
    move-object v15, v1

    .line 264
    invoke-static/range {v8 .. v17}, Landroidx/compose/material/ProgressIndicatorKt;->LinearProgressIndicator-_5eSR-E(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V

    .line 265
    .line 266
    .line 267
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eqz v0, :cond_14

    .line 272
    .line 273
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 274
    .line 275
    .line 276
    :cond_14
    move-wide v8, v5

    .line 277
    move-wide/from16 v5, v18

    .line 278
    .line 279
    :goto_f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    if-eqz v10, :cond_15

    .line 284
    .line 285
    new-instance v11, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$5;

    .line 286
    .line 287
    move-object v0, v11

    .line 288
    move/from16 v1, p0

    .line 289
    .line 290
    move-object v2, v4

    .line 291
    move-wide v3, v8

    .line 292
    move/from16 v7, p7

    .line 293
    .line 294
    move/from16 v8, p8

    .line 295
    .line 296
    invoke-direct/range {v0 .. v8}, Landroidx/compose/material/ProgressIndicatorKt$LinearProgressIndicator$5;-><init>(FLandroidx/compose/ui/Modifier;JJII)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 300
    .line 301
    .line 302
    :cond_15
    return-void
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

.method private static final LinearProgressIndicator_2cYBFYY$lambda$1(Landroidx/compose/runtime/State;)F
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

.method private static final LinearProgressIndicator_2cYBFYY$lambda$2(Landroidx/compose/runtime/State;)F
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

.method private static final LinearProgressIndicator_2cYBFYY$lambda$3(Landroidx/compose/runtime/State;)F
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

.method private static final LinearProgressIndicator_2cYBFYY$lambda$4(Landroidx/compose/runtime/State;)F
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

.method public static final synthetic access$CircularProgressIndicator_LxG7B9w$lambda$10(Landroidx/compose/runtime/State;)F
    .locals 0

    invoke-static {p0}, Landroidx/compose/material/ProgressIndicatorKt;->CircularProgressIndicator_LxG7B9w$lambda$10(Landroidx/compose/runtime/State;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$CircularProgressIndicator_LxG7B9w$lambda$11(Landroidx/compose/runtime/State;)F
    .locals 0

    invoke-static {p0}, Landroidx/compose/material/ProgressIndicatorKt;->CircularProgressIndicator_LxG7B9w$lambda$11(Landroidx/compose/runtime/State;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$CircularProgressIndicator_LxG7B9w$lambda$8(Landroidx/compose/runtime/State;)I
    .locals 0

    invoke-static {p0}, Landroidx/compose/material/ProgressIndicatorKt;->CircularProgressIndicator_LxG7B9w$lambda$8(Landroidx/compose/runtime/State;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$CircularProgressIndicator_LxG7B9w$lambda$9(Landroidx/compose/runtime/State;)F
    .locals 0

    invoke-static {p0}, Landroidx/compose/material/ProgressIndicatorKt;->CircularProgressIndicator_LxG7B9w$lambda$9(Landroidx/compose/runtime/State;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$LinearProgressIndicator_2cYBFYY$lambda$1(Landroidx/compose/runtime/State;)F
    .locals 0

    invoke-static {p0}, Landroidx/compose/material/ProgressIndicatorKt;->LinearProgressIndicator_2cYBFYY$lambda$1(Landroidx/compose/runtime/State;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$LinearProgressIndicator_2cYBFYY$lambda$2(Landroidx/compose/runtime/State;)F
    .locals 0

    invoke-static {p0}, Landroidx/compose/material/ProgressIndicatorKt;->LinearProgressIndicator_2cYBFYY$lambda$2(Landroidx/compose/runtime/State;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$LinearProgressIndicator_2cYBFYY$lambda$3(Landroidx/compose/runtime/State;)F
    .locals 0

    invoke-static {p0}, Landroidx/compose/material/ProgressIndicatorKt;->LinearProgressIndicator_2cYBFYY$lambda$3(Landroidx/compose/runtime/State;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$LinearProgressIndicator_2cYBFYY$lambda$4(Landroidx/compose/runtime/State;)F
    .locals 0

    invoke-static {p0}, Landroidx/compose/material/ProgressIndicatorKt;->LinearProgressIndicator_2cYBFYY$lambda$4(Landroidx/compose/runtime/State;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$drawCircularIndicatorBackground-bw27NRU(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material/ProgressIndicatorKt;->drawCircularIndicatorBackground-bw27NRU(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    return-void
.end method

.method public static final synthetic access$drawDeterminateCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Landroidx/compose/material/ProgressIndicatorKt;->drawDeterminateCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    return-void
.end method

.method public static final synthetic access$drawIndeterminateCircularIndicator-hrjfTZI(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/material/ProgressIndicatorKt;->drawIndeterminateCircularIndicator-hrjfTZI(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    return-void
.end method

.method public static final synthetic access$drawLinearIndicator-qYKTg0g(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/material/ProgressIndicatorKt;->drawLinearIndicator-qYKTg0g(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V

    return-void
.end method

.method public static final synthetic access$drawLinearIndicatorBackground-AZGd3zU(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material/ProgressIndicatorKt;->drawLinearIndicatorBackground-AZGd3zU(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V

    return-void
.end method

.method public static final synthetic access$getCircularEasing$p()Landroidx/compose/animation/core/CubicBezierEasing;
    .locals 1

    sget-object v0, Landroidx/compose/material/ProgressIndicatorKt;->CircularEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    return-object v0
.end method

.method public static final synthetic access$getFirstLineHeadEasing$p()Landroidx/compose/animation/core/CubicBezierEasing;
    .locals 1

    sget-object v0, Landroidx/compose/material/ProgressIndicatorKt;->FirstLineHeadEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    return-object v0
.end method

.method public static final synthetic access$getFirstLineTailEasing$p()Landroidx/compose/animation/core/CubicBezierEasing;
    .locals 1

    sget-object v0, Landroidx/compose/material/ProgressIndicatorKt;->FirstLineTailEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    return-object v0
.end method

.method public static final synthetic access$getSecondLineHeadEasing$p()Landroidx/compose/animation/core/CubicBezierEasing;
    .locals 1

    sget-object v0, Landroidx/compose/material/ProgressIndicatorKt;->SecondLineHeadEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    return-object v0
.end method

.method public static final synthetic access$getSecondLineTailEasing$p()Landroidx/compose/animation/core/CubicBezierEasing;
    .locals 1

    sget-object v0, Landroidx/compose/material/ProgressIndicatorKt;->SecondLineTailEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    return-object v0
.end method

.method private static final drawCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 19

    .line 1
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/ui/graphics/drawscope/Stroke;->getWidth()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    int-to-float v1, v1

    .line 7
    div-float/2addr v0, v1

    .line 8
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    mul-float/2addr v1, v0

    .line 17
    sub-float/2addr v2, v1

    .line 18
    const/4 v8, 0x0

    .line 19
    invoke-static {v0, v0}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 20
    .line 21
    .line 22
    move-result-wide v9

    .line 23
    invoke-static {v2, v2}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 24
    .line 25
    .line 26
    move-result-wide v11

    .line 27
    const/4 v13, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/16 v17, 0x340

    .line 32
    .line 33
    const/16 v18, 0x0

    .line 34
    .line 35
    move-object/from16 v3, p0

    .line 36
    .line 37
    move-wide/from16 v4, p3

    .line 38
    .line 39
    move/from16 v6, p1

    .line 40
    .line 41
    move/from16 v7, p2

    .line 42
    .line 43
    move-object/from16 v14, p5

    .line 44
    .line 45
    invoke-static/range {v3 .. v18}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawArc-yD3GUKo$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void
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

.method private static final drawCircularIndicatorBackground-bw27NRU(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 6

    const/4 v1, 0x0

    const/high16 v2, 0x43b40000    # 360.0f

    move-object v0, p0

    move-wide v3, p1

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Landroidx/compose/material/ProgressIndicatorKt;->drawCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    return-void
.end method

.method private static final drawDeterminateCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Landroidx/compose/material/ProgressIndicatorKt;->drawCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    return-void
.end method

.method private static final drawIndeterminateCircularIndicator-hrjfTZI(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 6

    .line 1
    invoke-virtual {p6}, Landroidx/compose/ui/graphics/drawscope/Stroke;->getCap-KaPHkGw()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/StrokeCap;->equals-impl0(II)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget v0, Landroidx/compose/material/ProgressIndicatorKt;->CircularIndicatorDiameter:F

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    int-to-float v1, v1

    .line 23
    div-float/2addr v0, v1

    .line 24
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    div-float/2addr p2, v0

    .line 29
    const v0, 0x42652ee1

    .line 30
    .line 31
    .line 32
    mul-float/2addr p2, v0

    .line 33
    const/high16 v0, 0x40000000    # 2.0f

    .line 34
    .line 35
    div-float/2addr p2, v0

    .line 36
    :goto_0
    add-float v1, p1, p2

    .line 37
    .line 38
    const p1, 0x3dcccccd    # 0.1f

    .line 39
    .line 40
    .line 41
    invoke-static {p3, p1}, Ljava/lang/Math;->max(FF)F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    move-object v0, p0

    .line 46
    move-wide v3, p4

    .line 47
    move-object v5, p6

    .line 48
    invoke-static/range {v0 .. v5}, Landroidx/compose/material/ProgressIndicatorKt;->drawCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    .line 49
    .line 50
    .line 51
    return-void
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

.method private static final drawLinearIndicator-qYKTg0g(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V
    .locals 22

    .line 1
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x2

    .line 18
    int-to-float v2, v2

    .line 19
    div-float v3, v1, v2

    .line 20
    .line 21
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    sget-object v5, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 26
    .line 27
    if-ne v4, v5, :cond_0

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v4, 0x0

    .line 32
    :goto_0
    const/high16 v5, 0x3f800000    # 1.0f

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    move/from16 v6, p1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    sub-float v6, v5, p2

    .line 40
    .line 41
    :goto_1
    mul-float/2addr v6, v0

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    move/from16 v5, p2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    sub-float v5, v5, p1

    .line 48
    .line 49
    :goto_2
    mul-float/2addr v5, v0

    .line 50
    sget-object v4, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 51
    .line 52
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    move/from16 v15, p6

    .line 57
    .line 58
    invoke-static {v15, v4}, Landroidx/compose/ui/graphics/StrokeCap;->equals-impl0(II)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_4

    .line 63
    .line 64
    cmpl-float v1, v1, v0

    .line 65
    .line 66
    if-lez v1, :cond_3

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    div-float v1, p5, v2

    .line 70
    .line 71
    sub-float/2addr v0, v1

    .line 72
    invoke-static {v1, v0}, Lkotlin/ranges/s;->e(FF)Lkotlin/ranges/f;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {v1, v0}, Lkotlin/ranges/s;->N(Ljava/lang/Comparable;Lkotlin/ranges/f;)Ljava/lang/Comparable;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-static {v2, v0}, Lkotlin/ranges/s;->N(Ljava/lang/Comparable;Lkotlin/ranges/f;)Ljava/lang/Comparable;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    sub-float v2, p2, p1

    .line 105
    .line 106
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    const/4 v4, 0x0

    .line 111
    cmpl-float v2, v2, v4

    .line 112
    .line 113
    if-lez v2, :cond_5

    .line 114
    .line 115
    invoke-static {v1, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 116
    .line 117
    .line 118
    move-result-wide v10

    .line 119
    invoke-static {v0, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 120
    .line 121
    .line 122
    move-result-wide v12

    .line 123
    const/16 v16, 0x0

    .line 124
    .line 125
    const/16 v17, 0x0

    .line 126
    .line 127
    const/16 v18, 0x0

    .line 128
    .line 129
    const/16 v19, 0x0

    .line 130
    .line 131
    const/16 v20, 0x1e0

    .line 132
    .line 133
    const/16 v21, 0x0

    .line 134
    .line 135
    move-object/from16 v7, p0

    .line 136
    .line 137
    move-wide/from16 v8, p3

    .line 138
    .line 139
    move/from16 v14, p5

    .line 140
    .line 141
    move/from16 v15, p6

    .line 142
    .line 143
    invoke-static/range {v7 .. v21}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_4
    :goto_3
    invoke-static {v6, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 148
    .line 149
    .line 150
    move-result-wide v10

    .line 151
    invoke-static {v5, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 152
    .line 153
    .line 154
    move-result-wide v12

    .line 155
    const/4 v15, 0x0

    .line 156
    const/16 v16, 0x0

    .line 157
    .line 158
    const/16 v17, 0x0

    .line 159
    .line 160
    const/16 v18, 0x0

    .line 161
    .line 162
    const/16 v19, 0x0

    .line 163
    .line 164
    const/16 v20, 0x1f0

    .line 165
    .line 166
    const/16 v21, 0x0

    .line 167
    .line 168
    move-object/from16 v7, p0

    .line 169
    .line 170
    move-wide/from16 v8, p3

    .line 171
    .line 172
    move/from16 v14, p5

    .line 173
    .line 174
    invoke-static/range {v7 .. v21}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_5
    :goto_4
    return-void
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

.method private static final drawLinearIndicatorBackground-AZGd3zU(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V
    .locals 7

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    move-object v0, p0

    move-wide v3, p1

    move v5, p3

    move v6, p4

    invoke-static/range {v0 .. v6}, Landroidx/compose/material/ProgressIndicatorKt;->drawLinearIndicator-qYKTg0g(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V

    return-void
.end method

.method public static final increaseSemanticsBounds(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 4
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const/16 v0, 0xa

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
    new-instance v1, Landroidx/compose/material/ProgressIndicatorKt$increaseSemanticsBounds$1;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Landroidx/compose/material/ProgressIndicatorKt$increaseSemanticsBounds$1;-><init>(F)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1}, Landroidx/compose/ui/layout/LayoutModifierKt;->layout(Landroidx/compose/ui/Modifier;Lv3/q;)Landroidx/compose/ui/Modifier;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v1, Landroidx/compose/material/ProgressIndicatorKt$increaseSemanticsBounds$2;->INSTANCE:Landroidx/compose/material/ProgressIndicatorKt$increaseSemanticsBounds$2;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-static {p0, v2, v1}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics(Landroidx/compose/ui/Modifier;ZLv3/l;)Landroidx/compose/ui/Modifier;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-static {p0, v1, v0, v2, v3}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
    .line 31
    .line 32
.end method
