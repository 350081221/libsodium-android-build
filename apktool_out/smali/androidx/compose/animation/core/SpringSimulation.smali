.class public final Landroidx/compose/animation/core/SpringSimulation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\u0008$\u0010\u0013J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J-\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0016R*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u000f\u001a\u0004\u0008\u001f\u0010\u0011\"\u0004\u0008 \u0010\u0013R$\u0010#\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008!\u0010\u0011\"\u0004\u0008\"\u0010\u0013\u0082\u0002\u000b\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006%"
    }
    d2 = {
        "Landroidx/compose/animation/core/SpringSimulation;",
        "",
        "Lkotlin/r2;",
        "init",
        "",
        "lastDisplacement",
        "lastVelocity",
        "getAcceleration",
        "",
        "timeElapsed",
        "Landroidx/compose/animation/core/Motion;",
        "updateValues-IJZedt4$animation_core_release",
        "(FFJ)J",
        "updateValues",
        "finalPosition",
        "F",
        "getFinalPosition",
        "()F",
        "setFinalPosition",
        "(F)V",
        "",
        "naturalFreq",
        "D",
        "",
        "initialized",
        "Z",
        "gammaPlus",
        "gammaMinus",
        "dampedFreq",
        "value",
        "dampingRatio",
        "getDampingRatio",
        "setDampingRatio",
        "getStiffness",
        "setStiffness",
        "stiffness",
        "<init>",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private dampedFreq:D

.field private dampingRatio:F

.field private finalPosition:F

.field private gammaMinus:D

.field private gammaPlus:D

.field private initialized:Z

.field private naturalFreq:D


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    .line 5
    .line 6
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iput-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 13
    .line 14
    const/high16 p1, 0x3f800000    # 1.0f

    .line 15
    .line 16
    iput p1, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    .line 17
    .line 18
    return-void
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
.end method

.method private final init()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Landroidx/compose/animation/core/SpringSimulation;->initialized:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    .line 7
    .line 8
    invoke-static {}, Landroidx/compose/animation/core/SpringSimulationKt;->getUNSET()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    cmpg-float v0, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    move v0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-nez v0, :cond_4

    .line 21
    .line 22
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    .line 23
    .line 24
    float-to-double v2, v0

    .line 25
    float-to-double v4, v0

    .line 26
    mul-double/2addr v2, v4

    .line 27
    const/high16 v4, 0x3f800000    # 1.0f

    .line 28
    .line 29
    cmpl-float v5, v0, v4

    .line 30
    .line 31
    if-lez v5, :cond_2

    .line 32
    .line 33
    neg-float v0, v0

    .line 34
    float-to-double v4, v0

    .line 35
    iget-wide v6, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 36
    .line 37
    mul-double/2addr v4, v6

    .line 38
    int-to-double v8, v1

    .line 39
    sub-double/2addr v2, v8

    .line 40
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 41
    .line 42
    .line 43
    move-result-wide v8

    .line 44
    mul-double/2addr v6, v8

    .line 45
    add-double/2addr v4, v6

    .line 46
    iput-wide v4, p0, Landroidx/compose/animation/core/SpringSimulation;->gammaPlus:D

    .line 47
    .line 48
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    .line 49
    .line 50
    neg-float v0, v0

    .line 51
    float-to-double v4, v0

    .line 52
    iget-wide v6, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 53
    .line 54
    mul-double/2addr v4, v6

    .line 55
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    mul-double/2addr v6, v2

    .line 60
    sub-double/2addr v4, v6

    .line 61
    iput-wide v4, p0, Landroidx/compose/animation/core/SpringSimulation;->gammaMinus:D

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const/4 v5, 0x0

    .line 65
    cmpl-float v5, v0, v5

    .line 66
    .line 67
    if-ltz v5, :cond_3

    .line 68
    .line 69
    cmpg-float v0, v0, v4

    .line 70
    .line 71
    if-gez v0, :cond_3

    .line 72
    .line 73
    iget-wide v4, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 74
    .line 75
    int-to-double v6, v1

    .line 76
    sub-double/2addr v6, v2

    .line 77
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    mul-double/2addr v4, v2

    .line 82
    iput-wide v4, p0, Landroidx/compose/animation/core/SpringSimulation;->dampedFreq:D

    .line 83
    .line 84
    :cond_3
    :goto_1
    iput-boolean v1, p0, Landroidx/compose/animation/core/SpringSimulation;->initialized:Z

    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string v1, "Error: Final position of the spring must be set before the animation starts"

    .line 90
    .line 91
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0
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


# virtual methods
.method public final getAcceleration(FF)F
    .locals 6

    .line 1
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    .line 2
    .line 3
    sub-float/2addr p1, v0

    .line 4
    iget-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 5
    .line 6
    mul-double v2, v0, v0

    .line 7
    .line 8
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 9
    .line 10
    mul-double/2addr v0, v4

    .line 11
    iget v4, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    .line 12
    .line 13
    float-to-double v4, v4

    .line 14
    mul-double/2addr v0, v4

    .line 15
    neg-double v2, v2

    .line 16
    float-to-double v4, p1

    .line 17
    mul-double/2addr v2, v4

    .line 18
    float-to-double p1, p2

    .line 19
    mul-double/2addr v0, p1

    .line 20
    sub-double/2addr v2, v0

    .line 21
    double-to-float p1, v2

    .line 22
    return p1
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
.end method

.method public final getDampingRatio()F
    .locals 1

    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    return v0
.end method

.method public final getFinalPosition()F
    .locals 1

    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    return v0
.end method

.method public final getStiffness()F
    .locals 2

    iget-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    mul-double/2addr v0, v0

    double-to-float v0, v0

    return v0
.end method

.method public final setDampingRatio(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Landroidx/compose/animation/core/SpringSimulation;->initialized:Z

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "Damping ratio must be non-negative"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
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
.end method

.method public final setFinalPosition(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    return-void
.end method

.method public final setStiffness(F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/animation/core/SpringSimulation;->getStiffness()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    cmpg-float v0, v0, v1

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    float-to-double v0, p1

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Landroidx/compose/animation/core/SpringSimulation;->initialized:Z

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    const-string v0, "Spring stiffness constant must be positive."

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final updateValues-IJZedt4$animation_core_release(FFJ)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-direct/range {p0 .. p0}, Landroidx/compose/animation/core/SpringSimulation;->init()V

    .line 6
    .line 7
    .line 8
    iget v2, v0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    .line 9
    .line 10
    sub-float v2, p1, v2

    .line 11
    .line 12
    move-wide/from16 v3, p3

    .line 13
    .line 14
    long-to-double v3, v3

    .line 15
    const-wide v5, 0x408f400000000000L    # 1000.0

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    div-double/2addr v3, v5

    .line 21
    iget v5, v0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    .line 22
    .line 23
    const/high16 v6, 0x3f800000    # 1.0f

    .line 24
    .line 25
    cmpl-float v7, v5, v6

    .line 26
    .line 27
    if-lez v7, :cond_0

    .line 28
    .line 29
    float-to-double v5, v2

    .line 30
    iget-wide v7, v0, Landroidx/compose/animation/core/SpringSimulation;->gammaMinus:D

    .line 31
    .line 32
    mul-double v9, v7, v5

    .line 33
    .line 34
    float-to-double v1, v1

    .line 35
    sub-double/2addr v9, v1

    .line 36
    iget-wide v11, v0, Landroidx/compose/animation/core/SpringSimulation;->gammaPlus:D

    .line 37
    .line 38
    sub-double v13, v7, v11

    .line 39
    .line 40
    div-double/2addr v9, v13

    .line 41
    sub-double v9, v5, v9

    .line 42
    .line 43
    mul-double/2addr v5, v7

    .line 44
    sub-double/2addr v5, v1

    .line 45
    sub-double v1, v7, v11

    .line 46
    .line 47
    div-double/2addr v5, v1

    .line 48
    mul-double/2addr v7, v3

    .line 49
    invoke-static {v7, v8}, Ljava/lang/Math;->exp(D)D

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    mul-double/2addr v1, v9

    .line 54
    iget-wide v7, v0, Landroidx/compose/animation/core/SpringSimulation;->gammaPlus:D

    .line 55
    .line 56
    mul-double/2addr v7, v3

    .line 57
    invoke-static {v7, v8}, Ljava/lang/Math;->exp(D)D

    .line 58
    .line 59
    .line 60
    move-result-wide v7

    .line 61
    mul-double/2addr v7, v5

    .line 62
    add-double/2addr v1, v7

    .line 63
    iget-wide v7, v0, Landroidx/compose/animation/core/SpringSimulation;->gammaMinus:D

    .line 64
    .line 65
    mul-double/2addr v9, v7

    .line 66
    mul-double/2addr v7, v3

    .line 67
    invoke-static {v7, v8}, Ljava/lang/Math;->exp(D)D

    .line 68
    .line 69
    .line 70
    move-result-wide v7

    .line 71
    mul-double/2addr v9, v7

    .line 72
    iget-wide v7, v0, Landroidx/compose/animation/core/SpringSimulation;->gammaPlus:D

    .line 73
    .line 74
    mul-double/2addr v5, v7

    .line 75
    mul-double/2addr v7, v3

    .line 76
    invoke-static {v7, v8}, Ljava/lang/Math;->exp(D)D

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    mul-double/2addr v5, v3

    .line 81
    add-double/2addr v9, v5

    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :cond_0
    cmpg-float v6, v5, v6

    .line 85
    .line 86
    const/4 v7, 0x1

    .line 87
    if-nez v6, :cond_1

    .line 88
    .line 89
    move v6, v7

    .line 90
    goto :goto_0

    .line 91
    :cond_1
    const/4 v6, 0x0

    .line 92
    :goto_0
    if-eqz v6, :cond_2

    .line 93
    .line 94
    float-to-double v5, v1

    .line 95
    iget-wide v7, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 96
    .line 97
    float-to-double v1, v2

    .line 98
    mul-double v9, v7, v1

    .line 99
    .line 100
    add-double/2addr v5, v9

    .line 101
    mul-double v9, v5, v3

    .line 102
    .line 103
    add-double/2addr v1, v9

    .line 104
    neg-double v7, v7

    .line 105
    mul-double/2addr v7, v3

    .line 106
    invoke-static {v7, v8}, Ljava/lang/Math;->exp(D)D

    .line 107
    .line 108
    .line 109
    move-result-wide v7

    .line 110
    mul-double/2addr v7, v1

    .line 111
    iget-wide v9, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 112
    .line 113
    neg-double v9, v9

    .line 114
    mul-double/2addr v9, v3

    .line 115
    invoke-static {v9, v10}, Ljava/lang/Math;->exp(D)D

    .line 116
    .line 117
    .line 118
    move-result-wide v9

    .line 119
    mul-double/2addr v1, v9

    .line 120
    iget-wide v9, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 121
    .line 122
    neg-double v11, v9

    .line 123
    mul-double/2addr v1, v11

    .line 124
    neg-double v9, v9

    .line 125
    mul-double/2addr v9, v3

    .line 126
    invoke-static {v9, v10}, Ljava/lang/Math;->exp(D)D

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    mul-double/2addr v5, v3

    .line 131
    add-double v9, v1, v5

    .line 132
    .line 133
    move-wide v1, v7

    .line 134
    goto :goto_1

    .line 135
    :cond_2
    int-to-double v6, v7

    .line 136
    iget-wide v8, v0, Landroidx/compose/animation/core/SpringSimulation;->dampedFreq:D

    .line 137
    .line 138
    div-double/2addr v6, v8

    .line 139
    float-to-double v8, v5

    .line 140
    iget-wide v10, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 141
    .line 142
    mul-double/2addr v8, v10

    .line 143
    float-to-double v12, v2

    .line 144
    mul-double/2addr v8, v12

    .line 145
    float-to-double v1, v1

    .line 146
    add-double/2addr v8, v1

    .line 147
    mul-double/2addr v6, v8

    .line 148
    neg-float v1, v5

    .line 149
    float-to-double v1, v1

    .line 150
    mul-double/2addr v1, v10

    .line 151
    mul-double/2addr v1, v3

    .line 152
    invoke-static {v1, v2}, Ljava/lang/Math;->exp(D)D

    .line 153
    .line 154
    .line 155
    move-result-wide v1

    .line 156
    iget-wide v8, v0, Landroidx/compose/animation/core/SpringSimulation;->dampedFreq:D

    .line 157
    .line 158
    mul-double/2addr v8, v3

    .line 159
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 160
    .line 161
    .line 162
    move-result-wide v8

    .line 163
    mul-double/2addr v8, v12

    .line 164
    iget-wide v10, v0, Landroidx/compose/animation/core/SpringSimulation;->dampedFreq:D

    .line 165
    .line 166
    mul-double/2addr v10, v3

    .line 167
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 168
    .line 169
    .line 170
    move-result-wide v10

    .line 171
    mul-double/2addr v10, v6

    .line 172
    add-double/2addr v8, v10

    .line 173
    mul-double/2addr v1, v8

    .line 174
    iget-wide v8, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 175
    .line 176
    neg-double v10, v8

    .line 177
    mul-double/2addr v10, v1

    .line 178
    iget v5, v0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    .line 179
    .line 180
    float-to-double v14, v5

    .line 181
    mul-double/2addr v10, v14

    .line 182
    neg-float v5, v5

    .line 183
    float-to-double v14, v5

    .line 184
    mul-double/2addr v14, v8

    .line 185
    mul-double/2addr v14, v3

    .line 186
    invoke-static {v14, v15}, Ljava/lang/Math;->exp(D)D

    .line 187
    .line 188
    .line 189
    move-result-wide v8

    .line 190
    iget-wide v14, v0, Landroidx/compose/animation/core/SpringSimulation;->dampedFreq:D

    .line 191
    .line 192
    move-wide/from16 p1, v1

    .line 193
    .line 194
    neg-double v1, v14

    .line 195
    mul-double/2addr v1, v12

    .line 196
    mul-double/2addr v14, v3

    .line 197
    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    .line 198
    .line 199
    .line 200
    move-result-wide v12

    .line 201
    mul-double/2addr v1, v12

    .line 202
    iget-wide v12, v0, Landroidx/compose/animation/core/SpringSimulation;->dampedFreq:D

    .line 203
    .line 204
    mul-double/2addr v6, v12

    .line 205
    mul-double/2addr v12, v3

    .line 206
    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    .line 207
    .line 208
    .line 209
    move-result-wide v3

    .line 210
    mul-double/2addr v6, v3

    .line 211
    add-double/2addr v1, v6

    .line 212
    mul-double/2addr v8, v1

    .line 213
    add-double v9, v10, v8

    .line 214
    .line 215
    move-wide/from16 v1, p1

    .line 216
    .line 217
    :goto_1
    iget v3, v0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    .line 218
    .line 219
    float-to-double v3, v3

    .line 220
    add-double/2addr v1, v3

    .line 221
    double-to-float v1, v1

    .line 222
    double-to-float v2, v9

    .line 223
    invoke-static {v1, v2}, Landroidx/compose/animation/core/SpringSimulationKt;->Motion(FF)J

    .line 224
    .line 225
    .line 226
    move-result-wide v1

    .line 227
    return-wide v1
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
