.class final Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/AnchoredDraggableKt;->animateTo(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/r<",
        "Landroidx/compose/foundation/gestures/AnchoredDragScope;",
        "Landroidx/compose/foundation/gestures/DraggableAnchors<",
        "TT;>;TT;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$2"
    f = "AnchoredDraggable.kt"
    i = {}
    l = {
        0x2af
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"
    }
    d2 = {
        "T",
        "Landroidx/compose/foundation/gestures/AnchoredDragScope;",
        "Landroidx/compose/foundation/gestures/DraggableAnchors;",
        "anchors",
        "latestTarget",
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
.field final synthetic $this_animateTo:Landroidx/compose/foundation/gestures/AnchoredDraggableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/foundation/gestures/AnchoredDraggableState<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $velocity:F

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/AnchoredDraggableState;FLkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/AnchoredDraggableState<",
            "TT;>;F",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->$this_animateTo:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    iput p2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->$velocity:F

    const/4 p1, 0x4

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/foundation/gestures/AnchoredDragScope;Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 3
    .param p1    # Landroidx/compose/foundation/gestures/AnchoredDragScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/gestures/DraggableAnchors;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/AnchoredDragScope;",
            "Landroidx/compose/foundation/gestures/DraggableAnchors<",
            "TT;>;TT;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->$this_animateTo:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    iget v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->$velocity:F

    invoke-direct {v0, v1, v2, p4}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;-><init>(Landroidx/compose/foundation/gestures/AnchoredDraggableState;FLkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->L$2:Ljava/lang/Object;

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/gestures/AnchoredDragScope;

    check-cast p2, Landroidx/compose/foundation/gestures/DraggableAnchors;

    check-cast p4, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->invoke(Landroidx/compose/foundation/gestures/AnchoredDragScope;Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
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
    iget v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->label:I

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
    goto :goto_1

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
    iget-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Landroidx/compose/foundation/gestures/AnchoredDragScope;

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->L$1:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Landroidx/compose/foundation/gestures/DraggableAnchors;

    .line 34
    .line 35
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->L$2:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-interface {v1, v3}, Landroidx/compose/foundation/gestures/DraggableAnchors;->positionOf(Ljava/lang/Object;)F

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    new-instance v1, Lkotlin/jvm/internal/k1$e;

    .line 48
    .line 49
    invoke-direct {v1}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->$this_animateTo:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 53
    .line 54
    invoke-virtual {v3}, Landroidx/compose/foundation/gestures/AnchoredDraggableState;->getOffset()F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->$this_animateTo:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 67
    .line 68
    invoke-virtual {v3}, Landroidx/compose/foundation/gestures/AnchoredDraggableState;->getOffset()F

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    :goto_0
    move v4, v3

    .line 73
    iput v4, v1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 74
    .line 75
    iget v6, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->$velocity:F

    .line 76
    .line 77
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->$this_animateTo:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 78
    .line 79
    invoke-virtual {v3}, Landroidx/compose/foundation/gestures/AnchoredDraggableState;->getAnimationSpec()Landroidx/compose/animation/core/AnimationSpec;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    new-instance v8, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2$1;

    .line 84
    .line 85
    invoke-direct {v8, p1, v1}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2$1;-><init>(Landroidx/compose/foundation/gestures/AnchoredDragScope;Lkotlin/jvm/internal/k1$e;)V

    .line 86
    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    iput-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->L$0:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->L$1:Ljava/lang/Object;

    .line 92
    .line 93
    iput v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$2;->label:I

    .line 94
    .line 95
    move-object v9, p0

    .line 96
    invoke-static/range {v4 .. v9}, Landroidx/compose/animation/core/SuspendAnimationKt;->animate(FFFLandroidx/compose/animation/core/AnimationSpec;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-ne p1, v0, :cond_3

    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 104
    .line 105
    return-object p1
    .line 106
.end method
