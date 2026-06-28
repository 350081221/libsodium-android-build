.class public final Landroidx/compose/animation/core/VectorizedAnimationSpecKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001a1\u0010\u0002\u001a\u00020\u0003\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0002\u0010\n\u001a\u0018\u0010\u000b\u001a\u00020\u000c*\u0006\u0012\u0002\u0008\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000cH\u0000\u001a9\u0010\u000f\u001a\u00020\u000c\"\u0008\u0008\u0000\u0010\u0004*\u00020\u0005*\u0008\u0012\u0004\u0012\u0002H\u00040\u00102\u0006\u0010\u0011\u001a\u0002H\u00042\u0006\u0010\u0012\u001a\u0002H\u00042\u0006\u0010\u0013\u001a\u0002H\u0004H\u0000\u00a2\u0006\u0002\u0010\u0014\u001aA\u0010\u0015\u001a\u0002H\u0004\"\u0008\u0008\u0000\u0010\u0004*\u00020\u0005*\u0008\u0012\u0004\u0012\u0002H\u00040\u00102\u0006\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u0002H\u00042\u0006\u0010\u0018\u001a\u0002H\u00042\u0006\u0010\u0019\u001a\u0002H\u0004H\u0000\u00a2\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "InfiniteIterations",
        "",
        "createSpringAnimations",
        "Landroidx/compose/animation/core/Animations;",
        "V",
        "Landroidx/compose/animation/core/AnimationVector;",
        "visibilityThreshold",
        "dampingRatio",
        "",
        "stiffness",
        "(Landroidx/compose/animation/core/AnimationVector;FF)Landroidx/compose/animation/core/Animations;",
        "clampPlayTime",
        "",
        "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;",
        "playTime",
        "getDurationMillis",
        "Landroidx/compose/animation/core/VectorizedAnimationSpec;",
        "initialValue",
        "targetValue",
        "initialVelocity",
        "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J",
        "getValueFromMillis",
        "playTimeMillis",
        "start",
        "end",
        "startVelocity",
        "(Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;",
        "animation-core_release"
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
.field private static final InfiniteIterations:I = 0x7fffffff


# direct methods
.method public static final synthetic access$createSpringAnimations(Landroidx/compose/animation/core/AnimationVector;FF)Landroidx/compose/animation/core/Animations;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->createSpringAnimations(Landroidx/compose/animation/core/AnimationVector;FF)Landroidx/compose/animation/core/Animations;

    move-result-object p0

    return-object p0
.end method

.method public static final clampPlayTime(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;J)J
    .locals 8
    .param p0    # Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec<",
            "*>;J)J"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;->getDelayMillis()I

    move-result v0

    int-to-long v0, v0

    sub-long v2, p1, v0

    const-wide/16 v4, 0x0

    invoke-interface {p0}, Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;->getDurationMillis()I

    move-result p0

    int-to-long v6, p0

    invoke-static/range {v2 .. v7}, Lkotlin/ranges/s;->K(JJJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final createSpringAnimations(Landroidx/compose/animation/core/AnimationVector;FF)Landroidx/compose/animation/core/Animations;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroidx/compose/animation/core/AnimationVector;",
            ">(TV;FF)",
            "Landroidx/compose/animation/core/Animations;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Landroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1;-><init>(Landroidx/compose/animation/core/AnimationVector;FF)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance p0, Landroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$2;

    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$2;-><init>(FF)V

    .line 12
    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
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
.end method

.method public static final getDurationMillis(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J
    .locals 0
    .param p0    # Landroidx/compose/animation/core/VectorizedAnimationSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/animation/core/AnimationVector;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/animation/core/AnimationVector;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/animation/core/AnimationVector;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroidx/compose/animation/core/AnimationVector;",
            ">(",
            "Landroidx/compose/animation/core/VectorizedAnimationSpec<",
            "TV;>;TV;TV;TV;)J"
        }
    .end annotation

    invoke-interface {p0, p1, p2, p3}, Landroidx/compose/animation/core/VectorizedAnimationSpec;->getDurationNanos(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J

    move-result-wide p0

    const-wide/32 p2, 0xf4240

    div-long/2addr p0, p2

    return-wide p0
.end method

.method public static final getValueFromMillis(Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
    .locals 8
    .param p0    # Landroidx/compose/animation/core/VectorizedAnimationSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/animation/core/AnimationVector;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/animation/core/AnimationVector;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/animation/core/AnimationVector;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroidx/compose/animation/core/AnimationVector;",
            ">(",
            "Landroidx/compose/animation/core/VectorizedAnimationSpec<",
            "TV;>;JTV;TV;TV;)TV;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    const-wide/32 v0, 0xf4240

    mul-long v3, p1, v0

    move-object v2, p0

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-interface/range {v2 .. v7}, Landroidx/compose/animation/core/VectorizedAnimationSpec;->getValueFromNanos(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;

    move-result-object p0

    return-object p0
.end method
