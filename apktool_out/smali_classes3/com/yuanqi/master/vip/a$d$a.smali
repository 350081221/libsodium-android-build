.class final Lcom/yuanqi/master/vip/a$d$a;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/vip/a$d;->invoke(Lcom/yuanqi/master/network/model/ResultModel;)V
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
    c = "com.yuanqi.master.vip.VipManager$createOrderByAli$1$1"
    f = "VipManager.kt"
    i = {}
    l = {}
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
.field final synthetic $backHandler:Landroid/os/Handler;

.field final synthetic $context:Landroid/app/Activity;

.field final synthetic $result:Lcom/yuanqi/master/network/model/ResultModel;

.field label:I

.field final synthetic this$0:Lcom/yuanqi/master/vip/a;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/vip/a;Landroid/app/Activity;Lcom/yuanqi/master/network/model/ResultModel;Landroid/os/Handler;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/vip/a;",
            "Landroid/app/Activity;",
            "Lcom/yuanqi/master/network/model/ResultModel;",
            "Landroid/os/Handler;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/yuanqi/master/vip/a$d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/vip/a$d$a;->this$0:Lcom/yuanqi/master/vip/a;

    iput-object p2, p0, Lcom/yuanqi/master/vip/a$d$a;->$context:Landroid/app/Activity;

    iput-object p3, p0, Lcom/yuanqi/master/vip/a$d$a;->$result:Lcom/yuanqi/master/network/model/ResultModel;

    iput-object p4, p0, Lcom/yuanqi/master/vip/a$d$a;->$backHandler:Landroid/os/Handler;

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

    new-instance p1, Lcom/yuanqi/master/vip/a$d$a;

    iget-object v1, p0, Lcom/yuanqi/master/vip/a$d$a;->this$0:Lcom/yuanqi/master/vip/a;

    iget-object v2, p0, Lcom/yuanqi/master/vip/a$d$a;->$context:Landroid/app/Activity;

    iget-object v3, p0, Lcom/yuanqi/master/vip/a$d$a;->$result:Lcom/yuanqi/master/network/model/ResultModel;

    iget-object v4, p0, Lcom/yuanqi/master/vip/a$d$a;->$backHandler:Landroid/os/Handler;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/yuanqi/master/vip/a$d$a;-><init>(Lcom/yuanqi/master/vip/a;Landroid/app/Activity;Lcom/yuanqi/master/network/model/ResultModel;Landroid/os/Handler;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/vip/a$d$a;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/vip/a$d$a;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/master/vip/a$d$a;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lcom/yuanqi/master/vip/a$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
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
    iget v0, p0, Lcom/yuanqi/master/vip/a$d$a;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/yuanqi/master/vip/a$d$a;->this$0:Lcom/yuanqi/master/vip/a;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/yuanqi/master/vip/a$d$a;->$context:Landroid/app/Activity;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/yuanqi/master/vip/a$d$a;->$result:Lcom/yuanqi/master/network/model/ResultModel;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/yuanqi/master/network/model/ResultModel;->getData()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Lcom/yuanqi/master/vip/a$d$a;->$backHandler:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-static {p1, v0, v1, v2}, Lcom/yuanqi/master/vip/a;->a(Lcom/yuanqi/master/vip/a;Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
