.class final Lcom/yuanqi/master/manager/ManagerViewModel$g$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/ManagerViewModel$g;->invoke()V
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
.method constructor <init>(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g$a;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g$a;->$context:Landroid/content/Context;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerViewModel$g$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g$a;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 4
    iget-object v1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g$a;->$context:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->G()I

    move-result v2

    iget-object v3, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g$a;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v3}, Lcom/yuanqi/master/manager/ManagerViewModel;->D()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g$a;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v4}, Lcom/yuanqi/master/manager/ManagerViewModel;->v()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 5
    invoke-static {v0, v1, v2, v3, v4}, Lcom/yuanqi/master/manager/ManagerViewModel;->l(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g$a;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g$a;->$context:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->G()I

    move-result v2

    iget-object v3, p0, Lcom/yuanqi/master/manager/ManagerViewModel$g$a;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v3}, Lcom/yuanqi/master/manager/ManagerViewModel;->D()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2, v3}, Lcom/yuanqi/master/manager/ManagerViewModel;->k(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;ILjava/lang/String;)V

    :goto_0
    return-void
.end method
