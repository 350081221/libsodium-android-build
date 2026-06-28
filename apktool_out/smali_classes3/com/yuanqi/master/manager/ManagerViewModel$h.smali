.class final Lcom/yuanqi/master/manager/ManagerViewModel$h;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/ManagerViewModel;->Q(Landroid/content/Context;)V
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

    iput-object p1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$h;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$h;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerViewModel$h;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$h;->$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/yuanqi/master/tools/f1;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$h;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$h;->$context:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/yuanqi/master/manager/ManagerViewModel;->f(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "\u60a8\u5f53\u524d\u5e76\u672a\u8bbe\u7f6e\u4e3a\u5141\u8bb8\uff0c\u8bf7\u5728\u8bbe\u7f6e\u540e\u518d\u8fdb\u884c\u64cd\u4f5c\u3002"

    const/4 v3, 0x0

    .line 4
    invoke-static {v2, v3, v0, v1}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    :goto_0
    return-void
.end method
