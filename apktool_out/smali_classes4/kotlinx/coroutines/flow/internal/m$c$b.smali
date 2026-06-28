.class final Lkotlinx/coroutines/flow/internal/m$c$b;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/flow/internal/m$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Lkotlin/r2;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2"
    f = "Combine.kt"
    i = {}
    l = {
        0x7f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"
    }
    d2 = {
        "T1",
        "T2",
        "R",
        "Lkotlin/r2;",
        "it",
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
.field final synthetic $cnt:Ljava/lang/Object;

.field final synthetic $flow:Lkotlinx/coroutines/flow/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/i<",
            "TT1;>;"
        }
    .end annotation
.end field

.field final synthetic $scopeContext:Lkotlin/coroutines/g;

.field final synthetic $second:Lkotlinx/coroutines/channels/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/g0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $this_unsafeFlow:Lkotlinx/coroutines/flow/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/j<",
            "TR;>;"
        }
    .end annotation
.end field

.field final synthetic $transform:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "TT1;TT2;",
            "Lkotlin/coroutines/d<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method constructor <init>(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;Ljava/lang/Object;Lkotlinx/coroutines/channels/g0;Lkotlinx/coroutines/flow/j;Lv3/q;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/i<",
            "+TT1;>;",
            "Lkotlin/coroutines/g;",
            "Ljava/lang/Object;",
            "Lkotlinx/coroutines/channels/g0<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlinx/coroutines/flow/j<",
            "-TR;>;",
            "Lv3/q<",
            "-TT1;-TT2;-",
            "Lkotlin/coroutines/d<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlinx/coroutines/flow/internal/m$c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$flow:Lkotlinx/coroutines/flow/i;

    iput-object p2, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$scopeContext:Lkotlin/coroutines/g;

    iput-object p3, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$cnt:Ljava/lang/Object;

    iput-object p4, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$second:Lkotlinx/coroutines/channels/g0;

    iput-object p5, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$this_unsafeFlow:Lkotlinx/coroutines/flow/j;

    iput-object p6, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$transform:Lv3/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 8
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

    new-instance p1, Lkotlinx/coroutines/flow/internal/m$c$b;

    iget-object v1, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$flow:Lkotlinx/coroutines/flow/i;

    iget-object v2, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$scopeContext:Lkotlin/coroutines/g;

    iget-object v3, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$cnt:Ljava/lang/Object;

    iget-object v4, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$second:Lkotlinx/coroutines/channels/g0;

    iget-object v5, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$this_unsafeFlow:Lkotlinx/coroutines/flow/j;

    iget-object v6, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$transform:Lv3/q;

    move-object v0, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lkotlinx/coroutines/flow/internal/m$c$b;-><init>(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;Ljava/lang/Object;Lkotlinx/coroutines/channels/g0;Lkotlinx/coroutines/flow/j;Lv3/q;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/r2;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/flow/internal/m$c$b;->invoke(Lkotlin/r2;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/r2;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlin/r2;
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
            "Lkotlin/r2;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/flow/internal/m$c$b;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/flow/internal/m$c$b;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/flow/internal/m$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->label:I

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
    iget-object p1, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$flow:Lkotlinx/coroutines/flow/i;

    .line 28
    .line 29
    new-instance v1, Lkotlinx/coroutines/flow/internal/m$c$b$a;

    .line 30
    .line 31
    iget-object v4, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$scopeContext:Lkotlin/coroutines/g;

    .line 32
    .line 33
    iget-object v5, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$cnt:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v6, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$second:Lkotlinx/coroutines/channels/g0;

    .line 36
    .line 37
    iget-object v7, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$this_unsafeFlow:Lkotlinx/coroutines/flow/j;

    .line 38
    .line 39
    iget-object v8, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->$transform:Lv3/q;

    .line 40
    .line 41
    move-object v3, v1

    .line 42
    invoke-direct/range {v3 .. v8}, Lkotlinx/coroutines/flow/internal/m$c$b$a;-><init>(Lkotlin/coroutines/g;Ljava/lang/Object;Lkotlinx/coroutines/channels/g0;Lkotlinx/coroutines/flow/j;Lv3/q;)V

    .line 43
    .line 44
    .line 45
    iput v2, p0, Lkotlinx/coroutines/flow/internal/m$c$b;->label:I

    .line 46
    .line 47
    invoke-interface {p1, v1, p0}, Lkotlinx/coroutines/flow/i;->collect(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
.end method
