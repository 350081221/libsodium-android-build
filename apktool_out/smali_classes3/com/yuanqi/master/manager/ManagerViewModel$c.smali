.class final Lcom/yuanqi/master/manager/ManagerViewModel$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/ManagerViewModel;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/Object;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
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
.field final synthetic this$0:Lcom/yuanqi/master/manager/ManagerViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/manager/ManagerViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$c;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/yuanqi/master/manager/ManagerViewModel$c;->invoke(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;)V
    .locals 11
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    sget-object v0, Lcom/yuanqi/group/App;->d:Lcom/yuanqi/group/App$a;

    invoke-virtual {v0}, Lcom/yuanqi/group/App$a;->c()Lcom/google/gson/f;

    move-result-object v1

    invoke-virtual {v0}, Lcom/yuanqi/group/App$a;->c()Lcom/google/gson/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/gson/f;->z(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-class v0, Lcom/yuanqi/master/network/model/response/ChangeDeviceResponse;

    invoke-virtual {v1, p1, v0}, Lcom/google/gson/f;->n(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/master/network/model/response/ChangeDeviceResponse;

    .line 3
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$c;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->x()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    new-instance v10, Lcom/yuanqi/master/network/model/DeviceModel;

    .line 4
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ChangeDeviceResponse;->getDeviceName()Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ChangeDeviceResponse;->getDeviceModel()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ChangeDeviceResponse;->getDevice()Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ChangeDeviceResponse;->getDeviceManu()Ljava/lang/String;

    move-result-object v5

    .line 8
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ChangeDeviceResponse;->getDeviceBrand()Ljava/lang/String;

    move-result-object v6

    .line 9
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ChangeDeviceResponse;->getImei()Ljava/lang/String;

    move-result-object v7

    .line 10
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ChangeDeviceResponse;->getAndroidId()Ljava/lang/String;

    move-result-object v8

    .line 11
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ChangeDeviceResponse;->getWifi()Ljava/lang/String;

    move-result-object v9

    move-object v1, v10

    .line 12
    invoke-direct/range {v1 .. v9}, Lcom/yuanqi/master/network/model/DeviceModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v10}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 13
    iget-object p1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$c;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-static {p1}, Lcom/yuanqi/master/manager/ManagerViewModel;->q(Lcom/yuanqi/master/manager/ManagerViewModel;)V

    .line 14
    iget-object p1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$c;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-static {p1}, Lcom/yuanqi/master/manager/ManagerViewModel;->h(Lcom/yuanqi/master/manager/ManagerViewModel;)Lkotlinx/coroutines/s0;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/yuanqi/master/manager/ManagerViewModel$c$a;

    const/4 p1, 0x0

    invoke-direct {v3, p1}, Lcom/yuanqi/master/manager/ManagerViewModel$c$a;-><init>(Lkotlin/coroutines/d;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method
