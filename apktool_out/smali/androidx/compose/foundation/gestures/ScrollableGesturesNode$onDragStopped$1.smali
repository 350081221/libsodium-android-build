.class final Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/ScrollableGesturesNode;-><init>(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V
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
    c = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1"
    f = "Scrollable.kt"
    i = {}
    l = {}
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
.field synthetic J$0:J

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/gestures/ScrollableGesturesNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/ScrollableGesturesNode;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/ScrollableGesturesNode;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;->this$0:Landroidx/compose/foundation/gestures/ScrollableGesturesNode;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

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

    invoke-virtual {p0, p1, v0, v1, p3}, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;->invoke-LuvzFrg(Lkotlinx/coroutines/s0;JLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-LuvzFrg(Lkotlinx/coroutines/s0;JLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
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

    new-instance p1, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;

    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;->this$0:Landroidx/compose/foundation/gestures/ScrollableGesturesNode;

    invoke-direct {p1, v0, p4}, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;-><init>(Landroidx/compose/foundation/gestures/ScrollableGesturesNode;Lkotlin/coroutines/d;)V

    iput-wide p2, p1, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;->J$0:J

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
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
    iget v0, p0, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-wide v0, p0, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;->J$0:J

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;->this$0:Landroidx/compose/foundation/gestures/ScrollableGesturesNode;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/ScrollableGesturesNode;->getNestedScrollDispatcher()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    new-instance v5, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1$1;

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1;->this$0:Landroidx/compose/foundation/gestures/ScrollableGesturesNode;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-direct {v5, p1, v0, v1, v6}, Landroidx/compose/foundation/gestures/ScrollableGesturesNode$onDragStopped$1$1;-><init>(Landroidx/compose/foundation/gestures/ScrollableGesturesNode;JLkotlin/coroutines/d;)V

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x3

    .line 34
    const/4 v7, 0x0

    .line 35
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 36
    .line 37
    .line 38
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1
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
.end method
