.class public final Landroidx/compose/animation/core/AnimationVector3D;
.super Landroidx/compose/animation/core/AnimationVector;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0016\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\u0006\u0010$\u001a\u00020\u000b\u00a2\u0006\u0004\u0008+\u0010,J\u000f\u0010\u0005\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0008\u001a\u00020\u0000H\u0010\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0090\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ \u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0090\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0008\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\u0008\u0010\u0019\u001a\u00020\tH\u0016R*\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R*\u0010!\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008!\u0010\u001c\u001a\u0004\u0008\"\u0010\u001e\"\u0004\u0008#\u0010 R*\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010\u001c\u001a\u0004\u0008%\u0010\u001e\"\u0004\u0008&\u0010 R\u001a\u0010\'\u001a\u00020\t8\u0010X\u0090D\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\u00a8\u0006-"
    }
    d2 = {
        "Landroidx/compose/animation/core/AnimationVector3D;",
        "Landroidx/compose/animation/core/AnimationVector;",
        "Lkotlin/r2;",
        "reset$animation_core_release",
        "()V",
        "reset",
        "newVector$animation_core_release",
        "()Landroidx/compose/animation/core/AnimationVector3D;",
        "newVector",
        "",
        "index",
        "",
        "get$animation_core_release",
        "(I)F",
        "get",
        "value",
        "set$animation_core_release",
        "(IF)V",
        "set",
        "",
        "toString",
        "",
        "other",
        "",
        "equals",
        "hashCode",
        "<set-?>",
        "v1",
        "F",
        "getV1",
        "()F",
        "setV1$animation_core_release",
        "(F)V",
        "v2",
        "getV2",
        "setV2$animation_core_release",
        "v3",
        "getV3",
        "setV3$animation_core_release",
        "size",
        "I",
        "getSize$animation_core_release",
        "()I",
        "<init>",
        "(FFF)V",
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
.field private final size:I

.field private v1:F

.field private v2:F

.field private v3:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/animation/core/AnimationVector;-><init>(Lkotlin/jvm/internal/w;)V

    .line 3
    .line 4
    .line 5
    iput p1, p0, Landroidx/compose/animation/core/AnimationVector3D;->v1:F

    .line 6
    .line 7
    iput p2, p0, Landroidx/compose/animation/core/AnimationVector3D;->v2:F

    .line 8
    .line 9
    iput p3, p0, Landroidx/compose/animation/core/AnimationVector3D;->v3:F

    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    iput p1, p0, Landroidx/compose/animation/core/AnimationVector3D;->size:I

    .line 13
    .line 14
    return-void
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


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    instance-of v0, p1, Landroidx/compose/animation/core/AnimationVector3D;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Landroidx/compose/animation/core/AnimationVector3D;

    iget v0, p1, Landroidx/compose/animation/core/AnimationVector3D;->v1:F

    iget v2, p0, Landroidx/compose/animation/core/AnimationVector3D;->v1:F

    cmpg-float v0, v0, v2

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_3

    iget v0, p1, Landroidx/compose/animation/core/AnimationVector3D;->v2:F

    iget v3, p0, Landroidx/compose/animation/core/AnimationVector3D;->v2:F

    cmpg-float v0, v0, v3

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eqz v0, :cond_3

    iget p1, p1, Landroidx/compose/animation/core/AnimationVector3D;->v3:F

    iget v0, p0, Landroidx/compose/animation/core/AnimationVector3D;->v3:F

    cmpg-float p1, p1, v0

    if-nez p1, :cond_2

    move p1, v2

    goto :goto_2

    :cond_2
    move p1, v1

    :goto_2
    if-eqz p1, :cond_3

    move v1, v2

    :cond_3
    return v1
.end method

.method public get$animation_core_release(I)F
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget p1, p0, Landroidx/compose/animation/core/AnimationVector3D;->v3:F

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    iget p1, p0, Landroidx/compose/animation/core/AnimationVector3D;->v2:F

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_2
    iget p1, p0, Landroidx/compose/animation/core/AnimationVector3D;->v1:F

    .line 18
    .line 19
    :goto_0
    return p1
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

.method public getSize$animation_core_release()I
    .locals 1

    iget v0, p0, Landroidx/compose/animation/core/AnimationVector3D;->size:I

    return v0
.end method

.method public final getV1()F
    .locals 1

    iget v0, p0, Landroidx/compose/animation/core/AnimationVector3D;->v1:F

    return v0
.end method

.method public final getV2()F
    .locals 1

    iget v0, p0, Landroidx/compose/animation/core/AnimationVector3D;->v2:F

    return v0
.end method

.method public final getV3()F
    .locals 1

    iget v0, p0, Landroidx/compose/animation/core/AnimationVector3D;->v3:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Landroidx/compose/animation/core/AnimationVector3D;->v1:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/animation/core/AnimationVector3D;->v2:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/animation/core/AnimationVector3D;->v3:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public newVector$animation_core_release()Landroidx/compose/animation/core/AnimationVector3D;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/animation/core/AnimationVector3D;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Landroidx/compose/animation/core/AnimationVector3D;-><init>(FFF)V

    return-object v0
.end method

.method public bridge synthetic newVector$animation_core_release()Landroidx/compose/animation/core/AnimationVector;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/animation/core/AnimationVector3D;->newVector$animation_core_release()Landroidx/compose/animation/core/AnimationVector3D;

    move-result-object v0

    return-object v0
.end method

.method public reset$animation_core_release()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/compose/animation/core/AnimationVector3D;->v1:F

    .line 3
    .line 4
    iput v0, p0, Landroidx/compose/animation/core/AnimationVector3D;->v2:F

    .line 5
    .line 6
    iput v0, p0, Landroidx/compose/animation/core/AnimationVector3D;->v3:F

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public set$animation_core_release(IF)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput p2, p0, Landroidx/compose/animation/core/AnimationVector3D;->v3:F

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iput p2, p0, Landroidx/compose/animation/core/AnimationVector3D;->v2:F

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_2
    iput p2, p0, Landroidx/compose/animation/core/AnimationVector3D;->v1:F

    .line 17
    .line 18
    :goto_0
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

.method public final setV1$animation_core_release(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/animation/core/AnimationVector3D;->v1:F

    return-void
.end method

.method public final setV2$animation_core_release(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/animation/core/AnimationVector3D;->v2:F

    return-void
.end method

.method public final setV3$animation_core_release(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/animation/core/AnimationVector3D;->v3:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnimationVector3D: v1 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/animation/core/AnimationVector3D;->v1:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", v2 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/animation/core/AnimationVector3D;->v2:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", v3 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/animation/core/AnimationVector3D;->v3:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
