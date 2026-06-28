.class public final Landroidx/compose/animation/core/VectorizedAnimationSpec$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/animation/core/VectorizedAnimationSpec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static getEndVelocity(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
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
            "TV;>;TV;TV;TV;)TV;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/core/VectorizedAnimationSpec;->access$getEndVelocity$jd(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;

    move-result-object p0

    return-object p0
.end method
