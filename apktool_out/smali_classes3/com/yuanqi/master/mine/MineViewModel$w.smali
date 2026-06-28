.class final Lcom/yuanqi/master/mine/MineViewModel$w;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/MineViewModel;->D(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lv3/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;",
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
        "Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;",
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

.field final synthetic $context:Landroid/content/Context;

.field final synthetic this$0:Lcom/yuanqi/master/mine/MineViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/mine/MineViewModel;Landroid/content/Context;Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/mine/MineViewModel;",
            "Landroid/content/Context;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel$w;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/mine/MineViewModel$w;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/yuanqi/master/mine/MineViewModel$w;->$action:Lv3/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel$w;->invoke(Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;)V
    .locals 5
    .param p1    # Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$w;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/mine/MineViewModel;->x()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    const-string v0, "\u672a\u83b7\u53d6\u5230\u7528\u6237\u4fe1\u606f\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u540e\u518d\u8bd5"

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel$w;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-virtual {p1, v0}, Lcom/yuanqi/master/mine/MineViewModel;->X(Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-eq v1, v2, :cond_1

    .line 5
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$w;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;->getMsg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->X(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;->getData()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1

    :cond_3
    :goto_0
    move v1, v3

    :goto_1
    if-eqz v1, :cond_4

    .line 7
    iget-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel$w;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-virtual {p1, v0}, Lcom/yuanqi/master/mine/MineViewModel;->X(Ljava/lang/String;)V

    return-void

    .line 8
    :cond_4
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;->getData()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v3, :cond_5

    .line 9
    sget-object v0, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    iget-object v1, p0, Lcom/yuanqi/master/mine/MineViewModel$w;->$context:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;->getData()Ljava/util/List;

    move-result-object p1

    new-instance v2, Lcom/yuanqi/master/mine/MineViewModel$w$a;

    iget-object v3, p0, Lcom/yuanqi/master/mine/MineViewModel$w;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    iget-object v4, p0, Lcom/yuanqi/master/mine/MineViewModel$w;->$action:Lv3/a;

    invoke-direct {v2, v3, v4}, Lcom/yuanqi/master/mine/MineViewModel$w$a;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/yuanqi/master/tools/o0;->K0(Landroid/content/Context;Ljava/util/List;Lv3/l;)V

    return-void

    .line 10
    :cond_5
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$w;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;->getData()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/master/network/model/response/UserInfo;

    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/UserInfo;->getUserId()J

    move-result-wide v1

    iget-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel$w;->$action:Lv3/a;

    invoke-static {v0, v1, v2, p1}, Lcom/yuanqi/master/mine/MineViewModel;->b(Lcom/yuanqi/master/mine/MineViewModel;JLv3/a;)V

    return-void
.end method
