.class final Lcom/yuanqi/master/manager/ManagerViewModel$r;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/ManagerViewModel;->m0(Landroid/content/Context;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
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
.field final synthetic $packageName:Ljava/lang/String;

.field final synthetic $userId:I


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$r;->$packageName:Ljava/lang/String;

    iput p2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$r;->$userId:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerViewModel$r;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    move-result-object v0

    iget-object v1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$r;->$packageName:Ljava/lang/String;

    iget v2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$r;->$userId:I

    invoke-virtual {v0, v1, v2}, Lcom/lody/virtual/client/ipc/VActivityManager;->killAppByPkg(Ljava/lang/String;I)V

    return-void
.end method
