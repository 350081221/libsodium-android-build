.class final Landroidx/compose/material/SwipeableKt$swipeable$3$3;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SwipeableKt$swipeable$3;->invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.material.SwipeableKt$swipeable$3$3"
    f = "Swipeable.kt"
    i = {}
    l = {
        0x268
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\u008a@"
    }
    d2 = {
        "T",
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/r2;",
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
.field final synthetic $anchors:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Float;",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $density:Landroidx/compose/ui/unit/Density;

.field final synthetic $resistance:Landroidx/compose/material/ResistanceConfig;

.field final synthetic $state:Landroidx/compose/material/SwipeableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/material/SwipeableState<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $thresholds:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "TT;TT;",
            "Landroidx/compose/material/ThresholdConfig;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $velocityThreshold:F

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/material/SwipeableState;Ljava/util/Map;Landroidx/compose/material/ResistanceConfig;Landroidx/compose/ui/unit/Density;Lv3/p;FLkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/SwipeableState<",
            "TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Float;",
            "+TT;>;",
            "Landroidx/compose/material/ResistanceConfig;",
            "Landroidx/compose/ui/unit/Density;",
            "Lv3/p<",
            "-TT;-TT;+",
            "Landroidx/compose/material/ThresholdConfig;",
            ">;F",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material/SwipeableKt$swipeable$3$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$state:Landroidx/compose/material/SwipeableState;

    iput-object p2, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$anchors:Ljava/util/Map;

    iput-object p3, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$resistance:Landroidx/compose/material/ResistanceConfig;

    iput-object p4, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$density:Landroidx/compose/ui/unit/Density;

    iput-object p5, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$thresholds:Lv3/p;

    iput p6, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$velocityThreshold:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance p1, Landroidx/compose/material/SwipeableKt$swipeable$3$3;

    iget-object v1, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$state:Landroidx/compose/material/SwipeableState;

    iget-object v2, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$anchors:Ljava/util/Map;

    iget-object v3, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$resistance:Landroidx/compose/material/ResistanceConfig;

    iget-object v4, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$density:Landroidx/compose/ui/unit/Density;

    iget-object v5, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$thresholds:Lv3/p;

    iget v6, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$velocityThreshold:F

    move-object v0, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Landroidx/compose/material/SwipeableKt$swipeable$3$3;-><init>(Landroidx/compose/material/SwipeableState;Ljava/util/Map;Landroidx/compose/material/ResistanceConfig;Landroidx/compose/ui/unit/Density;Lv3/p;FLkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/material/SwipeableKt$swipeable$3$3;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$state:Landroidx/compose/material/SwipeableState;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/compose/material/SwipeableState;->getAnchors$material_release()Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$state:Landroidx/compose/material/SwipeableState;

    .line 34
    .line 35
    iget-object v3, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$anchors:Ljava/util/Map;

    .line 36
    .line 37
    invoke-virtual {v1, v3}, Landroidx/compose/material/SwipeableState;->setAnchors$material_release(Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$state:Landroidx/compose/material/SwipeableState;

    .line 41
    .line 42
    iget-object v3, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$resistance:Landroidx/compose/material/ResistanceConfig;

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Landroidx/compose/material/SwipeableState;->setResistance$material_release(Landroidx/compose/material/ResistanceConfig;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$state:Landroidx/compose/material/SwipeableState;

    .line 48
    .line 49
    new-instance v3, Landroidx/compose/material/SwipeableKt$swipeable$3$3$1;

    .line 50
    .line 51
    iget-object v4, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$anchors:Ljava/util/Map;

    .line 52
    .line 53
    iget-object v5, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$thresholds:Lv3/p;

    .line 54
    .line 55
    iget-object v6, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$density:Landroidx/compose/ui/unit/Density;

    .line 56
    .line 57
    invoke-direct {v3, v4, v5, v6}, Landroidx/compose/material/SwipeableKt$swipeable$3$3$1;-><init>(Ljava/util/Map;Lv3/p;Landroidx/compose/ui/unit/Density;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v3}, Landroidx/compose/material/SwipeableState;->setThresholds$material_release(Lv3/p;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$density:Landroidx/compose/ui/unit/Density;

    .line 64
    .line 65
    iget-object v3, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$state:Landroidx/compose/material/SwipeableState;

    .line 66
    .line 67
    iget v4, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$velocityThreshold:F

    .line 68
    .line 69
    invoke-interface {v1, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {v3, v1}, Landroidx/compose/material/SwipeableState;->setVelocityThreshold$material_release(F)V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$state:Landroidx/compose/material/SwipeableState;

    .line 77
    .line 78
    iget-object v3, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->$anchors:Ljava/util/Map;

    .line 79
    .line 80
    iput v2, p0, Landroidx/compose/material/SwipeableKt$swipeable$3$3;->label:I

    .line 81
    .line 82
    invoke-virtual {v1, p1, v3, p0}, Landroidx/compose/material/SwipeableState;->processNewAnchors$material_release(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v0, :cond_2

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 90
    .line 91
    return-object p1
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
.end method
