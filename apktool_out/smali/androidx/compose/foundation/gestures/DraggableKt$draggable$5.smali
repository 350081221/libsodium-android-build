.class final Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/DraggableKt;->draggable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/q;Lv3/q;Z)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/q<",
        "Lkotlinx/coroutines/s0;",
        "Landroidx/compose/ui/unit/Velocity;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5"
    f = "Draggable.kt"
    i = {}
    l = {
        0xcb
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/s0;",
        "Landroidx/compose/ui/unit/Velocity;",
        "velocity",
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
.field final synthetic $onDragStopped:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Lkotlinx/coroutines/s0;",
            "Ljava/lang/Float;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $orientation:Landroidx/compose/foundation/gestures/Orientation;

.field synthetic J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lv3/q;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/q<",
            "-",
            "Lkotlinx/coroutines/s0;",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->$onDragStopped:Lv3/q;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Landroidx/compose/ui/unit/Velocity;

    invoke-virtual {p2}, Landroidx/compose/ui/unit/Velocity;->unbox-impl()J

    move-result-wide v0

    check-cast p3, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, v0, v1, p3}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->invoke-LuvzFrg(Lkotlinx/coroutines/s0;JLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-LuvzFrg(Lkotlinx/coroutines/s0;JLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lkotlinx/coroutines/s0;
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
            "Lkotlinx/coroutines/s0;",
            "J",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->$onDragStopped:Lv3/q;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    invoke-direct {v0, v1, v2, p4}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;-><init>(Lv3/q;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->L$0:Ljava/lang/Object;

    iput-wide p2, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->J$0:J

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
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
    iget v1, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->label:I

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
    iget-object p1, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lkotlinx/coroutines/s0;

    .line 30
    .line 31
    iget-wide v3, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->J$0:J

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->$onDragStopped:Lv3/q;

    .line 34
    .line 35
    iget-object v5, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 36
    .line 37
    invoke-static {v3, v4, v5}, Landroidx/compose/foundation/gestures/DraggableKt;->access$toFloat-sF-c-tU(JLandroidx/compose/foundation/gestures/Orientation;)F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iput v2, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$5;->label:I

    .line 46
    .line 47
    invoke-interface {v1, p1, v3, p0}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v0, :cond_2

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 55
    .line 56
    return-object p1
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
.end method
