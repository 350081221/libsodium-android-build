.class final Lcom/yuanqi/master/manager/ManagerViewModel$g;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/ManagerViewModel;->O(Landroid/content/Context;)V
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
.field final synthetic $context:Landroid/content/Context;

.field final synthetic this$0:Lcom/yuanqi/master/manager/ManagerViewModel;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/yuanqi/master/manager/ManagerViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerViewModel$g;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    sget-object v0, Lcom/yuanqi/group/home/HomeViewModel;->A:Lcom/yuanqi/group/home/HomeViewModel$b;

    invoke-virtual {v0}, Lcom/yuanqi/group/home/HomeViewModel$b;->c()Lcom/yuanqi/group/home/HomeViewModel;

    move-result-object v0

    iget-object v1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v2}, Lcom/yuanqi/master/manager/ManagerViewModel;->C()Lv2/b;

    move-result-object v2

    new-instance v3, Lcom/yuanqi/master/manager/ManagerViewModel$g$a;

    iget-object v4, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    iget-object v5, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g;->$context:Landroid/content/Context;

    invoke-direct {v3, v4, v5}, Lcom/yuanqi/master/manager/ManagerViewModel$g$a;-><init>(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/yuanqi/group/home/HomeViewModel;->j0(Landroid/content/Context;Lv2/b;Lv3/a;)V

    return-void
.end method
