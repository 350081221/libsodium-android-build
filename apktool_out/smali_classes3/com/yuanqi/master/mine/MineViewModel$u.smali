.class final Lcom/yuanqi/master/mine/MineViewModel$u;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/MineViewModel;->C(JLv3/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/LoginResponse;",
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
        "Lcom/yuanqi/master/network/model/LoginResponse;",
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

.field final synthetic this$0:Lcom/yuanqi/master/mine/MineViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/mine/MineViewModel;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel$u;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/mine/MineViewModel$u;->$action:Lv3/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/LoginResponse;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel$u;->invoke(Lcom/yuanqi/master/network/model/LoginResponse;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/LoginResponse;)V
    .locals 4
    .param p1    # Lcom/yuanqi/master/network/model/LoginResponse;
        .annotation build Lp4/m;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$u;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/mine/MineViewModel$u;->$action:Lv3/a;

    .line 3
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/LoginResponse;->getCode()I

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_0

    const-string v2, "\u767b\u5f55\u6210\u529f"

    .line 4
    invoke-virtual {v0, v2}, Lcom/yuanqi/master/mine/MineViewModel;->X(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/LoginResponse;->getToken()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->d(Lcom/yuanqi/master/mine/MineViewModel;Ljava/lang/String;)V

    .line 6
    invoke-interface {v1}, Lv3/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/LoginResponse;->getMsg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->X(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
