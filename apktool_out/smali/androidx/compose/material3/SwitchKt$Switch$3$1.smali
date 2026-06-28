.class final Landroidx/compose/material3/SwitchKt$Switch$3$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SwitchKt;->Switch(ZLv3/l;Landroidx/compose/ui/Modifier;Lv3/p;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/runtime/DisposableEffectScope;",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        "Landroidx/compose/runtime/DisposableEffectScope;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt$Switch$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,573:1\n64#2,5:574\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt$Switch$3$1\n*L\n128#1:574,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $offset:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scope:Lkotlinx/coroutines/s0;

.field final synthetic $targetValue:F


# direct methods
.method constructor <init>(Landroidx/compose/animation/core/Animatable;FLkotlinx/coroutines/s0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;F",
            "Lkotlinx/coroutines/s0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/SwitchKt$Switch$3$1;->$offset:Landroidx/compose/animation/core/Animatable;

    iput p2, p0, Landroidx/compose/material3/SwitchKt$Switch$3$1;->$targetValue:F

    iput-object p3, p0, Landroidx/compose/material3/SwitchKt$Switch$3$1;->$scope:Lkotlinx/coroutines/s0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 7
    .param p1    # Landroidx/compose/runtime/DisposableEffectScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object p1, p0, Landroidx/compose/material3/SwitchKt$Switch$3$1;->$offset:Landroidx/compose/animation/core/Animatable;

    invoke-virtual {p1}, Landroidx/compose/animation/core/Animatable;->getTargetValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget v0, p0, Landroidx/compose/material3/SwitchKt$Switch$3$1;->$targetValue:F

    cmpg-float p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 3
    iget-object v1, p0, Landroidx/compose/material3/SwitchKt$Switch$3$1;->$scope:Lkotlinx/coroutines/s0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Landroidx/compose/material3/SwitchKt$Switch$3$1$1;

    iget-object p1, p0, Landroidx/compose/material3/SwitchKt$Switch$3$1;->$offset:Landroidx/compose/animation/core/Animatable;

    const/4 v5, 0x0

    invoke-direct {v4, p1, v0, v5}, Landroidx/compose/material3/SwitchKt$Switch$3$1$1;-><init>(Landroidx/compose/animation/core/Animatable;FLkotlin/coroutines/d;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 4
    :cond_1
    new-instance p1, Landroidx/compose/material3/SwitchKt$Switch$3$1$invoke$$inlined$onDispose$1;

    invoke-direct {p1}, Landroidx/compose/material3/SwitchKt$Switch$3$1$invoke$$inlined$onDispose$1;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/SwitchKt$Switch$3$1;->invoke(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
