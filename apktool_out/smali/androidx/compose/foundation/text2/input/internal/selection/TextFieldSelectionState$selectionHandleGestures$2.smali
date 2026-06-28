.class final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->selectionHandleGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)Ljava/lang/Object;
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
        "Lkotlinx/coroutines/l2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2"
    f = "TextFieldSelectionState.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/s0;",
        "Lkotlinx/coroutines/l2;",
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
.field final synthetic $isStartHandle:Z

.field final synthetic $this_selectionHandleGestures:Landroidx/compose/ui/input/pointer/PointerInputScope;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Z",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->$this_selectionHandleGestures:Landroidx/compose/ui/input/pointer/PointerInputScope;

    iput-boolean p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->$isStartHandle:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 4
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

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->$this_selectionHandleGestures:Landroidx/compose/ui/input/pointer/PointerInputScope;

    iget-boolean v3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->$isStartHandle:Z

    invoke-direct {v0, v1, v2, v3, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
            "Lkotlinx/coroutines/l2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lkotlinx/coroutines/s0;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    sget-object v6, Lkotlinx/coroutines/u0;->UNDISPATCHED:Lkotlinx/coroutines/u0;

    .line 17
    .line 18
    new-instance v3, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2$1;

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->$this_selectionHandleGestures:Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    invoke-direct {v3, v0, v2, v7}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2$1;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    const/4 v5, 0x0

    .line 30
    move-object v0, p1

    .line 31
    move-object v2, v6

    .line 32
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 33
    .line 34
    .line 35
    new-instance v3, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2$2;

    .line 36
    .line 37
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->$this_selectionHandleGestures:Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 40
    .line 41
    iget-boolean v4, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->$isStartHandle:Z

    .line 42
    .line 43
    invoke-direct {v3, v0, v2, v4, v7}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2$2;-><init>(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;ZLkotlin/coroutines/d;)V

    .line 44
    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    move-object v0, p1

    .line 48
    move-object v2, v6

    .line 49
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 50
    .line 51
    .line 52
    new-instance v3, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2$3;

    .line 53
    .line 54
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 55
    .line 56
    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->$this_selectionHandleGestures:Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 57
    .line 58
    iget-boolean v4, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;->$isStartHandle:Z

    .line 59
    .line 60
    invoke-direct {v3, v0, v2, v4, v7}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2$3;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)V

    .line 61
    .line 62
    .line 63
    const/4 v4, 0x1

    .line 64
    move-object v0, p1

    .line 65
    move-object v2, v6

    .line 66
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
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
