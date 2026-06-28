.class final Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SnapFlingBehavior;->animateSnap(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.material3.SnapFlingBehavior"
    f = "SnapFlingBehavior.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x12b
    }
    m = "animateSnap"
    n = {
        "this",
        "animationState",
        "consumedUpToNow",
        "targetOffset",
        "initialVelocity"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "F$0",
        "F$1"
    }
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


# instance fields
.field F$0:F

.field F$1:F

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/compose/material3/SnapFlingBehavior;


# direct methods
.method constructor <init>(Landroidx/compose/material3/SnapFlingBehavior;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SnapFlingBehavior;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->this$0:Landroidx/compose/material3/SnapFlingBehavior;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->label:I

    iget-object v0, p0, Landroidx/compose/material3/SnapFlingBehavior$animateSnap$1;->this$0:Landroidx/compose/material3/SnapFlingBehavior;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Landroidx/compose/material3/SnapFlingBehavior;->access$animateSnap(Landroidx/compose/material3/SnapFlingBehavior;Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
