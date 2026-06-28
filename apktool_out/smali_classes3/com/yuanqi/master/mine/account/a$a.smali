.class final Lcom/yuanqi/master/mine/account/a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/account/a;->n(Lkotlinx/coroutines/s0;Lv3/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/UserInfoData;",
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
        "it",
        "Lcom/yuanqi/master/network/model/UserInfoData;",
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

.field final synthetic $scope:Lkotlinx/coroutines/s0;


# direct methods
.method constructor <init>(Lkotlinx/coroutines/s0;Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/mine/account/a$a;->$scope:Lkotlinx/coroutines/s0;

    iput-object p2, p0, Lcom/yuanqi/master/mine/account/a$a;->$action:Lv3/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/UserInfoData;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/account/a$a;->invoke(Lcom/yuanqi/master/network/model/UserInfoData;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/UserInfoData;)V
    .locals 6
    .param p1    # Lcom/yuanqi/master/network/model/UserInfoData;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/mine/account/a$a;->$scope:Lkotlinx/coroutines/s0;

    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/yuanqi/master/mine/account/a$a$a;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lcom/yuanqi/master/mine/account/a$a$a;-><init>(Lcom/yuanqi/master/network/model/UserInfoData;Lkotlin/coroutines/d;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 3
    iget-object p1, p0, Lcom/yuanqi/master/mine/account/a$a;->$action:Lv3/a;

    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    return-void
.end method
