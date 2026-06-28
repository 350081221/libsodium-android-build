.class final Lcom/yuanqi/group/home/HomeActivity$d;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeActivity;->u0(Landroid/content/Intent;Z)V
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
    c = "com.yuanqi.group.home.HomeActivity$checkIfShortcut$1"
    f = "HomeActivity.kt"
    i = {}
    l = {
        0xee,
        0xef
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
.field final synthetic $mName:Ljava/lang/String;

.field final synthetic $mPackageName:Ljava/lang/String;

.field final synthetic $mUserId:I

.field label:I

.field final synthetic this$0:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeActivity;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/group/home/HomeActivity;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/yuanqi/group/home/HomeActivity$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$d;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    iput-object p2, p0, Lcom/yuanqi/group/home/HomeActivity$d;->$mPackageName:Ljava/lang/String;

    iput p3, p0, Lcom/yuanqi/group/home/HomeActivity$d;->$mUserId:I

    iput-object p4, p0, Lcom/yuanqi/group/home/HomeActivity$d;->$mName:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 6
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

    new-instance p1, Lcom/yuanqi/group/home/HomeActivity$d;

    iget-object v1, p0, Lcom/yuanqi/group/home/HomeActivity$d;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    iget-object v2, p0, Lcom/yuanqi/group/home/HomeActivity$d;->$mPackageName:Ljava/lang/String;

    iget v3, p0, Lcom/yuanqi/group/home/HomeActivity$d;->$mUserId:I

    iget-object v4, p0, Lcom/yuanqi/group/home/HomeActivity$d;->$mName:Ljava/lang/String;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/yuanqi/group/home/HomeActivity$d;-><init>(Lcom/yuanqi/group/home/HomeActivity;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/group/home/HomeActivity$d;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/group/home/HomeActivity$d;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/group/home/HomeActivity$d;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lcom/yuanqi/group/home/HomeActivity$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/yuanqi/group/home/HomeActivity$d;->label:I

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
    iput v3, p0, Lcom/yuanqi/group/home/HomeActivity$d;->label:I

    .line 35
    .line 36
    const-wide/16 v3, 0x1f4

    .line 37
    .line 38
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/d1;->b(JLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_3

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_3
    :goto_0
    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v1, Lcom/yuanqi/group/home/HomeActivity$d$a;

    .line 50
    .line 51
    iget-object v4, p0, Lcom/yuanqi/group/home/HomeActivity$d;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    .line 52
    .line 53
    iget-object v5, p0, Lcom/yuanqi/group/home/HomeActivity$d;->$mPackageName:Ljava/lang/String;

    .line 54
    .line 55
    iget v6, p0, Lcom/yuanqi/group/home/HomeActivity$d;->$mUserId:I

    .line 56
    .line 57
    iget-object v7, p0, Lcom/yuanqi/group/home/HomeActivity$d;->$mName:Ljava/lang/String;

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    move-object v3, v1

    .line 61
    invoke-direct/range {v3 .. v8}, Lcom/yuanqi/group/home/HomeActivity$d$a;-><init>(Lcom/yuanqi/group/home/HomeActivity;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/d;)V

    .line 62
    .line 63
    .line 64
    iput v2, p0, Lcom/yuanqi/group/home/HomeActivity$d;->label:I

    .line 65
    .line 66
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/i;->h(Lkotlin/coroutines/g;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_4

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_4
    :goto_1
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
.end method
