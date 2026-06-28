.class public final Landroidx/compose/runtime/tooling/CompositionGroup$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/tooling/CompositionGroup;
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
.method public static find(Landroidx/compose/runtime/tooling/CompositionGroup;Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;
    .locals 0
    .param p0    # Landroidx/compose/runtime/tooling/CompositionGroup;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0, p1}, Landroidx/compose/runtime/tooling/CompositionGroup;->access$find$jd(Landroidx/compose/runtime/tooling/CompositionGroup;Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;

    move-result-object p0

    return-object p0
.end method

.method public static getGroupSize(Landroidx/compose/runtime/tooling/CompositionGroup;)I
    .locals 0
    .param p0    # Landroidx/compose/runtime/tooling/CompositionGroup;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Landroidx/compose/runtime/tooling/CompositionGroup;->access$getGroupSize$jd(Landroidx/compose/runtime/tooling/CompositionGroup;)I

    move-result p0

    return p0
.end method

.method public static getIdentity(Landroidx/compose/runtime/tooling/CompositionGroup;)Ljava/lang/Object;
    .locals 0
    .param p0    # Landroidx/compose/runtime/tooling/CompositionGroup;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0}, Landroidx/compose/runtime/tooling/CompositionGroup;->access$getIdentity$jd(Landroidx/compose/runtime/tooling/CompositionGroup;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static getSlotsSize(Landroidx/compose/runtime/tooling/CompositionGroup;)I
    .locals 0
    .param p0    # Landroidx/compose/runtime/tooling/CompositionGroup;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Landroidx/compose/runtime/tooling/CompositionGroup;->access$getSlotsSize$jd(Landroidx/compose/runtime/tooling/CompositionGroup;)I

    move-result p0

    return p0
.end method
