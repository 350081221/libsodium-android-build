.class final Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2$1$2"
    f = "TextFieldCoreModifier.kt"
    i = {}
    l = {
        0xe6,
        0xe8
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "it",
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
.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 1
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

    new-instance p1, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;

    invoke-direct {p1, v0, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;-><init>(Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
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
            "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;->invoke(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;->label:I

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
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;

    .line 35
    .line 36
    invoke-static {p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;->access$getCursorAlpha$p(Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;)Landroidx/compose/animation/core/Animatable;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const/high16 v1, 0x3f800000    # 1.0f

    .line 41
    .line 42
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput v3, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;->label:I

    .line 47
    .line 48
    invoke-virtual {p1, v1, p0}, Landroidx/compose/animation/core/Animatable;->snapTo(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;

    .line 56
    .line 57
    invoke-static {p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;->access$getCursorAlpha$p(Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;)Landroidx/compose/animation/core/Animatable;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {}, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt;->access$getCursorAnimationSpec$p()Landroidx/compose/animation/core/AnimationSpec;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    const/16 v9, 0xc

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    iput v2, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode$updateNode$2$1$2;->label:I

    .line 76
    .line 77
    move-object v8, p0

    .line 78
    invoke-static/range {v3 .. v10}, Landroidx/compose/animation/core/Animatable;->animateTo$default(Landroidx/compose/animation/core/Animatable;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lv3/l;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v0, :cond_4

    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_4
    :goto_1
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 86
    .line 87
    return-object p1
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
