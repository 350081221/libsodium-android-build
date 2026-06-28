.class final Lcom/yuanqi/master/vip/a$f;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/vip/a;->g(Landroid/app/Activity;ZLcom/tencent/mm/opensdk/openapi/IWXAPI;Lv3/a;Lv3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/ResultModel;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "result",
        "Lcom/yuanqi/master/network/model/ResultModel;",
        "invoke"
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
.field final synthetic $action:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $failedAction:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/String;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $msgApi:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

.field final synthetic this$0:Lcom/yuanqi/master/vip/a;


# direct methods
.method constructor <init>(Lv3/l;Lv3/a;Lcom/yuanqi/master/vip/a;Lcom/tencent/mm/opensdk/openapi/IWXAPI;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lcom/yuanqi/master/vip/a;",
            "Lcom/tencent/mm/opensdk/openapi/IWXAPI;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/vip/a$f;->$failedAction:Lv3/l;

    iput-object p2, p0, Lcom/yuanqi/master/vip/a$f;->$action:Lv3/a;

    iput-object p3, p0, Lcom/yuanqi/master/vip/a$f;->this$0:Lcom/yuanqi/master/vip/a;

    iput-object p4, p0, Lcom/yuanqi/master/vip/a$f;->$msgApi:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/ResultModel;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/vip/a$f;->invoke(Lcom/yuanqi/master/network/model/ResultModel;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/ResultModel;)V
    .locals 7
    .param p1    # Lcom/yuanqi/master/network/model/ResultModel;
        .annotation build Lp4/m;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/yuanqi/master/vip/a$f;->$failedAction:Lv3/l;

    const-string v0, "\u521b\u5efa\u5fae\u4fe1\u8ba2\u5355\u5931\u8d25"

    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/vip/a$f;->$action:Lv3/a;

    invoke-interface {v0}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lcom/yuanqi/master/vip/a$f;->this$0:Lcom/yuanqi/master/vip/a;

    invoke-virtual {v0}, Lcom/yuanqi/master/vip/a;->i()Lkotlinx/coroutines/s0;

    move-result-object v1

    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v4, Lcom/yuanqi/master/vip/a$f$a;

    iget-object v0, p0, Lcom/yuanqi/master/vip/a$f;->this$0:Lcom/yuanqi/master/vip/a;

    iget-object v5, p0, Lcom/yuanqi/master/vip/a$f;->$msgApi:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    const/4 v6, 0x0

    invoke-direct {v4, v0, p1, v5, v6}, Lcom/yuanqi/master/vip/a$f$a;-><init>(Lcom/yuanqi/master/vip/a;Lcom/yuanqi/master/network/model/ResultModel;Lcom/tencent/mm/opensdk/openapi/IWXAPI;Lkotlin/coroutines/d;)V

    const/4 v5, 0x2

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method
