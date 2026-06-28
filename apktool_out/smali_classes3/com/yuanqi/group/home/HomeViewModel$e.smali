.class final Lcom/yuanqi/group/home/HomeViewModel$e;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeViewModel;->q(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;",
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
        "Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;",
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
.field final synthetic this$0:Lcom/yuanqi/group/home/HomeViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$e;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;

    invoke-virtual {p0, p1}, Lcom/yuanqi/group/home/HomeViewModel$e;->invoke(Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;)V
    .locals 0
    .param p1    # Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;
        .annotation build Lp4/m;
        .end annotation
    .end param

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;->getForce()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$e;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    invoke-static {p1}, Lcom/yuanqi/group/home/HomeViewModel;->o(Lcom/yuanqi/group/home/HomeViewModel;)V

    :cond_1
    return-void
.end method
