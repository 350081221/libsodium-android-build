.class final Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;",
        "Lkotlin/coroutines/d<",
        "*>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1"
    f = "TextFieldDecoratorModifier.kt"
    i = {}
    l = {
        0x1e5
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;",
        "",
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

.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

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

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    invoke-direct {v0, v1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;-><init>(Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/platform/PlatformTextInputSessionScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/ui/platform/PlatformTextInputSessionScope;
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
            "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/platform/PlatformTextInputSessionScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->invoke(Landroidx/compose/ui/platform/PlatformTextInputSessionScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
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
    iget v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Landroidx/compose/ui/platform/PlatformTextInputSessionScope;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    sget-object v5, Lkotlinx/coroutines/u0;->UNDISPATCHED:Lkotlinx/coroutines/u0;

    .line 33
    .line 34
    new-instance v6, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1$1;

    .line 35
    .line 36
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v6, v1, v3}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1$1;-><init>(Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;Lkotlin/coroutines/d;)V

    .line 40
    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    const/4 v8, 0x0

    .line 44
    move-object v3, p1

    .line 45
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getTextFieldState()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v3, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 55
    .line 56
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getKeyboardOptions()Landroidx/compose/foundation/text/KeyboardOptions;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iget-object v4, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 61
    .line 62
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getSingleLine()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-virtual {v3, v4}, Landroidx/compose/foundation/text/KeyboardOptions;->toImeOptions$foundation_release(Z)Landroidx/compose/ui/text/input/ImeOptions;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iget-object v4, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 71
    .line 72
    invoke-static {v4}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->access$getOnImeActionPerformed$p(Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;)Lv3/l;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    iput v2, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$startInputSession$1$1;->label:I

    .line 77
    .line 78
    invoke-static {p1, v1, v3, v4, p0}, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt;->platformSpecificTextInputSession(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/input/ImeOptions;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v0, :cond_2

    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_2
    :goto_0
    new-instance p1, Lkotlin/y;

    .line 86
    .line 87
    invoke-direct {p1}, Lkotlin/y;-><init>()V

    .line 88
    .line 89
    .line 90
    throw p1
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
