.class final Lcom/yuanqi/master/mine/MineViewModel$o;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/MineViewModel;->k(Ljava/lang/String;Lv3/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/response/EditResponse;",
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
        "Lcom/yuanqi/master/network/model/response/EditResponse;",
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

    iput-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel$o;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/mine/MineViewModel$o;->$action:Lv3/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/response/EditResponse;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel$o;->invoke(Lcom/yuanqi/master/network/model/response/EditResponse;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/response/EditResponse;)V
    .locals 3
    .param p1    # Lcom/yuanqi/master/network/model/response/EditResponse;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$o;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/mine/MineViewModel;->x()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/EditResponse;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$o;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    const-string v1, "\u4fee\u6539\u6210\u529f"

    invoke-virtual {v0, v1}, Lcom/yuanqi/master/mine/MineViewModel;->X(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$o;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-static {v0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->c(Lcom/yuanqi/master/mine/MineViewModel;Lcom/yuanqi/master/network/model/response/EditResponse;)V

    .line 6
    iget-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel$o;->$action:Lv3/a;

    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 7
    sget-object p1, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$o;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/mine/MineViewModel;->t()Lkotlinx/coroutines/s0;

    move-result-object v0

    sget-object v1, Lcom/yuanqi/master/mine/MineViewModel$o$a;->INSTANCE:Lcom/yuanqi/master/mine/MineViewModel$o$a;

    invoke-virtual {p1, v0, v1}, Lcom/yuanqi/master/mine/account/a;->n(Lkotlinx/coroutines/s0;Lv3/a;)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$o;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/EditResponse;->getMsg()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    const-string p1, "\u89e3\u6790\u9519\u8bef"

    :cond_3
    invoke-virtual {v0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->X(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
