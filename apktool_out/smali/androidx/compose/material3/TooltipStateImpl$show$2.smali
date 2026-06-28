.class final Landroidx/compose/material3/TooltipStateImpl$show$2;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/TooltipStateImpl;->show(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/l<",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.material3.TooltipStateImpl$show$2"
    f = "Tooltip.kt"
    i = {}
    l = {
        0x24e,
        0x250
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
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
.field final synthetic $cancellableShow:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Landroidx/compose/material3/TooltipStateImpl;


# direct methods
.method constructor <init>(Landroidx/compose/material3/TooltipStateImpl;Lv3/l;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/TooltipStateImpl;",
            "Lv3/l<",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/TooltipStateImpl$show$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/TooltipStateImpl$show$2;->this$0:Landroidx/compose/material3/TooltipStateImpl;

    iput-object p2, p0, Landroidx/compose/material3/TooltipStateImpl$show$2;->$cancellableShow:Lv3/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 3
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/material3/TooltipStateImpl$show$2;

    iget-object v1, p0, Landroidx/compose/material3/TooltipStateImpl$show$2;->this$0:Landroidx/compose/material3/TooltipStateImpl;

    iget-object v2, p0, Landroidx/compose/material3/TooltipStateImpl$show$2;->$cancellableShow:Lv3/l;

    invoke-direct {v0, v1, v2, p1}, Landroidx/compose/material3/TooltipStateImpl$show$2;-><init>(Landroidx/compose/material3/TooltipStateImpl;Lv3/l;Lkotlin/coroutines/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/TooltipStateImpl$show$2;->invoke(Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/compose/material3/TooltipStateImpl$show$2;->create(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/material3/TooltipStateImpl$show$2;

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, v0}, Landroidx/compose/material3/TooltipStateImpl$show$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
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
    iget v1, p0, Landroidx/compose/material3/TooltipStateImpl$show$2;->label:I

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
    :goto_0
    :try_start_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :try_start_1
    iget-object p1, p0, Landroidx/compose/material3/TooltipStateImpl$show$2;->this$0:Landroidx/compose/material3/TooltipStateImpl;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/compose/material3/TooltipStateImpl;->isPersistent()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/compose/material3/TooltipStateImpl$show$2;->$cancellableShow:Lv3/l;

    .line 42
    .line 43
    iput v3, p0, Landroidx/compose/material3/TooltipStateImpl$show$2;->label:I

    .line 44
    .line 45
    invoke-interface {p1, p0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_4

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_3
    new-instance p1, Landroidx/compose/material3/TooltipStateImpl$show$2$1;

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/compose/material3/TooltipStateImpl$show$2;->$cancellableShow:Lv3/l;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {p1, v1, v3}, Landroidx/compose/material3/TooltipStateImpl$show$2$1;-><init>(Lv3/l;Lkotlin/coroutines/d;)V

    .line 58
    .line 59
    .line 60
    iput v2, p0, Landroidx/compose/material3/TooltipStateImpl$show$2;->label:I

    .line 61
    .line 62
    const-wide/16 v1, 0x5dc

    .line 63
    .line 64
    invoke-static {v1, v2, p1, p0}, Lkotlinx/coroutines/v3;->c(JLv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    if-ne p1, v0, :cond_4

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_4
    :goto_1
    iget-object p1, p0, Landroidx/compose/material3/TooltipStateImpl$show$2;->this$0:Landroidx/compose/material3/TooltipStateImpl;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroidx/compose/material3/TooltipStateImpl;->dismiss()V

    .line 74
    .line 75
    .line 76
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 77
    .line 78
    return-object p1

    .line 79
    :goto_2
    iget-object v0, p0, Landroidx/compose/material3/TooltipStateImpl$show$2;->this$0:Landroidx/compose/material3/TooltipStateImpl;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/compose/material3/TooltipStateImpl;->dismiss()V

    .line 82
    .line 83
    .line 84
    throw p1
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
