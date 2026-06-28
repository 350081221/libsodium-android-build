.class final Lcom/yuanqi/master/mine/MineViewModel$m0;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/MineViewModel;->N(Ljava/lang/String;Lv3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/BasicResponse;",
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
        "rsp",
        "Lcom/yuanqi/master/network/model/BasicResponse;",
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
.field final synthetic $action:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/yuanqi/master/mine/MineViewModel;


# direct methods
.method constructor <init>(Lv3/l;Lcom/yuanqi/master/mine/MineViewModel;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lcom/yuanqi/master/mine/MineViewModel;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel$m0;->$action:Lv3/l;

    iput-object p2, p0, Lcom/yuanqi/master/mine/MineViewModel$m0;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/BasicResponse;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel$m0;->invoke(Lcom/yuanqi/master/network/model/BasicResponse;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/BasicResponse;)V
    .locals 3
    .param p1    # Lcom/yuanqi/master/network/model/BasicResponse;
        .annotation build Lp4/m;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel$m0;->$action:Lv3/l;

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$m0;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/BasicResponse;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_1

    const-string v1, "\u53d1\u9001\u6210\u529f"

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/BasicResponse;->getMsg()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/yuanqi/master/mine/MineViewModel;->X(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$m0;->$action:Lv3/l;

    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/BasicResponse;->getCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-void
.end method
