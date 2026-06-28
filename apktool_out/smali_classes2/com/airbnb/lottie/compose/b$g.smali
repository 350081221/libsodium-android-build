.class final Lcom/airbnb/lottie/compose/b$g;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/compose/b;->p(Lcom/airbnb/lottie/k;FIZLkotlin/coroutines/d;)Ljava/lang/Object;
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
    c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2"
    f = "LottieAnimatable.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $composition:Lcom/airbnb/lottie/k;

.field final synthetic $iteration:I

.field final synthetic $progress:F

.field final synthetic $resetLastFrameNanos:Z

.field label:I

.field final synthetic this$0:Lcom/airbnb/lottie/compose/b;


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/compose/b;Lcom/airbnb/lottie/k;FIZLkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/compose/b;",
            "Lcom/airbnb/lottie/k;",
            "FIZ",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/airbnb/lottie/compose/b$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/airbnb/lottie/compose/b$g;->this$0:Lcom/airbnb/lottie/compose/b;

    iput-object p2, p0, Lcom/airbnb/lottie/compose/b$g;->$composition:Lcom/airbnb/lottie/k;

    iput p3, p0, Lcom/airbnb/lottie/compose/b$g;->$progress:F

    iput p4, p0, Lcom/airbnb/lottie/compose/b$g;->$iteration:I

    iput-boolean p5, p0, Lcom/airbnb/lottie/compose/b$g;->$resetLastFrameNanos:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 8
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

    new-instance v7, Lcom/airbnb/lottie/compose/b$g;

    iget-object v1, p0, Lcom/airbnb/lottie/compose/b$g;->this$0:Lcom/airbnb/lottie/compose/b;

    iget-object v2, p0, Lcom/airbnb/lottie/compose/b$g;->$composition:Lcom/airbnb/lottie/k;

    iget v3, p0, Lcom/airbnb/lottie/compose/b$g;->$progress:F

    iget v4, p0, Lcom/airbnb/lottie/compose/b$g;->$iteration:I

    iget-boolean v5, p0, Lcom/airbnb/lottie/compose/b$g;->$resetLastFrameNanos:Z

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/airbnb/lottie/compose/b$g;-><init>(Lcom/airbnb/lottie/compose/b;Lcom/airbnb/lottie/k;FIZLkotlin/coroutines/d;)V

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/compose/b$g;->invoke(Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/compose/b$g;->create(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/airbnb/lottie/compose/b$g;

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/compose/b$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
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
    iget v0, p0, Lcom/airbnb/lottie/compose/b$g;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$g;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/airbnb/lottie/compose/b$g;->$composition:Lcom/airbnb/lottie/k;

    .line 14
    .line 15
    invoke-static {p1, v0}, Lcom/airbnb/lottie/compose/b;->t(Lcom/airbnb/lottie/compose/b;Lcom/airbnb/lottie/k;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$g;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 19
    .line 20
    iget v0, p0, Lcom/airbnb/lottie/compose/b$g;->$progress:F

    .line 21
    .line 22
    invoke-static {p1, v0}, Lcom/airbnb/lottie/compose/b;->B(Lcom/airbnb/lottie/compose/b;F)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$g;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 26
    .line 27
    iget v0, p0, Lcom/airbnb/lottie/compose/b$g;->$iteration:I

    .line 28
    .line 29
    invoke-static {p1, v0}, Lcom/airbnb/lottie/compose/b;->u(Lcom/airbnb/lottie/compose/b;I)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$g;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-static {p1, v0}, Lcom/airbnb/lottie/compose/b;->x(Lcom/airbnb/lottie/compose/b;Z)V

    .line 36
    .line 37
    .line 38
    iget-boolean p1, p0, Lcom/airbnb/lottie/compose/b$g;->$resetLastFrameNanos:Z

    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$g;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 43
    .line 44
    const-wide/high16 v0, -0x8000000000000000L

    .line 45
    .line 46
    invoke-static {p1, v0, v1}, Lcom/airbnb/lottie/compose/b;->w(Lcom/airbnb/lottie/compose/b;J)V

    .line 47
    .line 48
    .line 49
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
