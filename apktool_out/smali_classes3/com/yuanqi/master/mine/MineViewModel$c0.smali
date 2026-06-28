.class final Lcom/yuanqi/master/mine/MineViewModel$c0;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/MineViewModel;->I()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/response/GenInvCodeResponse;",
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
        "Lcom/yuanqi/master/network/model/response/GenInvCodeResponse;",
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
.field final synthetic this$0:Lcom/yuanqi/master/mine/MineViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/mine/MineViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel$c0;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/response/GenInvCodeResponse;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel$c0;->invoke(Lcom/yuanqi/master/network/model/response/GenInvCodeResponse;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/response/GenInvCodeResponse;)V
    .locals 1
    .param p1    # Lcom/yuanqi/master/network/model/response/GenInvCodeResponse;
        .annotation build Lp4/m;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$c0;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/mine/MineViewModel;->p()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/GenInvCodeResponse;->getInvCode()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
