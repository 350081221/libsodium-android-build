.class final Lkotlinx/coroutines/flow/y$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/flow/y;->i(Lkotlinx/coroutines/flow/i;Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/j;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0008\u0008\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "S",
        "T",
        "value",
        "Lkotlin/r2;",
        "emit",
        "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;",
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
.field final synthetic a:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "TS;TT;",
            "Lkotlin/coroutines/d<",
            "-TS;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$h;Lv3/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/k1$h<",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/q<",
            "-TS;-TT;-",
            "Lkotlin/coroutines/d<",
            "-TS;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/flow/y$p;->a:Lkotlin/jvm/internal/k1$h;

    iput-object p2, p0, Lkotlinx/coroutines/flow/y$p;->b:Lv3/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 6
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/flow/y$p$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/y$p$a;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/y$p$a;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkotlinx/coroutines/flow/y$p$a;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/y$p$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/flow/y$p$a;-><init>(Lkotlinx/coroutines/flow/y$p;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/flow/y$p$a;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lkotlinx/coroutines/flow/y$p$a;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lkotlinx/coroutines/flow/y$p$a;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lkotlin/jvm/internal/k1$h;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lkotlinx/coroutines/flow/y$p;->a:Lkotlin/jvm/internal/k1$h;

    .line 58
    .line 59
    iget-object v2, p2, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 60
    .line 61
    sget-object v4, Lkotlinx/coroutines/flow/internal/u;->a:Lkotlinx/coroutines/internal/t0;

    .line 62
    .line 63
    if-eq v2, v4, :cond_4

    .line 64
    .line 65
    iget-object v4, p0, Lkotlinx/coroutines/flow/y$p;->b:Lv3/q;

    .line 66
    .line 67
    iput-object p2, v0, Lkotlinx/coroutines/flow/y$p$a;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    iput v3, v0, Lkotlinx/coroutines/flow/y$p$a;->label:I

    .line 70
    .line 71
    invoke-interface {v4, v2, p1, v0}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v1, :cond_3

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_3
    move-object v5, p2

    .line 79
    move-object p2, p1

    .line 80
    move-object p1, v5

    .line 81
    :goto_1
    move-object v5, p2

    .line 82
    move-object p2, p1

    .line 83
    move-object p1, v5

    .line 84
    :cond_4
    iput-object p1, p2, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 85
    .line 86
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 87
    .line 88
    return-object p1
.end method
