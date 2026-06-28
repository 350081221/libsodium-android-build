.class final Lcom/yuanqi/group/home/HomeViewModel$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeViewModel;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/response/ConfigResponse;",
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
        "Lcom/yuanqi/master/network/model/response/ConfigResponse;",
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

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$c;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/response/ConfigResponse;

    invoke-virtual {p0, p1}, Lcom/yuanqi/group/home/HomeViewModel$c;->invoke(Lcom/yuanqi/master/network/model/response/ConfigResponse;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/response/ConfigResponse;)V
    .locals 2
    .param p1    # Lcom/yuanqi/master/network/model/response/ConfigResponse;
        .annotation build Lp4/m;
        .end annotation
    .end param

    if-eqz p1, :cond_2

    .line 2
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ConfigResponse;->getCheck_app()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/yuanqi/master/tools/e;->a:Lcom/yuanqi/master/tools/e;

    iget-object v1, p0, Lcom/yuanqi/group/home/HomeViewModel$c;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    invoke-virtual {v1}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yuanqi/master/tools/e;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel$c;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    invoke-static {v0}, Lcom/yuanqi/group/home/HomeViewModel;->h(Lcom/yuanqi/group/home/HomeViewModel;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "checkApp: \u7b7e\u540d\u6821\u9a8c\u5931\u8d25"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel$c;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    invoke-static {v0}, Lcom/yuanqi/group/home/HomeViewModel;->o(Lcom/yuanqi/group/home/HomeViewModel;)V

    .line 5
    :cond_0
    sget-object v0, Lcom/yuanqi/master/tools/v0;->a:Lcom/yuanqi/master/tools/v0;

    iget-object v1, p0, Lcom/yuanqi/group/home/HomeViewModel$c;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    invoke-virtual {v1}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yuanqi/master/tools/v0;->e(Landroid/content/Context;)I

    move-result v0

    .line 6
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ConfigResponse;->getVersion()I

    move-result v1

    .line 7
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ConfigResponse;->getCheck_force()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 8
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$c;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    invoke-static {p1, v1}, Lcom/yuanqi/group/home/HomeViewModel;->c(Lcom/yuanqi/group/home/HomeViewModel;I)V

    :cond_1
    if-le v1, v0, :cond_2

    .line 9
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$c;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    invoke-virtual {p1, v0}, Lcom/yuanqi/group/home/HomeViewModel;->T(I)V

    :cond_2
    return-void
.end method
