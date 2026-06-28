.class public final Landroidx/compose/animation/core/KeyframesWithSplineSpec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/animation/core/DurationBasedAnimationSpec;


# annotations
.annotation build Landroidx/compose/animation/core/ExperimentalAnimationSpecApi;
.end annotation

.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/compose/animation/core/DurationBasedAnimationSpec<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000eB\u0013\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J,\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u0002H\n0\t\"\u0008\u0008\u0001\u0010\n*\u00020\u000b2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\n0\rH\u0016R\u0017\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/animation/core/KeyframesWithSplineSpec;",
        "T",
        "Landroidx/compose/animation/core/DurationBasedAnimationSpec;",
        "config",
        "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;",
        "(Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;)V",
        "getConfig",
        "()Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;",
        "vectorize",
        "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;",
        "V",
        "Landroidx/compose/animation/core/AnimationVector;",
        "converter",
        "Landroidx/compose/animation/core/TwoWayConverter;",
        "KeyframesWithSplineSpecConfig",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,786:1\n382#2,4:787\n354#2,6:791\n364#2,3:798\n367#2,2:802\n387#2,2:804\n370#2,6:806\n389#2:812\n1810#3:797\n1672#3:801\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n*L\n618#1:787,4\n618#1:791,6\n618#1:798,3\n618#1:802,2\n618#1:804,2\n618#1:806,6\n618#1:812\n618#1:797\n618#1:801\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final config:Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;)V
    .locals 0
    .param p1    # Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/animation/core/KeyframesWithSplineSpec;->config:Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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


# virtual methods
.method public final getConfig()Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/KeyframesWithSplineSpec;->config:Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;

    return-object v0
.end method

.method public bridge synthetic vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedAnimationSpec;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/animation/core/KeyframesWithSplineSpec;->vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;

    move-result-object p1

    return-object p1
.end method

.method public vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;
    .locals 19
    .param p1    # Landroidx/compose/animation/core/TwoWayConverter;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroidx/compose/animation/core/AnimationVector;",
            ">(",
            "Landroidx/compose/animation/core/TwoWayConverter<",
            "TT;TV;>;)",
            "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec<",
            "TV;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    move-object/from16 v0, p0

    .line 3
    new-instance v1, Landroidx/collection/MutableIntList;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/w;)V

    .line 4
    new-instance v5, Landroidx/collection/MutableIntObjectMap;

    invoke-direct {v5, v2, v3, v4}, Landroidx/collection/MutableIntObjectMap;-><init>(IILkotlin/jvm/internal/w;)V

    .line 5
    iget-object v4, v0, Landroidx/compose/animation/core/KeyframesWithSplineSpec;->config:Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;

    invoke-virtual {v4}, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->getKeyframes$animation_core_release()Landroidx/collection/MutableIntObjectMap;

    move-result-object v4

    .line 6
    iget-object v6, v4, Landroidx/collection/IntObjectMap;->keys:[I

    .line 7
    iget-object v7, v4, Landroidx/collection/IntObjectMap;->values:[Ljava/lang/Object;

    .line 8
    iget-object v4, v4, Landroidx/collection/IntObjectMap;->metadata:[J

    .line 9
    array-length v8, v4

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_4

    move v9, v2

    .line 10
    :goto_0
    aget-wide v10, v4, v9

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_3

    sub-int v12, v9, v8

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    move v14, v2

    :goto_1
    if-ge v14, v12, :cond_2

    const-wide/16 v15, 0xff

    and-long/2addr v15, v10

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_0

    move v15, v3

    goto :goto_2

    :cond_0
    move v15, v2

    :goto_2
    if-eqz v15, :cond_1

    shl-int/lit8 v15, v9, 0x3

    add-int/2addr v15, v14

    .line 11
    aget v2, v6, v15

    aget-object v15, v7, v15

    check-cast v15, Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;

    .line 12
    invoke-virtual {v1, v2}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 13
    invoke-interface/range {p1 .. p1}, Landroidx/compose/animation/core/TwoWayConverter;->getConvertToVector()Lv3/l;

    move-result-object v3

    invoke-virtual {v15}, Landroidx/compose/animation/core/KeyframeBaseEntity;->getValue$animation_core_release()Ljava/lang/Object;

    move-result-object v15

    invoke-interface {v3, v15}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v5, v2, v3}, Landroidx/collection/MutableIntObjectMap;->set(ILjava/lang/Object;)V

    :cond_1
    shr-long/2addr v10, v13

    add-int/lit8 v14, v14, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    if-ne v12, v13, :cond_4

    :cond_3
    if-eq v9, v8, :cond_4

    add-int/lit8 v9, v9, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    goto :goto_0

    .line 14
    :cond_4
    invoke-virtual {v1}, Landroidx/collection/MutableIntList;->sort()V

    .line 15
    new-instance v2, Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;

    .line 16
    iget-object v3, v0, Landroidx/compose/animation/core/KeyframesWithSplineSpec;->config:Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;

    invoke-virtual {v3}, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->getDurationMillis()I

    move-result v3

    .line 17
    iget-object v4, v0, Landroidx/compose/animation/core/KeyframesWithSplineSpec;->config:Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;

    invoke-virtual {v4}, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->getDelayMillis()I

    move-result v4

    .line 18
    invoke-direct {v2, v1, v5, v3, v4}, Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;-><init>(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;II)V

    return-object v2
.end method

.method public bridge synthetic vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/compose/animation/core/KeyframesWithSplineSpec;->vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;

    move-result-object p1

    return-object p1
.end method
