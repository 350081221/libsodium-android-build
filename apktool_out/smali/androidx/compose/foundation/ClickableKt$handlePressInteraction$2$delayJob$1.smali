.class final Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1"
    f = "Clickable.kt"
    i = {
        0x1
    }
    l = {
        0x12d,
        0x130
    }
    m = "invokeSuspend"
    n = {
        "press"
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
.field final synthetic $delayPressInteraction:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $pressPoint:J

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lv3/a;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;J",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->$delayPressInteraction:Lv3/a;

    iput-wide p2, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->$pressPoint:J

    iput-object p4, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-object p5, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->$interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

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

    new-instance p1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;

    iget-object v1, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->$delayPressInteraction:Lv3/a;

    iget-wide v2, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->$pressPoint:J

    iget-object v4, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget-object v5, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->$interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;-><init>(Lv3/a;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 20
    .line 21
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
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->$delayPressInteraction:Lv3/a;

    .line 39
    .line 40
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    invoke-static {}, Landroidx/compose/foundation/Clickable_androidKt;->getTapIndicationDelay()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    iput v3, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->label:I

    .line 57
    .line 58
    invoke-static {v4, v5, p0}, Lkotlinx/coroutines/d1;->b(JLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_3

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_3
    :goto_0
    new-instance p1, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 66
    .line 67
    iget-wide v3, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->$pressPoint:J

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-direct {p1, v3, v4, v1}, Landroidx/compose/foundation/interaction/PressInteraction$Press;-><init>(JLkotlin/jvm/internal/w;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 74
    .line 75
    iput-object p1, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    iput v2, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->label:I

    .line 78
    .line 79
    invoke-interface {v1, p1, p0}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->emit(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-ne v1, v0, :cond_4

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_4
    move-object v0, p1

    .line 87
    :goto_1
    iget-object p1, p0, Landroidx/compose/foundation/ClickableKt$handlePressInteraction$2$delayJob$1;->$interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;->setPressInteraction(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V

    .line 90
    .line 91
    .line 92
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 93
    .line 94
    return-object p1
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
