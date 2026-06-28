.class final Landroidx/compose/material3/AppBarKt$settleAppBar$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/AppBarKt;->settleAppBar(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/animation/core/AnimationScope<",
        "Ljava/lang/Float;",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        ">;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Landroidx/compose/animation/core/AnimationScope;",
        "",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/animation/core/AnimationScope;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $lastValue:Lkotlin/jvm/internal/k1$e;

.field final synthetic $remainingVelocity:Lkotlin/jvm/internal/k1$e;

.field final synthetic $state:Landroidx/compose/material3/TopAppBarState;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$e;Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/internal/k1$e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$2;->$lastValue:Lkotlin/jvm/internal/k1$e;

    iput-object p2, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$2;->$state:Landroidx/compose/material3/TopAppBarState;

    iput-object p3, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$2;->$remainingVelocity:Lkotlin/jvm/internal/k1$e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/animation/core/AnimationScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/AppBarKt$settleAppBar$2;->invoke(Landroidx/compose/animation/core/AnimationScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/core/AnimationScope;)V
    .locals 4
    .param p1    # Landroidx/compose/animation/core/AnimationScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/AnimationScope<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v1, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$2;->$lastValue:Lkotlin/jvm/internal/k1$e;

    iget v1, v1, Lkotlin/jvm/internal/k1$e;->element:F

    sub-float/2addr v0, v1

    .line 3
    iget-object v1, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$2;->$state:Landroidx/compose/material3/TopAppBarState;

    invoke-virtual {v1}, Landroidx/compose/material3/TopAppBarState;->getHeightOffset()F

    move-result v1

    .line 4
    iget-object v2, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$2;->$state:Landroidx/compose/material3/TopAppBarState;

    add-float v3, v1, v0

    invoke-virtual {v2, v3}, Landroidx/compose/material3/TopAppBarState;->setHeightOffset(F)V

    .line 5
    iget-object v2, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$2;->$state:Landroidx/compose/material3/TopAppBarState;

    invoke-virtual {v2}, Landroidx/compose/material3/TopAppBarState;->getHeightOffset()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 6
    iget-object v2, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$2;->$lastValue:Lkotlin/jvm/internal/k1$e;

    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    iput v3, v2, Lkotlin/jvm/internal/k1$e;->element:F

    .line 7
    iget-object v2, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$2;->$remainingVelocity:Lkotlin/jvm/internal/k1$e;

    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getVelocity()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    iput v3, v2, Lkotlin/jvm/internal/k1$e;->element:F

    sub-float/2addr v0, v1

    .line 8
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    :cond_0
    return-void
.end method
