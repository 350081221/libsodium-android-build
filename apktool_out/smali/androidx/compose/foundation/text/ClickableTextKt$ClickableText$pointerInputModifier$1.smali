.class final Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/ClickableTextKt;->ClickableText-03UYbkw(Landroidx/compose/ui/text/AnnotatedString;Lv3/l;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILv3/l;Lv3/l;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Landroidx/compose/ui/input/pointer/PointerInputScope;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1"
    f = "ClickableText.kt"
    i = {}
    l = {
        0xb1
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
        "Landroidx/compose/ui/input/pointer/PointerInputScope;",
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
.field final synthetic $coroutineScope:Lkotlinx/coroutines/s0;

.field final synthetic $layoutResult:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onClick:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onHover:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlinx/coroutines/s0;Lv3/l;Landroidx/compose/runtime/MutableState;Lv3/l;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$coroutineScope:Lkotlinx/coroutines/s0;

    iput-object p2, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$onHover:Lv3/l;

    iput-object p3, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$layoutResult:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$onClick:Lv3/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 7
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

    new-instance v6, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;

    iget-object v1, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$coroutineScope:Lkotlinx/coroutines/s0;

    iget-object v2, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$onHover:Lv3/l;

    iget-object v3, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$layoutResult:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$onClick:Lv3/l;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;-><init>(Lkotlinx/coroutines/s0;Lv3/l;Landroidx/compose/runtime/MutableState;Lv3/l;Lkotlin/coroutines/d;)V

    iput-object p1, v6, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputScope;
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
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
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
    iget v1, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->label:I

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
    iget-object p1, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v3, p1

    .line 30
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 31
    .line 32
    iget-object v4, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$coroutineScope:Lkotlinx/coroutines/s0;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    new-instance v7, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1$1;

    .line 37
    .line 38
    iget-object p1, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$onHover:Lv3/l;

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$layoutResult:Landroidx/compose/runtime/MutableState;

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    invoke-direct {v7, v3, p1, v1, v8}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1$1;-><init>(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/l;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/d;)V

    .line 44
    .line 45
    .line 46
    const/4 v8, 0x3

    .line 47
    const/4 v9, 0x0

    .line 48
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 49
    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    new-instance v7, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1$2;

    .line 53
    .line 54
    iget-object p1, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$onClick:Lv3/l;

    .line 55
    .line 56
    iget-object v1, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->$layoutResult:Landroidx/compose/runtime/MutableState;

    .line 57
    .line 58
    invoke-direct {v7, p1, v1}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1$2;-><init>(Lv3/l;Landroidx/compose/runtime/MutableState;)V

    .line 59
    .line 60
    .line 61
    const/4 v9, 0x7

    .line 62
    const/4 v10, 0x0

    .line 63
    iput v2, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1;->label:I

    .line 64
    .line 65
    move-object v8, p0

    .line 66
    invoke-static/range {v3 .. v10}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->detectTapGestures$default(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/l;Lv3/l;Lv3/q;Lv3/l;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_2

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 74
    .line 75
    return-object p1
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
