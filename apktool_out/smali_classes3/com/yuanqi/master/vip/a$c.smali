.class final Lcom/yuanqi/master/vip/a$c;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/vip/a;->d(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;)V
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
    c = "com.yuanqi.master.vip.VipManager$buyVipByAliPay$1"
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

.field final synthetic $orderInfo:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/yuanqi/master/vip/a;


# direct methods
.method constructor <init>(Landroid/app/Activity;Ljava/lang/String;Lcom/yuanqi/master/vip/a;Landroid/os/Handler;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            "Lcom/yuanqi/master/vip/a;",
            "Landroid/os/Handler;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/yuanqi/master/vip/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/vip/a$c;->$context:Landroid/app/Activity;

    iput-object p2, p0, Lcom/yuanqi/master/vip/a$c;->$orderInfo:Ljava/lang/String;

    iput-object p3, p0, Lcom/yuanqi/master/vip/a$c;->this$0:Lcom/yuanqi/master/vip/a;

    iput-object p4, p0, Lcom/yuanqi/master/vip/a$c;->$backHandler:Landroid/os/Handler;

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

    new-instance p1, Lcom/yuanqi/master/vip/a$c;

    iget-object v1, p0, Lcom/yuanqi/master/vip/a$c;->$context:Landroid/app/Activity;

    iget-object v2, p0, Lcom/yuanqi/master/vip/a$c;->$orderInfo:Ljava/lang/String;

    iget-object v3, p0, Lcom/yuanqi/master/vip/a$c;->this$0:Lcom/yuanqi/master/vip/a;

    iget-object v4, p0, Lcom/yuanqi/master/vip/a$c;->$backHandler:Landroid/os/Handler;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/yuanqi/master/vip/a$c;-><init>(Landroid/app/Activity;Ljava/lang/String;Lcom/yuanqi/master/vip/a;Landroid/os/Handler;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/vip/a$c;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/vip/a$c;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/master/vip/a$c;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lcom/yuanqi/master/vip/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/yuanqi/master/vip/a$c;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lcom/alipay/sdk/app/PayTask;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/yuanqi/master/vip/a$c;->$context:Landroid/app/Activity;

    .line 14
    .line 15
    invoke-direct {p1, v0}, Lcom/alipay/sdk/app/PayTask;-><init>(Landroid/app/Activity;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/yuanqi/master/vip/a$c;->$orderInfo:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {p1, v0, v1}, Lcom/alipay/sdk/app/PayTask;->payV2(Ljava/lang/String;Z)Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Landroid/os/Message;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/yuanqi/master/vip/a$c;->this$0:Lcom/yuanqi/master/vip/a;

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/yuanqi/master/vip/a;->h()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iput v1, v0, Landroid/os/Message;->what:I

    .line 37
    .line 38
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object p1, p0, Lcom/yuanqi/master/vip/a$c;->$backHandler:Landroid/os/Handler;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 43
    .line 44
    .line 45
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1
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
