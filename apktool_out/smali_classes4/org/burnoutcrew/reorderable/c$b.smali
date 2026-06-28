.class final Lorg/burnoutcrew/reorderable/c$b;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/burnoutcrew/reorderable/c;->b(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/d;)Ljava/lang/Object;
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
    c = "org.burnoutcrew.reorderable.DragGestureKt$awaitLongPressOrCancellation$2"
    f = "DragGesture.kt"
    i = {}
    l = {
        0x64
    }
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
        "Lkotlin/r2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $currentDown:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $longPress:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $this_awaitLongPressOrCancellation:Landroidx/compose/ui/input/pointer/PointerInputScope;

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/internal/k1$h;Lkotlin/jvm/internal/k1$h;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lorg/burnoutcrew/reorderable/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/burnoutcrew/reorderable/c$b;->$this_awaitLongPressOrCancellation:Landroidx/compose/ui/input/pointer/PointerInputScope;

    iput-object p2, p0, Lorg/burnoutcrew/reorderable/c$b;->$currentDown:Lkotlin/jvm/internal/k1$h;

    iput-object p3, p0, Lorg/burnoutcrew/reorderable/c$b;->$longPress:Lkotlin/jvm/internal/k1$h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 3
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

    new-instance p1, Lorg/burnoutcrew/reorderable/c$b;

    iget-object v0, p0, Lorg/burnoutcrew/reorderable/c$b;->$this_awaitLongPressOrCancellation:Landroidx/compose/ui/input/pointer/PointerInputScope;

    iget-object v1, p0, Lorg/burnoutcrew/reorderable/c$b;->$currentDown:Lkotlin/jvm/internal/k1$h;

    iget-object v2, p0, Lorg/burnoutcrew/reorderable/c$b;->$longPress:Lkotlin/jvm/internal/k1$h;

    invoke-direct {p1, v0, v1, v2, p2}, Lorg/burnoutcrew/reorderable/c$b;-><init>(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/internal/k1$h;Lkotlin/jvm/internal/k1$h;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lorg/burnoutcrew/reorderable/c$b;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lorg/burnoutcrew/reorderable/c$b;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lorg/burnoutcrew/reorderable/c$b;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lorg/burnoutcrew/reorderable/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lorg/burnoutcrew/reorderable/c$b;->label:I

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
    iget-object p1, p0, Lorg/burnoutcrew/reorderable/c$b;->$this_awaitLongPressOrCancellation:Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 28
    .line 29
    new-instance v1, Lorg/burnoutcrew/reorderable/c$b$a;

    .line 30
    .line 31
    iget-object v3, p0, Lorg/burnoutcrew/reorderable/c$b;->$currentDown:Lkotlin/jvm/internal/k1$h;

    .line 32
    .line 33
    iget-object v4, p0, Lorg/burnoutcrew/reorderable/c$b;->$longPress:Lkotlin/jvm/internal/k1$h;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-direct {v1, v3, v4, v5}, Lorg/burnoutcrew/reorderable/c$b$a;-><init>(Lkotlin/jvm/internal/k1$h;Lkotlin/jvm/internal/k1$h;Lkotlin/coroutines/d;)V

    .line 37
    .line 38
    .line 39
    iput v2, p0, Lorg/burnoutcrew/reorderable/c$b;->label:I

    .line 40
    .line 41
    invoke-interface {p1, v1, p0}, Landroidx/compose/ui/input/pointer/PointerInputScope;->awaitPointerEventScope(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 49
    .line 50
    return-object p1
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method
