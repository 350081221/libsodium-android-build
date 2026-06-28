.class final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectTouchMode(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lv3/p<",
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTouchMode$2"
    f = "TextFieldSelectionState.kt"
    i = {
        0x0
    }
    l = {
        0x1a9
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitPointerEventScope"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
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
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 2
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

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    invoke-direct {v0, v1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
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
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;->label:I

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
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    move-object v3, v1

    .line 20
    move-object v1, v0

    .line 21
    move-object v0, p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;->L$0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 37
    .line 38
    move-object v1, p1

    .line 39
    move-object p1, p0

    .line 40
    :goto_0
    sget-object v3, Landroidx/compose/ui/input/pointer/PointerEventPass;->Initial:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 41
    .line 42
    iput-object v1, p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    iput v2, p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;->label:I

    .line 45
    .line 46
    invoke-interface {v1, v3, p1}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-ne v3, v0, :cond_2

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    move-object v5, v0

    .line 54
    move-object v0, p1

    .line 55
    move-object p1, v3

    .line 56
    move-object v3, v1

    .line 57
    move-object v1, v5

    .line 58
    :goto_1
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 59
    .line 60
    iget-object v4, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 61
    .line 62
    invoke-static {p1}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->isPrecisePointer(Landroidx/compose/ui/input/pointer/PointerEvent;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    xor-int/2addr p1, v2

    .line 67
    invoke-static {v4, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$setInTouchMode(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Z)V

    .line 68
    .line 69
    .line 70
    move-object p1, v0

    .line 71
    move-object v0, v1

    .line 72
    move-object v1, v3

    .line 73
    goto :goto_0
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
